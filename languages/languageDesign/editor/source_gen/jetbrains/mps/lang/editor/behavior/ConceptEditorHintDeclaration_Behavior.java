package jetbrains.mps.lang.editor.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;

public class ConceptEditorHintDeclaration_Behavior {
  public static void init(SNode thisNode) {
    SPropertyOperations.set(thisNode, "showInUI", "" + (true));
  }

  public static SNode call_getHintsContainer_5944657839039105002(SNode thisNode) {
    return SNodeOperations.cast(SNodeOperations.getParent(thisNode), "jetbrains.mps.lang.editor.structure.ConceptEditorContextHints");
  }

  public static String call_getQualifiedName_5944657839039104991(SNode thisNode) {
    return BehaviorReflection.invokeVirtual(String.class, ConceptEditorHintDeclaration_Behavior.call_getHintsContainer_5944657839039105002(thisNode), "virtual_getFqName_1213877404258", new Object[]{}) + "." + SPropertyOperations.getString(thisNode, "name");
  }
}
