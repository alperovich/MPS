package jetbrains.mps.refactoringTest;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest4;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import jetbrains.mps.baseLanguage.util.plugin.refactorings.ConvertAnonymousRefactoring;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import junit.framework.Assert;
import jetbrains.mps.lang.test.matcher.NodesMatcher;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import org.jetbrains.mps.openapi.model.SNode;

@MPSLaunch
public class ConvertAnonymousWithParameterReference_Test extends BaseTransformationTest4 {
  @Test
  public void test_WithParameterReferenceTest() throws Throwable {
    this.initTest("${mps_home}", "r:4dc6ffb5-4bbb-4773-b0b7-e52989ceb56f(jetbrains.mps.refactoringTest@tests)");
    this.runTest("jetbrains.mps.refactoringTest.ConvertAnonymousWithParameterReference_Test$TestBody", "test_WithParameterReferenceTest", true);
  }

  @MPSLaunch
  public static class TestBody extends BaseTestBody {
    public void test_WithParameterReferenceTest() throws Exception {
      this.addNodeById("995475547969867889");
      this.addNodeById("995475547969867939");
      new ConvertAnonymousRefactoring(SNodeOperations.cast(this.getNodeById("995475547969867898"), "jetbrains.mps.baseLanguage.structure.AnonymousClass"), "MyComparable").doRefactor();
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("995475547969867890"), "jetbrains.mps.baseLanguage.structure.ClassConcept")), ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("995475547969867969"), "jetbrains.mps.baseLanguage.structure.ClassConcept"))));
    }
  }
}
