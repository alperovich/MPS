package jetbrains.mps.baseLanguage.varVariable.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilder;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.dataFlow.DataFlowBuilderContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class VarVariableDeclaration_DataFlow extends DataFlowBuilder {
  public VarVariableDeclaration_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    _context.getBuilder().emitNop("r:04eb0d47-e25d-4def-b754-199026c42388(jetbrains.mps.baseLanguage.varVariable.dataFlow)/1206990208534");
    _context.getBuilder().build((SNode) SLinkOperations.getTarget(_context.getNode(), "initializer", true));
    _context.getBuilder().emitWrite(_context.getNode(), SLinkOperations.getTarget(_context.getNode(), "initializer", true), "r:04eb0d47-e25d-4def-b754-199026c42388(jetbrains.mps.baseLanguage.varVariable.dataFlow)/8067700594454574178");
  }
}
