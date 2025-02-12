package jetbrains.mps.console.blCommand.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.smodel.SModelUtil_new;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;

public class typeof_ProjectExpression_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_ProjectExpression_InferenceRule() {
  }

  public void applyRule(final SNode projectExpression, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    {
      SNode _nodeToCheck_1029348928467 = projectExpression;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:7e8cfa8a-da13-467d-9878-63b90b943128(jetbrains.mps.console.blCommand.typesystem)", "752693057587763729", 0, null);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:7e8cfa8a-da13-467d-9878-63b90b943128(jetbrains.mps.console.blCommand.typesystem)", "752693057587762707", true), (SNode) _quotation_createNode_osiggc_a0a0b(), _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.console.blCommand.structure.ProjectExpression";
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

  private static SNode _quotation_createNode_osiggc_a0a0b() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, null, GlobalScope.getInstance(), false);
    quotedNode_1.setReference("classifier", SReference.create("classifier", quotedNode_1, facade.createModelReference("f:java_stub#6ed54515-acc8-4d1e-a16c-9fd6cfe951ea#jetbrains.mps.project(MPS.Core/jetbrains.mps.project@java_stub)"), facade.createNodeId("~Project")));
    return quotedNode_1;
  }
}
