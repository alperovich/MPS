package jetbrains.mps.ide.java.actions;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import javax.swing.Icon;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.baseLanguage.util.plugin.refactorings.MethodCallAdapter;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.nodeEditor.EditorComponent;
import org.jetbrains.annotations.NotNull;
import org.apache.log4j.Priority;
import jetbrains.mps.ide.actions.MPSCommonDataKeys;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import jetbrains.mps.ide.editor.MPSEditorDataKeys;
import com.intellij.featureStatistics.FeatureUsageTracker;
import jetbrains.mps.ide.java.platform.refactorings.InlineMethodDialog;
import com.intellij.openapi.project.Project;
import jetbrains.mps.smodel.IOperationContext;
import java.awt.Frame;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class InlineMethod_Action extends BaseAction {
  private static final Icon ICON = null;

  public InlineMethod_Action() {
    super("Inline Method", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  @Override
  public boolean isDumbAware() {
    return true;
  }

  public boolean isApplicable(AnActionEvent event, final Map<String, Object> _params) {
    final Wrappers._T<Boolean> b = new Wrappers._T<Boolean>(false);
    ((MPSProject) MapSequence.fromMap(_params).get("project")).getRepository().getModelAccess().runReadAction(new Runnable() {
      public void run() {
        b.value = MethodCallAdapter.isMethodCall(((SNode) MapSequence.fromMap(_params).get("node"))) || SNodeOperations.isInstanceOf(((SNode) MapSequence.fromMap(_params).get("node")), "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration");
      }
    });
    return b.value && !(((EditorComponent) MapSequence.fromMap(_params).get("editorComponent")).isReadOnly());
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      {
        boolean enabled = this.isApplicable(event, _params);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action doUpdate method failed. Action:" + "InlineMethod", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
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
    MapSequence.fromMap(_params).put("frame", event.getData(MPSCommonDataKeys.FRAME));
    if (MapSequence.fromMap(_params).get("frame") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("ideaProject", event.getData(PlatformDataKeys.PROJECT));
    if (MapSequence.fromMap(_params).get("ideaProject") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("operationContext", event.getData(MPSCommonDataKeys.OPERATION_CONTEXT));
    if (MapSequence.fromMap(_params).get("operationContext") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("editorComponent", event.getData(MPSEditorDataKeys.EDITOR_COMPONENT));
    if (MapSequence.fromMap(_params).get("editorComponent") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("project", event.getData(MPSCommonDataKeys.MPS_PROJECT));
    if (MapSequence.fromMap(_params).get("project") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      FeatureUsageTracker.getInstance().triggerFeatureUsed("refactoring.inline");
      InlineMethodDialog dialog = new InlineMethodDialog(((SNode) MapSequence.fromMap(_params).get("node")), ((Project) MapSequence.fromMap(_params).get("ideaProject")), ((IOperationContext) MapSequence.fromMap(_params).get("operationContext")));
      dialog.tryToShow(((Frame) MapSequence.fromMap(_params).get("frame")));
      dialog.pack();
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action execute method failed. Action:" + "InlineMethod", t);
      }
    }
  }

  protected static Logger LOG = LogManager.getLogger(InlineMethod_Action.class);
}
