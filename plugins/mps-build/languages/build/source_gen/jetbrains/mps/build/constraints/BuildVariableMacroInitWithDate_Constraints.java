package jetbrains.mps.build.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import java.util.Map;
import jetbrains.mps.smodel.runtime.PropertyConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BasePropertyConstraintsDescriptor;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.IScope;
import java.text.SimpleDateFormat;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class BuildVariableMacroInitWithDate_Constraints extends BaseConstraintsDescriptor {
  public BuildVariableMacroInitWithDate_Constraints() {
    super("jetbrains.mps.build.structure.BuildVariableMacroInitWithDate");
  }

  @Override
  protected Map<String, PropertyConstraintsDescriptor> getNotDefaultProperties() {
    Map<String, PropertyConstraintsDescriptor> properties = new HashMap();
    properties.put("pattern", new BasePropertyConstraintsDescriptor("pattern", this) {
      @Override
      public boolean hasOwnValidator() {
        return true;
      }

      @Override
      public boolean validateValue(SNode node, String propertyValue, IScope scope) {
        String propertyName = "pattern";
        try {
          new SimpleDateFormat((SPropertyOperations.getString(propertyValue)));
          return true;
        } catch (IllegalArgumentException ex) {
          return false;
        }
      }
    });
    return properties;
  }
}
