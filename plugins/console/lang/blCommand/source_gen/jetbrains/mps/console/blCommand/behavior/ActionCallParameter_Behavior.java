package jetbrains.mps.console.blCommand.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class ActionCallParameter_Behavior {
  public static void init(SNode thisNode) {
  }

  @Deprecated
  public static SNode call_getParameterDeclaration_119903734736614698(SNode thisNode) {
    return BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), thisNode, "virtual_getParameterDeclaration_119903734736614698", new Object[]{});
  }

  @Deprecated
  public static SNode callSuper_getParameterDeclaration_119903734736614698(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper((Class<SNode>) ((Class) Object.class), SNodeOperations.cast(thisNode, "jetbrains.mps.console.blCommand.structure.ActionCallParameter"), callerConceptFqName, "virtual_getParameterDeclaration_119903734736614698", new Class[]{SNode.class}, new Object[]{});
  }
}
