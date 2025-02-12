package jetbrains.mps.execution.commands.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.runtime.ReferenceScopeProvider;
import jetbrains.mps.smodel.runtime.base.BaseReferenceScopeProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import org.jetbrains.mps.openapi.model.SNodeReference;
import java.util.Map;
import jetbrains.mps.smodel.runtime.PropertyConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BasePropertyConstraintsDescriptor;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.execution.commands.behavior.ExecuteCommandPart_Behavior;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.IterableUtils;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.SNodePointer;

public class ExecuteCommandPart_Constraints extends BaseConstraintsDescriptor {
  public ExecuteCommandPart_Constraints() {
    super("jetbrains.mps.execution.commands.structure.ExecuteCommandPart");
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
        return ListSequence.fromList(SModelOperations.getNodesIncludingImported(_context.getModel(), operationContext.getScope(), "jetbrains.mps.execution.commands.structure.ExecuteCommandPart")).where(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return !(BehaviorReflection.invokeVirtual(Boolean.TYPE, it, "virtual_isDeprecated_1224609060727", new Object[]{}));
          }
        });
      }

      @Override
      public SNodeReference getSearchScopeValidatorNode() {
        return breakingNode_kwfdao_a0a1a0a0a2;
      }
    };
  }

  @Override
  protected Map<String, PropertyConstraintsDescriptor> getNotDefaultProperties() {
    Map<String, PropertyConstraintsDescriptor> properties = new HashMap();
    properties.put("name", new BasePropertyConstraintsDescriptor("name", this) {
      @Override
      public boolean hasOwnGetter() {
        return true;
      }

      @Override
      public Object getValue(SNode node, IScope scope) {
        String propertyName = "name";
        return check_kwfdao_a0a0a(ExecuteCommandPart_Behavior.call_getCommandDeclaration_6129022259108621200(node));
      }
    });
    properties.put("shortDescription", new BasePropertyConstraintsDescriptor("shortDescription", this) {
      @Override
      public boolean hasOwnGetter() {
        return true;
      }

      @Override
      public Object getValue(SNode node, IScope scope) {
        String propertyName = "shortDescription";
        {
          List<SNode> requiredParameters = ExecuteCommandPart_Behavior.call_getRequiredParameters_6129022259108621289(node);
          if (ListSequence.fromList(requiredParameters).isEmpty()) {
            return "()";
          }
          String joined = IterableUtils.join(ListSequence.fromList(requiredParameters).select(new ISelector<SNode, String>() {
            public String select(SNode it) {
              return SPropertyOperations.getString(it, "name") + ", ";
            }
          }), " ");
          return "(" + joined.substring(0, joined.length() - 2) + ")";
        }
      }
    });
    return properties;
  }

  private static String check_kwfdao_a0a0a(SNode checkedDotOperand) {
    if (null != checkedDotOperand) {
      return SPropertyOperations.getString(checkedDotOperand, "name");
    }
    return null;
  }

  private static SNodePointer breakingNode_kwfdao_a0a1a0a0a2 = new SNodePointer("r:fa479534-722a-48ea-9a2e-0d6cd7ab1559(jetbrains.mps.execution.commands.constraints)", "3445893456318180892");
}
