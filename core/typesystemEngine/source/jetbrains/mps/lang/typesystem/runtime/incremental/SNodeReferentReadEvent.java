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
package jetbrains.mps.lang.typesystem.runtime.incremental;

import org.jetbrains.mps.openapi.model.SNode;

public class SNodeReferentReadEvent extends SNodeReadEvent {

  protected String myReferentRole;

  public SNodeReferentReadEvent(SNode node, String referentRole) {
    super(node);
    myReferentRole = referentRole;
  }

  public String getReferentRole() {
    return myReferentRole;
  }

  public String toString() {
    return "read referent in role " + myReferentRole;
  }

  public int hashCode() {
    return super.hashCode() + myReferentRole.hashCode();
  }

  public boolean equals(Object obj) {
    return super.equals(obj) && (((SNodeReferentReadEvent) obj).myReferentRole.equals(myReferentRole));
  }
}
