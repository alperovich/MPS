package jetbrains.mps.debugger.api.lang.editor;

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
import jetbrains.mps.nodeEditor.cells.EditorCell_Indent;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;

public class BreakpointableNodeItem_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_4n0rw6_a(editorContext, node);
  }

  private EditorCell createCollection_4n0rw6_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_4n0rw6_a");
    editorCell.setBig(true);
    if (renderingCondition_4n0rw6_a0a(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection_4n0rw6_a0(editorContext, node));
    }
    if (renderingCondition_4n0rw6_a1a(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection_4n0rw6_b0(editorContext, node));
    }
    editorCell.addEditorCell(this.createConstant_4n0rw6_c0(editorContext, node));
    editorCell.addEditorCell(this.createCollection_4n0rw6_d0(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_4n0rw6_a0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_4n0rw6_a0");
    editorCell.addEditorCell(this.createConstant_4n0rw6_a0a(editorContext, node));
    editorCell.addEditorCell(this.createCollection_4n0rw6_b0a(editorContext, node));
    return editorCell;
  }

  private static boolean renderingCondition_4n0rw6_a0a(SNode node, EditorContext editorContext, IScope scope) {
    return !(SPropertyOperations.getBoolean(node, "isComplex"));
  }

  private EditorCell createConstant_4n0rw6_a0a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "for concepts:");
    editorCell.setCellId("Constant_4n0rw6_a0a");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createCollection_4n0rw6_b0a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_4n0rw6_b0a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(this.createIndentCell_4n0rw6_a1a0(editorContext, node));
    editorCell.addEditorCell(this.createRefNodeList_4n0rw6_b1a0(editorContext, node));
    return editorCell;
  }

  private EditorCell createIndentCell_4n0rw6_a1a0(EditorContext editorContext, SNode node) {
    EditorCell_Indent editorCell = new EditorCell_Indent(editorContext, node);
    return editorCell;
  }

  private EditorCell createRefNodeList_4n0rw6_b1a0(EditorContext editorContext, SNode node) {
    AbstractCellListHandler handler = new BreakpointableNodeItem_Editor.conceptsToCreateBreakpointListHandler_4n0rw6_b1a0(node, "conceptsToCreateBreakpoint", editorContext);
    EditorCell_Collection editorCell = handler.createCells(editorContext, new CellLayout_Vertical(), false);
    editorCell.setCellId("refNodeList_conceptsToCreateBreakpoint");
    editorCell.setRole(handler.getElementRole());
    return editorCell;
  }

  private static class conceptsToCreateBreakpointListHandler_4n0rw6_b1a0 extends RefNodeListHandler {
    public conceptsToCreateBreakpointListHandler_4n0rw6_b1a0(SNode ownerNode, String childRole, EditorContext context) {
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

  private EditorCell createCollection_4n0rw6_b0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_4n0rw6_b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(this.createConstant_4n0rw6_a1a(editorContext, node));
    editorCell.addEditorCell(this.createCollection_4n0rw6_b1a(editorContext, node));
    return editorCell;
  }

  private static boolean renderingCondition_4n0rw6_a1a(SNode node, EditorContext editorContext, IScope scope) {
    return SPropertyOperations.getBoolean(node, "isComplex");
  }

  private EditorCell createConstant_4n0rw6_a1a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "filter concepts:");
    editorCell.setCellId("Constant_4n0rw6_a1a");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createCollection_4n0rw6_b1a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_4n0rw6_b1a");
    editorCell.addEditorCell(this.createIndentCell_4n0rw6_a1b0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_4n0rw6_b1b0(editorContext, node));
    return editorCell;
  }

  private EditorCell createIndentCell_4n0rw6_a1b0(EditorContext editorContext, SNode node) {
    EditorCell_Indent editorCell = new EditorCell_Indent(editorContext, node);
    return editorCell;
  }

  private EditorCell createRefNode_4n0rw6_b1b0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("isApplicable");
    provider.setNoTargetText("<no isApplicable>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    if (editorCell.getRole() == null) {
      editorCell.setRole("isApplicable");
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

  private EditorCell createConstant_4n0rw6_c0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "create breakpoint:");
    editorCell.setCellId("Constant_4n0rw6_c0");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createCollection_4n0rw6_d0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_4n0rw6_d0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(this.createIndentCell_4n0rw6_a3a(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_4n0rw6_b3a(editorContext, node));
    return editorCell;
  }

  private EditorCell createIndentCell_4n0rw6_a3a(EditorContext editorContext, SNode node) {
    EditorCell_Indent editorCell = new EditorCell_Indent(editorContext, node);
    return editorCell;
  }

  private EditorCell createRefNode_4n0rw6_b3a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("createBreakpoint");
    provider.setNoTargetText("<no createBreakpoint>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    if (editorCell.getRole() == null) {
      editorCell.setRole("createBreakpoint");
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
