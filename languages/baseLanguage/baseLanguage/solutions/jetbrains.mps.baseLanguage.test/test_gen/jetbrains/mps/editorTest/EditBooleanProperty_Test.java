package jetbrains.mps.editorTest;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest4;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;
import jetbrains.mps.openapi.editor.Editor;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;

@MPSLaunch
public class EditBooleanProperty_Test extends BaseTransformationTest4 {
  public EditBooleanProperty_Test() {
  }

  @Test
  public void test_EditBooleanProperty() throws Throwable {
    this.initTest("${mps_home}", "r:914ee49a-537d-44b2-a5fb-bac87a54743d(jetbrains.mps.editorTest@tests)");
    this.runTest("jetbrains.mps.editorTest.EditBooleanProperty_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    public TestBody() {
    }

    @Override
    public void testMethodImpl() throws Exception {
      final Editor editor = TestBody.this.initEditor("6007318803030060602", "6007318803030060607");
      EditorComponent editorComponent = (EditorComponent) editor.getCurrentEditorComponent();
      BaseEditorTestBody.typeString(editorComponent, "true");
      BaseEditorTestBody.pressKeys(editorComponent, ListSequence.fromListAndArray(new ArrayList<String>(), "ctrl SPACE"));
    }
  }
}
