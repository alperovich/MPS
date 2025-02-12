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

import jetbrains.mps.editor.runtime.style.DefaultBaseLine;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.editor.runtime.style.TableComponent;
import jetbrains.mps.nodeEditor.cells.APICellAdapter;
import jetbrains.mps.openapi.editor.TextBuilder;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.cells.EditorCell_Collection;

/**
 * Sergey.Sinchuk, Oct 30, 2009
 */
public class CellLayout_Table extends AbstractCellLayout {

  private EditorCell_Collection myParentCollection = null;
  private CellLayout_Table myParentLayout = null;
  private EditorCell_Collection[] myDescendants = null;
  private int[] myRowAscents = null;
  private int[] myRowDescents = null;
  private int[] myColumnWidths = null;

  @Override
  public boolean canBeFolded() {
    return true;
  }

  private static TableComponent rotate(TableComponent c) {
    if (c == TableComponent.HORIZONTAL_COLLECTION) return TableComponent.VERTICAL_COLLECTION;
    return TableComponent.HORIZONTAL_COLLECTION;
  }

  private EditorCell_Collection findCollection(EditorCell cell, TableComponent tc) {
    if (cell instanceof EditorCell_Collection) {
      EditorCell_Collection col = (EditorCell_Collection) cell;
      jetbrains.mps.openapi.editor.cells.CellLayout l = col.getCellLayout();
      if (l instanceof CellLayout_Table) {
        TableComponent comp = col.getStyle().get(StyleAttributes.TABLE_COMPONENT);
        if (comp == tc) return col;
      }
      for (EditorCell c : col) {
        EditorCell_Collection result = findCollection(c, tc);
        if (result != null) return result;
      }
    }
    return null;
  }

  public void findPairingCollections(EditorCell_Collection editorCells) {
    if (myParentCollection == null) {
      TableComponent tc = editorCells.getStyle().get(StyleAttributes.TABLE_COMPONENT);
      myDescendants = new EditorCell_Collection[editorCells.getCellsCount()];
      for (int i = 0; i < editorCells.getCellsCount(); i++) {
        EditorCell_Collection col = findCollection(editorCells.getCellAt(i), rotate(tc));
        if (col != null) {
          myDescendants[i] = col;
          ((CellLayout_Table) col.getCellLayout()).myParentCollection = editorCells;
          ((CellLayout_Table) col.getCellLayout()).myParentLayout = this;
        } else {
          myDescendants[i] = null;
        }
      }
    }
  }

  @Override
  public void doLayout(EditorCell_Collection editorCells) {
    final int x = editorCells.getX();
    final int y = editorCells.getY();

    if (CellLayout_Indent_Old.DO_INDENT_EVERYWHERE) {
      CellLayout_Indent_Old._doLayout(editorCells);
      return;
    }

    TableComponent tc = editorCells.getStyle().get(StyleAttributes.TABLE_COMPONENT);
    findPairingCollections(editorCells);

    int cellCount = editorCells.getCellsCount();

    if (myDescendants != null && tc == TableComponent.HORIZONTAL_COLLECTION) {
      int maxCellsInColumn = 0;
      for (int i = 0; i < cellCount; i++) {
        EditorCell_Collection col = myDescendants[i];
        if (col != null) maxCellsInColumn = Math.max(maxCellsInColumn, col.getCellsCount());
      }

      myRowAscents = new int[maxCellsInColumn];
      myRowDescents = new int[maxCellsInColumn];
      for (int i = 0; i < cellCount; i++) {
        EditorCell_Collection col = myDescendants[i];
        if (col != null) for (int j = 0; j < col.getCellsCount(); j++) {
          col.getCellAt(j).relayout();
          myRowAscents[j] = Math.max(myRowAscents[j], col.getCellAt(j).getAscent());
          myRowDescents[j] = Math.max(myRowDescents[j], col.getCellAt(j).getDescent());
        }
      }
    }

    if (myDescendants != null && tc == TableComponent.VERTICAL_COLLECTION) {
      int maxCellsInRow = 0;
      for (int i = 0; i < cellCount; i++) {
        EditorCell_Collection col = myDescendants[i];
        if (col != null) maxCellsInRow = Math.max(maxCellsInRow, col.getCellsCount());
      }

      myColumnWidths = new int[maxCellsInRow];
      for (int i = 0; i < cellCount; i++) {
        EditorCell_Collection col = myDescendants[i];
        if (col != null) for (int j = 0; j < col.getCellsCount(); j++) {
          col.getCellAt(j).relayout();
          myColumnWidths[j] = Math.max(myColumnWidths[j], col.getCellAt(j).getWidth());
        }
      }
    }

    for (EditorCell c : editorCells) c.relayout();

    int width = 0;
    int height = 0;

    if (tc == TableComponent.VERTICAL_COLLECTION) {
      int leftMargin = 0;
      int rightMargin = 0;
      int gridWidth = 0;

      for (int i = 0; i < cellCount; i++) {
        EditorCell innerCollection = null;
        if (myDescendants != null) innerCollection = myDescendants[i];
        EditorCell outerCell = editorCells.getCellAt(i);
        if (innerCollection == null) {
          gridWidth = Math.max(gridWidth, outerCell.getWidth());
        } else {
          gridWidth = Math.max(gridWidth, innerCollection.getWidth());
          leftMargin = Math.max(leftMargin, innerCollection.getX() - outerCell.getX());
          rightMargin = Math.max(rightMargin, (outerCell.getX() + outerCell.getWidth()) -
            (innerCollection.getX() + innerCollection.getWidth()));
        }
      }

      for (int i = 0; i < cellCount; i++) {
        EditorCell innerCollection = null;
        if (myDescendants != null) innerCollection = myDescendants[i];
        EditorCell outerCell = editorCells.getCellAt(i);
        int tm;
        if (innerCollection == null) tm = 0;
        else tm = innerCollection.getX() - outerCell.getX();

        if (innerCollection == null) outerCell.setX(x + (leftMargin - tm) + (gridWidth - outerCell.getWidth()) / 2);
        else
          outerCell.setX(x + (leftMargin - tm));

        int myStripeHeight = outerCell.getHeight();
        int myStripeAscent = outerCell.getAscent();
        if (myParentLayout != null) {
          myStripeHeight = myParentLayout.myRowAscents[i] + myParentLayout.myRowDescents[i];
          myStripeAscent = myParentLayout.myRowAscents[i];
        }

        outerCell.setY(y + height + (myStripeAscent - outerCell.getAscent()));
        height += myStripeHeight;
      }

      width += leftMargin + rightMargin + gridWidth;
    }

    if (tc == TableComponent.HORIZONTAL_COLLECTION) {
      int topMargin = 0;
      int bottomMargin = 0;
      int maxAscent = 0;
      int maxDescent = 0;
      for (int i = 0; i < cellCount; i++) {
        EditorCell innerCollection = null;
        if (myDescendants != null) innerCollection = myDescendants[i];
        EditorCell outerCell = editorCells.getCellAt(i);
        if (innerCollection == null) {
          maxAscent = Math.max(maxAscent, outerCell.getAscent());
          maxDescent = Math.max(maxDescent, outerCell.getDescent());
        } else {
          maxAscent = Math.max(maxAscent, innerCollection.getHeight());
          topMargin = Math.max(topMargin, innerCollection.getY() - outerCell.getY());
          bottomMargin = Math.max(bottomMargin, (outerCell.getY() + outerCell.getHeight()) -
            (innerCollection.getY() + innerCollection.getHeight()));
        }
      }
      height = topMargin + maxAscent + maxDescent + bottomMargin;
      for (int i = 0; i < cellCount; i++) {
        EditorCell innerCollection = null;
        if (myDescendants != null) innerCollection = myDescendants[i];
        EditorCell outerCell = editorCells.getCellAt(i);
        int tm;
        if (innerCollection == null) tm = 0;
        else tm = innerCollection.getY() - outerCell.getY();
        int myStripeWidth = outerCell.getWidth();
        if (myParentLayout != null) myStripeWidth = myParentLayout.myColumnWidths[i];
        outerCell.setX(x + width + (myStripeWidth - outerCell.getWidth()) / 2);
        width += myStripeWidth;

        if (innerCollection == null) {
          if (myParentLayout == null)
            outerCell.setY(y + (topMargin - tm) + (maxAscent + maxDescent - outerCell.getHeight()) / 2);
          else
            outerCell.setY(y + (topMargin - tm) + (maxAscent - outerCell.getAscent()));
        } else outerCell.setY(y + (topMargin - tm));
      }
    }
    for (EditorCell c : editorCells) c.relayout();

    editorCells.setWidth(width);
    editorCells.setHeight(height);
  }

  @Override
  public TextBuilder doLayoutText(Iterable<EditorCell> editorCells) {
    TextBuilder result = jetbrains.mps.nodeEditor.text.TextBuilder.getEmptyTextBuilder();
    for (EditorCell editorCell : editorCells) {
      result = result.appendToTheBottom(editorCell.renderText());
    }
    return result;
  }

  @Override
  public int getAscent(EditorCell_Collection editorCells) {
    for (EditorCell cell : editorCells) {
      if (cell.getStyle().get(StyleAttributes.BASE_LINE_CELL)) {
        return cell.getY() - editorCells.getY() + cell.getAscent();
      }
    }

    DefaultBaseLine bL = editorCells.getStyle().get(StyleAttributes.DEFAULT_BASE_LINE);

    int result = 0;
    for (EditorCell cell : editorCells) {
      result = cell.getAscent();
      if (result > 0) {
        break;
      }
    }

    switch (bL) {
      case FIRST: // default behavior
        return result;
      case CENTER:
        return Math.max(result, editorCells.getHeight() / 2);
      case LAST:
        EditorCell lastCell = editorCells.getCellAt(editorCells.getCellsCount() - 1);
        if (lastCell != null) {
          return lastCell.getY() - editorCells.getY() + lastCell.getAscent();
        }
    }

    return 0;
  }

  @Override
  public int getRightInternalInset(EditorCell_Collection editorCell_collection) {
    EditorCell editorCell = editorCell_collection.firstCell();
    if (editorCell != null) return editorCell.getRightInset();
    else return 0;
  }

  public String toString() {
    return "Vertical";
  }

}
