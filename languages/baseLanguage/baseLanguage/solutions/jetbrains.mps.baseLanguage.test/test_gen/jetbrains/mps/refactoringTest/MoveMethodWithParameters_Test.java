package jetbrains.mps.refactoringTest;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest4;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import jetbrains.mps.baseLanguage.util.plugin.refactorings.MoveStaticMethodRefactoring;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import junit.framework.Assert;
import jetbrains.mps.lang.test.matcher.NodesMatcher;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import org.jetbrains.mps.openapi.model.SNode;

@MPSLaunch
public class MoveMethodWithParameters_Test extends BaseTransformationTest4 {
  @Test
  public void test_check() throws Throwable {
    this.initTest("${mps_home}", "r:4dc6ffb5-4bbb-4773-b0b7-e52989ceb56f(jetbrains.mps.refactoringTest@tests)");
    this.runTest("jetbrains.mps.refactoringTest.MoveMethodWithParameters_Test$TestBody", "test_check", true);
  }

  @MPSLaunch
  public static class TestBody extends BaseTestBody {
    public void test_check() throws Exception {
      this.addNodeById("5142438244427169027");
      this.addNodeById("5142438244427184189");
      this.addNodeById("5142438244427184178");
      this.addNodeById("5142438244427184202");
      MoveStaticMethodRefactoring ref = new MoveStaticMethodRefactoring(SNodeOperations.cast(this.getNodeById("5142438244427169034"), "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration"), SNodeOperations.cast(this.getNodeById("5142438244427184181"), "jetbrains.mps.baseLanguage.structure.ClassConcept"));
      ref.doRefactoring();
      ref.replaceSingleUsage(SNodeOperations.cast(this.getNodeById("6765021202370589782"), "jetbrains.mps.baseLanguage.structure.StaticMethodCall"));
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("5142438244427169028"), "jetbrains.mps.baseLanguage.structure.ClassConcept"), SNodeOperations.cast(this.getNodeById("5142438244427184181"), "jetbrains.mps.baseLanguage.structure.ClassConcept")), ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("5142438244427184190"), "jetbrains.mps.baseLanguage.structure.ClassConcept"), SNodeOperations.cast(this.getNodeById("5142438244427184203"), "jetbrains.mps.baseLanguage.structure.ClassConcept"))));
    }
  }
}
