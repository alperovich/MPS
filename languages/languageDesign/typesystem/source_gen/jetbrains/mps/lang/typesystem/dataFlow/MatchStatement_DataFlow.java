package jetbrains.mps.lang.typesystem.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilder;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.dataFlow.DataFlowBuilderContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class MatchStatement_DataFlow extends DataFlowBuilder {
  public MatchStatement_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    _context.getBuilder().build((SNode) SLinkOperations.getTarget(_context.getNode(), "expression", true));
    for (SNode item : SLinkOperations.getTargets(_context.getNode(), "item", true)) {
      _context.getBuilder().build((SNode) item);
    }
    if (SLinkOperations.getTarget(_context.getNode(), "ifFalseStatement", true) != null) {
      _context.getBuilder().build((SNode) SLinkOperations.getTarget(_context.getNode(), "ifFalseStatement", true));
    }
  }
}
