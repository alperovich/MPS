package jetbrains.mps.execution.commands.constraints;

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
import jetbrains.mps.smodel.runtime.base.BaseReferenceScopeProvider;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsContext;
import jetbrains.mps.execution.commands.behavior.ExecuteCommandPart_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.smodel.SNodePointer;

public class CommandParameterReference_Constraints extends BaseConstraintsDescriptor {
  public CommandParameterReference_Constraints() {
    super("jetbrains.mps.execution.commands.structure.CommandParameterReference");
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
    references.put("parameter", new BaseReferenceConstraintsDescriptor("parameter", this) {
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
            return ExecuteCommandPart_Behavior.call_getParameters_6129022259108621180(SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.execution.commands.structure.ExecuteCommandPart", false, false));
          }

          @Override
          public SNodeReference getSearchScopeValidatorNode() {
            return breakingNode_m122yq_a0a1a0a0a1a0b0a1a3;
          }
        };
      }
    });
    return references;
  }

  public static boolean static_canBeAChild(SNode node, SNode parentNode, SNode link, SNode childConcept, final IOperationContext operationContext) {
    return (SNodeOperations.getAncestor(parentNode, "jetbrains.mps.execution.commands.structure.ExecuteCommandPart", false, false) != null);
  }

  private static SNodePointer canBeChildBreakingPoint = new SNodePointer("r:fa479534-722a-48ea-9a2e-0d6cd7ab1559(jetbrains.mps.execution.commands.constraints)", "856705193941282430");
  private static SNodePointer breakingNode_m122yq_a0a1a0a0a1a0b0a1a3 = new SNodePointer("r:fa479534-722a-48ea-9a2e-0d6cd7ab1559(jetbrains.mps.execution.commands.constraints)", "856705193941282421");
}
