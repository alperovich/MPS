package jetbrains.mps.lang.checkedName.constraints;

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
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.ArrayList;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration_Behavior;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.smodel.SNodePointer;

public class PropertyRefExpression_Constraints extends BaseConstraintsDescriptor {
  public PropertyRefExpression_Constraints() {
    super("jetbrains.mps.lang.checkedName.structure.PropertyRefExpression");
  }

  @Override
  protected Map<String, ReferenceConstraintsDescriptor> getNotDefaultReferences() {
    Map<String, ReferenceConstraintsDescriptor> references = new HashMap();
    references.put("propertyDeclaration", new BaseReferenceConstraintsDescriptor("propertyDeclaration", this) {
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
            if (!(SNodeOperations.isInstanceOf(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getReferenceNode(), "nodeExpr", true)), "jetbrains.mps.lang.smodel.structure.SNodeType"))) {
              return new ArrayList<SNode>();
            }
            return AbstractConceptDeclaration_Behavior.call_getPropertyDeclarations_1213877394546(SLinkOperations.getTarget(SNodeOperations.cast(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getReferenceNode(), "nodeExpr", true)), "jetbrains.mps.lang.smodel.structure.SNodeType"), "concept", false));
          }

          @Override
          public SNodeReference getSearchScopeValidatorNode() {
            return breakingNode_e11h12_a0a1a0a0a1a0b0a1a1;
          }
        };
      }
    });
    return references;
  }

  private static SNodePointer breakingNode_e11h12_a0a1a0a0a1a0b0a1a1 = new SNodePointer("r:bfde7c59-4df1-47aa-b96c-63906ea441df(jetbrains.mps.lang.checkedName.constraints)", "4844813484172611612");
}
