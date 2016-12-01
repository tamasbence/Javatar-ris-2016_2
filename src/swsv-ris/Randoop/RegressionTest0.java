
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper1 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl2 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper1);
    hu.bme.mit.swsv.ris.common.Side side3 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy4 = hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE;
    safetyLogicImpl2.sectionOccupancyChanged(side3, sectionOccupancy4);
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal6 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(0, sectionOccupancy4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl2);
    org.junit.Assert.assertTrue("'" + side3 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side3.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy4 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy4.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper0 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl1 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper0);
    hu.bme.mit.swsv.ris.common.Direction direction2 = hu.bme.mit.swsv.ris.common.Direction.STRAIGHT;
    safetyLogicImpl1.turnoutDirectionChanged(direction2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl1);
    org.junit.Assert.assertTrue("'" + direction2 + "' != '" + hu.bme.mit.swsv.ris.common.Direction.STRAIGHT + "'", direction2.equals(hu.bme.mit.swsv.ris.common.Direction.STRAIGHT));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }


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

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }


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

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }


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
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }


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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl5);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus8 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus8.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
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

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }


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
    org.junit.Assert.assertTrue("'" + neighborTSMStatus22 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus22.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side24 + "' != '" + hu.bme.mit.swsv.ris.common.Side.STRAIGHT + "'", side24.equals(hu.bme.mit.swsv.ris.common.Side.STRAIGHT));
    org.junit.Assert.assertTrue("'" + sectionOccupancy27 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy27.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }


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
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }


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
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }


    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper0 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl1 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper0);
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl2 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    randoopSignalMapper0.sectionControlDecision_div = sectionControl2;
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl4 = randoopSignalMapper0.sectionControlDecision_facing;
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl5 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper0);
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper8 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl9 = randoopSignalMapper8.sectionControlDecision_straight;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus10 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    randoopSignalMapper8.neighborsStatus_div = neighborTSMStatus10;
    hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper randoopSignalMapper12 = new hu.bme.mit.swsv.ris.randoop.RandoopSignalMapper();
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl13 = hu.bme.mit.swsv.ris.randoop.RandoopTestInitializer.createSafetyLogicImpl(randoopSignalMapper12);
    hu.bme.mit.swsv.ris.common.Side side14 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy15 = hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE;
    safetyLogicImpl13.sectionOccupancyChanged(side14, sectionOccupancy15);
    hu.bme.mit.swsv.ris.common.Side side17 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy19 = hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal20 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(10, sectionOccupancy19);
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy21 = sectionOccupancySignal20.getSectionOccupancy();
    safetyLogicImpl13.sectionOccupancyChanged(side17, sectionOccupancy21);
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal23 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(byte)10, (int)'#', neighborTSMStatus10, side17);
    randoopSignalMapper0.neighborsStatus_facing = neighborTSMStatus10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl1);
    org.junit.Assert.assertTrue("'" + sectionControl2 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl2.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl9);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus10 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus10.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(safetyLogicImpl13);
    org.junit.Assert.assertTrue("'" + side14 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side14.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy15 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE + "'", sectionOccupancy15.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.FREE));
    org.junit.Assert.assertTrue("'" + side17 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side17.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + sectionOccupancy19 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy19.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));
    org.junit.Assert.assertTrue("'" + sectionOccupancy21 + "' != '" + hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED + "'", sectionOccupancy21.equals(hu.bme.mit.swsv.ris.common.SectionOccupancy.OCCUPIED));

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

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }


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
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }


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
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }


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
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }


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

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }


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
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }


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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionControl5);
    org.junit.Assert.assertTrue("'" + sectionControl6 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl6.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus11 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus11.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
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

  }

}
