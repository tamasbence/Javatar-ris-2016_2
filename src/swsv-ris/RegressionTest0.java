
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper0 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl1 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper0);
    hu.bme.mit.swsv.ris.common.Direction direction2 = hu.bme.mit.swsv.ris.common.Direction.STRAIGHT;
    safetyLogicImpl1.turnoutDirectionChanged(direction2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl1);
    org.junit.Assert.assertTrue("'" + direction2 + "' != '" + hu.bme.mit.swsv.ris.common.Direction.STRAIGHT + "'", direction2.equals(hu.bme.mit.swsv.ris.common.Direction.STRAIGHT));

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper2 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl3 = randoopSignalMapper2.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper4 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl5 = randoopSignalMapper4.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl6 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper4.sectionControlDecision_facing = sectionControl6;
    randoopSignalMapper2.sectionControlDecision_div = sectionControl6;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus11 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side12 = null;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal13 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(byte)100, (int)'a', neighborTSMStatus11, side12);
    java.lang.String str14 = heartBeatSignal13.toString();
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus15 = heartBeatSignal13.getStatus();
    randoopSignalMapper2.neighborsStatus_straight = neighborTSMStatus15;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper17 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl18 = randoopSignalMapper17.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus19 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper17.neighborsStatus_div = neighborTSMStatus19;
    randoopSignalMapper2.neighborsStatus_div = neighborTSMStatus19;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper22 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl23 = randoopSignalMapper22.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl24 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper22.sectionControlDecision_facing = sectionControl24;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper26 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl27 = randoopSignalMapper26.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl28 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper26.sectionControlDecision_facing = sectionControl28;
    randoopSignalMapper22.sectionControlDecision_straight = sectionControl28;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl33 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    hu.bme.mit.swsv.ris.signals.SectionControlSignal sectionControlSignal34 = new hu.bme.mit.swsv.ris.signals.SectionControlSignal((int)(short)10, 100, sectionControl33);
    randoopSignalMapper22.sectionControlDecision_div = sectionControl33;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper36 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl37 = randoopSignalMapper36.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus38 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper36.neighborsStatus_div = neighborTSMStatus38;
    randoopSignalMapper22.neighborsStatus_div = neighborTSMStatus38;
    randoopSignalMapper2.neighborsStatus_straight = neighborTSMStatus38;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper42 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl43 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper42);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper44 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl45 = randoopSignalMapper44.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus46 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper44.neighborsStatus_div = neighborTSMStatus46;
    safetyLogicImpl43.setSignalMapper((hu.bme.mit.swsv.ris.tsm.SignalMapper)randoopSignalMapper44);
    safetyLogicImpl43.disconnect();
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper52 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl53 = randoopSignalMapper52.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus54 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper52.neighborsStatus_div = neighborTSMStatus54;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus56 = randoopSignalMapper52.neighborsStatus_facing;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus57 = randoopSignalMapper52.neighborsStatus_div;
    hu.bme.mit.swsv.ris.common.Side side58 = hu.bme.mit.swsv.ris.common.Side.STRAIGHT;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal59 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal(10, (int)(short)10, neighborTSMStatus57, side58);
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy61 = hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal62 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(10, sectionOccupancy61);
    java.lang.String str63 = sectionOccupancySignal62.toString();
    java.lang.String str64 = sectionOccupancySignal62.toString();
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy65 = sectionOccupancySignal62.getSectionOccupancy();
    safetyLogicImpl43.sectionOccupancyChanged(side58, sectionOccupancy65);
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal67 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(short)0, (int)(byte)-1, neighborTSMStatus38, side58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl5);
    org.junit.Assert.assertTrue("'" + sectionControl6 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl6.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus11 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus11.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:20 CET 2016)"+ "'", str14.equals("HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:20 CET 2016)"));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus15 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus15.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl18);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus19 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus19.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl23);
    org.junit.Assert.assertTrue("'" + sectionControl24 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl24.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl27);
    org.junit.Assert.assertTrue("'" + sectionControl28 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl28.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    org.junit.Assert.assertTrue("'" + sectionControl33 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl33.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl37);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus38 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus38.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl45);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus46 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus46.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl53);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus54 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus54.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(neighborTSMStatus56);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus57 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus57.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side58 + "' != '" + hu.bme.mit.swsv.ris.common.Side.STRAIGHT + "'", side58.equals(hu.bme.mit.swsv.ris.common.Side.STRAIGHT));
    org.junit.Assert.assertTrue("'" + sectionOccupancy61 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy61.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str63 + "' != '" + "SectionOccupancySignal(sender: 10, occupancy: OCCUPIED)"+ "'", str63.equals("SectionOccupancySignal(sender: 10, occupancy: OCCUPIED)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str64 + "' != '" + "SectionOccupancySignal(sender: 10, occupancy: OCCUPIED)"+ "'", str64.equals("SectionOccupancySignal(sender: 10, occupancy: OCCUPIED)"));
    org.junit.Assert.assertTrue("'" + sectionOccupancy65 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy65.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper0 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl1 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper0);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper2 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl3 = randoopSignalMapper2.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus4 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper2.neighborsStatus_div = neighborTSMStatus4;
    safetyLogicImpl1.setSignalMapper((hu.bme.mit.swsv.ris.tsm.SignalMapper)randoopSignalMapper2);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper7 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl8 = randoopSignalMapper7.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl9 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper7.sectionControlDecision_facing = sectionControl9;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus11 = randoopSignalMapper7.neighborsStatus_facing;
    safetyLogicImpl1.setSignalMapper((hu.bme.mit.swsv.ris.tsm.SignalMapper)randoopSignalMapper7);
    hu.bme.mit.swsv.ris.tsm.SignalMapper signalMapper13 = null;
    safetyLogicImpl1.setSignalMapper(signalMapper13);
    hu.bme.mit.swsv.ris.common.Direction direction17 = hu.bme.mit.swsv.ris.common.Direction.DIVERGENT;
    hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal turnoutDirectionSignal18 = new hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal((int)(short)10, direction17);
    hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal turnoutDirectionSignal19 = new hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal((int)(short)-1, direction17);
    // The following exception was thrown during execution in test generation
    try {
    safetyLogicImpl1.turnoutDirectionChanged(direction17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl3);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus4 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus4.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl8);
    org.junit.Assert.assertTrue("'" + sectionControl9 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl9.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(neighborTSMStatus11);
    org.junit.Assert.assertTrue("'" + direction17 + "' != '" + hu.bme.mit.swsv.ris.common.Direction.DIVERGENT + "'", direction17.equals(hu.bme.mit.swsv.ris.common.Direction.DIVERGENT));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }


    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus4 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side5 = null;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal6 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(byte)100, (int)'a', neighborTSMStatus4, side5);
    java.lang.String str7 = heartBeatSignal6.toString();
    java.lang.String str8 = heartBeatSignal6.toString();
    hu.bme.mit.swsv.ris.common.Side side9 = heartBeatSignal6.getSenderSide();
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus10 = heartBeatSignal6.getStatus();
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper13 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl14 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper13);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper15 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl16 = randoopSignalMapper15.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus17 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper15.neighborsStatus_div = neighborTSMStatus17;
    safetyLogicImpl14.setSignalMapper((hu.bme.mit.swsv.ris.tsm.SignalMapper)randoopSignalMapper15);
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl20 = randoopSignalMapper15.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper21 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl22 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper21);
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl23 = randoopSignalMapper21.sectionControlDecision_div;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper24 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl25 = randoopSignalMapper24.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus26 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper24.neighborsStatus_div = neighborTSMStatus26;
    randoopSignalMapper21.neighborsStatus_straight = neighborTSMStatus26;
    randoopSignalMapper15.neighborsStatus_div = neighborTSMStatus26;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper32 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl33 = randoopSignalMapper32.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper34 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl35 = randoopSignalMapper34.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl36 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper34.sectionControlDecision_facing = sectionControl36;
    randoopSignalMapper32.sectionControlDecision_div = sectionControl36;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus41 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side42 = null;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal43 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(byte)100, (int)'a', neighborTSMStatus41, side42);
    java.lang.String str44 = heartBeatSignal43.toString();
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus45 = heartBeatSignal43.getStatus();
    randoopSignalMapper32.neighborsStatus_straight = neighborTSMStatus45;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper47 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl48 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper47);
    hu.bme.mit.swsv.ris.common.Side side49 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy50 = hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE;
    safetyLogicImpl48.sectionOccupancyChanged(side49, sectionOccupancy50);
    hu.bme.mit.swsv.ris.common.Side side52 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy54 = hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal55 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(10, sectionOccupancy54);
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy56 = sectionOccupancySignal55.getSectionOccupancy();
    safetyLogicImpl48.sectionOccupancyChanged(side52, sectionOccupancy56);
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal58 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)'#', (int)(short)0, neighborTSMStatus45, side52);
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal59 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(byte)1, (int)(byte)100, neighborTSMStatus26, side52);
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal60 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(byte)-1, (int)'4', neighborTSMStatus10, side52);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus4 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus4.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:22 CET 2016)"+ "'", str7.equals("HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:22 CET 2016)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:22 CET 2016)"+ "'", str8.equals("HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:22 CET 2016)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(side9);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus10 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus10.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl16);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus17 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus17.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl25);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus26 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus26.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl35);
    org.junit.Assert.assertTrue("'" + sectionControl36 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl36.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus41 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus41.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:22 CET 2016)"+ "'", str44.equals("HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:22 CET 2016)"));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus45 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus45.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl48);
    org.junit.Assert.assertTrue("'" + side49 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side49.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy50 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy50.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));
    org.junit.Assert.assertTrue("'" + side52 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side52.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy54 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy54.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    org.junit.Assert.assertTrue("'" + sectionOccupancy56 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy56.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper0 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl1 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper0);
    hu.bme.mit.swsv.ris.common.Side side2 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy3 = hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE;
    safetyLogicImpl1.sectionOccupancyChanged(side2, sectionOccupancy3);
    safetyLogicImpl1.disconnect();
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper6 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl7 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper6);
    hu.bme.mit.swsv.ris.common.Side side8 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy9 = hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE;
    safetyLogicImpl7.sectionOccupancyChanged(side8, sectionOccupancy9);
    hu.bme.mit.swsv.ris.common.Side side11 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy13 = hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal14 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(10, sectionOccupancy13);
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy15 = sectionOccupancySignal14.getSectionOccupancy();
    safetyLogicImpl7.sectionOccupancyChanged(side11, sectionOccupancy15);
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus19 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side20 = null;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal21 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(byte)100, (int)'a', neighborTSMStatus19, side20);
    java.lang.Integer i22 = heartBeatSignal21.getTargetId();
    java.util.Date date23 = heartBeatSignal21.getTimestamp();
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper24 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl25 = randoopSignalMapper24.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl26 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper24.sectionControlDecision_facing = sectionControl26;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper28 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl29 = randoopSignalMapper28.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl30 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper28.sectionControlDecision_facing = sectionControl30;
    randoopSignalMapper24.sectionControlDecision_straight = sectionControl30;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl35 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    hu.bme.mit.swsv.ris.signals.SectionControlSignal sectionControlSignal36 = new hu.bme.mit.swsv.ris.signals.SectionControlSignal((int)(short)10, 100, sectionControl35);
    randoopSignalMapper24.sectionControlDecision_div = sectionControl35;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper38 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl39 = randoopSignalMapper38.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus40 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper38.neighborsStatus_div = neighborTSMStatus40;
    randoopSignalMapper24.neighborsStatus_div = neighborTSMStatus40;
    safetyLogicImpl1.neighborStatusChanged(side11, date23, neighborTSMStatus40);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper44 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl45 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper44);
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl46 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper44.sectionControlDecision_straight = sectionControl46;
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl48 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper44);
    safetyLogicImpl1.setSignalMapper((hu.bme.mit.swsv.ris.tsm.SignalMapper)randoopSignalMapper44);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper50 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl51 = randoopSignalMapper50.sectionControlDecision_div;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl52 = randoopSignalMapper50.sectionControlDecision_div;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper55 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl56 = randoopSignalMapper55.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper57 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl58 = randoopSignalMapper57.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl59 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper57.sectionControlDecision_facing = sectionControl59;
    randoopSignalMapper55.sectionControlDecision_div = sectionControl59;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus64 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side65 = null;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal66 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(byte)100, (int)'a', neighborTSMStatus64, side65);
    java.lang.String str67 = heartBeatSignal66.toString();
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus68 = heartBeatSignal66.getStatus();
    randoopSignalMapper55.neighborsStatus_straight = neighborTSMStatus68;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper70 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl71 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper70);
    hu.bme.mit.swsv.ris.common.Side side72 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy73 = hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE;
    safetyLogicImpl71.sectionOccupancyChanged(side72, sectionOccupancy73);
    hu.bme.mit.swsv.ris.common.Side side75 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy77 = hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal78 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(10, sectionOccupancy77);
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy79 = sectionOccupancySignal78.getSectionOccupancy();
    safetyLogicImpl71.sectionOccupancyChanged(side75, sectionOccupancy79);
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal81 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)'#', (int)(short)0, neighborTSMStatus68, side75);
    randoopSignalMapper50.neighborsStatus_div = neighborTSMStatus68;
    randoopSignalMapper44.neighborsStatus_facing = neighborTSMStatus68;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl84 = randoopSignalMapper44.sectionControlDecision_straight;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl1);
    org.junit.Assert.assertTrue("'" + side2 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side2.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy3 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy3.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl7);
    org.junit.Assert.assertTrue("'" + side8 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side8.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy9 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy9.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));
    org.junit.Assert.assertTrue("'" + side11 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side11.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy13 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy13.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    org.junit.Assert.assertTrue("'" + sectionOccupancy15 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy15.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus19 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus19.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + 97+ "'", i22.equals(97));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl25);
    org.junit.Assert.assertTrue("'" + sectionControl26 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl26.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl29);
    org.junit.Assert.assertTrue("'" + sectionControl30 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl30.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    org.junit.Assert.assertTrue("'" + sectionControl35 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl35.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl39);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus40 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus40.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl45);
    org.junit.Assert.assertTrue("'" + sectionControl46 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl46.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl58);
    org.junit.Assert.assertTrue("'" + sectionControl59 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl59.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus64 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus64.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str67 + "' != '" + "HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:24 CET 2016)"+ "'", str67.equals("HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:24 CET 2016)"));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus68 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus68.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl71);
    org.junit.Assert.assertTrue("'" + side72 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side72.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy73 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy73.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));
    org.junit.Assert.assertTrue("'" + side75 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side75.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy77 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy77.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    org.junit.Assert.assertTrue("'" + sectionOccupancy79 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy79.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    org.junit.Assert.assertTrue("'" + sectionControl84 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl84.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper0 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl1 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper0);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper2 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl3 = randoopSignalMapper2.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus4 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper2.neighborsStatus_div = neighborTSMStatus4;
    safetyLogicImpl1.setSignalMapper((hu.bme.mit.swsv.ris.tsm.SignalMapper)randoopSignalMapper2);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper9 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl10 = randoopSignalMapper9.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper11 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl12 = randoopSignalMapper11.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl13 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper11.sectionControlDecision_facing = sectionControl13;
    randoopSignalMapper9.sectionControlDecision_div = sectionControl13;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus18 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side19 = null;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal20 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(byte)100, (int)'a', neighborTSMStatus18, side19);
    java.lang.String str21 = heartBeatSignal20.toString();
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus22 = heartBeatSignal20.getStatus();
    randoopSignalMapper9.neighborsStatus_straight = neighborTSMStatus22;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper24 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl25 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper24);
    hu.bme.mit.swsv.ris.common.Side side26 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy27 = hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE;
    safetyLogicImpl25.sectionOccupancyChanged(side26, sectionOccupancy27);
    hu.bme.mit.swsv.ris.common.Side side29 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy31 = hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal32 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(10, sectionOccupancy31);
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy33 = sectionOccupancySignal32.getSectionOccupancy();
    safetyLogicImpl25.sectionOccupancyChanged(side29, sectionOccupancy33);
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal35 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)'#', (int)(short)0, neighborTSMStatus22, side29);
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy37 = hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal38 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(10, sectionOccupancy37);
    safetyLogicImpl1.sectionOccupancyChanged(side29, sectionOccupancy37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl3);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus4 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus4.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl12);
    org.junit.Assert.assertTrue("'" + sectionControl13 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl13.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus18 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus18.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:25 CET 2016)"+ "'", str21.equals("HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:25 CET 2016)"));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus22 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus22.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl25);
    org.junit.Assert.assertTrue("'" + side26 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side26.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy27 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy27.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));
    org.junit.Assert.assertTrue("'" + side29 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side29.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy31 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy31.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    org.junit.Assert.assertTrue("'" + sectionOccupancy33 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy33.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    org.junit.Assert.assertTrue("'" + sectionOccupancy37 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy37.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper0 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl1 = randoopSignalMapper0.sectionControlDecision_div;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl2 = randoopSignalMapper0.sectionControlDecision_div;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper5 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl6 = randoopSignalMapper5.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper7 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl8 = randoopSignalMapper7.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl9 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper7.sectionControlDecision_facing = sectionControl9;
    randoopSignalMapper5.sectionControlDecision_div = sectionControl9;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus14 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side15 = null;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal16 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(byte)100, (int)'a', neighborTSMStatus14, side15);
    java.lang.String str17 = heartBeatSignal16.toString();
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus18 = heartBeatSignal16.getStatus();
    randoopSignalMapper5.neighborsStatus_straight = neighborTSMStatus18;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper20 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl21 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper20);
    hu.bme.mit.swsv.ris.common.Side side22 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy23 = hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE;
    safetyLogicImpl21.sectionOccupancyChanged(side22, sectionOccupancy23);
    hu.bme.mit.swsv.ris.common.Side side25 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy27 = hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal28 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(10, sectionOccupancy27);
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy29 = sectionOccupancySignal28.getSectionOccupancy();
    safetyLogicImpl21.sectionOccupancyChanged(side25, sectionOccupancy29);
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal31 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)'#', (int)(short)0, neighborTSMStatus18, side25);
    randoopSignalMapper0.neighborsStatus_div = neighborTSMStatus18;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl33 = randoopSignalMapper0.sectionControlDecision_div;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl8);
    org.junit.Assert.assertTrue("'" + sectionControl9 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl9.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus14 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus14.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:26 CET 2016)"+ "'", str17.equals("HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:26 CET 2016)"));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus18 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus18.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl21);
    org.junit.Assert.assertTrue("'" + side22 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side22.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy23 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy23.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));
    org.junit.Assert.assertTrue("'" + side25 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side25.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy27 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy27.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    org.junit.Assert.assertTrue("'" + sectionOccupancy29 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy29.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl33);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper2 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl3 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper2);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper4 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl5 = randoopSignalMapper4.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus6 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper4.neighborsStatus_div = neighborTSMStatus6;
    safetyLogicImpl3.setSignalMapper((hu.bme.mit.swsv.ris.tsm.SignalMapper)randoopSignalMapper4);
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl9 = randoopSignalMapper4.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper10 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl11 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper10);
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl12 = randoopSignalMapper10.sectionControlDecision_div;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper13 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl14 = randoopSignalMapper13.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus15 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper13.neighborsStatus_div = neighborTSMStatus15;
    randoopSignalMapper10.neighborsStatus_straight = neighborTSMStatus15;
    randoopSignalMapper4.neighborsStatus_div = neighborTSMStatus15;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper21 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl22 = randoopSignalMapper21.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper23 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl24 = randoopSignalMapper23.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl25 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper23.sectionControlDecision_facing = sectionControl25;
    randoopSignalMapper21.sectionControlDecision_div = sectionControl25;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus30 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side31 = null;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal32 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(byte)100, (int)'a', neighborTSMStatus30, side31);
    java.lang.String str33 = heartBeatSignal32.toString();
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus34 = heartBeatSignal32.getStatus();
    randoopSignalMapper21.neighborsStatus_straight = neighborTSMStatus34;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper36 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl37 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper36);
    hu.bme.mit.swsv.ris.common.Side side38 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy39 = hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE;
    safetyLogicImpl37.sectionOccupancyChanged(side38, sectionOccupancy39);
    hu.bme.mit.swsv.ris.common.Side side41 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy43 = hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal44 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(10, sectionOccupancy43);
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy45 = sectionOccupancySignal44.getSectionOccupancy();
    safetyLogicImpl37.sectionOccupancyChanged(side41, sectionOccupancy45);
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal47 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)'#', (int)(short)0, neighborTSMStatus34, side41);
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal48 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(byte)1, (int)(byte)100, neighborTSMStatus15, side41);
    java.util.Date date49 = heartBeatSignal48.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl5);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus6 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus6.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl14);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus15 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus15.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl24);
    org.junit.Assert.assertTrue("'" + sectionControl25 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl25.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus30 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus30.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:28 CET 2016)"+ "'", str33.equals("HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:28 CET 2016)"));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus34 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus34.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl37);
    org.junit.Assert.assertTrue("'" + side38 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side38.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy39 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy39.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));
    org.junit.Assert.assertTrue("'" + side41 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side41.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy43 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy43.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    org.junit.Assert.assertTrue("'" + sectionOccupancy45 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy45.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date49);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper0 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl1 = randoopSignalMapper0.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus2 = randoopSignalMapper0.neighborsStatus_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl3 = randoopSignalMapper0.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl4 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper0);
    safetyLogicImpl4.disconnect();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(neighborTSMStatus2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl4);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper0 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl1 = randoopSignalMapper0.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus2 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper0.neighborsStatus_div = neighborTSMStatus2;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper4 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl5 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper4);
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl6 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper4.sectionControlDecision_straight = sectionControl6;
    randoopSignalMapper0.sectionControlDecision_div = sectionControl6;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus9 = randoopSignalMapper0.neighborsStatus_div;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper12 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl13 = randoopSignalMapper12.sectionControlDecision_facing;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl14 = randoopSignalMapper12.sectionControlDecision_div;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper15 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl16 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper15);
    hu.bme.mit.swsv.ris.common.Side side17 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy18 = hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE;
    safetyLogicImpl16.sectionOccupancyChanged(side17, sectionOccupancy18);
    safetyLogicImpl16.disconnect();
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper21 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl22 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper21);
    hu.bme.mit.swsv.ris.common.Side side23 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy24 = hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE;
    safetyLogicImpl22.sectionOccupancyChanged(side23, sectionOccupancy24);
    hu.bme.mit.swsv.ris.common.Side side26 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy28 = hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal29 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(10, sectionOccupancy28);
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy30 = sectionOccupancySignal29.getSectionOccupancy();
    safetyLogicImpl22.sectionOccupancyChanged(side26, sectionOccupancy30);
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus34 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side35 = null;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal36 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(byte)100, (int)'a', neighborTSMStatus34, side35);
    java.lang.Integer i37 = heartBeatSignal36.getTargetId();
    java.util.Date date38 = heartBeatSignal36.getTimestamp();
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper39 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl40 = randoopSignalMapper39.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl41 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper39.sectionControlDecision_facing = sectionControl41;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper43 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl44 = randoopSignalMapper43.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl45 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper43.sectionControlDecision_facing = sectionControl45;
    randoopSignalMapper39.sectionControlDecision_straight = sectionControl45;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl50 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    hu.bme.mit.swsv.ris.signals.SectionControlSignal sectionControlSignal51 = new hu.bme.mit.swsv.ris.signals.SectionControlSignal((int)(short)10, 100, sectionControl50);
    randoopSignalMapper39.sectionControlDecision_div = sectionControl50;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper53 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl54 = randoopSignalMapper53.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus55 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper53.neighborsStatus_div = neighborTSMStatus55;
    randoopSignalMapper39.neighborsStatus_div = neighborTSMStatus55;
    safetyLogicImpl16.neighborStatusChanged(side26, date38, neighborTSMStatus55);
    randoopSignalMapper12.neighborsStatus_straight = neighborTSMStatus55;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper60 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl61 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper60);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper62 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl63 = randoopSignalMapper62.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus64 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper62.neighborsStatus_div = neighborTSMStatus64;
    safetyLogicImpl61.setSignalMapper((hu.bme.mit.swsv.ris.tsm.SignalMapper)randoopSignalMapper62);
    safetyLogicImpl61.disconnect();
    hu.bme.mit.swsv.ris.common.Side side68 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper69 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl70 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper69);
    hu.bme.mit.swsv.ris.common.Side side71 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy72 = hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE;
    safetyLogicImpl70.sectionOccupancyChanged(side71, sectionOccupancy72);
    hu.bme.mit.swsv.ris.common.Side side74 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy76 = hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal77 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(10, sectionOccupancy76);
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy78 = sectionOccupancySignal77.getSectionOccupancy();
    safetyLogicImpl70.sectionOccupancyChanged(side74, sectionOccupancy78);
    safetyLogicImpl61.sectionOccupancyChanged(side68, sectionOccupancy78);
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal81 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)'#', (int)'#', neighborTSMStatus55, side68);
    randoopSignalMapper0.neighborsStatus_div = neighborTSMStatus55;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper83 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl84 = randoopSignalMapper83.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl85 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper83.sectionControlDecision_facing = sectionControl85;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl87 = randoopSignalMapper83.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper88 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl89 = randoopSignalMapper88.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus90 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper88.neighborsStatus_div = neighborTSMStatus90;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper92 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl93 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper92);
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl94 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper92.sectionControlDecision_straight = sectionControl94;
    randoopSignalMapper88.sectionControlDecision_div = sectionControl94;
    randoopSignalMapper83.sectionControlDecision_straight = sectionControl94;
    randoopSignalMapper0.sectionControlDecision_div = sectionControl94;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl1);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus2 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus2.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl5);
    org.junit.Assert.assertTrue("'" + sectionControl6 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl6.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus9 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus9.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl16);
    org.junit.Assert.assertTrue("'" + side17 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side17.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy18 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy18.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl22);
    org.junit.Assert.assertTrue("'" + side23 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side23.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy24 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy24.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));
    org.junit.Assert.assertTrue("'" + side26 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side26.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy28 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy28.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    org.junit.Assert.assertTrue("'" + sectionOccupancy30 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy30.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus34 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus34.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + 97+ "'", i37.equals(97));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl40);
    org.junit.Assert.assertTrue("'" + sectionControl41 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl41.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl44);
    org.junit.Assert.assertTrue("'" + sectionControl45 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl45.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    org.junit.Assert.assertTrue("'" + sectionControl50 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl50.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl54);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus55 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus55.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl63);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus64 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus64.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side68 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side68.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl70);
    org.junit.Assert.assertTrue("'" + side71 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side71.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy72 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy72.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));
    org.junit.Assert.assertTrue("'" + side74 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side74.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy76 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy76.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    org.junit.Assert.assertTrue("'" + sectionOccupancy78 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy78.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl84);
    org.junit.Assert.assertTrue("'" + sectionControl85 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl85.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl89);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus90 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus90.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl93);
    org.junit.Assert.assertTrue("'" + sectionControl94 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl94.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper1 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl2 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper1);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper3 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl4 = randoopSignalMapper3.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus5 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper3.neighborsStatus_div = neighborTSMStatus5;
    safetyLogicImpl2.setSignalMapper((hu.bme.mit.swsv.ris.tsm.SignalMapper)randoopSignalMapper3);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper8 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl9 = randoopSignalMapper8.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl10 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper8.sectionControlDecision_facing = sectionControl10;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus12 = randoopSignalMapper8.neighborsStatus_facing;
    safetyLogicImpl2.setSignalMapper((hu.bme.mit.swsv.ris.tsm.SignalMapper)randoopSignalMapper8);
    hu.bme.mit.swsv.ris.common.Direction direction15 = hu.bme.mit.swsv.ris.common.Direction.DIVERGENT;
    hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal turnoutDirectionSignal16 = new hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal((int)(short)10, direction15);
    safetyLogicImpl2.turnoutDirectionChanged(direction15);
    hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal turnoutDirectionSignal18 = new hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal((int)(byte)0, direction15);
    java.lang.Integer i19 = turnoutDirectionSignal18.getSenderId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl4);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus5 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus5.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl9);
    org.junit.Assert.assertTrue("'" + sectionControl10 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl10.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(neighborTSMStatus12);
    org.junit.Assert.assertTrue("'" + direction15 + "' != '" + hu.bme.mit.swsv.ris.common.Direction.DIVERGENT + "'", direction15.equals(hu.bme.mit.swsv.ris.common.Direction.DIVERGENT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 0+ "'", i19.equals(0));

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper1 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl2 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper1);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper3 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl4 = randoopSignalMapper3.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus5 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper3.neighborsStatus_div = neighborTSMStatus5;
    safetyLogicImpl2.setSignalMapper((hu.bme.mit.swsv.ris.tsm.SignalMapper)randoopSignalMapper3);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper8 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl9 = randoopSignalMapper8.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl10 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper8.sectionControlDecision_facing = sectionControl10;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus12 = randoopSignalMapper8.neighborsStatus_facing;
    safetyLogicImpl2.setSignalMapper((hu.bme.mit.swsv.ris.tsm.SignalMapper)randoopSignalMapper8);
    hu.bme.mit.swsv.ris.common.Direction direction15 = hu.bme.mit.swsv.ris.common.Direction.DIVERGENT;
    hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal turnoutDirectionSignal16 = new hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal((int)(short)10, direction15);
    safetyLogicImpl2.turnoutDirectionChanged(direction15);
    hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal turnoutDirectionSignal18 = new hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal((int)(byte)0, direction15);
    java.lang.String str19 = turnoutDirectionSignal18.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl4);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus5 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus5.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl9);
    org.junit.Assert.assertTrue("'" + sectionControl10 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl10.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(neighborTSMStatus12);
    org.junit.Assert.assertTrue("'" + direction15 + "' != '" + hu.bme.mit.swsv.ris.common.Direction.DIVERGENT + "'", direction15.equals(hu.bme.mit.swsv.ris.common.Direction.DIVERGENT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "TurnoutDirectionSignal(sender: 0, direction: DIVERGENT)"+ "'", str19.equals("TurnoutDirectionSignal(sender: 0, direction: DIVERGENT)"));

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper0 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl1 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper0);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper2 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl3 = randoopSignalMapper2.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus4 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper2.neighborsStatus_div = neighborTSMStatus4;
    safetyLogicImpl1.setSignalMapper((hu.bme.mit.swsv.ris.tsm.SignalMapper)randoopSignalMapper2);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper7 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl8 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper7);
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl9 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper7.sectionControlDecision_div = sectionControl9;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl11 = randoopSignalMapper7.sectionControlDecision_facing;
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl12 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper7);
    hu.bme.mit.swsv.ris.common.Direction direction15 = hu.bme.mit.swsv.ris.common.Direction.DIVERGENT;
    hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal turnoutDirectionSignal16 = new hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal((int)(short)10, direction15);
    hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal turnoutDirectionSignal17 = new hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal((int)(short)-1, direction15);
    safetyLogicImpl12.turnoutDirectionChanged(direction15);
    safetyLogicImpl1.turnoutDirectionChanged(direction15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl3);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus4 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus4.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl8);
    org.junit.Assert.assertTrue("'" + sectionControl9 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl9.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl12);
    org.junit.Assert.assertTrue("'" + direction15 + "' != '" + hu.bme.mit.swsv.ris.common.Direction.DIVERGENT + "'", direction15.equals(hu.bme.mit.swsv.ris.common.Direction.DIVERGENT));

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper0 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl1 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper0);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper2 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl3 = randoopSignalMapper2.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus4 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper2.neighborsStatus_div = neighborTSMStatus4;
    safetyLogicImpl1.setSignalMapper((hu.bme.mit.swsv.ris.tsm.SignalMapper)randoopSignalMapper2);
    safetyLogicImpl1.disconnect();
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper10 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl11 = randoopSignalMapper10.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus12 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper10.neighborsStatus_div = neighborTSMStatus12;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus14 = randoopSignalMapper10.neighborsStatus_facing;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus15 = randoopSignalMapper10.neighborsStatus_div;
    hu.bme.mit.swsv.ris.common.Side side16 = hu.bme.mit.swsv.ris.common.Side.STRAIGHT;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal17 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal(10, (int)(short)10, neighborTSMStatus15, side16);
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy19 = hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal20 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(10, sectionOccupancy19);
    java.lang.String str21 = sectionOccupancySignal20.toString();
    java.lang.String str22 = sectionOccupancySignal20.toString();
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy23 = sectionOccupancySignal20.getSectionOccupancy();
    safetyLogicImpl1.sectionOccupancyChanged(side16, sectionOccupancy23);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper27 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl28 = randoopSignalMapper27.sectionControlDecision_div;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus31 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side32 = null;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal33 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(byte)100, (int)'a', neighborTSMStatus31, side32);
    java.lang.String str34 = heartBeatSignal33.toString();
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus35 = heartBeatSignal33.getStatus();
    randoopSignalMapper27.neighborsStatus_facing = neighborTSMStatus35;
    hu.bme.mit.swsv.ris.common.Side side37 = hu.bme.mit.swsv.ris.common.Side.STRAIGHT;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal38 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)' ', (int)(short)0, neighborTSMStatus35, side37);
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy39 = null;
    // The following exception was thrown during execution in test generation
    try {
    safetyLogicImpl1.sectionOccupancyChanged(side37, sectionOccupancy39);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl3);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus4 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus4.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl11);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus12 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus12.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(neighborTSMStatus14);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus15 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus15.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side16 + "' != '" + hu.bme.mit.swsv.ris.common.Side.STRAIGHT + "'", side16.equals(hu.bme.mit.swsv.ris.common.Side.STRAIGHT));
    org.junit.Assert.assertTrue("'" + sectionOccupancy19 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy19.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "SectionOccupancySignal(sender: 10, occupancy: OCCUPIED)"+ "'", str21.equals("SectionOccupancySignal(sender: 10, occupancy: OCCUPIED)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "SectionOccupancySignal(sender: 10, occupancy: OCCUPIED)"+ "'", str22.equals("SectionOccupancySignal(sender: 10, occupancy: OCCUPIED)"));
    org.junit.Assert.assertTrue("'" + sectionOccupancy23 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy23.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl28);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus31 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus31.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:32 CET 2016)"+ "'", str34.equals("HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:32 CET 2016)"));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus35 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus35.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side37 + "' != '" + hu.bme.mit.swsv.ris.common.Side.STRAIGHT + "'", side37.equals(hu.bme.mit.swsv.ris.common.Side.STRAIGHT));

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper0 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl1 = randoopSignalMapper0.sectionControlDecision_div;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl2 = randoopSignalMapper0.sectionControlDecision_div;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper5 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl6 = randoopSignalMapper5.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper7 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl8 = randoopSignalMapper7.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl9 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper7.sectionControlDecision_facing = sectionControl9;
    randoopSignalMapper5.sectionControlDecision_div = sectionControl9;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus14 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side15 = null;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal16 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(byte)100, (int)'a', neighborTSMStatus14, side15);
    java.lang.String str17 = heartBeatSignal16.toString();
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus18 = heartBeatSignal16.getStatus();
    randoopSignalMapper5.neighborsStatus_straight = neighborTSMStatus18;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper20 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl21 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper20);
    hu.bme.mit.swsv.ris.common.Side side22 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy23 = hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE;
    safetyLogicImpl21.sectionOccupancyChanged(side22, sectionOccupancy23);
    hu.bme.mit.swsv.ris.common.Side side25 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy27 = hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal28 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(10, sectionOccupancy27);
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy29 = sectionOccupancySignal28.getSectionOccupancy();
    safetyLogicImpl21.sectionOccupancyChanged(side25, sectionOccupancy29);
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal31 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)'#', (int)(short)0, neighborTSMStatus18, side25);
    randoopSignalMapper0.neighborsStatus_div = neighborTSMStatus18;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus33 = randoopSignalMapper0.neighborsStatus_straight;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl8);
    org.junit.Assert.assertTrue("'" + sectionControl9 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl9.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus14 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus14.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:32 CET 2016)"+ "'", str17.equals("HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:32 CET 2016)"));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus18 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus18.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl21);
    org.junit.Assert.assertTrue("'" + side22 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side22.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy23 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy23.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));
    org.junit.Assert.assertTrue("'" + side25 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side25.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy27 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy27.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    org.junit.Assert.assertTrue("'" + sectionOccupancy29 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy29.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(neighborTSMStatus33);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper0 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl1 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper0);
    hu.bme.mit.swsv.ris.common.Side side2 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy3 = hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE;
    safetyLogicImpl1.sectionOccupancyChanged(side2, sectionOccupancy3);
    safetyLogicImpl1.disconnect();
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper6 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl7 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper6);
    hu.bme.mit.swsv.ris.common.Side side8 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy9 = hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE;
    safetyLogicImpl7.sectionOccupancyChanged(side8, sectionOccupancy9);
    hu.bme.mit.swsv.ris.common.Side side11 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy13 = hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal14 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(10, sectionOccupancy13);
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy15 = sectionOccupancySignal14.getSectionOccupancy();
    safetyLogicImpl7.sectionOccupancyChanged(side11, sectionOccupancy15);
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus19 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side20 = null;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal21 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(byte)100, (int)'a', neighborTSMStatus19, side20);
    java.lang.Integer i22 = heartBeatSignal21.getTargetId();
    java.util.Date date23 = heartBeatSignal21.getTimestamp();
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper24 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl25 = randoopSignalMapper24.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl26 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper24.sectionControlDecision_facing = sectionControl26;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper28 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl29 = randoopSignalMapper28.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl30 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper28.sectionControlDecision_facing = sectionControl30;
    randoopSignalMapper24.sectionControlDecision_straight = sectionControl30;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl35 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    hu.bme.mit.swsv.ris.signals.SectionControlSignal sectionControlSignal36 = new hu.bme.mit.swsv.ris.signals.SectionControlSignal((int)(short)10, 100, sectionControl35);
    randoopSignalMapper24.sectionControlDecision_div = sectionControl35;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper38 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl39 = randoopSignalMapper38.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus40 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper38.neighborsStatus_div = neighborTSMStatus40;
    randoopSignalMapper24.neighborsStatus_div = neighborTSMStatus40;
    safetyLogicImpl1.neighborStatusChanged(side11, date23, neighborTSMStatus40);
    hu.bme.mit.swsv.ris.common.Side side44 = hu.bme.mit.swsv.ris.common.Side.STRAIGHT;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper45 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl46 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper45);
    hu.bme.mit.swsv.ris.common.Side side47 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy48 = hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE;
    safetyLogicImpl46.sectionOccupancyChanged(side47, sectionOccupancy48);
    safetyLogicImpl46.disconnect();
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper51 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl52 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper51);
    hu.bme.mit.swsv.ris.common.Side side53 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy54 = hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE;
    safetyLogicImpl52.sectionOccupancyChanged(side53, sectionOccupancy54);
    hu.bme.mit.swsv.ris.common.Side side56 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy58 = hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal59 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(10, sectionOccupancy58);
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy60 = sectionOccupancySignal59.getSectionOccupancy();
    safetyLogicImpl52.sectionOccupancyChanged(side56, sectionOccupancy60);
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus64 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side65 = null;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal66 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(byte)100, (int)'a', neighborTSMStatus64, side65);
    java.lang.Integer i67 = heartBeatSignal66.getTargetId();
    java.util.Date date68 = heartBeatSignal66.getTimestamp();
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper69 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl70 = randoopSignalMapper69.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl71 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper69.sectionControlDecision_facing = sectionControl71;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper73 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl74 = randoopSignalMapper73.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl75 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper73.sectionControlDecision_facing = sectionControl75;
    randoopSignalMapper69.sectionControlDecision_straight = sectionControl75;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl80 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    hu.bme.mit.swsv.ris.signals.SectionControlSignal sectionControlSignal81 = new hu.bme.mit.swsv.ris.signals.SectionControlSignal((int)(short)10, 100, sectionControl80);
    randoopSignalMapper69.sectionControlDecision_div = sectionControl80;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper83 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl84 = randoopSignalMapper83.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus85 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper83.neighborsStatus_div = neighborTSMStatus85;
    randoopSignalMapper69.neighborsStatus_div = neighborTSMStatus85;
    safetyLogicImpl46.neighborStatusChanged(side56, date68, neighborTSMStatus85);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper91 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl92 = randoopSignalMapper91.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus93 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper91.neighborsStatus_div = neighborTSMStatus93;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus95 = randoopSignalMapper91.neighborsStatus_facing;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus96 = randoopSignalMapper91.neighborsStatus_div;
    hu.bme.mit.swsv.ris.common.Side side97 = hu.bme.mit.swsv.ris.common.Side.STRAIGHT;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal98 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal(10, (int)(short)10, neighborTSMStatus96, side97);
    safetyLogicImpl1.neighborStatusChanged(side44, date68, neighborTSMStatus96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl1);
    org.junit.Assert.assertTrue("'" + side2 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side2.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy3 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy3.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl7);
    org.junit.Assert.assertTrue("'" + side8 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side8.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy9 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy9.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));
    org.junit.Assert.assertTrue("'" + side11 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side11.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy13 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy13.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    org.junit.Assert.assertTrue("'" + sectionOccupancy15 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy15.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus19 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus19.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + 97+ "'", i22.equals(97));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl25);
    org.junit.Assert.assertTrue("'" + sectionControl26 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl26.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl29);
    org.junit.Assert.assertTrue("'" + sectionControl30 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl30.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    org.junit.Assert.assertTrue("'" + sectionControl35 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl35.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl39);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus40 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus40.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side44 + "' != '" + hu.bme.mit.swsv.ris.common.Side.STRAIGHT + "'", side44.equals(hu.bme.mit.swsv.ris.common.Side.STRAIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl46);
    org.junit.Assert.assertTrue("'" + side47 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side47.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy48 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy48.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl52);
    org.junit.Assert.assertTrue("'" + side53 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side53.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy54 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy54.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));
    org.junit.Assert.assertTrue("'" + side56 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side56.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy58 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy58.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    org.junit.Assert.assertTrue("'" + sectionOccupancy60 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy60.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus64 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus64.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i67 + "' != '" + 97+ "'", i67.equals(97));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl70);
    org.junit.Assert.assertTrue("'" + sectionControl71 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl71.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl74);
    org.junit.Assert.assertTrue("'" + sectionControl75 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl75.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    org.junit.Assert.assertTrue("'" + sectionControl80 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl80.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl84);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus85 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus85.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl92);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus93 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus93.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(neighborTSMStatus95);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus96 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus96.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side97 + "' != '" + hu.bme.mit.swsv.ris.common.Side.STRAIGHT + "'", side97.equals(hu.bme.mit.swsv.ris.common.Side.STRAIGHT));

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper0 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl1 = randoopSignalMapper0.sectionControlDecision_div;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus4 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side5 = null;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal6 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(byte)100, (int)'a', neighborTSMStatus4, side5);
    java.lang.String str7 = heartBeatSignal6.toString();
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus8 = heartBeatSignal6.getStatus();
    randoopSignalMapper0.neighborsStatus_facing = neighborTSMStatus8;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl10 = randoopSignalMapper0.sectionControlDecision_div;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper11 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl12 = randoopSignalMapper11.sectionControlDecision_div;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl13 = randoopSignalMapper11.sectionControlDecision_div;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper16 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl17 = randoopSignalMapper16.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper18 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl19 = randoopSignalMapper18.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl20 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper18.sectionControlDecision_facing = sectionControl20;
    randoopSignalMapper16.sectionControlDecision_div = sectionControl20;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus25 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side26 = null;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal27 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(byte)100, (int)'a', neighborTSMStatus25, side26);
    java.lang.String str28 = heartBeatSignal27.toString();
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus29 = heartBeatSignal27.getStatus();
    randoopSignalMapper16.neighborsStatus_straight = neighborTSMStatus29;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper31 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl32 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper31);
    hu.bme.mit.swsv.ris.common.Side side33 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy34 = hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE;
    safetyLogicImpl32.sectionOccupancyChanged(side33, sectionOccupancy34);
    hu.bme.mit.swsv.ris.common.Side side36 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy38 = hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal39 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(10, sectionOccupancy38);
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy40 = sectionOccupancySignal39.getSectionOccupancy();
    safetyLogicImpl32.sectionOccupancyChanged(side36, sectionOccupancy40);
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal42 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)'#', (int)(short)0, neighborTSMStatus29, side36);
    randoopSignalMapper11.neighborsStatus_div = neighborTSMStatus29;
    randoopSignalMapper0.neighborsStatus_div = neighborTSMStatus29;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl1);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus4 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus4.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:34 CET 2016)"+ "'", str7.equals("HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:34 CET 2016)"));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus8 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus8.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl19);
    org.junit.Assert.assertTrue("'" + sectionControl20 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl20.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus25 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus25.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:34 CET 2016)"+ "'", str28.equals("HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:34 CET 2016)"));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus29 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus29.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl32);
    org.junit.Assert.assertTrue("'" + side33 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side33.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy34 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy34.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));
    org.junit.Assert.assertTrue("'" + side36 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side36.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy38 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy38.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    org.junit.Assert.assertTrue("'" + sectionOccupancy40 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy40.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper1 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl2 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper1);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper3 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl4 = randoopSignalMapper3.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus5 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper3.neighborsStatus_div = neighborTSMStatus5;
    safetyLogicImpl2.setSignalMapper((hu.bme.mit.swsv.ris.tsm.SignalMapper)randoopSignalMapper3);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper8 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl9 = randoopSignalMapper8.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl10 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper8.sectionControlDecision_facing = sectionControl10;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus12 = randoopSignalMapper8.neighborsStatus_facing;
    safetyLogicImpl2.setSignalMapper((hu.bme.mit.swsv.ris.tsm.SignalMapper)randoopSignalMapper8);
    hu.bme.mit.swsv.ris.common.Direction direction15 = hu.bme.mit.swsv.ris.common.Direction.DIVERGENT;
    hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal turnoutDirectionSignal16 = new hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal((int)(short)10, direction15);
    safetyLogicImpl2.turnoutDirectionChanged(direction15);
    hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal turnoutDirectionSignal18 = new hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal((int)(byte)0, direction15);
    hu.bme.mit.swsv.ris.common.Direction direction19 = turnoutDirectionSignal18.getTurnoutDirection();
    java.lang.String str20 = turnoutDirectionSignal18.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl4);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus5 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus5.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl9);
    org.junit.Assert.assertTrue("'" + sectionControl10 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl10.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(neighborTSMStatus12);
    org.junit.Assert.assertTrue("'" + direction15 + "' != '" + hu.bme.mit.swsv.ris.common.Direction.DIVERGENT + "'", direction15.equals(hu.bme.mit.swsv.ris.common.Direction.DIVERGENT));
    org.junit.Assert.assertTrue("'" + direction19 + "' != '" + hu.bme.mit.swsv.ris.common.Direction.DIVERGENT + "'", direction19.equals(hu.bme.mit.swsv.ris.common.Direction.DIVERGENT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "TurnoutDirectionSignal(sender: 0, direction: DIVERGENT)"+ "'", str20.equals("TurnoutDirectionSignal(sender: 0, direction: DIVERGENT)"));

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper0 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl1 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper0);
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl2 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper0.sectionControlDecision_div = sectionControl2;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl4 = randoopSignalMapper0.sectionControlDecision_facing;
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl5 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper0);
    hu.bme.mit.swsv.ris.common.Direction direction8 = hu.bme.mit.swsv.ris.common.Direction.DIVERGENT;
    hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal turnoutDirectionSignal9 = new hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal((int)(short)10, direction8);
    hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal turnoutDirectionSignal10 = new hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal((int)(short)-1, direction8);
    safetyLogicImpl5.turnoutDirectionChanged(direction8);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper12 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl13 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper12);
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl14 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper12.sectionControlDecision_div = sectionControl14;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl16 = randoopSignalMapper12.sectionControlDecision_facing;
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl17 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper12);
    hu.bme.mit.swsv.ris.common.Direction direction20 = hu.bme.mit.swsv.ris.common.Direction.DIVERGENT;
    hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal turnoutDirectionSignal21 = new hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal((int)(short)10, direction20);
    hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal turnoutDirectionSignal22 = new hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal((int)(short)-1, direction20);
    safetyLogicImpl17.turnoutDirectionChanged(direction20);
    hu.bme.mit.swsv.ris.common.Side side24 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus27 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side28 = null;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal29 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(byte)100, (int)'a', neighborTSMStatus27, side28);
    java.lang.Integer i30 = heartBeatSignal29.getTargetId();
    java.util.Date date31 = heartBeatSignal29.getTimestamp();
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper32 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl33 = randoopSignalMapper32.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl34 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper32.sectionControlDecision_facing = sectionControl34;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper36 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl37 = randoopSignalMapper36.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl38 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper36.sectionControlDecision_facing = sectionControl38;
    randoopSignalMapper32.sectionControlDecision_straight = sectionControl38;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl43 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    hu.bme.mit.swsv.ris.signals.SectionControlSignal sectionControlSignal44 = new hu.bme.mit.swsv.ris.signals.SectionControlSignal((int)(short)10, 100, sectionControl43);
    randoopSignalMapper32.sectionControlDecision_div = sectionControl43;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper46 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl47 = randoopSignalMapper46.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus48 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper46.neighborsStatus_div = neighborTSMStatus48;
    randoopSignalMapper32.neighborsStatus_div = neighborTSMStatus48;
    safetyLogicImpl17.neighborStatusChanged(side24, date31, neighborTSMStatus48);
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy52 = null;
    // The following exception was thrown during execution in test generation
    try {
    safetyLogicImpl5.sectionOccupancyChanged(side24, sectionOccupancy52);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl1);
    org.junit.Assert.assertTrue("'" + sectionControl2 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl2.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl5);
    org.junit.Assert.assertTrue("'" + direction8 + "' != '" + hu.bme.mit.swsv.ris.common.Direction.DIVERGENT + "'", direction8.equals(hu.bme.mit.swsv.ris.common.Direction.DIVERGENT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl13);
    org.junit.Assert.assertTrue("'" + sectionControl14 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl14.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl17);
    org.junit.Assert.assertTrue("'" + direction20 + "' != '" + hu.bme.mit.swsv.ris.common.Direction.DIVERGENT + "'", direction20.equals(hu.bme.mit.swsv.ris.common.Direction.DIVERGENT));
    org.junit.Assert.assertTrue("'" + side24 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side24.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus27 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus27.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 97+ "'", i30.equals(97));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl33);
    org.junit.Assert.assertTrue("'" + sectionControl34 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl34.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl37);
    org.junit.Assert.assertTrue("'" + sectionControl38 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl38.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    org.junit.Assert.assertTrue("'" + sectionControl43 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl43.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl47);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus48 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus48.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper0 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl1 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper0);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper2 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl3 = randoopSignalMapper2.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus4 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper2.neighborsStatus_div = neighborTSMStatus4;
    safetyLogicImpl1.setSignalMapper((hu.bme.mit.swsv.ris.tsm.SignalMapper)randoopSignalMapper2);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper7 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl8 = randoopSignalMapper7.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl9 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper7.sectionControlDecision_facing = sectionControl9;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus11 = randoopSignalMapper7.neighborsStatus_facing;
    safetyLogicImpl1.setSignalMapper((hu.bme.mit.swsv.ris.tsm.SignalMapper)randoopSignalMapper7);
    hu.bme.mit.swsv.ris.common.Direction direction14 = hu.bme.mit.swsv.ris.common.Direction.DIVERGENT;
    hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal turnoutDirectionSignal15 = new hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal((int)(short)10, direction14);
    safetyLogicImpl1.turnoutDirectionChanged(direction14);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper17 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl18 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper17);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper19 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl20 = randoopSignalMapper19.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus21 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper19.neighborsStatus_div = neighborTSMStatus21;
    safetyLogicImpl18.setSignalMapper((hu.bme.mit.swsv.ris.tsm.SignalMapper)randoopSignalMapper19);
    safetyLogicImpl18.disconnect();
    hu.bme.mit.swsv.ris.common.Side side25 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper26 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl27 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper26);
    hu.bme.mit.swsv.ris.common.Side side28 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy29 = hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE;
    safetyLogicImpl27.sectionOccupancyChanged(side28, sectionOccupancy29);
    hu.bme.mit.swsv.ris.common.Side side31 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy33 = hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal34 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(10, sectionOccupancy33);
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy35 = sectionOccupancySignal34.getSectionOccupancy();
    safetyLogicImpl27.sectionOccupancyChanged(side31, sectionOccupancy35);
    safetyLogicImpl18.sectionOccupancyChanged(side25, sectionOccupancy35);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper38 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl39 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper38);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper40 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl41 = randoopSignalMapper40.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus42 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper40.neighborsStatus_div = neighborTSMStatus42;
    safetyLogicImpl39.setSignalMapper((hu.bme.mit.swsv.ris.tsm.SignalMapper)randoopSignalMapper40);
    safetyLogicImpl39.disconnect();
    hu.bme.mit.swsv.ris.common.Side side46 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper47 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl48 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper47);
    hu.bme.mit.swsv.ris.common.Side side49 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy50 = hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE;
    safetyLogicImpl48.sectionOccupancyChanged(side49, sectionOccupancy50);
    hu.bme.mit.swsv.ris.common.Side side52 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy54 = hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal55 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(10, sectionOccupancy54);
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy56 = sectionOccupancySignal55.getSectionOccupancy();
    safetyLogicImpl48.sectionOccupancyChanged(side52, sectionOccupancy56);
    safetyLogicImpl39.sectionOccupancyChanged(side46, sectionOccupancy56);
    safetyLogicImpl1.sectionOccupancyChanged(side25, sectionOccupancy56);
    hu.bme.mit.swsv.ris.common.Direction direction62 = hu.bme.mit.swsv.ris.common.Direction.DIVERGENT;
    hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal turnoutDirectionSignal63 = new hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal((int)(short)10, direction62);
    hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal turnoutDirectionSignal64 = new hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal((int)(short)-1, direction62);
    safetyLogicImpl1.turnoutDirectionChanged(direction62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl3);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus4 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus4.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl8);
    org.junit.Assert.assertTrue("'" + sectionControl9 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl9.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(neighborTSMStatus11);
    org.junit.Assert.assertTrue("'" + direction14 + "' != '" + hu.bme.mit.swsv.ris.common.Direction.DIVERGENT + "'", direction14.equals(hu.bme.mit.swsv.ris.common.Direction.DIVERGENT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl20);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus21 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus21.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side25 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side25.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl27);
    org.junit.Assert.assertTrue("'" + side28 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side28.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy29 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy29.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));
    org.junit.Assert.assertTrue("'" + side31 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side31.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy33 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy33.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    org.junit.Assert.assertTrue("'" + sectionOccupancy35 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy35.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl41);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus42 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus42.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side46 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side46.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl48);
    org.junit.Assert.assertTrue("'" + side49 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side49.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy50 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy50.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));
    org.junit.Assert.assertTrue("'" + side52 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side52.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy54 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy54.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    org.junit.Assert.assertTrue("'" + sectionOccupancy56 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy56.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    org.junit.Assert.assertTrue("'" + direction62 + "' != '" + hu.bme.mit.swsv.ris.common.Direction.DIVERGENT + "'", direction62.equals(hu.bme.mit.swsv.ris.common.Direction.DIVERGENT));

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper0 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl1 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper0);
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl2 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper0.sectionControlDecision_div = sectionControl2;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl4 = randoopSignalMapper0.sectionControlDecision_facing;
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl5 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper0);
    hu.bme.mit.swsv.ris.common.Direction direction8 = hu.bme.mit.swsv.ris.common.Direction.DIVERGENT;
    hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal turnoutDirectionSignal9 = new hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal((int)(short)10, direction8);
    hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal turnoutDirectionSignal10 = new hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal((int)(short)-1, direction8);
    safetyLogicImpl5.turnoutDirectionChanged(direction8);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper12 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl13 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper12);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper14 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl15 = randoopSignalMapper14.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus16 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper14.neighborsStatus_div = neighborTSMStatus16;
    safetyLogicImpl13.setSignalMapper((hu.bme.mit.swsv.ris.tsm.SignalMapper)randoopSignalMapper14);
    safetyLogicImpl13.disconnect();
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper22 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl23 = randoopSignalMapper22.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus24 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper22.neighborsStatus_div = neighborTSMStatus24;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus26 = randoopSignalMapper22.neighborsStatus_facing;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus27 = randoopSignalMapper22.neighborsStatus_div;
    hu.bme.mit.swsv.ris.common.Side side28 = hu.bme.mit.swsv.ris.common.Side.STRAIGHT;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal29 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal(10, (int)(short)10, neighborTSMStatus27, side28);
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy31 = hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal32 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(10, sectionOccupancy31);
    java.lang.String str33 = sectionOccupancySignal32.toString();
    java.lang.String str34 = sectionOccupancySignal32.toString();
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy35 = sectionOccupancySignal32.getSectionOccupancy();
    safetyLogicImpl13.sectionOccupancyChanged(side28, sectionOccupancy35);
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus39 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side40 = null;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal41 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(byte)100, (int)'a', neighborTSMStatus39, side40);
    java.lang.Integer i42 = heartBeatSignal41.getTargetId();
    java.util.Date date43 = heartBeatSignal41.getTimestamp();
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper44 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl45 = randoopSignalMapper44.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl46 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper44.sectionControlDecision_facing = sectionControl46;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper48 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl49 = randoopSignalMapper48.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl50 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper48.sectionControlDecision_facing = sectionControl50;
    randoopSignalMapper44.sectionControlDecision_straight = sectionControl50;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl55 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    hu.bme.mit.swsv.ris.signals.SectionControlSignal sectionControlSignal56 = new hu.bme.mit.swsv.ris.signals.SectionControlSignal((int)(short)10, 100, sectionControl55);
    randoopSignalMapper44.sectionControlDecision_div = sectionControl55;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper58 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl59 = randoopSignalMapper58.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus60 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper58.neighborsStatus_div = neighborTSMStatus60;
    randoopSignalMapper44.neighborsStatus_div = neighborTSMStatus60;
    safetyLogicImpl5.neighborStatusChanged(side28, date43, neighborTSMStatus60);
    safetyLogicImpl5.disconnect();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl1);
    org.junit.Assert.assertTrue("'" + sectionControl2 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl2.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl5);
    org.junit.Assert.assertTrue("'" + direction8 + "' != '" + hu.bme.mit.swsv.ris.common.Direction.DIVERGENT + "'", direction8.equals(hu.bme.mit.swsv.ris.common.Direction.DIVERGENT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl15);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus16 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus16.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl23);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus24 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus24.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(neighborTSMStatus26);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus27 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus27.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side28 + "' != '" + hu.bme.mit.swsv.ris.common.Side.STRAIGHT + "'", side28.equals(hu.bme.mit.swsv.ris.common.Side.STRAIGHT));
    org.junit.Assert.assertTrue("'" + sectionOccupancy31 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy31.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "SectionOccupancySignal(sender: 10, occupancy: OCCUPIED)"+ "'", str33.equals("SectionOccupancySignal(sender: 10, occupancy: OCCUPIED)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "SectionOccupancySignal(sender: 10, occupancy: OCCUPIED)"+ "'", str34.equals("SectionOccupancySignal(sender: 10, occupancy: OCCUPIED)"));
    org.junit.Assert.assertTrue("'" + sectionOccupancy35 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy35.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus39 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus39.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 97+ "'", i42.equals(97));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl45);
    org.junit.Assert.assertTrue("'" + sectionControl46 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl46.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl49);
    org.junit.Assert.assertTrue("'" + sectionControl50 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl50.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    org.junit.Assert.assertTrue("'" + sectionControl55 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl55.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl59);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus60 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus60.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper4 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl5 = randoopSignalMapper4.sectionControlDecision_div;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus8 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side9 = null;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal10 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(byte)100, (int)'a', neighborTSMStatus8, side9);
    java.lang.String str11 = heartBeatSignal10.toString();
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus12 = heartBeatSignal10.getStatus();
    randoopSignalMapper4.neighborsStatus_facing = neighborTSMStatus12;
    hu.bme.mit.swsv.ris.common.Side side14 = hu.bme.mit.swsv.ris.common.Side.STRAIGHT;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal15 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)' ', (int)(short)0, neighborTSMStatus12, side14);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper16 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl17 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper16);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper18 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl19 = randoopSignalMapper18.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus20 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper18.neighborsStatus_div = neighborTSMStatus20;
    safetyLogicImpl17.setSignalMapper((hu.bme.mit.swsv.ris.tsm.SignalMapper)randoopSignalMapper18);
    safetyLogicImpl17.disconnect();
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper26 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl27 = randoopSignalMapper26.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus28 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper26.neighborsStatus_div = neighborTSMStatus28;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus30 = randoopSignalMapper26.neighborsStatus_facing;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus31 = randoopSignalMapper26.neighborsStatus_div;
    hu.bme.mit.swsv.ris.common.Side side32 = hu.bme.mit.swsv.ris.common.Side.STRAIGHT;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal33 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal(10, (int)(short)10, neighborTSMStatus31, side32);
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy35 = hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal36 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(10, sectionOccupancy35);
    java.lang.String str37 = sectionOccupancySignal36.toString();
    java.lang.String str38 = sectionOccupancySignal36.toString();
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy39 = sectionOccupancySignal36.getSectionOccupancy();
    safetyLogicImpl17.sectionOccupancyChanged(side32, sectionOccupancy39);
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal41 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(short)0, (int)(short)1, neighborTSMStatus12, side32);
    java.lang.String str42 = heartBeatSignal41.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl5);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus8 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus8.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:36 CET 2016)"+ "'", str11.equals("HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:36 CET 2016)"));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus12 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus12.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side14 + "' != '" + hu.bme.mit.swsv.ris.common.Side.STRAIGHT + "'", side14.equals(hu.bme.mit.swsv.ris.common.Side.STRAIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl19);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus20 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus20.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl27);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus28 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus28.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(neighborTSMStatus30);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus31 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus31.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side32 + "' != '" + hu.bme.mit.swsv.ris.common.Side.STRAIGHT + "'", side32.equals(hu.bme.mit.swsv.ris.common.Side.STRAIGHT));
    org.junit.Assert.assertTrue("'" + sectionOccupancy35 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy35.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "SectionOccupancySignal(sender: 10, occupancy: OCCUPIED)"+ "'", str37.equals("SectionOccupancySignal(sender: 10, occupancy: OCCUPIED)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "SectionOccupancySignal(sender: 10, occupancy: OCCUPIED)"+ "'", str38.equals("SectionOccupancySignal(sender: 10, occupancy: OCCUPIED)"));
    org.junit.Assert.assertTrue("'" + sectionOccupancy39 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy39.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "HeartBeatSignal(sender: 0 (STRAIGHT), target: 1, status: ALLOWED, timestamp: Sun Nov 27 19:48:36 CET 2016)"+ "'", str42.equals("HeartBeatSignal(sender: 0 (STRAIGHT), target: 1, status: ALLOWED, timestamp: Sun Nov 27 19:48:36 CET 2016)"));

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper0 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl1 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper0);
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl2 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper0.sectionControlDecision_straight = sectionControl2;
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl4 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper0);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper5 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl6 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper5);
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl7 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper5.sectionControlDecision_div = sectionControl7;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl9 = randoopSignalMapper5.sectionControlDecision_facing;
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl10 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper5);
    hu.bme.mit.swsv.ris.common.Side side11 = hu.bme.mit.swsv.ris.common.Side.DIVERGENT;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus14 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side15 = null;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal16 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(byte)100, (int)'a', neighborTSMStatus14, side15);
    java.lang.Integer i17 = heartBeatSignal16.getTargetId();
    java.util.Date date18 = heartBeatSignal16.getTimestamp();
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper19 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl20 = randoopSignalMapper19.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus21 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper19.neighborsStatus_div = neighborTSMStatus21;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper23 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl24 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper23);
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl25 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper23.sectionControlDecision_straight = sectionControl25;
    randoopSignalMapper19.sectionControlDecision_div = sectionControl25;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus28 = randoopSignalMapper19.neighborsStatus_div;
    safetyLogicImpl10.neighborStatusChanged(side11, date18, neighborTSMStatus28);
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy31 = hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal32 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(10, sectionOccupancy31);
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy33 = sectionOccupancySignal32.getSectionOccupancy();
    safetyLogicImpl4.sectionOccupancyChanged(side11, sectionOccupancy33);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper37 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl38 = randoopSignalMapper37.sectionControlDecision_div;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus41 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side42 = null;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal43 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(byte)100, (int)'a', neighborTSMStatus41, side42);
    java.lang.String str44 = heartBeatSignal43.toString();
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus45 = heartBeatSignal43.getStatus();
    randoopSignalMapper37.neighborsStatus_facing = neighborTSMStatus45;
    hu.bme.mit.swsv.ris.common.Side side47 = hu.bme.mit.swsv.ris.common.Side.STRAIGHT;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal48 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)' ', (int)(short)0, neighborTSMStatus45, side47);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper49 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl50 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper49);
    hu.bme.mit.swsv.ris.common.Side side51 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy52 = hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE;
    safetyLogicImpl50.sectionOccupancyChanged(side51, sectionOccupancy52);
    safetyLogicImpl4.sectionOccupancyChanged(side47, sectionOccupancy52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl1);
    org.junit.Assert.assertTrue("'" + sectionControl2 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl2.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl6);
    org.junit.Assert.assertTrue("'" + sectionControl7 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl7.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl10);
    org.junit.Assert.assertTrue("'" + side11 + "' != '" + hu.bme.mit.swsv.ris.common.Side.DIVERGENT + "'", side11.equals(hu.bme.mit.swsv.ris.common.Side.DIVERGENT));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus14 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus14.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 97+ "'", i17.equals(97));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl20);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus21 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus21.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl24);
    org.junit.Assert.assertTrue("'" + sectionControl25 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl25.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus28 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus28.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + sectionOccupancy31 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy31.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    org.junit.Assert.assertTrue("'" + sectionOccupancy33 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy33.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl38);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus41 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus41.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:36 CET 2016)"+ "'", str44.equals("HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:36 CET 2016)"));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus45 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus45.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side47 + "' != '" + hu.bme.mit.swsv.ris.common.Side.STRAIGHT + "'", side47.equals(hu.bme.mit.swsv.ris.common.Side.STRAIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl50);
    org.junit.Assert.assertTrue("'" + side51 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side51.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy52 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy52.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper2 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl3 = randoopSignalMapper2.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl4 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper2.sectionControlDecision_facing = sectionControl4;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper6 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl7 = randoopSignalMapper6.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl8 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper6.sectionControlDecision_facing = sectionControl8;
    randoopSignalMapper2.sectionControlDecision_straight = sectionControl8;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl13 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    hu.bme.mit.swsv.ris.signals.SectionControlSignal sectionControlSignal14 = new hu.bme.mit.swsv.ris.signals.SectionControlSignal((int)(short)10, 100, sectionControl13);
    randoopSignalMapper2.sectionControlDecision_div = sectionControl13;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper16 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl17 = randoopSignalMapper16.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus18 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper16.neighborsStatus_div = neighborTSMStatus18;
    randoopSignalMapper2.neighborsStatus_div = neighborTSMStatus18;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper23 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl24 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper23);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper25 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl26 = randoopSignalMapper25.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus27 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper25.neighborsStatus_div = neighborTSMStatus27;
    safetyLogicImpl24.setSignalMapper((hu.bme.mit.swsv.ris.tsm.SignalMapper)randoopSignalMapper25);
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl30 = randoopSignalMapper25.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper31 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl32 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper31);
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl33 = randoopSignalMapper31.sectionControlDecision_div;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper34 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl35 = randoopSignalMapper34.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus36 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper34.neighborsStatus_div = neighborTSMStatus36;
    randoopSignalMapper31.neighborsStatus_straight = neighborTSMStatus36;
    randoopSignalMapper25.neighborsStatus_div = neighborTSMStatus36;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper40 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl41 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper40);
    hu.bme.mit.swsv.ris.common.Side side42 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy43 = hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE;
    safetyLogicImpl41.sectionOccupancyChanged(side42, sectionOccupancy43);
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal45 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal(100, (int)(short)100, neighborTSMStatus36, side42);
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal46 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal(0, (int)(byte)10, neighborTSMStatus18, side42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl3);
    org.junit.Assert.assertTrue("'" + sectionControl4 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl4.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl7);
    org.junit.Assert.assertTrue("'" + sectionControl8 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl8.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    org.junit.Assert.assertTrue("'" + sectionControl13 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl13.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl17);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus18 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus18.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl26);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus27 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus27.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl35);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus36 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus36.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl41);
    org.junit.Assert.assertTrue("'" + side42 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side42.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy43 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy43.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper0 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl1 = randoopSignalMapper0.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl2 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper0.sectionControlDecision_facing = sectionControl2;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper4 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl5 = randoopSignalMapper4.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl6 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper4.sectionControlDecision_facing = sectionControl6;
    randoopSignalMapper0.sectionControlDecision_straight = sectionControl6;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl11 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    hu.bme.mit.swsv.ris.signals.SectionControlSignal sectionControlSignal12 = new hu.bme.mit.swsv.ris.signals.SectionControlSignal((int)(short)10, 100, sectionControl11);
    randoopSignalMapper0.sectionControlDecision_div = sectionControl11;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper14 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl15 = randoopSignalMapper14.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus16 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper14.neighborsStatus_div = neighborTSMStatus16;
    randoopSignalMapper0.neighborsStatus_div = neighborTSMStatus16;
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl19 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper0);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper20 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl21 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper20);
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl22 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper20.sectionControlDecision_div = sectionControl22;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl24 = randoopSignalMapper20.sectionControlDecision_facing;
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl25 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper20);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper28 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl29 = randoopSignalMapper28.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus30 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper28.neighborsStatus_div = neighborTSMStatus30;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper32 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl33 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper32);
    hu.bme.mit.swsv.ris.common.Side side34 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy35 = hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE;
    safetyLogicImpl33.sectionOccupancyChanged(side34, sectionOccupancy35);
    hu.bme.mit.swsv.ris.common.Side side37 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy39 = hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal40 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(10, sectionOccupancy39);
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy41 = sectionOccupancySignal40.getSectionOccupancy();
    safetyLogicImpl33.sectionOccupancyChanged(side37, sectionOccupancy41);
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal43 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(byte)10, (int)'#', neighborTSMStatus30, side37);
    randoopSignalMapper20.neighborsStatus_facing = neighborTSMStatus30;
    randoopSignalMapper0.neighborsStatus_facing = neighborTSMStatus30;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl1);
    org.junit.Assert.assertTrue("'" + sectionControl2 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl2.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl5);
    org.junit.Assert.assertTrue("'" + sectionControl6 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl6.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    org.junit.Assert.assertTrue("'" + sectionControl11 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl11.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl15);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus16 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus16.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl21);
    org.junit.Assert.assertTrue("'" + sectionControl22 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl22.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl29);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus30 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus30.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl33);
    org.junit.Assert.assertTrue("'" + side34 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side34.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy35 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy35.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));
    org.junit.Assert.assertTrue("'" + side37 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side37.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy39 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy39.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    org.junit.Assert.assertTrue("'" + sectionOccupancy41 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy41.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper0 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl1 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper0);
    hu.bme.mit.swsv.ris.common.Side side2 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy3 = hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE;
    safetyLogicImpl1.sectionOccupancyChanged(side2, sectionOccupancy3);
    safetyLogicImpl1.disconnect();
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper6 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl7 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper6);
    hu.bme.mit.swsv.ris.common.Side side8 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy9 = hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE;
    safetyLogicImpl7.sectionOccupancyChanged(side8, sectionOccupancy9);
    hu.bme.mit.swsv.ris.common.Side side11 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy13 = hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal14 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(10, sectionOccupancy13);
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy15 = sectionOccupancySignal14.getSectionOccupancy();
    safetyLogicImpl7.sectionOccupancyChanged(side11, sectionOccupancy15);
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus19 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side20 = null;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal21 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(byte)100, (int)'a', neighborTSMStatus19, side20);
    java.lang.Integer i22 = heartBeatSignal21.getTargetId();
    java.util.Date date23 = heartBeatSignal21.getTimestamp();
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper24 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl25 = randoopSignalMapper24.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl26 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper24.sectionControlDecision_facing = sectionControl26;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper28 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl29 = randoopSignalMapper28.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl30 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper28.sectionControlDecision_facing = sectionControl30;
    randoopSignalMapper24.sectionControlDecision_straight = sectionControl30;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl35 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    hu.bme.mit.swsv.ris.signals.SectionControlSignal sectionControlSignal36 = new hu.bme.mit.swsv.ris.signals.SectionControlSignal((int)(short)10, 100, sectionControl35);
    randoopSignalMapper24.sectionControlDecision_div = sectionControl35;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper38 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl39 = randoopSignalMapper38.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus40 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper38.neighborsStatus_div = neighborTSMStatus40;
    randoopSignalMapper24.neighborsStatus_div = neighborTSMStatus40;
    safetyLogicImpl1.neighborStatusChanged(side11, date23, neighborTSMStatus40);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper44 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl45 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper44);
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl46 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper44.sectionControlDecision_straight = sectionControl46;
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl48 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper44);
    safetyLogicImpl1.setSignalMapper((hu.bme.mit.swsv.ris.tsm.SignalMapper)randoopSignalMapper44);
    safetyLogicImpl1.disconnect();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl1);
    org.junit.Assert.assertTrue("'" + side2 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side2.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy3 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy3.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl7);
    org.junit.Assert.assertTrue("'" + side8 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side8.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy9 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy9.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));
    org.junit.Assert.assertTrue("'" + side11 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side11.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy13 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy13.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    org.junit.Assert.assertTrue("'" + sectionOccupancy15 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy15.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus19 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus19.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + 97+ "'", i22.equals(97));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl25);
    org.junit.Assert.assertTrue("'" + sectionControl26 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl26.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl29);
    org.junit.Assert.assertTrue("'" + sectionControl30 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl30.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    org.junit.Assert.assertTrue("'" + sectionControl35 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl35.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl39);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus40 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus40.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl45);
    org.junit.Assert.assertTrue("'" + sectionControl46 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl46.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl48);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper0 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl1 = randoopSignalMapper0.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus2 = randoopSignalMapper0.neighborsStatus_straight;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper3 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl4 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper3);
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl5 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper3.sectionControlDecision_div = sectionControl5;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl7 = randoopSignalMapper3.sectionControlDecision_facing;
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl8 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper3);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper11 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl12 = randoopSignalMapper11.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus13 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper11.neighborsStatus_div = neighborTSMStatus13;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper15 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl16 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper15);
    hu.bme.mit.swsv.ris.common.Side side17 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy18 = hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE;
    safetyLogicImpl16.sectionOccupancyChanged(side17, sectionOccupancy18);
    hu.bme.mit.swsv.ris.common.Side side20 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy22 = hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal23 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(10, sectionOccupancy22);
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy24 = sectionOccupancySignal23.getSectionOccupancy();
    safetyLogicImpl16.sectionOccupancyChanged(side20, sectionOccupancy24);
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal26 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(byte)10, (int)'#', neighborTSMStatus13, side20);
    randoopSignalMapper3.neighborsStatus_facing = neighborTSMStatus13;
    randoopSignalMapper0.neighborsStatus_facing = neighborTSMStatus13;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(neighborTSMStatus2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl4);
    org.junit.Assert.assertTrue("'" + sectionControl5 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl5.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl12);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus13 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus13.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl16);
    org.junit.Assert.assertTrue("'" + side17 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side17.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy18 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy18.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));
    org.junit.Assert.assertTrue("'" + side20 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side20.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy22 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy22.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    org.junit.Assert.assertTrue("'" + sectionOccupancy24 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy24.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper0 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl1 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper0);
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl2 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper0.sectionControlDecision_div = sectionControl2;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl4 = randoopSignalMapper0.sectionControlDecision_facing;
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl5 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper0);
    hu.bme.mit.swsv.ris.common.Side side6 = hu.bme.mit.swsv.ris.common.Side.DIVERGENT;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus9 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side10 = null;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal11 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(byte)100, (int)'a', neighborTSMStatus9, side10);
    java.lang.Integer i12 = heartBeatSignal11.getTargetId();
    java.util.Date date13 = heartBeatSignal11.getTimestamp();
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper14 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl15 = randoopSignalMapper14.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus16 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper14.neighborsStatus_div = neighborTSMStatus16;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper18 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl19 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper18);
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl20 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper18.sectionControlDecision_straight = sectionControl20;
    randoopSignalMapper14.sectionControlDecision_div = sectionControl20;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus23 = randoopSignalMapper14.neighborsStatus_div;
    safetyLogicImpl5.neighborStatusChanged(side6, date13, neighborTSMStatus23);
    safetyLogicImpl5.disconnect();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl1);
    org.junit.Assert.assertTrue("'" + sectionControl2 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl2.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl5);
    org.junit.Assert.assertTrue("'" + side6 + "' != '" + hu.bme.mit.swsv.ris.common.Side.DIVERGENT + "'", side6.equals(hu.bme.mit.swsv.ris.common.Side.DIVERGENT));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus9 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus9.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 97+ "'", i12.equals(97));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl15);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus16 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus16.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl19);
    org.junit.Assert.assertTrue("'" + sectionControl20 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl20.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus23 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus23.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper0 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl1 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper0);
    safetyLogicImpl1.disconnect();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl1);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper2 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl3 = randoopSignalMapper2.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper4 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl5 = randoopSignalMapper4.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl6 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper4.sectionControlDecision_facing = sectionControl6;
    randoopSignalMapper2.sectionControlDecision_div = sectionControl6;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus11 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side12 = null;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal13 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(byte)100, (int)'a', neighborTSMStatus11, side12);
    java.lang.String str14 = heartBeatSignal13.toString();
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus15 = heartBeatSignal13.getStatus();
    randoopSignalMapper2.neighborsStatus_straight = neighborTSMStatus15;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper17 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl18 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper17);
    hu.bme.mit.swsv.ris.common.Side side19 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy20 = hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE;
    safetyLogicImpl18.sectionOccupancyChanged(side19, sectionOccupancy20);
    hu.bme.mit.swsv.ris.common.Side side22 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy24 = hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal25 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(10, sectionOccupancy24);
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy26 = sectionOccupancySignal25.getSectionOccupancy();
    safetyLogicImpl18.sectionOccupancyChanged(side22, sectionOccupancy26);
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal28 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)'#', (int)(short)0, neighborTSMStatus15, side22);
    java.util.Date date29 = heartBeatSignal28.getTimestamp();
    java.util.Date date30 = heartBeatSignal28.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl5);
    org.junit.Assert.assertTrue("'" + sectionControl6 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl6.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus11 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus11.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:39 CET 2016)"+ "'", str14.equals("HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:39 CET 2016)"));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus15 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus15.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl18);
    org.junit.Assert.assertTrue("'" + side19 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side19.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy20 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy20.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));
    org.junit.Assert.assertTrue("'" + side22 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side22.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy24 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy24.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    org.junit.Assert.assertTrue("'" + sectionOccupancy26 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy26.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date30);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper4 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl5 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper4);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper6 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl7 = randoopSignalMapper6.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus8 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper6.neighborsStatus_div = neighborTSMStatus8;
    safetyLogicImpl5.setSignalMapper((hu.bme.mit.swsv.ris.tsm.SignalMapper)randoopSignalMapper6);
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl11 = randoopSignalMapper6.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper12 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl13 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper12);
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl14 = randoopSignalMapper12.sectionControlDecision_div;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper15 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl16 = randoopSignalMapper15.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus17 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper15.neighborsStatus_div = neighborTSMStatus17;
    randoopSignalMapper12.neighborsStatus_straight = neighborTSMStatus17;
    randoopSignalMapper6.neighborsStatus_div = neighborTSMStatus17;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper23 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl24 = randoopSignalMapper23.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper25 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl26 = randoopSignalMapper25.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl27 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper25.sectionControlDecision_facing = sectionControl27;
    randoopSignalMapper23.sectionControlDecision_div = sectionControl27;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus32 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side33 = null;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal34 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(byte)100, (int)'a', neighborTSMStatus32, side33);
    java.lang.String str35 = heartBeatSignal34.toString();
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus36 = heartBeatSignal34.getStatus();
    randoopSignalMapper23.neighborsStatus_straight = neighborTSMStatus36;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper38 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl39 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper38);
    hu.bme.mit.swsv.ris.common.Side side40 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy41 = hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE;
    safetyLogicImpl39.sectionOccupancyChanged(side40, sectionOccupancy41);
    hu.bme.mit.swsv.ris.common.Side side43 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy45 = hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal46 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(10, sectionOccupancy45);
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy47 = sectionOccupancySignal46.getSectionOccupancy();
    safetyLogicImpl39.sectionOccupancyChanged(side43, sectionOccupancy47);
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal49 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)'#', (int)(short)0, neighborTSMStatus36, side43);
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal50 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(byte)1, (int)(byte)100, neighborTSMStatus17, side43);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper53 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl54 = randoopSignalMapper53.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus55 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper53.neighborsStatus_div = neighborTSMStatus55;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus57 = randoopSignalMapper53.neighborsStatus_facing;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus58 = randoopSignalMapper53.neighborsStatus_div;
    hu.bme.mit.swsv.ris.common.Side side59 = hu.bme.mit.swsv.ris.common.Side.STRAIGHT;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal60 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal(10, (int)(short)10, neighborTSMStatus58, side59);
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal61 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)' ', (int)(byte)10, neighborTSMStatus17, side59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl7);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus8 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus8.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl16);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus17 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus17.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl26);
    org.junit.Assert.assertTrue("'" + sectionControl27 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl27.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus32 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus32.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:39 CET 2016)"+ "'", str35.equals("HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:39 CET 2016)"));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus36 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus36.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl39);
    org.junit.Assert.assertTrue("'" + side40 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side40.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy41 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy41.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));
    org.junit.Assert.assertTrue("'" + side43 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side43.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy45 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy45.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    org.junit.Assert.assertTrue("'" + sectionOccupancy47 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy47.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl54);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus55 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus55.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(neighborTSMStatus57);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus58 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus58.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side59 + "' != '" + hu.bme.mit.swsv.ris.common.Side.STRAIGHT + "'", side59.equals(hu.bme.mit.swsv.ris.common.Side.STRAIGHT));

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper0 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl1 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper0);
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl2 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper0.sectionControlDecision_div = sectionControl2;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl4 = randoopSignalMapper0.sectionControlDecision_facing;
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl5 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper0);
    hu.bme.mit.swsv.ris.common.Direction direction8 = hu.bme.mit.swsv.ris.common.Direction.DIVERGENT;
    hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal turnoutDirectionSignal9 = new hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal((int)(short)10, direction8);
    hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal turnoutDirectionSignal10 = new hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal((int)(short)-1, direction8);
    safetyLogicImpl5.turnoutDirectionChanged(direction8);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper14 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl15 = randoopSignalMapper14.sectionControlDecision_div;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus18 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side19 = null;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal20 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(byte)100, (int)'a', neighborTSMStatus18, side19);
    java.lang.String str21 = heartBeatSignal20.toString();
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus22 = heartBeatSignal20.getStatus();
    randoopSignalMapper14.neighborsStatus_facing = neighborTSMStatus22;
    hu.bme.mit.swsv.ris.common.Side side24 = hu.bme.mit.swsv.ris.common.Side.STRAIGHT;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal25 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)' ', (int)(short)0, neighborTSMStatus22, side24);
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy27 = hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal28 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal((int)(short)10, sectionOccupancy27);
    safetyLogicImpl5.sectionOccupancyChanged(side24, sectionOccupancy27);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper32 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl33 = randoopSignalMapper32.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper34 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl35 = randoopSignalMapper34.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl36 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper34.sectionControlDecision_facing = sectionControl36;
    randoopSignalMapper32.sectionControlDecision_div = sectionControl36;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus41 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side42 = null;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal43 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(byte)100, (int)'a', neighborTSMStatus41, side42);
    java.lang.String str44 = heartBeatSignal43.toString();
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus45 = heartBeatSignal43.getStatus();
    randoopSignalMapper32.neighborsStatus_straight = neighborTSMStatus45;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper47 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl48 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper47);
    hu.bme.mit.swsv.ris.common.Side side49 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy50 = hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE;
    safetyLogicImpl48.sectionOccupancyChanged(side49, sectionOccupancy50);
    hu.bme.mit.swsv.ris.common.Side side52 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy54 = hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal55 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(10, sectionOccupancy54);
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy56 = sectionOccupancySignal55.getSectionOccupancy();
    safetyLogicImpl48.sectionOccupancyChanged(side52, sectionOccupancy56);
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal58 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)'#', (int)(short)0, neighborTSMStatus45, side52);
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy59 = null;
    // The following exception was thrown during execution in test generation
    try {
    safetyLogicImpl5.sectionOccupancyChanged(side52, sectionOccupancy59);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl1);
    org.junit.Assert.assertTrue("'" + sectionControl2 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl2.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl5);
    org.junit.Assert.assertTrue("'" + direction8 + "' != '" + hu.bme.mit.swsv.ris.common.Direction.DIVERGENT + "'", direction8.equals(hu.bme.mit.swsv.ris.common.Direction.DIVERGENT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl15);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus18 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus18.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:40 CET 2016)"+ "'", str21.equals("HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:40 CET 2016)"));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus22 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus22.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side24 + "' != '" + hu.bme.mit.swsv.ris.common.Side.STRAIGHT + "'", side24.equals(hu.bme.mit.swsv.ris.common.Side.STRAIGHT));
    org.junit.Assert.assertTrue("'" + sectionOccupancy27 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy27.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl35);
    org.junit.Assert.assertTrue("'" + sectionControl36 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl36.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus41 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus41.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:40 CET 2016)"+ "'", str44.equals("HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:40 CET 2016)"));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus45 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus45.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl48);
    org.junit.Assert.assertTrue("'" + side49 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side49.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy50 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy50.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));
    org.junit.Assert.assertTrue("'" + side52 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side52.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy54 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy54.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    org.junit.Assert.assertTrue("'" + sectionOccupancy56 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy56.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper0 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl1 = randoopSignalMapper0.sectionControlDecision_div;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl2 = randoopSignalMapper0.sectionControlDecision_div;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper5 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl6 = randoopSignalMapper5.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper7 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl8 = randoopSignalMapper7.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl9 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper7.sectionControlDecision_facing = sectionControl9;
    randoopSignalMapper5.sectionControlDecision_div = sectionControl9;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus14 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side15 = null;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal16 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(byte)100, (int)'a', neighborTSMStatus14, side15);
    java.lang.String str17 = heartBeatSignal16.toString();
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus18 = heartBeatSignal16.getStatus();
    randoopSignalMapper5.neighborsStatus_straight = neighborTSMStatus18;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper20 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl21 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper20);
    hu.bme.mit.swsv.ris.common.Side side22 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy23 = hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE;
    safetyLogicImpl21.sectionOccupancyChanged(side22, sectionOccupancy23);
    hu.bme.mit.swsv.ris.common.Side side25 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy27 = hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal28 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(10, sectionOccupancy27);
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy29 = sectionOccupancySignal28.getSectionOccupancy();
    safetyLogicImpl21.sectionOccupancyChanged(side25, sectionOccupancy29);
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal31 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)'#', (int)(short)0, neighborTSMStatus18, side25);
    randoopSignalMapper0.neighborsStatus_div = neighborTSMStatus18;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl33 = randoopSignalMapper0.sectionControlDecision_facing;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl8);
    org.junit.Assert.assertTrue("'" + sectionControl9 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl9.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus14 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus14.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:40 CET 2016)"+ "'", str17.equals("HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:40 CET 2016)"));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus18 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus18.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl21);
    org.junit.Assert.assertTrue("'" + side22 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side22.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy23 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy23.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));
    org.junit.Assert.assertTrue("'" + side25 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side25.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy27 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy27.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    org.junit.Assert.assertTrue("'" + sectionOccupancy29 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy29.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl33);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper0 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl1 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper0);
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl2 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper0.sectionControlDecision_div = sectionControl2;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl4 = randoopSignalMapper0.sectionControlDecision_facing;
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl5 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper0);
    hu.bme.mit.swsv.ris.common.Direction direction8 = hu.bme.mit.swsv.ris.common.Direction.DIVERGENT;
    hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal turnoutDirectionSignal9 = new hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal((int)(short)10, direction8);
    hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal turnoutDirectionSignal10 = new hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal((int)(short)-1, direction8);
    safetyLogicImpl5.turnoutDirectionChanged(direction8);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper12 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl13 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper12);
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl14 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper12.sectionControlDecision_straight = sectionControl14;
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl16 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper12);
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus17 = null;
    randoopSignalMapper12.neighborsStatus_facing = neighborTSMStatus17;
    safetyLogicImpl5.setSignalMapper((hu.bme.mit.swsv.ris.tsm.SignalMapper)randoopSignalMapper12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl1);
    org.junit.Assert.assertTrue("'" + sectionControl2 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl2.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl5);
    org.junit.Assert.assertTrue("'" + direction8 + "' != '" + hu.bme.mit.swsv.ris.common.Direction.DIVERGENT + "'", direction8.equals(hu.bme.mit.swsv.ris.common.Direction.DIVERGENT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl13);
    org.junit.Assert.assertTrue("'" + sectionControl14 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl14.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl16);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper1 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl2 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper1);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper3 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl4 = randoopSignalMapper3.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus5 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper3.neighborsStatus_div = neighborTSMStatus5;
    safetyLogicImpl2.setSignalMapper((hu.bme.mit.swsv.ris.tsm.SignalMapper)randoopSignalMapper3);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper8 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl9 = randoopSignalMapper8.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl10 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper8.sectionControlDecision_facing = sectionControl10;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus12 = randoopSignalMapper8.neighborsStatus_facing;
    safetyLogicImpl2.setSignalMapper((hu.bme.mit.swsv.ris.tsm.SignalMapper)randoopSignalMapper8);
    hu.bme.mit.swsv.ris.common.Direction direction15 = hu.bme.mit.swsv.ris.common.Direction.DIVERGENT;
    hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal turnoutDirectionSignal16 = new hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal((int)(short)10, direction15);
    safetyLogicImpl2.turnoutDirectionChanged(direction15);
    hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal turnoutDirectionSignal18 = new hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal((int)(short)100, direction15);
    hu.bme.mit.swsv.ris.common.Direction direction19 = turnoutDirectionSignal18.getTurnoutDirection();
    hu.bme.mit.swsv.ris.common.Direction direction20 = turnoutDirectionSignal18.getTurnoutDirection();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl4);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus5 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus5.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl9);
    org.junit.Assert.assertTrue("'" + sectionControl10 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl10.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(neighborTSMStatus12);
    org.junit.Assert.assertTrue("'" + direction15 + "' != '" + hu.bme.mit.swsv.ris.common.Direction.DIVERGENT + "'", direction15.equals(hu.bme.mit.swsv.ris.common.Direction.DIVERGENT));
    org.junit.Assert.assertTrue("'" + direction19 + "' != '" + hu.bme.mit.swsv.ris.common.Direction.DIVERGENT + "'", direction19.equals(hu.bme.mit.swsv.ris.common.Direction.DIVERGENT));
    org.junit.Assert.assertTrue("'" + direction20 + "' != '" + hu.bme.mit.swsv.ris.common.Direction.DIVERGENT + "'", direction20.equals(hu.bme.mit.swsv.ris.common.Direction.DIVERGENT));

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper4 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl5 = randoopSignalMapper4.sectionControlDecision_div;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus8 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side9 = null;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal10 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(byte)100, (int)'a', neighborTSMStatus8, side9);
    java.lang.String str11 = heartBeatSignal10.toString();
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus12 = heartBeatSignal10.getStatus();
    randoopSignalMapper4.neighborsStatus_facing = neighborTSMStatus12;
    hu.bme.mit.swsv.ris.common.Side side14 = hu.bme.mit.swsv.ris.common.Side.STRAIGHT;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal15 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)' ', (int)(short)0, neighborTSMStatus12, side14);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper16 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl17 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper16);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper18 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl19 = randoopSignalMapper18.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus20 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper18.neighborsStatus_div = neighborTSMStatus20;
    safetyLogicImpl17.setSignalMapper((hu.bme.mit.swsv.ris.tsm.SignalMapper)randoopSignalMapper18);
    safetyLogicImpl17.disconnect();
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper26 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl27 = randoopSignalMapper26.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus28 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper26.neighborsStatus_div = neighborTSMStatus28;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus30 = randoopSignalMapper26.neighborsStatus_facing;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus31 = randoopSignalMapper26.neighborsStatus_div;
    hu.bme.mit.swsv.ris.common.Side side32 = hu.bme.mit.swsv.ris.common.Side.STRAIGHT;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal33 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal(10, (int)(short)10, neighborTSMStatus31, side32);
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy35 = hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal36 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(10, sectionOccupancy35);
    java.lang.String str37 = sectionOccupancySignal36.toString();
    java.lang.String str38 = sectionOccupancySignal36.toString();
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy39 = sectionOccupancySignal36.getSectionOccupancy();
    safetyLogicImpl17.sectionOccupancyChanged(side32, sectionOccupancy39);
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal41 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(short)0, (int)(short)1, neighborTSMStatus12, side32);
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus42 = heartBeatSignal41.getStatus();
    java.util.Date date43 = heartBeatSignal41.getTimestamp();
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus44 = heartBeatSignal41.getStatus();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl5);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus8 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus8.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:41 CET 2016)"+ "'", str11.equals("HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:41 CET 2016)"));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus12 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus12.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side14 + "' != '" + hu.bme.mit.swsv.ris.common.Side.STRAIGHT + "'", side14.equals(hu.bme.mit.swsv.ris.common.Side.STRAIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl19);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus20 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus20.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl27);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus28 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus28.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(neighborTSMStatus30);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus31 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus31.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side32 + "' != '" + hu.bme.mit.swsv.ris.common.Side.STRAIGHT + "'", side32.equals(hu.bme.mit.swsv.ris.common.Side.STRAIGHT));
    org.junit.Assert.assertTrue("'" + sectionOccupancy35 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy35.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "SectionOccupancySignal(sender: 10, occupancy: OCCUPIED)"+ "'", str37.equals("SectionOccupancySignal(sender: 10, occupancy: OCCUPIED)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "SectionOccupancySignal(sender: 10, occupancy: OCCUPIED)"+ "'", str38.equals("SectionOccupancySignal(sender: 10, occupancy: OCCUPIED)"));
    org.junit.Assert.assertTrue("'" + sectionOccupancy39 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy39.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus42 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus42.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date43);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus44 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus44.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper2 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl3 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper2);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper4 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl5 = randoopSignalMapper4.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus6 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper4.neighborsStatus_div = neighborTSMStatus6;
    safetyLogicImpl3.setSignalMapper((hu.bme.mit.swsv.ris.tsm.SignalMapper)randoopSignalMapper4);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper9 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl10 = randoopSignalMapper9.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl11 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper9.sectionControlDecision_facing = sectionControl11;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus13 = randoopSignalMapper9.neighborsStatus_facing;
    safetyLogicImpl3.setSignalMapper((hu.bme.mit.swsv.ris.tsm.SignalMapper)randoopSignalMapper9);
    hu.bme.mit.swsv.ris.common.Direction direction16 = hu.bme.mit.swsv.ris.common.Direction.DIVERGENT;
    hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal turnoutDirectionSignal17 = new hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal((int)(short)10, direction16);
    safetyLogicImpl3.turnoutDirectionChanged(direction16);
    hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal turnoutDirectionSignal19 = new hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal((int)(byte)0, direction16);
    hu.bme.mit.swsv.ris.common.Direction direction20 = turnoutDirectionSignal19.getTurnoutDirection();
    hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal turnoutDirectionSignal21 = new hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal((int)(short)10, direction20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl5);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus6 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus6.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl10);
    org.junit.Assert.assertTrue("'" + sectionControl11 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl11.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(neighborTSMStatus13);
    org.junit.Assert.assertTrue("'" + direction16 + "' != '" + hu.bme.mit.swsv.ris.common.Direction.DIVERGENT + "'", direction16.equals(hu.bme.mit.swsv.ris.common.Direction.DIVERGENT));
    org.junit.Assert.assertTrue("'" + direction20 + "' != '" + hu.bme.mit.swsv.ris.common.Direction.DIVERGENT + "'", direction20.equals(hu.bme.mit.swsv.ris.common.Direction.DIVERGENT));

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper0 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper1 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper2 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl3 = randoopSignalMapper2.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper4 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl5 = randoopSignalMapper4.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl6 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper4.sectionControlDecision_facing = sectionControl6;
    randoopSignalMapper2.sectionControlDecision_div = sectionControl6;
    randoopSignalMapper1.sectionControlDecision_div = sectionControl6;
    randoopSignalMapper0.sectionControlDecision_div = sectionControl6;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper11 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl12 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper11);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper13 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl14 = randoopSignalMapper13.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus15 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper13.neighborsStatus_div = neighborTSMStatus15;
    safetyLogicImpl12.setSignalMapper((hu.bme.mit.swsv.ris.tsm.SignalMapper)randoopSignalMapper13);
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl18 = randoopSignalMapper13.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper19 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl20 = randoopSignalMapper19.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl21 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper19.sectionControlDecision_facing = sectionControl21;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus23 = randoopSignalMapper19.neighborsStatus_facing;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl26 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    hu.bme.mit.swsv.ris.signals.SectionControlSignal sectionControlSignal27 = new hu.bme.mit.swsv.ris.signals.SectionControlSignal((int)(short)10, 100, sectionControl26);
    java.lang.String str28 = sectionControlSignal27.toString();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl29 = sectionControlSignal27.getSectionControl();
    randoopSignalMapper19.sectionControlDecision_facing = sectionControl29;
    randoopSignalMapper13.sectionControlDecision_straight = sectionControl29;
    randoopSignalMapper0.sectionControlDecision_facing = sectionControl29;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl5);
    org.junit.Assert.assertTrue("'" + sectionControl6 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl6.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl14);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus15 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus15.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl20);
    org.junit.Assert.assertTrue("'" + sectionControl21 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl21.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(neighborTSMStatus23);
    org.junit.Assert.assertTrue("'" + sectionControl26 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl26.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "SectionControlSignal(sender: 10, target: 100, control: DISABLED)"+ "'", str28.equals("SectionControlSignal(sender: 10, target: 100, control: DISABLED)"));
    org.junit.Assert.assertTrue("'" + sectionControl29 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl29.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper0 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl1 = randoopSignalMapper0.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl2 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper0.sectionControlDecision_facing = sectionControl2;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper4 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl5 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper4);
    hu.bme.mit.swsv.ris.common.Side side6 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy7 = hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE;
    safetyLogicImpl5.sectionOccupancyChanged(side6, sectionOccupancy7);
    safetyLogicImpl5.disconnect();
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper10 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl11 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper10);
    hu.bme.mit.swsv.ris.common.Side side12 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy13 = hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE;
    safetyLogicImpl11.sectionOccupancyChanged(side12, sectionOccupancy13);
    hu.bme.mit.swsv.ris.common.Side side15 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy17 = hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal18 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(10, sectionOccupancy17);
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy19 = sectionOccupancySignal18.getSectionOccupancy();
    safetyLogicImpl11.sectionOccupancyChanged(side15, sectionOccupancy19);
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus23 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side24 = null;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal25 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(byte)100, (int)'a', neighborTSMStatus23, side24);
    java.lang.Integer i26 = heartBeatSignal25.getTargetId();
    java.util.Date date27 = heartBeatSignal25.getTimestamp();
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper28 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl29 = randoopSignalMapper28.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl30 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper28.sectionControlDecision_facing = sectionControl30;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper32 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl33 = randoopSignalMapper32.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl34 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper32.sectionControlDecision_facing = sectionControl34;
    randoopSignalMapper28.sectionControlDecision_straight = sectionControl34;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl39 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    hu.bme.mit.swsv.ris.signals.SectionControlSignal sectionControlSignal40 = new hu.bme.mit.swsv.ris.signals.SectionControlSignal((int)(short)10, 100, sectionControl39);
    randoopSignalMapper28.sectionControlDecision_div = sectionControl39;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper42 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl43 = randoopSignalMapper42.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus44 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper42.neighborsStatus_div = neighborTSMStatus44;
    randoopSignalMapper28.neighborsStatus_div = neighborTSMStatus44;
    safetyLogicImpl5.neighborStatusChanged(side15, date27, neighborTSMStatus44);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper48 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl49 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper48);
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl50 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper48.sectionControlDecision_straight = sectionControl50;
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl52 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper48);
    safetyLogicImpl5.setSignalMapper((hu.bme.mit.swsv.ris.tsm.SignalMapper)randoopSignalMapper48);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper54 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl55 = randoopSignalMapper54.sectionControlDecision_div;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl56 = randoopSignalMapper54.sectionControlDecision_div;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper59 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl60 = randoopSignalMapper59.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper61 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl62 = randoopSignalMapper61.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl63 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper61.sectionControlDecision_facing = sectionControl63;
    randoopSignalMapper59.sectionControlDecision_div = sectionControl63;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus68 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side69 = null;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal70 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(byte)100, (int)'a', neighborTSMStatus68, side69);
    java.lang.String str71 = heartBeatSignal70.toString();
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus72 = heartBeatSignal70.getStatus();
    randoopSignalMapper59.neighborsStatus_straight = neighborTSMStatus72;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper74 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl75 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper74);
    hu.bme.mit.swsv.ris.common.Side side76 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy77 = hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE;
    safetyLogicImpl75.sectionOccupancyChanged(side76, sectionOccupancy77);
    hu.bme.mit.swsv.ris.common.Side side79 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy81 = hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal82 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(10, sectionOccupancy81);
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy83 = sectionOccupancySignal82.getSectionOccupancy();
    safetyLogicImpl75.sectionOccupancyChanged(side79, sectionOccupancy83);
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal85 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)'#', (int)(short)0, neighborTSMStatus72, side79);
    randoopSignalMapper54.neighborsStatus_div = neighborTSMStatus72;
    randoopSignalMapper48.neighborsStatus_facing = neighborTSMStatus72;
    randoopSignalMapper0.neighborsStatus_facing = neighborTSMStatus72;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl1);
    org.junit.Assert.assertTrue("'" + sectionControl2 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl2.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl5);
    org.junit.Assert.assertTrue("'" + side6 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side6.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy7 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy7.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl11);
    org.junit.Assert.assertTrue("'" + side12 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side12.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy13 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy13.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));
    org.junit.Assert.assertTrue("'" + side15 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side15.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy17 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy17.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    org.junit.Assert.assertTrue("'" + sectionOccupancy19 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy19.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus23 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus23.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + 97+ "'", i26.equals(97));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl29);
    org.junit.Assert.assertTrue("'" + sectionControl30 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl30.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl33);
    org.junit.Assert.assertTrue("'" + sectionControl34 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl34.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    org.junit.Assert.assertTrue("'" + sectionControl39 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl39.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl43);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus44 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus44.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl49);
    org.junit.Assert.assertTrue("'" + sectionControl50 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl50.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl62);
    org.junit.Assert.assertTrue("'" + sectionControl63 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl63.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus68 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus68.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str71 + "' != '" + "HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:41 CET 2016)"+ "'", str71.equals("HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:41 CET 2016)"));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus72 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus72.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl75);
    org.junit.Assert.assertTrue("'" + side76 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side76.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy77 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy77.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));
    org.junit.Assert.assertTrue("'" + side79 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side79.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy81 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy81.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    org.junit.Assert.assertTrue("'" + sectionOccupancy83 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy83.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper0 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl1 = randoopSignalMapper0.sectionControlDecision_div;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl4 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    hu.bme.mit.swsv.ris.signals.SectionControlSignal sectionControlSignal5 = new hu.bme.mit.swsv.ris.signals.SectionControlSignal((int)(short)10, 100, sectionControl4);
    randoopSignalMapper0.sectionControlDecision_facing = sectionControl4;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus7 = randoopSignalMapper0.neighborsStatus_facing;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper8 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl9 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper8);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper10 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl11 = randoopSignalMapper10.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus12 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper10.neighborsStatus_div = neighborTSMStatus12;
    safetyLogicImpl9.setSignalMapper((hu.bme.mit.swsv.ris.tsm.SignalMapper)randoopSignalMapper10);
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl15 = randoopSignalMapper10.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper16 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl17 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper16);
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl18 = randoopSignalMapper16.sectionControlDecision_div;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper19 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl20 = randoopSignalMapper19.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus21 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper19.neighborsStatus_div = neighborTSMStatus21;
    randoopSignalMapper16.neighborsStatus_straight = neighborTSMStatus21;
    randoopSignalMapper10.neighborsStatus_div = neighborTSMStatus21;
    randoopSignalMapper0.neighborsStatus_straight = neighborTSMStatus21;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl1);
    org.junit.Assert.assertTrue("'" + sectionControl4 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl4.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(neighborTSMStatus7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl11);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus12 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus12.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl20);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus21 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus21.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper0 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl1 = randoopSignalMapper0.sectionControlDecision_facing;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl2 = randoopSignalMapper0.sectionControlDecision_div;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper3 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl4 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper3);
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl5 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper3.sectionControlDecision_div = sectionControl5;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl7 = randoopSignalMapper3.sectionControlDecision_facing;
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl8 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper3);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper11 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl12 = randoopSignalMapper11.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus13 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper11.neighborsStatus_div = neighborTSMStatus13;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper15 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl16 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper15);
    hu.bme.mit.swsv.ris.common.Side side17 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy18 = hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE;
    safetyLogicImpl16.sectionOccupancyChanged(side17, sectionOccupancy18);
    hu.bme.mit.swsv.ris.common.Side side20 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy22 = hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal23 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(10, sectionOccupancy22);
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy24 = sectionOccupancySignal23.getSectionOccupancy();
    safetyLogicImpl16.sectionOccupancyChanged(side20, sectionOccupancy24);
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal26 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(byte)10, (int)'#', neighborTSMStatus13, side20);
    randoopSignalMapper3.neighborsStatus_facing = neighborTSMStatus13;
    randoopSignalMapper0.neighborsStatus_straight = neighborTSMStatus13;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl4);
    org.junit.Assert.assertTrue("'" + sectionControl5 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl5.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl12);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus13 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus13.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl16);
    org.junit.Assert.assertTrue("'" + side17 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side17.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy18 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy18.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));
    org.junit.Assert.assertTrue("'" + side20 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side20.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy22 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy22.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    org.junit.Assert.assertTrue("'" + sectionOccupancy24 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy24.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test42"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper4 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl5 = randoopSignalMapper4.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus6 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper4.neighborsStatus_div = neighborTSMStatus6;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper8 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl9 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper8);
    hu.bme.mit.swsv.ris.common.Side side10 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy11 = hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE;
    safetyLogicImpl9.sectionOccupancyChanged(side10, sectionOccupancy11);
    hu.bme.mit.swsv.ris.common.Side side13 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy15 = hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal16 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(10, sectionOccupancy15);
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy17 = sectionOccupancySignal16.getSectionOccupancy();
    safetyLogicImpl9.sectionOccupancyChanged(side13, sectionOccupancy17);
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal19 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(byte)10, (int)'#', neighborTSMStatus6, side13);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper20 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl21 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper20);
    hu.bme.mit.swsv.ris.common.Side side22 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy23 = hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE;
    safetyLogicImpl21.sectionOccupancyChanged(side22, sectionOccupancy23);
    safetyLogicImpl21.disconnect();
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper26 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl27 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper26);
    hu.bme.mit.swsv.ris.common.Side side28 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy29 = hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE;
    safetyLogicImpl27.sectionOccupancyChanged(side28, sectionOccupancy29);
    hu.bme.mit.swsv.ris.common.Side side31 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy33 = hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal34 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(10, sectionOccupancy33);
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy35 = sectionOccupancySignal34.getSectionOccupancy();
    safetyLogicImpl27.sectionOccupancyChanged(side31, sectionOccupancy35);
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus39 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side40 = null;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal41 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(byte)100, (int)'a', neighborTSMStatus39, side40);
    java.lang.Integer i42 = heartBeatSignal41.getTargetId();
    java.util.Date date43 = heartBeatSignal41.getTimestamp();
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper44 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl45 = randoopSignalMapper44.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl46 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper44.sectionControlDecision_facing = sectionControl46;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper48 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl49 = randoopSignalMapper48.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl50 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper48.sectionControlDecision_facing = sectionControl50;
    randoopSignalMapper44.sectionControlDecision_straight = sectionControl50;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl55 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    hu.bme.mit.swsv.ris.signals.SectionControlSignal sectionControlSignal56 = new hu.bme.mit.swsv.ris.signals.SectionControlSignal((int)(short)10, 100, sectionControl55);
    randoopSignalMapper44.sectionControlDecision_div = sectionControl55;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper58 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl59 = randoopSignalMapper58.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus60 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper58.neighborsStatus_div = neighborTSMStatus60;
    randoopSignalMapper44.neighborsStatus_div = neighborTSMStatus60;
    safetyLogicImpl21.neighborStatusChanged(side31, date43, neighborTSMStatus60);
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal64 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(short)10, (int)(short)100, neighborTSMStatus6, side31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl5);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus6 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus6.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl9);
    org.junit.Assert.assertTrue("'" + side10 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side10.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy11 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy11.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));
    org.junit.Assert.assertTrue("'" + side13 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side13.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy15 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy15.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    org.junit.Assert.assertTrue("'" + sectionOccupancy17 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy17.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl21);
    org.junit.Assert.assertTrue("'" + side22 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side22.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy23 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy23.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl27);
    org.junit.Assert.assertTrue("'" + side28 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side28.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy29 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy29.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));
    org.junit.Assert.assertTrue("'" + side31 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side31.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy33 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy33.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    org.junit.Assert.assertTrue("'" + sectionOccupancy35 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy35.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus39 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus39.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 97+ "'", i42.equals(97));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl45);
    org.junit.Assert.assertTrue("'" + sectionControl46 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl46.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl49);
    org.junit.Assert.assertTrue("'" + sectionControl50 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl50.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    org.junit.Assert.assertTrue("'" + sectionControl55 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl55.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl59);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus60 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus60.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test43"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper0 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl1 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper0);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper2 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl3 = randoopSignalMapper2.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus4 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper2.neighborsStatus_div = neighborTSMStatus4;
    safetyLogicImpl1.setSignalMapper((hu.bme.mit.swsv.ris.tsm.SignalMapper)randoopSignalMapper2);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper7 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl8 = randoopSignalMapper7.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl9 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper7.sectionControlDecision_facing = sectionControl9;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus11 = randoopSignalMapper7.neighborsStatus_facing;
    safetyLogicImpl1.setSignalMapper((hu.bme.mit.swsv.ris.tsm.SignalMapper)randoopSignalMapper7);
    hu.bme.mit.swsv.ris.common.Direction direction14 = hu.bme.mit.swsv.ris.common.Direction.DIVERGENT;
    hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal turnoutDirectionSignal15 = new hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal((int)(short)10, direction14);
    safetyLogicImpl1.turnoutDirectionChanged(direction14);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper17 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl18 = randoopSignalMapper17.sectionControlDecision_div;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl21 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    hu.bme.mit.swsv.ris.signals.SectionControlSignal sectionControlSignal22 = new hu.bme.mit.swsv.ris.signals.SectionControlSignal((int)(short)10, 100, sectionControl21);
    randoopSignalMapper17.sectionControlDecision_facing = sectionControl21;
    safetyLogicImpl1.setSignalMapper((hu.bme.mit.swsv.ris.tsm.SignalMapper)randoopSignalMapper17);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper29 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl30 = randoopSignalMapper29.sectionControlDecision_div;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus33 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side34 = null;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal35 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(byte)100, (int)'a', neighborTSMStatus33, side34);
    java.lang.String str36 = heartBeatSignal35.toString();
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus37 = heartBeatSignal35.getStatus();
    randoopSignalMapper29.neighborsStatus_facing = neighborTSMStatus37;
    hu.bme.mit.swsv.ris.common.Side side39 = hu.bme.mit.swsv.ris.common.Side.STRAIGHT;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal40 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)' ', (int)(short)0, neighborTSMStatus37, side39);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper41 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl42 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper41);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper43 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl44 = randoopSignalMapper43.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus45 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper43.neighborsStatus_div = neighborTSMStatus45;
    safetyLogicImpl42.setSignalMapper((hu.bme.mit.swsv.ris.tsm.SignalMapper)randoopSignalMapper43);
    safetyLogicImpl42.disconnect();
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper51 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl52 = randoopSignalMapper51.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus53 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper51.neighborsStatus_div = neighborTSMStatus53;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus55 = randoopSignalMapper51.neighborsStatus_facing;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus56 = randoopSignalMapper51.neighborsStatus_div;
    hu.bme.mit.swsv.ris.common.Side side57 = hu.bme.mit.swsv.ris.common.Side.STRAIGHT;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal58 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal(10, (int)(short)10, neighborTSMStatus56, side57);
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy60 = hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal61 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(10, sectionOccupancy60);
    java.lang.String str62 = sectionOccupancySignal61.toString();
    java.lang.String str63 = sectionOccupancySignal61.toString();
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy64 = sectionOccupancySignal61.getSectionOccupancy();
    safetyLogicImpl42.sectionOccupancyChanged(side57, sectionOccupancy64);
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal66 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(short)0, (int)(short)1, neighborTSMStatus37, side57);
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy69 = hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal70 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(10, sectionOccupancy69);
    java.lang.String str71 = sectionOccupancySignal70.toString();
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy72 = sectionOccupancySignal70.getSectionOccupancy();
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal73 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal((int)(byte)0, sectionOccupancy72);
    safetyLogicImpl1.sectionOccupancyChanged(side57, sectionOccupancy72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl3);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus4 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus4.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl8);
    org.junit.Assert.assertTrue("'" + sectionControl9 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl9.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(neighborTSMStatus11);
    org.junit.Assert.assertTrue("'" + direction14 + "' != '" + hu.bme.mit.swsv.ris.common.Direction.DIVERGENT + "'", direction14.equals(hu.bme.mit.swsv.ris.common.Direction.DIVERGENT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl18);
    org.junit.Assert.assertTrue("'" + sectionControl21 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl21.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl30);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus33 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus33.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:43 CET 2016)"+ "'", str36.equals("HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:43 CET 2016)"));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus37 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus37.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side39 + "' != '" + hu.bme.mit.swsv.ris.common.Side.STRAIGHT + "'", side39.equals(hu.bme.mit.swsv.ris.common.Side.STRAIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl44);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus45 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus45.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl52);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus53 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus53.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(neighborTSMStatus55);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus56 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus56.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side57 + "' != '" + hu.bme.mit.swsv.ris.common.Side.STRAIGHT + "'", side57.equals(hu.bme.mit.swsv.ris.common.Side.STRAIGHT));
    org.junit.Assert.assertTrue("'" + sectionOccupancy60 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy60.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str62 + "' != '" + "SectionOccupancySignal(sender: 10, occupancy: OCCUPIED)"+ "'", str62.equals("SectionOccupancySignal(sender: 10, occupancy: OCCUPIED)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str63 + "' != '" + "SectionOccupancySignal(sender: 10, occupancy: OCCUPIED)"+ "'", str63.equals("SectionOccupancySignal(sender: 10, occupancy: OCCUPIED)"));
    org.junit.Assert.assertTrue("'" + sectionOccupancy64 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy64.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    org.junit.Assert.assertTrue("'" + sectionOccupancy69 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy69.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str71 + "' != '" + "SectionOccupancySignal(sender: 10, occupancy: OCCUPIED)"+ "'", str71.equals("SectionOccupancySignal(sender: 10, occupancy: OCCUPIED)"));
    org.junit.Assert.assertTrue("'" + sectionOccupancy72 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy72.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test44"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper1 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl2 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper1);
    hu.bme.mit.swsv.ris.common.Side side3 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy4 = hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE;
    safetyLogicImpl2.sectionOccupancyChanged(side3, sectionOccupancy4);
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal6 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(0, sectionOccupancy4);
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy7 = sectionOccupancySignal6.getSectionOccupancy();
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy8 = sectionOccupancySignal6.getSectionOccupancy();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl2);
    org.junit.Assert.assertTrue("'" + side3 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side3.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy4 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy4.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));
    org.junit.Assert.assertTrue("'" + sectionOccupancy7 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy7.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));
    org.junit.Assert.assertTrue("'" + sectionOccupancy8 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy8.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test45"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper0 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl1 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper0);
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl2 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper0.sectionControlDecision_straight = sectionControl2;
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl4 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper0);
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus5 = null;
    randoopSignalMapper0.neighborsStatus_facing = neighborTSMStatus5;
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl7 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper0);
    hu.bme.mit.swsv.ris.common.Side side8 = hu.bme.mit.swsv.ris.common.Side.STRAIGHT;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper11 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl12 = randoopSignalMapper11.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper13 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl14 = randoopSignalMapper13.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl15 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper13.sectionControlDecision_facing = sectionControl15;
    randoopSignalMapper11.sectionControlDecision_div = sectionControl15;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus20 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side21 = null;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal22 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(byte)100, (int)'a', neighborTSMStatus20, side21);
    java.lang.String str23 = heartBeatSignal22.toString();
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus24 = heartBeatSignal22.getStatus();
    randoopSignalMapper11.neighborsStatus_straight = neighborTSMStatus24;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper26 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl27 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper26);
    hu.bme.mit.swsv.ris.common.Side side28 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy29 = hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE;
    safetyLogicImpl27.sectionOccupancyChanged(side28, sectionOccupancy29);
    hu.bme.mit.swsv.ris.common.Side side31 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy33 = hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal34 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(10, sectionOccupancy33);
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy35 = sectionOccupancySignal34.getSectionOccupancy();
    safetyLogicImpl27.sectionOccupancyChanged(side31, sectionOccupancy35);
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal37 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)'#', (int)(short)0, neighborTSMStatus24, side31);
    java.util.Date date38 = heartBeatSignal37.getTimestamp();
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper39 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl40 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper39);
    hu.bme.mit.swsv.ris.common.Side side41 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy42 = hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE;
    safetyLogicImpl40.sectionOccupancyChanged(side41, sectionOccupancy42);
    safetyLogicImpl40.disconnect();
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper45 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl46 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper45);
    hu.bme.mit.swsv.ris.common.Side side47 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy48 = hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE;
    safetyLogicImpl46.sectionOccupancyChanged(side47, sectionOccupancy48);
    hu.bme.mit.swsv.ris.common.Side side50 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy52 = hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal53 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(10, sectionOccupancy52);
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy54 = sectionOccupancySignal53.getSectionOccupancy();
    safetyLogicImpl46.sectionOccupancyChanged(side50, sectionOccupancy54);
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus58 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side59 = null;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal60 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(byte)100, (int)'a', neighborTSMStatus58, side59);
    java.lang.Integer i61 = heartBeatSignal60.getTargetId();
    java.util.Date date62 = heartBeatSignal60.getTimestamp();
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper63 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl64 = randoopSignalMapper63.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl65 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper63.sectionControlDecision_facing = sectionControl65;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper67 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl68 = randoopSignalMapper67.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl69 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper67.sectionControlDecision_facing = sectionControl69;
    randoopSignalMapper63.sectionControlDecision_straight = sectionControl69;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl74 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    hu.bme.mit.swsv.ris.signals.SectionControlSignal sectionControlSignal75 = new hu.bme.mit.swsv.ris.signals.SectionControlSignal((int)(short)10, 100, sectionControl74);
    randoopSignalMapper63.sectionControlDecision_div = sectionControl74;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper77 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl78 = randoopSignalMapper77.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus79 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper77.neighborsStatus_div = neighborTSMStatus79;
    randoopSignalMapper63.neighborsStatus_div = neighborTSMStatus79;
    safetyLogicImpl40.neighborStatusChanged(side50, date62, neighborTSMStatus79);
    safetyLogicImpl7.neighborStatusChanged(side8, date38, neighborTSMStatus79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl1);
    org.junit.Assert.assertTrue("'" + sectionControl2 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl2.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl7);
    org.junit.Assert.assertTrue("'" + side8 + "' != '" + hu.bme.mit.swsv.ris.common.Side.STRAIGHT + "'", side8.equals(hu.bme.mit.swsv.ris.common.Side.STRAIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl14);
    org.junit.Assert.assertTrue("'" + sectionControl15 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl15.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus20 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus20.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:45 CET 2016)"+ "'", str23.equals("HeartBeatSignal(sender: 100 (null), target: 97, status: ALLOWED, timestamp: Sun Nov 27 19:48:45 CET 2016)"));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus24 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus24.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl27);
    org.junit.Assert.assertTrue("'" + side28 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side28.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy29 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy29.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));
    org.junit.Assert.assertTrue("'" + side31 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side31.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy33 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy33.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    org.junit.Assert.assertTrue("'" + sectionOccupancy35 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy35.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl40);
    org.junit.Assert.assertTrue("'" + side41 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side41.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy42 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy42.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl46);
    org.junit.Assert.assertTrue("'" + side47 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side47.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy48 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy48.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));
    org.junit.Assert.assertTrue("'" + side50 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side50.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy52 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy52.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    org.junit.Assert.assertTrue("'" + sectionOccupancy54 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy54.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus58 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus58.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + 97+ "'", i61.equals(97));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl64);
    org.junit.Assert.assertTrue("'" + sectionControl65 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl65.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl68);
    org.junit.Assert.assertTrue("'" + sectionControl69 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl69.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    org.junit.Assert.assertTrue("'" + sectionControl74 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl74.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl78);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus79 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus79.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));

  }

}
