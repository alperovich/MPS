package jetbrains.mps.lang.textGen.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilder;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.dataFlow.DataFlowBuilderContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import org.jetbrains.mps.openapi.model.SNode;

public class ConceptTextGenDeclaration_DataFlow extends DataFlowBuilder {
  public ConceptTextGenDeclaration_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    _context.getBuilder().emitWrite(_context.getNode(), "r:812dd537-4bc6-4b23-8ff0-eed686398e8b(jetbrains.mps.lang.textGen.dataFlow)/1237483541335");
    _context.getBuilder().emitRead(SLinkOperations.getTarget(_context.getNode(), "conceptDeclaration", false), "r:812dd537-4bc6-4b23-8ff0-eed686398e8b(jetbrains.mps.lang.textGen.dataFlow)/1237483501065");
    _context.getBuilder().build((SNode) SLinkOperations.getTarget(_context.getNode(), "textGenBlock", true));
  }
}
