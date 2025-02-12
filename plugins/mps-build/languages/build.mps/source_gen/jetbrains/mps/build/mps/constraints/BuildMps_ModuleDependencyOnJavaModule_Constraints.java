package jetbrains.mps.build.mps.constraints;

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

public class BuildMps_ModuleDependencyOnJavaModule_Constraints extends BaseConstraintsDescriptor {
  public BuildMps_ModuleDependencyOnJavaModule_Constraints() {
    super("jetbrains.mps.build.mps.structure.BuildMps_ModuleDependencyOnJavaModule");
  }

  @Override
  protected Map<String, ReferenceConstraintsDescriptor> getNotDefaultReferences() {
    Map<String, ReferenceConstraintsDescriptor> references = new HashMap();
    references.put("module", new BaseReferenceConstraintsDescriptor("module", this) {
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
            return breakingNode_1sepa4_a0a0a0a0a1a0b0a1a1;
          }

          @Override
          public Scope createScope(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {
            {
              Scope scope = Scope.getScope(_context.getContextNode(), _context.getContextRole(), _context.getPosition(), (SNode) SConceptOperations.findConceptDeclaration("jetbrains.mps.build.structure.BuildSource_JavaModule"));
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

  private static SNodePointer breakingNode_1sepa4_a0a0a0a0a1a0b0a1a1 = new SNodePointer("r:76dda237-5120-4688-b749-201ab5c5059d(jetbrains.mps.build.mps.constraints)", "1224588814561902810");
}
