package hu.bme.mit.swsv.ris.tsm.test;

import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.graphwalker.core.condition.EdgeCoverage;
import org.graphwalker.core.generator.RandomPath;
import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.GraphWalker;
import org.mockito.ArgumentCaptor;

import hu.bme.mit.swsv.ris.common.Direction;
import hu.bme.mit.swsv.ris.common.NeighborTSMInfo;
import hu.bme.mit.swsv.ris.common.NeighborTSMStatus;
import hu.bme.mit.swsv.ris.common.SectionOccupancy;
import hu.bme.mit.swsv.ris.common.Side;
import hu.bme.mit.swsv.ris.common.SideTriple;
import hu.bme.mit.swsv.ris.common.logging.LoggerWrapper;
import hu.bme.mit.swsv.ris.tsm.SignalMapper;
import hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl;

@GraphWalker(start = "e_init", pathGenerator = RandomPath.class, stopCondition = EdgeCoverage.class, stopConditionValue = "100")
public class FacingStatusTest extends ExecutionContext implements FacingStatus {

	public SafetyLogicImpl safetyLogic;
	public SignalMapper signalMapper;
	public SideTriple<SectionOccupancy> sectionOccupancies;
	public Direction turnoutDirection;
	public boolean initializing;

	public FacingStatusTest() {
		sectionOccupancies = SideTriple.of(SectionOccupancy.FREE, SectionOccupancy.FREE, SectionOccupancy.FREE);
		final Direction turnoutDirection = Direction.STRAIGHT;
		final SideTriple<NeighborTSMInfo> neighborStatuses = SideTriple.of(
				NeighborTSMInfo.some(NeighborTSMStatus.ALLOWED), NeighborTSMInfo.some(NeighborTSMStatus.ALLOWED),
				NeighborTSMInfo.some(NeighborTSMStatus.ALLOWED));
		safetyLogic = new SafetyLogicImpl(sectionOccupancies, turnoutDirection, neighborStatuses,
				LoggerWrapper.getLogger("testlogger"));
		signalMapper = mock(SignalMapper.class);
		safetyLogic.setSignalMapper(signalMapper);
		initializing = true;
	}

	public void directionchange() {
		if (turnoutDirection == Direction.STRAIGHT)
			turnoutDirection = Direction.DIVERGENT;
		else
			turnoutDirection = Direction.STRAIGHT;
		safetyLogic.turnoutDirectionChanged(turnoutDirection);
	}

	public void occupancyChange(final Side side) {
		if (sectionOccupancies.get(side) == SectionOccupancy.FREE)
			sectionOccupancies = sectionOccupancies.with(side, SectionOccupancy.OCCUPIED);
		else
			sectionOccupancies = sectionOccupancies.with(side, SectionOccupancy.FREE);
		safetyLogic.sectionOccupancyChanged(side, sectionOccupancies.get(side));
	}

	@Override
	public void v_denied() {
		final SideTriple<NeighborTSMStatus> temp = SideTriple.of(NeighborTSMStatus.ALLOWED, NeighborTSMStatus.ALLOWED,
				NeighborTSMStatus.ALLOWED);
		final ArgumentCaptor<SideTriple<NeighborTSMStatus>> captor = ArgumentCaptor.forClass(temp.getClass());
		verify(signalMapper, atLeast(1)).sendStatus(captor.capture());
		assert(captor.getValue().get(Side.FACING) == NeighborTSMStatus.DENIED);
	}

	@Override
	public void e_divergentchange1() {
		occupancyChange(Side.DIVERGENT);
	}

	@Override
	public void e_straightchange4() {
		occupancyChange(Side.STRAIGHT);
	}

	@Override
	public void e_divergentchange3() {
		occupancyChange(Side.DIVERGENT);
	}

	@Override
	public void e_divergentchange2() {
		occupancyChange(Side.DIVERGENT);
	}

	@Override
	public void e_directionchange3() {
		occupancyChange(Side.STRAIGHT);
	}

	@Override
	public void e_directionchange4() {
		directionchange();
	}

	@Override
	public void e_divergentchange4() {
		occupancyChange(Side.DIVERGENT);
	}

	@Override
	public void e_directionchange1() {
		directionchange();
	}

	@Override
	public void e_init() {

	}

	@Override
	public void e_directionchange2() {
		directionchange();
	}

	@Override
	public void e_facingchange4() {
		occupancyChange(Side.FACING);
	}

	@Override
	public void e_facingchange2() {
		occupancyChange(Side.FACING);
	}

	@Override
	public void e_straightchange1() {
		occupancyChange(Side.STRAIGHT);
	}

	@Override
	public void e_straightchange3() {
		occupancyChange(Side.STRAIGHT);
	}

	@Override
	public void v_allowed() {
		if (initializing) {
			initializing = false;
			return;
		}

		final SideTriple<NeighborTSMStatus> temp = SideTriple.of(NeighborTSMStatus.ALLOWED, NeighborTSMStatus.ALLOWED,
				NeighborTSMStatus.ALLOWED);
		final ArgumentCaptor<SideTriple<NeighborTSMStatus>> captor = ArgumentCaptor.forClass(temp.getClass());
		verify(signalMapper, atLeast(1)).sendStatus(captor.capture());
		assert(captor.getValue().get(Side.FACING) == NeighborTSMStatus.ALLOWED);
	}

	@Override
	public void e_straightchange2() {
		occupancyChange(Side.STRAIGHT);
	}

	@Override
	public void e_facing_change1() {
		occupancyChange(Side.FACING);
	}

}
