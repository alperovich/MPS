package jetbrains.mps.lang.generator.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.nodeEditor.InlineCellProvider;
import jetbrains.mps.nodeEditor.cells.EditorCell_Indent;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class TemplateSwitch_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_q42gqn_a(editorContext, node);
  }

  private EditorCell createCollection_q42gqn_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_q42gqn_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createCollection_q42gqn_a0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_q42gqn_b0(editorContext, node));
    editorCell.addEditorCell(this.createCollection_q42gqn_c0(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_q42gqn_a0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_q42gqn_a0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(this.createConstant_q42gqn_a0a(editorContext, node));
    editorCell.addEditorCell(this.createProperty_q42gqn_b0a(editorContext, node));
    editorCell.addEditorCell(this.createConstant_q42gqn_c0a(editorContext, node));
    editorCell.addEditorCell(this.createRefCell_q42gqn_d0a(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_q42gqn_a0a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "template switch");
    editorCell.setCellId("Constant_q42gqn_a0a");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createProperty_q42gqn_b0a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_name");
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

  private EditorCell createConstant_q42gqn_c0a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "extends");
    editorCell.setCellId("Constant_q42gqn_c0a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createRefCell_q42gqn_d0a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, editorContext);
    provider.setRole("modifiedSwitch");
    provider.setNoTargetText("<none>");
    EditorCell editorCell;
    provider.setAuxiliaryCellProvider(new TemplateSwitch_Editor._Inline_q42gqn_a3a0());
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

  public static class _Inline_q42gqn_a3a0 extends InlineCellProvider {
    public _Inline_q42gqn_a3a0() {
      super();
    }

    public EditorCell createEditorCell(EditorContext editorContext) {
      return this.createEditorCell(editorContext, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
      return this.createProperty_q42gqn_a0d0a(editorContext, node);
    }

    private EditorCell createProperty_q42gqn_a0d0a(EditorContext editorContext, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      EditorCell editorCell;
      editorCell = provider.createEditorCell(editorContext);
      editorCell.setCellId("property_name_1");
      if (editorCell.getRole() == null) {
        editorCell.setReferenceCell(true);
        editorCell.setRole("modifiedSwitch");
      }
      Style style = new StyleImpl();
      Styles_StyleSheet.applyReference(style, editorCell);
      editorCell.getStyle().putAll(style);
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

  private EditorCell createConstant_q42gqn_b0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "");
    editorCell.setCellId("Constant_q42gqn_b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createCollection_q42gqn_c0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_q42gqn_c0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(this.createIndentCell_q42gqn_a2a(editorContext, node));
    editorCell.addEditorCell(this.createCollection_q42gqn_b2a(editorContext, node));
    return editorCell;
  }

  private EditorCell createIndentCell_q42gqn_a2a(EditorContext editorContext, SNode node) {
    EditorCell_Indent editorCell = new EditorCell_Indent(editorContext, node);
    return editorCell;
  }

  private EditorCell createCollection_q42gqn_b2a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_q42gqn_b2a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(this.createCollection_q42gqn_a1c0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_q42gqn_b1c0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_q42gqn_c1c0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_q42gqn_d1c0(editorContext, node));
    editorCell.addEditorCell(this.createCollection_q42gqn_e1c0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_q42gqn_f1c0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_q42gqn_g1c0(editorContext, node));
    editorCell.addEditorCell(this.createCollection_q42gqn_h1c0(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_q42gqn_a1c0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_q42gqn_a1c0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(this.createConstant_q42gqn_a0b2a(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_q42gqn_b0b2a(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_q42gqn_a0b2a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "null-input message:");
    editorCell.setCellId("Constant_q42gqn_a0b2a");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createRefNode_q42gqn_b0b2a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("nullInputMessage");
    provider.setNoTargetText("<none>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    if (editorCell.getRole() == null) {
      editorCell.setRole("nullInputMessage");
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

  private EditorCell createConstant_q42gqn_b1c0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "");
    editorCell.setCellId("Constant_q42gqn_b1c0");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_q42gqn_c1c0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "cases:");
    editorCell.setCellId("Constant_q42gqn_c1c0");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_q42gqn_d1c0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "");
    editorCell.setCellId("Constant_q42gqn_d1c0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createCollection_q42gqn_e1c0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_q42gqn_e1c0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(this.createConstant_q42gqn_a4b2a(editorContext, node));
    editorCell.addEditorCell(this.createRefNodeList_q42gqn_b4b2a(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_q42gqn_a4b2a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "  ");
    editorCell.setCellId("Constant_q42gqn_a4b2a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createRefNodeList_q42gqn_b4b2a(EditorContext editorContext, SNode node) {
    AbstractCellListHandler handler = new TemplateSwitch_Editor.reductionMappingRuleListHandler_q42gqn_b4b2a(node, "reductionMappingRule", editorContext);
    EditorCell_Collection editorCell = handler.createCells(editorContext, new CellLayout_Vertical(), false);
    editorCell.setCellId("refNodeList_reductionMappingRule");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setRole(handler.getElementRole());
    return editorCell;
  }

  private static class reductionMappingRuleListHandler_q42gqn_b4b2a extends RefNodeListHandler {
    public reductionMappingRuleListHandler_q42gqn_b4b2a(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
    }

    public SNode createNodeToInsert(EditorContext editorContext) {
      SNode listOwner = super.getOwner();
      return NodeFactoryManager.createNode(listOwner, editorContext, super.getElementRole());
    }

    public EditorCell createNodeCell(EditorContext editorContext, SNode elementNode) {
      EditorCell elementCell = super.createNodeCell(editorContext, elementNode);
      this.installElementCellActions(this.getOwner(), elementNode, elementCell, editorContext);
      return elementCell;
    }

    public EditorCell createEmptyCell(EditorContext editorContext) {
      EditorCell emptyCell = null;
      emptyCell = super.createEmptyCell(editorContext);
      this.installElementCellActions(super.getOwner(), null, emptyCell, editorContext);
      return emptyCell;
    }

    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext editorContext) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        if (elementNode != null) {
          elementCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(elementNode));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), editorContext));
        }
      }
    }
  }

  private EditorCell createConstant_q42gqn_f1c0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "");
    editorCell.setCellId("Constant_q42gqn_f1c0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_q42gqn_g1c0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "");
    editorCell.setCellId("Constant_q42gqn_g1c0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createCollection_q42gqn_h1c0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_q42gqn_h1c0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(this.createConstant_q42gqn_a7b2a(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_q42gqn_b7b2a(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_q42gqn_a7b2a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "default:");
    editorCell.setCellId("Constant_q42gqn_a7b2a");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createRefNode_q42gqn_b7b2a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("defaultConsequence");
    provider.setNoTargetText("<ignore switch>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    if (editorCell.getRole() == null) {
      editorCell.setRole("defaultConsequence");
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
