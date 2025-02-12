package jetbrains.mps.lang.quotation.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilder;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.dataFlow.DataFlowBuilderContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.quotation.behavior.NodeBuilderNode_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class NodeBuilder_DataFlow extends DataFlowBuilder {
  public NodeBuilder_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    for (SNode expr : NodeBuilderNode_Behavior.call_getExternalExpressions_1006429225401327586(SLinkOperations.getTarget(_context.getNode(), "quotedNode", true))) {
      _context.getBuilder().build((SNode) expr);
    }
  }
}
