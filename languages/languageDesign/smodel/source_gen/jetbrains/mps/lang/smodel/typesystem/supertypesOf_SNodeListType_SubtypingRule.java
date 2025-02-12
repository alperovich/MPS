package jetbrains.mps.lang.smodel.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import java.util.List;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.SModelUtil_new;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.project.GlobalScope;
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;
import jetbrains.mps.smodel.SReference;

public class supertypesOf_SNodeListType_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  public supertypesOf_SNodeListType_SubtypingRule() {
  }

  public List<SNode> getSubOrSuperTypes(SNode type, TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    List<SNode> supertypes = ListSequence.fromList(new ArrayList<SNode>());
    SNode elementConcept = SLinkOperations.getTarget(type, "elementConcept", false);
    if (elementConcept != null) {
      List<SNode> superConcepts = SConceptOperations.getDirectSuperConcepts(elementConcept, false);
      for (SNode superConcept : ListSequence.fromList(superConcepts)) {
        ListSequence.fromList(supertypes).addElement(_quotation_createNode_f6ipu3_a0a0a1a2a1(superConcept));
      }
      // ========== 
      ListSequence.fromList(supertypes).addElement(_quotation_createNode_f6ipu3_a0a3a2a1());
    }
    ListSequence.fromList(supertypes).addElement(_quotation_createNode_f6ipu3_a0a3a1(elementConcept));
    ListSequence.fromList(supertypes).addElement(_quotation_createNode_f6ipu3_a0a4a1());
    return supertypes;
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.smodel.structure.SNodeListType";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConcept().getQualifiedName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean isWeak() {
    return false;
  }

  private static SNode _quotation_createNode_f6ipu3_a0a0a1a2a1(Object parameter_1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_2 = null;
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeListType", null, null, GlobalScope.getInstance(), false);
    SNodeAccessUtil.setReferenceTarget(quotedNode_2, "elementConcept", (SNode) parameter_1);
    return quotedNode_2;
  }

  private static SNode _quotation_createNode_f6ipu3_a0a3a2a1() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeListType", null, null, GlobalScope.getInstance(), false);
    return quotedNode_1;
  }

  private static SNode _quotation_createNode_f6ipu3_a0a3a1(Object parameter_1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_2 = null;
    SNode quotedNode_3 = null;
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.ListType", null, null, GlobalScope.getInstance(), false);
    quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", null, null, GlobalScope.getInstance(), false);
    SNodeAccessUtil.setReferenceTarget(quotedNode_3, "concept", (SNode) parameter_1);
    quotedNode_2.addChild("elementType", quotedNode_3);
    return quotedNode_2;
  }

  private static SNode _quotation_createNode_f6ipu3_a0a4a1() {
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
