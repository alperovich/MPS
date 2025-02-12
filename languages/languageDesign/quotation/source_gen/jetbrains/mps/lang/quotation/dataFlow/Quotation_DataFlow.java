package jetbrains.mps.lang.quotation.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilder;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.dataFlow.DataFlowBuilderContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class Quotation_DataFlow extends DataFlowBuilder {
  public Quotation_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    for (SNode antiquotation : SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.lang.quotation.structure.AbstractAntiquotation", false, new String[]{})) {
      _context.getBuilder().build((SNode) antiquotation);
    }
    _context.getBuilder().build((SNode) SLinkOperations.getTarget(_context.getNode(), "modelToCreate", true));
    _context.getBuilder().build((SNode) SLinkOperations.getTarget(_context.getNode(), "nodeId", true));
  }
}
