package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.lang.core.behavior.ScopeProvider_BehaviorDescriptor;
import jetbrains.mps.scope.Scope;
import org.jetbrains.mps.openapi.model.SNode;

public abstract class Closure_BehaviorDescriptor extends ConceptFunction_BehaviorDescriptor implements Closureoid_BehaviorDescriptor, ScopeProvider_BehaviorDescriptor {
  public Closure_BehaviorDescriptor() {
  }

  public Scope virtual_getScope_3734116213129936182(SNode thisNode, SNode kind, SNode child) {
    return Closure_Behavior.virtual_getScope_3734116213129936182(thisNode, kind, child);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.baseLanguage.structure.Closure";
  }
}
