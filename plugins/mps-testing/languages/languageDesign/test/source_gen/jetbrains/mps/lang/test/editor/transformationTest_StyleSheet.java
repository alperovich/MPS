package jetbrains.mps.lang.test.editor;

/*Generated by MPS */

import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.openapi.editor.style.StyleRegistry;
import jetbrains.mps.nodeEditor.MPSColors;

public class transformationTest_StyleSheet {
  @Deprecated
  public static Style getAssertStyle(final EditorCell editorCell) {
    Style style = new StyleImpl(editorCell);
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.blue));
    return style;
  }

  @Deprecated
  public static Style getNodeAnnotation(final EditorCell editorCell) {
    Style style = new StyleImpl(editorCell);
    style.set(StyleAttributes.UNDERLINED, true);
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.DARK_GREEN));
    return style;
  }

  @Deprecated
  public static Style getNodeProperty(final EditorCell editorCell) {
    Style style = new StyleImpl(editorCell);
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.DARK_GREEN));
    return style;
  }

  @Deprecated
  public static Style getEditorOperation(final EditorCell editorCell) {
    Style style = new StyleImpl(editorCell);
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.DARK_MAGENTA));
    return style;
  }

  public static void applyAssertStyle(Style style, EditorCell editorCell) {
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.blue));
  }

  public static void applyNodeAnnotation(Style style, EditorCell editorCell) {
    style.set(StyleAttributes.UNDERLINED, true);
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.DARK_GREEN));
  }

  public static void applyNodeProperty(Style style, EditorCell editorCell) {
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.DARK_GREEN));
  }

  public static void applyEditorOperation(Style style, EditorCell editorCell) {
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.DARK_MAGENTA));
  }
}
