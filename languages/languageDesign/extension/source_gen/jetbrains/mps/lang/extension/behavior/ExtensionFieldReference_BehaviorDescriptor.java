package jetbrains.mps.lang.extension.behavior;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.behavior.Expression_BehaviorDescriptor;
import org.jetbrains.mps.openapi.language.SConcept;

public class ExtensionFieldReference_BehaviorDescriptor extends Expression_BehaviorDescriptor {
  public ExtensionFieldReference_BehaviorDescriptor() {
  }

  public boolean virtual_lvalue_1262430001741497939(SConcept thisConcept) {
    return ExtensionFieldReference_Behavior.virtual_lvalue_1262430001741497939(thisConcept);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.lang.extension.structure.ExtensionFieldReference";
  }
}
