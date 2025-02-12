package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.dependencies.CheckingMethod;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.generator.TransientModelsModule;
import jetbrains.mps.lang.dataFlow.framework.Program;
import jetbrains.mps.lang.dataFlow.DataFlow;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.lang.dataFlow.DataflowBuilderException;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.errors.BaseQuickFixProvider;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.internal.collections.runtime.SetSequence;

public class DataFlowUtil {
  private static int maxProgramSize = 400;

  public DataFlowUtil() {
  }

  @CheckingMethod
  public static void checkDataFlow(final TypeCheckingContext typeCheckingContext, SNode statementList) {
    checkDataFlow(typeCheckingContext, statementList, false);
  }

  @CheckingMethod
  public static void checkDataFlow(final TypeCheckingContext typeCheckingContext, SNode statementList, boolean checkReturns) {
    if (statementList == null) {
      return;
    }
    if (SNodeOperations.getModel(statementList).getModule() instanceof TransientModelsModule) {
      return;
    }
    try {
      Program program = DataFlow.buildProgram(statementList);
      if (tooComplex(program)) {
        {
          MessageTarget errorTarget = new NodeMessageTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportInfo(SNodeOperations.getParent(statementList), "This node is too complex too analyze by data flow algorithm", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "6067900799350600197", null, errorTarget);
        }
        return;
      }
      checkUnreachable(typeCheckingContext, program);
      checkUninitializedReads(typeCheckingContext, program);
      checkUnusedAssignments(typeCheckingContext, program);
      checkUnusedVariables(typeCheckingContext, statementList, program);
      if (checkReturns) {
        checkReturns(typeCheckingContext, program);
      }
    } catch (DataflowBuilderException e) {
      throw new RuntimeException("Building dataflow for node: " + statementList.getNodeId().toString() + " model: " + statementList.getModel(), e);
    }
  }

  @CheckingMethod
  public static void checkReturns(final TypeCheckingContext typeCheckingContext, Program program) {
    Set<SNode> expectedReturns = DataFlow.getExpectedReturns(program);
    for (SNode n : expectedReturns) {
      if (n != null && !(SNodeOperations.isInstanceOf(n, "jetbrains.mps.baseLanguage.structure.TryStatement"))) {
        SNode nodeToSelect;
        SNode sl = SNodeOperations.getAncestor(n, "jetbrains.mps.baseLanguage.structure.StatementList", true, false);
        if ((sl != null) && ListSequence.fromList(SLinkOperations.getTargets(sl, "statement", true)).isNotEmpty()) {
          nodeToSelect = SNodeOperations.getAncestor(n, "jetbrains.mps.baseLanguage.structure.Statement", true, false);
        } else {
          nodeToSelect = SNodeOperations.getAncestor(n, "jetbrains.mps.baseLanguage.structure.StatementList", true, false);
        }
        if (nodeToSelect != null) {
          {
            MessageTarget errorTarget = new NodeMessageTarget();
            IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(nodeToSelect, "Return expected", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1223640343628", null, errorTarget);
          }
        } else {
          {
            MessageTarget errorTarget = new NodeMessageTarget();
            IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(n, "Return expected", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1223640343636", null, errorTarget);
          }
        }
      }
    }
  }

  @CheckingMethod
  public static void checkReturns(final TypeCheckingContext typeCheckingContext, SNode node) {
    checkReturns(typeCheckingContext, DataFlow.buildProgram(node));
  }

  @CheckingMethod
  private static void checkUnreachable(final TypeCheckingContext typeCheckingContext, Program program) {
    Set<SNode> unreachable = DataFlow.getUnreachableNodes(program);
    for (SNode n : unreachable) {
      {
        MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(n, "Unreachable node", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1223640538234", null, errorTarget);
      }
      return;
    }
  }

  @CheckingMethod
  private static void checkUninitializedReads(final TypeCheckingContext typeCheckingContext, Program program) {
    Set<SNode> uninitializedReads = DataFlow.getUninitializedReads(program);
    for (SNode read : uninitializedReads) {
      SNode localReference = null;
      if (SNodeOperations.isInstanceOf(read, "jetbrains.mps.baseLanguage.structure.ILocalReference")) {
        localReference = SNodeOperations.cast(read, "jetbrains.mps.baseLanguage.structure.ILocalReference");
      }
      if (SNodeOperations.isInstanceOf(read, "jetbrains.mps.baseLanguage.structure.BaseAssignmentExpression") && SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SNodeOperations.cast(read, "jetbrains.mps.baseLanguage.structure.BaseAssignmentExpression"), "lValue", true), "jetbrains.mps.baseLanguage.structure.ILocalReference")) {
        localReference = SNodeOperations.cast(SLinkOperations.getTarget(SNodeOperations.cast(read, "jetbrains.mps.baseLanguage.structure.BaseAssignmentExpression"), "lValue", true), "jetbrains.mps.baseLanguage.structure.ILocalReference");
      }
      if (localReference != null && !(BehaviorReflection.invokeVirtual(Boolean.TYPE, BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), localReference, "virtual_getDeclaration_3262277503800831941", new Object[]{}), "virtual_isReferencedInClosure_3262277503800823422", new Object[]{}))) {
        SNode refAncestor = SNodeOperations.getAncestor(read, "jetbrains.mps.baseLanguage.structure.IControlFlowInterrupter", false, false);
        if (BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), localReference, "virtual_getDeclaration_3262277503800831941", new Object[]{}) != null && (refAncestor == null || SNodeOperations.getAncestor(BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), localReference, "virtual_getDeclaration_3262277503800831941", new Object[]{}), "jetbrains.mps.baseLanguage.structure.IControlFlowInterrupter", false, false) == refAncestor)) {
          {
            MessageTarget errorTarget = new NodeMessageTarget();
            IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(read, "Variable '" + BehaviorReflection.invokeVirtual(String.class, BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), localReference, "virtual_getDeclaration_3262277503800831941", new Object[]{}), "virtual_getPresentation_1213877396640", new Object[]{}) + "' might not have been initialized", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1529050434900907669", null, errorTarget);
          }
        }
      }
    }
  }

  @CheckingMethod
  private static void checkUnusedAssignments(final TypeCheckingContext typeCheckingContext, Program program) {
    Set<SNode> unusedAssignments = DataFlow.getUnusedAssignments(program);
    for (SNode write : unusedAssignments) {
      if (SNodeOperations.isInstanceOf(write, "jetbrains.mps.baseLanguage.structure.BaseAssignmentExpression")) {
        SNode assignment = SNodeOperations.cast(write, "jetbrains.mps.baseLanguage.structure.BaseAssignmentExpression");
        SNode declaration = null;
        if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(assignment, "lValue", true), "jetbrains.mps.baseLanguage.structure.VariableReference")) {
          declaration = SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(assignment, "lValue", true), "jetbrains.mps.baseLanguage.structure.VariableReference"), "variableDeclaration", false);
        }
        if ((SNodeOperations.isInstanceOf(SLinkOperations.getTarget(assignment, "lValue", true), "jetbrains.mps.baseLanguage.structure.VariableReference") && SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(assignment, "lValue", true), "jetbrains.mps.baseLanguage.structure.VariableReference"), "variableDeclaration", false), "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration")) || (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(assignment, "lValue", true), "jetbrains.mps.baseLanguage.structure.VariableReference") && SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(assignment, "lValue", true), "jetbrains.mps.baseLanguage.structure.VariableReference"), "variableDeclaration", false), "jetbrains.mps.baseLanguage.structure.ParameterDeclaration"))) {
          if (SNodeOperations.getAncestor(write, "jetbrains.mps.baseLanguage.structure.IControlFlowInterrupter", false, false) == null) {
            {
              MessageTarget errorTarget = new NodeMessageTarget();
              IErrorReporter _reporter_2309309498 = typeCheckingContext.reportWarning(assignment, "Unused assignment", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "7567158975344997930", null, errorTarget);
              {
                BaseQuickFixProvider intentionProvider = new BaseQuickFixProvider("jetbrains.mps.baseLanguage.typesystem.RemoveUnusedAssignment_QuickFix", false);
                _reporter_2309309498.addIntentionProvider(intentionProvider);
              }
            }
          } else if (declaration != null && SNodeOperations.getAncestor(declaration, "jetbrains.mps.baseLanguage.structure.IControlFlowInterrupter", false, false) != null) {
            {
              MessageTarget errorTarget = new NodeMessageTarget();
              IErrorReporter _reporter_2309309498 = typeCheckingContext.reportWarning(assignment, "Unused assignment", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "7567158975345062849", null, errorTarget);
              {
                BaseQuickFixProvider intentionProvider = new BaseQuickFixProvider("jetbrains.mps.baseLanguage.typesystem.RemoveUnusedAssignment_QuickFix", false);
                _reporter_2309309498.addIntentionProvider(intentionProvider);
              }
            }
          }
        }
      }
      if (SNodeOperations.isInstanceOf(write, "jetbrains.mps.baseLanguage.structure.ParameterDeclaration")) {
        SNode variableAssignment = SNodeOperations.cast(write, "jetbrains.mps.baseLanguage.structure.IVariableAssignment");
        if (BehaviorReflection.invokeVirtual(Boolean.TYPE, variableAssignment, "virtual_isCanBeUnused_1223985713603", new Object[]{})) {
          {
            MessageTarget errorTarget = new NodeMessageTarget();
            IErrorReporter _reporter_2309309498 = typeCheckingContext.reportWarning(write, "Unused parameter", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1225278748067", null, errorTarget);
          }
        }
      } else if (SNodeOperations.isInstanceOf(write, "jetbrains.mps.baseLanguage.structure.IVariableAssignment")) {
        SNode variableAssignment = SNodeOperations.cast(write, "jetbrains.mps.baseLanguage.structure.IVariableAssignment");
        if (BehaviorReflection.invokeVirtual(Boolean.TYPE, variableAssignment, "virtual_isCanBeUnused_1223985713603", new Object[]{})) {
          if (SNodeOperations.isInstanceOf(write, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration")) {
            SNode decl = SNodeOperations.cast(write, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration");
            if (BehaviorReflection.invokeVirtual(Boolean.TYPE, decl, "virtual_isReferencedInControlFlowInterrupter_1644061362849513751", new Object[]{})) {
              continue;
            }
            if (SLinkOperations.getTarget(decl, "initializer", true) == null) {
              continue;
            }
            {
              MessageTarget errorTarget = new NodeMessageTarget();
              IErrorReporter _reporter_2309309498 = typeCheckingContext.reportWarning(SLinkOperations.getTarget(decl, "initializer", true), "Variable '" + SPropertyOperations.getString(decl, "name") + "' initializer is redundant", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "963887337804010668", null, errorTarget);
              {
                BaseQuickFixProvider intentionProvider = new BaseQuickFixProvider("jetbrains.mps.baseLanguage.typesystem.RemoveUnusedAssignment_QuickFix", false);
                _reporter_2309309498.addIntentionProvider(intentionProvider);
              }
            }
          } else {
            {
              MessageTarget errorTarget = new NodeMessageTarget();
              IErrorReporter _reporter_2309309498 = typeCheckingContext.reportWarning(write, "Unused assignment", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1225278681706", null, errorTarget);
              {
                BaseQuickFixProvider intentionProvider = new BaseQuickFixProvider("jetbrains.mps.baseLanguage.typesystem.RemoveUnusedAssignment_QuickFix", false);
                _reporter_2309309498.addIntentionProvider(intentionProvider);
              }
            }
          }
        }
      }
    }
  }

  @CheckingMethod
  public static void checkUnusedVariables(final TypeCheckingContext typeCheckingContext, @NotNull SNode statementList, Program program) {
    Set<SNode> usedVariables = DataFlow.getUsedVariables(program, statementList);
    for (SNode var : SNodeOperations.getDescendants(statementList, "jetbrains.mps.baseLanguage.structure.IVariableDeclaration", false, new String[]{})) {
      if (program.getInstructionsFor(var).isEmpty()) {
        continue;
      }
      if (!(SNodeOperations.isInstanceOf(SNodeOperations.getParent(var), "jetbrains.mps.baseLanguage.structure.CatchClause")) && SNodeOperations.getAncestor(var, "jetbrains.mps.lang.quotation.structure.Quotation", false, false) == null) {
        if ((!(SNodeOperations.isInstanceOf(var, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration")) || SLinkOperations.getTarget(SNodeOperations.cast(var, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"), "initializer", true) == null) && !(SetSequence.fromSet(usedVariables).contains(var))) {
          {
            MessageTarget errorTarget = new NodeMessageTarget();
            IErrorReporter _reporter_2309309498 = typeCheckingContext.reportWarning(var, "Unused variable", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "8937659523942275424", null, errorTarget);
          }
        }
      }
    }
  }

  public static boolean tooComplex(Program program) {
    return program.size() > DataFlowUtil.maxProgramSize;
  }
}
