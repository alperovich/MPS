package jetbrains.mps.tool.builder;

/*Generated by MPS */

import jetbrains.mps.project.Project;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import java.io.File;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.classloading.ClassLoaderManager;
import jetbrains.mps.progress.EmptyProgressMonitor;
import jetbrains.mps.smodel.ModuleRepositoryFacade;
import jetbrains.mps.cleanup.CleanupManager;
import java.util.Set;
import org.jetbrains.mps.openapi.module.SModuleReference;
import jetbrains.mps.project.structure.project.Path;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.project.structure.modules.ModuleDescriptor;
import jetbrains.mps.library.ModulesMiner;
import org.jetbrains.mps.openapi.module.SModule;
import jetbrains.mps.project.AbstractModule;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import org.jdom.Document;
import jetbrains.mps.util.JDOMUtil;
import org.jdom.JDOMException;
import java.io.IOException;
import org.jdom.Element;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.util.xml.XmlUtil;
import jetbrains.mps.util.MacrosFactory;

public class FileMPSProject extends Project {
  private static Logger LOG = LogManager.getLogger(FileMPSProject.class);
  private String myErrors;
  private FileMPSProject.ProjectDescriptor myDescriptor;

  public FileMPSProject(File file) {
    super();
    setProjectFile(file);
  }

  @Override
  public String getName() {
    return getProjectFile().getName();
  }

  @Override
  public void projectOpened() {
    super.projectOpened();
  }

  @Override
  public void projectClosed() {
    super.projectClosed();
  }

  @Deprecated
  @Override
  public <T> T getComponent(Class<T> cls) {
    return null;
  }

  @Override
  public void dispose() {
    super.dispose();
    ModelAccess.instance().runWriteAction(new Runnable() {
      @Override
      public void run() {
        ClassLoaderManager.getInstance().unloadAll(new EmptyProgressMonitor());
        ModuleRepositoryFacade.getInstance().unregisterModules(FileMPSProject.this);
        CleanupManager.getInstance().cleanup();
        // todo: why we need it? 
        ClassLoaderManager.getInstance().unloadAll(new EmptyProgressMonitor());
      }
    });
  }

  protected void readModules(FileMPSProject.ProjectDescriptor projDesc) {
    myErrors = null;
    //  load solutions 
    Set<SModuleReference> existingModules = getModuleReferences();
    for (Path modulePath : projDesc.getModules()) {
      String path = modulePath.getPath();
      IFile descriptorFile = FileSystem.getInstance().getFileByPath(path);
      if (descriptorFile.exists()) {
        ModuleDescriptor descriptor = ModulesMiner.getInstance().loadModuleDescriptor(descriptorFile);
        if (descriptor != null) {
          ModulesMiner.ModuleHandle moduleHandle = new ModulesMiner.ModuleHandle(descriptorFile, descriptor);
          SModule m = ModuleRepositoryFacade.createModule(moduleHandle, this);
          SModuleReference moduleReference = m.getModuleReference();
          if (!(existingModules.remove(moduleReference))) {
            super.addModule(moduleReference);
          }
        } else {
          error("Can't load module from " + descriptorFile.getPath() + " Unknown file type.");
        }
      } else {
        error("Can't load module from " + descriptorFile.getPath() + " File doesn't exist.");
      }
    }
    for (SModuleReference ref : existingModules) {
      super.removeModule(ref);
    }
  }

  private void error(String text) {
    if (myErrors == null) {
      this.myErrors = text;
    } else {
      myErrors += "\n" + text;
    }
    LOG.error(text);
  }

  public void init(FileMPSProject.ProjectDescriptor desc) {
    this.myDescriptor = desc;
    if (getProjectFile() == null) {
      return;
    }
    assert !(isDisposed());
    ModelAccess.instance().runWriteAction(new Runnable() {
      @Override
      public void run() {
        readModules(myDescriptor);
        //  TODO FIXME get rid of onModuleLoad 
        for (SModule m : getModules()) {
          ((AbstractModule) m).onModuleLoad();
        }
      }
    });
  }

  public FileMPSProject.ProjectDescriptor getDescriptor() {
    return myDescriptor;
  }

  @Override
  public List<String> getWatchedModulesPaths() {
    return Collections.emptyList();
  }

  public static class ProjectDescriptor {
    private String name;
    private List<Path> myModulePaths = new ArrayList<Path>();

    public ProjectDescriptor(File project) {
      load(project);
    }

    private void load(File project) {
      if (project == null) {
        return;
      }
      if (project.isDirectory()) {
        load(project, new File(project, ".mps/modules.xml"));
      } else {
        // <node> 
        load(project, project);
      }
    }

    private void load(File project, File modulesFile) {
      if (modulesFile == null) {
        return;
      }
      Document document = null;
      try {
        document = JDOMUtil.loadDocument(modulesFile);
      } catch (JDOMException ex) {
      } catch (IOException ex) {
      }
      Element projectElement = null;
      if (document != null) {
        Element root = document.getRootElement();
        if ("project".equals(root.getName())) {
          for (Object ch : root.getChildren("component")) {
            if (ch instanceof Element && "MPSProject".equals(((Element) ch).getAttributeValue("name"))) {
              projectElement = (Element) ch;
              break;
            }
          }
        }
      }
      if (projectElement != null) {
        load(project, projectElement);
      }
    }

    private void load(File project, Element modulesXml) {
      FileMPSProject.ProjectDescriptor result_dkknya_a0a5o = this;
      final String result_dkknya_a0a0a5o = project.getName();
      result_dkknya_a0a5o.setName(result_dkknya_a0a0a5o);

      if (modulesXml == null) {
        return;
      }

      List<Element> moduleList = ListSequence.fromList(new ArrayList<Element>());
      ListSequence.fromList(moduleList).addSequence(Sequence.fromIterable(XmlUtil.children(XmlUtil.first(modulesXml, "projectSolutions"), "solutionPath")));
      ListSequence.fromList(moduleList).addSequence(Sequence.fromIterable(XmlUtil.children(XmlUtil.first(modulesXml, "projectLanguages"), "languagePath")));
      ListSequence.fromList(moduleList).addSequence(Sequence.fromIterable(XmlUtil.children(XmlUtil.first(modulesXml, "projectDevkits"), "devkitPath")));
      ListSequence.fromList(moduleList).addSequence(Sequence.fromIterable(XmlUtil.children(XmlUtil.first(modulesXml, "projectModules"), "modulePath")));
      for (Element moduleElement : ListSequence.fromList(moduleList)) {
        Path modulePath = new Path();
        Path result_dkknya_a1a9a0a5o = modulePath;
        // todo: replace - wtf? @see ProjectDescriptorPersistence#saveProjectDescriptorToElement 
        final String result_dkknya_a1a1a9a0a5o = MacrosFactory.forProjectFile(FileSystem.getInstance().getFileByPath(project.getPath())).expandPath(moduleElement.getAttributeValue("path").replace("$PROJECT_DIR$", "${project}"));
        result_dkknya_a1a9a0a5o.setPath(result_dkknya_a1a1a9a0a5o);
        final String result_dkknya_a2a1a9a0a5o = moduleElement.getAttributeValue("folder");
        result_dkknya_a1a9a0a5o.setMPSFolder(result_dkknya_a2a1a9a0a5o);
        result_dkknya_a0a5o.addModule(modulePath);
      }
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getName() {
      return name;
    }

    public List<Path> getModules() {
      return Collections.unmodifiableList(myModulePaths);
    }

    public void addModule(Path p) {
      myModulePaths.add(p);
    }
  }
}
