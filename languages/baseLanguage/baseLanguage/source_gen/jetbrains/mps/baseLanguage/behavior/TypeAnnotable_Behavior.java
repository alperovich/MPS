package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class TypeAnnotable_Behavior {
  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getTypeAnnotation_1233920952262(SNode thisNode) {
    return null;
  }

  @Deprecated
  public static SNode call_getTypeAnnotation_1233920952262(SNode thisNode) {
    return BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), thisNode, "virtual_getTypeAnnotation_1233920952262", new Object[]{});
  }

  @Deprecated
  public static SNode callSuper_getTypeAnnotation_1233920952262(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper((Class<SNode>) ((Class) Object.class), SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.TypeAnnotable"), callerConceptFqName, "virtual_getTypeAnnotation_1233920952262", new Class[]{SNode.class}, new Object[]{});
  }
}
