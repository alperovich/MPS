package jetbrains.mps.lang.structure.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.IntentionFactory;
import java.util.Collection;
import jetbrains.mps.intentions.IntentionExecutable;
import jetbrains.mps.intentions.IntentionType;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.smodel.SNodePointer;
import java.util.Collections;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.smodel.LanguageAspect;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.intentions.IntentionDescriptor;

public class ForbidIncomingReferencesInSubconcepts_Intention implements IntentionFactory {
  private Collection<IntentionExecutable> myCachedExecutable;

  public ForbidIncomingReferencesInSubconcepts_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration";
  }

  public String getPresentation() {
    return "ForbidIncomingReferencesInSubconcepts";
  }

  public String getPersistentStateKey() {
    return "jetbrains.mps.lang.structure.intentions.ForbidIncomingReferencesInSubconcepts_Intention";
  }

  public String getLanguageFqName() {
    return "jetbrains.mps.lang.structure";
  }

  public IntentionType getType() {
    return IntentionType.NORMAL;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  private boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    // todo: temporary disabled, see MPS-18470 
    return false;
  }

  public SNodeReference getIntentionNodeReference() {
    return new SNodePointer("r:e5a8b5c7-85b5-4d59-9e4e-850a142e2560(jetbrains.mps.lang.structure.intentions)", "1957700446084421329");
  }

  public boolean isSurroundWith() {
    return false;
  }

  public Collection<IntentionExecutable> instances(final SNode node, final EditorContext context) {
    if (myCachedExecutable == null) {
      myCachedExecutable = Collections.<IntentionExecutable>singletonList(new ForbidIncomingReferencesInSubconcepts_Intention.IntentionImplementation());
    }
    return myCachedExecutable;
  }

  public class IntentionImplementation implements IntentionExecutable {
    public IntentionImplementation() {
    }

    public String getDescription(final SNode node, final EditorContext editorContext) {
      return "Forbid Incoming references in all sub-concepts";
    }

    public void execute(final SNode node, final EditorContext editorContext) {
      Iterable<SModel> seq = Sequence.fromIterable(((Iterable<SModel>) SModelRepository.getInstance().getModelDescriptors())).where(new IWhereFilter<SModel>() {
        public boolean accept(SModel md) {
          return SModelStereotype.isUserModel(md);
        }
      }).where(new IWhereFilter<SModel>() {
        public boolean accept(SModel md) {
          return LanguageAspect.STRUCTURE.is(md);
        }
      }).select(new ISelector<SModel, SModel>() {
        public SModel select(SModel it) {
          return it;
        }
      });

      for (SModel model : Sequence.fromIterable(seq)) {
        for (SNode cd : ListSequence.fromList(SModelOperations.getRoots(model, "jetbrains.mps.lang.structure.structure.ConceptDeclaration"))) {
          SNode c = cd;
          if (ListSequence.fromList(SConceptOperations.getConceptHierarchy(c)).contains(node)) {
            SPropertyOperations.set(cd, "staticScope", "none");
          }
        }
      }
    }

    public IntentionDescriptor getDescriptor() {
      return ForbidIncomingReferencesInSubconcepts_Intention.this;
    }
  }
}
