package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.cells.KeyMapImpl;
import jetbrains.mps.openapi.editor.cells.KeyMapAction;
import jetbrains.mps.editor.runtime.cells.KeyMapActionImpl;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.model.SNodeUtil;
import org.jetbrains.mps.openapi.language.SConceptRepository;
import java.util.List;

public class CloseParenthesis_KeyMap extends KeyMapImpl {
  public CloseParenthesis_KeyMap() {
    this.setApplicableToEveryModel(false);
    KeyMapAction action;
    action = new CloseParenthesis_KeyMap.CloseParenthesis_KeyMap_Action0();
    this.putAction("ctrl+shift", "VK_RIGHT", action);
    action = new CloseParenthesis_KeyMap.CloseParenthesis_KeyMap_Action1();
    this.putAction("ctrl+shift", "VK_LEFT", action);
  }

  public static class CloseParenthesis_KeyMap_Action0 extends KeyMapActionImpl {
    public CloseParenthesis_KeyMap_Action0() {
      this.setShownInPopupMenu(false);
    }

    public String getDescriptionText() {
      return "move closing parenthesis to the right";
    }

    public boolean isMenuAlwaysShown() {
      return false;
    }

    public boolean canExecute(final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      if ((contextCell == null)) {
        return false;
      }
      SNode contextNode = contextCell.getSNode();
      if (contextNode == null) {
        return false;
      }
      if (!(SNodeUtil.isInstanceOf(contextNode, SConceptRepository.getInstance().getConcept("jetbrains.mps.baseLanguage.structure.ParenthesizedExpression")))) {
        return false;
      }
      return true;
    }

    public void execute(final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      this.execute_internal(editorContext, contextCell.getSNode(), this.getSelectedNodes(editorContext));
    }

    private void execute_internal(final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      EditorParenthesisUtil.moveParenthesisToTheRightOrLeft(node, editorContext, true);
    }

    public String getKeyStroke() {
      return "ctrl shift RIGHT";
    }
  }

  public static class CloseParenthesis_KeyMap_Action1 extends KeyMapActionImpl {
    public CloseParenthesis_KeyMap_Action1() {
      this.setShownInPopupMenu(false);
    }

    public String getDescriptionText() {
      return "move closing parenthesis to the left";
    }

    public boolean isMenuAlwaysShown() {
      return false;
    }

    public boolean canExecute(final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      if ((contextCell == null)) {
        return false;
      }
      SNode contextNode = contextCell.getSNode();
      if (contextNode == null) {
        return false;
      }
      if (!(SNodeUtil.isInstanceOf(contextNode, SConceptRepository.getInstance().getConcept("jetbrains.mps.baseLanguage.structure.ParenthesizedExpression")))) {
        return false;
      }
      return true;
    }

    public void execute(final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      this.execute_internal(editorContext, contextCell.getSNode(), this.getSelectedNodes(editorContext));
    }

    private void execute_internal(final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      EditorParenthesisUtil.moveParenthesisToTheLeftOrRightInside(node, editorContext, false);
    }

    public String getKeyStroke() {
      return "ctrl shift LEFT";
    }
  }
}
