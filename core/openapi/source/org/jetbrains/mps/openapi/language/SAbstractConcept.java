/*
 * Copyright 2003-2012 JetBrains s.r.o.
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
package org.jetbrains.mps.openapi.language;

/**
 * A descriptor of a concept. Concepts define categories for AST nodes.
 * The descriptor is read-only, so it is not possible to change the concept through its descriptor.
 * SConcept (and SAbstractConcept) can be obtained by their ids from SConceptRepository.
 * note: the relationship between SNode and SConcept is analogical to the relationship between an object and its Class in Java
 */
public interface SAbstractConcept {

  /**
   * The qualified name of the concept. Uniquely identifies this concept in its concept repository.
   */
  String getQualifiedName();

  /**
   * The user visible name of the concept
   */
  String getName();

  /**
   * The language that defines the concept
   */
  SLanguage getLanguage();

  /**
   * Retrieves an associated link identified by the given role.
   */
  SAbstractLink getLink(String role);

  /**
   * Retrieves all links associated with the concept.
   */
  Iterable<SAbstractLink> getLinks();

  /**
   * Finds a concept's property by name
   */
  SProperty getProperty(String name);

  /**
   * All properties
   */
  Iterable<SProperty> getProperties();

  /**
   * Either implementing or extending the supplied concept
   */
  boolean isSubConceptOf(SAbstractConcept concept);
}
