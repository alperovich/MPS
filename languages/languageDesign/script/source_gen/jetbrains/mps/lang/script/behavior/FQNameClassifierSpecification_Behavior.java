package jetbrains.mps.lang.script.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class FQNameClassifierSpecification_Behavior {
  public static void init(SNode thisNode) {
  }

  public static String virtual_getClassifierFqName_5434557751112930827(SNode thisNode) {
    return SPropertyOperations.getString(thisNode, "classifierFQName");
  }

  public static String virtual_getSModelReference_5434557751113441014(SNode thisNode) {
    return SPropertyOperations.getString(thisNode, "smodelReference");
  }
}
