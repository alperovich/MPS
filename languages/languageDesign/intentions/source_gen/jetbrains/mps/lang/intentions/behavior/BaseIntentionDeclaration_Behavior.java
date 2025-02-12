package jetbrains.mps.lang.intentions.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import jetbrains.mps.checkedName.PropertyReference;
import jetbrains.mps.baseLanguage.behavior.ConceptFunction_Behavior;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class BaseIntentionDeclaration_Behavior {
  public static void init(SNode thisNode) {
  }

  public static String virtual_getGeneratedName_6263518417926802289(SNode thisNode) {
    return NameUtil.toValidIdentifier(SPropertyOperations.getString(thisNode, "name")) + "_Intention";
  }

  public static String call_getConceptName_6263518417926802300(SNode thisNode) {
    return BehaviorReflection.invokeVirtual(String.class, SLinkOperations.getTarget(thisNode, "forConcept", false), "virtual_getFqName_1213877404258", new Object[]{});
  }

  @Deprecated
  public static boolean virtual_isParameterized_6263518417926802310(SNode thisNode) {
    // Was deprecated in MPS 3.0 should be removed after MPS 3.0 
    return false;
  }

  public static List<PropertyReference> virtual_getPropertiesToCheck_4844813484172611445(SNode thisNode) {
    return BehaviorReflection.invokeSuper((Class<List<PropertyReference>>) ((Class) Object.class), thisNode, "jetbrains.mps.lang.checkedName.structure.ICheckedNamePolicy", "virtual_getPropertiesToCheck_4844813484172611445", new Object[]{});
  }

  public static SNode virtual_getDescendantToCheck_4844813484172611439(SNode thisNode) {
    if (!(ConceptFunction_Behavior.call_isReturnOnly_3745452943050787634(SLinkOperations.getTarget(thisNode, "descriptionFunction", true)))) {
      return null;
    }
    SNode stmt = ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(SLinkOperations.getTarget(thisNode, "descriptionFunction", true), "body", true), "statement", true)).first();
    SNode expr = null;
    if (SNodeOperations.isInstanceOf(stmt, "jetbrains.mps.baseLanguage.structure.ReturnStatement")) {
      expr = SLinkOperations.getTarget(SNodeOperations.cast(stmt, "jetbrains.mps.baseLanguage.structure.ReturnStatement"), "expression", true);
    } else if (SNodeOperations.isInstanceOf(stmt, "jetbrains.mps.baseLanguage.structure.ExpressionStatement")) {
      expr = SLinkOperations.getTarget(SNodeOperations.cast(stmt, "jetbrains.mps.baseLanguage.structure.ExpressionStatement"), "expression", true);
    }
    if (!(SNodeOperations.isInstanceOf(expr, "jetbrains.mps.baseLanguage.structure.StringLiteral"))) {
      return null;
    }
    return SNodeOperations.cast(expr, "jetbrains.mps.baseLanguage.structure.StringLiteral");
  }

  public static SNode virtual_getBaseConcept_2621449412040133768(SNode thisNode) {
    return SLinkOperations.getTarget(thisNode, "forConcept", false);
  }

  public static void virtual_setBaseConcept_6261424444345963020(SNode thisNode, SNode baseConcept) {
    SLinkOperations.setTarget(thisNode, "forConcept", baseConcept, false);
  }

  @Deprecated
  public static String call_getGeneratedName_6263518417926802289(SNode thisNode) {
    return BehaviorReflection.invokeVirtual(String.class, thisNode, "virtual_getGeneratedName_6263518417926802289", new Object[]{});
  }

  @Deprecated
  public static boolean call_isParameterized_6263518417926802310(SNode thisNode) {
    return BehaviorReflection.invokeVirtual(Boolean.TYPE, thisNode, "virtual_isParameterized_6263518417926802310", new Object[]{});
  }

  @Deprecated
  public static SNode call_getBaseConcept_6263518417926802384(SNode thisNode) {
    return BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), thisNode, "virtual_getBaseConcept_2621449412040133768", new Object[]{});
  }

  @Deprecated
  public static void call_setBaseConcept_6261424444345979509(SNode thisNode, SNode baseConcept) {
    BehaviorReflection.invokeVirtual(Void.class, thisNode, "virtual_setBaseConcept_6261424444345963020", new Object[]{baseConcept});
  }

  @Deprecated
  public static String callSuper_getGeneratedName_6263518417926802289(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper(String.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.intentions.structure.BaseIntentionDeclaration"), callerConceptFqName, "virtual_getGeneratedName_6263518417926802289", new Class[]{SNode.class}, new Object[]{});
  }

  @Deprecated
  public static boolean callSuper_isParameterized_6263518417926802310(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper(Boolean.TYPE, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.intentions.structure.BaseIntentionDeclaration"), callerConceptFqName, "virtual_isParameterized_6263518417926802310", new Class[]{SNode.class}, new Object[]{});
  }

  @Deprecated
  public static SNode callSuper_getBaseConcept_6263518417926802384(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper((Class<SNode>) ((Class) Object.class), SNodeOperations.cast(thisNode, "jetbrains.mps.lang.intentions.structure.BaseIntentionDeclaration"), callerConceptFqName, "virtual_getBaseConcept_2621449412040133768", new Class[]{SNode.class}, new Object[]{});
  }

  @Deprecated
  public static void callSuper_setBaseConcept_6261424444345979509(SNode thisNode, String callerConceptFqName, SNode baseConcept) {
    BehaviorManager.getInstance().invokeSuper(Void.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.intentions.structure.BaseIntentionDeclaration"), callerConceptFqName, "virtual_setBaseConcept_6261424444345963020", new Class[]{SNode.class, SNode.class}, new Object[]{baseConcept});
  }
}
