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
package jetbrains.mps.workbench.dialogs.project;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task.Modal;
import com.intellij.openapi.ui.DialogWrapper;
import jetbrains.mps.cleanup.CleanupManager;
import jetbrains.mps.ide.ThreadUtils;
import jetbrains.mps.ide.project.ProjectHelper;
import jetbrains.mps.project.Project;
import jetbrains.mps.project.ProjectOperationContext;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SModelRepository;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.jdesktop.beansbinding.AutoBinding;
import org.jetbrains.annotations.NotNull;

import javax.swing.JComponent;
import java.awt.GridBagConstraints;
import java.awt.HeadlessException;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseBindedDialog extends DialogWrapper implements IBindedDialog {
  private static final Logger LOG = LogManager.getLogger(BaseBindedDialog.class);
  private final Project myProject;

  private List<AutoBinding> myBindings = new ArrayList<AutoBinding>();

  protected BaseBindedDialog(String text, Project project) throws HeadlessException {
    super(ProjectHelper.toIdeaProject(project));
    myProject = project;
    setTitle(text);
  }

  @Override
  protected abstract JComponent createCenterPanel();

  @Override
  public final JComponent getMainComponent() {
    return createCenterPanel();
  }

  @Override
  public IOperationContext getOperationContext() {
    return new ProjectOperationContext(getProject());
  }

  @Override
  public IScope getModuleScope() {
    return getOperationContext().getScope();
  }

  @Override
  public IScope getProjectScope() {
    return getProject().getScope();
  }

  @Override
  public Project getProject() {
    return myProject;
  }

  public void addNotify() {
    getContentPane().addNotify();
    bind();
  }

  public void removeNotify() {
    unbind();
    getContentPane().removeNotify();
  }

  final protected void bind() {
    for (AutoBinding b : myBindings) {
      if (!b.isBound()) {
        b.bind();
      }
    }
  }

  final public void unbind() {
    for (AutoBinding binding : myBindings) {
      if (binding.isBound()) {
        binding.unbind();
      }
    }
  }

  @Override
  final public void addBinding(AutoBinding binding) {
    myBindings.add(binding);
  }

  /**
   * should be called on "ok", "apply" etc.
   *
   * @return true if no errors and the dialog should be closed
   */
  protected final boolean saveChanges() {
    final boolean[] closeDialog = new boolean[]{true};

    //to save changes in all models before reload not to lose them
    getProject().getRepository().getModelAccess().executeCommand(new Runnable() {
      @Override
      public void run() {
        SModelRepository.getInstance().saveAll();
      }
    });

    ThreadUtils.runInUIThreadAndWait(new Runnable() {
      @Override
      public void run() {
        closeDialog[0] = doSaveChanges();
      }
    });

    ProgressManager.getInstance().run(new Modal(ProjectHelper.toIdeaProject(getProject()), "Applying changes", false) {
      @Override
      public void run(@NotNull ProgressIndicator indicator) {
        indicator.setIndeterminate(true);
        try {
          ModelAccess.instance().runWriteAction(new Runnable() {
            @Override
            public void run() {
              CleanupManager.getInstance().cleanup();
            }
          });
        } catch (Throwable t) {
          LOG.error(null, t);
        }
      }
    });

    ApplicationManager.getApplication().saveAll();

    return closeDialog[0];
  }

  @Override
  protected final void doOKAction() {
    if (saveChanges())
      super.doOKAction();
  }

  @Override
  public void show() {
    init();
    addNotify();
    super.show();
  }

  @Override
  protected void dispose() {
    removeNotify();
    super.dispose();
  }

  protected boolean doSaveChanges() {
    return true;
  }

  public enum ConstraintsType {
    LABEL {
      @Override
      public GridBagConstraints create(int x, int y) {
        GridBagConstraints c = LIST.create(x, y);
        c.weightx = 0;
        c.weighty = 0;
        return c;
      }
    },
    FIELD {
      @Override
      public GridBagConstraints create(int x, int y) {
        GridBagConstraints c = LIST.create(x, y);
        c.weighty = 0;
        return c;
      }
    },
    LIST {
      @Override
      public GridBagConstraints create(int x, int y) {
        return new GridBagConstraints(x, y, 1, 1, 1, 1, GridBagConstraints.NORTHWEST, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
      }
    };

    public GridBagConstraints create(int y) {
      return create(0, y);
    }

    public abstract GridBagConstraints create(int x, int y);
  }
}
