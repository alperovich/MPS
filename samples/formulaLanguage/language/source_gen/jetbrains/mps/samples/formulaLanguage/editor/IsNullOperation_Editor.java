package jetbrains.mps.samples.formulaLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.BasicCellContext;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPartExt;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_ReplaceNode_CustomNodeConcept;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.openapi.editor.style.StyleRegistry;
import jetbrains.mps.nodeEditor.MPSColors;

public class IsNullOperation_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_ehpdiz_a(editorContext, node);
  }

  private EditorCell createCollection_ehpdiz_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_ehpdiz_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createRefNode_ehpdiz_a0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_ehpdiz_b0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_ehpdiz_c0(editorContext, node));
    return editorCell;
  }

  private EditorCell createRefNode_ehpdiz_a0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("leftOperand");
    provider.setNoTargetText("<no leftOperand>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    if (editorCell.getRole() == null) {
      editorCell.setRole("leftOperand");
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

  private EditorCell createConstant_ehpdiz_b0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ".");
    editorCell.setCellId("Constant_ehpdiz_b0");
    editorCell.setDefaultText("");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(editorContext, new BasicCellContext(node), new SubstituteInfoPartExt[]{new IsNullOperation_Editor.ReplaceWith_Operation_cellMenu_ehpdiz_a0b0()}));
    return editorCell;
  }

  public static class ReplaceWith_Operation_cellMenu_ehpdiz_a0b0 extends AbstractCellMenuPart_ReplaceNode_CustomNodeConcept {
    public ReplaceWith_Operation_cellMenu_ehpdiz_a0b0() {
    }

    public String getReplacementConceptName() {
      return "jetbrains.mps.samples.formulaLanguage.structure.Operation";
    }
  }

  private EditorCell createConstant_ehpdiz_c0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "isNull");
    editorCell.setCellId("Constant_ehpdiz_c0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.DARK_MAGENTA));
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
}
