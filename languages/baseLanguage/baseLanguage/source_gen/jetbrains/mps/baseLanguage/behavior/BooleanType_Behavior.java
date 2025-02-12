package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;

public class BooleanType_Behavior {
  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getUnboxedType_1213877337320(SNode thisNode) {
    return _quotation_createNode_1wwrx3_a0a0();
  }

  public static SNode virtual_getClassExpression_1213877337357(SNode thisNode) {
    return _quotation_createNode_1wwrx3_a0a1();
  }

  public static SNode virtual_createDefaultTypeExpression_3359611512358152580(SNode thisNode) {
    return _quotation_createNode_1wwrx3_a0a2();
  }

  public static String virtual_jniSignature_8847328628797633411(SNode thisNode) {
    return "Z";
  }

  @Deprecated
  public static SNode call_createDefaultTypeExpression_9011026350741579292(SNode thisNode) {
    return BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), thisNode, "virtual_createDefaultTypeExpression_3359611512358152580", new Object[]{});
  }

  @Deprecated
  public static SNode callSuper_createDefaultTypeExpression_9011026350741579292(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper((Class<SNode>) ((Class) Object.class), SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.BooleanType"), callerConceptFqName, "virtual_createDefaultTypeExpression_3359611512358152580", new Class[]{SNode.class}, new Object[]{});
  }

  private static SNode _quotation_createNode_1wwrx3_a0a0() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, null, GlobalScope.getInstance(), false);
    quotedNode_1.setReference("classifier", SReference.create("classifier", quotedNode_1, facade.createModelReference("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(JDK/java.lang@java_stub)"), facade.createNodeId("~Boolean")));
    return quotedNode_1;
  }

  private static SNode _quotation_createNode_1wwrx3_a0a1() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StaticFieldReference", null, null, GlobalScope.getInstance(), false);
    quotedNode_1.setReference("classifier", SReference.create("classifier", quotedNode_1, facade.createModelReference("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(JDK/java.lang@java_stub)"), facade.createNodeId("~Boolean")));
    quotedNode_1.setReference("variableDeclaration", SReference.create("variableDeclaration", quotedNode_1, facade.createModelReference("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(JDK/java.lang@java_stub)"), facade.createNodeId("~Boolean.TYPE")));
    return quotedNode_1;
  }

  private static SNode _quotation_createNode_1wwrx3_a0a2() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.BooleanConstant", null, null, GlobalScope.getInstance(), false);
    return quotedNode_1;
  }
}
