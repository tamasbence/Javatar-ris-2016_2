package hu.bme.mit.swsv.ris.integrationtest;

import java.net.URLDecoder;

import org.junit.Test;

public class IntegrationTest {

	@Test
	public void Test1_SingleTrain_TrackIsGranted() throws Exception {
		final String trackPath = URLDecoder.decode(IntegrationTest.class.getResource("track_case1.json").getFile(),
				"UTF-8");
		final String eventPath = URLDecoder.decode(IntegrationTest.class.getResource("event_case1.json").getFile(),
				"UTF-8");
		final String assertsPath = URLDecoder.decode(IntegrationTest.class.getResource("assert_case1.json").getFile(),
				"UTF-8");

		final World w = new World(trackPath, eventPath, assertsPath, 1);
		w.simulateWorld();

	}

	@Test
	public void Test2_SingleTrain_TrackNotGranted() throws Exception {
		final String trackPath = URLDecoder.decode(IntegrationTest.class.getResource("track_case2.json").getFile(),
				"UTF-8");
		final String eventPath = URLDecoder.decode(IntegrationTest.class.getResource("event_case2.json").getFile(),
				"UTF-8");
		final String assertsPath = URLDecoder.decode(IntegrationTest.class.getResource("assert_case2.json").getFile(),
				"UTF-8");

		final World w = new World(trackPath, eventPath, assertsPath, 1);
		w.simulateWorld();

	}

	@Test
	public void Test3_TwoTrains_NoMeeting() throws Exception {
		final String trackPath = URLDecoder.decode(IntegrationTest.class.getResource("track_case3.json").getFile(),
				"UTF-8");
		final String eventPath = URLDecoder.decode(IntegrationTest.class.getResource("event_case3.json").getFile(),
				"UTF-8");
		final String assertsPath = URLDecoder.decode(IntegrationTest.class.getResource("assert_case3.json").getFile(),
				"UTF-8");

		final World w = new World(trackPath, eventPath, assertsPath, 1);
		w.simulateWorld();

	}

	@Test
	public void Test4_TwoTrains_Meeting() throws Exception {
		final String trackPath = URLDecoder.decode(IntegrationTest.class.getResource("track_case4.json").getFile(),
				"UTF-8");
		final String eventPath = URLDecoder.decode(IntegrationTest.class.getResource("event_case4.json").getFile(),
				"UTF-8");
		final String assertsPath = URLDecoder.decode(IntegrationTest.class.getResource("assert_case4.json").getFile(),
				"UTF-8");

		final World w = new World(trackPath, eventPath, assertsPath, 1);
		w.simulateWorld();

	}

	@Test
	public void Test5_ThreeTrains_Meeting() throws Exception {
		final String trackPath = URLDecoder.decode(IntegrationTest.class.getResource("track_case5.json").getFile(),
				"UTF-8");
		final String eventPath = URLDecoder.decode(IntegrationTest.class.getResource("event_case5.json").getFile(),
				"UTF-8");
		final String assertsPath = URLDecoder.decode(IntegrationTest.class.getResource("assert_case5.json").getFile(),
				"UTF-8");

		final World w = new World(trackPath, eventPath, assertsPath, 1);
		w.simulateWorld();

	}
}
