package jetbrains.mps.build.constraints;

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
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.scope.EmptyScope;
import jetbrains.mps.smodel.SNodePointer;

public class BuildProjectDependency_Constraints extends BaseConstraintsDescriptor {
  public BuildProjectDependency_Constraints() {
    super("jetbrains.mps.build.structure.BuildProjectDependency");
  }

  @Override
  protected Map<String, ReferenceConstraintsDescriptor> getNotDefaultReferences() {
    Map<String, ReferenceConstraintsDescriptor> references = new HashMap();
    references.put("script", new BaseReferenceConstraintsDescriptor("script", this) {
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
            return breakingNode_woke7q_a0a0a0a0a1a0b0a1a1;
          }

          @Override
          public Scope createScope(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {
            {
              Scope scope = Scope.getScope(_context.getContextNode(), _context.getContextRole(), _context.getPosition(), (SNode) SConceptOperations.findConceptDeclaration("jetbrains.mps.build.structure.BuildProject"));
              return (scope == null ?
                new EmptyScope() :
                scope
              );
            }
          }
        };
      }
    });
    return references;
  }

  private static SNodePointer breakingNode_woke7q_a0a0a0a0a1a0b0a1a1 = new SNodePointer("r:5076fdb3-19c3-4563-aa26-7ace7591e78d(jetbrains.mps.build.constraints)", "8258189873530172584");
}
