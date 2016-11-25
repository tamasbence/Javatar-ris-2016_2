package hu.bme.mit.swsv.ris.tsm;

import org.graphwalker.core.condition.VertexCoverage;
import org.graphwalker.core.generator.RandomPath;
import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.GraphWalker;


@GraphWalker(start = "init", pathGenerator = RandomPath.class, stopCondition = VertexCoverage.class, stopConditionValue = "100")
public class HeartbeatModelTest extends ExecutionContext implements HeartbeatModel {

  @Override
  public void TODO(){
    System.out.println("state TODO");
  }

  @Override
  public void init(){
    System.out.println("edge init");
  }
}

