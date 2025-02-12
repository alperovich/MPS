package jetbrains.mps.lang.typesystem.constraints;

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
import jetbrains.mps.internal.collections.runtime.Sequence;
import java.util.Collections;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.pattern.IMatchingPattern;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration_Behavior;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.smodel.SNodePointer;

public class ReferenceMessageTarget_Constraints extends BaseConstraintsDescriptor {
  public ReferenceMessageTarget_Constraints() {
    super("jetbrains.mps.lang.typesystem.structure.ReferenceMessageTarget");
  }

  @Override
  protected Map<String, ReferenceConstraintsDescriptor> getNotDefaultReferences() {
    Map<String, ReferenceConstraintsDescriptor> references = new HashMap();
    references.put("linkDeclaration", new BaseReferenceConstraintsDescriptor("linkDeclaration", this) {
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
            SNode messageStatement = SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.lang.typesystem.structure.MessageStatement", true, false);
            if (messageStatement == null) {
              return Sequence.fromIterable(Collections.<SNode>emptyList());
            }
            SNode nodetype = TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(messageStatement, "nodeToReport", true));
            {
              IMatchingPattern pattern_h95xiq_d0a0 = HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.lang.smodel.structure.SNodeType");
              SNode coercedNode_h95xiq_d0a0 = TypeChecker.getInstance().getRuntimeSupport().coerce_(nodetype, pattern_h95xiq_d0a0);
              if (coercedNode_h95xiq_d0a0 != null) {
                return AbstractConceptDeclaration_Behavior.call_getLinkDeclarations_1213877394480(SLinkOperations.getTarget(coercedNode_h95xiq_d0a0, "concept", false));
              } else {
                return Sequence.fromIterable(Collections.<SNode>emptyList());
              }
            }
          }

          @Override
          public SNodeReference getSearchScopeValidatorNode() {
            return breakingNode_h95xiq_a0a1a0a0a1a0b0a1a1;
          }
        };
      }
    });
    return references;
  }

  private static SNodePointer breakingNode_h95xiq_a0a1a0a0a1a0b0a1a1 = new SNodePointer("r:00000000-0000-4000-0000-011c895902ae(jetbrains.mps.lang.typesystem.constraints)", "1227101206988");
}
