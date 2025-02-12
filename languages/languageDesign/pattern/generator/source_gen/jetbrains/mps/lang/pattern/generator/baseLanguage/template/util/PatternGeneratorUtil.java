package jetbrains.mps.lang.pattern.generator.baseLanguage.template.util;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.generator.template.TemplateQueryContext;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class PatternGeneratorUtil {
  public PatternGeneratorUtil() {
  }

  public static SNode get(TemplateQueryContext genContext, SNode var) {
    List<SNode> nodes = genContext.getAllOutputNodesByInputNodeAndMappingLabel(var, "patternVarField");
    if ((int) ListSequence.fromList(nodes).count() == 1) {
      return ListSequence.fromList(nodes).first();
    }
    SNode varPattern = SNodeOperations.getAncestor(var, "jetbrains.mps.lang.pattern.structure.PatternExpression", false, false);
    SNode patternClass = genContext.getOutputNodeByInputNodeAndMappingLabel(varPattern, "patternClass");
    for (SNode field : nodes) {
      if (SNodeOperations.getAncestor(field, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false) == patternClass) {
        return field;
      }
    }
    return null;
  }
}
