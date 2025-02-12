package jetbrains.mps.build.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.InlineCellProvider;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;

public class GeneratorInternal_BuildSource_JavaJar_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_g0zw24_a(editorContext, node);
  }

  private EditorCell createCollection_g0zw24_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_g0zw24_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createConstant_g0zw24_a0(editorContext, node));
    editorCell.addEditorCell(this.createRefCell_g0zw24_b0(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_g0zw24_a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "java jar");
    editorCell.setCellId("Constant_g0zw24_a0");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createRefCell_g0zw24_b0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, editorContext);
    provider.setRole("targetJar");
    provider.setNoTargetText("<no targetJar>");
    EditorCell editorCell;
    provider.setAuxiliaryCellProvider(new GeneratorInternal_BuildSource_JavaJar_Editor._Inline_g0zw24_a1a());
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

  public static class _Inline_g0zw24_a1a extends InlineCellProvider {
    public _Inline_g0zw24_a1a() {
      super();
    }

    public EditorCell createEditorCell(EditorContext editorContext) {
      return this.createEditorCell(editorContext, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
      return this.createCollection_g0zw24_a0b0(editorContext, node);
    }

    private EditorCell createCollection_g0zw24_a0b0(EditorContext editorContext, SNode node) {
      EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
      editorCell.setCellId("Collection_g0zw24_a0b0");
      if (editorCell.getRole() == null) {
        editorCell.setReferenceCell(true);
        editorCell.setRole("targetJar");
      }
      editorCell.addEditorCell(this.createRefNode_g0zw24_a0a1a(editorContext, node));
      return editorCell;
    }

    private EditorCell createRefNode_g0zw24_a0a1a(EditorContext editorContext, SNode node) {
      CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
      provider.setRole("path");
      provider.setNoTargetText("<no path>");
      EditorCell editorCell;
      editorCell = provider.createEditorCell(editorContext);
      if (editorCell.getRole() == null) {
        editorCell.setRole("path");
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
}
