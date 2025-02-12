package jetbrains.mps.build.mps.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.runtime.CheckingNodeContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.smodel.SNodePointer;

public class BuildMps_Group_Constraints extends BaseConstraintsDescriptor {
  public BuildMps_Group_Constraints() {
    super("jetbrains.mps.build.mps.structure.BuildMps_Group");
  }

  @Override
  public boolean hasOwnCanBeChildMethod() {
    return true;
  }

  @Override
  public boolean canBeChild(@Nullable SNode node, SNode parentNode, SNode link, SNode childConcept, final IOperationContext operationContext, @Nullable final CheckingNodeContext checkingNodeContext) {
    boolean result = static_canBeAChild(node, parentNode, link, childConcept, operationContext);

    if (!(result) && checkingNodeContext != null) {
      checkingNodeContext.setBreakingNode(canBeChildBreakingPoint);
    }

    return result;
  }

  public static boolean static_canBeAChild(SNode node, SNode parentNode, SNode link, SNode childConcept, final IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(parentNode, "jetbrains.mps.build.structure.BuildProject") && ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(parentNode, "jetbrains.mps.build.structure.BuildProject"), "plugins", true)).any(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(it, "jetbrains.mps.build.mps.structure.BuildMPSPlugin");
      }
    }) || parentNode.getConcept().getQualifiedName().startsWith("jetbrains.mps.lang.generator");
  }

  private static SNodePointer canBeChildBreakingPoint = new SNodePointer("r:76dda237-5120-4688-b749-201ab5c5059d(jetbrains.mps.build.mps.constraints)", "7670275304420320782");
}
