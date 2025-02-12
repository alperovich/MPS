package jetbrains.mps.lang.editor.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_EditorComponentDeclaration_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_EditorComponentDeclaration_NonTypesystemRule() {
  }

  public void applyRule(final SNode reference, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    SNode editorComponent = SNodeOperations.as(SNodeOperations.getParent(reference), "jetbrains.mps.lang.editor.structure.EditorComponentDeclaration");
    if (editorComponent == null || SLinkOperations.getTarget(reference, "editorComponent", false) == null) {
      return;
    }
    if (SLinkOperations.getTarget(SLinkOperations.getTarget(reference, "editorComponent", false), "overridenEditorComponent", true) != null) {
      {
        MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(reference, "Overriden EditorComponent is overriding another editor component. It's possible to override only main editor component directly.", "r:00000000-0000-4000-0000-011c8959029a(jetbrains.mps.lang.editor.typesystem)", "608335627140284576", null, errorTarget);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.editor.structure.EditorComponentDeclarationReference";
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
