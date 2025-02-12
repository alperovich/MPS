package org.jetbrains.mps.samples.ParallelFor.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.errors.BaseQuickFixProvider;
import jetbrains.mps.smodel.SModelUtil_new;

public class NoAssignmentsToNonFinalVariablesOutsideTheScope_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public NoAssignmentsToNonFinalVariablesOutsideTheScope_NonTypesystemRule() {
  }

  public void applyRule(final SNode variableReference, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    SNode directAncestor = SNodeOperations.getAncestor(variableReference, "org.jetbrains.mps.samples.ParallelFor.structure.ParallelFor", false, false);
    if (directAncestor != null && !(SNodeOperations.hasRole(variableReference, "org.jetbrains.mps.samples.ParallelFor.structure.ParallelFor", "threadPool"))) {
      SNode variableDeclaration = SLinkOperations.getTarget(variableReference, "variableDeclaration", false);

      SNode declarationsAncestor = SNodeOperations.getAncestor(variableDeclaration, "org.jetbrains.mps.samples.ParallelFor.structure.ParallelFor", false, false);
      if (directAncestor != declarationsAncestor) {
        if (!(SPropertyOperations.getBoolean(variableDeclaration, "isFinal"))) {
          {
            MessageTarget errorTarget = new NodeMessageTarget();
            IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(variableReference, "Cannot refer non-final variables and parameters from within concurrent code", "r:4c36f4b4-7816-4067-aa6e-a49c547265ed(org.jetbrains.mps.samples.ParallelFor.typesystem)", "7793246093816027855", null, errorTarget);
            {
              BaseQuickFixProvider intentionProvider = new BaseQuickFixProvider("org.jetbrains.mps.samples.ParallelFor.typesystem.MakeDeclarationFinal_QuickFix", false);
              _reporter_2309309498.addIntentionProvider(intentionProvider);
            }
          }
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.VariableReference";
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
