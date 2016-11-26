package hu.bme.mit.swsv.ris.tsm.test;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;

import org.graphwalker.core.condition.EdgeCoverage;
import org.graphwalker.core.generator.RandomPath;
import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.GraphWalker;
import org.mockito.InOrder;

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
// @GraphWalker(start = "e_init", pathGenerator = AStarPath.class, stopCondition
// = ReachedVertex.class, stopConditionValue = "v_dfff")
public class HeartBeatModelTest extends ExecutionContext implements HeartBeatModel {

	public SafetyLogicImpl safetyLogic;
	public SignalMapper signalMapper;
	public InOrder inOrderSignalMapper;
	public SideTriple<SectionOccupancy> sectionOccupancies;
	public Direction turnoutDirection;
	public boolean initializing;

	public HeartBeatModelTest() {
		sectionOccupancies = SideTriple.of(SectionOccupancy.FREE, SectionOccupancy.FREE, SectionOccupancy.FREE);
		turnoutDirection = Direction.STRAIGHT;
		final SideTriple<NeighborTSMInfo> neighborStatuses = SideTriple.of(
				NeighborTSMInfo.some(NeighborTSMStatus.ALLOWED), NeighborTSMInfo.some(NeighborTSMStatus.ALLOWED),
				NeighborTSMInfo.some(NeighborTSMStatus.ALLOWED));
		safetyLogic = new SafetyLogicImpl(sectionOccupancies, turnoutDirection, neighborStatuses,
				LoggerWrapper.getLogger("testlogger"));
		signalMapper = mock(SignalMapper.class);
		inOrderSignalMapper = inOrder(signalMapper);
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
	public void v_sofo() {
		final SideTriple<NeighborTSMStatus> expected = SideTriple.of(NeighborTSMStatus.DENIED, NeighborTSMStatus.DENIED,
				NeighborTSMStatus.DENIED);
		inOrderSignalMapper.verify(signalMapper).sendStatus(expected);
	}

	@Override
	public void e_sfff_soff() {
		occupancyChange(Side.FACING);
	}

	@Override
	public void e_sfof_dfof() {
		directionchange();
	}

	@Override
	public void v_soff() {
		final SideTriple<NeighborTSMStatus> expected = SideTriple.of(NeighborTSMStatus.DENIED, NeighborTSMStatus.DENIED,
				NeighborTSMStatus.ALLOWED);
		inOrderSignalMapper.verify(signalMapper).sendStatus(expected);
	}

	@Override
	public void e_soff_soof() {
		occupancyChange(Side.STRAIGHT);
	}

	@Override
	public void e_sfof_sfoo() {
		occupancyChange(Side.DIVERGENT);
	}

	@Override
	public void v_doof() {
		final SideTriple<NeighborTSMStatus> expected = SideTriple.of(NeighborTSMStatus.DENIED, NeighborTSMStatus.DENIED,
				NeighborTSMStatus.DENIED);
		inOrderSignalMapper.verify(signalMapper).sendStatus(expected);
	}

	@Override
	public void v_soof() {
		final SideTriple<NeighborTSMStatus> expected = SideTriple.of(NeighborTSMStatus.DENIED, NeighborTSMStatus.DENIED,
				NeighborTSMStatus.ALLOWED);
		inOrderSignalMapper.verify(signalMapper).sendStatus(expected);
	}

	@Override
	public void e_doff_dfff() {
		occupancyChange(Side.FACING);
	}

	@Override
	public void v_dooo() {
		final SideTriple<NeighborTSMStatus> expected = SideTriple.of(NeighborTSMStatus.DENIED, NeighborTSMStatus.DENIED,
				NeighborTSMStatus.DENIED);
		inOrderSignalMapper.verify(signalMapper).sendStatus(expected);
	}

	@Override
	public void e_soff_sofo() {
		occupancyChange(Side.DIVERGENT);
	}

	@Override
	public void e_sffo_sfoo() {
		occupancyChange(Side.STRAIGHT);
	}

	@Override
	public void v_sooo() {
		final SideTriple<NeighborTSMStatus> expected = SideTriple.of(NeighborTSMStatus.DENIED, NeighborTSMStatus.DENIED,
				NeighborTSMStatus.DENIED);
		inOrderSignalMapper.verify(signalMapper).sendStatus(expected);
	}

	@Override
	public void e_soff_sfff() {
		occupancyChange(Side.FACING);
	}

	@Override
	public void e_dfff_doff() {
		occupancyChange(Side.FACING);
	}

	@Override
	public void e_sofo_sffo() {
		occupancyChange(Side.FACING);
	}

	@Override
	public void v_dfff() {
		final SideTriple<NeighborTSMStatus> expected = SideTriple.of(NeighborTSMStatus.ALLOWED,
				NeighborTSMStatus.ALLOWED, NeighborTSMStatus.ALLOWED);
		inOrderSignalMapper.verify(signalMapper).sendStatus(expected);
	}

	@Override
	public void v_sfff() {
		if (initializing) {
			initializing = false;
			return;
		}

		final SideTriple<NeighborTSMStatus> expected = SideTriple.of(NeighborTSMStatus.ALLOWED,
				NeighborTSMStatus.ALLOWED, NeighborTSMStatus.ALLOWED);
		inOrderSignalMapper.verify(signalMapper).sendStatus(expected);
	}

	@Override
	public void v_dffo() {
		final SideTriple<NeighborTSMStatus> expected = SideTriple.of(NeighborTSMStatus.DENIED,
				NeighborTSMStatus.ALLOWED, NeighborTSMStatus.DENIED);
		inOrderSignalMapper.verify(signalMapper).sendStatus(expected);
	}

	@Override
	public void e_sfoo_sooo() {
		occupancyChange(Side.FACING);
	}

	@Override
	public void e_soof_sfof() {
		occupancyChange(Side.FACING);
	}

	@Override
	public void e_sooo_sfoo() {
		occupancyChange(Side.FACING);
	}

	@Override
	public void e_soof_sooo() {
		occupancyChange(Side.DIVERGENT);
	}

	@Override
	public void e_sfoo_sfof() {
		occupancyChange(Side.DIVERGENT);
	}

	@Override
	public void e_sfff_sffo() {
		occupancyChange(Side.DIVERGENT);
	}

	@Override
	public void v_dfof() {
		final SideTriple<NeighborTSMStatus> expected = SideTriple.of(NeighborTSMStatus.ALLOWED,
				NeighborTSMStatus.DENIED, NeighborTSMStatus.ALLOWED);
		inOrderSignalMapper.verify(signalMapper).sendStatus(expected);
	}

	@Override
	public void v_sffo() {
		final SideTriple<NeighborTSMStatus> expected = SideTriple.of(NeighborTSMStatus.ALLOWED,
				NeighborTSMStatus.ALLOWED, NeighborTSMStatus.DENIED);
		inOrderSignalMapper.verify(signalMapper).sendStatus(expected);
	}

	@Override
	public void e_sffo_sofo() {
		occupancyChange(Side.FACING);
	}

	@Override
	public void e_dfoo_sfoo() {
		directionchange();
	}

	@Override
	public void e_sfoo_dfoo() {
		directionchange();
	}

	@Override
	public void e_sfof_soof() {
		occupancyChange(Side.FACING);
	}

	@Override
	public void v_dfoo() {
		final SideTriple<NeighborTSMStatus> expected = SideTriple.of(NeighborTSMStatus.DENIED, NeighborTSMStatus.DENIED,
				NeighborTSMStatus.DENIED);
		inOrderSignalMapper.verify(signalMapper).sendStatus(expected);
	}

	@Override
	public void e_sofo_sooo() {
		occupancyChange(Side.STRAIGHT);
	}

	@Override
	public void v_sfoo() {
		final SideTriple<NeighborTSMStatus> expected = SideTriple.of(NeighborTSMStatus.DENIED, NeighborTSMStatus.DENIED,
				NeighborTSMStatus.DENIED);
		inOrderSignalMapper.verify(signalMapper).sendStatus(expected);
	}

	@Override
	public void e_sfff_sfof() {
		occupancyChange(Side.STRAIGHT);
	}

	@Override
	public void v_sfof() {
		final SideTriple<NeighborTSMStatus> expected = SideTriple.of(NeighborTSMStatus.DENIED, NeighborTSMStatus.DENIED,
				NeighborTSMStatus.ALLOWED);
		inOrderSignalMapper.verify(signalMapper).sendStatus(expected);
	}

	@Override
	public void e_soof_soff() {
		occupancyChange(Side.STRAIGHT);
	}

	@Override
	public void e_sooo_sofo() {
		occupancyChange(Side.STRAIGHT);
	}

	@Override
	public void e_doff_soff() {
		directionchange();
	}

	@Override
	public void e_sfof_sfff() {
		occupancyChange(Side.STRAIGHT);
	}

	@Override
	public void e_sofo_soff() {
		occupancyChange(Side.DIVERGENT);
	}

	@Override
	public void e_init() {

	}

	@Override
	public void e_sfff_dfff() {
		directionchange();
	}

	@Override
	public void v_doff() {
		final SideTriple<NeighborTSMStatus> expected = SideTriple.of(NeighborTSMStatus.DENIED,
				NeighborTSMStatus.ALLOWED, NeighborTSMStatus.DENIED);
		inOrderSignalMapper.verify(signalMapper).sendStatus(expected);
	}

	@Override
	public void e_dooo_sooo() {
		directionchange();
	}

	@Override
	public void e_dffo_sffo() {
		directionchange();
	}

	@Override
	public void e_soof_doof() {
		directionchange();
	}

	@Override
	public void e_sffo_dffo() {
		directionchange();
	}

	@Override
	public void e_sooo_soof() {
		occupancyChange(Side.DIVERGENT);
	}

	@Override
	public void e_dfof_sfof() {
		directionchange();
	}

	@Override
	public void e_sooo_dooo() {
		directionchange();
	}

	@Override
	public void v_dofo() {
		final SideTriple<NeighborTSMStatus> expected = SideTriple.of(NeighborTSMStatus.DENIED,
				NeighborTSMStatus.ALLOWED, NeighborTSMStatus.DENIED);
		inOrderSignalMapper.verify(signalMapper).sendStatus(expected);
	}

	@Override
	public void e_dofo_sofo() {
		directionchange();
	}

	@Override
	public void e_doof_soof() {
		directionchange();
	}

	@Override
	public void e_sffo_sfff() {
		occupancyChange(Side.DIVERGENT);
	}

	@Override
	public void e_soff_doff() {
		directionchange();
	}

	@Override
	public void e_dfff_sfff() {
		directionchange();
	}

	@Override
	public void e_sofo_dofo() {
		directionchange();
	}

	@Override
	public void e_sfoo_sffo() {
		occupancyChange(Side.STRAIGHT);
	}

	@Override
	public void e_dffo_dfoo() {
		occupancyChange(Side.STRAIGHT);
	}

	@Override
	public void e_doof_doff() {
		occupancyChange(Side.STRAIGHT);
	}

	@Override
	public void e_dfof_dfoo() {
		occupancyChange(Side.DIVERGENT);
	}

	@Override
	public void e_dofo_doff() {
		occupancyChange(Side.DIVERGENT);
	}

	@Override
	public void e_dfoo_dooo() {
		occupancyChange(Side.FACING);
	}

	@Override
	public void e_dooo_dfoo() {
		occupancyChange(Side.FACING);
	}

	@Override
	public void e_dffo_dfff() {
		occupancyChange(Side.DIVERGENT);
	}

	@Override
	public void e_dfoo_dfof() {
		occupancyChange(Side.DIVERGENT);
	}

	@Override
	public void e_dfof_dfff() {
		occupancyChange(Side.STRAIGHT);
	}

	@Override
	public void e_dooo_dofo() {
		occupancyChange(Side.STRAIGHT);
	}

	@Override
	public void e_dffo_dofo() {
		occupancyChange(Side.FACING);
	}

	@Override
	public void e_dfof_doof() {
		occupancyChange(Side.FACING);
	}

	@Override
	public void e_dofo_dffo() {
		occupancyChange(Side.FACING);
	}

	@Override
	public void e_doof_dfof() {
		occupancyChange(Side.FACING);
	}

	@Override
	public void e_dooo_doof() {
		occupancyChange(Side.DIVERGENT);
	}

	@Override
	public void e_doff_dofo() {
		occupancyChange(Side.DIVERGENT);
	}

	@Override
	public void e_doof_dooo() {
		occupancyChange(Side.DIVERGENT);
	}

	@Override
	public void e_dfff_dffo() {
		occupancyChange(Side.DIVERGENT);
	}

	@Override
	public void e_doff_doof() {
		occupancyChange(Side.STRAIGHT);
	}

	@Override
	public void e_dofo_dooo() {
		occupancyChange(Side.STRAIGHT);
	}

	@Override
	public void e_dfff_dfof() {
		occupancyChange(Side.STRAIGHT);
	}

	@Override
	public void e_dfoo_dffo() {
		occupancyChange(Side.STRAIGHT);
	}

}
