package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.baseLanguage.behavior.ClassConcept_Behavior;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.messageTargets.PropertyMessageTarget;
import jetbrains.mps.errors.IErrorReporter;

public class check_UnusedPrivateMethods_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_UnusedPrivateMethods_NonTypesystemRule() {
  }

  public void applyRule(final SNode classifierMember, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(classifierMember, "visibility", true), "jetbrains.mps.baseLanguage.structure.PrivateVisibility")) {
      {
        final SNode matchedNode_sl9v9q_a0a0 = classifierMember;
        {
          boolean matches_sl9v9q_a0a0a = false;
          {
            SNode matchingNode_sl9v9q_a0a0a = classifierMember;
            if (matchingNode_sl9v9q_a0a0a != null) {
              matches_sl9v9q_a0a0a = SModelUtil_new.isAssignableConcept(matchingNode_sl9v9q_a0a0a.getConcept().getQualifiedName(), "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration");
            }
          }
          if (matches_sl9v9q_a0a0a) {
            {
              if (SNodeOperations.isInstanceOf(matchedNode_sl9v9q_a0a0, "jetbrains.mps.baseLanguage.structure.ConstructorDeclaration") && ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(matchedNode_sl9v9q_a0a0, "jetbrains.mps.baseLanguage.structure.ConstructorDeclaration"), "parameter", true)).isEmpty() && (int) Sequence.fromIterable(ClassConcept_Behavior.call_constructors_5292274854859503373(SNodeOperations.as(SNodeOperations.getParent(matchedNode_sl9v9q_a0a0), "jetbrains.mps.baseLanguage.structure.ClassConcept"))).count() == 1) {
                // an idiom - uninstantiable class 
                return;
              }
              SNode topClassifier = SNodeOperations.getAncestor(matchedNode_sl9v9q_a0a0, "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
              if (topClassifier != null) {
                while (SNodeOperations.getAncestor(topClassifier, "jetbrains.mps.baseLanguage.structure.Classifier", false, false) != null) {
                  topClassifier = SNodeOperations.getAncestor(topClassifier, "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
                }
                if (!(ListSequence.fromList(SNodeOperations.getDescendants(topClassifier, "jetbrains.mps.baseLanguage.structure.IMethodCall", false, new String[]{})).any(new IWhereFilter<SNode>() {
                  public boolean accept(SNode call) {
                    return SLinkOperations.getTarget(call, "baseMethodDeclaration", false) == matchedNode_sl9v9q_a0a0 && !(ListSequence.fromList(SNodeOperations.getAncestors(call, null, false)).contains(matchedNode_sl9v9q_a0a0));
                  }
                }))) {
                  {
                    MessageTarget errorTarget = new NodeMessageTarget();
                    errorTarget = new PropertyMessageTarget("name");
                    IErrorReporter _reporter_2309309498 = typeCheckingContext.reportWarning(matchedNode_sl9v9q_a0a0, "Private method " + matchedNode_sl9v9q_a0a0 + " is never used", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "8101436443850399677", null, errorTarget);
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierMember";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConcept().getQualifiedName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean overrides() {
    return false;
  }
}
