package jetbrains.mps.baseLanguage.test;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest4;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;

@MPSLaunch
public class TypesTest_BL_Test extends BaseTransformationTest4 {
  @Test
  public void testBinaryOp() throws Throwable {
    this.initTest("${mps_home}", "r:00000000-0000-4000-0000-011c895902c7(jetbrains.mps.baseLanguage.test@tests)");
    this.runTest("jetbrains.mps.baseLanguage.test.TypesTest_BL_Test$TestBody", "testBinaryOp", true);
  }

  @Test
  public void testTernaryOp() throws Throwable {
    this.initTest("${mps_home}", "r:00000000-0000-4000-0000-011c895902c7(jetbrains.mps.baseLanguage.test@tests)");
    this.runTest("jetbrains.mps.baseLanguage.test.TypesTest_BL_Test$TestBody", "testTernaryOp", true);
  }

  @Test
  public void testLeastCommonSuperType() throws Throwable {
    this.initTest("${mps_home}", "r:00000000-0000-4000-0000-011c895902c7(jetbrains.mps.baseLanguage.test@tests)");
    this.runTest("jetbrains.mps.baseLanguage.test.TypesTest_BL_Test$TestBody", "testLeastCommonSuperType", true);
  }

  @Test
  public void testGenericFields() throws Throwable {
    this.initTest("${mps_home}", "r:00000000-0000-4000-0000-011c895902c7(jetbrains.mps.baseLanguage.test@tests)");
    this.runTest("jetbrains.mps.baseLanguage.test.TypesTest_BL_Test$TestBody", "testGenericFields", true);
  }

  @Test
  public void testGenericInstanceMethods() throws Throwable {
    this.initTest("${mps_home}", "r:00000000-0000-4000-0000-011c895902c7(jetbrains.mps.baseLanguage.test@tests)");
    this.runTest("jetbrains.mps.baseLanguage.test.TypesTest_BL_Test$TestBody", "testGenericInstanceMethods", true);
  }

  @Test
  public void testGenericMethods() throws Throwable {
    this.initTest("${mps_home}", "r:00000000-0000-4000-0000-011c895902c7(jetbrains.mps.baseLanguage.test@tests)");
    this.runTest("jetbrains.mps.baseLanguage.test.TypesTest_BL_Test$TestBody", "testGenericMethods", true);
  }

  @Test
  public void testArrays() throws Throwable {
    this.initTest("${mps_home}", "r:00000000-0000-4000-0000-011c895902c7(jetbrains.mps.baseLanguage.test@tests)");
    this.runTest("jetbrains.mps.baseLanguage.test.TypesTest_BL_Test$TestBody", "testArrays", true);
  }

  @Test
  public void testRules() throws Throwable {
    this.initTest("${mps_home}", "r:00000000-0000-4000-0000-011c895902c7(jetbrains.mps.baseLanguage.test@tests)");
    this.runTest("jetbrains.mps.baseLanguage.test.TypesTest_BL_Test$TestBody", "testRules", true);
  }

  @Test
  public void testSuppress() throws Throwable {
    this.initTest("${mps_home}", "r:00000000-0000-4000-0000-011c895902c7(jetbrains.mps.baseLanguage.test@tests)");
    this.runTest("jetbrains.mps.baseLanguage.test.TypesTest_BL_Test$TestBody", "testSuppress", true);
  }

  @MPSLaunch
  public static class TestBody extends BaseTestBody {
    public void testBinaryOp() throws Exception {
      SNode operation = SNodeOperations.cast(this.getRealNodeById("5113180367541523025"), "jetbrains.mps.lang.test.structure.NodeOperation");
      BehaviorReflection.invokeVirtual(Void.class, operation, "virtual_perform_1215601182156", new Object[]{this.getRealNodeById("5113180367541522957")});
    }

    public void testTernaryOp() throws Exception {
      SNode operation = SNodeOperations.cast(this.getRealNodeById("5113180367541523059"), "jetbrains.mps.lang.test.structure.NodeOperation");
      BehaviorReflection.invokeVirtual(Void.class, operation, "virtual_perform_1215601182156", new Object[]{this.getRealNodeById("5113180367541523027")});
    }

    public void testLeastCommonSuperType() throws Exception {
      SNode operation = SNodeOperations.cast(this.getRealNodeById("194528893653737059"), "jetbrains.mps.lang.test.structure.NodeOperation");
      BehaviorReflection.invokeVirtual(Void.class, operation, "virtual_perform_1215601182156", new Object[]{this.getRealNodeById("194528893653736934")});
    }

    public void testGenericFields() throws Exception {
      SNode operation = SNodeOperations.cast(this.getRealNodeById("5113180367541523186"), "jetbrains.mps.lang.test.structure.NodeOperation");
      BehaviorReflection.invokeVirtual(Void.class, operation, "virtual_perform_1215601182156", new Object[]{this.getRealNodeById("5113180367541523125")});
    }

    public void testGenericInstanceMethods() throws Exception {
      SNode operation = SNodeOperations.cast(this.getRealNodeById("5113180367541523215"), "jetbrains.mps.lang.test.structure.NodeOperation");
      BehaviorReflection.invokeVirtual(Void.class, operation, "virtual_perform_1215601182156", new Object[]{this.getRealNodeById("5113180367541523188")});
    }

    public void testGenericMethods() throws Exception {
      SNode operation = SNodeOperations.cast(this.getRealNodeById("5113180367541523249"), "jetbrains.mps.lang.test.structure.NodeOperation");
      BehaviorReflection.invokeVirtual(Void.class, operation, "virtual_perform_1215601182156", new Object[]{this.getRealNodeById("5113180367541523217")});
    }

    public void testArrays() throws Exception {
      SNode operation = SNodeOperations.cast(this.getRealNodeById("5684597377559872289"), "jetbrains.mps.lang.test.structure.NodeOperation");
      BehaviorReflection.invokeVirtual(Void.class, operation, "virtual_perform_1215601182156", new Object[]{this.getRealNodeById("5684597377559872257")});
    }

    public void testRules() throws Exception {
      SNode operation = SNodeOperations.cast(this.getRealNodeById("8239324132726812091"), "jetbrains.mps.lang.test.structure.NodeOperation");
      BehaviorReflection.invokeVirtual(Void.class, operation, "virtual_perform_1215601182156", new Object[]{this.getRealNodeById("8239324132726812043")});
    }

    public void testSuppress() throws Exception {
      SNode operation = SNodeOperations.cast(this.getRealNodeById("5486398570946081283"), "jetbrains.mps.lang.test.structure.NodeOperation");
      BehaviorReflection.invokeVirtual(Void.class, operation, "virtual_perform_1215601182156", new Object[]{this.getRealNodeById("5486398570946081254")});
    }
  }
}
