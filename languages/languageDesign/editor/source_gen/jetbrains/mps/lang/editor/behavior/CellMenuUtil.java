package jetbrains.mps.lang.editor.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class CellMenuUtil {
  private CellMenuUtil() {
  }

  public static SNode getEditedFeature(SNode node) {
    if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.editor.structure.CellMenuPart_Abstract")) {
      return getEditedFeature(SNodeOperations.getParent(node));
    }
    if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.editor.structure.CellMenuDescriptor")) {
      return CellMenuDescriptor_Behavior.call_getEditedFeature_1220342015727(SNodeOperations.cast(node, "jetbrains.mps.lang.editor.structure.CellMenuDescriptor"));
    }
    return null;
  }
}
