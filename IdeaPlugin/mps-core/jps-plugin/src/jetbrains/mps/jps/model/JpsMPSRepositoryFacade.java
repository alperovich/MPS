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

package jetbrains.mps.jps.model;

import jetbrains.mps.MPSCore;
import jetbrains.mps.baseLanguage.search.MPSBaseLanguage;
import jetbrains.mps.classloading.ClassLoaderManager;
import jetbrains.mps.generator.MPSGenerator;
import jetbrains.mps.idea.core.make.MPSMakeConstants;
import jetbrains.mps.idea.core.module.CachedModuleData;
import jetbrains.mps.idea.core.module.CachedRepositoryData;
import jetbrains.mps.jps.build.MPSCompilerUtil;
import jetbrains.mps.jps.persistence.CachedDefaultModelRoot;
import jetbrains.mps.jps.persistence.CachedJavaClassStubsModelRoot;
import jetbrains.mps.jps.project.JpsLibSolution;
import jetbrains.mps.jps.project.JpsMPSProject;
import jetbrains.mps.jps.project.JpsSolutionIdea;
import jetbrains.mps.library.ModulesMiner;
import jetbrains.mps.library.ModulesMiner.ModuleHandle;
import jetbrains.mps.persistence.MPSPersistence;
import jetbrains.mps.persistence.PersistenceRegistry;
import jetbrains.mps.progress.EmptyProgressMonitor;
import jetbrains.mps.project.ModuleId;
import jetbrains.mps.project.structure.modules.SolutionDescriptor;
import jetbrains.mps.smodel.BaseMPSModuleOwner;
import jetbrains.mps.smodel.MPSModuleOwner;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.ModuleRepositoryFacade;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.typesystem.MPSTypesystem;
import jetbrains.mps.util.SNodeOperations;
import jetbrains.mps.util.io.ModelInputStream;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.vfs.IFile;
import org.jetbrains.jps.incremental.CompileContext;
import org.jetbrains.jps.incremental.messages.BuildMessage.Kind;
import org.jetbrains.jps.incremental.messages.CompilerMessage;
import org.jetbrains.jps.model.JpsProject;
import org.jetbrains.jps.model.java.JpsJavaSdkType;
import org.jetbrains.jps.model.library.JpsLibrary;
import org.jetbrains.jps.model.module.JpsDependencyElement;
import org.jetbrains.jps.model.module.JpsModule;
import org.jetbrains.jps.model.module.JpsSdkDependency;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.mps.openapi.module.SModule;
import org.jetbrains.mps.openapi.persistence.ModelRoot;
import org.jetbrains.mps.openapi.persistence.ModelRootFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/**
 * evgeny, 12/3/12
 */
public class JpsMPSRepositoryFacade implements MPSModuleOwner {

  private static final JpsMPSRepositoryFacade INSTANCE = new JpsMPSRepositoryFacade();
  public static final UUID JDK_UUID = UUID.fromString("6354ebe7-c22a-4a0f-ac54-50b52ab9b065");

  private volatile boolean isInitialized = false;
  private CachedRepositoryData myRepo;
  private Map<JpsModule, JpsSolutionIdea> jpsToMpsModules = new HashMap<JpsModule, JpsSolutionIdea>();
  private JpsMPSProject myProject;

  public JpsMPSRepositoryFacade() {
  }

  public static JpsMPSRepositoryFacade getInstance() {
    return INSTANCE;
  }

  public void init(final CompileContext context) {
    if (isInitialized) {
      return;
    }
    ModelAccess.instance().runWriteAction(new Runnable() {
      @Override
      public void run() {
        long start = System.nanoTime();
        initMPS();
        initRepository(context,
          context.getBuilderParameter(MPSMakeConstants.MPS_LANGUAGES.toString()),
          context.getBuilderParameter(MPSMakeConstants.MPS_REPOSITORY.toString()));

        ClassLoaderManager.getInstance().reloadClasses(MPSModuleRepository.getInstance().getModules(), new EmptyProgressMonitor());

        initProject(context);

        if (MPSCompilerUtil.isTracingMode()) {
          context.processMessage(new CompilerMessage(MPSMakeConstants.BUILDER_ID, Kind.INFO, "MPS loaded in " + (System.nanoTime() - start) / 1000000 + " ms"));
        }
        isInitialized = true;
      }
    });
  }

  public JpsMPSProject getProject() {
    return myProject;
  }

  public JpsSolutionIdea getSolution(JpsModule module) {
    if (!isInitialized) throw new IllegalStateException("Not initialized yet");
    return jpsToMpsModules.get(module);
  }


  private void initRepository(CompileContext context, String languages, String repoFile) {
    if (repoFile != null) {
      File f = new File(repoFile);
      ModelInputStream mos = null;
      try {
        long start = System.nanoTime();
        mos = new ModelInputStream(new FileInputStream(f));
        myRepo = CachedRepositoryData.load(mos);
        if (MPSCompilerUtil.isTracingMode()) {
          context.processMessage(new CompilerMessage(MPSMakeConstants.BUILDER_ID, Kind.INFO, "loaded " + myRepo.getModules().size() + " modules in " + (System.nanoTime() - start) / 1000000 + " ms"));
        }

        // use optimized implementation of default model root
        PersistenceRegistry.getInstance().setModelRootFactory(PersistenceRegistry.DEFAULT_MODEL_ROOT, new ModelRootFactory() {
          @Override
          public ModelRoot create() {
            return new CachedDefaultModelRoot(myRepo);
          }
        });

        PersistenceRegistry.getInstance().setModelRootFactory(PersistenceRegistry.JAVA_CLASSES_ROOT, new ModelRootFactory() {
          @Override
          public ModelRoot create() {
            return new CachedJavaClassStubsModelRoot(myRepo);
          }
        });

        start = System.nanoTime();
        for (CachedModuleData data : myRepo.getModules()) {
          ModuleRepositoryFacade.createModule(data.getHandle(), this);
        }
        if (MPSCompilerUtil.isTracingMode()) {
          context.processMessage(new CompilerMessage(MPSMakeConstants.BUILDER_ID, Kind.INFO, "instantiated " + myRepo.getModules().size() + " modules in " + (System.nanoTime() - start) / 1000000 + " ms"));
        }
        return;
      } catch (IOException e) {
        context.processMessage(new CompilerMessage(MPSMakeConstants.BUILDER_ID, e));
        context.processMessage(new CompilerMessage(MPSMakeConstants.BUILDER_ID, Kind.WARNING, "cannot load cache, generation may be slow"));
      } finally {
        jetbrains.mps.util.FileUtil.closeFileSafe(mos);
      }
    } else if (languages != null) {
      // TODO split by semicolon, etc.

      long start = System.nanoTime();
      List<ModuleHandle> loadedModules = new ArrayList<ModuleHandle>();
      BaseMPSModuleOwner owner = new BaseMPSModuleOwner() {};
      for (String path: languages.split(";")) {
        IFile ipath = FileSystem.getInstance().getFileByPath(path);
        loadedModules.addAll(ModulesMiner.getInstance().collectModules(ipath, true));
      }

      if (MPSCompilerUtil.isTracingMode()) {
        context.processMessage(new CompilerMessage(MPSMakeConstants.BUILDER_ID, Kind.INFO, "loaded " + loadedModules.size() + " modules in " + (System.nanoTime() - start) / 1000000 + " ms"));
      }

      start = System.nanoTime();
      for (ModuleHandle moduleHandle : loadedModules) {
        SModule module = ModuleRepositoryFacade.createModule(moduleHandle, owner);
      }

      if (MPSCompilerUtil.isTracingMode()) {
        context.processMessage(new CompilerMessage(MPSMakeConstants.BUILDER_ID, Kind.INFO, "instantiated " + loadedModules.size() + " modules in " + (System.nanoTime() - start) / 1000000 + " ms"));
      }

      return;
    }

    context.processMessage(new CompilerMessage(MPSMakeConstants.BUILDER_ID, Kind.WARNING, "cannot start MPS, no repository provided"));
  }

  private void initProject(CompileContext context) {
    long start = System.nanoTime();

    JpsProject jpsProject = context.getProjectDescriptor().getProject();
    myProject = new JpsMPSProject(jpsProject);

    Set<JpsLibrary> processedSdks = new HashSet<JpsLibrary>();

    JpsLibrary jdk = null;
    for (JpsModule mod : jpsProject.getModules()) {
      JpsMPSModuleExtension extension = JpsMPSExtensionService.getInstance().getExtension(mod);

      if (extension == null) {
        continue;
      }

      if (MPSCompilerUtil.isTracingMode()) {
        context.processMessage(new CompilerMessage(MPSMakeConstants.BUILDER_ID, Kind.INFO, "Creating solution for " + mod.getName()));
      }

      SolutionDescriptor descriptor = extension.getConfiguration().getSolutionDescriptor();
      descriptor.setNamespace(mod.getName());
      MPSCompilerUtil.debug(context, "UUID " + descriptor.getUUID());
      // Commeted out. See SolutionIdea: solutions don't have foreign ids, rather regular
//      descriptor.setId(ModuleId.foreign(mod.getName()));

      JpsSolutionIdea module = new JpsSolutionIdea(mod, descriptor, context);
      JpsSolutionIdea solutionIdea = MPSModuleRepository.getInstance().registerModule(module, myProject);
      if (module == solutionIdea) {
        solutionIdea.updateModelsSet();
      }
      myProject.addModule(solutionIdea.getModuleReference());

      jpsToMpsModules.put(mod, solutionIdea);

      // let's handle module sdkLib
      for (JpsLibrary sdk: getModuleSdks(mod, context)) {
        MPSCompilerUtil.debug(context, "SDK name" + sdk.getName() + " type: " + sdk.getType());

        JpsLibSolution sdkSolution = createLibSolution(sdk, jdk, context);
        JpsLibSolution regSolution = MPSModuleRepository.getInstance().registerModule(sdkSolution, myProject);
        MPSCompilerUtil.debug(context, "SDK " + regSolution.getModuleReference().toString());
        if (sdkSolution == regSolution) {
          MPSCompilerUtil.debug(context, "SDK updating model set for " + sdk.getName());
          sdkSolution.updateModelsSet();
        }

        if (JpsJavaSdkType.INSTANCE.equals(sdk.getType()) && !processedSdks.contains(sdk)) {
          jdk = jdk != null ? jdk : sdk;
          processedSdks.add(sdk);
        }
      }
    }

    if (processedSdks.size() > 1) {
      context.processMessage(new CompilerMessage(MPSMakeConstants.BUILDER_ID, Kind.ERROR, "Different SDKs in modules with MPS facets are not supported"));
    }

    for (JpsLibrary jpsLib : jpsProject.getLibraryCollection().getLibraries()) {
      JpsLibSolution libSolution = createLibSolution(jpsLib, jdk, context);
      JpsLibSolution regSolution = MPSModuleRepository.getInstance().registerModule(libSolution, myProject);
      MPSCompilerUtil.debug(context, "LIB " + regSolution.getModuleReference().toString());
      if (libSolution == regSolution) {
        MPSCompilerUtil.debug(context, "LIB updating model set for " + jpsLib.getName());
        libSolution.updateModelsSet();
      }
      if (MPSCompilerUtil.isExtraTracingMode()) {
        for (SModel desc : SModelRepository.getInstance().getModelDescriptors(regSolution)) {
          MPSCompilerUtil.debug(context, "LIB model " + desc.getModelName());
        }
      }
    }

    if (MPSCompilerUtil.isTracingMode()) {
      context.processMessage(new CompilerMessage(MPSMakeConstants.BUILDER_ID, Kind.INFO, "Project modules loaded in " + (System.nanoTime() - start) / 1000000 + " ms"));

      if (MPSCompilerUtil.isExtraTracingMode()) {
        for (SModule m : MPSModuleRepository.getInstance().getModules(myProject)) {
          context.processMessage(new CompilerMessage(MPSMakeConstants.BUILDER_ID, Kind.INFO, "Debug output: module " + m.getModuleReference().toString()));

          for (SModel d : SModelRepository.getInstance().getModelDescriptors(m)) {
            context.processMessage(new CompilerMessage(MPSMakeConstants.BUILDER_ID, Kind.INFO, "Debug output: model " + SNodeOperations.getModelLongName(d) + " / " + d.getReference().toString()));
            // It makes model loading non-lazy and kills the whole thing if stubs are built for everything (like SDK, libs, etc)
  //          for (SNode n : d.getRootNodes()) {
  //            context.processMessage(new CompilerMessage(MPSMakeConstants.BUILDER_ID, Kind.INFO, "node: " + n.getName() + " id: " + n.getSNodeId().toString()));
  //            if (n.getName().equals("PsiListener") || n.getName().equals("PsiChangesWatcher")) {
  //              for (SNode n2 : n.getChildren()) {
  //                context.processMessage(new CompilerMessage(MPSMakeConstants.BUILDER_ID, Kind.INFO, "child: " + n2.getName() + " id: " + n2.getSNodeId().toString()));
  //              }
  //            }
  //          }
          }
        }
      }
    }
  }

  private JpsLibSolution createLibSolution(JpsLibrary lib, JpsLibrary jdk, CompileContext ctx) {
    String name = lib.getName();
    SolutionDescriptor desc = new SolutionDescriptor();
    desc.setNamespace(name);

    if (JpsJavaSdkType.INSTANCE.equals(lib.getType()) && jdk == null) {
      ModuleId jdkId = ModuleId.regular(JDK_UUID);
      MPSModuleRepository repo = MPSModuleRepository.getInstance();
      SModule existingModule = repo.getModule(jdkId);
      if (existingModule != null) {
        desc.setNamespace(existingModule.getModuleName());
        Set<MPSModuleOwner> owners = new HashSet<MPSModuleOwner>(repo.getOwners(existingModule));
        for (MPSModuleOwner owner : owners) {
//          if (owner == this) continue;
          repo.unregisterModule(existingModule, owner);
        }
      }
      desc.setId(jdkId);
    } else {
      desc.setId(ModuleId.foreign(name));
    }
    return new JpsLibSolution(desc, lib, jdk, ctx);
  }


  private List<JpsLibrary> getModuleSdks(JpsModule module, CompileContext ctx) {
    List<JpsLibrary> sdks = new ArrayList<JpsLibrary>();
    for (JpsDependencyElement dep : module.getDependenciesList().getDependencies()) {
      if (!(dep instanceof JpsSdkDependency)) continue;
      JpsLibrary lib = ((JpsSdkDependency) dep).resolveSdk();
      if (lib != null) {
        sdks.add(lib);
      }
    }
    return sdks;
  }

  public void dispose() {
    if (!isInitialized) {
      return;
    }
    ModelAccess.instance().runWriteAction(new Runnable() {
      @Override
      public void run() {
        disposeMPS();
        isInitialized = false;
      }
    });
  }


  private void initMPS() {
    MPSCore.getInstance().init();
    MPSPersistence.getInstance().init();
    MPSTypesystem.getInstance().init();
    MPSGenerator.getInstance().init();
    MPSBaseLanguage.getInstance().init();
  }

  private void disposeMPS() {
    MPSBaseLanguage.getInstance().dispose();
    MPSGenerator.getInstance().dispose();
    MPSTypesystem.getInstance().dispose();
    MPSPersistence.getInstance().dispose();
    MPSCore.getInstance().dispose();
  }

  @Override
  public boolean isHidden() {
    return true;
  }
}
