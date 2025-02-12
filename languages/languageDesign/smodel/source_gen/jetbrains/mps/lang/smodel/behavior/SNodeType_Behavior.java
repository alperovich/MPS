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
import jetbrains.mps.baseLanguage.behavior.Type_Behavior;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;

public class SNodeType_Behavior {
  public static void init(SNode thisNode) {
  }

  public static String virtual_getPresentation_1213877396640(SNode thisNode) {
    SNode concept = SLinkOperations.getTarget(thisNode, "concept", false);
    if (concept == null) {
      return "node<>";
    }
    return "node<" + SPropertyOperations.getString(concept, "name") + ">";
  }

  public static List<String> virtual_getVariableSuffixes_1213877337304(SNode thisNode) {
    List<String> variableSuffixes = ListSequence.fromListAndArray(new ArrayList<String>(), "node");
    if (SLinkOperations.getTarget(thisNode, "concept", false) != null) {
      String name = NameUtil.decapitalize(SPropertyOperations.getString(SLinkOperations.getTarget(thisNode, "concept", false), "name"));
      ListSequence.fromList(variableSuffixes).addSequence(ListSequence.fromList(NameUtil.splitByCamels(name)));
    }
    return variableSuffixes;
  }

  public static SNode virtual_getAbstractCreator_1213877337340(SNode thisNode) {
    SNode creator = SConceptOperations.createNewNode("jetbrains.mps.lang.smodel.structure.SNodeCreator", null);
    SLinkOperations.setTarget(creator, "createdType", SNodeOperations.copyNode(thisNode), true);
    return creator;
  }

  public static SNode virtual_getClassExpression_1213877337357(SNode thisNode) {
    return _quotation_createNode_4ouf01_a0a3();
  }

  public static boolean virtual_hasMissingParameters_3508583411997314206(SNode thisNode) {
    return (SLinkOperations.getTarget(thisNode, "concept", false) == null);
  }

  public static SNode virtual_getErasure_702942408396803226(SNode thisNode) {
    return Type_Behavior.call_getJavaType_1213877337345(thisNode);
  }

  public static SNode virtual_getJavaType_1213877337345(SNode thisNode) {
    return _quotation_createNode_4ouf01_a0a6();
  }

  public static boolean virtual_canBeCoerced_6321644624958501287(SNode thisNode, String conceptFqName) {
    if ("jetbrains.mps.baseLanguage.collections.structure.SequenceType".equals(conceptFqName)) {
      return false;
    }
    return true;
  }

  private static SNode _quotation_createNode_4ouf01_a0a3() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierClassExpression", null, null, GlobalScope.getInstance(), false);
    quotedNode_1.setReference("classifier", SReference.create("classifier", quotedNode_1, facade.createModelReference("f:java_stub#8865b7a8-5271-43d3-884c-6fd1d9cfdd34#org.jetbrains.mps.openapi.model(MPS.OpenAPI/org.jetbrains.mps.openapi.model@java_stub)"), facade.createNodeId("~SNode")));
    return quotedNode_1;
  }

  private static SNode _quotation_createNode_4ouf01_a0a6() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, null, GlobalScope.getInstance(), false);
    quotedNode_1.setReference("classifier", SReference.create("classifier", quotedNode_1, facade.createModelReference("f:java_stub#8865b7a8-5271-43d3-884c-6fd1d9cfdd34#org.jetbrains.mps.openapi.model(MPS.OpenAPI/org.jetbrains.mps.openapi.model@java_stub)"), facade.createNodeId("~SNode")));
    return quotedNode_1;
  }
}
