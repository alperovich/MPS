package jetbrains.mps.core.xml.textGen;

/*Generated by MPS */

import jetbrains.mps.textGen.SNodeTextGen;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class XmlProcessingInstruction_TextGen extends SNodeTextGen {
  public void doGenerateText(SNode node) {
    SNode left = SNodeOperations.getPrevSibling(node);
    if (SNodeOperations.isInstanceOf(left, "jetbrains.mps.core.xml.structure.XmlPart") && BehaviorReflection.invokeVirtual(Boolean.TYPE, SNodeOperations.cast(left, "jetbrains.mps.core.xml.structure.XmlPart"), "virtual_hasNewLineAfter_2133624044437631594", new Object[]{})) {
      this.appendNewLine();
      this.indentBuffer();
    }
    this.append("<?");
    this.append(SPropertyOperations.getString(node, "target"));
    this.append(" ");
    this.append(SPropertyOperations.getString(node, "rawData"));
    this.append("?>");
  }
}
