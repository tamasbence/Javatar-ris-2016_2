package hu.bme.mit.swsv.ris.tsm.impl;

import static hu.bme.mit.swsv.ris.common.Constants.HEARTBEAT_PERIOD_MS;
import static hu.bme.mit.swsv.ris.common.Constants.HEARTBEAT_WAIT_NR;
import static hu.bme.mit.swsv.ris.common.Direction.DIVERGENT;
import static hu.bme.mit.swsv.ris.common.Direction.STRAIGHT;
import static hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
import static hu.bme.mit.swsv.ris.common.SectionControl.ENABLED;
import static hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED;

import java.util.Date;

import hu.bme.mit.swsv.ris.common.Direction;
import hu.bme.mit.swsv.ris.common.NeighborTSMInfo;
import hu.bme.mit.swsv.ris.common.NeighborTSMStatus;
import hu.bme.mit.swsv.ris.common.SectionControl;
import hu.bme.mit.swsv.ris.common.SectionOccupancy;
import hu.bme.mit.swsv.ris.common.Side;
import hu.bme.mit.swsv.ris.common.SideTriple;
import hu.bme.mit.swsv.ris.common.logging.LogEntry;
import hu.bme.mit.swsv.ris.common.logging.LoggerWrapper;
import hu.bme.mit.swsv.ris.tsm.SafetyLogic;
import hu.bme.mit.swsv.ris.tsm.SignalMapper;

/**
 * Implementation of the safety logic interface.
 */
public final class SafetyLogicImpl implements SafetyLogic {
	private static final long TOLERANCE_MS = HEARTBEAT_PERIOD_MS * HEARTBEAT_WAIT_NR;

	private SideTriple<SectionOccupancy> sectionOccupancies;
	private Direction turnoutDirection;
	private SideTriple<NeighborTSMInfo> neighborStatuses;

	private SignalMapper signalMapper;
	private final LoggerWrapper logger;

	/**
	 * Initializes the safety logic. The signal mapper is initially null, which
	 * must be set using setSignalMapper method.
	 *
	 * @param sectionOccupancies Initial occupancies of the associated sections
	 * @param turnoutDirection Initial direction of the associated turnout
	 * @param neighborStatuses Initial statuses of the neighbor TSMs
	 * @param logger Logger
	 */
	public SafetyLogicImpl(final SideTriple<SectionOccupancy> sectionOccupancies, final Direction turnoutDirection,
			final SideTriple<NeighborTSMInfo> neighborStatuses, final LoggerWrapper logger) {
		this.logger = logger;

		this.sectionOccupancies = sectionOccupancies;
		this.turnoutDirection = turnoutDirection;
		this.neighborStatuses = neighborStatuses;
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
	public void sectionOccupancyChanged(final Side side, final SectionOccupancy occupancy) {
		logger.log(LogEntry.METHOD_ENTER, "sectionOccupancyChanged");
		final SectionOccupancy currentOccupancy = sectionOccupancies.get(side);
		if (!currentOccupancy.equals(occupancy)) {
			sectionOccupancies = sectionOccupancies.with(side, occupancy);
			makeDecision();
		}
	}

	@Override
	public void turnoutDirectionChanged(final Direction direction) {
		logger.log(LogEntry.METHOD_ENTER, "turnoutDirectionChanged");
		if (!turnoutDirection.equals(direction)) {
			turnoutDirection = direction;
			makeDecision();
		}
	}

	@Override
	public void neighborStatusChanged(final Side side, final Date timestamp, final NeighborTSMStatus status) {
		logger.log(LogEntry.METHOD_ENTER, "neighborStatusChanged");

		final NeighborTSMInfo oldInfo = neighborStatuses.get(side);
		final NeighborTSMStatus oldStatus = oldInfo.getStatus(TOLERANCE_MS);

		neighborStatuses = neighborStatuses.with(side, NeighborTSMInfo.some(status, timestamp));

		if (!oldStatus.equals(status)) {
			makeDecision();
		}
	}

	/**
	 * Make decision and send control signals to associated sections.
	 */
	private void makeDecision() {
		assert signalMapper != null;
		logger.log(LogEntry.METHOD_ENTER, "makeDecision");
		final SideTriple<SectionControl> localDecision = makeLocalDecision();
		if ((sectionOccupancies.getFacing() == OCCUPIED && localDecision.getFacing() == ENABLED)
				|| (sectionOccupancies.getStraight() == OCCUPIED && localDecision.getStraight() == ENABLED)
				|| (sectionOccupancies.getDivergent() == OCCUPIED && localDecision.getDivergent() == ENABLED)) {
			final SideTriple<SectionControl> distributedDecision = makeDistributedDecision();
			final SideTriple<SectionControl> combinedDecision = combineDecisions(localDecision, distributedDecision);
			signalMapper.sendControl(combinedDecision);
		} else {
			signalMapper.sendControl(localDecision);
		}
	}

	/**
	 * Make local decision based on the status of the associated sections and
	 * turnout.
	 *
	 * @return A triple containing a control for each associated section
	 */
	private SideTriple<SectionControl> makeLocalDecision() {
		SectionControl facingDecision = ENABLED;
		SectionControl straightDecision = ENABLED;
		SectionControl divergentDecision = ENABLED;

		if (sectionOccupancies.getFacing() == OCCUPIED) {
			if (sectionOccupancies.getDivergent() == OCCUPIED && turnoutDirection == DIVERGENT) {
				facingDecision = DISABLED;
			} else if (sectionOccupancies.getStraight() == OCCUPIED && turnoutDirection == STRAIGHT) {
				facingDecision = DISABLED;
			}
		}

		if (sectionOccupancies.getStraight() == OCCUPIED) {
			if (turnoutDirection == DIVERGENT) {
				straightDecision = DISABLED;
			} else if (turnoutDirection == STRAIGHT && sectionOccupancies.getFacing() == OCCUPIED) {
				straightDecision = DISABLED;
			}
		}
		if (sectionOccupancies.getDivergent() == OCCUPIED) {
			if (turnoutDirection == STRAIGHT) {
				divergentDecision = DISABLED;
			} else if (turnoutDirection == DIVERGENT && sectionOccupancies.getFacing() == OCCUPIED) {
				divergentDecision = DISABLED;
			}
		}

		return SideTriple.of(facingDecision, straightDecision, divergentDecision);
	}

	private SectionControl getOccupiedFacingDistributedDecision() {
		if (neighborStatuses.getFacing().getStatus(TOLERANCE_MS) == NeighborTSMStatus.DENIED)
			return DISABLED;
		if (turnoutDirection == Direction.STRAIGHT
				&& neighborStatuses.getStraight().getStatus(TOLERANCE_MS) == NeighborTSMStatus.DENIED)
			return DISABLED;
		if (turnoutDirection == Direction.DIVERGENT
				&& neighborStatuses.getDivergent().getStatus(TOLERANCE_MS) == NeighborTSMStatus.DENIED)
			return DISABLED;
		return ENABLED;
	}

	/**
	 * Make distributed decision based on the status of the neighbor TSMs.
	 *
	 * @return A triple containing a control for each associated section
	 */
	private SideTriple<SectionControl> makeDistributedDecision() {
		SectionControl facingDecision = ENABLED;
		SectionControl straightDecision = ENABLED;
		SectionControl divergentDecision = ENABLED;
		if (sectionOccupancies.getFacing() == OCCUPIED) {
			facingDecision = getOccupiedFacingDistributedDecision();
		}
		if (sectionOccupancies.getStraight() == SectionOccupancy.OCCUPIED
				&& neighborStatuses.getStraight().getStatus(TOLERANCE_MS) == NeighborTSMStatus.DENIED) {
			straightDecision = DISABLED;
		}
		if (sectionOccupancies.getDivergent() == SectionOccupancy.OCCUPIED
				&& neighborStatuses.getDivergent().getStatus(TOLERANCE_MS) == NeighborTSMStatus.DENIED) {
			divergentDecision = DISABLED;
		}
		return SideTriple.of(facingDecision, straightDecision, divergentDecision);
	}

	/**
	 * Combine two decisions. A section is enabled if and only if both decisions
	 * enable it.
	 *
	 * @param d1 First decision
	 * @param d2 Second decision
	 * @return Combined decision
	 */
	private static SideTriple<SectionControl> combineDecisions(final SideTriple<SectionControl> d1,
			final SideTriple<SectionControl> d2) {
		final SectionControl joinedFacingDecision = join(d1.getFacing(), d2.getFacing());
		final SectionControl joinedStraightDecision = join(d1.getStraight(), d2.getStraight());
		final SectionControl joinedDivergentDecision = join(d1.getDivergent(), d2.getDivergent());
		return SideTriple.of(joinedFacingDecision, joinedStraightDecision, joinedDivergentDecision);
	}

	/**
	 * Join two section controls. A section is enabled if both controls enable
	 * it.
	 *
	 * @param c1 First control
	 * @param c2 Second control
	 * @return Joined control
	 */
	private static SectionControl join(final SectionControl c1, final SectionControl c2) {
		if (c1 == ENABLED && c2 == ENABLED) {
			return ENABLED;
		} else {
			return DISABLED;
		}
	}
}
