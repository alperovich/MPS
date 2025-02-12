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
package jetbrains.mps.ide.projectPane.logicalview;

import jetbrains.mps.ide.ui.tree.MPSTreeNode;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.smodel.*;
import jetbrains.mps.smodel.loading.ModelLoadingState;

public abstract class SimpleModelListener extends SModelAdapter {
  private MPSTreeNode myTreeNode;

  public SimpleModelListener(MPSTreeNode treeNode) {
    myTreeNode = treeNode;
  }

  protected void updateNodePresentation(final boolean reloadSubTree, final boolean updateAncestors) {
    ModelAccess.instance().runReadInEDT(new Runnable() {
      @Override
      public void run() {
        if (isValid()) {
          myTreeNode.updatePresentation(reloadSubTree, updateAncestors);
        }
      }
    });
  }

  @Override
  public void modelSaved(SModel sm) {
    updateNodePresentation(false, true);
  }

  @Override
  public void modelLoadingStateChanged(SModel sm, ModelLoadingState newState) {
    updateNodePresentation(false, false);
  }

  public boolean isValid() {
    if (myTreeNode.getTree() == null) return false;

    //module has been already removed
    if (!myTreeNode.getOperationContext().isValid()) return false;

    return true;
  }
}
