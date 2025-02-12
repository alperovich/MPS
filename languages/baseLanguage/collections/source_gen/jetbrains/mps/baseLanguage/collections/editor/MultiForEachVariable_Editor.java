package jetbrains.mps.baseLanguage.collections.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPartExt;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_PropertyPostfixHints;
import java.util.List;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;

public class MultiForEachVariable_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_bqabhr_a(editorContext, node);
  }

  private EditorCell createCollection_bqabhr_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_bqabhr_a");
    editorCell.setBig(true);
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(this.createProperty_bqabhr_a0(editorContext, node));
    return editorCell;
  }

  private EditorCell createProperty_bqabhr_a0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_name");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(editorContext, provider.getCellContext(), new SubstituteInfoPartExt[]{new MultiForEachVariable_Editor.MultiForEachVariable_name_postfixCellMenu_bqabhr_a0a0()}));
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  public static class MultiForEachVariable_name_postfixCellMenu_bqabhr_a0a0 extends AbstractCellMenuPart_PropertyPostfixHints {
    public MultiForEachVariable_name_postfixCellMenu_bqabhr_a0a0() {
    }

    public List<String> getPostfixes(SNode node, IScope scope, IOperationContext operationContext, EditorContext editorContext) {
      List<String> postfixes = ListSequence.fromList(new ArrayList<String>());
      if (SNodeOperations.isInstanceOf(TypeChecker.getInstance().getTypeOf(node), "jetbrains.mps.baseLanguage.structure.Type")) {
        ListSequence.fromList(postfixes).addSequence(ListSequence.fromList(BehaviorReflection.invokeVirtual((Class<List<String>>) ((Class) Object.class), SNodeOperations.cast(TypeChecker.getInstance().getTypeOf(node), "jetbrains.mps.baseLanguage.structure.Type"), "virtual_getVariableSuffixes_1213877337304", new Object[]{})));
      }
      return postfixes;
    }
  }
}
