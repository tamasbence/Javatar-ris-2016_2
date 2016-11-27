package hu.bme.mit.swsv.ris.randoop;

import hu.bme.mit.swsv.ris.common.NeighborTSMStatus;
import hu.bme.mit.swsv.ris.common.SectionControl;
import hu.bme.mit.swsv.ris.common.SideTriple;
import hu.bme.mit.swsv.ris.signals.HeartBeatSignal;
import hu.bme.mit.swsv.ris.signals.SectionOccupancySignal;
import hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal;
import hu.bme.mit.swsv.ris.tsm.SignalMapper;

public class RandoopSignalMapper implements SignalMapper {
	public SectionControl sectionControlDecision_div;
	public SectionControl sectionControlDecision_facing;
	public SectionControl sectionControlDecision_straight;

	public NeighborTSMStatus neighborsStatus_div;
	public NeighborTSMStatus neighborsStatus_facing;
	public NeighborTSMStatus neighborsStatus_straight;

	@Override
	public void sendControl(final SideTriple<SectionControl> decision) {
		sectionControlDecision_div = decision.getDivergent();
		sectionControlDecision_facing = decision.getFacing();
		sectionControlDecision_straight = decision.getStraight();
	}

	@Override
	public void sendStatus(final SideTriple<NeighborTSMStatus> statusForNeighbors) {
		neighborsStatus_div = statusForNeighbors.getDivergent();
		neighborsStatus_facing = statusForNeighbors.getFacing();
		neighborsStatus_straight = statusForNeighbors.getStraight();
	}

	@Override
	public void receiveSectionOccupancy(final SectionOccupancySignal signal) {
	}

	@Override
	public void receiveTurnoutDirection(final TurnoutDirectionSignal signal) {
	}

	@Override
	public void receiveHeartBeat(final HeartBeatSignal signal) {
	}
}
