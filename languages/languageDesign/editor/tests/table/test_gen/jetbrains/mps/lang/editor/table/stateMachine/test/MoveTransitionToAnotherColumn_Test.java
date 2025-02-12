package jetbrains.mps.lang.editor.table.stateMachine.test;

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
public class MoveTransitionToAnotherColumn_Test extends BaseTransformationTest4 {
  public MoveTransitionToAnotherColumn_Test() {
  }

  @Test
  public void test_MoveTransitionToAnotherColumn() throws Throwable {
    this.initTest("${mps_home}", "r:dc1400b5-0aa4-448e-8f15-11fb0ccb5c23(jetbrains.mps.lang.editor.table.stateMachine.test@tests)");
    this.runTest("jetbrains.mps.lang.editor.table.stateMachine.test.MoveTransitionToAnotherColumn_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    public TestBody() {
    }

    @Override
    public void testMethodImpl() throws Exception {
      final Editor editor = TestBody.this.initEditor("6170050146384285884", "6767735723023410238");
      EditorComponent editorComponent = (EditorComponent) editor.getCurrentEditorComponent();
      BaseEditorTestBody.pressKeys(editorComponent, ListSequence.fromListAndArray(new ArrayList<String>(), "ctrl SPACE"));
      BaseEditorTestBody.typeString(editorComponent, "another");
      BaseEditorTestBody.pressKeys(editorComponent, ListSequence.fromListAndArray(new ArrayList<String>(), " ENTER"));
    }
  }
}
