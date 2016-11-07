package hu.bme.mit.swsv.ris.integrationtest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

import org.awaitility.Awaitility;
import org.junit.Assert;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import hu.bme.mit.swsv.ris.common.Direction;
import hu.bme.mit.swsv.ris.common.SectionOccupancy;
import hu.bme.mit.swsv.ris.common.Side;
import hu.bme.mit.swsv.ris.common.SideTriple;
import hu.bme.mit.swsv.ris.common.logging.LogEntry;
import hu.bme.mit.swsv.ris.common.logging.LoggerWrapper;
import hu.bme.mit.swsv.ris.common.mq.ConnectionParams;
import hu.bme.mit.swsv.ris.common.mq.MQException;
import hu.bme.mit.swsv.ris.integrationtest.realworld.Event;
import hu.bme.mit.swsv.ris.integrationtest.realworld.EventDeserializer;
import hu.bme.mit.swsv.ris.integrationtest.realworld.Events;
import hu.bme.mit.swsv.ris.integrationtest.realworld.Track;
import hu.bme.mit.swsv.ris.integrationtest.realworld.Train;
import hu.bme.mit.swsv.ris.integrationtest.realworld.TrainAppearsEvent;
import hu.bme.mit.swsv.ris.integrationtest.realworld.TrainProceedsEvent;
import hu.bme.mit.swsv.ris.integrationtest.realworld.Turnout;
import hu.bme.mit.swsv.ris.integrationtest.realworld.TurnoutChangesDirectionEvent;
import hu.bme.mit.swsv.ris.signals.SectionOccupancySignal;
import hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal;
import hu.bme.mit.swsv.ris.tsm.impl.TurnoutSafetyModuleImpl;

public class World {

	private Track track;
	private Events events;
	private final Map<Integer, Train> trains;

	private final PahoMQTTClientTester mqtt;

	private final List<TurnoutSafetyModuleImpl> safetyControllers;

	private final ConnectionParams connParams = new ConnectionParams("tcp://localhost:1883", "swsv");

	private final LoggerWrapper logger;

	public World(final String trackPath, final String eventsPath, final int id) throws MQException {
		logger = LoggerWrapper.getLogger("IT_" + id);
		try {
			mqtt = new PahoMQTTClientTester(connParams, "initializer");
		} catch (final Exception e1) {
			logger.log(LogEntry.CANNOT_CONNECT);
			throw new MQException();
		}
		safetyControllers = new ArrayList<TurnoutSafetyModuleImpl>();
		try {
			final FileReader trackFile = new FileReader(trackPath);
			final FileReader eventsFile = new FileReader(eventsPath);
			final GsonBuilder gsonBuilder = new GsonBuilder();
			gsonBuilder.registerTypeAdapter(Event.class, new EventDeserializer());
			final Gson gson = gsonBuilder.create();
			track = gson.fromJson(trackFile, Track.class);
			events = gson.fromJson(eventsFile, Events.class);
		} catch (final FileNotFoundException e) {
			logger.log(LogEntry.JSON_PARSE_ERROR);
			Assert.fail("Test file not found in file system.");
		}
		trains = new HashMap<Integer, Train>();
	}

	private void initializeControllers() throws Exception {
		for (final Turnout t : track.turnouts) {
			final SideTriple<Side> neighborDirs = SideTriple.of(t.neighbourSides.getFacing(),
					t.neighbourSides.getStraight(), t.neighbourSides.getDivergent());
			final TurnoutSafetyModuleImpl tsci = new TurnoutSafetyModuleImpl(t.id, t.elements, t.neighbours,
					neighborDirs, connParams);
			safetyControllers.add(tsci);
		}
	}

	private void initializeTurnouts() throws InterruptedException {
		for (final Turnout to : track.turnouts) {
			mqtt.publish(new TurnoutDirectionSignal(to.id, Direction.valueOf(to.direction.toString())));
		}
	}

	private void tearDown() {
		try {
			mqtt.disconnect();
			for (final TurnoutSafetyModuleImpl tsci : safetyControllers) {
				tsci.disconnect();
			}
		} catch (final MQException e) {
			logger.log(LogEntry.DISCONNECT_ERROR);
		}
	}

	private Turnout getTurnoutWithId(final int id) {
		for (final Turnout t : track.turnouts)
			if (t.id == id)
				return t;
		return null;
	}

	private class TurnoutSidePair {
		public Turnout turnout;
		public Side side;

		public TurnoutSidePair(final Turnout t, final Side s) {
			turnout = t;
			side = s;
		}
	}

	private TurnoutSidePair getTurnoutWithSegmentId(final int segmentId) {
		for (final Turnout t : track.turnouts)
			for (final Side s : new Side[] { Side.FACING, Side.STRAIGHT, Side.DIVERGENT })
				if (t.elements.get(s) == segmentId)
					return new TurnoutSidePair(t, s);
		return null;
	}

	private int getSegmentOnOtherTurnoutSide(final Train train) {
		final TurnoutSidePair current = getTurnoutWithSegmentId(train.segment);
		if (current.side == Side.FACING) {
			if (current.turnout.direction == Direction.STRAIGHT)
				return current.turnout.elements.getStraight();
			else
				return current.turnout.elements.getDivergent();
		} else {
			return current.turnout.elements.getFacing();
		}
	}

	private int getNeigbouringSegmentIdFor(final Train train) {
		final TurnoutSidePair current = getTurnoutWithSegmentId(train.segment);
		final int nextTurnoutId = current.turnout.neighbours.get(current.side);
		if (nextTurnoutId == -1)
			return -1;
		final Turnout next = getTurnoutWithId(nextTurnoutId);
		final Side nextSide = current.turnout.neighbourSides.get(current.side);
		return next.elements.get(nextSide);
	}

	private int getNextSegmentIdFor(final Train train) {
		if (train.movingTowardsTurnout)
			return getSegmentOnOtherTurnoutSide(train);
		else
			return getNeigbouringSegmentIdFor(train);
	}

	public void simulateTrainAppearsEvent(final TrainAppearsEvent e) {
		final Train train = new Train();
		train.id = e.trainId;
		train.segment = e.segmentId;
		train.movingTowardsTurnout = true;
		trains.put(train.id, train);
		mqtt.publish(new SectionOccupancySignal(e.segmentId, SectionOccupancy.OCCUPIED));
	}

	public void simulateTrainProceedsEvent(final TrainProceedsEvent e) {
		final Train train = trains.get(e.id);
		final int nextSegment = getNextSegmentIdFor(train);
		mqtt.publish(new SectionOccupancySignal(train.segment, SectionOccupancy.FREE));
		if (nextSegment != -1)
			mqtt.publish(new SectionOccupancySignal(nextSegment, SectionOccupancy.OCCUPIED));
		else
			trains.remove(train.id);
		train.segment = nextSegment;
		train.movingTowardsTurnout = !train.movingTowardsTurnout;
	}

	public void simulateTurnoutChangesDirectionEvent(final TurnoutChangesDirectionEvent e) {
		mqtt.publish(new TurnoutDirectionSignal(e.id, e.direction));

		getTurnoutWithId(e.id).direction = e.direction;
	}

	private void simulateEvent(final Event event) throws Exception {
		event.simulate(this);
	}

	private void simulateEvents() throws Exception {
		long currentTime = 0;
		for (int i = 0; i < events.events.size(); i++) {
			final Event event = events.events.get(i);
			if (currentTime < event.time)
				Thread.sleep(event.time - currentTime);
			currentTime = event.time;
			simulateEvent(event);
		}
	}

	public void simulateWorld() throws Exception {
		initializeControllers();
		initializeTurnouts();

		simulateEvents();

		Awaitility.await().until(allMessageConsumed());
		tearDown();
	}

	private Callable<Boolean> allMessageConsumed() {
		return new Callable<Boolean>() {
			@Override
			public Boolean call() throws Exception {
				return mqtt.allMesageConsumed();
			}
		};
	}
}
