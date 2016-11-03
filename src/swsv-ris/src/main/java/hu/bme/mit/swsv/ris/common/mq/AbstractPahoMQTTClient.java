package hu.bme.mit.swsv.ris.common.mq;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.IMqttToken;
import org.eclipse.paho.client.mqttv3.MqttAsyncClient;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

import hu.bme.mit.swsv.ris.common.logging.LogEntry;
import hu.bme.mit.swsv.ris.common.logging.LoggerWrapper;
import hu.bme.mit.swsv.ris.signals.AbstractSignal;
import hu.bme.mit.swsv.ris.signals.HeartBeatSignal;
import hu.bme.mit.swsv.ris.tsm.MQClient;

/**
 * Base class for Paho MQTT clients. This client can receive and publish signals
 * from/to a given topic. Derived classes can override callback methods which
 * are called when a signal is received or published.
 */
public abstract class AbstractPahoMQTTClient implements MQClient, MqttCallback {

	private static final int QOS = 2;
	private final String topic;
	private MqttAsyncClient client;
	private final LoggerWrapper logger;

	/**
	 * Initializes a MQTT client.
	 *
	 * @param connParams Parameters of the connection
	 * @param clientId Unique id of this client
	 * @param logger Logger
	 * @throws MQException An exception is thrown when the client cannot connect
	 *             to the server
	 */
	public AbstractPahoMQTTClient(final ConnectionParams connParams, final String clientId, final LoggerWrapper logger)
			throws MQException {
		this.topic = connParams.getTopic();
		this.logger = logger;

		try {
			client = new MqttAsyncClient(connParams.getBroker(), clientId, new MemoryPersistence());
			final MqttConnectOptions connOpts = new MqttConnectOptions();
			connOpts.setCleanSession(true);
			connOpts.setMaxInflight(500);
			final IMqttToken token = client.connect(connOpts);
			client.setCallback(this);
			token.waitForCompletion();
			client.subscribe(topic, QOS);
			client.subscribe("heartbeat", QOS);
		} catch (final MqttException e) {
			logger.log(LogEntry.CANNOT_CONNECT);
			throw new MQException(e);
		}
	}

	@Override
	public final void publish(final AbstractSignal signal) {
		logger.log(LogEntry.METHOD_ENTER, "publish:" + signal);
		try {
			final ByteArrayOutputStream baos = new ByteArrayOutputStream();
			final ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(signal);
			final MqttMessage message = new MqttMessage(baos.toByteArray());
			message.setQos(QOS);
			if (signal instanceof HeartBeatSignal) {
				client.publish("heartbeat", message);
			} else {
				client.publish(topic, message);
			}
			signalPublished(signal);
		} catch (final MqttException e) {
			logger.log(LogEntry.CANNOT_PUBLISH, e);
		} catch (final IOException e) {
			logger.log(LogEntry.CANNOT_SERIALIZE, e);
		} catch (final Exception e) {
			logger.log(LogEntry.DISCONNECT_ERROR, e);
		}
	}

	@Override
	public final void connectionLost(final Throwable cause) {
		logger.log(LogEntry.CONNECTION_LOST);
	}

	@Override
	public final void deliveryComplete(final IMqttDeliveryToken token) {
		// Nothing else to do after a completed delivery
	}

	@Override
	public final void messageArrived(final String topic, final MqttMessage message) throws Exception {
		final ByteArrayInputStream bais = new ByteArrayInputStream(message.getPayload());
		final ObjectInputStream ois = new ObjectInputStream(bais);
		final Object payLoad = ois.readObject();

		if (payLoad instanceof AbstractSignal) {
			final AbstractSignal signal = (AbstractSignal) payLoad;
			signalArrived(signal);
		} else {
			logger.log(LogEntry.UNKNOWN_MESSAGE, payLoad.toString());
		}
	}

	@Override
	public final void disconnect() throws MQException {
		try {
			client.disconnect();
		} catch (final MqttException e) {
			throw new MQException(e);
		}
	}

	/**
	 * Callback, which is called when a signal arrives. Derived classes can
	 * override this method to handle signal arrival.
	 *
	 * @param signal The arrived signal
	 */
	public void signalArrived(final AbstractSignal signal) {
	}

	/**
	 * Callback, which is called when a signal is published. Derived can
	 * override this method to handle signal publishing.
	 *
	 * @param signal The published signal
	 */
	public void signalPublished(final AbstractSignal signal) {
		logger.log(LogEntry.METHOD_ENTER, "signalPublished:" + signal);
	}

}
