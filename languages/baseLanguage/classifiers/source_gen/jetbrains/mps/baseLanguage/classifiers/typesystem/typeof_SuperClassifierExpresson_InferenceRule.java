package jetbrains.mps.baseLanguage.classifiers.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.baseLanguage.classifiers.behavior.SuperClassifierExpresson_Behavior;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_SuperClassifierExpresson_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_SuperClassifierExpresson_InferenceRule() {
  }

  public void applyRule(final SNode expresson, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    SNode classifier = SuperClassifierExpresson_Behavior.call_getClassifier_1217434044387(expresson);
    if (classifier != null) {
      {
        SNode _nodeToCheck_1029348928467 = expresson;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590371(jetbrains.mps.baseLanguage.classifiers.typesystem)", "1217434001449", 0, null);
        typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590371(jetbrains.mps.baseLanguage.classifiers.typesystem)", "1217434001451", true), (SNode) BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), classifier, "virtual_createSuperType_1217433657148", new Object[]{}), _info_12389875345);
      }
    } else {
      {
        MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(expresson, "super classifier expression isn't applicable in this place", "r:00000000-0000-4000-0000-011c89590371(jetbrains.mps.baseLanguage.classifiers.typesystem)", "1217434001462", null, errorTarget);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.classifiers.structure.SuperClassifierExpresson";
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
