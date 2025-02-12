/*
 * Copyright 2003-2012 JetBrains s.r.o.
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
package jetbrains.mps.ide.projectPane.logicalview.highlighting.visitor.updates;

import jetbrains.mps.ide.ui.tree.MPSTreeNode;
import jetbrains.mps.util.EqualUtil;

public class GenStatusNodeUpdate extends NodeUpdate {
  private String myText;

  public GenStatusNodeUpdate(String addText) {
    myText = addText;
  }

  @Override
  public boolean needed(MPSTreeNode node) {
    return !EqualUtil.equals(node.getAdditionalText(), myText);
  }

  @Override
  public void update(MPSTreeNode node) {
    node.setAdditionalText(myText);
  }
}
