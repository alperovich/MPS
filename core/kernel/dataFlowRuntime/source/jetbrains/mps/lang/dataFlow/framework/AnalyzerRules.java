/*
 * Copyright 2003-2015 JetBrains s.r.o.
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
package jetbrains.mps.lang.dataFlow.framework;

import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SModelInternal;
import jetbrains.mps.smodel.language.LanguageRegistry;
import jetbrains.mps.smodel.language.LanguageRuntime;
import org.apache.log4j.LogManager;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import org.jetbrains.mps.openapi.language.SConcept;
import org.jetbrains.mps.openapi.language.SLanguage;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.mps.openapi.model.SNode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @author simon
 */
public class AnalyzerRules {
  private static Logger LOG = Logger.wrap(LogManager.getLogger(AnalyzerRules.class));

  private List<DataFlowConstructor> myRules = new LinkedList<DataFlowConstructor>();
  private String myAnalyzerId;
  private final SNode myNodeToApply;
  private final Program myProgram;

  public AnalyzerRules(String analyzerId, SNode nodeToApply, Program program) {
    myNodeToApply = nodeToApply;
    myProgram = program;
    myAnalyzerId = analyzerId;
  }
  public void apply() {
    SModel model = myNodeToApply.getModel();
    if (!(model instanceof SModelInternal)) {
      LOG.warning(model == null ? "Checking node which is not attached to the model: " + myNodeToApply.getPresentation() + " " + myNodeToApply.getNodeId()
                                : "Model " + model.getModelName() + " is not instance of SModelInternal");
      return;
    }
    SModelInternal modelInternal = (SModelInternal) model;
    for (SLanguage language : modelInternal.getModelDepsManager().getAllImportedLanguagesIds()) {
      LanguageRuntime languageRuntime = LanguageRegistry.getInstance().getLanguage(language.getQualifiedName());
      if (languageRuntime == null) {
        continue;
      }
      DataFlowAspectDescriptor aspect = languageRuntime.getAspect(DataFlowAspectDescriptor.class);
      if (aspect == null) {
        continue;
      }
      for (DataFlowConstructor rule : aspect.getConstructors(myAnalyzerId)) {
        myRules.add(rule);
      }
    }
    for (SNode descendant : SNodeOperations.getNodeDescendants(myNodeToApply, null, false, new SAbstractConcept[]{})) {
      for (DataFlowConstructor rule : getRules(descendant)) {
        rule.performActions(myProgram, descendant);
      }
    }
  }
  private Set<DataFlowConstructor> getRules(SNode node) {
    SConcept concept = node.getConcept();
    Set<DataFlowConstructor> result = new HashSet<DataFlowConstructor>();
    for (DataFlowConstructor rule : myRules) {
      if (rule.isApplicable(node)) {
        result.add(rule);
      }
    }
    return result;
  }
}
