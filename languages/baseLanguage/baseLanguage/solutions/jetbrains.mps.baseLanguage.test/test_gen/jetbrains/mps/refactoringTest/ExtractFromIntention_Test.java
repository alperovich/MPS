package jetbrains.mps.refactoringTest;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest4;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.util.plugin.refactorings.ExtractMethodRefactoringParameters;
import jetbrains.mps.baseLanguage.util.plugin.refactorings.ExtractMethodFactory;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.baseLanguage.util.plugin.refactorings.VisibilityLevel;
import jetbrains.mps.baseLanguage.util.plugin.refactorings.ExtractMethodRefactoring;
import junit.framework.Assert;
import jetbrains.mps.lang.test.matcher.NodesMatcher;

@MPSLaunch
public class ExtractFromIntention_Test extends BaseTransformationTest4 {
  @Test
  public void test_extractExpression() throws Throwable {
    this.initTest("${mps_home}", "r:4dc6ffb5-4bbb-4773-b0b7-e52989ceb56f(jetbrains.mps.refactoringTest@tests)");
    this.runTest("jetbrains.mps.refactoringTest.ExtractFromIntention_Test$TestBody", "test_extractExpression", true);
  }

  @MPSLaunch
  public static class TestBody extends BaseTestBody {
    public void test_extractExpression() throws Exception {
      this.addNodeById("1230052684510");
      this.addNodeById("1230052684520");
      this.addNodeById("1230052684528");
      this.addNodeById("1230052684538");
      SLinkOperations.setTarget(SNodeOperations.cast(this.getNodeById("1230052684533"), "jetbrains.mps.baseLanguage.structure.StaticMethodCall"), "classConcept", SNodeOperations.cast(this.getNodeById("1230052684539"), "jetbrains.mps.baseLanguage.structure.ClassConcept"), false);
      SLinkOperations.setTarget(SNodeOperations.cast(this.getNodeById("1230052684533"), "jetbrains.mps.baseLanguage.structure.StaticMethodCall"), "baseMethodDeclaration", SNodeOperations.cast(this.getNodeById("1230052684540"), "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration"), false);
      ExtractMethodRefactoringParameters params = ExtractMethodFactory.createParameters(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("1230052684515"), "jetbrains.mps.baseLanguage.structure.StringLiteral")));
      params.setName("foo");
      params.setVisibilityLevel(VisibilityLevel.PUBLIC);
      ExtractMethodRefactoring ref = ExtractMethodFactory.createRefactoring(params);
      ref.setStaticContainer(SNodeOperations.cast(this.getNodeById("1230052684521"), "jetbrains.mps.baseLanguage.structure.ClassConcept"));
      ref.doRefactor();
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("1230052684511"), "jetbrains.mps.lang.intentions.structure.IntentionDeclaration"), SNodeOperations.cast(this.getNodeById("1230052684521"), "jetbrains.mps.baseLanguage.structure.ClassConcept")), ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("1230052684529"), "jetbrains.mps.lang.intentions.structure.IntentionDeclaration"), SNodeOperations.cast(this.getNodeById("1230052684539"), "jetbrains.mps.baseLanguage.structure.ClassConcept"))));
    }
  }
}
