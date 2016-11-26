
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }


    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus0 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.DENIED;
    org.junit.Assert.assertTrue("'" + neighborTSMStatus0 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.DENIED + "'", neighborTSMStatus0.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.DENIED));

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }


    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy1 = null;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal2 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal((int)(byte)0, sectionOccupancy1);
    java.lang.Integer i3 = sectionOccupancySignal2.getSenderId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 0+ "'", i3.equals(0));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }


    hu.bme.mit.swsv.ris.common.SideTriple<hu.bme.mit.swsv.ris.common.SectionOccupancy> sidetriple_sectionOccupancy0 = null;
    hu.bme.mit.swsv.ris.common.Direction direction1 = null;
    hu.bme.mit.swsv.ris.common.SideTriple<hu.bme.mit.swsv.ris.common.NeighborTSMInfo> sidetriple_neighborTSMInfo2 = null;
    hu.bme.mit.swsv.ris.common.logging.LoggerWrapper loggerWrapper3 = null;
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl4 = new hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl(sidetriple_sectionOccupancy0, direction1, sidetriple_neighborTSMInfo2, loggerWrapper3);
    hu.bme.mit.swsv.ris.tsm.SignalMapper signalMapper5 = null;
    safetyLogicImpl4.setSignalMapper(signalMapper5);
    hu.bme.mit.swsv.ris.common.Side side7 = null;
    java.util.Date date8 = null;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus11 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side12 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal13 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(short)1, 0, neighborTSMStatus11, side12);
    // The following exception was thrown during execution in test generation
    try {
    safetyLogicImpl4.neighborStatusChanged(side7, date8, neighborTSMStatus11);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    org.junit.Assert.assertTrue("'" + neighborTSMStatus11 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus11.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side12 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side12.equals(hu.bme.mit.swsv.ris.common.Side.FACING));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }


    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy1 = null;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal2 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal((int)(byte)10, sectionOccupancy1);
    java.lang.Integer i3 = sectionOccupancySignal2.getSenderId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 10+ "'", i3.equals(10));

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }


    hu.bme.mit.swsv.ris.common.SideTriple<java.lang.String> sidetriple_str3 = hu.bme.mit.swsv.ris.common.SideTriple.of("hi!", "hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sidetriple_str3);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }


    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy1 = null;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal2 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(10, sectionOccupancy1);
    java.lang.Integer i3 = sectionOccupancySignal2.getSenderId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 10+ "'", i3.equals(10));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }


    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy1 = null;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal2 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(10, sectionOccupancy1);
    java.lang.String str3 = sectionOccupancySignal2.toString();
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy4 = sectionOccupancySignal2.getSectionOccupancy();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "SectionOccupancySignal(sender: 10, occupancy: null)"+ "'", str3.equals("SectionOccupancySignal(sender: 10, occupancy: null)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sectionOccupancy4);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }


    hu.bme.mit.swsv.ris.common.SideTriple<hu.bme.mit.swsv.ris.common.SectionOccupancy> sidetriple_sectionOccupancy0 = null;
    hu.bme.mit.swsv.ris.common.Direction direction1 = null;
    hu.bme.mit.swsv.ris.common.SideTriple<hu.bme.mit.swsv.ris.common.NeighborTSMInfo> sidetriple_neighborTSMInfo2 = null;
    hu.bme.mit.swsv.ris.common.logging.LoggerWrapper loggerWrapper3 = null;
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl4 = new hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl(sidetriple_sectionOccupancy0, direction1, sidetriple_neighborTSMInfo2, loggerWrapper3);
    hu.bme.mit.swsv.ris.common.Direction direction5 = null;
    // The following exception was thrown during execution in test generation
    try {
    safetyLogicImpl4.turnoutDirectionChanged(direction5);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }


    hu.bme.mit.swsv.ris.common.SideTriple<hu.bme.mit.swsv.ris.common.SectionOccupancy> sidetriple_sectionOccupancy0 = null;
    hu.bme.mit.swsv.ris.common.Direction direction1 = null;
    hu.bme.mit.swsv.ris.common.SideTriple<hu.bme.mit.swsv.ris.common.NeighborTSMInfo> sidetriple_neighborTSMInfo2 = null;
    hu.bme.mit.swsv.ris.common.logging.LoggerWrapper loggerWrapper3 = null;
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl4 = new hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl(sidetriple_sectionOccupancy0, direction1, sidetriple_neighborTSMInfo2, loggerWrapper3);
    hu.bme.mit.swsv.ris.tsm.SignalMapper signalMapper5 = null;
    safetyLogicImpl4.setSignalMapper(signalMapper5);
    safetyLogicImpl4.disconnect();
    hu.bme.mit.swsv.ris.common.Side side8 = hu.bme.mit.swsv.ris.common.Side.DIVERGENT;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus11 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side12 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal13 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(short)1, 0, neighborTSMStatus11, side12);
    java.util.Date date14 = heartBeatSignal13.getTimestamp();
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus17 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side18 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal19 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(short)1, 0, neighborTSMStatus17, side18);
    // The following exception was thrown during execution in test generation
    try {
    safetyLogicImpl4.neighborStatusChanged(side8, date14, neighborTSMStatus17);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    org.junit.Assert.assertTrue("'" + side8 + "' != '" + hu.bme.mit.swsv.ris.common.Side.DIVERGENT + "'", side8.equals(hu.bme.mit.swsv.ris.common.Side.DIVERGENT));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus11 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus11.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side12 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side12.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date14);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus17 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus17.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side18 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side18.equals(hu.bme.mit.swsv.ris.common.Side.FACING));

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }


    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy1 = null;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal2 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(10, sectionOccupancy1);
    java.lang.String str3 = sectionOccupancySignal2.toString();
    java.lang.String str4 = sectionOccupancySignal2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "SectionOccupancySignal(sender: 10, occupancy: null)"+ "'", str3.equals("SectionOccupancySignal(sender: 10, occupancy: null)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "SectionOccupancySignal(sender: 10, occupancy: null)"+ "'", str4.equals("SectionOccupancySignal(sender: 10, occupancy: null)"));

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }


    hu.bme.mit.swsv.ris.common.SectionControl sectionControl2 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    hu.bme.mit.swsv.ris.signals.SectionControlSignal sectionControlSignal3 = new hu.bme.mit.swsv.ris.signals.SectionControlSignal(10, (int)(byte)100, sectionControl2);
    java.lang.String str4 = sectionControlSignal3.toString();
    org.junit.Assert.assertTrue("'" + sectionControl2 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl2.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "SectionControlSignal(sender: 10, target: 100, control: DISABLED)"+ "'", str4.equals("SectionControlSignal(sender: 10, target: 100, control: DISABLED)"));

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }


    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus2 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side3 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal4 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(short)1, 0, neighborTSMStatus2, side3);
    java.util.Date date5 = heartBeatSignal4.getTimestamp();
    java.lang.String str6 = heartBeatSignal4.toString();
    java.lang.Integer i7 = heartBeatSignal4.getTargetId();
    java.lang.Integer i8 = heartBeatSignal4.getSenderId();
    org.junit.Assert.assertTrue("'" + neighborTSMStatus2 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus2.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side3 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side3.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "HeartBeatSignal(sender: 1 (FACING), target: 0, status: ALLOWED, timestamp: Thu Nov 24 22:41:52 CET 2016)"+ "'", str6.equals("HeartBeatSignal(sender: 1 (FACING), target: 0, status: ALLOWED, timestamp: Thu Nov 24 22:41:52 CET 2016)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 0+ "'", i7.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 1+ "'", i8.equals(1));

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }


    hu.bme.mit.swsv.ris.common.SideTriple<hu.bme.mit.swsv.ris.common.SectionOccupancy> sidetriple_sectionOccupancy0 = null;
    hu.bme.mit.swsv.ris.common.Direction direction1 = null;
    hu.bme.mit.swsv.ris.common.SideTriple<hu.bme.mit.swsv.ris.common.NeighborTSMInfo> sidetriple_neighborTSMInfo2 = null;
    hu.bme.mit.swsv.ris.common.logging.LoggerWrapper loggerWrapper3 = null;
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl4 = new hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl(sidetriple_sectionOccupancy0, direction1, sidetriple_neighborTSMInfo2, loggerWrapper3);
    hu.bme.mit.swsv.ris.tsm.SignalMapper signalMapper5 = null;
    safetyLogicImpl4.setSignalMapper(signalMapper5);
    safetyLogicImpl4.disconnect();
    hu.bme.mit.swsv.ris.common.Side side8 = hu.bme.mit.swsv.ris.common.Side.STRAIGHT;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus11 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side12 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal13 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(short)1, 0, neighborTSMStatus11, side12);
    java.util.Date date14 = heartBeatSignal13.getTimestamp();
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus15 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    // The following exception was thrown during execution in test generation
    try {
    safetyLogicImpl4.neighborStatusChanged(side8, date14, neighborTSMStatus15);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    org.junit.Assert.assertTrue("'" + side8 + "' != '" + hu.bme.mit.swsv.ris.common.Side.STRAIGHT + "'", side8.equals(hu.bme.mit.swsv.ris.common.Side.STRAIGHT));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus11 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus11.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side12 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side12.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date14);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus15 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus15.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }


    hu.bme.mit.swsv.ris.common.SideTriple<hu.bme.mit.swsv.ris.common.SectionOccupancy> sidetriple_sectionOccupancy0 = null;
    hu.bme.mit.swsv.ris.common.Direction direction1 = null;
    hu.bme.mit.swsv.ris.common.SideTriple<hu.bme.mit.swsv.ris.common.NeighborTSMInfo> sidetriple_neighborTSMInfo2 = null;
    hu.bme.mit.swsv.ris.common.logging.LoggerWrapper loggerWrapper3 = null;
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl4 = new hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl(sidetriple_sectionOccupancy0, direction1, sidetriple_neighborTSMInfo2, loggerWrapper3);
    hu.bme.mit.swsv.ris.tsm.SignalMapper signalMapper5 = null;
    safetyLogicImpl4.setSignalMapper(signalMapper5);
    hu.bme.mit.swsv.ris.common.Side side7 = hu.bme.mit.swsv.ris.common.Side.STRAIGHT;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy8 = null;
    // The following exception was thrown during execution in test generation
    try {
    safetyLogicImpl4.sectionOccupancyChanged(side7, sectionOccupancy8);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    org.junit.Assert.assertTrue("'" + side7 + "' != '" + hu.bme.mit.swsv.ris.common.Side.STRAIGHT + "'", side7.equals(hu.bme.mit.swsv.ris.common.Side.STRAIGHT));

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }


    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus2 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side3 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal4 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(short)1, 0, neighborTSMStatus2, side3);
    java.util.Date date5 = heartBeatSignal4.getTimestamp();
    java.lang.Integer i6 = heartBeatSignal4.getTargetId();
    java.lang.Integer i7 = heartBeatSignal4.getTargetId();
    org.junit.Assert.assertTrue("'" + neighborTSMStatus2 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus2.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side3 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side3.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 0+ "'", i6.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 0+ "'", i7.equals(0));

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }


    hu.bme.mit.swsv.ris.common.SectionControl sectionControl2 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    hu.bme.mit.swsv.ris.signals.SectionControlSignal sectionControlSignal3 = new hu.bme.mit.swsv.ris.signals.SectionControlSignal(10, (int)(byte)100, sectionControl2);
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl4 = sectionControlSignal3.getSectionControl();
    org.junit.Assert.assertTrue("'" + sectionControl2 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl2.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    org.junit.Assert.assertTrue("'" + sectionControl4 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl4.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }


    hu.bme.mit.swsv.ris.common.SideTriple<hu.bme.mit.swsv.ris.common.SectionOccupancy> sidetriple_sectionOccupancy0 = null;
    hu.bme.mit.swsv.ris.common.Direction direction1 = null;
    hu.bme.mit.swsv.ris.common.SideTriple<hu.bme.mit.swsv.ris.common.NeighborTSMInfo> sidetriple_neighborTSMInfo2 = null;
    hu.bme.mit.swsv.ris.common.logging.LoggerWrapper loggerWrapper3 = null;
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl4 = new hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl(sidetriple_sectionOccupancy0, direction1, sidetriple_neighborTSMInfo2, loggerWrapper3);
    hu.bme.mit.swsv.ris.tsm.SignalMapper signalMapper5 = null;
    safetyLogicImpl4.setSignalMapper(signalMapper5);
    safetyLogicImpl4.disconnect();
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus12 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side13 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal14 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(short)1, 0, neighborTSMStatus12, side13);
    java.util.Date date15 = heartBeatSignal14.getTimestamp();
    java.lang.Integer i16 = heartBeatSignal14.getTargetId();
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus17 = heartBeatSignal14.getStatus();
    hu.bme.mit.swsv.ris.common.Side side18 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal19 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)'#', (int)(byte)-1, neighborTSMStatus17, side18);
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus22 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side23 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal24 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(short)1, 0, neighborTSMStatus22, side23);
    java.util.Date date25 = heartBeatSignal24.getTimestamp();
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus30 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side31 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal32 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(short)1, 0, neighborTSMStatus30, side31);
    java.util.Date date33 = heartBeatSignal32.getTimestamp();
    java.lang.Integer i34 = heartBeatSignal32.getTargetId();
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus35 = heartBeatSignal32.getStatus();
    hu.bme.mit.swsv.ris.common.Side side36 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal37 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)'#', (int)(byte)-1, neighborTSMStatus35, side36);
    // The following exception was thrown during execution in test generation
    try {
    safetyLogicImpl4.neighborStatusChanged(side18, date25, neighborTSMStatus35);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    org.junit.Assert.assertTrue("'" + neighborTSMStatus12 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus12.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side13 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side13.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 0+ "'", i16.equals(0));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus17 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus17.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side18 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side18.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus22 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus22.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side23 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side23.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date25);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus30 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus30.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side31 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side31.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + 0+ "'", i34.equals(0));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus35 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus35.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side36 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side36.equals(hu.bme.mit.swsv.ris.common.Side.FACING));

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }


    hu.bme.mit.swsv.ris.common.SectionControl sectionControl2 = hu.bme.mit.swsv.ris.common.SectionControl.ENABLED;
    hu.bme.mit.swsv.ris.signals.SectionControlSignal sectionControlSignal3 = new hu.bme.mit.swsv.ris.signals.SectionControlSignal((int)'a', (int)' ', sectionControl2);
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl4 = sectionControlSignal3.getSectionControl();
    org.junit.Assert.assertTrue("'" + sectionControl2 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.ENABLED + "'", sectionControl2.equals(hu.bme.mit.swsv.ris.common.SectionControl.ENABLED));
    org.junit.Assert.assertTrue("'" + sectionControl4 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.ENABLED + "'", sectionControl4.equals(hu.bme.mit.swsv.ris.common.SectionControl.ENABLED));

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }


    hu.bme.mit.swsv.ris.common.SideTriple<hu.bme.mit.swsv.ris.common.SectionOccupancy> sidetriple_sectionOccupancy0 = null;
    hu.bme.mit.swsv.ris.common.Direction direction1 = null;
    hu.bme.mit.swsv.ris.common.SideTriple<hu.bme.mit.swsv.ris.common.NeighborTSMInfo> sidetriple_neighborTSMInfo2 = null;
    hu.bme.mit.swsv.ris.common.logging.LoggerWrapper loggerWrapper3 = null;
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl4 = new hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl(sidetriple_sectionOccupancy0, direction1, sidetriple_neighborTSMInfo2, loggerWrapper3);
    hu.bme.mit.swsv.ris.tsm.SignalMapper signalMapper5 = null;
    safetyLogicImpl4.setSignalMapper(signalMapper5);
    safetyLogicImpl4.disconnect();
    hu.bme.mit.swsv.ris.common.Side side8 = hu.bme.mit.swsv.ris.common.Side.STRAIGHT;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus11 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side12 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal13 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(short)1, 0, neighborTSMStatus11, side12);
    java.util.Date date14 = heartBeatSignal13.getTimestamp();
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus17 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side18 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal19 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(short)1, 0, neighborTSMStatus17, side18);
    java.util.Date date20 = heartBeatSignal19.getTimestamp();
    java.lang.String str21 = heartBeatSignal19.toString();
    java.lang.Integer i22 = heartBeatSignal19.getTargetId();
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus23 = heartBeatSignal19.getStatus();
    // The following exception was thrown during execution in test generation
    try {
    safetyLogicImpl4.neighborStatusChanged(side8, date14, neighborTSMStatus23);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    org.junit.Assert.assertTrue("'" + side8 + "' != '" + hu.bme.mit.swsv.ris.common.Side.STRAIGHT + "'", side8.equals(hu.bme.mit.swsv.ris.common.Side.STRAIGHT));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus11 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus11.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side12 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side12.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date14);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus17 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus17.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side18 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side18.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "HeartBeatSignal(sender: 1 (FACING), target: 0, status: ALLOWED, timestamp: Thu Nov 24 22:41:53 CET 2016)"+ "'", str21.equals("HeartBeatSignal(sender: 1 (FACING), target: 0, status: ALLOWED, timestamp: Thu Nov 24 22:41:53 CET 2016)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + 0+ "'", i22.equals(0));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus23 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus23.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }


    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy1 = null;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal2 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal((int)(short)100, sectionOccupancy1);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }


    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy1 = null;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal2 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal((int)(short)-1, sectionOccupancy1);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }


    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy1 = null;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal2 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal((int)(byte)-1, sectionOccupancy1);
    java.lang.String str3 = sectionOccupancySignal2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "SectionOccupancySignal(sender: -1, occupancy: null)"+ "'", str3.equals("SectionOccupancySignal(sender: -1, occupancy: null)"));

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }


    hu.bme.mit.swsv.ris.common.SideTriple<hu.bme.mit.swsv.ris.common.SectionOccupancy> sidetriple_sectionOccupancy0 = null;
    hu.bme.mit.swsv.ris.common.Direction direction1 = null;
    hu.bme.mit.swsv.ris.common.SideTriple<hu.bme.mit.swsv.ris.common.NeighborTSMInfo> sidetriple_neighborTSMInfo2 = null;
    hu.bme.mit.swsv.ris.common.logging.LoggerWrapper loggerWrapper3 = null;
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl4 = new hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl(sidetriple_sectionOccupancy0, direction1, sidetriple_neighborTSMInfo2, loggerWrapper3);
    hu.bme.mit.swsv.ris.tsm.SignalMapper signalMapper5 = null;
    safetyLogicImpl4.setSignalMapper(signalMapper5);
    hu.bme.mit.swsv.ris.common.Direction direction7 = null;
    // The following exception was thrown during execution in test generation
    try {
    safetyLogicImpl4.turnoutDirectionChanged(direction7);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }


    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy1 = null;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal2 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal((int)(byte)100, sectionOccupancy1);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }


    hu.bme.mit.swsv.ris.common.Direction direction1 = null;
    hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal turnoutDirectionSignal2 = new hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal((int)(short)10, direction1);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }


    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus2 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side3 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal4 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(short)1, 0, neighborTSMStatus2, side3);
    java.lang.Integer i5 = heartBeatSignal4.getTargetId();
    org.junit.Assert.assertTrue("'" + neighborTSMStatus2 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus2.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side3 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side3.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 0+ "'", i5.equals(0));

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }


    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy1 = null;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal2 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(100, sectionOccupancy1);
    java.lang.String str3 = sectionOccupancySignal2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "SectionOccupancySignal(sender: 100, occupancy: null)"+ "'", str3.equals("SectionOccupancySignal(sender: 100, occupancy: null)"));

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }


    hu.bme.mit.swsv.ris.common.SideTriple<hu.bme.mit.swsv.ris.common.SectionOccupancy> sidetriple_sectionOccupancy0 = null;
    hu.bme.mit.swsv.ris.common.Direction direction1 = null;
    hu.bme.mit.swsv.ris.common.SideTriple<hu.bme.mit.swsv.ris.common.NeighborTSMInfo> sidetriple_neighborTSMInfo2 = null;
    hu.bme.mit.swsv.ris.common.logging.LoggerWrapper loggerWrapper3 = null;
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl4 = new hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl(sidetriple_sectionOccupancy0, direction1, sidetriple_neighborTSMInfo2, loggerWrapper3);
    hu.bme.mit.swsv.ris.tsm.SignalMapper signalMapper5 = null;
    safetyLogicImpl4.setSignalMapper(signalMapper5);
    hu.bme.mit.swsv.ris.tsm.SignalMapper signalMapper7 = null;
    safetyLogicImpl4.setSignalMapper(signalMapper7);
    hu.bme.mit.swsv.ris.common.Direction direction9 = null;
    // The following exception was thrown during execution in test generation
    try {
    safetyLogicImpl4.turnoutDirectionChanged(direction9);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }


    hu.bme.mit.swsv.ris.common.SideTriple<java.lang.String> sidetriple_str3 = hu.bme.mit.swsv.ris.common.SideTriple.of("hi!", "SectionOccupancySignal(sender: -1, occupancy: null)", "HeartBeatSignal(sender: 1 (FACING), target: 0, status: ALLOWED, timestamp: Thu Nov 24 22:41:53 CET 2016)");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sidetriple_str3);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }


    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy1 = null;
    hu.bme.mit.swsv.ris.signals.SectionOccupancySignal sectionOccupancySignal2 = new hu.bme.mit.swsv.ris.signals.SectionOccupancySignal(0, sectionOccupancy1);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }


    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus2 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side3 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal4 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(short)1, 0, neighborTSMStatus2, side3);
    java.util.Date date5 = heartBeatSignal4.getTimestamp();
    java.lang.Integer i6 = heartBeatSignal4.getTargetId();
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus7 = heartBeatSignal4.getStatus();
    java.lang.Integer i8 = heartBeatSignal4.getTargetId();
    java.lang.String str9 = heartBeatSignal4.toString();
    java.lang.String str10 = heartBeatSignal4.toString();
    org.junit.Assert.assertTrue("'" + neighborTSMStatus2 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus2.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side3 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side3.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 0+ "'", i6.equals(0));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus7 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus7.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 0+ "'", i8.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "HeartBeatSignal(sender: 1 (FACING), target: 0, status: ALLOWED, timestamp: Thu Nov 24 22:41:53 CET 2016)"+ "'", str9.equals("HeartBeatSignal(sender: 1 (FACING), target: 0, status: ALLOWED, timestamp: Thu Nov 24 22:41:53 CET 2016)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "HeartBeatSignal(sender: 1 (FACING), target: 0, status: ALLOWED, timestamp: Thu Nov 24 22:41:53 CET 2016)"+ "'", str10.equals("HeartBeatSignal(sender: 1 (FACING), target: 0, status: ALLOWED, timestamp: Thu Nov 24 22:41:53 CET 2016)"));

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }


    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus2 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side3 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal4 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(short)1, 0, neighborTSMStatus2, side3);
    java.util.Date date5 = heartBeatSignal4.getTimestamp();
    java.lang.String str6 = heartBeatSignal4.toString();
    java.lang.Integer i7 = heartBeatSignal4.getTargetId();
    java.lang.String str8 = heartBeatSignal4.toString();
    org.junit.Assert.assertTrue("'" + neighborTSMStatus2 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus2.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side3 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side3.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "HeartBeatSignal(sender: 1 (FACING), target: 0, status: ALLOWED, timestamp: Thu Nov 24 22:41:53 CET 2016)"+ "'", str6.equals("HeartBeatSignal(sender: 1 (FACING), target: 0, status: ALLOWED, timestamp: Thu Nov 24 22:41:53 CET 2016)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 0+ "'", i7.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "HeartBeatSignal(sender: 1 (FACING), target: 0, status: ALLOWED, timestamp: Thu Nov 24 22:41:53 CET 2016)"+ "'", str8.equals("HeartBeatSignal(sender: 1 (FACING), target: 0, status: ALLOWED, timestamp: Thu Nov 24 22:41:53 CET 2016)"));

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }


    hu.bme.mit.swsv.ris.common.Direction direction1 = null;
    hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal turnoutDirectionSignal2 = new hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal((int)' ', direction1);
    hu.bme.mit.swsv.ris.common.Direction direction3 = turnoutDirectionSignal2.getTurnoutDirection();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(direction3);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }


    hu.bme.mit.swsv.ris.common.Direction direction1 = null;
    hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal turnoutDirectionSignal2 = new hu.bme.mit.swsv.ris.signals.TurnoutDirectionSignal(0, direction1);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }


    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus4 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side5 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal6 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(short)1, 0, neighborTSMStatus4, side5);
    java.util.Date date7 = heartBeatSignal6.getTimestamp();
    java.lang.Integer i8 = heartBeatSignal6.getTargetId();
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus9 = heartBeatSignal6.getStatus();
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus12 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side13 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal14 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(short)1, 0, neighborTSMStatus12, side13);
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal15 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(byte)10, 10, neighborTSMStatus9, side13);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus4 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus4.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side5 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side5.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 0+ "'", i8.equals(0));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus9 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus9.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus12 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus12.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side13 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side13.equals(hu.bme.mit.swsv.ris.common.Side.FACING));

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }


    hu.bme.mit.swsv.ris.common.SideTriple<java.lang.String> sidetriple_str3 = hu.bme.mit.swsv.ris.common.SideTriple.of("hi!", "hi!", "SectionOccupancySignal(sender: 10, occupancy: null)");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sidetriple_str3);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }


    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus2 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side3 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal4 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(short)1, 0, neighborTSMStatus2, side3);
    java.util.Date date5 = heartBeatSignal4.getTimestamp();
    java.lang.Integer i6 = heartBeatSignal4.getTargetId();
    hu.bme.mit.swsv.ris.common.Side side7 = heartBeatSignal4.getSenderSide();
    hu.bme.mit.swsv.ris.common.Side side8 = heartBeatSignal4.getSenderSide();
    org.junit.Assert.assertTrue("'" + neighborTSMStatus2 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus2.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side3 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side3.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 0+ "'", i6.equals(0));
    org.junit.Assert.assertTrue("'" + side7 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side7.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + side8 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side8.equals(hu.bme.mit.swsv.ris.common.Side.FACING));

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }


    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus2 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side3 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal4 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(short)1, 0, neighborTSMStatus2, side3);
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus5 = heartBeatSignal4.getStatus();
    java.lang.String str6 = heartBeatSignal4.toString();
    org.junit.Assert.assertTrue("'" + neighborTSMStatus2 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus2.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side3 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side3.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus5 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus5.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "HeartBeatSignal(sender: 1 (FACING), target: 0, status: ALLOWED, timestamp: Thu Nov 24 22:41:53 CET 2016)"+ "'", str6.equals("HeartBeatSignal(sender: 1 (FACING), target: 0, status: ALLOWED, timestamp: Thu Nov 24 22:41:53 CET 2016)"));

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }


    hu.bme.mit.swsv.ris.common.SectionControl sectionControl2 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    hu.bme.mit.swsv.ris.signals.SectionControlSignal sectionControlSignal3 = new hu.bme.mit.swsv.ris.signals.SectionControlSignal(10, (int)(byte)100, sectionControl2);
    java.lang.Integer i4 = sectionControlSignal3.getTargetId();
    org.junit.Assert.assertTrue("'" + sectionControl2 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl2.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 100+ "'", i4.equals(100));

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }


    hu.bme.mit.swsv.ris.common.SideTriple<hu.bme.mit.swsv.ris.common.SectionOccupancy> sidetriple_sectionOccupancy0 = null;
    hu.bme.mit.swsv.ris.common.Direction direction1 = null;
    hu.bme.mit.swsv.ris.common.SideTriple<hu.bme.mit.swsv.ris.common.NeighborTSMInfo> sidetriple_neighborTSMInfo2 = null;
    hu.bme.mit.swsv.ris.common.logging.LoggerWrapper loggerWrapper3 = null;
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl4 = new hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl(sidetriple_sectionOccupancy0, direction1, sidetriple_neighborTSMInfo2, loggerWrapper3);
    hu.bme.mit.swsv.ris.tsm.SignalMapper signalMapper5 = null;
    safetyLogicImpl4.setSignalMapper(signalMapper5);
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus9 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side10 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal11 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(short)1, 0, neighborTSMStatus9, side10);
    java.util.Date date12 = heartBeatSignal11.getTimestamp();
    java.lang.Integer i13 = heartBeatSignal11.getTargetId();
    hu.bme.mit.swsv.ris.common.Side side14 = heartBeatSignal11.getSenderSide();
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus17 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side18 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal19 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(short)1, 0, neighborTSMStatus17, side18);
    java.util.Date date20 = heartBeatSignal19.getTimestamp();
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus25 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side26 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal27 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(short)1, 0, neighborTSMStatus25, side26);
    java.util.Date date28 = heartBeatSignal27.getTimestamp();
    java.lang.Integer i29 = heartBeatSignal27.getTargetId();
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus30 = heartBeatSignal27.getStatus();
    hu.bme.mit.swsv.ris.common.Side side31 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal32 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)'#', (int)(byte)-1, neighborTSMStatus30, side31);
    // The following exception was thrown during execution in test generation
    try {
    safetyLogicImpl4.neighborStatusChanged(side14, date20, neighborTSMStatus30);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    org.junit.Assert.assertTrue("'" + neighborTSMStatus9 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus9.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side10 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side10.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));
    org.junit.Assert.assertTrue("'" + side14 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side14.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus17 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus17.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side18 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side18.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date20);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus25 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus25.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side26 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side26.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 0+ "'", i29.equals(0));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus30 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus30.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side31 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side31.equals(hu.bme.mit.swsv.ris.common.Side.FACING));

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }


    hu.bme.mit.swsv.ris.common.SideTriple<hu.bme.mit.swsv.ris.common.SectionOccupancy> sidetriple_sectionOccupancy0 = null;
    hu.bme.mit.swsv.ris.common.Direction direction1 = null;
    hu.bme.mit.swsv.ris.common.SideTriple<hu.bme.mit.swsv.ris.common.NeighborTSMInfo> sidetriple_neighborTSMInfo2 = null;
    hu.bme.mit.swsv.ris.common.logging.LoggerWrapper loggerWrapper3 = null;
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl4 = new hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl(sidetriple_sectionOccupancy0, direction1, sidetriple_neighborTSMInfo2, loggerWrapper3);
    hu.bme.mit.swsv.ris.tsm.SignalMapper signalMapper5 = null;
    safetyLogicImpl4.setSignalMapper(signalMapper5);
    hu.bme.mit.swsv.ris.tsm.SignalMapper signalMapper7 = null;
    safetyLogicImpl4.setSignalMapper(signalMapper7);
    hu.bme.mit.swsv.ris.common.Side side9 = hu.bme.mit.swsv.ris.common.Side.DIVERGENT;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy10 = null;
    // The following exception was thrown during execution in test generation
    try {
    safetyLogicImpl4.sectionOccupancyChanged(side9, sectionOccupancy10);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    org.junit.Assert.assertTrue("'" + side9 + "' != '" + hu.bme.mit.swsv.ris.common.Side.DIVERGENT + "'", side9.equals(hu.bme.mit.swsv.ris.common.Side.DIVERGENT));

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test42"); }


    hu.bme.mit.swsv.ris.common.SectionControl sectionControl2 = hu.bme.mit.swsv.ris.common.SectionControl.ENABLED;
    hu.bme.mit.swsv.ris.signals.SectionControlSignal sectionControlSignal3 = new hu.bme.mit.swsv.ris.signals.SectionControlSignal(100, (int)(short)0, sectionControl2);
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl4 = sectionControlSignal3.getSectionControl();
    org.junit.Assert.assertTrue("'" + sectionControl2 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.ENABLED + "'", sectionControl2.equals(hu.bme.mit.swsv.ris.common.SectionControl.ENABLED));
    org.junit.Assert.assertTrue("'" + sectionControl4 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.ENABLED + "'", sectionControl4.equals(hu.bme.mit.swsv.ris.common.SectionControl.ENABLED));

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test43"); }


    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus4 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side5 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal6 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(short)1, 0, neighborTSMStatus4, side5);
    hu.bme.mit.swsv.ris.common.Side side7 = hu.bme.mit.swsv.ris.common.Side.DIVERGENT;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal8 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(short)-1, 10, neighborTSMStatus4, side7);
    java.util.Date date9 = heartBeatSignal8.getTimestamp();
    org.junit.Assert.assertTrue("'" + neighborTSMStatus4 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus4.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side5 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side5.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + side7 + "' != '" + hu.bme.mit.swsv.ris.common.Side.DIVERGENT + "'", side7.equals(hu.bme.mit.swsv.ris.common.Side.DIVERGENT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date9);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test44"); }


    hu.bme.mit.swsv.ris.common.SectionControl sectionControl4 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    hu.bme.mit.swsv.ris.signals.SectionControlSignal sectionControlSignal5 = new hu.bme.mit.swsv.ris.signals.SectionControlSignal(10, (int)(byte)100, sectionControl4);
    hu.bme.mit.swsv.ris.signals.SectionControlSignal sectionControlSignal6 = new hu.bme.mit.swsv.ris.signals.SectionControlSignal((int)(short)10, 0, sectionControl4);
    hu.bme.mit.swsv.ris.common.SectionControl sectionControl7 = sectionControlSignal6.getSectionControl();
    org.junit.Assert.assertTrue("'" + sectionControl4 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl4.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    org.junit.Assert.assertTrue("'" + sectionControl7 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl7.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test45"); }


    hu.bme.mit.swsv.ris.common.SideTriple<hu.bme.mit.swsv.ris.common.SectionOccupancy> sidetriple_sectionOccupancy0 = null;
    hu.bme.mit.swsv.ris.common.Direction direction1 = null;
    hu.bme.mit.swsv.ris.common.SideTriple<hu.bme.mit.swsv.ris.common.NeighborTSMInfo> sidetriple_neighborTSMInfo2 = null;
    hu.bme.mit.swsv.ris.common.logging.LoggerWrapper loggerWrapper3 = null;
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl4 = new hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl(sidetriple_sectionOccupancy0, direction1, sidetriple_neighborTSMInfo2, loggerWrapper3);
    hu.bme.mit.swsv.ris.tsm.SignalMapper signalMapper5 = null;
    safetyLogicImpl4.setSignalMapper(signalMapper5);
    safetyLogicImpl4.disconnect();
    hu.bme.mit.swsv.ris.common.Direction direction8 = null;
    // The following exception was thrown during execution in test generation
    try {
    safetyLogicImpl4.turnoutDirectionChanged(direction8);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test46"); }


    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus6 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side7 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal8 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(short)1, 0, neighborTSMStatus6, side7);
    java.util.Date date9 = heartBeatSignal8.getTimestamp();
    java.lang.Integer i10 = heartBeatSignal8.getTargetId();
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus11 = heartBeatSignal8.getStatus();
    hu.bme.mit.swsv.ris.common.Side side12 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal13 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)'#', (int)(byte)-1, neighborTSMStatus11, side12);
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus16 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus21 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side22 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal23 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(short)1, 0, neighborTSMStatus21, side22);
    java.util.Date date24 = heartBeatSignal23.getTimestamp();
    java.lang.Integer i25 = heartBeatSignal23.getTargetId();
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus26 = heartBeatSignal23.getStatus();
    hu.bme.mit.swsv.ris.common.Side side27 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal28 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)'#', (int)(byte)-1, neighborTSMStatus26, side27);
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal29 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal(1, (int)(short)1, neighborTSMStatus16, side27);
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal30 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)'#', (int)(short)1, neighborTSMStatus11, side27);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus6 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus6.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side7 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side7.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus11 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus11.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side12 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side12.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus16 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus16.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus21 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus21.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side22 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side22.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + 0+ "'", i25.equals(0));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus26 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus26.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side27 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side27.equals(hu.bme.mit.swsv.ris.common.Side.FACING));

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test47"); }


    hu.bme.mit.swsv.ris.common.SideTriple<hu.bme.mit.swsv.ris.common.SectionOccupancy> sidetriple_sectionOccupancy0 = null;
    hu.bme.mit.swsv.ris.common.Direction direction1 = null;
    hu.bme.mit.swsv.ris.common.SideTriple<hu.bme.mit.swsv.ris.common.NeighborTSMInfo> sidetriple_neighborTSMInfo2 = null;
    hu.bme.mit.swsv.ris.common.logging.LoggerWrapper loggerWrapper3 = null;
    hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl safetyLogicImpl4 = new hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl(sidetriple_sectionOccupancy0, direction1, sidetriple_neighborTSMInfo2, loggerWrapper3);
    safetyLogicImpl4.disconnect();
    hu.bme.mit.swsv.ris.common.Side side6 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.common.SectionOccupancy sectionOccupancy7 = null;
    // The following exception was thrown during execution in test generation
    try {
    safetyLogicImpl4.sectionOccupancyChanged(side6, sectionOccupancy7);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    org.junit.Assert.assertTrue("'" + side6 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side6.equals(hu.bme.mit.swsv.ris.common.Side.FACING));

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test48"); }


    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus6 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side7 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal8 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(short)1, 0, neighborTSMStatus6, side7);
    hu.bme.mit.swsv.ris.common.Side side9 = hu.bme.mit.swsv.ris.common.Side.DIVERGENT;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal10 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(short)-1, 10, neighborTSMStatus6, side9);
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus13 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side14 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal15 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(short)1, 0, neighborTSMStatus13, side14);
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus16 = heartBeatSignal15.getStatus();
    hu.bme.mit.swsv.ris.common.Side side17 = heartBeatSignal15.getSenderSide();
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal18 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(short)1, (int)(byte)1, neighborTSMStatus6, side17);
    org.junit.Assert.assertTrue("'" + neighborTSMStatus6 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus6.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side7 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side7.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + side9 + "' != '" + hu.bme.mit.swsv.ris.common.Side.DIVERGENT + "'", side9.equals(hu.bme.mit.swsv.ris.common.Side.DIVERGENT));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus13 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus13.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side14 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side14.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus16 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus16.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side17 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side17.equals(hu.bme.mit.swsv.ris.common.Side.FACING));

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test49"); }


    hu.bme.mit.swsv.ris.common.SectionControl sectionControl2 = hu.bme.mit.swsv.ris.common.SectionControl.DISABLED;
    hu.bme.mit.swsv.ris.signals.SectionControlSignal sectionControlSignal3 = new hu.bme.mit.swsv.ris.signals.SectionControlSignal((int)(short)1, 0, sectionControl2);
    java.lang.Integer i4 = sectionControlSignal3.getTargetId();
    java.lang.String str5 = sectionControlSignal3.toString();
    org.junit.Assert.assertTrue("'" + sectionControl2 + "' != '" + hu.bme.mit.swsv.ris.common.SectionControl.DISABLED + "'", sectionControl2.equals(hu.bme.mit.swsv.ris.common.SectionControl.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 0+ "'", i4.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "SectionControlSignal(sender: 1, target: 0, control: DISABLED)"+ "'", str5.equals("SectionControlSignal(sender: 1, target: 0, control: DISABLED)"));

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test50"); }


    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus4 = hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED;
    hu.bme.mit.swsv.ris.common.Side side5 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal6 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)(short)1, 0, neighborTSMStatus4, side5);
    java.util.Date date7 = heartBeatSignal6.getTimestamp();
    java.lang.Integer i8 = heartBeatSignal6.getTargetId();
    hu.bme.mit.swsv.ris.common.NeighborTSMStatus neighborTSMStatus9 = heartBeatSignal6.getStatus();
    hu.bme.mit.swsv.ris.common.Side side10 = hu.bme.mit.swsv.ris.common.Side.FACING;
    hu.bme.mit.swsv.ris.signals.HeartBeatSignal heartBeatSignal11 = new hu.bme.mit.swsv.ris.signals.HeartBeatSignal((int)'#', (int)(byte)-1, neighborTSMStatus9, side10);
    java.util.Date date12 = heartBeatSignal11.getTimestamp();
    org.junit.Assert.assertTrue("'" + neighborTSMStatus4 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus4.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side5 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side5.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 0+ "'", i8.equals(0));
    org.junit.Assert.assertTrue("'" + neighborTSMStatus9 + "' != '" + hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED + "'", neighborTSMStatus9.equals(hu.bme.mit.swsv.ris.common.NeighborTSMStatus.ALLOWED));
    org.junit.Assert.assertTrue("'" + side10 + "' != '" + hu.bme.mit.swsv.ris.common.Side.FACING + "'", side10.equals(hu.bme.mit.swsv.ris.common.Side.FACING));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date12);

  }

}
