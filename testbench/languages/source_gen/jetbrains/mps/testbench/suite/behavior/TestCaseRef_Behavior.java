package jetbrains.mps.testbench.suite.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.ISelector;

public class TestCaseRef_Behavior {
  public static void init(SNode thisNode) {
  }

  public static String virtual_fqClassName_2956932267233324537(SNode thisNode) {
    return BehaviorReflection.invokeVirtual(String.class, SLinkOperations.getTarget(thisNode, "testCase", false), "virtual_getClassName_1216136193905", new Object[]{});
  }

  public static Iterable<String> virtual_testNames_4089647634160960707(SNode thisNode) {
    List<SNode> testMethods;
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(thisNode, "testCase", false), "jetbrains.mps.lang.test.structure.NodesTestCase")) {
      testMethods = BehaviorReflection.invokeVirtual((Class<List<SNode>>) ((Class) Object.class), SLinkOperations.getTarget(thisNode, "testCase", false), "virtual_getTestSet_1216130724401", new Object[]{});
    } else {
      testMethods = BehaviorReflection.invokeVirtual((Class<List<SNode>>) ((Class) Object.class), SLinkOperations.getTarget(thisNode, "testCase", false), "virtual_getTestMethods_2148145109766218395", new Object[]{});
    }
    return ListSequence.fromList(testMethods).select(new ISelector<SNode, String>() {
      public String select(SNode m) {
        return BehaviorReflection.invokeVirtual(String.class, m, "virtual_getTestName_1216136419751", new Object[]{});
      }
    });
  }
}
