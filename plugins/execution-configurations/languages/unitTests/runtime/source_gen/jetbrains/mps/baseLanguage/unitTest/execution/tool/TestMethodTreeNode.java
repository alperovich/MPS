package jetbrains.mps.baseLanguage.unitTest.execution.tool;

/*Generated by MPS */

import org.jetbrains.annotations.NotNull;
import jetbrains.mps.baseLanguage.unitTest.execution.client.ITestNodeWrapper;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.openapi.navigation.NavigationSupport;

public class TestMethodTreeNode extends BaseTestTreeNode {
  @NotNull
  protected final ITestNodeWrapper myTestMethod;

  public TestMethodTreeNode(@NotNull IOperationContext operationContext, @NotNull ITestNodeWrapper testMethod) {
    super(operationContext);
    myTestMethod = testMethod;
    setNodeIdentifier(((SNodePointer) myTestMethod.getNodePointer()).toString());
    setText(myTestMethod.getName());
  }

  public String getClassName() {
    final Wrappers._T<String> className = new Wrappers._T<String>(null);
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        ITestNodeWrapper testCase = myTestMethod.getTestCase();
        if (testCase != null) {
          className.value = testCase.getFqName();
        }
      }
    });
    return className.value;
  }

  public String getMethodName() {
    final Wrappers._T<String> methodName = new Wrappers._T<String>(null);
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        methodName.value = myTestMethod.getName();
      }
    });
    return methodName.value;
  }

  @Override
  public boolean isLeaf() {
    return true;
  }

  @Override
  public void doubleClick() {
    Runnable nav = new Runnable() {
      @Override
      public void run() {
        NavigationSupport.getInstance().openNode(getOperationContext(), myTestMethod.getNode(), true, true);
      }
    };
    if (!(ModelAccess.instance().tryWrite(nav))) {
      ModelAccess.instance().runWriteInEDT(nav);
    }
  }

  @Override
  public Object getUserObject() {
    return myTestMethod;
  }
}
