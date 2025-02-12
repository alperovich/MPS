package jetbrains.mps.lang.test.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntentionsDescriptor;
import jetbrains.mps.project.structure.modules.ModuleReference;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.intentions.IntentionsManager;

public class IntentionsDescriptor extends BaseIntentionsDescriptor {
  public IntentionsDescriptor() {
    super(new ModuleReference("8585453e-6bfb-4d80-98de-b16074f1d86c(jetbrains.mps.lang.test)"), PersistenceFacade.getInstance().createModelReference("r:00000000-0000-4000-0000-011c89590386(jetbrains.mps.lang.test.intentions)"));
  }

  public void init() {
    IntentionsManager.getInstance().registerIntentionFactory(new AddCellAnnotation_Intention());
    IntentionsManager.getInstance().registerIntentionFactory(new AddMockAnnotation_Intention());
    IntentionsManager.getInstance().registerIntentionFactory(new AddNodeHasErrorMark_Intention());
    IntentionsManager.getInstance().registerIntentionFactory(new AddOperationsMark_Intention());
    IntentionsManager.getInstance().registerIntentionFactory(new AddPropertiesMark_Intention());
    IntentionsManager.getInstance().registerIntentionFactory(new AddScopeExpectedNodes_Intention());
    IntentionsManager.getInstance().registerIntentionFactory(new AddScopeTestAnnotation_Intention());
    IntentionsManager.getInstance().registerIntentionFactory(new AddTestAnnotation_Intention());
  }
}
