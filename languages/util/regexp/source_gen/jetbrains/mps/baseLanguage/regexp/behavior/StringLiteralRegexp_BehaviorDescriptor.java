package jetbrains.mps.baseLanguage.regexp.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import java.util.List;

public class StringLiteralRegexp_BehaviorDescriptor extends Regexp_BehaviorDescriptor {
  public StringLiteralRegexp_BehaviorDescriptor() {
  }

  public String virtual_getString_1222432436326(SNode thisNode, List<SNode> vars) {
    return StringLiteralRegexp_Behavior.virtual_getString_1222432436326(thisNode, vars);
  }

  public boolean virtual_isValid_4759120547781297301(SNode thisNode) {
    return StringLiteralRegexp_Behavior.virtual_isValid_4759120547781297301(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.baseLanguage.regexp.structure.StringLiteralRegexp";
  }
}
