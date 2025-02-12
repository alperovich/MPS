/*
 * Copyright 2003-2011 JetBrains s.r.o.
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
package jetbrains.mps.project;

import jetbrains.mps.classloading.ClassLoaderManager;
import jetbrains.mps.extapi.persistence.FolderModelRootBase;
import jetbrains.mps.persistence.PersistenceRegistry;
import jetbrains.mps.project.structure.model.ModelRoot;
import jetbrains.mps.project.structure.model.ModelRootDescriptor;
import jetbrains.mps.smodel.LanguageID;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.smodel.SModelFqName;
import jetbrains.mps.smodel.persistence.IModelRootManager;
import jetbrains.mps.smodel.persistence.InvalidModelRootManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.mps.openapi.model.SModelId;
import org.jetbrains.mps.openapi.module.SModule;
import org.jetbrains.mps.openapi.persistence.Memento;

import java.util.Collection;
import java.util.Collections;

/**
 * @deprecated used to adapt obsolete IModelRootManagers to the new ModelRoot interface
 *             default models are loaded by DefaultModelRoot
 *             java stubs are handled by JavaClassStubsModelRoot
 *             consider ModelRootBase/FolderModelRootBase as base classes for new ModelRoots
 */
@Deprecated
public class SModelRoot extends FolderModelRootBase {
  @NotNull
  private ModelRoot myModelRoot;
  private IModelRootManager myManager;

  public SModelRoot() {
    myModelRoot = new ModelRoot(null, null);
    myManager = createManager();
  }

  @Override
  public String getType() {
    return PersistenceRegistry.OBSOLETE_MODEL_ROOT;
  }

  private IModelRootManager createManager() {
    if (myModelRoot.getManager() != null) {
      if (LanguageID.JAVA_MANAGER.equals(myModelRoot.getManager())) {
        throw new IllegalStateException("SModelRoot cannot handle java stubs");
      }
      String moduleId = myModelRoot.getManager().getModuleId();
      String className = myModelRoot.getManager().getClassName();
      return create(moduleId, className);
    }
    return new InvalidModelRootManager(null, null, "no model root manager");
  }

  private IModelRootManager getManager() {
    return myManager;
  }

  @Override
  public String getPath() {
    return myModelRoot.getPath();
  }

  @Override
  public void setPath(String newPath) {
    checkNotRegistered();
    myModelRoot.setPath(newPath);
  }

  public ModelRoot getModelRoot() {
    return myModelRoot;
  }

  @Override
  public String getPresentation() {
    return getPath() + " (using " + getManager().getClass().getSimpleName() + ")";
  }

  @Override
  public SModel getModel(SModelId id) {
    // TODO implement
    return null;
  }

  @Override
  public Iterable<SModel> loadModels() {
    IModelRootManager manager = getManager();
    //model with model root manager not yet loaded - should be loaded after classes reloading
    if (manager == null) return Collections.emptyList();

    Collection<SModel> models = manager.load(this);
    return (Iterable) models;
  }

  @Override
  public boolean canCreateModels() {
    return super.canCreateModels() && getManager().canCreateModel(this, null);
  }

  @Override
  public boolean canCreateModel(String modelName) {
    return getManager().canCreateModel(this, SModelFqName.fromString(modelName));
  }

  @Override
  public SModel createModel(String modelName) {
    SModel model = getManager().createModel(this, SModelFqName.fromString(modelName));
    if (model != null) {
      register(model);
    }
    return model;
  }

  @Override
  public void save(Memento memento) {
    myModelRoot.save(memento);
  }

  @Override
  public void load(Memento memento) {
    checkNotRegistered();

    myModelRoot.load(memento);
    myManager = createManager();
  }

  @Deprecated
  public ModelRootDescriptor toDescriptor() {
    ModelRootDescriptor result = new ModelRootDescriptor();
    save(result.getMemento());
    return result;
  }


  private static IModelRootManager create(String moduleId, String className) {
    SModule mod = MPSModuleRepository.getInstance().getModuleById(ModuleId.fromString(moduleId));
    if (mod == null) {
      return new InvalidModelRootManager(moduleId, className, "module is absent");
    }
    if (!ClassLoaderManager.getInstance().canLoad(mod)) {
      return new InvalidModelRootManager(moduleId, className, "module is not classloading");
    }

    Class managerClass = ClassLoaderManager.getInstance().getClass(mod, className);
    if (managerClass == null) {
      return new InvalidModelRootManager(moduleId, className, "class is absent");
    }

    try {
      return (IModelRootManager) managerClass.newInstance();
    } catch (Throwable t) {
      return new InvalidModelRootManager(moduleId, className, "exception: " + t.getMessage());
    }
  }

  @Override
  public void update() {
    assert isRegistered();
    if (myManager instanceof InvalidModelRootManager) {
      // try to recreate
      IModelRootManager n = createManager();
      if (!(n instanceof InvalidModelRootManager)) {
        myManager = n;
      }
    }
    super.update();
  }

  @Deprecated
  public boolean isInvalid() {
    return myManager instanceof IModelRootManager;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    SModelRoot that = (SModelRoot) o;

    if (!myModelRoot.equals(that.myModelRoot)) return false;

    return true;
  }

  @Override
  public int hashCode() {
    return myModelRoot.hashCode();
  }
}
