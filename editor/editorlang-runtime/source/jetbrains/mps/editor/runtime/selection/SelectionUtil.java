/*
 * Copyright 2003-2013 JetBrains s.r.o.
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
package jetbrains.mps.editor.runtime.selection;

import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;

/**
 * User: shatalin
 * Date: 6/10/13
 */
public class SelectionUtil {
  public static void selectNode(EditorContext editorContext, SNode node) {
    editorContext.flushEvents();
    editorContext.getSelectionManager().setSelection(node);
  }

  public static void selectCell(EditorContext editorContext, SNode node, String cellId) {
    editorContext.flushEvents();
    editorContext.getSelectionManager().setSelection(node, cellId);
  }

  public static void selectLabelCellAnSetCaret(EditorContext editorContext, SNode node, String cellId, int caretPosition) {
    editorContext.flushEvents();
    editorContext.getSelectionManager().setSelection(node, cellId, caretPosition);
  }

  public static void selectLabelCellWithSelection(EditorContext editorContext, SNode node, String cellId, int startSelection, int endSelection) {
    editorContext.flushEvents();
    editorContext.getSelectionManager().setSelection(node, cellId, startSelection, endSelection);
  }
}
