package jetbrains.mps.lang.editor.behavior;

/*Generated by MPS */

import jetbrains.mps.openapi.editor.style.StyleAttribute;
import org.jetbrains.mps.openapi.model.SNode;

public class LastPositionAllowedStyleClassItem_BehaviorDescriptor extends BooleanStyleSheetItem_BehaviorDescriptor {
  public LastPositionAllowedStyleClassItem_BehaviorDescriptor() {
  }

  public StyleAttribute<Boolean> virtual_getStyleAttribute_3639065570239132541(SNode thisNode) {
    return LastPositionAllowedStyleClassItem_Behavior.virtual_getStyleAttribute_3639065570239132541(thisNode);
  }

  public boolean virtual_isApplicableTo_1214304723440(SNode thisNode, SNode cellModel) {
    return LastPositionAllowedStyleClassItem_Behavior.virtual_isApplicableTo_1214304723440(thisNode, cellModel);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.lang.editor.structure.LastPositionAllowedStyleClassItem";
  }
}
