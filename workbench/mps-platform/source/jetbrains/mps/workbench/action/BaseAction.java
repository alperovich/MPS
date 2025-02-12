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
package jetbrains.mps.workbench.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.actionSystem.Presentation;
import com.intellij.openapi.project.Project;
import gnu.trove.THashMap;
import jetbrains.mps.ide.actions.MPSCommonDataKeys;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.workbench.ActionPlace;
import org.jetbrains.annotations.Nullable;

import javax.swing.Icon;
import java.awt.event.KeyEvent;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class BaseAction extends AnAction {
  private boolean myIsAlwaysVisible = true;
  private boolean myExecuteOutsideCommand = false;
  private boolean myDisableOnNoProject = true;
  private Set<ActionPlace> myPlaces = null;

  public BaseAction() {
    this(null, null, null);
  }

  public BaseAction(String text) {
    this(text, null, null);
  }

  public BaseAction(@Nullable String text, @Nullable String description, @Nullable Icon icon) {
    super(text, description, icon);
    setEnabledInModalContext(true);
  }

  public void setExecuteOutsideCommand(boolean executeOutsideCommand) {
    myExecuteOutsideCommand = executeOutsideCommand;
  }

  public boolean isExecuteOutsideCommand() {
    return myExecuteOutsideCommand;
  }

  public void setIsAlwaysVisible(boolean isAlwaysVisible) {
    myIsAlwaysVisible = isAlwaysVisible;
  }

  public void setDisableOnNoProject(boolean disableOnNoProject) {
    myDisableOnNoProject = disableOnNoProject;
  }

  public boolean isApplicable(final AnActionEvent event, final Map<String, Object> _params) {
    return false;
  }

  public boolean isApplicable(final AnActionEvent e) {
    final THashMap<String, Object> params = new THashMap<String, Object>();
    ModelAccess.instance().runReadAction(new Runnable() {
      @Override
      public void run() {
        collectActionData(e, params);
      }
    });
    return isApplicable(e, params);
  }

  public void setMnemonic(char mnemonic) {
    String text = getTemplatePresentation().getText();
    int pos = text.indexOf(Character.toUpperCase(mnemonic));
    if (pos == -1) pos = text.indexOf(Character.toLowerCase(mnemonic));
    StringBuilder newText = new StringBuilder(text);
    newText.insert(pos, '_');
    getTemplatePresentation().setText(newText.toString());
  }

  @Override
  public final void update(final AnActionEvent e) {
    super.update(e);

    ActionPlace place = e.getData(MPSCommonDataKeys.PLACE);

    if (e.getInputEvent() instanceof KeyEvent) {
      if (!getPlaces().contains(null)) {
        if (!getPlaces().contains(place)) {
          disable(e.getPresentation());
          return;
        }
      }
    }

    ModelAccess.instance().runReadAction(new Runnable() {
      @Override
      public void run() {
        if (myDisableOnNoProject && e.getData(PlatformDataKeys.PROJECT) == null) {
          disable(e.getPresentation());
          return;
        }
        THashMap<String, Object> params = new THashMap<String, Object>();
        if (!collectActionData(e, params)) {
          disable(e.getPresentation());
          return;
        }
        doUpdate(e, params);
      }
    });
  }

  @Override
  public final void actionPerformed(final AnActionEvent event) {
    final THashMap<String, Object> params = new THashMap<String, Object>();
    ModelAccess.instance().runReadAction(new Runnable() {
      @Override
      public void run() {
        collectActionData(event, params);
      }
    });
    final ModelAccess access = ModelAccess.instance();
    if (myExecuteOutsideCommand) {
      doExecute(event, params);
    } else {
      Project project = getEventProject(event);
      if (project != null) {
        // modern API
        access.runWriteActionInCommand(new Runnable() {
          @Override
          public void run() {
            doExecute(event, params);
          }
        }, getTemplatePresentation().getText(), null, false, project.getComponent(MPSProject.class));
      } else {
        // deprecated API
        access.runWriteActionInCommand(new Runnable() {
          @Override
          public void run() {
            doExecute(event, params);
          }
        });
      }
    }
  }

  protected void disable(Presentation p) {
    p.setEnabled(false);
    p.setVisible(myIsAlwaysVisible);
  }

  protected void enable(final Presentation p) {
    p.setEnabled(true);
    p.setVisible(true);
  }

  //made public just to use in MPS classifiers, workaround on MPS-3472

  public void setEnabledState(Presentation p, boolean state) {
    if (state) enable(p);
    else disable(p);
  }

  public void addPlace(ActionPlace place) {
    if (myPlaces == null) myPlaces = new HashSet<ActionPlace>();
    myPlaces.add(place);
  }

  public Set<ActionPlace> getPlaces() {
    if (myPlaces != null) return myPlaces;
    Set<ActionPlace> result = new HashSet<ActionPlace>();
    result.add(null);
    return result;
  }

  protected boolean collectActionData(AnActionEvent e, Map<String, Object> params) {
    return true;
  }

  protected void doUpdate(AnActionEvent e, Map<String, Object> params) {
    e.getPresentation().setVisible(true);
    e.getPresentation().setEnabled(true);
  }

  public String getActionId() {
    return getClass().getName();
  }

  protected abstract void doExecute(AnActionEvent e, Map<String, Object> params);
}
