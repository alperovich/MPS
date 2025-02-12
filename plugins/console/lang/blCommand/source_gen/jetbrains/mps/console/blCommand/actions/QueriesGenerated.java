package jetbrains.mps.console.blCommand.actions;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.action.NodeSetupContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import java.util.List;
import jetbrains.mps.openapi.editor.cells.SubstituteAction;
import jetbrains.mps.smodel.action.NodeSubstituteActionsFactoryContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.smodel.action.IChildNodeSetter;
import jetbrains.mps.smodel.action.AbstractChildNodeSetter;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.action.ModelActions;

public class QueriesGenerated {
  public static void nodeFactory_NodeSetup_QueryExpression_4307205004138627841(final IOperationContext operationContext, final NodeSetupContext _context) {
    if (SNodeOperations.isInstanceOf(_context.getSampleNode(), "jetbrains.mps.console.blCommand.structure.QueryExpression")) {
      SLinkOperations.setTarget(_context.getNewNode(), "parameter", SLinkOperations.getTarget(SNodeOperations.cast(_context.getSampleNode(), "jetbrains.mps.console.blCommand.structure.QueryExpression"), "parameter", true), true);
    } else {
      SLinkOperations.setTarget(_context.getNewNode(), "parameter", null, true);
    }
  }

  public static void nodeFactory_NodeSetup_AbstractPrintExpression_7284872370241013747(final IOperationContext operationContext, final NodeSetupContext _context) {
    if (SNodeOperations.isInstanceOf(_context.getSampleNode(), "jetbrains.mps.console.blCommand.structure.AbstractPrintExpression")) {
      SLinkOperations.setTarget(_context.getNewNode(), "object", SLinkOperations.getTarget(SNodeOperations.cast(_context.getSampleNode(), "jetbrains.mps.console.blCommand.structure.AbstractPrintExpression"), "object", true), true);
    }
  }

  public static void nodeFactory_NodeSetup_ModulesScope_3492877759608901831(final IOperationContext operationContext, final NodeSetupContext _context) {
    SNodeFactoryOperations.addNewChild(_context.getNewNode(), "module", "jetbrains.mps.lang.smodel.structure.ModuleReferenceExpression");
  }

  public static void nodeFactory_NodeSetup_ModelScope_3492877759608986171(final IOperationContext operationContext, final NodeSetupContext _context) {
    SNodeFactoryOperations.addNewChild(_context.getNewNode(), "model", "jetbrains.mps.lang.smodel.structure.ModelReferenceExpression");
  }

  public static void nodeFactory_NodeSetup_CustomScope_3492877759609298946(final IOperationContext operationContext, final NodeSetupContext _context) {
    SNodeFactoryOperations.setNewChild(_context.getNewNode(), "scope", "jetbrains.mps.baseLanguage.structure.GenericNewExpression");
  }

  public static List<SubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Command_3786816536599613947(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<SubstituteAction> result = ListSequence.fromList(new ArrayList<SubstituteAction>());
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.console.blCommand.structure.BLExpression");
      SNode childConcept = (SNode) _context.getChildConcept();
      if (SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        SNode wrappedConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.Expression");
        IChildNodeSetter setter = new AbstractChildNodeSetter() {
          private SNode wrapNode(SNode nodeToWrap, SModel model, @Nullable EditorContext editorContext) {
            SNode result = SNodeFactoryOperations.createNewNode(SNodeOperations.getModel(nodeToWrap), "jetbrains.mps.console.blCommand.structure.BLExpression", null);
            SLinkOperations.setTarget(result, "expression", nodeToWrap, true);
            return result;
          }

          public boolean returnSmallPart(SNode nodeToWrap) {
            return true;
          }

          @Override
          public SNode doExecute(SNode pn, SNode oc, SNode nc, IScope sc, @Nullable EditorContext editorContext) {
            SNode wrappedNode = wrapNode(nc, nc.getModel(), editorContext);
            _context.getChildSetter().execute(_context.getParentNode(), _context.getCurrentTargetNode(), wrappedNode, operationContext.getScope(), editorContext);
            return (returnSmallPart(nc) ?
              nc :
              wrappedNode
            );
          }
        };
        ListSequence.fromList(result).addSequence(ListSequence.fromList(ModelActions.createChildNodeSubstituteActions(_context.getParentNode(), _context.getCurrentTargetNode(), wrappedConcept, setter, operationContext)));
      }
    }
    return result;
  }
}
