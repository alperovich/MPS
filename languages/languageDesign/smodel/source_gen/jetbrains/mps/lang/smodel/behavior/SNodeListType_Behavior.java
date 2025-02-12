package jetbrains.mps.lang.smodel.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.Map;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;

public class SNodeListType_Behavior {
  public static void init(SNode thisNode) {
  }

  public static String virtual_getPresentation_1213877396640(SNode thisNode) {
    SNode conceptDeclaration = SLinkOperations.getTarget(thisNode, "elementConcept", false);
    return (conceptDeclaration == null ?
      "nlist< >" :
      "nlist<" + SPropertyOperations.getString(conceptDeclaration, "name") + ">"
    );
  }

  public static List<String> virtual_getVariableSuffixes_1213877337304(SNode thisNode) {
    List<String> variableSuffixes = ListSequence.fromListAndArray(new ArrayList<String>(), "nodes");
    if ((SLinkOperations.getTarget(thisNode, "elementConcept", false) != null)) {
      String name = NameUtil.pluralize(NameUtil.decapitalize(SPropertyOperations.getString(SLinkOperations.getTarget(thisNode, "elementConcept", false), "name")));
      ListSequence.fromList(variableSuffixes).addSequence(ListSequence.fromList(NameUtil.splitByCamels(name)));
    }
    return variableSuffixes;
  }

  public static boolean virtual_hasPluralVariableSuffixes_1447667470349154499(SNode thisNode) {
    return true;
  }

  public static SNode virtual_getAbstractCreator_1213877337340(SNode thisNode) {
    SNode creator = SConceptOperations.createNewNode("jetbrains.mps.lang.smodel.structure.SNodeListCreator", null);
    SLinkOperations.setTarget(creator, "createdType", SNodeOperations.copyNode(thisNode), true);
    return creator;
  }

  public static SNode virtual_getClassExpression_1213877337357(SNode thisNode) {
    return _quotation_createNode_r176b6_a0a4();
  }

  public static boolean virtual_hasMissingParameters_3508583411997314206(SNode thisNode) {
    return (SLinkOperations.getTarget(thisNode, "elementConcept", false) == null);
  }

  public static boolean virtual_canBeCoerced_6321644624958501287(SNode thisNode, String conceptFqName) {
    if ("jetbrains.mps.baseLanguage.collections.structure.LinkedListType".equals(conceptFqName) || "jetbrains.mps.baseLanguage.collections.structure.DequeType".equals(conceptFqName) || "jetbrains.mps.baseLanguage.collections.structure.StackType".equals(conceptFqName) || "jetbrains.mps.baseLanguage.collections.structure.QueueType".equals(conceptFqName)) {
      return false;
    }
    return true;
  }

  public static void virtual_collectGenericSubstitutions_4107091686347010321(SNode thisNode, Map<SNode, SNode> substitutions) {
    BehaviorReflection.invokeVirtual(Void.class, _quotation_createNode_r176b6_a0a0h(), "virtual_collectGenericSubstitutions_4107091686347010321", new Object[]{substitutions});
  }

  private static SNode _quotation_createNode_r176b6_a0a4() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierClassExpression", null, null, GlobalScope.getInstance(), false);
    quotedNode_1.setReference("classifier", SReference.create("classifier", quotedNode_1, facade.createModelReference("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.util(JDK/java.util@java_stub)"), facade.createNodeId("~List")));
    return quotedNode_1;
  }

  private static SNode _quotation_createNode_r176b6_a0a0h() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    SNode quotedNode_2 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, null, GlobalScope.getInstance(), false);
    quotedNode_1.setReference("classifier", SReference.create("classifier", quotedNode_1, facade.createModelReference("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.util(JDK/java.util@java_stub)"), facade.createNodeId("~List")));
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, null, GlobalScope.getInstance(), false);
    quotedNode_2.setReference("classifier", SReference.create("classifier", quotedNode_2, facade.createModelReference("f:java_stub#8865b7a8-5271-43d3-884c-6fd1d9cfdd34#org.jetbrains.mps.openapi.model(MPS.OpenAPI/org.jetbrains.mps.openapi.model@java_stub)"), facade.createNodeId("~SNode")));
    quotedNode_1.addChild("parameter", quotedNode_2);
    return quotedNode_1;
  }
}
