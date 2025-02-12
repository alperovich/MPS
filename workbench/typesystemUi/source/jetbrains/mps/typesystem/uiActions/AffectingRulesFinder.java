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

package jetbrains.mps.typesystem.uiActions;

import jetbrains.mps.ide.findusages.findalgorithm.finders.IFinder;
import jetbrains.mps.ide.findusages.model.SearchQuery;
import jetbrains.mps.ide.findusages.model.SearchResult;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.newTypesystem.context.typechecking.IncrementalTypechecking;
import org.jetbrains.mps.openapi.util.ProgressMonitor;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.smodel.SNodeId;
import jetbrains.mps.typesystem.inference.DefaultTypecheckingContextOwner;
import jetbrains.mps.typesystem.inference.ITypeContextOwner;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.typesystem.inference.TypeContextManager;
import jetbrains.mps.util.CollectionUtil;
import jetbrains.mps.util.Pair;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AffectingRulesFinder implements IFinder {
  public SearchResults find(SearchQuery query, ProgressMonitor monitor) {
    SNode term = (SNode) query.getObjectHolder().getObject();
    SNode root = term.getContainingRoot();

    ITypeContextOwner owner = new MyTypeContextOwner();
    TypeContextManager manager = TypeContextManager.getInstance();

    TypeCheckingContext context = manager.acquireTypecheckingContext(root, owner);
    try {
      IncrementalTypechecking component = context.getBaseNodeTypesComponent();
      List<SearchResult<SNode>> rules = new ArrayList<SearchResult<SNode>>();
      if (component == null) return createResult(term, rules);

      Set<Pair<String, String>> rulesIds = component.getRulesWhichAffectNodeType(term);
      if (rulesIds == null) return createResult(term, rules);

      for (Pair<String, String> ruleId : rulesIds) {
        SModel modelDescriptor = SModelRepository.getInstance().getModelDescriptor(PersistenceFacade.getInstance().createModelReference(ruleId.o1));
        if (modelDescriptor == null) continue;

        SNodeId nodeId = SNodeId.fromString(ruleId.o2);
        assert nodeId != null : "wrong node id string";
        SNode rule = modelDescriptor.getNode(nodeId);
        if (rule == null) continue;

        rules.add(new SearchResult<SNode>(rule, "rules which affect node's type"));
      }
      return createResult(term, rules);
    } finally {
      manager.releaseTypecheckingContext(root, owner);
    }
  }

  private SearchResults<SNode> createResult(SNode node, List<SearchResult<SNode>> results) {
    return new SearchResults<SNode>(CollectionUtil.set(node), results);
  }


  private static class MyTypeContextOwner extends DefaultTypecheckingContextOwner {
  }
}
