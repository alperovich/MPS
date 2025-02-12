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
package jetbrains.mps.library;

import jetbrains.mps.library.ModulesMiner.ModuleHandle;
import org.jetbrains.mps.openapi.util.ProgressMonitor;
import jetbrains.mps.project.AbstractModule;
import org.jetbrains.mps.openapi.module.SModule;
import jetbrains.mps.smodel.MPSModuleOwner;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.ModuleRepositoryFacade;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.vfs.FileSystemListener;
import jetbrains.mps.vfs.IFile;
import org.jetbrains.mps.openapi.module.SModule;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/**
 * evgeny, 11/3/12
 */
class SLibrary implements FileSystemListener, MPSModuleOwner {

  private final IFile file;
  private final ClassLoader parent;
  private final boolean isHidden;
  private AtomicReference<List<ModuleHandle>> myHandles = new AtomicReference<List<ModuleHandle>>();

  SLibrary(IFile file, ClassLoader parent, boolean hidden) {
    this.file = file;
    this.parent = parent;
    this.isHidden = hidden;
  }

  public IFile getFile() {
    return file;
  }

  public List<ModuleHandle> getHandles() {
    List<ModuleHandle> moduleHandles = myHandles.get();
    if (moduleHandles == null) return Collections.emptyList();
    return moduleHandles;
  }

  void attach(boolean refreshFiles) {
    update(refreshFiles);
    FileSystem.getInstance().addListener(this);
  }

  void dispose() {
    FileSystem.getInstance().removeListener(this);
    ModuleRepositoryFacade.getInstance().unregisterModules(this);
  }

  @Override
  public IFile getFileToListen() {
    return file;
  }

  @Override
  public Iterable<FileSystemListener> getListenerDependencies() {
    return null;
  }

  @Override
  public void update(ProgressMonitor monitor, FileSystemEvent event) {
    boolean changed = false;
    for (IFile f : event.getChanged()) {
      if (ModulesMiner.getInstance().isModuleFile(f)) {
        changed = true;
      }
    }
    for (IFile f : event.getCreated()) {
      if (ModulesMiner.getInstance().isModuleFile(f)) {
        changed = true;
      }
    }
    if (changed) {
      update(false);
    }
  }

  void update(boolean refreshFiles) {
    ModelAccess.assertLegalWrite();

    List<ModuleHandle> moduleHandles = Collections.unmodifiableList(ModulesMiner.getInstance().collectModules(file, refreshFiles));
    myHandles.set(moduleHandles);
    List<SModule> loaded = new ArrayList<SModule>();
    for (ModuleHandle moduleHandle : moduleHandles) {
      SModule module = ModuleRepositoryFacade.createModule(moduleHandle, this);
      if (module != null) {
        loaded.add(module);
      }
    }
    for (SModule module : loaded) {
      ((AbstractModule) module).onModuleLoad();
    }
  }

  @Override
  public boolean isHidden() {
    return isHidden;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    SLibrary library = (SLibrary) o;

    if (isHidden != library.isHidden) return false;
    if (parent != null ? !parent.equals(library.parent) : library.parent != null) return false;
    if (!file.equals(library.file)) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = file.hashCode();
    result = 31 * result + (parent != null ? parent.hashCode() : 0);
    result = 31 * result + (isHidden ? 1 : 0);
    return result;
  }
}
