package jetbrains.mps.baseLanguage.closures.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import java.util.Map;
import jetbrains.mps.smodel.runtime.PropertyConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BasePropertyConstraintsDescriptor;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.IScope;

public class FunctionMethodDeclaration_Constraints extends BaseConstraintsDescriptor {
  public FunctionMethodDeclaration_Constraints() {
    super("jetbrains.mps.baseLanguage.closures.structure.FunctionMethodDeclaration");
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
        return "invoke";
      }
    });
    properties.put("isAbstract", new BasePropertyConstraintsDescriptor("isAbstract", this) {
      @Override
      public boolean hasOwnGetter() {
        return true;
      }

      @Override
      public Object getValue(SNode node, IScope scope) {
        String propertyName = "isAbstract";
        return false;
      }
    });
    return properties;
  }
}
