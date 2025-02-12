package jetbrains.mps.debugger.java.evaluation.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConstraintsDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;

public class ConstraintsAspectDescriptor implements jetbrains.mps.smodel.runtime.ConstraintsAspectDescriptor {
  public ConstraintsAspectDescriptor() {
  }

  public ConstraintsDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_2qnle6_a0a0b, fqName)) {
      case 1:
        return new EvaluatorsThisExpression_Constraints();
      case 0:
        return new EvaluatorsSuperMethodCall_Constraints();
      case 2:
        return new LowLevelVariableReference_Constraints();
      default:
        // todo: illegal in some cases? 
        return new BaseConstraintsDescriptor(fqName);
    }
  }

  private static String[] stringSwitchCases_2qnle6_a0a0b = new String[]{"jetbrains.mps.debugger.java.evaluation.structure.EvaluatorsSuperMethodCall", "jetbrains.mps.debugger.java.evaluation.structure.EvaluatorsThisExpression", "jetbrains.mps.debugger.java.evaluation.structure.LowLevelVariableReference"};
}
