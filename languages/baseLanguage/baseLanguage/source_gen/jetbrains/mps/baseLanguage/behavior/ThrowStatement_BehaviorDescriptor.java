package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import java.util.Set;

public class ThrowStatement_BehaviorDescriptor extends Statement_BehaviorDescriptor {
  public ThrowStatement_BehaviorDescriptor() {
  }

  public void virtual_collectUncaughtMethodThrowables_5412515780383134223(SNode thisNode, Set<SNode> throwables, boolean ignoreMayBeThrowables) {
    ThrowStatement_Behavior.virtual_collectUncaughtMethodThrowables_5412515780383134223(thisNode, throwables, ignoreMayBeThrowables);
  }

  public boolean virtual_isGuardClauseStatement_1237547327995(SNode thisNode) {
    return ThrowStatement_Behavior.virtual_isGuardClauseStatement_1237547327995(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.baseLanguage.structure.ThrowStatement";
  }
}
