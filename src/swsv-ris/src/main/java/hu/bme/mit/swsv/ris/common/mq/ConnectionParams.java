package hu.bme.mit.swsv.ris.common.mq;

/**
 * Encapsulates parameters of the connection, including the address of the
 * broker and the name of the topic.
 */
public class ConnectionParams {
	private final String broker;
	private final String topic;

	/**
	 * Initializes the connection parameter description with broker address and
	 * topic name.
	 *
	 * @param broker Address of the broker
	 * @param topic Name of the topic
	 */
	public ConnectionParams(final String broker, final String topic) {
		this.broker = broker;
		this.topic = topic;
	}

	/**
	 * Gets the address of the broker.
	 *
	 * @return Address of the broker
	 */
	public String getBroker() {
		return broker;
	}

	/**
	 * Gets the name of the topic.
	 *
	 * @return Name of the topic
	 */
	public String getTopic() {
		return topic;
	}
}
