package hu.bme.mit.swsv.ris.tsm.test;

import static hu.bme.mit.swsv.ris.common.Constants.HEARTBEAT_PERIOD_MS;
import static hu.bme.mit.swsv.ris.common.Constants.HEARTBEAT_WAIT_NR;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;

import hu.bme.mit.swsv.ris.common.Direction;
import hu.bme.mit.swsv.ris.common.NeighborTSMInfo;
import hu.bme.mit.swsv.ris.common.NeighborTSMStatus;
import hu.bme.mit.swsv.ris.common.SectionControl;
import hu.bme.mit.swsv.ris.common.SectionOccupancy;
import hu.bme.mit.swsv.ris.common.Side;
import hu.bme.mit.swsv.ris.common.SideTriple;
import hu.bme.mit.swsv.ris.common.logging.LoggerWrapper;
import hu.bme.mit.swsv.ris.tsm.SignalMapper;
import hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl;

public class SafetyLogicDistributedDecisionTest {

	SignalMapper signalMapper;
	SafetyLogicImpl safetyLogic;
	Date dateBase;
	Date datePlus1Sec;
	Date datePlus10Sec;

	public SafetyLogicDistributedDecisionTest() {

	}

	public void initDates() {
		final long epoch = 20000;
		dateBase = new Date(epoch);
		datePlus1Sec = new Date(epoch + 1000);
		datePlus10Sec = new Date(epoch + 10000);
	}

	@Before
	public void createSafetyLogicImpl() {
		final SideTriple<SectionOccupancy> sectionOccupancies = SideTriple.of(SectionOccupancy.FREE,
				SectionOccupancy.FREE, SectionOccupancy.FREE);
		final Direction turnoutDirection = Direction.STRAIGHT;
		final SideTriple<NeighborTSMInfo> neighborStatuses = SideTriple.of(
				NeighborTSMInfo.some(NeighborTSMStatus.ALLOWED), NeighborTSMInfo.some(NeighborTSMStatus.ALLOWED),
				NeighborTSMInfo.some(NeighborTSMStatus.ALLOWED));
		safetyLogic = new SafetyLogicImpl(sectionOccupancies, turnoutDirection, neighborStatuses,
				LoggerWrapper.getLogger("testlogger"));
		signalMapper = mock(SignalMapper.class);
		safetyLogic.setSignalMapper(signalMapper);

		dateBase = null;
		datePlus1Sec = null;
		datePlus10Sec = null;
	}

	/**
	 * Test requirement REQ-TSM-03-01-02-01.
	 */
	@Test(timeout = HEARTBEAT_PERIOD_MS * HEARTBEAT_WAIT_NR)
	public void testFacingFacingDecision() {
		initDates();

		safetyLogic.sectionOccupancyChanged(Side.FACING, SectionOccupancy.OCCUPIED);
		safetyLogic.neighborStatusChanged(Side.FACING, dateBase, NeighborTSMStatus.DENIED);

		final InOrder inOrderSignalMapper = inOrder(signalMapper);
		inOrderSignalMapper.verify(signalMapper)
				.sendControl(eq(SideTriple.of(SectionControl.ENABLED, SectionControl.ENABLED, SectionControl.ENABLED)));
		inOrderSignalMapper.verify(signalMapper).sendControl(
				eq(SideTriple.of(SectionControl.DISABLED, SectionControl.ENABLED, SectionControl.ENABLED)));

		verify(signalMapper, times(2)).sendControl(any());
	}

	/**
	 * Test requirement REQ-TSM-03-01-02-02.
	 */
	@Test(timeout = HEARTBEAT_PERIOD_MS * HEARTBEAT_WAIT_NR)
	public void testFacingStraightDecision() {
		initDates();

		safetyLogic.turnoutDirectionChanged(Direction.STRAIGHT);
		safetyLogic.sectionOccupancyChanged(Side.FACING, SectionOccupancy.OCCUPIED);
		safetyLogic.neighborStatusChanged(Side.STRAIGHT, dateBase, NeighborTSMStatus.DENIED);

		final InOrder inOrderSignalMapper = inOrder(signalMapper);
		inOrderSignalMapper.verify(signalMapper)
				.sendControl(eq(SideTriple.of(SectionControl.ENABLED, SectionControl.ENABLED, SectionControl.ENABLED)));
		inOrderSignalMapper.verify(signalMapper).sendControl(
				eq(SideTriple.of(SectionControl.DISABLED, SectionControl.ENABLED, SectionControl.ENABLED)));

		verify(signalMapper, times(2)).sendControl(any());
	}

	/**
	 * Test requirement REQ-TSM-03-01-02-03.
	 */
	@Test(timeout = HEARTBEAT_PERIOD_MS * HEARTBEAT_WAIT_NR)
	public void testFacingDivergentDecision() {
		initDates();
		safetyLogic.turnoutDirectionChanged(Direction.DIVERGENT);
		safetyLogic.sectionOccupancyChanged(Side.FACING, SectionOccupancy.OCCUPIED);

		reset(signalMapper);
		safetyLogic.neighborStatusChanged(Side.DIVERGENT, dateBase, NeighborTSMStatus.DENIED);
		verify(signalMapper).sendControl(
				eq(SideTriple.of(SectionControl.DISABLED, SectionControl.ENABLED, SectionControl.ENABLED)));
	}

}