/*
 * Copyright 2003-2011 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.mps.smodel.runtime.illegal;

import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import jetbrains.mps.smodel.runtime.ConceptKind;
import jetbrains.mps.smodel.runtime.StaticScope;

import java.util.Collections;
import java.util.List;
import java.util.Set;

public class IllegalConceptDescriptor implements ConceptDescriptor {
  private final String fqName;

  public IllegalConceptDescriptor(String fqName) {
    this.fqName = fqName;
  }

  @Override
  public String getConceptFqName() {
    return fqName;
  }

  @Override
  public String getSuperConcept() {
    return null;
  }

  @Override
  public boolean isInterfaceConcept() {
    return false;
  }

  @Override
  public Set<String> getPropertyNames() {
    return Collections.emptySet();
  }

  @Override
  public boolean hasProperty(String name) {
    return false;
  }

  @Override
  public Set<String> getReferenceNames() {
    return Collections.emptySet();
  }

  @Override
  public boolean hasReference(String name) {
    return false;
  }

  @Override
  public Set<String> getChildrenNames() {
    return Collections.emptySet();
  }

  @Override
  public boolean isUnorderedChild(String name) {
    return false;
  }

  @Override
  public Set<String> getUnorderedChildrenNames() {
    return Collections.emptySet();
  }

  @Override
  public boolean hasChild(String name) {
    return false;
  }

  @Override
  public StaticScope getStaticScope() {
    return StaticScope.GLOBAL;
  }

  @Override
  public boolean isMultipleChild(String name) {
    return false;
  }

  @Override
  public List<String> getParentsNames() {
    return Collections.emptyList();
  }

  @Override
  public boolean isAssignableTo(String toConceptFqName) {
    return false;
  }

  @Override
  public Set<String> getAncestorsNames() {
    return Collections.emptySet();
  }

  @Override
  public ConceptKind getConceptKind() {
    return ConceptKind.NORMAL;
  }

  @Override
  public boolean isAbstract() {
    return false;
  }

  @Override
  public boolean isFinal() {
    return false;
  }


  @Override
  public String getConceptAlias() {
    return "";
  }

  @Override
  public String getConceptShortDescription() {
    return "";
  }

  @Override
  public String getHelpUrl() {
    return "";
  }
}
