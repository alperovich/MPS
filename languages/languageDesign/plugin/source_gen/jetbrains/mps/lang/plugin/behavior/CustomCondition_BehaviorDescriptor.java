package jetbrains.mps.lang.plugin.behavior;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.behavior.ConceptFunction_BehaviorDescriptor;
import java.util.List;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.language.SConcept;

public class CustomCondition_BehaviorDescriptor extends ConceptFunction_BehaviorDescriptor implements ActionParameterCondition_BehaviorDescriptor {
  public CustomCondition_BehaviorDescriptor() {
  }

  public List<SNode> virtual_getApplicableConceptFunctionParameter_3044950653914717136(SConcept thisConcept) {
    return CustomCondition_Behavior.virtual_getApplicableConceptFunctionParameter_3044950653914717136(thisConcept);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.lang.plugin.structure.CustomCondition";
  }
}
