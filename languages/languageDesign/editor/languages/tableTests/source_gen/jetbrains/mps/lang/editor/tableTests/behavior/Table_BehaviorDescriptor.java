package jetbrains.mps.lang.editor.tableTests.behavior;

/*Generated by MPS */

import jetbrains.mps.lang.core.behavior.BaseConcept_BehaviorDescriptor;
import jetbrains.mps.lang.core.behavior.INamedConcept_BehaviorDescriptor;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;
import org.jetbrains.mps.openapi.language.SConcept;

public class Table_BehaviorDescriptor extends BaseConcept_BehaviorDescriptor implements INamedConcept_BehaviorDescriptor {
  public Table_BehaviorDescriptor() {
  }

  public String virtual_getFqName_1213877404258(SNode thisNode) {
    return INamedConcept_Behavior.virtual_getFqName_1213877404258(thisNode);
  }

  public int virtual_getInitialColumnCount_1262430001741498026(SConcept thisConcept) {
    return Table_Behavior.virtual_getInitialColumnCount_1262430001741498026(thisConcept);
  }

  public int virtual_getInitialRowCount_1262430001741498094(SConcept thisConcept) {
    return Table_Behavior.virtual_getInitialRowCount_1262430001741498094(thisConcept);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.lang.editor.tableTests.structure.Table";
  }
}
