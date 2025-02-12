package jetbrains.mps.lang.structure.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class DataTypeDeclaration_Behavior {
  public static void init(SNode thisNode) {
  }

  public static SNode virtual_toBaseLanguageType_1213877229718(SNode thisNode) {
    return _quotation_createNode_47r3zh_a0a0();
  }

  public static boolean call_isSimple_1220268671473(SNode thisNode) {
    return SNodeOperations.isInstanceOf(thisNode, "jetbrains.mps.lang.structure.structure.PrimitiveDataTypeDeclaration") || SNodeOperations.isInstanceOf(thisNode, "jetbrains.mps.lang.structure.structure.ConstrainedDataTypeDeclaration");
  }

  public static boolean call_isEnum_1220268692373(SNode thisNode) {
    return SNodeOperations.isInstanceOf(thisNode, "jetbrains.mps.lang.structure.structure.EnumerationDataTypeDeclaration");
  }

  public static boolean call_isSimpleString_1220268704138(SNode thisNode) {
    if (SNodeOperations.isInstanceOf(thisNode, "jetbrains.mps.lang.structure.structure.PrimitiveDataTypeDeclaration")) {
      return PrimitiveDataTypeDeclaration_Behavior.call_isString_1220268752134(SNodeOperations.cast(thisNode, "jetbrains.mps.lang.structure.structure.PrimitiveDataTypeDeclaration"));
    } else if (SNodeOperations.isInstanceOf(thisNode, "jetbrains.mps.lang.structure.structure.ConstrainedDataTypeDeclaration")) {
      return true;
    }
    return false;
  }

  public static boolean call_isSimpleInteger_1220268868375(SNode thisNode) {
    if (SNodeOperations.isInstanceOf(thisNode, "jetbrains.mps.lang.structure.structure.PrimitiveDataTypeDeclaration")) {
      return PrimitiveDataTypeDeclaration_Behavior.call_isInteger_1220268780075(SNodeOperations.cast(thisNode, "jetbrains.mps.lang.structure.structure.PrimitiveDataTypeDeclaration"));
    }
    return false;
  }

  public static boolean call_isSimpleBoolean_1220268891062(SNode thisNode) {
    if (SNodeOperations.isInstanceOf(thisNode, "jetbrains.mps.lang.structure.structure.PrimitiveDataTypeDeclaration")) {
      return PrimitiveDataTypeDeclaration_Behavior.call_isBoolean_1220268791641(SNodeOperations.cast(thisNode, "jetbrains.mps.lang.structure.structure.PrimitiveDataTypeDeclaration"));
    }
    return false;
  }

  public static boolean call_isEnumOfString_1220268917296(SNode thisNode) {
    if (SNodeOperations.isInstanceOf(thisNode, "jetbrains.mps.lang.structure.structure.EnumerationDataTypeDeclaration")) {
      return PrimitiveDataTypeDeclaration_Behavior.call_isString_1220268752134(SLinkOperations.getTarget(SNodeOperations.cast(thisNode, "jetbrains.mps.lang.structure.structure.EnumerationDataTypeDeclaration"), "memberDataType", false));
    }
    return false;
  }

  public static boolean call_isEnumOfInteger_1220268950942(SNode thisNode) {
    if (SNodeOperations.isInstanceOf(thisNode, "jetbrains.mps.lang.structure.structure.EnumerationDataTypeDeclaration")) {
      return PrimitiveDataTypeDeclaration_Behavior.call_isInteger_1220268780075(SLinkOperations.getTarget(SNodeOperations.cast(thisNode, "jetbrains.mps.lang.structure.structure.EnumerationDataTypeDeclaration"), "memberDataType", false));
    }
    return false;
  }

  public static boolean call_isEnumOfBoolean_1220268971570(SNode thisNode) {
    if (SNodeOperations.isInstanceOf(thisNode, "jetbrains.mps.lang.structure.structure.EnumerationDataTypeDeclaration")) {
      return PrimitiveDataTypeDeclaration_Behavior.call_isBoolean_1220268791641(SLinkOperations.getTarget(SNodeOperations.cast(thisNode, "jetbrains.mps.lang.structure.structure.EnumerationDataTypeDeclaration"), "memberDataType", false));
    }
    return false;
  }

  public static boolean call_isSimpleStringOrEnumOfString_1220269005341(SNode thisNode) {
    return DataTypeDeclaration_Behavior.call_isEnumOfString_1220268917296(thisNode) || DataTypeDeclaration_Behavior.call_isSimpleString_1220268704138(thisNode);
  }

  public static boolean call_isSimpleIntegerOrEnumOfInteger_1220269023223(SNode thisNode) {
    return DataTypeDeclaration_Behavior.call_isEnumOfInteger_1220268950942(thisNode) || DataTypeDeclaration_Behavior.call_isSimpleInteger_1220268868375(thisNode);
  }

  public static boolean call_isSimpleBooleanOrEnumOfBoolean_1220269039824(SNode thisNode) {
    return DataTypeDeclaration_Behavior.call_isEnumOfBoolean_1220268971570(thisNode) || DataTypeDeclaration_Behavior.call_isSimpleBoolean_1220268891062(thisNode);
  }

  @Deprecated
  public static SNode call_toBaseLanguageType_1213877229718(SNode thisNode) {
    return BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), thisNode, "virtual_toBaseLanguageType_1213877229718", new Object[]{});
  }

  @Deprecated
  public static SNode callSuper_toBaseLanguageType_1213877229718(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper((Class<SNode>) ((Class) Object.class), SNodeOperations.cast(thisNode, "jetbrains.mps.lang.structure.structure.DataTypeDeclaration"), callerConceptFqName, "virtual_toBaseLanguageType_1213877229718", new Class[]{SNode.class}, new Object[]{});
  }

  private static SNode _quotation_createNode_47r3zh_a0a0() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StringType", null, null, GlobalScope.getInstance(), false);
    return quotedNode_1;
  }
}
