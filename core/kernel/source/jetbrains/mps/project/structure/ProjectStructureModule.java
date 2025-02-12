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
package jetbrains.mps.project.structure;

import jetbrains.mps.components.CoreComponent;
import jetbrains.mps.extapi.model.SModelBase;
import jetbrains.mps.generator.TransientModelNodeFinder;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.project.AbstractModule;
import jetbrains.mps.project.DevKit;
import jetbrains.mps.project.Solution;
import jetbrains.mps.project.structure.modules.ModuleDescriptor;
import jetbrains.mps.project.structure.stub.ProjectStructureBuilder;
import jetbrains.mps.smodel.BaseMPSModuleOwner;
import jetbrains.mps.smodel.BaseSpecialModelDescriptor;
import jetbrains.mps.smodel.BootstrapLanguages;
import jetbrains.mps.smodel.FastNodeFinder;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.MPSModuleOwner;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.ModuleRepositoryFacade;
import jetbrains.mps.smodel.NodeReadAccessCasterInEditor;
import jetbrains.mps.smodel.SModelFqName;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.smodel.language.ConceptRepository;
import jetbrains.mps.smodel.nodeidmap.ForeignNodeIdMap;
import jetbrains.mps.vfs.IFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.language.SLanguage;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.mps.openapi.model.SModelId;
import org.jetbrains.mps.openapi.model.SModelReference;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.module.SModule;
import org.jetbrains.mps.openapi.module.SModuleAdapter;
import org.jetbrains.mps.openapi.module.SModuleId;
import org.jetbrains.mps.openapi.module.SModuleListener;
import org.jetbrains.mps.openapi.module.SRepositoryAdapter;
import org.jetbrains.mps.openapi.module.SRepositoryListener;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * evgeny, 3/18/11
 */
public class ProjectStructureModule extends AbstractModule implements CoreComponent {

  private static final String MODULE_REF = "642f71f8-327a-425b-84f9-44ad58786d27(jetbrains.mps.lang.project.modules)";

  private Map<SModelId, ProjectStructureSModelDescriptor> myModels = new ConcurrentHashMap<SModelId, ProjectStructureSModelDescriptor>();

  private static ProjectStructureModule INSTANCE;
  private final MPSModuleOwner myOwner = new BaseMPSModuleOwner() {
  };
  private final SModuleListener myModuleListener = new SModuleAdapter() {

  };
  private final SRepositoryListener myListener = new SRepositoryAdapter() {
    @Override
    public void moduleAdded(SModule module) {
      refreshModule(module, false);
      module.addModuleListener(myModuleListener);
    }

    @Override
    public void beforeModuleRemoved(SModule module) {
      module.removeModuleListener(myModuleListener);
      refreshModule(module, true);
    }
  };

  public static ProjectStructureModule getInstance() {
    return INSTANCE;
  }

  public ProjectStructureModule(MPSModuleRepository repository, SModelRepository modelRepository) {
    setModuleReference(PersistenceFacade.getInstance().createModuleReference(MODULE_REF));
  }

  private void refreshModule(SModule module, boolean isDeleted) {
    ModelAccess.assertLegalWrite();

    if (!(module instanceof Solution || module instanceof Language || module instanceof DevKit)) {
      return;
    }

    SModelReference ref = getSModelReference(module);
    if (isDeleted) {
      ProjectStructureSModelDescriptor descriptor = myModels.get(ref.getModelId());
      if (descriptor != null) {
        removeModel(descriptor);
      }
    } else if (myModels.containsKey(ref.getModelId())) {
      ProjectStructureSModelDescriptor descriptor = myModels.get(ref.getModelId());
      descriptor.dropModel();
    } else {
      createModel(module);
    }
  }

  public SModel getModelByModule(SModule module) {
    ModelAccess.assertLegalRead();

    if (module == null) return null;
    SModelReference ref = getSModelReference(module);

    ProjectStructureSModelDescriptor descriptor = myModels.get(ref.getModelId());
    return descriptor == null ? null : descriptor;
  }

  @Override
  public void init() {
    if (INSTANCE != null) {
      throw new IllegalStateException("double initialization");
    }

    INSTANCE = this;
    MPSModuleRepository.getInstance().addRepositoryListener(myListener);
    ModelAccess.instance().runWriteAction(new Runnable() {
      @Override
      public void run() {
        MPSModuleRepository.getInstance().registerModule(ProjectStructureModule.this, myOwner);
      }
    });
  }

  @Override
  //it is disposed as CoreComponent
  public void dispose() {
    if (INSTANCE == null) return;
    INSTANCE = null;
    clearAll();
    ModelAccess.instance().runWriteAction(new Runnable() {
      @Override
      public void run() {
        MPSModuleRepository.getInstance().unregisterModule(ProjectStructureModule.this, myOwner);
      }
    });
    MPSModuleRepository.getInstance().removeRepositoryListener(myListener);
  }

  public void clearAll() {
    ModelAccess.instance().runWriteAction(new Runnable() {
      @Override
      public void run() {
        removeAll();
        dependenciesChanged();
        myModels.clear();
      }
    });
  }

  private void removeAll() {
    List<SModel> models = this.getProjectStructureModels();
    for (SModel model : models) {
      removeModel(model);
    }
  }

  @Override
  public Set<SLanguage> getUsedLanguages() {
    return Collections.singleton(
        ConceptRepository.getInstance().getLanguage(BootstrapLanguages.PROJECT_NAMESPACE));
  }

  private void removeModel(SModel md) {
    if (myModels.remove(md.getReference().getModelId()) != null) {
      unregisterModel((SModelBase) md);
      if (md instanceof ProjectStructureSModelDescriptor) {
        ((ProjectStructureSModelDescriptor) md).dropModel();
      }
    }
  }

  public ProjectStructureSModelDescriptor createModel(SModule module) {
    ProjectStructureSModelDescriptor result = new ProjectStructureSModelDescriptor(getSModelReference(module), module);
    myModels.put(result.getReference().getModelId(), result);
    registerModel(result);
    return result;
  }

  private static SModelFqName getModelFqName(SModule module) {
    return new SModelFqName(PersistenceFacade.getInstance().createModuleReference(MODULE_REF).getModuleName(), "module." + module.getModuleName(),
        SModelStereotype.getStubStereotypeForId("project"));
  }

  private static SModelReference getSModelReference(SModule module) {
    SModelFqName fqName = getModelFqName(module);
    SModuleId moduleId = module.getModuleReference().getModuleId();
    SModelId id = moduleId != null ? jetbrains.mps.smodel.SModelId.foreign("project", moduleId.toString()) : null;
    return new jetbrains.mps.smodel.SModelReference(fqName, id);
  }

  public String toString() {
    return getModuleName();
  }

  public List<SModel> getProjectStructureModels() {
    return new ArrayList<SModel>(myModels.values());
  }

  @Override
  protected ModuleScope createScope() {
    return new ProjectStructureModuleScope();
  }

  @Override
  protected void collectFacetTypes(Set<String> types) {
    // none
  }

  public class ProjectStructureModuleScope extends ModuleScope {
    @Override
    protected Set<SModule> getInitialModules() {
      Set<SModule> result = new HashSet<SModule>();
      result.add(ProjectStructureModule.this);
      return result;
    }
  }

  @Override
  public SModel resolveInDependencies(SModelId ref) {
    return myModels.get(ref);
  }

  public class ProjectStructureSModelDescriptor extends BaseSpecialModelDescriptor {
    private final SModule myModule;

    private ProjectStructureSModelDescriptor(SModelReference ref, SModule module) {
      super(ref);
      myModule = module;
    }

    @Override
    protected ProjectStructureSModel createModel() {
      final ProjectStructureSModel model = new ProjectStructureSModel(getSModelReference());
      final ModuleDescriptor moduleDescriptor = ((AbstractModule) myModule).getModuleDescriptor();
      final IFile file = ((AbstractModule) myModule).getDescriptorFile();

      if (file != null && moduleDescriptor != null) {
        NodeReadAccessCasterInEditor.runReadTransparentAction(new Runnable() {
          @Override
          public void run() {
            new ProjectStructureBuilder(moduleDescriptor, file, model.getModelDescriptor()) {
              @Override
              public Iterable<org.jetbrains.mps.openapi.model.SModelReference> loadReferences(SNode m, ModuleDescriptor descriptor) {
                SModule module = moduleDescriptor == descriptor ? myModule :
                    ModuleRepositoryFacade.getInstance().getModule(descriptor.getModuleReference());
                if (module == null) {
                  return Collections.emptyList();
                }

                return Sequence.<org.jetbrains.mps.openapi.model.SModel>fromIterable(module.getModels()).
                    where(new IWhereFilter<org.jetbrains.mps.openapi.model.SModel>() {
                      @Override
                      public boolean accept(org.jetbrains.mps.openapi.model.SModel o) {
                        return SModelStereotype.isUserModel(o);
                      }
                    }).
                    select(new ISelector<org.jetbrains.mps.openapi.model.SModel, org.jetbrains.mps.openapi.model.SModelReference>() {
                      @Override
                      public org.jetbrains.mps.openapi.model.SModelReference select(org.jetbrains.mps.openapi.model.SModel o) {
                        return o.getReference();
                      }
                    });
              }
            }.convert();
          }
        });
      }
      return model;
    }

    private void dropModel() {
      if (mySModel == null) return;

      (mySModel).setModelDescriptor(null);
      mySModel = null;
      if (ModelAccess.instance().canWrite()) {
        notifyModelReplaced(mySModel == null ? null : mySModel.getModelDescriptor());
      } else {
        ModelAccess.instance().runWriteInEDT(new Runnable() {
          @Override
          public void run() {
            notifyModelReplaced(mySModel.getModelDescriptor());
          }
        });
      }
    }

    @Override
    public SModel resolveModel(SModelReference reference) {
      throw new UnsupportedOperationException("not supported since 3.0");
    }
  }

  public static class ProjectStructureSModel extends jetbrains.mps.smodel.SModel {
    public ProjectStructureSModel(@NotNull SModelReference modelReference) {
      super(modelReference, new ForeignNodeIdMap());
    }

    @Override
    public boolean canFireEvent() {
      return false;
    }

    @Override
    protected FastNodeFinder createFastNodeFinder() {
      return new TransientModelNodeFinder(this.getModelDescriptor());
    }
  }
}
