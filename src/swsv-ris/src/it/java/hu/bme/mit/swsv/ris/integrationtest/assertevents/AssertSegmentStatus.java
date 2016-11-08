package hu.bme.mit.swsv.ris.integrationtest.assertevents;

import hu.bme.mit.swsv.ris.common.SectionControl;
import hu.bme.mit.swsv.ris.integrationtest.World;

public class AssertSegmentStatus extends Assert {

	public SectionControl expected;
	public int id;

	@Override
	public void simulate(final World world) {
		final SectionControl current = world.getSegmentWithId(id).sectionControl;
		if (expected != current)
			org.junit.Assert.fail("Segment with id " + id + " at time " + time + " is expected in state "
					+ expected.toString() + ", but currently is " + current + ".");
	}
}