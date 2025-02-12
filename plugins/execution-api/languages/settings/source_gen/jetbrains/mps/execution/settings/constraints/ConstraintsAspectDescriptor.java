package jetbrains.mps.execution.settings.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConstraintsDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;

public class ConstraintsAspectDescriptor implements jetbrains.mps.smodel.runtime.ConstraintsAspectDescriptor {
  public ConstraintsAspectDescriptor() {
  }

  public ConstraintsDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_2qnle6_a0a0b, fqName)) {
      case 8:
        return new TemplateParameterReference_Constraints();
      case 6:
        return new ReportConfigurationErrorStatement_Constraints();
      case 5:
        return new PersistentPropertyReferenceOperation_Constraints();
      case 0:
        return new EditorExpression_Constraints();
      case 1:
        return new EditorOperationCall_Constraints();
      case 3:
        return new EditorPropertyReference_Constraints();
      case 7:
        return new SettingsEditor_Constraints();
      case 4:
        return new GetEditorOperation_Constraints();
      case 2:
        return new EditorOperationDeclaration_Constraints();
      default:
        // todo: illegal in some cases? 
        return new BaseConstraintsDescriptor(fqName);
    }
  }

  private static String[] stringSwitchCases_2qnle6_a0a0b = new String[]{"jetbrains.mps.execution.settings.structure.EditorExpression", "jetbrains.mps.execution.settings.structure.EditorOperationCall", "jetbrains.mps.execution.settings.structure.EditorOperationDeclaration", "jetbrains.mps.execution.settings.structure.EditorPropertyReference", "jetbrains.mps.execution.settings.structure.GetEditorOperation", "jetbrains.mps.execution.settings.structure.PersistentPropertyReferenceOperation", "jetbrains.mps.execution.settings.structure.ReportConfigurationErrorStatement", "jetbrains.mps.execution.settings.structure.SettingsEditor", "jetbrains.mps.execution.settings.structure.TemplateParameterReference"};
}
