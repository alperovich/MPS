package jetbrains.mps.lang.refactoring.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;

public class MainProjectOperation_Behavior {
  public static void init(SNode thisNode) {
  }

  public static SNode virtual_createType_7012097027058652452(SNode thisNode) {
    return _quotation_createNode_sim1f9_a0a0();
  }

  @Deprecated
  public static SNode call_createType_8113680833395644315(SNode thisNode) {
    return BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), thisNode, "virtual_createType_7012097027058652452", new Object[]{});
  }

  @Deprecated
  public static SNode callSuper_createType_8113680833395644315(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper((Class<SNode>) ((Class) Object.class), SNodeOperations.cast(thisNode, "jetbrains.mps.lang.refactoring.structure.MainProjectOperation"), callerConceptFqName, "virtual_createType_7012097027058652452", new Class[]{SNode.class}, new Object[]{});
  }

  private static SNode _quotation_createNode_sim1f9_a0a0() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, null, GlobalScope.getInstance(), false);
    quotedNode_1.setReference("classifier", SReference.create("classifier", quotedNode_1, facade.createModelReference("f:java_stub#6ed54515-acc8-4d1e-a16c-9fd6cfe951ea#jetbrains.mps.project(MPS.Core/jetbrains.mps.project@java_stub)"), facade.createNodeId("~Project")));
    return quotedNode_1;
  }
}
