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
package jetbrains.mps.ide.findusages.view;

import jetbrains.mps.classloading.ClassLoaderManager;
import jetbrains.mps.ide.findusages.findalgorithm.finders.GeneratedFinder;
import jetbrains.mps.ide.findusages.findalgorithm.finders.IFinder;
import jetbrains.mps.ide.findusages.findalgorithm.finders.IInterfacedFinder;
import jetbrains.mps.ide.findusages.findalgorithm.finders.ModuleClassReference;
import jetbrains.mps.ide.findusages.findalgorithm.resultproviders.treenodes.BaseLeaf;
import jetbrains.mps.ide.findusages.findalgorithm.resultproviders.treenodes.BaseNode;
import jetbrains.mps.ide.findusages.findalgorithm.resultproviders.treenodes.FinderNode;
import jetbrains.mps.ide.findusages.findalgorithm.resultproviders.treenodes.UnionNode;
import jetbrains.mps.ide.findusages.model.IResultProvider;
import jetbrains.mps.ide.findusages.model.SearchQuery;
import jetbrains.mps.ide.findusages.model.SearchResult;
import jetbrains.mps.ide.findusages.model.SearchResults;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.jetbrains.mps.openapi.util.ProgressMonitor;
import jetbrains.mps.smodel.ModelAccess;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.util.NameUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.module.SModule;
import org.jetbrains.mps.openapi.module.SearchScope;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FindUtils {
  private static final Logger LOG = LogManager.getLogger(FindUtils.class);

  @Deprecated
  public static SearchResults getSearchResults(@Nullable final ProgressMonitor monitor, final @NotNull SNode node, final SearchScope scope, final String... finderClassNames) {
    List<GeneratedFinder> finders = new ArrayList<GeneratedFinder>(finderClassNames.length);
    for (String finderClassName : finderClassNames) {
      GeneratedFinder finder = getFinderByClassName(finderClassName);
      if (finder != null) finders.add(finder);
    }

    return getSearchResults(monitor, new SearchQuery(node, scope), finders.toArray(new GeneratedFinder[0]));
  }

  public static SearchResults getSearchResults(@Nullable final ProgressMonitor monitor, final @NotNull SNode node, final SearchScope scope, final ModuleClassReference<GeneratedFinder>... finderClasses) {
    List<GeneratedFinder> finders = new ArrayList<GeneratedFinder>(finderClasses.length);
    for (ModuleClassReference<GeneratedFinder> finderClass : finderClasses) {
      GeneratedFinder finder = getFinderByClass(finderClass);
      if (finder != null) finders.add(finder);
    }

    return getSearchResults(monitor, new SearchQuery(node, scope), finders.toArray(new GeneratedFinder[0]));
  }

  public static SearchResults getSearchResults(@Nullable final ProgressMonitor monitor, final SearchQuery query, final IFinder... finders) {
    return getSearchResults(monitor, query, makeProvider(finders));
  }

  public static SearchResults getSearchResults(@Nullable final ProgressMonitor monitor, final SearchQuery query, final IResultProvider provider) {
    final SearchResults[] results = new SearchResults[1];
    ModelAccess.instance().runReadAction(new Runnable() {
      @Override
      public void run() {
        results[0] = provider.getResults(query, monitor);
      }
    });
    return results[0];
  }

  @Deprecated
  public static List<SNode> executeFinder(String className, SNode node, SearchScope scope, ProgressMonitor monitor) {
    List<SNode> result = new ArrayList<SNode>();
    IInterfacedFinder finder = getFinderByClassName(className);
    if (finder == null) return result;
    for (SearchResult<SNode> searchResult : finder.find(new SearchQuery(node, scope), monitor).getSearchResults()) {
      result.add(searchResult.getObject());
    }
    return result;
  }

  public static List<SNode> executeFinder(ModuleClassReference<GeneratedFinder> finderClass, SNode node, SearchScope scope, ProgressMonitor monitor) {
    List<SNode> result = new ArrayList<SNode>();
    IInterfacedFinder finder = getFinderByClass(finderClass);
    if (finder == null) return result;
    for (SearchResult<SNode> searchResult : finder.find(new SearchQuery(node, scope), monitor).getSearchResults()) {
      result.add(searchResult.getObject());
    }
    return result;
  }

  @Deprecated
  @Nullable
  public static GeneratedFinder getFinderByClassName(String className) {
    try {
      String modelName = NameUtil.namespaceFromLongName(className);
      List<SModel> models = SModelRepository.getInstance().getModelDescriptorsByModelName(modelName);

      Class c = null;
      for (SModel model : models) {
        SModule module = model.getModule();
        if (ClassLoaderManager.getInstance().canLoad(module)) {
          c = ClassLoaderManager.getInstance().getClass(module, className);
          if (c != null) break;
        }
      }

      if (c == null) {
        LOG.error("Class " + className + " not found");
        return null;
      }

      GeneratedFinder finder = (GeneratedFinder) c.newInstance();
      return finder;
    } catch (Throwable t) {
      LOG.error("Error instantiating finder \"" + className + "\". Returning empty results.  Message:" + t.getMessage(), t);
      return null;
    }
  }

  public static GeneratedFinder getFinderByClass(ModuleClassReference<GeneratedFinder> finderClass) {
    try {
      Class<GeneratedFinder> fClass = finderClass.loadClass();

      if (fClass == null) {
        LOG.error("Class " + finderClass.getClassName() + " not found. Returning empty results.");
        return null;
      }

      GeneratedFinder finder = fClass.newInstance();
      return finder;
    } catch (Throwable t) {
      LOG.error("Error instantiating finder \"" + finderClass.getClassName() + "\". Returning empty results.  Message:" + t.getMessage(), t);
      return null;
    }
  }

  public static IResultProvider makeProvider(Collection<IFinder> finders) {
    UnionNode unionNode = new UnionNode();
    for (IFinder finder : finders) {
      addChild(unionNode, new FinderNode(finder));
    }
    return unionNode;
  }

  public static IResultProvider makeProvider(IFinder... finders) {
    return makeProvider(Arrays.asList(finders));
  }

  private static void addChild(BaseNode parent, BaseNode child) {
    parent.addChild(child);
    child.setParent(parent);
  }

  private static void removeChild(BaseNode parent, BaseLeaf child) {
    parent.removeChild(child);
    child.setParent(null);
  }
}
