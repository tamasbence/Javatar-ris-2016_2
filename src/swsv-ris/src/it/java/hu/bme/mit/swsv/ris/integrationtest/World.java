package hu.bme.mit.swsv.ris.integrationtest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import org.awaitility.Awaitility;
import org.junit.Assert;

import com.google.gson.Gson;

import hu.bme.mit.swsv.ris.common.Direction;
import hu.bme.mit.swsv.ris.common.Side;
import hu.bme.mit.swsv.ris.common.SideTriple;
import hu.bme.mit.swsv.ris.common.logging.LogEntry;
import hu.bme.mit.swsv.ris.common.logging.LoggerWrapper;
import hu.bme.mit.swsv.ris.common.mq.ConnectionParams;
import hu.bme.mit.swsv.ris.common.mq.MQException;
import hu.bme.mit.swsv.ris.integrationtest.realworld.Track;
import hu.bme.mit.swsv.ris.integrationtest.realworld.Turnout;
import hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal;
import hu.bme.mit.swsv.ris.tsm.impl.TurnoutSafetyModuleImpl;

public class World {

	private Track track;

	private final PahoMQTTClientTester mqtt;

	private final List<TurnoutSafetyModuleImpl> safetyControllers;

	private final ConnectionParams connParams = new ConnectionParams("tcp://localhost:1883", "swsv");

	private final LoggerWrapper logger;

	public World(final String trackPath, final int id) throws MQException {
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
			final Gson gson = new Gson();
			track = gson.fromJson(trackFile, Track.class);
		} catch (final FileNotFoundException e) {
			logger.log(LogEntry.JSON_PARSE_ERROR);
			Assert.fail("Test file not found in file system.");
		}
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

	public void simulateWorld() throws Exception {
		initializeControllers();
		initializeTurnouts();

		// TODO Add testing of dynamics obtained from JSON descriptions

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
