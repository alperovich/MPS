package jetbrains.mps.lang.traceable.operations.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.typesystem.RulesUtil;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.smodel.SModelUtil_new;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.project.GlobalScope;
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;

public class typeof_Node_CopyWithTraceOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_Node_CopyWithTraceOperation_InferenceRule() {
  }

  public void applyRule(final SNode node, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    final SNode Concept_typevar_1205967749950 = typeCheckingContext.createNewRuntimeTypesVariable();
    RulesUtil.equate_inputNodeConcept(typeCheckingContext, node, typeCheckingContext.getRepresentative(Concept_typevar_1205967749950));
    {
      SNode _nodeToCheck_1029348928467 = node;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:8456500c-6587-4a83-9f3b-ee95eb04cd7e(jetbrains.mps.lang.traceable.operations.typesystem)", "1205967749964", 0, null);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:8456500c-6587-4a83-9f3b-ee95eb04cd7e(jetbrains.mps.lang.traceable.operations.typesystem)", "1205967749966", true), (SNode) _quotation_createNode_vvrymp_a0c0b(typeCheckingContext.getRepresentative(Concept_typevar_1205967749950)), _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.traceable.operations.structure.Node_CopyWithTraceOperation";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConcept().getQualifiedName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean overrides() {
    return true;
  }

  private static SNode _quotation_createNode_vvrymp_a0c0b(Object parameter_1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_2 = null;
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", null, null, GlobalScope.getInstance(), false);
    SNodeAccessUtil.setReferenceTarget(quotedNode_2, "concept", (SNode) parameter_1);
    return quotedNode_2;
  }
}
