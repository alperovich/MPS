package jetbrains.mps.samples.Kaja.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntentionsDescriptor;
import jetbrains.mps.project.structure.modules.ModuleReference;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.intentions.IntentionsManager;

public class IntentionsDescriptor extends BaseIntentionsDescriptor {
  public IntentionsDescriptor() {
    super(new ModuleReference("049a08c5-1fe5-43cc-bd99-8b46d641d7f5(jetbrains.mps.samples.Kaja)"), PersistenceFacade.getInstance().createModelReference("r:c23df2a3-084e-497b-b2a5-1671f4fbf9de(jetbrains.mps.samples.Kaja.intentions)"));
  }

  public void init() {
    IntentionsManager.getInstance().registerIntentionFactory(new ExtractRoutine_Intention());
  }
}
