package jetbrains.mps.core.xml.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import java.util.Map;
import jetbrains.mps.smodel.runtime.PropertyConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BasePropertyConstraintsDescriptor;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class XmlCharRef_Constraints extends BaseConstraintsDescriptor {
  public XmlCharRef_Constraints() {
    super("jetbrains.mps.core.xml.structure.XmlCharRef");
  }

  @Override
  protected Map<String, PropertyConstraintsDescriptor> getNotDefaultProperties() {
    Map<String, PropertyConstraintsDescriptor> properties = new HashMap();
    properties.put("charCode", new BasePropertyConstraintsDescriptor("charCode", this) {
      @Override
      public boolean hasOwnValidator() {
        return true;
      }

      @Override
      public boolean validateValue(SNode node, String propertyValue, IScope scope) {
        String propertyName = "charCode";
        return XmlNameUtil.isValidCharRef((SPropertyOperations.getString(propertyValue)));
      }
    });
    return properties;
  }
}
