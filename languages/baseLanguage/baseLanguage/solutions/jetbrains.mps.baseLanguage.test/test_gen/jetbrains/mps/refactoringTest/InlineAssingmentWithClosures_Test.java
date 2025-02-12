package jetbrains.mps.refactoringTest;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest4;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import jetbrains.mps.baseLanguage.util.plugin.refactorings.InlineVariableRefactoring;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import junit.framework.Assert;
import jetbrains.mps.lang.test.matcher.NodesMatcher;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import org.jetbrains.mps.openapi.model.SNode;

@MPSLaunch
public class InlineAssingmentWithClosures_Test extends BaseTransformationTest4 {
  @Test
  public void test_InlineAssingmentWithClosures() throws Throwable {
    this.initTest("${mps_home}", "r:4dc6ffb5-4bbb-4773-b0b7-e52989ceb56f(jetbrains.mps.refactoringTest@tests)");
    this.runTest("jetbrains.mps.refactoringTest.InlineAssingmentWithClosures_Test$TestBody", "test_InlineAssingmentWithClosures", true);
  }

  @MPSLaunch
  public static class TestBody extends BaseTestBody {
    public void test_InlineAssingmentWithClosures() throws Exception {
      this.addNodeById("9118878263582085077");
      this.addNodeById("9118878263582085119");
      InlineVariableRefactoring ref = InlineVariableRefactoring.createRefactoring(SNodeOperations.cast(this.getNodeById("9118878263582085084"), "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"));
      ref.doRefactoring();
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("9118878263582085078"), "jetbrains.mps.baseLanguage.structure.ClassConcept")), ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("9118878263582085124"), "jetbrains.mps.baseLanguage.structure.ClassConcept"))));
    }
  }
}
