package jetbrains.mps.lang.editor.generator.baseLanguage.template.util;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.generator.template.TemplateQueryContext;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;
import jetbrains.mps.internal.collections.runtime.StopIteratingException;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.lang.editor.behavior.EditorCellModel_Behavior;
import jetbrains.mps.lang.structure.behavior.LinkDeclaration_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.util.NameUtil;

public class QueriesUtil {
  private static Object CELL_READABLE_ID = new Object();

  public static SNode getGeneratedClassByAncestor(SNode inputNode, final TemplateQueryContext genctx) {
    List<SNode> ancestors = SNodeOperations.getAncestors(inputNode, null, false);
    Iterable<SNode> outputClasses = ListSequence.fromList(ancestors).translate(new ITranslator2<SNode, SNode>() {
      public Iterable<SNode> translate(final SNode it) {
        return new Iterable<SNode>() {
          public Iterator<SNode> iterator() {
            return new YieldingIterator<SNode>() {
              private int __CP__ = 0;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 6:
                      if (_5_output != null) {
                        this.__CP__ = 7;
                        break;
                      }
                      this.__CP__ = 3;
                      break;
                    case 3:
                      if (false) {
                        this.__CP__ = 2;
                        break;
                      }
                      this.__CP__ = 1;
                      break;
                    case 8:
                      this.__CP__ = 9;
                      this.yield(_5_output);
                      return true;
                    case 0:
                      this.__CP__ = 2;
                      break;
                    case 2:
                      this._5_output = genctx.getOutputNodeByInputNodeAndMappingLabel(it, "generatedClass");
                      this.__CP__ = 6;
                      break;
                    case 7:
                      this.__CP__ = 8;
                      break;
                    case 9:
                      throw new StopIteratingException();
                    default:
                      break __loop__;
                  }
                } while (true);
                return false;
              }

              private SNode _5_output;
            };
          }
        };
      }
    });
    return Sequence.fromIterable(outputClasses).first();
  }

  public static String keyMapActionClassName(SNode keyMapItem) {
    SNode keyMapDeclaration = SNodeOperations.cast(SNodeOperations.getParent(keyMapItem), "jetbrains.mps.lang.editor.structure.CellKeyMapDeclaration");
    int index = 0;
    for (SNode curItem : ListSequence.fromList(SLinkOperations.getTargets(keyMapDeclaration, "item", true))) {
      if (curItem == keyMapItem) {
        break;
      }
      index++;
    }
    return SPropertyOperations.getString(keyMapDeclaration, "name") + "_Action" + index;
  }

  public static String getUnicName(String name, SNode root, TemplateQueryContext context) {
    SNode bigCell = root;
    Set<String> namesSet = ((Set<String>) context.getStepObject(bigCell));
    if (namesSet == null) {
      namesSet = SetSequence.fromSet(new HashSet<String>());
      context.putStepObject(bigCell, namesSet);
    }
    String result = name;
    int index = 1;
    while (SetSequence.fromSet(namesSet).contains(result)) {
      result = name + "_" + index;
      index++;
    }
    SetSequence.fromSet(namesSet).addElement(result);
    return result;
  }

  public static boolean requiresAutoDeletableStyleAddition(SNode inlineEditorComponent) {
    SNode cellModel_refCell = SNodeOperations.as(SNodeOperations.getParent(inlineEditorComponent), "jetbrains.mps.lang.editor.structure.CellModel_RefCell");
    if (cellModel_refCell == null) {
      return false;
    }
    for (SNode parentCollection = EditorCellModel_Behavior.call_getParentCollectionCell_9186828658634887710(cellModel_refCell); parentCollection != null; parentCollection = EditorCellModel_Behavior.call_getParentCollectionCell_9186828658634887710(parentCollection)) {
      if (ListSequence.fromList(SLinkOperations.getTargets(parentCollection, "childCellModel", true)).count() > 1) {
        return false;
      }
    }

    if (!(LinkDeclaration_Behavior.call_isAtLeastOneCardinality_3386205146660812199(SLinkOperations.getTarget(cellModel_refCell, "relationDeclaration", false)))) {
      return false;
    }

    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(inlineEditorComponent, "cellModel", true), "jetbrains.mps.lang.editor.structure.CellModel_ReferencePresentation")) {
      SNode refPresentation = SNodeOperations.cast(SLinkOperations.getTarget(inlineEditorComponent, "cellModel", true), "jetbrains.mps.lang.editor.structure.CellModel_ReferencePresentation");
      return !(hasUserDefinedStyle(refPresentation, SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.editor.structure.AutoDeletableStyleClassItem")));
    }

    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(inlineEditorComponent, "cellModel", true), "jetbrains.mps.lang.editor.structure.CellModel_Property")) {
      SNode refPresentation = SNodeOperations.cast(SLinkOperations.getTarget(inlineEditorComponent, "cellModel", true), "jetbrains.mps.lang.editor.structure.CellModel_Property");
      return !(hasUserDefinedStyle(refPresentation, SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.editor.structure.AutoDeletableStyleClassItem")));
    }

    return false;
  }

  private static boolean hasUserDefinedStyle(SNode cellModel, final SNode styleClassConcept) {
    if (ListSequence.fromList(SLinkOperations.getTargets(cellModel, "styleItem", true)).findFirst(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(it, NameUtil.nodeFQName(styleClassConcept));
      }
    }) != null) {
      return true;
    }
    for (SNode styleClass = SLinkOperations.getTarget(cellModel, "styleClass", false); styleClass != null; styleClass = SLinkOperations.getTarget(SLinkOperations.getTarget(styleClass, "extendedClass", true), "styleSheetClass", false)) {
      if (ListSequence.fromList(SLinkOperations.getTargets(styleClass, "styleItem", true)).findFirst(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return SNodeOperations.isInstanceOf(it, NameUtil.nodeFQName(styleClassConcept));
        }
      }) != null) {
        return true;
      }
    }
    return false;
  }
}
