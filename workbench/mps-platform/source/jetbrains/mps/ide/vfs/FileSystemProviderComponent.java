package jetbrains.mps.ide.vfs;

import com.intellij.openapi.components.ApplicationComponent;
import jetbrains.mps.MPSCore;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.vfs.FileSystemProvider;
import org.jetbrains.annotations.NotNull;

/**
 * danilla 8/7/13
 */

abstract public class FileSystemProviderComponent implements ApplicationComponent, FileSystemProvider {
  // component stuff
  @Override
  public void initComponent() {
    boolean useIoFile = MPSCore.getInstance().isTestMode() && "true".equals(System.getProperty("mps.vfs.useIoFile"));
    if (!useIoFile) {
      // setup filesystem provider
      FileSystem.getInstance().setFileSystemProvider(this);
    }
  }

  @Override
  public void disposeComponent() {
  }

  @NotNull
  @Override
  abstract public String getComponentName();
}
