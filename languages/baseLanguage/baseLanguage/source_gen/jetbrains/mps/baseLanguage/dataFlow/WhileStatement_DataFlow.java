package jetbrains.mps.baseLanguage.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilder;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.dataFlow.DataFlowBuilderContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class WhileStatement_DataFlow extends DataFlowBuilder {
  public WhileStatement_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    _context.getBuilder().build((SNode) SLinkOperations.getTarget(_context.getNode(), "condition", true));
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_context.getNode(), "condition", true), "jetbrains.mps.baseLanguage.structure.BooleanConstant")) {
      SNode constant = SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), "condition", true), "jetbrains.mps.baseLanguage.structure.BooleanConstant");
      if (!(SPropertyOperations.getBoolean(constant, "value"))) {
        _context.getBuilder().emitJump(_context.getBuilder().after(_context.getNode()), "r:00000000-0000-4000-0000-011c895902c2(jetbrains.mps.baseLanguage.dataFlow)/1206969667905");
      }
    } else {
      _context.getBuilder().emitIfJump(_context.getBuilder().after(_context.getNode()), "r:00000000-0000-4000-0000-011c895902c2(jetbrains.mps.baseLanguage.dataFlow)/1206455229720");
    }
    _context.getBuilder().build((SNode) SLinkOperations.getTarget(_context.getNode(), "body", true));
    _context.getBuilder().emitMayBeUnreachable(new Runnable() {
      public void run() {
        _context.getBuilder().emitJump(_context.getBuilder().before(_context.getNode()), "r:00000000-0000-4000-0000-011c895902c2(jetbrains.mps.baseLanguage.dataFlow)/1206539361128");
      }
    });
  }
}
