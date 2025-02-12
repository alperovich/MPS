package jetbrains.mps.lang.generator.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class MappingConfiguration_Behavior {
  public static void init(SNode thisNode) {
  }

  public static List<SNode> virtual_getMembers_1213877531970(SNode thisNode) {
    List<SNode> members = new ArrayList<SNode>();
    ListSequence.fromList(members).addSequence(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "rootMappingRule", true)));
    ListSequence.fromList(members).addSequence(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "weavingMappingRule", true)));
    ListSequence.fromList(members).addSequence(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "reductionMappingRule", true)));
    ListSequence.fromList(members).addSequence(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "patternReductionRule", true)));
    ListSequence.fromList(members).addSequence(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "createRootRule", true)));
    ListSequence.fromList(members).addSequence(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "preMappingScript", true)));
    ListSequence.fromList(members).addSequence(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "postMappingScript", true)));
    ListSequence.fromList(members).addSequence(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "mappingLabel", true)));
    return members;
  }

  public static void call_addMember_3166264919334415805(SNode thisNode, SNode newMember) {
    if ((AttributeOperations.getAttribute(newMember, new IAttributeDescriptor.NodeAttribute("jetbrains.mps.lang.generator.structure.RootTemplateAnnotation")) != null)) {
      SNode ruleNode = SLinkOperations.addNewChild(thisNode, "rootMappingRule", "jetbrains.mps.lang.generator.structure.Root_MappingRule");
      SLinkOperations.setTarget(ruleNode, "applicableConcept", SLinkOperations.getTarget(AttributeOperations.getAttribute(newMember, new IAttributeDescriptor.NodeAttribute("jetbrains.mps.lang.generator.structure.RootTemplateAnnotation")), "applicableConcept", false), false);
      SLinkOperations.setTarget(ruleNode, "template", SNodeOperations.cast(newMember, "jetbrains.mps.lang.core.structure.INamedConcept"), false);
    } else if (SNodeOperations.isInstanceOf(newMember, "jetbrains.mps.lang.generator.structure.TemplateDeclaration")) {
      SNode mappingRule = SLinkOperations.addNewChild(thisNode, "reductionMappingRule", "jetbrains.mps.lang.generator.structure.Reduction_MappingRule");
      SLinkOperations.setTarget(mappingRule, "applicableConcept", SLinkOperations.getTarget(SNodeOperations.cast(newMember, "jetbrains.mps.lang.generator.structure.TemplateDeclaration"), "applicableConcept", false), false);
      SNode templateRef = SConceptOperations.createNewNode("jetbrains.mps.lang.generator.structure.TemplateDeclarationReference", null);
      SLinkOperations.setTarget(templateRef, "template", SNodeOperations.cast(newMember, "jetbrains.mps.lang.generator.structure.TemplateDeclaration"), false);
      SLinkOperations.setTarget(mappingRule, "ruleConsequence", templateRef, true);
    }
  }

  public static List<SNode> virtual_getBaseConceptCollection_5270353093116013036(SNode thisNode) {
    List<SNode> result = new ArrayList<SNode>();
    for (SNode mapConfChild : SNodeOperations.getChildren(thisNode)) {
      if (SNodeOperations.isInstanceOf(mapConfChild, "jetbrains.mps.lang.generator.structure.BaseMappingRule")) {
        ListSequence.fromList(result).addElement(SLinkOperations.getTarget(SNodeOperations.cast(mapConfChild, "jetbrains.mps.lang.generator.structure.BaseMappingRule"), "applicableConcept", false));
      } else if (SNodeOperations.isInstanceOf(mapConfChild, "jetbrains.mps.lang.generator.structure.DropRootRule")) {
        ListSequence.fromList(result).addElement(SLinkOperations.getTarget(SNodeOperations.cast(mapConfChild, "jetbrains.mps.lang.generator.structure.DropRootRule"), "applicableConcept", false));
      }
    }
    return result;
  }

  public static boolean virtual_isApplicable_7839831476331657915(SNode thisNode, SNode candidate) {
    return false;
  }

  @Deprecated
  public static List<SNode> call_getBaseConceptCollection_8360039740498071265(SNode thisNode) {
    return BehaviorReflection.invokeVirtual((Class<List<SNode>>) ((Class) Object.class), thisNode, "virtual_getBaseConceptCollection_5270353093116013036", new Object[]{});
  }

  @Deprecated
  public static boolean call_isApplicable_390427525177434695(SNode thisNode, SNode candidate) {
    return BehaviorReflection.invokeVirtual(Boolean.TYPE, thisNode, "virtual_isApplicable_7839831476331657915", new Object[]{candidate});
  }

  @Deprecated
  public static List<SNode> callSuper_getBaseConceptCollection_8360039740498071265(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper((Class<List<SNode>>) ((Class) Object.class), SNodeOperations.cast(thisNode, "jetbrains.mps.lang.generator.structure.MappingConfiguration"), callerConceptFqName, "virtual_getBaseConceptCollection_5270353093116013036", new Class[]{SNode.class}, new Object[]{});
  }

  @Deprecated
  public static boolean callSuper_isApplicable_390427525177434695(SNode thisNode, String callerConceptFqName, SNode candidate) {
    return BehaviorManager.getInstance().invokeSuper(Boolean.TYPE, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.generator.structure.MappingConfiguration"), callerConceptFqName, "virtual_isApplicable_7839831476331657915", new Class[]{SNode.class, SNode.class}, new Object[]{candidate});
  }
}
