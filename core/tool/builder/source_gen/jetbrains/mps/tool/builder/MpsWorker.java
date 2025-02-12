package jetbrains.mps.tool.builder;

/*Generated by MPS */

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.tool.common.Script;
import jetbrains.mps.tool.environment.Environment;
import jetbrains.mps.tool.environment.MpsEnvironment;
import jetbrains.mps.tool.environment.EnvironmentConfig;
import jetbrains.mps.internal.collections.runtime.IMapping;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.io.File;
import jetbrains.mps.project.Project;
import jetbrains.mps.tool.environment.ActiveEnvironment;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.make.ModuleMaker;
import jetbrains.mps.util.IterableUtil;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.progress.EmptyProgressMonitor;
import jetbrains.mps.classloading.ClassLoaderManager;
import java.util.Set;
import jetbrains.mps.project.MPSExtentions;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.mps.openapi.module.SModule;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.generator.GenerationFacade;
import java.util.Collection;
import jetbrains.mps.project.io.DescriptorIOFacade;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.util.Computable;
import jetbrains.mps.smodel.ModuleFileTracker;
import java.util.Collections;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.smodel.BaseMPSModuleOwner;
import jetbrains.mps.library.ModulesMiner;
import jetbrains.mps.smodel.ModuleRepositoryFacade;
import jetbrains.mps.project.DevKit;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.Generator;
import jetbrains.mps.smodel.SModelFileTracker;
import jetbrains.mps.smodel.SModelHeader;
import jetbrains.mps.smodel.persistence.def.ModelPersistence;
import jetbrains.mps.extapi.persistence.FileDataSource;
import org.jetbrains.mps.openapi.model.SModelReference;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.util.FileUtil;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.smodel.persistence.def.ModelReadException;
import org.apache.log4j.Level;
import java.io.StringWriter;
import java.io.PrintWriter;
import java.util.LinkedHashSet;

public abstract class MpsWorker {
  private static Logger LOG = LogManager.getLogger(MpsWorker.class);
  protected final List<String> myErrors = new ArrayList<String>();
  protected final List<String> myWarnings = new ArrayList<String>();
  protected final Script myWhatToDo;
  private final MpsWorker.AntLogger myLogger;
  protected Environment myEnvironment;

  public MpsWorker(Script whatToDo) {
    this(whatToDo, new MpsWorker.LogLogger());
  }

  public MpsWorker(Script whatToDo, MpsWorker.AntLogger logger) {
    myWhatToDo = whatToDo;
    myLogger = logger;
  }

  private Environment createDefaultEnvironment() {
    Environment env = new MpsEnvironment(createEnvConfig(myWhatToDo));
    Logger.getRootLogger().setLevel(myWhatToDo.getLogLevel());
    return env;
  }

  public static EnvironmentConfig createEnvConfig(Script whatToDo) {
    EnvironmentConfig config = EnvironmentConfig.emptyEnvironment();
    for (IMapping<String, String> macro : MapSequence.fromMap(whatToDo.getMacro())) {
      config = config.addMacro(macro.key(), new File(macro.value()));
    }
    for (IMapping<String, File> lib : MapSequence.fromMap(whatToDo.getLibraries())) {
      config = config.addLib(lib.key(), lib.value());
    }
    if (whatToDo.isLoadBootstrapLibraries()) {
      config = config.withBootstrapLibraries();
    }
    return config;
  }

  public void workFromMain() {
    try {
      work();
      System.exit(0);
    } catch (Throwable e) {
      log(e);
      System.exit(1);
    }
  }

  public abstract void work();

  protected Project createDummyProject() {
    return ActiveEnvironment.get().createDummyProject();
  }

  protected void dispose() {
    if (myEnvironment != null) {
      myEnvironment.disposeEnvironment();
    }
  }

  protected void setupEnvironment() {
    if (ActiveEnvironment.get() == null) {
      myEnvironment = createDefaultEnvironment();
    }
    make();
  }

  protected void make() {
    ModelAccess.instance().runWriteAction(new Runnable() {
      @Override
      public void run() {
        ModuleMaker maker = new ModuleMaker();
        maker.make(IterableUtil.asCollection(MPSModuleRepository.getInstance().getModules()), new EmptyProgressMonitor());
      }
    });
    reload();
  }

  protected void reload() {
    ModelAccess.instance().runWriteAction(new Runnable() {
      @Override
      public void run() {
        ClassLoaderManager.getInstance().reloadAll(new EmptyProgressMonitor());
      }
    });
  }

  protected abstract void executeTask(Project project, MpsWorker.ObjectsToProcess go);

  protected abstract void showStatistic();

  protected StringBuffer formatErrorsReport(String taskName) {
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < 100; i++) {
      sb.append('*');
    }
    sb.append("\n");
    sb.append(myErrors.size());
    sb.append(" errors during " + taskName + ":\n");
    for (String error : myErrors) {
      sb.append(error);
      sb.append("\n");
    }
    for (int i = 0; i < 100; i++) {
      sb.append('*');
    }
    return sb;
  }

  protected void failBuild(String name) {
    if (!(myErrors.isEmpty()) && myWhatToDo.getFailOnError()) {
      throw new RuntimeException(this.formatErrorsReport(name).toString());
    }
  }

  public void collectModelsToGenerate(MpsWorker.ObjectsToProcess go) {
    collectFromProjects(go.getProjects());
    collectFromModuleFiles(go.getModules());
    collectFromModelFiles(go.getModels());
  }

  private void collectFromProjects(Set<Project> projects) {
    for (File projectFile : myWhatToDo.getMPSProjectFiles().keySet()) {
      if (projectFile.getAbsolutePath().endsWith(MPSExtentions.DOT_MPS_PROJECT)) {
        Project project = myEnvironment.openProject(projectFile);
        info("Loaded project " + project);
        projects.add(project);
      }
    }
  }

  protected void extractModels(Set<SModel> result, Project project) {
    for (SModule module : project.getModulesWithGenerators()) {
      for (SModel model : module.getModels()) {
        if (includeModel(model)) {
          result.add(model);
        }
      }
    }
  }

  private boolean includeModel(SModel model) {
    return SModelStereotype.isUserModel(model) && GenerationFacade.canGenerate(model);
  }

  protected void extractModels(Collection<SModel> modelsList, SModule m) {
    for (SModel d : m.getModels()) {
      if (includeModel(d)) {
        modelsList.add(d);
      }
    }
  }

  protected void collectFromModuleFiles(Set<SModule> modules) {
    for (File moduleFile : myWhatToDo.getModules()) {
      processModuleFile(moduleFile, modules);
    }
  }

  protected void processModuleFile(final File moduleFile, final Set<SModule> modules) {
    if (DescriptorIOFacade.getInstance().fromFileType(FileSystem.getInstance().getFileByPath(moduleFile.getPath())) == null) {
      return;
    }
    List<SModule> tmpmodules;
    SModule moduleByFile = ModelAccess.instance().runReadAction(new Computable<SModule>() {
      public SModule compute() {
        return ModuleFileTracker.getInstance().getModuleByFile(FileSystem.getInstance().getFileByPath(moduleFile.getAbsolutePath()));
      }
    });
    if (moduleByFile != null) {
      tmpmodules = Collections.singletonList(moduleByFile);
    } else {
      tmpmodules = ModelAccess.instance().runWriteAction(new Computable<List<SModule>>() {
        public List<SModule> compute() {
          IFile file = FileSystem.getInstance().getFileByPath(moduleFile.getPath());
          BaseMPSModuleOwner owner = new BaseMPSModuleOwner() {};
          List<SModule> modules = new ArrayList<SModule>();
          for (ModulesMiner.ModuleHandle moduleHandle : ModulesMiner.getInstance().collectModules(file, false)) {
            SModule module = ModuleRepositoryFacade.createModule(moduleHandle, owner);
            if (module != null) {
              modules.add(module);
            }
          }
          return modules;
        }
      });
    }
    for (SModule module : tmpmodules) {
      info("Loaded module " + module);
      if (module.isReadOnly()) {
        continue;
      }
      if (module instanceof DevKit) {
        continue;
      }
      modules.add(module);
      if (module instanceof Language) {
        Language language = (Language) module;
        for (Generator gen : language.getGenerators()) {
          modules.add(gen);
        }
      }
    }
  }

  protected void collectFromModelFiles(Set<SModel> model) {
    for (File f : myWhatToDo.getModels()) {
      if (f.getPath().endsWith(MPSExtentions.DOT_MODEL)) {
        processModelFile(model, f);
      }
    }
  }

  private void processModelFile(Set<SModel> models, File f) {
    final IFile ifile = FileSystem.getInstance().getFileByPath(f.getAbsolutePath());
    //  try to find if model is loaded 
    SModel model = SModelFileTracker.getInstance().findModel(ifile);
    if (model != null) {
      models.add(model);
      info("Found model " + model);
      return;
    }
    //  if model is not loaded, read it 
    try {
      SModelHeader dr = ModelPersistence.loadDescriptor(new FileDataSource(ifile));
      SModelReference modelReference;
      if (dr.getUID() != null) {
        modelReference = PersistenceFacade.getInstance().createModelReference(dr.getUID());
      } else {
        String modelName = FileUtil.getNameWithoutExtension(ifile.getName());
        modelReference = PersistenceFacade.getInstance().createModelReference(modelName);
      }
      info("Read model " + modelReference);
      SModelHeader d = ModelPersistence.loadDescriptor(new FileDataSource(ifile));
      SModel existingDescr = SModelRepository.getInstance().getModelDescriptor(d.getModelReference());
      if (existingDescr == null) {
        error("Module for " + ifile.getPath() + " was not found. Use \"library\" tag to load required modules.");
      } else {
        models.add(existingDescr);
      }
    } catch (ModelReadException e) {
      log(e);
    }
  }

  private void log(String text, Level level) {
    if (!(level.isGreaterOrEqual(myWhatToDo.getLogLevel()))) {
      return;
    }

    myLogger.log(text, level);
  }

  public void info(String text) {
    log(text, Level.INFO);
  }

  public void warning(String text) {
    log(text, Level.WARN);
    myWarnings.add(text);
  }

  public void debug(String text) {
    log(text, Level.DEBUG);
  }

  public void error(String text) {
    log(text, Level.ERROR);
    myErrors.add(text);
  }

  public void log(Throwable e) {
    StringBuffer sb = MpsWorker.extractStackTrace(e);
    error(sb.toString());
  }

  public void log(String text, Throwable e) {
    StringBuffer sb = MpsWorker.extractStackTrace(e);
    error(text + "\n" + sb.toString());
  }

  public static StringBuffer extractStackTrace(Throwable e) {
    StringWriter writer = new StringWriter();
    e.printStackTrace(new PrintWriter(writer));
    return writer.getBuffer();
  }

  protected static interface AntLogger {
    public void log(String text, Level level);
  }

  public static class SystemOutLogger implements MpsWorker.AntLogger {
    public SystemOutLogger() {
    }

    @Override
    public void log(String text, Level level) {
      if (level == Level.ERROR) {
        System.err.println(text);
      } else {
        System.out.println(text);
      }
    }
  }

  public static class LogLogger implements MpsWorker.AntLogger {
    public LogLogger() {
    }

    @Override
    public void log(String text, Level level) {
      switch (level.toInt()) {
        case Level.ERROR_INT:
          MpsWorker.LOG.error(text);
          break;
        case Level.WARN_INT:
          MpsWorker.LOG.warn(text);
          break;
        case Level.INFO_INT:
          MpsWorker.LOG.info(text);
          break;
        case Level.DEBUG_INT:
          MpsWorker.LOG.debug(text);
          break;
        default:
          MpsWorker.LOG.fatal("[unknown level " + level + "] " + text);
          break;
      }
    }
  }

  protected class ObjectsToProcess {
    private final Set<Project> myProjects = new LinkedHashSet<Project>();
    private final Set<SModule> myModules = new LinkedHashSet<SModule>();
    private final Set<SModel> myModels = new LinkedHashSet<SModel>();

    public ObjectsToProcess() {
    }

    public ObjectsToProcess(Set<? extends Project> mpsProjects, Set<SModule> modules, Set<SModel> models) {
      myProjects.addAll(mpsProjects);
      myModules.addAll(modules);
      myModels.addAll(models);
    }

    public Set<Project> getProjects() {
      return myProjects;
    }

    public Set<SModule> getModules() {
      return myModules;
    }

    public Set<SModel> getModels() {
      return myModels;
    }

    public boolean hasAnythingToGenerate() {
      return !(myModels.isEmpty()) || !(myProjects.isEmpty()) || !(myModules.isEmpty());
    }
  }
}
