package jetbrains.mps.console.ideCommands.behavior;

/*Generated by MPS */

import jetbrains.mps.lang.core.behavior.BaseConcept_BehaviorDescriptor;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.console.tool.ConsoleContext;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;

public class SubtreeStatisticsTarget_BehaviorDescriptor extends BaseConcept_BehaviorDescriptor implements IStatisticsTarget_BehaviorDescriptor, INodeSetReference_BehaviorDescriptor {
  public SubtreeStatisticsTarget_BehaviorDescriptor() {
  }

  public Iterable<SNode> virtual_getNodes_5207260697411458163(SNode thisNode, ConsoleContext context) {
    return SubtreeStatisticsTarget_Behavior.virtual_getNodes_5207260697411458163(thisNode, context);
  }

  public Iterable<Tuples._2<String, Integer>> virtual_getStat_7490254719527247609(SNode thisNode, ConsoleContext context) {
    return SubtreeStatisticsTarget_Behavior.virtual_getStat_7490254719527247609(thisNode, context);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.console.ideCommands.structure.SubtreeStatisticsTarget";
  }
}
