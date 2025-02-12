package jetbrains.mps.lang.smodel.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_Link_SetTargetOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeOf_Link_SetTargetOperation_InferenceRule() {
  }

  public void applyRule(final SNode op, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    // checking 
    SNode parameter = SLinkOperations.getTarget(op, "linkTarget", true);
    if ((parameter != null)) {
      final SNode ExpectedType_typevar_1206101371703 = typeCheckingContext.createNewRuntimeTypesVariable();
      RulesUtil.equate_inputNodeType(typeCheckingContext, op, typeCheckingContext.getRepresentative(ExpectedType_typevar_1206101371703));
      SNode parmType = typeCheckingContext.typeOf(parameter, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1186060393994", true);
      {
        SNode _nodeToCheck_1029348928467 = op;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1186060404653", 0, null);
        typeCheckingContext.createLessThanInequality((SNode) parmType, (SNode) typeCheckingContext.getRepresentative(ExpectedType_typevar_1206101371703), false, true, _info_12389875345);
      }
    }
    // op returns node passed in parameter 
    {
      SNode _nodeToCheck_1029348928467 = op;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1225406438063", 0, null);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1225406429482", true), (SNode) typeCheckingContext.typeOf(SLinkOperations.getTarget(op, "linkTarget", true), "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1225406448709", true), _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.smodel.structure.Link_SetTargetOperation";
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
