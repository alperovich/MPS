package jetbrains.mps.lang.refactoring.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.smodel.SModelUtil_new;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.project.GlobalScope;
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;

public class typeof_NodeTarget_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_NodeTarget_InferenceRule() {
  }

  public void applyRule(final SNode nodeTarget, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    SNode nodeConcept = SLinkOperations.getTarget(nodeTarget, "concept", false);
    if ((nodeConcept != null)) {
      {
        SNode _nodeToCheck_1029348928467 = nodeTarget;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590316(jetbrains.mps.lang.refactoring.typesystem)", "1817812116820054012", 0, null);
        typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590316(jetbrains.mps.lang.refactoring.typesystem)", "1817812116820054019", true), (SNode) _quotation_createNode_vg2rij_a0a0b0b(nodeConcept), _info_12389875345);
      }
    } else {
      {
        SNode _nodeToCheck_1029348928467 = nodeTarget;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590316(jetbrains.mps.lang.refactoring.typesystem)", "1817812116820054026", 0, null);
        typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590316(jetbrains.mps.lang.refactoring.typesystem)", "1817812116820054031", true), (SNode) _quotation_createNode_vg2rij_a0a0a1a1(), _info_12389875345);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.refactoring.structure.NodeTarget";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConcept().getQualifiedName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean overrides() {
    return false;
  }

  private static SNode _quotation_createNode_vg2rij_a0a0b0b(Object parameter_1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_2 = null;
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", null, null, GlobalScope.getInstance(), false);
    SNodeAccessUtil.setReferenceTarget(quotedNode_2, "concept", (SNode) parameter_1);
    return quotedNode_2;
  }

  private static SNode _quotation_createNode_vg2rij_a0a0a1a1() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", null, null, GlobalScope.getInstance(), false);
    return quotedNode_1;
  }
}
