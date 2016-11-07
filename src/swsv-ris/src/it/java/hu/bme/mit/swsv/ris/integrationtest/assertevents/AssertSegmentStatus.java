package hu.bme.mit.swsv.ris.integrationtest.assertevents;

import hu.bme.mit.swsv.ris.common.SectionControl;
import hu.bme.mit.swsv.ris.integrationtest.World;

public class AssertSegmentStatus extends Assert {

	public SectionControl expected;
	public int id;

	@Override
	public void simulate(final World world) {
		org.junit.Assert.assertEquals(expected, world.getSegmentWithId(id).sectionControl);
	}

}
