package org.jetbrains.mps.samples.ParallelFor.structure;

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
        return new ConceptDescriptorBuilder("org.jetbrains.mps.samples.ParallelFor.structure.NonThreadSafeClass").super_("jetbrains.mps.lang.core.structure.NodeAttribute").parents("jetbrains.mps.lang.core.structure.NodeAttribute").create();
      case 1:
        return new ConceptDescriptorBuilder("org.jetbrains.mps.samples.ParallelFor.structure.ParallelFor").super_("jetbrains.mps.baseLanguage.structure.AbstractLoopStatement").parents("jetbrains.mps.baseLanguage.structure.AbstractLoopStatement", "jetbrains.mps.baseLanguage.structure.IMethodLike", "jetbrains.mps.baseLanguage.structure.IStatementListContainer").properties("nowait").children(new String[]{"loopVariable", "inputSequence", "threadPool"}, new boolean[]{false, false, false}).alias("parallelFor", "").staticScope(StaticScope.NONE).create();
      case 2:
        return new ConceptDescriptorBuilder("org.jetbrains.mps.samples.ParallelFor.structure.ParallelLoopVariable").super_("jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration").parents("jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration").create();
      case 3:
        return new ConceptDescriptorBuilder("org.jetbrains.mps.samples.ParallelFor.structure.ThreadPool").super_("jetbrains.mps.baseLanguage.structure.Expression").parents("jetbrains.mps.baseLanguage.structure.Expression").properties("numberOfThreads").alias("thread pool", "").staticScope(StaticScope.NONE).create();
      case 4:
        return new ConceptDescriptorBuilder("org.jetbrains.mps.samples.ParallelFor.structure.ThreadSafe").super_("jetbrains.mps.lang.core.structure.NodeAttribute").parents("jetbrains.mps.lang.core.structure.NodeAttribute").create();
      default:
        return StructureAspectInterpreted.getInstance().getDescriptor(conceptFqName);
    }
  }

  private static String[] stringSwitchCases_1htk8d_a0a0b = new String[]{"org.jetbrains.mps.samples.ParallelFor.structure.NonThreadSafeClass", "org.jetbrains.mps.samples.ParallelFor.structure.ParallelFor", "org.jetbrains.mps.samples.ParallelFor.structure.ParallelLoopVariable", "org.jetbrains.mps.samples.ParallelFor.structure.ThreadPool", "org.jetbrains.mps.samples.ParallelFor.structure.ThreadSafe"};
}
