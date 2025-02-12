package jetbrains.mps.debugger.java.runtime.evaluation.container;

/*Generated by MPS */

import jetbrains.mps.project.Project;
import org.jetbrains.mps.openapi.module.SModuleReference;
import org.jetbrains.mps.openapi.model.SModelReference;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.debugger.java.runtime.state.DebugSession;
import jetbrains.mps.debugger.java.api.state.JavaUiState;
import java.util.List;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.module.ModelAccess;
import org.jetbrains.mps.openapi.module.SModule;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.smodel.tempmodel.TemporaryModels;
import jetbrains.mps.smodel.tempmodel.TempModuleOptions;
import jetbrains.mps.project.ModuleContext;
import com.intellij.openapi.application.ApplicationManager;
import jetbrains.mps.debugger.java.api.evaluation.EvaluationException;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.classloading.ClassLoaderManager;
import jetbrains.mps.smodel.ModuleRepositoryFacade;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.debugger.java.api.evaluation.Evaluator;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.util.Computable;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelOperations;
import jetbrains.mps.smodel.SModelInternal;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import org.jetbrains.mps.openapi.model.SReference;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class EvaluationContainer implements IEvaluationContainer {
  protected final Project myProject;
  protected final SModuleReference myContainerModule;
  protected volatile SModelReference myContainerModel;
  protected volatile SNodeReference myNode;
  protected final MPSModuleRepository myDebuggerRepository = MPSModuleRepository.getInstance();
  private volatile IOperationContext myContext;

  protected final DebugSession myDebugSession;
  protected volatile JavaUiState myUiState;

  private final List<_FunctionTypes._void_P1_E0<? super SNode>> myGenerationListeners = ListSequence.fromList(new ArrayList<_FunctionTypes._void_P1_E0<? super SNode>>());


  public EvaluationContainer(Project project, DebugSession session, @NotNull SModuleReference containerModule, final List<SNodeReference> nodesToImport, final _FunctionTypes._void_P1_E0<? super IEvaluationContainer> onNodeSetUp) {
    myProject = project;
    myDebugSession = session;
    myContainerModule = containerModule;
    myUiState = myDebugSession.getUiState();
    final ModelAccess modelAccess = project.getRepository().getModelAccess();
    modelAccess.runWriteAction(new Runnable() {
      public void run() {
        SModule containerModule = myContainerModule.resolve(myDebuggerRepository);
        SModel descriptor = TemporaryModels.getInstance().create(false, TempModuleOptions.forExistingModule(containerModule));
        myContainerModel = descriptor.getReference();
        myContext = new ModuleContext(containerModule, myProject);
      }
    });

    ApplicationManager.getApplication().invokeLater(new Runnable() {
      public void run() {
        modelAccess.executeCommand(new Runnable() {
          public void run() {
            setUpNode(nodesToImport);
          }
        });
        onNodeSetUp.invoke(EvaluationContainer.this);
      }
    });
  }



  @Override
  public Class generateClass() throws EvaluationException {
    return GeneratorUtil.generateAndLoadEvaluatorClass(myProject, SModelRepository.getInstance().getModelDescriptor(myContainerModel), Properties.EVALUATOR_NAME, getContext(), Properties.IS_DEVELOPER_MODE, new TransformingGenerationHandler(false, true, myGenerationListeners), ClassLoaderManager.getInstance().getClassLoader(ModuleRepositoryFacade.getInstance().getModule(PersistenceFacade.getInstance().createModuleReference("cf8c9de5-1b4a-4dc8-8e6d-847159af31dd(jetbrains.mps.debugger.java.api)"))));
  }

  @Override
  public void addGenerationListener(_FunctionTypes._void_P1_E0<? super SNode> listener) {
    ListSequence.fromList(myGenerationListeners).addElement(listener);
  }

  @Override
  public Evaluator createEvaluatorInstance(Class clazz) throws EvaluationException {
    return GeneratorUtil.createInstance(clazz, new Class[]{JavaUiState.class}, new Object[]{myUiState});
  }



  @Override
  public IEvaluationContainer copy(boolean isWatch, _FunctionTypes._void_P1_E0<? super IEvaluationContainer> onNodeSetUp) {
    final SNodeReference reference = myNode;
    return new EvaluationContainer(myProject, myDebugSession, myContainerModule, ListSequence.fromList(new ArrayList<SNodeReference>()), onNodeSetUp) {
      @Override
      protected SNode createEvaluatorNode() {
        return (SNode) CopyUtil.copyAndPreserveId(reference.resolve(myDebuggerRepository), true);
      }
    };
  }



  @Override
  public String getPresentation() {
    return jetbrains.mps.smodel.ModelAccess.instance().runReadAction(new Computable<String>() {
      @Override
      public String compute() {
        return PresentationUtil.getPresentation(BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), SNodeOperations.cast(getNode(), "jetbrains.mps.debugger.java.evaluation.structure.IEvaluatorConcept"), "virtual_getCode_317191294093624551", new Object[]{}));
      }
    });
  }

  @Override
  public IOperationContext getContext() {
    return myContext;
  }

  @Override
  public SNode getNode() {
    if (myNode == null) {
      return null;
    }
    return myNode.resolve(myDebuggerRepository);
  }



  @Override
  public void updateState() {
    myUiState = myDebugSession.getUiState();
  }



  protected void setUpNode(List<SNodeReference> nodesToImport) {
    // wanted to use resolve method here, but it was not implemented:( 
    SModel containerModel = myContainerModel.resolve(MPSModuleRepository.getInstance());

    SNode evaluatorNode = createEvaluatorNode();
    containerModel.addRootNode(evaluatorNode);
    myNode = evaluatorNode.getReference();

    // todo: variables 
    new EvaluationContainer.MyBaseLanguagesImportHelper().tryToImport(BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), evaluatorNode, "virtual_getCode_317191294093624551", new Object[]{}), nodesToImport);

    SModelOperations.validateLanguagesAndImports(containerModel, true, true);
    ((SModelInternal) containerModel).addLanguage(PersistenceFacade.getInstance().createModuleReference("7da4580f-9d75-4603-8162-51a896d78375(jetbrains.mps.debugger.java.evaluation)"));
    ((SModelInternal) containerModel).addLanguage(PersistenceFacade.getInstance().createModuleReference("80208897-4572-437d-b50e-8f050cba9566(jetbrains.mps.debugger.java.privateMembers)"));
  }

  protected SNode createEvaluatorNode() {
    SNode evaluator = SNodeFactoryOperations.createNewNode("jetbrains.mps.debugger.java.evaluation.structure.Evaluator", null);
    AttributeOperations.createAndSetAttrbiute(SLinkOperations.getTarget(evaluator, "code", true), new IAttributeDescriptor.NodeAttribute("jetbrains.mps.debugger.java.evaluation.structure.ToEvaluateAnnotation"), "jetbrains.mps.debugger.java.evaluation.structure.ToEvaluateAnnotation");
    return evaluator;
  }

  private class MyBaseLanguagesImportHelper extends BaseLanguagesImportHelper {
    @Override
    public SNode findVariable(SReference variableReference) {
      return null;
    }

    @Override
    public SNode createVariableReference(SNode variable) {
      return createInternalVariableReference_jbng3m_a0a1cb(variable.getName());
    }
  }

  private static SNode createInternalVariableReference_jbng3m_a0a1cb(Object p0) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode n1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguageInternal.structure.InternalVariableReference", null, GlobalScope.getInstance(), false);
    {
      n1.setProperty("name", (String) p0);
      SNode n2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
      n2.setReference("classifier", jetbrains.mps.smodel.SReference.create("classifier", n2, facade.createModelReference("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(JDK/java.lang@java_stub)"), facade.createNodeId("~Object")));
      n1.addChild("type", n2);
    }
    return n1;
  }
}
