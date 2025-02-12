package jetbrains.mps.lang.dataFlow.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;

public class RelativePosition_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_wv5dgr_a(editorContext, node);
  }

  private EditorCell createCollection_wv5dgr_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_wv5dgr_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createComponent_wv5dgr_a0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_wv5dgr_b0(editorContext, node));
    return editorCell;
  }

  private EditorCell createComponent_wv5dgr_a0(EditorContext editorContext, SNode node) {
    EditorCell editorCell = editorContext.getCellFactory().createEditorComponentCell(node, "jetbrains.mps.lang.core.editor.alias");
    Style style = new StyleImpl();
    DataFlow_StyleSheet.applyPosition(style, editorCell);
    editorCell.getStyle().putAll(style);
    return editorCell;
  }

  private EditorCell createRefNode_wv5dgr_b0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("relativeTo");
    provider.setNoTargetText("<no relativeTo>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    if (editorCell.getRole() == null) {
      editorCell.setRole("relativeTo");
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }
}
