package jetbrains.mps.makeTest.test;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import junit.framework.TestCase;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.baseLanguage.behavior.Classifier_Behavior;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;

@MPSLaunch
public class CheckDependencies_Test extends TestCase {
  @MPSLaunch
  public void test_staticConst() throws Exception {
    MakeAssert.assertDependenciesChecked("staticConst", new ChangeModel() {
      @Override
      public void change(SModel model) {
        super.change(model);
        SPropertyOperations.set(SNodeOperations.cast(SLinkOperations.getTarget(Sequence.fromIterable(Classifier_Behavior.call_staticFields_5292274854859223538(ListSequence.fromList(SModelOperations.getRoots(model, "jetbrains.mps.baseLanguage.structure.ClassConcept")).first())).first(), "initializer", true), "jetbrains.mps.baseLanguage.structure.IntegerConstant"), "value", "" + (0));
      }
    });
  }

  public CheckDependencies_Test() {
  }
}
