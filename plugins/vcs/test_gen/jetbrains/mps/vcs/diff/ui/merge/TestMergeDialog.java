package jetbrains.mps.vcs.diff.ui.merge;

/*Generated by MPS */

import jetbrains.mps.testbench.IdeaEnvironment;
import jetbrains.mps.nodeEditor.EditorManager;
import com.intellij.openapi.Disposable;
import com.intellij.openapi.util.Disposer;
import com.intellij.openapi.extensions.Extensions;
import com.intellij.openapi.project.Project;
import com.intellij.mock.MockProjectEx;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.ide.bookmark.BookmarkManager;
import org.jdom.JDOMException;
import java.io.IOException;
import jetbrains.mps.smodel.persistence.def.ModelReadException;
import java.util.Scanner;
import jetbrains.mps.tool.environment.EnvironmentConfig;
import jetbrains.mps.ide.IdeMain;
import com.intellij.openapi.util.IconLoader;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.vcs.platform.util.MergeBackupUtil;
import java.io.File;
import jetbrains.mps.vcs.util.MergeVersion;
import jetbrains.mps.smodel.persistence.def.ModelPersistence;
import jetbrains.mps.extapi.persistence.FileDataSource;
import jetbrains.mps.vfs.FileSystem;
import javax.swing.SwingUtilities;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.util.Computable;
import jetbrains.mps.vcs.diff.merge.MergeTemporaryModel;
import jetbrains.mps.vcs.diff.ui.common.SimpleDiffRequest;
import java.lang.reflect.Field;
import com.intellij.idea.IdeaTestApplication;
import jetbrains.mps.vcs.diff.ui.common.DiffModelTree;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.extapi.model.SModelBase;
import org.apache.log4j.Priority;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class TestMergeDialog {
  private static IdeaEnvironment ENV;
  private static EditorManager ourEditorManager = new EditorManager();
  private static Disposable myParentDisposable = Disposer.newDisposable();
  private static Object ___init = new Object() {
    {
      Extensions.registerAreaClass("IDEA_PROJECT", null);
    }
  };
  private static Project ourProject = new MockProjectEx(myParentDisposable) {
    @Override
    public <T> T getComponent(Class<T> interfaceClass) {
      if (interfaceClass == EditorManager.class) {
        return (T) TestMergeDialog.ourEditorManager;
      }
      if (interfaceClass == MPSProject.class) {
        return (T) TestMergeDialog.ourMPSProject;
      }
      if (interfaceClass == BookmarkManager.class) {
        return (T) new BookmarkManager(TestMergeDialog.ourProject, null);
      }
      return null;
    }
  };
  private static MPSProject ourMPSProject = new MPSProject(ourProject);

  public TestMergeDialog() {
  }

  public static void main(String[] args) throws JDOMException, IOException, ModelReadException {
    if (args.length == 0) {
      System.out.print("Input path to model zip: ");
      String line = new Scanner(System.in).nextLine();
      args = new String[]{((line == null ?
        null :
        line.trim()
      ))};
    }
    ENV = new IdeaEnvironment(EnvironmentConfig.defaultEnvironment());
    IdeMain.setTestMode(IdeMain.TestMode.NO_TEST);
    IconLoader.activate();
    final SModel[] models = new SModel[3];
    String resultFile;
    if (args.length == 2 || args.length == 1) {
      final SModel[] zipped = MergeBackupUtil.loadZippedModels(new File(args[0]), new MergeVersion[]{MergeVersion.BASE, MergeVersion.MINE, MergeVersion.REPOSITORY});
      models[0] = zipped[0];
      models[1] = zipped[1];
      models[2] = zipped[2];
      if (args.length == 1) {
        resultFile = File.createTempFile("mpstmd", "").getAbsolutePath();
      } else {
        resultFile = args[1];
      }
    } else
    if (args.length == 4 || args.length == 3) {
      models[0] = ModelPersistence.readModel(new FileDataSource(FileSystem.getInstance().getFileByPath(args[0])), false);
      models[1] = ModelPersistence.readModel(new FileDataSource(FileSystem.getInstance().getFileByPath(args[1])), false);
      models[2] = ModelPersistence.readModel(new FileDataSource(FileSystem.getInstance().getFileByPath(args[2])), false);
      if (args.length == 3) {
        resultFile = File.createTempFile("", "").getAbsolutePath();
      } else {
        resultFile = args[3];
      }
    } else {
      System.err.println("There must be 1-4 parameters");
      return;
    }
    final String finalResultFile = resultFile;
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        MergeModelsDialog dialog = ModelAccess.instance().runReadAction(new Computable<MergeModelsDialog>() {
          public MergeModelsDialog compute() {
            return new MergeModelsDialog(new MergeTemporaryModel(models[0], true), new MergeTemporaryModel(models[1], true), new MergeTemporaryModel(models[2], true), new SimpleDiffRequest(TestMergeDialog.ourProject, (SModel[]) null, new String[]{"Local Version", "Merge Result", "Remote Version"}));
          }
        });
        try {
          Field field = dialog.getClass().getDeclaredField("myMergeTree");
          field.setAccessible(true);
          IdeaTestApplication.getInstance(null).setDataProvider((DiffModelTree) field.get(dialog));
        } catch (Exception e) {
          e.printStackTrace();
        }
        dialog.show();
        final org.jetbrains.mps.openapi.model.SModel result = dialog.getResultModelWithFixedId();
        if (result == null) {
          dialog.close(0);
          System.exit(0);
        }
        ModelAccess.instance().runWriteAction(new Runnable() {
          @Override
          public void run() {
            IFile iFile = FileSystem.getInstance().getFileByPath(finalResultFile);
            if (!(iFile.exists())) {
              iFile.createNewFile();
            }
            try {
              ModelPersistence.saveModel(as_jrs6o7_a0a0a0c0a0a0a0f0a0a0a8a7(result, SModelBase.class).getSModelInternal(), new FileDataSource(iFile));
            } catch (IOException ex) {
              if (LOG.isEnabledFor(Priority.ERROR)) {
                LOG.error("Cannot save model.", ex);
              }
            }
          }
        });
        dialog.unregisterModels();
        dialog.close(0);
        Disposer.dispose(TestMergeDialog.myParentDisposable);
        System.exit(0);
      }
    });
  }

  protected static Logger LOG = LogManager.getLogger(TestMergeDialog.class);

  private static <T> T as_jrs6o7_a0a0a0c0a0a0a0f0a0a0a8a7(Object o, Class<T> type) {
    return (type.isInstance(o) ?
      (T) o :
      null
    );
  }
}
