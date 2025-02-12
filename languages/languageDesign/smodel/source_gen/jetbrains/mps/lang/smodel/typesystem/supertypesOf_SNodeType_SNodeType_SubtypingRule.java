package jetbrains.mps.lang.smodel.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import java.util.List;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SModelUtil_new;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.project.GlobalScope;
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;

public class supertypesOf_SNodeType_SNodeType_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  public supertypesOf_SNodeType_SNodeType_SubtypingRule() {
  }

  public List<SNode> getSubOrSuperTypes(SNode type, TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    List<SNode> list = new ArrayList<SNode>();
    SNode concept = SLinkOperations.getTarget(type, "concept", false);
    // DO NOT TOUCH THIS. CONCEPT MIGHT BE A TYPE VARIABLE 
    if (concept != null && SNodeOperations.isInstanceOf(concept, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration")) {
      List<SNode> superConcepts = SConceptOperations.getDirectSuperConcepts(concept, false);
      for (SNode superConcept : ListSequence.fromList(superConcepts)) {
        ListSequence.fromList(list).addElement(_quotation_createNode_c3i5bo_a0a0a1a3a1(superConcept));
      }
      ListSequence.fromList(list).addElement(_quotation_createNode_c3i5bo_a0a2a3a1());
    }
    return list;
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.smodel.structure.SNodeType";
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

  private static SNode _quotation_createNode_c3i5bo_a0a0a1a3a1(Object parameter_1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_2 = null;
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", null, null, GlobalScope.getInstance(), false);
    SNodeAccessUtil.setReferenceTarget(quotedNode_2, "concept", (SNode) parameter_1);
    return quotedNode_2;
  }

  private static SNode _quotation_createNode_c3i5bo_a0a2a3a1() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", null, null, GlobalScope.getInstance(), false);
    return quotedNode_1;
  }
}
