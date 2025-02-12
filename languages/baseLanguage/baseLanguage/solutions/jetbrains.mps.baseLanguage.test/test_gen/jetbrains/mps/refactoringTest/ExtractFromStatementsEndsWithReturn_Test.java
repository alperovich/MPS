package jetbrains.mps.refactoringTest;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest4;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import jetbrains.mps.baseLanguage.util.plugin.refactorings.ExtractMethodRefactoringParameters;
import jetbrains.mps.baseLanguage.util.plugin.refactorings.ExtractMethodFactory;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.util.plugin.refactorings.ExtractMethodRefactoring;
import junit.framework.Assert;
import jetbrains.mps.lang.test.matcher.NodesMatcher;

@MPSLaunch
public class ExtractFromStatementsEndsWithReturn_Test extends BaseTransformationTest4 {
  @Test
  public void test_extractFromStatementsEndsWithReturn() throws Throwable {
    this.initTest("${mps_home}", "r:4dc6ffb5-4bbb-4773-b0b7-e52989ceb56f(jetbrains.mps.refactoringTest@tests)");
    this.runTest("jetbrains.mps.refactoringTest.ExtractFromStatementsEndsWithReturn_Test$TestBody", "test_extractFromStatementsEndsWithReturn", true);
  }

  @MPSLaunch
  public static class TestBody extends BaseTestBody {
    public void test_extractFromStatementsEndsWithReturn() throws Exception {
      this.addNodeById("1230052642040");
      this.addNodeById("1230052642053");
      ExtractMethodRefactoringParameters params = ExtractMethodFactory.createParameters(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("1230052642046"), "jetbrains.mps.baseLanguage.structure.ReturnStatement")));
      params.setName("foo");
      ExtractMethodRefactoring ref = ExtractMethodFactory.createRefactoring(params);
      ref.doRefactor();
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("1230052642041"), "jetbrains.mps.baseLanguage.structure.ClassConcept")), ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("1230052642054"), "jetbrains.mps.baseLanguage.structure.ClassConcept"))));
    }
  }
}
