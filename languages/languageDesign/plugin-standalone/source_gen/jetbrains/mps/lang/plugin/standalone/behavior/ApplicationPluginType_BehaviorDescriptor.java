package jetbrains.mps.lang.plugin.standalone.behavior;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.classifiers.behavior.BaseClassifierType_BehaviorDescriptor;
import java.util.List;
import org.jetbrains.mps.openapi.model.SNode;

public class ApplicationPluginType_BehaviorDescriptor extends BaseClassifierType_BehaviorDescriptor {
  public ApplicationPluginType_BehaviorDescriptor() {
  }

  public List<SNode> virtual_getMembers_1213877402148(SNode thisNode, SNode contextNode) {
    return ApplicationPluginType_Behavior.virtual_getMembers_1213877402148(thisNode, contextNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.lang.plugin.standalone.structure.ApplicationPluginType";
  }
}
