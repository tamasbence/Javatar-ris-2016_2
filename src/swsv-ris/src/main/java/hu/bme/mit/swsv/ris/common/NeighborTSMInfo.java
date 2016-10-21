package hu.bme.mit.swsv.ris.common;

import static hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
import static hu.bme.mit.swsv.ris.common.NeighborTSMStatus.DENIED;
import static org.apache.commons.lang3.Validate.notNull;

import java.util.Date;

/**
 * This class represents the knowledge about a neighbor TSM, including its
 * existence and its status with the latest timestamp.
 */
public abstract class NeighborTSMInfo {
	private static final NeighborTSMInfo NONE = new UnknownNeighborTurnoutInfo(); // Caching

	private NeighborTSMInfo() {
	}

	/**
	 * Creates a new instance for a non-existing neighbor.
	 *
	 * @return An instance for a non-existing neighbor
	 */
	public static NeighborTSMInfo none() {
		return NONE;
	}

	/**
	 * Creates a new instance for an existing neighbor with its status and a
	 * timestamp.
	 *
	 * @param status Initial status of the neighbor
	 * @param initialTimestamp Timestamp of the initial status
	 * @return New instance
	 */
	public static NeighborTSMInfo some(final NeighborTSMStatus status, final Date initialTimestamp) {
		return new KnownNeighborTurnoutInfo(status, initialTimestamp);
	}

	/**
	 * Creates a new instance for an existing neighbor with its status.
	 *
	 * @param status Initial status of the neighbor
	 * @return New instance
	 */
	public static NeighborTSMInfo some(final NeighborTSMStatus status) {
		return some(status, new Date());
	}

	/**
	 * Gets the status of the neighbor with a given tolerance. If the neighbor
	 * does not exist, the status is allowed. If the information is outdated,
	 * the status is denied. Otherwise the method returns the latest known
	 * status.
	 *
	 * @param tolerance Tolerance in milliseconds
	 * @return Status of the neighbor
	 */
	public abstract NeighborTSMStatus getStatus(final long tolerance);

	/**
	 * Subclass for non-existing neighbors.
	 */
	private static final class UnknownNeighborTurnoutInfo extends NeighborTSMInfo {
		@Override
		public NeighborTSMStatus getStatus(final long tolerance) {
			return ALLOWED;
		}

	}

	/**
	 * Subclass for existing neighbors.
	 */
	private static final class KnownNeighborTurnoutInfo extends NeighborTSMInfo {
		private final NeighborTSMStatus status;
		private final Date timestamp;

		private KnownNeighborTurnoutInfo(final NeighborTSMStatus status, final Date timestamp) {
			notNull(status);
			notNull(timestamp);
			this.status = status;
			this.timestamp = timestamp;
		}

		@Override
		public NeighborTSMStatus getStatus(final long tolerance) {
			if (isOutdated(tolerance)) {
				return DENIED;
			} else {
				return status;
			}
		}

		private boolean isOutdated(final long tolerance) {
			return new Date(timestamp.getTime() + tolerance).before(new Date());
		}
	}

}
