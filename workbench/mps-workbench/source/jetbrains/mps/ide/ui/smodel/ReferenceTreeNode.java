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
package jetbrains.mps.ide.ui.smodel;

import jetbrains.mps.ide.projectPane.Icons;
import jetbrains.mps.ide.ui.tree.TextTreeNode;
import jetbrains.mps.openapi.navigation.NavigationSupport;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.ModelAccess;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.model.SReference;

public class ReferenceTreeNode extends TextTreeNode {
  private final SReference myRef;

  public ReferenceTreeNode(IOperationContext context, SReference ref) {
    super(ref.getRole() + ": " + ref.getTargetNode(), context);
    myRef = ref;
    setIcon(Icons.DEFAULT_ICON);
  }

  @Override
  public void doubleClick() {
    ModelAccess.instance().runWriteInEDT(new Runnable() {
      @Override
      public void run() {
        SNode target = myRef.getTargetNode();
        if (target == null) return;
        NavigationSupport.getInstance().openNode(getOperationContext(), target, true, !(target.getModel() != null && target.getParent() == null));
      }
    });
  }

  public SReference getRef() {
    return myRef;
  }

  @Override
  public boolean isLeaf() {
    return true;
  }
}
