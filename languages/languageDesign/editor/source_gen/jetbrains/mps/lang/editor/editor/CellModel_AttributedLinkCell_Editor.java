package jetbrains.mps.lang.editor.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSFonts;

public class CellModel_AttributedLinkCell_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_54f2vs_a(editorContext, node);
  }

  public EditorCell createInspectedCell(EditorContext editorContext, SNode node) {
    return this.createCollection_54f2vs_a_0(editorContext, node);
  }

  private EditorCell createCollection_54f2vs_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_54f2vs_a");
    editorCell.setBig(true);
    Style style = new StyleImpl();
    Styles_StyleSheet.applyBorderedCollection(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(this.createConstant_54f2vs_a0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_54f2vs_b0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_54f2vs_c0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_54f2vs_d0(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_54f2vs_a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ">");
    editorCell.setCellId("Constant_54f2vs_a0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    style.set(StyleAttributes.DRAW_BORDER, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_54f2vs_b0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "[//");
    editorCell.setCellId("Constant_54f2vs_b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    style.set(StyleAttributes.DRAW_BORDER, true);
    style.set(StyleAttributes.FONT_STYLE, MPSFonts.PLAIN);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_54f2vs_c0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "attributed link");
    editorCell.setCellId("Constant_54f2vs_c0");
    Style style = new StyleImpl();
    Styles_StyleSheet.applyAttributedCellLabel(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_54f2vs_d0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "//]");
    editorCell.setCellId("Constant_54f2vs_d0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    style.set(StyleAttributes.DRAW_BORDER, true);
    style.set(StyleAttributes.FONT_STYLE, MPSFonts.PLAIN);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createCollection_54f2vs_a_0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_54f2vs_a_0");
    editorCell.setBig(true);
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(this.createComponent_54f2vs_a0(editorContext, node));
    return editorCell;
  }

  private EditorCell createComponent_54f2vs_a0(EditorContext editorContext, SNode node) {
    EditorCell editorCell = editorContext.getCellFactory().createEditorComponentCell(node, "jetbrains.mps.lang.editor.editor._CellModel_Common");
    return editorCell;
  }
}
