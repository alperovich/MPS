package org.jetbrains.mps.samples.IfAndUnless.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.errors.BaseQuickFixProvider;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_UnlessStatement_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_UnlessStatement_NonTypesystemRule() {
  }

  public void applyRule(final SNode us, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if (ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(us, "body", true), "statement", true)).isEmpty()) {
      {
        MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportWarning(SLinkOperations.getTarget(us, "body", true), "Empty statement block", "r:7da49c71-e19f-4b55-806c-76b351ee48dd(org.jetbrains.mps.samples.IfAndUnless.typesystem)", "1608374556136064235", null, errorTarget);
        {
          BaseQuickFixProvider intentionProvider = new BaseQuickFixProvider("org.jetbrains.mps.samples.IfAndUnless.typesystem.Remove_empty_unless_block_QuickFix", false);
          intentionProvider.putArgument("node", us);
          _reporter_2309309498.addIntentionProvider(intentionProvider);
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "org.jetbrains.mps.samples.IfAndUnless.structure.UnlessStatement";
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
