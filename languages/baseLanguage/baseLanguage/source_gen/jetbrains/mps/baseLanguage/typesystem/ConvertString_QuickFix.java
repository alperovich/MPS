package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.errors.QuickFix_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;

public class ConvertString_QuickFix extends QuickFix_Runtime {
  public ConvertString_QuickFix() {
  }

  public String getDescription(SNode node) {
    return "Convert java.lang.String to string type";
  }

  public void execute(SNode node) {
    SNodeOperations.replaceWithAnother(((SNode) ConvertString_QuickFix.this.getField("stringToConvert")[0]), SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.StringType", null));
  }
}
