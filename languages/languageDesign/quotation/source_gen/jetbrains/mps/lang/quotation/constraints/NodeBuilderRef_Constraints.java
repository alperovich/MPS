package jetbrains.mps.lang.quotation.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.runtime.CheckingNodeContext;
import java.util.Map;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BaseReferenceConstraintsDescriptor;
import jetbrains.mps.smodel.runtime.ReferenceScopeProvider;
import jetbrains.mps.smodel.runtime.base.BaseScopeProvider;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.scope.Scope;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.scope.EmptyScope;
import jetbrains.mps.scope.FilteringScope;
import jetbrains.mps.scope.ModelPlusImportedScope;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.SNodePointer;

public class NodeBuilderRef_Constraints extends BaseConstraintsDescriptor {
  public NodeBuilderRef_Constraints() {
    super("jetbrains.mps.lang.quotation.structure.NodeBuilderRef");
  }

  @Override
  public boolean hasOwnCanBeChildMethod() {
    return true;
  }

  @Override
  public boolean canBeChild(@Nullable SNode node, SNode parentNode, SNode link, SNode childConcept, final IOperationContext operationContext, @Nullable final CheckingNodeContext checkingNodeContext) {
    boolean result = static_canBeAChild(node, parentNode, link, childConcept, operationContext);

    if (!(result) && checkingNodeContext != null) {
      checkingNodeContext.setBreakingNode(canBeChildBreakingPoint);
    }

    return result;
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
        return new BaseScopeProvider() {
          @Override
          public SNodeReference getSearchScopeValidatorNode() {
            return breakingNode_n8jbbc_a0a0a0a0a1a0b0a1a3;
          }

          @Override
          public Scope createScope(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {
            {
              SNode lval = SNodeOperations.getAncestor(_context.getContextNode(), "jetbrains.mps.lang.quotation.structure.NodeBuilderInitLink", true, false);
              if (lval == null) {
                return new EmptyScope();
              }
              return new FilteringScope(new ModelPlusImportedScope(_context.getModel(), false, operationContext.getScope(), BehaviorReflection.invokeVirtual(String.class, SLinkOperations.getTarget(SLinkOperations.getTarget(lval, "link", false), "target", false), "virtual_getFqName_1213877404258", new Object[]{})));
            }
          }
        };
      }
    });
    return references;
  }

  public static boolean static_canBeAChild(SNode node, SNode parentNode, SNode link, SNode childConcept, final IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(parentNode, "jetbrains.mps.lang.quotation.structure.NodeBuilderInitLink") && SPropertyOperations.hasValue(SLinkOperations.getTarget(SNodeOperations.cast(parentNode, "jetbrains.mps.lang.quotation.structure.NodeBuilderInitLink"), "link", false), "metaClass", "reference", "reference");
  }

  private static SNodePointer canBeChildBreakingPoint = new SNodePointer("r:abd7937b-2ad1-4cfc-8256-a7fa45a55f0f(jetbrains.mps.lang.quotation.constraints)", "8182547171709614824");
  private static SNodePointer breakingNode_n8jbbc_a0a0a0a0a1a0b0a1a3 = new SNodePointer("r:abd7937b-2ad1-4cfc-8256-a7fa45a55f0f(jetbrains.mps.lang.quotation.constraints)", "8182547171709834013");
}
