package jetbrains.mps.build.startup.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.PropertyMacroContext;
import java.util.List;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.build.startup.behavior.MpsStartupScript_Behavior;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import java.util.ArrayList;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;

public class QueriesGenerated {
  public static Object propertyMacro_GetPropertyValue_8979762117546981953(final IOperationContext operationContext, final PropertyMacroContext _context) {
    String pathString = "";
    String prefix = "$APP_PACKAGE/";
    List<SNode> classPathItemList = SLinkOperations.getTargets(_context.getNode(), "bootClasspath", true);
    for (SNode cpItem : ListSequence.fromList(classPathItemList).cut(1)) {
      pathString += prefix + SPropertyOperations.getString(cpItem, "path").replace("\\", "/") + ":";
    }
    pathString += prefix + SPropertyOperations.getString(ListSequence.fromList(classPathItemList).last(), "path").replace("\\", "/");
    return pathString;
  }

  public static Object propertyMacro_GetPropertyValue_8979762117546982017(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "startupClass");
  }

  public static Object propertyMacro_GetPropertyValue_8979762117546982114(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return MpsStartupScript_Behavior.call_getDefaultVmoptions_5842819808956701267(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_8979762117546982098(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getTemplateValue() + "/" + SPropertyOperations.getString(_context.getNode(), "startupFolder");
  }

  public static Object propertyMacro_GetPropertyValue_1731640411964942144(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getTemplateValue() + SPropertyOperations.getString(_context.getNode(), "startupClass");
  }

  public static Object propertyMacro_GetPropertyValue_1731640411964944768(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getTemplateValue() + MpsStartupScript_Behavior.call_getPathToVmOptionsFile_5842819808956911442(_context.getNode()).replace(MpsStartupScript_Behavior.call_getVmOptionsExtension_5842819808956911479(_context.getNode()), "exe." + MpsStartupScript_Behavior.call_getVmOptionsExtension_5842819808956911479(_context.getNode())).replace("/", "\\");
  }

  public static Object propertyMacro_GetPropertyValue_1731640411964953768(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getTemplateValue() + SPropertyOperations.getString(_context.getNode(), "options");
  }

  public static Object propertyMacro_GetPropertyValue_1731640411965070846(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getTemplateValue() + SPropertyOperations.getString(ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "bootClasspath", true)).first(), "path").replace("/", "\\");
  }

  public static Object propertyMacro_GetPropertyValue_1731640411965084740(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getTemplateValue() + SPropertyOperations.getString(_context.getNode(), "path").replace("/", "\\");
  }

  public static Object propertyMacro_GetPropertyValue_1731640411965091586(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getTemplateValue() + SPropertyOperations.getString(_context.getNode(), "startupFolder");
  }

  public static Object propertyMacro_GetPropertyValue_1731640411964801466(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name") + ".bat";
  }

  public static Object propertyMacro_GetPropertyValue_1731640411967557625(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name") + "." + MpsStartupScript_Behavior.call_getVmOptionsExtension_5842819808956911479(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_4487788881657620080(final IOperationContext operationContext, final PropertyMacroContext _context) {
    String startupDir = SPropertyOperations.getString(_context.getNode(), "startupFolder");
    if (startupDir.endsWith("/")) {
      startupDir = startupDir.substring(0, startupDir.length() - 1);
    }
    String[] path = startupDir.split("/");
    String pathFromStartupDir = "..";
    for (int i = 0; i < path.length - 1; i++) {
      pathFromStartupDir += "/..";
    }
    return _context.getTemplateValue() + pathFromStartupDir;
  }

  public static Object propertyMacro_GetPropertyValue_4487788881657707878(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getTemplateValue() + SPropertyOperations.getString(_context.getNode(), "startupClass");
  }

  public static Object propertyMacro_GetPropertyValue_4487788881657806288(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getTemplateValue() + "\"" + SPropertyOperations.getString(_context.getNode(), "options") + "\"";
  }

  public static Object propertyMacro_GetPropertyValue_4487788881657840185(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getTemplateValue() + SPropertyOperations.getString(_context.getNode(), "path");
  }

  public static Iterable sourceNodesQuery_1731640411964947374(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return MpsStartupScript_Behavior.call_getCommentedOptions_5842819808956911345(_context.getNode());
  }

  public static Iterable sourceNodesQuery_1731640411965079018(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "bootClasspath", true)).skip(1);
  }

  public static Iterable sourceNodesQuery_1731640411967575305(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    String[] options = MpsStartupScript_Behavior.call_getDefaultVmoptions_5842819808956701267(_context.getNode()).split("\\s");
    List<SNode> lines = ListSequence.fromList(new ArrayList<SNode>());
    for (String option : options) {
      if ((option == null || option.length() == 0)) {
        continue;
      }

      ListSequence.fromList(lines).addElement(_quotation_createNode_x583g4_a0a2a2a81(option));
    }
    return lines;
  }

  public static Iterable sourceNodesQuery_4487788881657789666(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return MpsStartupScript_Behavior.call_getCommentedOptions_5842819808956911345(_context.getNode());
  }

  public static Iterable sourceNodesQuery_4487788881657835967(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "bootClasspath", true);
  }

  private static SNode _quotation_createNode_x583g4_a0a2a2a81(Object parameter_1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_2 = null;
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.build.startup.structure.TextLine", null, null, GlobalScope.getInstance(), false);
    SNodeAccessUtil.setProperty(quotedNode_2, "text", (String) parameter_1);
    return quotedNode_2;
  }
}
