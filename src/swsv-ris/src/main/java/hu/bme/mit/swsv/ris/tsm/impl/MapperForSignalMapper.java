package hu.bme.mit.swsv.ris.tsm.impl;

import hu.bme.mit.swsv.ris.common.NeighborTSMStatus;
import hu.bme.mit.swsv.ris.common.SectionControl;
import hu.bme.mit.swsv.ris.common.SideTriple;
import hu.bme.mit.swsv.ris.signals.HeartBeatSignal;
import hu.bme.mit.swsv.ris.signals.SectionOccupancySignal;
import hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal;
import hu.bme.mit.swsv.ris.tsm.SignalMapper;

public class MapperForSignalMapper implements SignalMapper {
	public SideTriple<SectionControl> sectionControlDecision;
	public SideTriple<NeighborTSMStatus> neighborsStatus;

	@Override
	public void sendControl(final SideTriple<SectionControl> decision) {
		sectionControlDecision = decision;
	}

	@Override
	public void sendStatus(final SideTriple<NeighborTSMStatus> statusForNeighbors) {
		neighborsStatus = statusForNeighbors;
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
