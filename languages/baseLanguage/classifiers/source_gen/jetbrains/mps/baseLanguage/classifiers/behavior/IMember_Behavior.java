package jetbrains.mps.baseLanguage.classifiers.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import java.util.List;
import org.jetbrains.mps.openapi.language.SConceptRepository;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.ArrayList;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class IMember_Behavior {
  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getVisiblity_1213877352965(SNode thisNode) {
    return SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.PublicVisibility", null);
  }

  public static SNode virtual_getOperationConcept_1213877352972(SNode thisNode) {
    SNode memberOperationConcept = ((SNode) ListSequence.fromList(BehaviorReflection.invokeVirtualStatic((Class<List<SNode>>) ((Class) Object.class), SConceptRepository.getInstance().getConcept(NameUtil.nodeFQName(SNodeOperations.getConceptDeclaration(thisNode))), "virtual_getOperationConcept_3044950653914717125", new Object[]{})).first());
    if (memberOperationConcept == null) {
      throw new RuntimeException("Please set operationConcept in " + SNodeOperations.getConceptDeclaration(thisNode) + " concept");
    }
    return memberOperationConcept;
  }

  public static SNode virtual_createOperation_1213877353000(SNode thisNode) {
    SNode result = SConceptOperations.createNewNode(NameUtil.nodeFQName(BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), thisNode, "virtual_getOperationConcept_1213877352972", new Object[]{})), null);
    SLinkOperations.setTarget(result, "member", thisNode, false);
    return result;
  }

  public static SNode call_getContainer_1213877353020(SNode thisNode) {
    return IClassifier_Behavior.call_getContextClassifier_1213877527940(SConceptRepository.getInstance().getConcept(NameUtil.nodeFQName(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.classifiers.structure.IClassifier"))), thisNode);
  }

  public static boolean virtual_canBeReferent_8179323502814657526(SNode thisNode, SNode referentConcept) {
    return true;
  }

  public static boolean virtual_canOperationBeChild_4593153787954614840(SNode thisNode, SNode parentNode) {
    return true;
  }

  public static List<SNode> virtual_getOperationConcept_3044950653914717125(SAbstractConcept thisConcept) {
    return ListSequence.fromList(new ArrayList<SNode>());
  }

  @Deprecated
  public static SNode call_getVisiblity_1213877352965(SNode thisNode) {
    return BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), thisNode, "virtual_getVisiblity_1213877352965", new Object[]{});
  }

  @Deprecated
  public static SNode call_getOperationConcept_1213877352972(SNode thisNode) {
    return BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), thisNode, "virtual_getOperationConcept_1213877352972", new Object[]{});
  }

  @Deprecated
  public static SNode call_createOperation_1213877353000(SNode thisNode) {
    return BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), thisNode, "virtual_createOperation_1213877353000", new Object[]{});
  }

  @Deprecated
  public static boolean call_canBeReferent_8179323502814657526(SNode thisNode, SNode referentConcept) {
    return BehaviorReflection.invokeVirtual(Boolean.TYPE, thisNode, "virtual_canBeReferent_8179323502814657526", new Object[]{referentConcept});
  }

  @Deprecated
  public static boolean call_canOperationBeChild_4593153787954614840(SNode thisNode, SNode parentNode) {
    return BehaviorReflection.invokeVirtual(Boolean.TYPE, thisNode, "virtual_canOperationBeChild_4593153787954614840", new Object[]{parentNode});
  }

  @Deprecated
  public static SNode callSuper_getVisiblity_1213877352965(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper((Class<SNode>) ((Class) Object.class), SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.classifiers.structure.IMember"), callerConceptFqName, "virtual_getVisiblity_1213877352965", new Class[]{SNode.class}, new Object[]{});
  }

  @Deprecated
  public static SNode callSuper_getOperationConcept_1213877352972(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper((Class<SNode>) ((Class) Object.class), SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.classifiers.structure.IMember"), callerConceptFqName, "virtual_getOperationConcept_1213877352972", new Class[]{SNode.class}, new Object[]{});
  }

  @Deprecated
  public static SNode callSuper_createOperation_1213877353000(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper((Class<SNode>) ((Class) Object.class), SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.classifiers.structure.IMember"), callerConceptFqName, "virtual_createOperation_1213877353000", new Class[]{SNode.class}, new Object[]{});
  }

  @Deprecated
  public static boolean callSuper_canBeReferent_8179323502814657526(SNode thisNode, String callerConceptFqName, SNode referentConcept) {
    return BehaviorManager.getInstance().invokeSuper(Boolean.TYPE, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.classifiers.structure.IMember"), callerConceptFqName, "virtual_canBeReferent_8179323502814657526", new Class[]{SNode.class, SNode.class}, new Object[]{referentConcept});
  }

  @Deprecated
  public static boolean callSuper_canOperationBeChild_4593153787954614840(SNode thisNode, String callerConceptFqName, SNode parentNode) {
    return BehaviorManager.getInstance().invokeSuper(Boolean.TYPE, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.classifiers.structure.IMember"), callerConceptFqName, "virtual_canOperationBeChild_4593153787954614840", new Class[]{SNode.class, SNode.class}, new Object[]{parentNode});
  }
}
