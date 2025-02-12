package jetbrains.mps.baseLanguage.textGen;

/*Generated by MPS */

import jetbrains.mps.textGen.SNodeTextGen;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.textGen.TextGenManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class ArrayCreatorWithInitializer_TextGen extends SNodeTextGen {
  public void doGenerateText(SNode node) {
    TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), SLinkOperations.getTarget(node, "componentType", true), this.getSNode());
    this.append("[]{");
    if (ListSequence.fromList(SLinkOperations.getTargets(node, "initValue", true)).isNotEmpty()) {
      for (SNode item : SLinkOperations.getTargets(node, "initValue", true)) {
        TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), item, this.getSNode());
        if (item != ListSequence.fromList(SLinkOperations.getTargets(node, "initValue", true)).last()) {
          this.append(", ");
        }
      }
    }
    this.append("}");
  }
}
