package jetbrains.mps.console.ideCommands.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.console.tool.ConsoleContext;
import jetbrains.mps.console.tool.ConsoleStream;
import jetbrains.mps.smodel.ModelAccess;
import org.jetbrains.mps.openapi.model.SReference;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class ShowBrokenReferences_Behavior {
  public static void init(SNode thisNode) {
  }

  public static void virtual_doExecute_3321948346081469500(final SNode thisNode, final ConsoleContext context, final ConsoleStream console) {
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        Iterable<SReference> brokenReferences = Sequence.fromIterable(BehaviorReflection.invokeVirtual((Class<Iterable<SNode>>) ((Class) Object.class), SLinkOperations.getTarget(thisNode, "target", true), "virtual_getNodes_5207260697411458163", new Object[]{context})).translate(new ITranslator2<SNode, SReference>() {
          public Iterable<SReference> translate(SNode it) {
            return SNodeOperations.getReferences(it);
          }
        }).where(new IWhereFilter<SReference>() {
          public boolean accept(SReference it) {
            return jetbrains.mps.util.SNodeOperations.getTargetNodeSilently(it) == null;
          }
        });
        for (SReference ref : Sequence.fromIterable(brokenReferences)) {
          console.addText("model id = " + ref.getTargetSModelReference());
          console.addText("\n");
          console.addText("node  id = " + ref.getTargetNodeId());
          SNode targetNode = ref.getSourceNode();
          console.addText("\n");
          SNode clickableNode = SConceptOperations.createNewNode("jetbrains.mps.console.base.structure.NodeReferenceString", null);
          SPropertyOperations.set(clickableNode, "referencePresentation", "Go to enclosing node");
          SLinkOperations.setTarget(clickableNode, "target", targetNode, false);
          console.addNode(clickableNode);
          console.addText("\n");
          console.addText("\n");
        }
      }
    });
  }
}
