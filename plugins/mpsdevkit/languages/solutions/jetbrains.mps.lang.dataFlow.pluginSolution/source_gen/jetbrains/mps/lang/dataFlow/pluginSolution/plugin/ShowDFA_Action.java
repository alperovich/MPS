package jetbrains.mps.lang.dataFlow.pluginSolution.plugin;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import javax.swing.Icon;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import org.apache.log4j.Priority;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.ide.actions.MPSCommonDataKeys;
import org.jetbrains.mps.openapi.model.SNode;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.lang.dataFlow.framework.Program;
import jetbrains.mps.ide.dataFlow.presentation.ControlFlowGraph;
import jetbrains.mps.ide.dataFlow.presentation.InstructionWrapper;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.lang.dataFlow.DataFlowManager;
import jetbrains.mps.ide.dataFlow.presentation.ProgramWrapper;
import jetbrains.mps.ide.dataFlow.presentation.GraphCreator;
import jetbrains.mps.ide.dataFlow.presentation.ShowCFGDialog;
import jetbrains.mps.smodel.IOperationContext;
import com.intellij.openapi.project.Project;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class ShowDFA_Action extends BaseAction {
  private static final Icon ICON = null;

  public ShowDFA_Action() {
    super("Show Data Flow Graph", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  @Override
  public boolean isDumbAware() {
    return true;
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action doUpdate method failed. Action:" + "ShowDFA", t);
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
    {
      SNode node = event.getData(MPSCommonDataKeys.NODE);
      if (node != null) {
      }
      MapSequence.fromMap(_params).put("node", node);
    }
    if (MapSequence.fromMap(_params).get("node") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("project", event.getData(PlatformDataKeys.PROJECT));
    if (MapSequence.fromMap(_params).get("project") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      final Wrappers._T<Program> program = new Wrappers._T<Program>();
      final Wrappers._T<ControlFlowGraph<InstructionWrapper>> graph = new Wrappers._T<ControlFlowGraph<InstructionWrapper>>();
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          program.value = DataFlowManager.getInstance().buildProgramFor(((SNode) MapSequence.fromMap(_params).get("node")));
          graph.value = new ControlFlowGraph<InstructionWrapper>(new ProgramWrapper(program.value), new GraphCreator());
        }
      });
      new ShowCFGDialog(graph.value, ((IOperationContext) MapSequence.fromMap(_params).get("context")), ((Project) MapSequence.fromMap(_params).get("project")), "Data Flow Graph").show();
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action execute method failed. Action:" + "ShowDFA", t);
      }
    }
  }

  protected static Logger LOG = LogManager.getLogger(ShowDFA_Action.class);
}
