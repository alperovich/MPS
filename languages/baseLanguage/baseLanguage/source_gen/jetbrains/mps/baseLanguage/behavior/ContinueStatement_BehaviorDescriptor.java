package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.lang.core.behavior.IDontSubstituteByDefault_BehaviorDescriptor;
import org.jetbrains.mps.openapi.model.SNode;

public class ContinueStatement_BehaviorDescriptor extends Statement_BehaviorDescriptor implements IDontSubstituteByDefault_BehaviorDescriptor {
  public ContinueStatement_BehaviorDescriptor() {
  }

  public boolean virtual_isGuardClauseStatement_1237547327995(SNode thisNode) {
    return ContinueStatement_Behavior.virtual_isGuardClauseStatement_1237547327995(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.baseLanguage.structure.ContinueStatement";
  }
}
