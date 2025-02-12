package jetbrains.mps.baseLanguage.scripts;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.progress.EmptyProgressMonitor;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.baseLanguage.behavior.Classifier_Behavior;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;

public class NonMigratableUsagesFinder {
  public NonMigratableUsagesFinder() {
  }

  public static Iterable<SNode> findNonMigratableUsages(SNode linkDeclaration) {
    Iterable<SNode> linkUsages = FindUtils.executeFinder("jetbrains.mps.lang.structure.findUsages.NodeUsages_Finder", linkDeclaration, GlobalScope.getInstance(), new EmptyProgressMonitor());
    List<SNode> result = ListSequence.fromList(new ArrayList<SNode>());

    for (SNode nodeUsage : Sequence.fromIterable(linkUsages)) {
      if (isExcluded(nodeUsage)) {
        continue;
      }

      if (SNodeOperations.isInstanceOf(nodeUsage, "jetbrains.mps.lang.smodel.structure.SLinkListAccess")) {
        if (isSequenceNeeded(SNodeOperations.cast(nodeUsage, "jetbrains.mps.lang.smodel.structure.SLinkListAccess"))) {
          continue;
        }
        if (isListNeeded(SNodeOperations.cast(nodeUsage, "jetbrains.mps.lang.smodel.structure.SLinkListAccess"))) {
          continue;
        }
      }

      ListSequence.fromList(result).addElement(nodeUsage);
    }
    return result;
  }

  public static boolean isExcluded(SNode nodeUsage) {
    SNode root = SNodeOperations.getContainingRoot(nodeUsage);

    if ("FindNotMigratableLinks".equals(SPropertyOperations.getString(SNodeOperations.as(root, "jetbrains.mps.lang.core.structure.INamedConcept"), "name"))) {
      return true;
    }
    if (SNodeOperations.getAncestor(nodeUsage, "jetbrains.mps.lang.behavior.structure.ConceptMethodDeclaration", false, false) == ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.getNode("r:00000000-0000-4000-0000-011c895902c0(jetbrains.mps.baseLanguage.behavior)", "1213877306256"), "method", true)).findFirst(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SPropertyOperations.getString(it, "name").equals("members");
      }
    })) {
      return true;
    }
    if (root == SNodeOperations.getNode("r:309aeee7-bee8-445c-b31d-35928d1da75f(jetbrains.mps.baseLanguage.tuples.structure)", "1239360506533") || root == SNodeOperations.getNode("r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)", "1188206331916")) {
      return true;
    }
    return false;
  }

  public static boolean isSequenceNeeded(SNode nodeUsage) {
    SNode dotExpression = SNodeOperations.cast(SNodeOperations.getParent(nodeUsage), "jetbrains.mps.baseLanguage.structure.DotExpression");

    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(dotExpression), "jetbrains.mps.baseLanguage.structure.DotExpression")) {
      SNode operation = SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(dotExpression), "jetbrains.mps.baseLanguage.structure.DotExpression"), "operation", true);

      // sequence operations 
      if (SNodeOperations.isInstanceOf(operation, "jetbrains.mps.baseLanguage.collections.structure.SequenceOperation") && !(SNodeOperations.isInstanceOf(operation, "jetbrains.mps.baseLanguage.collections.structure.IContainerOperation"))) {
        return true;
      }

      // other stuff 
      if (SNodeOperations.isInstanceOf(operation, "jetbrains.mps.lang.smodel.structure.SLinkImplicitSelect")) {
        return true;
      }
    }

    // argument for AddAll or RemoveAll operation 
    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(dotExpression), "jetbrains.mps.baseLanguage.collections.structure.SingleArgumentSequenceOperation") && SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(dotExpression), "jetbrains.mps.baseLanguage.collections.structure.SingleArgumentSequenceOperation"), "argument", true) == dotExpression) {
      if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(dotExpression), "jetbrains.mps.baseLanguage.collections.structure.AddAllElementsOperation") || SNodeOperations.isInstanceOf(SNodeOperations.getParent(dotExpression), "jetbrains.mps.baseLanguage.collections.structure.RemoveAllElementsOperation")) {
        return true;
      }
    }

    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(dotExpression), "jetbrains.mps.baseLanguage.collections.structure.BinaryOperation") && SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(dotExpression), "jetbrains.mps.baseLanguage.collections.structure.BinaryOperation"), "rightExpression", true) == dotExpression) {
      // sequence is enough 
      return true;
    }

    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(dotExpression), "jetbrains.mps.baseLanguage.collections.structure.ForEachStatement")) {
      if (SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(dotExpression), "jetbrains.mps.baseLanguage.collections.structure.ForEachStatement"), "inputSequence", true) == dotExpression) {
        return true;
      }
    }

    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(dotExpression), "jetbrains.mps.baseLanguage.structure.ForeachStatement")) {
      if (SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(dotExpression), "jetbrains.mps.baseLanguage.structure.ForeachStatement"), "iterable", true) == dotExpression) {
        return true;
      }
    }

    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(dotExpression), "jetbrains.mps.lang.textGen.structure.CollectionAppendPart") && SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(dotExpression), "jetbrains.mps.lang.textGen.structure.CollectionAppendPart"), "list", true) == dotExpression) {
      return true;
    }

    // logic based on expected type 
    SNode expectedType = calcExpectedType(nodeUsage);

    if (SNodeOperations.getConceptDeclaration(expectedType) == SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SequenceType")) {
      return true;
    }
    if (SNodeOperations.getConceptDeclaration(expectedType) == SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType") && SLinkOperations.getTarget(SNodeOperations.cast(expectedType, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "classifier", false) == SNodeOperations.getNode("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(JDK/java.lang@java_stub)", "~Iterable")) {
      return true;
    }

    return false;
  }

  public static boolean isThisForSimpleAddOperation(SNode nodeUsage) {
    SNode dotExpression = SNodeOperations.cast(SNodeOperations.getParent(nodeUsage), "jetbrains.mps.baseLanguage.structure.DotExpression");
    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(dotExpression), "jetbrains.mps.baseLanguage.structure.DotExpression")) {
      SNode operation = SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(dotExpression), "jetbrains.mps.baseLanguage.structure.DotExpression"), "operation", true);

      // java list add operation 
      if (SNodeOperations.isInstanceOf(operation, "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation")) {
        SNode method = SLinkOperations.getTarget(SNodeOperations.cast(operation, "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"), "baseMethodDeclaration", false);

        if (method == Sequence.fromIterable(Classifier_Behavior.call_methods_5292274854859311639(SNodeOperations.getNode("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.util(JDK/java.util@java_stub)", "~List"))).findFirst(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return SPropertyOperations.getString(it, "name").equals("add") && (int) ListSequence.fromList(SLinkOperations.getTargets(it, "parameter", true)).count() == 1;
          }
        })) {
          return true;
        }
      }

      // list operations 
      if (SNodeOperations.isInstanceOf(operation, "jetbrains.mps.baseLanguage.collections.structure.AddElementOperation") || SNodeOperations.isInstanceOf(operation, "jetbrains.mps.baseLanguage.collections.structure.AddAllElementsOperation")) {
        return true;
      }
    }

    return false;
  }

  public static boolean isListNeeded(SNode nodeUsage) {
    if (isThisForSimpleAddOperation(nodeUsage)) {
      return true;
    }

    SNode dotExpression = SNodeOperations.cast(SNodeOperations.getParent(nodeUsage), "jetbrains.mps.baseLanguage.structure.DotExpression");

    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(dotExpression), "jetbrains.mps.baseLanguage.structure.DotExpression")) {
      SNode operation = SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(dotExpression), "jetbrains.mps.baseLanguage.structure.DotExpression"), "operation", true);
      if (SNodeOperations.isInstanceOf(operation, "jetbrains.mps.lang.actions.structure.NF_LinkList_AddNewChildOperation") || SNodeOperations.isInstanceOf(operation, "jetbrains.mps.lang.smodel.structure.LinkList_AddNewChildOperation")) {
        return true;
      }
    }

    return false;
  }

  public static SNode calcExpectedType(SNode nodeUsage) {
    SNode dotExpression = SNodeOperations.cast(SNodeOperations.getParent(nodeUsage), "jetbrains.mps.baseLanguage.structure.DotExpression");

    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(dotExpression), "jetbrains.mps.baseLanguage.structure.AssignmentExpression")) {
      if (SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(dotExpression), "jetbrains.mps.baseLanguage.structure.AssignmentExpression"), "rValue", true) == dotExpression) {
        SNode lValue = SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(dotExpression), "jetbrains.mps.baseLanguage.structure.AssignmentExpression"), "lValue", true);
        return TypeChecker.getInstance().getTypeOf(lValue);
      }
    }

    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(dotExpression), "jetbrains.mps.baseLanguage.structure.IMethodCall")) {
      // find expected type 
      int index = ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(SNodeOperations.getParent(dotExpression), "jetbrains.mps.baseLanguage.structure.IMethodCall"), "actualArgument", true)).indexOf(dotExpression);
      if (index != -1) {
        return SLinkOperations.getTarget(ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(dotExpression), "jetbrains.mps.baseLanguage.structure.IMethodCall"), "baseMethodDeclaration", false), "parameter", true)).getElement(index), "type", true);
      }
    }

    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(dotExpression), "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration")) {
      if (SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(dotExpression), "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"), "initializer", true) == dotExpression) {
        return SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(dotExpression), "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"), "type", true);
      }
    }

    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(dotExpression), "jetbrains.mps.lang.textGen.structure.OperationCall")) {
      int index = ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(SNodeOperations.getParent(dotExpression), "jetbrains.mps.lang.textGen.structure.OperationCall"), "parameter", true)).indexOf(dotExpression);
      if (index != -1) {
        return SLinkOperations.getTarget(ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(dotExpression), "jetbrains.mps.lang.textGen.structure.OperationCall"), "function", false), "parameter", true)).getElement(index), "type", true);
      }
    }

    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(dotExpression), "jetbrains.mps.baseLanguage.structure.ReturnStatement")) {
      SNode method = SNodeOperations.getAncestor(dotExpression, "jetbrains.mps.baseLanguage.structure.IMethodLike", false, false);
      if ((method != null)) {
        return BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), method, "virtual_getExpectedRetType_1239354342632", new Object[]{});
      }
    }

    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(dotExpression), "jetbrains.mps.baseLanguage.structure.ExpressionStatement")) {
      SNode method = SNodeOperations.getAncestor(dotExpression, "jetbrains.mps.baseLanguage.structure.IMethodLike", false, false);
      if ((method != null)) {
        if (BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), method, "virtual_getLastStatement_1239354409446", new Object[]{}) == SNodeOperations.getParent(dotExpression)) {
          return BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), method, "virtual_getExpectedRetType_1239354342632", new Object[]{});
        }
      }
    }

    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(dotExpression), "jetbrains.mps.baseLanguage.structure.CastExpression")) {
      return SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(dotExpression), "jetbrains.mps.baseLanguage.structure.CastExpression"), "type", true);
    }

    return null;
  }
}
