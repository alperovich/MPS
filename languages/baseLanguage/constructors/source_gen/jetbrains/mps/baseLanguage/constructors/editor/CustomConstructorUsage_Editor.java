package jetbrains.mps.baseLanguage.constructors.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.ModelAccessor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.cells.EmptyCellAction;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandlerElementKeyMap;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Indent;

public class CustomConstructorUsage_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_pubti2_a(editorContext, node);
  }

  private EditorCell createCollection_pubti2_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_pubti2_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createModelAccess_pubti2_a0(editorContext, node));
    editorCell.addEditorCell(this.createCustom_pubti2_b0(editorContext, node));
    editorCell.addEditorCell(this.createModelAccess_pubti2_c0(editorContext, node));
    return editorCell;
  }

  private EditorCell createModelAccess_pubti2_a0(final EditorContext editorContext, final SNode node) {
    ModelAccessor modelAccessor = new ModelAccessor() {
      public String getText() {
        return SPropertyOperations.getString(SLinkOperations.getTarget(node, "customConstructor", false), "leftParenthesis");
      }

      public void setText(String text) {
      }

      public boolean isValidText(String text) {
        return true;
      }
    };
    EditorCell_Property editorCell = EditorCell_Property.create(editorContext, modelAccessor, node);
    editorCell.setAction(CellActionType.DELETE, EmptyCellAction.getInstance());
    editorCell.setCellId("ModelAccess_pubti2_a0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.EDITABLE, false);
    style.set(StyleAttributes.PUNCTUATION_RIGHT, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createCustom_pubti2_b0(final EditorContext editorContext, final SNode node) {
    AbstractCellProvider provider = new _FunctionTypes._return_P0_E0<AbstractCellProvider>() {
      public AbstractCellProvider invoke() {
        return new AbstractCellProvider() {
          @Override
          public EditorCell createEditorCell(EditorContext editorContext) {
            RefNodeListHandler handler = new RefNodeListHandler(node, "element", editorContext) {
              @Override
              public SNode createNodeToInsert(EditorContext p0) {
                return SNodeFactoryOperations.createNewNode("jetbrains.mps.baseLanguage.structure.Expression", null);
              }

              @Override
              public EditorCell createNodeCell(EditorContext editorContext, SNode elementNode) {
                EditorCell elementCell = super.createNodeCell(editorContext, elementNode);
                this.installElementCellActions(this.getOwner(), elementNode, elementCell, editorContext);
                return elementCell;
              }

              @Override
              public EditorCell createEmptyCell(EditorContext editorContext) {
                EditorCell emptyCell = super.createEmptyCell(editorContext);
                this.installElementCellActions(this.getOwner(), null, emptyCell, editorContext);
                return emptyCell;
              }

              public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext editorContext) {
                if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
                  elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
                  if (elementNode != null) {
                    elementCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(elementNode));
                    elementCell.addKeyMap(new RefNodeListHandlerElementKeyMap(this, SPropertyOperations.getString(SLinkOperations.getTarget(node, "customConstructor", false), "separator")));
                  }
                  if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
                    elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), editorContext));
                  }
                }
              }

              public EditorCell createSeparatorCell(EditorContext editorContext) {
                EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, this.getOwner(), SPropertyOperations.getString(SLinkOperations.getTarget(node, "customConstructor", false), "separator"));
                editorCell.setSelectable(false);
                editorCell.getStyle().set(StyleAttributes.LAYOUT_CONSTRAINT, "");
                editorCell.getStyle().set(StyleAttributes.PUNCTUATION_LEFT, true);
                return editorCell;
              }
            };

            return handler.createCells(editorContext, new CellLayout_Indent());
          }
        };
      }
    }.invoke();
    EditorCell editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("Custom_pubti2_b0");
    return editorCell;
  }

  private EditorCell createModelAccess_pubti2_c0(final EditorContext editorContext, final SNode node) {
    ModelAccessor modelAccessor = new ModelAccessor() {
      public String getText() {
        return SPropertyOperations.getString(SLinkOperations.getTarget(node, "customConstructor", false), "rightParenthesis");
      }

      public void setText(String text) {
      }

      public boolean isValidText(String text) {
        return true;
      }
    };
    EditorCell_Property editorCell = EditorCell_Property.create(editorContext, modelAccessor, node);
    editorCell.setAction(CellActionType.DELETE, EmptyCellAction.getInstance());
    editorCell.setCellId("ModelAccess_pubti2_c0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.EDITABLE, false);
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
}
