package jetbrains.mps.lang.textGen.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPartExt;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_ReplaceNode_CustomNodeConcept;

public class EncodingLiteral_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_djrnp4_a(editorContext, node);
  }

  private EditorCell createCollection_djrnp4_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_djrnp4_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createProperty_djrnp4_a0(editorContext, node));
    return editorCell;
  }

  private EditorCell createProperty_djrnp4_a0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("encoding");
    provider.setNoTargetText("<no encoding>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_encoding");
    Style style = new StyleImpl();
    BaseLanguageStyle_StyleSheet.applyStringLiteral(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(editorContext, provider.getCellContext(), new SubstituteInfoPartExt[]{new EncodingLiteral_Editor.ReplaceWith_EncodingLiteral_cellMenu_djrnp4_a0a0()}));
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  public static class ReplaceWith_EncodingLiteral_cellMenu_djrnp4_a0a0 extends AbstractCellMenuPart_ReplaceNode_CustomNodeConcept {
    public ReplaceWith_EncodingLiteral_cellMenu_djrnp4_a0a0() {
    }

    public String getReplacementConceptName() {
      return "jetbrains.mps.lang.textGen.structure.EncodingLiteral";
    }
  }
}
