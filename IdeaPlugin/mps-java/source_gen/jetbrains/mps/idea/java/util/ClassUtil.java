package jetbrains.mps.idea.java.util;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.SModelStereotype;

public class ClassUtil {


  public static String getClassFQName(SNode claz) {

    SNode curr = SNodeOperations.cast(((SNode) claz), "jetbrains.mps.baseLanguage.structure.Classifier");
    StringBuilder sb = new StringBuilder();
    do {
      sb.insert(0, SPropertyOperations.getString(curr, "name"));
      sb.insert(0, ".");
      SNode parent = SNodeOperations.getParent(curr);
      if (!(SNodeOperations.isInstanceOf(parent, "jetbrains.mps.baseLanguage.structure.Classifier"))) {
        break;
      }
      curr = SNodeOperations.cast(parent, "jetbrains.mps.baseLanguage.structure.Classifier");
    } while (curr != null);

    String pkgName = SModelStereotype.withoutStereotype(claz.getModel().getModelName());
    sb.insert(0, pkgName);
    return sb.toString();

    // <node> 
  }
}
