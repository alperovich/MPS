package jetbrains.mps.lang.plugin.behavior;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.behavior.FieldDeclaration_BehaviorDescriptor;
import jetbrains.mps.baseLanguage.classifiers.behavior.IMember_BehaviorDescriptor;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.baseLanguage.classifiers.behavior.IMember_Behavior;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;
import java.util.List;
import org.jetbrains.mps.openapi.language.SConcept;

public class ActionParameterDeclaration_BehaviorDescriptor extends FieldDeclaration_BehaviorDescriptor implements IMember_BehaviorDescriptor, ActionParameter_BehaviorDescriptor {
  public ActionParameterDeclaration_BehaviorDescriptor() {
  }

  public boolean virtual_canBeReferent_8179323502814657526(SNode thisNode, SNode referentConcept) {
    return IMember_Behavior.virtual_canBeReferent_8179323502814657526(thisNode, referentConcept);
  }

  public boolean virtual_canOperationBeChild_4593153787954614840(SNode thisNode, SNode parentNode) {
    return IMember_Behavior.virtual_canOperationBeChild_4593153787954614840(thisNode, parentNode);
  }

  public SNode virtual_createOperation_1213877353000(SNode thisNode) {
    return IMember_Behavior.virtual_createOperation_1213877353000(thisNode);
  }

  public SNode virtual_getFieldDeclaration_1171743928471867409(SNode thisNode) {
    return ActionParameterDeclaration_Behavior.virtual_getFieldDeclaration_1171743928471867409(thisNode);
  }

  public String virtual_getFqName_1213877404258(SNode thisNode) {
    return INamedConcept_Behavior.virtual_getFqName_1213877404258(thisNode);
  }

  public SNode virtual_getOperationConcept_1213877352972(SNode thisNode) {
    return IMember_Behavior.virtual_getOperationConcept_1213877352972(thisNode);
  }

  public List<SNode> virtual_getOperationConcept_3044950653914717125(SConcept thisConcept) {
    return ActionParameterDeclaration_Behavior.virtual_getOperationConcept_3044950653914717125(thisConcept);
  }

  public SNode virtual_getType_1171743928471337193(SNode thisNode) {
    return ActionParameterDeclaration_Behavior.virtual_getType_1171743928471337193(thisNode);
  }

  public SNode virtual_getVisiblity_1213877352965(SNode thisNode) {
    return IMember_Behavior.virtual_getVisiblity_1213877352965(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.lang.plugin.structure.ActionParameterDeclaration";
  }
}
