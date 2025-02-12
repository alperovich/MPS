package jetbrains.mps.baseLanguage.collections.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConstraintsDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;

public class ConstraintsAspectDescriptor implements jetbrains.mps.smodel.runtime.ConstraintsAspectDescriptor {
  public ConstraintsAspectDescriptor() {
  }

  public ConstraintsDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_2qnle6_a0a0b, fqName)) {
      case 10:
        return new ForEachVariableReference_Constraints();
      case 19:
        return new MapOperation_Constraints();
      case 23:
        return new SmartClosureParameterDeclaration_Constraints();
      case 22:
        return new SequenceOperation_Constraints();
      case 4:
        return new AbstractSetOperation_Constraints();
      case 2:
        return new AbstractIteratorOperation_Constraints();
      case 1:
        return new AbstractEnumeratorOperation_Constraints();
      case 5:
        return new AllConstant_Constraints();
      case 21:
        return new RemoveOperation_Constraints();
      case 24:
        return new SortedMapOperation_Constraints();
      case 25:
        return new SortedSetOperation_Constraints();
      case 6:
        return new AsSequenceOperation_Constraints();
      case 16:
        return new JoinOperation_Constraints();
      case 3:
        return new AbstractMappingOperation_Constraints();
      case 17:
        return new LinkedListCreator_Constraints();
      case 12:
        return new HashSetCreator_Constraints();
      case 27:
        return new TreeSetCreator_Constraints();
      case 18:
        return new ListCreatorWithInit_Constraints();
      case 11:
        return new HashMapCreator_Constraints();
      case 26:
        return new TreeMapCreator_Constraints();
      case 14:
        return new IListOperation_Constraints();
      case 15:
        return new IQueueOperation_Constraints();
      case 13:
        return new IContainerOperation_Constraints();
      case 0:
        return new AbstractContainerCreator_Constraints();
      case 8:
        return new CustomContainerDeclaration_Constraints();
      case 7:
        return new CustomContainerCreator_Constraints();
      case 9:
        return new CustomMapCreator_Constraints();
      case 20:
        return new MultiForEachVariableReference_Constraints();
      default:
        // todo: illegal in some cases? 
        return new BaseConstraintsDescriptor(fqName);
    }
  }

  private static String[] stringSwitchCases_2qnle6_a0a0b = new String[]{"jetbrains.mps.baseLanguage.collections.structure.AbstractContainerCreator", "jetbrains.mps.baseLanguage.collections.structure.AbstractEnumeratorOperation", "jetbrains.mps.baseLanguage.collections.structure.AbstractIteratorOperation", "jetbrains.mps.baseLanguage.collections.structure.AbstractMappingOperation", "jetbrains.mps.baseLanguage.collections.structure.AbstractSetOperation", "jetbrains.mps.baseLanguage.collections.structure.AllConstant", "jetbrains.mps.baseLanguage.collections.structure.AsSequenceOperation", "jetbrains.mps.baseLanguage.collections.structure.CustomContainerCreator", "jetbrains.mps.baseLanguage.collections.structure.CustomContainerDeclaration", "jetbrains.mps.baseLanguage.collections.structure.CustomMapCreator", "jetbrains.mps.baseLanguage.collections.structure.ForEachVariableReference", "jetbrains.mps.baseLanguage.collections.structure.HashMapCreator", "jetbrains.mps.baseLanguage.collections.structure.HashSetCreator", "jetbrains.mps.baseLanguage.collections.structure.IContainerOperation", "jetbrains.mps.baseLanguage.collections.structure.IListOperation", "jetbrains.mps.baseLanguage.collections.structure.IQueueOperation", "jetbrains.mps.baseLanguage.collections.structure.JoinOperation", "jetbrains.mps.baseLanguage.collections.structure.LinkedListCreator", "jetbrains.mps.baseLanguage.collections.structure.ListCreatorWithInit", "jetbrains.mps.baseLanguage.collections.structure.MapOperation", "jetbrains.mps.baseLanguage.collections.structure.MultiForEachVariableReference", "jetbrains.mps.baseLanguage.collections.structure.RemoveOperation", "jetbrains.mps.baseLanguage.collections.structure.SequenceOperation", "jetbrains.mps.baseLanguage.collections.structure.SmartClosureParameterDeclaration", "jetbrains.mps.baseLanguage.collections.structure.SortedMapOperation", "jetbrains.mps.baseLanguage.collections.structure.SortedSetOperation", "jetbrains.mps.baseLanguage.collections.structure.TreeMapCreator", "jetbrains.mps.baseLanguage.collections.structure.TreeSetCreator"};
}
