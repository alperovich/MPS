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

import jetbrains.mps.ide.ui.tree.MPSTreeNode;
import org.jetbrains.mps.openapi.module.SModule;import jetbrains.mps.project.*;
import jetbrains.mps.project.structure.ProjectStructureModule;
import jetbrains.mps.smodel.Generator;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.Language;

public abstract class ProjectModuleTreeNode extends MPSTreeNode implements MPSModuleTreeNode {
  public static ProjectModuleTreeNode createFor(Project project, SModule module) {
    return createFor(project, module, false);
  }

  public static ProjectModuleTreeNode createFor(Project project, SModule module, boolean shortNameOnly) {
    if (module instanceof Language) {
      return new ProjectLanguageTreeNode((Language) module, project, shortNameOnly);
    } else if (module instanceof Solution || module instanceof ProjectStructureModule) {
      return new ProjectSolutionTreeNode((AbstractModule) module, project, shortNameOnly);
    } else if (module instanceof DevKit) {
      return new ProjectDevKitTreeNode((DevKit) module, project, false);
    } else if (module instanceof Generator) {
      return new GeneratorTreeNode((Generator) module, project);
    }
    return null;
  }

  @Override
  public void setUserObject(Object userObject) {
    super.setUserObject(userObject);
  }

  protected ProjectModuleTreeNode(IOperationContext operationContext) {
    super(operationContext);
    setUserObject(operationContext.getModule().getModuleName());
  }

  @Override
  protected void doUpdatePresentation() {
    setText(getModuleText());
  }

  @Override
  protected final boolean canBeOpened() {
    return false;
  }
}
