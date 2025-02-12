package jetbrains.mps.samples.Kaja.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import java.util.Map;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BaseReferenceConstraintsDescriptor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.runtime.ReferenceScopeProvider;
import jetbrains.mps.smodel.runtime.base.BaseScopeProvider;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.scope.Scope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsContext;
import jetbrains.mps.scope.CompositeScope;
import jetbrains.mps.scope.SimpleRoleScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.smodel.SNodePointer;

public class RoutineCall_Constraints extends BaseConstraintsDescriptor {
  public RoutineCall_Constraints() {
    super("jetbrains.mps.samples.Kaja.structure.RoutineCall");
  }

  @Override
  protected Map<String, ReferenceConstraintsDescriptor> getNotDefaultReferences() {
    Map<String, ReferenceConstraintsDescriptor> references = new HashMap();
    references.put("definition", new BaseReferenceConstraintsDescriptor("definition", this) {
      @Override
      public boolean hasOwnScopeProvider() {
        return true;
      }

      @Nullable
      @Override
      public ReferenceScopeProvider getScopeProvider() {
        return new BaseScopeProvider() {
          @Override
          public SNodeReference getSearchScopeValidatorNode() {
            return breakingNode_b5nlto_a0a0a0a0a1a0b0a1a1;
          }

          @Override
          public Scope createScope(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {
            {
              final CompositeScope scope = new CompositeScope(SimpleRoleScope.forNamedElements(SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.samples.Kaja.structure.Script", true, false), SLinkOperations.findLinkDeclaration("jetbrains.mps.samples.Kaja.structure.Script", "definitions")), SimpleRoleScope.forNamedElements(SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.samples.Kaja.structure.Library", true, false), SLinkOperations.findLinkDeclaration("jetbrains.mps.samples.Kaja.structure.Library", "definitions")), new Scope() {
                /**
                 * Returns all available elements in the scope.
                 * 
                 * @param prefix (if not null) filters out elements whose reference text doesn't start with prefix
                 * @return list of nodes in the scope
                 */
                @Override
                public Iterable<SNode> getAvailableElements(@Nullable String prefix) {
                  return ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.samples.Kaja.structure.Script", true, false), "body", true), "commands", true)).where(new IWhereFilter<SNode>() {
                    public boolean accept(SNode it) {
                      return SNodeOperations.isInstanceOf(it, "jetbrains.mps.samples.Kaja.structure.RoutineDefinition");
                    }
                  });
                }

                /**
                 * Resolves element by reference text.
                 * 
                 * Invariant: getReferenceText(contextNode, resolve(contextNode, refText)) == refText
                 * 
                 * @param contextNode source node for the reference, or its nearest parent node (if source node is unavailable)
                 * @param refText reference text
                 * @return resolved element when reference text unambiguously identifies element, null otherwise
                 */
                @Nullable
                @Override
                public SNode resolve(SNode contextNode, @NotNull final String refText) {
                  return ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.samples.Kaja.structure.Script", true, false), "body", true), "commands", true)).where(new IWhereFilter<SNode>() {
                    public boolean accept(SNode it) {
                      return SNodeOperations.isInstanceOf(it, "jetbrains.mps.samples.Kaja.structure.RoutineDefinition");
                    }
                  }).where(new IWhereFilter<SNode>() {
                    public boolean accept(SNode it) {
                      return SPropertyOperations.getString(SNodeOperations.cast(it, "jetbrains.mps.samples.Kaja.structure.RoutineDefinition"), "name").equals(refText);
                    }
                  }).first();
                }

                /**
                 * Creates textual reference for scope element. If element has no textual representation
                 * for the reference, returns null.
                 * 
                 * Invariant: resolve(contextNode, getReferenceText(contextNode, node)) == node
                 * 
                 * @param contextNode source node for the reference, or its nearest parent node (if source node is unavailable)
                 * @param node element from the current scope (contains(node) == true)
                 * @return reference text for the node element in the current scope
                 */
                @Nullable
                @Override
                public String getReferenceText(SNode contextNode, @NotNull SNode node) {
                  if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.samples.Kaja.structure.RoutineDefinition")) {
                    return SPropertyOperations.getString(SNodeOperations.cast(node, "jetbrains.mps.samples.Kaja.structure.RoutineDefinition"), "name");
                  } else {
                    return null;
                  }
                }
              });

              ListSequence.fromList(SNodeOperations.getDescendants(SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.samples.Kaja.structure.Script", true, false), "jetbrains.mps.samples.Kaja.structure.Require", false, new String[]{})).visitAll(new IVisitor<SNode>() {
                public void visit(SNode it) {
                  scope.addScope(SimpleRoleScope.forNamedElements(SLinkOperations.getTarget(it, "library", false), SLinkOperations.findLinkDeclaration("jetbrains.mps.samples.Kaja.structure.Library", "definitions")));
                }
              });
              return scope;
            }
          }
        };
      }
    });
    return references;
  }

  private static SNodePointer breakingNode_b5nlto_a0a0a0a0a1a0b0a1a1 = new SNodePointer("r:6c66d6ce-c8f4-4daf-92c4-a518b78006a8(jetbrains.mps.samples.Kaja.constraints)", "3308300503039795743");
}
