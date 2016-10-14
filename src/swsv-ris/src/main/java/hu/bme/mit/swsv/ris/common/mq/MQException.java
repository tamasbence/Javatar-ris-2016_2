package hu.bme.mit.swsv.ris.common.mq;

/**
 * Message Queue related exception class.
 */
public class MQException extends Exception {
	private static final long serialVersionUID = 1L;

	/**
	 * Constructs a new exception.
	 */
	public MQException() {
		super();
	}

	/**
	 * Constructs a new exception with a detailed message.
	 *
	 * @param message Detailed message
	 */
	public MQException(final String message) {
		super(message);
	}

	/**
	 * Constructs a new exception with a specified cause.
	 *
	 * @param cause Cause
	 */
	public MQException(final Throwable cause) {
		super(cause);
	}
}
