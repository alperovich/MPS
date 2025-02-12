package jetbrains.mps.ide.platform.actions.core;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.language.ConceptRegistry;

public class RenameUtil {
  public static boolean canBeRenamed(SNode node) {
    // we won't rename nodes, for which there are registered name constrints 
    // if there are constrints, but they are not compiled, we can rename it 
    String nameProperty = SPropertyOperations.getString(ListSequence.fromList(SLinkOperations.getTargets(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.core.structure.INamedConcept"), "propertyDeclaration", true)).first(), "name");
    return !(ConceptRegistry.getInstance().getConstraintsDescriptor(node.getConcept().getQualifiedName()).getProperty(nameProperty).isReadOnly());
  }
}
