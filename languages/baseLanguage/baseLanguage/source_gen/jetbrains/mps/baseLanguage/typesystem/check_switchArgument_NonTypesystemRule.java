package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_switchArgument_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_switchArgument_NonTypesystemRule() {
  }

  public void applyRule(final SNode switchStatement, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    SNode arg = SLinkOperations.getTarget(switchStatement, "expression", true);
    if (arg == null) {
      return;
    }
    SNode argType = TypeChecker.getInstance().getTypeOf(arg);
    if (SNodeOperations.isInstanceOf(argType, "jetbrains.mps.baseLanguage.structure.PrimitiveType")) {
      if (!(SNodeOperations.isInstanceOf(argType, "jetbrains.mps.baseLanguage.structure.IntegerType") || SNodeOperations.isInstanceOf(argType, "jetbrains.mps.baseLanguage.structure.CharType") || SNodeOperations.isInstanceOf(argType, "jetbrains.mps.baseLanguage.structure.ByteType") || SNodeOperations.isInstanceOf(argType, "jetbrains.mps.baseLanguage.structure.ShortType"))) {
        {
          MessageTarget errorTarget = new NodeMessageTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(arg, "Primitive argument of switch should be byte, short, char or int", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "9035995549588681125", null, errorTarget);
        }
      }
      return;
    }
    if (SNodeOperations.isInstanceOf(argType, "jetbrains.mps.baseLanguage.structure.ClassifierType")) {
      if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SNodeOperations.cast(argType, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "classifier", false), "jetbrains.mps.baseLanguage.structure.EnumClass")) {
        return;
      }
    }
    if (SNodeOperations.isInstanceOf(argType, "jetbrains.mps.baseLanguage.structure.IWillBeClassifier")) {
      if (SNodeOperations.isInstanceOf(BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), SNodeOperations.cast(argType, "jetbrains.mps.baseLanguage.structure.IWillBeClassifier"), "virtual_baseClassifier_4125795553993767872", new Object[]{}), "jetbrains.mps.baseLanguage.structure.EnumClass")) {
        return;
      }

    }
    {
      MessageTarget errorTarget = new NodeMessageTarget();
      IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(arg, "Argument of switch should be enum of primitive", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "3306910260423168223", null, errorTarget);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.SwitchStatement";
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
