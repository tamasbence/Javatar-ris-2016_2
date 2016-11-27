package hu.bme.mit.swsv.ris.randoop;

import hu.bme.mit.swsv.ris.common.Direction;
import hu.bme.mit.swsv.ris.common.NeighborTSMInfo;
import hu.bme.mit.swsv.ris.common.NeighborTSMStatus;
import hu.bme.mit.swsv.ris.common.SectionOccupancy;
import hu.bme.mit.swsv.ris.common.SideTriple;
import hu.bme.mit.swsv.ris.common.logging.LoggerWrapper;
import hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl;

public class RandoopTestInitializer {

	public static SafetyLogicImpl createSafetyLogicImpl(final RandoopSignalMapper sm) {
		final SideTriple<SectionOccupancy> sectionOccupancies = SideTriple.of(SectionOccupancy.FREE,
				SectionOccupancy.FREE, SectionOccupancy.FREE);
		final Direction turnoutDirection = Direction.STRAIGHT;
		final SideTriple<NeighborTSMInfo> neighborStatuses = SideTriple.of(
				NeighborTSMInfo.some(NeighborTSMStatus.ALLOWED), NeighborTSMInfo.some(NeighborTSMStatus.ALLOWED),
				NeighborTSMInfo.some(NeighborTSMStatus.ALLOWED));
		final SafetyLogicImpl safetyLogic = new SafetyLogicImpl(sectionOccupancies, turnoutDirection, neighborStatuses,
				LoggerWrapper.getLogger("testlogger"));
		safetyLogic.setSignalMapper(sm);
		return safetyLogic;
	}
}
