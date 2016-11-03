package hu.bme.mit.swsv.ris.tsm.impl;

import hu.bme.mit.swsv.ris.common.NeighborTSMStatus;
import hu.bme.mit.swsv.ris.common.SectionControl;
import hu.bme.mit.swsv.ris.common.Side;
import hu.bme.mit.swsv.ris.common.SideTriple;
import hu.bme.mit.swsv.ris.common.logging.LogEntry;
import hu.bme.mit.swsv.ris.common.logging.LoggerWrapper;
import hu.bme.mit.swsv.ris.signals.HeartBeatSignal;
import hu.bme.mit.swsv.ris.signals.SectionControlSignal;
import hu.bme.mit.swsv.ris.signals.SectionOccupancySignal;
import hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal;
import hu.bme.mit.swsv.ris.tsm.MQClient;
import hu.bme.mit.swsv.ris.tsm.SafetyLogic;
import hu.bme.mit.swsv.ris.tsm.SignalMapper;

/**
 * Implementation of the signal mapper interface.
 */
public class SignalMapperImpl implements SignalMapper {

	private SafetyLogic safetyLogic;
	// Id of the associated turnout
	private final Integer ownTurnoutId;
	// Ids of the associated sections
	private final SideTriple<Integer> sectionIds;
	// Ids of the neighbor turnouts
	private final SideTriple<Integer> neighborIds;
	// Connecting sides of the neighbor turnouts
	private final SideTriple<Side> neighborSides;

	private MQClient mqClient;
	private final LoggerWrapper logger;

	/**
	 * Initializes the signal mapper. The safety logic and the MQ client is
	 * initially null, which must be set with methods setSafetyLogic and
	 * setMqClient.
	 *
	 * @param ownTurnoutId Id of the turnout associated with the signal mapper
	 * @param sectionIds Ids of the sections associated with the signal mapper
	 * @param neighborIds Ids of the neighbor turnouts of the signal mapper
	 * @param neighborSides Connecting sides of the neighbor turnouts
	 * @param logger Logger
	 */
	public SignalMapperImpl(final Integer ownTurnoutId, final SideTriple<Integer> sectionIds,
			final SideTriple<Integer> neighborIds, final SideTriple<Side> neighborSides, final LoggerWrapper logger) {
		this.logger = logger;
		this.ownTurnoutId = ownTurnoutId;
		this.sectionIds = sectionIds;
		this.neighborIds = neighborIds;
		this.neighborSides = neighborSides;
	}

	/**
	 * Sets the safety logic.
	 *
	 * @param safetyLogic Safety logic to be set
	 */
	public void setSafetyLogic(final SafetyLogic safetyLogic) {
		this.safetyLogic = safetyLogic;
	}

	/**
	 * Sets the MQ client.
	 *
	 * @param mqttClient MQ client to be set
	 */
	public void setMqClient(final MQClient mqttClient) {
		this.mqClient = mqttClient;
	}

	@Override
	public void receiveSectionOccupancy(final SectionOccupancySignal signal) {
		assert safetyLogic != null;

		logger.log(LogEntry.METHOD_ENTER,
				"receiveSectionOccupancy:" + signal.getSenderId() + ":" + signal.getSectionOccupancy());

		// Check if the id of the sender matches the id of an associated section
		// in any of the sides
		Side side = null;
		if (signal.getSenderId().equals(sectionIds.getFacing())) {
			side = Side.FACING;
		} else if (signal.getSenderId().equals(sectionIds.getStraight())) {
			side = Side.STRAIGHT;
		} else if (signal.getSenderId().equals(sectionIds.getDivergent())) {
			side = Side.DIVERGENT;
		}

		// If a matching id was found in some side, propagate the signal to
		// the safety logic
		if (side != null) {
			safetyLogic.sectionOccupancyChanged(side, signal.getSectionOccupancy());
		}
	}

	@Override
	public void receiveTurnoutDirection(final TurnoutDirectionSignal signal) {
		assert safetyLogic != null;

		logger.log(LogEntry.METHOD_ENTER,
				"receiveTurnoutDirection:" + signal.getSenderId() + ":" + signal.getTurnoutDirection());

		// Check if the id of the sender matches the id of the associated
		// turnout and propagate the signal to the safety logic
		if (signal.getSenderId().equals(ownTurnoutId)) {
			safetyLogic.turnoutDirectionChanged(signal.getTurnoutDirection());
		}
	}

	@Override
	public void receiveHeartBeat(final HeartBeatSignal signal) {
		assert safetyLogic != null;

		logger.log(LogEntry.METHOD_ENTER, "receiveHeartBeat:" + signal.getSenderId() + ":" + signal.getTargetId());

		// First, check if the heartbeat is targeted to the current TSM
		if (signal.getTargetId().equals(ownTurnoutId)) {
			Side side = null;
			// Second, check if the id and the side of the sender matches the id
			// and side of a neighbor connected in any of the sides
			if (signal.getSenderId().equals(neighborIds.getFacing())
					&& signal.getSenderSide() == neighborSides.getFacing()) {
				side = Side.FACING;
			}
			if (signal.getSenderId().equals(neighborIds.getStraight())
					&& signal.getSenderSide() == neighborSides.getStraight()) {
				side = Side.STRAIGHT;
			}
			if (signal.getSenderId().equals(neighborIds.getDivergent())
					&& signal.getSenderSide() == neighborSides.getDivergent()) {
				side = Side.DIVERGENT;
			}

			// If a matching id and side was found in some side, propagate the
			// signal to the safety logic
			if (side != null) {
				safetyLogic.neighborStatusChanged(side, signal.getTimestamp(), signal.getStatus());
			} else {
				logger.log(LogEntry.WRONG_SIGNAL, "heartbeat received from unknown sender " + signal.getSenderId()
						+ ", signal: " + signal.toString());
			}
		}
	}

	@Override
	public void sendControl(final SideTriple<SectionControl> decision) {
		assert mqClient != null;

		logger.log(LogEntry.METHOD_ENTER, "sendDecision:" + this.ownTurnoutId);

		// Propagate the control to the sections on each side
		mqClient.publish(new SectionControlSignal(ownTurnoutId, sectionIds.getFacing(), decision.getFacing()));
		mqClient.publish(new SectionControlSignal(ownTurnoutId, sectionIds.getStraight(), decision.getStraight()));
		mqClient.publish(new SectionControlSignal(ownTurnoutId, sectionIds.getDivergent(), decision.getDivergent()));
	}

	@Override
	public void sendStatus(final SideTriple<NeighborTSMStatus> statusForNeighbors) {
		assert mqClient != null;

		logger.log(LogEntry.METHOD_ENTER, "sendStatus");

		// Propagate the status to each existing neighbor
		if (!neighborIds.getFacing().equals(-1)) {
			mqClient.publish(new HeartBeatSignal(ownTurnoutId, neighborIds.getFacing(), statusForNeighbors.getFacing(),
					Side.FACING));
		}
		if (!neighborIds.getStraight().equals(-1)) {
			mqClient.publish(new HeartBeatSignal(ownTurnoutId, neighborIds.getStraight(),
					statusForNeighbors.getStraight(), Side.STRAIGHT));
		}
		if (!neighborIds.getDivergent().equals(-1)) {
			mqClient.publish(new HeartBeatSignal(ownTurnoutId, neighborIds.getDivergent(),
					statusForNeighbors.getDivergent(), Side.DIVERGENT));
		}
	}
}
