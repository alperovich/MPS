package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;

public abstract class BaseAssignmentExpression_BehaviorDescriptor extends Expression_BehaviorDescriptor {
  public BaseAssignmentExpression_BehaviorDescriptor() {
  }

  public boolean virtual_isLegalAsStatement_1239211900844(SNode thisNode) {
    return BaseAssignmentExpression_Behavior.virtual_isLegalAsStatement_1239211900844(thisNode);
  }

  public boolean virtual_isReadAsignment_1215696236033(SNode thisNode) {
    return BaseAssignmentExpression_Behavior.virtual_isReadAsignment_1215696236033(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.baseLanguage.structure.BaseAssignmentExpression";
  }
}
