package jetbrains.mps.vcs.platform.mergedriver;

/*Generated by MPS */

import java.util.Arrays;
import com.intellij.openapi.application.PathManager;
import java.io.File;
import com.intellij.openapi.project.Project;
import jetbrains.mps.ide.ThreadUtils;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.progress.ProgressIndicator;
import org.jetbrains.mps.openapi.util.ProgressMonitor;
import jetbrains.mps.progress.ProgressMonitorAdapter;
import jetbrains.mps.util.FileUtil;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import org.apache.log4j.Priority;
import com.intellij.ide.plugins.IdeaPluginDescriptor;
import com.intellij.ide.plugins.PluginManager;
import com.intellij.openapi.extensions.PluginId;
import jetbrains.mps.internal.collections.runtime.ISelector;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.LinkedHashSet;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public abstract class MergeDriverPacker {
  private static MergeDriverPacker ourInstance;
  private static final Iterable<String> mpsLibJars = Arrays.asList("mps-closures.jar", "mps-collections.jar", "mps-tuples.jar", "mps-core.jar", "mps-openapi.jar");
  protected static Iterable<String> mpsAddJars = Arrays.asList("diffutils-1.2.1.jar");
  private static final Iterable<String> ideaLibJars = Arrays.asList("asm4-all.jar", "xstream-1.4.3.jar", "guava-12.0.jar", "jdom.jar", "log4j.jar", "trove4j.jar", "annotations.jar", "commons-logging-1.1.1.jar");
  private static final Iterable<String> svnJars = Arrays.asList("svnkit.jar", "sequence-library.jar");
  private static final String MERGEDRIVER_PATH = "mergedriver";
  private static final String MERGER_RT = "merger-rt.jar";
  private Boolean myFromSources = null;

  public MergeDriverPacker() {
  }

  public String getPath() {
    return PathManager.getConfigPath() + File.separator + MERGEDRIVER_PATH;
  }

  private File getFile() {
    return new File(getPath());
  }

  public void pack(final Project project) {
    ThreadUtils.runInUIThreadAndWait(new Runnable() {
      public void run() {
        ProgressManager.getInstance().run(new Task.Modal(project, "Installing", false) {
          public void run(@NotNull ProgressIndicator indicator) {
            ProgressMonitor monitor = new ProgressMonitorAdapter(indicator);
            monitor.start("Installing vcs add-ons", 4);
            monitor.step("Deleting old files");
            File tmpDir = FileUtil.createTmpDir();
            FileUtil.delete(getFile());

            Iterable<String> classpathDirs = getClasspath(false);
            Iterable<String> classPathJars = Sequence.fromIterable(classpathDirs).where(new IWhereFilter<String>() {
              public boolean accept(String cpd) {
                return cpd.endsWith(".jar");
              }
            });
            monitor.step("Packing new merge driver");
            internalPack(classPathJars, tmpDir, false);

            if (isFromSources()) {
              Iterable<String> classpathInternal = Sequence.fromIterable(classpathDirs).where(new IWhereFilter<String>() {
                public boolean accept(String cpd) {
                  return !(cpd.endsWith(".jar"));
                }
              });
              File tmpDirRT = FileUtil.createTmpDir();
              internalPack(classpathInternal, tmpDirRT, true);
              FileUtil.zip(tmpDirRT, new File(tmpDir + File.separator + MERGER_RT));
              FileUtil.delete(tmpDirRT);
            }
            monitor.step("Installing merge driver");
            FileUtil.copyDir(tmpDir, getFile());
            monitor.step("Deleting temporary files");
            FileUtil.delete(tmpDir);
          }
        });
      }
    });
  }

  private void internalPack(Iterable<String> classpathDirs, File tmpDir, boolean isForZip) {
    for (String classpathDir : Sequence.fromIterable(classpathDirs)) {
      File file = new File(classpathDir);
      if (file.exists()) {
        if (file.isDirectory()) {
          FileUtil.copyDir(file, tmpDir);
        } else {
          FileUtil.copyFile(file, tmpDir);
        }
      } else {
        if (LOG.isEnabledFor(Priority.ERROR)) {
          LOG.error("couldn't find class path: " + classpathDir);
        }
      }
    }
    // Workaround for rare case when MPS build is invoked with internal flag (MPS-13819) 
    if (isForZip && Sequence.fromIterable(classpathDirs).isEmpty()) {
      FileUtil.write(new File(tmpDir, "dummy.txt"), new byte[0]);
    }
  }

  private Iterable<String> getSvnJars() {
    final IdeaPluginDescriptor svnPlugin = PluginManager.getPlugin(PluginId.getId("Subversion"));
    if (svnPlugin != null) {
      return Sequence.fromIterable(svnJars).select(new ISelector<String, String>() {
        public String select(String it) {
          return svnPlugin.getPath() + File.separator + "lib" + File.separator + it;
        }
      });
    }
    return null;
  }

  protected String getVCSCorePluginPath() {
    IdeaPluginDescriptor vcsCorePlugin = PluginManager.getPlugin(PluginId.getId("jetbrains.mps.vcs"));
    assert vcsCorePlugin != null;
    return vcsCorePlugin.getPath().getPath();
  }

  protected abstract String getMPSCorePath();

  protected abstract Set<String> getClasspathInternal();

  protected abstract String getVCSCoreFileName();

  public Set<String> getClasspath(boolean withSvnkit) {
    Set<String> classpathItems = SetSequence.fromSet(new LinkedHashSet<String>());
    if (isFromSources()) {
      SetSequence.fromSet(classpathItems).addSequence(SetSequence.fromSet(getClasspathInternal()));
    } else {
      final String mpsCorePath = getMPSCorePath();
      SetSequence.fromSet(classpathItems).addSequence(Sequence.fromIterable(mpsLibJars).select(new ISelector<String, String>() {
        public String select(String it) {
          return mpsCorePath + File.separator + it;
        }
      }));
      SetSequence.fromSet(classpathItems).addSequence(Sequence.fromIterable(mpsAddJars).select(new ISelector<String, String>() {
        public String select(String it) {
          return mpsCorePath + File.separator + it;
        }
      }));
      SetSequence.fromSet(classpathItems).addElement(getVCSCorePluginPath() + File.separator + "lib" + File.separator + getVCSCoreFileName());
    }

    SetSequence.fromSet(classpathItems).addSequence(Sequence.fromIterable(ideaLibJars).select(new ISelector<String, String>() {
      public String select(String it) {
        return PathManager.getLibPath() + File.separator + it;
      }
    }));
    SetSequence.fromSet(classpathItems).addSequence(Sequence.fromIterable(getSvnJars()));
    return classpathItems;
  }

  private boolean isFromSources() {
    if (myFromSources == null) {
      myFromSources = !(new File(getMPSCorePath() + File.separator + Sequence.fromIterable(mpsLibJars).first()).exists());
    }
    return myFromSources;
  }

  public static MergeDriverPacker getInstance() {
    return ourInstance;
  }

  protected static void setInstance(MergeDriverPacker instance) {
    ourInstance = instance;
  }

  protected static Logger LOG = LogManager.getLogger(MergeDriverPacker.class);
}
