package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import java.util.Set;
import java.util.List;

public class TryStatement_BehaviorDescriptor extends Statement_BehaviorDescriptor implements IContainsStatementList_BehaviorDescriptor, ITryCatchStatement_BehaviorDescriptor {
  public TryStatement_BehaviorDescriptor() {
  }

  public void virtual_collectUncaughtMethodThrowables_5412515780383134223(SNode thisNode, Set<SNode> throwables, boolean ignoreMayBeThrowables) {
    TryStatement_Behavior.virtual_collectUncaughtMethodThrowables_5412515780383134223(thisNode, throwables, ignoreMayBeThrowables);
  }

  public List<SNode> virtual_getCatchClauses_3718132079121388582(SNode thisNode) {
    return TryStatement_Behavior.virtual_getCatchClauses_3718132079121388582(thisNode);
  }

  public boolean virtual_isStatementListCompact_1237546693016(SNode thisNode) {
    return IContainsStatementList_Behavior.virtual_isStatementListCompact_1237546693016(thisNode);
  }

  public boolean virtual_isStatementListCompactable_1237546012856(SNode thisNode) {
    return IContainsStatementList_Behavior.virtual_isStatementListCompactable_1237546012856(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.baseLanguage.structure.TryStatement";
  }
}
