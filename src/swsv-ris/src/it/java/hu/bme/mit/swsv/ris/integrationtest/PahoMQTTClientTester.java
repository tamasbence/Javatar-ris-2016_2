package hu.bme.mit.swsv.ris.integrationtest;

import java.util.ArrayList;
import java.util.List;

import hu.bme.mit.swsv.ris.common.logging.LogEntry;
import hu.bme.mit.swsv.ris.common.logging.LoggerWrapper;
import hu.bme.mit.swsv.ris.common.mq.AbstractPahoMQTTClient;
import hu.bme.mit.swsv.ris.common.mq.ConnectionParams;
import hu.bme.mit.swsv.ris.signals.AbstractSignal;

public class PahoMQTTClientTester extends AbstractPahoMQTTClient {

	private final LoggerWrapper logger;
	private final List<String> pendingSignals;

	public PahoMQTTClientTester(final ConnectionParams connParams, final String clientId) throws Exception {
		super(connParams, clientId, LoggerWrapper.getLogger(clientId));
		this.logger = LoggerWrapper.getLogger(clientId);
		pendingSignals = new ArrayList<String>();
	}

	public boolean allMesageConsumed() {
		return pendingSignals.isEmpty();
	}

	@Override
	public void signalArrived(final AbstractSignal signal) {
		logger.log(LogEntry.IT_MSG_REC, signal);
		if (pendingSignals.contains(signal.toString()))
			pendingSignals.remove(signal.toString());
	}

	@Override
	public void signalPublished(final AbstractSignal signal) {
		logger.log(LogEntry.IT_MSG_PUB, signal);
		pendingSignals.add(signal.toString());

	}

}
