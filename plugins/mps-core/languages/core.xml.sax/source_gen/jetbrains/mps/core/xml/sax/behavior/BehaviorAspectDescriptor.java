package jetbrains.mps.core.xml.sax.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BehaviorDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.interpreted.BehaviorAspectInterpreted;

public class BehaviorAspectDescriptor implements jetbrains.mps.smodel.runtime.BehaviorAspectDescriptor {
  public BehaviorAspectDescriptor() {
  }

  public BehaviorDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_846f5o_a0a0b, fqName)) {
      case 0:
        return new XMLSAXAttributeHandler_BehaviorDescriptor();
      case 2:
        return new XMLSAXAttributeReference_BehaviorDescriptor();
      case 3:
        return new XMLSAXAttributeRule_BehaviorDescriptor();
      case 4:
        return new XMLSAXBreakStatement_BehaviorDescriptor();
      case 5:
        return new XMLSAXChildHandler_BehaviorDescriptor();
      case 6:
        return new XMLSAXChildHandler_childObject_BehaviorDescriptor();
      case 7:
        return new XMLSAXChildRule_BehaviorDescriptor();
      case 9:
        return new XMLSAXFieldDeclaration_BehaviorDescriptor();
      case 10:
        return new XMLSAXFieldReference_BehaviorDescriptor();
      case 11:
        return new XMLSAXHandler_resultObject_BehaviorDescriptor();
      case 12:
        return new XMLSAXLocatorExpression_BehaviorDescriptor();
      case 13:
        return new XMLSAXNodeCreator_BehaviorDescriptor();
      case 14:
        return new XMLSAXNodeRule_BehaviorDescriptor();
      case 17:
        return new XMLSAXNodeValidator_BehaviorDescriptor();
      case 18:
        return new XMLSAXParser_BehaviorDescriptor();
      case 19:
        return new XMLSAXTextHandler_BehaviorDescriptor();
      case 21:
        return new XMLSAXTextRule_BehaviorDescriptor();
      case 1:
        return new XMLSAXAttributeHandler_value_BehaviorDescriptor();
      case 20:
        return new XMLSAXTextHandler_value_BehaviorDescriptor();
      case 15:
        return new XMLSAXNodeRuleParam_BehaviorDescriptor();
      case 16:
        return new XMLSAXNodeRuleParamRef_BehaviorDescriptor();
      case 8:
        return new XMLSAXChildRuleCondition_BehaviorDescriptor();
      default:
        return BehaviorAspectInterpreted.getInstance().getDescriptor(fqName);
    }
  }

  private static String[] stringSwitchCases_846f5o_a0a0b = new String[]{"jetbrains.mps.core.xml.sax.structure.XMLSAXAttributeHandler", "jetbrains.mps.core.xml.sax.structure.XMLSAXAttributeHandler_value", "jetbrains.mps.core.xml.sax.structure.XMLSAXAttributeReference", "jetbrains.mps.core.xml.sax.structure.XMLSAXAttributeRule", "jetbrains.mps.core.xml.sax.structure.XMLSAXBreakStatement", "jetbrains.mps.core.xml.sax.structure.XMLSAXChildHandler", "jetbrains.mps.core.xml.sax.structure.XMLSAXChildHandler_childObject", "jetbrains.mps.core.xml.sax.structure.XMLSAXChildRule", "jetbrains.mps.core.xml.sax.structure.XMLSAXChildRuleCondition", "jetbrains.mps.core.xml.sax.structure.XMLSAXFieldDeclaration", "jetbrains.mps.core.xml.sax.structure.XMLSAXFieldReference", "jetbrains.mps.core.xml.sax.structure.XMLSAXHandler_resultObject", "jetbrains.mps.core.xml.sax.structure.XMLSAXLocatorExpression", "jetbrains.mps.core.xml.sax.structure.XMLSAXNodeCreator", "jetbrains.mps.core.xml.sax.structure.XMLSAXNodeRule", "jetbrains.mps.core.xml.sax.structure.XMLSAXNodeRuleParam", "jetbrains.mps.core.xml.sax.structure.XMLSAXNodeRuleParamRef", "jetbrains.mps.core.xml.sax.structure.XMLSAXNodeValidator", "jetbrains.mps.core.xml.sax.structure.XMLSAXParser", "jetbrains.mps.core.xml.sax.structure.XMLSAXTextHandler", "jetbrains.mps.core.xml.sax.structure.XMLSAXTextHandler_value", "jetbrains.mps.core.xml.sax.structure.XMLSAXTextRule"};
}
