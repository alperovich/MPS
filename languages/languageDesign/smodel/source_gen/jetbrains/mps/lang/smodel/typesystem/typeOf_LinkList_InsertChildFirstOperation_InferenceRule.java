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

public class typeOf_LinkList_InsertChildFirstOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeOf_LinkList_InsertChildFirstOperation_InferenceRule() {
  }

  public void applyRule(final SNode op, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    // checking 
    SNode parameter = SLinkOperations.getTarget(op, "childNode", true);
    if ((parameter != null)) {
      final SNode ExpectedType_typevar_1206101286415 = typeCheckingContext.createNewRuntimeTypesVariable();
      RulesUtil.equate_inputNodeType(typeCheckingContext, op, typeCheckingContext.getRepresentative(ExpectedType_typevar_1206101286415));
      SNode parmType = typeCheckingContext.typeOf(parameter, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1205272570106", true);
      {
        SNode _nodeToCheck_1029348928467 = op;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1205272570108", 0, null);
        typeCheckingContext.createLessThanInequality((SNode) parmType, (SNode) typeCheckingContext.getRepresentative(ExpectedType_typevar_1206101286415), false, true, _info_12389875345);
      }
    }
    // op returns node passed in parameter 
    {
      SNode _nodeToCheck_1029348928467 = op;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1225407664153", 0, null);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1225407664160", true), (SNode) typeCheckingContext.typeOf(SLinkOperations.getTarget(op, "childNode", true), "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1225407664155", true), _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.smodel.structure.LinkList_InsertChildFirstOperation";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConcept().getQualifiedName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean overrides() {
    return true;
  }
}
