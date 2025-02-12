package jetbrains.mps.propertiesTest;

/*Generated by MPS */

import junit.framework.TestCase;
import junit.framework.Assert;

public class PropertiesTest_Test extends TestCase {
  public void test_properties() throws Exception {
    TestClass testClass = new TestClass(239);
    Assert.assertEquals(239, testClass.getPropertyValue());
    Assert.assertEquals(239, testClass.value);
    Assert.assertEquals(239, testClass.getSecondPropertyValue());
    testClass.changeValueUsingNestedClass(1);
    Assert.assertEquals(1, testClass.getPropertyValue());
    Assert.assertEquals(1, testClass.value);
    Assert.assertEquals(1, testClass.getSecondPropertyValue());
  }

  public PropertiesTest_Test() {
  }
}
