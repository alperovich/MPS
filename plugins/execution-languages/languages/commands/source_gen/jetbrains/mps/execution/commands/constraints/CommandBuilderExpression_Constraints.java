package jetbrains.mps.execution.commands.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import java.util.Map;
import jetbrains.mps.smodel.runtime.PropertyConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BasePropertyConstraintsDescriptor;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class CommandBuilderExpression_Constraints extends BaseConstraintsDescriptor {
  public CommandBuilderExpression_Constraints() {
    super("jetbrains.mps.execution.commands.structure.CommandBuilderExpression");
  }

  @Override
  protected Map<String, PropertyConstraintsDescriptor> getNotDefaultProperties() {
    Map<String, PropertyConstraintsDescriptor> properties = new HashMap();
    properties.put("shortDescription", new BasePropertyConstraintsDescriptor("shortDescription", this) {
      @Override
      public boolean hasOwnGetter() {
        return true;
      }

      @Override
      public Object getValue(SNode node, IScope scope) {
        String propertyName = "shortDescription";
        return SPropertyOperations.getString(SLinkOperations.getTarget(node, "commandPart", false), "shortDescription");
      }
    });
    return properties;
  }
}
