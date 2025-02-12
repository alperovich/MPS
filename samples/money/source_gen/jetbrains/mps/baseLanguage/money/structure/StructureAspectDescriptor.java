package jetbrains.mps.baseLanguage.money.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder;
import jetbrains.mps.smodel.runtime.StaticScope;
import jetbrains.mps.smodel.runtime.interpreted.StructureAspectInterpreted;

public class StructureAspectDescriptor implements jetbrains.mps.smodel.runtime.StructureAspectDescriptor {
  public StructureAspectDescriptor() {
  }

  public ConceptDescriptor getDescriptor(String conceptFqName) {
    switch (Arrays.binarySearch(stringSwitchCases_1htk8d_a0a0b, conceptFqName)) {
      case 0:
        return new ConceptDescriptorBuilder("jetbrains.mps.baseLanguage.money.structure.MoneyCreator").super_("jetbrains.mps.baseLanguage.structure.AbstractCreator").parents("jetbrains.mps.baseLanguage.structure.AbstractCreator").children(new String[]{"amount", "currency"}, new boolean[]{false, false}).alias("Money", "money type constructor").staticScope(StaticScope.NONE).create();
      case 1:
        return new ConceptDescriptorBuilder("jetbrains.mps.baseLanguage.money.structure.MoneyGetAmountMethodCall").super_("jetbrains.mps.baseLanguage.money.structure.MoneyMethodCall").parents("jetbrains.mps.baseLanguage.money.structure.MoneyMethodCall").alias(". amount", "").staticScope(StaticScope.NONE).create();
      case 2:
        return new ConceptDescriptorBuilder("jetbrains.mps.baseLanguage.money.structure.MoneyGetCurrencyMethodCall").super_("jetbrains.mps.baseLanguage.money.structure.MoneyMethodCall").parents("jetbrains.mps.baseLanguage.money.structure.MoneyMethodCall").alias(". currency", "").staticScope(StaticScope.NONE).create();
      case 3:
        return new ConceptDescriptorBuilder("jetbrains.mps.baseLanguage.money.structure.MoneyIsZeroMethodCall").super_("jetbrains.mps.baseLanguage.money.structure.MoneyMethodCall").parents("jetbrains.mps.baseLanguage.money.structure.MoneyMethodCall").alias(". isZero", "").staticScope(StaticScope.NONE).create();
      case 4:
        return new ConceptDescriptorBuilder("jetbrains.mps.baseLanguage.money.structure.MoneyLiteral").super_("jetbrains.mps.baseLanguage.structure.Expression").parents("jetbrains.mps.baseLanguage.structure.Expression").properties("currency", "amount").staticScope(StaticScope.NONE).create();
      case 5:
        return new ConceptDescriptorBuilder("jetbrains.mps.baseLanguage.money.structure.MoneyMethodCall").super_("jetbrains.mps.baseLanguage.structure.Expression").parents("jetbrains.mps.baseLanguage.structure.Expression").children(new String[]{"instance"}, new boolean[]{false}).abstract_().staticScope(StaticScope.NONE).create();
      case 6:
        return new ConceptDescriptorBuilder("jetbrains.mps.baseLanguage.money.structure.MoneyType").super_("jetbrains.mps.baseLanguage.structure.Type").parents("jetbrains.mps.baseLanguage.structure.Type").alias("Money", "").staticScope(StaticScope.NONE).create();
      default:
        return StructureAspectInterpreted.getInstance().getDescriptor(conceptFqName);
    }
  }

  private static String[] stringSwitchCases_1htk8d_a0a0b = new String[]{"jetbrains.mps.baseLanguage.money.structure.MoneyCreator", "jetbrains.mps.baseLanguage.money.structure.MoneyGetAmountMethodCall", "jetbrains.mps.baseLanguage.money.structure.MoneyGetCurrencyMethodCall", "jetbrains.mps.baseLanguage.money.structure.MoneyIsZeroMethodCall", "jetbrains.mps.baseLanguage.money.structure.MoneyLiteral", "jetbrains.mps.baseLanguage.money.structure.MoneyMethodCall", "jetbrains.mps.baseLanguage.money.structure.MoneyType"};
}
