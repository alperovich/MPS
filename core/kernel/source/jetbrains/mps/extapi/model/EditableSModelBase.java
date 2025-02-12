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
package jetbrains.mps.extapi.model;

import jetbrains.mps.extapi.module.SModuleBase;
import jetbrains.mps.extapi.persistence.FileBasedModelRoot;
import jetbrains.mps.extapi.persistence.FileDataSource;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.persistence.DefaultModelRoot;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.ModelRootUtil;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;
import jetbrains.mps.smodel.event.SModelFileChangedEvent;
import jetbrains.mps.smodel.event.SModelRenamedEvent;
import jetbrains.mps.smodel.loading.ModelLoadingState;
import jetbrains.mps.util.FileUtil;
import jetbrains.mps.vfs.IFile;
import org.apache.log4j.LogManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.EditableSModel;
import org.jetbrains.mps.openapi.model.SModelChangeListener;
import org.jetbrains.mps.openapi.model.SModelReference;
import org.jetbrains.mps.openapi.model.SReference;
import org.jetbrains.mps.openapi.persistence.DataSource;
import org.jetbrains.mps.openapi.persistence.ModelRoot;
import org.jetbrains.mps.openapi.persistence.ModelSaveException;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * evgeny, 11/21/12
 */
public abstract class EditableSModelBase extends ReloadableSModelBase implements EditableSModel, EditableSModelDescriptor {

  private static final Logger LOG = Logger.wrap(LogManager.getLogger(EditableSModelBase.class));

  private final List<SModelChangeListener> myChangeListeners = new CopyOnWriteArrayList<SModelChangeListener>();
  private boolean myChanged = false;

  protected EditableSModelBase(@NotNull SModelReference modelReference, @NotNull DataSource source) {
    super(modelReference, source);
  }

  @Override
  public boolean isChanged() {
    return myChanged;
  }

  @Override
  public void setChanged(boolean changed) {
    myChanged = changed;
  }

  @Override
  public void addRootNode(@NotNull org.jetbrains.mps.openapi.model.SNode node) {
    assertCanChange();
    getSModelInternal().addRootNode(node);
    fireNodeAdded(null, null, node);
    setChanged(true);
  }

  @Override
  public void removeRootNode(@NotNull org.jetbrains.mps.openapi.model.SNode node) {
    assertCanChange();
    getSModelInternal().removeRootNode(node);
    fireNodeRemoved(null, null, node);
    setChanged(true);
  }

  @Override
  public boolean isReadOnly() {
    return getSource().isReadOnly();
  }

  @Override
  public final void unload() {
    save();
    if (needsReloading()) {
      throw new IllegalStateException("cannot unload model in a conflicting state");
    }
    if (getCurrentModelInternal() == null) return;

    doUnload();
    fireModelStateChanged(ModelLoadingState.NOT_LOADED);
  }

  protected abstract void doUnload();

  @Override
  public void reloadFromSource() {
    ModelAccess.assertLegalWrite();

    if (getSource().getTimestamp() == -1) {
      SModuleBase module = (SModuleBase) getModule();
      if (module != null) {
        module.unregisterModel(this);
      }
      return;
    }

    reloadContents();
    LOG.assertLog(!needsReloading());
  }

  @Override
  public void reloadFromDiskSafe() {
    ModelAccess.assertLegalWrite();
    if (isChanged()) {
      resolveDiskConflict();
    } else {
      reloadFromSource();
    }
  }

  protected abstract void reloadContents();

  public void resolveDiskConflict() {
    LOG.warning("Model=" + getReference().getModelName() + ", file ts=" + getSource().getTimestamp() + ", model ts=" + getSourceTimestamp(),
        new Throwable());  // more information
    fireConflictDetected();
  }

  public boolean checkAndResolveConflictOnSave() {
    if (needsReloading()) {
      LOG.warning("Model file " + getReference().getModelName() + " was modified externally!\n" +
          "You might want to turn \"Synchronize files on frame activation/deactivation\" option on to avoid conflicts.");
      resolveDiskConflict();
      return false;
    }

    // Paranoid check to avoid saving model during update (hack for MPS-6772)
    if (needsReloading()) return false;
    return true;
  }

  public void changeModelFile(IFile newModelFile) {
    ModelAccess.assertLegalWrite();
    if (!(getSource() instanceof FileDataSource)) {
      throw new UnsupportedOperationException("cannot change model file on non-file data source");
    }

    FileDataSource source = (FileDataSource) getSource();
    if (source.getFile().getPath().equals(newModelFile.getPath())) return;

    IFile oldFile = source.getFile();
    jetbrains.mps.smodel.SModel model = getSModelInternal();
    fireBeforeModelFileChanged(new SModelFileChangedEvent(model.getModelDescriptor(), oldFile, newModelFile));
    source.setFile(newModelFile);
    updateTimestamp();
    fireModelFileChanged(new SModelFileChangedEvent(model.getModelDescriptor(), oldFile, newModelFile));
  }

  @Override
  public final void save() {
    ModelAccess.assertLegalWrite();

    // probably should be changed to assert
    // see MPS-18545 SModel api: createModel(), setChanged(), isLoaded(), save()
    if (!isLoaded()) return;

    //we must be in command since model save might change model by adding model/language imports
    //if (!mySModel.isLoading()) LOG.assertInCommand();

    LOG.info("Saving model " + getModelName());

    if (!checkAndResolveConflictOnSave()) return;

    boolean isSaved = false;
    try {
      boolean reload = saveModel();
      setChanged(false);
      if (reload) {
        reloadContents();
      }
      isSaved = true;
    } catch (IOException e) {
      LOG.error("Can't save " + getModelName() + ": " + e.getMessage(), e);
    } catch (ModelSaveException e) {
      fireProblemsDetected(e.getProblems());
    }

    updateTimestamp();
    if (isSaved) {
      fireModelSaved();
    }
  }

  /**
   * returns true if the content should be reloaded from storage after save
   */
  protected abstract boolean saveModel() throws IOException, ModelSaveException;

  @Override
  public void rename(String newModelName, boolean changeFile) {
    ModelAccess.assertLegalWrite();

    if (changeFile && !(getSource() instanceof FileDataSource)) {
      throw new UnsupportedOperationException("cannot change model file on non-file data source");
    }

    SModelReference oldName = getReference();
    fireBeforeModelRenamed(new SModelRenamedEvent(this, oldName.getModelName(), newModelName));

    // TODO update SModelId (if it contains modelName)
    //if(getReference().getModelId().getModelName() != null) { }
    SModelReference newModelReference = PersistenceFacade.getInstance().createModelReference(getReference().getModuleReference(),
        getReference().getModelId(), newModelName);

    fireBeforeModelRenamed(newModelReference);
    changeModelReference(newModelReference);

    if (!changeFile) {
      save();
    } else {
      IFile oldFile = ((FileDataSource) getSource()).getFile();
      ModelRoot root = ModelRootUtil.getModelRoot(this);
      if (root instanceof DefaultModelRoot) {
        DefaultModelRoot defaultModelRoot = (DefaultModelRoot) root;
        String sourceRoot = null;
        for (String sr : defaultModelRoot.getFiles(FileBasedModelRoot.SOURCE_ROOTS)) {
          if (oldFile.getPath().startsWith(sr)) {
            // using the same sourceRoot
            sourceRoot = sr;
            break;
          }
        }
        try {
          IFile newFile = defaultModelRoot.createSource(newModelName, FileUtil.getExtension(oldFile.getName()), sourceRoot,
              new HashMap<String, String>()).getFile();
          newFile.getParent().mkdirs();
          newFile.createNewFile();
          changeModelFile(newFile);
          save();
          oldFile.delete();
        } catch (IOException e) {
          LOG.error("cannot rename " + getModelName() + ": " + e.getMessage());
          save();
        }
      }
    }

    fireModelRenamed(new SModelRenamedEvent(this, oldName.getModelName(), newModelName));
    fireModelRenamed(oldName);
  }

  @Override
  public void addChangeListener(SModelChangeListener l) {
    myChangeListeners.add(l);
  }

  @Override
  public void removeChangeListener(SModelChangeListener l) {
    myChangeListeners.remove(l);
  }

  public void fireReferenceChanged(SNode node, String role, SReference oldValue, SReference newValue) {
    LOG.assertLog(!getSModelInternal().isUpdateMode());
    for (SModelChangeListener l : myChangeListeners) {
      l.referenceChanged(node, role, oldValue, newValue);
    }
    setChanged(true);
  }

  public void firePropertyChanged(SNode node, String propertyName, String oldValue, String newValue) {
    LOG.assertLog(!getSModelInternal().isUpdateMode());
    for (SModelChangeListener l : myChangeListeners) {
      l.propertyChanged(node, propertyName, oldValue, newValue);
    }
    setChanged(true);
  }

  public void fireNodeAdded(SNode node, String role, org.jetbrains.mps.openapi.model.SNode child) {
    LOG.assertLog(!getSModelInternal().isUpdateMode());
    for (SModelChangeListener l : myChangeListeners) {
      l.nodeAdded(this, node, role, child);
    }
    setChanged(true);
  }

  public void fireNodeRemoved(SNode node, String role, org.jetbrains.mps.openapi.model.SNode child) {
    LOG.assertLog(!getSModelInternal().isUpdateMode());
    for (SModelChangeListener l : myChangeListeners) {
      l.nodeRemoved(this, node, role, child);
    }
    setChanged(true);
  }

  public String toString() {
    return getReference().toString() + " in " + getSource().getLocation();
  }
}
