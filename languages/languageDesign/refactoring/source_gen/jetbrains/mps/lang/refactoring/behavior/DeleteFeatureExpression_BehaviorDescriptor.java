package jetbrains.mps.lang.refactoring.behavior;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.behavior.Expression_BehaviorDescriptor;
import org.jetbrains.mps.openapi.language.SConcept;

public class DeleteFeatureExpression_BehaviorDescriptor extends Expression_BehaviorDescriptor implements RefactoringAction_BehaviorDescriptor {
  public DeleteFeatureExpression_BehaviorDescriptor() {
  }

  public boolean virtual_legalAsStatement_1262430001741498032(SConcept thisConcept) {
    return DeleteFeatureExpression_Behavior.virtual_legalAsStatement_1262430001741498032(thisConcept);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.lang.refactoring.structure.DeleteFeatureExpression";
  }
}
