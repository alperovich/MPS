package jetbrains.mps.baseLanguage.search;

/*Generated by MPS */

import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.smodel.SModelStereotype;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;

public final class VisibilityUtil {
  private VisibilityUtil() {
  }

  public static boolean isVisible(@NotNull SNode context, @NotNull SNode name) {
    // only check visibility of the name, accessibility of qualifier and if the name is member is not checked here 
    if (SNodeOperations.isInstanceOf(name, "jetbrains.mps.baseLanguage.structure.Classifier")) {
      return isClassifierAccessible(context, SNodeOperations.cast(name, "jetbrains.mps.baseLanguage.structure.Classifier"));
    }
    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(name), "jetbrains.mps.baseLanguage.structure.Interface")) {
      return true;
    }
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(name, "visibility", true), "jetbrains.mps.baseLanguage.structure.PublicVisibility") || SNodeOperations.isInstanceOf(name, "jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration")) {
      return true;
    }
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(name, "visibility", true), "jetbrains.mps.baseLanguage.structure.PrivateVisibility")) {
      return topClassifier(context) == topClassifier(name);
    }
    // package or protected access 
    if (packageName(context).equals(packageName(name))) {
      return true;
    }
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(name, "visibility", true), "jetbrains.mps.baseLanguage.structure.ProtectedVisibility")) {
      //  check special cases of protected access 
      SNode classifier = SNodeOperations.getAncestor(name, "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
      for (SNode cls : ListSequence.fromList(SNodeOperations.getAncestors(context, "jetbrains.mps.baseLanguage.structure.Classifier", true))) {
        if (BaseLanguageUtil.isAssignable(cls, classifier)) {
          if (SNodeOperations.isInstanceOf(name, "jetbrains.mps.baseLanguage.structure.FieldDeclaration") && SNodeOperations.isInstanceOf(context, "jetbrains.mps.baseLanguage.structure.FieldReferenceOperation") || SNodeOperations.isInstanceOf(name, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration") && SNodeOperations.isInstanceOf(context, "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation")) {
            // check ExpressionName or PrimaryExpression is subclass of cls, works only with right context 
            //  will not work in the case: otherClass.method(protectedMethod()) with enclosed node as context 
            if (TypeChecker.getInstance().getSubtypingManager().isSubtype(BehaviorReflection.invokeNonVirtual((Class<SNode>) ((Class) Object.class), SNodeOperations.cast(SNodeOperations.getParent(context), "jetbrains.mps.baseLanguage.structure.DotExpression"), "jetbrains.mps.baseLanguage.structure.DotExpression", "call_getOperandType_8871623299328377715", new Object[]{}), _quotation_createNode_v8uv56_b0a2a0a0a2a7a1(cls))) {
              return true;
            }
          } else if (SNodeOperations.isInstanceOf(name, "jetbrains.mps.baseLanguage.structure.ConstructorDeclaration")) {
            // check it is superclass constructor invocation or anonymous class instance creation 
            return SNodeOperations.isInstanceOf(context, "jetbrains.mps.baseLanguage.structure.SuperConstructorInvocation") || SNodeOperations.isInstanceOf(context, "jetbrains.mps.baseLanguage.structure.AnonymousClass") || SNodeOperations.isInstanceOf(context, "jetbrains.mps.baseLanguage.structure.AnonymousClassCreator");
          } else {
            return true;
          }
        }
      }
    }
    return false;
  }

  public static String packageName(@NotNull SNode node) {
    return SModelStereotype.withoutStereotype(SNodeOperations.getModel(node).getReference().getModelName());
  }

  public static SNode topClassifier(@NotNull SNode node) {
    return ListSequence.fromList(SNodeOperations.getAncestors(node, "jetbrains.mps.baseLanguage.structure.Classifier", true)).last();
  }

  private static boolean isClassifierAccessible(@NotNull SNode context, @Nullable SNode classifier) {
    //  check "static" accessibility here 
    if ((classifier == null)) {
      return true;
    }
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(classifier, "visibility", true), "jetbrains.mps.baseLanguage.structure.PrivateVisibility")) {
      return topClassifier(context) == topClassifier(classifier);
    }
    SNode parent = SNodeOperations.getAncestor(classifier, "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
    if (!(isClassifierAccessible(context, parent))) {
      return false;
    }
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(classifier, "visibility", true), "jetbrains.mps.baseLanguage.structure.PublicVisibility") || packageName(context).equals(packageName(classifier))) {
      return true;
    }
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(classifier, "visibility", true), "jetbrains.mps.baseLanguage.structure.ProtectedVisibility")) {
      // parent cannot be null here 
      for (SNode cls : ListSequence.fromList(SNodeOperations.getAncestors(context, "jetbrains.mps.baseLanguage.structure.Classifier", true))) {
        if (BaseLanguageUtil.isAssignable(cls, parent) && isClassifierAccessible(context, parent)) {
          return true;
        }
      }
    }
    return false;
  }

  public static boolean isMember(SNode classifier, @NotNull SNode member) {
    // hiding is not checked here 
    return new ClassifierAndSuperClassifiersScope(classifier).getClassifierNodes().contains(SNodeOperations.getAncestor(member, "jetbrains.mps.baseLanguage.structure.Classifier", false, false));
  }

  public static boolean isLocalMember(@NotNull SNode context, @NotNull final SNode member) {
    // hiding and shadowing are not checked here 
    return ListSequence.fromList(SNodeOperations.getAncestors(context, "jetbrains.mps.baseLanguage.structure.Classifier", true)).any(new IWhereFilter<SNode>() {
      public boolean accept(SNode cls) {
        return isMember(cls, member);
      }
    });
  }

  private static SNode _quotation_createNode_v8uv56_b0a2a0a0a2a7a1(Object parameter_1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_2 = null;
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, null, GlobalScope.getInstance(), false);
    SNodeAccessUtil.setReferenceTarget(quotedNode_2, "classifier", (SNode) parameter_1);
    return quotedNode_2;
  }
}
