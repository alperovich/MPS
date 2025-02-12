package jetbrains.mps.baseLanguage.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilder;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.dataFlow.DataFlowBuilderContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class TernaryOperatorExpression_DataFlow extends DataFlowBuilder {
  public TernaryOperatorExpression_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    _context.getBuilder().build((SNode) SLinkOperations.getTarget(_context.getNode(), "condition", true));
    _context.getBuilder().emitIfJump(_context.getBuilder().before(SLinkOperations.getTarget(_context.getNode(), "ifFalse", true)), "r:00000000-0000-4000-0000-011c895902c2(jetbrains.mps.baseLanguage.dataFlow)/1206537031480");
    _context.getBuilder().build((SNode) SLinkOperations.getTarget(_context.getNode(), "ifTrue", true));
    _context.getBuilder().emitJump(_context.getBuilder().after(_context.getNode()), "r:00000000-0000-4000-0000-011c895902c2(jetbrains.mps.baseLanguage.dataFlow)/1206537049402");
    _context.getBuilder().build((SNode) SLinkOperations.getTarget(_context.getNode(), "ifFalse", true));
    _context.getBuilder().emitNop("r:00000000-0000-4000-0000-011c895902c2(jetbrains.mps.baseLanguage.dataFlow)/8493229414304959335");
  }
}
