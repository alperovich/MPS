package jetbrains.mps.idea.java.psi.impl.blTypes;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNodeId;
import jetbrains.mps.idea.core.psi.impl.MPSPsiNode;

/**
 * danilla 8/28/13
 */
public class MPSPsiSequenceType extends MPSPsiCollectionType {
  public MPSPsiSequenceType(SNodeId id, String concept, String containingRole) {
    super(id, concept, containingRole);
  }

  @Override
  protected String getClassName() {
    return "java.lang.Iterable";
  }

  @Override
  protected MPSPsiNode[] getChildTypeNodes() {
    // todo we could mimic the generator for SequenceType and do Iterable<? extends Iterable> for sequence<sequence<>> 
    return getChildrenOfType("elementType", MPSPsiNode.class);
  }
}
