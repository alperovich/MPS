package jetbrains.mps.ide.editor.suppresserrors;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.AbstractLeftEditorHighlighterMessage;
import jetbrains.mps.nodeEditor.EditorMessageIconRenderer;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.message.EditorMessageOwner;
import javax.swing.Icon;
import com.intellij.icons.AllIcons;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import com.intellij.openapi.actionSystem.AnAction;
import jetbrains.mps.workbench.action.BaseAction;
import com.intellij.openapi.actionSystem.ActionManager;
import javax.swing.JPopupMenu;

public class SuppressErrorsMessage extends AbstractLeftEditorHighlighterMessage {
  private static final EditorMessageIconRenderer.IconRendererType TYPE = new EditorMessageIconRenderer.IconRendererType(1);

  public SuppressErrorsMessage(SNode node, EditorMessageOwner owner, String tooltip) {
    super(node, owner, tooltip);
  }

  @Override
  public Icon getIcon() {
    return AllIcons.Actions.CloseNew;
  }

  @Override
  public EditorMessageIconRenderer.IconRendererType getType() {
    return TYPE;
  }

  @Override
  public EditorCell getAnchorCell(EditorCell cell) {
    return cell;
  }

  @Override
  public AnAction getClickAction() {
    return ((BaseAction) ActionManager.getInstance().getAction("jetbrains.mps.ide.editor.actions.DoNotSuppressErrors_Action"));
  }

  @Override
  public JPopupMenu getPopupMenu() {
    return null;
  }
}
