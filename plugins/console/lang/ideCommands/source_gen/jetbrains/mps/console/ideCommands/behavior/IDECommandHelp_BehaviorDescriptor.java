package jetbrains.mps.console.ideCommands.behavior;

/*Generated by MPS */

import jetbrains.mps.lang.core.behavior.BaseConcept_BehaviorDescriptor;
import jetbrains.mps.console.base.behavior.ConsoleHelpProvider_BehaviorDescriptor;
import org.jetbrains.mps.openapi.language.SConcept;

public abstract class IDECommandHelp_BehaviorDescriptor extends BaseConcept_BehaviorDescriptor implements ConsoleHelpProvider_BehaviorDescriptor {
  public IDECommandHelp_BehaviorDescriptor() {
  }

  public String virtual_getHelp_473081947982699339(SConcept thisConcept) {
    return IDECommandHelp_Behavior.virtual_getHelp_473081947982699339(thisConcept);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.console.ideCommands.structure.IDECommandHelp";
  }
}
