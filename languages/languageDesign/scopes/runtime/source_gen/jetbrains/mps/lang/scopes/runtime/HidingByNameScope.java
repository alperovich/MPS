package jetbrains.mps.lang.scopes.runtime;

/*Generated by MPS */

import jetbrains.mps.scope.Scope;
import java.util.Set;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.util.NameUtil;
import java.util.HashSet;
import jetbrains.mps.internal.collections.runtime.Sequence;
import org.jetbrains.mps.openapi.model.SNodeUtil;
import org.jetbrains.mps.openapi.language.SConceptRepository;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import org.jetbrains.annotations.Nullable;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class HidingByNameScope extends Scope {
  private final String hidingRootConceptFqName;
  private final String kindConceptFqName;
  private final Scope scope;
  private final Scope parentScope;
  private final Set<String> names;

  public HidingByNameScope(SNode hidingRoot, SNode kind, @NotNull Scope scope, @NotNull Scope parentScope) {
    this(NameUtil.nodeFQName(hidingRoot), NameUtil.nodeFQName(kind), scope, parentScope);
  }

  public HidingByNameScope(String hidingRootConceptFQName, SNode kind, @NotNull Scope scope, @NotNull Scope parentScope) {
    this(hidingRootConceptFQName, NameUtil.nodeFQName(kind), scope, parentScope);
  }

  public HidingByNameScope(String hidingRootConceptFQName, String kindConceptFQName, @NotNull Scope scope, @NotNull Scope parentScope) {
    // hiding root: all subconcepts of hidingRoot hide each other 
    this.scope = scope;
    this.parentScope = parentScope;
    this.hidingRootConceptFqName = hidingRootConceptFQName;
    this.kindConceptFqName = kindConceptFQName;
    // todo: maybe lazy in getAvailableElements? 
    // todo: I need this micro optimizations? 
    Iterable<SNode> tmpResult = scope.getAvailableElements(null);
    this.names = new HashSet<String>(Sequence.fromIterable(tmpResult).count());
    for (SNode node : Sequence.fromIterable(tmpResult)) {
      if (SNodeUtil.isInstanceOf(node, SConceptRepository.getInstance().getConcept(hidingRootConceptFqName))) {
        SetSequence.fromSet(this.names).addElement(node.getName());
      }
    }
  }

  @Override
  public Iterable<SNode> getAvailableElements(@Nullable String prefix) {
    List<SNode> result = new ArrayList<SNode>();
    ListSequence.fromList(result).addSequence(Sequence.fromIterable(scope.getAvailableElements(prefix)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SNodeUtil.isInstanceOf(it, SConceptRepository.getInstance().getConcept(kindConceptFqName));
      }
    }));
    ListSequence.fromList(result).addSequence(Sequence.fromIterable(parentScope.getAvailableElements(prefix)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SNodeUtil.isInstanceOf(it, SConceptRepository.getInstance().getConcept(kindConceptFqName));
      }
    }).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return !(SNodeUtil.isInstanceOf(it, SConceptRepository.getInstance().getConcept(hidingRootConceptFqName))) || !(SetSequence.fromSet(names).contains(it.getName()));
      }
    }));
    return result;
  }

  @Nullable
  @Override
  public SNode resolve(SNode contextNode, @NotNull String refText) {
    // todo: recheck this code 
    return (SetSequence.fromSet(names).contains(refText) ?
      scope.resolve(contextNode, refText) :
      parentScope.resolve(contextNode, refText)
    );
  }

  @Nullable
  @Override
  public String getReferenceText(SNode contextNode, @NotNull SNode node) {
    return node.getName();
  }

  @Override
  public boolean contains(SNode node) {
    if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.core.structure.INamedConcept")) || !(SNodeUtil.isInstanceOf(node, SConceptRepository.getInstance().getConcept(kindConceptFqName)))) {
      return false;
    }
    if (scope.contains(node)) {
      return true;
    }
    if (SetSequence.fromSet(names).contains(node.getName())) {
      return false;
    }
    return parentScope.contains(node);
  }
}
