package jetbrains.mps.baseLanguage.util.plugin.refactorings;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

/*package*/ class ExtractMethodWithOutputVariable extends ExtractMethodFromStatementsRefactoring {
  private SNode myOutputVariable;
  private SNode myDeclarationStatement = null;

  /*package*/ ExtractMethodWithOutputVariable(ExtractMethodRefactoringParameters parameters) {
    super(parameters);
    List<SNode> output = this.myAnalyzer.getOutputVariables();
    if (ListSequence.fromList(output).isNotEmpty()) {
      this.myOutputVariable = SNodeOperations.cast(ListSequence.fromList(output).first(), "jetbrains.mps.baseLanguage.structure.VariableDeclaration");
    }
    for (SNode statement : ListSequence.fromList(this.myStatements)) {
      if (SNodeOperations.isInstanceOf(statement, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement")) {
        SNode tmp = SNodeOperations.cast(statement, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement");
        if (SLinkOperations.getTarget(tmp, "localVariableDeclaration", true) == this.myOutputVariable) {
          this.myDeclarationStatement = tmp;
        }
      }
    }
  }

  @Override
  protected void modifyPartToExtract() {
    SNode returnStatement = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ReturnStatement", null);
    SLinkOperations.setTarget(returnStatement, "expression", this.createReference(this.myOutputVariable), true);
    ListSequence.fromList(this.myStatements).addElement(returnStatement);
  }

  @Override
  public SNode getMethodType() {
    return SNodeOperations.copyNode(SLinkOperations.getTarget(this.myOutputVariable, "type", true));
  }

  @Override
  public void replaceMatch(final MethodMatch match, final SNode methodDeclaration) {
    ModelAccess.instance().runWriteActionInCommand(new Runnable() {
      public void run() {
        SNode methodCall = ExtractMethodWithOutputVariable.this.createMethodCall(match, methodDeclaration);
        List<SNode> statements = match.getNodes();
        if ((ExtractMethodWithOutputVariable.this.myDeclarationStatement != null)) {
          SLinkOperations.setTarget(SLinkOperations.getTarget(ExtractMethodWithOutputVariable.this.myDeclarationStatement, "localVariableDeclaration", true), "initializer", methodCall, true);
        } else {
          SNode newStatement = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ExpressionStatement", null);
          SLinkOperations.setTarget(newStatement, "expression", _quotation_createNode_n3576q_a0b0a2a0a0a0f(methodCall, BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), ExtractMethodWithOutputVariable.this.myOutputVariable, "virtual_createReference_1213877517482", new Object[]{})), true);
          SNodeOperations.insertPrevSiblingChild(ListSequence.fromList(statements).first(), newStatement);
        }
        for (SNode statement : ListSequence.fromList(statements)) {
          if (statement != ExtractMethodWithOutputVariable.this.myDeclarationStatement) {
            SNodeOperations.deleteNode(statement);
          }
        }
      }
    });
  }

  private static SNode _quotation_createNode_n3576q_a0b0a2a0a0a0f(Object parameter_1, Object parameter_2) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_3 = null;
    SNode quotedNode_4 = null;
    SNode quotedNode_5 = null;
    quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.AssignmentExpression", null, null, GlobalScope.getInstance(), false);
    quotedNode_4 = (SNode) parameter_1;
    if (quotedNode_4 != null) {
      quotedNode_3.addChild("rValue", HUtil.copyIfNecessary(quotedNode_4));
    }
    quotedNode_5 = (SNode) parameter_2;
    if (quotedNode_5 != null) {
      quotedNode_3.addChild("lValue", HUtil.copyIfNecessary(quotedNode_5));
    }
    return quotedNode_3;
  }
}
