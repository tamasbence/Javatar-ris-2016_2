package hu.bme.mit.swsv.ris.integrationtest.realworld;

import hu.bme.mit.swsv.ris.integrationtest.World;

public abstract class Event {
	public EventType type;
	public long time;

	public abstract void simulate(final World world);
}
