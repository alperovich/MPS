package jetbrains.mps.lang.generator.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.pattern.behavior.PatternVarsUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class TemplateArgumentPropertyPatternRefExpression_Behavior {
  public static void init(SNode thisNode) {
  }

  public static String virtual_getVariableName_2902001550281937661(SNode thisNode) {
    return PatternVarsUtil.getFieldName(SLinkOperations.getTarget(thisNode, "propertyPattern", false));
  }

  @Deprecated
  public static String call_getVariableName_2902001550282064519(SNode thisNode) {
    return BehaviorReflection.invokeVirtual(String.class, thisNode, "virtual_getVariableName_2902001550281937661", new Object[]{});
  }

  @Deprecated
  public static String callSuper_getVariableName_2902001550282064519(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper(String.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.generator.structure.TemplateArgumentPropertyPatternRefExpression"), callerConceptFqName, "virtual_getVariableName_2902001550281937661", new Class[]{SNode.class}, new Object[]{});
  }
}
