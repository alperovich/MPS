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

package jetbrains.mps.idea.core.actions;

import com.intellij.facet.FacetManager;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.LangDataKeys;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.vfs.VirtualFileManager;
import jetbrains.mps.fileTypes.FileIcons;
import jetbrains.mps.ide.project.ProjectHelper;
import jetbrains.mps.idea.core.MPSBundle;
import jetbrains.mps.idea.core.facet.MPSFacet;
import jetbrains.mps.idea.core.facet.MPSFacetType;
import jetbrains.mps.idea.core.icons.MPSIcons;
import jetbrains.mps.idea.core.ui.CreateFromTemplateDialog;
import jetbrains.mps.persistence.DefaultModelRoot;
import jetbrains.mps.persistence.PersistenceRegistry;
import jetbrains.mps.project.AbstractModule;
import jetbrains.mps.project.SModuleOperations;
import jetbrains.mps.project.Solution;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.ModuleRepositoryFacade;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.util.Computable;
import org.jetbrains.mps.openapi.model.EditableSModel;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.mps.openapi.module.SModule;
import org.jetbrains.mps.openapi.module.SModuleReference;
import org.jetbrains.mps.openapi.persistence.ModelRoot;

import javax.lang.model.SourceVersion;
import javax.swing.Icon;
import java.util.ArrayList;
import java.util.List;

public class NewModelAction extends AnAction {
  private String myModelPrefix;
  private Project myProject;
  private ModelRoot myModelRoot;
  private String mySourceRoot;
  private Solution mySolution;

  public NewModelAction() {
    super(MPSBundle.message("new.model.action"), null, FileIcons.MODEL_ICON);
  }

  @Override
  public void update(AnActionEvent e) {
    setModelRoot(e);
    setProject(e);

    boolean enabled = isEnabled();
    e.getPresentation().setVisible(enabled);
    e.getPresentation().setEnabled(enabled);
  }

  private void setProject(AnActionEvent event) {
    myProject = event.getData(PlatformDataKeys.PROJECT);
  }

  private void setModelRoot(AnActionEvent e) {
    mySolution = null;
    myModelRoot = null;
    myModelPrefix = null;
    Module module = e.getData(LangDataKeys.MODULE);
    VirtualFile[] vFiles = e.getData(PlatformDataKeys.VIRTUAL_FILE_ARRAY);
    if (module == null || vFiles == null || vFiles.length != 1 || !vFiles[0].isDirectory()) {
      return;
    }

    MPSFacet mpsFacet = FacetManager.getInstance(module).getFacetByType(MPSFacetType.ID);
    if (mpsFacet == null || !mpsFacet.wasInitialized()) {
      return;
    }

    String url = vFiles[0].getUrl();
    if (!LocalFileSystem.PROTOCOL.equals(VirtualFileManager.extractProtocol(url))) {
      return;
    }
    String path = VirtualFileManager.extractPath(url);
    for (ModelRoot root : mpsFacet.getSolution().getModelRoots()) {
      if (!(root instanceof DefaultModelRoot)) continue;
      DefaultModelRoot modelRoot = (DefaultModelRoot) root;
      for (String sourceRoot : modelRoot.getFiles(DefaultModelRoot.SOURCE_ROOTS)) {
        if (path.startsWith(sourceRoot)) {
          mySolution = mpsFacet.getSolution();
          myModelRoot = modelRoot;
          mySourceRoot = sourceRoot;
          myModelPrefix = path.substring(sourceRoot.length());
          while (myModelPrefix.startsWith("/") || myModelPrefix.startsWith("\\")) {
            myModelPrefix = myModelPrefix.substring(1);
          }
          while (myModelPrefix.endsWith("/") || myModelPrefix.endsWith("\\")) {
            myModelPrefix = myModelPrefix.substring(0, myModelPrefix.length());
          }
          myModelPrefix = myModelPrefix.replaceAll("/", ".");
          myModelPrefix = myModelPrefix.replaceAll("\\\\", ".");
          if (!myModelPrefix.isEmpty()) {
            myModelPrefix += ".";
          }
          return;
        }
      }
    }
  }

  @Override
  public void actionPerformed(AnActionEvent anActionEvent) {
    CreateFromTemplateDialog dialog = new CreateFromTemplateDialog(myProject) {
      @Override
      protected void doOKAction() {
        final ModelTemplates template = ModelTemplates.valueOf(getKindCombo().getSelectedName());
        final String modelName = getNameField().getText().trim();
        if (!isModelNameValid(modelName)) {
          return;
        }

        SModel newModelDescriptor = ModelAccess.instance().runWriteActionInCommand(new Computable<SModel>() {
          @Override
          public SModel compute() {
            // TODO create model in myModelRoot/mySourceRoot, fix literal
            EditableSModel descriptor = SModuleOperations.createModelWithAdjustments(modelName, myModelRoot/*,
              PersistenceRegistry.getInstance().getFolderModelFactory("file-per-root")*/);
            template.preConfigure(descriptor, mySolution);
            descriptor.save();
            return descriptor;
          }
        }, ProjectHelper.toMPSProject(myProject));
        if (newModelDescriptor == null) {
          return;
        }

        processDoNotAskOnOk(OK_EXIT_CODE);
        if (getOKAction().isEnabled()) {
          close(OK_EXIT_CODE);
        }
      }

      private boolean isModelNameValid(String modelName) {
        if (modelName.length() == 0) {
          showError(MPSBundle.message("create.new.model.dialog.error.empty.name"));
          return false;
        }

        if (SModelRepository.getInstance().getModelDescriptor(modelName) != null) {
          showError(MPSBundle.message("create.new.model.dialog.error.model.exists", modelName));
          return false;
        }

        if (modelName.endsWith(".")) {
          showError(MPSBundle.message("create.new.model.dialog.error.empty.short.name"));
          return false;
        }

        if (!(SourceVersion.isName(SModelStereotype.withoutStereotype(modelName)))) {
          showError(MPSBundle.message("create.new.model.dialog.error.invalid.java", modelName));
          return false;
        }
        return true;
      }
    };


    dialog.setTitle(MPSBundle.message("create.new.model.dialog.title"));
    for (ModelTemplates template : ModelTemplates.values()) {
      dialog.getKindCombo().addItem(template.getPresentation(), template.getIcon(), template.name());
    }
    dialog.getNameField().setText(myModelPrefix);
    dialog.show();
  }

  public boolean isEnabled() {
    return myModelRoot != null && myProject != null;
  }

  private enum ModelTemplates {
    EMPTY(MPSBundle.message("new.model.template.empty.presentation"), FileIcons.MODEL_ICON),
    JAVA(MPSBundle.message("new.model.template.java.presentation"), MPSIcons.JAVA_MODEL_ICON, "jetbrains.mps.baseLanguage");

    private final String myPresentation;
    private final Icon myIcon;
    private List<SModuleReference> myLanguagesToImport = new ArrayList<SModuleReference>();

    private ModelTemplates(String presentation, Icon icon, String... languagesToImport) {
      myPresentation = presentation;
      myIcon = icon;

      for (String languageNamespace : languagesToImport) {
        Language language = ModuleRepositoryFacade.getInstance().getModule(languageNamespace, Language.class);
        assert language != null : "Language required by model template is not in repository";
        myLanguagesToImport.add(language.getModuleReference());
      }
    }

    public String getPresentation() {
      return myPresentation;
    }

    public Icon getIcon() {
      return myIcon;
    }

    public void preConfigure(SModel smodel, SModule module) {
      for (SModuleReference languageReference : myLanguagesToImport) {
        if (((AbstractModule) module).getScope().getLanguage(languageReference) == null) {
          ((AbstractModule) module).addUsedLanguage(languageReference);
        }
        ((jetbrains.mps.smodel.SModelInternal) smodel).addLanguage(languageReference);
      }
    }
  }
}
