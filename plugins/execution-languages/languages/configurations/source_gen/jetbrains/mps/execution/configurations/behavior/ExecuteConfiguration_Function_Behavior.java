package jetbrains.mps.execution.configurations.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import java.util.List;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;

public class ExecuteConfiguration_Function_Behavior {
  public static void init(SNode thisNode) {
  }

  public static List<SNode> virtual_getLocalVariableElements_1238805763253(SNode thisNode) {
    return BehaviorReflection.invokeVirtual((Class<List<SNode>>) ((Class) Object.class), SLinkOperations.getTarget(thisNode, "body", true), "virtual_getLocalVariableElements_1238805763253", new Object[]{});
  }

  public static List<SNode> virtual_getParameters_1213877374450(SNode thisNode) {
    if (SNodeOperations.isInstanceOf(SNodeOperations.getContainingRoot(thisNode), "jetbrains.mps.execution.configurations.structure.RunConfigurationExecutor") && (SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getContainingRoot(thisNode), "jetbrains.mps.execution.configurations.structure.RunConfigurationExecutor"), "debuggerConfiguration", true) != null)) {
      return ListSequence.fromListAndArray(new ArrayList<SNode>(), SConceptOperations.findConceptDeclaration("jetbrains.mps.execution.configurations.structure.Project_Parameter"), SConceptOperations.findConceptDeclaration("jetbrains.mps.execution.configurations.structure.DebuggerSettings_Parameter"));
    }
    return ListSequence.fromListAndArray(new ArrayList<SNode>(), SConceptOperations.findConceptDeclaration("jetbrains.mps.execution.configurations.structure.Project_Parameter"));
  }

  public static SNode virtual_getExpectedReturnType_1213877374441(SNode thisNode) {
    return _quotation_createNode_cw5ucd_a0a2();
  }

  public static boolean virtual_showName_1262430001741498082(SAbstractConcept thisConcept) {
    return true;
  }

  @Deprecated
  public static List<SNode> call_getLocalVariableElements_6538811202682334478(SNode thisNode) {
    return BehaviorReflection.invokeVirtual((Class<List<SNode>>) ((Class) Object.class), thisNode, "virtual_getLocalVariableElements_1238805763253", new Object[]{});
  }

  @Deprecated
  public static List<SNode> call_getParameters_3091009652595815824(SNode thisNode) {
    return BehaviorReflection.invokeVirtual((Class<List<SNode>>) ((Class) Object.class), thisNode, "virtual_getParameters_1213877374450", new Object[]{});
  }

  @Deprecated
  public static List<SNode> callSuper_getLocalVariableElements_6538811202682334478(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper((Class<List<SNode>>) ((Class) Object.class), SNodeOperations.cast(thisNode, "jetbrains.mps.execution.configurations.structure.ExecuteConfiguration_Function"), callerConceptFqName, "virtual_getLocalVariableElements_1238805763253", new Class[]{SNode.class}, new Object[]{});
  }

  @Deprecated
  public static List<SNode> callSuper_getParameters_3091009652595815824(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper((Class<List<SNode>>) ((Class) Object.class), SNodeOperations.cast(thisNode, "jetbrains.mps.execution.configurations.structure.ExecuteConfiguration_Function"), callerConceptFqName, "virtual_getParameters_1213877374450", new Class[]{SNode.class}, new Object[]{});
  }

  private static SNode _quotation_createNode_cw5ucd_a0a2() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    SNode quotedNode_2 = null;
    SNode quotedNode_3 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.JoinType", null, null, GlobalScope.getInstance(), false);
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.execution.commands.structure.ProcessType", null, null, GlobalScope.getInstance(), false);
    quotedNode_1.addChild("argument", quotedNode_2);
    quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, null, GlobalScope.getInstance(), false);
    quotedNode_3.setReference("classifier", SReference.create("classifier", quotedNode_3, facade.createModelReference("f:java_stub#498d89d2-c2e9-11e2-ad49-6cf049e62fe5#com.intellij.execution.process(MPS.IDEA/com.intellij.execution.process@java_stub)"), facade.createNodeId("~ProcessHandler")));
    quotedNode_1.addChild("argument", quotedNode_3);
    return quotedNode_1;
  }
}
