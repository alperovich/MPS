package jetbrains.mps.core.xml.textGen;

/*Generated by MPS */

import jetbrains.mps.textGen.SNodeTextGen;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.textGen.TextGenManager;

public class XmlDoctypeDeclaration_TextGen extends SNodeTextGen {
  public void doGenerateText(SNode node) {
    SNode left = SNodeOperations.getPrevSibling(node);
    if (SNodeOperations.isInstanceOf(left, "jetbrains.mps.core.xml.structure.XmlPart") && BehaviorReflection.invokeVirtual(Boolean.TYPE, SNodeOperations.cast(left, "jetbrains.mps.core.xml.structure.XmlPart"), "virtual_hasNewLineAfter_2133624044437631594", new Object[]{})) {
      this.appendNewLine();
      this.indentBuffer();
    }
    this.append("<!DOCTYPE");
    this.append(" ");
    this.append(SPropertyOperations.getString(node, "doctypeName"));
    if ((SLinkOperations.getTarget(node, "externalId", true) != null)) {
      this.append(" ");
      TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), SLinkOperations.getTarget(node, "externalId", true), this.getSNode());
    }
    this.append(">");
  }
}
