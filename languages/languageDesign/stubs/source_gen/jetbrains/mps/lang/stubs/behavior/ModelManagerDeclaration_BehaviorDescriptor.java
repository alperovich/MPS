package jetbrains.mps.lang.stubs.behavior;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.classifiers.behavior.DefaultClassifier_BehaviorDescriptor;
import jetbrains.mps.baseLanguage.classifiers.behavior.IClassifier_BehaviorDescriptor;
import org.jetbrains.mps.openapi.model.SNode;

public class ModelManagerDeclaration_BehaviorDescriptor extends DefaultClassifier_BehaviorDescriptor implements IClassifier_BehaviorDescriptor {
  public ModelManagerDeclaration_BehaviorDescriptor() {
  }

  public SNode virtual_createType_1213877527970(SNode thisNode) {
    return ModelManagerDeclaration_Behavior.virtual_createType_1213877527970(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.lang.stubs.structure.ModelManagerDeclaration";
  }
}
