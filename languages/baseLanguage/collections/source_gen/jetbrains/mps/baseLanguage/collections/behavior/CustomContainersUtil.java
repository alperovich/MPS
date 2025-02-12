package jetbrains.mps.baseLanguage.collections.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.baseLanguage.collections.plugin.CollectionsLanguage;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;

public class CustomContainersUtil {
  public CustomContainersUtil() {
  }

  public static Iterable<SNode> containerCreators(SModel model, final SNode type) {
    return (Iterable<SNode>) (SConceptOperations.isSubConceptOf(SNodeOperations.getConceptDeclaration(type), "jetbrains.mps.baseLanguage.collections.structure.MapType") ?
      Sequence.fromIterable(containerDeclarations(model, type)).select(new ISelector<SNode, SNode>() {
        public SNode select(SNode ccd) {
          SNode cmc = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.collections.structure.CustomMapCreator", null);
          SLinkOperations.setTarget(cmc, "containerDeclaration", ccd, false);
          List<SNode> tvds = SLinkOperations.getTargets(ccd, "typeVariableDeclaration", true);
          List<SNode> ctParams = ListSequence.fromListAndArray(new ArrayList<SNode>(), SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(ccd, "containerType", true), "jetbrains.mps.baseLanguage.collections.structure.MapType"), "keyType", true), SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(ccd, "containerType", true), "jetbrains.mps.baseLanguage.collections.structure.MapType"), "valueType", true));
          List<SNode> typeParams = ListSequence.fromListAndArray(new ArrayList<SNode>(), SLinkOperations.getTarget(SNodeOperations.as(type, "jetbrains.mps.baseLanguage.collections.structure.MapType"), "keyType", true), SLinkOperations.getTarget(SNodeOperations.cast(type, "jetbrains.mps.baseLanguage.collections.structure.MapType"), "valueType", true));
with_ctParams:
          for (int idx = 0; idx < ListSequence.fromList(ctParams).count(); idx++) {
            SNode c = ListSequence.fromList(ctParams).getElement(idx);
            if (SNodeOperations.isInstanceOf(c, "jetbrains.mps.baseLanguage.structure.TypeVariableReference")) {
              SNode pt = ListSequence.fromList(typeParams).getElement((ListSequence.fromList(tvds).count() > 1 ?
                ListSequence.fromList(tvds).indexOf(SLinkOperations.getTarget(SNodeOperations.cast(c, "jetbrains.mps.baseLanguage.structure.TypeVariableReference"), "typeVariableDeclaration", false)) :
                idx
              ));
              switch (idx) {
                case 0:
                  SLinkOperations.setTarget(cmc, "keyType", SNodeOperations.copyNode(pt), true);
                  break;
                case 1:
                  SLinkOperations.setTarget(cmc, "valueType", SNodeOperations.copyNode(pt), true);
                  break;
                default:
                  break with_ctParams;
              }
            }
          }
          return cmc;
        }
      }) :
      Sequence.fromIterable(containerDeclarations(model, type)).select(new ISelector<SNode, SNode>() {
        public SNode select(SNode ccd) {
          SNode ccc = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.collections.structure.CustomContainerCreator", null);
          SLinkOperations.setTarget(ccc, "containerDeclaration", ccd, false);
          if ((int) ListSequence.fromList(SLinkOperations.getTargets(ccd, "typeVariableDeclaration", true)).count() == 1) {
            SLinkOperations.setTarget(ccc, "elementType", SNodeOperations.as(ListSequence.fromList(SNodeOperations.getChildren(type)).first(), "jetbrains.mps.baseLanguage.structure.Type"), true);
          }
          return ccc;
        }
      })
    );
  }

  public static Iterable<SNode> containerDeclarations(SModel model, final SNode type) {
    return ListSequence.fromList(CollectionsLanguage.getInstance().getCustomContainersRegistry().accessibleCustomContainerDeclarations(model)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode ccd) {
        return SNodeOperations.getConceptDeclaration(SLinkOperations.getTarget(ccd, "containerType", true)) == SNodeOperations.getConceptDeclaration(type);
      }
    });
  }
}
