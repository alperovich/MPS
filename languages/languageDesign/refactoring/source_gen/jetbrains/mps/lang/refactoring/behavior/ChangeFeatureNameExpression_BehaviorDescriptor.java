package jetbrains.mps.lang.refactoring.behavior;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.behavior.Expression_BehaviorDescriptor;
import org.jetbrains.mps.openapi.language.SConcept;

public class ChangeFeatureNameExpression_BehaviorDescriptor extends Expression_BehaviorDescriptor implements RefactoringAction_BehaviorDescriptor {
  public ChangeFeatureNameExpression_BehaviorDescriptor() {
  }

  public boolean virtual_legalAsStatement_1262430001741498032(SConcept thisConcept) {
    return ChangeFeatureNameExpression_Behavior.virtual_legalAsStatement_1262430001741498032(thisConcept);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.lang.refactoring.structure.ChangeFeatureNameExpression";
  }
}
