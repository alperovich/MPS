package jetbrains.mps.lang.editor.multiple.tests;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest4;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;
import jetbrains.mps.openapi.editor.Editor;
import jetbrains.mps.nodeEditor.EditorComponent;

@MPSLaunch
public class ConditionalPresentation_removeQuery_RefNodeList_switch_Test extends BaseTransformationTest4 {
  public ConditionalPresentation_removeQuery_RefNodeList_switch_Test() {
  }

  @Test
  public void test_ConditionalPresentation_removeQuery_RefNodeList_switch() throws Throwable {
    this.initTest("${mps_home}", "r:dbab6746-af91-4594-857e-d38a36667e17(jetbrains.mps.lang.editor.multiple.tests)");
    this.runTest("jetbrains.mps.lang.editor.multiple.tests.ConditionalPresentation_removeQuery_RefNodeList_switch_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    public TestBody() {
    }

    @Override
    public void testMethodImpl() throws Exception {
      final Editor editor = TestBody.this.initEditor("554589055677398709", "554589055677398727");
      EditorComponent editorComponent = (EditorComponent) editor.getCurrentEditorComponent();
      BaseEditorTestBody.typeString(editorComponent, "false");
      BaseEditorTestBody.invokeAction(editorComponent, "jetbrains.mps.ide.editor.actions.MoveDown_Action");
      BaseEditorTestBody.invokeAction(editorComponent, "jetbrains.mps.ide.editor.actions.MoveDown_Action");
      BaseEditorTestBody.typeString(editorComponent, "propValue");
    }
  }
}
