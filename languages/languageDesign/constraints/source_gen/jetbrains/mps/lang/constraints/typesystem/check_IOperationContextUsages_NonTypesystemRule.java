package jetbrains.mps.lang.constraints.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_IOperationContextUsages_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_IOperationContextUsages_NonTypesystemRule() {
  }

  public void applyRule(final SNode conceptFunction, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if (SNodeOperations.isInstanceOf(SNodeOperations.getContainingRoot(conceptFunction), "jetbrains.mps.lang.constraints.structure.ConceptConstraints")) {
      for (SNode param : ListSequence.fromList(SNodeOperations.getDescendants(SLinkOperations.getTarget(conceptFunction, "body", true), "jetbrains.mps.lang.sharedConcepts.structure.ConceptFunctionParameter_operationContext", false, new String[]{}))) {
        {
          MessageTarget errorTarget = new NodeMessageTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(param, "operationContext is deprecated", "r:00000000-0000-4000-0000-011c89590309(jetbrains.mps.lang.constraints.typesystem)", "8401916545537389027", null, errorTarget);
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ConceptFunction";
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
