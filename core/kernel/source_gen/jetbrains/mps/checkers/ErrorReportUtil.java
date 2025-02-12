package jetbrains.mps.checkers;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.util.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;

public class ErrorReportUtil {
  public ErrorReportUtil() {
  }

  public static boolean shouldReportError(SNode node) {
    final Wrappers._T<SNode> _node = new Wrappers._T<SNode>(node);
    SModel model = _node.value.getModel();
    if (model == null) {
      return false;
    }
    if (SModelStereotype.isStubModelStereotype(SNodeOperations.getModelStereotype(model))) {
      return false;
    }
    SNode parent = _node.value;
    while (parent != null) {
      if (jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations.isInstanceOf(parent, "jetbrains.mps.lang.core.structure.ISuppressErrors") && BehaviorReflection.invokeVirtual(Boolean.TYPE, jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations.cast(parent, "jetbrains.mps.lang.core.structure.ISuppressErrors"), "virtual_suppress_3393165121846091591", new Object[]{_node.value})) {
        return false;
      }
      if (jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations.isInstanceOf(parent, "jetbrains.mps.lang.core.structure.Attribute")) {
        return true;
      }
      if (ListSequence.fromList(AttributeOperations.getAttributeList(parent, new IAttributeDescriptor.AllAttributes())).any(new IWhereFilter<SNode>() {
        public boolean accept(SNode attr) {
          return jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations.isInstanceOf(attr, "jetbrains.mps.lang.core.structure.ISuppressErrors") && BehaviorReflection.invokeVirtual(Boolean.TYPE, jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations.cast(attr, "jetbrains.mps.lang.core.structure.ISuppressErrors"), "virtual_suppress_3393165121846091591", new Object[]{_node.value}) && attr != _node.value;
        }
      })) {
        return false;
      }
      if (jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations.isInstanceOf(parent, "jetbrains.mps.lang.core.structure.IAntisuppressErrors")) {
        return true;
      }
      _node.value = parent;
      parent = jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations.getParent(_node.value);
    }
    return true;
  }
}
