package jetbrains.mps.build.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class BuildInputSingleFile_Behavior {
  public static void init(SNode thisNode) {
  }

  public static String virtual_getApproximateName_5610619299013425878(SNode thisNode) {
    return BehaviorReflection.invokeVirtual(String.class, SLinkOperations.getTarget(thisNode, "path", true), "virtual_getLastSegment_1368030936106771141", new Object[]{null});
  }

  public static boolean virtual_isImplicit_1330375798085107777(SNode thisNode) {
    return true;
  }
}
