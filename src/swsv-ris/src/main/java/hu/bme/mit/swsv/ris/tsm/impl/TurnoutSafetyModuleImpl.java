package hu.bme.mit.swsv.ris.tsm.impl;

import static hu.bme.mit.swsv.ris.common.NeighborTSMInfo.none;
import static hu.bme.mit.swsv.ris.common.NeighborTSMInfo.some;

import hu.bme.mit.swsv.ris.common.Direction;
import hu.bme.mit.swsv.ris.common.NeighborTSMInfo;
import hu.bme.mit.swsv.ris.common.NeighborTSMStatus;
import hu.bme.mit.swsv.ris.common.SectionOccupancy;
import hu.bme.mit.swsv.ris.common.Side;
import hu.bme.mit.swsv.ris.common.SideTriple;
import hu.bme.mit.swsv.ris.common.logging.LogEntry;
import hu.bme.mit.swsv.ris.common.logging.LoggerWrapper;
import hu.bme.mit.swsv.ris.common.mq.ConnectionParams;
import hu.bme.mit.swsv.ris.common.mq.MQException;

/**
 * Implementation of the Turnout Safety Module (TSM). It is responsible for
 * instantiating and connecting its 3 main components, a MQ client, a signal
 * mapper and a safety logic.
 */
public class TurnoutSafetyModuleImpl {
	private final PahoMQTTClientImpl mqClient;
	private final SafetyLogicImpl safetyLogic;
	private final SignalMapperImpl signalMapper;
	private final LoggerWrapper logger;

	/**
	 * Initializes and starts the TSM. Initially (until no signal arrives) it is
	 * assumed that the turnout is straight, associated sections are free and
	 * neighbors are either non-existing or denied.
	 *
	 * @param ownTurnoutId Id of the turnout corresponding to this TSM
	 * @param sectionIds Ids of the sections associated with this TSM
	 * @param neighborIds Ids of the neighbor turnouts of this TSM
	 * @param neighborSides Connecting sides of the neighbor turnouts
	 * @param connParams Parameters of the connection for sending and receiving
	 *            signals
	 * @throws MQException An exception is thrown when the TSM cannot connect to
	 *             the server
	 */
	public TurnoutSafetyModuleImpl(final Integer ownTurnoutId, final SideTriple<Integer> sectionIds,
			final SideTriple<Integer> neighborIds, final SideTriple<Side> neighborSides,
			final ConnectionParams connParams) throws MQException {
		logger = LoggerWrapper.getLogger("TSM_" + ownTurnoutId);

		// Initially assume that each section is free
		final SideTriple<SectionOccupancy> sectionInitStatuses = SideTriple.of(SectionOccupancy.FREE,
				SectionOccupancy.FREE, SectionOccupancy.FREE);
		// Initially assume that each existing neighbor is denied
		final SideTriple<NeighborTSMInfo> turnoutInitStatuses = SideTriple.of(
				neighborIds.getFacing().equals(-1) ? none() : some(NeighborTSMStatus.DENIED),
				neighborIds.getStraight().equals(-1) ? none() : some(NeighborTSMStatus.DENIED),
				neighborIds.getDivergent().equals(-1) ? none() : some(NeighborTSMStatus.DENIED));
		// Initially assume a straight status
		final Direction turnoutInitStatus = Direction.STRAIGHT;

		signalMapper = new SignalMapperImpl(ownTurnoutId, sectionIds, neighborIds, neighborSides,
				LoggerWrapper.getLogger("SignalMapper", logger));
		safetyLogic = new SafetyLogicImpl(sectionInitStatuses, turnoutInitStatus, turnoutInitStatuses,
				LoggerWrapper.getLogger("SafetyLogic", logger));
		mqClient = new PahoMQTTClientImpl(connParams, ownTurnoutId, LoggerWrapper.getLogger("MQClient", logger));

		signalMapper.setMqClient(mqClient);
		signalMapper.setSafetyLogic(safetyLogic);
		safetyLogic.setSignalMapper(signalMapper);
		mqClient.setSignalMapper(signalMapper);

		safetyLogic.startHeartBeat();

		logger.log(LogEntry.STARTED);
	}

	/**
	 * Disconnects the TSM. After disconnecting, the TSM will stop
	 * receiving/sending messages.
	 */
	public void disconnect() {
		try {
			mqClient.disconnect();
			safetyLogic.disconnect();
			logger.log(LogEntry.STOPPED);
		} catch (final Exception e) {
			logger.log(LogEntry.DISCONNECT_ERROR, e);
		}
	}
}
