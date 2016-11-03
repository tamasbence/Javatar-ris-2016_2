package hu.bme.mit.swsv.ris.tsm.impl;

import hu.bme.mit.swsv.ris.common.logging.LogEntry;
import hu.bme.mit.swsv.ris.common.logging.LoggerWrapper;
import hu.bme.mit.swsv.ris.common.mq.AbstractPahoMQTTClient;
import hu.bme.mit.swsv.ris.common.mq.ConnectionParams;
import hu.bme.mit.swsv.ris.common.mq.MQException;
import hu.bme.mit.swsv.ris.signals.AbstractSignal;
import hu.bme.mit.swsv.ris.signals.HeartBeatSignal;
import hu.bme.mit.swsv.ris.signals.SectionControlSignal;
import hu.bme.mit.swsv.ris.signals.SectionOccupancySignal;
import hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal;
import hu.bme.mit.swsv.ris.tsm.MQClient;
import hu.bme.mit.swsv.ris.tsm.SignalMapper;

/**
 * Paho MQTT-based implementation of the MQClient interface.
 */
public class PahoMQTTClientImpl extends AbstractPahoMQTTClient implements MQClient {

	private SignalMapper signalMapper;

	private final LoggerWrapper logger;

	/**
	 * Initializes the client. The signal mapper is initially null, which must
	 * be set using setSignalMapper method.
	 *
	 * @param connParams Parameters of the connection
	 * @param clientId Unique id of the client
	 * @param logger Logger
	 * @throws MQException An exception is thrown when the client cannot connect
	 *             to the server
	 */
	public PahoMQTTClientImpl(final ConnectionParams connParams, final int clientId, final LoggerWrapper logger)
			throws MQException {
		super(connParams, Integer.toString(clientId), logger);
		this.logger = logger;
	}

	/**
	 * Sets the signal mapper.
	 *
	 * @param signalMapper Signal mapper to be set
	 */
	public void setSignalMapper(final SignalMapper signalMapper) {
		this.signalMapper = signalMapper;
	}

	@Override
	public void signalArrived(final AbstractSignal signal) {
		assert signalMapper != null;

		if (signal instanceof SectionOccupancySignal) {
			signalMapper.receiveSectionOccupancy((SectionOccupancySignal) signal);
		} else if (signal instanceof TurnoutDirectionSignal) {
			signalMapper.receiveTurnoutDirection((TurnoutDirectionSignal) signal);
		} else if (signal instanceof HeartBeatSignal) {
			signalMapper.receiveHeartBeat((HeartBeatSignal) signal);
		} else if (signal instanceof SectionControlSignal) {
			// Nothing to do with SectionControlSignal
		} else {
			logger.log(LogEntry.UNKNOWN_SIGNAL, signal.toString());
		}
	}
}
