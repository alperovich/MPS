package jetbrains.mps.baseLanguage.javadoc.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntentionsDescriptor;
import jetbrains.mps.project.structure.modules.ModuleReference;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.intentions.IntentionsManager;

public class IntentionsDescriptor extends BaseIntentionsDescriptor {
  public IntentionsDescriptor() {
    super(new ModuleReference("f2801650-65d5-424e-bb1b-463a8781b786(jetbrains.mps.baseLanguage.javadoc)"), PersistenceFacade.getInstance().createModelReference("r:17a5547b-be2d-47de-9fc3-8304c9f5de67(jetbrains.mps.baseLanguage.javadoc.intentions)"));
  }

  public void init() {
    IntentionsManager.getInstance().registerIntentionFactory(new AddAuthorBlockDocTag_Intention());
    IntentionsManager.getInstance().registerIntentionFactory(new AddClassifierDocComment_Intention());
    IntentionsManager.getInstance().registerIntentionFactory(new AddFieldDocComment_Intention());
    IntentionsManager.getInstance().registerIntentionFactory(new AddMethodDocComment_Intention());
    IntentionsManager.getInstance().registerIntentionFactory(new AddParameterBlockDocTag_Intention());
    IntentionsManager.getInstance().registerIntentionFactory(new AddReturnBlockTag_Intention());
    IntentionsManager.getInstance().registerIntentionFactory(new AddSeeBlockTag_Intention());
    IntentionsManager.getInstance().registerIntentionFactory(new AddSinceBlockDocTag_Intention());
    IntentionsManager.getInstance().registerIntentionFactory(new AddStaticFieldDocComment_Intention());
    IntentionsManager.getInstance().registerIntentionFactory(new AddThrowBlockDocTag_Intention());
    IntentionsManager.getInstance().registerIntentionFactory(new AddVersionBlockTagDoc_Intention());
    IntentionsManager.getInstance().registerIntentionFactory(new FoldHTMLElement_Intention());
  }
}
