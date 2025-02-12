package jetbrains.mps.lang.test.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import org.jetbrains.mps.openapi.model.SModel;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class TestInfo_Behavior {
  public static void init(SNode thisNode) {
  }

  public static boolean call_isUITest_4484885613884830715(SAbstractConcept thisConcept, SModel model) {
    List<SNode> infos = SModelOperations.getRoots(model, "jetbrains.mps.lang.test.structure.TestInfo");
    if (ListSequence.fromList(infos).isEmpty()) {
      return false;
    }
    SNode testInfo = ListSequence.fromList(infos).first();
    return SPropertyOperations.getBoolean(testInfo, "uiTest");
  }

  public static boolean call_reOpenProject_1031873601093419509(SAbstractConcept thisConcept, SModel model) {
    List<SNode> infos = SModelOperations.getRoots(model, "jetbrains.mps.lang.test.structure.TestInfo");
    if (ListSequence.fromList(infos).isEmpty()) {
      return false;
    }
    SNode testInfo = ListSequence.fromList(infos).first();
    return SPropertyOperations.getBoolean(testInfo, "reOpenProject");
  }

  public static String call_getProjectPath_5097124989038916375(SAbstractConcept thisConcept, SModel model) {
    List<SNode> infos = SModelOperations.getRoots(model, "jetbrains.mps.lang.test.structure.TestInfo");
    if (ListSequence.fromList(infos).isEmpty()) {
      return null;
    }
    SNode testInfo = ListSequence.fromList(infos).first();
    return SPropertyOperations.getString(testInfo, "projectPath");
  }
}
