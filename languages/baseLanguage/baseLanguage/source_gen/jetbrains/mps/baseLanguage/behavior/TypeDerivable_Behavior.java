package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class TypeDerivable_Behavior {
  public static void init(SNode thisNode) {
  }

  public static SNode virtual_deriveType_1213877435747(SNode thisNode, SNode expression) {
    return null;
  }

  public static SNode virtual_deriveType_4555537781928374706(SNode thisNode, SNode expression, SNode link) {
    return TypeDerivable_Behavior.call_deriveType_1213877435747(thisNode, expression);
  }

  @Deprecated
  public static SNode call_deriveType_1213877435747(SNode thisNode, SNode expression) {
    return BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), thisNode, "virtual_deriveType_1213877435747", new Object[]{expression});
  }

  @Deprecated
  public static SNode call_deriveType_4555537781928374706(SNode thisNode, SNode expression, SNode link) {
    return BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), thisNode, "virtual_deriveType_4555537781928374706", new Object[]{expression, link});
  }

  @Deprecated
  public static SNode callSuper_deriveType_1213877435747(SNode thisNode, String callerConceptFqName, SNode expression) {
    return BehaviorManager.getInstance().invokeSuper((Class<SNode>) ((Class) Object.class), SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.TypeDerivable"), callerConceptFqName, "virtual_deriveType_1213877435747", new Class[]{SNode.class, SNode.class}, new Object[]{expression});
  }

  @Deprecated
  public static SNode callSuper_deriveType_4555537781928374706(SNode thisNode, String callerConceptFqName, SNode expression, SNode link) {
    return BehaviorManager.getInstance().invokeSuper((Class<SNode>) ((Class) Object.class), SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.TypeDerivable"), callerConceptFqName, "virtual_deriveType_4555537781928374706", new Class[]{SNode.class, SNode.class, SNode.class}, new Object[]{expression, link});
  }
}
