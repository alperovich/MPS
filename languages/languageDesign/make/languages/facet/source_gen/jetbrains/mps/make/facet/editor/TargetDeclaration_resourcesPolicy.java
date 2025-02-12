package jetbrains.mps.make.facet.editor;

/*Generated by MPS */

import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuComponent;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPartExt;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_Generic_Group;
import java.util.List;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SEnumOperations;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class TargetDeclaration_resourcesPolicy extends AbstractCellMenuComponent {
  public TargetDeclaration_resourcesPolicy() {
    super(new SubstituteInfoPartExt[]{new TargetDeclaration_resourcesPolicy.TargetDeclaration_generic_cellMenu_2gyyww_a0()});
  }

  public static class TargetDeclaration_generic_cellMenu_2gyyww_a0 extends AbstractCellMenuPart_Generic_Group {
    public TargetDeclaration_generic_cellMenu_2gyyww_a0() {
    }

    public List<?> createParameterObjects(SNode node, IScope scope, IOperationContext operationContext, EditorContext editorContext) {
      return SEnumOperations.getEnumMembers(SEnumOperations.getEnum("r:b16ff46d-fa06-479d-9f5c-5b6e17e7f1b2(jetbrains.mps.make.facet.structure)", "ResourcesPolicy"));
    }

    protected void handleAction(Object parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext, EditorContext editorContext) {
      this.handleAction_impl((SNode) parameterObject, node, model, scope, operationContext, editorContext);
    }

    public void handleAction_impl(SNode parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext, EditorContext editorContext) {
      SPropertyOperations.set(node, "resourcesPolicy", SEnumOperations.getEnumMemberValue(parameterObject));
    }

    public boolean isReferentPresentation() {
      return false;
    }
  }
}
