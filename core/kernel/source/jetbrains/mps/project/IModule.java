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

import org.jetbrains.mps.openapi.module.SModule;
import jetbrains.mps.project.dependency.modules.DependenciesManager;
import jetbrains.mps.project.structure.modules.Dependency;
import jetbrains.mps.project.structure.modules.ModuleDescriptor;
import org.jetbrains.mps.openapi.module.SModuleReference;
import jetbrains.mps.reloading.IClassPathItem;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.Language;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.vfs.IFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.persistence.ModelRoot;

import java.util.Collection;
import java.util.List;

public interface IModule extends SModule {
  // ?, move to AbstractModule, remove usages as much as possible
  // up reasonable getters to SModule
  ModuleDescriptor getModuleDescriptor();

  /**
   * Remove all usages of this method?
   *
   * @see org.jetbrains.mps.openapi.module.SModule#getUsedLanguages()
   * @see jetbrains.mps.project.dependency.GlobalModuleDependenciesManager
   * @see SModule#resolveInDependencies(org.jetbrains.mps.openapi.model.SModelId)
   */
  @Deprecated
  @NotNull
  IScope getScope();

  // cast to AbstractModule to use this methods
  void addDependency(SModuleReference moduleRef, boolean reexport);

  void addUsedLanguage(SModuleReference langRef);

  void addUsedDevkit(SModuleReference devkitRef);

  void onModuleLoad();

  void attach();

  void dispose();

  IFile getDescriptorFile();

  void setModuleDescriptor(ModuleDescriptor moduleDescriptor, boolean reloadClasses);

  // migrate by renaming

  /**
   * @see SModule#getModuleName
   */
  @Deprecated
  String getModuleFqName();

  /**
   * @see org.jetbrains.mps.openapi.module.SModule#getModels()
   */
  @Deprecated
  List<SModel> getOwnModelDescriptors();

  // ----- deprecated part

  /**
   * @see jetbrains.mps.project.structure.modules.ModuleDescriptor#getUsedDevkits()
   */
  Collection<SModuleReference> getUsedDevkitReferences();

  /**
   * @see org.jetbrains.mps.openapi.module.SModule#getUsedLanguages()
   * @see org.jetbrains.mps.openapi.module.SModule#getDeclaredDependencies()
   */
  @Deprecated
  DependenciesManager getDependenciesManager();

  /**
   * @see org.jetbrains.mps.openapi.module.SModule#getUsedLanguages()
   */
  @Deprecated
  Collection<SModuleReference> getUsedLanguagesReferences();

  /**
   * @see org.jetbrains.mps.openapi.module.SModule#getDeclaredDependencies()
   */
  @Deprecated
  List<Dependency> getDependencies();

  /**
   * Do nothing for now. If method change dependencies it invalidates cache by calling dependenciesChanged()
   */
  @Deprecated
  void invalidateDependencies();

  @Deprecated
  void invalidateCaches();

  /**
   * ??? bundle home == jar or folder with module sources. Meaningless stuff
   *
   * @see jetbrains.mps.project.AbstractModule#getModuleSourceDir()
   * @see jetbrains.mps.project.AbstractModule#getDescriptorFile()
   */
  @Deprecated
  IFile getBundleHome();

  // reload descriptor stuff, now all these methods need AbstractModule, for ConflictableModuleAdapter I think

  /**
   * @see SModuleOperations#needReloading(AbstractModule)
   */
  @Deprecated
  boolean needReloading();

  /**
   * @see SModuleOperations#reloadFromDisk(AbstractModule)
   */
  @Deprecated
  void reloadFromDisk(boolean reloadClasses);

  // EditableSModule part. Cast to EditableSModule when needed
  @Deprecated
  boolean isChanged();

  @Deprecated
  void setChanged();

  @Deprecated
  void save();

  // JavaModuleFacet part. Use module.getFacet(JavaModuleFacet.class).{method}
  @Deprecated
  IClassPathItem getClassPathItem();

  @Deprecated
  IFile getClassesGen();

  @Deprecated
  boolean isCompileInMPS();

  @Deprecated
  List<String> getSourcePaths();

  /**
   * @see jetbrains.mps.project.facets.JavaModuleOperations#collectCompileClasspath instead
   */
  @Deprecated
  IClassPathItem getModuleWithDependenciesClassPathItem();

  // IClassLoadingModule part. Use ClassLoaderManager instead

  /**
   * @see jetbrains.mps.classloading.ClassLoaderManager#getClass(org.jetbrains.mps.openapi.module.SModule, String)
   */
  @Deprecated
  Class getClass(String className);

  /**
   * @see jetbrains.mps.classloading.ClassLoaderManager#canLoad(org.jetbrains.mps.openapi.module.SModule)
   */
  @Deprecated
  boolean reloadClassesAfterGeneration();

  // other methods

  /**
   * If you need just model: use root.createModel
   * If you need model with adjustments (auto imports, optimized imports, etc): use SModuleOperations#createModelWithAdjustments
   *
   * @see SModuleOperations#createModelWithAdjustments(String, org.jetbrains.mps.openapi.persistence.ModelRoot)
   */
  @Deprecated
  SModel createModel(String fqName, ModelRoot root, @Nullable ModelAdjuster adj);

  /**
   * Create model through modelRoot.createModel, apply adjuster, and register model in repository after this operations
   */
  @Deprecated
  public static interface ModelAdjuster {
    void adjust(SModel model);
  }

  /**
   * Remove this method after SModuleReference -> SModuleReference migration
   */
  @Override
  @NotNull
  SModuleReference getModuleReference();

  /**
   * Simple way: use SModuleOperations#getOutputPathFor
   * Right way: use AbstractModule#getOutputPath or TestsFacet#getOutputPath instead
   *
   * @see SModuleOperations#getOutputPathFor(org.jetbrains.mps.openapi.model.SModel)
   */
  @Deprecated
  String getOutputFor(org.jetbrains.mps.openapi.model.SModel model);

  /**
   * @see jetbrains.mps.project.AbstractModule#getOutputPath()
   */
  @Deprecated
  String getGeneratorOutputPath();

  /**
   * @see jetbrains.mps.project.facets.TestsFacet#getTestsOutputPath()
   */
  @Deprecated
  String getTestsGeneratorOutputPath();

  /**
   * This method always returns empty list. All auto imported models added to model in model creation
   *
   * @see ModelsAutoImportsManager
   */
  @Deprecated
  Collection<SModel> getImplicitlyImportedModelsFor(SModel sm);

  /**
   * This method always returns empty list. All auto imported languages added to model in model creation
   *
   * @see ModelsAutoImportsManager
   */
  @Deprecated
  Collection<Language> getImplicitlyImportedLanguages(SModel sm);

  /**
   * @see SModuleOperations#getIndexablePaths
   */
  @Deprecated
  Collection<String> getIndexablePaths();
}
