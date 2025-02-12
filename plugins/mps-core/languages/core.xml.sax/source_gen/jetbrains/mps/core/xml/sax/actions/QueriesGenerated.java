package jetbrains.mps.core.xml.sax.actions;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.openapi.editor.cells.SubstituteAction;
import jetbrains.mps.smodel.IOperationContext;
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
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.action.ModelActions;

public class QueriesGenerated {
  public static List<SubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_XMLSAXNodeRuleParam_4720003541457430440(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<SubstituteAction> result = ListSequence.fromList(new ArrayList<SubstituteAction>());
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.core.xml.sax.structure.XMLSAXNodeRuleParam");
      SNode childConcept = (SNode) _context.getChildConcept();
      if (SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        SNode wrappedConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.Type");
        IChildNodeSetter setter = new AbstractChildNodeSetter() {
          private SNode wrapNode(SNode nodeToWrap, SModel model, @Nullable EditorContext editorContext) {
            SNode res = SConceptOperations.createNewNode("jetbrains.mps.core.xml.sax.structure.XMLSAXNodeRuleParam", null);
            SLinkOperations.setTarget(res, "type", nodeToWrap, true);
            return res;
          }

          public boolean returnSmallPart(SNode nodeToWrap) {
            return false;
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
