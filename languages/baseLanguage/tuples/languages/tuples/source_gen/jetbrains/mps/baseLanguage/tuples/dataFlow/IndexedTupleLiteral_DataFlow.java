package jetbrains.mps.baseLanguage.tuples.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilder;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.dataFlow.DataFlowBuilderContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.mps.openapi.model.SNode;

public class IndexedTupleLiteral_DataFlow extends DataFlowBuilder {
  public IndexedTupleLiteral_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    if (_context.getNode() == SLinkOperations.getTarget(SNodeOperations.as(SNodeOperations.getParent(_context.getNode()), "jetbrains.mps.baseLanguage.structure.BaseAssignmentExpression"), "lValue", true)) {
      for (SNode mbr : SLinkOperations.getTargets(_context.getNode(), "component", true)) {
        _context.getBuilder().emitWrite(SLinkOperations.getTarget(SNodeOperations.as(mbr, "jetbrains.mps.baseLanguage.structure.VariableReference"), "variableDeclaration", false), "r:584f574a-ff70-48d8-8e32-f847d7f18b78(jetbrains.mps.baseLanguage.tuples.dataFlow)/1238857003685");
      }
    } else {
      for (SNode mbr : SLinkOperations.getTargets(_context.getNode(), "component", true)) {
        _context.getBuilder().build((SNode) mbr);
      }
    }
  }
}
