package jetbrains.mps.lang.editor.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class CellKeyMapKeystroke_Behavior {
  public static void init(SNode thisNode) {
  }

  public static String call_getKeyStroke_1213877273475(SNode thisNode) {
    String result = "";
    String modifiers = SPropertyOperations.getString(thisNode, "modifiers");
    if (modifiers == null) {
      modifiers = "";
    }
    result = modifiers.replaceAll("\\+", " ");
    String keyName;
    if (SPropertyOperations.getString(thisNode, "keycode") != null && SPropertyOperations.getString(thisNode, "keycode").startsWith("VK_")) {
      keyName = SPropertyOperations.getString(thisNode, "keycode").substring(3);
    } else {
      keyName = SPropertyOperations.getString(thisNode, "keycode");
    }
    result = result + " " + keyName;
    return result;
  }
}
