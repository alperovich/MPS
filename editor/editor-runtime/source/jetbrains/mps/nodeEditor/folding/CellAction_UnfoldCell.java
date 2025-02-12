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
package jetbrains.mps.nodeEditor.folding;

import jetbrains.mps.editor.runtime.cells.AbstractCellAction;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.util.Condition;

public class CellAction_UnfoldCell extends AbstractCellAction {

  @Override
  public boolean canExecute(EditorContext context) {
    EditorCell selectedCell = (EditorCell) context.getSelectedCell();
    if (selectedCell == null) return false;
    return findCell(selectedCell) != null;
  }

  @Override
  public void execute(EditorContext context) {
    EditorCell selectedCell = (EditorCell) context.getSelectedCell();
    EditorCell_Collection targetCell = findCell(selectedCell);
    targetCell.unfold();
  }

  @Override
  public boolean executeInCommand() {
    return false;
  }

  private static EditorCell_Collection findCell(EditorCell editorCell) {
    return editorCell.findParent(new Condition<EditorCell_Collection>() {
      @Override
      public boolean met(EditorCell_Collection object) {
        return object.isFolded();
      }
    });
  }
}
