package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.baseLanguage.behavior.BaseMethodDeclaration_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.errors.BaseQuickFixProvider;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.behavior.ParameterDeclaration_Behavior;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_OverrideNullAnnotations_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_OverrideNullAnnotations_NonTypesystemRule() {
  }

  public void applyRule(final SNode method, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    SNode superMethod = BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), method, "virtual_getNearestOverriddenMethod_5358895268254685434", new Object[]{});
    if ((superMethod == null)) {
      return;
    }
    if (BaseMethodDeclaration_Behavior.call_hasAnnotation_5499146221535822693(superMethod, SNodeOperations.getNode("f:java_stub#3f233e7f-b8a6-46d2-a57f-795d56775243#org.jetbrains.annotations(Annotations/org.jetbrains.annotations@java_stub)", "~NotNull"))) {
      if (!(BaseMethodDeclaration_Behavior.call_hasAnnotation_5499146221535822693(method, SNodeOperations.getNode("f:java_stub#3f233e7f-b8a6-46d2-a57f-795d56775243#org.jetbrains.annotations(Annotations/org.jetbrains.annotations@java_stub)", "~NotNull")))) {
        {
          MessageTarget errorTarget = new NodeMessageTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(method, "This method must have @NotNull annotation", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "5499146221535829680", null, errorTarget);
          {
            BaseQuickFixProvider intentionProvider = new BaseQuickFixProvider("jetbrains.mps.baseLanguage.typesystem.Add_NotNullAnnotation_QuickFix", false);
            intentionProvider.putArgument("method", method);
            _reporter_2309309498.addIntentionProvider(intentionProvider);
          }
        }
      }
    }
    for (int i = 0; i < ListSequence.fromList(SLinkOperations.getTargets(superMethod, "parameter", true)).count(); i++) {
      if (ParameterDeclaration_Behavior.call_hasAnnotation_5499146221535981742(ListSequence.fromList(SLinkOperations.getTargets(superMethod, "parameter", true)).getElement(i), SNodeOperations.getNode("f:java_stub#3f233e7f-b8a6-46d2-a57f-795d56775243#org.jetbrains.annotations(Annotations/org.jetbrains.annotations@java_stub)", "~Nullable"))) {
        SNode param = ListSequence.fromList(SLinkOperations.getTargets(method, "parameter", true)).getElement(i);
        if (param != null && !(ParameterDeclaration_Behavior.call_hasAnnotation_5499146221535981742(param, SNodeOperations.getNode("f:java_stub#3f233e7f-b8a6-46d2-a57f-795d56775243#org.jetbrains.annotations(Annotations/org.jetbrains.annotations@java_stub)", "~Nullable")))) {
          {
            MessageTarget errorTarget = new NodeMessageTarget();
            IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(param, "This parameter must have @Nullable annotation", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "5499146221535981784", null, errorTarget);
            {
              BaseQuickFixProvider intentionProvider = new BaseQuickFixProvider("jetbrains.mps.baseLanguage.typesystem.Add_NullableAnnotationToParameter_QuickFix", false);
              intentionProvider.putArgument("parameter", param);
              _reporter_2309309498.addIntentionProvider(intentionProvider);
            }
          }
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration";
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
