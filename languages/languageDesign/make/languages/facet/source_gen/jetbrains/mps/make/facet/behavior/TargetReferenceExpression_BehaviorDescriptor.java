package jetbrains.mps.make.facet.behavior;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.behavior.Expression_BehaviorDescriptor;
import jetbrains.mps.lang.core.behavior.IDontSubstituteByDefault_BehaviorDescriptor;
import org.jetbrains.mps.openapi.language.SConcept;

public class TargetReferenceExpression_BehaviorDescriptor extends Expression_BehaviorDescriptor implements IDontSubstituteByDefault_BehaviorDescriptor {
  public TargetReferenceExpression_BehaviorDescriptor() {
  }

  public boolean virtual_legalAsStatement_1262430001741498032(SConcept thisConcept) {
    return TargetReferenceExpression_Behavior.virtual_legalAsStatement_1262430001741498032(thisConcept);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.make.facet.structure.TargetReferenceExpression";
  }
}
