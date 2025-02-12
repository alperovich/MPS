package jetbrains.mps.lang.plugin.editor;

/*Generated by MPS */

import jetbrains.mps.openapi.editor.descriptor.ConceptEditorComponent;
import java.util.Collection;
import java.util.Collections;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPartExt;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_PropertyPostfixHints;
import java.util.List;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class ActionParameter_NameCellComponent implements ConceptEditorComponent {
  public Collection<String> getContextHints() {
    return Collections.emptyList();
  }

  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createProperty_w0sqte_a(editorContext, node);
  }

  private EditorCell createProperty_w0sqte_a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_name");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(editorContext, provider.getCellContext(), new SubstituteInfoPartExt[]{new ActionParameter_NameCellComponent.ActionParameter_name_postfixCellMenu_w0sqte_a0a()}));
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  public static class ActionParameter_name_postfixCellMenu_w0sqte_a0a extends AbstractCellMenuPart_PropertyPostfixHints {
    public ActionParameter_name_postfixCellMenu_w0sqte_a0a() {
    }

    public List<String> getPostfixes(SNode node, IScope scope, IOperationContext operationContext, EditorContext editorContext) {
      List<String> result;
      SNode nodeType = BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), node, "virtual_getType_1171743928471337193", new Object[]{});
      if (nodeType != null) {
        result = BehaviorReflection.invokeVirtual((Class<List<String>>) ((Class) Object.class), nodeType, "virtual_getVariableSuffixes_1213877337304", new Object[]{});
      } else {
        result = ListSequence.fromList(new ArrayList<String>());
      }
      // we need this because of smart input 
      // DO NOT REMOVE IT 
      if (SPropertyOperations.getString(node, "name") != null) {
        ListSequence.fromList(result).addElement(SPropertyOperations.getString(node, "name"));
      }
      return result;
    }
  }
}
