package jetbrains.mps.baseLanguage.builders.behavior;

/*Generated by MPS */

import jetbrains.mps.lang.core.behavior.IDontSubstituteByDefault_BehaviorDescriptor;
import org.jetbrains.mps.openapi.model.SNode;

public class AsTypeBuilder_BehaviorDescriptor extends Builder_BehaviorDescriptor implements IDontSubstituteByDefault_BehaviorDescriptor {
  public AsTypeBuilder_BehaviorDescriptor() {
  }

  public SNode virtual_getCreatorExpression_7057666463730727863(SNode thisNode, SNode parentRef) {
    return AsTypeBuilder_Behavior.virtual_getCreatorExpression_7057666463730727863(thisNode, parentRef);
  }

  public SNode virtual_getResultType_7057666463730718251(SNode thisNode) {
    return AsTypeBuilder_Behavior.virtual_getResultType_7057666463730718251(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.baseLanguage.builders.structure.AsTypeBuilder";
  }
}
