package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_BreakStatement_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_BreakStatement_NonTypesystemRule() {
  }

  public void applyRule(final SNode nodeToCheck, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if (!(SPropertyOperations.hasValue(nodeToCheck, "label", null))) {
      final String lbl = SPropertyOperations.getString(nodeToCheck, "label");
      boolean hasMatchingLoop = ListSequence.fromList(SNodeOperations.getAncestors(nodeToCheck, "jetbrains.mps.baseLanguage.structure.AbstractLoopStatement", false)).any(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return lbl.equals(SPropertyOperations.getString(it, "label"));
        }
      });
      boolean hasMatchingSwitches = ListSequence.fromList(SNodeOperations.getAncestors(nodeToCheck, "jetbrains.mps.baseLanguage.structure.SwitchStatement", false)).any(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return lbl.equals(SPropertyOperations.getString(it, "label"));
        }
      });
      if (!(hasMatchingLoop || hasMatchingSwitches)) {
        MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(nodeToCheck, "No such label", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1199469904373", null, errorTarget);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.BreakStatement";
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
