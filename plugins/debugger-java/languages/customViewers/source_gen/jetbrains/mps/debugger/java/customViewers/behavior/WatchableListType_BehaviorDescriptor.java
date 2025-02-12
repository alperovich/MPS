package jetbrains.mps.debugger.java.customViewers.behavior;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.behavior.Type_BehaviorDescriptor;
import jetbrains.mps.baseLanguage.behavior.IGenericType_BehaviorDescriptor;
import org.jetbrains.mps.openapi.model.SNode;
import java.util.Map;
import java.util.List;
import jetbrains.mps.baseLanguage.behavior.IGenericType_Behavior;

public class WatchableListType_BehaviorDescriptor extends Type_BehaviorDescriptor implements IGenericType_BehaviorDescriptor {
  public WatchableListType_BehaviorDescriptor() {
  }

  public void virtual_collectGenericSubstitutions_4107091686347010321(SNode thisNode, Map<SNode, SNode> substitutions) {
    WatchableListType_Behavior.virtual_collectGenericSubstitutions_4107091686347010321(thisNode, substitutions);
  }

  public SNode virtual_expandGenericDescendants_4107091686347838550(SNode thisNode, SNode expanded, Map<SNode, SNode> substitutions, List<SNode> expTrace) {
    return IGenericType_Behavior.virtual_expandGenericDescendants_4107091686347838550(thisNode, expanded, substitutions, expTrace);
  }

  public SNode virtual_expandGenerics_4107091686347199582(SNode thisNode, Map<SNode, SNode> substitutions) {
    return IGenericType_Behavior.virtual_expandGenerics_4107091686347199582(thisNode, substitutions);
  }

  public SNode virtual_expandGenerics_4122274986016348613(SNode thisNode, Map<SNode, SNode> substitutions, List<SNode> expTrace) {
    return IGenericType_Behavior.virtual_expandGenerics_4122274986016348613(thisNode, substitutions, expTrace);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.debugger.java.customViewers.structure.WatchableListType";
  }
}
