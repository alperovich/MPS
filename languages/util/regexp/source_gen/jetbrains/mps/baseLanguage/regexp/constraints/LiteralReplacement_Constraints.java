package jetbrains.mps.baseLanguage.regexp.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import java.util.Map;
import jetbrains.mps.smodel.runtime.PropertyConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BasePropertyConstraintsDescriptor;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class LiteralReplacement_Constraints extends BaseConstraintsDescriptor {
  public LiteralReplacement_Constraints() {
    super("jetbrains.mps.baseLanguage.regexp.structure.LiteralReplacement");
  }

  @Override
  protected Map<String, PropertyConstraintsDescriptor> getNotDefaultProperties() {
    Map<String, PropertyConstraintsDescriptor> properties = new HashMap();
    properties.put("text", new BasePropertyConstraintsDescriptor("text", this) {
      @Override
      public boolean hasOwnValidator() {
        return true;
      }

      @Override
      public boolean validateValue(SNode node, String propertyValue, IScope scope) {
        String propertyName = "text";
        return (SPropertyOperations.getString(propertyValue)).indexOf(" ") < 1;
      }
    });
    return properties;
  }
}
