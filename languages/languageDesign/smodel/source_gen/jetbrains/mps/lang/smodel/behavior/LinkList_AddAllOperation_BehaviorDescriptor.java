package jetbrains.mps.lang.smodel.behavior;

/*Generated by MPS */

import jetbrains.mps.lang.core.behavior.IDontSubstituteByDefault_BehaviorDescriptor;
import org.jetbrains.mps.openapi.language.SConcept;

public class LinkList_AddAllOperation_BehaviorDescriptor extends SNodeOperation_BehaviorDescriptor implements IDontSubstituteByDefault_BehaviorDescriptor {
  public LinkList_AddAllOperation_BehaviorDescriptor() {
  }

  public boolean virtual_applicableToLinkList_1262430001741498382(SConcept thisConcept) {
    return LinkList_AddAllOperation_Behavior.virtual_applicableToLinkList_1262430001741498382(thisConcept);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.lang.smodel.structure.LinkList_AddAllOperation";
  }
}
