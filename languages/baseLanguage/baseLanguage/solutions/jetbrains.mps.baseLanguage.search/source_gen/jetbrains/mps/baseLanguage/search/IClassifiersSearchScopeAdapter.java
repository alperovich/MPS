package jetbrains.mps.baseLanguage.search;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class IClassifiersSearchScopeAdapter {
  public IClassifiersSearchScopeAdapter() {
  }

  public static Iterable<SNode> filterMembers(Iterable<SNode> members, final int constraint) {
    return Sequence.fromIterable(members).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        if (((constraint & IClassifiersSearchScope.INTERFACE) != 0) && !(SNodeOperations.isInstanceOf(it, "jetbrains.mps.baseLanguage.structure.Interface"))) {
          return false;
        }
        if (((constraint & IClassifiersSearchScope.CLASS) != 0) && !(SNodeOperations.isInstanceOf(it, "jetbrains.mps.baseLanguage.structure.ClassConcept"))) {
          return false;
        }
        if (((constraint & IClassifiersSearchScope.ANNOTATION) != 0) && !(SNodeOperations.isInstanceOf(it, "jetbrains.mps.baseLanguage.structure.Annotation"))) {
          return false;
        }
        if (((constraint & IClassifiersSearchScope.CONSTRUCTOR) != 0) && !(SNodeOperations.isInstanceOf(it, "jetbrains.mps.baseLanguage.structure.ConstructorDeclaration"))) {
          return false;
        }
        if (((constraint & IClassifiersSearchScope.INSTANCE_METHOD) != 0) && !(SNodeOperations.isInstanceOf(it, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration"))) {
          return false;
        }
        if (((constraint & IClassifiersSearchScope.INSTANCE_FIELD) != 0) && !(SNodeOperations.isInstanceOf(it, "jetbrains.mps.baseLanguage.structure.FieldDeclaration"))) {
          return false;
        }
        if (((constraint & IClassifiersSearchScope.STATIC_METHOD) != 0) && !(SNodeOperations.isInstanceOf(it, "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration"))) {
          return false;
        }
        if (((constraint & IClassifiersSearchScope.STATIC_FIELD) != 0) && !(SNodeOperations.isInstanceOf(it, "jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration"))) {
          return false;
        }
        if (((constraint & IClassifiersSearchScope.ENUM_CONSTANT) != 0) && !(SNodeOperations.isInstanceOf(it, "jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration"))) {
          return false;
        }
        if (((constraint & IClassifiersSearchScope.NON_FINAL) != 0) && (SNodeOperations.isInstanceOf(it, "jetbrains.mps.baseLanguage.structure.ClassifierMember") && SPropertyOperations.getBoolean(SNodeOperations.getConceptDeclaration(SNodeOperations.cast(it, "jetbrains.mps.baseLanguage.structure.ClassifierMember")), "final"))) {
          return false;
        }

        return true;
      }
    });
  }
}
