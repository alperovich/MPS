package jetbrains.mps.lang.generator.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class RuleConsequence_Behavior {
  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getTemplateType_7933327286924651185(SNode thisNode) {
    return null;
  }

  @Deprecated
  public static SNode call_getTemplateType_7933327286924651185(SNode thisNode) {
    return BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), thisNode, "virtual_getTemplateType_7933327286924651185", new Object[]{});
  }

  @Deprecated
  public static SNode callSuper_getTemplateType_7933327286924651185(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper((Class<SNode>) ((Class) Object.class), SNodeOperations.cast(thisNode, "jetbrains.mps.lang.generator.structure.RuleConsequence"), callerConceptFqName, "virtual_getTemplateType_7933327286924651185", new Class[]{SNode.class}, new Object[]{});
  }
}
