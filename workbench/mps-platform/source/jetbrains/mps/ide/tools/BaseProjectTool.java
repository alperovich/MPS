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
package jetbrains.mps.ide.tools;

import com.intellij.openapi.components.ProjectComponent;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.startup.StartupManager;
import com.intellij.openapi.wm.ToolWindowAnchor;
import jetbrains.mps.project.MPSProjectMigrationComponent;
import jetbrains.mps.project.MPSProjectMigrationListener;

import javax.swing.Icon;

public abstract class BaseProjectTool extends BaseTool implements ProjectComponent {
  protected BaseProjectTool(Project project, String id, int number, Icon icon, ToolWindowAnchor anchor, boolean sideTool, boolean canCloseContent) {
    super(project, id, number, icon, anchor, sideTool, canCloseContent);
  }

  protected BaseProjectTool(Project project, String id, int number, Icon icon, ToolWindowAnchor anchor, boolean canCloseContent) {
    super(project, id, number, icon, anchor, canCloseContent);
  }

  @Override
  public void projectOpened() {
    final MPSProjectMigrationComponent migrationState = getProject().getComponent(MPSProjectMigrationComponent.class);
    if (migrationState != null && migrationState.isMigrationRequired() && migrationState.hasMigrationAgent()) {
      migrationState.addMigrationListener(new MPSProjectMigrationListener.DEFAULT() {
        @Override
        public void migrationFinished(Project mpsProject) {
          migrationState.removeMigrationListener(this);
          createAndRegisterTool(false);
        }
        @Override
        public void migrationAborted(Project project) {
          migrationState.removeMigrationListener(this);
        }
      });
    }
    else {
      createAndRegisterTool(true);
    }
  }

  @Override
  public void projectClosed() {

  }

  @Override
  public void initComponent() {
  }

  private void createAndRegisterTool(final boolean early) {
    createTool(early);
    if (early) {
      StartupManager.getInstance(getProject()).registerPostStartupActivity(new Runnable() {
        @Override
        public void run() {
          registerLater();
        }
      });
    }
    else {
      registerLater();
    }
  }

  @Override
  public void disposeComponent() {
    unregister();
  }

  /** Either this method or the one without parameters must be implemented. Not both.*/
  protected void createTool (boolean early) {
    createTool();
  }

  /** Either this method or the one with boolean parameter must be implemented. Not both.*/
  protected void createTool () {
    throw new UnsupportedOperationException();
  }
}
