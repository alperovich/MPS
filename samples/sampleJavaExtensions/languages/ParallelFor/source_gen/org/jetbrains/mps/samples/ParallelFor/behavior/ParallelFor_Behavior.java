package org.jetbrains.mps.samples.ParallelFor.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.scope.Scope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.lang.scopes.runtime.ScopeUtils;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.scopes.Scopes;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;

public class ParallelFor_Behavior {
  public static void init(SNode thisNode) {
  }

  public static Scope virtual_getScope_3734116213129936182(SNode thisNode, SNode kind, SNode child) {
    if (SConceptOperations.isExactly(kind, "jetbrains.mps.baseLanguage.structure.VariableDeclaration")) {
      List<SNode> variables = new ArrayList<SNode>();
      if (!(ScopeUtils.comeFrom("loopVariable", thisNode, child))) {
        ListSequence.fromList(variables).addElement(SLinkOperations.getTarget(thisNode, "loopVariable", true));
      }
      return Scopes.forVariables(kind, variables, ScopeUtils.lazyParentScope(thisNode, kind));
    }

    return BehaviorReflection.invokeSuper(Scope.class, thisNode, "jetbrains.mps.baseLanguage.structure.AbstractLoopStatement", "virtual_getScope_3734116213129936182", new Object[]{kind, child});
  }

  public static void virtual_collectUncaughtMethodThrowables_5412515780383134223(SNode thisNode, Set<SNode> throwables, boolean ignoreMayBeThrowables) {
  }

  public static Set<SNode> call_uncaughtThrowables_3331512479731115649(SNode thisNode, boolean ignoreMayBeThrowables) {
    Set<SNode> result = SetSequence.fromSet(new HashSet<SNode>());
    return result;
  }

  public static List<SNode> virtual_getThrowableTypes_6204026822016975623(SNode thisNode) {
    return new ArrayList<SNode>();
  }

  public static SNode virtual_getBody_1239354440022(SNode thisNode) {
    return SLinkOperations.getTarget(thisNode, "body", true);
  }

  public static SNode virtual_getExpectedRetType_1239354342632(SNode thisNode) {
    return SNodeOperations.getNode("r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)", "1068581517677");
  }

  public static boolean virtual_implicitThrows_4989157187872658723(SNode thisNode) {
    return true;
  }

  public static SNode call_findPoolDeclaration_7704855178165020537(SNode thisNode) {
    SNode prevSibling = SNodeOperations.getPrevSibling(thisNode);
    while (prevSibling != null) {
      if (SNodeOperations.isInstanceOf(prevSibling, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement") && SLinkOperations.getTarget(TypeChecker.getInstance().getRuntimeSupport().coerce_(SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.cast(prevSibling, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"), "localVariableDeclaration", true), "type", true), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.ClassifierType"), true), "classifier", false) == SLinkOperations.getTarget(_quotation_createNode_1tdh13_a0a0a0b0h(), "classifier", false)) {
        return SLinkOperations.getTarget(SNodeOperations.cast(prevSibling, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"), "localVariableDeclaration", true);
      }
      prevSibling = SNodeOperations.getPrevSibling(prevSibling);
    }
    return null;
  }

  private static SNode _quotation_createNode_1tdh13_a0a0a0b0h() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, null, GlobalScope.getInstance(), false);
    quotedNode_1.setReference("classifier", SReference.create("classifier", quotedNode_1, facade.createModelReference("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.util.concurrent(JDK/java.util.concurrent@java_stub)"), facade.createNodeId("~ExecutorService")));
    return quotedNode_1;
  }
}
