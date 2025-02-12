package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_SynchronizedStatement_NonFinalFields_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_SynchronizedStatement_NonFinalFields_NonTypesystemRule() {
  }

  public void applyRule(final SNode synchronizedStatement, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    SNode expression = SLinkOperations.getTarget(synchronizedStatement, "expression", true);
    SNode field = null;
    if (SNodeOperations.isInstanceOf(expression, "jetbrains.mps.baseLanguage.structure.StaticFieldReference")) {
      field = SLinkOperations.getTarget(SNodeOperations.cast(expression, "jetbrains.mps.baseLanguage.structure.StaticFieldReference"), "variableDeclaration", false);
    } else if (SNodeOperations.isInstanceOf(expression, "jetbrains.mps.baseLanguage.structure.DotExpression") && SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SNodeOperations.cast(expression, "jetbrains.mps.baseLanguage.structure.DotExpression"), "operation", true), "jetbrains.mps.baseLanguage.structure.FieldReferenceOperation")) {
      field = SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(SNodeOperations.cast(expression, "jetbrains.mps.baseLanguage.structure.DotExpression"), "operation", true), "jetbrains.mps.baseLanguage.structure.FieldReferenceOperation"), "fieldDeclaration", false);
    }
    if (field != null && !(SPropertyOperations.getBoolean(field, "isFinal"))) {
      {
        MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportWarning(expression, "synchronization on non-final field", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "3207444945806619713", null, errorTarget);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.SynchronizedStatement";
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
