package hu.bme.mit.swsv.ris.tsm.impl;

import hu.bme.mit.swsv.ris.common.NeighborTSMStatus;
import hu.bme.mit.swsv.ris.common.SectionControl;
import hu.bme.mit.swsv.ris.common.SideTriple;

public class MapperForSignalMapper {
	public SideTriple<SectionControl> sectionControlDecision;
	public SideTriple<NeighborTSMStatus> neighborsStatus;

	public void sendControl(final SideTriple<SectionControl> decision) {
		sectionControlDecision = decision;
	}

	public void sendStatus(final SideTriple<NeighborTSMStatus> statusForNeighbors) {
		neighborsStatus = statusForNeighbors;
	}
}
