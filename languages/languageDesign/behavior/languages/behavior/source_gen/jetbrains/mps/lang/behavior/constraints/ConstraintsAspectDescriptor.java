package jetbrains.mps.lang.behavior.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConstraintsDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;

public class ConstraintsAspectDescriptor implements jetbrains.mps.smodel.runtime.ConstraintsAspectDescriptor {
  public ConstraintsAspectDescriptor() {
  }

  public ConstraintsDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_2qnle6_a0a0b, fqName)) {
      case 0:
        return new ConceptBehavior_Constraints();
      case 1:
        return new ConceptMethodDeclaration_Constraints();
      case 4:
        return new ThisNodeExpression_Constraints();
      case 3:
        return new SuperNodeExpression_Constraints();
      case 2:
        return new LocalBehaviorMethodCall_Constraints();
      default:
        // todo: illegal in some cases? 
        return new BaseConstraintsDescriptor(fqName);
    }
  }

  private static String[] stringSwitchCases_2qnle6_a0a0b = new String[]{"jetbrains.mps.lang.behavior.structure.ConceptBehavior", "jetbrains.mps.lang.behavior.structure.ConceptMethodDeclaration", "jetbrains.mps.lang.behavior.structure.LocalBehaviorMethodCall", "jetbrains.mps.lang.behavior.structure.SuperNodeExpression", "jetbrains.mps.lang.behavior.structure.ThisNodeExpression"};
}
