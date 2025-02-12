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
import jetbrains.mps.baseLanguage.util.plugin.refactorings.MethodMatch;
import junit.framework.Assert;
import jetbrains.mps.lang.test.matcher.NodesMatcher;

@MPSLaunch
public class SimpleFindForExtractFromExpression_Test extends BaseTransformationTest4 {
  @Test
  public void test_SimpleFindForExtractFromExpressionTest() throws Throwable {
    this.initTest("${mps_home}", "r:4dc6ffb5-4bbb-4773-b0b7-e52989ceb56f(jetbrains.mps.refactoringTest@tests)");
    this.runTest("jetbrains.mps.refactoringTest.SimpleFindForExtractFromExpression_Test$TestBody", "test_SimpleFindForExtractFromExpressionTest", true);
  }

  @MPSLaunch
  public static class TestBody extends BaseTestBody {
    public void test_SimpleFindForExtractFromExpressionTest() throws Exception {
      this.addNodeById("8556882668095192253");
      this.addNodeById("8556882668095202132");
      ExtractMethodRefactoringParameters params = ExtractMethodFactory.createParameters(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("8556882668095192263"), "jetbrains.mps.baseLanguage.structure.DotExpression")));
      params.setName("print");
      ExtractMethodRefactoring ref = ExtractMethodFactory.createRefactoring(params);
      SNode res = ref.doRefactor();
      for (MethodMatch match : ListSequence.fromList(ref.getMatches())) {
        ExtractMethodRefactoring matchRef = ExtractMethodFactory.createRefactoring(ExtractMethodFactory.createParameters(match.getNodes()));
        matchRef.replaceMatch(match, res);
      }
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("8556882668095192257"), "jetbrains.mps.baseLanguage.structure.ClassConcept")), ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("8556882668095202133"), "jetbrains.mps.baseLanguage.structure.ClassConcept"))));
    }
  }
}
