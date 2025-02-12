package jetbrains.mps.baseLanguage.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilder;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.dataFlow.DataFlowBuilderContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.dataFlow.framework.instructions.Instruction;
import jetbrains.mps.lang.dataFlow.framework.InstructionUtil;

public class TryCatchStatement_DataFlow extends DataFlowBuilder {
  public TryCatchStatement_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    for (SNode catchClause : SLinkOperations.getTargets(_context.getNode(), "catchClause", true)) {
      _context.getBuilder().emitIfJump(_context.getBuilder().before(catchClause), "r:00000000-0000-4000-0000-011c895902c2(jetbrains.mps.baseLanguage.dataFlow)/7970753809667931499");
    }
    _context.getBuilder().build((SNode) SLinkOperations.getTarget(_context.getNode(), "body", true));
    for (Instruction instruction : _context.getBuilder().getInstructionsFor(SLinkOperations.getTarget(_context.getNode(), "body", true))) {
      if (InstructionUtil.isRet(instruction) || InstructionUtil.isJump(instruction) || InstructionUtil.isNop(instruction)) {
        continue;
      }
      for (SNode catchClause : DataFlowTryCatchUtil.getPossibleCatches((SNode) InstructionUtil.getSource(instruction), SLinkOperations.getTargets(_context.getNode(), "catchClause", true))) {
        _context.getBuilder().emitIfJump(_context.getBuilder().before(catchClause), _context.getBuilder().insertAfter(instruction), "r:00000000-0000-4000-0000-011c895902c2(jetbrains.mps.baseLanguage.dataFlow)/7597254041024527756");
      }
    }
    _context.getBuilder().emitMayBeUnreachable(new Runnable() {
      public void run() {
        _context.getBuilder().emitJump(_context.getBuilder().after(_context.getNode()), "r:00000000-0000-4000-0000-011c895902c2(jetbrains.mps.baseLanguage.dataFlow)/1207218496728");
      }
    });
    for (SNode c : SLinkOperations.getTargets(_context.getNode(), "catchClause", true)) {
      _context.getBuilder().build((SNode) c);
    }
  }
}
