package jetbrains.mps.lang.scopes.structure;

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
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.scopes.structure.ComeFromExpression").super_("jetbrains.mps.baseLanguage.structure.Expression").parents("jetbrains.mps.baseLanguage.structure.Expression").references("link").alias("come from", "").staticScope(StaticScope.NONE).create();
      case 1:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.scopes.structure.CompositeWithParentScopeExpression").super_("jetbrains.mps.baseLanguage.structure.Expression").parents("jetbrains.mps.baseLanguage.structure.Expression").children(new String[]{"expr"}, new boolean[]{false}).alias("composite with", "").staticScope(StaticScope.NONE).create();
      case 2:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.scopes.structure.ParentScope").super_("jetbrains.mps.baseLanguage.structure.Expression").parents("jetbrains.mps.baseLanguage.structure.Expression").alias("parent scope", "").staticScope(StaticScope.NONE).create();
      case 3:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.scopes.structure.UniformScopeProvider").interface_().parents("jetbrains.mps.lang.core.structure.ScopeProvider").create();
      default:
        return StructureAspectInterpreted.getInstance().getDescriptor(conceptFqName);
    }
  }

  private static String[] stringSwitchCases_1htk8d_a0a0b = new String[]{"jetbrains.mps.lang.scopes.structure.ComeFromExpression", "jetbrains.mps.lang.scopes.structure.CompositeWithParentScopeExpression", "jetbrains.mps.lang.scopes.structure.ParentScope", "jetbrains.mps.lang.scopes.structure.UniformScopeProvider"};
}
