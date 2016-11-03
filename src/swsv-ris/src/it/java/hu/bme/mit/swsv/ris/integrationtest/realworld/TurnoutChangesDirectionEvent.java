package hu.bme.mit.swsv.ris.integrationtest.realworld;

import hu.bme.mit.swsv.ris.common.Direction;
import hu.bme.mit.swsv.ris.integrationtest.World;

public class TurnoutChangesDirectionEvent extends Event {
	public int id;
	public Direction direction;

	@Override
	public void simulate(final World world) {
		world.simulateTurnoutChangesDirectionEvent(this);
	}
}
