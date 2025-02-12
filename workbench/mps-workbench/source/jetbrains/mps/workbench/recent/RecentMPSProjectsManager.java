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
package jetbrains.mps.workbench.recent;

import com.intellij.ide.RecentProjectsManagerBase;
import com.intellij.ide.impl.ProjectUtil;
import com.intellij.openapi.components.Storage;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ProjectManager;
import com.intellij.openapi.util.io.FileUtil;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.platform.ProjectBaseDirectory;
import com.intellij.util.messages.MessageBus;
import org.jetbrains.annotations.Nullable;


@com.intellij.openapi.components.State(
  name = "RecentMPSProjectsManager",
  storages = {
    @Storage(
      id = "other",
      file = "$APP_CONFIG$/other.xml"
    )}
)
public class RecentMPSProjectsManager extends RecentProjectsManagerBase {
  public RecentMPSProjectsManager(ProjectManager projectManager, MessageBus messageBus) {
    super(projectManager, messageBus);
  }

  @Override
  @Nullable
  protected String getProjectPath(Project project) {
    return project.getPresentableUrl();
  }

  @Override
  protected void doOpenProject(String projectPath, Project projectToClose, boolean forceNewFrame) {
    final VirtualFile projectFile = LocalFileSystem.getInstance().findFileByPath(FileUtil.toSystemIndependentName(projectPath));
    if (projectFile != null) {
      Project project = ProjectUtil.openProject(projectPath, projectToClose, forceNewFrame);
      if (project != null) {
        ProjectBaseDirectory.getInstance(project).setBaseDir(project.getBaseDir());
      }
    }
  }
}
