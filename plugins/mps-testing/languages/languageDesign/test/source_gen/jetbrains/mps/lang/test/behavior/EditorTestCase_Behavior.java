package jetbrains.mps.lang.test.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class EditorTestCase_Behavior {
  public static void init(SNode thisNode) {
  }

  public static List<SNode> virtual_getTestSet_1216130724401(SNode thisNode) {
    return ListSequence.fromListAndArray(new ArrayList<SNode>(), thisNode);
  }

  public static String virtual_getTestName_1216136419751(SNode thisNode) {
    return "test_" + SPropertyOperations.getString(thisNode, "name");
  }

  public static SNode virtual_getTestCase_1216134500045(SNode thisNode) {
    return thisNode;
  }

  public static List<SNode> virtual_getTestMethods_2148145109766218395(SNode thisNode) {
    List<SNode> result = new ArrayList<SNode>();
    ListSequence.fromList(result).addElement(thisNode);
    return result;
  }

  public static boolean virtual_suppress_3393165121846091591(SNode thisNode, SNode child) {
    return SLinkOperations.getTarget(thisNode, "nodeToEdit", true) == child || SLinkOperations.getTarget(thisNode, "result", true) == child;
  }

  public static boolean virtual_isMpsStartRequired_3310779261129403089(SNode thisNode) {
    return true;
  }
}
