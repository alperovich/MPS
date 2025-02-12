package jetbrains.mps.baseLanguage.regexp.constraints;

/*Generated by MPS */

import java.util.List;
import org.jetbrains.mps.openapi.model.SNode;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class RegexUtil {
  public RegexUtil() {
  }

  public static List<SNode> collectMatchReferences(SNode enclosingNode) {
    List<SNode> matches = new ArrayList<SNode>();
    for (SNode ruc : SNodeOperations.getAncestors(enclosingNode, "jetbrains.mps.baseLanguage.regexp.structure.RegexpUsingConstruction", true)) {
      ListSequence.fromList(matches).addSequence(ListSequence.fromList(collectNamedParentheses(ruc)));
    }
    for (SNode ifst : SNodeOperations.getAncestors(enclosingNode, "jetbrains.mps.baseLanguage.structure.IfStatement", true)) {
      SNode toCollect = null;
      if (ListSequence.fromList(SNodeOperations.getAncestors(enclosingNode, null, true)).contains(SLinkOperations.getTarget(ifst, "ifTrue", true))) {
        toCollect = SLinkOperations.getTarget(ifst, "condition", true);
      } else {
        for (SNode elseif : SLinkOperations.getTargets(ifst, "elsifClauses", true)) {
          if (ListSequence.fromList(SNodeOperations.getAncestors(enclosingNode, null, true)).contains(SLinkOperations.getTarget(elseif, "statementList", true))) {
            toCollect = SLinkOperations.getTarget(elseif, "condition", true);
            break;
          }
        }
      }
      if (toCollect != null) {
        for (SNode expr : SNodeOperations.getDescendants(toCollect, "jetbrains.mps.baseLanguage.regexp.structure.FindMatchExpression", true, new String[]{})) {
          ListSequence.fromList(matches).addSequence(ListSequence.fromList(collectNamedParentheses(expr)));
        }
      }
    }
    return matches;
  }

  public static SNode findRegexpUsingConstructionFor(SNode ref) {
    SNode parens = SLinkOperations.getTarget(ref, "match", false);
    SNode ruc = SNodeOperations.getAncestor(parens, "jetbrains.mps.baseLanguage.regexp.structure.RegexpUsingConstruction", false, false);
    if (ruc != null) {
      return ruc;
    }

    SNode dcl = SNodeOperations.getAncestor(parens, "jetbrains.mps.baseLanguage.regexp.structure.RegexpDeclaration", false, false);
    if (dcl != null) {
      for (SNode parentRuc : SNodeOperations.getAncestors(ref, "jetbrains.mps.baseLanguage.regexp.structure.RegexpUsingConstruction", false)) {
        for (SNode regref : SNodeOperations.getDescendants(parentRuc, "jetbrains.mps.baseLanguage.regexp.structure.RegexpDeclarationReferenceRegexp", false, new String[]{})) {
          if (SLinkOperations.getTarget(regref, "regexp", false) == dcl) {
            return parentRuc;
          }
        }
      }
    }

    for (SNode ifst : SNodeOperations.getAncestors(ref, "jetbrains.mps.baseLanguage.structure.IfStatement", true)) {
      for (SNode expr : SNodeOperations.getDescendants(SLinkOperations.getTarget(ifst, "condition", true), "jetbrains.mps.baseLanguage.regexp.structure.FindMatchExpression", true, new String[]{})) {
        if (ListSequence.fromList(collectNamedParentheses(expr)).contains(SLinkOperations.getTarget(ref, "match", false))) {
          return expr;
        }
      }
    }
    return null;
  }

  public static List<SNode> collectNamedParentheses(SNode node) {
    List<SNode> res = new ArrayList<SNode>();
    collectNamedParenthesesInternal(node, new ArrayList<SNode>(), res);
    return res;
  }

  private static void collectNamedParenthesesInternal(SNode node, List<SNode> seen, List<SNode> found) {
    if (ListSequence.fromList(seen).contains(node)) {
      return;
    }
    ListSequence.fromList(seen).addElement(node);

    for (SNode ref : SNodeOperations.getDescendants(node, "jetbrains.mps.baseLanguage.regexp.structure.RegexpDeclarationReferenceRegexp", false, new String[]{})) {
      if (SLinkOperations.getTarget(ref, "regexp", false) != null) {
        collectNamedParenthesesInternal(SLinkOperations.getTarget(ref, "regexp", false), seen, found);
      }
    }
    for (SNode mpe : SNodeOperations.getDescendants(node, "jetbrains.mps.baseLanguage.regexp.structure.MatchParensRegexp", false, new String[]{})) {
      ListSequence.fromList(found).addElement(mpe);
    }
  }

  public static SNode getRegexpIfContainer(SNode n) {
    SNode container = SNodeOperations.getAncestor(n, "jetbrains.mps.baseLanguage.structure.Statement", false, false);
    if ((container != null) && (SNodeOperations.getParent(container) != null) && SNodeOperations.isInstanceOf(SNodeOperations.getParent(container), "jetbrains.mps.baseLanguage.structure.StatementList") && SNodeOperations.isInstanceOf(container, "jetbrains.mps.baseLanguage.structure.IfStatement")) {
      return SNodeOperations.cast(container, "jetbrains.mps.baseLanguage.structure.IfStatement");
    }
    return null;
  }
}
