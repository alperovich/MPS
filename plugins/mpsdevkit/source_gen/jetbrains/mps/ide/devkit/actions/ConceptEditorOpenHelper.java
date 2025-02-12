package jetbrains.mps.ide.devkit.actions;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.mps.openapi.module.SModule;
import jetbrains.mps.smodel.Generator;
import jetbrains.mps.kernel.model.SModelUtil;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class ConceptEditorOpenHelper {
  public static SNode getBaseNode(SNode node) {
    SNode baseNode = null;
    if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration")) {
      return null;
    }
    if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.structure.structure.IConceptAspect")) {
      baseNode = BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), SNodeOperations.cast(node, "jetbrains.mps.lang.structure.structure.IConceptAspect"), "virtual_getBaseConcept_2621449412040133768", new Object[]{});
    }
    if (baseNode == null) {
      baseNode = getBaseNode2(node);
    }
    if (baseNode == null) {
      return null;
    }
    // We should be sure that node and base node are inside the same module.  
    // Otherwise, tabbed editor for base node will be opened, but there will be no tab for "node" 
    // So, the user will not be able to open node by a double-click 
    SModel baseModelDesIcriptor = SNodeOperations.getModel(baseNode);
    SModel mainModelDescriptor = SNodeOperations.getModel(node);
    if (mainModelDescriptor == null) {
      return null;
    }
    SModule baseModule = baseModelDesIcriptor.getModule();
    SModule mainModule = mainModelDescriptor.getModule();
    if (mainModule instanceof Generator) {
      mainModule = ((Generator) mainModule).getSourceLanguage();
    }
    if (baseModule != mainModule) {
      return null;
    }
    if (!(canOpen(baseNode))) {
      return null;
    }
    return baseNode;
  }

  private static SNode getBaseNode2(SNode node) {
    if (node == null) {
      return null;
    }
    SNode baseNode = findBaseNodeMultiTab(node);
    if ((baseNode == null) || SModelUtil.getDeclaringLanguage(baseNode) == null || (Language.getModelAspect(SNodeOperations.getModel(node)) == null && !(SModelStereotype.isGeneratorModel(SNodeOperations.getModel(node))))) {
      return null;
    }
    return baseNode;
  }

  private static boolean canOpen(SNode node) {
    if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration"))) {
      return false;
    }
    if (SModelUtil.getDeclaringLanguage(SNodeOperations.cast(node, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration")) == null) {
      return false;
    }
    if (Language.getModelAspect(SNodeOperations.getModel(node)) == null) {
      return false;
    }
    return true;
  }

  private static SNode findBaseNodeMultiTab(SNode node) {
    SNode baseNode = null;
    if (jetbrains.mps.util.SNodeOperations.isRoot(node) && SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.core.structure.BaseConcept")) {
      SNode bc = SNodeOperations.cast(node, "jetbrains.mps.lang.core.structure.BaseConcept");
      SNode annotation = AttributeOperations.getAttribute(bc, new IAttributeDescriptor.NodeAttribute("jetbrains.mps.lang.generator.structure.RootTemplateAnnotation"));
      if ((annotation != null) && (SLinkOperations.getTarget(annotation, "applicableConcept", false) != null)) {
        baseNode = SLinkOperations.getTarget(annotation, "applicableConcept", false);
      }
    }
    if ((baseNode == null)) {
      return null;
    }
    SModule baseNodeModule = SNodeOperations.getModel(baseNode).getModule();
    SModule nodeModule = SNodeOperations.getModel(node).getModule();
    if (nodeModule instanceof Generator) {
      nodeModule = ((Generator) nodeModule).getSourceLanguage();
    }
    if (baseNodeModule != nodeModule) {
      return null;
    }
    return baseNode;
  }
}
