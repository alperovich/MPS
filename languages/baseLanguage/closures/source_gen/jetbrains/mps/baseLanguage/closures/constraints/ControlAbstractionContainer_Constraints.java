package jetbrains.mps.baseLanguage.closures.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.runtime.ReferenceScopeProvider;
import jetbrains.mps.smodel.runtime.base.BaseReferenceScopeProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsContext;
import jetbrains.mps.baseLanguage.search.VisibleClassifiersScope;
import jetbrains.mps.baseLanguage.search.IClassifiersSearchScope;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.smodel.SNodePointer;

public class ControlAbstractionContainer_Constraints extends BaseConstraintsDescriptor {
  public ControlAbstractionContainer_Constraints() {
    super("jetbrains.mps.baseLanguage.closures.structure.ControlAbstractionContainer");
  }

  @Override
  public boolean hasOwnDefaultScopeProvider() {
    return true;
  }

  @Override
  public ReferenceScopeProvider getDefaultScopeProvider() {
    return new BaseReferenceScopeProvider() {
      @Override
      public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {
        return new VisibleClassifiersScope((_context.getReferenceNode() == null ?
          _context.getEnclosingNode() :
          _context.getReferenceNode()
        ), IClassifiersSearchScope.CLASS, operationContext.getScope());
      }

      @Override
      public SNodeReference getSearchScopeValidatorNode() {
        return breakingNode_vhsk47_a0a1a0a0a2;
      }
    };
  }

  private static SNodePointer breakingNode_vhsk47_a0a1a0a0a2 = new SNodePointer("r:00000000-0000-4000-0000-011c89590334(jetbrains.mps.baseLanguage.closures.constraints)", "1229600983430");
}
