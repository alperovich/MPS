package jetbrains.mps.lang.extension.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConstraintsDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;

public class ConstraintsAspectDescriptor implements jetbrains.mps.smodel.runtime.ConstraintsAspectDescriptor {
  public ConstraintsAspectDescriptor() {
  }

  public ConstraintsDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_2qnle6_a0a0b, fqName)) {
      case 2:
        return new ExtensionPointDeclaration_Constraints();
      case 0:
        return new ExtensionDeclaration_Constraints();
      case 1:
        return new ExtensionFieldDeclaration_Constraints();
      case 3:
        return new GetExtensionObjectsOperation_Constraints();
      default:
        // todo: illegal in some cases? 
        return new BaseConstraintsDescriptor(fqName);
    }
  }

  private static String[] stringSwitchCases_2qnle6_a0a0b = new String[]{"jetbrains.mps.lang.extension.structure.ExtensionDeclaration", "jetbrains.mps.lang.extension.structure.ExtensionFieldDeclaration", "jetbrains.mps.lang.extension.structure.ExtensionPointDeclaration", "jetbrains.mps.lang.extension.structure.GetExtensionObjectsOperation"};
}
