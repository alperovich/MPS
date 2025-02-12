package jetbrains.mps.ide.editor.actions;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import javax.swing.Icon;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.apache.log4j.Priority;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import jetbrains.mps.ide.editor.MPSEditorDataKeys;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.openapi.editor.Editor;
import java.util.Set;
import jetbrains.mps.nodeEditor.hintsSettings.ConceptEditorHintSettings;
import jetbrains.mps.nodeEditor.hintsSettings.ConceptEditorHintSettingsComponent;
import com.intellij.openapi.project.Project;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditorHint;
import jetbrains.mps.nodeEditor.hintsSettings.ConceptEditorHintPreferencesPage;
import com.intellij.openapi.ui.DialogWrapper;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class PushEditorHints_Action extends BaseAction {
  private static final Icon ICON = null;

  public PushEditorHints_Action() {
    super("Push Editor Hints", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  @Override
  public boolean isDumbAware() {
    return true;
  }

  public boolean isApplicable(AnActionEvent event, final Map<String, Object> _params) {
    return true;
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      {
        boolean enabled = this.isApplicable(event, _params);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action doUpdate method failed. Action:" + "PushEditorHints", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    MapSequence.fromMap(_params).put("project", event.getData(PlatformDataKeys.PROJECT));
    if (MapSequence.fromMap(_params).get("project") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("editor", event.getData(MPSEditorDataKeys.MPS_EDITOR));
    if (MapSequence.fromMap(_params).get("editor") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      EditorComponent component = ((EditorComponent) ((Editor) MapSequence.fromMap(_params).get("editor")).getCurrentEditorComponent());
      if (component == null) {
        return;
      }
      Set<String> enabledHints = component.getEnabledHints();
      ConceptEditorHintSettings settings = new ConceptEditorHintSettings();
      settings.putAll(ConceptEditorHintSettingsComponent.getInstance(((Project) MapSequence.fromMap(_params).get("project"))).getSettings());
      for (String lang : SetSequence.fromSet(settings.getLanguagesNames())) {
        for (ConceptEditorHint hint : SetSequence.fromSet(settings.getHints(lang))) {
          settings.put(lang, hint, false);
        }
      }
      settings.updateSettings(enabledHints);
      final ConceptEditorHintPreferencesPage page = new ConceptEditorHintPreferencesPage(settings);
      DialogWrapper dialog = new HintsDialog(((Project) MapSequence.fromMap(_params).get("project")), page, settings, component);
      dialog.show();
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action execute method failed. Action:" + "PushEditorHints", t);
      }
    }
  }

  protected static Logger LOG = LogManager.getLogger(PushEditorHints_Action.class);
}
