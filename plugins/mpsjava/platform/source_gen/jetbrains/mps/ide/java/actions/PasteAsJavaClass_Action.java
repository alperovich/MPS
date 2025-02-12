package jetbrains.mps.ide.java.actions;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import javax.swing.Icon;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.smodel.SModelOperations;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.ide.java.util.JavaPaster;
import org.jetbrains.annotations.NotNull;
import org.apache.log4j.Priority;
import jetbrains.mps.ide.actions.MPSCommonDataKeys;
import org.jetbrains.mps.openapi.model.EditableSModel;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.project.MPSProject;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class PasteAsJavaClass_Action extends BaseAction {
  private static final Icon ICON = null;

  public PasteAsJavaClass_Action() {
    super("Paste as Java Class", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @Override
  public boolean isDumbAware() {
    return true;
  }

  public boolean isApplicable(AnActionEvent event, final Map<String, Object> _params) {
    SModel m = ((SModel) MapSequence.fromMap(_params).get("model"));
    return m != null && SModelOperations.hasLanguage(m, PersistenceFacade.getInstance().createModuleReference("f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)")) && JavaPaster.areDataAvailableInClipboard();
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      {
        boolean enabled = this.isApplicable(event, _params);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action doUpdate method failed. Action:" + "PasteAsJavaClass", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    MapSequence.fromMap(_params).put("operationContext", event.getData(MPSCommonDataKeys.OPERATION_CONTEXT));
    if (MapSequence.fromMap(_params).get("operationContext") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("model", event.getData(MPSCommonDataKeys.MODEL));
    if (MapSequence.fromMap(_params).get("model") == null) {
      return false;
    }
    if (!(MapSequence.fromMap(_params).get("model") instanceof EditableSModel) || ((EditableSModel) MapSequence.fromMap(_params).get("model")).isReadOnly()) {
      return false;
    }
    MapSequence.fromMap(_params).put("mpsProject", event.getData(MPSCommonDataKeys.MPS_PROJECT));
    if (MapSequence.fromMap(_params).get("mpsProject") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      new JavaPaster().pasteJavaAsClass(((SModel) MapSequence.fromMap(_params).get("model")), ((IOperationContext) MapSequence.fromMap(_params).get("operationContext")), ((MPSProject) MapSequence.fromMap(_params).get("mpsProject")));
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action execute method failed. Action:" + "PasteAsJavaClass", t);
      }
    }
  }

  protected static Logger LOG = LogManager.getLogger(PasteAsJavaClass_Action.class);
}
