package jetbrains.mps.ide.java.actions;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import javax.swing.Icon;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.Sequence;
import org.jetbrains.annotations.NotNull;
import org.apache.log4j.Priority;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.ide.actions.MPSCommonDataKeys;
import jetbrains.mps.ide.editor.MPSEditorDataKeys;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.project.Project;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class GenerateGettersAndSetters_Action extends BaseAction {
  private static final Icon ICON = null;

  public GenerateGettersAndSetters_Action() {
    super("Getter and Setter", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @Override
  public boolean isDumbAware() {
    return true;
  }

  public boolean isApplicable(AnActionEvent event, final Map<String, Object> _params) {
    SNode classConcept = GenerateGettersAndSetters_Action.this.getClassConcept(_params);
    return classConcept != null && Sequence.fromIterable(GenerateGettersAndSetters_Action.this.getFieldDeclarationsWithoutGetterOrSetter(classConcept, _params)).isNotEmpty();
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      {
        boolean enabled = this.isApplicable(event, _params);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action doUpdate method failed. Action:" + "GenerateGettersAndSetters", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    MapSequence.fromMap(_params).put("node", event.getData(MPSCommonDataKeys.NODE));
    if (MapSequence.fromMap(_params).get("node") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("editorContext", event.getData(MPSEditorDataKeys.EDITOR_CONTEXT));
    if (MapSequence.fromMap(_params).get("editorContext") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      SNode classConcept = GenerateGettersAndSetters_Action.this.getClassConcept(_params);
      SNodeReference[] fields;
      fields = Sequence.fromIterable(GenerateGettersAndSetters_Action.this.getFieldDeclarationsWithoutGetterOrSetter(classConcept, _params)).select(new ISelector<SNode, SNodePointer>() {
        public SNodePointer select(SNode it) {
          return new SNodePointer(it);
        }
      }).toGenericArray(SNodePointer.class);

      SelectFieldsDialog selectFieldsDialog = new SelectFieldsDialog(fields, false, ((EditorContext) MapSequence.fromMap(_params).get("editorContext")).getOperationContext().getProject());
      selectFieldsDialog.setTitle("Select Fields to Generate Getters and Setters");
      selectFieldsDialog.show();

      if (!(selectFieldsDialog.isOK())) {
        return;
      }

      SNodeReference[] selectedFields = Sequence.fromIterable(((Iterable<SNodeReference>) selectFieldsDialog.getSelectedElements())).toGenericArray(SNodeReference.class);

      SNode lastAdded = null;
      Project project = ((EditorContext) MapSequence.fromMap(_params).get("editorContext")).getOperationContext().getProject();
      for (SNodeReference fieldPtr : selectedFields) {
        final SNode field = SNodeOperations.cast(((SNodePointer) fieldPtr).resolve(MPSModuleRepository.getInstance()), "jetbrains.mps.baseLanguage.structure.FieldDeclaration");
        final String getterName = GenerateGettersAndSettersUtil.getFieldGetterName(field, project);
        SNode fieldReference = SNodeFactoryOperations.createNewNode("jetbrains.mps.baseLanguage.structure.VariableReference", null);
        SLinkOperations.setTarget(fieldReference, "variableDeclaration", field, false);
        ListSequence.fromList(SLinkOperations.getTargets(classConcept, "member", true)).addElement(_quotation_createNode_5trf1k_a0a4a41a0(SLinkOperations.getTarget(field, "type", true), fieldReference, getterName));

        final String setterName = GenerateGettersAndSettersUtil.getFieldSetterName(field, project);
        String parameterName = GenerateGettersAndSettersUtil.getParameterNameForField(field, project);
        lastAdded = ListSequence.fromList(SLinkOperations.getTargets(classConcept, "member", true)).addElement(_quotation_createNode_5trf1k_a0a0i0o0a(SNodeOperations.copyNode(fieldReference), SLinkOperations.getTarget(field, "type", true), parameterName, setterName));
      }
      if (lastAdded != null) {
        ((EditorContext) MapSequence.fromMap(_params).get("editorContext")).select(lastAdded);
      }
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action execute method failed. Action:" + "GenerateGettersAndSetters", t);
      }
    }
  }

  private SNode getClassConcept(final Map<String, Object> _params) {
    return SNodeOperations.getAncestor(((SNode) ((SNode) MapSequence.fromMap(_params).get("node"))), "jetbrains.mps.baseLanguage.structure.ClassConcept", true, false);
  }

  private Iterable<SNode> getFieldDeclarationsWithoutGetterOrSetter(final SNode classConcept, final Map<String, Object> _params) {
    final Project project = ((EditorContext) MapSequence.fromMap(_params).get("editorContext")).getOperationContext().getProject();
    return Sequence.fromIterable(BehaviorReflection.invokeNonVirtual((Class<Iterable<SNode>>) ((Class) Object.class), classConcept, "jetbrains.mps.baseLanguage.structure.ClassConcept", "call_fields_5292274854859383272", new Object[]{})).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode field) {
        final String setterName = GenerateGettersAndSettersUtil.getFieldSetterName(field, project);
        final String getterName = GenerateGettersAndSettersUtil.getFieldGetterName(field, project);
        return !(Sequence.fromIterable(BehaviorReflection.invokeNonVirtual((Class<Iterable<SNode>>) ((Class) Object.class), classConcept, "jetbrains.mps.baseLanguage.structure.Classifier", "call_methods_5292274854859311639", new Object[]{})).any(new IWhereFilter<SNode>() {
          public boolean accept(SNode method) {
            return getterName.equals(SPropertyOperations.getString(method, "name")) && ListSequence.fromList(SLinkOperations.getTargets(method, "parameter", true)).isEmpty();
          }
        })) && !(Sequence.fromIterable(BehaviorReflection.invokeNonVirtual((Class<Iterable<SNode>>) ((Class) Object.class), classConcept, "jetbrains.mps.baseLanguage.structure.Classifier", "call_methods_5292274854859311639", new Object[]{})).any(new IWhereFilter<SNode>() {
          public boolean accept(SNode method) {
            return setterName.equals(SPropertyOperations.getString(method, "name")) && (int) ListSequence.fromList(SLinkOperations.getTargets(method, "parameter", true)).count() == 1;
          }
        }));
      }
    });
  }

  protected static Logger LOG = LogManager.getLogger(GenerateGettersAndSetters_Action.class);

  private static SNode _quotation_createNode_5trf1k_a0a4a41a0(Object parameter_1, Object parameter_2, Object parameter_3) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_4 = null;
    SNode quotedNode_5 = null;
    SNode quotedNode_6 = null;
    SNode quotedNode_7 = null;
    SNode quotedNode_8 = null;
    SNode quotedNode_9 = null;
    quotedNode_4 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration", null, null, GlobalScope.getInstance(), false);
    SNodeAccessUtil.setProperty(quotedNode_4, "name", (String) parameter_3);
    quotedNode_5 = (SNode) parameter_1;
    if (quotedNode_5 != null) {
      quotedNode_4.addChild("returnType", HUtil.copyIfNecessary(quotedNode_5));
    }
    quotedNode_6 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.PublicVisibility", null, null, GlobalScope.getInstance(), false);
    quotedNode_4.addChild("visibility", quotedNode_6);
    quotedNode_7 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StatementList", null, null, GlobalScope.getInstance(), false);
    quotedNode_8 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ExpressionStatement", null, null, GlobalScope.getInstance(), false);
    quotedNode_9 = (SNode) parameter_2;
    if (quotedNode_9 != null) {
      quotedNode_8.addChild("expression", HUtil.copyIfNecessary(quotedNode_9));
    }
    quotedNode_7.addChild("statement", quotedNode_8);
    quotedNode_4.addChild("body", quotedNode_7);
    return quotedNode_4;
  }

  private static SNode _quotation_createNode_5trf1k_a0a0i0o0a(Object parameter_1, Object parameter_2, Object parameter_3, Object parameter_4) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_5 = null;
    SNode quotedNode_6 = null;
    SNode quotedNode_7 = null;
    SNode quotedNode_8 = null;
    SNode quotedNode_9 = null;
    SNode quotedNode_10 = null;
    SNode quotedNode_11 = null;
    SNode quotedNode_12 = null;
    SNode quotedNode_13 = null;
    SNode quotedNode_14 = null;
    quotedNode_5 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration", null, null, GlobalScope.getInstance(), false);
    SNodeAccessUtil.setProperty(quotedNode_5, "name", (String) parameter_4);
    quotedNode_6 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.VoidType", null, null, GlobalScope.getInstance(), false);
    quotedNode_5.addChild("returnType", quotedNode_6);
    quotedNode_7 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.PublicVisibility", null, null, GlobalScope.getInstance(), false);
    quotedNode_5.addChild("visibility", quotedNode_7);
    quotedNode_8 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StatementList", null, null, GlobalScope.getInstance(), false);
    quotedNode_10 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ExpressionStatement", null, null, GlobalScope.getInstance(), false);
    quotedNode_12 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.AssignmentExpression", null, null, GlobalScope.getInstance(), false);
    quotedNode_13 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.VariableReference", null, null, GlobalScope.getInstance(), false);
    quotedNode_12.addChild("rValue", quotedNode_13);
    quotedNode_14 = (SNode) parameter_1;
    if (quotedNode_14 != null) {
      quotedNode_12.addChild("lValue", HUtil.copyIfNecessary(quotedNode_14));
    }
    quotedNode_10.addChild("expression", quotedNode_12);
    quotedNode_8.addChild("statement", quotedNode_10);
    quotedNode_5.addChild("body", quotedNode_8);
    quotedNode_9 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ParameterDeclaration", null, null, GlobalScope.getInstance(), false);
    SNodeAccessUtil.setProperty(quotedNode_9, "name", (String) parameter_3);
    quotedNode_11 = (SNode) parameter_2;
    if (quotedNode_11 != null) {
      quotedNode_9.addChild("type", HUtil.copyIfNecessary(quotedNode_11));
    }
    quotedNode_5.addChild("parameter", quotedNode_9);
    SNodeAccessUtil.setReferenceTarget(quotedNode_13, "variableDeclaration", quotedNode_9);
    return quotedNode_5;
  }
}
