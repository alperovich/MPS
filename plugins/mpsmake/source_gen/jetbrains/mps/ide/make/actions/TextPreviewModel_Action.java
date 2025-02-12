package jetbrains.mps.ide.make.actions;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import javax.swing.Icon;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.make.IMakeService;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.annotations.NotNull;
import org.apache.log4j.Priority;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.ide.actions.MPSCommonDataKeys;
import jetbrains.mps.make.MakeSession;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.ide.make.TextPreviewUtil;
import org.jetbrains.mps.openapi.model.SNode;
import java.util.List;
import jetbrains.mps.smodel.SModelStereotype;
import org.jetbrains.mps.openapi.model.EditableSModel;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class TextPreviewModel_Action extends BaseAction {
  private static final Icon ICON = null;

  public TextPreviewModel_Action() {
    super("Preview Generated Text", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  @Override
  public boolean isDumbAware() {
    return true;
  }

  public boolean isApplicable(AnActionEvent event, final Map<String, Object> _params) {
    if (IMakeService.INSTANCE.get().isSessionActive()) {
      return false;
    }
    SModel md = TextPreviewModel_Action.this.modelToGenerate(_params);
    return md != null && TextPreviewModel_Action.this.isUserEditableModel(md, _params);
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      {
        boolean enabled = this.isApplicable(event, _params);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action doUpdate method failed. Action:" + "TextPreviewModel", t);
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
    MapSequence.fromMap(_params).put("cnode", event.getData(MPSCommonDataKeys.NODE));
    MapSequence.fromMap(_params).put("cmodel", event.getData(MPSCommonDataKeys.CONTEXT_MODEL));
    if (MapSequence.fromMap(_params).get("cmodel") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("models", event.getData(MPSCommonDataKeys.MODELS));
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      MakeSession session = new MakeSession(((IOperationContext) MapSequence.fromMap(_params).get("context")), null, true);
      if (IMakeService.INSTANCE.get().openNewSession(session)) {
        TextPreviewUtil.previewModelText(session, ((IOperationContext) MapSequence.fromMap(_params).get("context")), TextPreviewModel_Action.this.modelToGenerate(_params), ((SNode) MapSequence.fromMap(_params).get("cnode")));
      }
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action execute method failed. Action:" + "TextPreviewModel", t);
      }
    }
  }

  private SModel modelToGenerate(final Map<String, Object> _params) {
    SModel md = null;
    if (((SModel) MapSequence.fromMap(_params).get("cmodel")) != null) {
      md = ((SModel) MapSequence.fromMap(_params).get("cmodel"));
    } else if (((List<SModel>) MapSequence.fromMap(_params).get("models")) != null && ((List<SModel>) MapSequence.fromMap(_params).get("models")).size() > 0) {
      md = ((List<SModel>) MapSequence.fromMap(_params).get("models")).get(0);
    }
    return md;
  }

  private boolean isUserEditableModel(SModel md, final Map<String, Object> _params) {
    // TODO SModelDescriptor cast 
    if (!(SModelStereotype.isUserModel(md))) {
      return false;
    }
    return md instanceof EditableSModel && !(md.isReadOnly());
  }

  protected static Logger LOG = LogManager.getLogger(TextPreviewModel_Action.class);
}
