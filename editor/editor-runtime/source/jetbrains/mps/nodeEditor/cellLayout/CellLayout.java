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
package jetbrains.mps.nodeEditor.cellLayout;

import jetbrains.mps.openapi.editor.TextBuilder;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.cells.EditorCell_Collection;
import org.jetbrains.annotations.Nullable;

import java.awt.Rectangle;
import java.util.List;

public interface CellLayout extends jetbrains.mps.openapi.editor.cells.CellLayout {

  void doLayout(EditorCell_Collection editorCells);

  TextBuilder doLayoutText(Iterable<EditorCell> editorCells);

  int getAscent(EditorCell_Collection editorCells);

  int getDescent(EditorCell_Collection editorCell_collection);

  List<Rectangle> getSelectionBounds(EditorCell_Collection editorCells);

  boolean canBeFolded();

  @Nullable
  List<? extends EditorCell> getSelectionCells(EditorCell_Collection editorCells);
}
