package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.openapi.editor.style.StyleRegistry;
import jetbrains.mps.nodeEditor.MPSColors;

public class UnknownConsCall_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_bnhthl_a(editorContext, node);
  }

  private EditorCell createCollection_bnhthl_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_bnhthl_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createCollection_bnhthl_a0(editorContext, node));
    editorCell.addEditorCell(this.createComponent_bnhthl_b0(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_bnhthl_a0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_bnhthl_a0");
    editorCell.addEditorCell(this.createAlternation_bnhthl_a0a(editorContext, node));
    return editorCell;
  }

  private EditorCell createAlternation_bnhthl_a0a(EditorContext editorContext, SNode node) {
    boolean alternationCondition = true;
    alternationCondition = UnknownConsCall_Editor.renderingCondition_bnhthl_a0a0(node, editorContext, editorContext.getOperationContext().getScope());
    EditorCell editorCell = null;
    if (alternationCondition) {
      editorCell = this.createConstant_bnhthl_a0a0(editorContext, node);
    } else {
      editorCell = this.createConstant_bnhthl_a0a0_0(editorContext, node);
    }
    return editorCell;
  }

  private static boolean renderingCondition_bnhthl_a0a0(SNode node, EditorContext editorContext, IScope scope) {
    return SPropertyOperations.getBoolean(node, "isSuper");
  }

  private EditorCell createConstant_bnhthl_a0a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "super");
    editorCell.setCellId("Constant_bnhthl_a0a0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.red));
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_bnhthl_a0a0_0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "this");
    editorCell.setCellId("Constant_bnhthl_a0a0_0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.red));
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createComponent_bnhthl_b0(EditorContext editorContext, SNode node) {
    EditorCell editorCell = editorContext.getCellFactory().createEditorComponentCell(node, "jetbrains.mps.baseLanguage.editor.IMethodCall_actualArguments");
    return editorCell;
  }
}
