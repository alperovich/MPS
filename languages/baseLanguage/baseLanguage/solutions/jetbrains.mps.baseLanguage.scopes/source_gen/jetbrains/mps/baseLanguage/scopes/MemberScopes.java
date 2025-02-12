package jetbrains.mps.baseLanguage.scopes;

/*Generated by MPS */

import jetbrains.mps.scope.Scope;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.scope.FilteringScope;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

@Deprecated
public class MemberScopes {
  @Deprecated
  private MemberScopes() {
  }

  @Deprecated
  public static Scope nonAbstractMethods(@NotNull Scope scope) {
    // just filter members like this 
    return new FilteringScope(scope) {
      @Override
      public boolean isExcluded(SNode node) {
        return !(SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration")) || BehaviorReflection.invokeVirtual(Boolean.TYPE, SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration"), "virtual_isAbstract_1232982539764", new Object[]{});
      }
    };
  }

  @Deprecated
  public static Scope visibleClassifierMembers(@NotNull Scope scope, final SNode contextClassifier, final SNode contextNode) {
    // use (sequence<node<IClassifierMember>>) classifierType.getVisibleMembers() instead 
    return new FilteringScope(scope) {
      @Override
      public boolean isExcluded(SNode node) {
        return !(SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.ClassifierMember")) || !(BehaviorReflection.invokeVirtual(Boolean.TYPE, SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.ClassifierMember"), "virtual_isVisible_8083692786967482069", new Object[]{contextClassifier, contextNode}));
      }
    };
  }

  @Deprecated
  public static Scope visibleClassifierMembers(SNode contextClassifier, SNode kind, SNode contextNode) {
    // use (sequence<node<IClassifierMember>>) classifierType.getVisibleMembers() instead 
    Scope membersScope = BehaviorReflection.invokeVirtual(Scope.class, contextClassifier, "virtual_getMembers_2201875424515824604", new Object[]{kind});
    if (membersScope == null) {
      throw new IllegalArgumentException("Member scope for classifier " + SPropertyOperations.getString(contextClassifier, "name") + " and kind " + SPropertyOperations.getString(kind, "name") + " is null");
    }
    return visibleClassifierMembers(membersScope, contextClassifier, contextNode);
  }
}
