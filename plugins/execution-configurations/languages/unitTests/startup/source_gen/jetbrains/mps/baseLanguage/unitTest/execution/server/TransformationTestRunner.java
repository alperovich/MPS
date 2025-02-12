package jetbrains.mps.baseLanguage.unitTest.execution.server;

/*Generated by MPS */

import jetbrains.mps.util.CachesUtil;
import jetbrains.mps.TestMain;
import javax.swing.SwingUtilities;
import com.intellij.openapi.application.impl.ApplicationImpl;
import com.intellij.openapi.application.ApplicationManager;

public class TransformationTestRunner extends TestRunner {
  public TransformationTestRunner() {
  }

  public static void main(String[] argv) {
    try {
      CachesUtil.setupCaches();
      new TransformationTestRunner().executeTestsFromArguments(argv);
    } catch (Throwable t) {
      t.printStackTrace(System.err);
      CachesUtil.cleanupCaches();
      System.exit(1);
    }
    TestMain.PROJECT_CONTAINER.clear();
    try {
      SwingUtilities.invokeAndWait(new Runnable() {
        @Override
        public void run() {
          ((ApplicationImpl) ApplicationManager.getApplication()).exit(true);
        }
      });
    } catch (Exception e) {
      e.printStackTrace();
    }
    CachesUtil.cleanupCaches();
    System.exit(0);
  }
}
