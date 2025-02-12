package jetbrains.mps.ide.devkit.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.relations.RelationDescriptor;
import javax.swing.Icon;
import com.intellij.icons.AllIcons;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.annotations.Nullable;
import java.util.List;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.smodel.LanguageAspect;

public class Intentions_TabDescriptor extends RelationDescriptor {
  private static final Icon ICON = AllIcons.Actions.IntentionBulb;

  public Intentions_TabDescriptor() {
  }

  public String getTitle() {
    return "Intentions";
  }

  public Character getShortcutChar() {
    return 'I';
  }

  public int compareTo(RelationDescriptor descriptor) {
    return new Intentions_Order().compare(this, descriptor);
  }

  public void startListening() {
  }

  public SNode getBaseNode(SNode node) {
    return ConceptEditorOpenHelper.getBaseNode(node);
  }

  public boolean isApplicable(SNode node) {
    return SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration");
  }

  @Nullable
  public Icon getIcon() {
    return ICON;
  }

  public List<SNode> getNodes(SNode node) {
    return BehaviorReflection.invokeNonVirtual((Class<List<SNode>>) ((Class) Object.class), node, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration", "call_findConceptAspectCollection_1567570417158062208", new Object[]{LanguageAspect.INTENTIONS});
  }

  public boolean isSingle() {
    return false;
  }

  public List<SNode> getConcepts(final SNode node) {
    return ConceptEditorHelper.getAvailableConceptAspects(LanguageAspect.INTENTIONS, node);
  }

  public SNode createNode(final SNode node, final SNode concept) {
    return ConceptEditorHelper.createNewConceptAspectInstance(LanguageAspect.INTENTIONS, node, concept);
  }
}
