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
package jetbrains.mps.workbench.choose.string;

import com.intellij.openapi.project.Project;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.workbench.choose.base.BaseMPSChooseModel;

public abstract class BaseStringModel extends BaseMPSChooseModel<String> {
  @Override
  public boolean willOpenEditor() {
    return false;
  }

  public BaseStringModel(Project project) {
    super(project, "");
  }

  @Override
  public String doGetFullName(Object element) {
    BaseStringItem navigationItem = (BaseStringItem) element;
    return navigationItem.getString();
  }

  @Override
  public String doGetObjectName(String s) {
    return NameUtil.shortNameFromLongName(s);
  }
}
