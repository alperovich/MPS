/*
 * Copyright 2003-2012 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.mps.extapi.persistence;

import org.jetbrains.mps.openapi.util.ProgressMonitor;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.util.FileUtil;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.vfs.FileSystemListener;
import jetbrains.mps.vfs.IFile;
import org.jetbrains.mps.openapi.persistence.Memento;

import java.util.*;

/**
 * evgeny, 12/11/12
 */
public abstract class FileBasedModelRoot extends ModelRootBase implements FileSystemListener {

  public static final String EXCLUDED = "excluded";
  public static final String SOURCE_ROOTS = "sourceRoot";

  private String contentRoot;
  private Map<String, List<String>> filesForKind = new HashMap<String, List<String>>();
  private final List<PathListener> myListeners = new ArrayList<PathListener>();

  protected FileBasedModelRoot() {
    this(new String[]{SOURCE_ROOTS, EXCLUDED});
  }

  protected FileBasedModelRoot(String[] supportedFileKinds) {
    for (String kind : supportedFileKinds) {
      filesForKind.put(kind, new ArrayList<String>());
    }
  }

  public final String getContentRoot() {
    return contentRoot;
  }

  public final void setContentRoot(String path) {
    checkNotRegistered();

    this.contentRoot = path;
  }

  public final Collection<String> getSupportedFileKinds() {
    return new ArrayList<String>(filesForKind.keySet());
  }

  public final Collection<String> getFiles(String kind) {
    List<String> strings = filesForKind.get(kind);
    return strings == null ? Collections.<String>emptyList() : new ArrayList<String>(strings);
  }

  public final boolean containsFile(String kind, String file) {
    List<String> strings = filesForKind.get(kind);
    if (strings == null) {
      return false;
    }
    return strings.contains(file);
  }

  public final void addFiles(String kind, Collection<String> files) {
    checkNotRegistered();

    if (!filesForKind.containsKey(kind)) {
      throw new IllegalArgumentException("unknown kind");
    }
    if (files == null || files.isEmpty()) {
      return;
    }

    filesForKind.get(kind).addAll(files);
  }

  public final void addFile(String kind, String file) {
    addFiles(kind, Arrays.asList(file));
  }

  public final void deleteFile(String kind, String file) {
    checkNotRegistered();

    if (!filesForKind.containsKey(kind)) {
      throw new IllegalArgumentException("unknown kind");
    }

    filesForKind.get(kind).remove(file);
  }

  public final void clearFiles(String kind) {
    checkNotRegistered();

    if (!filesForKind.containsKey(kind)) {
      throw new IllegalArgumentException("unknown kind");
    }

    filesForKind.get(kind).clear();
  }

  @Override
  public String getPresentation() {
    return (getContentRoot() != null ? getContentRoot() : "no path") + " (" + getType() + ")";
  }

  public boolean supportsFiles(String kind) {
    return false;
  }

  public String getKindText(String kind) {
    if (kind.equals(EXCLUDED)) {
      return "Excluded Folders";
    } else if (kind.equals(SOURCE_ROOTS)) {
      return "Model Folders";
    }
    return null;
  }

  @Override
  public final void save(Memento memento) {
    memento.put("contentPath", contentRoot);
    memento.put("type", getType());
    for (String kind : getSupportedFileKinds()) {
      List<String> files = filesForKind.get(kind);

      for (String s : files) {
        Memento modelRoot = memento.createChild(kind);
        if (s.equals(contentRoot)) {
          modelRoot.put("location", ".");
        } else if (s.startsWith(contentRoot + "/")) {
          modelRoot.put("location", s.substring(contentRoot.length() + 1));
        } else {
          modelRoot.put("path", s);
        }
      }
    }
  }

  @Override
  public final void load(Memento memento) {
    checkNotRegistered();

    contentRoot = FileUtil.stripLastSlashes(memento.get("contentPath"));
    for (String kind : getSupportedFileKinds()) {
      List<String> files = filesForKind.get(kind);
      files.clear();
      for (Memento root : memento.getChildren(kind)) {
        String relPath = root.get("location");
        if (relPath != null) {
          if (relPath.equals(".")) {
            files.add(contentRoot);
          } else {
            files.add(contentRoot + "/" + relPath);
          }
        } else {
          files.add(root.get("path"));
        }
      }
    }
  }

  @Override
  public void attach() {
    ModelAccess.assertLegalWrite();
    super.attach();

    for (String kind : getSupportedFileKinds()) {
      if (EXCLUDED.equals(kind)) continue;

      for (String path : filesForKind.get(kind)) {
        IFile file = FileSystem.getInstance().getFileByPath(path);
        PathListener listener = new PathListener(file);
        myListeners.add(listener);
        FileSystem.getInstance().addListener(listener);
      }
    }
  }

  @Override
  public void dispose() {
    for (PathListener pathListener : myListeners) {
      FileSystem.getInstance().removeListener(pathListener);
    }
    myListeners.clear();
    super.dispose();
  }

  @Override
  public final IFile getFileToListen() {
    throw new UnsupportedOperationException();
  }

  @Override
  public Iterable<FileSystemListener> getListenerDependencies() {
    if (getModule() instanceof FileSystemListener) {
      return Collections.singleton((FileSystemListener) getModule());
    }
    return null;
  }

  @Override
  public void update(ProgressMonitor monitor, FileSystemEvent event) {
    update();
  }

  @Override
  public final boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    FileBasedModelRoot that = (FileBasedModelRoot) o;

    if (contentRoot != null ? !contentRoot.equals(that.contentRoot) : that.contentRoot != null) return false;
    if (filesForKind != null ? !filesForKind.equals(that.filesForKind) : that.filesForKind != null) return false;

    return true;
  }

  @Override
  public final int hashCode() {
    int result = contentRoot != null ? contentRoot.hashCode() : 0;
    result = 31 * result + (filesForKind != null ? filesForKind.hashCode() : 0);
    return result;
  }

  private final class PathListener implements FileSystemListener {
    private IFile path;

    private PathListener(IFile path) {
      this.path = path;
    }

    @Override
    public IFile getFileToListen() {
      return path;
    }

    @Override
    public Iterable<FileSystemListener> getListenerDependencies() {
      return FileBasedModelRoot.this.getListenerDependencies();
    }

    @Override
    public void update(ProgressMonitor monitor, FileSystemEvent event) {
      event.notify(FileBasedModelRoot.this);
    }
  }
}
