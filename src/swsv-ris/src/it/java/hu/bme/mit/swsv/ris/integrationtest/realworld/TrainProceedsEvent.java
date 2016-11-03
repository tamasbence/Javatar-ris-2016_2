package hu.bme.mit.swsv.ris.integrationtest.realworld;

import hu.bme.mit.swsv.ris.integrationtest.World;

public class TrainProceedsEvent extends Event {
	public int id;

	@Override
	public void simulate(final World world) {
		world.simulateTrainProceedsEvent(this);
	}
}
