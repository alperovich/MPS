package jetbrains.mps.persistence;

/*Generated by MPS */

import java.util.Map;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import org.jetbrains.mps.openapi.model.SModelReference;
import jetbrains.mps.smodel.runtime.StaticScope;
import jetbrains.mps.smodel.runtime.ConceptKind;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;
import org.jetbrains.mps.openapi.model.SReference;
import jetbrains.mps.smodel.SModel;

public class LightModelEnvironmentInfoImpl implements LightModelEnvironmentInfo {
  private boolean myConsistent = true;
  private Map<String, SNodeReference> myConceptsToPointers = MapSequence.fromMap(new HashMap<String, SNodeReference>());
  private Map<Tuples._2<String, String>, SNodeReference> myNodeRolesToPointers = MapSequence.fromMap(new HashMap<Tuples._2<String, String>, SNodeReference>());
  private Map<Tuples._2<String, String>, SNodeReference> myReferenceRolesToPointers = MapSequence.fromMap(new HashMap<Tuples._2<String, String>, SNodeReference>());
  private Map<Tuples._2<String, String>, SNodeReference> myPropertyNamesToPointers = MapSequence.fromMap(new HashMap<Tuples._2<String, String>, SNodeReference>());
  private Map<SModelReference, Integer> myModelVersions = MapSequence.fromMap(new HashMap<SModelReference, Integer>());
  private Map<String, StaticScope> myConceptScope = MapSequence.fromMap(new HashMap<String, StaticScope>());
  private Map<String, ConceptKind> myConceptKind = MapSequence.fromMap(new HashMap<String, ConceptKind>());
  private Map<Tuples._2<String, String>, Boolean> myChildLinkToUnordered = MapSequence.fromMap(new HashMap<Tuples._2<String, String>, Boolean>());

  public LightModelEnvironmentInfoImpl() {
  }

  private <K, V> void storeAndCheckConsistency(Map<K, V> theMap, K key, V value) {
    if (MapSequence.fromMap(theMap).containsKey(key)) {
      myConsistent = myConsistent && eq_7gzj8n_a0a0a0a0k(MapSequence.fromMap(theMap).get(key), value);
    } else {
      MapSequence.fromMap(theMap).put(key, value);
    }
  }



  @Override
  public void conceptRead(SNode node, SNodeReference conceptPointer, StaticScope conceptScope, ConceptKind conceptKind) {
    String name = node.getConcept().getQualifiedName();
    storeAndCheckConsistency(myConceptsToPointers, name, conceptPointer);
    storeAndCheckConsistency(myConceptScope, name, conceptScope);
    storeAndCheckConsistency(myConceptKind, name, conceptKind);
  }

  @Override
  public void nodeRoleRead(SNode node, SNodeReference linkPointer, boolean unorderedRole) {
    Tuples._2<String, String> key = MultiTuple.<String,String>from(node.getParent().getConcept().getQualifiedName(), node.getRoleInParent());
    storeAndCheckConsistency(myNodeRolesToPointers, key, linkPointer);
    storeAndCheckConsistency(myChildLinkToUnordered, key, unorderedRole);
  }

  @Override
  public void referenceRoleRead(SReference reference, SNodeReference linkPointer) {
    storeAndCheckConsistency(myReferenceRolesToPointers, MultiTuple.<String,String>from(reference.getSourceNode().getConcept().getQualifiedName(), reference.getRole()), linkPointer);
  }

  @Override
  public void propertyNameRead(SNode node, String propertyName, SNodeReference propertyPointer) {
    storeAndCheckConsistency(myPropertyNamesToPointers, MultiTuple.<String,String>from(node.getConcept().getQualifiedName(), propertyName), propertyPointer);
  }

  @Override
  public void modelVersionRead(SModel.ImportElement element) {
    storeAndCheckConsistency(myModelVersions, element.getModelReference(), element.getUsedVersion());
  }

  @Override
  public SNodeReference getConceptId(SNode node) {
    return MapSequence.fromMap(myConceptsToPointers).get(node.getConcept().getQualifiedName());
  }

  @Override
  public SNodeReference getNodeRoleId(SNode node) {
    String roleInParent = node.getRoleInParent();
    if (roleInParent == null) {
      return null;
    }
    return MapSequence.fromMap(myNodeRolesToPointers).get(MultiTuple.<String,String>from(node.getParent().getConcept().getQualifiedName(), roleInParent));
  }

  @Override
  public ConceptKind getConceptKind(SNode node) {
    String conceptName = node.getConcept().getQualifiedName();
    ConceptKind kind = MapSequence.fromMap(myConceptKind).get(conceptName);
    return (kind != null ?
      kind :
      ConceptKind.NORMAL
    );
  }

  @Override
  public boolean isInUnorderedRole(SNode node) {
    SNode parent = node.getParent();
    if (parent == null) {
      return false;
    }
    Boolean b = MapSequence.fromMap(myChildLinkToUnordered).get(MultiTuple.<String,String>from(parent.getConcept().getQualifiedName(), node.getRoleInParent()));
    return b != null && b.booleanValue();
  }



  @Override
  public StaticScope getConceptScope(SNode node) {
    String conceptName = node.getConcept().getQualifiedName();
    StaticScope scope = MapSequence.fromMap(myConceptScope).get(conceptName);
    return (scope != null ?
      scope :
      StaticScope.GLOBAL
    );
  }

  @Override
  public SNodeReference getReferenceRoleId(SReference reference) {
    return MapSequence.fromMap(myReferenceRolesToPointers).get(MultiTuple.<String,String>from(reference.getSourceNode().getConcept().getQualifiedName(), reference.getRole()));
  }

  @Override
  public SNodeReference getPropertyId(SNode node, String propertyName) {
    return MapSequence.fromMap(myPropertyNamesToPointers).get(MultiTuple.<String,String>from(node.getConcept().getQualifiedName(), propertyName));
  }

  @Override
  public int getModelVersion(SModelReference reference) {
    return MapSequence.fromMap(myModelVersions).get(reference);
  }

  public boolean isConsistent() {
    return myConsistent;
  }

  private static boolean eq_7gzj8n_a0a0a0a0k(Object a, Object b) {
    return (a != null ?
      a.equals(b) :
      a == b
    );
  }
}
