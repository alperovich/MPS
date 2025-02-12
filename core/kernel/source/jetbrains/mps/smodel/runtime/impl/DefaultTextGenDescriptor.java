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
package jetbrains.mps.smodel.runtime.impl;

import jetbrains.mps.smodel.runtime.TextGenDescriptor;
import jetbrains.mps.textGen.TextGenBuffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.model.SNodeUtil;

public class DefaultTextGenDescriptor implements TextGenDescriptor {
  @Override
  public void doGenerateText(@NotNull SNode node, TextGenBuffer buffer) {
    buffer.append("<!TextGen not found for '" + node.getConcept().getQualifiedName() + "'!>");
    buffer.foundError("No textgen for " + node.getConcept().getQualifiedName() + " in " + SNodeUtil.getDebugText(node), node, null);
  }

  @Override
  public String getExtension(SNode node) {
    return null;
  }
}
