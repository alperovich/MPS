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
package jetbrains.mps.workbench.choose.nodes;

import com.intellij.navigation.NavigationItem;
import com.intellij.openapi.project.Project;
import jetbrains.mps.openapi.navigation.NavigationSupport;
import jetbrains.mps.ide.project.ProjectHelper;
import jetbrains.mps.project.ProjectOperationContext;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.smodel.ModelAccess;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.util.annotation.ToRemove;
import jetbrains.mps.workbench.choose.base.BaseMPSChooseModel;
import org.jetbrains.mps.openapi.model.SNodeUtil;

/**
 * Use BaseNodePointerModel
 */
@Deprecated
@ToRemove(version = 3.0)
public abstract class BaseNodeModel extends BaseMPSChooseModel<SNode> {
  public BaseNodeModel(Project project) {
    this(project, "node");
  }

  public BaseNodeModel(Project project, String entityName) {
    super(project, entityName);
  }

  @Override
  public String doGetFullName(Object element) {
    NodePresentation presentation = (NodePresentation) ((NavigationItem) element).getPresentation();
    assert presentation != null;
    return presentation.getModelName() + "." + presentation.getPresentableText();
  }

  @Override
  public String doGetObjectName(SNode node) {
    String name = node.getName();
    if (name == null) {
      return node.toString();
    }
    return name;
  }

  @Override
  public NavigationItem doGetNavigationItem(SNode node) {
    return new BaseNodeItem(node) {
      private Project myProject = getProject();

      @Override
      public void navigate(boolean requestFocus) {
        ModelAccess.instance().runWriteInEDT(new Runnable() {
          @Override
          public void run() {
            SNode node = getNode();
            if (node == null || !SNodeUtil.isAccessible(node, MPSModuleRepository.getInstance())) {
              return;
            }
            // TODO: use node pointers here
            ProjectOperationContext context = new ProjectOperationContext(ProjectHelper.toMPSProject(myProject));
            NavigationSupport.getInstance().openNode(context, node, true, !(node.getModel() != null && node.getParent() == null));
          }
        });
      }
    };
  }

  @Override
  protected String doGetCheckBoxName() {
    return "Include &non-&&project models";
  }
}
