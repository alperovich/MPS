package jetbrains.mps.baseLanguage.findUsages;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.findalgorithm.finders.GeneratedFinder;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.mps.openapi.module.SearchScope;
import java.util.List;
import org.jetbrains.mps.openapi.util.ProgressMonitor;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.progress.EmptyProgressMonitor;

public class FieldUsages_Finder extends GeneratedFinder {
  private static Logger LOG = LogManager.getLogger("jetbrains.mps.baseLanguage.findUsages.FieldUsages_Finder");

  public FieldUsages_Finder() {
  }

  @Override
  public String getDescription() {
    return "Field Usages";
  }

  @Override
  public String getLongDescription() {
    return "";
  }

  @Override
  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.VariableDeclaration";
  }

  @Override
  public boolean isApplicable(SNode node) {
    if (SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false) == null && SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.Interface", false, false) == null) {
      return false;
    }
    if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.FieldDeclaration")) && !(SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration"))) {
      return false;
    }
    return true;
  }

  @Override
  protected void doFind(SNode node, SearchScope scope, List<SNode> _results, ProgressMonitor monitor) {
    monitor.start(getDescription(), 2);
    try {
      List<SNode> fieldDeclarations = new ArrayList<SNode>();
      ListSequence.fromList(fieldDeclarations).addElement(node);
      if (SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false) != null) {
        ListSequence.fromList(fieldDeclarations).addSequence(ListSequence.fromList((List<SNode>) FindUtils.executeFinder("jetbrains.mps.baseLanguage.findUsages.OverridingFields_Finder", node, scope, monitor.subTask(1))));
      }
      // 
      for (SNode fieldDeclaration : ListSequence.fromList(fieldDeclarations)) {
        for (SNode fieldUsage : ListSequence.fromList(FindUtils.executeFinder("jetbrains.mps.lang.structure.findUsages.NodeUsages_Finder", fieldDeclaration, scope, monitor.subTask(1)))) {
          ListSequence.fromList(_results).addElement(fieldUsage);
        }
      }
    } finally {
      monitor.done();
    }
  }

  @Override
  public void getSearchedNodes(SNode node, SearchScope scope, List<SNode> _results) {
    ListSequence.fromList(_results).addElement(node);
    if (SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false) != null) {
      for (SNode fieldNode : ListSequence.fromList(FindUtils.executeFinder("jetbrains.mps.baseLanguage.findUsages.OverridingFields_Finder", node, scope, new EmptyProgressMonitor()))) {
        ListSequence.fromList(_results).addElement(fieldNode);
      }
    }
  }

  @Override
  public String getNodeCategory(SNode node) {
    return "Field Usages";
  }
}
