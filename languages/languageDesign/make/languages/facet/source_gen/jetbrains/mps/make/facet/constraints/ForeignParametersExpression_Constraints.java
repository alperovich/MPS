package jetbrains.mps.make.facet.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import java.util.Map;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BaseReferenceConstraintsDescriptor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.runtime.ReferenceScopeProvider;
import jetbrains.mps.smodel.runtime.base.BaseReferenceScopeProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.smodel.SNodePointer;

public class ForeignParametersExpression_Constraints extends BaseConstraintsDescriptor {
  public ForeignParametersExpression_Constraints() {
    super("jetbrains.mps.make.facet.structure.ForeignParametersExpression");
  }

  @Override
  protected Map<String, ReferenceConstraintsDescriptor> getNotDefaultReferences() {
    Map<String, ReferenceConstraintsDescriptor> references = new HashMap();
    references.put("target", new BaseReferenceConstraintsDescriptor("target", this) {
      @Override
      public boolean hasOwnScopeProvider() {
        return true;
      }

      @Nullable
      @Override
      public ReferenceScopeProvider getScopeProvider() {
        return new BaseReferenceScopeProvider() {
          @Override
          public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {
            final SNode td = SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.make.facet.structure.TargetDeclaration", false, false);
            SNode fd = SNodeOperations.cast(SNodeOperations.getParent(td), "jetbrains.mps.make.facet.structure.FacetDeclaration");
            return ListSequence.fromList(SLinkOperations.getTargets(fd, "targetDeclaration", true)).where(new IWhereFilter<SNode>() {
              public boolean accept(SNode sibl) {
                return sibl != td;
              }
            }).concat(ListSequence.fromList(SLinkOperations.getTargets(fd, "required", true)).translate(new ITranslator2<SNode, SNode>() {
              public Iterable<SNode> translate(SNode rfd) {
                return SLinkOperations.getTargets(SLinkOperations.getTarget(rfd, "facet", false), "targetDeclaration", true);
              }
            })).concat(ListSequence.fromList(SLinkOperations.getTargets(fd, "optional", true)).translate(new ITranslator2<SNode, SNode>() {
              public Iterable<SNode> translate(SNode rfd) {
                return SLinkOperations.getTargets(SLinkOperations.getTarget(rfd, "facet", false), "targetDeclaration", true);
              }
            }));
          }

          @Override
          public SNodeReference getSearchScopeValidatorNode() {
            return breakingNode_3lfdwm_a0a1a0a0a1a0b0a1a1;
          }
        };
      }
    });
    return references;
  }

  private static SNodePointer breakingNode_3lfdwm_a0a1a0a0a1a0b0a1a1 = new SNodePointer("r:6df86908-c97f-4644-97f0-5eff375e8e15(jetbrains.mps.make.facet.constraints)", "3344436107830239604");
}
