package jetbrains.mps.baseLanguage.util.plugin.refactorings;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class ExtractMethodWithExitPoints extends ExtractMethodFromStatementsRefactoring {
  public ExtractMethodWithExitPoints(ExtractMethodRefactoringParameters parameters) {
    super(parameters);
  }

  @Override
  public SNode getMethodType() {
    return SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.BooleanType", null);
  }

  @Override
  public void replaceMatch(final MethodMatch match, final SNode methodDeclaration) {
    ModelAccess.instance().runWriteActionInCommand(new Runnable() {
      public void run() {
        SNode methodCall = ExtractMethodWithExitPoints.this.createMethodCall(match, methodDeclaration);
        SNode ifNode = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.IfStatement", null);
        SLinkOperations.setTarget(ifNode, "condition", methodCall, true);
        SLinkOperations.setTarget(ifNode, "ifTrue", SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.StatementList", null), true);
        ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(ifNode, "ifTrue", true), "statement", true)).addElement(ListSequence.fromList(ExtractMethodWithExitPoints.this.myAnalyzer.getIntenalExitPoints()).first());
        SNodeOperations.insertPrevSiblingChild(ListSequence.fromList(ExtractMethodWithExitPoints.this.myStatements).first(), ifNode);
        for (SNode statement : ListSequence.fromList(ExtractMethodWithExitPoints.this.myStatements)) {
          SNodeOperations.deleteNode(statement);
        }
      }
    });
  }

  @Override
  protected void modifyPartToExtract() {
    SNode ret = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ReturnStatement", null);
    SNode constant = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.BooleanConstant", null);
    SPropertyOperations.set(constant, "value", "" + (false));
    SLinkOperations.setTarget(ret, "expression", constant, true);
    ListSequence.fromList(this.myStatements).addElement(SNodeOperations.copyNode(ret));
    SPropertyOperations.set(constant, "value", "" + (true));
    for (SNode exitPoint : ListSequence.fromList(this.myAnalyzer.getIntenalExitPoints())) {
      SNodeOperations.replaceWithAnother(exitPoint, SNodeOperations.copyNode(ret));
    }
  }
}
