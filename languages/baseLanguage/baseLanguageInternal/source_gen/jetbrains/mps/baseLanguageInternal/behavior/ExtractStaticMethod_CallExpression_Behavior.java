package jetbrains.mps.baseLanguageInternal.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import java.util.List;
import java.util.ArrayList;
import org.jetbrains.mps.openapi.language.SConceptRepository;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class ExtractStaticMethod_CallExpression_Behavior {
  public static void init(SNode thisNode) {
  }

  public static Iterable<SNode> virtual_getAvailableMethodDeclarations_5776618742611315379(SNode thisNode, String methodName) {
    List<SNode> result = new ArrayList<SNode>();
    for (SNode bmd : ExtractStaticMethod_CallExpression_Behavior.call_getMethods_5857910569715993654(SConceptRepository.getInstance().getConcept(NameUtil.nodeFQName(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguageInternal.structure.ExtractStaticMethod_CallExpression"))), thisNode)) {
      if (SPropertyOperations.getString(SNodeOperations.cast(bmd, "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration"), "name").equals(methodName)) {
        ListSequence.fromList(result).addElement(SNodeOperations.cast(bmd, "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration"));
      }
    }
    return result;
  }

  public static SNode call_getContainingExtractExpr_8881995820265485533(SNode thisNode) {
    for (SNode es : SNodeOperations.getAncestors(thisNode, "jetbrains.mps.baseLanguageInternal.structure.ExtractStaticMethodExpression", false)) {
      if (SLinkOperations.getTarget(es, "method", true) == SLinkOperations.getTarget(thisNode, "baseMethodDeclaration", false)) {
        return es;
      }
    }
    return null;
  }

  public static boolean virtual_substituteInAmbigousPosition_1262430001741498020(SAbstractConcept thisConcept) {
    return true;
  }

  public static List<SNode> call_getMethods_5857910569715993654(SAbstractConcept thisConcept, SNode context) {
    List<SNode> smd = new ArrayList<SNode>();
    for (SNode es : SNodeOperations.getAncestors(context, "jetbrains.mps.baseLanguageInternal.structure.ExtractStaticMethodExpression", true)) {
      ListSequence.fromList(smd).addElement(SLinkOperations.getTarget(es, "method", true));
    }
    return smd;
  }

  @Deprecated
  public static Iterable<SNode> call_getAvailableMethodDeclarations_3585982959253821899(SNode thisNode, String methodName) {
    return BehaviorReflection.invokeVirtual((Class<Iterable<SNode>>) ((Class) Object.class), thisNode, "virtual_getAvailableMethodDeclarations_5776618742611315379", new Object[]{methodName});
  }

  @Deprecated
  public static Iterable<SNode> callSuper_getAvailableMethodDeclarations_3585982959253821899(SNode thisNode, String callerConceptFqName, String methodName) {
    return BehaviorManager.getInstance().invokeSuper((Class<Iterable<SNode>>) ((Class) Object.class), SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguageInternal.structure.ExtractStaticMethod_CallExpression"), callerConceptFqName, "virtual_getAvailableMethodDeclarations_5776618742611315379", new Class[]{SNode.class, String.class}, new Object[]{methodName});
  }
}
