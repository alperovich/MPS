package jetbrains.mps.lang.editor.behavior;

/*Generated by MPS */

import jetbrains.mps.lang.core.behavior.BaseConcept_BehaviorDescriptor;
import org.jetbrains.mps.openapi.model.SNode;

public class InlineStyleDeclaration_BehaviorDescriptor extends BaseConcept_BehaviorDescriptor implements IStyleContainer_BehaviorDescriptor {
  public InlineStyleDeclaration_BehaviorDescriptor() {
  }

  public SNode virtual_getParent_1219419981626(SNode thisNode) {
    return IStyleContainer_Behavior.virtual_getParent_1219419981626(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.lang.editor.structure.InlineStyleDeclaration";
  }
}
