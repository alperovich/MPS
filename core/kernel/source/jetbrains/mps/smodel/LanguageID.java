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
package jetbrains.mps.smodel;

import jetbrains.mps.project.structure.model.ModelRootManager;

public class LanguageID {
  public static final String JAVA = "java";
  // TODO move JavaStub -> core?
  public static final ModelRootManager JAVA_MANAGER = new ModelRootManager("f3061a53-9226-4cc5-a443-f952ceaf5816",
      "jetbrains.mps.baseLanguage.stubs.JavaStubs");
}
