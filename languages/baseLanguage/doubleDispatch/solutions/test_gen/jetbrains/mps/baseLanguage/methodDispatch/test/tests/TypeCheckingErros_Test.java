package jetbrains.mps.baseLanguage.methodDispatch.test.tests;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest4;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;

@MPSLaunch
public class TypeCheckingErros_Test extends BaseTransformationTest4 {
  @Test
  public void test_TypesCheck3813896760029621933() throws Throwable {
    this.initTest("${mps_home}", "r:9a3aa4da-d1a8-44bf-80e0-56cbddbc7ec9(jetbrains.mps.baseLanguage.methodDispatch.test.tests@tests)");
    this.runTest("jetbrains.mps.baseLanguage.methodDispatch.test.tests.TypeCheckingErros_Test$TestBody", "test_TypesCheck3813896760029621933", true);
  }

  @Test
  public void test_TypesCheck3813896760029627239() throws Throwable {
    this.initTest("${mps_home}", "r:9a3aa4da-d1a8-44bf-80e0-56cbddbc7ec9(jetbrains.mps.baseLanguage.methodDispatch.test.tests@tests)");
    this.runTest("jetbrains.mps.baseLanguage.methodDispatch.test.tests.TypeCheckingErros_Test$TestBody", "test_TypesCheck3813896760029627239", true);
  }

  @Test
  public void test_TypesCheck3813896760029629781() throws Throwable {
    this.initTest("${mps_home}", "r:9a3aa4da-d1a8-44bf-80e0-56cbddbc7ec9(jetbrains.mps.baseLanguage.methodDispatch.test.tests@tests)");
    this.runTest("jetbrains.mps.baseLanguage.methodDispatch.test.tests.TypeCheckingErros_Test$TestBody", "test_TypesCheck3813896760029629781", true);
  }

  @MPSLaunch
  public static class TestBody extends BaseTestBody {
    public void test_TypesCheck3813896760029621933() throws Exception {
      SNode operation = SNodeOperations.cast(this.getRealNodeById("3813896760029621933"), "jetbrains.mps.lang.test.structure.NodeOperation");
      BehaviorReflection.invokeVirtual(Void.class, operation, "virtual_perform_1215601182156", new Object[]{this.getRealNodeById("3813896760029575891")});
    }

    public void test_TypesCheck3813896760029627239() throws Exception {
      SNode operation = SNodeOperations.cast(this.getRealNodeById("3813896760029627239"), "jetbrains.mps.lang.test.structure.NodeOperation");
      BehaviorReflection.invokeVirtual(Void.class, operation, "virtual_perform_1215601182156", new Object[]{this.getRealNodeById("3813896760029626826")});
    }

    public void test_TypesCheck3813896760029629781() throws Exception {
      SNode operation = SNodeOperations.cast(this.getRealNodeById("3813896760029629781"), "jetbrains.mps.lang.test.structure.NodeOperation");
      BehaviorReflection.invokeVirtual(Void.class, operation, "virtual_perform_1215601182156", new Object[]{this.getRealNodeById("3813896760029627241")});
    }
  }
}
