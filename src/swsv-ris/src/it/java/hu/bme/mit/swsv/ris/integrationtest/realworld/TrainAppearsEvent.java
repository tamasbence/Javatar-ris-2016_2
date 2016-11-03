package hu.bme.mit.swsv.ris.integrationtest.realworld;

import hu.bme.mit.swsv.ris.integrationtest.World;

public class TrainAppearsEvent extends Event {
	public int trainId;
	public int segmentId;

	@Override
	public void simulate(final World world) {
		world.simulateTrainAppearsEvent(this);
	}
}
