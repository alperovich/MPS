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
package jetbrains.mps.textGen;

import jetbrains.mps.smodel.IOperationContext;
import org.jetbrains.mps.openapi.model.SNode;

// use TextGen instead
@Deprecated
public class TextGenerationUtil {
  public static final String NO_TEXTGEN = TextGen.NO_TEXTGEN;

  public static TextGenerationResult generateText(IOperationContext context, SNode node) {
    return TextGen.generateText(node);
  }

  public static TextGenerationResult generateText(IOperationContext context, SNode node, boolean failIfNoTextgen, boolean withDebugInfo, StringBuilder[] buffers) {
    return TextGen.generateText(node, failIfNoTextgen, withDebugInfo, buffers);
  }
}
                                                            
