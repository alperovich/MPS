package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.actions.GeneratedActionGroup;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import jetbrains.mps.plugins.actions.LabelledAnchor;
import com.intellij.openapi.actionSystem.ex.ActionManagerEx;
import com.intellij.openapi.extensions.PluginId;

public class ProjectNewActions_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = LogManager.getLogger(ProjectNewActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.ProjectNewActions_ActionGroup";
  public static final String LABEL_ID_end = ID + "end";

  public ProjectNewActions_ActionGroup() {
    super("New", ID);
    this.setIsInternal(false);
    this.setPopup(true);
    try {
      ProjectNewActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.NewSolution_Action");
      {
        LabelledAnchor action = new LabelledAnchor(ProjectNewActions_ActionGroup.LABEL_ID_end);
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        manager.registerAction(action.getId(), action, PluginId.getId("jetbrains.mps.ide"));
        ProjectNewActions_ActionGroup.this.addAction(action);
      }
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
