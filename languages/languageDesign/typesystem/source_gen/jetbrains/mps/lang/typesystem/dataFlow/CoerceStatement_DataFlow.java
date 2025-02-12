package jetbrains.mps.lang.typesystem.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilder;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.dataFlow.DataFlowBuilderContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class CoerceStatement_DataFlow extends DataFlowBuilder {
  public CoerceStatement_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    _context.getBuilder().build((SNode) SLinkOperations.getTarget(_context.getNode(), "nodeToCoerce", true));
    _context.getBuilder().build((SNode) SLinkOperations.getTarget(_context.getNode(), "pattern", true));
    _context.getBuilder().emitIfJump(_context.getBuilder().label(_context.getNode(), "endOfTrue"), "r:00000000-0000-4000-0000-011c895902af(jetbrains.mps.lang.typesystem.dataFlow)/1220448058969");
    _context.getBuilder().build((SNode) SLinkOperations.getTarget(_context.getNode(), "body", true));
    if ((SLinkOperations.getTarget(_context.getNode(), "elseClause", true) != null)) {
      _context.getBuilder().emitMayBeUnreachable(new Runnable() {
        public void run() {
          _context.getBuilder().emitJump(_context.getBuilder().after(SLinkOperations.getTarget(_context.getNode(), "elseClause", true)), "r:00000000-0000-4000-0000-011c895902af(jetbrains.mps.lang.typesystem.dataFlow)/1228490477783");
        }
      });
    }
    _context.getBuilder().emitLabel("endOfTrue");
    if ((SLinkOperations.getTarget(_context.getNode(), "elseClause", true) != null)) {
      _context.getBuilder().build((SNode) SLinkOperations.getTarget(_context.getNode(), "elseClause", true));
    }
  }
}
