package hu.bme.mit.swsv.ris.integrationtest;

import java.net.URLDecoder;

import org.junit.Test;

public class IntegrationTest {
	@Test
	public void TrackOneTest() throws Exception {
		final String trackPath = URLDecoder.decode(IntegrationTest.class.getResource("track1.json").getFile(), "UTF-8");
		final String eventPath = URLDecoder.decode(IntegrationTest.class.getResource("event1.json").getFile(), "UTF-8");

		final World w = new World(trackPath, eventPath, 1);
		w.simulateWorld();

	}
}
