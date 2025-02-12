package jetbrains.mps.samples.lambdaCalculus.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_BinaryOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_BinaryOperation_InferenceRule() {
  }

  public void applyRule(final SNode binaryOperation, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(binaryOperation, "left", true);
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:8c01d5e0-82c3-43e7-9986-af954df6cb8b(jetbrains.mps.samples.lambdaCalculus.typesystem)", "6645816968628541097", 0, null);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:8c01d5e0-82c3-43e7-9986-af954df6cb8b(jetbrains.mps.samples.lambdaCalculus.typesystem)", "6645816968628541093", true), (SNode) typeCheckingContext.typeOf(SLinkOperations.getTarget(binaryOperation, "right", true), "r:8c01d5e0-82c3-43e7-9986-af954df6cb8b(jetbrains.mps.samples.lambdaCalculus.typesystem)", "1888188276221891129", true), _info_12389875345);
    }
    {
      SNode _nodeToCheck_1029348928467 = binaryOperation;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:8c01d5e0-82c3-43e7-9986-af954df6cb8b(jetbrains.mps.samples.lambdaCalculus.typesystem)", "4530871765544565313", 0, null);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:8c01d5e0-82c3-43e7-9986-af954df6cb8b(jetbrains.mps.samples.lambdaCalculus.typesystem)", "4530871765544565317", true), (SNode) typeCheckingContext.typeOf(SLinkOperations.getTarget(binaryOperation, "right", true), "r:8c01d5e0-82c3-43e7-9986-af954df6cb8b(jetbrains.mps.samples.lambdaCalculus.typesystem)", "1888188276221891135", true), _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.samples.lambdaCalculus.structure.BinaryOperation";
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
}
