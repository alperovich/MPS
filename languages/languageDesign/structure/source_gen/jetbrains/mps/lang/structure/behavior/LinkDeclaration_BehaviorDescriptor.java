package jetbrains.mps.lang.structure.behavior;

/*Generated by MPS */

import jetbrains.mps.lang.core.behavior.BaseConcept_BehaviorDescriptor;
import jetbrains.mps.lang.core.behavior.InterfacePart_BehaviorDescriptor;
import org.jetbrains.mps.openapi.model.SNode;

public class LinkDeclaration_BehaviorDescriptor extends BaseConcept_BehaviorDescriptor implements InterfacePart_BehaviorDescriptor, IStructureDeprecatable_BehaviorDescriptor {
  public LinkDeclaration_BehaviorDescriptor() {
  }

  public String virtual_getMessage_1225207468592(SNode thisNode) {
    return IStructureDeprecatable_Behavior.virtual_getMessage_1225207468592(thisNode);
  }

  public String virtual_getPresentation_1213877396640(SNode thisNode) {
    return LinkDeclaration_Behavior.virtual_getPresentation_1213877396640(thisNode);
  }

  public boolean virtual_isDeprecated_1224609060727(SNode thisNode) {
    return IStructureDeprecatable_Behavior.virtual_isDeprecated_1224609060727(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.lang.structure.structure.LinkDeclaration";
  }
}
