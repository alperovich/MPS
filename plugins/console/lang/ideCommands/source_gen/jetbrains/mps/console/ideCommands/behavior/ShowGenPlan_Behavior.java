package jetbrains.mps.console.ideCommands.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.console.tool.ConsoleContext;
import jetbrains.mps.console.tool.ConsoleStream;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.console.ideCommands.util.PartitioningHelper;
import jetbrains.mps.ide.project.ProjectHelper;
import jetbrains.mps.internal.collections.runtime.Sequence;
import org.jetbrains.mps.openapi.model.SModel;

public class ShowGenPlan_Behavior {
  public static void init(SNode thisNode) {
  }

  public static void virtual_doExecute_3321948346081469500(SNode thisNode, ConsoleContext context, ConsoleStream console) {
    if (ModelReference_Behavior.call_getModel_7057947030098579394(SLinkOperations.getTarget(thisNode, "targetModel", true)) == null) {
      return;
    }
    PartitioningHelper.showMappingPartitioning(ProjectHelper.toIdeaProject(context.getProject()), Sequence.fromIterable(Sequence.<SModel>singleton(ModelReference_Behavior.call_getModel_7057947030098579394(SLinkOperations.getTarget(thisNode, "targetModel", true)))).toListSequence(), console);
  }
}
