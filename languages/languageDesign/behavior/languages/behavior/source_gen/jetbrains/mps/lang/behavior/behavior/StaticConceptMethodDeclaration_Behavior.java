package jetbrains.mps.lang.behavior.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class StaticConceptMethodDeclaration_Behavior {
  public static void init(SNode thisNode) {
  }

  public static String call_getGeneratedName_1225196403920(SNode thisNode) {
    return SPropertyOperations.getString(thisNode, "name") + "_" + thisNode.getNodeId().toString();
  }

  public static boolean virtual_canBeAnnotated_1233076312117(SNode thisNode) {
    return true;
  }

  public static SNode call_getBehavior_1225196403935(SNode thisNode) {
    return SNodeOperations.cast(SNodeOperations.getParent(thisNode), "jetbrains.mps.lang.behavior.structure.ConceptBehavior");
  }
}
