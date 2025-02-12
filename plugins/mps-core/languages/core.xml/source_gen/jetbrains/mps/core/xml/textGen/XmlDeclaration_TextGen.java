package jetbrains.mps.core.xml.textGen;

/*Generated by MPS */

import jetbrains.mps.textGen.SNodeTextGen;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class XmlDeclaration_TextGen extends SNodeTextGen {
  public void doGenerateText(SNode node) {
    this.append("<?xml");
    this.append(" ");
    this.append("version");
    this.append(" = ");
    this.append("\"");
    this.append(SPropertyOperations.getString(node, "version"));
    this.append("\"");
    if (isNotEmpty_ney477_a0b0a(SPropertyOperations.getString(node, "encoding"))) {
      this.append(" ");
      this.append("encoding");
      this.append(" = ");
      this.append("\"");
      this.append(SPropertyOperations.getString(node, "encoding"));
      this.append("\"");
    }
    if (isNotEmpty_ney477_a0c0a(SPropertyOperations.getString(node, "standalone"))) {
      this.append(" ");
      this.append("standalone");
      this.append(" = ");
      this.append("\"");
      this.append(SPropertyOperations.getString(node, "standalone"));
      this.append("\"");
    }
    this.append("?>");
  }

  public static boolean isNotEmpty_ney477_a0b0a(String str) {
    return str != null && str.length() > 0;
  }

  public static boolean isNotEmpty_ney477_a0c0a(String str) {
    return str != null && str.length() > 0;
  }
}
