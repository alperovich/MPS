package jetbrains.mps.console.blCommand.behavior;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.behavior.Expression_BehaviorDescriptor;
import org.jetbrains.mps.openapi.language.SConcept;
import org.jetbrains.mps.openapi.model.SNode;

public abstract class QueryExpression_BehaviorDescriptor extends Expression_BehaviorDescriptor {
  public QueryExpression_BehaviorDescriptor() {
  }

  public boolean virtual_legalAsStatement_1262430001741498032(SConcept thisConcept) {
    return QueryExpression_Behavior.virtual_legalAsStatement_1262430001741498032(thisConcept);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.console.blCommand.structure.QueryExpression";
  }

  public abstract Iterable<SNode> virtual_getSupportedParameters_4307205004146936444(SConcept thisConcept);
}
