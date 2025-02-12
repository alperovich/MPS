package jetbrains.mps.baseLanguage.scopes;

/*Generated by MPS */

import jetbrains.mps.scope.Scope;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.scope.EmptyScope;
import jetbrains.mps.scope.FilteringScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.util.NameUtil;

public class MigrationScopes {
  private MigrationScopes() {
  }

  public static Scope forVariables(SNode declarationConcept, SNode contextNode, String contextRole, int position) {
    return filterByConceptScope(Scope.getScope(contextNode, contextRole, position, SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.VariableDeclaration")), declarationConcept);
  }

  public static Scope forMethods(SNode declarationConcept, SNode contextNode, String contextRole, int position) {
    return filterByConceptScope(Scope.getScope(contextNode, contextRole, position, SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.MethodDeclaration")), declarationConcept);
  }

  private static Scope filterByConceptScope(@Nullable Scope innerScope, @NotNull SNode concept) {
    if (innerScope != null) {
      return new MigrationScopes.FilterByConceptScope(innerScope, concept);
    } else {
      return new EmptyScope();
    }
  }

  private static class FilterByConceptScope extends FilteringScope {
    private final SNode concept;

    public FilterByConceptScope(@NotNull Scope innerScope, @NotNull SNode concept) {
      // todo: move this scope to mps.core? 
      super(innerScope);
      this.concept = concept;
    }

    @Override
    public boolean isExcluded(SNode node) {
      return !(SNodeOperations.isInstanceOf(node, NameUtil.nodeFQName(concept)));
    }
  }
}
