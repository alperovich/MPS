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
package jetbrains.mps.workbench.choose.base;

import com.intellij.ide.util.NavigationItemListCellRenderer;
import com.intellij.ide.util.gotoByName.ChooseByNameModel;
import com.intellij.navigation.NavigationItem;
import com.intellij.openapi.project.Project;
import com.intellij.util.ui.UIUtil;
import jetbrains.mps.FilteredGlobalScope;
import jetbrains.mps.ide.findusages.model.scopes.ModulesScope;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.util.Computable;
import jetbrains.mps.util.NameUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.ListCellRenderer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class BaseMPSChooseModel<T> implements ChooseByNameModel {
  protected static final Logger LOG = LogManager.getLogger(BaseMPSChooseModel.class);
  public static final String SEPARATOR = ".";

  private Project myProject;

  private T[] myObjectsInProjectScope = null;
  private T[] myObjectsInGlobalScope = null;

  private final Map<String, List<NavigationItem>> myProjectNamesCache = new HashMap<String, List<NavigationItem>>();
  private final Map<String, List<NavigationItem>> myGlobalNamesCache = new HashMap<String, List<NavigationItem>>();

  private String myEntityName = "";

  protected BaseMPSChooseModel(Project project, String entityName) {
    myProject = project;
    myEntityName = entityName;
  }

  //---------------------FIND STUFF------------------------

  protected Project getProject() {
    return myProject;
  }

  private Map<String, List<NavigationItem>> getProjectNamesCache() {
    if (myObjectsInProjectScope == null) {
      ModelAccess.instance().runReadAction(new Runnable() {
        @Override
        public void run() {
          myObjectsInProjectScope = find(false);
          myProjectNamesCache.clear();
          for (T o : myObjectsInProjectScope) {
            String name = doGetObjectName(o);
            if (myProjectNamesCache.get(name) == null) {
              myProjectNamesCache.put(name, new ArrayList<NavigationItem>());
            }
            myProjectNamesCache.get(name).add(doGetNavigationItem(o));
          }
        }
      });
    }
    return myProjectNamesCache;
  }

  private Map<String, List<NavigationItem>> getGlobalNamesCache() {
    if (myObjectsInGlobalScope == null) {
      ModelAccess.instance().runReadAction(new Runnable() {
        @Override
        public void run() {
          myObjectsInGlobalScope = find(true);
          myGlobalNamesCache.clear();
          for (T o : myObjectsInGlobalScope) {
            String name = doGetObjectName(o);
            if (myGlobalNamesCache.get(name) == null) {
              myGlobalNamesCache.put(name, new ArrayList<NavigationItem>());
            }
            myGlobalNamesCache.get(name).add(doGetNavigationItem(o));
          }

        }
      });
    }
    return myGlobalNamesCache;
  }

  @Override
  public String[] getNames(final boolean checkBoxState) {
    return ModelAccess.instance().runReadAction(new Computable<String[]>() {
      @Override
      public String[] compute() {
        Map<String, List<NavigationItem>> namesMap = checkBoxState ? getGlobalNamesCache() : getProjectNamesCache();
        return namesMap.keySet().toArray(new String[namesMap.keySet().size()]);
      }
    });
  }

  @Override
  public NavigationItem[] getElementsByName(final String name, final boolean checkBoxState, final String pattern) {
    return ModelAccess.instance().runReadAction(new Computable<NavigationItem[]>() {
      @Override
      public NavigationItem[] compute() {
        Map<String, List<NavigationItem>> namesMap = checkBoxState ? getGlobalNamesCache() : getProjectNamesCache();
        List<NavigationItem> navigationItems = namesMap.get(name);

        //this normally should not happen, this code is here because of MPS-10408
        if (navigationItems != null) return navigationItems.toArray(new NavigationItem[navigationItems.size()]);

        return new NavigationItem[0];
      }
    });
  }

  @Override
  public String getFullName(final Object element) {
    return ModelAccess.instance().runReadAction(new Computable<String>() {
      @Override
      public String compute() {
        return doGetFullName(element);
      }
    });
  }

  @Override
  public String getElementName(final Object element) {
    return ModelAccess.instance().runReadAction(new Computable<String>() {
      @Override
      public String compute() {
        return ((NavigationItem) element).getName();
      }
    });
  }

  public T[] find(boolean checkboxState) {
    if (checkboxState) return find(new FilteredGlobalScope());
    MPSProject project = myProject.getComponent(MPSProject.class);
    return find(new ModulesScope(project.getModulesWithGenerators()));
  }

  public abstract String doGetFullName(Object element);

  public abstract String doGetObjectName(T object);

  public abstract NavigationItem doGetNavigationItem(T object);

  public abstract T[] find(IScope scope);

  //---------------------INTERFACE STUFF------------------------

  @Override
  public final String getCheckBoxName() {
    String name = doGetCheckBoxName();
    if (name == null) return null;
    return UIUtil.replaceMnemonicAmpersand(name);
  }

  protected String doGetCheckBoxName() {
    return "Include &non-&&project " + NameUtil.pluralize(myEntityName);
  }

  @Override
  public String getNotInMessage() {
    return "no " + NameUtil.pluralize(myEntityName) + " found in project";
  }

  @Override
  public String getNotFoundMessage() {
    return "no mathches found";
  }

  @Override
  @Nullable
  public String getPromptText() {
    return NameUtil.capitalize(myEntityName) + " name:";
  }

  @Override
  @NotNull
  public String[] getSeparators() {
    return new String[]{SEPARATOR};
  }

  //this is deprecated and not used
  @Override
  public final char getCheckBoxMnemonic() {
    return 'n';
  }

  @Override
  public boolean loadInitialCheckBoxState() {
    return false;
  }

  @Override
  public void saveInitialCheckBoxState(boolean state) {
  }

  @Override
  public ListCellRenderer getListCellRenderer() {
    return new NavigationItemListCellRenderer();
  }

  @Override
  public String getHelpId() {
    return null;
  }

  @Override
  public boolean useMiddleMatching() {
    return true;
  }
}
