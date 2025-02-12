package jetbrains.mps.vcs.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.actions.GeneratedActionGroup;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class ModuleVcsActions_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = LogManager.getLogger(ModuleVcsActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.vcs.plugin.ModuleVcsActions_ActionGroup";

  public ModuleVcsActions_ActionGroup() {
    super("ModuleVcsActions", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      ModuleVcsActions_ActionGroup.this.addAction("jetbrains.mps.vcs.plugin.AddModuleToVcs_Action");
      ModuleVcsActions_ActionGroup.this.addAction("jetbrains.mps.vcs.plugin.IgnoreModuleInVcs_Action");
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
