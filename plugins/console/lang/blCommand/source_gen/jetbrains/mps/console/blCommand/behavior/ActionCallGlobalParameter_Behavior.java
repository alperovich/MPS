package jetbrains.mps.console.blCommand.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class ActionCallGlobalParameter_Behavior {
  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getParameterDeclaration_119903734736614698(SNode thisNode) {
    return SLinkOperations.getTarget(thisNode, "declaration", false);
  }
}
