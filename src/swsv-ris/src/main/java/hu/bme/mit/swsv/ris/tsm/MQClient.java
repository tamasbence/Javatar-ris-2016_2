package hu.bme.mit.swsv.ris.tsm;

import hu.bme.mit.swsv.ris.common.mq.MQException;
import hu.bme.mit.swsv.ris.signals.AbstractSignal;

/**
 * Interface for the message queue (MQ) client, which can send and receive
 * signals.
 */
public interface MQClient {

	/**
	 * Publishes a signal.
	 *
	 * @param signal Signal to be published
	 */
	void publish(AbstractSignal signal);

	/**
	 * Disconnects the client from the service.
	 *
	 * @throws MQException An exception is thrown when the attempt to disconnect
	 *             fails
	 */
	void disconnect() throws MQException;
}
