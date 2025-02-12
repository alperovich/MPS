package jetbrains.mps.lang.smodel.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilder;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.dataFlow.DataFlowBuilderContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class IfInstanceOfStatement_DataFlow extends DataFlowBuilder {
  public IfInstanceOfStatement_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    _context.getBuilder().build((SNode) SLinkOperations.getTarget(_context.getNode(), "nodeExpression", true));
    _context.getBuilder().emitIfJump(_context.getBuilder().label(_context.getNode(), "end"), "r:00000000-0000-4000-0000-011c895902fc(jetbrains.mps.lang.smodel.dataFlow)/1883223317721107123");
    _context.getBuilder().emitWrite(SLinkOperations.getTarget(_context.getNode(), "variable", true), "r:00000000-0000-4000-0000-011c895902fc(jetbrains.mps.lang.smodel.dataFlow)/1883223317721107127");
    _context.getBuilder().build((SNode) SLinkOperations.getTarget(_context.getNode(), "body", true));
    _context.getBuilder().emitLabel("end");
  }
}
