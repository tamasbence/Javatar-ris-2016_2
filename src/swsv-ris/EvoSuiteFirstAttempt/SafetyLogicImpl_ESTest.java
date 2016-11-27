/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 27 09:41:54 GMT 2016
 */

package hu.bme.mit.swsv.ris.tsm.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import hu.bme.mit.swsv.ris.common.Direction;
import hu.bme.mit.swsv.ris.common.NeighborTSMInfo;
import hu.bme.mit.swsv.ris.common.NeighborTSMStatus;
import hu.bme.mit.swsv.ris.common.SectionOccupancy;
import hu.bme.mit.swsv.ris.common.Side;
import hu.bme.mit.swsv.ris.common.SideTriple;
import hu.bme.mit.swsv.ris.common.logging.LoggerWrapper;
import hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl;
import hu.bme.mit.swsv.ris.tsm.impl.SignalMapperImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SafetyLogicImpl_ESTest extends SafetyLogicImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Direction direction0 = Direction.DIVERGENT;
      LoggerWrapper loggerWrapper0 = LoggerWrapper.getLogger("");
      SafetyLogicImpl safetyLogicImpl0 = new SafetyLogicImpl((SideTriple<SectionOccupancy>) null, direction0, (SideTriple<NeighborTSMInfo>) null, loggerWrapper0);
      Side side0 = Side.FACING;
      SectionOccupancy sectionOccupancy0 = SectionOccupancy.FREE;
      // Undeclared exception!
      try { 
        safetyLogicImpl0.sectionOccupancyChanged(side0, sectionOccupancy0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Direction direction0 = Direction.DIVERGENT;
      LoggerWrapper loggerWrapper0 = LoggerWrapper.getLogger("DIED");
      SafetyLogicImpl safetyLogicImpl0 = new SafetyLogicImpl((SideTriple<SectionOccupancy>) null, direction0, (SideTriple<NeighborTSMInfo>) null, loggerWrapper0);
      Side side0 = Side.STRAIGHT;
      MockDate mockDate0 = new MockDate();
      NeighborTSMStatus neighborTSMStatus0 = NeighborTSMStatus.ALLOWED;
      // Undeclared exception!
      try { 
        safetyLogicImpl0.neighborStatusChanged(side0, mockDate0, neighborTSMStatus0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Direction direction0 = Direction.DIVERGENT;
      LoggerWrapper loggerWrapper0 = LoggerWrapper.getLogger("(");
      SafetyLogicImpl safetyLogicImpl0 = new SafetyLogicImpl((SideTriple<SectionOccupancy>) null, direction0, (SideTriple<NeighborTSMInfo>) null, loggerWrapper0);
      Direction direction1 = Direction.STRAIGHT;
      // Undeclared exception!
      try { 
        safetyLogicImpl0.turnoutDirectionChanged(direction1);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Direction direction0 = Direction.DIVERGENT;
      LoggerWrapper loggerWrapper0 = LoggerWrapper.getLogger("(");
      SafetyLogicImpl safetyLogicImpl0 = new SafetyLogicImpl((SideTriple<SectionOccupancy>) null, direction0, (SideTriple<NeighborTSMInfo>) null, loggerWrapper0);
      safetyLogicImpl0.turnoutDirectionChanged(direction0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Direction direction0 = Direction.DIVERGENT;
      LoggerWrapper loggerWrapper0 = LoggerWrapper.getLogger("(");
      SafetyLogicImpl safetyLogicImpl0 = new SafetyLogicImpl((SideTriple<SectionOccupancy>) null, direction0, (SideTriple<NeighborTSMInfo>) null, loggerWrapper0);
      Integer integer0 = new Integer(135);
      SignalMapperImpl signalMapperImpl0 = new SignalMapperImpl(integer0, (SideTriple<Integer>) null, (SideTriple<Integer>) null, (SideTriple<Side>) null, loggerWrapper0);
      safetyLogicImpl0.setSignalMapper(signalMapperImpl0);
      Direction direction1 = Direction.STRAIGHT;
      // Undeclared exception!
      try { 
        safetyLogicImpl0.turnoutDirectionChanged(direction1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("hu.bme.mit.swsv.ris.tsm.impl.SafetyLogicImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Direction direction0 = Direction.STRAIGHT;
      SafetyLogicImpl safetyLogicImpl0 = new SafetyLogicImpl((SideTriple<SectionOccupancy>) null, direction0, (SideTriple<NeighborTSMInfo>) null, (LoggerWrapper) null);
      safetyLogicImpl0.startHeartBeat();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Direction direction0 = Direction.STRAIGHT;
      SafetyLogicImpl safetyLogicImpl0 = new SafetyLogicImpl((SideTriple<SectionOccupancy>) null, direction0, (SideTriple<NeighborTSMInfo>) null, (LoggerWrapper) null);
      safetyLogicImpl0.disconnect();
      // Undeclared exception!
      try { 
        safetyLogicImpl0.startHeartBeat();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer already cancelled.
         //
         assertThrownBy("java.util.Timer", e);
      }
  }
}
