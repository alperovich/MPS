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
package jetbrains.mps.ide.devkit.generator;

import com.intellij.openapi.actionSystem.ActionGroup;
import com.intellij.openapi.project.Project;
import jetbrains.mps.ide.ui.tree.MPSTree;
import jetbrains.mps.ide.ui.tree.MPSTreeNode;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.util.Computable;

public class GenerationTracerTree extends MPSTree {
  private TracerNode myRootTracerNode;
  private Project myProject;
  private boolean myAutoscrollToSource;

  public GenerationTracerTree(TracerNode root, Project project) {
    myRootTracerNode = root;
    myProject = project;
  }

  protected GenerationTracerTreeNode rebuild() {
    return new GenerationTracerTreeNode(myRootTracerNode, myProject);
  }

  public boolean isAutoscrollToSource() {
    return myAutoscrollToSource;
  }

  public void setAutoscrollToSource(boolean b) {
    myAutoscrollToSource = b;
  }

  @Override
  protected ActionGroup createPopupActionGroup(final MPSTreeNode node) {
    if (!(node instanceof GenerationTracerTreeNode)) return null;

    return ModelAccess.instance().runReadAction(new Computable<ActionGroup>() {
      @Override
      public ActionGroup compute() {
        return ((GenerationTracerTreeNode) node).getTracerActionGroup();
      }
    });
  }
}
