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
package jetbrains.mps.nodeEditor.cells;

import com.intellij.openapi.command.CommandProcessor;
import com.intellij.util.LocalTimeCounter;
import com.intellij.util.ui.UIUtil;
import jetbrains.mps.editor.runtime.cells.AbstractCellAction;
import jetbrains.mps.editor.runtime.style.Padding;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.editor.runtime.style.StyleAttributesUtil;
import jetbrains.mps.ide.datatransfer.CopyPasteUtil;
import jetbrains.mps.ide.datatransfer.TextPasteUtil;
import jetbrains.mps.nodeEditor.CellSide;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.nodeEditor.IntelligentInputUtil;
import jetbrains.mps.nodeEditor.cellMenu.NodeSubstitutePatternEditor;
import jetbrains.mps.nodeEditor.selection.EditorCellLabelSelection;
import jetbrains.mps.nodeEditor.text.TextBuilder;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.CellAction;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.openapi.editor.cells.SubstituteInfo;
import jetbrains.mps.openapi.editor.selection.MultipleSelection;
import jetbrains.mps.openapi.editor.selection.SelectionManager;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SNodeUndoableAction;
import jetbrains.mps.smodel.UndoHelper;
import jetbrains.mps.util.Computable;
import jetbrains.mps.util.EqualUtil;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.workbench.nodesFs.MPSNodesVirtualFileSystem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.lang.ref.WeakReference;

public abstract class EditorCell_Label extends EditorCell_Basic implements jetbrains.mps.openapi.editor.cells.EditorCell_Label {
  protected boolean myNoTextSet;
  protected TextLine myTextLine;
  protected TextLine myNullTextLine;
  protected boolean myCaretIsVisible = true;

  protected EditorCell_Label(@NotNull jetbrains.mps.openapi.editor.EditorContext editorContext, SNode node, String text) {
    super(editorContext, node);
    myTextLine = new TextLine("", getStyle(), false);
    myNullTextLine = new TextLine("", getStyle(), true);

    myTextLine.setCaretEnabled(true);
    myNullTextLine.setCaretEnabled(true);
    setText(text);

    setAction(CellActionType.LEFT, new MoveLeft(false));
    setAction(CellActionType.RIGHT, new MoveRight(false));

    setAction(CellActionType.LOCAL_HOME, new LocalHome(false));
    setAction(CellActionType.LOCAL_END, new LocalEnd(false));

    setAction(CellActionType.SELECT_RIGHT, new MoveRight(true));
    setAction(CellActionType.SELECT_LEFT, new MoveLeft(true));

    setAction(CellActionType.SELECT_HOME, new SelectHome());
    setAction(CellActionType.SELECT_END, new SelectEnd());

    setAction(CellActionType.SELECT_LOCAL_HOME, new LocalHome(true));
    setAction(CellActionType.SELECT_LOCAL_END, new LocalEnd(true));

    setAction(CellActionType.COPY, new CopyLabelText());
    setAction(CellActionType.PASTE, new PasteIntoLabelText());
    setAction(CellActionType.CUT, new CutLabelText());
    setAction(CellActionType.CLEAR_SELECTION, new ClearSelection());
  }

  @Override
  public boolean isFirstPositionInBigCell() {
    return getContainingBigCell().getFirstLeaf() == this && isFirstCaretPosition();
  }

  @Override
  public boolean isLastPositionInBigCell() {
    return getContainingBigCell().getLastLeaf() == this && isLastCaretPosition() && !getTextLine().hasNonTrivialSelection();
  }

  public boolean canPasteText() {
    return true;
  }

  @Override
  public void setSelected(boolean selected) {
    super.setSelected(selected);
    if (!selected && !getEditor().selectionStackContains(this)) {
      myTextLine.resetSelection();
    }
    myCaretIsVisible = true;
  }

  @Override
  public String getText() {
    return myTextLine.getText();
  }

  public String getNullText() {
    return myNullTextLine.getText();
  }

  public String getRenderedText() {
    return getRenderedTextLine().getText();
  }

  public Font getFont() {
    return getRenderedTextLine().getFont();
  }

  public void setTextColor(Color color) {
    getStyle().set(StyleAttributes.TEXT_COLOR, color);
  }

  public void setNullTextColor(Color color) {
    getStyle().set(StyleAttributes.NULL_TEXT_COLOR, color);
  }

  public void setTextBackgroundColor(Color color) {
    getStyle().set(StyleAttributes.TEXT_BACKGROUND_COLOR, color);
  }

  public void setNullTextBackgroundColor(Color color) {
    getStyle().set(StyleAttributes.NULL_TEXT_BACKGROUND_COLOR, color);
  }

  public void setSelectedTextBackgroundColor(Color color) {
    getStyle().set(StyleAttributes.SELECTED_TEXT_BACKGROUND_COLOR, color);
  }

  public void setNullSelectedTextBackgroundColor(Color color) {
    getStyle().set(StyleAttributes.NULL_SELECTED_TEXT_BACKGROUND_COLOR, color);
  }

  /**
   * @deprecated Use StyleAttributesUtil.isFirstPositionAllowed() instead. Should be removed after MPS 3.0
   */
  @Deprecated
  public boolean isFirstPositionAllowed() {
    return StyleAttributesUtil.isFirstPositionAllowed(getStyle());
  }

  /**
   * @deprecated Use StyleAttributesUtil.isLastPositionAllowed() instead. Should be removed after MPS 3.0
   */
  @Deprecated
  public boolean isLastPositionAllowed() {
    return StyleAttributesUtil.isLastPositionAllowed(getStyle());
  }

  public int getCaretPosition() {
    return myTextLine.getCaretPosition();
  }

  @Override
  public void setCaretPosition(int position) {
    setCaretPosition(position, false);
  }

  public void setCaretPositionIfPossible(int position) {
    if (isCaretPositionAllowed(position)) {
      setCaretPosition(position, false);
    }
  }

  public void setCaretPosition(int position, boolean selection) {
    assert isCaretPositionAllowed(position) : "Position " + position + " is not allowed for EditorCell_Label: \"" + myTextLine.getText() + "\"";
    myTextLine.setCaretPosition(position, selection);
    getEditor().getBracesHighlighter().updateBracesSelection(this);
  }

  public boolean isCaretPositionAllowed(int position) {
    if (!isFirstPositionAllowed() && position == 0) return false;
    if (!isLastPositionAllowed() && position == myTextLine.getText().length()) return false;
    return position >= 0 && position <= myTextLine.getText().length();
  }

  @Override
  public void home() {
    if (isFirstPositionAllowed()) {
      setCaretPosition(0);
    } else {
      setCaretPosition(1);
    }
  }

  @Override
  public void end() {
    if (isLastPositionAllowed()) {
      setCaretPosition(getText().length());
    } else {
      setCaretPosition(getText().length() - 1);
    }
  }

  @Override
  public boolean isSelectable() {
    if (!super.isSelectable()) return false;

    if (getText() == null || getText().length() == 0) {
      return isFirstPositionAllowed() && isLastPositionAllowed();
    }

    if (getText().length() == 1) {
      return isFirstPositionAllowed() || isLastPositionAllowed();
    }

    return true;
  }

  @Override
  public boolean isFirstCaretPosition() {
    if (!isFirstPositionAllowed()) {
      return getCaretPosition() == 1;
    } else {
      return getCaretPosition() == 0;
    }
  }

  @Override
  public boolean isLastCaretPosition() {
    if (!isLastPositionAllowed()) {
      return getCaretPosition() == getText().length() - 1;
    } else {
      return getCaretPosition() == getText().length();
    }
  }

  @Override
  public boolean isCaretEnabled() {
    return myTextLine.isCaretEnabled();
  }

  @Override
  public void setCaretEnabled(boolean enabled) {
    myTextLine.setCaretEnabled(enabled);
  }

  public void setText(String text) {
    myNoTextSet = (text == null || text.length() == 0);
    myTextLine.setText(myNoTextSet ? null : text);
    requestRelayout();
  }

  public void setDefaultText(String text) {
    myNullTextLine.setText(text);
  }

  @Override
  public int getEffectiveWidth() {
    return getTextLineWidth();
  }

  @Override
  public int getLeftInset() {
    return getRenderedTextLine().getPaddingLeft() + myGapLeft;
  }

  @Override
  public int getRightInset() {
    return getRenderedTextLine().getPaddingRight() + myGapRight;
  }

  @Override
  public int getTopInset() {
    return getRenderedTextLine().getPaddingTop();
  }

  @Override
  public int getBottomInset() {
    return getRenderedTextLine().getPaddingBottom();
  }

  public int getTextLineWidth() {
    int textLineWidth;
    if (myNoTextSet && myTextLine.getText().length() == 0) {
      textLineWidth = myNullTextLine.getEffectiveWidth();
    } else {
      textLineWidth = myTextLine.getEffectiveWidth();
    }
    if (isDrawBrackets()) textLineWidth += 2 * BRACKET_WIDTH;
    return textLineWidth;
  }

  public boolean isEditable() {
    return getStyle().get(StyleAttributes.EDITABLE);
  }

  public void setEditable(boolean editable) {
    getStyle().set(StyleAttributes.EDITABLE, editable);
  }

  @Override
  public void setErrorState(boolean errorState) {
    super.setErrorState(errorState);
    if (errorState) {
      myTextLine.showErrorColor();
      myNullTextLine.showErrorColor();
    } else {
      myTextLine.showTextColor();
      myNullTextLine.showTextColor();
    }
  }

  @Override
  public void relayoutImpl() {
    if (isPunctuationLayout()) {
      getStyle().set(StyleAttributes.PADDING_LEFT, new Padding(0.0));
      getStyle().set(StyleAttributes.PADDING_RIGHT, new Padding(0.0));
    }

    myTextLine.relayout();
    myNullTextLine.relayout();
    if (myNoTextSet && myTextLine.getText().length() == 0) {
      myHeight = myNullTextLine.getHeight();
      myWidth = myNullTextLine.getWidth();
    } else {
      myHeight = myTextLine.getHeight();
      myWidth = myTextLine.getWidth();
    }
  }

  @Override
  public void switchCaretVisible() {
    myCaretIsVisible = !myCaretIsVisible;
  }

  @Override
  protected boolean isSelectionPainted() {
    return isSelected() && getEditor().getSelectionManager().getSelection() instanceof MultipleSelection;
  }

  @Override
  public void paintContent(Graphics g, ParentSettings parentSettings) {
    TextLine textLine = getRenderedTextLine();
    boolean toShowCaret = toShowCaret();
    boolean selected = isSelectionPaintedOnAncestor(parentSettings).isSelectionPainted();
    textLine.setSelected(selected);
    textLine.setShowCaret(toShowCaret);
    Color cellFontColor = getEditor().getAdditionalCellFontColor(this);
    if (isDrawBrackets()) {
      textLine.paint(g, myX + myGapLeft + BRACKET_WIDTH, myY, cellFontColor);
    } else {
      textLine.paint(g, myX + myGapLeft, myY, cellFontColor);
    }
  }

  @Override
  public void paintSelection(Graphics g, Color c, boolean drawBorder, ParentSettings parentSettings) {
    if (!isSelectionPaintedOnAncestor(parentSettings).isSelectionPainted() && getEditor().getAdditionalCellFontColor(this) != null) {
      /*
       * Suppressing selection painting in case this cell is not actually selected and additionalCellFontColor() for it is not null.
       * This will hide messages feedback if there is an AdditionalPainter instance (with specified cellFontColor) covering this cell.
       * Probably it's good idea to use separate property (not cellFontColor) to determine if this AdditionalPainter is "hiding" messages feedback
       * or simply let some additional painters paint background below and above editor messages.   
       */
      return;
    }
    super.paintSelection(g, c, drawBorder, parentSettings);
  }

  protected boolean toShowCaret() {
    return myCaretIsVisible && isWithinSelection() && getEditor().hasFocus();
  }

  TextLine getTextLine() {
    return myTextLine;
  }

  TextLine getNullTextLine() {
    return myNullTextLine;
  }

  TextLine getRenderedTextLine() {
    TextLine textLine;
    if (myNoTextSet && myTextLine.getText().length() == 0) {
      textLine = myNullTextLine;
    } else {
      textLine = myTextLine;
    }
    return textLine;
  }

  @Override
  public void setCaretX(int x) {
    myTextLine.setCaretByXCoord(x - myX);
    makePositionValid();
  }

  private void makePositionValid() {
    if (myTextLine.getCaretPosition() == 0 && !isFirstPositionAllowed() && isCaretPositionAllowed(1)) {
      setCaretPosition(1);
    }
    if (myTextLine.getCaretPosition() == getText().length() && !isLastPositionAllowed() && isCaretPositionAllowed(getText().length() - 1)) {
      setCaretPosition(getText().length() - 1);
    }
    getEditor().getBracesHighlighter().updateBracesSelection(this);
  }

  @Override
  public int getCaretX() {
    return myTextLine.getCaretX(myX);
  }

  @Override
  public boolean processMousePressed(MouseEvent e) {
    myTextLine.setCaretByXCoord(e.getX() - myX);
    myTextLine.resetSelection();
    makePositionValid();
    getEditor().repaint();
    return true;
  }

  public void ensureCaretVisible() {
    getEditor().scrollRectToVisible(new Rectangle(getCaretX() - 2 * myTextLine.charWidth(), myY, 4 * myTextLine.charWidth(), myHeight));
  }

  @Override
  protected boolean doProcessKeyTyped(final KeyEvent keyEvent, final boolean allowErrors) {
    final int wasPosition = getCaretPosition();
    final CellSide side;
    if (wasPosition == 0) {
      side = CellSide.LEFT;
    } else if (wasPosition == getRenderedText().length()) {
      side = CellSide.RIGHT;
    } else {
      side = null;
    }

    myCaretIsVisible = true;


    if (isEditable()) {
      final boolean result[] = new boolean[1];
      String groupId = ModelAccess.instance().runReadAction(new Computable<String>() {
        @Override
        public String compute() {
          return getCellId() + "_" + getSNode().getNodeId().toString();
        }
      });
      ModelAccess.instance().runWriteActionInCommand(new Runnable() {
        @Override
        public void run() {
          if (processMutableKeyTyped(keyEvent, allowErrors)) {
            getContext().flushEvents();

            if (isErrorState() && side != null) {
              if (allowsIntelligentInputKeyStroke(keyEvent)) {
                String pattern = getRenderedText();
                IntelligentInputUtil.processCell(EditorCell_Label.this, getContext(), pattern, side);
              }
            }

            result[0] = true;
          } else if (isErrorState() && wasPosition == 0 && keyEvent.getKeyChar() == ' ') {
            result[0] = true;
          }
        }
      }, null, groupId, false, getOperationContext().getProject());
      getEditor().relayout();
      if (result[0]) {
        return true;
      }
    }
    if (!isEditable() && allowsIntelligentInputKeyStroke(keyEvent)) {
      String pattern = ModelAccess.instance().runReadAction(new Computable<String>() {
        @Override
        public String compute() {
          return getRenderedTextOn(keyEvent);
        }
      });
      if (!pattern.equals(getRenderedText()) && side != null) {
        return IntelligentInputUtil.processCell(this, getContext(), pattern, side);
      }
    }
    return false;
  }

  private boolean allowsIntelligentInputKeyStroke(KeyEvent keyEvent) {
    return UIUtil.isReallyTypedEvent(keyEvent);
  }

  private String getRenderedTextOn(KeyEvent keyEvent) {
    return emulateKeyType(keyEvent, new Computable<String>() {
      @Override
      public String compute() {
        return getRenderedText();
      }
    });
  }

  private <T> T emulateKeyType(KeyEvent keyEvent, Computable<T> c) {
    String oldString = getText();
    String oldNullString = getNullText();
    int caretPosition = myTextLine.getCaretPosition();
    int nullCaretPosition = myNullTextLine.getCaretPosition();
    boolean wasErrorState = isErrorState();
    processMutableKeyTyped(keyEvent, true);
    T result = c.compute();
    myTextLine.setText(oldString);
    myNullTextLine.setText(oldNullString);
    myTextLine.setCaretPosition(caretPosition);
    myNullTextLine.setCaretPosition(nullCaretPosition);
    setErrorState(wasErrorState);
    return result;
  }

  @Override
  public boolean executeTextAction(CellActionType type, boolean allowErrors) {
    // only following actions are supported on text
    switch (type) {
      case DELETE:
      case BACKSPACE:
        break;
      default:
        return false;
    }
    // TODO: perform only if action was executed
    myCaretIsVisible = true;
    if (!isEditable()) {
      return false;
    }
    // TODO: check if we need command here or we can execute command from UI action...
    boolean result = getContext().executeCommand(new ProcessTextActionCommand(type, allowErrors));
    if (result) {
      getContext().flushEvents();
      getEditor().relayout();
    }
    return result;
  }

  private boolean processMutableKeyTyped(final KeyEvent keyEvent, final boolean allowErrors) {
    String oldText = myTextLine.getText();
    EditorComponent editor = getEditor();

    int startSelection = myTextLine.getStartTextSelectionPosition();
    int endSelection = myTextLine.getEndTextSelectionPosition();

    char keyChar = keyEvent.getKeyChar();
    if (UIUtil.isReallyTypedEvent(keyEvent)) {
      String newText = oldText.substring(0, startSelection) + keyChar + oldText.substring(endSelection);

      if (!allowErrors && !isValidText(newText)) {
        return false;
      }

      changeText(newText);
      setCaretPositionIfPossible(startSelection + 1);
      myTextLine.resetSelection();
      fireSelectionChanged();
      ensureCaretVisible();
      return true;
    }
    return false;
  }


  private boolean canDeleteFrom(EditorCell cell) {
    if (getText().length() == 0) return false;
    if (!(cell instanceof EditorCell_Label)) return false;
    EditorCell_Label label = (EditorCell_Label) cell;
    return label.isEditable() && label.isSelectable();
  }

  private void deleteIfPossible(CellActionType actionType) {
    assert CellActionType.DELETE == actionType || CellActionType.BACKSPACE == actionType;
    if ("".equals(getText()) && getStyle().get(StyleAttributes.AUTO_DELETABLE)) {
      // TODO: just use delete action (do not call getSNode().delete()) in the end if acton was not found or is not applicable
      CellAction deleteAction = getEditorComponent().getActionHandler().getApplicableCellAction(this, CellActionType.DELETE);
      if (deleteAction != null && deleteAction.canExecute(getContext())) {
        deleteAction.execute(getContext());
      }
    }
  }

  @Override
  public String getSelectedText() {
    return myTextLine.getTextuallySelectedText();
  }

  @Override
  public int getSelectionStart() {
    return myTextLine.getStartTextSelectionPosition();
  }

  @Override
  public void setSelectionStart(int position) {
    myTextLine.setStartTextSelectionPosition(position);
  }

  @Override
  public int getSelectionEnd() {
    return myTextLine.getEndTextSelectionPosition();
  }

  @Override
  public void setSelectionEnd(int position) {
    myTextLine.setEndTextSelectionPosition(position);
  }

  public void deleteSelection() {
    String myText = myTextLine.getText();
    EditorComponent editor = getEditor();
    int stSel = myTextLine.getStartTextSelectionPosition();
    int endSel = myTextLine.getEndTextSelectionPosition();
    changeText(myText.substring(0, stSel) + myText.substring(endSel));
    myTextLine.setCaretPosition(stSel);
    fireSelectionChanged();
    ensureCaretVisible();
  }

  public void changeText(final String text) {
    String oldText = getText();
    setText(text);
    addChangeTextUndoableAction(text, oldText);
  }

  private void addChangeTextUndoableAction(String text, String oldText) {
    EditorComponent editor = getEditor();
    CellInfo cellInfo = getCellInfo();

    SNode node = getSNode();
    if (node == null) return;
    if (CommandProcessor.getInstance().getCurrentCommand() == null) return;
    if (EqualUtil.equals(oldText, text)) return;
    if (isValidText(text)) return;

    UndoHelper.getInstance().addUndoableAction(new MySNodeUndoableAction(node, cellInfo, editor, oldText, text));

    if (node.getModel() == null) return;

    MPSNodesVirtualFileSystem.getInstance().getFileFor(node.getContainingRoot()).setModificationStamp(LocalTimeCounter.currentTime());
  }

  public void insertText(String text) {
    String oldText = getText();
    myTextLine.insertText(text);
    changeText(myTextLine.getText());
    addChangeTextUndoableAction(text, oldText);
  }

  public boolean isValidText(String text) {
    return true;
  }

  public void setUnderlined(boolean b) {
    getStyle().set(StyleAttributes.UNDERLINED, b);
  }

  @Override
  public int getAscent() {
    return getRenderedTextLine().getAscent();
  }

  @Override
  public int getDescent() {
    return getRenderedTextLine().getDescent();
  }

  @Override
  public NodeSubstitutePatternEditor createSubstitutePatternEditor() {
    NodeSubstitutePatternEditor pattern = new NodeSubstitutePatternEditor();
    pattern.setText(getText());
    pattern.setCaretPosition(getCaretPosition());
    return pattern;
  }

  public void selectWordOrAll() {
    if (getTextLine().getStartTextSelectionPosition() != getTextLine().getEndTextSelectionPosition()) {
      selectAll();
      return;
    }

    int start = getPrevLocalHome(false);
    int end = getNextLocalEnd(false);

    if (start != end) {
      select(start, end);
    } else {
      selectAll();
    }

  }

  private void select(int start, int end) {
    assert start <= end;
    setSelectionStart(start);
    setSelectionEnd(end);
  }

  private int getNextLocalEnd(boolean skipLeadingSpaces) {
    int length = getText().length();
    assert getCaretPosition() <= length;
    for (int i = getCaretPosition(); i != length; ++i) {

      if (Character.isWhitespace(getText().charAt(i))) {
        if (skipLeadingSpaces) {
          if (i == length - 1 || !Character.isWhitespace(getText().charAt(i + 1))) {
            return i + 1;
          }
        } else {
          return i;
        }
      }
    }
    return length;
  }

  private int getPrevLocalHome(boolean skipLeadingSpaces) {
    assert getCaretPosition() >= 0;

    for (int i = getCaretPosition(); i >= 1; --i) {
      char c = getText().charAt(i - 1);
      if (Character.isWhitespace(c) && !skipLeadingSpaces) {
        return i;
      }

      if (!Character.isWhitespace(c)) {
        skipLeadingSpaces = false;
      }
    }
    return 0;
  }

  public void selectAll() {
    getTextLine().selectAll();
  }

  @Override
  public void deselectAll() {
    getTextLine().deselectAll();
  }

  public boolean isEverythingSelected() {
    return getTextLine().isEverythingSelected();
  }

  @Override
  public SubstituteInfo getSubstituteInfo() {
    SubstituteInfo substituteInfo = super.getSubstituteInfo();
    if (substituteInfo != null) {
      substituteInfo.setOriginalText(getText() == null || getText().equals("") ? getNullText() : getText());
    }
    return substituteInfo;
  }

  public String toString() {
    return NameUtil.shortNameFromLongName(getClass().getName()) + "[text=" + getText() + "]";
  }

  @Override
  public TextBuilder renderText() {
    return TextBuilder.fromString(getRenderedText());
  }

  public int getCharWidth() {
    return getRenderedTextLine().charWidth();
  }

  public String getTextBeforeCaret() {
    return myTextLine.getTextBeforeCaret();
  }

  public String getTextAfterCaret() {
    return myTextLine.getTextAfterCaret();
  }

  private void fireSelectionChanged() {
    getEditorComponent().getSelectionManager().setSelection(getEditorComponent().getSelectionManager().getSelection());
  }

  private static class MySNodeUndoableAction extends SNodeUndoableAction {
    private final CellInfo myCellInfo;
    private final WeakReference<EditorComponent> myEditor;
    private final String myOldText;
    private final String myText;

    public MySNodeUndoableAction(SNode node, CellInfo cellInfo, EditorComponent editor, String oldText, String text) {
      super(node);
      myCellInfo = cellInfo;
      myEditor = new WeakReference<EditorComponent>(editor);
      myOldText = oldText;
      myText = text;
    }

    @Override
    protected void doUndo() {
      EditorComponent editor = myEditor.get();
      if (editor == null) return;

      EditorCell_Label cell = (EditorCell_Label) myCellInfo.findCell(editor);
      if (cell != null) {
        cell.changeText(myOldText);
        cell.getEditor().relayout();
      }
    }

    @Override
    protected void doRedo() {
      EditorComponent editor = myEditor.get();
      if (editor == null) return;

      EditorCell_Label cell = (EditorCell_Label) myCellInfo.findCell(editor);
      if (cell != null) {
        cell.changeText(myText);
      }
    }
  }

  private class MoveLeft extends AbstractCellAction {
    private boolean myWithSelection;

    private MoveLeft(boolean withSelection) {
      myWithSelection = withSelection;
    }

    @Override
    public boolean canExecute(EditorContext context) {
      return isCaretPositionAllowed(getCaretPosition() - 1);
    }

    @Override
    public void execute(EditorContext context) {
      setCaretPosition(getCaretPosition() - 1, myWithSelection);
      fireSelectionChanged();
      ensureCaretVisible();
    }
  }

  private class MoveRight extends AbstractCellAction {
    private boolean myWithSelection;

    private MoveRight(boolean withSelection) {
      myWithSelection = withSelection;
    }

    @Override
    public boolean canExecute(EditorContext context) {
      return isCaretPositionAllowed(getCaretPosition() + 1);
    }

    @Override
    public void execute(EditorContext context) {
      setCaretPosition(getCaretPosition() + 1, myWithSelection);
      fireSelectionChanged();
      ensureCaretVisible();
    }
  }

  private class SelectHome extends AbstractCellAction {
    @Override
    public boolean canExecute(EditorContext context) {
      return isCaretPositionAllowed(0);
    }

    @Override
    public void execute(EditorContext context) {
      setCaretPosition(0, true);
      fireSelectionChanged();
      ensureCaretVisible();
    }
  }

  private class SelectEnd extends AbstractCellAction {
    @Override
    public boolean canExecute(EditorContext context) {
      return isCaretPositionAllowed(getText().length());
    }

    @Override
    public void execute(EditorContext context) {
      setCaretPosition(getText().length(), true);
      fireSelectionChanged();
      ensureCaretVisible();
    }
  }

  private class CopyLabelText extends AbstractCellAction {
    @Override
    public boolean canExecute(EditorContext context) {
      SelectionManager selectionManager = context.getEditorComponent().getSelectionManager();
      if (selectionManager.getSelection() instanceof EditorCellLabelSelection) {
        EditorCellLabelSelection labelSelection = (EditorCellLabelSelection) selectionManager.getSelection();
        return labelSelection.getEditorCellLabel().getSelectedText().length() > 0;
      }
      return false;
    }

    @Override
    public void execute(EditorContext context) {
      EditorCell_Label label = (EditorCell_Label) context.getSelectedCell();
      CopyPasteUtil.copyTextToClipboard(label.getSelectedText());
    }
  }

  private class LocalHome extends AbstractCellAction {
    private boolean mySelect;

    private LocalHome(boolean select) {
      mySelect = select;
    }

    @Override
    public boolean canExecute(EditorContext context) {
      return !isFirstCaretPosition() && (isFirstPositionAllowed() || getPrevLocalHome(true) != 0);
    }

    @Override
    public void execute(EditorContext context) {
      setCaretPosition(getPrevLocalHome(true), mySelect);
    }

  }

  private class LocalEnd extends AbstractCellAction {
    private boolean mySelect;

    private LocalEnd(boolean select) {
      mySelect = select;
    }

    @Override
    public boolean canExecute(EditorContext context) {
      return !isLastCaretPosition() && (isLastPositionAllowed() || getNextLocalEnd(true) != getText().length());
    }

    @Override
    public void execute(EditorContext context) {
      setCaretPosition(getNextLocalEnd(true), mySelect);
    }
  }

  private class ClearSelection extends AbstractCellAction {

    @Override
    public boolean canExecute(EditorContext context) {
      return myTextLine.hasNonTrivialSelection();
    }

    @Override
    public void execute(EditorContext context) {
      myTextLine.resetSelection();
    }
  }

  private class PasteIntoLabelText extends AbstractCellAction {
    @Override
    public boolean canExecute(EditorContext context) {
      if (!(context.getSelectedCell() instanceof EditorCell_Label)) return false;
      EditorCell_Label label = (EditorCell_Label) context.getSelectedCell();
      SNode node = label.getSNode();
      return node != null && label.canPasteText() && TextPasteUtil.hasStringInClipboard() && !(CopyPasteUtil.doesClipboardContainNode());
    }

    @Override
    public void execute(EditorContext context) {
      EditorCell_Label cell = (EditorCell_Label) context.getSelectedCell();
      final String s = TextPasteUtil.getStringFromClipboard();
      cell.insertText(NameUtil.escapeInvisibleCharacters(s));
      fireSelectionChanged();
      cell.ensureCaretVisible();
    }
  }

  private class CutLabelText extends AbstractCellAction {
    @Override
    public boolean canExecute(EditorContext context) {
      SelectionManager selectionManager = context.getEditorComponent().getSelectionManager();
      if (selectionManager.getSelection() instanceof EditorCellLabelSelection) {
        EditorCellLabelSelection labelSelection = (EditorCellLabelSelection) selectionManager.getSelection();
        return labelSelection.getEditorCellLabel().getSelectedText().length() > 0;
      }
      return false;
    }

    @Override
    public void execute(EditorContext context) {
      EditorCell_Label label = (EditorCell_Label) context.getSelectedCell();
      String toCopy = label.getSelectedText();
      CopyPasteUtil.copyTextToClipboard(toCopy);
      if (label.canPasteText()) {
        label.deleteSelection();
      }
    }
  }

  private class ProcessTextActionCommand implements Computable<Boolean> {

    private CellActionType myActionType;
    private boolean myAllowErrors;

    ProcessTextActionCommand(CellActionType type, boolean allowErrors) {
      myActionType = type;
      myAllowErrors = allowErrors;
    }

    @Override
    public Boolean compute() {
      String oldText = myTextLine.getText();
      int caretPosition = myTextLine.getCaretPosition();

      if (myActionType == CellActionType.BACKSPACE) {
        if (myTextLine.hasNonTrivialSelection()) {
          deleteSelection();
          deleteIfPossible(myActionType);
          return true;
        }

        if (caretPosition > 0) {
          String newText = oldText.substring(0, caretPosition - 1) + oldText.substring(caretPosition);
          if (!myAllowErrors && !isValidText(newText)) {
            return false;
          }
          changeText(newText);
          if (!isCaretPositionAllowed(caretPosition - 1)) return false;
          setCaretPosition(caretPosition - 1);
          ensureCaretVisible();
          deleteIfPossible(myActionType);
          return true;
        } else {
          if (myAllowErrors && canDeleteFrom(getPrevLeaf())) {
            EditorCell_Label label = (EditorCell_Label) getPrevLeaf();
            getEditor().changeSelection(label);
            label.end();
            label.executeTextAction(myActionType, true);
            return true;
          }
          return false;
        }
      } else if (myActionType == CellActionType.DELETE) {
        if (myTextLine.hasNonTrivialSelection()) {
          deleteSelection();
          deleteIfPossible(myActionType);
          return true;
        } else if (caretPosition < oldText.length()) {
          String newText = oldText.substring(0, caretPosition) + oldText.substring(caretPosition + 1);
          if (!myAllowErrors && !isValidText(newText)) {
            return false;
          }
          changeText(newText);
          ensureCaretVisible();
          deleteIfPossible(myActionType);
          return true;
        } else {
          if (myAllowErrors && canDeleteFrom(getNextLeaf())) {
            EditorCell_Label label = (EditorCell_Label) getNextLeaf();
            getEditor().changeSelection(label);
            label.home();
            label.executeTextAction(myActionType, true);
            return true;
          }
          return false;
        }
      }

      return false;
    }
  }
}
