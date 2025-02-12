package jetbrains.mps.baseLanguage.collections.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.util.NameUtil;

public class AbstractContainerType_Behavior {
  public static void init(SNode thisNode) {
  }

  public static String virtual_getPresentation_1213877396640(SNode thisNode) {
    return SPropertyOperations.getString(SNodeOperations.getConceptDeclaration(thisNode), "conceptAlias") + "<" + BehaviorReflection.invokeVirtual(String.class, SLinkOperations.getTarget(thisNode, "elementType", true), "virtual_getPresentation_1213877396640", new Object[]{}) + ">";
  }

  public static List<String> virtual_getVariableSuffixes_1213877337304(SNode thisNode) {
    List<String> variableSuffixes = ListSequence.fromListAndArray(new ArrayList<String>(), SPropertyOperations.getString(SNodeOperations.getConceptDeclaration(thisNode), "conceptAlias"));
    if ((SLinkOperations.getTarget(thisNode, "elementType", true) != null)) {
      if (BehaviorReflection.invokeVirtual(Boolean.TYPE, SLinkOperations.getTarget(thisNode, "elementType", true), "virtual_hasPluralVariableSuffixes_1447667470349154499", new Object[]{})) {
        for (String suffix : ListSequence.fromList(BehaviorReflection.invokeVirtual((Class<List<String>>) ((Class) Object.class), SLinkOperations.getTarget(thisNode, "elementType", true), "virtual_getVariableSuffixes_1213877337304", new Object[]{}))) {
          if (!(ListSequence.fromList(variableSuffixes).contains(suffix))) {
            ListSequence.fromList(variableSuffixes).addElement(suffix);
          }
        }
      } else {
        for (String suffix : ListSequence.fromList(BehaviorReflection.invokeVirtual((Class<List<String>>) ((Class) Object.class), SLinkOperations.getTarget(thisNode, "elementType", true), "virtual_getVariableSuffixes_1213877337304", new Object[]{}))) {
          ListSequence.fromList(variableSuffixes).addElement(NameUtil.pluralize(suffix));
        }
      }
    }
    return variableSuffixes;
  }

  public static boolean virtual_hasPluralVariableSuffixes_1447667470349154499(SNode thisNode) {
    return true;
  }
}
