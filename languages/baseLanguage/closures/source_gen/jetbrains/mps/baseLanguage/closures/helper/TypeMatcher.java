package jetbrains.mps.baseLanguage.closures.helper;

/*Generated by MPS */

import java.util.Map;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import java.util.ArrayList;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;

public class TypeMatcher {
  private Map<SNode, SNode> typeMap;

  public TypeMatcher() {
  }

  public Map<SNode, SNode> getMap() {
    return typeMap;
  }

  public void matchType(SNode absType, SNode realType) {
    SNode matched = null;
    if (SNodeOperations.isInstanceOf(realType, "jetbrains.mps.lang.typesystem.structure.MeetType")) {
      matched = whichTypeMatching(SLinkOperations.getTargets(SNodeOperations.cast(realType, "jetbrains.mps.lang.typesystem.structure.MeetType"), "argument", true), absType);
    } else if (isTypeMatching(absType, realType)) {
      matched = realType;
    }
    if ((matched != null)) {
      if (SNodeOperations.isInstanceOf(absType, "jetbrains.mps.baseLanguage.structure.TypeVariableReference")) {
        mapTypeVar(SNodeOperations.cast(absType, "jetbrains.mps.baseLanguage.structure.TypeVariableReference"), matched);
      } else {
        int idx = 0;
        List<SNode> mptypes = SLinkOperations.getTargets(SNodeOperations.as(absType, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "parameter", true);
        List<SNode> rptypes = SLinkOperations.getTargets(SNodeOperations.as(matched, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "parameter", true);
        for (int i = 0; i < ListSequence.fromList(mptypes).count() && i < ListSequence.fromList(rptypes).count(); i++) {
          matchType(ListSequence.fromList(mptypes).getElement(i), ListSequence.fromList(rptypes).getElement(i));
        }
      }
    }
  }

  public void matchReturnType(SNode absType, SNode realType) {
    Set<String> visited = SetSequence.fromSet(new HashSet<String>());
    List<SNode> queue = new ArrayList<SNode>();
    if (SNodeOperations.isInstanceOf(realType, "jetbrains.mps.lang.typesystem.structure.MeetType")) {
      for (SNode arg : SLinkOperations.getTargets(SNodeOperations.cast(realType, "jetbrains.mps.lang.typesystem.structure.MeetType"), "argument", true)) {
        ListSequence.fromList(queue).addElement(arg);
      }
    } else {
      ListSequence.fromList(queue).addElement(realType);
    }
    while (!(ListSequence.fromList(queue).isEmpty())) {
      SNode candidate = ListSequence.fromList(queue).removeElementAt(0);
      if (!(SetSequence.fromSet(visited).contains(BehaviorReflection.invokeVirtual(String.class, candidate, "virtual_getPresentation_1213877396640", new Object[]{})))) {
        if (isTypeMatching(absType, candidate)) {
          matchType(absType, candidate);
          return;
        }
        SetSequence.fromSet(visited).addElement(BehaviorReflection.invokeVirtual(String.class, candidate, "virtual_getPresentation_1213877396640", new Object[]{}));
        for (SNode superType : TypeChecker.getInstance().getSubtypingManager().collectImmediateSupertypes(candidate)) {
          ListSequence.fromList(queue).addElement(superType);
        }
      }
    }
  }

  private void mapTypeVar(SNode typeVar, SNode tvr) {
    MapSequence.fromMap(getOrCreateMap()).put(SLinkOperations.getTarget(typeVar, "typeVariableDeclaration", false), FunctionTypeUtil.unmeet(FunctionTypeUtil.unbound(SNodeOperations.copyNode(tvr))));
  }

  private Map<SNode, SNode> getOrCreateMap() {
    if (typeMap == null) {
      typeMap = MapSequence.fromMap(new HashMap<SNode, SNode>());
    }
    return typeMap;
  }

  private SNode whichTypeMatching(List<SNode> leftList, SNode right) {
    for (SNode left : leftList) {
      if (isTypeMatching(left, right)) {
        return left;
      }
    }
    return null;
  }

  private boolean isTypeMatching(SNode left, SNode right) {
    if (SNodeOperations.isInstanceOf(left, "jetbrains.mps.baseLanguage.structure.VoidType") || SNodeOperations.isInstanceOf(right, "jetbrains.mps.baseLanguage.structure.VoidType")) {
      return false;
    }
    if (SNodeOperations.isInstanceOf(right, "jetbrains.mps.baseLanguage.structure.TypeVariableReference") || SNodeOperations.isInstanceOf(left, "jetbrains.mps.baseLanguage.structure.TypeVariableReference")) {
      return true;
    }
    if (SNodeOperations.isInstanceOf(left, "jetbrains.mps.baseLanguage.structure.ClassifierType") && SNodeOperations.isInstanceOf(right, "jetbrains.mps.baseLanguageInternal.structure.InternalClassifierType")) {
      return true;
    }
    if (SNodeOperations.getConceptDeclaration(left) == SNodeOperations.getConceptDeclaration(right)) {
      if (!(SNodeOperations.isInstanceOf(left, "jetbrains.mps.baseLanguage.structure.ClassifierType"))) {
        return true;
      }
      return SLinkOperations.getTarget(SNodeOperations.cast(left, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "classifier", false) == SLinkOperations.getTarget(SNodeOperations.cast(right, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "classifier", false) && (int) ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(left, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "parameter", true)).count() == (int) ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(right, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "parameter", true)).count();
    }
    return false;
  }
}
