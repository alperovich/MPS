package jetbrains.mps.lang.typesystem.behavior;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.behavior.Type_BehaviorDescriptor;
import jetbrains.mps.lang.core.behavior.INamedConcept_BehaviorDescriptor;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;

public class RuntimeTypeVariable_BehaviorDescriptor extends Type_BehaviorDescriptor implements INamedConcept_BehaviorDescriptor {
  public RuntimeTypeVariable_BehaviorDescriptor() {
  }

  public String virtual_getFqName_1213877404258(SNode thisNode) {
    return INamedConcept_Behavior.virtual_getFqName_1213877404258(thisNode);
  }

  public String virtual_getPresentation_1213877396640(SNode thisNode) {
    return RuntimeTypeVariable_Behavior.virtual_getPresentation_1213877396640(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.lang.typesystem.structure.RuntimeTypeVariable";
  }
}
