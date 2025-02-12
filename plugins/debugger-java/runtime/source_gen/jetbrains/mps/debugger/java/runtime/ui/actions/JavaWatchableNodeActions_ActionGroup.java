package jetbrains.mps.debugger.java.runtime.ui.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.actions.GeneratedActionGroup;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class JavaWatchableNodeActions_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = LogManager.getLogger(JavaWatchableNodeActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.debugger.java.runtime.ui.actions.JavaWatchableNodeActions_ActionGroup";

  public JavaWatchableNodeActions_ActionGroup() {
    super("JavaWatchableNodeActions", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      JavaWatchableNodeActions_ActionGroup.this.addAction("jetbrains.mps.debugger.java.runtime.ui.actions.CopyValueAction_Action");
      JavaWatchableNodeActions_ActionGroup.this.addAction("jetbrains.mps.debugger.java.runtime.ui.actions.CopyStackTraceToClipboard_Action");
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
