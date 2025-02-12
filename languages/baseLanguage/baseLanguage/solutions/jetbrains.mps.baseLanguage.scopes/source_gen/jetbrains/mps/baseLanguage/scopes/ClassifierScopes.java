package jetbrains.mps.baseLanguage.scopes;

/*Generated by MPS */

import jetbrains.mps.scope.Scope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.scope.FilteringScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.baseLanguage.util.DefaultConstructorUtils;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.baseLanguage.behavior.Classifier_Behavior;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class ClassifierScopes {
  private ClassifierScopes() {
  }

  public static Scope filterVisibleClassifiersScope(@NotNull final SNode contextNode, @NotNull Scope inner) {
    return new FilteringScope(inner) {
      @Override
      public boolean isExcluded(SNode node) {
        if ((node == null)) {
          // todo: ? 
          // <node> 
          return true;
        }
        return !(VisibilityUtil.isVisible(contextNode, SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.IVisible")));
      }
    };
  }

  public static Scope filterWithClassExpressionClassifiers(@NotNull Scope inner) {
    return new FilteringScope(inner) {
      @Override
      public boolean isExcluded(SNode node) {
        return SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.tuples.structure.NamedTupleDeclaration");
      }
    };
  }

  public static Scope getReachableClassifiersScope(@NotNull SModel model, SNode clas, boolean includeAncestors) {
    return new ClassifiersScope(model, clas, "jetbrains.mps.baseLanguage.structure.Classifier", includeAncestors);
  }

  public static Scope getReachableClassifiersScope(@NotNull SModel model, SNode clas, boolean includeAncestors, IScope scope) {
    return new ClassifiersScope(model, clas, "jetbrains.mps.baseLanguage.structure.Classifier", includeAncestors, scope);
  }

  public static Scope getVisibleClassifiersScope(@NotNull final SNode contextNode, boolean includeAncestors) {
    SNode clas = SNodeOperations.getAncestor(contextNode, "jetbrains.mps.baseLanguage.structure.Classifier", true, false);
    return filterVisibleClassifiersScope(contextNode, getReachableClassifiersScope(SNodeOperations.getModel(contextNode), clas, includeAncestors));
  }

  public static Scope getVisibleClassifiersScope(@NotNull final SNode contextNode, boolean includeAncestors, IScope scope) {
    SNode clas = SNodeOperations.getAncestor(contextNode, "jetbrains.mps.baseLanguage.structure.Classifier", true, false);
    return filterVisibleClassifiersScope(contextNode, getReachableClassifiersScope(SNodeOperations.getModel(contextNode), clas, includeAncestors, scope));
  }

  public static Scope getVisibleClassifiersWithDefaultConstructors(@NotNull final SNode contextNode, @NotNull IScope scope) {
    return new FilteringScope(ClassifierScopes.getVisibleClassifiersScope(contextNode, false)) {
      @Override
      public boolean isExcluded(SNode node) {
        if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.ClassConcept"))) {
          return true;
        }
        SNode clazz = SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.ClassConcept");
        if (SPropertyOperations.getBoolean(clazz, "abstractClass")) {
          return true;
        }
        // note: http://docs.oracle.com/javase/specs/jls/se5.0/html/classes.html#8.8.9 
        // visibility of default constructor not implies by visibility of class 
        return !(DefaultConstructorUtils.containsDefaultConstructor(clazz));
      }
    };
  }

  public static Scope getVisibleClassesScope(@NotNull final SNode contextNode, @NotNull IScope scope) {
    SNode clas = SNodeOperations.getAncestor(contextNode, "jetbrains.mps.baseLanguage.structure.Classifier", true, false);
    return filterVisibleClassifiersScope(contextNode, new ClassifiersScope(SNodeOperations.getModel(contextNode), clas, "jetbrains.mps.baseLanguage.structure.ClassConcept"));
  }

  public static Scope getVisibleInterfacesScope(@NotNull final SNode contextNode, @NotNull IScope scope) {
    SNode clas = SNodeOperations.getAncestor(contextNode, "jetbrains.mps.baseLanguage.structure.Classifier", true, false);
    return filterVisibleClassifiersScope(contextNode, new ClassifiersScope(SNodeOperations.getModel(contextNode), clas, "jetbrains.mps.baseLanguage.structure.Interface"));
  }

  public static Scope getWithClassExpressionClassifiers(@NotNull SNode contextNode, @NotNull IScope scope) {
    SNode clas = SNodeOperations.getAncestor(contextNode, "jetbrains.mps.baseLanguage.structure.Classifier", true, false);
    return filterVisibleClassifiersScope(contextNode, filterWithClassExpressionClassifiers(getReachableClassifiersScope(SNodeOperations.getModel(contextNode), clas, false)));
  }

  public static Scope getAnnotationClassifiersScope(@NotNull final SNode contextNode, @NotNull IScope scope) {
    SNode clas = SNodeOperations.getAncestor(contextNode, "jetbrains.mps.baseLanguage.structure.Classifier", true, false);
    return filterVisibleClassifiersScope(contextNode, new ClassifiersScope(SNodeOperations.getModel(contextNode), clas, "jetbrains.mps.baseLanguage.structure.Annotation", true, scope));
  }

  public static Scope getThrowablesScope(@NotNull SNode contextNode, @NotNull IScope scope) {
    SNode clas = SNodeOperations.getAncestor(contextNode, "jetbrains.mps.baseLanguage.structure.Classifier", true, false);
    return new FilteringScope(new ClassifiersScope(SNodeOperations.getModel(contextNode), clas, "jetbrains.mps.baseLanguage.structure.ClassConcept")) {
      @Override
      public boolean isExcluded(SNode node) {
        // todo: change it! need only extended classes here 
        return !(SetSequence.fromSet(ClassifierScopeUtils.getExtendedClassifiers(SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.Classifier"))).contains(SNodeOperations.getNode("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(JDK/java.lang@java_stub)", "~Throwable")));
      }
    };
  }

  public static Scope getClassesForExtends(@NotNull SNode contextNode, @NotNull IScope scope) {
    SNode clas = SNodeOperations.getAncestor(contextNode, "jetbrains.mps.baseLanguage.structure.Classifier", true, false);
    // not final ClassConcepts 
    return new FilteringScope(ClassifierScopes.filterWithClassExpressionClassifiers(new ClassifiersScope(SNodeOperations.getModel(contextNode), clas, "jetbrains.mps.baseLanguage.structure.ClassConcept"))) {
      @Override
      public boolean isExcluded(SNode node) {
        return SPropertyOperations.getBoolean(SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.ClassConcept"), "isFinal");
      }
    };
  }

  public static Scope getClassesForStaticFieldReference(@NotNull SNode contextNode, @NotNull IScope scope) {
    final Set<SNode> enclosingClassifierAncestors = SetSequence.fromSet(new HashSet<SNode>());
    SetSequence.fromSet(enclosingClassifierAncestors).addSequence(ListSequence.fromList(SNodeOperations.getAncestors(contextNode, "jetbrains.mps.baseLanguage.structure.Classifier", false)));

    return new FilteringScope(ClassifierScopes.getVisibleClassifiersScope(contextNode, true)) {
      @Override
      public boolean isExcluded(SNode node) {
        if (SetSequence.fromSet(enclosingClassifierAncestors).contains(node)) {
          return false;
        }

        SNode classifier = SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.Classifier");
        if (!(Classifier_Behavior.call_isStatic_521412098689998668(classifier))) {
          return true;
        }

        List<SNode> ancestors = SNodeOperations.getAncestors(classifier, null, true);
        // Filtering out Classifiers located in third-party containers (not Classifiers) 
        // and having no common Classifier container with enclosing node. 
        // Useful for Classifiers contained in EditorTestCases 
        // ("result" should not be able to access classifiers from "nodeToEdit")... 
        // todo: VOODOO PEOPLE MAGIC PEOPLE 
        return ListSequence.fromList(ancestors).where(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return !(SNodeOperations.isInstanceOf(it, "jetbrains.mps.baseLanguage.structure.Classifier"));
          }
        }).isNotEmpty() && ListSequence.fromList(ancestors).intersect(SetSequence.fromSet(enclosingClassifierAncestors)).isEmpty();
      }
    };
  }

  protected static Logger LOG = LogManager.getLogger(ClassifierScopes.class);
}
