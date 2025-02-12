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
package jetbrains.mps.ide.ui.tree.module;

import jetbrains.mps.ide.icons.IdeIcons;
import jetbrains.mps.project.AbstractModule;
import jetbrains.mps.project.ModuleContext;
import jetbrains.mps.project.Project;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.vfs.IFile;

public class ProjectSolutionTreeNode extends ProjectModuleTreeNode {
  private AbstractModule mySolution;
  private boolean myShortNameOnly;

  private boolean myInitialized;

  protected ProjectSolutionTreeNode(AbstractModule solution, Project project, boolean shortNameOnly) {
    super(new ModuleContext(solution, project));
    myShortNameOnly = shortNameOnly;
    mySolution = solution;

    IFile descriptorFile = mySolution.getDescriptorFile();
    String id = descriptorFile == null ? mySolution.getModuleName() : descriptorFile.getPath();
    setNodeIdentifier(id);
    setIcon(IdeIcons.SOLUTION_ICON);
    init();
  }

  @Override
  public AbstractModule getModule() {
    return mySolution;
  }

  @Override
  public String getModuleText() {
    String name = mySolution.getModuleName();

    if (myShortNameOnly) {
      name = NameUtil.shortNameFromLongName(name);
    }

    if (name != null) {
      return name;
    }
    return "solution";
  }

  @Override
  public boolean isInitialized() {
    return myInitialized;
  }

  @Override
  public void init() {
    populate();
    myInitialized = true;
  }

  private void populate() {
    SModelsSubtree.create(this, getOperationContext());
  }
}
