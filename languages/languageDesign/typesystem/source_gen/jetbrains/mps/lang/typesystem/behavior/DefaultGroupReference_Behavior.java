package jetbrains.mps.lang.typesystem.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class DefaultGroupReference_Behavior {
  public static void init(SNode thisNode) {
  }

  public static String virtual_createGeneratedNodeId_7342618720440051599(SNode thisNode) {
    return "default";
  }

  @Deprecated
  public static String call_createGeneratedNodeId_7342618720440051599(SNode thisNode) {
    return BehaviorReflection.invokeVirtual(String.class, thisNode, "virtual_createGeneratedNodeId_7342618720440051599", new Object[]{});
  }

  @Deprecated
  public static String callSuper_createGeneratedNodeId_7342618720440051599(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper(String.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.typesystem.structure.DefaultGroupReference"), callerConceptFqName, "virtual_createGeneratedNodeId_7342618720440051599", new Class[]{SNode.class}, new Object[]{});
  }
}
