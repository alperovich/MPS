package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import javax.swing.Icon;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.apache.log4j.Priority;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.ide.editor.MPSEditorDataKeys;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.ide.hierarchy.BaseLanguageHierarchyViewTool;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.cells.APICellAdapter;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class ShowClassInHierarchy_Action extends BaseAction {
  private static final Icon ICON = null;

  public ShowClassInHierarchy_Action() {
    super("Show Class in Hierarchy", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @Override
  public boolean isDumbAware() {
    return true;
  }

  public boolean isApplicable(AnActionEvent event, final Map<String, Object> _params) {
    return (ShowClassInHierarchy_Action.this.getContextClassifier(_params) != null);
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      {
        boolean enabled = this.isApplicable(event, _params);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action doUpdate method failed. Action:" + "ShowClassInHierarchy", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    MapSequence.fromMap(_params).put("context", event.getData(MPSCommonDataKeys.OPERATION_CONTEXT));
    if (MapSequence.fromMap(_params).get("context") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("editorCell", event.getData(MPSEditorDataKeys.EDITOR_CELL));
    if (MapSequence.fromMap(_params).get("editorCell") == null) {
      return false;
    }
    {
      SNode node = event.getData(MPSCommonDataKeys.NODE);
      if (node != null) {
      }
      MapSequence.fromMap(_params).put("node", node);
    }
    if (MapSequence.fromMap(_params).get("node") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      SNode classNode = ShowClassInHierarchy_Action.this.getContextClassifier(_params);
      BaseLanguageHierarchyViewTool tool = ((IOperationContext) MapSequence.fromMap(_params).get("context")).getComponent(BaseLanguageHierarchyViewTool.class);
      tool.showItemInHierarchy(classNode, ((IOperationContext) MapSequence.fromMap(_params).get("context")));
      tool.openToolLater(true);
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action execute method failed. Action:" + "ShowClassInHierarchy", t);
      }
    }
  }

  private SNode getContextClassifier(final Map<String, Object> _params) {
    SNode refNode = APICellAdapter.getSNodeWRTReference(((EditorCell) MapSequence.fromMap(_params).get("editorCell")));
    if (SNodeOperations.isInstanceOf(refNode, "jetbrains.mps.baseLanguage.structure.Classifier")) {
      return SNodeOperations.cast(refNode, "jetbrains.mps.baseLanguage.structure.Classifier");
    }
    if (SNodeOperations.isInstanceOf(refNode, "jetbrains.mps.baseLanguage.structure.ConstructorDeclaration")) {
      SNode classifier = SNodeOperations.getAncestor(refNode, "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
      if (classifier != null) {
        return classifier;
      }
    }
    SNode outerClass = SNodeOperations.cast(SNodeOperations.getAncestorWhereConceptInList(((SNode) MapSequence.fromMap(_params).get("node")), new String[]{"jetbrains.mps.baseLanguage.structure.ClassConcept", "jetbrains.mps.baseLanguage.structure.Interface"}, true, false), "jetbrains.mps.baseLanguage.structure.Classifier");
    return outerClass;
  }

  protected static Logger LOG = LogManager.getLogger(ShowClassInHierarchy_Action.class);
}
