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
package jetbrains.mps.ide.dataExtraction;

import com.intellij.ide.impl.dataRules.GetDataRule;
import com.intellij.openapi.actionSystem.DataProvider;
import jetbrains.mps.ide.actions.MPSCommonDataKeys;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.IScope;
import org.jetbrains.annotations.Nullable;

public class ScopeRule implements GetDataRule {
  @Override
  @Nullable
  public Object getData(DataProvider dataProvider) {
    IOperationContext context = (IOperationContext) dataProvider.getData(MPSCommonDataKeys.OPERATION_CONTEXT.getName());
    if (context == null) return null;
    IScope scope = context.getScope();
    if (scope != null) return scope;

    MPSProject project = (MPSProject) dataProvider.getData(MPSCommonDataKeys.MPS_PROJECT.getName());
    if (project != null) return project.getScope();
    return GlobalScope.getInstance();
  }
}
