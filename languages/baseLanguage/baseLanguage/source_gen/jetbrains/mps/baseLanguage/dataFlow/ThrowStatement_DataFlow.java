package jetbrains.mps.baseLanguage.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilder;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.dataFlow.DataFlowBuilderContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import java.util.List;
import jetbrains.mps.typesystem.inference.TypeChecker;

public class ThrowStatement_DataFlow extends DataFlowBuilder {
  public ThrowStatement_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    _context.getBuilder().build((SNode) SLinkOperations.getTarget(_context.getNode(), "throwable", true));
    SNode interrupt = SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.structure.IControlFlowInterrupter", false, false);
    SNode tryCatch = SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.structure.ITryCatchStatement", false, false);
    if (tryCatch != null && (interrupt == null || ListSequence.fromList(SNodeOperations.getAncestors(tryCatch, null, false)).contains(interrupt))) {
      for (SNode catchClause : BehaviorReflection.invokeVirtual((Class<List<SNode>>) ((Class) Object.class), tryCatch, "virtual_getCatchClauses_3718132079121388582", new Object[]{})) {
        SNode caughtType = SLinkOperations.getTarget(SLinkOperations.getTarget(catchClause, "throwable", true), "type", true);
        if (TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "throwable", true)), caughtType)) {
          _context.getBuilder().emitJump(_context.getBuilder().before(catchClause), "r:00000000-0000-4000-0000-011c895902c2(jetbrains.mps.baseLanguage.dataFlow)/8754905177066818389");
          return;
        }
      }
    }
    _context.getBuilder().emitRet("r:00000000-0000-4000-0000-011c895902c2(jetbrains.mps.baseLanguage.dataFlow)/1206464652781");
  }
}
