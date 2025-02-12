package jetbrains.mps.baseLanguage.overloadedOperators.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.InlineCellProvider;

public class BinaryOperationReference_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_mfrs1f_a(editorContext, node);
  }

  private EditorCell createCollection_mfrs1f_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_mfrs1f_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createRefCell_mfrs1f_a0(editorContext, node));
    return editorCell;
  }

  private EditorCell createRefCell_mfrs1f_a0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, editorContext);
    provider.setRole("binaryOperation");
    provider.setNoTargetText("<no binaryOperation>");
    EditorCell editorCell;
    provider.setAuxiliaryCellProvider(new BinaryOperationReference_Editor._Inline_mfrs1f_a0a());
    editorCell = provider.createEditorCell(editorContext);
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

  public static class _Inline_mfrs1f_a0a extends InlineCellProvider {
    public _Inline_mfrs1f_a0a() {
      super();
    }

    public EditorCell createEditorCell(EditorContext editorContext) {
      return this.createEditorCell(editorContext, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
      return this.createComponent_mfrs1f_a0a0(editorContext, node);
    }

    private EditorCell createComponent_mfrs1f_a0a0(EditorContext editorContext, SNode node) {
      EditorCell editorCell = editorContext.getCellFactory().createEditorComponentCell(node, "jetbrains.mps.lang.core.editor.alias");
      if (editorCell.getRole() == null) {
        editorCell.setReferenceCell(true);
        editorCell.setRole("binaryOperation");
      }
      return editorCell;
    }
  }
}
