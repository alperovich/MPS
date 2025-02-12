package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import java.util.ArrayList;
import jetbrains.mps.scope.Scope;
import jetbrains.mps.baseLanguage.scopes.Scopes;
import jetbrains.mps.lang.scopes.runtime.ScopeUtils;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class StatementList_Behavior {
  public static void init(SNode thisNode) {
  }

  public static Set<SNode> call_getExternalVariablesDeclarations_1214501165480(SNode thisNode) {
    Set<SNode> declarations = SetSequence.fromSet(new HashSet<SNode>());
    Set<SNode> reference = SetSequence.fromSet(new HashSet<SNode>());
    SetSequence.fromSet(reference).addSequence(ListSequence.fromList(SNodeOperations.getDescendants(thisNode, "jetbrains.mps.baseLanguage.structure.IVariableReference", false, new String[]{})));
    for (SNode ref : reference) {
      boolean statementsContainsVar = false;
      for (SNode parent : SNodeOperations.getAncestors(BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), ref, "virtual_getVariable_1023687332192481693", new Object[]{}), null, false)) {
        if (parent == SNodeOperations.getParent(thisNode)) {
          statementsContainsVar = true;
        }
      }
      if (!(statementsContainsVar)) {
        SetSequence.fromSet(declarations).addElement(BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), ref, "virtual_getVariable_1023687332192481693", new Object[]{}));
      }
    }
    return declarations;
  }

  public static boolean call_isCompact_1237546596168(SNode thisNode) {
    if (!(SNodeOperations.isInstanceOf(SNodeOperations.getParent(thisNode), "jetbrains.mps.baseLanguage.structure.IContainsStatementList"))) {
      return false;
    }
    SNode parent = SNodeOperations.cast(SNodeOperations.getParent(thisNode), "jetbrains.mps.baseLanguage.structure.IContainsStatementList");
    if (!(BehaviorReflection.invokeVirtual(Boolean.TYPE, parent, "virtual_isStatementListCompactable_1237546012856", new Object[]{}))) {
      return false;
    }
    return BehaviorReflection.invokeVirtual(Boolean.TYPE, parent, "virtual_isStatementListCompact_1237546693016", new Object[]{});
  }

  public static boolean call_isOneLiner_1237538811451(SNode thisNode) {
    if (ListSequence.fromList(SLinkOperations.getTargets(thisNode, "statement", true)).count() > 1) {
      return false;
    }
    if ((int) ListSequence.fromList(SLinkOperations.getTargets(thisNode, "statement", true)).count() == 1) {
      SNode statement = ListSequence.fromList(SLinkOperations.getTargets(thisNode, "statement", true)).first();
      if (SNodeOperations.isInstanceOf(statement, "jetbrains.mps.baseLanguage.structure.IContainsStatementList")) {
        return false;
      }
      if (ListSequence.fromList(SNodeOperations.getDescendants(statement, "jetbrains.mps.baseLanguage.structure.AnonymousClass", false, new String[]{})).isNotEmpty()) {
        return false;
      }
    }
    return true;
  }

  public static List<SNode> virtual_getLocalVariableElements_1238805763253(SNode thisNode) {
    return SLinkOperations.getTargets(thisNode, "statement", true);
  }

  public static Set<SNode> call_uncaughtThrowables_3331512479731115649(SNode thisNode, boolean ignoreMayBeThrowables) {
    Set<SNode> result = SetSequence.fromSet(new HashSet<SNode>());
    StatementList_Behavior.call_collectUncaughtThrowables_5412515780383134474(thisNode, result, ignoreMayBeThrowables);
    return result;
  }

  public static void call_collectUncaughtThrowables_5412515780383134474(SNode thisNode, Set<SNode> throwables, boolean ignoreMayBeThrowables) {
    for (SNode statement : ListSequence.fromList(SLinkOperations.getTargets(thisNode, "statement", true))) {
      BehaviorReflection.invokeVirtual(Void.class, statement, "virtual_collectUncaughtMethodThrowables_5412515780383134223", new Object[]{throwables, ignoreMayBeThrowables});
    }
  }

  public static SNode call_getFirstStatement_5420652334935371934(SNode thisNode) {
    for (SNode statement : SLinkOperations.getTargets(thisNode, "statement", true)) {
      if (SNodeOperations.isInstanceOf(statement, "jetbrains.mps.baseLanguage.structure.SingleLineComment") || SNodeOperations.isInstanceOf(statement, "jetbrains.mps.baseLanguage.structure.CommentedStatementsBlock") || SConceptOperations.isExactly(SNodeOperations.getConceptDeclaration(statement), "jetbrains.mps.baseLanguage.structure.Statement")) {
        continue;
      }
      return statement;
    }
    return null;
  }

  public static List<SNode> virtual_getScopeVariables_5067982036267369894(SNode thisNode) {
    List<SNode> result = new ArrayList<SNode>();
    for (SNode statement : SLinkOperations.getTargets(thisNode, "statement", true)) {
      if (SNodeOperations.isInstanceOf(statement, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement")) {
        ListSequence.fromList(result).addElement(SLinkOperations.getTarget(SNodeOperations.cast(statement, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"), "localVariableDeclaration", true));
      }
    }
    return result;
  }

  public static List<SNode> call_getLocalVariableDeclarations_3986960521977638556(SNode thisNode, SNode child) {
    List<SNode> result = new ArrayList<SNode>();

    SNode childStatement = child;
    while (childStatement != null && SNodeOperations.getParent(childStatement) != thisNode) {
      childStatement = SNodeOperations.getParent(childStatement);
    }

    for (SNode statement : SLinkOperations.getTargets(thisNode, "statement", true)) {
      if (childStatement == statement) {
        break;
      }
      if (SNodeOperations.isInstanceOf(statement, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement")) {
        ListSequence.fromList(result).addElement(SLinkOperations.getTarget(SNodeOperations.cast(statement, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"), "localVariableDeclaration", true));
      }
    }

    return result;
  }

  public static List<SNode> call_getLocalVariableDeclarations_9165170089438554320(SNode thisNode, String role, int index) {
    List<SNode> result = new ArrayList<SNode>();

    for (int num = 0; num < index; num++) {
      if (SNodeOperations.isInstanceOf(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "statement", true)).getElement(num), "jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement")) {
        ListSequence.fromList(result).addElement(SLinkOperations.getTarget(SNodeOperations.cast(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "statement", true)).getElement(num), "jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"), "localVariableDeclaration", true));
      }
    }

    return result;
  }

  public static Scope virtual_getScope_3734116213129936182(SNode thisNode, SNode kind, SNode child) {
    if (SConceptOperations.isExactly(kind, "jetbrains.mps.baseLanguage.structure.VariableDeclaration")) {
      return Scopes.forVariables(kind, StatementList_Behavior.call_getLocalVariableDeclarations_3986960521977638556(thisNode, child), ScopeUtils.lazyParentScope(thisNode, kind));
    }
    return null;
  }

  public static Scope virtual_getScope_7722139651431880752(SNode thisNode, SNode kind, String role, int index) {
    if (SConceptOperations.isExactly(kind, "jetbrains.mps.baseLanguage.structure.VariableDeclaration")) {
      return Scopes.forVariables(kind, StatementList_Behavior.call_getLocalVariableDeclarations_9165170089438554320(thisNode, role, index), ScopeUtils.lazyParentScope(thisNode, kind));
    }
    return null;
  }

  @Deprecated
  public static List<SNode> call_getScopeVariables_2496361171403550911(SNode thisNode) {
    return BehaviorReflection.invokeVirtual((Class<List<SNode>>) ((Class) Object.class), thisNode, "virtual_getScopeVariables_5067982036267369894", new Object[]{});
  }

  @Deprecated
  public static List<SNode> callSuper_getScopeVariables_2496361171403550911(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper((Class<List<SNode>>) ((Class) Object.class), SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.StatementList"), callerConceptFqName, "virtual_getScopeVariables_5067982036267369894", new Class[]{SNode.class}, new Object[]{});
  }
}
