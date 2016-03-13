<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:00000000-0000-4000-0000-011c895903a2(jetbrains.mps.lang.test.runtime)">
  <persistence version="9" />
  <languages>
    <use id="774bf8a0-62e5-41e1-af63-f4812e60e48b" name="jetbrains.mps.baseLanguage.checkedDots" version="0" />
    <use id="fd392034-7849-419d-9071-12563d152375" name="jetbrains.mps.baseLanguage.closures" version="0" />
    <use id="760a0a8c-eabb-4521-8bfd-65db761a9ba3" name="jetbrains.mps.baseLanguage.logging" version="0" />
    <use id="f61473f9-130f-42f6-b98d-6c438812c2f6" name="jetbrains.mps.baseLanguage.unitTest" version="0" />
    <use id="83888646-71ce-4f1c-9c53-c54016f6ad4f" name="jetbrains.mps.baseLanguage.collections" version="0" />
    <use id="f2801650-65d5-424e-bb1b-463a8781b786" name="jetbrains.mps.baseLanguage.javadoc" version="2" />
    <use id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel" version="2" />
    <use id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage" version="4" />
  </languages>
  <imports>
    <import index="tp5g" ref="r:00000000-0000-4000-0000-011c89590388(jetbrains.mps.lang.test.structure)" />
    <import index="tpee" ref="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" />
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" />
    <import index="wyt6" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang()" />
    <import index="dxuu" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:javax.swing()" />
    <import index="33ny" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.util()" />
    <import index="t6h5" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang.reflect()" />
    <import index="hyam" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.awt.event()" />
    <import index="z60i" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.awt()" />
    <import index="f4zo" ref="1ed103c3-3aa6-49b7-9c21-6765ee11f224/java:jetbrains.mps.openapi.editor.cells()" />
    <import index="kt01" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.awt.datatransfer()" />
    <import index="guwi" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.io()" />
    <import index="wsw7" ref="r:ba41e9c6-15ca-4a47-95f2-6a81c2318547(jetbrains.mps.checkers)" />
    <import index="k8ev" ref="r:f39afe13-666a-48f2-9d7c-2f9366f78fe5(jetbrains.mps.typesystemEngine.checker)" />
    <import index="fnd7" ref="r:5217bde7-686e-45b2-a47f-62b7d63f0fe9(jetbrains.mps.lang.test.util)" />
    <import index="aplb" ref="r:a1d8bbbf-d4f0-431f-8dcd-a6badc777315(jetbrains.mps.lang.dataFlow)" />
    <import index="k3nr" ref="1ed103c3-3aa6-49b7-9c21-6765ee11f224/java:jetbrains.mps.ide.editor()" />
    <import index="exr9" ref="1ed103c3-3aa6-49b7-9c21-6765ee11f224/java:jetbrains.mps.nodeEditor()" />
    <import index="cj4x" ref="1ed103c3-3aa6-49b7-9c21-6765ee11f224/java:jetbrains.mps.openapi.editor()" />
    <import index="g51k" ref="1ed103c3-3aa6-49b7-9c21-6765ee11f224/java:jetbrains.mps.nodeEditor.cells()" />
    <import index="w1kc" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel()" />
    <import index="mhbf" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.model()" />
    <import index="fyhk" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps()" />
    <import index="lwvz" ref="1ed103c3-3aa6-49b7-9c21-6765ee11f224/java:jetbrains.mps.openapi.editor.selection()" />
    <import index="z1c3" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.project()" />
    <import index="iwsx" ref="498d89d2-c2e9-11e2-ad49-6cf049e62fe5/java:com.intellij.openapi.fileEditor()" />
    <import index="18ew" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.util()" />
    <import index="u78q" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.typesystem.inference()" />
    <import index="ghoz" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.newTypesystem()" />
    <import index="tqvn" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel.tempmodel()" />
    <import index="oi6x" ref="742f6602-5a2f-4313-aa6e-ae1cd4ffdc61/java:jetbrains.mps.workbench.nodesFs()" />
    <import index="2gg1" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.errors()" />
    <import index="lui2" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.module()" />
    <import index="91lp" ref="1ed103c3-3aa6-49b7-9c21-6765ee11f224/java:jetbrains.mps.intentions()" />
    <import index="1fjm" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.lang.dataFlow.framework()" />
    <import index="dush" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.persistence()" />
    <import index="m77x" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.newTypesystem.test()" />
    <import index="b8lf" ref="1ed103c3-3aa6-49b7-9c21-6765ee11f224/java:jetbrains.mps.nodeEditor.selection()" />
    <import index="mhfm" ref="3f233e7f-b8a6-46d2-a57f-795d56775243/java:org.jetbrains.annotations()" />
    <import index="80j5" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.generator.impl()" />
    <import index="cm63" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel.behaviour()" />
    <import index="ovrg" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.newTypesystem.operation()" />
    <import index="btn2" ref="498d89d2-c2e9-11e2-ad49-6cf049e62fe5/java:com.intellij.ide.impl()" />
    <import index="qkt" ref="498d89d2-c2e9-11e2-ad49-6cf049e62fe5/java:com.intellij.openapi.actionSystem()" />
    <import index="ddhc" ref="498d89d2-c2e9-11e2-ad49-6cf049e62fe5/java:com.intellij.ide()" />
    <import index="autt" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.lang.dataFlow.framework.analyzers()" />
    <import index="7bx7" ref="742f6602-5a2f-4313-aa6e-ae1cd4ffdc61/java:jetbrains.mps.workbench.action()" />
    <import index="dau9" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.lang.dataFlow.framework.instructions()" />
    <import index="tmra" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.newTypesystem.state()" />
    <import index="xgff" ref="498d89d2-c2e9-11e2-ad49-6cf049e62fe5/java:com.intellij.openapi.command.impl(MPS.IDEA/)" />
    <import index="54q7" ref="498d89d2-c2e9-11e2-ad49-6cf049e62fe5/java:com.intellij.openapi.command.undo(MPS.IDEA/)" />
    <import index="alof" ref="742f6602-5a2f-4313-aa6e-ae1cd4ffdc61/java:jetbrains.mps.ide.project(MPS.Platform/)" />
    <import index="j8aq" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.module(MPS.Core/)" />
    <import index="gp7a" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.project.dependency(MPS.Core/)" />
    <import index="6if8" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.project.validation(MPS.Core/)" />
    <import index="cky9" ref="r:1d4e7c57-c144-4228-9dec-8180ddf9f0ee(jetbrains.mps.tool.environment)" />
    <import index="79ha" ref="r:2876f1ee-0b45-4db5-8c09-0682cdee5c67(jetbrains.mps.tool.environment)" />
    <import index="v9gs" ref="r:a139668a-5a0e-46e2-a802-102190e497e5(jetbrains.mps.core.tool.environment.util)" />
    <import index="y5e1" ref="r:4464540a-9650-433f-b716-ed95bbac5a69(jetbrains.mps.lang.test.matcher)" />
    <import index="4o98" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.core.platform(MPS.Core/)" />
    <import index="3a50" ref="742f6602-5a2f-4313-aa6e-ae1cd4ffdc61/java:jetbrains.mps.ide(MPS.Platform/)" />
    <import index="j9co" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel.event(MPS.Core/)" />
    <import index="q7tw" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:org.apache.log4j(MPS.Core/)" />
    <import index="zu0" ref="920eaa0e-ecca-46bc-bee7-4e5c59213dd6/java:jetbrains.mps.testbench.util(Testbench/)" />
    <import index="l9ag" ref="920eaa0e-ecca-46bc-bee7-4e5c59213dd6/java:jetbrains.mps.testbench.junit(Testbench/)" />
    <import index="zyr2" ref="1ed103c3-3aa6-49b7-9c21-6765ee11f224/java:jetbrains.mps.nodeEditor.inspector(MPS.Editor/)" />
    <import index="tp5o" ref="r:00000000-0000-4000-0000-011c89590380(jetbrains.mps.lang.test.behavior)" implicit="true" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1080223426719" name="jetbrains.mps.baseLanguage.structure.OrExpression" flags="nn" index="22lmx$" />
      <concept id="1082485599095" name="jetbrains.mps.baseLanguage.structure.BlockStatement" flags="nn" index="9aQIb">
        <child id="1082485599096" name="statements" index="9aQI4" />
      </concept>
      <concept id="1215693861676" name="jetbrains.mps.baseLanguage.structure.BaseAssignmentExpression" flags="nn" index="d038R">
        <child id="1068498886297" name="rValue" index="37vLTx" />
        <child id="1068498886295" name="lValue" index="37vLTJ" />
      </concept>
      <concept id="1153417849900" name="jetbrains.mps.baseLanguage.structure.GreaterThanOrEqualsExpression" flags="nn" index="2d3UOw" />
      <concept id="1153422305557" name="jetbrains.mps.baseLanguage.structure.LessThanOrEqualsExpression" flags="nn" index="2dkUwp" />
      <concept id="4836112446988635817" name="jetbrains.mps.baseLanguage.structure.UndefinedType" flags="in" index="2jxLKc" />
      <concept id="1202948039474" name="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" flags="nn" index="liA8E" />
      <concept id="1465982738277781862" name="jetbrains.mps.baseLanguage.structure.PlaceholderMember" flags="ng" index="2tJIrI" />
      <concept id="1076505808687" name="jetbrains.mps.baseLanguage.structure.WhileStatement" flags="nn" index="2$JKZl">
        <child id="1076505808688" name="condition" index="2$JKZa" />
      </concept>
      <concept id="1173175405605" name="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" flags="nn" index="AH0OO">
        <child id="1173175577737" name="index" index="AHEQo" />
        <child id="1173175590490" name="array" index="AHHXb" />
      </concept>
      <concept id="1188207840427" name="jetbrains.mps.baseLanguage.structure.AnnotationInstance" flags="nn" index="2AHcQZ">
        <reference id="1188208074048" name="annotation" index="2AI5Lk" />
      </concept>
      <concept id="1188208481402" name="jetbrains.mps.baseLanguage.structure.HasAnnotation" flags="ng" index="2AJDlI">
        <child id="1188208488637" name="annotation" index="2AJF6D" />
      </concept>
      <concept id="1095950406618" name="jetbrains.mps.baseLanguage.structure.DivExpression" flags="nn" index="FJ1c_" />
      <concept id="1153952380246" name="jetbrains.mps.baseLanguage.structure.TryStatement" flags="nn" index="2GUZhq">
        <child id="1153952416686" name="body" index="2GV8ay" />
        <child id="1153952429843" name="finallyBody" index="2GVbov" />
      </concept>
      <concept id="2820489544401957797" name="jetbrains.mps.baseLanguage.structure.DefaultClassCreator" flags="nn" index="HV5vD">
        <reference id="2820489544401957798" name="classifier" index="HV5vE" />
        <child id="2820489544402271667" name="typeParameter" index="HU9BZ" />
      </concept>
      <concept id="1224848483129" name="jetbrains.mps.baseLanguage.structure.IBLDeprecatable" flags="ng" index="IEa8$">
        <property id="1224848525476" name="isDeprecated" index="IEkAT" />
      </concept>
      <concept id="1154032098014" name="jetbrains.mps.baseLanguage.structure.AbstractLoopStatement" flags="nn" index="2LF5Ji">
        <child id="1154032183016" name="body" index="2LFqv$" />
      </concept>
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
      </concept>
      <concept id="1197029447546" name="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" flags="nn" index="2OwXpG">
        <reference id="1197029500499" name="fieldDeclaration" index="2Oxat5" />
      </concept>
      <concept id="1083260308424" name="jetbrains.mps.baseLanguage.structure.EnumConstantReference" flags="nn" index="Rm8GO">
        <reference id="1083260308426" name="enumConstantDeclaration" index="Rm8GQ" />
        <reference id="1144432896254" name="enumClass" index="1Px2BO" />
      </concept>
      <concept id="1164879751025" name="jetbrains.mps.baseLanguage.structure.TryCatchStatement" flags="nn" index="SfApY">
        <child id="1164879758292" name="body" index="SfCbr" />
        <child id="1164903496223" name="catchClause" index="TEbGg" />
      </concept>
      <concept id="1145552977093" name="jetbrains.mps.baseLanguage.structure.GenericNewExpression" flags="nn" index="2ShNRf">
        <child id="1145553007750" name="creator" index="2ShVmc" />
      </concept>
      <concept id="1164903280175" name="jetbrains.mps.baseLanguage.structure.CatchClause" flags="nn" index="TDmWw">
        <child id="1164903359218" name="catchBody" index="TDEfX" />
        <child id="1164903359217" name="throwable" index="TDEfY" />
      </concept>
      <concept id="1070462154015" name="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration" flags="ig" index="Wx3nA">
        <property id="6468716278899126575" name="isVolatile" index="2dlcS1" />
        <property id="6468716278899125786" name="isTransient" index="2dld4O" />
      </concept>
      <concept id="1070475354124" name="jetbrains.mps.baseLanguage.structure.ThisExpression" flags="nn" index="Xjq3P">
        <reference id="1182955020723" name="classConcept" index="1HBi2w" />
      </concept>
      <concept id="1070475587102" name="jetbrains.mps.baseLanguage.structure.SuperConstructorInvocation" flags="nn" index="XkiVB" />
      <concept id="1070475926800" name="jetbrains.mps.baseLanguage.structure.StringLiteral" flags="nn" index="Xl_RD">
        <property id="1070475926801" name="value" index="Xl_RC" />
      </concept>
      <concept id="1182160077978" name="jetbrains.mps.baseLanguage.structure.AnonymousClassCreator" flags="nn" index="YeOm9">
        <child id="1182160096073" name="cls" index="YeSDq" />
      </concept>
      <concept id="1081236700938" name="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" flags="ig" index="2YIFZL" />
      <concept id="1081236700937" name="jetbrains.mps.baseLanguage.structure.StaticMethodCall" flags="nn" index="2YIFZM">
        <reference id="1144433194310" name="classConcept" index="1Pybhc" />
      </concept>
      <concept id="1164991038168" name="jetbrains.mps.baseLanguage.structure.ThrowStatement" flags="nn" index="YS8fn">
        <child id="1164991057263" name="throwable" index="YScLw" />
      </concept>
      <concept id="1081256982272" name="jetbrains.mps.baseLanguage.structure.InstanceOfExpression" flags="nn" index="2ZW3vV">
        <child id="1081256993305" name="classType" index="2ZW6by" />
        <child id="1081256993304" name="leftExpression" index="2ZW6bz" />
      </concept>
      <concept id="1070533707846" name="jetbrains.mps.baseLanguage.structure.StaticFieldReference" flags="nn" index="10M0yZ">
        <reference id="1144433057691" name="classifier" index="1PxDUh" />
      </concept>
      <concept id="1070534058343" name="jetbrains.mps.baseLanguage.structure.NullLiteral" flags="nn" index="10Nm6u" />
      <concept id="1070534370425" name="jetbrains.mps.baseLanguage.structure.IntegerType" flags="in" index="10Oyi0" />
      <concept id="1070534555686" name="jetbrains.mps.baseLanguage.structure.CharType" flags="in" index="10Pfzv" />
      <concept id="1070534644030" name="jetbrains.mps.baseLanguage.structure.BooleanType" flags="in" index="10P_77" />
      <concept id="1070534760951" name="jetbrains.mps.baseLanguage.structure.ArrayType" flags="in" index="10Q1$e">
        <child id="1070534760952" name="componentType" index="10Q1$1" />
      </concept>
      <concept id="1070534934090" name="jetbrains.mps.baseLanguage.structure.CastExpression" flags="nn" index="10QFUN">
        <child id="1070534934091" name="type" index="10QFUM" />
        <child id="1070534934092" name="expression" index="10QFUP" />
      </concept>
      <concept id="1068390468200" name="jetbrains.mps.baseLanguage.structure.FieldDeclaration" flags="ig" index="312cEg">
        <property id="8606350594693632173" name="isTransient" index="eg7rD" />
        <property id="1240249534625" name="isVolatile" index="34CwA1" />
      </concept>
      <concept id="1068390468198" name="jetbrains.mps.baseLanguage.structure.ClassConcept" flags="ig" index="312cEu">
        <property id="1075300953594" name="abstractClass" index="1sVAO0" />
        <property id="1221565133444" name="isFinal" index="1EXbeo" />
        <child id="1095933932569" name="implementedInterface" index="EKbjA" />
        <child id="1165602531693" name="superclass" index="1zkMxy" />
      </concept>
      <concept id="1068431474542" name="jetbrains.mps.baseLanguage.structure.VariableDeclaration" flags="ng" index="33uBYm">
        <property id="1176718929932" name="isFinal" index="3TUv4t" />
        <child id="1068431790190" name="initializer" index="33vP2m" />
      </concept>
      <concept id="1109279763828" name="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration" flags="ng" index="16euLQ" />
      <concept id="1109279851642" name="jetbrains.mps.baseLanguage.structure.GenericDeclaration" flags="ng" index="16eOlS">
        <child id="1109279881614" name="typeVariableDeclaration" index="16eVyc" />
      </concept>
      <concept id="1109283449304" name="jetbrains.mps.baseLanguage.structure.TypeVariableReference" flags="in" index="16syzq">
        <reference id="1109283546497" name="typeVariableDeclaration" index="16sUi3" />
      </concept>
      <concept id="1068498886296" name="jetbrains.mps.baseLanguage.structure.VariableReference" flags="nn" index="37vLTw">
        <reference id="1068581517664" name="variableDeclaration" index="3cqZAo" />
      </concept>
      <concept id="1068498886292" name="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" flags="ir" index="37vLTG" />
      <concept id="1068498886294" name="jetbrains.mps.baseLanguage.structure.AssignmentExpression" flags="nn" index="37vLTI" />
      <concept id="1225271177708" name="jetbrains.mps.baseLanguage.structure.StringType" flags="in" index="17QB3L" />
      <concept id="1225271369338" name="jetbrains.mps.baseLanguage.structure.IsEmptyOperation" flags="nn" index="17RlXB" />
      <concept id="1225271408483" name="jetbrains.mps.baseLanguage.structure.IsNotEmptyOperation" flags="nn" index="17RvpY" />
      <concept id="4972933694980447171" name="jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration" flags="ng" index="19Szcq">
        <child id="5680397130376446158" name="type" index="1tU5fm" />
      </concept>
      <concept id="1068580123132" name="jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration" flags="ng" index="3clF44">
        <property id="4276006055363816570" name="isSynchronized" index="od$2w" />
        <property id="1181808852946" name="isFinal" index="DiZV1" />
        <child id="1164879685961" name="throwsItem" index="Sfmx6" />
        <child id="1068580123133" name="returnType" index="3clF45" />
        <child id="1068580123134" name="parameter" index="3clF46" />
        <child id="1068580123135" name="body" index="3clF47" />
      </concept>
      <concept id="1068580123165" name="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" flags="ig" index="3clFb_">
        <property id="1178608670077" name="isAbstract" index="1EzhhJ" />
      </concept>
      <concept id="1068580123152" name="jetbrains.mps.baseLanguage.structure.EqualsExpression" flags="nn" index="3clFbC" />
      <concept id="1068580123155" name="jetbrains.mps.baseLanguage.structure.ExpressionStatement" flags="nn" index="3clFbF">
        <child id="1068580123156" name="expression" index="3clFbG" />
      </concept>
      <concept id="1068580123157" name="jetbrains.mps.baseLanguage.structure.Statement" flags="nn" index="3clFbH" />
      <concept id="1068580123159" name="jetbrains.mps.baseLanguage.structure.IfStatement" flags="nn" index="3clFbJ">
        <child id="1082485599094" name="ifFalseStatement" index="9aQIa" />
        <child id="1068580123160" name="condition" index="3clFbw" />
        <child id="1068580123161" name="ifTrue" index="3clFbx" />
        <child id="1206060520071" name="elsifClauses" index="3eNLev" />
      </concept>
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
      <concept id="1068580123137" name="jetbrains.mps.baseLanguage.structure.BooleanConstant" flags="nn" index="3clFbT">
        <property id="1068580123138" name="value" index="3clFbU" />
      </concept>
      <concept id="1068580123140" name="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" flags="ig" index="3clFbW" />
      <concept id="1068580320020" name="jetbrains.mps.baseLanguage.structure.IntegerConstant" flags="nn" index="3cmrfG">
        <property id="1068580320021" name="value" index="3cmrfH" />
      </concept>
      <concept id="1068581242875" name="jetbrains.mps.baseLanguage.structure.PlusExpression" flags="nn" index="3cpWs3" />
      <concept id="1068581242878" name="jetbrains.mps.baseLanguage.structure.ReturnStatement" flags="nn" index="3cpWs6">
        <child id="1068581517676" name="expression" index="3cqZAk" />
      </concept>
      <concept id="1068581242864" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" flags="nn" index="3cpWs8">
        <child id="1068581242865" name="localVariableDeclaration" index="3cpWs9" />
      </concept>
      <concept id="1068581242869" name="jetbrains.mps.baseLanguage.structure.MinusExpression" flags="nn" index="3cpWsd" />
      <concept id="1068581242863" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" flags="nr" index="3cpWsn" />
      <concept id="1068581517677" name="jetbrains.mps.baseLanguage.structure.VoidType" flags="in" index="3cqZAl" />
      <concept id="1206060495898" name="jetbrains.mps.baseLanguage.structure.ElsifClause" flags="ng" index="3eNFk2">
        <child id="1206060619838" name="condition" index="3eO9$A" />
        <child id="1206060644605" name="statementList" index="3eOfB_" />
      </concept>
      <concept id="1079359253375" name="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" flags="nn" index="1eOMI4">
        <child id="1079359253376" name="expression" index="1eOMHV" />
      </concept>
      <concept id="1081506762703" name="jetbrains.mps.baseLanguage.structure.GreaterThanExpression" flags="nn" index="3eOSWO" />
      <concept id="1081516740877" name="jetbrains.mps.baseLanguage.structure.NotExpression" flags="nn" index="3fqX7Q">
        <child id="1081516765348" name="expression" index="3fr31v" />
      </concept>
      <concept id="1154542696413" name="jetbrains.mps.baseLanguage.structure.ArrayCreatorWithInitializer" flags="nn" index="3g6Rrh">
        <child id="1154542793668" name="componentType" index="3g7fb8" />
        <child id="1154542803372" name="initValue" index="3g7hyw" />
      </concept>
      <concept id="1160998861373" name="jetbrains.mps.baseLanguage.structure.AssertStatement" flags="nn" index="1gVbGN">
        <child id="1160998896846" name="condition" index="1gVkn0" />
        <child id="1160998916832" name="message" index="1gVpfI" />
      </concept>
      <concept id="1204053956946" name="jetbrains.mps.baseLanguage.structure.IMethodCall" flags="ng" index="1ndlxa">
        <reference id="1068499141037" name="baseMethodDeclaration" index="37wK5l" />
        <child id="1068499141038" name="actualArgument" index="37wK5m" />
      </concept>
      <concept id="1073063089578" name="jetbrains.mps.baseLanguage.structure.SuperMethodCall" flags="nn" index="3nyPlj" />
      <concept id="1212685548494" name="jetbrains.mps.baseLanguage.structure.ClassCreator" flags="nn" index="1pGfFk" />
      <concept id="1107461130800" name="jetbrains.mps.baseLanguage.structure.Classifier" flags="ng" index="3pOWGL">
        <property id="521412098689998745" name="nonStatic" index="2bfB8j" />
        <child id="5375687026011219971" name="member" index="jymVt" unordered="true" />
      </concept>
      <concept id="1171903607971" name="jetbrains.mps.baseLanguage.structure.WildCardType" flags="in" index="3qTvmN" />
      <concept id="7812454656619025416" name="jetbrains.mps.baseLanguage.structure.MethodDeclaration" flags="ng" index="1rXfSm">
        <property id="8355037393041754995" name="isNative" index="2aFKle" />
      </concept>
      <concept id="7812454656619025412" name="jetbrains.mps.baseLanguage.structure.LocalMethodCall" flags="nn" index="1rXfSq" />
      <concept id="1107535904670" name="jetbrains.mps.baseLanguage.structure.ClassifierType" flags="in" index="3uibUv">
        <reference id="1107535924139" name="classifier" index="3uigEE" />
        <child id="1109201940907" name="parameter" index="11_B2D" />
      </concept>
      <concept id="1081773326031" name="jetbrains.mps.baseLanguage.structure.BinaryOperation" flags="nn" index="3uHJSO">
        <child id="1081773367579" name="rightExpression" index="3uHU7w" />
        <child id="1081773367580" name="leftExpression" index="3uHU7B" />
      </concept>
      <concept id="1073239437375" name="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" flags="nn" index="3y3z36" />
      <concept id="1081855346303" name="jetbrains.mps.baseLanguage.structure.BreakStatement" flags="nn" index="3zACq4" />
      <concept id="1184950988562" name="jetbrains.mps.baseLanguage.structure.ArrayCreator" flags="nn" index="3$_iS1">
        <child id="1184951007469" name="componentType" index="3$_nBY" />
        <child id="1184952969026" name="dimensionExpression" index="3$GQph" />
      </concept>
      <concept id="1184952934362" name="jetbrains.mps.baseLanguage.structure.DimensionExpression" flags="nn" index="3$GHV9">
        <child id="1184953288404" name="expression" index="3$I4v7" />
      </concept>
      <concept id="1178549954367" name="jetbrains.mps.baseLanguage.structure.IVisible" flags="ng" index="1B3ioH">
        <child id="1178549979242" name="visibility" index="1B3o_S" />
      </concept>
      <concept id="1144226303539" name="jetbrains.mps.baseLanguage.structure.ForeachStatement" flags="nn" index="1DcWWT">
        <child id="1144226360166" name="iterable" index="1DdaDG" />
      </concept>
      <concept id="1144230876926" name="jetbrains.mps.baseLanguage.structure.AbstractForStatement" flags="nn" index="1DupvO">
        <child id="1144230900587" name="variable" index="1Duv9x" />
      </concept>
      <concept id="1107796713796" name="jetbrains.mps.baseLanguage.structure.Interface" flags="ig" index="3HP615" />
      <concept id="1082113931046" name="jetbrains.mps.baseLanguage.structure.ContinueStatement" flags="nn" index="3N13vt" />
      <concept id="1221737317277" name="jetbrains.mps.baseLanguage.structure.StaticInitializer" flags="lg" index="1Pe0a1">
        <child id="1221737317278" name="statementList" index="1Pe0a2" />
      </concept>
      <concept id="6329021646629104957" name="jetbrains.mps.baseLanguage.structure.TextCommentPart" flags="nn" index="3SKdUq">
        <property id="6329021646629104958" name="text" index="3SKdUp" />
      </concept>
      <concept id="6329021646629104954" name="jetbrains.mps.baseLanguage.structure.SingleLineComment" flags="nn" index="3SKdUt">
        <child id="6329021646629175155" name="commentPart" index="3SKWNk" />
      </concept>
      <concept id="1146644602865" name="jetbrains.mps.baseLanguage.structure.PublicVisibility" flags="nn" index="3Tm1VV" />
      <concept id="1146644623116" name="jetbrains.mps.baseLanguage.structure.PrivateVisibility" flags="nn" index="3Tm6S6" />
      <concept id="1146644641414" name="jetbrains.mps.baseLanguage.structure.ProtectedVisibility" flags="nn" index="3Tmbuc" />
      <concept id="1116615150612" name="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression" flags="nn" index="3VsKOn">
        <reference id="1116615189566" name="classifier" index="3VsUkX" />
      </concept>
      <concept id="1080120340718" name="jetbrains.mps.baseLanguage.structure.AndExpression" flags="nn" index="1Wc70l" />
      <concept id="1170345865475" name="jetbrains.mps.baseLanguage.structure.AnonymousClass" flags="ig" index="1Y3b0j">
        <reference id="1170346070688" name="classifier" index="1Y3XeK" />
      </concept>
    </language>
    <language id="774bf8a0-62e5-41e1-af63-f4812e60e48b" name="jetbrains.mps.baseLanguage.checkedDots">
      <concept id="4079382982702596667" name="jetbrains.mps.baseLanguage.checkedDots.structure.CheckedDotExpression" flags="nn" index="2EnYce" />
    </language>
    <language id="fd392034-7849-419d-9071-12563d152375" name="jetbrains.mps.baseLanguage.closures">
      <concept id="1200830824066" name="jetbrains.mps.baseLanguage.closures.structure.YieldStatement" flags="nn" index="2n63Yl">
        <child id="1200830928149" name="expression" index="2n6tg2" />
      </concept>
      <concept id="1199569711397" name="jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral" flags="nn" index="1bVj0M">
        <child id="1199569906740" name="parameter" index="1bW2Oz" />
        <child id="1199569916463" name="body" index="1bW5cS" />
      </concept>
    </language>
    <language id="f2801650-65d5-424e-bb1b-463a8781b786" name="jetbrains.mps.baseLanguage.javadoc">
      <concept id="6832197706140896242" name="jetbrains.mps.baseLanguage.javadoc.structure.FieldDocComment" flags="ng" index="z59LJ" />
      <concept id="5349172909345501395" name="jetbrains.mps.baseLanguage.javadoc.structure.BaseDocComment" flags="ng" index="P$AiS">
        <child id="8465538089690331502" name="body" index="TZ5H$" />
        <child id="5383422241790532083" name="tags" index="3nqlJM" />
      </concept>
      <concept id="5349172909345532724" name="jetbrains.mps.baseLanguage.javadoc.structure.MethodDocComment" flags="ng" index="P$JXv" />
      <concept id="8465538089690331500" name="jetbrains.mps.baseLanguage.javadoc.structure.CommentLine" flags="ng" index="TZ5HA">
        <child id="8970989240999019149" name="part" index="1dT_Ay" />
      </concept>
      <concept id="8465538089690331492" name="jetbrains.mps.baseLanguage.javadoc.structure.DeprecatedBlockDocTag" flags="ng" index="TZ5HI">
        <child id="2667874559098216723" name="text" index="3HnX3l" />
      </concept>
      <concept id="8970989240999019143" name="jetbrains.mps.baseLanguage.javadoc.structure.TextCommentLinePart" flags="ng" index="1dT_AC">
        <property id="8970989240999019144" name="text" index="1dT_AB" />
      </concept>
      <concept id="2068944020170241612" name="jetbrains.mps.baseLanguage.javadoc.structure.ClassifierDocComment" flags="ng" index="3UR2Jj" />
    </language>
    <language id="f61473f9-130f-42f6-b98d-6c438812c2f6" name="jetbrains.mps.baseLanguage.unitTest">
      <concept id="7080278351417106679" name="jetbrains.mps.baseLanguage.unitTest.structure.AssertInNotNull" flags="nn" index="2Hmddi">
        <child id="7080278351417106681" name="expression" index="2Hmdds" />
      </concept>
      <concept id="8427750732757990717" name="jetbrains.mps.baseLanguage.unitTest.structure.BinaryAssert" flags="nn" index="3tpDYu">
        <child id="8427750732757990725" name="actual" index="3tpDZA" />
        <child id="8427750732757990724" name="expected" index="3tpDZB" />
      </concept>
      <concept id="1171978097730" name="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" flags="nn" index="3vlDli" />
      <concept id="1171981022339" name="jetbrains.mps.baseLanguage.unitTest.structure.AssertTrue" flags="nn" index="3vwNmj">
        <child id="1171981057159" name="condition" index="3vwVQn" />
      </concept>
      <concept id="1171983834376" name="jetbrains.mps.baseLanguage.unitTest.structure.AssertFalse" flags="nn" index="3vFxKo">
        <child id="1171983854940" name="condition" index="3vFALc" />
      </concept>
      <concept id="1171985735491" name="jetbrains.mps.baseLanguage.unitTest.structure.AssertSame" flags="nn" index="3vMLTj" />
      <concept id="1172017222794" name="jetbrains.mps.baseLanguage.unitTest.structure.Fail" flags="nn" index="3xETmq" />
      <concept id="1172028177041" name="jetbrains.mps.baseLanguage.unitTest.structure.AssertIsNull" flags="nn" index="3ykFI1">
        <child id="1172028236559" name="expression" index="3ykU8v" />
      </concept>
      <concept id="1172073500303" name="jetbrains.mps.baseLanguage.unitTest.structure.Message" flags="ng" index="3_1$Yv">
        <child id="1172073511101" name="message" index="3_1BAH" />
      </concept>
      <concept id="1172075514136" name="jetbrains.mps.baseLanguage.unitTest.structure.MessageHolder" flags="ng" index="3_9gw8">
        <child id="1172075534298" name="message" index="3_9lra" />
      </concept>
    </language>
    <language id="760a0a8c-eabb-4521-8bfd-65db761a9ba3" name="jetbrains.mps.baseLanguage.logging">
      <concept id="1167227138527" name="jetbrains.mps.baseLanguage.logging.structure.LogStatement" flags="nn" index="34ab3g">
        <property id="1167245565795" name="severity" index="35gtTG" />
        <child id="1167227463056" name="logExpression" index="34bqiv" />
      </concept>
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1177026924588" name="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" flags="nn" index="chp4Y">
        <reference id="1177026940964" name="conceptDeclaration" index="cht4Q" />
      </concept>
      <concept id="1138411891628" name="jetbrains.mps.lang.smodel.structure.SNodeOperation" flags="nn" index="eCIE_">
        <child id="1144104376918" name="parameter" index="1xVPHs" />
      </concept>
      <concept id="1179409122411" name="jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall" flags="nn" index="2qgKlT" />
      <concept id="1145383075378" name="jetbrains.mps.lang.smodel.structure.SNodeListType" flags="in" index="2I9FWS">
        <reference id="1145383142433" name="elementConcept" index="2I9WkF" />
      </concept>
      <concept id="1145404486709" name="jetbrains.mps.lang.smodel.structure.SemanticDowncastExpression" flags="nn" index="2JrnkZ">
        <child id="1145404616321" name="leftExpression" index="2JrQYb" />
      </concept>
      <concept id="1171305280644" name="jetbrains.mps.lang.smodel.structure.Node_GetDescendantsOperation" flags="nn" index="2Rf3mk" />
      <concept id="1171310072040" name="jetbrains.mps.lang.smodel.structure.Node_GetContainingRootOperation" flags="nn" index="2Rxl7S" />
      <concept id="1139613262185" name="jetbrains.mps.lang.smodel.structure.Node_GetParentOperation" flags="nn" index="1mfA1w" />
      <concept id="1139621453865" name="jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation" flags="nn" index="1mIQ4w">
        <child id="1177027386292" name="conceptArgument" index="cj9EA" />
      </concept>
      <concept id="1172008320231" name="jetbrains.mps.lang.smodel.structure.Node_IsNotNullOperation" flags="nn" index="3x8VRR" />
      <concept id="1144101972840" name="jetbrains.mps.lang.smodel.structure.OperationParm_Concept" flags="ng" index="1xMEDy">
        <child id="1207343664468" name="conceptArgument" index="ri$Ld" />
      </concept>
      <concept id="6407023681583036853" name="jetbrains.mps.lang.smodel.structure.NodeAttributeQualifier" flags="ng" index="3CFYIy">
        <reference id="6407023681583036854" name="attributeConcept" index="3CFYIx" />
      </concept>
      <concept id="6407023681583031218" name="jetbrains.mps.lang.smodel.structure.AttributeAccess" flags="nn" index="3CFZ6_">
        <child id="6407023681583036852" name="qualifier" index="3CFYIz" />
      </concept>
      <concept id="1140133623887" name="jetbrains.mps.lang.smodel.structure.Node_DeleteOperation" flags="nn" index="1PgB_6" />
      <concept id="1140137987495" name="jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression" flags="nn" index="1PxgMI">
        <reference id="1140138128738" name="concept" index="1PxNhF" />
        <child id="1140138123956" name="leftExpression" index="1PxMeX" />
      </concept>
      <concept id="1138055754698" name="jetbrains.mps.lang.smodel.structure.SNodeType" flags="in" index="3Tqbb2">
        <reference id="1138405853777" name="concept" index="ehGHo" />
      </concept>
      <concept id="1138056022639" name="jetbrains.mps.lang.smodel.structure.SPropertyAccess" flags="nn" index="3TrcHB">
        <reference id="1138056395725" name="property" index="3TsBF5" />
      </concept>
      <concept id="1138056143562" name="jetbrains.mps.lang.smodel.structure.SLinkAccess" flags="nn" index="3TrEf2">
        <reference id="1138056516764" name="link" index="3Tt5mk" />
      </concept>
      <concept id="1138056282393" name="jetbrains.mps.lang.smodel.structure.SLinkListAccess" flags="nn" index="3Tsc0h">
        <reference id="1138056546658" name="link" index="3TtcxE" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1133920641626" name="jetbrains.mps.lang.core.structure.BaseConcept" flags="ng" index="2VYdi">
        <property id="1193676396447" name="virtualPackage" index="3GE5qa" />
        <child id="5169995583184591170" name="smodelAttribute" index="lGtFl" />
      </concept>
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
    <language id="83888646-71ce-4f1c-9c53-c54016f6ad4f" name="jetbrains.mps.baseLanguage.collections">
      <concept id="1204796164442" name="jetbrains.mps.baseLanguage.collections.structure.InternalSequenceOperation" flags="nn" index="23sCx2">
        <child id="1204796294226" name="closure" index="23t8la" />
      </concept>
      <concept id="540871147943773365" name="jetbrains.mps.baseLanguage.collections.structure.SingleArgumentSequenceOperation" flags="nn" index="25WWJ4">
        <child id="540871147943773366" name="argument" index="25WWJ7" />
      </concept>
      <concept id="1204980550705" name="jetbrains.mps.baseLanguage.collections.structure.VisitAllOperation" flags="nn" index="2es0OD" />
      <concept id="1226511727824" name="jetbrains.mps.baseLanguage.collections.structure.SetType" flags="in" index="2hMVRd">
        <child id="1226511765987" name="elementType" index="2hN53Y" />
      </concept>
      <concept id="1226516258405" name="jetbrains.mps.baseLanguage.collections.structure.HashSetCreator" flags="nn" index="2i4dXS" />
      <concept id="1151688443754" name="jetbrains.mps.baseLanguage.collections.structure.ListType" flags="in" index="_YKpA">
        <child id="1151688676805" name="elementType" index="_ZDj9" />
      </concept>
      <concept id="1151689724996" name="jetbrains.mps.baseLanguage.collections.structure.SequenceType" flags="in" index="A3Dl8">
        <child id="1151689745422" name="elementType" index="A3Ik2" />
      </concept>
      <concept id="1151702311717" name="jetbrains.mps.baseLanguage.collections.structure.ToListOperation" flags="nn" index="ANE8D" />
      <concept id="1153943597977" name="jetbrains.mps.baseLanguage.collections.structure.ForEachStatement" flags="nn" index="2Gpval">
        <child id="1153944400369" name="variable" index="2Gsz3X" />
        <child id="1153944424730" name="inputSequence" index="2GsD0m" />
      </concept>
      <concept id="1153944193378" name="jetbrains.mps.baseLanguage.collections.structure.ForEachVariable" flags="nr" index="2GrKxI" />
      <concept id="1153944233411" name="jetbrains.mps.baseLanguage.collections.structure.ForEachVariableReference" flags="nn" index="2GrUjf">
        <reference id="1153944258490" name="variable" index="2Gs0qQ" />
      </concept>
      <concept id="1235573135402" name="jetbrains.mps.baseLanguage.collections.structure.SingletonSequenceCreator" flags="nn" index="2HTt$P">
        <child id="1235573175711" name="elementType" index="2HTBi0" />
        <child id="1235573187520" name="singletonValue" index="2HTEbv" />
      </concept>
      <concept id="1237721394592" name="jetbrains.mps.baseLanguage.collections.structure.AbstractContainerCreator" flags="nn" index="HWqM0">
        <child id="1237721435807" name="elementType" index="HW$YZ" />
        <child id="1237731803878" name="copyFrom" index="I$8f6" />
      </concept>
      <concept id="1227008614712" name="jetbrains.mps.baseLanguage.collections.structure.LinkedListCreator" flags="nn" index="2Jqq0_" />
      <concept id="1227022179634" name="jetbrains.mps.baseLanguage.collections.structure.AddLastElementOperation" flags="nn" index="2Ke9KJ" />
      <concept id="1227026082377" name="jetbrains.mps.baseLanguage.collections.structure.RemoveFirstElementOperation" flags="nn" index="2Kt2Hk" />
      <concept id="1203518072036" name="jetbrains.mps.baseLanguage.collections.structure.SmartClosureParameterDeclaration" flags="ig" index="Rh6nW" />
      <concept id="1160600644654" name="jetbrains.mps.baseLanguage.collections.structure.ListCreatorWithInit" flags="nn" index="Tc6Ow" />
      <concept id="1160612413312" name="jetbrains.mps.baseLanguage.collections.structure.AddElementOperation" flags="nn" index="TSZUe" />
      <concept id="1160666733551" name="jetbrains.mps.baseLanguage.collections.structure.AddAllElementsOperation" flags="nn" index="X8dFx" />
      <concept id="1240325842691" name="jetbrains.mps.baseLanguage.collections.structure.AsSequenceOperation" flags="nn" index="39bAoz" />
      <concept id="1201792049884" name="jetbrains.mps.baseLanguage.collections.structure.TranslateOperation" flags="nn" index="3goQfb" />
      <concept id="1197683403723" name="jetbrains.mps.baseLanguage.collections.structure.MapType" flags="in" index="3rvAFt">
        <child id="1197683466920" name="keyType" index="3rvQeY" />
        <child id="1197683475734" name="valueType" index="3rvSg0" />
      </concept>
      <concept id="1197686869805" name="jetbrains.mps.baseLanguage.collections.structure.HashMapCreator" flags="nn" index="3rGOSV">
        <child id="1197687026896" name="keyType" index="3rHrn6" />
        <child id="1197687035757" name="valueType" index="3rHtpV" />
      </concept>
      <concept id="1165525191778" name="jetbrains.mps.baseLanguage.collections.structure.GetFirstOperation" flags="nn" index="1uHKPH" />
      <concept id="1165530316231" name="jetbrains.mps.baseLanguage.collections.structure.IsEmptyOperation" flags="nn" index="1v1jN8" />
      <concept id="1202120902084" name="jetbrains.mps.baseLanguage.collections.structure.WhereOperation" flags="nn" index="3zZkjj" />
      <concept id="1202128969694" name="jetbrains.mps.baseLanguage.collections.structure.SelectOperation" flags="nn" index="3$u5V9" />
      <concept id="1240824834947" name="jetbrains.mps.baseLanguage.collections.structure.ValueAccessOperation" flags="nn" index="3AV6Ez" />
      <concept id="1240825616499" name="jetbrains.mps.baseLanguage.collections.structure.KeyAccessOperation" flags="nn" index="3AY5_j" />
      <concept id="1197932370469" name="jetbrains.mps.baseLanguage.collections.structure.MapElement" flags="nn" index="3EllGN">
        <child id="1197932505799" name="map" index="3ElQJh" />
        <child id="1197932525128" name="key" index="3ElVtu" />
      </concept>
      <concept id="1176501494711" name="jetbrains.mps.baseLanguage.collections.structure.IsNotEmptyOperation" flags="nn" index="3GX2aA" />
      <concept id="1172254888721" name="jetbrains.mps.baseLanguage.collections.structure.ContainsOperation" flags="nn" index="3JPx81" />
      <concept id="5686963296372573083" name="jetbrains.mps.baseLanguage.collections.structure.AbstractContainerType" flags="in" index="3O5elB">
        <child id="5686963296372573084" name="elementType" index="3O5elw" />
      </concept>
      <concept id="5686963296372475025" name="jetbrains.mps.baseLanguage.collections.structure.QueueType" flags="in" index="3O6Q9H" />
    </language>
  </registry>
  <node concept="312cEu" id="hFCjDGI">
    <property role="TrG5h" value="NodeDataFlowCheckerUtil" />
    <property role="3GE5qa" value="util" />
    <node concept="2tJIrI" id="2oSMk1rVwI3" role="jymVt" />
    <node concept="3clFbW" id="6Ysvt_GcMCY" role="jymVt">
      <node concept="3cqZAl" id="6Ysvt_GcMCZ" role="3clF45" />
      <node concept="3Tm1VV" id="6Ysvt_GcMD0" role="1B3o_S" />
      <node concept="3clFbS" id="6Ysvt_GcMD1" role="3clF47" />
    </node>
    <node concept="2tJIrI" id="4xK2ogVHEqC" role="jymVt" />
    <node concept="2YIFZL" id="hG87wR8" role="jymVt">
      <property role="TrG5h" value="checkDataFlow" />
      <node concept="3cqZAl" id="hG87wR9" role="3clF45" />
      <node concept="3Tm1VV" id="hG87wRa" role="1B3o_S" />
      <node concept="3clFbS" id="hG87wRb" role="3clF47">
        <node concept="3cpWs8" id="hG88ybm" role="3cqZAp">
          <node concept="3cpWsn" id="hG88ybn" role="3cpWs9">
            <property role="TrG5h" value="program" />
            <node concept="3uibUv" id="hG88ybo" role="1tU5fm">
              <ref role="3uigEE" to="1fjm:~Program" resolve="Program" />
            </node>
            <node concept="2OqwBi" id="hG88CcJ" role="33vP2m">
              <node concept="2ShNRf" id="qrAFe9kp5s" role="2Oq$k0">
                <node concept="1pGfFk" id="qrAFe9kp5t" role="2ShVmc">
                  <ref role="37wK5l" to="aplb:qrAFe9j8zl" resolve="MPSProgramBuilder" />
                  <node concept="1eOMI4" id="qrAFe9qTCk" role="37wK5m">
                    <node concept="10QFUN" id="qrAFe9qTCl" role="1eOMHV">
                      <node concept="10Nm6u" id="qrAFe9qTCj" role="10QFUP" />
                      <node concept="3uibUv" id="qrAFe9qTCh" role="10QFUM">
                        <ref role="3uigEE" to="lui2:~SRepository" resolve="SRepository" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="hG88Dgq" role="2OqNvi">
                <ref role="37wK5l" to="1fjm:~StructuralProgramBuilder.buildProgram(java.lang.Object):jetbrains.mps.lang.dataFlow.framework.Program" resolve="buildProgram" />
                <node concept="37vLTw" id="2BHiRxgm8Jr" role="37wK5m">
                  <ref role="3cqZAo" node="hG87Lh4" resolve="node" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="4xK2ogVIKI7" role="3cqZAp">
          <node concept="3cpWsn" id="4xK2ogVIKI8" role="3cpWs9">
            <property role="TrG5h" value="instruction" />
            <node concept="3uibUv" id="4xK2ogVIKI9" role="1tU5fm">
              <ref role="3uigEE" to="dau9:~Instruction" resolve="Instruction" />
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="4xK2ogVIKIa" role="3cqZAp">
          <node concept="3cpWsn" id="4xK2ogVIKIb" role="3cpWs9">
            <property role="TrG5h" value="instructions" />
            <node concept="_YKpA" id="4xK2ogVIKIc" role="1tU5fm">
              <node concept="3uibUv" id="4xK2ogVIKId" role="_ZDj9">
                <ref role="3uigEE" to="dau9:~Instruction" resolve="Instruction" />
              </node>
            </node>
            <node concept="2OqwBi" id="4xK2ogVIKIe" role="33vP2m">
              <node concept="37vLTw" id="dCRb6FUINW" role="2Oq$k0">
                <ref role="3cqZAo" node="hG88ybn" resolve="program" />
              </node>
              <node concept="liA8E" id="4xK2ogVIKIg" role="2OqNvi">
                <ref role="37wK5l" to="1fjm:~Program.getInstructionsFor(java.lang.Object):java.util.List" resolve="getInstructionsFor" />
                <node concept="37vLTw" id="dCRb6FUQX8" role="37wK5m">
                  <ref role="3cqZAo" node="hG87Lh4" resolve="node" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="hG8akQ9" role="3cqZAp">
          <node concept="3cpWsn" id="hG8akQa" role="3cpWs9">
            <property role="TrG5h" value="unreachable" />
            <node concept="2hMVRd" id="i0q_vMS" role="1tU5fm">
              <node concept="3uibUv" id="i0q_vMT" role="2hN53Y">
                <ref role="3uigEE" to="dau9:~Instruction" resolve="Instruction" />
              </node>
            </node>
            <node concept="2OqwBi" id="hG8aqE_" role="33vP2m">
              <node concept="37vLTw" id="3GM_nagTv_6" role="2Oq$k0">
                <ref role="3cqZAo" node="hG88ybn" resolve="program" />
              </node>
              <node concept="liA8E" id="hG8asto" role="2OqNvi">
                <ref role="37wK5l" to="1fjm:~Program.getUnreachableInstructions():java.util.Set" resolve="getUnreachableInstructions" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="hG8jvZ7" role="3cqZAp">
          <node concept="3cpWsn" id="hG8jvZ8" role="3cpWs9">
            <property role="TrG5h" value="initialized" />
            <node concept="3uibUv" id="hG8jvZ9" role="1tU5fm">
              <ref role="3uigEE" to="1fjm:~AnalysisResult" resolve="AnalysisResult" />
              <node concept="3uibUv" id="4F$MTehZvJz" role="11_B2D">
                <ref role="3uigEE" to="1fjm:~VarSet" resolve="VarSet" />
              </node>
            </node>
            <node concept="2OqwBi" id="hG8jDzN" role="33vP2m">
              <node concept="37vLTw" id="3GM_nagTtTd" role="2Oq$k0">
                <ref role="3cqZAo" node="hG88ybn" resolve="program" />
              </node>
              <node concept="liA8E" id="hG8jDzP" role="2OqNvi">
                <ref role="37wK5l" to="1fjm:~Program.analyze(jetbrains.mps.lang.dataFlow.framework.DataFlowAnalyzer):jetbrains.mps.lang.dataFlow.framework.AnalysisResult" resolve="analyze" />
                <node concept="2ShNRf" id="hG8jDzQ" role="37wK5m">
                  <node concept="1pGfFk" id="hG8jDzR" role="2ShVmc">
                    <ref role="37wK5l" to="autt:~InitializedVariablesAnalyzer.&lt;init&gt;()" resolve="InitializedVariablesAnalyzer" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="hG8rKPs" role="3cqZAp">
          <node concept="3cpWsn" id="hG8rKPt" role="3cpWs9">
            <property role="TrG5h" value="live" />
            <node concept="3uibUv" id="hG8rKPu" role="1tU5fm">
              <ref role="3uigEE" to="1fjm:~AnalysisResult" resolve="AnalysisResult" />
              <node concept="3uibUv" id="4F$MTehZvJB" role="11_B2D">
                <ref role="3uigEE" to="1fjm:~VarSet" resolve="VarSet" />
              </node>
            </node>
            <node concept="2OqwBi" id="hG8rKPx" role="33vP2m">
              <node concept="37vLTw" id="3GM_nagTuU2" role="2Oq$k0">
                <ref role="3cqZAo" node="hG88ybn" resolve="program" />
              </node>
              <node concept="liA8E" id="hG8rKPz" role="2OqNvi">
                <ref role="37wK5l" to="1fjm:~Program.analyze(jetbrains.mps.lang.dataFlow.framework.DataFlowAnalyzer):jetbrains.mps.lang.dataFlow.framework.AnalysisResult" resolve="analyze" />
                <node concept="2ShNRf" id="hG8rKP$" role="37wK5m">
                  <node concept="1pGfFk" id="hG8rQxV" role="2ShVmc">
                    <ref role="37wK5l" to="autt:~LivenessAnalyzer.&lt;init&gt;()" resolve="LivenessAnalyzer" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="1DcWWT" id="dCRb6FQqmb" role="3cqZAp">
          <node concept="3clFbS" id="dCRb6FQqme" role="2LFqv$">
            <node concept="1gVbGN" id="4xK2ogVJANy" role="3cqZAp">
              <node concept="3y3z36" id="4xK2ogVKjAs" role="1gVkn0">
                <node concept="10Nm6u" id="4xK2ogVKkAT" role="3uHU7w" />
                <node concept="2OqwBi" id="4xK2ogVJM$R" role="3uHU7B">
                  <node concept="3CFZ6_" id="4xK2ogVJY3I" role="2OqNvi">
                    <node concept="3CFYIy" id="3rohxPV5Gob" role="3CFYIz">
                      <ref role="3CFYIx" to="tp5g:hG7CXiP" resolve="NodeOperationsContainer" />
                    </node>
                  </node>
                  <node concept="37vLTw" id="dCRb6FRhXk" role="2Oq$k0">
                    <ref role="3cqZAo" node="dCRb6FQqmh" resolve="child" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3cpWs8" id="4xK2ogVIKHT" role="3cqZAp">
              <node concept="3cpWsn" id="4xK2ogVIKHU" role="3cpWs9">
                <property role="TrG5h" value="container" />
                <node concept="3Tqbb2" id="4xK2ogVIKHV" role="1tU5fm">
                  <ref role="ehGHo" to="tp5g:hG7CXiP" resolve="NodeOperationsContainer" />
                </node>
                <node concept="2OqwBi" id="4xK2ogVIKHW" role="33vP2m">
                  <node concept="3CFZ6_" id="4xK2ogVIKHY" role="2OqNvi">
                    <node concept="3CFYIy" id="3rohxPV5K9K" role="3CFYIz">
                      <ref role="3CFYIx" to="tp5g:hG7CXiP" resolve="NodeOperationsContainer" />
                    </node>
                  </node>
                  <node concept="37vLTw" id="dCRb6FRlUO" role="2Oq$k0">
                    <ref role="3cqZAo" node="dCRb6FQqmh" resolve="child" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="1DcWWT" id="4xK2ogVIKI0" role="3cqZAp">
              <node concept="2OqwBi" id="4xK2ogVIKI1" role="1DdaDG">
                <node concept="37vLTw" id="4xK2ogVIKI2" role="2Oq$k0">
                  <ref role="3cqZAo" node="4xK2ogVIKHU" resolve="container" />
                </node>
                <node concept="3Tsc0h" id="3rohxPV5OqY" role="2OqNvi">
                  <ref role="3TtcxE" to="tp5g:hG7EUTW" />
                </node>
              </node>
              <node concept="3cpWsn" id="4xK2ogVIKI4" role="1Duv9x">
                <property role="TrG5h" value="operation" />
                <node concept="3Tqbb2" id="4xK2ogVIKI5" role="1tU5fm">
                  <ref role="ehGHo" to="tp5g:hG7unSw" resolve="NodeCheckOperation" />
                </node>
              </node>
              <node concept="3clFbS" id="4xK2ogVIKI6" role="2LFqv$">
                <node concept="3clFbJ" id="4xK2ogVIKIi" role="3cqZAp">
                  <node concept="3clFbS" id="4xK2ogVIKIj" role="3clFbx">
                    <node concept="3clFbF" id="4xK2ogVIKIk" role="3cqZAp">
                      <node concept="37vLTI" id="4xK2ogVIKIl" role="3clFbG">
                        <node concept="37vLTw" id="4xK2ogVIKIm" role="37vLTJ">
                          <ref role="3cqZAo" node="4xK2ogVIKI8" resolve="instruction" />
                        </node>
                        <node concept="2OqwBi" id="4xK2ogVIKIn" role="37vLTx">
                          <node concept="2OqwBi" id="4xK2ogVIKIo" role="2Oq$k0">
                            <node concept="37vLTw" id="4xK2ogVIKIp" role="2Oq$k0">
                              <ref role="3cqZAo" node="hG88ybn" resolve="program" />
                            </node>
                            <node concept="liA8E" id="4xK2ogVIKIq" role="2OqNvi">
                              <ref role="37wK5l" to="1fjm:~Program.getInstructionsFor(java.lang.Object):java.util.List" resolve="getInstructionsFor" />
                              <node concept="37vLTw" id="dCRb6FRuR1" role="37wK5m">
                                <ref role="3cqZAo" node="dCRb6FQqmh" resolve="child" />
                              </node>
                            </node>
                          </node>
                          <node concept="liA8E" id="4xK2ogVIKIs" role="2OqNvi">
                            <ref role="37wK5l" to="33ny:~List.get(int):java.lang.Object" resolve="get" />
                            <node concept="3cmrfG" id="4xK2ogVIKIt" role="37wK5m">
                              <property role="3cmrfH" value="0" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="2OqwBi" id="4xK2ogVIKIu" role="3clFbw">
                    <node concept="37vLTw" id="4xK2ogVIKIv" role="2Oq$k0">
                      <ref role="3cqZAo" node="4xK2ogVIKIb" resolve="instructions" />
                    </node>
                    <node concept="3GX2aA" id="4xK2ogVIKIw" role="2OqNvi" />
                  </node>
                  <node concept="9aQIb" id="4xK2ogVIKIx" role="9aQIa">
                    <node concept="3clFbS" id="4xK2ogVIKIy" role="9aQI4">
                      <node concept="3N13vt" id="4xK2ogVIKIz" role="3cqZAp" />
                    </node>
                  </node>
                </node>
                <node concept="3clFbH" id="1tMiU9liR6P" role="3cqZAp" />
                <node concept="3clFbJ" id="4xK2ogVIKI$" role="3cqZAp">
                  <node concept="2OqwBi" id="4xK2ogVIKI_" role="3clFbw">
                    <node concept="37vLTw" id="4xK2ogVIKIA" role="2Oq$k0">
                      <ref role="3cqZAo" node="4xK2ogVIKI4" resolve="operation" />
                    </node>
                    <node concept="1mIQ4w" id="4xK2ogVIKIB" role="2OqNvi">
                      <node concept="chp4Y" id="4xK2ogVIKIC" role="cj9EA">
                        <ref role="cht4Q" to="tp5g:hG2YuUS" resolve="NodeReachable" />
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbS" id="4xK2ogVIKID" role="3clFbx">
                    <node concept="3vFxKo" id="4xK2ogVIKIE" role="3cqZAp">
                      <node concept="3_1$Yv" id="4xK2ogVIKIF" role="3_9lra">
                        <node concept="3cpWs3" id="4xK2ogVIKIG" role="3_1BAH">
                          <node concept="Xl_RD" id="4xK2ogVIKIH" role="3uHU7w">
                            <property role="Xl_RC" value="&gt; is unreachable" />
                          </node>
                          <node concept="3cpWs3" id="4xK2ogVIKII" role="3uHU7B">
                            <node concept="Xl_RD" id="4xK2ogVIKIJ" role="3uHU7B">
                              <property role="Xl_RC" value="instruction &lt;" />
                            </node>
                            <node concept="37vLTw" id="4xK2ogVIKIK" role="3uHU7w">
                              <ref role="3cqZAo" node="4xK2ogVIKI8" resolve="instruction" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="2OqwBi" id="4xK2ogVIKIL" role="3vFALc">
                        <node concept="37vLTw" id="4xK2ogVIKIM" role="2Oq$k0">
                          <ref role="3cqZAo" node="hG8akQa" resolve="unreachable" />
                        </node>
                        <node concept="3JPx81" id="4xK2ogVIKIN" role="2OqNvi">
                          <node concept="37vLTw" id="4xK2ogVIKIO" role="25WWJ7">
                            <ref role="3cqZAo" node="4xK2ogVIKI8" resolve="instruction" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbH" id="1tMiU9liS3i" role="3cqZAp" />
                <node concept="3clFbJ" id="4xK2ogVIKIP" role="3cqZAp">
                  <node concept="2OqwBi" id="4xK2ogVIKIQ" role="3clFbw">
                    <node concept="37vLTw" id="4xK2ogVIKIR" role="2Oq$k0">
                      <ref role="3cqZAo" node="4xK2ogVIKI4" resolve="operation" />
                    </node>
                    <node concept="1mIQ4w" id="4xK2ogVIKIS" role="2OqNvi">
                      <node concept="chp4Y" id="4xK2ogVIKIT" role="cj9EA">
                        <ref role="cht4Q" to="tp5g:hG8bhMT" resolve="NodeUnreachable" />
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbS" id="4xK2ogVIKIU" role="3clFbx">
                    <node concept="3vwNmj" id="4xK2ogVIKIV" role="3cqZAp">
                      <node concept="3_1$Yv" id="4xK2ogVIKIW" role="3_9lra">
                        <node concept="3cpWs3" id="4xK2ogVIKIX" role="3_1BAH">
                          <node concept="Xl_RD" id="4xK2ogVIKIY" role="3uHU7w">
                            <property role="Xl_RC" value="&gt; is reachable" />
                          </node>
                          <node concept="3cpWs3" id="4xK2ogVIKIZ" role="3uHU7B">
                            <node concept="Xl_RD" id="4xK2ogVIKJ0" role="3uHU7B">
                              <property role="Xl_RC" value="instruction &lt;" />
                            </node>
                            <node concept="37vLTw" id="4xK2ogVIKJ1" role="3uHU7w">
                              <ref role="3cqZAo" node="4xK2ogVIKI8" resolve="instruction" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="2OqwBi" id="4xK2ogVIKJ2" role="3vwVQn">
                        <node concept="37vLTw" id="4xK2ogVIKJ3" role="2Oq$k0">
                          <ref role="3cqZAo" node="hG8akQa" resolve="unreachable" />
                        </node>
                        <node concept="3JPx81" id="4xK2ogVIKJ4" role="2OqNvi">
                          <node concept="37vLTw" id="4xK2ogVIKJ5" role="25WWJ7">
                            <ref role="3cqZAo" node="4xK2ogVIKI8" resolve="instruction" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbH" id="1tMiU9liSZG" role="3cqZAp" />
                <node concept="3clFbJ" id="4xK2ogVIKJ6" role="3cqZAp">
                  <node concept="3clFbS" id="4xK2ogVIKJ7" role="3clFbx">
                    <node concept="3cpWs8" id="4xK2ogVIKJ8" role="3cqZAp">
                      <node concept="3cpWsn" id="4xK2ogVIKJ9" role="3cpWs9">
                        <property role="TrG5h" value="vars" />
                        <node concept="2hMVRd" id="4xK2ogVIKJa" role="1tU5fm">
                          <node concept="3uibUv" id="4xK2ogVIKJb" role="2hN53Y">
                            <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
                          </node>
                        </node>
                        <node concept="10QFUN" id="4xK2ogVIKJc" role="33vP2m">
                          <node concept="2hMVRd" id="4xK2ogVIKJd" role="10QFUM">
                            <node concept="3uibUv" id="4xK2ogVIKJe" role="2hN53Y">
                              <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="4xK2ogVIKJf" role="10QFUP">
                            <node concept="37vLTw" id="4xK2ogVIKJg" role="2Oq$k0">
                              <ref role="3cqZAo" node="hG8jvZ8" resolve="initialized" />
                            </node>
                            <node concept="liA8E" id="4xK2ogVIKJh" role="2OqNvi">
                              <ref role="37wK5l" to="1fjm:~AnalysisResult.get(jetbrains.mps.lang.dataFlow.framework.instructions.Instruction):java.lang.Object" resolve="get" />
                              <node concept="37vLTw" id="4xK2ogVIKJi" role="37wK5m">
                                <ref role="3cqZAo" node="4xK2ogVIKI8" resolve="instruction" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3cpWs8" id="4xK2ogVIKJj" role="3cqZAp">
                      <node concept="3cpWsn" id="4xK2ogVIKJk" role="3cpWs9">
                        <property role="TrG5h" value="var" />
                        <node concept="2OqwBi" id="4xK2ogVIKJl" role="33vP2m">
                          <node concept="1PxgMI" id="4xK2ogVIKJm" role="2Oq$k0">
                            <ref role="1PxNhF" to="tp5g:hG8gU8P" resolve="VariableInitialized" />
                            <node concept="37vLTw" id="4xK2ogVIKJn" role="1PxMeX">
                              <ref role="3cqZAo" node="4xK2ogVIKI4" resolve="operation" />
                            </node>
                          </node>
                          <node concept="3TrEf2" id="4xK2ogVIKJo" role="2OqNvi">
                            <ref role="3Tt5mk" to="tp5g:hG8gZ9D" />
                          </node>
                        </node>
                        <node concept="3Tqbb2" id="4xK2ogVIKJp" role="1tU5fm">
                          <ref role="ehGHo" to="tpee:fz7vLUo" resolve="VariableReference" />
                        </node>
                      </node>
                    </node>
                    <node concept="3vwNmj" id="4xK2ogVIKJq" role="3cqZAp">
                      <node concept="3_1$Yv" id="4xK2ogVIKJr" role="3_9lra">
                        <node concept="3cpWs3" id="4xK2ogVIKJs" role="3_1BAH">
                          <node concept="Xl_RD" id="4xK2ogVIKJt" role="3uHU7w">
                            <property role="Xl_RC" value="&gt; is not initialized" />
                          </node>
                          <node concept="3cpWs3" id="4xK2ogVIKJu" role="3uHU7B">
                            <node concept="Xl_RD" id="4xK2ogVIKJv" role="3uHU7B">
                              <property role="Xl_RC" value="variable &lt;" />
                            </node>
                            <node concept="37vLTw" id="4xK2ogVIKJw" role="3uHU7w">
                              <ref role="3cqZAo" node="4xK2ogVIKJk" resolve="var" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="2OqwBi" id="4xK2ogVIKJx" role="3vwVQn">
                        <node concept="37vLTw" id="4xK2ogVIKJy" role="2Oq$k0">
                          <ref role="3cqZAo" node="4xK2ogVIKJ9" resolve="vars" />
                        </node>
                        <node concept="3JPx81" id="4xK2ogVIKJz" role="2OqNvi">
                          <node concept="2OqwBi" id="4xK2ogVIKJ$" role="25WWJ7">
                            <node concept="37vLTw" id="4xK2ogVIKJ_" role="2Oq$k0">
                              <ref role="3cqZAo" node="4xK2ogVIKJk" resolve="var" />
                            </node>
                            <node concept="3TrEf2" id="4xK2ogVIKJA" role="2OqNvi">
                              <ref role="3Tt5mk" to="tpee:fzcqZ_w" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="2OqwBi" id="4xK2ogVIKJB" role="3clFbw">
                    <node concept="37vLTw" id="4xK2ogVIKJC" role="2Oq$k0">
                      <ref role="3cqZAo" node="4xK2ogVIKI4" resolve="operation" />
                    </node>
                    <node concept="1mIQ4w" id="4xK2ogVIKJD" role="2OqNvi">
                      <node concept="chp4Y" id="4xK2ogVIKJE" role="cj9EA">
                        <ref role="cht4Q" to="tp5g:hG8gU8P" resolve="VariableInitialized" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbH" id="1tMiU9liTW7" role="3cqZAp" />
                <node concept="3clFbJ" id="4xK2ogVIKJF" role="3cqZAp">
                  <node concept="3clFbS" id="4xK2ogVIKJG" role="3clFbx">
                    <node concept="3cpWs8" id="4xK2ogVIKJH" role="3cqZAp">
                      <node concept="3cpWsn" id="4xK2ogVIKJI" role="3cpWs9">
                        <property role="TrG5h" value="vars" />
                        <node concept="10QFUN" id="4xK2ogVIKJJ" role="33vP2m">
                          <node concept="2hMVRd" id="4xK2ogVIKJK" role="10QFUM">
                            <node concept="3uibUv" id="4xK2ogVIKJL" role="2hN53Y">
                              <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="4xK2ogVIKJM" role="10QFUP">
                            <node concept="37vLTw" id="4xK2ogVIKJN" role="2Oq$k0">
                              <ref role="3cqZAo" node="hG8rKPt" resolve="live" />
                            </node>
                            <node concept="liA8E" id="4xK2ogVIKJO" role="2OqNvi">
                              <ref role="37wK5l" to="1fjm:~AnalysisResult.get(jetbrains.mps.lang.dataFlow.framework.instructions.Instruction):java.lang.Object" resolve="get" />
                              <node concept="37vLTw" id="4xK2ogVIKJP" role="37wK5m">
                                <ref role="3cqZAo" node="4xK2ogVIKI8" resolve="instruction" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node concept="2hMVRd" id="4xK2ogVIKJQ" role="1tU5fm">
                          <node concept="3uibUv" id="4xK2ogVIKJR" role="2hN53Y">
                            <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3cpWs8" id="4xK2ogVIKJS" role="3cqZAp">
                      <node concept="3cpWsn" id="4xK2ogVIKJT" role="3cpWs9">
                        <property role="TrG5h" value="var" />
                        <node concept="2OqwBi" id="4xK2ogVIKJU" role="33vP2m">
                          <node concept="1PxgMI" id="4xK2ogVIKJV" role="2Oq$k0">
                            <ref role="1PxNhF" to="tp5g:hG8gU8P" resolve="VariableInitialized" />
                            <node concept="37vLTw" id="4xK2ogVIKJW" role="1PxMeX">
                              <ref role="3cqZAo" node="4xK2ogVIKI4" resolve="operation" />
                            </node>
                          </node>
                          <node concept="3TrEf2" id="4xK2ogVIKJX" role="2OqNvi">
                            <ref role="3Tt5mk" to="tp5g:hG8gZ9D" />
                          </node>
                        </node>
                        <node concept="3Tqbb2" id="4xK2ogVIKJY" role="1tU5fm">
                          <ref role="ehGHo" to="tpee:fz7vLUo" resolve="VariableReference" />
                        </node>
                      </node>
                    </node>
                    <node concept="3vwNmj" id="4xK2ogVIKJZ" role="3cqZAp">
                      <node concept="3_1$Yv" id="4xK2ogVIKK0" role="3_9lra">
                        <node concept="3cpWs3" id="4xK2ogVIKK1" role="3_1BAH">
                          <node concept="Xl_RD" id="4xK2ogVIKK2" role="3uHU7w">
                            <property role="Xl_RC" value="&gt; is not alive" />
                          </node>
                          <node concept="3cpWs3" id="4xK2ogVIKK3" role="3uHU7B">
                            <node concept="Xl_RD" id="4xK2ogVIKK4" role="3uHU7B">
                              <property role="Xl_RC" value="variable &lt;" />
                            </node>
                            <node concept="37vLTw" id="4xK2ogVIKK5" role="3uHU7w">
                              <ref role="3cqZAo" node="4xK2ogVIKJT" resolve="var" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="2OqwBi" id="4xK2ogVIKK6" role="3vwVQn">
                        <node concept="37vLTw" id="4xK2ogVIKK7" role="2Oq$k0">
                          <ref role="3cqZAo" node="4xK2ogVIKJI" resolve="vars" />
                        </node>
                        <node concept="3JPx81" id="4xK2ogVIKK8" role="2OqNvi">
                          <node concept="2OqwBi" id="4xK2ogVIKK9" role="25WWJ7">
                            <node concept="37vLTw" id="4xK2ogVIKKa" role="2Oq$k0">
                              <ref role="3cqZAo" node="4xK2ogVIKJT" resolve="var" />
                            </node>
                            <node concept="3TrEf2" id="4xK2ogVIKKb" role="2OqNvi">
                              <ref role="3Tt5mk" to="tpee:fzcqZ_w" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="2OqwBi" id="4xK2ogVIKKc" role="3clFbw">
                    <node concept="37vLTw" id="4xK2ogVIKKd" role="2Oq$k0">
                      <ref role="3cqZAo" node="4xK2ogVIKI4" resolve="operation" />
                    </node>
                    <node concept="1mIQ4w" id="4xK2ogVIKKe" role="2OqNvi">
                      <node concept="chp4Y" id="4xK2ogVIKKf" role="cj9EA">
                        <ref role="cht4Q" to="tp5g:hG8qOxM" resolve="VariableAlive" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3cpWsn" id="dCRb6FQqmh" role="1Duv9x">
            <property role="TrG5h" value="child" />
            <node concept="3Tqbb2" id="dCRb6FQuZD" role="1tU5fm" />
          </node>
          <node concept="2OqwBi" id="dCRb6FQIM9" role="1DdaDG">
            <node concept="2OqwBi" id="dCRb6FQw9P" role="2Oq$k0">
              <node concept="37vLTw" id="dCRb6FQvLQ" role="2Oq$k0">
                <ref role="3cqZAo" node="hG87Lh4" resolve="node" />
              </node>
              <node concept="2Rf3mk" id="dCRb6FQ$Qk" role="2OqNvi">
                <node concept="1xMEDy" id="dCRb6FQ$Qm" role="1xVPHs">
                  <node concept="chp4Y" id="dCRb6FQDrP" role="ri$Ld">
                    <ref role="cht4Q" to="tpck:gw2VY9q" resolve="BaseConcept" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3zZkjj" id="dCRb6FQN2D" role="2OqNvi">
              <node concept="1bVj0M" id="dCRb6FQN2F" role="23t8la">
                <node concept="3clFbS" id="dCRb6FQN2G" role="1bW5cS">
                  <node concept="3clFbF" id="dCRb6FQR2T" role="3cqZAp">
                    <node concept="2OqwBi" id="dCRb6FR4mq" role="3clFbG">
                      <node concept="2OqwBi" id="dCRb6FQR9f" role="2Oq$k0">
                        <node concept="37vLTw" id="dCRb6FQR2S" role="2Oq$k0">
                          <ref role="3cqZAo" node="dCRb6FQN2H" resolve="it" />
                        </node>
                        <node concept="3CFZ6_" id="dCRb6FQRGe" role="2OqNvi">
                          <node concept="3CFYIy" id="dCRb6FQVLI" role="3CFYIz">
                            <ref role="3CFYIx" to="tp5g:hG7CXiP" resolve="NodeOperationsContainer" />
                          </node>
                        </node>
                      </node>
                      <node concept="3x8VRR" id="dCRb6FR57q" role="2OqNvi" />
                    </node>
                  </node>
                </node>
                <node concept="Rh6nW" id="dCRb6FQN2H" role="1bW2Oz">
                  <property role="TrG5h" value="it" />
                  <node concept="2jxLKc" id="dCRb6FQN2I" role="1tU5fm" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="hG87Lh4" role="3clF46">
        <property role="TrG5h" value="node" />
        <property role="3TUv4t" value="true" />
        <node concept="3Tqbb2" id="hG87Lh5" role="1tU5fm">
          <ref role="ehGHo" to="tpck:gw2VY9q" resolve="BaseConcept" />
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="4xK2ogVNG1r" role="jymVt" />
    <node concept="3Tm1VV" id="hFCjDGJ" role="1B3o_S" />
  </node>
  <node concept="312cEu" id="hLFfHcX">
    <property role="TrG5h" value="BaseTestBody" />
    <node concept="312cEg" id="hLFg6DL" role="jymVt">
      <property role="TrG5h" value="myModel" />
      <node concept="3Tm1VV" id="hLFg6DN" role="1B3o_S" />
      <node concept="3uibUv" id="hLFg6DM" role="1tU5fm">
        <ref role="3uigEE" to="mhbf:~SModel" resolve="SModel" />
      </node>
    </node>
    <node concept="312cEg" id="hPjx680" role="jymVt">
      <property role="TrG5h" value="myProject" />
      <node concept="3Tm1VV" id="hPjx6Yk" role="1B3o_S" />
      <node concept="3uibUv" id="1jvPZ1MMnBE" role="1tU5fm">
        <ref role="3uigEE" to="z1c3:~Project" resolve="Project" />
      </node>
    </node>
    <node concept="312cEg" id="hLFgf6J" role="jymVt">
      <property role="TrG5h" value="myMap" />
      <node concept="3rvAFt" id="i1xByT_" role="1tU5fm">
        <node concept="3Tqbb2" id="1FgNkkIakRy" role="3rvQeY" />
        <node concept="3Tqbb2" id="1FgNkkIakRB" role="3rvSg0" />
      </node>
      <node concept="3Tmbuc" id="1FgNkkIaovQ" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="hLFgf6O" role="jymVt">
      <property role="TrG5h" value="myCopies" />
      <node concept="_YKpA" id="i05PVg_" role="1tU5fm">
        <node concept="3Tqbb2" id="1FgNkkIakRG" role="_ZDj9" />
      </node>
      <node concept="3Tm6S6" id="1FgNkkIao3U" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="ORe5oE9cBe" role="jymVt" />
    <node concept="3clFbW" id="hLFfHcZ" role="jymVt">
      <node concept="3clFbS" id="hLFfHd2" role="3clF47">
        <node concept="3clFbF" id="hLFA3Ss" role="3cqZAp">
          <node concept="37vLTI" id="hLFA3St" role="3clFbG">
            <node concept="37vLTw" id="ORe5oE9fiT" role="37vLTJ">
              <ref role="3cqZAo" node="hLFgf6J" resolve="myMap" />
            </node>
            <node concept="2ShNRf" id="hLFA3Sx" role="37vLTx">
              <node concept="3rGOSV" id="i1xVIzM" role="2ShVmc">
                <node concept="3Tqbb2" id="1FgNkkIakRK" role="3rHtpV" />
                <node concept="3Tqbb2" id="1FgNkkIakRJ" role="3rHrn6" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="hLFA3S_" role="3cqZAp">
          <node concept="37vLTI" id="hLFA3SA" role="3clFbG">
            <node concept="37vLTw" id="ORe5oE9fmI" role="37vLTJ">
              <ref role="3cqZAo" node="hLFgf6O" resolve="myCopies" />
            </node>
            <node concept="2ShNRf" id="hLFA3SB" role="37vLTx">
              <node concept="Tc6Ow" id="i0fLdqx" role="2ShVmc">
                <node concept="3uibUv" id="hLFA3SD" role="HW$YZ">
                  <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="hLFfHd1" role="1B3o_S" />
      <node concept="3cqZAl" id="hLFfHd0" role="3clF45" />
    </node>
    <node concept="2tJIrI" id="ORe5oE9cTn" role="jymVt" />
    <node concept="3clFb_" id="hLFg0c8" role="jymVt">
      <property role="TrG5h" value="addNodeById" />
      <node concept="3Tm1VV" id="hLFg0c9" role="1B3o_S" />
      <node concept="3clFbS" id="hLFg0ca" role="3clF47">
        <node concept="3clFbF" id="5wEedBrYRXD" role="3cqZAp">
          <node concept="2OqwBi" id="5wEedBrYZXc" role="3clFbG">
            <node concept="liA8E" id="5wEedBrZ1Mw" role="2OqNvi">
              <ref role="37wK5l" to="lui2:~ModelAccess.executeCommand(java.lang.Runnable):void" resolve="executeCommand" />
              <node concept="1bVj0M" id="5wEedBrZ2Sb" role="37wK5m">
                <node concept="3clFbS" id="5wEedBrZ2Sc" role="1bW5cS">
                  <node concept="3cpWs8" id="hRNaM8C" role="3cqZAp">
                    <node concept="3cpWsn" id="hRNaM8D" role="3cpWs9">
                      <property role="TrG5h" value="node" />
                      <node concept="2OqwBi" id="2n9zn0CqMzh" role="33vP2m">
                        <node concept="37vLTw" id="ORe5oE9fal" role="2Oq$k0">
                          <ref role="3cqZAo" node="hLFg6DL" resolve="myModel" />
                        </node>
                        <node concept="liA8E" id="2n9zn0CqMzi" role="2OqNvi">
                          <ref role="37wK5l" to="mhbf:~SModel.getNode(org.jetbrains.mps.openapi.model.SNodeId):org.jetbrains.mps.openapi.model.SNode" resolve="getNode" />
                          <node concept="2YIFZM" id="2n9zn0CqMzj" role="37wK5m">
                            <ref role="37wK5l" to="w1kc:~SNodeId.fromString(java.lang.String):jetbrains.mps.smodel.SNodeId" resolve="fromString" />
                            <ref role="1Pybhc" to="w1kc:~SNodeId" resolve="SNodeId" />
                            <node concept="37vLTw" id="2BHiRxgmNFm" role="37wK5m">
                              <ref role="3cqZAo" node="hLFg0dc" resolve="id" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="3Tqbb2" id="hRNaM8E" role="1tU5fm" />
                    </node>
                  </node>
                  <node concept="3cpWs8" id="hRNaM8N" role="3cqZAp">
                    <node concept="3cpWsn" id="hRNaM8O" role="3cpWs9">
                      <property role="TrG5h" value="copy" />
                      <node concept="3Tqbb2" id="hRNaM8P" role="1tU5fm" />
                      <node concept="2YIFZM" id="hRNaM8Q" role="33vP2m">
                        <ref role="1Pybhc" to="w1kc:~CopyUtil" resolve="CopyUtil" />
                        <ref role="37wK5l" to="w1kc:~CopyUtil.copy(org.jetbrains.mps.openapi.model.SNode,java.util.Map,boolean):org.jetbrains.mps.openapi.model.SNode" resolve="copy" />
                        <node concept="37vLTw" id="3GM_nagT_gf" role="37wK5m">
                          <ref role="3cqZAo" node="hRNaM8D" resolve="node" />
                        </node>
                        <node concept="37vLTw" id="ORe5oE9ero" role="37wK5m">
                          <ref role="3cqZAo" node="hLFgf6J" resolve="myMap" />
                        </node>
                        <node concept="3clFbT" id="hRNaM8V" role="37wK5m">
                          <property role="3clFbU" value="true" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="2Gpval" id="hRNaM8W" role="3cqZAp">
                    <node concept="2GrKxI" id="hRNaM8X" role="2Gsz3X">
                      <property role="TrG5h" value="a" />
                    </node>
                    <node concept="2OqwBi" id="hRNaM8Y" role="2GsD0m">
                      <node concept="37vLTw" id="3GM_nagTzDg" role="2Oq$k0">
                        <ref role="3cqZAo" node="hRNaM8O" resolve="copy" />
                      </node>
                      <node concept="2Rf3mk" id="hRNaM90" role="2OqNvi">
                        <node concept="1xMEDy" id="hRNaM91" role="1xVPHs">
                          <node concept="chp4Y" id="hSdkOEA" role="ri$Ld">
                            <ref role="cht4Q" to="tp5g:hSdkHD7" resolve="INodeAnnotation" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3clFbS" id="hRNaM93" role="2LFqv$">
                      <node concept="3clFbF" id="hRNaM94" role="3cqZAp">
                        <node concept="2OqwBi" id="hRNaM95" role="3clFbG">
                          <node concept="2GrUjf" id="hRNaM96" role="2Oq$k0">
                            <ref role="2Gs0qQ" node="hRNaM8X" resolve="a" />
                          </node>
                          <node concept="1PgB_6" id="hRNaM97" role="2OqNvi" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="hRNaM98" role="3cqZAp">
                    <node concept="2OqwBi" id="2n9zn0CqMGQ" role="3clFbG">
                      <node concept="37vLTw" id="ORe5oE9e$o" role="2Oq$k0">
                        <ref role="3cqZAo" node="hLFg6DL" resolve="myModel" />
                      </node>
                      <node concept="liA8E" id="2n9zn0CqMGR" role="2OqNvi">
                        <ref role="37wK5l" to="mhbf:~SModel.addRootNode(org.jetbrains.mps.openapi.model.SNode):void" resolve="addRootNode" />
                        <node concept="37vLTw" id="3GM_nagT$Ce" role="37wK5m">
                          <ref role="3cqZAo" node="hRNaM8O" resolve="copy" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="hRNaM9h" role="3cqZAp">
                    <node concept="2OqwBi" id="hRNaM9i" role="3clFbG">
                      <node concept="37vLTw" id="ORe5oE9eHp" role="2Oq$k0">
                        <ref role="3cqZAo" node="hLFgf6O" resolve="myCopies" />
                      </node>
                      <node concept="TSZUe" id="i05PXdA" role="2OqNvi">
                        <node concept="37vLTw" id="3GM_nagTu0P" role="25WWJ7">
                          <ref role="3cqZAo" node="hRNaM8O" resolve="copy" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="2OqwBi" id="5wEedBrYWXP" role="2Oq$k0">
              <node concept="37vLTw" id="5wEedBrYRXC" role="2Oq$k0">
                <ref role="3cqZAo" node="hPjx680" resolve="myProject" />
              </node>
              <node concept="liA8E" id="5wEedBrYYLK" role="2OqNvi">
                <ref role="37wK5l" to="z1c3:~Project.getModelAccess():org.jetbrains.mps.openapi.module.ModelAccess" resolve="getModelAccess" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="hLFg0dc" role="3clF46">
        <property role="TrG5h" value="id" />
        <node concept="17QB3L" id="1FgNkkIalyN" role="1tU5fm" />
      </node>
      <node concept="3cqZAl" id="hLFg0de" role="3clF45" />
      <node concept="3uibUv" id="hLFg0df" role="Sfmx6">
        <ref role="3uigEE" to="wyt6:~Exception" resolve="Exception" />
      </node>
    </node>
    <node concept="2tJIrI" id="ORe5oE9clp" role="jymVt" />
    <node concept="3clFb_" id="hLFgrfm" role="jymVt">
      <property role="TrG5h" value="getNodeById" />
      <node concept="3clFbS" id="hLFgrfo" role="3clF47">
        <node concept="3cpWs6" id="hLFgrfJ" role="3cqZAp">
          <node concept="3EllGN" id="i1xB$H4" role="3cqZAk">
            <node concept="37vLTw" id="ORe5oE9dt_" role="3ElQJh">
              <ref role="3cqZAo" node="hLFgf6J" resolve="myMap" />
            </node>
            <node concept="2OqwBi" id="2n9zn0CqM$U" role="3ElVtu">
              <node concept="37vLTw" id="ORe5oE9dFx" role="2Oq$k0">
                <ref role="3cqZAo" node="hLFg6DL" resolve="myModel" />
              </node>
              <node concept="liA8E" id="2n9zn0CqM$V" role="2OqNvi">
                <ref role="37wK5l" to="mhbf:~SModel.getNode(org.jetbrains.mps.openapi.model.SNodeId):org.jetbrains.mps.openapi.model.SNode" resolve="getNode" />
                <node concept="2YIFZM" id="2n9zn0CqM$W" role="37wK5m">
                  <ref role="37wK5l" to="w1kc:~SNodeId.fromString(java.lang.String):jetbrains.mps.smodel.SNodeId" resolve="fromString" />
                  <ref role="1Pybhc" to="w1kc:~SNodeId" resolve="SNodeId" />
                  <node concept="37vLTw" id="2BHiRxgmgl2" role="37wK5m">
                    <ref role="3cqZAo" node="hLFgrfL" resolve="id" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="hLFgrfn" role="1B3o_S" />
      <node concept="37vLTG" id="hLFgrfL" role="3clF46">
        <property role="TrG5h" value="id" />
        <node concept="17QB3L" id="1FgNkkIalyQ" role="1tU5fm" />
      </node>
      <node concept="3Tqbb2" id="hLFgrfN" role="3clF45" />
    </node>
    <node concept="2tJIrI" id="ORe5oE9dbo" role="jymVt" />
    <node concept="3clFb_" id="hLFg$wA" role="jymVt">
      <property role="TrG5h" value="getRealNodeById" />
      <node concept="3Tqbb2" id="hLFg$wY" role="3clF45" />
      <node concept="37vLTG" id="hLFg$wW" role="3clF46">
        <property role="TrG5h" value="id" />
        <node concept="17QB3L" id="1FgNkkIalyT" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="hLFg$wC" role="3clF47">
        <node concept="3cpWs6" id="hLFg$wU" role="3cqZAp">
          <node concept="2OqwBi" id="2n9zn0CqMzq" role="3cqZAk">
            <node concept="37vLTw" id="ORe5oE9dT8" role="2Oq$k0">
              <ref role="3cqZAo" node="hLFg6DL" resolve="myModel" />
            </node>
            <node concept="liA8E" id="2n9zn0CqMzr" role="2OqNvi">
              <ref role="37wK5l" to="mhbf:~SModel.getNode(org.jetbrains.mps.openapi.model.SNodeId):org.jetbrains.mps.openapi.model.SNode" resolve="getNode" />
              <node concept="2YIFZM" id="2n9zn0CqMzs" role="37wK5m">
                <ref role="37wK5l" to="w1kc:~SNodeId.fromString(java.lang.String):jetbrains.mps.smodel.SNodeId" resolve="fromString" />
                <ref role="1Pybhc" to="w1kc:~SNodeId" resolve="SNodeId" />
                <node concept="37vLTw" id="2BHiRxgl9pb" role="37wK5m">
                  <ref role="3cqZAo" node="hLFg$wW" resolve="id" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="hLFg$wB" role="1B3o_S" />
    </node>
    <node concept="3Tm1VV" id="hLFfHcY" role="1B3o_S" />
  </node>
  <node concept="312cEu" id="hPMdj4e">
    <property role="TrG5h" value="BaseEditorTestBody" />
    <property role="1sVAO0" value="true" />
    <node concept="3UR2Jj" id="7Uk8E1kG$_e" role="lGtFl">
      <node concept="TZ5HA" id="7Uk8E1kG$_f" role="TZ5H$">
        <node concept="1dT_AC" id="7Uk8E1kG$_g" role="1dT_Ay">
          <property role="1dT_AB" value="Common ancestor for all generated EditorTestCase instances" />
        </node>
      </node>
      <node concept="TZ5HA" id="7Uk8E1kG_s0" role="TZ5H$">
        <node concept="1dT_AC" id="7Uk8E1kG_s1" role="1dT_Ay">
          <property role="1dT_AB" value="TODO must be moved up to the platform level: the MPSNodeEditor is availalbe only in ide" />
        </node>
      </node>
    </node>
    <node concept="Wx3nA" id="4rqOdQ4gXZH" role="jymVt">
      <property role="TrG5h" value="DATA_MANAGER" />
      <node concept="3Tm6S6" id="4rqOdQ4gXZI" role="1B3o_S" />
      <node concept="2ShNRf" id="4rqOdQ4gXZM" role="33vP2m">
        <node concept="1pGfFk" id="4rqOdQ4gXZO" role="2ShVmc">
          <ref role="37wK5l" to="btn2:~DataManagerImpl.&lt;init&gt;()" resolve="DataManagerImpl" />
        </node>
      </node>
      <node concept="3uibUv" id="4rqOdQ4gXZK" role="1tU5fm">
        <ref role="3uigEE" to="ddhc:~DataManager" resolve="DataManager" />
      </node>
    </node>
    <node concept="2tJIrI" id="ORe5oE9MAI" role="jymVt" />
    <node concept="312cEg" id="ORe5oE8EJ3" role="jymVt">
      <property role="34CwA1" value="false" />
      <property role="eg7rD" value="false" />
      <property role="TrG5h" value="myCurrentEditorComponent" />
      <property role="3TUv4t" value="false" />
      <node concept="3Tm6S6" id="ORe5oE9qTo" role="1B3o_S" />
      <node concept="3uibUv" id="7Uk8E1kFTlT" role="1tU5fm">
        <ref role="3uigEE" to="cj4x:~EditorComponent" resolve="EditorComponent" />
      </node>
    </node>
    <node concept="312cEg" id="ORe5oE9CMg" role="jymVt">
      <property role="34CwA1" value="false" />
      <property role="eg7rD" value="false" />
      <property role="TrG5h" value="myEditor" />
      <property role="3TUv4t" value="false" />
      <node concept="3Tmbuc" id="4Ksr1K1aq_t" role="1B3o_S" />
      <node concept="3uibUv" id="ORe5oE9CLK" role="1tU5fm">
        <ref role="3uigEE" to="cj4x:~Editor" resolve="Editor" />
      </node>
    </node>
    <node concept="312cEg" id="4wzlvyewbW2" role="jymVt">
      <property role="34CwA1" value="false" />
      <property role="eg7rD" value="false" />
      <property role="TrG5h" value="myFileNodeEditor" />
      <property role="3TUv4t" value="false" />
      <node concept="3Tm6S6" id="ORe5oE9IMD" role="1B3o_S" />
      <node concept="3uibUv" id="4wzlvyewbVW" role="1tU5fm">
        <ref role="3uigEE" to="k3nr:~MPSFileNodeEditor" resolve="MPSFileNodeEditor" />
      </node>
    </node>
    <node concept="312cEg" id="hSPZLlg" role="jymVt">
      <property role="TrG5h" value="myBefore" />
      <node concept="3Tm6S6" id="hSPZLlh" role="1B3o_S" />
      <node concept="3Tqbb2" id="hSPZNt4" role="1tU5fm" />
    </node>
    <node concept="312cEg" id="hSPZOK6" role="jymVt">
      <property role="TrG5h" value="myResult" />
      <node concept="3Tm6S6" id="hSPZOK7" role="1B3o_S" />
      <node concept="3Tqbb2" id="hSPZP9i" role="1tU5fm" />
    </node>
    <node concept="312cEg" id="hSQ1pHb" role="jymVt">
      <property role="TrG5h" value="myStart" />
      <node concept="3Tmbuc" id="hTDGZPK" role="1B3o_S" />
      <node concept="3uibUv" id="hSQ1rDg" role="1tU5fm">
        <ref role="3uigEE" node="hQFSbBs" resolve="CellReference" />
      </node>
    </node>
    <node concept="312cEg" id="hSQ1tXe" role="jymVt">
      <property role="TrG5h" value="myFinish" />
      <node concept="3Tmbuc" id="hTDH0Z0" role="1B3o_S" />
      <node concept="3uibUv" id="hSQ1uZF" role="1tU5fm">
        <ref role="3uigEE" node="hQFSbBs" resolve="CellReference" />
      </node>
    </node>
    <node concept="2tJIrI" id="1gM9fJkXTvj" role="jymVt" />
    <node concept="3clFb_" id="4cFHg$8nt7E" role="jymVt">
      <property role="TrG5h" value="testMethodImpl" />
      <property role="1EzhhJ" value="true" />
      <node concept="3uibUv" id="4cFHg$8nt7Z" role="Sfmx6">
        <ref role="3uigEE" to="wyt6:~Exception" resolve="Exception" />
      </node>
      <node concept="3cqZAl" id="4cFHg$8nt7F" role="3clF45" />
      <node concept="3Tm1VV" id="4cFHg$8nt7G" role="1B3o_S" />
      <node concept="3clFbS" id="4cFHg$8nt7H" role="3clF47" />
    </node>
    <node concept="2tJIrI" id="7Uk8E1kGxkX" role="jymVt" />
    <node concept="3clFb_" id="hSPZQwW" role="jymVt">
      <property role="TrG5h" value="initEditor" />
      <node concept="P$JXv" id="ORe5oE8YRX" role="lGtFl">
        <node concept="TZ5HI" id="ORe5oE8YRY" role="3nqlJM">
          <node concept="TZ5HA" id="ORe5oE8YRZ" role="3HnX3l">
            <node concept="1dT_AC" id="ORe5oE8ZH1" role="1dT_Ay">
              <property role="1dT_AB" value="use #initEditorComponent instead" />
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="ORe5oE8YS0" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Deprecated" resolve="Deprecated" />
      </node>
      <node concept="3Tmbuc" id="5s44y2Llkfw" role="1B3o_S" />
      <node concept="3clFbS" id="hSPZQwZ" role="3clF47">
        <node concept="34ab3g" id="4_5pru_JJC9" role="3cqZAp">
          <property role="35gtTG" value="info" />
          <node concept="Xl_RD" id="4_5pru_JJCb" role="34bqiv">
            <property role="Xl_RC" value="Initializing editor" />
          </node>
        </node>
        <node concept="3cpWs8" id="52zUwV2Vtaf" role="3cqZAp">
          <node concept="3cpWsn" id="52zUwV2Vtag" role="3cpWs9">
            <property role="TrG5h" value="ts" />
            <property role="3TUv4t" value="true" />
            <node concept="10Q1$e" id="52zUwV2Vtah" role="1tU5fm">
              <node concept="3uibUv" id="4w5CHoiFkcj" role="10Q1$1">
                <ref role="3uigEE" to="wyt6:~Throwable" resolve="Throwable" />
              </node>
            </node>
            <node concept="2ShNRf" id="52zUwV2Vv7y" role="33vP2m">
              <node concept="3$_iS1" id="52zUwV2Vxex" role="2ShVmc">
                <node concept="3$GHV9" id="52zUwV2Vxez" role="3$GQph">
                  <node concept="3cmrfG" id="52zUwV2VxkM" role="3$I4v7">
                    <property role="3cmrfH" value="1" />
                  </node>
                </node>
                <node concept="3uibUv" id="4w5CHoiFkkq" role="3$_nBY">
                  <ref role="3uigEE" to="wyt6:~Throwable" resolve="Throwable" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="4DN08aZ_lm_" role="3cqZAp">
          <node concept="2YIFZM" id="1gM9fJkY2hr" role="3clFbG">
            <ref role="37wK5l" to="3a50:~ThreadUtils.runInUIThreadAndWait(java.lang.Runnable):java.lang.Exception" resolve="runInUIThreadAndWait" />
            <ref role="1Pybhc" to="3a50:~ThreadUtils" resolve="ThreadUtils" />
            <node concept="2ShNRf" id="1gM9fJkY2hs" role="37wK5m">
              <node concept="YeOm9" id="1gM9fJkY2ht" role="2ShVmc">
                <node concept="1Y3b0j" id="1gM9fJkY2hu" role="YeSDq">
                  <property role="2bfB8j" value="true" />
                  <ref role="1Y3XeK" to="wyt6:~Runnable" resolve="Runnable" />
                  <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
                  <node concept="3clFb_" id="1gM9fJkY2hv" role="jymVt">
                    <property role="1EzhhJ" value="false" />
                    <property role="TrG5h" value="run" />
                    <node concept="3cqZAl" id="1gM9fJkY2hw" role="3clF45" />
                    <node concept="3Tm1VV" id="1gM9fJkY2hx" role="1B3o_S" />
                    <node concept="3clFbS" id="1gM9fJkY2hy" role="3clF47">
                      <node concept="SfApY" id="1gM9fJkY2hz" role="3cqZAp">
                        <node concept="3clFbS" id="1gM9fJkY2h$" role="SfCbr">
                          <node concept="3clFbF" id="1gM9fJkY2h_" role="3cqZAp">
                            <node concept="2OqwBi" id="1gM9fJkY2hA" role="3clFbG">
                              <node concept="liA8E" id="1gM9fJkY2hB" role="2OqNvi">
                                <ref role="37wK5l" node="4DN08aZ_lkS" resolve="doInitEditor" />
                                <node concept="37vLTw" id="1gM9fJkY2hC" role="37wK5m">
                                  <ref role="3cqZAo" node="hSPZSEt" resolve="before" />
                                </node>
                                <node concept="37vLTw" id="1gM9fJkY2hD" role="37wK5m">
                                  <ref role="3cqZAo" node="hSPZUf5" resolve="after" />
                                </node>
                              </node>
                              <node concept="Xjq3P" id="1gM9fJkY2hE" role="2Oq$k0">
                                <ref role="1HBi2w" node="hPMdj4e" resolve="BaseEditorTestBody" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node concept="TDmWw" id="1gM9fJkY2hF" role="TEbGg">
                          <node concept="3clFbS" id="1gM9fJkY2hG" role="TDEfX">
                            <node concept="3clFbF" id="1gM9fJkY2hH" role="3cqZAp">
                              <node concept="37vLTI" id="1gM9fJkY2hI" role="3clFbG">
                                <node concept="AH0OO" id="1gM9fJkY2hJ" role="37vLTJ">
                                  <node concept="3cmrfG" id="1gM9fJkY2hK" role="AHEQo">
                                    <property role="3cmrfH" value="0" />
                                  </node>
                                  <node concept="37vLTw" id="1gM9fJkY2hL" role="AHHXb">
                                    <ref role="3cqZAo" node="52zUwV2Vtag" resolve="ts" />
                                  </node>
                                </node>
                                <node concept="37vLTw" id="1gM9fJkY2hM" role="37vLTx">
                                  <ref role="3cqZAo" node="1gM9fJkY2hN" resolve="t" />
                                </node>
                              </node>
                            </node>
                          </node>
                          <node concept="3cpWsn" id="1gM9fJkY2hN" role="TDEfY">
                            <property role="TrG5h" value="t" />
                            <node concept="3uibUv" id="1gM9fJkY2hO" role="1tU5fm">
                              <ref role="3uigEE" to="wyt6:~Throwable" resolve="Throwable" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="2AHcQZ" id="1gM9fJkY2hP" role="2AJF6D">
                      <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                    </node>
                  </node>
                  <node concept="3Tm1VV" id="1gM9fJkY2hQ" role="1B3o_S" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="SfApY" id="4ojx_DmfO__" role="3cqZAp">
          <node concept="3clFbS" id="4ojx_DmfO_A" role="SfCbr">
            <node concept="3clFbF" id="4ojx_Dmf4wn" role="3cqZAp">
              <node concept="1rXfSq" id="4ojx_Dmf4wl" role="3clFbG">
                <ref role="37wK5l" node="17A$fe9mbSD" resolve="flushEDTEvents" />
              </node>
            </node>
          </node>
          <node concept="TDmWw" id="4ojx_DmfO_t" role="TEbGg">
            <node concept="3clFbS" id="4ojx_DmfO_u" role="TDEfX">
              <node concept="3clFbF" id="4ojx_DmfRkP" role="3cqZAp">
                <node concept="37vLTI" id="4ojx_DmfRCT" role="3clFbG">
                  <node concept="37vLTw" id="4ojx_DmfRGv" role="37vLTx">
                    <ref role="3cqZAo" node="4ojx_DmfO_v" resolve="e" />
                  </node>
                  <node concept="AH0OO" id="4ojx_DmfRom" role="37vLTJ">
                    <node concept="3cmrfG" id="4ojx_DmfRrS" role="AHEQo">
                      <property role="3cmrfH" value="0" />
                    </node>
                    <node concept="37vLTw" id="4ojx_DmfRkO" role="AHHXb">
                      <ref role="3cqZAo" node="52zUwV2Vtag" resolve="ts" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3cpWsn" id="4ojx_DmfO_v" role="TDEfY">
              <property role="TrG5h" value="e" />
              <node concept="3uibUv" id="4ojx_DmfO_w" role="1tU5fm">
                <ref role="3uigEE" to="t6h5:~InvocationTargetException" resolve="InvocationTargetException" />
              </node>
            </node>
          </node>
          <node concept="TDmWw" id="4ojx_DmfO_x" role="TEbGg">
            <node concept="3clFbS" id="4ojx_DmfO_y" role="TDEfX">
              <node concept="3clFbF" id="4ojx_DmfROJ" role="3cqZAp">
                <node concept="37vLTI" id="4ojx_DmfRXs" role="3clFbG">
                  <node concept="37vLTw" id="4ojx_DmfS12" role="37vLTx">
                    <ref role="3cqZAo" node="4ojx_DmfO_z" resolve="e" />
                  </node>
                  <node concept="AH0OO" id="4ojx_DmfRSg" role="37vLTJ">
                    <node concept="3cmrfG" id="4ojx_DmfRWw" role="AHEQo">
                      <property role="3cmrfH" value="0" />
                    </node>
                    <node concept="37vLTw" id="4ojx_DmfROI" role="AHHXb">
                      <ref role="3cqZAo" node="52zUwV2Vtag" resolve="ts" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3cpWsn" id="4ojx_DmfO_z" role="TDEfY">
              <property role="TrG5h" value="e" />
              <node concept="3uibUv" id="4ojx_DmfO_$" role="1tU5fm">
                <ref role="3uigEE" to="wyt6:~InterruptedException" resolve="InterruptedException" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbH" id="4ojx_DmfNHe" role="3cqZAp" />
        <node concept="3clFbJ" id="52zUwV2VAEF" role="3cqZAp">
          <node concept="3clFbS" id="52zUwV2VAEI" role="3clFbx">
            <node concept="YS8fn" id="52zUwV2VD3V" role="3cqZAp">
              <node concept="2ShNRf" id="4w5CHoiFUFY" role="YScLw">
                <node concept="1pGfFk" id="4w5CHoiFVMT" role="2ShVmc">
                  <ref role="37wK5l" to="wyt6:~RuntimeException.&lt;init&gt;(java.lang.String,java.lang.Throwable)" resolve="RuntimeException" />
                  <node concept="Xl_RD" id="4w5CHoiFW16" role="37wK5m">
                    <property role="Xl_RC" value="Exception while initializing the editor" />
                  </node>
                  <node concept="AH0OO" id="4w5CHoiFXrW" role="37wK5m">
                    <node concept="3cmrfG" id="4w5CHoiFXtn" role="AHEQo">
                      <property role="3cmrfH" value="0" />
                    </node>
                    <node concept="37vLTw" id="4w5CHoiFX9s" role="AHHXb">
                      <ref role="3cqZAo" node="52zUwV2Vtag" resolve="ts" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3y3z36" id="52zUwV2VCOy" role="3clFbw">
            <node concept="10Nm6u" id="52zUwV2VCZU" role="3uHU7w" />
            <node concept="AH0OO" id="52zUwV2VC2R" role="3uHU7B">
              <node concept="3cmrfG" id="52zUwV2VC3y" role="AHEQo">
                <property role="3cmrfH" value="0" />
              </node>
              <node concept="37vLTw" id="52zUwV2VBZ5" role="AHHXb">
                <ref role="3cqZAo" node="52zUwV2Vtag" resolve="ts" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbH" id="4ojx_DmfHQn" role="3cqZAp" />
        <node concept="3cpWs6" id="hSUN8xT" role="3cqZAp">
          <node concept="37vLTw" id="ORe5oE9Eaw" role="3cqZAk">
            <ref role="3cqZAo" node="ORe5oE9CMg" resolve="myEditor" />
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="hSPZSEt" role="3clF46">
        <property role="TrG5h" value="before" />
        <property role="3TUv4t" value="true" />
        <node concept="17QB3L" id="1FgNkkIamhS" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="hSPZUf5" role="3clF46">
        <property role="TrG5h" value="after" />
        <property role="3TUv4t" value="true" />
        <node concept="17QB3L" id="1FgNkkIamhT" role="1tU5fm" />
      </node>
      <node concept="3uibUv" id="3Y1sPZ9Y4fB" role="3clF45">
        <ref role="3uigEE" to="cj4x:~Editor" resolve="Editor" />
      </node>
    </node>
    <node concept="2tJIrI" id="ORe5oE8RU1" role="jymVt" />
    <node concept="3clFb_" id="ORe5oE8VAn" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="initEditorComponent" />
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <node concept="3clFbS" id="ORe5oE8VAq" role="3clF47">
        <node concept="3clFbF" id="ORe5oE8YBf" role="3cqZAp">
          <node concept="1rXfSq" id="ORe5oE8YBe" role="3clFbG">
            <ref role="37wK5l" node="hSPZQwW" resolve="initEditor" />
            <node concept="37vLTw" id="ORe5oE8YMY" role="37wK5m">
              <ref role="3cqZAo" node="ORe5oE8WUY" resolve="before" />
            </node>
            <node concept="37vLTw" id="ORe5oE8YQS" role="37wK5m">
              <ref role="3cqZAo" node="ORe5oE8XC5" resolve="after" />
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="ORe5oEaCjA" role="3cqZAp">
          <node concept="37vLTw" id="ORe5oEaHVD" role="3cqZAk">
            <ref role="3cqZAo" node="ORe5oE8EJ3" resolve="myCurrentEditorComponent" />
          </node>
        </node>
      </node>
      <node concept="3Tmbuc" id="ORe5oE8Uf2" role="1B3o_S" />
      <node concept="3uibUv" id="7Uk8E1kG8gS" role="3clF45">
        <ref role="3uigEE" to="cj4x:~EditorComponent" resolve="EditorComponent" />
      </node>
      <node concept="37vLTG" id="ORe5oE8WUY" role="3clF46">
        <property role="TrG5h" value="before" />
        <node concept="17QB3L" id="ORe5oE8WUX" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="ORe5oE8XC5" role="3clF46">
        <property role="TrG5h" value="after" />
        <node concept="17QB3L" id="ORe5oE8Ynz" role="1tU5fm" />
      </node>
    </node>
    <node concept="2tJIrI" id="ORe5oE8LdN" role="jymVt" />
    <node concept="3clFb_" id="4DN08aZ_lkS" role="jymVt">
      <property role="TrG5h" value="doInitEditor" />
      <node concept="3clFbS" id="4DN08aZ_lkV" role="3clF47">
        <node concept="3clFbF" id="4DN08aZ_lkW" role="3cqZAp">
          <node concept="1rXfSq" id="ORe5oE9r$U" role="3clFbG">
            <ref role="37wK5l" node="hLFg0c8" resolve="addNodeById" />
            <node concept="37vLTw" id="2BHiRxglRFD" role="37wK5m">
              <ref role="3cqZAo" node="4DN08aZ_lmt" resolve="before" />
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="4DN08aZ_ll1" role="3cqZAp">
          <node concept="3clFbS" id="4DN08aZ_ll2" role="3clFbx">
            <node concept="3clFbF" id="4DN08aZ_ll3" role="3cqZAp">
              <node concept="1rXfSq" id="ORe5oE9rzJ" role="3clFbG">
                <ref role="37wK5l" node="hLFg0c8" resolve="addNodeById" />
                <node concept="37vLTw" id="2BHiRxgmaSQ" role="37wK5m">
                  <ref role="3cqZAo" node="4DN08aZ_lmv" resolve="after" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3fqX7Q" id="4DN08aZ_ll8" role="3clFbw">
            <node concept="2OqwBi" id="4DN08aZ_ll9" role="3fr31v">
              <node concept="37vLTw" id="2BHiRxgm71m" role="2Oq$k0">
                <ref role="3cqZAo" node="4DN08aZ_lmv" resolve="after" />
              </node>
              <node concept="liA8E" id="4DN08aZ_llb" role="2OqNvi">
                <ref role="37wK5l" to="wyt6:~String.equals(java.lang.Object):boolean" resolve="equals" />
                <node concept="Xl_RD" id="4DN08aZ_llc" role="37wK5m">
                  <property role="Xl_RC" value="" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1KUoCiqb5zm" role="3cqZAp">
          <node concept="2OqwBi" id="1KUoCiqb5zn" role="3clFbG">
            <node concept="2OqwBi" id="2eZyLQFQ4Xh" role="2Oq$k0">
              <node concept="37vLTw" id="2eZyLQFQ4gE" role="2Oq$k0">
                <ref role="3cqZAo" node="hPjx680" resolve="myProject" />
              </node>
              <node concept="liA8E" id="2eZyLQFQ5Yv" role="2OqNvi">
                <ref role="37wK5l" to="z1c3:~Project.getModelAccess():org.jetbrains.mps.openapi.module.ModelAccess" resolve="getModelAccess" />
              </node>
            </node>
            <node concept="liA8E" id="1KUoCiqb5zp" role="2OqNvi">
              <ref role="37wK5l" to="lui2:~ModelAccess.runWriteAction(java.lang.Runnable):void" resolve="runWriteAction" />
              <node concept="1bVj0M" id="1KUoCiqb5zq" role="37wK5m">
                <node concept="3clFbS" id="1KUoCiqb5zr" role="1bW5cS">
                  <node concept="3clFbF" id="1KUoCiqb5zs" role="3cqZAp">
                    <node concept="37vLTI" id="1KUoCiqb5zt" role="3clFbG">
                      <node concept="37vLTw" id="ORe5oE8dCW" role="37vLTJ">
                        <ref role="3cqZAo" node="hSPZLlg" resolve="myBefore" />
                      </node>
                      <node concept="1rXfSq" id="ORe5oE8dwg" role="37vLTx">
                        <ref role="37wK5l" node="hLFgrfm" resolve="getNodeById" />
                        <node concept="37vLTw" id="2BHiRxgmqzu" role="37wK5m">
                          <ref role="3cqZAo" node="4DN08aZ_lmt" resolve="before" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="1KUoCiqb5z_" role="3cqZAp">
                    <node concept="37vLTI" id="1KUoCiqb5zA" role="3clFbG">
                      <node concept="37vLTw" id="ORe5oE8dLR" role="37vLTJ">
                        <ref role="3cqZAo" node="hSQ1pHb" resolve="myStart" />
                      </node>
                      <node concept="1rXfSq" id="ORe5oE8dee" role="37vLTx">
                        <ref role="37wK5l" node="hSQ1z8e" resolve="findCellReference" />
                        <node concept="1rXfSq" id="ORe5oE8dnk" role="37wK5m">
                          <ref role="37wK5l" node="hLFg$wA" resolve="getRealNodeById" />
                          <node concept="37vLTw" id="2BHiRxghfF9" role="37wK5m">
                            <ref role="3cqZAo" node="4DN08aZ_lmt" resolve="before" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbJ" id="5XB$uk$8Ar8" role="3cqZAp">
                    <node concept="3clFbS" id="5XB$uk$8Arb" role="3clFbx">
                      <node concept="YS8fn" id="5XB$uk$8Euc" role="3cqZAp">
                        <node concept="2ShNRf" id="5XB$uk$8ERc" role="YScLw">
                          <node concept="1pGfFk" id="5XB$uk$9ceU" role="2ShVmc">
                            <ref role="37wK5l" to="wyt6:~IllegalStateException.&lt;init&gt;(java.lang.String)" resolve="IllegalStateException" />
                            <node concept="Xl_RD" id="5feSwfTDQkO" role="37wK5m">
                              <property role="Xl_RC" value="Cannot find cell reference in the test case 'before'" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3clFbC" id="5XB$uk$8Dzu" role="3clFbw">
                      <node concept="37vLTw" id="ORe5oE8d5u" role="3uHU7B">
                        <ref role="3cqZAo" node="hSQ1pHb" resolve="myStart" />
                      </node>
                      <node concept="10Nm6u" id="5XB$uk$8E0J" role="3uHU7w" />
                    </node>
                  </node>
                  <node concept="3clFbJ" id="1KUoCiqb5zL" role="3cqZAp">
                    <node concept="3clFbS" id="1KUoCiqb5zM" role="3clFbx">
                      <node concept="3clFbF" id="1KUoCiqb5zN" role="3cqZAp">
                        <node concept="37vLTI" id="1KUoCiqb5zO" role="3clFbG">
                          <node concept="37vLTw" id="ORe5oE8c8K" role="37vLTJ">
                            <ref role="3cqZAo" node="hSPZOK6" resolve="myResult" />
                          </node>
                          <node concept="1rXfSq" id="ORe5oE8cjj" role="37vLTx">
                            <ref role="37wK5l" node="hLFgrfm" resolve="getNodeById" />
                            <node concept="37vLTw" id="2BHiRxglBQL" role="37wK5m">
                              <ref role="3cqZAo" node="4DN08aZ_lmv" resolve="after" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="3clFbF" id="1KUoCiqb5zW" role="3cqZAp">
                        <node concept="37vLTI" id="1KUoCiqb5zX" role="3clFbG">
                          <node concept="37vLTw" id="ORe5oE8bEk" role="37vLTJ">
                            <ref role="3cqZAo" node="hSQ1tXe" resolve="myFinish" />
                          </node>
                          <node concept="1rXfSq" id="ORe5oE8csS" role="37vLTx">
                            <ref role="37wK5l" node="hSQ1z8e" resolve="findCellReference" />
                            <node concept="1rXfSq" id="ORe5oE8cAz" role="37wK5m">
                              <ref role="37wK5l" node="hLFg$wA" resolve="getRealNodeById" />
                              <node concept="37vLTw" id="2BHiRxgm8Ve" role="37wK5m">
                                <ref role="3cqZAo" node="4DN08aZ_lmv" resolve="after" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3fqX7Q" id="1KUoCiqb5$8" role="3clFbw">
                      <node concept="2OqwBi" id="1KUoCiqb5$9" role="3fr31v">
                        <node concept="liA8E" id="1KUoCiqb5$a" role="2OqNvi">
                          <ref role="37wK5l" to="wyt6:~String.equals(java.lang.Object):boolean" resolve="equals" />
                          <node concept="Xl_RD" id="1KUoCiqb5$b" role="37wK5m">
                            <property role="Xl_RC" value="" />
                          </node>
                        </node>
                        <node concept="37vLTw" id="2BHiRxgma9H" role="2Oq$k0">
                          <ref role="3cqZAo" node="4DN08aZ_lmv" resolve="after" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="4wzlvyewfQZ" role="3cqZAp">
                    <node concept="37vLTI" id="4wzlvyewgwk" role="3clFbG">
                      <node concept="1rXfSq" id="4wzlvyewh0L" role="37vLTx">
                        <ref role="37wK5l" node="5s44y2LjDLb" resolve="openEditor" />
                      </node>
                      <node concept="37vLTw" id="4wzlvyewfQX" role="37vLTJ">
                        <ref role="3cqZAo" node="4wzlvyewbW2" resolve="myFileNodeEditor" />
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="ORe5oE9Fqa" role="3cqZAp">
                    <node concept="37vLTI" id="ORe5oE9Fqc" role="3clFbG">
                      <node concept="2OqwBi" id="ORe5oE9EZe" role="37vLTx">
                        <node concept="37vLTw" id="ORe5oE9EZf" role="2Oq$k0">
                          <ref role="3cqZAo" node="4wzlvyewbW2" resolve="myFileNodeEditor" />
                        </node>
                        <node concept="liA8E" id="ORe5oE9EZg" role="2OqNvi">
                          <ref role="37wK5l" to="k3nr:~MPSFileNodeEditor.getNodeEditor():jetbrains.mps.openapi.editor.Editor" resolve="getNodeEditor" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="ORe5oE9FFH" role="37vLTJ">
                        <ref role="3cqZAo" node="ORe5oE9CMg" resolve="myEditor" />
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="7Uk8E1kG1RD" role="3cqZAp">
                    <node concept="37vLTI" id="7Uk8E1kG1RF" role="3clFbG">
                      <node concept="2OqwBi" id="7Uk8E1kFS8s" role="37vLTx">
                        <node concept="37vLTw" id="7Uk8E1kFS8t" role="2Oq$k0">
                          <ref role="3cqZAo" node="ORe5oE9CMg" resolve="myEditor" />
                        </node>
                        <node concept="liA8E" id="7Uk8E1kFS8u" role="2OqNvi">
                          <ref role="37wK5l" to="cj4x:~Editor.getCurrentEditorComponent():jetbrains.mps.openapi.editor.EditorComponent" resolve="getCurrentEditorComponent" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="7Uk8E1kG1RJ" role="37vLTJ">
                        <ref role="3cqZAo" node="ORe5oE8EJ3" resolve="myCurrentEditorComponent" />
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbJ" id="ORe5oE989K" role="3cqZAp">
                    <node concept="3clFbS" id="ORe5oE989M" role="3clFbx">
                      <node concept="YS8fn" id="ORe5oE98UO" role="3cqZAp">
                        <node concept="2ShNRf" id="ORe5oE98Z6" role="YScLw">
                          <node concept="1pGfFk" id="ORe5oE9a6o" role="2ShVmc">
                            <ref role="37wK5l" to="wyt6:~IllegalArgumentException.&lt;init&gt;(java.lang.String)" resolve="IllegalArgumentException" />
                            <node concept="3cpWs3" id="ORe5oE9aoS" role="37wK5m">
                              <node concept="37vLTw" id="ORe5oE9ay0" role="3uHU7w">
                                <ref role="3cqZAo" node="ORe5oE8EJ3" resolve="myCurrentEditorComponent" />
                              </node>
                              <node concept="Xl_RD" id="ORe5oE9aaL" role="3uHU7B">
                                <property role="Xl_RC" value="The component is not an instance of NodeEditorComponent: " />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3fqX7Q" id="ORe5oE98kz" role="3clFbw">
                      <node concept="2ZW3vV" id="ORe5oE98J5" role="3fr31v">
                        <node concept="3uibUv" id="ORe5oE98N2" role="2ZW6by">
                          <ref role="3uigEE" to="exr9:~NodeEditorComponent" resolve="NodeEditorComponent" />
                        </node>
                        <node concept="37vLTw" id="7Uk8E1kG6yw" role="2ZW6bz">
                          <ref role="3cqZAo" node="ORe5oE8EJ3" resolve="myCurrentEditorComponent" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3cpWs8" id="7Uk8E1kFXMK" role="3cqZAp">
                    <node concept="3cpWsn" id="7Uk8E1kFXML" role="3cpWs9">
                      <property role="TrG5h" value="component" />
                      <node concept="3uibUv" id="7Uk8E1kFXMJ" role="1tU5fm">
                        <ref role="3uigEE" to="exr9:~NodeEditorComponent" resolve="NodeEditorComponent" />
                      </node>
                      <node concept="10QFUN" id="7Uk8E1kFXMM" role="33vP2m">
                        <node concept="3uibUv" id="7Uk8E1kFXMN" role="10QFUM">
                          <ref role="3uigEE" to="exr9:~NodeEditorComponent" resolve="NodeEditorComponent" />
                        </node>
                        <node concept="37vLTw" id="7Uk8E1kG6GH" role="10QFUP">
                          <ref role="3cqZAo" node="ORe5oE8EJ3" resolve="myCurrentEditorComponent" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="NIU5cJ2wok" role="3cqZAp">
                    <node concept="2OqwBi" id="NIU5cJ2yyE" role="3clFbG">
                      <node concept="37vLTw" id="7Uk8E1kG0jd" role="2Oq$k0">
                        <ref role="3cqZAo" node="7Uk8E1kFXML" resolve="component" />
                      </node>
                      <node concept="liA8E" id="NIU5cJ2LTu" role="2OqNvi">
                        <ref role="37wK5l" to="dxuu:~JComponent.addNotify():void" resolve="addNotify" />
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="38XxgEIV_IF" role="3cqZAp">
                    <node concept="2OqwBi" id="38XxgEIV_Zd" role="3clFbG">
                      <node concept="37vLTw" id="38XxgEIV_ID" role="2Oq$k0">
                        <ref role="3cqZAo" node="7Uk8E1kFXML" resolve="component" />
                      </node>
                      <node concept="liA8E" id="38XxgEIVAEg" role="2OqNvi">
                        <ref role="37wK5l" to="z60i:~Component.setSize(java.awt.Dimension):void" resolve="setSize" />
                        <node concept="2OqwBi" id="38XxgEIVB8b" role="37wK5m">
                          <node concept="37vLTw" id="38XxgEIVARy" role="2Oq$k0">
                            <ref role="3cqZAo" node="7Uk8E1kFXML" resolve="component" />
                          </node>
                          <node concept="liA8E" id="38XxgEIVCuQ" role="2OqNvi">
                            <ref role="37wK5l" to="dxuu:~JComponent.getPreferredSize():java.awt.Dimension" resolve="getPreferredSize" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="NIU5cJ2MhH" role="3cqZAp">
                    <node concept="2OqwBi" id="NIU5cJ2MhI" role="3clFbG">
                      <node concept="37vLTw" id="7Uk8E1kG0nK" role="2Oq$k0">
                        <ref role="3cqZAo" node="7Uk8E1kFXML" resolve="component" />
                      </node>
                      <node concept="liA8E" id="NIU5cJ2Q52" role="2OqNvi">
                        <ref role="37wK5l" to="z60i:~Container.validate():void" resolve="validate" />
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="7Uk8E1kMe_r" role="3cqZAp">
                    <node concept="37vLTI" id="7Uk8E1kMe_t" role="3clFbG">
                      <node concept="2OqwBi" id="7Uk8E1kMee8" role="37vLTx">
                        <node concept="liA8E" id="7Uk8E1kMee9" role="2OqNvi">
                          <ref role="37wK5l" node="hSdDcc3" resolve="setupSelection" />
                          <node concept="37vLTw" id="7Uk8E1kMeea" role="37wK5m">
                            <ref role="3cqZAo" node="7Uk8E1kFXML" resolve="component" />
                          </node>
                        </node>
                        <node concept="37vLTw" id="7Uk8E1kMeeb" role="2Oq$k0">
                          <ref role="3cqZAo" node="hSQ1pHb" resolve="myStart" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="7Uk8E1kMf1X" role="37vLTJ">
                        <ref role="3cqZAo" node="ORe5oE8EJ3" resolve="myCurrentEditorComponent" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="4DN08aZ_lmt" role="3clF46">
        <property role="TrG5h" value="before" />
        <node concept="17QB3L" id="4DN08aZ_lmu" role="1tU5fm" />
      </node>
      <node concept="3uibUv" id="4DN08aZ_lmx" role="Sfmx6">
        <ref role="3uigEE" to="wyt6:~Exception" resolve="Exception" />
      </node>
      <node concept="3Tm6S6" id="4DN08aZ_lmM" role="1B3o_S" />
      <node concept="3cqZAl" id="4DN08aZ_lmL" role="3clF45" />
      <node concept="37vLTG" id="4DN08aZ_lmv" role="3clF46">
        <property role="TrG5h" value="after" />
        <node concept="17QB3L" id="4DN08aZ_lmw" role="1tU5fm" />
      </node>
    </node>
    <node concept="2tJIrI" id="5XB$uk$kT6y" role="jymVt" />
    <node concept="3clFb_" id="hSQ1z8e" role="jymVt">
      <property role="TrG5h" value="findCellReference" />
      <node concept="3clFbS" id="hSQ1z8h" role="3clF47">
        <node concept="3cpWs8" id="hSQ1WVh" role="3cqZAp">
          <node concept="3cpWsn" id="hSQ1WVi" role="3cpWs9">
            <property role="TrG5h" value="annotations" />
            <node concept="2I9FWS" id="hSQ1WVj" role="1tU5fm">
              <ref role="2I9WkF" to="tp5g:hSLIFSi" resolve="AnonymousCellAnnotation" />
            </node>
            <node concept="2OqwBi" id="hSQ2bpB" role="33vP2m">
              <node concept="37vLTw" id="2BHiRxghgCR" role="2Oq$k0">
                <ref role="3cqZAo" node="hSQ1RwT" resolve="node" />
              </node>
              <node concept="2Rf3mk" id="hSQ2bpD" role="2OqNvi">
                <node concept="1xMEDy" id="hSQ2bpE" role="1xVPHs">
                  <node concept="chp4Y" id="hSQCFnP" role="ri$Ld">
                    <ref role="cht4Q" to="tp5g:hSLIFSi" resolve="AnonymousCellAnnotation" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="hSQ2eYZ" role="3cqZAp">
          <node concept="2OqwBi" id="hSQ2hDA" role="3clFbw">
            <node concept="37vLTw" id="3GM_nagT$pr" role="2Oq$k0">
              <ref role="3cqZAo" node="hSQ1WVi" resolve="annotations" />
            </node>
            <node concept="1v1jN8" id="hSQ2il6" role="2OqNvi" />
          </node>
          <node concept="3clFbS" id="hSQ2eZ0" role="3clFbx">
            <node concept="3cpWs6" id="hSQ2iUI" role="3cqZAp">
              <node concept="10Nm6u" id="hSQ2jiV" role="3cqZAk" />
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="hSQ2l8C" role="3cqZAp">
          <node concept="2ShNRf" id="hSQ2lG4" role="3cqZAk">
            <node concept="1pGfFk" id="hSQ2mY8" role="2ShVmc">
              <ref role="37wK5l" node="hQFSbBu" resolve="CellReference" />
              <node concept="1rXfSq" id="ORe5oEaqUz" role="37wK5m">
                <ref role="37wK5l" node="hLFgrfm" resolve="getNodeById" />
                <node concept="2OqwBi" id="5nAzUdZieZP" role="37wK5m">
                  <node concept="2OqwBi" id="5nAzUdZieZQ" role="2Oq$k0">
                    <node concept="liA8E" id="24cAaiUz$fT" role="2OqNvi">
                      <ref role="37wK5l" to="mhbf:~SNode.getNodeId():org.jetbrains.mps.openapi.model.SNodeId" resolve="getNodeId" />
                    </node>
                    <node concept="2JrnkZ" id="5nAzUdZieZR" role="2Oq$k0">
                      <node concept="2OqwBi" id="5nAzUdZieZS" role="2JrQYb">
                        <node concept="2OqwBi" id="5nAzUdZieZT" role="2Oq$k0">
                          <node concept="1uHKPH" id="5nAzUdZieZV" role="2OqNvi" />
                          <node concept="37vLTw" id="3GM_nagTtyF" role="2Oq$k0">
                            <ref role="3cqZAo" node="hSQ1WVi" resolve="annotations" />
                          </node>
                        </node>
                        <node concept="1mfA1w" id="5nAzUdZieZW" role="2OqNvi" />
                      </node>
                    </node>
                  </node>
                  <node concept="liA8E" id="5nAzUdZieZY" role="2OqNvi">
                    <ref role="37wK5l" to="wyt6:~Object.toString():java.lang.String" resolve="toString" />
                  </node>
                </node>
              </node>
              <node concept="2OqwBi" id="hSQ2Axk" role="37wK5m">
                <node concept="1uHKPH" id="i2nX0cU" role="2OqNvi" />
                <node concept="37vLTw" id="3GM_nagTx5t" role="2Oq$k0">
                  <ref role="3cqZAo" node="hSQ1WVi" resolve="annotations" />
                </node>
              </node>
              <node concept="37vLTw" id="ORe5oEarKg" role="37wK5m">
                <ref role="3cqZAo" node="hLFgf6J" resolve="myMap" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="1FgNkkIapeQ" role="1B3o_S" />
      <node concept="37vLTG" id="hSQ1RwT" role="3clF46">
        <property role="TrG5h" value="node" />
        <node concept="3Tqbb2" id="hSQ1RwU" role="1tU5fm" />
      </node>
      <node concept="3uibUv" id="hSQ1NZy" role="3clF45">
        <ref role="3uigEE" node="hQFSbBs" resolve="CellReference" />
      </node>
    </node>
    <node concept="2tJIrI" id="5XB$uk$kOKH" role="jymVt" />
    <node concept="3clFb_" id="hSQ0YJ0" role="jymVt">
      <property role="TrG5h" value="checkAssertion" />
      <node concept="3Tmbuc" id="5s44y2Lmu5h" role="1B3o_S" />
      <node concept="3uibUv" id="4v$aKYF29Gk" role="Sfmx6">
        <ref role="3uigEE" to="wyt6:~Throwable" resolve="Throwable" />
      </node>
      <node concept="3cqZAl" id="hSQ0YJ1" role="3clF45" />
      <node concept="3clFbS" id="hSQ0YJ3" role="3clF47">
        <node concept="3cpWs8" id="4v$aKYF29FR" role="3cqZAp">
          <node concept="3cpWsn" id="4v$aKYF29FS" role="3cpWs9">
            <property role="TrG5h" value="throwable" />
            <node concept="10Nm6u" id="4v$aKYF29Gg" role="33vP2m" />
            <node concept="3uibUv" id="4v$aKYF29FT" role="1tU5fm">
              <ref role="3uigEE" to="wyt6:~Throwable" resolve="Throwable" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5A5jZrz6Tw$" role="3cqZAp">
          <node concept="1rXfSq" id="5A5jZrz6Twz" role="3clFbG">
            <ref role="37wK5l" node="5A5jZrz6Sq4" resolve="flushEvents" />
          </node>
        </node>
        <node concept="3SKdUt" id="4OzBQ_jqDDA" role="3cqZAp">
          <node concept="3SKdUq" id="4OzBQ_jqDNz" role="3SKWNk">
            <property role="3SKdUp" value="FIXME why do we need model write here?" />
          </node>
        </node>
        <node concept="3clFbF" id="1gM9fJkYMnM" role="3cqZAp">
          <node concept="2YIFZM" id="1gM9fJkYMz4" role="3clFbG">
            <ref role="37wK5l" to="3a50:~ThreadUtils.runInUIThreadAndWait(java.lang.Runnable):java.lang.Exception" resolve="runInUIThreadAndWait" />
            <ref role="1Pybhc" to="3a50:~ThreadUtils" resolve="ThreadUtils" />
            <node concept="1bVj0M" id="1gM9fJkYNgK" role="37wK5m">
              <node concept="3clFbS" id="1gM9fJkYNgL" role="1bW5cS">
                <node concept="3clFbF" id="4_5pru_GBvs" role="3cqZAp">
                  <node concept="2OqwBi" id="4_5pru_GCeG" role="3clFbG">
                    <node concept="2OqwBi" id="4OzBQ_jq8f1" role="2Oq$k0">
                      <node concept="37vLTw" id="4OzBQ_jq83a" role="2Oq$k0">
                        <ref role="3cqZAo" node="hPjx680" resolve="myProject" />
                      </node>
                      <node concept="liA8E" id="4OzBQ_jq8CZ" role="2OqNvi">
                        <ref role="37wK5l" to="z1c3:~Project.getModelAccess():org.jetbrains.mps.openapi.module.ModelAccess" resolve="getModelAccess" />
                      </node>
                    </node>
                    <node concept="liA8E" id="4_5pru_GCyt" role="2OqNvi">
                      <ref role="37wK5l" to="lui2:~ModelAccess.runWriteAction(java.lang.Runnable):void" resolve="runWriteAction" />
                      <node concept="1bVj0M" id="4_5pru_GCCY" role="37wK5m">
                        <node concept="3clFbS" id="4_5pru_GCCZ" role="1bW5cS">
                          <node concept="3clFbJ" id="4_5pru_GCD0" role="3cqZAp">
                            <node concept="3clFbS" id="4_5pru_GCD1" role="3clFbx">
                              <node concept="SfApY" id="4_5pru_GCD2" role="3cqZAp">
                                <node concept="TDmWw" id="4_5pru_GCD3" role="TEbGg">
                                  <node concept="3clFbS" id="4_5pru_GCD4" role="TDEfX">
                                    <node concept="3clFbF" id="4_5pru_GCD5" role="3cqZAp">
                                      <node concept="37vLTI" id="4_5pru_GCD6" role="3clFbG">
                                        <node concept="37vLTw" id="4_5pru_GCD7" role="37vLTJ">
                                          <ref role="3cqZAo" node="4v$aKYF29FS" resolve="throwable" />
                                        </node>
                                        <node concept="37vLTw" id="4_5pru_GCD8" role="37vLTx">
                                          <ref role="3cqZAo" node="4_5pru_GCD9" resolve="t" />
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                  <node concept="3cpWsn" id="4_5pru_GCD9" role="TDEfY">
                                    <property role="TrG5h" value="t" />
                                    <node concept="3uibUv" id="4_5pru_GCDa" role="1tU5fm">
                                      <ref role="3uigEE" to="wyt6:~Throwable" resolve="Throwable" />
                                    </node>
                                  </node>
                                </node>
                                <node concept="3clFbS" id="4_5pru_GCDb" role="SfCbr">
                                  <node concept="3cpWs8" id="4_5pru_GCDc" role="3cqZAp">
                                    <node concept="3cpWsn" id="4_5pru_GCDd" role="3cpWs9">
                                      <property role="TrG5h" value="editedNode" />
                                      <node concept="37vLTw" id="1R84b4wyKkB" role="33vP2m">
                                        <ref role="3cqZAo" node="hSPZLlg" resolve="myBefore" />
                                      </node>
                                      <node concept="3Tqbb2" id="4_5pru_GCDe" role="1tU5fm" />
                                    </node>
                                  </node>
                                  <node concept="3cpWs8" id="4OzBQ_jqgyj" role="3cqZAp">
                                    <node concept="3cpWsn" id="4OzBQ_jqgyk" role="3cpWs9">
                                      <property role="TrG5h" value="nm" />
                                      <node concept="3uibUv" id="7ofrMmPaSGX" role="1tU5fm">
                                        <ref role="3uigEE" to="y5e1:7MIYyntE09$" resolve="NodesMatcher" />
                                      </node>
                                      <node concept="2ShNRf" id="4OzBQ_jqgWs" role="33vP2m">
                                        <node concept="1pGfFk" id="4OzBQ_jqyor" role="2ShVmc">
                                          <ref role="37wK5l" to="y5e1:7MIYyntE09A" resolve="NodesMatcher" />
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                  <node concept="3cpWs8" id="4OzBQ_jq_zU" role="3cqZAp">
                                    <node concept="3cpWsn" id="4OzBQ_jq_zV" role="3cpWs9">
                                      <property role="TrG5h" value="diff" />
                                      <node concept="3uibUv" id="4OzBQ_jq_zy" role="1tU5fm">
                                        <ref role="3uigEE" to="33ny:~List" resolve="List" />
                                        <node concept="3uibUv" id="4OzBQ_jq_z_" role="11_B2D">
                                          <ref role="3uigEE" to="y5e1:7MIYyntDZEK" resolve="NodeDifference" />
                                        </node>
                                      </node>
                                      <node concept="2OqwBi" id="4OzBQ_jq_zW" role="33vP2m">
                                        <node concept="37vLTw" id="4OzBQ_jq_zX" role="2Oq$k0">
                                          <ref role="3cqZAo" node="4OzBQ_jqgyk" resolve="nm" />
                                        </node>
                                        <node concept="liA8E" id="4OzBQ_jq_zY" role="2OqNvi">
                                          <ref role="37wK5l" to="y5e1:4OzBQ_jpsdg" resolve="match" />
                                          <node concept="2YIFZM" id="4OzBQ_jq_zZ" role="37wK5m">
                                            <ref role="37wK5l" to="33ny:~Collections.singletonList(java.lang.Object):java.util.List" resolve="singletonList" />
                                            <ref role="1Pybhc" to="33ny:~Collections" resolve="Collections" />
                                            <node concept="37vLTw" id="4OzBQ_jq_$0" role="37wK5m">
                                              <ref role="3cqZAo" node="4_5pru_GCDd" resolve="editedNode" />
                                            </node>
                                          </node>
                                          <node concept="2YIFZM" id="4OzBQ_jq_$1" role="37wK5m">
                                            <ref role="37wK5l" to="33ny:~Collections.singletonList(java.lang.Object):java.util.List" resolve="singletonList" />
                                            <ref role="1Pybhc" to="33ny:~Collections" resolve="Collections" />
                                            <node concept="37vLTw" id="4OzBQ_jq_$2" role="37wK5m">
                                              <ref role="3cqZAo" node="hSPZOK6" resolve="myResult" />
                                            </node>
                                          </node>
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                  <node concept="3vlDli" id="4_5pru_GCD_" role="3cqZAp">
                                    <node concept="10Nm6u" id="4_5pru_GCDA" role="3tpDZB" />
                                    <node concept="37vLTw" id="4OzBQ_jqAz1" role="3tpDZA">
                                      <ref role="3cqZAo" node="4OzBQ_jq_zV" resolve="diff" />
                                    </node>
                                  </node>
                                  <node concept="3clFbJ" id="4_5pru_GCDP" role="3cqZAp">
                                    <node concept="3clFbS" id="4_5pru_GCDQ" role="3clFbx">
                                      <node concept="3clFbF" id="4_5pru_GCDR" role="3cqZAp">
                                        <node concept="2OqwBi" id="4_5pru_GCDS" role="3clFbG">
                                          <node concept="37vLTw" id="4OzBQ_jqCVZ" role="2Oq$k0">
                                            <ref role="3cqZAo" node="hSQ1tXe" resolve="myFinish" />
                                          </node>
                                          <node concept="liA8E" id="4_5pru_GCDW" role="2OqNvi">
                                            <ref role="37wK5l" node="5rZKa_fUlNd" resolve="assertSelectionIsTheSame" />
                                            <node concept="37vLTw" id="ORe5oE9obr" role="37wK5m">
                                              <ref role="3cqZAo" node="ORe5oE8EJ3" resolve="myCurrentEditorComponent" />
                                            </node>
                                            <node concept="10QFUN" id="4OzBQ_jqBpV" role="37wK5m">
                                              <node concept="3rvAFt" id="4OzBQ_jqBAh" role="10QFUM">
                                                <node concept="3Tqbb2" id="4OzBQ_jqBMT" role="3rvQeY" />
                                                <node concept="3Tqbb2" id="4OzBQ_jqBZp" role="3rvSg0" />
                                              </node>
                                              <node concept="2OqwBi" id="4OzBQ_jqAXT" role="10QFUP">
                                                <node concept="37vLTw" id="4OzBQ_jqAPd" role="2Oq$k0">
                                                  <ref role="3cqZAo" node="4OzBQ_jqgyk" resolve="nm" />
                                                </node>
                                                <node concept="liA8E" id="4OzBQ_jqBci" role="2OqNvi">
                                                  <ref role="37wK5l" to="y5e1:4OzBQ_jpU4a" resolve="getMap" />
                                                </node>
                                              </node>
                                            </node>
                                          </node>
                                        </node>
                                      </node>
                                    </node>
                                    <node concept="3y3z36" id="4_5pru_GCE1" role="3clFbw">
                                      <node concept="10Nm6u" id="4_5pru_GCE2" role="3uHU7w" />
                                      <node concept="37vLTw" id="4OzBQ_jqCCv" role="3uHU7B">
                                        <ref role="3cqZAo" node="hSQ1tXe" resolve="myFinish" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node concept="3y3z36" id="4_5pru_GCE6" role="3clFbw">
                              <node concept="37vLTw" id="ORe5oE8eKx" role="3uHU7B">
                                <ref role="3cqZAo" node="hSPZOK6" resolve="myResult" />
                              </node>
                              <node concept="10Nm6u" id="4_5pru_GCEa" role="3uHU7w" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5A5jZrz6Sq8" role="3cqZAp">
          <node concept="1rXfSq" id="5A5jZrz6Sq7" role="3clFbG">
            <ref role="37wK5l" node="5A5jZrz6Sq4" resolve="flushEvents" />
          </node>
        </node>
        <node concept="3clFbJ" id="4v$aKYF29G6" role="3cqZAp">
          <node concept="3clFbS" id="4v$aKYF29G7" role="3clFbx">
            <node concept="YS8fn" id="4v$aKYF29Gh" role="3cqZAp">
              <node concept="37vLTw" id="3GM_nagTwEf" role="YScLw">
                <ref role="3cqZAo" node="4v$aKYF29FS" resolve="throwable" />
              </node>
            </node>
          </node>
          <node concept="3y3z36" id="4v$aKYF29Gb" role="3clFbw">
            <node concept="10Nm6u" id="4v$aKYF29Ge" role="3uHU7w" />
            <node concept="37vLTw" id="3GM_nagTtzQ" role="3uHU7B">
              <ref role="3cqZAo" node="4v$aKYF29FS" resolve="throwable" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="5XB$uk$kMA0" role="jymVt" />
    <node concept="3clFb_" id="4cFHg$8nt7x" role="jymVt">
      <property role="TrG5h" value="testMethod" />
      <node concept="3cqZAl" id="4cFHg$8nt7y" role="3clF45" />
      <node concept="3Tm1VV" id="4cFHg$8nt7z" role="1B3o_S" />
      <node concept="3clFbS" id="4cFHg$8nt7$" role="3clF47">
        <node concept="3cpWs8" id="4Zaa5llGHNy" role="3cqZAp">
          <node concept="3cpWsn" id="4Zaa5llGHNz" role="3cpWs9">
            <property role="TrG5h" value="appender" />
            <node concept="3uibUv" id="4Zaa5llGVPt" role="1tU5fm">
              <ref role="3uigEE" to="zu0:~CachingAppender" resolve="CachingAppender" />
            </node>
            <node concept="1rXfSq" id="4Zaa5llGHN$" role="33vP2m">
              <ref role="37wK5l" node="8$1$D__C$O" resolve="installAppender" />
            </node>
          </node>
        </node>
        <node concept="2GUZhq" id="1l3HexGi0xp" role="3cqZAp">
          <node concept="3clFbS" id="1l3HexGi0xr" role="2GV8ay">
            <node concept="3clFbF" id="4cFHg$8nt7N" role="3cqZAp">
              <node concept="1rXfSq" id="ORe5oE8eTX" role="3clFbG">
                <ref role="37wK5l" node="4cFHg$8nt7E" resolve="testMethodImpl" />
              </node>
            </node>
            <node concept="3clFbF" id="6EPiuA9yk34" role="3cqZAp">
              <node concept="1rXfSq" id="ORe5oEa_vn" role="3clFbG">
                <ref role="37wK5l" node="hSQ0YJ0" resolve="checkAssertion" />
              </node>
            </node>
            <node concept="3clFbF" id="2luRcJo_d3t" role="3cqZAp">
              <node concept="1rXfSq" id="2luRcJo_d3r" role="3clFbG">
                <ref role="37wK5l" node="2luRcJo$68D" resolve="dispose" />
              </node>
            </node>
            <node concept="3clFbF" id="4Zaa5llGVx0" role="3cqZAp">
              <node concept="2OqwBi" id="4Zaa5llGVBx" role="3clFbG">
                <node concept="37vLTw" id="4Zaa5llGVwY" role="2Oq$k0">
                  <ref role="3cqZAo" node="4Zaa5llGHNz" resolve="appender" />
                </node>
                <node concept="liA8E" id="4Zaa5llGVHg" role="2OqNvi">
                  <ref role="37wK5l" to="zu0:~CachingAppender.sealEvents():void" resolve="sealEvents" />
                </node>
              </node>
            </node>
            <node concept="3clFbJ" id="4Zaa5llGW3M" role="3cqZAp">
              <node concept="3clFbS" id="4Zaa5llGW3O" role="3clFbx">
                <node concept="YS8fn" id="4Zaa5llGWB9" role="3cqZAp">
                  <node concept="2ShNRf" id="4Zaa5llGWG2" role="YScLw">
                    <node concept="1pGfFk" id="4Zaa5llGYtw" role="2ShVmc">
                      <ref role="37wK5l" to="l9ag:~UncleanTestExecutionException.&lt;init&gt;(jetbrains.mps.testbench.util.Output...)" resolve="UncleanTestExecutionException" />
                      <node concept="37vLTw" id="4Zaa5llGZ_7" role="37wK5m">
                        <ref role="3cqZAo" node="4Zaa5llGHNz" resolve="appender" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="2OqwBi" id="4Zaa5llGWop" role="3clFbw">
                <node concept="37vLTw" id="4Zaa5llGWi7" role="2Oq$k0">
                  <ref role="3cqZAo" node="4Zaa5llGHNz" resolve="appender" />
                </node>
                <node concept="liA8E" id="4Zaa5llGWuh" role="2OqNvi">
                  <ref role="37wK5l" to="zu0:~CachingAppender.isNotEmpty():boolean" resolve="isNotEmpty" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbS" id="1l3HexGi0xs" role="2GVbov">
            <node concept="3clFbF" id="4Zaa5llGI7C" role="3cqZAp">
              <node concept="1rXfSq" id="4Zaa5llGI7D" role="3clFbG">
                <ref role="37wK5l" node="8$1$D__LNI" resolve="uninstallAppender" />
                <node concept="37vLTw" id="4Zaa5llGI7E" role="37wK5m">
                  <ref role="3cqZAo" node="4Zaa5llGHNz" resolve="appender" />
                </node>
              </node>
            </node>
            <node concept="3cpWs8" id="5QS$Mto5BI4" role="3cqZAp">
              <node concept="3cpWsn" id="5QS$Mto5BI5" role="3cpWs9">
                <property role="TrG5h" value="ts" />
                <property role="3TUv4t" value="true" />
                <node concept="10Q1$e" id="5QS$Mto5BI6" role="1tU5fm">
                  <node concept="3uibUv" id="5QS$Mto5BI7" role="10Q1$1">
                    <ref role="3uigEE" to="wyt6:~Throwable" resolve="Throwable" />
                  </node>
                </node>
                <node concept="2ShNRf" id="5QS$Mto5BI8" role="33vP2m">
                  <node concept="3$_iS1" id="5QS$Mto5BI9" role="2ShVmc">
                    <node concept="3$GHV9" id="5QS$Mto5BIa" role="3$GQph">
                      <node concept="3cmrfG" id="5QS$Mto5BIb" role="3$I4v7">
                        <property role="3cmrfH" value="1" />
                      </node>
                    </node>
                    <node concept="3uibUv" id="5QS$Mto5BIc" role="3$_nBY">
                      <ref role="3uigEE" to="wyt6:~Throwable" resolve="Throwable" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbF" id="1l3HexGi0Mr" role="3cqZAp">
              <node concept="2OqwBi" id="1l3HexGi1DQ" role="3clFbG">
                <node concept="2OqwBi" id="1l3HexGi0Qv" role="2Oq$k0">
                  <node concept="37vLTw" id="1l3HexGi0Mq" role="2Oq$k0">
                    <ref role="3cqZAo" node="hPjx680" resolve="myProject" />
                  </node>
                  <node concept="liA8E" id="1l3HexGi1BN" role="2OqNvi">
                    <ref role="37wK5l" to="z1c3:~Project.getModelAccess():org.jetbrains.mps.openapi.module.ModelAccess" resolve="getModelAccess" />
                  </node>
                </node>
                <node concept="liA8E" id="1l3HexGi1TC" role="2OqNvi">
                  <ref role="37wK5l" to="lui2:~ModelAccess.runWriteInEDT(java.lang.Runnable):void" resolve="runWriteInEDT" />
                  <node concept="1bVj0M" id="1l3HexGi1Wj" role="37wK5m">
                    <node concept="3clFbS" id="1l3HexGi1Wk" role="1bW5cS">
                      <node concept="SfApY" id="5QS$Mto5C3n" role="3cqZAp">
                        <node concept="3clFbS" id="5QS$Mto5C3p" role="SfCbr">
                          <node concept="3cpWs8" id="1l3HexGi21f" role="3cqZAp">
                            <node concept="3cpWsn" id="1l3HexGi21g" role="3cpWs9">
                              <property role="TrG5h" value="undoManager" />
                              <node concept="3uibUv" id="1l3HexGi21h" role="1tU5fm">
                                <ref role="3uigEE" to="xgff:~UndoManagerImpl" resolve="UndoManagerImpl" />
                              </node>
                              <node concept="10QFUN" id="1l3HexGi2gI" role="33vP2m">
                                <node concept="2YIFZM" id="1l3HexGi2aA" role="10QFUP">
                                  <ref role="37wK5l" to="54q7:~UndoManager.getInstance(com.intellij.openapi.project.Project):com.intellij.openapi.command.undo.UndoManager" resolve="getInstance" />
                                  <ref role="1Pybhc" to="54q7:~UndoManager" resolve="UndoManager" />
                                  <node concept="2YIFZM" id="1l3HexGi9rq" role="37wK5m">
                                    <ref role="37wK5l" to="alof:~ProjectHelper.toIdeaProject(jetbrains.mps.project.Project):com.intellij.openapi.project.Project" resolve="toIdeaProject" />
                                    <ref role="1Pybhc" to="alof:~ProjectHelper" resolve="ProjectHelper" />
                                    <node concept="37vLTw" id="1l3HexGi9zP" role="37wK5m">
                                      <ref role="3cqZAo" node="hPjx680" resolve="myProject" />
                                    </node>
                                  </node>
                                </node>
                                <node concept="3uibUv" id="1l3HexGi2gJ" role="10QFUM">
                                  <ref role="3uigEE" to="xgff:~UndoManagerImpl" resolve="UndoManagerImpl" />
                                </node>
                              </node>
                            </node>
                          </node>
                          <node concept="3cpWs8" id="1l3HexGi4Yu" role="3cqZAp">
                            <node concept="3cpWsn" id="1l3HexGi4Yv" role="3cpWs9">
                              <property role="TrG5h" value="file" />
                              <node concept="3uibUv" id="1l3HexGi4Yw" role="1tU5fm">
                                <ref role="3uigEE" to="oi6x:~MPSNodeVirtualFile" resolve="MPSNodeVirtualFile" />
                              </node>
                              <node concept="2OqwBi" id="1l3HexGi4Yx" role="33vP2m">
                                <node concept="2YIFZM" id="1l3HexGi4Yy" role="2Oq$k0">
                                  <ref role="1Pybhc" to="oi6x:~MPSNodesVirtualFileSystem" resolve="MPSNodesVirtualFileSystem" />
                                  <ref role="37wK5l" to="oi6x:~MPSNodesVirtualFileSystem.getInstance():jetbrains.mps.workbench.nodesFs.MPSNodesVirtualFileSystem" resolve="getInstance" />
                                </node>
                                <node concept="liA8E" id="1l3HexGi4Yz" role="2OqNvi">
                                  <ref role="37wK5l" to="oi6x:~MPSNodesVirtualFileSystem.getFileFor(org.jetbrains.mps.openapi.model.SNode):jetbrains.mps.workbench.nodesFs.MPSNodeVirtualFile" resolve="getFileFor" />
                                  <node concept="2OqwBi" id="1l3HexGi4Y$" role="37wK5m">
                                    <node concept="Xjq3P" id="1l3HexGi4Y_" role="2Oq$k0" />
                                    <node concept="2OwXpG" id="1l3HexGi4YA" role="2OqNvi">
                                      <ref role="2Oxat5" node="hSPZLlg" resolve="myBefore" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                          <node concept="3clFbF" id="1l3HexGi4b$" role="3cqZAp">
                            <node concept="2OqwBi" id="1l3HexGi4hX" role="3clFbG">
                              <node concept="37vLTw" id="1l3HexGi4by" role="2Oq$k0">
                                <ref role="3cqZAo" node="1l3HexGi21g" resolve="undoManager" />
                              </node>
                              <node concept="liA8E" id="1l3HexGi4Tj" role="2OqNvi">
                                <ref role="37wK5l" to="xgff:~UndoManagerImpl.clearUndoRedoQueueInTests(com.intellij.openapi.vfs.VirtualFile):void" resolve="clearUndoRedoQueueInTests" />
                                <node concept="37vLTw" id="1l3HexGi5i7" role="37wK5m">
                                  <ref role="3cqZAo" node="1l3HexGi4Yv" resolve="file" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node concept="TDmWw" id="5QS$Mto5C3q" role="TEbGg">
                          <node concept="3clFbS" id="5QS$Mto5C3s" role="TDEfX">
                            <node concept="3clFbF" id="5QS$Mto5C_N" role="3cqZAp">
                              <node concept="37vLTI" id="5QS$Mto5CWd" role="3clFbG">
                                <node concept="37vLTw" id="5QS$Mto5D2n" role="37vLTx">
                                  <ref role="3cqZAo" node="5QS$Mto5C3u" resolve="t" />
                                </node>
                                <node concept="AH0OO" id="5QS$Mto5CFS" role="37vLTJ">
                                  <node concept="3cmrfG" id="5QS$Mto5CLY" role="AHEQo">
                                    <property role="3cmrfH" value="0" />
                                  </node>
                                  <node concept="37vLTw" id="5QS$Mto5C_M" role="AHHXb">
                                    <ref role="3cqZAo" node="5QS$Mto5BI5" resolve="ts" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                          <node concept="3cpWsn" id="5QS$Mto5C3u" role="TDEfY">
                            <property role="TrG5h" value="t" />
                            <node concept="3uibUv" id="5QS$Mto5Clm" role="1tU5fm">
                              <ref role="3uigEE" to="wyt6:~Throwable" resolve="Throwable" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbJ" id="5QS$Mto5Dgu" role="3cqZAp">
              <node concept="3clFbS" id="5QS$Mto5Dgw" role="3clFbx">
                <node concept="YS8fn" id="5QS$Mto5DL2" role="3cqZAp">
                  <node concept="2ShNRf" id="5QS$Mto5DO7" role="YScLw">
                    <node concept="1pGfFk" id="5QS$Mto5EU$" role="2ShVmc">
                      <ref role="37wK5l" to="wyt6:~RuntimeException.&lt;init&gt;(java.lang.String,java.lang.Throwable)" resolve="RuntimeException" />
                      <node concept="Xl_RD" id="5QS$Mto5EYi" role="37wK5m">
                        <property role="Xl_RC" value="Failure during editor test execution" />
                      </node>
                      <node concept="AH0OO" id="5QS$Mto5Fiw" role="37wK5m">
                        <node concept="3cmrfG" id="5QS$Mto5FlB" role="AHEQo">
                          <property role="3cmrfH" value="0" />
                        </node>
                        <node concept="37vLTw" id="5QS$Mto5Fef" role="AHHXb">
                          <ref role="3cqZAo" node="5QS$Mto5BI5" resolve="ts" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3y3z36" id="5QS$Mto5DAO" role="3clFbw">
                <node concept="10Nm6u" id="5QS$Mto5DDY" role="3uHU7w" />
                <node concept="AH0OO" id="5QS$Mto5DrW" role="3uHU7B">
                  <node concept="3cmrfG" id="5QS$Mto5Dv2" role="AHEQo">
                    <property role="3cmrfH" value="0" />
                  </node>
                  <node concept="37vLTw" id="5QS$Mto5Do1" role="AHHXb">
                    <ref role="3cqZAo" node="5QS$Mto5BI5" resolve="ts" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="4v$aKYF27nA" role="Sfmx6">
        <ref role="3uigEE" to="wyt6:~Throwable" resolve="Throwable" />
      </node>
    </node>
    <node concept="2tJIrI" id="5XB$uk$lrkj" role="jymVt" />
    <node concept="3clFb_" id="2luRcJo$68D" role="jymVt">
      <property role="TrG5h" value="dispose" />
      <node concept="3cqZAl" id="2luRcJo$68F" role="3clF45" />
      <node concept="3Tm6S6" id="2luRcJo$8xC" role="1B3o_S" />
      <node concept="3clFbS" id="2luRcJo$68H" role="3clF47">
        <node concept="3cpWs8" id="5QS$Mto5zx6" role="3cqZAp">
          <node concept="3cpWsn" id="5QS$Mto5zx7" role="3cpWs9">
            <property role="TrG5h" value="ts" />
            <property role="3TUv4t" value="true" />
            <node concept="10Q1$e" id="5QS$Mto5zx8" role="1tU5fm">
              <node concept="3uibUv" id="5QS$Mto5zx9" role="10Q1$1">
                <ref role="3uigEE" to="wyt6:~Throwable" resolve="Throwable" />
              </node>
            </node>
            <node concept="2ShNRf" id="5QS$Mto5zxa" role="33vP2m">
              <node concept="3$_iS1" id="5QS$Mto5zxb" role="2ShVmc">
                <node concept="3$GHV9" id="5QS$Mto5zxc" role="3$GQph">
                  <node concept="3cmrfG" id="5QS$Mto5zxd" role="3$I4v7">
                    <property role="3cmrfH" value="1" />
                  </node>
                </node>
                <node concept="3uibUv" id="5QS$Mto5zxe" role="3$_nBY">
                  <ref role="3uigEE" to="wyt6:~Throwable" resolve="Throwable" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="2luRcJo$gzk" role="3cqZAp">
          <node concept="2YIFZM" id="1gM9fJkY2yw" role="3clFbG">
            <ref role="37wK5l" to="3a50:~ThreadUtils.runInUIThreadAndWait(java.lang.Runnable):java.lang.Exception" resolve="runInUIThreadAndWait" />
            <ref role="1Pybhc" to="3a50:~ThreadUtils" resolve="ThreadUtils" />
            <node concept="1bVj0M" id="1gM9fJkY2yx" role="37wK5m">
              <node concept="3clFbS" id="1gM9fJkY2yy" role="1bW5cS">
                <node concept="3clFbF" id="1gM9fJkY2yz" role="3cqZAp">
                  <node concept="2OqwBi" id="1gM9fJkY2y$" role="3clFbG">
                    <node concept="2OqwBi" id="1gM9fJkY2y_" role="2Oq$k0">
                      <node concept="37vLTw" id="1gM9fJkY2yA" role="2Oq$k0">
                        <ref role="3cqZAo" node="hPjx680" resolve="myProject" />
                      </node>
                      <node concept="liA8E" id="1gM9fJkY2yB" role="2OqNvi">
                        <ref role="37wK5l" to="z1c3:~Project.getModelAccess():org.jetbrains.mps.openapi.module.ModelAccess" resolve="getModelAccess" />
                      </node>
                    </node>
                    <node concept="liA8E" id="1gM9fJkY2yC" role="2OqNvi">
                      <ref role="37wK5l" to="lui2:~ModelAccess.runWriteAction(java.lang.Runnable):void" resolve="runWriteAction" />
                      <node concept="1bVj0M" id="1gM9fJkY2yD" role="37wK5m">
                        <node concept="3clFbS" id="1gM9fJkY2yE" role="1bW5cS">
                          <node concept="SfApY" id="1gM9fJkY2yF" role="3cqZAp">
                            <node concept="3clFbS" id="1gM9fJkY2yG" role="SfCbr">
                              <node concept="3clFbF" id="1gM9fJkY2yH" role="3cqZAp">
                                <node concept="2OqwBi" id="1gM9fJkY2yI" role="3clFbG">
                                  <node concept="37vLTw" id="1gM9fJkY2yJ" role="2Oq$k0">
                                    <ref role="3cqZAo" node="4wzlvyewbW2" resolve="myFileNodeEditor" />
                                  </node>
                                  <node concept="liA8E" id="1gM9fJkY2yK" role="2OqNvi">
                                    <ref role="37wK5l" to="k3nr:~MPSFileNodeEditor.dispose():void" resolve="dispose" />
                                  </node>
                                </node>
                              </node>
                              <node concept="3clFbF" id="1gM9fJkY2yL" role="3cqZAp">
                                <node concept="37vLTI" id="1gM9fJkY2yM" role="3clFbG">
                                  <node concept="10Nm6u" id="1gM9fJkY2yN" role="37vLTx" />
                                  <node concept="37vLTw" id="1gM9fJkY2yO" role="37vLTJ">
                                    <ref role="3cqZAo" node="4wzlvyewbW2" resolve="myFileNodeEditor" />
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node concept="TDmWw" id="1gM9fJkY2yP" role="TEbGg">
                              <node concept="3clFbS" id="1gM9fJkY2yQ" role="TDEfX">
                                <node concept="3clFbF" id="1gM9fJkY2yR" role="3cqZAp">
                                  <node concept="37vLTI" id="1gM9fJkY2yS" role="3clFbG">
                                    <node concept="37vLTw" id="1gM9fJkY2yT" role="37vLTx">
                                      <ref role="3cqZAo" node="1gM9fJkY2yX" resolve="t" />
                                    </node>
                                    <node concept="AH0OO" id="1gM9fJkY2yU" role="37vLTJ">
                                      <node concept="3cmrfG" id="1gM9fJkY2yV" role="AHEQo">
                                        <property role="3cmrfH" value="0" />
                                      </node>
                                      <node concept="37vLTw" id="1gM9fJkY2yW" role="AHHXb">
                                        <ref role="3cqZAo" node="5QS$Mto5zx7" resolve="ts" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                              <node concept="3cpWsn" id="1gM9fJkY2yX" role="TDEfY">
                                <property role="TrG5h" value="t" />
                                <node concept="3uibUv" id="1gM9fJkY2yY" role="1tU5fm">
                                  <ref role="3uigEE" to="wyt6:~Throwable" resolve="Throwable" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="5QS$Mto5_4Z" role="3cqZAp">
          <node concept="3clFbS" id="5QS$Mto5_51" role="3clFbx">
            <node concept="YS8fn" id="5QS$Mto5A4C" role="3cqZAp">
              <node concept="2ShNRf" id="5QS$Mto5A81" role="YScLw">
                <node concept="1pGfFk" id="5QS$Mto5BdN" role="2ShVmc">
                  <ref role="37wK5l" to="wyt6:~RuntimeException.&lt;init&gt;(java.lang.String,java.lang.Throwable)" resolve="RuntimeException" />
                  <node concept="Xl_RD" id="5QS$Mto5BAY" role="37wK5m">
                    <property role="Xl_RC" value="Failure during test disposal" />
                  </node>
                  <node concept="AH0OO" id="5QS$Mto5Blj" role="37wK5m">
                    <node concept="3cmrfG" id="5QS$Mto5Bop" role="AHEQo">
                      <property role="3cmrfH" value="0" />
                    </node>
                    <node concept="37vLTw" id="5QS$Mto5Bhs" role="AHHXb">
                      <ref role="3cqZAo" node="5QS$Mto5zx7" resolve="ts" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3y3z36" id="5QS$Mto5_QF" role="3clFbw">
            <node concept="10Nm6u" id="5QS$Mto5_WL" role="3uHU7w" />
            <node concept="AH0OO" id="5QS$Mto5_IH" role="3uHU7B">
              <node concept="3cmrfG" id="5QS$Mto5_OL" role="AHEQo">
                <property role="3cmrfH" value="0" />
              </node>
              <node concept="37vLTw" id="5QS$Mto5_bk" role="AHHXb">
                <ref role="3cqZAo" node="5QS$Mto5zx7" resolve="ts" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="2luRcJo$haI" role="Sfmx6">
        <ref role="3uigEE" to="wyt6:~InterruptedException" resolve="InterruptedException" />
      </node>
      <node concept="3uibUv" id="2luRcJo$jhX" role="Sfmx6">
        <ref role="3uigEE" to="t6h5:~InvocationTargetException" resolve="InvocationTargetException" />
      </node>
    </node>
    <node concept="2tJIrI" id="5XB$uk$lmYY" role="jymVt" />
    <node concept="3clFb_" id="5s44y2LjDLb" role="jymVt">
      <property role="TrG5h" value="openEditor" />
      <property role="DiZV1" value="false" />
      <node concept="3uibUv" id="4wzlvyewyhE" role="3clF45">
        <ref role="3uigEE" to="k3nr:~MPSFileNodeEditor" resolve="MPSFileNodeEditor" />
      </node>
      <node concept="3clFbS" id="hPMk4hX" role="3clF47">
        <node concept="1gVbGN" id="5s44y2Lm_m_" role="3cqZAp">
          <node concept="2YIFZM" id="1gM9fJkY2Lo" role="1gVkn0">
            <ref role="37wK5l" to="3a50:~ThreadUtils.isInEDT():boolean" resolve="isInEDT" />
            <ref role="1Pybhc" to="3a50:~ThreadUtils" resolve="ThreadUtils" />
          </node>
        </node>
        <node concept="3cpWs8" id="53DOTa2Ji_u" role="3cqZAp">
          <node concept="3cpWsn" id="53DOTa2Ji_v" role="3cpWs9">
            <property role="TrG5h" value="file" />
            <node concept="3uibUv" id="53DOTa2Ji_w" role="1tU5fm">
              <ref role="3uigEE" to="oi6x:~MPSNodeVirtualFile" resolve="MPSNodeVirtualFile" />
            </node>
            <node concept="2OqwBi" id="53DOTa2Jk7p" role="33vP2m">
              <node concept="2YIFZM" id="53DOTa2JjKg" role="2Oq$k0">
                <ref role="37wK5l" to="oi6x:~MPSNodesVirtualFileSystem.getInstance():jetbrains.mps.workbench.nodesFs.MPSNodesVirtualFileSystem" resolve="getInstance" />
                <ref role="1Pybhc" to="oi6x:~MPSNodesVirtualFileSystem" resolve="MPSNodesVirtualFileSystem" />
              </node>
              <node concept="liA8E" id="53DOTa2JkO2" role="2OqNvi">
                <ref role="37wK5l" to="oi6x:~MPSNodesVirtualFileSystem.getFileFor(org.jetbrains.mps.openapi.model.SNode):jetbrains.mps.workbench.nodesFs.MPSNodeVirtualFile" resolve="getFileFor" />
                <node concept="37vLTw" id="ORe5oEa_x2" role="37wK5m">
                  <ref role="3cqZAo" node="hSPZLlg" resolve="myBefore" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="2i7g4YmNuos" role="3cqZAp">
          <node concept="2ShNRf" id="53DOTa2IKPJ" role="3cqZAk">
            <node concept="1pGfFk" id="53DOTa2JcbE" role="2ShVmc">
              <ref role="37wK5l" to="k3nr:~MPSFileNodeEditor.&lt;init&gt;(com.intellij.openapi.project.Project,jetbrains.mps.workbench.nodesFs.MPSNodeVirtualFile)" resolve="MPSFileNodeEditor" />
              <node concept="2YIFZM" id="7htxo9QF0Zl" role="37wK5m">
                <ref role="37wK5l" to="alof:~ProjectHelper.toIdeaProject(jetbrains.mps.project.Project):com.intellij.openapi.project.Project" resolve="toIdeaProject" />
                <ref role="1Pybhc" to="alof:~ProjectHelper" resolve="ProjectHelper" />
                <node concept="37vLTw" id="5s44y2Lk5iF" role="37wK5m">
                  <ref role="3cqZAo" node="hPjx680" resolve="myProject" />
                </node>
              </node>
              <node concept="37vLTw" id="53DOTa2Jlj0" role="37wK5m">
                <ref role="3cqZAo" node="53DOTa2Ji_v" resolve="file" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="5s44y2Lk8Ap" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="1BrKW0d9pS1" role="jymVt" />
    <node concept="3clFb_" id="1BrKW0d9mQ7" role="jymVt">
      <property role="TrG5h" value="getEditorComponent" />
      <node concept="3Tmbuc" id="5s44y2KUj6b" role="1B3o_S" />
      <node concept="3uibUv" id="1BrKW0d9mQ9" role="3clF45">
        <ref role="3uigEE" to="exr9:~EditorComponent" resolve="EditorComponent" />
      </node>
      <node concept="3clFbS" id="1BrKW0d9mPb" role="3clF47">
        <node concept="3cpWs6" id="1BrKW0d9mPA" role="3cqZAp">
          <node concept="10QFUN" id="ORe5oE9uLd" role="3cqZAk">
            <node concept="3uibUv" id="ORe5oE9vvq" role="10QFUM">
              <ref role="3uigEE" to="exr9:~EditorComponent" resolve="EditorComponent" />
            </node>
            <node concept="37vLTw" id="ORe5oE9qfz" role="10QFUP">
              <ref role="3cqZAo" node="ORe5oE8EJ3" resolve="myCurrentEditorComponent" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="ORe5oE9Q2m" role="jymVt" />
    <node concept="3clFb_" id="ORe5oE9OIM" role="jymVt">
      <property role="TrG5h" value="getEditor" />
      <node concept="3Tmbuc" id="ORe5oE9OIN" role="1B3o_S" />
      <node concept="3uibUv" id="ORe5oE9T_O" role="3clF45">
        <ref role="3uigEE" to="cj4x:~Editor" resolve="Editor" />
      </node>
      <node concept="3clFbS" id="ORe5oE9OIP" role="3clF47">
        <node concept="3cpWs6" id="ORe5oE9OIQ" role="3cqZAp">
          <node concept="37vLTw" id="ORe5oE9UuS" role="3cqZAk">
            <ref role="3cqZAo" node="ORe5oE9CMg" resolve="myEditor" />
          </node>
        </node>
      </node>
      <node concept="P$JXv" id="ORe5oE9WPl" role="lGtFl">
        <node concept="TZ5HI" id="ORe5oE9WPm" role="3nqlJM">
          <node concept="TZ5HA" id="ORe5oE9WPn" role="3HnX3l">
            <node concept="1dT_AC" id="ORe5oE9XEe" role="1dT_Ay">
              <property role="1dT_AB" value="no need to refer the editor instance here -- EditorComponent is enough" />
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="ORe5oE9WPo" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Deprecated" resolve="Deprecated" />
      </node>
    </node>
    <node concept="2tJIrI" id="62Gc_ZTmAWP" role="jymVt" />
    <node concept="3clFb_" id="62Gc_ZTmQOm" role="jymVt">
      <property role="TrG5h" value="getProject" />
      <node concept="3uibUv" id="62Gc_ZTnmDy" role="3clF45">
        <ref role="3uigEE" to="z1c3:~Project" resolve="Project" />
      </node>
      <node concept="3Tmbuc" id="62Gc_ZTmUsj" role="1B3o_S" />
      <node concept="3clFbS" id="62Gc_ZTmQOq" role="3clF47">
        <node concept="3cpWs6" id="62Gc_ZTndii" role="3cqZAp">
          <node concept="37vLTw" id="62Gc_ZTngLn" role="3cqZAk">
            <ref role="3cqZAo" node="hPjx680" resolve="myProject" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="5XB$uk$lgv6" role="jymVt" />
    <node concept="3clFb_" id="1BrKW0d98Nv" role="jymVt">
      <property role="TrG5h" value="typeString" />
      <property role="DiZV1" value="false" />
      <node concept="3cqZAl" id="57tnvWhZbJs" role="3clF45" />
      <node concept="37vLTG" id="57tnvWhZbJ0" role="3clF46">
        <property role="TrG5h" value="text" />
        <property role="3TUv4t" value="true" />
        <node concept="17QB3L" id="57tnvWhZbJ1" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="57tnvWhZbJ2" role="3clF47">
        <node concept="3clFbF" id="5s44y2LjtZJ" role="3cqZAp">
          <node concept="2OqwBi" id="5s44y2Ljv71" role="3clFbG">
            <node concept="2ShNRf" id="5s44y2LjtZH" role="2Oq$k0">
              <node concept="1pGfFk" id="5s44y2Ljv1u" role="2ShVmc">
                <ref role="37wK5l" node="5s44y2Lgn6H" resolve="KeyEventsDispatcher" />
                <node concept="Xjq3P" id="62Gc_ZTmpwF" role="37wK5m" />
              </node>
            </node>
            <node concept="liA8E" id="5s44y2Ljvfw" role="2OqNvi">
              <ref role="37wK5l" node="5s44y2LjkVI" resolve="typeString" />
              <node concept="37vLTw" id="5s44y2Ljvoc" role="37wK5m">
                <ref role="3cqZAo" node="57tnvWhZbJ0" resolve="text" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="6BJVJLXprrI" role="Sfmx6">
        <ref role="3uigEE" to="wyt6:~InterruptedException" resolve="InterruptedException" />
      </node>
      <node concept="3uibUv" id="6BJVJLXp_FO" role="Sfmx6">
        <ref role="3uigEE" to="t6h5:~InvocationTargetException" resolve="InvocationTargetException" />
      </node>
      <node concept="3Tmbuc" id="5s44y2Lmi6C" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="2hkYVuDJzCE" role="jymVt" />
    <node concept="3clFb_" id="1BrKW0daATU" role="jymVt">
      <property role="TrG5h" value="pressKeys" />
      <property role="DiZV1" value="false" />
      <node concept="3cqZAl" id="57tnvWhZgPC" role="3clF45" />
      <node concept="37vLTG" id="57tnvWhZgPF" role="3clF46">
        <property role="TrG5h" value="keyStrokes" />
        <property role="3TUv4t" value="true" />
        <node concept="_YKpA" id="57tnvWhZgPG" role="1tU5fm">
          <node concept="17QB3L" id="57tnvWhZgPH" role="_ZDj9" />
        </node>
      </node>
      <node concept="3clFbS" id="57tnvWhZgPI" role="3clF47">
        <node concept="3clFbF" id="5s44y2LiV1D" role="3cqZAp">
          <node concept="2OqwBi" id="5s44y2LiWfK" role="3clFbG">
            <node concept="2ShNRf" id="5s44y2LiV8a" role="2Oq$k0">
              <node concept="1pGfFk" id="5s44y2LiW9S" role="2ShVmc">
                <ref role="37wK5l" node="5s44y2Lgn6H" resolve="KeyEventsDispatcher" />
                <node concept="Xjq3P" id="62Gc_ZToFyD" role="37wK5m" />
              </node>
            </node>
            <node concept="liA8E" id="5s44y2LiWoa" role="2OqNvi">
              <ref role="37wK5l" node="5s44y2LiJ$Z" resolve="pressKeys" />
              <node concept="37vLTw" id="5s44y2LiWx4" role="37wK5m">
                <ref role="3cqZAo" node="57tnvWhZgPF" resolve="keyStrokes" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="6BJVJLXpAgI" role="Sfmx6">
        <ref role="3uigEE" to="wyt6:~InterruptedException" resolve="InterruptedException" />
      </node>
      <node concept="3uibUv" id="6BJVJLXpAgJ" role="Sfmx6">
        <ref role="3uigEE" to="t6h5:~InvocationTargetException" resolve="InvocationTargetException" />
      </node>
      <node concept="3Tmbuc" id="5s44y2Lmg8t" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="2j6lZA3yNA6" role="jymVt" />
    <node concept="3clFb_" id="1BrKW0dbhMX" role="jymVt">
      <property role="TrG5h" value="processMouseEvent" />
      <property role="DiZV1" value="false" />
      <node concept="3uibUv" id="3CVcUJxQGFd" role="3clF45">
        <ref role="3uigEE" to="z60i:~Component" resolve="Component" />
      </node>
      <node concept="37vLTG" id="3CVcUJxQxX1" role="3clF46">
        <property role="TrG5h" value="x" />
        <node concept="10Oyi0" id="3CVcUJxQxX2" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3CVcUJxQxX3" role="3clF46">
        <property role="TrG5h" value="y" />
        <node concept="10Oyi0" id="3CVcUJxQxX4" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3CVcUJxR2CI" role="3clF46">
        <property role="TrG5h" value="eventType" />
        <node concept="10Oyi0" id="3CVcUJxR3lL" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="3CVcUJxQxX9" role="3clF47">
        <node concept="3cpWs6" id="5s44y2Li47x" role="3cqZAp">
          <node concept="2OqwBi" id="5s44y2LissH" role="3cqZAk">
            <node concept="2ShNRf" id="5s44y2LihK8" role="2Oq$k0">
              <node concept="1pGfFk" id="5s44y2LilSs" role="2ShVmc">
                <ref role="37wK5l" node="5s44y2LhRMy" resolve="MouseEventsDispatcher" />
                <node concept="Xjq3P" id="62Gc_ZTpfBt" role="37wK5m" />
              </node>
            </node>
            <node concept="liA8E" id="5s44y2LivSN" role="2OqNvi">
              <ref role="37wK5l" node="5s44y2LhEs2" resolve="processMouseEvent" />
              <node concept="37vLTw" id="5s44y2Lizr3" role="37wK5m">
                <ref role="3cqZAo" node="3CVcUJxQxX1" resolve="x" />
              </node>
              <node concept="37vLTw" id="5s44y2Li$RB" role="37wK5m">
                <ref role="3cqZAo" node="3CVcUJxQxX3" resolve="y" />
              </node>
              <node concept="37vLTw" id="5s44y2LiD_3" role="37wK5m">
                <ref role="3cqZAo" node="3CVcUJxR2CI" resolve="eventType" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="3CVcUJxQxZ8" role="Sfmx6">
        <ref role="3uigEE" to="t6h5:~InvocationTargetException" resolve="InvocationTargetException" />
      </node>
      <node concept="3uibUv" id="3CVcUJxQxZ9" role="Sfmx6">
        <ref role="3uigEE" to="wyt6:~InterruptedException" resolve="InterruptedException" />
      </node>
      <node concept="3Tmbuc" id="5s44y2Lmeaz" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="5s44y2Lo1sl" role="jymVt" />
    <node concept="3clFb_" id="5s44y2Lp5xA" role="jymVt">
      <property role="TrG5h" value="processSecondaryMouseEvent" />
      <property role="DiZV1" value="false" />
      <node concept="3cqZAl" id="5s44y2Lo5Ze" role="3clF45" />
      <node concept="37vLTG" id="5s44y2Lo5Z6" role="3clF46">
        <property role="TrG5h" value="targetComponent" />
        <property role="3TUv4t" value="true" />
        <node concept="3uibUv" id="5s44y2Lo5Z7" role="1tU5fm">
          <ref role="3uigEE" to="z60i:~Component" resolve="Component" />
        </node>
      </node>
      <node concept="37vLTG" id="5s44y2Lo5Z8" role="3clF46">
        <property role="TrG5h" value="x" />
        <node concept="10Oyi0" id="5s44y2Lo5Z9" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="5s44y2Lo5Za" role="3clF46">
        <property role="TrG5h" value="y" />
        <node concept="10Oyi0" id="5s44y2Lo5Zb" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="5s44y2Lo5Zc" role="3clF46">
        <property role="TrG5h" value="eventType" />
        <node concept="10Oyi0" id="5s44y2Lo5Zd" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="5s44y2Lo5Zg" role="3clF47">
        <node concept="3clFbF" id="5s44y2Lp1Y6" role="3cqZAp">
          <node concept="2OqwBi" id="5s44y2LpaiH" role="3clFbG">
            <node concept="2ShNRf" id="5s44y2Lp1Y4" role="2Oq$k0">
              <node concept="1pGfFk" id="5s44y2Lp5uC" role="2ShVmc">
                <ref role="37wK5l" node="5s44y2LhRMy" resolve="MouseEventsDispatcher" />
                <node concept="Xjq3P" id="62Gc_ZTplmt" role="37wK5m" />
              </node>
            </node>
            <node concept="liA8E" id="5s44y2Lpazc" role="2OqNvi">
              <ref role="37wK5l" node="5s44y2Lo_oh" resolve="processSecondaryMouseEvent" />
              <node concept="37vLTw" id="5s44y2LpaGl" role="37wK5m">
                <ref role="3cqZAo" node="5s44y2Lo5Z6" resolve="targetComponent" />
              </node>
              <node concept="37vLTw" id="5s44y2LpaPp" role="37wK5m">
                <ref role="3cqZAo" node="5s44y2Lo5Z8" resolve="x" />
              </node>
              <node concept="37vLTw" id="5s44y2LpaTm" role="37wK5m">
                <ref role="3cqZAo" node="5s44y2Lo5Za" resolve="y" />
              </node>
              <node concept="37vLTw" id="5s44y2Lpb3d" role="37wK5m">
                <ref role="3cqZAo" node="5s44y2Lo5Zc" resolve="eventType" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5s44y2Lo5Zy" role="Sfmx6">
        <ref role="3uigEE" to="t6h5:~InvocationTargetException" resolve="InvocationTargetException" />
      </node>
      <node concept="3uibUv" id="5s44y2Lo5Zz" role="Sfmx6">
        <ref role="3uigEE" to="wyt6:~InterruptedException" resolve="InterruptedException" />
      </node>
      <node concept="3Tmbuc" id="5s44y2Lp7Rh" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="5s44y2Lo333" role="jymVt" />
    <node concept="3clFb_" id="31vHIpQV3lp" role="jymVt">
      <property role="TrG5h" value="invokeIntention" />
      <property role="IEkAT" value="false" />
      <property role="DiZV1" value="false" />
      <property role="od$2w" value="false" />
      <node concept="3clFbS" id="hPMUPe3" role="3clF47">
        <node concept="3cpWs8" id="5QS$Mto5qxe" role="3cqZAp">
          <node concept="3cpWsn" id="5QS$Mto5qxf" role="3cpWs9">
            <property role="TrG5h" value="ts" />
            <property role="3TUv4t" value="true" />
            <node concept="10Q1$e" id="5QS$Mto5qxg" role="1tU5fm">
              <node concept="3uibUv" id="5QS$Mto5qxh" role="10Q1$1">
                <ref role="3uigEE" to="wyt6:~Throwable" resolve="Throwable" />
              </node>
            </node>
            <node concept="2ShNRf" id="5QS$Mto5qxi" role="33vP2m">
              <node concept="3$_iS1" id="5QS$Mto5qxj" role="2ShVmc">
                <node concept="3$GHV9" id="5QS$Mto5qxk" role="3$GQph">
                  <node concept="3cmrfG" id="5QS$Mto5qxl" role="3$I4v7">
                    <property role="3cmrfH" value="1" />
                  </node>
                </node>
                <node concept="3uibUv" id="5QS$Mto5qxm" role="3$_nBY">
                  <ref role="3uigEE" to="wyt6:~Throwable" resolve="Throwable" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="62Gc_ZTlDun" role="3cqZAp">
          <node concept="1rXfSq" id="62Gc_ZTlDul" role="3clFbG">
            <ref role="37wK5l" node="62Gc_ZTkJBT" resolve="runUndoableInEDTAndWait" />
            <node concept="1bVj0M" id="5s44y2Lmlhr" role="37wK5m">
              <node concept="3clFbS" id="5s44y2Lmlhs" role="1bW5cS">
                <node concept="3clFbF" id="5s44y2Lmlt3" role="3cqZAp">
                  <node concept="2OqwBi" id="5s44y2Lmlt4" role="3clFbG">
                    <node concept="liA8E" id="5s44y2Lmlt5" role="2OqNvi">
                      <ref role="37wK5l" to="lui2:~ModelAccess.executeCommand(java.lang.Runnable):void" resolve="executeCommand" />
                      <node concept="1bVj0M" id="5s44y2Lmlt6" role="37wK5m">
                        <node concept="3clFbS" id="5s44y2Lmlt7" role="1bW5cS">
                          <node concept="SfApY" id="5QS$Mto5pgv" role="3cqZAp">
                            <node concept="3clFbS" id="5QS$Mto5pgx" role="SfCbr">
                              <node concept="3clFbF" id="5s44y2Lmlt8" role="3cqZAp">
                                <node concept="2OqwBi" id="5s44y2Lmlt9" role="3clFbG">
                                  <node concept="liA8E" id="5s44y2Lmlta" role="2OqNvi">
                                    <ref role="37wK5l" to="cj4x:~EditorContext.select(org.jetbrains.mps.openapi.model.SNode):void" resolve="select" />
                                    <node concept="37vLTw" id="5s44y2Lmltb" role="37wK5m">
                                      <ref role="3cqZAo" node="hPML6ks" resolve="node" />
                                    </node>
                                  </node>
                                  <node concept="2OqwBi" id="5s44y2Lmltc" role="2Oq$k0">
                                    <node concept="37vLTw" id="ORe5oE9wCn" role="2Oq$k0">
                                      <ref role="3cqZAo" node="ORe5oE8EJ3" resolve="myCurrentEditorComponent" />
                                    </node>
                                    <node concept="liA8E" id="5s44y2Lmltd" role="2OqNvi">
                                      <ref role="37wK5l" to="cj4x:~EditorComponent.getEditorContext():jetbrains.mps.openapi.editor.EditorContext" resolve="getEditorContext" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                              <node concept="3cpWs8" id="5s44y2Lmltf" role="3cqZAp">
                                <node concept="3cpWsn" id="5s44y2Lmltg" role="3cpWs9">
                                  <property role="TrG5h" value="query" />
                                  <node concept="2ShNRf" id="5s44y2Lmlth" role="33vP2m">
                                    <node concept="1pGfFk" id="5s44y2Lmlti" role="2ShVmc">
                                      <ref role="37wK5l" to="91lp:~IntentionsManager$QueryDescriptor.&lt;init&gt;()" resolve="IntentionsManager.QueryDescriptor" />
                                    </node>
                                  </node>
                                  <node concept="3uibUv" id="5s44y2Lmltj" role="1tU5fm">
                                    <ref role="3uigEE" to="91lp:~IntentionsManager$QueryDescriptor" resolve="IntentionsManager.QueryDescriptor" />
                                  </node>
                                </node>
                              </node>
                              <node concept="3clFbF" id="5s44y2Lmltk" role="3cqZAp">
                                <node concept="2OqwBi" id="5s44y2Lmltl" role="3clFbG">
                                  <node concept="37vLTw" id="5s44y2Lmltm" role="2Oq$k0">
                                    <ref role="3cqZAo" node="5s44y2Lmltg" resolve="query" />
                                  </node>
                                  <node concept="liA8E" id="5s44y2Lmltn" role="2OqNvi">
                                    <ref role="37wK5l" to="91lp:~IntentionsManager$QueryDescriptor.setCurrentNodeOnly(boolean):void" resolve="setCurrentNodeOnly" />
                                    <node concept="3clFbT" id="5s44y2Lmlto" role="37wK5m">
                                      <property role="3clFbU" value="true" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                              <node concept="3cpWs8" id="5s44y2Lmltp" role="3cqZAp">
                                <node concept="3cpWsn" id="5s44y2Lmltq" role="3cpWs9">
                                  <property role="TrG5h" value="intentions" />
                                  <node concept="3uibUv" id="5s44y2Lmltr" role="1tU5fm">
                                    <ref role="3uigEE" to="33ny:~Collection" resolve="Collection" />
                                    <node concept="3uibUv" id="5s44y2Lmlts" role="11_B2D">
                                      <ref role="3uigEE" to="18ew:~Pair" resolve="Pair" />
                                      <node concept="3uibUv" id="5s44y2Lmltt" role="11_B2D">
                                        <ref role="3uigEE" to="91lp:~IntentionExecutable" resolve="IntentionExecutable" />
                                      </node>
                                      <node concept="3uibUv" id="5s44y2Lmltu" role="11_B2D">
                                        <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
                                      </node>
                                    </node>
                                  </node>
                                  <node concept="2OqwBi" id="5s44y2Lmltv" role="33vP2m">
                                    <node concept="liA8E" id="5s44y2Lmltw" role="2OqNvi">
                                      <ref role="37wK5l" to="91lp:~IntentionsManager.getAvailableIntentions(jetbrains.mps.intentions.IntentionsManager$QueryDescriptor,org.jetbrains.mps.openapi.model.SNode,jetbrains.mps.openapi.editor.EditorContext):java.util.Collection" resolve="getAvailableIntentions" />
                                      <node concept="37vLTw" id="5s44y2Lmltx" role="37wK5m">
                                        <ref role="3cqZAo" node="5s44y2Lmltg" resolve="query" />
                                      </node>
                                      <node concept="37vLTw" id="5s44y2Lmlty" role="37wK5m">
                                        <ref role="3cqZAo" node="hPML6ks" resolve="node" />
                                      </node>
                                      <node concept="2OqwBi" id="5s44y2Lmltz" role="37wK5m">
                                        <node concept="37vLTw" id="ORe5oE9yiT" role="2Oq$k0">
                                          <ref role="3cqZAo" node="ORe5oE8EJ3" resolve="myCurrentEditorComponent" />
                                        </node>
                                        <node concept="liA8E" id="5s44y2Lmlt_" role="2OqNvi">
                                          <ref role="37wK5l" to="cj4x:~EditorComponent.getEditorContext():jetbrains.mps.openapi.editor.EditorContext" resolve="getEditorContext" />
                                        </node>
                                      </node>
                                    </node>
                                    <node concept="2YIFZM" id="5s44y2LmltA" role="2Oq$k0">
                                      <ref role="37wK5l" to="91lp:~IntentionsManager.getInstance():jetbrains.mps.intentions.IntentionsManager" resolve="getInstance" />
                                      <ref role="1Pybhc" to="91lp:~IntentionsManager" resolve="IntentionsManager" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                              <node concept="1DcWWT" id="5s44y2LmltB" role="3cqZAp">
                                <node concept="3cpWsn" id="5s44y2LmltC" role="1Duv9x">
                                  <property role="TrG5h" value="intention" />
                                  <node concept="3uibUv" id="5s44y2LmltD" role="1tU5fm">
                                    <ref role="3uigEE" to="18ew:~Pair" resolve="Pair" />
                                    <node concept="3uibUv" id="5s44y2LmltE" role="11_B2D">
                                      <ref role="3uigEE" to="91lp:~IntentionExecutable" resolve="IntentionExecutable" />
                                    </node>
                                    <node concept="3uibUv" id="5s44y2LmltF" role="11_B2D">
                                      <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
                                    </node>
                                  </node>
                                </node>
                                <node concept="3clFbS" id="5s44y2LmltG" role="2LFqv$">
                                  <node concept="3clFbJ" id="5s44y2LmltH" role="3cqZAp">
                                    <node concept="2OqwBi" id="5s44y2LmltI" role="3clFbw">
                                      <node concept="2OqwBi" id="5s44y2LmltJ" role="2Oq$k0">
                                        <node concept="2OqwBi" id="5s44y2LmltK" role="2Oq$k0">
                                          <node concept="liA8E" id="5s44y2LmltL" role="2OqNvi">
                                            <ref role="37wK5l" to="91lp:~IntentionExecutable.getDescriptor():jetbrains.mps.intentions.IntentionDescriptor" resolve="getDescriptor" />
                                          </node>
                                          <node concept="2OqwBi" id="5s44y2LmltM" role="2Oq$k0">
                                            <node concept="37vLTw" id="5s44y2LmltN" role="2Oq$k0">
                                              <ref role="3cqZAo" node="5s44y2LmltC" resolve="intention" />
                                            </node>
                                            <node concept="2OwXpG" id="5s44y2LmltO" role="2OqNvi">
                                              <ref role="2Oxat5" to="18ew:~Pair.o1" resolve="o1" />
                                            </node>
                                          </node>
                                        </node>
                                        <node concept="liA8E" id="5s44y2LmltP" role="2OqNvi">
                                          <ref role="37wK5l" to="91lp:~IntentionDescriptor.getPersistentStateKey():java.lang.String" resolve="getPersistentStateKey" />
                                        </node>
                                      </node>
                                      <node concept="liA8E" id="5s44y2LmltQ" role="2OqNvi">
                                        <ref role="37wK5l" to="wyt6:~String.equals(java.lang.Object):boolean" resolve="equals" />
                                        <node concept="37vLTw" id="5s44y2LmltR" role="37wK5m">
                                          <ref role="3cqZAo" node="hPML3bF" resolve="name" />
                                        </node>
                                      </node>
                                    </node>
                                    <node concept="3clFbS" id="5s44y2LmltS" role="3clFbx">
                                      <node concept="3clFbF" id="5s44y2LmltT" role="3cqZAp">
                                        <node concept="2OqwBi" id="5s44y2LmltU" role="3clFbG">
                                          <node concept="2OqwBi" id="5s44y2LmltV" role="2Oq$k0">
                                            <node concept="37vLTw" id="5s44y2LmltW" role="2Oq$k0">
                                              <ref role="3cqZAo" node="5s44y2LmltC" resolve="intention" />
                                            </node>
                                            <node concept="2OwXpG" id="5s44y2LmltX" role="2OqNvi">
                                              <ref role="2Oxat5" to="18ew:~Pair.o1" resolve="o1" />
                                            </node>
                                          </node>
                                          <node concept="liA8E" id="5s44y2LmltY" role="2OqNvi">
                                            <ref role="37wK5l" to="91lp:~IntentionExecutable.execute(org.jetbrains.mps.openapi.model.SNode,jetbrains.mps.openapi.editor.EditorContext):void" resolve="execute" />
                                            <node concept="2OqwBi" id="5s44y2LmltZ" role="37wK5m">
                                              <node concept="37vLTw" id="5s44y2Lmlu0" role="2Oq$k0">
                                                <ref role="3cqZAo" node="5s44y2LmltC" resolve="intention" />
                                              </node>
                                              <node concept="2OwXpG" id="5s44y2Lmlu1" role="2OqNvi">
                                                <ref role="2Oxat5" to="18ew:~Pair.o2" resolve="o2" />
                                              </node>
                                            </node>
                                            <node concept="2OqwBi" id="5s44y2Lmlu2" role="37wK5m">
                                              <node concept="37vLTw" id="ORe5oE9yGW" role="2Oq$k0">
                                                <ref role="3cqZAo" node="ORe5oE8EJ3" resolve="myCurrentEditorComponent" />
                                              </node>
                                              <node concept="liA8E" id="5s44y2Lmlu3" role="2OqNvi">
                                                <ref role="37wK5l" to="cj4x:~EditorComponent.getEditorContext():jetbrains.mps.openapi.editor.EditorContext" resolve="getEditorContext" />
                                              </node>
                                            </node>
                                          </node>
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                </node>
                                <node concept="37vLTw" id="5s44y2Lmlu5" role="1DdaDG">
                                  <ref role="3cqZAo" node="5s44y2Lmltq" resolve="intentions" />
                                </node>
                              </node>
                            </node>
                            <node concept="TDmWw" id="5QS$Mto5pgy" role="TEbGg">
                              <node concept="3clFbS" id="5QS$Mto5pg$" role="TDEfX">
                                <node concept="3clFbF" id="5QS$Mto5rZy" role="3cqZAp">
                                  <node concept="37vLTI" id="5QS$Mto5sNL" role="3clFbG">
                                    <node concept="37vLTw" id="5QS$Mto5t2f" role="37vLTx">
                                      <ref role="3cqZAo" node="5QS$Mto5pgA" resolve="t" />
                                    </node>
                                    <node concept="AH0OO" id="5QS$Mto5ssJ" role="37vLTJ">
                                      <node concept="3cmrfG" id="5QS$Mto5svP" role="AHEQo">
                                        <property role="3cmrfH" value="0" />
                                      </node>
                                      <node concept="37vLTw" id="5QS$Mto5sen" role="AHHXb">
                                        <ref role="3cqZAo" node="5QS$Mto5qxf" resolve="ts" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                              <node concept="3cpWsn" id="5QS$Mto5pgA" role="TDEfY">
                                <property role="TrG5h" value="t" />
                                <node concept="3uibUv" id="5QS$Mto5q5M" role="1tU5fm">
                                  <ref role="3uigEE" to="wyt6:~Throwable" resolve="Throwable" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="2OqwBi" id="5s44y2Lmlu6" role="2Oq$k0">
                      <node concept="37vLTw" id="5s44y2Lmlu7" role="2Oq$k0">
                        <ref role="3cqZAo" node="hPjx680" resolve="myProject" />
                      </node>
                      <node concept="liA8E" id="5s44y2Lmlu8" role="2OqNvi">
                        <ref role="37wK5l" to="z1c3:~Project.getModelAccess():org.jetbrains.mps.openapi.module.ModelAccess" resolve="getModelAccess" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="5QS$Mto5w2E" role="3cqZAp">
          <node concept="3clFbS" id="5QS$Mto5w2G" role="3clFbx">
            <node concept="YS8fn" id="5QS$Mto5t_l" role="3cqZAp">
              <node concept="2ShNRf" id="5QS$Mto5tPw" role="YScLw">
                <node concept="1pGfFk" id="5QS$Mto5v8d" role="2ShVmc">
                  <ref role="37wK5l" to="wyt6:~RuntimeException.&lt;init&gt;(java.lang.String,java.lang.Throwable)" resolve="RuntimeException" />
                  <node concept="Xl_RD" id="5QS$Mto5vcF" role="37wK5m">
                    <property role="Xl_RC" value="Failure during intention invoke" />
                  </node>
                  <node concept="AH0OO" id="5QS$Mto5vwv" role="37wK5m">
                    <node concept="3cmrfG" id="5QS$Mto5vzA" role="AHEQo">
                      <property role="3cmrfH" value="0" />
                    </node>
                    <node concept="37vLTw" id="5QS$Mto5vs3" role="AHHXb">
                      <ref role="3cqZAo" node="5QS$Mto5qxf" resolve="ts" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3y3z36" id="5QS$Mto5xaE" role="3clFbw">
            <node concept="10Nm6u" id="5QS$Mto5xpg" role="3uHU7w" />
            <node concept="AH0OO" id="5QS$Mto5wxL" role="3uHU7B">
              <node concept="3cmrfG" id="5QS$Mto5w$R" role="AHEQo">
                <property role="3cmrfH" value="0" />
              </node>
              <node concept="37vLTw" id="5QS$Mto5wiZ" role="AHHXb">
                <ref role="3cqZAo" node="5QS$Mto5qxf" resolve="ts" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="hPML3bF" role="3clF46">
        <property role="TrG5h" value="name" />
        <property role="3TUv4t" value="true" />
        <node concept="17QB3L" id="1FgNkkIamhU" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="hPML6ks" role="3clF46">
        <property role="TrG5h" value="node" />
        <property role="3TUv4t" value="true" />
        <node concept="3Tqbb2" id="hPML6Df" role="1tU5fm" />
      </node>
      <node concept="3cqZAl" id="hPMKQDy" role="3clF45" />
      <node concept="3Tmbuc" id="5s44y2Llidr" role="1B3o_S" />
      <node concept="3uibUv" id="5s44y2Lmp6_" role="Sfmx6">
        <ref role="3uigEE" to="wyt6:~InterruptedException" resolve="InterruptedException" />
      </node>
      <node concept="3uibUv" id="5s44y2Lmr6E" role="Sfmx6">
        <ref role="3uigEE" to="t6h5:~InvocationTargetException" resolve="InvocationTargetException" />
      </node>
    </node>
    <node concept="2tJIrI" id="5s44y2Lm9TO" role="jymVt" />
    <node concept="3clFb_" id="1BrKW0db0tk" role="jymVt">
      <property role="TrG5h" value="invokeAction" />
      <property role="DiZV1" value="false" />
      <node concept="3cqZAl" id="4rqOdQ4gPWC" role="3clF45" />
      <node concept="37vLTG" id="4rqOdQ4gPWH" role="3clF46">
        <property role="TrG5h" value="actionId" />
        <property role="3TUv4t" value="true" />
        <node concept="17QB3L" id="4rqOdQ4h3nI" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="4rqOdQ4gPWE" role="3clF47">
        <node concept="3cpWs8" id="5s44y2LlH48" role="3cqZAp">
          <node concept="3cpWsn" id="5s44y2LlH49" role="3cpWs9">
            <property role="TrG5h" value="action" />
            <node concept="2OqwBi" id="5s44y2LlH4a" role="33vP2m">
              <node concept="2YIFZM" id="5s44y2LlH4b" role="2Oq$k0">
                <ref role="1Pybhc" to="qkt:~ActionManager" resolve="ActionManager" />
                <ref role="37wK5l" to="qkt:~ActionManager.getInstance():com.intellij.openapi.actionSystem.ActionManager" resolve="getInstance" />
              </node>
              <node concept="liA8E" id="5s44y2LlH4c" role="2OqNvi">
                <ref role="37wK5l" to="qkt:~ActionManager.getAction(java.lang.String):com.intellij.openapi.actionSystem.AnAction" resolve="getAction" />
                <node concept="37vLTw" id="5s44y2LlH4d" role="37wK5m">
                  <ref role="3cqZAo" node="4rqOdQ4gPWH" resolve="actionId" />
                </node>
              </node>
            </node>
            <node concept="3uibUv" id="5s44y2LlH4e" role="1tU5fm">
              <ref role="3uigEE" to="qkt:~AnAction" resolve="AnAction" />
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="5s44y2LlH4f" role="3cqZAp">
          <node concept="3cpWsn" id="5s44y2LlH4g" role="3cpWs9">
            <property role="TrG5h" value="event" />
            <node concept="3uibUv" id="5s44y2LlH4h" role="1tU5fm">
              <ref role="3uigEE" to="qkt:~AnActionEvent" resolve="AnActionEvent" />
            </node>
            <node concept="2YIFZM" id="5s44y2LlH4i" role="33vP2m">
              <ref role="1Pybhc" to="7bx7:~ActionUtils" resolve="ActionUtils" />
              <ref role="37wK5l" to="7bx7:~ActionUtils.createEvent(java.lang.String,com.intellij.openapi.actionSystem.DataContext):com.intellij.openapi.actionSystem.AnActionEvent" resolve="createEvent" />
              <node concept="10M0yZ" id="5s44y2LlH4j" role="37wK5m">
                <ref role="3cqZAo" to="qkt:~ActionPlaces.MAIN_MENU" resolve="MAIN_MENU" />
                <ref role="1PxDUh" to="qkt:~ActionPlaces" resolve="ActionPlaces" />
              </node>
              <node concept="2OqwBi" id="5s44y2LlH4k" role="37wK5m">
                <node concept="37vLTw" id="5s44y2LlH4N" role="2Oq$k0">
                  <ref role="3cqZAo" node="4rqOdQ4gXZH" resolve="DATA_MANAGER" />
                </node>
                <node concept="liA8E" id="5s44y2LlH4m" role="2OqNvi">
                  <ref role="37wK5l" to="ddhc:~DataManager.getDataContext(java.awt.Component):com.intellij.openapi.actionSystem.DataContext" resolve="getDataContext" />
                  <node concept="1rXfSq" id="5s44y2LlH4n" role="37wK5m">
                    <ref role="37wK5l" node="1BrKW0d9mQ7" resolve="getEditorComponent" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="62Gc_ZTlAF8" role="3cqZAp">
          <node concept="1rXfSq" id="62Gc_ZTlAF6" role="3clFbG">
            <ref role="37wK5l" node="62Gc_ZTkJBT" resolve="runUndoableInEDTAndWait" />
            <node concept="1bVj0M" id="5s44y2LlGU0" role="37wK5m">
              <node concept="3clFbS" id="5s44y2LlGU1" role="1bW5cS">
                <node concept="3clFbF" id="5s44y2LlH4P" role="3cqZAp">
                  <node concept="2OqwBi" id="5s44y2LlH4Q" role="3clFbG">
                    <node concept="liA8E" id="5s44y2LlH4R" role="2OqNvi">
                      <ref role="37wK5l" to="qkt:~AnAction.actionPerformed(com.intellij.openapi.actionSystem.AnActionEvent):void" resolve="actionPerformed" />
                      <node concept="37vLTw" id="5s44y2LlH4S" role="37wK5m">
                        <ref role="3cqZAo" node="5s44y2LlH4g" resolve="event" />
                      </node>
                    </node>
                    <node concept="37vLTw" id="5s44y2LlH4T" role="2Oq$k0">
                      <ref role="3cqZAo" node="5s44y2LlH49" resolve="action" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="4rqOdQ4h2Z8" role="Sfmx6">
        <ref role="3uigEE" to="t6h5:~InvocationTargetException" resolve="InvocationTargetException" />
      </node>
      <node concept="3uibUv" id="4rqOdQ4h2Za" role="Sfmx6">
        <ref role="3uigEE" to="wyt6:~InterruptedException" resolve="InterruptedException" />
      </node>
      <node concept="3Tmbuc" id="5s44y2Lmc9$" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="5XB$uk$l3RN" role="jymVt" />
    <node concept="3clFb_" id="17A$fe9mbSD" role="jymVt">
      <property role="TrG5h" value="flushEDTEvents" />
      <property role="DiZV1" value="false" />
      <property role="od$2w" value="false" />
      <property role="2aFKle" value="false" />
      <node concept="3Tm6S6" id="4ojx_DmeWFm" role="1B3o_S" />
      <node concept="3clFbS" id="17A$fe9mbSI" role="3clF47">
        <node concept="3SKdUt" id="17A$fe9mbSJ" role="3cqZAp">
          <node concept="3SKdUq" id="17A$fe9mbSK" role="3SKWNk">
            <property role="3SKdUp" value="wait for all events currently in EDT queue" />
          </node>
        </node>
        <node concept="3clFbF" id="17A$fe9mbSL" role="3cqZAp">
          <node concept="2YIFZM" id="17A$fe9mbSM" role="3clFbG">
            <ref role="37wK5l" to="dxuu:~SwingUtilities.invokeAndWait(java.lang.Runnable):void" resolve="invokeAndWait" />
            <ref role="1Pybhc" to="dxuu:~SwingUtilities" resolve="SwingUtilities" />
            <node concept="2ShNRf" id="17A$fe9mbSN" role="37wK5m">
              <node concept="YeOm9" id="17A$fe9mbSO" role="2ShVmc">
                <node concept="1Y3b0j" id="17A$fe9mbSP" role="YeSDq">
                  <property role="2bfB8j" value="true" />
                  <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
                  <ref role="1Y3XeK" to="wyt6:~Runnable" resolve="Runnable" />
                  <node concept="3clFb_" id="17A$fe9mbSQ" role="jymVt">
                    <property role="IEkAT" value="false" />
                    <property role="1EzhhJ" value="false" />
                    <property role="TrG5h" value="run" />
                    <property role="DiZV1" value="false" />
                    <node concept="3Tm1VV" id="17A$fe9mbSR" role="1B3o_S" />
                    <node concept="3clFbS" id="17A$fe9mbSS" role="3clF47">
                      <node concept="3SKdUt" id="17A$fe9mbST" role="3cqZAp">
                        <node concept="3SKdUq" id="17A$fe9mbSU" role="3SKWNk">
                          <property role="3SKdUp" value="empty task" />
                        </node>
                      </node>
                    </node>
                    <node concept="3cqZAl" id="17A$fe9mbSV" role="3clF45" />
                    <node concept="2AHcQZ" id="17A$fe9mbSW" role="2AJF6D">
                      <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                    </node>
                  </node>
                  <node concept="3Tm1VV" id="17A$fe9mbSX" role="1B3o_S" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3SKdUt" id="17A$fe9nh__" role="3cqZAp">
          <node concept="3SKdUq" id="17A$fe9nhJH" role="3SKWNk">
            <property role="3SKdUp" value="flushing model events" />
          </node>
        </node>
        <node concept="3clFbF" id="5A5jZrz6TxZ" role="3cqZAp">
          <node concept="1rXfSq" id="5A5jZrz6TxY" role="3clFbG">
            <ref role="37wK5l" node="5A5jZrz6Sq4" resolve="flushEvents" />
          </node>
        </node>
      </node>
      <node concept="3cqZAl" id="17A$fe9mbTm" role="3clF45" />
      <node concept="3uibUv" id="17A$fe9mbSG" role="Sfmx6">
        <ref role="3uigEE" to="t6h5:~InvocationTargetException" resolve="InvocationTargetException" />
      </node>
      <node concept="3uibUv" id="17A$fe9mbSH" role="Sfmx6">
        <ref role="3uigEE" to="wyt6:~InterruptedException" resolve="InterruptedException" />
      </node>
    </node>
    <node concept="2tJIrI" id="7Uk8E1kGDIF" role="jymVt" />
    <node concept="3clFb_" id="5A5jZrz6Sq4" role="jymVt">
      <property role="TrG5h" value="flushEvents" />
      <node concept="3Tm6S6" id="5A5jZrz6Sq5" role="1B3o_S" />
      <node concept="3cqZAl" id="5A5jZrz6Sq6" role="3clF45" />
      <node concept="3clFbS" id="5A5jZrz6SpV" role="3clF47">
        <node concept="3clFbF" id="5A5jZrz6SpW" role="3cqZAp">
          <node concept="2OqwBi" id="5A5jZrz6SpX" role="3clFbG">
            <node concept="liA8E" id="5A5jZrz6SpY" role="2OqNvi">
              <ref role="37wK5l" to="w1kc:~ModelCommandExecutor.flushEventQueue():void" resolve="flushEventQueue" />
            </node>
            <node concept="2YIFZM" id="5A5jZrz6SpZ" role="2Oq$k0">
              <ref role="37wK5l" to="w1kc:~ModelAccess.instance():jetbrains.mps.smodel.ModelAccess" resolve="instance" />
              <ref role="1Pybhc" to="w1kc:~ModelAccess" resolve="ModelAccess" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="7Uk8E1kGKsw" role="jymVt" />
    <node concept="3clFb_" id="7Uk8E1kGNnC" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="switchToInspector" />
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <node concept="3uibUv" id="4JVNXuiQsOm" role="Sfmx6">
        <ref role="3uigEE" to="t6h5:~InvocationTargetException" resolve="InvocationTargetException" />
      </node>
      <node concept="3uibUv" id="4JVNXuiQtJx" role="Sfmx6">
        <ref role="3uigEE" to="wyt6:~InterruptedException" resolve="InterruptedException" />
      </node>
      <node concept="3clFbS" id="7Uk8E1kGNnF" role="3clF47">
        <node concept="3clFbJ" id="7Uk8E1kGOue" role="3cqZAp">
          <node concept="3clFbS" id="7Uk8E1kGOuf" role="3clFbx">
            <node concept="YS8fn" id="7Uk8E1kGOYt" role="3cqZAp">
              <node concept="2ShNRf" id="7Uk8E1kGP1A" role="YScLw">
                <node concept="1pGfFk" id="7Uk8E1kHf1W" role="2ShVmc">
                  <ref role="37wK5l" to="wyt6:~IllegalArgumentException.&lt;init&gt;(java.lang.String)" resolve="IllegalArgumentException" />
                  <node concept="3cpWs3" id="7Uk8E1kHfem" role="37wK5m">
                    <node concept="37vLTw" id="7Uk8E1kHfls" role="3uHU7w">
                      <ref role="3cqZAo" node="ORe5oE8EJ3" resolve="myCurrentEditorComponent" />
                    </node>
                    <node concept="Xl_RD" id="7Uk8E1kHf5y" role="3uHU7B">
                      <property role="Xl_RC" value="Impossible to switch to inspector: the component is not a NodeEditorComponent: " />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3fqX7Q" id="7Uk8E1kGOxv" role="3clFbw">
            <node concept="2ZW3vV" id="7Uk8E1kGOGY" role="3fr31v">
              <node concept="3uibUv" id="7Uk8E1kGOR5" role="2ZW6by">
                <ref role="3uigEE" to="exr9:~NodeEditorComponent" resolve="NodeEditorComponent" />
              </node>
              <node concept="37vLTw" id="7Uk8E1kGOBT" role="2ZW6bz">
                <ref role="3cqZAo" node="ORe5oE8EJ3" resolve="myCurrentEditorComponent" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="7Uk8E1kHfxk" role="3cqZAp">
          <node concept="37vLTI" id="7Uk8E1kHfDA" role="3clFbG">
            <node concept="37vLTw" id="7Uk8E1kHfxi" role="37vLTJ">
              <ref role="3cqZAo" node="ORe5oE8EJ3" resolve="myCurrentEditorComponent" />
            </node>
            <node concept="2OqwBi" id="7Uk8E1kHggX" role="37vLTx">
              <node concept="1eOMI4" id="7Uk8E1kHg6a" role="2Oq$k0">
                <node concept="10QFUN" id="7Uk8E1kHg67" role="1eOMHV">
                  <node concept="3uibUv" id="7Uk8E1kHgcS" role="10QFUM">
                    <ref role="3uigEE" to="exr9:~NodeEditorComponent" resolve="NodeEditorComponent" />
                  </node>
                  <node concept="37vLTw" id="7Uk8E1kHfYY" role="10QFUP">
                    <ref role="3cqZAo" node="ORe5oE8EJ3" resolve="myCurrentEditorComponent" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="7Uk8E1kHhmu" role="2OqNvi">
                <ref role="37wK5l" to="exr9:~NodeEditorComponent.getInspector():jetbrains.mps.nodeEditor.EditorComponent" resolve="getInspector" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="4Ksr1K19CX_" role="3cqZAp">
          <node concept="3clFbC" id="4Ksr1K19CXA" role="3clFbw">
            <node concept="2OqwBi" id="4Ksr1K19CXB" role="3uHU7B">
              <node concept="2OqwBi" id="4Ksr1K19CZ0" role="2Oq$k0">
                <node concept="37vLTw" id="4Ksr1K19CYZ" role="2Oq$k0">
                  <ref role="3cqZAo" node="ORe5oE8EJ3" resolve="myCurrentEditorComponent" />
                </node>
                <node concept="liA8E" id="4Ksr1K19CZ1" role="2OqNvi">
                  <ref role="37wK5l" to="cj4x:~EditorComponent.getSelectionManager():jetbrains.mps.openapi.editor.selection.SelectionManager" resolve="getSelectionManager" />
                </node>
              </node>
              <node concept="liA8E" id="4Ksr1K19CXD" role="2OqNvi">
                <ref role="37wK5l" to="lwvz:~SelectionManager.getSelection():jetbrains.mps.openapi.editor.selection.Selection" resolve="getSelection" />
              </node>
            </node>
            <node concept="10Nm6u" id="4Ksr1K19CXE" role="3uHU7w" />
          </node>
          <node concept="3clFbS" id="4Ksr1K19CXG" role="3clFbx">
            <node concept="3clFbF" id="4Ksr1K19Xha" role="3cqZAp">
              <node concept="1rXfSq" id="4Ksr1K19Xh9" role="3clFbG">
                <ref role="37wK5l" node="4Ksr1K19Xh5" resolve="selectFirstCellInInspector" />
                <node concept="37vLTw" id="4Ksr1K19Xh8" role="37wK5m">
                  <ref role="3cqZAo" node="ORe5oE8EJ3" resolve="myCurrentEditorComponent" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tmbuc" id="7Uk8E1kGMnW" role="1B3o_S" />
      <node concept="3cqZAl" id="7Uk8E1kGNnA" role="3clF45" />
    </node>
    <node concept="2tJIrI" id="4Ksr1K19Ywr" role="jymVt" />
    <node concept="3clFb_" id="4Ksr1K19Xh5" role="jymVt">
      <property role="TrG5h" value="selectFirstCellInInspector" />
      <node concept="3Tm6S6" id="4Ksr1K19Xh6" role="1B3o_S" />
      <node concept="3cqZAl" id="4Ksr1K19Xh7" role="3clF45" />
      <node concept="37vLTG" id="4Ksr1K19XgZ" role="3clF46">
        <property role="TrG5h" value="myCurrentEditorComponent" />
        <node concept="3uibUv" id="4Ksr1K19Xh0" role="1tU5fm">
          <ref role="3uigEE" to="cj4x:~EditorComponent" resolve="EditorComponent" />
        </node>
      </node>
      <node concept="3clFbS" id="4Ksr1K19Xg8" role="3clF47">
        <node concept="3cpWs8" id="4Ksr1K19Xg9" role="3cqZAp">
          <node concept="3cpWsn" id="4Ksr1K19Xga" role="3cpWs9">
            <property role="3TUv4t" value="false" />
            <property role="TrG5h" value="toSelect" />
            <node concept="3uibUv" id="4Ksr1K19Xgb" role="1tU5fm">
              <ref role="3uigEE" to="f4zo:~EditorCell" resolve="EditorCell" />
            </node>
            <node concept="10Nm6u" id="4Ksr1K19Xgc" role="33vP2m" />
          </node>
        </node>
        <node concept="3cpWs8" id="4Ksr1K19Xgd" role="3cqZAp">
          <node concept="3cpWsn" id="4Ksr1K19Xge" role="3cpWs9">
            <property role="3TUv4t" value="false" />
            <property role="TrG5h" value="rootCell" />
            <node concept="3uibUv" id="4Ksr1K19Xgf" role="1tU5fm">
              <ref role="3uigEE" to="f4zo:~EditorCell" resolve="EditorCell" />
            </node>
            <node concept="2OqwBi" id="4Ksr1K19Xgg" role="33vP2m">
              <node concept="37vLTw" id="4Ksr1K19Xh1" role="2Oq$k0">
                <ref role="3cqZAo" node="4Ksr1K19XgZ" resolve="myCurrentEditorComponent" />
              </node>
              <node concept="liA8E" id="4Ksr1K19Xgi" role="2OqNvi">
                <ref role="37wK5l" to="cj4x:~EditorComponent.getRootCell():jetbrains.mps.openapi.editor.cells.EditorCell" resolve="getRootCell" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="4Ksr1K19Xgj" role="3cqZAp">
          <node concept="2ZW3vV" id="4Ksr1K19Xgk" role="3clFbw">
            <node concept="37vLTw" id="4Ksr1K19Xgl" role="2ZW6bz">
              <ref role="3cqZAo" node="4Ksr1K19Xge" resolve="rootCell" />
            </node>
            <node concept="3uibUv" id="4Ksr1K19Xgm" role="2ZW6by">
              <ref role="3uigEE" to="f4zo:~EditorCell_Collection" resolve="EditorCell_Collection" />
            </node>
          </node>
          <node concept="3clFbJ" id="4Ksr1K19Xgn" role="9aQIa">
            <node concept="1Wc70l" id="4Ksr1K19Xgo" role="3clFbw">
              <node concept="3y3z36" id="4Ksr1K19Xgp" role="3uHU7B">
                <node concept="37vLTw" id="4Ksr1K19Xgq" role="3uHU7B">
                  <ref role="3cqZAo" node="4Ksr1K19Xge" resolve="rootCell" />
                </node>
                <node concept="10Nm6u" id="4Ksr1K19Xgr" role="3uHU7w" />
              </node>
              <node concept="2OqwBi" id="4Ksr1K19Xgs" role="3uHU7w">
                <node concept="37vLTw" id="4Ksr1K19Xgt" role="2Oq$k0">
                  <ref role="3cqZAo" node="4Ksr1K19Xge" resolve="rootCell" />
                </node>
                <node concept="liA8E" id="4Ksr1K19Xgu" role="2OqNvi">
                  <ref role="37wK5l" to="f4zo:~EditorCell.isSelectable():boolean" resolve="isSelectable" />
                </node>
              </node>
            </node>
            <node concept="3clFbS" id="4Ksr1K19Xgv" role="3clFbx">
              <node concept="3clFbF" id="4Ksr1K19Xgw" role="3cqZAp">
                <node concept="37vLTI" id="4Ksr1K19Xgx" role="3clFbG">
                  <node concept="37vLTw" id="4Ksr1K19Xgy" role="37vLTJ">
                    <ref role="3cqZAo" node="4Ksr1K19Xga" resolve="toSelect" />
                  </node>
                  <node concept="37vLTw" id="4Ksr1K19Xgz" role="37vLTx">
                    <ref role="3cqZAo" node="4Ksr1K19Xge" resolve="rootCell" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbS" id="4Ksr1K19Xg$" role="3clFbx">
            <node concept="3clFbF" id="4Ksr1K19Xg_" role="3cqZAp">
              <node concept="37vLTI" id="4Ksr1K19XgA" role="3clFbG">
                <node concept="37vLTw" id="4Ksr1K19XgB" role="37vLTJ">
                  <ref role="3cqZAo" node="4Ksr1K19Xga" resolve="toSelect" />
                </node>
                <node concept="2YIFZM" id="4Ksr1K19XgC" role="37vLTx">
                  <ref role="1Pybhc" to="g51k:~CellFinderUtil" resolve="CellFinderUtil" />
                  <ref role="37wK5l" to="g51k:~CellFinderUtil.findChildByManyFinders(jetbrains.mps.openapi.editor.cells.EditorCell,jetbrains.mps.nodeEditor.cells.CellFinderUtil$Finder...):jetbrains.mps.openapi.editor.cells.EditorCell" resolve="findChildByManyFinders" />
                  <node concept="37vLTw" id="4Ksr1K19XgD" role="37wK5m">
                    <ref role="3cqZAo" node="4Ksr1K19Xge" resolve="rootCell" />
                  </node>
                  <node concept="Rm8GO" id="4Ksr1K19XgE" role="37wK5m">
                    <ref role="1Px2BO" to="g51k:~CellFinderUtil$Finder" resolve="CellFinderUtil.Finder" />
                    <ref role="Rm8GQ" to="g51k:~CellFinderUtil$Finder.FIRST_EDITABLE" resolve="FIRST_EDITABLE" />
                  </node>
                  <node concept="Rm8GO" id="4Ksr1K19XgF" role="37wK5m">
                    <ref role="1Px2BO" to="g51k:~CellFinderUtil$Finder" resolve="CellFinderUtil.Finder" />
                    <ref role="Rm8GQ" to="g51k:~CellFinderUtil$Finder.FIRST_SELECTABLE_LEAF" resolve="FIRST_SELECTABLE_LEAF" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbJ" id="4Ksr1K19XgG" role="3cqZAp">
              <node concept="3clFbC" id="4Ksr1K19XgH" role="3clFbw">
                <node concept="37vLTw" id="4Ksr1K19XgI" role="3uHU7B">
                  <ref role="3cqZAo" node="4Ksr1K19Xga" resolve="toSelect" />
                </node>
                <node concept="10Nm6u" id="4Ksr1K19XgJ" role="3uHU7w" />
              </node>
              <node concept="3clFbS" id="4Ksr1K19XgK" role="3clFbx">
                <node concept="3clFbF" id="4Ksr1K19XgL" role="3cqZAp">
                  <node concept="37vLTI" id="4Ksr1K19XgM" role="3clFbG">
                    <node concept="37vLTw" id="4Ksr1K19XgN" role="37vLTJ">
                      <ref role="3cqZAo" node="4Ksr1K19Xga" resolve="toSelect" />
                    </node>
                    <node concept="37vLTw" id="4Ksr1K19XgO" role="37vLTx">
                      <ref role="3cqZAo" node="4Ksr1K19Xge" resolve="rootCell" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="4Ksr1K19XgP" role="3cqZAp">
          <node concept="3y3z36" id="4Ksr1K19XgQ" role="3clFbw">
            <node concept="37vLTw" id="4Ksr1K19XgR" role="3uHU7B">
              <ref role="3cqZAo" node="4Ksr1K19Xga" resolve="toSelect" />
            </node>
            <node concept="10Nm6u" id="4Ksr1K19XgS" role="3uHU7w" />
          </node>
          <node concept="3clFbS" id="4Ksr1K19XgT" role="3clFbx">
            <node concept="3clFbF" id="4Ksr1K19XgU" role="3cqZAp">
              <node concept="2OqwBi" id="4Ksr1K19XgV" role="3clFbG">
                <node concept="37vLTw" id="4Ksr1K19Xh2" role="2Oq$k0">
                  <ref role="3cqZAo" node="4Ksr1K19XgZ" resolve="myCurrentEditorComponent" />
                </node>
                <node concept="liA8E" id="4Ksr1K19XgX" role="2OqNvi">
                  <ref role="37wK5l" to="cj4x:~EditorComponent.changeSelection(jetbrains.mps.openapi.editor.cells.EditorCell):void" resolve="changeSelection" />
                  <node concept="37vLTw" id="4Ksr1K19XgY" role="37wK5m">
                    <ref role="3cqZAo" node="4Ksr1K19Xga" resolve="toSelect" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="7Uk8E1kHhpg" role="jymVt" />
    <node concept="3clFb_" id="7Uk8E1kHkqK" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="switchBackFromInspector" />
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <node concept="3clFbS" id="7Uk8E1kHkqN" role="3clF47">
        <node concept="3clFbJ" id="7Uk8E1kHlF2" role="3cqZAp">
          <node concept="3clFbS" id="7Uk8E1kHlF3" role="3clFbx">
            <node concept="YS8fn" id="7Uk8E1kHmsF" role="3cqZAp">
              <node concept="2ShNRf" id="7Uk8E1kHmsG" role="YScLw">
                <node concept="1pGfFk" id="7Uk8E1kHmsH" role="2ShVmc">
                  <ref role="37wK5l" to="wyt6:~IllegalArgumentException.&lt;init&gt;(java.lang.String)" resolve="IllegalArgumentException" />
                  <node concept="3cpWs3" id="7Uk8E1kHmsI" role="37wK5m">
                    <node concept="37vLTw" id="7Uk8E1kHmsJ" role="3uHU7w">
                      <ref role="3cqZAo" node="ORe5oE8EJ3" resolve="myCurrentEditorComponent" />
                    </node>
                    <node concept="Xl_RD" id="7Uk8E1kHmsK" role="3uHU7B">
                      <property role="Xl_RC" value="Impossible to switch back from inspector: the component is not a InspectorEditorComponent: " />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3fqX7Q" id="7Uk8E1kHlIj" role="3clFbw">
            <node concept="2ZW3vV" id="7Uk8E1kHlV$" role="3fr31v">
              <node concept="3uibUv" id="7Uk8E1kHm65" role="2ZW6by">
                <ref role="3uigEE" to="zyr2:~InspectorEditorComponent" resolve="InspectorEditorComponent" />
              </node>
              <node concept="37vLTw" id="7Uk8E1kHlOH" role="2ZW6bz">
                <ref role="3cqZAo" node="ORe5oE8EJ3" resolve="myCurrentEditorComponent" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="7Uk8E1kHmPS" role="3cqZAp">
          <node concept="37vLTI" id="7Uk8E1kHmY4" role="3clFbG">
            <node concept="2OqwBi" id="7Uk8E1kHnsz" role="37vLTx">
              <node concept="2OqwBi" id="7Uk8E1kHnda" role="2Oq$k0">
                <node concept="37vLTw" id="7Uk8E1kHn7H" role="2Oq$k0">
                  <ref role="3cqZAo" node="4wzlvyewbW2" resolve="myFileNodeEditor" />
                </node>
                <node concept="liA8E" id="7Uk8E1kHnqR" role="2OqNvi">
                  <ref role="37wK5l" to="k3nr:~MPSFileNodeEditor.getNodeEditor():jetbrains.mps.openapi.editor.Editor" resolve="getNodeEditor" />
                </node>
              </node>
              <node concept="liA8E" id="7Uk8E1kHnvr" role="2OqNvi">
                <ref role="37wK5l" to="cj4x:~Editor.getCurrentEditorComponent():jetbrains.mps.openapi.editor.EditorComponent" resolve="getCurrentEditorComponent" />
              </node>
            </node>
            <node concept="37vLTw" id="7Uk8E1kHmPQ" role="37vLTJ">
              <ref role="3cqZAo" node="ORe5oE8EJ3" resolve="myCurrentEditorComponent" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tmbuc" id="7Uk8E1kHjoW" role="1B3o_S" />
      <node concept="3cqZAl" id="7Uk8E1kHkqI" role="3clF45" />
    </node>
    <node concept="2tJIrI" id="62Gc_ZTkHcs" role="jymVt" />
    <node concept="3clFb_" id="62Gc_ZTkJBT" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="runUndoableInEDTAndWait" />
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <node concept="3clFbS" id="62Gc_ZTkJBU" role="3clF47">
        <node concept="3cpWs8" id="62Gc_ZTkYZV" role="3cqZAp">
          <node concept="3cpWsn" id="62Gc_ZTkYZW" role="3cpWs9">
            <property role="TrG5h" value="undoManager" />
            <node concept="3uibUv" id="62Gc_ZTkYZU" role="1tU5fm">
              <ref role="3uigEE" to="xgff:~UndoManagerImpl" resolve="UndoManagerImpl" />
            </node>
            <node concept="10QFUN" id="62Gc_ZTkYZX" role="33vP2m">
              <node concept="2YIFZM" id="62Gc_ZTkYZY" role="10QFUP">
                <ref role="1Pybhc" to="54q7:~UndoManager" resolve="UndoManager" />
                <ref role="37wK5l" to="54q7:~UndoManager.getInstance(com.intellij.openapi.project.Project):com.intellij.openapi.command.undo.UndoManager" resolve="getInstance" />
                <node concept="2YIFZM" id="62Gc_ZTkYZZ" role="37wK5m">
                  <ref role="37wK5l" to="alof:~ProjectHelper.toIdeaProject(jetbrains.mps.project.Project):com.intellij.openapi.project.Project" resolve="toIdeaProject" />
                  <ref role="1Pybhc" to="alof:~ProjectHelper" resolve="ProjectHelper" />
                  <node concept="37vLTw" id="62Gc_ZTkZ00" role="37wK5m">
                    <ref role="3cqZAo" node="hPjx680" resolve="myProject" />
                  </node>
                </node>
              </node>
              <node concept="3uibUv" id="62Gc_ZTkZ01" role="10QFUM">
                <ref role="3uigEE" to="xgff:~UndoManagerImpl" resolve="UndoManagerImpl" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="62Gc_ZTlp$g" role="3cqZAp">
          <node concept="3cpWsn" id="62Gc_ZTlp$h" role="3cpWs9">
            <property role="TrG5h" value="oldEditorProvider" />
            <node concept="3uibUv" id="62Gc_ZTlp$e" role="1tU5fm">
              <ref role="3uigEE" to="xgff:~CurrentEditorProvider" resolve="CurrentEditorProvider" />
            </node>
            <node concept="2OqwBi" id="62Gc_ZTlp$i" role="33vP2m">
              <node concept="liA8E" id="62Gc_ZTlp$j" role="2OqNvi">
                <ref role="37wK5l" to="xgff:~UndoManagerImpl.getEditorProvider():com.intellij.openapi.command.impl.CurrentEditorProvider" resolve="getEditorProvider" />
              </node>
              <node concept="37vLTw" id="62Gc_ZTlp$k" role="2Oq$k0">
                <ref role="3cqZAo" node="62Gc_ZTkYZW" resolve="undoManager" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="62Gc_ZTlpiA" role="3cqZAp">
          <node concept="2OqwBi" id="62Gc_ZTlpiB" role="3clFbG">
            <node concept="37vLTw" id="62Gc_ZTlq4a" role="2Oq$k0">
              <ref role="3cqZAo" node="62Gc_ZTkYZW" resolve="undoManager" />
            </node>
            <node concept="liA8E" id="62Gc_ZTlpiD" role="2OqNvi">
              <ref role="37wK5l" to="xgff:~UndoManagerImpl.setEditorProvider(com.intellij.openapi.command.impl.CurrentEditorProvider):void" resolve="setEditorProvider" />
              <node concept="2ShNRf" id="62Gc_ZTlpiE" role="37wK5m">
                <node concept="YeOm9" id="62Gc_ZTlpiF" role="2ShVmc">
                  <node concept="1Y3b0j" id="62Gc_ZTlpiG" role="YeSDq">
                    <property role="2bfB8j" value="true" />
                    <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
                    <ref role="1Y3XeK" to="xgff:~CurrentEditorProvider" resolve="CurrentEditorProvider" />
                    <node concept="3Tm1VV" id="62Gc_ZTlpiH" role="1B3o_S" />
                    <node concept="3clFb_" id="62Gc_ZTlpiI" role="jymVt">
                      <property role="1EzhhJ" value="false" />
                      <property role="TrG5h" value="getCurrentEditor" />
                      <property role="DiZV1" value="false" />
                      <property role="IEkAT" value="false" />
                      <node concept="3Tm1VV" id="62Gc_ZTlpiJ" role="1B3o_S" />
                      <node concept="3uibUv" id="62Gc_ZTlpiK" role="3clF45">
                        <ref role="3uigEE" to="iwsx:~FileEditor" resolve="FileEditor" />
                      </node>
                      <node concept="3clFbS" id="62Gc_ZTlpiL" role="3clF47">
                        <node concept="3cpWs6" id="62Gc_ZTlpiM" role="3cqZAp">
                          <node concept="37vLTw" id="62Gc_ZTlrgZ" role="3cqZAk">
                            <ref role="3cqZAo" node="4wzlvyewbW2" resolve="myFileNodeEditor" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="5QS$Mto4Uz_" role="3cqZAp">
          <node concept="3cpWsn" id="5QS$Mto4UzF" role="3cpWs9">
            <property role="TrG5h" value="ts" />
            <property role="3TUv4t" value="true" />
            <node concept="10Q1$e" id="5QS$Mto4UzH" role="1tU5fm">
              <node concept="3uibUv" id="5QS$Mto4UFu" role="10Q1$1">
                <ref role="3uigEE" to="wyt6:~Throwable" resolve="Throwable" />
              </node>
            </node>
            <node concept="2ShNRf" id="5QS$Mto4ULa" role="33vP2m">
              <node concept="3$_iS1" id="5QS$Mto5kNx" role="2ShVmc">
                <node concept="3$GHV9" id="5QS$Mto5kNy" role="3$GQph">
                  <node concept="3cmrfG" id="5QS$Mto5kSD" role="3$I4v7">
                    <property role="3cmrfH" value="1" />
                  </node>
                </node>
                <node concept="3uibUv" id="5QS$Mto5kuB" role="3$_nBY">
                  <ref role="3uigEE" to="wyt6:~Throwable" resolve="Throwable" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="62Gc_ZTkJBV" role="3cqZAp">
          <node concept="2YIFZM" id="1gM9fJkY3Tm" role="3clFbG">
            <ref role="37wK5l" to="3a50:~ThreadUtils.runInUIThreadAndWait(java.lang.Runnable):java.lang.Exception" resolve="runInUIThreadAndWait" />
            <ref role="1Pybhc" to="3a50:~ThreadUtils" resolve="ThreadUtils" />
            <node concept="2ShNRf" id="1gM9fJkY3Tn" role="37wK5m">
              <node concept="YeOm9" id="1gM9fJkY3To" role="2ShVmc">
                <node concept="1Y3b0j" id="1gM9fJkY3Tp" role="YeSDq">
                  <property role="2bfB8j" value="true" />
                  <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
                  <ref role="1Y3XeK" to="wyt6:~Runnable" resolve="Runnable" />
                  <node concept="3Tm1VV" id="1gM9fJkY3Tq" role="1B3o_S" />
                  <node concept="3clFb_" id="1gM9fJkY3Tr" role="jymVt">
                    <property role="1EzhhJ" value="false" />
                    <property role="TrG5h" value="run" />
                    <property role="DiZV1" value="false" />
                    <property role="IEkAT" value="false" />
                    <node concept="3Tm1VV" id="1gM9fJkY3Ts" role="1B3o_S" />
                    <node concept="3cqZAl" id="1gM9fJkY3Tt" role="3clF45" />
                    <node concept="3clFbS" id="1gM9fJkY3Tu" role="3clF47">
                      <node concept="SfApY" id="1gM9fJkY3Tv" role="3cqZAp">
                        <node concept="3clFbS" id="1gM9fJkY3Tw" role="SfCbr">
                          <node concept="3clFbF" id="1gM9fJkY3Tx" role="3cqZAp">
                            <node concept="2OqwBi" id="1gM9fJkY3Ty" role="3clFbG">
                              <node concept="37vLTw" id="1gM9fJkY3Tz" role="2Oq$k0">
                                <ref role="3cqZAo" node="62Gc_ZTkJCj" resolve="runnable" />
                              </node>
                              <node concept="liA8E" id="1gM9fJkY3T$" role="2OqNvi">
                                <ref role="37wK5l" to="wyt6:~Runnable.run():void" resolve="run" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node concept="TDmWw" id="1gM9fJkY3T_" role="TEbGg">
                          <node concept="3clFbS" id="1gM9fJkY3TA" role="TDEfX">
                            <node concept="3clFbF" id="1gM9fJkY3TB" role="3cqZAp">
                              <node concept="37vLTI" id="1gM9fJkY3TC" role="3clFbG">
                                <node concept="37vLTw" id="1gM9fJkY3TD" role="37vLTx">
                                  <ref role="3cqZAo" node="1gM9fJkY3TH" resolve="t" />
                                </node>
                                <node concept="AH0OO" id="1gM9fJkY3TE" role="37vLTJ">
                                  <node concept="3cmrfG" id="1gM9fJkY3TF" role="AHEQo">
                                    <property role="3cmrfH" value="0" />
                                  </node>
                                  <node concept="37vLTw" id="1gM9fJkY3TG" role="AHHXb">
                                    <ref role="3cqZAo" node="5QS$Mto4UzF" resolve="ts" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                          <node concept="3cpWsn" id="1gM9fJkY3TH" role="TDEfY">
                            <property role="TrG5h" value="t" />
                            <node concept="3uibUv" id="1gM9fJkY3TI" role="1tU5fm">
                              <ref role="3uigEE" to="wyt6:~Throwable" resolve="Throwable" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="5QS$Mto5m0S" role="3cqZAp">
          <node concept="3clFbS" id="5QS$Mto5m0U" role="3clFbx">
            <node concept="YS8fn" id="5QS$Mto5mHT" role="3cqZAp">
              <node concept="2ShNRf" id="5QS$Mto5mLp" role="YScLw">
                <node concept="1pGfFk" id="5QS$Mto5nRb" role="2ShVmc">
                  <ref role="37wK5l" to="wyt6:~RuntimeException.&lt;init&gt;(java.lang.String,java.lang.Throwable)" resolve="RuntimeException" />
                  <node concept="Xl_RD" id="5QS$Mto5nUJ" role="37wK5m">
                    <property role="Xl_RC" value="Failure during editor test execution" />
                  </node>
                  <node concept="AH0OO" id="5QS$Mto5ofq" role="37wK5m">
                    <node concept="3cmrfG" id="5QS$Mto5oiw" role="AHEQo">
                      <property role="3cmrfH" value="0" />
                    </node>
                    <node concept="37vLTw" id="5QS$Mto5oaM" role="AHHXb">
                      <ref role="3cqZAo" node="5QS$Mto4UzF" resolve="ts" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3y3z36" id="5QS$Mto5muS" role="3clFbw">
            <node concept="10Nm6u" id="5QS$Mto5my2" role="3uHU7w" />
            <node concept="AH0OO" id="5QS$Mto5mh3" role="3uHU7B">
              <node concept="3cmrfG" id="5QS$Mto5mnJ" role="AHEQo">
                <property role="3cmrfH" value="0" />
              </node>
              <node concept="37vLTw" id="5QS$Mto5ma9" role="AHHXb">
                <ref role="3cqZAo" node="5QS$Mto4UzF" resolve="ts" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="17A$fe9n0V5" role="3cqZAp">
          <node concept="1rXfSq" id="17A$fe9n0V3" role="3clFbG">
            <ref role="37wK5l" node="17A$fe9mbSD" resolve="flushEDTEvents" />
          </node>
        </node>
        <node concept="3SKdUt" id="17A$fe9mbT3" role="3cqZAp">
          <node concept="3SKdUq" id="17A$fe9mbT4" role="3SKWNk">
            <property role="3SKdUp" value="some actions (Copy/Paste) are running one more command later" />
          </node>
        </node>
        <node concept="3clFbF" id="17A$fe9n1C0" role="3cqZAp">
          <node concept="1rXfSq" id="17A$fe9n1C1" role="3clFbG">
            <ref role="37wK5l" node="17A$fe9mbSD" resolve="flushEDTEvents" />
          </node>
        </node>
        <node concept="3clFbF" id="62Gc_ZTlx3m" role="3cqZAp">
          <node concept="2OqwBi" id="62Gc_ZTlx3n" role="3clFbG">
            <node concept="37vLTw" id="62Gc_ZTlxBm" role="2Oq$k0">
              <ref role="3cqZAo" node="62Gc_ZTkYZW" resolve="undoManager" />
            </node>
            <node concept="liA8E" id="62Gc_ZTlx3p" role="2OqNvi">
              <ref role="37wK5l" to="xgff:~UndoManagerImpl.setEditorProvider(com.intellij.openapi.command.impl.CurrentEditorProvider):void" resolve="setEditorProvider" />
              <node concept="37vLTw" id="62Gc_ZTlx3q" role="37wK5m">
                <ref role="3cqZAo" node="62Gc_ZTlp$h" resolve="oldEditorProvider" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="62Gc_ZTkJCh" role="1B3o_S" />
      <node concept="3cqZAl" id="62Gc_ZTkJCi" role="3clF45" />
      <node concept="37vLTG" id="62Gc_ZTkJCj" role="3clF46">
        <property role="TrG5h" value="runnable" />
        <property role="3TUv4t" value="true" />
        <node concept="3uibUv" id="62Gc_ZTkJCk" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~Runnable" resolve="Runnable" />
        </node>
      </node>
      <node concept="3uibUv" id="62Gc_ZTkJCl" role="Sfmx6">
        <ref role="3uigEE" to="t6h5:~InvocationTargetException" resolve="InvocationTargetException" />
      </node>
      <node concept="3uibUv" id="62Gc_ZTkJCm" role="Sfmx6">
        <ref role="3uigEE" to="wyt6:~InterruptedException" resolve="InterruptedException" />
      </node>
    </node>
    <node concept="2tJIrI" id="8$1$D__xrN" role="jymVt" />
    <node concept="3clFb_" id="8$1$D__C$O" role="jymVt">
      <property role="TrG5h" value="installAppender" />
      <node concept="3uibUv" id="4Zaa5llGRA$" role="3clF45">
        <ref role="3uigEE" to="zu0:~CachingAppender" resolve="CachingAppender" />
      </node>
      <node concept="3Tm6S6" id="8$1$D__DFg" role="1B3o_S" />
      <node concept="3clFbS" id="8$1$D__C$S" role="3clF47">
        <node concept="3cpWs8" id="8$1$D__UDs" role="3cqZAp">
          <node concept="3cpWsn" id="8$1$D__UDt" role="3cpWs9">
            <property role="TrG5h" value="rootLogger" />
            <node concept="3uibUv" id="8$1$D__UDr" role="1tU5fm">
              <ref role="3uigEE" to="q7tw:~Logger" resolve="Logger" />
            </node>
            <node concept="2YIFZM" id="8$1$D__UG0" role="33vP2m">
              <ref role="37wK5l" to="q7tw:~Logger.getRootLogger():org.apache.log4j.Logger" resolve="getRootLogger" />
              <ref role="1Pybhc" to="q7tw:~Logger" resolve="Logger" />
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="4Zaa5llGLDy" role="3cqZAp">
          <node concept="3cpWsn" id="4Zaa5llGLDz" role="3cpWs9">
            <property role="TrG5h" value="appender" />
            <node concept="3uibUv" id="4Zaa5llGLD$" role="1tU5fm">
              <ref role="3uigEE" to="zu0:~CachingAppender" resolve="CachingAppender" />
            </node>
            <node concept="2ShNRf" id="4Zaa5llGMXo" role="33vP2m">
              <node concept="1pGfFk" id="4Zaa5llGMXn" role="2ShVmc">
                <ref role="37wK5l" to="zu0:~CachingAppender.&lt;init&gt;(org.apache.log4j.Level)" resolve="CachingAppender" />
                <node concept="10M0yZ" id="4Zaa5llGNfa" role="37wK5m">
                  <ref role="1PxDUh" to="q7tw:~Level" resolve="Level" />
                  <ref role="3cqZAo" to="q7tw:~Level.ERROR" resolve="ERROR" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="4xJw7BvfGkh" role="3cqZAp">
          <node concept="1rXfSq" id="4xJw7BvfGkf" role="3clFbG">
            <ref role="37wK5l" node="4xJw7BvfwE8" resolve="populateExpectedEvents" />
            <node concept="37vLTw" id="4xJw7BvfHke" role="37wK5m">
              <ref role="3cqZAo" node="4Zaa5llGLDz" resolve="appender" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="8$1$D_A_$G" role="3cqZAp">
          <node concept="2OqwBi" id="8$1$D_A_C_" role="3clFbG">
            <node concept="37vLTw" id="8$1$D_A_$E" role="2Oq$k0">
              <ref role="3cqZAo" node="8$1$D__UDt" resolve="rootLogger" />
            </node>
            <node concept="liA8E" id="8$1$D_A_FT" role="2OqNvi">
              <ref role="37wK5l" to="q7tw:~Category.addAppender(org.apache.log4j.Appender):void" resolve="addAppender" />
              <node concept="37vLTw" id="4Zaa5llGOvi" role="37wK5m">
                <ref role="3cqZAo" node="4Zaa5llGLDz" resolve="appender" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="8$1$D_ADpR" role="3cqZAp">
          <node concept="37vLTw" id="4Zaa5llGQo1" role="3cqZAk">
            <ref role="3cqZAo" node="4Zaa5llGLDz" resolve="appender" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="4xJw7BvfqWP" role="jymVt" />
    <node concept="3clFb_" id="4xJw7BvfwE8" role="jymVt">
      <property role="TrG5h" value="populateExpectedEvents" />
      <node concept="37vLTG" id="4xJw7BvfEgT" role="3clF46">
        <property role="TrG5h" value="appender" />
        <node concept="3uibUv" id="4xJw7BvfFda" role="1tU5fm">
          <ref role="3uigEE" to="zu0:~CachingAppender" resolve="CachingAppender" />
        </node>
      </node>
      <node concept="3cqZAl" id="4xJw7BvfwEa" role="3clF45" />
      <node concept="3Tmbuc" id="4xJw7Bvfy29" role="1B3o_S" />
      <node concept="3clFbS" id="4xJw7BvfwEc" role="3clF47">
        <node concept="3clFbH" id="4xJw7BvfFdN" role="3cqZAp" />
      </node>
    </node>
    <node concept="2tJIrI" id="8$1$D__K_y" role="jymVt" />
    <node concept="3clFb_" id="8$1$D__LNI" role="jymVt">
      <property role="TrG5h" value="uninstallAppender" />
      <node concept="3cqZAl" id="8$1$D__LNK" role="3clF45" />
      <node concept="3Tm6S6" id="8$1$D__MUf" role="1B3o_S" />
      <node concept="3clFbS" id="8$1$D__LNM" role="3clF47">
        <node concept="3clFbF" id="8$1$D_AFt1" role="3cqZAp">
          <node concept="2OqwBi" id="8$1$D_AFtM" role="3clFbG">
            <node concept="2YIFZM" id="8$1$D_AFt3" role="2Oq$k0">
              <ref role="37wK5l" to="q7tw:~Logger.getRootLogger():org.apache.log4j.Logger" resolve="getRootLogger" />
              <ref role="1Pybhc" to="q7tw:~Logger" resolve="Logger" />
            </node>
            <node concept="liA8E" id="8$1$D_AFzq" role="2OqNvi">
              <ref role="37wK5l" to="q7tw:~Category.removeAppender(org.apache.log4j.Appender):void" resolve="removeAppender" />
              <node concept="37vLTw" id="8$1$D_AFDI" role="37wK5m">
                <ref role="3cqZAo" node="8$1$D_AEud" resolve="appender" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="8$1$D_AEud" role="3clF46">
        <property role="TrG5h" value="appender" />
        <node concept="3uibUv" id="4Zaa5llGSOc" role="1tU5fm">
          <ref role="3uigEE" to="zu0:~CachingAppender" resolve="CachingAppender" />
        </node>
      </node>
    </node>
    <node concept="3Tm1VV" id="hPMdj4f" role="1B3o_S" />
    <node concept="3uibUv" id="hSQ03ba" role="1zkMxy">
      <ref role="3uigEE" node="hLFfHcX" resolve="BaseTestBody" />
    </node>
  </node>
  <node concept="312cEu" id="hQFSbBs">
    <property role="TrG5h" value="CellReference" />
    <node concept="312cEg" id="hQG0RFS" role="jymVt">
      <property role="TrG5h" value="myNode" />
      <node concept="3Tqbb2" id="hQJuYnp" role="1tU5fm" />
      <node concept="3Tm6S6" id="hQG0RFT" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="hSdCl0x" role="jymVt">
      <property role="TrG5h" value="myAnnotation" />
      <node concept="3Tqbb2" id="hSdClqX" role="1tU5fm">
        <ref role="ehGHo" to="tp5g:hSLIFSi" resolve="AnonymousCellAnnotation" />
      </node>
      <node concept="3Tm6S6" id="hSdCl0y" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="1UE$z6yumPt" role="jymVt">
      <property role="TrG5h" value="myMap" />
      <node concept="3Tm6S6" id="1UE$z6yumPu" role="1B3o_S" />
      <node concept="3rvAFt" id="1UE$z6yumPx" role="1tU5fm">
        <node concept="3Tqbb2" id="1UE$z6yumP_" role="3rvSg0" />
        <node concept="3Tqbb2" id="1UE$z6yumP$" role="3rvQeY" />
      </node>
    </node>
    <node concept="3clFbW" id="hQFSbBu" role="jymVt">
      <node concept="37vLTG" id="hQG0LJS" role="3clF46">
        <property role="TrG5h" value="node" />
        <node concept="3Tqbb2" id="hQJuZwq" role="1tU5fm" />
      </node>
      <node concept="3cqZAl" id="hQFSbBv" role="3clF45" />
      <node concept="3clFbS" id="hQFSbBx" role="3clF47">
        <node concept="3clFbF" id="hQG0RGb" role="3cqZAp">
          <node concept="37vLTI" id="hQG0RGc" role="3clFbG">
            <node concept="37vLTw" id="ORe5oE7Y0c" role="37vLTJ">
              <ref role="3cqZAo" node="hQG0RFS" resolve="myNode" />
            </node>
            <node concept="37vLTw" id="2BHiRxgmFqh" role="37vLTx">
              <ref role="3cqZAo" node="hQG0LJS" resolve="node" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="hSdCqsM" role="3cqZAp">
          <node concept="37vLTI" id="hSdCrbY" role="3clFbG">
            <node concept="37vLTw" id="ORe5oE7Y2h" role="37vLTJ">
              <ref role="3cqZAo" node="hSdCl0x" resolve="myAnnotation" />
            </node>
            <node concept="1PxgMI" id="hSdCsl2" role="37vLTx">
              <ref role="1PxNhF" to="tp5g:hSLIFSi" resolve="AnonymousCellAnnotation" />
              <node concept="37vLTw" id="2BHiRxglVwS" role="1PxMeX">
                <ref role="3cqZAo" node="hSdCgOT" resolve="annotation" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1UE$z6yutFv" role="3cqZAp">
          <node concept="37vLTI" id="1UE$z6yutFz" role="3clFbG">
            <node concept="37vLTw" id="ORe5oE7Y4X" role="37vLTJ">
              <ref role="3cqZAo" node="1UE$z6yumPt" resolve="myMap" />
            </node>
            <node concept="37vLTw" id="2BHiRxgm8sQ" role="37vLTx">
              <ref role="3cqZAo" node="1UE$z6yumPm" resolve="map" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="hQFSbBw" role="1B3o_S" />
      <node concept="37vLTG" id="hSdCgOT" role="3clF46">
        <property role="TrG5h" value="annotation" />
        <node concept="3Tqbb2" id="hSdChF8" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="1UE$z6yumPm" role="3clF46">
        <property role="TrG5h" value="map" />
        <node concept="3rvAFt" id="1UE$z6yumPo" role="1tU5fm">
          <node concept="3Tqbb2" id="1UE$z6yumPs" role="3rvSg0" />
          <node concept="3Tqbb2" id="1UE$z6yumPr" role="3rvQeY" />
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="ORe5oE7Whe" role="jymVt" />
    <node concept="3clFb_" id="hQJuSEb" role="jymVt">
      <property role="TrG5h" value="getNode" />
      <node concept="3Tqbb2" id="hQJuX$m" role="3clF45" />
      <node concept="3Tm1VV" id="hQJuSEd" role="1B3o_S" />
      <node concept="3clFbS" id="hQJuSEe" role="3clF47">
        <node concept="3cpWs6" id="hQJuUMX" role="3cqZAp">
          <node concept="2OqwBi" id="hQJuWxP" role="3cqZAk">
            <node concept="Xjq3P" id="hQJuWxR" role="2Oq$k0" />
            <node concept="2OwXpG" id="hQJuWxQ" role="2OqNvi">
              <ref role="2Oxat5" node="hQG0RFS" resolve="myNode" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="ORe5oE7WCs" role="jymVt" />
    <node concept="3clFb_" id="hSd6Aih" role="jymVt">
      <property role="TrG5h" value="toString" />
      <node concept="3Tm1VV" id="hSd6Aij" role="1B3o_S" />
      <node concept="3clFbS" id="hSd6Aik" role="3clF47">
        <node concept="3cpWs6" id="hSd6C2p" role="3cqZAp">
          <node concept="3cpWs3" id="ORe5oE805Z" role="3cqZAk">
            <node concept="Xl_RD" id="ORe5oE8060" role="3uHU7w">
              <property role="Xl_RC" value=")" />
            </node>
            <node concept="3cpWs3" id="ORe5oE8061" role="3uHU7B">
              <node concept="3cpWs3" id="ORe5oE8062" role="3uHU7B">
                <node concept="3cpWs3" id="ORe5oE8063" role="3uHU7B">
                  <node concept="Xl_RD" id="ORe5oE8064" role="3uHU7B">
                    <property role="Xl_RC" value="(node " />
                  </node>
                  <node concept="2OqwBi" id="ORe5oE8065" role="3uHU7w">
                    <node concept="liA8E" id="ORe5oE8066" role="2OqNvi">
                      <ref role="37wK5l" to="wyt6:~Object.toString():java.lang.String" resolve="toString" />
                    </node>
                    <node concept="2OqwBi" id="ORe5oE8067" role="2Oq$k0">
                      <node concept="liA8E" id="ORe5oE8068" role="2OqNvi">
                        <ref role="37wK5l" to="mhbf:~SNode.getNodeId():org.jetbrains.mps.openapi.model.SNodeId" resolve="getNodeId" />
                      </node>
                      <node concept="2JrnkZ" id="ORe5oE8069" role="2Oq$k0">
                        <node concept="37vLTw" id="ORe5oE806a" role="2JrQYb">
                          <ref role="3cqZAo" node="hQG0RFS" resolve="myNode" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="Xl_RD" id="ORe5oE806b" role="3uHU7w">
                  <property role="Xl_RC" value=", id " />
                </node>
              </node>
              <node concept="2OqwBi" id="ORe5oE806c" role="3uHU7w">
                <node concept="3TrcHB" id="ORe5oE806d" role="2OqNvi">
                  <ref role="3TsBF5" to="tp5g:hSLIFSj" resolve="cellId" />
                </node>
                <node concept="37vLTw" id="ORe5oE806e" role="2Oq$k0">
                  <ref role="3cqZAo" node="hSdCl0x" resolve="myAnnotation" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="17QB3L" id="1UE$z6yumPA" role="3clF45" />
      <node concept="2AHcQZ" id="3tYsUK_RV$S" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="2tJIrI" id="ORe5oE7WZN" role="jymVt" />
    <node concept="3clFb_" id="hSdDcc3" role="jymVt">
      <property role="TrG5h" value="setupSelection" />
      <node concept="3uibUv" id="7Uk8E1kMdHa" role="3clF45">
        <ref role="3uigEE" to="cj4x:~EditorComponent" resolve="EditorComponent" />
      </node>
      <node concept="37vLTG" id="hT5EbY_" role="3clF46">
        <property role="TrG5h" value="editorComponent" />
        <node concept="3uibUv" id="ORe5oEatdK" role="1tU5fm">
          <ref role="3uigEE" to="exr9:~NodeEditorComponent" resolve="NodeEditorComponent" />
        </node>
      </node>
      <node concept="3clFbS" id="hSdDcc6" role="3clF47">
        <node concept="3cpWs6" id="7Uk8E1kMsj2" role="3cqZAp">
          <node concept="2OqwBi" id="7Uk8E1kMsj3" role="3cqZAk">
            <node concept="37vLTw" id="7Uk8E1kMsj4" role="2Oq$k0">
              <ref role="3cqZAo" node="hSdCl0x" resolve="myAnnotation" />
            </node>
            <node concept="2qgKlT" id="7Uk8E1kMsj5" role="2OqNvi">
              <ref role="37wK5l" to="tp5o:5g7DxxpaP55" resolve="setupSelection" />
              <node concept="37vLTw" id="7Uk8E1kMsj6" role="37wK5m">
                <ref role="3cqZAo" node="hT5EbY_" resolve="editorComponent" />
              </node>
              <node concept="37vLTw" id="7Uk8E1kMsj7" role="37wK5m">
                <ref role="3cqZAo" node="hQG0RFS" resolve="myNode" />
              </node>
              <node concept="37vLTw" id="7Uk8E1kMsj8" role="37wK5m">
                <ref role="3cqZAo" node="1UE$z6yumPt" resolve="myMap" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="hSdDcc5" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="ORe5oE7Xnc" role="jymVt" />
    <node concept="3clFb_" id="5rZKa_fUlNd" role="jymVt">
      <property role="TrG5h" value="assertSelectionIsTheSame" />
      <node concept="37vLTG" id="5rZKa_fUlNi" role="3clF46">
        <property role="TrG5h" value="editorComponent" />
        <node concept="3uibUv" id="ORe5oE81y3" role="1tU5fm">
          <ref role="3uigEE" to="cj4x:~EditorComponent" resolve="EditorComponent" />
        </node>
      </node>
      <node concept="37vLTG" id="1FgNkkI909P" role="3clF46">
        <property role="TrG5h" value="map" />
        <node concept="3rvAFt" id="1FgNkkI909R" role="1tU5fm">
          <node concept="3Tqbb2" id="1FgNkkI909U" role="3rvQeY" />
          <node concept="3Tqbb2" id="1FgNkkI909V" role="3rvSg0" />
        </node>
      </node>
      <node concept="3clFbS" id="5rZKa_fUlNg" role="3clF47">
        <node concept="3clFbJ" id="4VoD2D0CZ8n" role="3cqZAp">
          <node concept="3clFbS" id="4VoD2D0CZ8o" role="3clFbx">
            <node concept="1gVbGN" id="1R84b4wzmpN" role="3cqZAp">
              <node concept="2ZW3vV" id="1R84b4wzmER" role="1gVkn0">
                <node concept="3uibUv" id="1R84b4wzmIT" role="2ZW6by">
                  <ref role="3uigEE" to="zyr2:~InspectorEditorComponent" resolve="InspectorEditorComponent" />
                </node>
                <node concept="37vLTw" id="1R84b4wzmz3" role="2ZW6bz">
                  <ref role="3cqZAo" node="5rZKa_fUlNi" resolve="editorComponent" />
                </node>
              </node>
            </node>
          </node>
          <node concept="2OqwBi" id="4MvMldnsgil" role="3clFbw">
            <node concept="37vLTw" id="ORe5oEaqG0" role="2Oq$k0">
              <ref role="3cqZAo" node="hSdCl0x" resolve="myAnnotation" />
            </node>
            <node concept="3TrcHB" id="4MvMldnsgir" role="2OqNvi">
              <ref role="3TsBF5" to="tp5g:1HNcKYL91S1" resolve="isInInspector" />
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="6zv$FxYwgCl" role="3cqZAp">
          <node concept="3cpWsn" id="6zv$FxYwgCm" role="3cpWs9">
            <property role="TrG5h" value="selection" />
            <node concept="3uibUv" id="6zv$FxYwgCn" role="1tU5fm">
              <ref role="3uigEE" to="lwvz:~Selection" resolve="Selection" />
            </node>
            <node concept="2OqwBi" id="6zv$FxYwgCo" role="33vP2m">
              <node concept="2OqwBi" id="6zv$FxYwgCp" role="2Oq$k0">
                <node concept="liA8E" id="6zv$FxYwgCr" role="2OqNvi">
                  <ref role="37wK5l" to="cj4x:~EditorComponent.getSelectionManager():jetbrains.mps.openapi.editor.selection.SelectionManager" resolve="getSelectionManager" />
                </node>
                <node concept="37vLTw" id="3GM_nagT$dK" role="2Oq$k0">
                  <ref role="3cqZAo" node="5rZKa_fUlNi" resolve="editorComponent" />
                </node>
              </node>
              <node concept="liA8E" id="6zv$FxYwgCs" role="2OqNvi">
                <ref role="37wK5l" to="lwvz:~SelectionManager.getSelection():jetbrains.mps.openapi.editor.selection.Selection" resolve="getSelection" />
              </node>
            </node>
          </node>
        </node>
        <node concept="1gVbGN" id="6zv$FxYwgCt" role="3cqZAp">
          <node concept="3y3z36" id="6zv$FxYwgCw" role="1gVkn0">
            <node concept="10Nm6u" id="6zv$FxYwgCz" role="3uHU7w" />
            <node concept="37vLTw" id="3GM_nagT_Y1" role="3uHU7B">
              <ref role="3cqZAo" node="6zv$FxYwgCm" resolve="selection" />
            </node>
          </node>
          <node concept="Xl_RD" id="5XB$uk$kqEQ" role="1gVpfI">
            <property role="Xl_RC" value="Selection was not set in the resulting editor" />
          </node>
        </node>
        <node concept="3clFbJ" id="6zv$FxYwgC_" role="3cqZAp">
          <node concept="3eNFk2" id="6zv$FxYwgDX" role="3eNLev">
            <node concept="2ZW3vV" id="6zv$FxYwgE1" role="3eO9$A">
              <node concept="37vLTw" id="3GM_nagTtHi" role="2ZW6bz">
                <ref role="3cqZAo" node="6zv$FxYwgCm" resolve="selection" />
              </node>
              <node concept="3uibUv" id="6zv$FxYwgE4" role="2ZW6by">
                <ref role="3uigEE" to="b8lf:~NodeRangeSelection" resolve="NodeRangeSelection" />
              </node>
            </node>
            <node concept="3clFbS" id="6zv$FxYwgDZ" role="3eOfB_">
              <node concept="3cpWs8" id="6zv$FxYwgE7" role="3cqZAp">
                <node concept="3cpWsn" id="6zv$FxYwgE8" role="3cpWs9">
                  <property role="TrG5h" value="rangeSelection" />
                  <node concept="3uibUv" id="6zv$FxYwgE9" role="1tU5fm">
                    <ref role="3uigEE" to="b8lf:~NodeRangeSelection" resolve="NodeRangeSelection" />
                  </node>
                  <node concept="10QFUN" id="6zv$FxYwgEb" role="33vP2m">
                    <node concept="3uibUv" id="6zv$FxYwgEc" role="10QFUM">
                      <ref role="3uigEE" to="b8lf:~NodeRangeSelection" resolve="NodeRangeSelection" />
                    </node>
                    <node concept="37vLTw" id="3GM_nagTAAc" role="10QFUP">
                      <ref role="3cqZAo" node="6zv$FxYwgCm" resolve="selection" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="2Hmddi" id="6zv$FxYwgFo" role="3cqZAp">
                <node concept="2OqwBi" id="4MvMldnsgjd" role="2Hmdds">
                  <node concept="3TrEf2" id="4MvMldnsgjf" role="2OqNvi">
                    <ref role="3Tt5mk" to="tp5g:1FgNkkI7TFc" />
                  </node>
                  <node concept="37vLTw" id="2BHiRxeuoKz" role="2Oq$k0">
                    <ref role="3cqZAo" node="hSdCl0x" resolve="myAnnotation" />
                  </node>
                </node>
              </node>
              <node concept="2Hmddi" id="6zv$FxYwgFx" role="3cqZAp">
                <node concept="2OqwBi" id="4MvMldnsgju" role="2Hmdds">
                  <node concept="3TrEf2" id="4MvMldnsgjw" role="2OqNvi">
                    <ref role="3Tt5mk" to="tp5g:1FgNkkI7TFd" />
                  </node>
                  <node concept="37vLTw" id="2BHiRxeuTF5" role="2Oq$k0">
                    <ref role="3cqZAo" node="hSdCl0x" resolve="myAnnotation" />
                  </node>
                </node>
              </node>
              <node concept="3vlDli" id="6zv$FxYwgEn" role="3cqZAp">
                <node concept="3EllGN" id="6zv$FxYwgEo" role="3tpDZA">
                  <node concept="37vLTw" id="2BHiRxghfr2" role="3ElQJh">
                    <ref role="3cqZAo" node="1FgNkkI909P" resolve="map" />
                  </node>
                  <node concept="2OqwBi" id="6zv$FxYwgEq" role="3ElVtu">
                    <node concept="liA8E" id="6zv$FxYwgEs" role="2OqNvi">
                      <ref role="37wK5l" to="b8lf:~AbstractMultipleSelection.getFirstNode():org.jetbrains.mps.openapi.model.SNode" resolve="getFirstNode" />
                    </node>
                    <node concept="37vLTw" id="3GM_nagTuIq" role="2Oq$k0">
                      <ref role="3cqZAo" node="6zv$FxYwgE8" resolve="rangeSelection" />
                    </node>
                  </node>
                </node>
                <node concept="3EllGN" id="6zv$FxYwgEt" role="3tpDZB">
                  <node concept="2OqwBi" id="4MvMldnsgjg" role="3ElVtu">
                    <node concept="3TrEf2" id="4MvMldnsgji" role="2OqNvi">
                      <ref role="3Tt5mk" to="tp5g:1FgNkkI7TFc" />
                    </node>
                    <node concept="37vLTw" id="2BHiRxeukFU" role="2Oq$k0">
                      <ref role="3cqZAo" node="hSdCl0x" resolve="myAnnotation" />
                    </node>
                  </node>
                  <node concept="37vLTw" id="2BHiRxeug4V" role="3ElQJh">
                    <ref role="3cqZAo" node="1UE$z6yumPt" resolve="myMap" />
                  </node>
                </node>
              </node>
              <node concept="3vlDli" id="6zv$FxYwgEy" role="3cqZAp">
                <node concept="3EllGN" id="6zv$FxYwgEC" role="3tpDZB">
                  <node concept="37vLTw" id="2BHiRxeuW1n" role="3ElQJh">
                    <ref role="3cqZAo" node="1UE$z6yumPt" resolve="myMap" />
                  </node>
                  <node concept="2OqwBi" id="4MvMldnsgjo" role="3ElVtu">
                    <node concept="3TrEf2" id="4MvMldnsgjq" role="2OqNvi">
                      <ref role="3Tt5mk" to="tp5g:1FgNkkI7TFd" />
                    </node>
                    <node concept="37vLTw" id="2BHiRxeuVtM" role="2Oq$k0">
                      <ref role="3cqZAo" node="hSdCl0x" resolve="myAnnotation" />
                    </node>
                  </node>
                </node>
                <node concept="3EllGN" id="6zv$FxYwgEz" role="3tpDZA">
                  <node concept="2OqwBi" id="6zv$FxYwgE_" role="3ElVtu">
                    <node concept="liA8E" id="6zv$FxYwgEA" role="2OqNvi">
                      <ref role="37wK5l" to="b8lf:~AbstractMultipleSelection.getLastNode():org.jetbrains.mps.openapi.model.SNode" resolve="getLastNode" />
                    </node>
                    <node concept="37vLTw" id="3GM_nagTwU0" role="2Oq$k0">
                      <ref role="3cqZAo" node="6zv$FxYwgE8" resolve="rangeSelection" />
                    </node>
                  </node>
                  <node concept="37vLTw" id="2BHiRxgmbAh" role="3ElQJh">
                    <ref role="3cqZAo" node="1FgNkkI909P" resolve="map" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbS" id="6zv$FxYwgCA" role="3clFbx">
            <node concept="3cpWs8" id="6zv$FxYwgCP" role="3cqZAp">
              <node concept="3cpWsn" id="6zv$FxYwgCQ" role="3cpWs9">
                <property role="TrG5h" value="selectedCell" />
                <node concept="2OqwBi" id="6zv$FxYwgD3" role="33vP2m">
                  <node concept="liA8E" id="6zv$FxYwgD7" role="2OqNvi">
                    <ref role="37wK5l" to="lwvz:~SingularSelection.getEditorCell():jetbrains.mps.openapi.editor.cells.EditorCell" resolve="getEditorCell" />
                  </node>
                  <node concept="1eOMI4" id="6zv$FxYwgD2" role="2Oq$k0">
                    <node concept="10QFUN" id="6zv$FxYwgCX" role="1eOMHV">
                      <node concept="3uibUv" id="6zv$FxYwgD0" role="10QFUM">
                        <ref role="3uigEE" to="lwvz:~SingularSelection" resolve="SingularSelection" />
                      </node>
                      <node concept="37vLTw" id="3GM_nagTvd_" role="10QFUP">
                        <ref role="3cqZAo" node="6zv$FxYwgCm" resolve="selection" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3uibUv" id="4MvMldnsgmx" role="1tU5fm">
                  <ref role="3uigEE" to="f4zo:~EditorCell" resolve="EditorCell" />
                </node>
              </node>
            </node>
            <node concept="3vMLTj" id="6zv$FxYwgDa" role="3cqZAp">
              <node concept="1rXfSq" id="ORe5oEaqHQ" role="3tpDZB">
                <ref role="37wK5l" node="hQJuSEb" resolve="getNode" />
              </node>
              <node concept="3EllGN" id="6zv$FxYwgDc" role="3tpDZA">
                <node concept="37vLTw" id="2BHiRxgm8ht" role="3ElQJh">
                  <ref role="3cqZAo" node="1FgNkkI909P" resolve="map" />
                </node>
                <node concept="2OqwBi" id="6zv$FxYwgDd" role="3ElVtu">
                  <node concept="37vLTw" id="3GM_nagT_ml" role="2Oq$k0">
                    <ref role="3cqZAo" node="6zv$FxYwgCQ" resolve="selectedCell" />
                  </node>
                  <node concept="liA8E" id="6zv$FxYwgDh" role="2OqNvi">
                    <ref role="37wK5l" to="f4zo:~EditorCell.getSNode():org.jetbrains.mps.openapi.model.SNode" resolve="getSNode" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3vlDli" id="6zv$FxYwgDp" role="3cqZAp">
              <node concept="2OqwBi" id="1xCYTpJE71x" role="3tpDZA">
                <node concept="liA8E" id="1xCYTpJE71y" role="2OqNvi">
                  <ref role="37wK5l" to="f4zo:~EditorCell.getCellId():java.lang.String" resolve="getCellId" />
                </node>
                <node concept="37vLTw" id="1xCYTpJE71z" role="2Oq$k0">
                  <ref role="3cqZAo" node="6zv$FxYwgCQ" resolve="selectedCell" />
                </node>
              </node>
              <node concept="2OqwBi" id="1xCYTpJE6XY" role="3tpDZB">
                <node concept="37vLTw" id="ORe5oEaqJh" role="2Oq$k0">
                  <ref role="3cqZAo" node="hSdCl0x" resolve="myAnnotation" />
                </node>
                <node concept="3TrcHB" id="1xCYTpJE6XZ" role="2OqNvi">
                  <ref role="3TsBF5" to="tp5g:hSLIFSj" resolve="cellId" />
                </node>
              </node>
            </node>
            <node concept="3clFbJ" id="6zv$FxYwgDy" role="3cqZAp">
              <node concept="2ZW3vV" id="6zv$FxYwgDS" role="3clFbw">
                <node concept="37vLTw" id="3GM_nagTzxF" role="2ZW6bz">
                  <ref role="3cqZAo" node="6zv$FxYwgCQ" resolve="selectedCell" />
                </node>
                <node concept="3uibUv" id="6zv$FxYwgDT" role="2ZW6by">
                  <ref role="3uigEE" to="g51k:~EditorCell_Label" resolve="EditorCell_Label" />
                </node>
              </node>
              <node concept="3clFbS" id="6zv$FxYwgDz" role="3clFbx">
                <node concept="3cpWs8" id="6zv$FxYwgD$" role="3cqZAp">
                  <node concept="3cpWsn" id="6zv$FxYwgD_" role="3cpWs9">
                    <property role="TrG5h" value="label" />
                    <node concept="3uibUv" id="6zv$FxYwgDA" role="1tU5fm">
                      <ref role="3uigEE" to="g51k:~EditorCell_Label" resolve="EditorCell_Label" />
                    </node>
                    <node concept="10QFUN" id="6zv$FxYwgDB" role="33vP2m">
                      <node concept="3uibUv" id="6zv$FxYwgDC" role="10QFUM">
                        <ref role="3uigEE" to="g51k:~EditorCell_Label" resolve="EditorCell_Label" />
                      </node>
                      <node concept="37vLTw" id="3GM_nagTsDw" role="10QFUP">
                        <ref role="3cqZAo" node="6zv$FxYwgCQ" resolve="selectedCell" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3vlDli" id="6zv$FxYwgDE" role="3cqZAp">
                  <node concept="2OqwBi" id="6zv$FxYwgDF" role="3tpDZA">
                    <node concept="37vLTw" id="3GM_nagTsuK" role="2Oq$k0">
                      <ref role="3cqZAo" node="6zv$FxYwgD_" resolve="label" />
                    </node>
                    <node concept="liA8E" id="6zv$FxYwgDH" role="2OqNvi">
                      <ref role="37wK5l" to="g51k:~EditorCell_Label.getSelectionStart():int" resolve="getSelectionStart" />
                    </node>
                  </node>
                  <node concept="2OqwBi" id="4MvMldnsgiZ" role="3tpDZB">
                    <node concept="3TrcHB" id="4MvMldnsgj1" role="2OqNvi">
                      <ref role="3TsBF5" to="tp5g:5rZKa_fTvKN" resolve="selectionStart" />
                    </node>
                    <node concept="37vLTw" id="2BHiRxeuyT5" role="2Oq$k0">
                      <ref role="3cqZAo" node="hSdCl0x" resolve="myAnnotation" />
                    </node>
                  </node>
                </node>
                <node concept="3vlDli" id="6zv$FxYwgDL" role="3cqZAp">
                  <node concept="2OqwBi" id="6zv$FxYwgDM" role="3tpDZA">
                    <node concept="liA8E" id="6zv$FxYwgDO" role="2OqNvi">
                      <ref role="37wK5l" to="g51k:~EditorCell_Label.getSelectionEnd():int" resolve="getSelectionEnd" />
                    </node>
                    <node concept="37vLTw" id="3GM_nagTu2S" role="2Oq$k0">
                      <ref role="3cqZAo" node="6zv$FxYwgD_" resolve="label" />
                    </node>
                  </node>
                  <node concept="2OqwBi" id="4MvMldnsgj4" role="3tpDZB">
                    <node concept="3TrcHB" id="4MvMldnsgj6" role="2OqNvi">
                      <ref role="3TsBF5" to="tp5g:5rZKa_fTvKP" resolve="selectionEnd" />
                    </node>
                    <node concept="37vLTw" id="2BHiRxeukEr" role="2Oq$k0">
                      <ref role="3cqZAo" node="hSdCl0x" resolve="myAnnotation" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3ykFI1" id="6zv$FxYwgF4" role="3cqZAp">
              <node concept="2OqwBi" id="4MvMldnsgja" role="3ykU8v">
                <node concept="3TrEf2" id="4MvMldnsgjc" role="2OqNvi">
                  <ref role="3Tt5mk" to="tp5g:1FgNkkI7TFc" />
                </node>
                <node concept="37vLTw" id="2BHiRxeunuD" role="2Oq$k0">
                  <ref role="3cqZAo" node="hSdCl0x" resolve="myAnnotation" />
                </node>
              </node>
            </node>
            <node concept="3ykFI1" id="6zv$FxYwgFf" role="3cqZAp">
              <node concept="2OqwBi" id="4MvMldnsgjl" role="3ykU8v">
                <node concept="37vLTw" id="2BHiRxeuhUa" role="2Oq$k0">
                  <ref role="3cqZAo" node="hSdCl0x" resolve="myAnnotation" />
                </node>
                <node concept="3TrEf2" id="4MvMldnsgjn" role="2OqNvi">
                  <ref role="3Tt5mk" to="tp5g:1FgNkkI7TFd" />
                </node>
              </node>
            </node>
          </node>
          <node concept="2ZW3vV" id="6zv$FxYwgCE" role="3clFbw">
            <node concept="37vLTw" id="3GM_nagTxUm" role="2ZW6bz">
              <ref role="3cqZAo" node="6zv$FxYwgCm" resolve="selection" />
            </node>
            <node concept="3uibUv" id="6zv$FxYwgCH" role="2ZW6by">
              <ref role="3uigEE" to="lwvz:~SingularSelection" resolve="SingularSelection" />
            </node>
          </node>
          <node concept="9aQIb" id="4qXCiMm5JQS" role="9aQIa">
            <node concept="3clFbS" id="4qXCiMm5JQT" role="9aQI4">
              <node concept="3xETmq" id="4qXCiMm5Nm2" role="3cqZAp">
                <node concept="3_1$Yv" id="4qXCiMm5Nm3" role="3_9lra">
                  <node concept="3cpWs3" id="4qXCiMm5Nm4" role="3_1BAH">
                    <node concept="2OqwBi" id="4qXCiMm5Nm5" role="3uHU7w">
                      <node concept="37vLTw" id="3GM_nagTA5c" role="2Oq$k0">
                        <ref role="3cqZAo" node="6zv$FxYwgCm" resolve="selection" />
                      </node>
                      <node concept="liA8E" id="4qXCiMm5Nm7" role="2OqNvi">
                        <ref role="37wK5l" to="wyt6:~Object.getClass():java.lang.Class" resolve="getClass" />
                      </node>
                    </node>
                    <node concept="Xl_RD" id="4qXCiMm5Nm8" role="3uHU7B">
                      <property role="Xl_RC" value="Selection of unsupported type: " />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3cqZAl" id="5rZKa_fUlNe" role="3clF45" />
      <node concept="3Tm1VV" id="5rZKa_fUlNf" role="1B3o_S" />
    </node>
    <node concept="3Tm1VV" id="hQFSbBt" role="1B3o_S" />
  </node>
  <node concept="312cEu" id="6eZEP_6N6Lh">
    <property role="TrG5h" value="TypeSystemCheckUtil" />
    <property role="3GE5qa" value="util" />
    <node concept="3clFbW" id="6eZEP_6N6Lj" role="jymVt">
      <node concept="3cqZAl" id="6eZEP_6N6Lk" role="3clF45" />
      <node concept="3Tm1VV" id="6eZEP_6N6Ll" role="1B3o_S" />
      <node concept="3clFbS" id="6eZEP_6N6Lm" role="3clF47" />
    </node>
    <node concept="2YIFZL" id="6eZEP_6N6Ln" role="jymVt">
      <property role="TrG5h" value="checkGenerationMode" />
      <node concept="37vLTG" id="6eZEP_6N6Lr" role="3clF46">
        <property role="TrG5h" value="node" />
        <node concept="3Tqbb2" id="6eZEP_6N6Ls" role="1tU5fm">
          <ref role="ehGHo" to="tpck:gw2VY9q" resolve="BaseConcept" />
        </node>
      </node>
      <node concept="3cqZAl" id="6eZEP_6N6Lo" role="3clF45" />
      <node concept="3Tm1VV" id="6eZEP_6N6Lp" role="1B3o_S" />
      <node concept="3clFbS" id="6eZEP_6N6Lq" role="3clF47">
        <node concept="3cpWs8" id="6eZEP_6Naxx" role="3cqZAp">
          <node concept="3cpWsn" id="6eZEP_6Naxy" role="3cpWs9">
            <property role="TrG5h" value="typeCheckingContext" />
            <node concept="3uibUv" id="6eZEP_6Naxz" role="1tU5fm">
              <ref role="3uigEE" to="u78q:~TypeCheckingContext" resolve="TypeCheckingContext" />
            </node>
            <node concept="2OqwBi" id="6eZEP_6Nax$" role="33vP2m">
              <node concept="2YIFZM" id="6eZEP_6Nax_" role="2Oq$k0">
                <ref role="37wK5l" to="u78q:~TypeContextManager.getInstance():jetbrains.mps.typesystem.inference.TypeContextManager" resolve="getInstance" />
                <ref role="1Pybhc" to="u78q:~TypeContextManager" resolve="TypeContextManager" />
              </node>
              <node concept="liA8E" id="6eZEP_6NaxA" role="2OqNvi">
                <ref role="37wK5l" to="u78q:~TypeContextManager.createTypeCheckingContext(org.jetbrains.mps.openapi.model.SNode):jetbrains.mps.typesystem.inference.TypeCheckingContext" resolve="createTypeCheckingContext" />
                <node concept="2OqwBi" id="46wqQ5NQwrn" role="37wK5m">
                  <node concept="liA8E" id="46wqQ5NQwro" role="2OqNvi">
                    <ref role="37wK5l" to="mhbf:~SNode.getContainingRoot():org.jetbrains.mps.openapi.model.SNode" resolve="getContainingRoot" />
                  </node>
                  <node concept="2JrnkZ" id="46wqQ5NQwrp" role="2Oq$k0">
                    <node concept="37vLTw" id="2BHiRxgmjju" role="2JrQYb">
                      <ref role="3cqZAo" node="6eZEP_6N6Lr" resolve="node" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6eZEP_6NaxF" role="3cqZAp">
          <node concept="2OqwBi" id="6eZEP_6NaxG" role="3clFbG">
            <node concept="37vLTw" id="3GM_nagTrBB" role="2Oq$k0">
              <ref role="3cqZAo" node="6eZEP_6Naxy" resolve="typeCheckingContext" />
            </node>
            <node concept="liA8E" id="6eZEP_6NaxI" role="2OqNvi">
              <ref role="37wK5l" to="u78q:~TypeCheckingContext.checkRoot(boolean):void" resolve="checkRoot" />
              <node concept="3clFbT" id="6eZEP_6NaxK" role="37wK5m">
                <property role="3clFbU" value="true" />
              </node>
            </node>
          </node>
        </node>
        <node concept="1DcWWT" id="6eZEP_6Nd4F" role="3cqZAp">
          <node concept="2OqwBi" id="6eZEP_6Nd4G" role="1DdaDG">
            <node concept="37vLTw" id="2BHiRxglQzQ" role="2Oq$k0">
              <ref role="3cqZAo" node="6eZEP_6N6Lr" resolve="node" />
            </node>
            <node concept="2Rf3mk" id="6eZEP_6Nd4I" role="2OqNvi">
              <node concept="1xMEDy" id="6eZEP_6Nd4J" role="1xVPHs">
                <node concept="chp4Y" id="6eZEP_6Nd4K" role="ri$Ld">
                  <ref role="cht4Q" to="tpck:gw2VY9q" resolve="BaseConcept" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3cpWsn" id="6eZEP_6Nd4L" role="1Duv9x">
            <property role="TrG5h" value="child" />
            <node concept="3Tqbb2" id="6eZEP_6Nd4M" role="1tU5fm">
              <ref role="ehGHo" to="tpck:gw2VY9q" resolve="BaseConcept" />
            </node>
          </node>
          <node concept="3clFbS" id="6eZEP_6Nd4N" role="2LFqv$">
            <node concept="3cpWs8" id="5aNngMbv_hz" role="3cqZAp">
              <node concept="3cpWsn" id="6qmUuHJR5Pm" role="3cpWs9">
                <property role="TrG5h" value="typeCheckingContext2" />
                <node concept="3uibUv" id="6qmUuHJR5Pn" role="1tU5fm">
                  <ref role="3uigEE" to="u78q:~TypeCheckingContext" resolve="TypeCheckingContext" />
                </node>
                <node concept="2OqwBi" id="6qmUuHJR5Po" role="33vP2m">
                  <node concept="2YIFZM" id="6qmUuHJR5Pp" role="2Oq$k0">
                    <ref role="1Pybhc" to="u78q:~TypeContextManager" resolve="TypeContextManager" />
                    <ref role="37wK5l" to="u78q:~TypeContextManager.getInstance():jetbrains.mps.typesystem.inference.TypeContextManager" resolve="getInstance" />
                  </node>
                  <node concept="liA8E" id="6qmUuHJR5Pq" role="2OqNvi">
                    <ref role="37wK5l" to="u78q:~TypeContextManager.createTracingTypeCheckingContext(org.jetbrains.mps.openapi.model.SNode):jetbrains.mps.typesystem.inference.TypeCheckingContext" resolve="createTracingTypeCheckingContext" />
                    <node concept="2OqwBi" id="46wqQ5NQwsy" role="37wK5m">
                      <node concept="liA8E" id="46wqQ5NQwsz" role="2OqNvi">
                        <ref role="37wK5l" to="mhbf:~SNode.getContainingRoot():org.jetbrains.mps.openapi.model.SNode" resolve="getContainingRoot" />
                      </node>
                      <node concept="2JrnkZ" id="46wqQ5NQws$" role="2Oq$k0">
                        <node concept="37vLTw" id="2BHiRxgm7zs" role="2JrQYb">
                          <ref role="3cqZAo" node="6eZEP_6N6Lr" resolve="node" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3cpWs8" id="6eZEP_6Nd7E" role="3cqZAp">
              <node concept="3cpWsn" id="6eZEP_6Nd7F" role="3cpWs9">
                <property role="TrG5h" value="type1" />
                <node concept="3uibUv" id="6eZEP_6Nd7G" role="1tU5fm">
                  <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
                </node>
                <node concept="2OqwBi" id="6eZEP_6Nd7H" role="33vP2m">
                  <node concept="37vLTw" id="3GM_nagTASR" role="2Oq$k0">
                    <ref role="3cqZAo" node="6eZEP_6Naxy" resolve="typeCheckingContext" />
                  </node>
                  <node concept="liA8E" id="6eZEP_6Nd7J" role="2OqNvi">
                    <ref role="37wK5l" to="u78q:~TypeCheckingContext.getTypeDontCheck(org.jetbrains.mps.openapi.model.SNode):org.jetbrains.mps.openapi.model.SNode" resolve="getTypeDontCheck" />
                    <node concept="37vLTw" id="3GM_nagTus7" role="37wK5m">
                      <ref role="3cqZAo" node="6eZEP_6Nd4L" resolve="child" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbJ" id="2b8kI$OPofc" role="3cqZAp">
              <node concept="3clFbS" id="2b8kI$OPofd" role="3clFbx">
                <node concept="3N13vt" id="2b8kI$OPofn" role="3cqZAp" />
              </node>
              <node concept="3clFbC" id="2b8kI$OPofj" role="3clFbw">
                <node concept="10Nm6u" id="2b8kI$OPofm" role="3uHU7w" />
                <node concept="37vLTw" id="3GM_nagTtjp" role="3uHU7B">
                  <ref role="3cqZAo" node="6eZEP_6Nd7F" resolve="type1" />
                </node>
              </node>
            </node>
            <node concept="3cpWs8" id="6eZEP_6Nd81" role="3cqZAp">
              <node concept="3cpWsn" id="6eZEP_6Nd82" role="3cpWs9">
                <property role="TrG5h" value="type2" />
                <node concept="3uibUv" id="6eZEP_6Nd83" role="1tU5fm">
                  <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
                </node>
                <node concept="2OqwBi" id="5h3CSGmn39i" role="33vP2m">
                  <node concept="liA8E" id="5h3CSGmn39k" role="2OqNvi">
                    <ref role="37wK5l" to="u78q:~TypeCheckingContext.getTypeInGenerationMode(org.jetbrains.mps.openapi.model.SNode):org.jetbrains.mps.openapi.model.SNode" resolve="getTypeInGenerationMode" />
                    <node concept="37vLTw" id="3GM_nagTr5j" role="37wK5m">
                      <ref role="3cqZAo" node="6eZEP_6Nd4L" resolve="child" />
                    </node>
                  </node>
                  <node concept="37vLTw" id="3GM_nagTyIL" role="2Oq$k0">
                    <ref role="3cqZAo" node="6qmUuHJR5Pm" resolve="typeCheckingContext2" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3vwNmj" id="6eZEP_6P2ME" role="3cqZAp">
              <node concept="2YIFZM" id="6eZEP_6P2MH" role="3vwVQn">
                <ref role="1Pybhc" to="ghoz:~TypesUtil" resolve="TypesUtil" />
                <ref role="37wK5l" to="ghoz:~TypesUtil.match(org.jetbrains.mps.openapi.model.SNode,org.jetbrains.mps.openapi.model.SNode):boolean" resolve="match" />
                <node concept="37vLTw" id="3GM_nagTA9S" role="37wK5m">
                  <ref role="3cqZAo" node="6eZEP_6Nd7F" resolve="type1" />
                </node>
                <node concept="37vLTw" id="3GM_nagTte1" role="37wK5m">
                  <ref role="3cqZAo" node="6eZEP_6Nd82" resolve="type2" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2YIFZL" id="6eZEP_6Nd8k" role="jymVt">
      <property role="TrG5h" value="checkRollBacks" />
      <node concept="37vLTG" id="6eZEP_6Nd8l" role="3clF46">
        <property role="TrG5h" value="node" />
        <node concept="3Tqbb2" id="6eZEP_6Nd8m" role="1tU5fm">
          <ref role="ehGHo" to="tpck:gw2VY9q" resolve="BaseConcept" />
        </node>
      </node>
      <node concept="3cqZAl" id="6eZEP_6Nd8n" role="3clF45" />
      <node concept="3Tm1VV" id="6eZEP_6Nd8o" role="1B3o_S" />
      <node concept="3clFbS" id="6eZEP_6Nd8p" role="3clF47">
        <node concept="3cpWs8" id="6eZEP_6Nd8q" role="3cqZAp">
          <node concept="3cpWsn" id="6eZEP_6Nd8r" role="3cpWs9">
            <property role="TrG5h" value="typeCheckingContext" />
            <node concept="2OqwBi" id="6eZEP_6Nd8t" role="33vP2m">
              <node concept="2YIFZM" id="6eZEP_6Nd8u" role="2Oq$k0">
                <ref role="37wK5l" to="u78q:~TypeContextManager.getInstance():jetbrains.mps.typesystem.inference.TypeContextManager" resolve="getInstance" />
                <ref role="1Pybhc" to="u78q:~TypeContextManager" resolve="TypeContextManager" />
              </node>
              <node concept="liA8E" id="6eZEP_6Nd8v" role="2OqNvi">
                <ref role="37wK5l" to="u78q:~TypeContextManager.createTracingTypeCheckingContext(org.jetbrains.mps.openapi.model.SNode):jetbrains.mps.typesystem.inference.TypeCheckingContext" resolve="createTracingTypeCheckingContext" />
                <node concept="2OqwBi" id="46wqQ5NQwsh" role="37wK5m">
                  <node concept="liA8E" id="46wqQ5NQwsi" role="2OqNvi">
                    <ref role="37wK5l" to="mhbf:~SNode.getContainingRoot():org.jetbrains.mps.openapi.model.SNode" resolve="getContainingRoot" />
                  </node>
                  <node concept="2JrnkZ" id="46wqQ5NQwsj" role="2Oq$k0">
                    <node concept="37vLTw" id="2BHiRxgmx2K" role="2JrQYb">
                      <ref role="3cqZAo" node="6eZEP_6Nd8l" resolve="node" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3uibUv" id="3zwLWs0ICRN" role="1tU5fm">
              <ref role="3uigEE" to="u78q:~TypeCheckingContext" resolve="TypeCheckingContext" />
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="6eZEP_6OM2T" role="3cqZAp">
          <node concept="3cpWsn" id="6eZEP_6OM2U" role="3cpWs9">
            <property role="TrG5h" value="state" />
            <node concept="3uibUv" id="6eZEP_6OM2V" role="1tU5fm">
              <ref role="3uigEE" to="tmra:~State" resolve="State" />
            </node>
            <node concept="2OqwBi" id="6eZEP_6OM2W" role="33vP2m">
              <node concept="37vLTw" id="3GM_nagTwaj" role="2Oq$k0">
                <ref role="3cqZAo" node="6eZEP_6Nd8r" resolve="typeCheckingContext" />
              </node>
              <node concept="liA8E" id="6eZEP_6OM31" role="2OqNvi">
                <ref role="37wK5l" to="u78q:~TypeCheckingContext.getState():jetbrains.mps.newTypesystem.state.State" resolve="getState" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="vOrWn1iyrQ" role="3cqZAp">
          <node concept="3cpWsn" id="vOrWn1iyrR" role="3cpWs9">
            <property role="TrG5h" value="state2" />
            <node concept="3uibUv" id="vOrWn1iyrS" role="1tU5fm">
              <ref role="3uigEE" to="tmra:~State" resolve="State" />
            </node>
            <node concept="2ShNRf" id="vOrWn1iyrT" role="33vP2m">
              <node concept="1pGfFk" id="vOrWn1iyrU" role="2ShVmc">
                <ref role="37wK5l" to="tmra:~State.&lt;init&gt;(jetbrains.mps.typesystem.inference.TypeCheckingContext)" resolve="State" />
                <node concept="2OqwBi" id="vOrWn1iyrV" role="37wK5m">
                  <node concept="37vLTw" id="3GM_nagTBfr" role="2Oq$k0">
                    <ref role="3cqZAo" node="6eZEP_6OM2U" resolve="state" />
                  </node>
                  <node concept="liA8E" id="vOrWn1iyrX" role="2OqNvi">
                    <ref role="37wK5l" to="tmra:~State.getTypeCheckingContext():jetbrains.mps.typesystem.inference.TypeCheckingContext" resolve="getTypeCheckingContext" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="5WnxMwdsDYt" role="3cqZAp">
          <node concept="3cpWsn" id="5WnxMwdsDYu" role="3cpWs9">
            <property role="TrG5h" value="rootOperation" />
            <node concept="3uibUv" id="5WnxMwdsDYv" role="1tU5fm">
              <ref role="3uigEE" to="ovrg:~AbstractOperation" resolve="AbstractOperation" />
            </node>
            <node concept="2OqwBi" id="5WnxMwdsDYw" role="33vP2m">
              <node concept="37vLTw" id="3GM_nagTy7o" role="2Oq$k0">
                <ref role="3cqZAo" node="6eZEP_6OM2U" resolve="state" />
              </node>
              <node concept="liA8E" id="5WnxMwdsDYy" role="2OqNvi">
                <ref role="37wK5l" to="tmra:~State.getOperation():jetbrains.mps.newTypesystem.operation.AbstractOperation" resolve="getOperation" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="5WnxMwdsk0V" role="3cqZAp">
          <node concept="3cpWsn" id="5WnxMwdsk0W" role="3cpWs9">
            <property role="TrG5h" value="operations" />
            <node concept="3uibUv" id="5WnxMwdsk0X" role="1tU5fm">
              <ref role="3uigEE" to="33ny:~List" resolve="List" />
              <node concept="3uibUv" id="5WnxMwdsk0Y" role="11_B2D">
                <ref role="3uigEE" to="ovrg:~AbstractOperation" resolve="AbstractOperation" />
              </node>
            </node>
            <node concept="2OqwBi" id="5WnxMwdsk0Z" role="33vP2m">
              <node concept="37vLTw" id="3GM_nagTvrX" role="2Oq$k0">
                <ref role="3cqZAo" node="6eZEP_6OM2U" resolve="state" />
              </node>
              <node concept="liA8E" id="5WnxMwdsk11" role="2OqNvi">
                <ref role="37wK5l" to="tmra:~State.getOperationsAsList():java.util.List" resolve="getOperationsAsList" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="5WnxMwdsDZ7" role="3cqZAp">
          <node concept="3cpWsn" id="5WnxMwdsDZ8" role="3cpWs9">
            <property role="TrG5h" value="num" />
            <node concept="10Oyi0" id="5WnxMwdsDZ9" role="1tU5fm" />
            <node concept="FJ1c_" id="5WnxMwdsDZh" role="33vP2m">
              <node concept="3cmrfG" id="5WnxMwdsDZk" role="3uHU7w">
                <property role="3cmrfH" value="3" />
              </node>
              <node concept="2OqwBi" id="5WnxMwdsDZc" role="3uHU7B">
                <node concept="37vLTw" id="3GM_nagTzqp" role="2Oq$k0">
                  <ref role="3cqZAo" node="5WnxMwdsk0W" resolve="operations" />
                </node>
                <node concept="liA8E" id="5WnxMwdsDZg" role="2OqNvi">
                  <ref role="37wK5l" to="33ny:~List.size():int" resolve="size" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="5WnxMwdsk1w" role="3cqZAp">
          <node concept="3cpWsn" id="5WnxMwdsk1x" role="3cpWs9">
            <property role="TrG5h" value="operation" />
            <node concept="3uibUv" id="5WnxMwdsk1y" role="1tU5fm">
              <ref role="3uigEE" to="ovrg:~AbstractOperation" resolve="AbstractOperation" />
            </node>
            <node concept="2OqwBi" id="5WnxMwdsk1z" role="33vP2m">
              <node concept="37vLTw" id="3GM_nagTunA" role="2Oq$k0">
                <ref role="3cqZAo" node="5WnxMwdsk0W" resolve="operations" />
              </node>
              <node concept="liA8E" id="5WnxMwdsk1_" role="2OqNvi">
                <ref role="37wK5l" to="33ny:~List.get(int):java.lang.Object" resolve="get" />
                <node concept="37vLTw" id="3GM_nagTzGF" role="37wK5m">
                  <ref role="3cqZAo" node="5WnxMwdsDZ8" resolve="num" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5WnxMwdsk1f" role="3cqZAp">
          <node concept="2YIFZM" id="5WnxMwdsk1h" role="3clFbG">
            <ref role="37wK5l" to="33ny:~Collections.reverse(java.util.List):void" resolve="reverse" />
            <ref role="1Pybhc" to="33ny:~Collections" resolve="Collections" />
            <node concept="37vLTw" id="3GM_nagTsLd" role="37wK5m">
              <ref role="3cqZAo" node="5WnxMwdsk0W" resolve="operations" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5WnxMwdsk13" role="3cqZAp">
          <node concept="2OqwBi" id="5WnxMwdsk14" role="3clFbG">
            <node concept="37vLTw" id="3GM_nagTzs2" role="2Oq$k0">
              <ref role="3cqZAo" node="vOrWn1iyrR" resolve="state2" />
            </node>
            <node concept="liA8E" id="5WnxMwdsk16" role="2OqNvi">
              <ref role="37wK5l" to="tmra:~State.executeOperationsBeforeAnchor(jetbrains.mps.newTypesystem.operation.AbstractOperation,java.lang.Object):boolean" resolve="executeOperationsBeforeAnchor" />
              <node concept="37vLTw" id="3GM_nagTvO0" role="37wK5m">
                <ref role="3cqZAo" node="5WnxMwdsDYu" resolve="rootOperation" />
              </node>
              <node concept="37vLTw" id="3GM_nagT$dI" role="37wK5m">
                <ref role="3cqZAo" node="5WnxMwdsk1x" resolve="operation" />
              </node>
            </node>
          </node>
        </node>
        <node concept="1DcWWT" id="5WnxMwdsDYA" role="3cqZAp">
          <node concept="3clFbS" id="5WnxMwdsDYB" role="2LFqv$">
            <node concept="3clFbJ" id="5WnxMwdsDYM" role="3cqZAp">
              <node concept="2OqwBi" id="5WnxMwdsDYQ" role="3clFbw">
                <node concept="37vLTw" id="3GM_nagTvaa" role="2Oq$k0">
                  <ref role="3cqZAo" node="5WnxMwdsDYD" resolve="toRevert" />
                </node>
                <node concept="liA8E" id="5WnxMwdsDYU" role="2OqNvi">
                  <ref role="37wK5l" to="wyt6:~Object.equals(java.lang.Object):boolean" resolve="equals" />
                  <node concept="37vLTw" id="3GM_nagTuJJ" role="37wK5m">
                    <ref role="3cqZAo" node="5WnxMwdsk1x" resolve="operation" />
                  </node>
                </node>
              </node>
              <node concept="3clFbS" id="5WnxMwdsDYO" role="3clFbx">
                <node concept="3zACq4" id="5WnxMwdsDYW" role="3cqZAp" />
              </node>
            </node>
            <node concept="3clFbF" id="5WnxMwdsDYY" role="3cqZAp">
              <node concept="2OqwBi" id="5WnxMwdsDZ0" role="3clFbG">
                <node concept="37vLTw" id="3GM_nagTyO0" role="2Oq$k0">
                  <ref role="3cqZAo" node="5WnxMwdsDYD" resolve="toRevert" />
                </node>
                <node concept="liA8E" id="5WnxMwdsDZ4" role="2OqNvi">
                  <ref role="37wK5l" to="ovrg:~AbstractOperation.undo(jetbrains.mps.newTypesystem.state.State):void" resolve="undo" />
                  <node concept="37vLTw" id="3GM_nagTyxs" role="37wK5m">
                    <ref role="3cqZAo" node="6eZEP_6OM2U" resolve="state" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3cpWsn" id="5WnxMwdsDYD" role="1Duv9x">
            <property role="TrG5h" value="toRevert" />
            <node concept="3uibUv" id="5WnxMwdsDYF" role="1tU5fm">
              <ref role="3uigEE" to="ovrg:~AbstractOperation" resolve="AbstractOperation" />
            </node>
          </node>
          <node concept="37vLTw" id="3GM_nagTx4b" role="1DdaDG">
            <ref role="3cqZAo" node="5WnxMwdsk0W" resolve="operations" />
          </node>
        </node>
        <node concept="3vwNmj" id="vOrWn1iyxa" role="3cqZAp">
          <node concept="2YIFZM" id="5WnxMwdrKzq" role="3vwVQn">
            <ref role="37wK5l" to="m77x:~StateMatcher.match(jetbrains.mps.newTypesystem.state.State,jetbrains.mps.newTypesystem.state.State):boolean" resolve="match" />
            <ref role="1Pybhc" to="m77x:~StateMatcher" resolve="StateMatcher" />
            <node concept="37vLTw" id="3GM_nagT_Lb" role="37wK5m">
              <ref role="3cqZAo" node="6eZEP_6OM2U" resolve="state" />
            </node>
            <node concept="37vLTw" id="3GM_nagTBrS" role="37wK5m">
              <ref role="3cqZAo" node="vOrWn1iyrR" resolve="state2" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3Tm1VV" id="6eZEP_6N6Li" role="1B3o_S" />
  </node>
  <node concept="312cEu" id="6azle7m2XHB">
    <property role="TrG5h" value="TransformationTestRunner" />
    <property role="3GE5qa" value="transformation" />
    <node concept="3uibUv" id="4_ksyPqOD75" role="EKbjA">
      <ref role="3uigEE" node="4_ksyPqMhZ7" resolve="TestRunner" />
    </node>
    <node concept="Wx3nA" id="2jln2Vr6Rld" role="jymVt">
      <property role="TrG5h" value="PATH_MACRO_PREFIX" />
      <property role="3TUv4t" value="true" />
      <node concept="Xl_RD" id="2jln2Vr6Rle" role="33vP2m">
        <property role="Xl_RC" value="path.macro." />
      </node>
      <node concept="17QB3L" id="2jln2Vr6Rlf" role="1tU5fm" />
      <node concept="3Tm6S6" id="2jln2Vr6Wjt" role="1B3o_S" />
    </node>
    <node concept="Wx3nA" id="w2wbCIe_Lu" role="jymVt">
      <property role="TrG5h" value="EMPTY_CLIPBOARD_CONTENT" />
      <property role="3TUv4t" value="true" />
      <node concept="3Tm6S6" id="w2wbCIe_Lv" role="1B3o_S" />
      <node concept="2ShNRf" id="w2wbCIe_Lz" role="33vP2m">
        <node concept="1pGfFk" id="w2wbCIe_L_" role="2ShVmc">
          <ref role="37wK5l" to="kt01:~StringSelection.&lt;init&gt;(java.lang.String)" resolve="StringSelection" />
          <node concept="Xl_RD" id="w2wbCIe_LA" role="37wK5m">
            <property role="Xl_RC" value="" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="w2wbCIe_LL" role="1tU5fm">
        <ref role="3uigEE" to="kt01:~StringSelection" resolve="StringSelection" />
      </node>
    </node>
    <node concept="2tJIrI" id="5A5jZryZMKF" role="jymVt" />
    <node concept="312cEg" id="5A5jZryZNCC" role="jymVt">
      <property role="34CwA1" value="false" />
      <property role="eg7rD" value="false" />
      <property role="TrG5h" value="myEnvironment" />
      <property role="3TUv4t" value="true" />
      <node concept="3Tm6S6" id="5A5jZryZN7u" role="1B3o_S" />
      <node concept="3uibUv" id="1nB28salYN" role="1tU5fm">
        <ref role="3uigEE" to="79ha:HKKzfMjqRV" resolve="Environment" />
      </node>
    </node>
    <node concept="2tJIrI" id="2jln2Vr6WjM" role="jymVt" />
    <node concept="3clFbW" id="6azle7m2XHD" role="jymVt">
      <node concept="3clFbS" id="6azle7m2XHG" role="3clF47">
        <node concept="3clFbF" id="2ky3Rs1tLYE" role="3cqZAp">
          <node concept="37vLTI" id="2ky3Rs1tM5O" role="3clFbG">
            <node concept="37vLTw" id="2ky3Rs1tMgQ" role="37vLTx">
              <ref role="3cqZAo" node="2ky3Rs1tLu_" resolve="environment" />
            </node>
            <node concept="37vLTw" id="2ky3Rs1tLYD" role="37vLTJ">
              <ref role="3cqZAo" node="5A5jZryZNCC" resolve="myEnvironment" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3cqZAl" id="6azle7m2XHE" role="3clF45" />
      <node concept="3Tm1VV" id="6azle7m2XHF" role="1B3o_S" />
      <node concept="37vLTG" id="2ky3Rs1tLu_" role="3clF46">
        <property role="TrG5h" value="environment" />
        <node concept="3uibUv" id="2ky3Rs1tLu$" role="1tU5fm">
          <ref role="3uigEE" to="79ha:HKKzfMjqRV" resolve="Environment" />
        </node>
        <node concept="2AHcQZ" id="2ky3Rs1tL$H" role="2AJF6D">
          <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="5ICuv4IKXK$" role="jymVt" />
    <node concept="3clFb_" id="6azle7m2XHH" role="jymVt">
      <property role="TrG5h" value="initTest" />
      <node concept="3uibUv" id="6azle7m3uGn" role="Sfmx6">
        <ref role="3uigEE" to="wyt6:~Exception" resolve="Exception" />
      </node>
      <node concept="37vLTG" id="6azle7m3uGu" role="3clF46">
        <property role="TrG5h" value="test" />
        <property role="3TUv4t" value="true" />
        <node concept="2AHcQZ" id="4_ksyPqMYEB" role="2AJF6D">
          <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
        </node>
        <node concept="3uibUv" id="e$hNri9ccb" role="1tU5fm">
          <ref role="3uigEE" node="e$hNri9cbt" resolve="TransformationTest" />
        </node>
      </node>
      <node concept="3cqZAl" id="6azle7m2XHI" role="3clF45" />
      <node concept="3Tm1VV" id="6azle7m2XHJ" role="1B3o_S" />
      <node concept="3clFbS" id="6azle7m2XHK" role="3clF47">
        <node concept="3clFbF" id="6mrejAb9rv$" role="3cqZAp">
          <node concept="1rXfSq" id="4hiugqyzhxC" role="3clFbG">
            <ref role="37wK5l" node="1_xw4QB0oF$" resolve="initTest" />
            <node concept="37vLTw" id="2BHiRxglGVy" role="37wK5m">
              <ref role="3cqZAo" node="6azle7m3uGu" resolve="test" />
            </node>
            <node concept="37vLTw" id="2BHiRxghiQC" role="37wK5m">
              <ref role="3cqZAo" node="6azle7m3uGo" resolve="projectPath" />
            </node>
            <node concept="37vLTw" id="2BHiRxgm7ft" role="37wK5m">
              <ref role="3cqZAo" node="6azle7m3uGr" resolve="modelName" />
            </node>
            <node concept="3clFbT" id="ThWTaQhG8y" role="37wK5m">
              <property role="3clFbU" value="false" />
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="6azle7m3uGo" role="3clF46">
        <property role="TrG5h" value="projectPath" />
        <node concept="17QB3L" id="6azle7m3uGq" role="1tU5fm" />
        <node concept="2AHcQZ" id="6azle7m3uGp" role="2AJF6D">
          <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
        </node>
      </node>
      <node concept="37vLTG" id="6azle7m3uGr" role="3clF46">
        <property role="TrG5h" value="modelName" />
        <property role="3TUv4t" value="false" />
        <node concept="17QB3L" id="6azle7m3uGs" role="1tU5fm" />
      </node>
    </node>
    <node concept="2tJIrI" id="5ICuv4IKZeu" role="jymVt" />
    <node concept="3clFb_" id="1_xw4QB0oF$" role="jymVt">
      <property role="TrG5h" value="initTest" />
      <node concept="3uibUv" id="1_xw4QB0oHk" role="Sfmx6">
        <ref role="3uigEE" to="wyt6:~Exception" resolve="Exception" />
      </node>
      <node concept="3clFbS" id="1_xw4QB0oFI" role="3clF47">
        <node concept="3clFbF" id="2VDNdDcf3dH" role="3cqZAp">
          <node concept="1rXfSq" id="2VDNdDcf3dI" role="3clFbG">
            <ref role="37wK5l" node="2jln2Vr6ZdR" resolve="clearSystemClipboard" />
          </node>
        </node>
        <node concept="3clFbF" id="2VDNdDcf3dJ" role="3cqZAp">
          <node concept="1rXfSq" id="2VDNdDcf3dK" role="3clFbG">
            <ref role="37wK5l" node="2jln2Vr6Gb3" resolve="readSystemMacro" />
          </node>
        </node>
        <node concept="3cpWs8" id="5sV3JxOSlRp" role="3cqZAp">
          <node concept="3cpWsn" id="5sV3JxOSlRq" role="3cpWs9">
            <property role="TrG5h" value="testProject" />
            <property role="3TUv4t" value="true" />
            <node concept="3uibUv" id="5sV3JxOSlRl" role="1tU5fm">
              <ref role="3uigEE" to="z1c3:~Project" resolve="Project" />
            </node>
            <node concept="1rXfSq" id="5sV3JxOSlRr" role="33vP2m">
              <ref role="37wK5l" node="49Kr40zYRup" resolve="openTestProject" />
              <node concept="37vLTw" id="5sV3JxOSlRs" role="37wK5m">
                <ref role="3cqZAo" node="1_xw4QB0oFB" resolve="projectPath" />
              </node>
              <node concept="37vLTw" id="5sV3JxOSlRt" role="37wK5m">
                <ref role="3cqZAo" node="ThWTaQhG8u" resolve="reopenProject" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5sV3JxOSGjR" role="3cqZAp">
          <node concept="1rXfSq" id="5sV3JxOSGjQ" role="3clFbG">
            <ref role="37wK5l" node="5sV3JxOSGjI" resolve="doInitTest" />
            <node concept="37vLTw" id="5sV3JxOSGjN" role="37wK5m">
              <ref role="3cqZAo" node="1_xw4QB0oF_" resolve="test" />
            </node>
            <node concept="37vLTw" id="5sV3JxOSGjO" role="37wK5m">
              <ref role="3cqZAo" node="5sV3JxOSlRq" resolve="testProject" />
            </node>
            <node concept="37vLTw" id="5sV3JxOSGjP" role="37wK5m">
              <ref role="3cqZAo" node="1_xw4QB0oFE" resolve="modelName" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6azle7m3uI0" role="3cqZAp">
          <node concept="2OqwBi" id="5A5jZryZOWp" role="3clFbG">
            <node concept="37vLTw" id="5A5jZryZOS$" role="2Oq$k0">
              <ref role="3cqZAo" node="5A5jZryZNCC" resolve="myEnvironment" />
            </node>
            <node concept="liA8E" id="5A5jZryZP68" role="2OqNvi">
              <ref role="37wK5l" to="79ha:3eUNqOk4fPx" resolve="flushAllEvents" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3cqZAl" id="1_xw4QB0oFG" role="3clF45" />
      <node concept="3Tm1VV" id="1_xw4QB0oFH" role="1B3o_S" />
      <node concept="37vLTG" id="1_xw4QB0oF_" role="3clF46">
        <property role="TrG5h" value="test" />
        <property role="3TUv4t" value="true" />
        <node concept="2AHcQZ" id="4_ksyPqMYfi" role="2AJF6D">
          <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
        </node>
        <node concept="3uibUv" id="1_xw4QB0oFA" role="1tU5fm">
          <ref role="3uigEE" node="e$hNri9cbt" resolve="TransformationTest" />
        </node>
      </node>
      <node concept="37vLTG" id="1_xw4QB0oFB" role="3clF46">
        <property role="TrG5h" value="projectPath" />
        <node concept="2AHcQZ" id="1_xw4QB0oFC" role="2AJF6D">
          <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
        </node>
        <node concept="17QB3L" id="1_xw4QB0oFD" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="1_xw4QB0oFE" role="3clF46">
        <property role="TrG5h" value="modelName" />
        <property role="3TUv4t" value="false" />
        <node concept="17QB3L" id="1_xw4QB0oFF" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="ThWTaQhG8u" role="3clF46">
        <property role="TrG5h" value="reopenProject" />
        <node concept="10P_77" id="ThWTaQhG8w" role="1tU5fm" />
      </node>
    </node>
    <node concept="2tJIrI" id="5sV3JxOSIHr" role="jymVt" />
    <node concept="3clFb_" id="5sV3JxOSGjI" role="jymVt">
      <property role="TrG5h" value="doInitTest" />
      <node concept="3Tmbuc" id="4_ksyPqP1j8" role="1B3o_S" />
      <node concept="3cqZAl" id="5sV3JxOSGjK" role="3clF45" />
      <node concept="37vLTG" id="5sV3JxOSGjv" role="3clF46">
        <property role="TrG5h" value="test" />
        <property role="3TUv4t" value="true" />
        <node concept="2AHcQZ" id="4_ksyPqMXDn" role="2AJF6D">
          <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
        </node>
        <node concept="3uibUv" id="5sV3JxOSGjw" role="1tU5fm">
          <ref role="3uigEE" node="e$hNri9cbt" resolve="TransformationTest" />
        </node>
      </node>
      <node concept="37vLTG" id="5sV3JxOSGjx" role="3clF46">
        <property role="TrG5h" value="testProject" />
        <property role="3TUv4t" value="true" />
        <node concept="3uibUv" id="5sV3JxOSGjy" role="1tU5fm">
          <ref role="3uigEE" to="z1c3:~Project" resolve="Project" />
        </node>
        <node concept="2AHcQZ" id="5Jy6yRTNxhT" role="2AJF6D">
          <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
        </node>
      </node>
      <node concept="37vLTG" id="5sV3JxOSGjz" role="3clF46">
        <property role="TrG5h" value="modelName" />
        <property role="3TUv4t" value="true" />
        <node concept="17QB3L" id="5sV3JxOSGj$" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="5sV3JxOSGiv" role="3clF47">
        <node concept="34ab3g" id="wQDhRCnzKI" role="3cqZAp">
          <property role="35gtTG" value="info" />
          <node concept="Xl_RD" id="wQDhRCnzKJ" role="34bqiv">
            <property role="Xl_RC" value="Initializing test..." />
          </node>
        </node>
        <node concept="3clFbF" id="5sV3JxOSGiw" role="3cqZAp">
          <node concept="2OqwBi" id="5sV3JxOSGix" role="3clFbG">
            <node concept="37vLTw" id="5sV3JxOSGjF" role="2Oq$k0">
              <ref role="3cqZAo" node="5sV3JxOSGjv" resolve="test" />
            </node>
            <node concept="liA8E" id="5sV3JxOSGiz" role="2OqNvi">
              <ref role="37wK5l" node="e$hNri9cbv" resolve="setProject" />
              <node concept="37vLTw" id="5sV3JxOSGjE" role="37wK5m">
                <ref role="3cqZAo" node="5sV3JxOSGjx" resolve="testProject" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="wQDhRCFCDh" role="3cqZAp">
          <node concept="3cpWsn" id="wQDhRCFCDi" role="3cpWs9">
            <property role="TrG5h" value="cachedTest" />
            <node concept="3uibUv" id="wQDhRCFCDc" role="1tU5fm">
              <ref role="3uigEE" node="e$hNri9cbt" resolve="TransformationTest" />
            </node>
            <node concept="2OqwBi" id="17FLbikMaGY" role="33vP2m">
              <node concept="2YIFZM" id="21nkJZKqk3W" role="2Oq$k0">
                <ref role="37wK5l" node="4zIz0VbXUyu" resolve="getInstance" />
                <ref role="1Pybhc" node="wQDhRCClc9" resolve="TestModelSaver" />
              </node>
              <node concept="liA8E" id="17FLbikMb9j" role="2OqNvi">
                <ref role="37wK5l" node="wQDhRCEOn6" resolve="getTest" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbH" id="70xkT3P6rdQ" role="3cqZAp" />
        <node concept="3cpWs8" id="wQDhRCD$Nz" role="3cqZAp">
          <node concept="3cpWsn" id="wQDhRCD$N$" role="3cpWs9">
            <property role="TrG5h" value="cachedModel" />
            <node concept="3uibUv" id="wQDhRCD$N_" role="1tU5fm">
              <ref role="3uigEE" to="mhbf:~SModel" resolve="SModel" />
            </node>
            <node concept="2EnYce" id="70xkT3P6_5g" role="33vP2m">
              <node concept="37vLTw" id="wQDhRCFCDm" role="2Oq$k0">
                <ref role="3cqZAo" node="wQDhRCFCDi" resolve="cachedTest" />
              </node>
              <node concept="liA8E" id="70xkT3P6r9L" role="2OqNvi">
                <ref role="37wK5l" node="e$hNri9ceN" resolve="getModelDescriptor" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="wQDhRCDJNw" role="3cqZAp">
          <node concept="3cpWsn" id="wQDhRCDJNx" role="3cpWs9">
            <property role="TrG5h" value="cachedTransientModel" />
            <node concept="3uibUv" id="wQDhRCDJNy" role="1tU5fm">
              <ref role="3uigEE" to="mhbf:~SModel" resolve="SModel" />
            </node>
            <node concept="2EnYce" id="wQDhRCG5R6" role="33vP2m">
              <node concept="37vLTw" id="wQDhRCFCDn" role="2Oq$k0">
                <ref role="3cqZAo" node="wQDhRCFCDi" resolve="cachedTest" />
              </node>
              <node concept="liA8E" id="wQDhRCEXBt" role="2OqNvi">
                <ref role="37wK5l" node="e$hNri9cfd" resolve="getTransientModelDescriptor" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="70xkT3P6HMW" role="3cqZAp">
          <node concept="3cpWsn" id="70xkT3P6HMZ" role="3cpWs9">
            <property role="TrG5h" value="cachedModelName" />
            <node concept="17QB3L" id="70xkT3P6HMU" role="1tU5fm" />
            <node concept="2EnYce" id="5nN0_w1eity" role="33vP2m">
              <node concept="2EnYce" id="70xkT3P6Ivk" role="2Oq$k0">
                <node concept="37vLTw" id="70xkT3P6In6" role="2Oq$k0">
                  <ref role="3cqZAo" node="wQDhRCD$N$" resolve="cachedModel" />
                </node>
                <node concept="liA8E" id="70xkT3P6IQ0" role="2OqNvi">
                  <ref role="37wK5l" to="mhbf:~SModel.getReference():org.jetbrains.mps.openapi.model.SModelReference" resolve="getReference" />
                </node>
              </node>
              <node concept="liA8E" id="5nN0_w1eiMj" role="2OqNvi">
                <ref role="37wK5l" to="wyt6:~Object.toString():java.lang.String" resolve="toString" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="wQDhRCDz1V" role="3cqZAp">
          <node concept="3clFbS" id="wQDhRCDz1Y" role="3clFbx">
            <node concept="34ab3g" id="6jF$UvCGdPd" role="3cqZAp">
              <property role="35gtTG" value="debug" />
              <node concept="Xl_RD" id="6jF$UvCGdPf" role="34bqiv">
                <property role="Xl_RC" value="Using cached model" />
              </node>
            </node>
            <node concept="3clFbF" id="wQDhRCDDch" role="3cqZAp">
              <node concept="2OqwBi" id="wQDhRCDDfr" role="3clFbG">
                <node concept="37vLTw" id="wQDhRCDDcg" role="2Oq$k0">
                  <ref role="3cqZAo" node="5sV3JxOSGjv" resolve="test" />
                </node>
                <node concept="liA8E" id="wQDhRCDDm3" role="2OqNvi">
                  <ref role="37wK5l" node="7P8zeXPHTzc" resolve="setModelDescriptor" />
                  <node concept="37vLTw" id="wQDhRCDDoP" role="37wK5m">
                    <ref role="3cqZAo" node="wQDhRCD$N$" resolve="cachedModel" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbF" id="wQDhRCDMYE" role="3cqZAp">
              <node concept="2OqwBi" id="wQDhRCDN03" role="3clFbG">
                <node concept="37vLTw" id="wQDhRCDMYC" role="2Oq$k0">
                  <ref role="3cqZAo" node="5sV3JxOSGjv" resolve="test" />
                </node>
                <node concept="liA8E" id="wQDhRCED6r" role="2OqNvi">
                  <ref role="37wK5l" node="wQDhRCDNC8" resolve="setTransientModelDescriptor" />
                  <node concept="37vLTw" id="wQDhRCED92" role="37wK5m">
                    <ref role="3cqZAo" node="wQDhRCDJNx" resolve="cachedTransientModel" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="1Wc70l" id="70xkT3P6Miw" role="3clFbw">
            <node concept="3y3z36" id="70xkT3P6MQV" role="3uHU7B">
              <node concept="10Nm6u" id="70xkT3P6MVd" role="3uHU7w" />
              <node concept="37vLTw" id="70xkT3P6MZR" role="3uHU7B">
                <ref role="3cqZAo" node="70xkT3P6HMZ" resolve="cachedModelName" />
              </node>
            </node>
            <node concept="2OqwBi" id="70xkT3P6Lba" role="3uHU7w">
              <node concept="37vLTw" id="70xkT3P6IVz" role="2Oq$k0">
                <ref role="3cqZAo" node="70xkT3P6HMZ" resolve="cachedModelName" />
              </node>
              <node concept="liA8E" id="70xkT3P6M8w" role="2OqNvi">
                <ref role="37wK5l" to="wyt6:~String.equals(java.lang.Object):boolean" resolve="equals" />
                <node concept="37vLTw" id="70xkT3P6Mb6" role="37wK5m">
                  <ref role="3cqZAo" node="5sV3JxOSGjz" resolve="modelName" />
                </node>
              </node>
            </node>
          </node>
          <node concept="9aQIb" id="wQDhRCEEgC" role="9aQIa">
            <node concept="3clFbS" id="wQDhRCEEgD" role="9aQI4">
              <node concept="34ab3g" id="6jF$UvCGe4h" role="3cqZAp">
                <property role="35gtTG" value="debug" />
                <node concept="Xl_RD" id="6jF$UvCGe4j" role="34bqiv">
                  <property role="Xl_RC" value="Recaching the model again" />
                </node>
              </node>
              <node concept="3cpWs8" id="4EK9dPqQlzN" role="3cqZAp">
                <node concept="3cpWsn" id="4EK9dPqQlzO" role="3cpWs9">
                  <property role="TrG5h" value="exception" />
                  <node concept="3uibUv" id="4EK9dPqQlzx" role="1tU5fm">
                    <ref role="3uigEE" to="wyt6:~Exception" resolve="Exception" />
                  </node>
                  <node concept="2YIFZM" id="4EK9dPqQlzP" role="33vP2m">
                    <ref role="37wK5l" to="3a50:~ThreadUtils.runInUIThreadAndWait(java.lang.Runnable):java.lang.Exception" resolve="runInUIThreadAndWait" />
                    <ref role="1Pybhc" to="3a50:~ThreadUtils" resolve="ThreadUtils" />
                    <node concept="1bVj0M" id="4EK9dPqQlzQ" role="37wK5m">
                      <node concept="3clFbS" id="4EK9dPqQlzR" role="1bW5cS">
                        <node concept="3clFbF" id="4EK9dPqQlzS" role="3cqZAp">
                          <node concept="2OqwBi" id="4EK9dPqQlzT" role="3clFbG">
                            <node concept="2OqwBi" id="4EK9dPqQlzU" role="2Oq$k0">
                              <node concept="37vLTw" id="4EK9dPqQlzV" role="2Oq$k0">
                                <ref role="3cqZAo" node="5sV3JxOSGjx" resolve="testProject" />
                              </node>
                              <node concept="liA8E" id="4EK9dPqQlzW" role="2OqNvi">
                                <ref role="37wK5l" to="z1c3:~Project.getModelAccess():org.jetbrains.mps.openapi.module.ModelAccess" resolve="getModelAccess" />
                              </node>
                            </node>
                            <node concept="liA8E" id="4EK9dPqQlzX" role="2OqNvi">
                              <ref role="37wK5l" to="lui2:~ModelAccess.executeCommand(java.lang.Runnable):void" resolve="executeCommand" />
                              <node concept="2ShNRf" id="4EK9dPqQlzY" role="37wK5m">
                                <node concept="YeOm9" id="4EK9dPqQlzZ" role="2ShVmc">
                                  <node concept="1Y3b0j" id="4EK9dPqQl$0" role="YeSDq">
                                    <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
                                    <ref role="1Y3XeK" to="wyt6:~Runnable" resolve="Runnable" />
                                    <node concept="3Tm1VV" id="4EK9dPqQl$1" role="1B3o_S" />
                                    <node concept="3clFb_" id="4EK9dPqQl$2" role="jymVt">
                                      <property role="1EzhhJ" value="false" />
                                      <property role="TrG5h" value="run" />
                                      <node concept="3Tm1VV" id="4EK9dPqQl$3" role="1B3o_S" />
                                      <node concept="3clFbS" id="4EK9dPqQl$4" role="3clF47">
                                        <node concept="3clFbF" id="4EK9dPqQl$5" role="3cqZAp">
                                          <node concept="1rXfSq" id="4EK9dPqQl$6" role="3clFbG">
                                            <ref role="37wK5l" node="4EK9dPqQl$c" resolve="initialize" />
                                            <node concept="37vLTw" id="4EK9dPqQl$7" role="37wK5m">
                                              <ref role="3cqZAo" node="5sV3JxOSGjv" resolve="test" />
                                            </node>
                                            <node concept="37vLTw" id="4EK9dPqQl$8" role="37wK5m">
                                              <ref role="3cqZAo" node="5sV3JxOSGjz" resolve="modelName" />
                                            </node>
                                          </node>
                                        </node>
                                      </node>
                                      <node concept="3cqZAl" id="4EK9dPqQl$9" role="3clF45" />
                                      <node concept="2AHcQZ" id="4EK9dPqQl$a" role="2AJF6D">
                                        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                                      </node>
                                    </node>
                                    <node concept="2tJIrI" id="4EK9dPqQl$b" role="jymVt" />
                                    <node concept="3clFb_" id="4EK9dPqQl$c" role="jymVt">
                                      <property role="TrG5h" value="initialize" />
                                      <node concept="3Tm6S6" id="4EK9dPqQl$d" role="1B3o_S" />
                                      <node concept="3cqZAl" id="4EK9dPqQl$e" role="3clF45" />
                                      <node concept="37vLTG" id="4EK9dPqQl$f" role="3clF46">
                                        <property role="TrG5h" value="test" />
                                        <property role="3TUv4t" value="true" />
                                        <node concept="3uibUv" id="4EK9dPqQl$g" role="1tU5fm">
                                          <ref role="3uigEE" node="e$hNri9cbt" resolve="TransformationTest" />
                                        </node>
                                      </node>
                                      <node concept="37vLTG" id="4EK9dPqQl$h" role="3clF46">
                                        <property role="TrG5h" value="modelName" />
                                        <property role="3TUv4t" value="true" />
                                        <node concept="17QB3L" id="4EK9dPqQl$i" role="1tU5fm" />
                                      </node>
                                      <node concept="3clFbS" id="4EK9dPqQl$j" role="3clF47">
                                        <node concept="3cpWs8" id="4EK9dPqQl$k" role="3cqZAp">
                                          <node concept="3cpWsn" id="4EK9dPqQl$l" role="3cpWs9">
                                            <property role="TrG5h" value="modelDescriptor" />
                                            <node concept="3uibUv" id="4EK9dPqQl$m" role="1tU5fm">
                                              <ref role="3uigEE" to="mhbf:~SModel" resolve="SModel" />
                                            </node>
                                            <node concept="1rXfSq" id="4EK9dPqQl$n" role="33vP2m">
                                              <ref role="37wK5l" node="4zIz0VbYUHq" resolve="findModel" />
                                              <node concept="37vLTw" id="4EK9dPqQl$o" role="37wK5m">
                                                <ref role="3cqZAo" node="4EK9dPqQl$h" resolve="modelName" />
                                              </node>
                                            </node>
                                          </node>
                                        </node>
                                        <node concept="3clFbF" id="4EK9dPqQl$p" role="3cqZAp">
                                          <node concept="2OqwBi" id="4EK9dPqQl$q" role="3clFbG">
                                            <node concept="37vLTw" id="4EK9dPqQl$r" role="2Oq$k0">
                                              <ref role="3cqZAo" node="4EK9dPqQl$f" resolve="test" />
                                            </node>
                                            <node concept="liA8E" id="4EK9dPqQl$s" role="2OqNvi">
                                              <ref role="37wK5l" node="7P8zeXPHTzc" resolve="setModelDescriptor" />
                                              <node concept="37vLTw" id="4EK9dPqQl$t" role="37wK5m">
                                                <ref role="3cqZAo" node="4EK9dPqQl$l" resolve="modelDescriptor" />
                                              </node>
                                            </node>
                                          </node>
                                        </node>
                                        <node concept="3clFbF" id="4EK9dPqQl$u" role="3cqZAp">
                                          <node concept="2OqwBi" id="4EK9dPqQl$v" role="3clFbG">
                                            <node concept="liA8E" id="4EK9dPqQl$w" role="2OqNvi">
                                              <ref role="37wK5l" node="7P8zeXPIrdY" resolve="init" />
                                            </node>
                                            <node concept="37vLTw" id="4EK9dPqQl$x" role="2Oq$k0">
                                              <ref role="3cqZAo" node="4EK9dPqQl$f" resolve="test" />
                                            </node>
                                          </node>
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3clFbJ" id="4EK9dPqQy6O" role="3cqZAp">
                <node concept="3clFbS" id="4EK9dPqQy6Q" role="3clFbx">
                  <node concept="YS8fn" id="4EK9dPqQy$O" role="3cqZAp">
                    <node concept="2ShNRf" id="4EK9dPqQyDv" role="YScLw">
                      <node concept="1pGfFk" id="4EK9dPqR78K" role="2ShVmc">
                        <ref role="37wK5l" to="wyt6:~RuntimeException.&lt;init&gt;(java.lang.Throwable)" resolve="RuntimeException" />
                        <node concept="37vLTw" id="4EK9dPqR7hM" role="37wK5m">
                          <ref role="3cqZAo" node="4EK9dPqQlzO" resolve="exception" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3y3z36" id="4EK9dPqQykT" role="3clFbw">
                  <node concept="10Nm6u" id="4EK9dPqQyph" role="3uHU7w" />
                  <node concept="37vLTw" id="4EK9dPqQyf_" role="3uHU7B">
                    <ref role="3cqZAo" node="4EK9dPqQlzO" resolve="exception" />
                  </node>
                </node>
              </node>
              <node concept="3clFbF" id="4zIz0VbYWdS" role="3cqZAp">
                <node concept="2OqwBi" id="4zIz0VbYWvO" role="3clFbG">
                  <node concept="2YIFZM" id="21nkJZKqkc_" role="2Oq$k0">
                    <ref role="37wK5l" node="4zIz0VbXUyu" resolve="getInstance" />
                    <ref role="1Pybhc" node="wQDhRCClc9" resolve="TestModelSaver" />
                  </node>
                  <node concept="liA8E" id="4zIz0VbYWAS" role="2OqNvi">
                    <ref role="37wK5l" node="4zIz0VbYSyo" resolve="clean" />
                  </node>
                </node>
              </node>
              <node concept="3clFbF" id="wQDhRCEG0K" role="3cqZAp">
                <node concept="2OqwBi" id="wQDhRCEGkw" role="3clFbG">
                  <node concept="2YIFZM" id="21nkJZKqkjt" role="2Oq$k0">
                    <ref role="37wK5l" node="4zIz0VbXUyu" resolve="getInstance" />
                    <ref role="1Pybhc" node="wQDhRCClc9" resolve="TestModelSaver" />
                  </node>
                  <node concept="liA8E" id="wQDhRCEGr9" role="2OqNvi">
                    <ref role="37wK5l" node="wQDhRCEOxC" resolve="setTest" />
                    <node concept="37vLTw" id="wQDhRCEGx$" role="37wK5m">
                      <ref role="3cqZAo" node="5sV3JxOSGjv" resolve="test" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5sV3JxOSGjL" role="Sfmx6">
        <ref role="3uigEE" to="wyt6:~InterruptedException" resolve="InterruptedException" />
      </node>
      <node concept="3uibUv" id="5sV3JxOSGjM" role="Sfmx6">
        <ref role="3uigEE" to="t6h5:~InvocationTargetException" resolve="InvocationTargetException" />
      </node>
    </node>
    <node concept="2tJIrI" id="5Jy6yRTOa8B" role="jymVt" />
    <node concept="3clFb_" id="4zIz0VbYUHq" role="jymVt">
      <property role="TrG5h" value="findModel" />
      <node concept="3Tmbuc" id="5Jy6yRTObqM" role="1B3o_S" />
      <node concept="3uibUv" id="4zIz0VbYUHs" role="3clF45">
        <ref role="3uigEE" to="mhbf:~SModel" resolve="SModel" />
      </node>
      <node concept="37vLTG" id="4zIz0VbYUHt" role="3clF46">
        <property role="TrG5h" value="modelName" />
        <property role="3TUv4t" value="true" />
        <node concept="17QB3L" id="4zIz0VbYUHu" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="4zIz0VbYUHv" role="3clF47">
        <node concept="3cpWs8" id="4zIz0VbYUHw" role="3cqZAp">
          <node concept="3cpWsn" id="4zIz0VbYUHx" role="3cpWs9">
            <property role="TrG5h" value="modelDescriptor" />
            <node concept="3uibUv" id="4zIz0VbYUHy" role="1tU5fm">
              <ref role="3uigEE" to="mhbf:~SModel" resolve="SModel" />
            </node>
            <node concept="2OqwBi" id="4zIz0VbYUHz" role="33vP2m">
              <node concept="2YIFZM" id="4zIz0VbYUH$" role="2Oq$k0">
                <ref role="1Pybhc" to="w1kc:~SModelRepository" resolve="SModelRepository" />
                <ref role="37wK5l" to="w1kc:~SModelRepository.getInstance():jetbrains.mps.smodel.SModelRepository" resolve="getInstance" />
              </node>
              <node concept="liA8E" id="4zIz0VbYUH_" role="2OqNvi">
                <ref role="37wK5l" to="w1kc:~SModelRepository.getModelDescriptor(org.jetbrains.mps.openapi.model.SModelReference):org.jetbrains.mps.openapi.model.SModel" resolve="getModelDescriptor" />
                <node concept="2OqwBi" id="4zIz0VbYUHA" role="37wK5m">
                  <node concept="liA8E" id="4zIz0VbYUHB" role="2OqNvi">
                    <ref role="37wK5l" to="dush:~PersistenceFacade.createModelReference(java.lang.String):org.jetbrains.mps.openapi.model.SModelReference" resolve="createModelReference" />
                    <node concept="37vLTw" id="4zIz0VbYUHC" role="37wK5m">
                      <ref role="3cqZAo" node="4zIz0VbYUHt" resolve="modelName" />
                    </node>
                  </node>
                  <node concept="2YIFZM" id="4zIz0VbYUHD" role="2Oq$k0">
                    <ref role="37wK5l" to="dush:~PersistenceFacade.getInstance():org.jetbrains.mps.openapi.persistence.PersistenceFacade" resolve="getInstance" />
                    <ref role="1Pybhc" to="dush:~PersistenceFacade" resolve="PersistenceFacade" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbH" id="4zIz0VbYUHE" role="3cqZAp" />
        <node concept="3clFbJ" id="4zIz0VbYUHF" role="3cqZAp">
          <node concept="3clFbC" id="4zIz0VbYUHG" role="3clFbw">
            <node concept="10Nm6u" id="4zIz0VbYUHH" role="3uHU7w" />
            <node concept="37vLTw" id="4zIz0VbYUHI" role="3uHU7B">
              <ref role="3cqZAo" node="4zIz0VbYUHx" resolve="modelDescriptor" />
            </node>
          </node>
          <node concept="3clFbS" id="4zIz0VbYUHJ" role="3clFbx">
            <node concept="3xETmq" id="4zIz0VbYUHK" role="3cqZAp">
              <node concept="3_1$Yv" id="4zIz0VbYUHL" role="3_9lra">
                <node concept="3cpWs3" id="4zIz0VbYUHM" role="3_1BAH">
                  <node concept="Xl_RD" id="4zIz0VbYUHN" role="3uHU7w">
                    <property role="Xl_RC" value="." />
                  </node>
                  <node concept="3cpWs3" id="4zIz0VbYUHO" role="3uHU7B">
                    <node concept="3cpWs3" id="4zIz0VbYUHT" role="3uHU7B">
                      <node concept="3cpWs3" id="4zIz0VbYUHU" role="3uHU7B">
                        <node concept="37vLTw" id="4zIz0VbYUHV" role="3uHU7w">
                          <ref role="3cqZAo" node="4zIz0VbYUHt" resolve="modelName" />
                        </node>
                        <node concept="Xl_RD" id="4zIz0VbYUHW" role="3uHU7B">
                          <property role="Xl_RC" value="Can't find model " />
                        </node>
                      </node>
                      <node concept="Xl_RD" id="4zIz0VbYUHX" role="3uHU7w">
                        <property role="Xl_RC" value=" in projects " />
                      </node>
                    </node>
                    <node concept="2OqwBi" id="4zIz0VbYUHQ" role="3uHU7w">
                      <node concept="liA8E" id="4zIz0VbYUHR" role="2OqNvi">
                        <ref role="37wK5l" to="z1c3:~ProjectManager.getOpenedProjects():java.util.List" resolve="getOpenedProjects" />
                      </node>
                      <node concept="2YIFZM" id="4zIz0VbYUHS" role="2Oq$k0">
                        <ref role="1Pybhc" to="z1c3:~ProjectManager" resolve="ProjectManager" />
                        <ref role="37wK5l" to="z1c3:~ProjectManager.getInstance():jetbrains.mps.project.ProjectManager" resolve="getInstance" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="4zIz0VbYUHY" role="3cqZAp">
          <node concept="37vLTw" id="4zIz0VbYUHZ" role="3cqZAk">
            <ref role="3cqZAo" node="4zIz0VbYUHx" resolve="modelDescriptor" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="5Jy6yRTO7$N" role="jymVt" />
    <node concept="2tJIrI" id="7VpmPDosfbA" role="jymVt" />
    <node concept="3clFb_" id="49Kr40zYRup" role="jymVt">
      <property role="TrG5h" value="openTestProject" />
      <node concept="3Tmbuc" id="4_ksyPqOZTN" role="1B3o_S" />
      <node concept="3uibUv" id="5sV3JxORIMa" role="3clF45">
        <ref role="3uigEE" to="z1c3:~Project" resolve="Project" />
      </node>
      <node concept="37vLTG" id="1w0tHxVcGRp" role="3clF46">
        <property role="TrG5h" value="projectPathName" />
        <node concept="17QB3L" id="1w0tHxVcHC_" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="1w0tHxVcJx3" role="3clF46">
        <property role="TrG5h" value="reopenProject" />
        <node concept="10P_77" id="1w0tHxVcKWl" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="49Kr40zYRts" role="3clF47">
        <node concept="3cpWs8" id="49Kr40zYRtZ" role="3cqZAp">
          <node concept="3cpWsn" id="49Kr40zYRu0" role="3cpWs9">
            <property role="TrG5h" value="expandedProjectPath" />
            <node concept="17QB3L" id="49Kr40zYRu1" role="1tU5fm" />
            <node concept="2OqwBi" id="49Kr40zYRu2" role="33vP2m">
              <node concept="2YIFZM" id="49Kr40zYRu3" role="2Oq$k0">
                <ref role="1Pybhc" to="18ew:~MacrosFactory" resolve="MacrosFactory" />
                <ref role="37wK5l" to="18ew:~MacrosFactory.getGlobal():jetbrains.mps.util.MacroHelper" resolve="getGlobal" />
              </node>
              <node concept="liA8E" id="49Kr40zYRu4" role="2OqNvi">
                <ref role="37wK5l" to="18ew:~MacroHelper.expandPath(java.lang.String):java.lang.String" resolve="expandPath" />
                <node concept="37vLTw" id="49Kr40zYRui" role="37wK5m">
                  <ref role="3cqZAo" node="1w0tHxVcGRp" resolve="projectPathName" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="tzaT8sTmL8" role="3cqZAp">
          <node concept="3cpWsn" id="tzaT8sTmL9" role="3cpWs9">
            <property role="TrG5h" value="projectToOpen" />
            <node concept="3uibUv" id="tzaT8sTmLa" role="1tU5fm">
              <ref role="3uigEE" to="guwi:~File" resolve="File" />
            </node>
            <node concept="2ShNRf" id="tzaT8sTmLb" role="33vP2m">
              <node concept="1pGfFk" id="tzaT8sTmLc" role="2ShVmc">
                <ref role="37wK5l" to="guwi:~File.&lt;init&gt;(java.lang.String)" resolve="File" />
                <node concept="37vLTw" id="tzaT8sTw7u" role="37wK5m">
                  <ref role="3cqZAo" node="49Kr40zYRu0" resolve="expandedProjectPath" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="49Kr40zYRtt" role="3cqZAp">
          <node concept="3clFbS" id="49Kr40zYRtu" role="3clFbx">
            <node concept="34ab3g" id="5sV3JxORHiX" role="3cqZAp">
              <property role="35gtTG" value="warn" />
              <node concept="Xl_RD" id="5sV3JxORHiZ" role="34bqiv">
                <property role="Xl_RC" value="Project path is empty" />
              </node>
            </node>
            <node concept="3cpWs8" id="tzaT8sS4w1" role="3cqZAp">
              <node concept="3cpWsn" id="tzaT8sS4w2" role="3cpWs9">
                <property role="TrG5h" value="openedProject" />
                <node concept="3uibUv" id="tzaT8sS4w0" role="1tU5fm">
                  <ref role="3uigEE" to="z1c3:~Project" resolve="Project" />
                </node>
                <node concept="1rXfSq" id="tzaT8sS4w3" role="33vP2m">
                  <ref role="37wK5l" node="51zp1jJr3W0" resolve="anyOpenedProject" />
                </node>
              </node>
            </node>
            <node concept="3clFbJ" id="tzaT8sSbp2" role="3cqZAp">
              <node concept="3clFbS" id="tzaT8sSbp5" role="3clFbx">
                <node concept="3clFbF" id="3pEStHM5S4w" role="3cqZAp">
                  <node concept="2OqwBi" id="3pEStHM5S9q" role="3clFbG">
                    <node concept="37vLTw" id="3pEStHM5S4v" role="2Oq$k0">
                      <ref role="3cqZAo" node="tzaT8sS4w2" resolve="openedProject" />
                    </node>
                    <node concept="liA8E" id="3pEStHM5Sec" role="2OqNvi">
                      <ref role="37wK5l" to="z1c3:~Project.dispose():void" resolve="dispose" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="37vLTw" id="tzaT8sSca5" role="3clFbw">
                <ref role="3cqZAo" node="1w0tHxVcJx3" resolve="reopenProject" />
              </node>
            </node>
          </node>
          <node concept="2OqwBi" id="49Kr40zYRtU" role="3clFbw">
            <node concept="17RlXB" id="49Kr40zYRtW" role="2OqNvi" />
            <node concept="37vLTw" id="2BGPXkEuX5q" role="2Oq$k0">
              <ref role="3cqZAo" node="49Kr40zYRu0" resolve="expandedProjectPath" />
            </node>
          </node>
          <node concept="9aQIb" id="49Kr40zYRtX" role="9aQIa">
            <node concept="3clFbS" id="49Kr40zYRtY" role="9aQI4">
              <node concept="3clFbJ" id="75ChKjLK70k" role="3cqZAp">
                <node concept="3clFbS" id="75ChKjLK70n" role="3clFbx">
                  <node concept="3cpWs8" id="2BGPXkEuL$4" role="3cqZAp">
                    <node concept="3cpWsn" id="2BGPXkEuL$5" role="3cpWs9">
                      <property role="TrG5h" value="openedProject" />
                      <node concept="3uibUv" id="2BGPXkEuLzT" role="1tU5fm">
                        <ref role="3uigEE" to="z1c3:~Project" resolve="Project" />
                      </node>
                      <node concept="2OqwBi" id="2BGPXkEuL$6" role="33vP2m">
                        <node concept="37vLTw" id="2BGPXkEuL$7" role="2Oq$k0">
                          <ref role="3cqZAo" node="5A5jZryZNCC" resolve="myEnvironment" />
                        </node>
                        <node concept="liA8E" id="2BGPXkEuL$8" role="2OqNvi">
                          <ref role="37wK5l" to="79ha:6rx4kZDjWg4" resolve="openProject" />
                          <node concept="37vLTw" id="2BGPXkEuL$9" role="37wK5m">
                            <ref role="3cqZAo" node="tzaT8sTmL9" resolve="projectToOpen" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="3pEStHM5QQY" role="3cqZAp">
                    <node concept="2OqwBi" id="3pEStHM5QWM" role="3clFbG">
                      <node concept="37vLTw" id="3pEStHM5QQW" role="2Oq$k0">
                        <ref role="3cqZAo" node="2BGPXkEuL$5" resolve="openedProject" />
                      </node>
                      <node concept="liA8E" id="3pEStHM5R1O" role="2OqNvi">
                        <ref role="37wK5l" to="z1c3:~Project.dispose():void" resolve="dispose" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="37vLTw" id="75ChKjLK8lY" role="3clFbw">
                  <ref role="3cqZAo" node="1w0tHxVcJx3" resolve="reopenProject" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="tzaT8sTHir" role="3cqZAp">
          <node concept="2OqwBi" id="1w0tHxVb7mc" role="3cqZAk">
            <node concept="37vLTw" id="5A5jZryZQ8X" role="2Oq$k0">
              <ref role="3cqZAo" node="5A5jZryZNCC" resolve="myEnvironment" />
            </node>
            <node concept="liA8E" id="1w0tHxVb7xx" role="2OqNvi">
              <ref role="37wK5l" to="79ha:6rx4kZDjWg4" resolve="openProject" />
              <node concept="37vLTw" id="1w0tHxVbsXO" role="37wK5m">
                <ref role="3cqZAo" node="tzaT8sTmL9" resolve="projectToOpen" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="51zp1jJr8_3" role="jymVt" />
    <node concept="3clFb_" id="51zp1jJr3W0" role="jymVt">
      <property role="TrG5h" value="anyOpenedProject" />
      <node concept="3Tm6S6" id="51zp1jJr3W1" role="1B3o_S" />
      <node concept="3uibUv" id="5sV3JxORYzx" role="3clF45">
        <ref role="3uigEE" to="z1c3:~Project" resolve="Project" />
      </node>
      <node concept="3clFbS" id="51zp1jJr3VD" role="3clF47">
        <node concept="2Gpval" id="51zp1jJr3VE" role="3cqZAp">
          <node concept="2GrKxI" id="51zp1jJr3VF" role="2Gsz3X">
            <property role="TrG5h" value="project" />
          </node>
          <node concept="3clFbS" id="51zp1jJr3VG" role="2LFqv$">
            <node concept="3clFbJ" id="51zp1jJr3VH" role="3cqZAp">
              <node concept="1Wc70l" id="6eoPAc_WIKJ" role="3clFbw">
                <node concept="3y3z36" id="51zp1jJr3VI" role="3uHU7B">
                  <node concept="2GrUjf" id="51zp1jJr3VJ" role="3uHU7B">
                    <ref role="2Gs0qQ" node="51zp1jJr3VF" resolve="project" />
                  </node>
                  <node concept="10Nm6u" id="51zp1jJr3VK" role="3uHU7w" />
                </node>
                <node concept="3fqX7Q" id="6eoPAc_WPbe" role="3uHU7w">
                  <node concept="2OqwBi" id="6eoPAc_WPbg" role="3fr31v">
                    <node concept="2GrUjf" id="6eoPAc_WPbh" role="2Oq$k0">
                      <ref role="2Gs0qQ" node="51zp1jJr3VF" resolve="project" />
                    </node>
                    <node concept="liA8E" id="6eoPAc_WPbi" role="2OqNvi">
                      <ref role="37wK5l" to="z1c3:~Project.isDisposed():boolean" resolve="isDisposed" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3clFbS" id="5sV3JxORThz" role="3clFbx">
                <node concept="3cpWs6" id="5sV3JxORThy" role="3cqZAp">
                  <node concept="2GrUjf" id="5sV3JxORTOA" role="3cqZAk">
                    <ref role="2Gs0qQ" node="51zp1jJr3VF" resolve="project" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="2OqwBi" id="51zp1jJr3VS" role="2GsD0m">
            <node concept="2YIFZM" id="51zp1jJr3VT" role="2Oq$k0">
              <ref role="37wK5l" to="z1c3:~ProjectManager.getInstance():jetbrains.mps.project.ProjectManager" resolve="getInstance" />
              <ref role="1Pybhc" to="z1c3:~ProjectManager" resolve="ProjectManager" />
            </node>
            <node concept="liA8E" id="51zp1jJr3VU" role="2OqNvi">
              <ref role="37wK5l" to="z1c3:~ProjectManager.getOpenedProjects():java.util.List" resolve="getOpenedProjects" />
            </node>
          </node>
        </node>
        <node concept="3xETmq" id="51zp1jJr5F6" role="3cqZAp">
          <node concept="3_1$Yv" id="51zp1jJr5F7" role="3_9lra">
            <node concept="Xl_RD" id="51zp1jJr5F8" role="3_1BAH">
              <property role="Xl_RC" value="MPS Project was not specified in the test class, no opened project was found." />
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="5sV3JxOS97e" role="3cqZAp">
          <node concept="10Nm6u" id="5sV3JxOSbvo" role="3cqZAk" />
        </node>
      </node>
      <node concept="P$JXv" id="2BGPXkEuOGd" role="lGtFl">
        <node concept="TZ5HA" id="2BGPXkEuOGe" role="TZ5H$">
          <node concept="1dT_AC" id="2BGPXkEuOGf" role="1dT_Ay">
            <property role="1dT_AB" value="hacky place to run transformation tests with cached project" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="5sV3JxORK0o" role="jymVt" />
    <node concept="3clFb_" id="6azle7m3uJU" role="jymVt">
      <property role="TrG5h" value="runTest" />
      <node concept="37vLTG" id="6azle7m3uK2" role="3clF46">
        <property role="TrG5h" value="projectTest" />
        <property role="3TUv4t" value="true" />
        <node concept="2AHcQZ" id="4_ksyPqN8q2" role="2AJF6D">
          <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
        </node>
        <node concept="3uibUv" id="e$hNri9ceK" role="1tU5fm">
          <ref role="3uigEE" node="e$hNri9cbt" resolve="TransformationTest" />
        </node>
      </node>
      <node concept="3uibUv" id="6azle7m3uOh" role="Sfmx6">
        <ref role="3uigEE" to="wyt6:~Throwable" resolve="Throwable" />
      </node>
      <node concept="3cqZAl" id="6azle7m3uJV" role="3clF45" />
      <node concept="3clFbS" id="6azle7m3uJX" role="3clF47">
        <node concept="34ab3g" id="1K136DJAmRT" role="3cqZAp">
          <property role="35gtTG" value="info" />
          <node concept="3cpWs3" id="5sV3JxOSwKS" role="34bqiv">
            <node concept="Xl_RD" id="1K136DJAmRV" role="3uHU7B">
              <property role="Xl_RC" value="Running test " />
            </node>
            <node concept="37vLTw" id="2iEdVVe8YFW" role="3uHU7w">
              <ref role="3cqZAo" node="6azle7m3uK9" resolve="methodName" />
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="6azle7m3uKd" role="3cqZAp">
          <node concept="3cpWsn" id="6azle7m3uKe" role="3cpWs9">
            <property role="TrG5h" value="clazz" />
            <property role="3TUv4t" value="false" />
            <node concept="3uibUv" id="6azle7m3uKf" role="1tU5fm">
              <ref role="3uigEE" to="wyt6:~Class" resolve="Class" />
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="6azle7m3uLs" role="3cqZAp">
          <node concept="3cpWsn" id="6azle7m3uLt" role="3cpWs9">
            <property role="TrG5h" value="error" />
            <property role="3TUv4t" value="true" />
            <node concept="10Q1$e" id="6azle7m3uLu" role="1tU5fm">
              <node concept="3uibUv" id="6azle7m3uLv" role="10Q1$1">
                <ref role="3uigEE" to="wyt6:~Throwable" resolve="Throwable" />
              </node>
            </node>
            <node concept="2ShNRf" id="6azle7m3uLw" role="33vP2m">
              <node concept="3$_iS1" id="6azle7m3uLx" role="2ShVmc">
                <node concept="3uibUv" id="6azle7m3uL$" role="3$_nBY">
                  <ref role="3uigEE" to="wyt6:~Throwable" resolve="Throwable" />
                </node>
                <node concept="3$GHV9" id="6azle7m3uLy" role="3$GQph">
                  <node concept="3cmrfG" id="6azle7m3uLz" role="3$I4v7">
                    <property role="3cmrfH" value="1" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbH" id="4w5CHoiIGJB" role="3cqZAp" />
        <node concept="3clFbF" id="1KUoCipvy0k" role="3cqZAp">
          <node concept="2OqwBi" id="1KUoCipvy0l" role="3clFbG">
            <node concept="2OqwBi" id="5c4dSFNsz8t" role="2Oq$k0">
              <node concept="2OqwBi" id="5c4dSFNsywy" role="2Oq$k0">
                <node concept="37vLTw" id="5c4dSFNsy2X" role="2Oq$k0">
                  <ref role="3cqZAo" node="6azle7m3uK2" resolve="projectTest" />
                </node>
                <node concept="liA8E" id="5c4dSFNsyYV" role="2OqNvi">
                  <ref role="37wK5l" node="e$hNri9cbB" resolve="getProject" />
                </node>
              </node>
              <node concept="liA8E" id="5c4dSFNs$FN" role="2OqNvi">
                <ref role="37wK5l" to="z1c3:~Project.getModelAccess():org.jetbrains.mps.openapi.module.ModelAccess" resolve="getModelAccess" />
              </node>
            </node>
            <node concept="liA8E" id="1KUoCipvy0n" role="2OqNvi">
              <ref role="37wK5l" to="lui2:~ModelAccess.runReadAction(java.lang.Runnable):void" resolve="runReadAction" />
              <node concept="1bVj0M" id="1KUoCipvy0o" role="37wK5m">
                <node concept="3clFbS" id="1KUoCipvy0p" role="1bW5cS">
                  <node concept="3cpWs8" id="4w5CHoiIkXO" role="3cqZAp">
                    <node concept="3cpWsn" id="4w5CHoiIkXP" role="3cpWs9">
                      <property role="TrG5h" value="module" />
                      <property role="3TUv4t" value="true" />
                      <node concept="3uibUv" id="4w5CHoiIkXK" role="1tU5fm">
                        <ref role="3uigEE" to="lui2:~SModule" resolve="SModule" />
                      </node>
                      <node concept="2OqwBi" id="4w5CHoiIkXQ" role="33vP2m">
                        <node concept="liA8E" id="4w5CHoiIkXR" role="2OqNvi">
                          <ref role="37wK5l" to="mhbf:~SModel.getModule():org.jetbrains.mps.openapi.module.SModule" resolve="getModule" />
                        </node>
                        <node concept="2OqwBi" id="4w5CHoiIkXS" role="2Oq$k0">
                          <node concept="37vLTw" id="4w5CHoiIkXT" role="2Oq$k0">
                            <ref role="3cqZAo" node="6azle7m3uK2" resolve="projectTest" />
                          </node>
                          <node concept="liA8E" id="4w5CHoiIkXU" role="2OqNvi">
                            <ref role="37wK5l" node="e$hNri9ceN" resolve="getModelDescriptor" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbJ" id="4w5CHoiIo2F" role="3cqZAp">
                    <node concept="3clFbS" id="4w5CHoiIo2H" role="3clFbx">
                      <node concept="3clFbF" id="5c4dSFNsIsX" role="3cqZAp">
                        <node concept="37vLTI" id="5c4dSFNsJu2" role="3clFbG">
                          <node concept="2ShNRf" id="5c4dSFNsL7U" role="37vLTx">
                            <node concept="1pGfFk" id="5c4dSFNtg_e" role="2ShVmc">
                              <ref role="37wK5l" to="wyt6:~IllegalArgumentException.&lt;init&gt;(java.lang.String)" resolve="IllegalArgumentException" />
                              <node concept="3cpWs3" id="5c4dSFNtjqS" role="37wK5m">
                                <node concept="Xl_RD" id="5c4dSFNtjYs" role="3uHU7w">
                                  <property role="Xl_RC" value=" is not reloadable -- cannot run tests in it" />
                                </node>
                                <node concept="3cpWs3" id="5c4dSFNtiBP" role="3uHU7B">
                                  <node concept="Xl_RD" id="5c4dSFNth3L" role="3uHU7B">
                                    <property role="Xl_RC" value="module" />
                                  </node>
                                  <node concept="37vLTw" id="5c4dSFNtj2A" role="3uHU7w">
                                    <ref role="3cqZAo" node="4w5CHoiIkXP" resolve="module" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                          <node concept="AH0OO" id="5c4dSFNsIGN" role="37vLTJ">
                            <node concept="3cmrfG" id="5c4dSFNsJ5z" role="AHEQo">
                              <property role="3cmrfH" value="0" />
                            </node>
                            <node concept="37vLTw" id="5c4dSFNsIsV" role="AHHXb">
                              <ref role="3cqZAo" node="6azle7m3uLt" resolve="error" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="3cpWs6" id="5c4dSFNtocA" role="3cqZAp" />
                    </node>
                    <node concept="3fqX7Q" id="4w5CHoiIrvW" role="3clFbw">
                      <node concept="2ZW3vV" id="4w5CHoiIrvY" role="3fr31v">
                        <node concept="3uibUv" id="4w5CHoiIrvZ" role="2ZW6by">
                          <ref role="3uigEE" to="j8aq:~ReloadableModule" resolve="ReloadableModule" />
                        </node>
                        <node concept="37vLTw" id="4w5CHoiIrw0" role="2ZW6bz">
                          <ref role="3cqZAo" node="4w5CHoiIkXP" resolve="module" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="SfApY" id="4w5CHoiI_ZX" role="3cqZAp">
                    <node concept="3clFbS" id="4w5CHoiI_ZZ" role="SfCbr">
                      <node concept="3clFbF" id="1KUoCipvy0q" role="3cqZAp">
                        <node concept="37vLTI" id="1KUoCipvy0r" role="3clFbG">
                          <node concept="37vLTw" id="1KUoCipvy0_" role="37vLTJ">
                            <ref role="3cqZAo" node="6azle7m3uKe" resolve="clazz" />
                          </node>
                          <node concept="2OqwBi" id="4w5CHoiIk6$" role="37vLTx">
                            <node concept="1eOMI4" id="4w5CHoiIwyB" role="2Oq$k0">
                              <node concept="10QFUN" id="4w5CHoiIvX5" role="1eOMHV">
                                <node concept="3uibUv" id="4w5CHoiIwfG" role="10QFUM">
                                  <ref role="3uigEE" to="j8aq:~ReloadableModule" resolve="ReloadableModule" />
                                </node>
                                <node concept="37vLTw" id="4w5CHoiIkXV" role="10QFUP">
                                  <ref role="3cqZAo" node="4w5CHoiIkXP" resolve="module" />
                                </node>
                              </node>
                            </node>
                            <node concept="liA8E" id="4w5CHoiIkwe" role="2OqNvi">
                              <ref role="37wK5l" to="j8aq:~ReloadableModule.getOwnClass(java.lang.String):java.lang.Class" resolve="getOwnClass" />
                              <node concept="37vLTw" id="4w5CHoiIxzL" role="37wK5m">
                                <ref role="3cqZAo" node="6azle7m3uK7" resolve="className" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="TDmWw" id="4w5CHoiIA00" role="TEbGg">
                      <node concept="3clFbS" id="4w5CHoiIA02" role="TDEfX">
                        <node concept="3clFbF" id="4w5CHoiIIDH" role="3cqZAp">
                          <node concept="37vLTI" id="4w5CHoiIJQZ" role="3clFbG">
                            <node concept="37vLTw" id="4w5CHoiIK8$" role="37vLTx">
                              <ref role="3cqZAo" node="4w5CHoiIA04" resolve="t" />
                            </node>
                            <node concept="AH0OO" id="4w5CHoiIILJ" role="37vLTJ">
                              <node concept="3cmrfG" id="4w5CHoiIIU1" role="AHEQo">
                                <property role="3cmrfH" value="0" />
                              </node>
                              <node concept="37vLTw" id="4w5CHoiIIDF" role="AHHXb">
                                <ref role="3cqZAo" node="6azle7m3uLt" resolve="error" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="3cpWsn" id="4w5CHoiIA04" role="TDEfY">
                        <property role="TrG5h" value="t" />
                        <node concept="3uibUv" id="4w5CHoiIMOQ" role="1tU5fm">
                          <ref role="3uigEE" to="wyt6:~Throwable" resolve="Throwable" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="4w5CHoiIO3U" role="3cqZAp">
          <node concept="3clFbS" id="4w5CHoiIO3W" role="3clFbx">
            <node concept="YS8fn" id="4w5CHoiIQGr" role="3cqZAp">
              <node concept="AH0OO" id="4w5CHoiIQLX" role="YScLw">
                <node concept="3cmrfG" id="4w5CHoiIQMX" role="AHEQo">
                  <property role="3cmrfH" value="0" />
                </node>
                <node concept="37vLTw" id="4w5CHoiIQHG" role="AHHXb">
                  <ref role="3cqZAo" node="6azle7m3uLt" resolve="error" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3y3z36" id="4w5CHoiIQ88" role="3clFbw">
            <node concept="10Nm6u" id="4w5CHoiIQsM" role="3uHU7w" />
            <node concept="AH0OO" id="4w5CHoiIP5W" role="3uHU7B">
              <node concept="3cmrfG" id="4w5CHoiIP6W" role="AHEQo">
                <property role="3cmrfH" value="0" />
              </node>
              <node concept="37vLTw" id="4w5CHoiIOKR" role="AHHXb">
                <ref role="3cqZAo" node="6azle7m3uLt" resolve="error" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbH" id="4w5CHoiIRc6" role="3cqZAp" />
        <node concept="3cpWs8" id="6azle7m3uL0" role="3cqZAp">
          <node concept="3cpWsn" id="6azle7m3uL1" role="3cpWs9">
            <property role="TrG5h" value="obj" />
            <property role="3TUv4t" value="false" />
            <node concept="2OqwBi" id="6azle7m3uL3" role="33vP2m">
              <node concept="liA8E" id="6azle7m3uL5" role="2OqNvi">
                <ref role="37wK5l" to="wyt6:~Class.newInstance():java.lang.Object" resolve="newInstance" />
              </node>
              <node concept="37vLTw" id="3GM_nagTAM$" role="2Oq$k0">
                <ref role="3cqZAo" node="6azle7m3uKe" resolve="clazz" />
              </node>
            </node>
            <node concept="3uibUv" id="6azle7m3uL2" role="1tU5fm">
              <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6azle7m3uL6" role="3cqZAp">
          <node concept="2OqwBi" id="6azle7m3uL7" role="3clFbG">
            <node concept="liA8E" id="6azle7m3uLc" role="2OqNvi">
              <ref role="37wK5l" to="t6h5:~Field.set(java.lang.Object,java.lang.Object):void" resolve="set" />
              <node concept="37vLTw" id="3GM_nagTt_F" role="37wK5m">
                <ref role="3cqZAo" node="6azle7m3uL1" resolve="obj" />
              </node>
              <node concept="2OqwBi" id="6azle7m3uLe" role="37wK5m">
                <node concept="37vLTw" id="2BHiRxglB5C" role="2Oq$k0">
                  <ref role="3cqZAo" node="6azle7m3uK2" resolve="projectTest" />
                </node>
                <node concept="liA8E" id="e$hNri9cfK" role="2OqNvi">
                  <ref role="37wK5l" node="e$hNri9cfd" resolve="getTransientModelDescriptor" />
                </node>
              </node>
            </node>
            <node concept="2OqwBi" id="6azle7m3uL8" role="2Oq$k0">
              <node concept="37vLTw" id="3GM_nagTr5K" role="2Oq$k0">
                <ref role="3cqZAo" node="6azle7m3uKe" resolve="clazz" />
              </node>
              <node concept="liA8E" id="6azle7m3uLa" role="2OqNvi">
                <ref role="37wK5l" to="wyt6:~Class.getField(java.lang.String):java.lang.reflect.Field" resolve="getField" />
                <node concept="Xl_RD" id="6azle7m3uLb" role="37wK5m">
                  <property role="Xl_RC" value="myModel" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6azle7m3uLh" role="3cqZAp">
          <node concept="2OqwBi" id="6azle7m3uLi" role="3clFbG">
            <node concept="liA8E" id="6azle7m3uLn" role="2OqNvi">
              <ref role="37wK5l" to="t6h5:~Field.set(java.lang.Object,java.lang.Object):void" resolve="set" />
              <node concept="37vLTw" id="3GM_nagT$Td" role="37wK5m">
                <ref role="3cqZAo" node="6azle7m3uL1" resolve="obj" />
              </node>
              <node concept="2OqwBi" id="6azle7m3uLp" role="37wK5m">
                <node concept="37vLTw" id="2BHiRxghiPk" role="2Oq$k0">
                  <ref role="3cqZAo" node="6azle7m3uK2" resolve="projectTest" />
                </node>
                <node concept="liA8E" id="e$hNri9cfN" role="2OqNvi">
                  <ref role="37wK5l" node="e$hNri9cbB" resolve="getProject" />
                </node>
              </node>
            </node>
            <node concept="2OqwBi" id="6azle7m3uLj" role="2Oq$k0">
              <node concept="37vLTw" id="3GM_nagTz5H" role="2Oq$k0">
                <ref role="3cqZAo" node="6azle7m3uKe" resolve="clazz" />
              </node>
              <node concept="liA8E" id="6azle7m3uLl" role="2OqNvi">
                <ref role="37wK5l" to="wyt6:~Class.getField(java.lang.String):java.lang.reflect.Field" resolve="getField" />
                <node concept="Xl_RD" id="6azle7m3uLm" role="37wK5m">
                  <property role="Xl_RC" value="myProject" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="6azle7m3uL_" role="3cqZAp">
          <node concept="9aQIb" id="6azle7m3uM0" role="9aQIa">
            <node concept="3clFbS" id="6azle7m3uM1" role="9aQI4">
              <node concept="3clFbF" id="6azle7m3uM2" role="3cqZAp">
                <node concept="37vLTI" id="6azle7m3uM3" role="3clFbG">
                  <node concept="AH0OO" id="6azle7m3uM4" role="37vLTJ">
                    <node concept="3cmrfG" id="6azle7m3uM5" role="AHEQo">
                      <property role="3cmrfH" value="0" />
                    </node>
                    <node concept="37vLTw" id="3GM_nagTxR0" role="AHHXb">
                      <ref role="3cqZAo" node="6azle7m3uLt" resolve="error" />
                    </node>
                  </node>
                  <node concept="2OqwBi" id="6azle7m3uM7" role="37vLTx">
                    <node concept="liA8E" id="6azle7m3uM8" role="2OqNvi">
                      <ref role="37wK5l" node="6azle7m3uME" resolve="tryToRunTest" />
                      <node concept="37vLTw" id="3GM_nagTvDl" role="37wK5m">
                        <ref role="3cqZAo" node="6azle7m3uKe" resolve="clazz" />
                      </node>
                      <node concept="37vLTw" id="2BHiRxgmC5V" role="37wK5m">
                        <ref role="3cqZAo" node="6azle7m3uK9" resolve="methodName" />
                      </node>
                      <node concept="37vLTw" id="3GM_nagTB$r" role="37wK5m">
                        <ref role="3cqZAo" node="6azle7m3uL1" resolve="obj" />
                      </node>
                    </node>
                    <node concept="Xjq3P" id="6azle7m3uMc" role="2Oq$k0">
                      <ref role="1HBi2w" node="6azle7m2XHB" resolve="TransformationTestRunner" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="37vLTw" id="2BHiRxgl6vx" role="3clFbw">
            <ref role="3cqZAo" node="6azle7m3uKb" resolve="runInCommand" />
          </node>
          <node concept="3clFbS" id="6azle7m3uLA" role="3clFbx">
            <node concept="3clFbF" id="1gM9fJkYEnM" role="3cqZAp">
              <node concept="2YIFZM" id="1gM9fJkYErM" role="3clFbG">
                <ref role="37wK5l" to="3a50:~ThreadUtils.runInUIThreadAndWait(java.lang.Runnable):java.lang.Exception" resolve="runInUIThreadAndWait" />
                <ref role="1Pybhc" to="3a50:~ThreadUtils" resolve="ThreadUtils" />
                <node concept="1bVj0M" id="1gM9fJkYE$O" role="37wK5m">
                  <node concept="3clFbS" id="1gM9fJkYE$P" role="1bW5cS">
                    <node concept="3clFbF" id="44ZJhJ4gLV5" role="3cqZAp">
                      <node concept="2OqwBi" id="44ZJhJ4gNfL" role="3clFbG">
                        <node concept="2OqwBi" id="44ZJhJ4gM$v" role="2Oq$k0">
                          <node concept="2OqwBi" id="44ZJhJ4gM9f" role="2Oq$k0">
                            <node concept="37vLTw" id="44ZJhJ4gLV4" role="2Oq$k0">
                              <ref role="3cqZAo" node="6azle7m3uK2" resolve="projectTest" />
                            </node>
                            <node concept="liA8E" id="44ZJhJ4gMoX" role="2OqNvi">
                              <ref role="37wK5l" node="e$hNri9cbB" resolve="getProject" />
                            </node>
                          </node>
                          <node concept="liA8E" id="44ZJhJ4gNb0" role="2OqNvi">
                            <ref role="37wK5l" to="z1c3:~Project.getModelAccess():org.jetbrains.mps.openapi.module.ModelAccess" resolve="getModelAccess" />
                          </node>
                        </node>
                        <node concept="liA8E" id="44ZJhJ4gNDp" role="2OqNvi">
                          <ref role="37wK5l" to="lui2:~ModelAccess.executeCommand(java.lang.Runnable):void" resolve="executeCommand" />
                          <node concept="1bVj0M" id="44ZJhJ4gNMf" role="37wK5m">
                            <node concept="3clFbS" id="44ZJhJ4gNMg" role="1bW5cS">
                              <node concept="3clFbF" id="2uqyfsENDFu" role="3cqZAp">
                                <node concept="37vLTI" id="2uqyfsENDFv" role="3clFbG">
                                  <node concept="2OqwBi" id="2uqyfsENDFw" role="37vLTx">
                                    <node concept="Xjq3P" id="2uqyfsENDFx" role="2Oq$k0">
                                      <ref role="1HBi2w" node="6azle7m2XHB" resolve="TransformationTestRunner" />
                                    </node>
                                    <node concept="liA8E" id="2uqyfsENDFy" role="2OqNvi">
                                      <ref role="37wK5l" node="6azle7m3uME" resolve="tryToRunTest" />
                                      <node concept="37vLTw" id="2uqyfsENDFz" role="37wK5m">
                                        <ref role="3cqZAo" node="6azle7m3uKe" resolve="clazz" />
                                      </node>
                                      <node concept="37vLTw" id="2uqyfsENDF$" role="37wK5m">
                                        <ref role="3cqZAo" node="6azle7m3uK9" resolve="methodName" />
                                      </node>
                                      <node concept="37vLTw" id="2uqyfsENDF_" role="37wK5m">
                                        <ref role="3cqZAo" node="6azle7m3uL1" resolve="obj" />
                                      </node>
                                    </node>
                                  </node>
                                  <node concept="AH0OO" id="2uqyfsENDFA" role="37vLTJ">
                                    <node concept="37vLTw" id="2uqyfsENDFB" role="AHHXb">
                                      <ref role="3cqZAo" node="6azle7m3uLt" resolve="error" />
                                    </node>
                                    <node concept="3cmrfG" id="2uqyfsENDFC" role="AHEQo">
                                      <property role="3cmrfH" value="0" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbF" id="6BLo1MggwCy" role="3cqZAp">
              <node concept="2OqwBi" id="6BLo1MggwCz" role="3clFbG">
                <node concept="37vLTw" id="6BLo1MggwC$" role="2Oq$k0">
                  <ref role="3cqZAo" node="5A5jZryZNCC" resolve="myEnvironment" />
                </node>
                <node concept="liA8E" id="6BLo1MggwC_" role="2OqNvi">
                  <ref role="37wK5l" to="79ha:3eUNqOk4fPx" resolve="flushAllEvents" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="6azle7m3uMp" role="3cqZAp">
          <node concept="3clFbS" id="6azle7m3uMq" role="3clFbx">
            <node concept="34ab3g" id="1iRM0tJA_e8" role="3cqZAp">
              <property role="35gtTG" value="info" />
              <node concept="Xl_RD" id="1iRM0tJA_ea" role="34bqiv">
                <property role="Xl_RC" value="Test failed" />
              </node>
            </node>
            <node concept="YS8fn" id="6azle7m3uMr" role="3cqZAp">
              <node concept="AH0OO" id="6azle7m3uMs" role="YScLw">
                <node concept="37vLTw" id="3GM_nagTvog" role="AHHXb">
                  <ref role="3cqZAo" node="6azle7m3uLt" resolve="error" />
                </node>
                <node concept="3cmrfG" id="6azle7m3uMt" role="AHEQo">
                  <property role="3cmrfH" value="0" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3y3z36" id="6azle7m3uMv" role="3clFbw">
            <node concept="10Nm6u" id="6azle7m3uMw" role="3uHU7w" />
            <node concept="AH0OO" id="6azle7m3uMx" role="3uHU7B">
              <node concept="3cmrfG" id="6azle7m3uMy" role="AHEQo">
                <property role="3cmrfH" value="0" />
              </node>
              <node concept="37vLTw" id="3GM_nagTxov" role="AHHXb">
                <ref role="3cqZAo" node="6azle7m3uLt" resolve="error" />
              </node>
            </node>
          </node>
        </node>
        <node concept="34ab3g" id="1iRM0tJ_RmQ" role="3cqZAp">
          <property role="35gtTG" value="info" />
          <node concept="Xl_RD" id="1iRM0tJ_RmS" role="34bqiv">
            <property role="Xl_RC" value="Test passed" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6azle7m3uJW" role="1B3o_S" />
      <node concept="37vLTG" id="6azle7m3uK7" role="3clF46">
        <property role="TrG5h" value="className" />
        <node concept="17QB3L" id="6azle7m3uK8" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="6azle7m3uK9" role="3clF46">
        <property role="TrG5h" value="methodName" />
        <property role="3TUv4t" value="true" />
        <node concept="17QB3L" id="6azle7m3uKa" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="6azle7m3uKb" role="3clF46">
        <property role="TrG5h" value="runInCommand" />
        <property role="3TUv4t" value="false" />
        <node concept="10P_77" id="6azle7m3uKc" role="1tU5fm" />
      </node>
    </node>
    <node concept="2tJIrI" id="1K136DJAnFO" role="jymVt" />
    <node concept="2YIFZL" id="2jln2Vr6ZdR" role="jymVt">
      <property role="TrG5h" value="clearSystemClipboard" />
      <property role="IEkAT" value="false" />
      <property role="DiZV1" value="false" />
      <property role="od$2w" value="false" />
      <node concept="3clFbS" id="6azle7m3uI9" role="3clF47">
        <node concept="3clFbJ" id="14RhCJSR1Io" role="3cqZAp">
          <node concept="2YIFZM" id="14RhCJSR356" role="3clFbw">
            <ref role="37wK5l" to="z60i:~GraphicsEnvironment.isHeadless():boolean" resolve="isHeadless" />
            <ref role="1Pybhc" to="z60i:~GraphicsEnvironment" resolve="GraphicsEnvironment" />
          </node>
          <node concept="3clFbS" id="14RhCJSR1Iq" role="3clFbx">
            <node concept="3cpWs6" id="14RhCJSR35B" role="3cqZAp" />
          </node>
        </node>
        <node concept="3cpWs8" id="2jln2Vr72mD" role="3cqZAp">
          <node concept="3cpWsn" id="2jln2Vr72mE" role="3cpWs9">
            <property role="TrG5h" value="clipboard" />
            <node concept="3uibUv" id="2jln2Vr72mA" role="1tU5fm">
              <ref role="3uigEE" to="kt01:~Clipboard" resolve="Clipboard" />
            </node>
            <node concept="2OqwBi" id="2jln2Vr72mF" role="33vP2m">
              <node concept="liA8E" id="2jln2Vr72mG" role="2OqNvi">
                <ref role="37wK5l" to="z60i:~Toolkit.getSystemClipboard():java.awt.datatransfer.Clipboard" resolve="getSystemClipboard" />
              </node>
              <node concept="2YIFZM" id="2jln2Vr72mH" role="2Oq$k0">
                <ref role="37wK5l" to="z60i:~Toolkit.getDefaultToolkit():java.awt.Toolkit" resolve="getDefaultToolkit" />
                <ref role="1Pybhc" to="z60i:~Toolkit" resolve="Toolkit" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6azle7m3uIa" role="3cqZAp">
          <node concept="2OqwBi" id="6azle7m3uIb" role="3clFbG">
            <node concept="liA8E" id="6azle7m3uIf" role="2OqNvi">
              <ref role="37wK5l" to="kt01:~Clipboard.setContents(java.awt.datatransfer.Transferable,java.awt.datatransfer.ClipboardOwner):void" resolve="setContents" />
              <node concept="37vLTw" id="2jln2Vr71$l" role="37wK5m">
                <ref role="3cqZAo" node="w2wbCIe_Lu" resolve="EMPTY_CLIPBOARD_CONTENT" />
              </node>
              <node concept="37vLTw" id="2jln2Vr72iT" role="37wK5m">
                <ref role="3cqZAo" node="w2wbCIe_Lu" resolve="EMPTY_CLIPBOARD_CONTENT" />
              </node>
            </node>
            <node concept="37vLTw" id="2jln2Vr72mI" role="2Oq$k0">
              <ref role="3cqZAo" node="2jln2Vr72mE" resolve="clipboard" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3cqZAl" id="6azle7m3uI7" role="3clF45" />
      <node concept="3Tm6S6" id="6azle7m3uI8" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="7VpmPDorzS0" role="jymVt" />
    <node concept="2YIFZL" id="2jln2Vr6Gb3" role="jymVt">
      <property role="TrG5h" value="readSystemMacro" />
      <property role="IEkAT" value="false" />
      <property role="DiZV1" value="false" />
      <property role="od$2w" value="false" />
      <node concept="3clFbS" id="6azle7m3uIl" role="3clF47">
        <node concept="3cpWs8" id="2$FfS_Sajdj" role="3cqZAp">
          <node concept="3cpWsn" id="2$FfS_Sajdk" role="3cpWs9">
            <property role="TrG5h" value="macros" />
            <property role="3TUv4t" value="true" />
            <node concept="2ShNRf" id="2$FfS_Sajdr" role="33vP2m">
              <node concept="3rGOSV" id="2$FfS_Sajdt" role="2ShVmc">
                <node concept="17QB3L" id="2$FfS_Sajdw" role="3rHrn6" />
                <node concept="17QB3L" id="2$FfS_Sajdx" role="3rHtpV" />
              </node>
            </node>
            <node concept="3rvAFt" id="2$FfS_Sajdl" role="1tU5fm">
              <node concept="17QB3L" id="2$FfS_Sajdp" role="3rvSg0" />
              <node concept="17QB3L" id="2$FfS_Sajdo" role="3rvQeY" />
            </node>
          </node>
        </node>
        <node concept="2Gpval" id="6azle7m3uIm" role="3cqZAp">
          <node concept="3clFbS" id="6azle7m3uIp" role="2LFqv$">
            <node concept="3clFbJ" id="6azle7m3uIq" role="3cqZAp">
              <node concept="3clFbS" id="6azle7m3uIw" role="3clFbx">
                <node concept="3cpWs8" id="6azle7m3uIx" role="3cqZAp">
                  <node concept="3cpWsn" id="6azle7m3uIy" role="3cpWs9">
                    <property role="TrG5h" value="key" />
                    <node concept="10QFUN" id="6azle7m3uIA" role="33vP2m">
                      <node concept="17QB3L" id="6azle7m3uIE" role="10QFUM" />
                      <node concept="2OqwBi" id="6azle7m3uIB" role="10QFUP">
                        <node concept="2GrUjf" id="6azle7m3uIC" role="2Oq$k0">
                          <ref role="2Gs0qQ" node="6azle7m3uIn" resolve="property" />
                        </node>
                        <node concept="3AY5_j" id="6azle7m3uID" role="2OqNvi" />
                      </node>
                    </node>
                    <node concept="17QB3L" id="6azle7m3uIz" role="1tU5fm" />
                  </node>
                </node>
                <node concept="3cpWs8" id="2jln2Vr6DHg" role="3cqZAp">
                  <node concept="3cpWsn" id="2jln2Vr6DHh" role="3cpWs9">
                    <property role="TrG5h" value="value" />
                    <node concept="17QB3L" id="2jln2Vr6DF_" role="1tU5fm" />
                    <node concept="10QFUN" id="2jln2Vr6DHi" role="33vP2m">
                      <node concept="17QB3L" id="2jln2Vr6DHj" role="10QFUM" />
                      <node concept="2OqwBi" id="2jln2Vr6DHk" role="10QFUP">
                        <node concept="3AV6Ez" id="2jln2Vr6DHl" role="2OqNvi" />
                        <node concept="2GrUjf" id="2jln2Vr6DHm" role="2Oq$k0">
                          <ref role="2Gs0qQ" node="6azle7m3uIn" resolve="property" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbJ" id="6azle7m3uIF" role="3cqZAp">
                  <node concept="3clFbS" id="6azle7m3uIG" role="3clFbx">
                    <node concept="3cpWs8" id="2jln2Vr533T" role="3cqZAp">
                      <node concept="3cpWsn" id="2jln2Vr533U" role="3cpWs9">
                        <property role="TrG5h" value="path" />
                        <node concept="3uibUv" id="2jln2Vr533V" role="1tU5fm">
                          <ref role="3uigEE" to="v9gs:7vzkp06OD_v" resolve="CanonicalPath" />
                        </node>
                        <node concept="2ShNRf" id="2jln2Vr53tE" role="33vP2m">
                          <node concept="1pGfFk" id="2jln2Vr5m1U" role="2ShVmc">
                            <ref role="37wK5l" to="v9gs:7vzkp06OD_x" resolve="CanonicalPath" />
                            <node concept="37vLTw" id="2jln2Vr6DHn" role="37wK5m">
                              <ref role="3cqZAo" node="2jln2Vr6DHh" resolve="value" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3clFbJ" id="6azle7m3uJ4" role="3cqZAp">
                      <node concept="3clFbS" id="6azle7m3uJ5" role="3clFbx">
                        <node concept="3clFbF" id="2$FfS_Sajdz" role="3cqZAp">
                          <node concept="37vLTI" id="2$FfS_SajdI" role="3clFbG">
                            <node concept="3EllGN" id="2$FfS_SajdF" role="37vLTJ">
                              <node concept="2OqwBi" id="6azle7m3uJa" role="3ElVtu">
                                <node concept="37vLTw" id="3GM_nagTyUg" role="2Oq$k0">
                                  <ref role="3cqZAo" node="6azle7m3uIy" resolve="key" />
                                </node>
                                <node concept="liA8E" id="6azle7m3uJc" role="2OqNvi">
                                  <ref role="37wK5l" to="wyt6:~String.substring(int):java.lang.String" resolve="substring" />
                                  <node concept="2OqwBi" id="6azle7m3uJd" role="37wK5m">
                                    <node concept="37vLTw" id="2jln2Vr6Ydu" role="2Oq$k0">
                                      <ref role="3cqZAo" node="2jln2Vr6Rld" resolve="PATH_MACRO_PREFIX" />
                                    </node>
                                    <node concept="liA8E" id="6azle7m3uJe" role="2OqNvi">
                                      <ref role="37wK5l" to="wyt6:~String.length():int" resolve="length" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                              <node concept="37vLTw" id="3GM_nagTrPg" role="3ElQJh">
                                <ref role="3cqZAo" node="2$FfS_Sajdk" resolve="macros" />
                              </node>
                            </node>
                            <node concept="2OqwBi" id="2jln2Vr5okj" role="37vLTx">
                              <node concept="37vLTw" id="2jln2Vr5oi1" role="2Oq$k0">
                                <ref role="3cqZAo" node="2jln2Vr533U" resolve="path" />
                              </node>
                              <node concept="liA8E" id="2jln2Vr5ott" role="2OqNvi">
                                <ref role="37wK5l" to="v9gs:2jln2Vr1ksE" resolve="getValue" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="2OqwBi" id="2jln2Vr5o19" role="3clFbw">
                        <node concept="37vLTw" id="2jln2Vr5nYJ" role="2Oq$k0">
                          <ref role="3cqZAo" node="2jln2Vr533U" resolve="path" />
                        </node>
                        <node concept="liA8E" id="2jln2Vr5oaR" role="2OqNvi">
                          <ref role="37wK5l" to="v9gs:2jln2Vr1dnx" resolve="isValidDirectory" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="1Wc70l" id="6azle7m3uJn" role="3clFbw">
                    <node concept="2OqwBi" id="6azle7m3uJr" role="3uHU7B">
                      <node concept="17RvpY" id="6azle7m3uJt" role="2OqNvi" />
                      <node concept="37vLTw" id="3GM_nagT$kL" role="2Oq$k0">
                        <ref role="3cqZAo" node="6azle7m3uIy" resolve="key" />
                      </node>
                    </node>
                    <node concept="2OqwBi" id="6azle7m3uJo" role="3uHU7w">
                      <node concept="liA8E" id="6azle7m3uJq" role="2OqNvi">
                        <ref role="37wK5l" to="wyt6:~String.startsWith(java.lang.String):boolean" resolve="startsWith" />
                        <node concept="37vLTw" id="2jln2Vr6Y2_" role="37wK5m">
                          <ref role="3cqZAo" node="2jln2Vr6Rld" resolve="PATH_MACRO_PREFIX" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="3GM_nagTv$B" role="2Oq$k0">
                        <ref role="3cqZAo" node="6azle7m3uIy" resolve="key" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="1Wc70l" id="2jln2Vr6x42" role="3clFbw">
                <node concept="2ZW3vV" id="2jln2Vr6yzA" role="3uHU7w">
                  <node concept="17QB3L" id="2jln2Vr6yRU" role="2ZW6by" />
                  <node concept="2OqwBi" id="2jln2Vr6xyy" role="2ZW6bz">
                    <node concept="2GrUjf" id="2jln2Vr6xo2" role="2Oq$k0">
                      <ref role="2Gs0qQ" node="6azle7m3uIn" resolve="property" />
                    </node>
                    <node concept="3AV6Ez" id="2jln2Vr6yfq" role="2OqNvi" />
                  </node>
                </node>
                <node concept="2ZW3vV" id="6azle7m3uIr" role="3uHU7B">
                  <node concept="2OqwBi" id="6azle7m3uIt" role="2ZW6bz">
                    <node concept="3AY5_j" id="6azle7m3uIv" role="2OqNvi" />
                    <node concept="2GrUjf" id="6azle7m3uIu" role="2Oq$k0">
                      <ref role="2Gs0qQ" node="6azle7m3uIn" resolve="property" />
                    </node>
                  </node>
                  <node concept="17QB3L" id="6azle7m3uIs" role="2ZW6by" />
                </node>
              </node>
            </node>
          </node>
          <node concept="2YIFZM" id="6azle7m3uIo" role="2GsD0m">
            <ref role="1Pybhc" to="wyt6:~System" resolve="System" />
            <ref role="37wK5l" to="wyt6:~System.getProperties():java.util.Properties" resolve="getProperties" />
          </node>
          <node concept="2GrKxI" id="6azle7m3uIn" role="2Gsz3X">
            <property role="TrG5h" value="property" />
          </node>
        </node>
        <node concept="3cpWs8" id="2jln2Vr7frt" role="3cqZAp">
          <node concept="3cpWsn" id="2jln2Vr7fru" role="3cpWs9">
            <property role="TrG5h" value="provider" />
            <node concept="3uibUv" id="1nB28saYpf" role="1tU5fm">
              <ref role="3uigEE" to="v9gs:57xhZj4qVKZ" resolve="MapPathMacrosProvider" />
            </node>
            <node concept="2ShNRf" id="2jln2Vr7frv" role="33vP2m">
              <node concept="1pGfFk" id="2jln2Vr7frw" role="2ShVmc">
                <ref role="37wK5l" to="v9gs:57xhZj4qVL7" resolve="MapPathMacrosProvider" />
                <node concept="37vLTw" id="2jln2Vr7frx" role="37wK5m">
                  <ref role="3cqZAo" node="2$FfS_Sajdk" resolve="macros" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="2$FfS_SajdN" role="3cqZAp">
          <node concept="2OqwBi" id="2$FfS_SajdQ" role="3clFbG">
            <node concept="liA8E" id="2$FfS_SajdU" role="2OqNvi">
              <ref role="37wK5l" to="z1c3:~PathMacros.addMacrosProvider(jetbrains.mps.project.PathMacrosProvider):void" resolve="addMacrosProvider" />
              <node concept="37vLTw" id="2jln2Vr7fry" role="37wK5m">
                <ref role="3cqZAo" node="2jln2Vr7fru" resolve="provider" />
              </node>
            </node>
            <node concept="2YIFZM" id="2$FfS_SajdP" role="2Oq$k0">
              <ref role="37wK5l" to="z1c3:~PathMacros.getInstance():jetbrains.mps.project.PathMacros" resolve="getInstance" />
              <ref role="1Pybhc" to="z1c3:~PathMacros" resolve="PathMacros" />
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="2jln2Vr7fWb" role="3cqZAp">
          <node concept="37vLTw" id="2jln2Vr7gaX" role="3cqZAk">
            <ref role="3cqZAo" node="2jln2Vr7fru" resolve="provider" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="2jln2Vr7fe8" role="3clF45">
        <ref role="3uigEE" to="z1c3:~PathMacrosProvider" resolve="PathMacrosProvider" />
      </node>
      <node concept="P$JXv" id="7VpmPDor_e9" role="lGtFl">
        <node concept="TZ5HA" id="7VpmPDor_fp" role="TZ5H$">
          <node concept="1dT_AC" id="7VpmPDor_fq" role="1dT_Ay">
            <property role="1dT_AB" value="to enable such macros as ${charisma}; see MPS-10568" />
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="6azle7m3uIk" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="7VpmPDos57B" role="jymVt" />
    <node concept="3clFb_" id="6azle7m3uME" role="jymVt">
      <property role="TrG5h" value="tryToRunTest" />
      <node concept="3clFbS" id="6azle7m3uMN" role="3clF47">
        <node concept="3cpWs8" id="6azle7m3uMO" role="3cqZAp">
          <node concept="3cpWsn" id="6azle7m3uMP" role="3cpWs9">
            <property role="TrG5h" value="exception" />
            <node concept="10Nm6u" id="6azle7m3uMR" role="33vP2m" />
            <node concept="3uibUv" id="6azle7m3uMQ" role="1tU5fm">
              <ref role="3uigEE" to="wyt6:~Throwable" resolve="Throwable" />
            </node>
          </node>
        </node>
        <node concept="SfApY" id="6azle7m3uMS" role="3cqZAp">
          <node concept="TDmWw" id="6azle7m3uN2" role="TEbGg">
            <node concept="3clFbS" id="6azle7m3uN5" role="TDEfX">
              <node concept="3clFbF" id="6azle7m3uN6" role="3cqZAp">
                <node concept="2OqwBi" id="6azle7m3uN7" role="3clFbG">
                  <node concept="37vLTw" id="3GM_nagT$gV" role="2Oq$k0">
                    <ref role="3cqZAo" node="6azle7m3uN3" resolve="e" />
                  </node>
                  <node concept="liA8E" id="6azle7m3uN9" role="2OqNvi">
                    <ref role="37wK5l" to="wyt6:~Throwable.printStackTrace():void" resolve="printStackTrace" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3cpWsn" id="6azle7m3uN3" role="TDEfY">
              <property role="TrG5h" value="e" />
              <node concept="3uibUv" id="6azle7m3uN4" role="1tU5fm">
                <ref role="3uigEE" to="wyt6:~NoSuchMethodException" resolve="NoSuchMethodException" />
              </node>
            </node>
          </node>
          <node concept="3clFbS" id="6azle7m3uMT" role="SfCbr">
            <node concept="3clFbF" id="6azle7m3uMU" role="3cqZAp">
              <node concept="2OqwBi" id="6azle7m3uMV" role="3clFbG">
                <node concept="liA8E" id="6azle7m3uN0" role="2OqNvi">
                  <ref role="37wK5l" to="t6h5:~Method.invoke(java.lang.Object,java.lang.Object...):java.lang.Object" resolve="invoke" />
                  <node concept="37vLTw" id="2BHiRxghiW1" role="37wK5m">
                    <ref role="3cqZAo" node="6azle7m3uML" resolve="obj" />
                  </node>
                </node>
                <node concept="2OqwBi" id="6azle7m3uMW" role="2Oq$k0">
                  <node concept="liA8E" id="6azle7m3uMY" role="2OqNvi">
                    <ref role="37wK5l" to="wyt6:~Class.getMethod(java.lang.String,java.lang.Class...):java.lang.reflect.Method" resolve="getMethod" />
                    <node concept="37vLTw" id="2BHiRxgm8IR" role="37wK5m">
                      <ref role="3cqZAo" node="6azle7m3uMJ" resolve="methodName" />
                    </node>
                  </node>
                  <node concept="37vLTw" id="2BHiRxghiXY" role="2Oq$k0">
                    <ref role="3cqZAo" node="6azle7m3uMH" resolve="clazz" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="TDmWw" id="6azle7m3uNa" role="TEbGg">
            <node concept="3clFbS" id="6azle7m3uNd" role="TDEfX">
              <node concept="3clFbF" id="6azle7m3uNe" role="3cqZAp">
                <node concept="2OqwBi" id="6azle7m3uNf" role="3clFbG">
                  <node concept="liA8E" id="6azle7m3uNh" role="2OqNvi">
                    <ref role="37wK5l" to="wyt6:~Throwable.printStackTrace():void" resolve="printStackTrace" />
                  </node>
                  <node concept="37vLTw" id="3GM_nagT_is" role="2Oq$k0">
                    <ref role="3cqZAo" node="6azle7m3uNb" resolve="e" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3cpWsn" id="6azle7m3uNb" role="TDEfY">
              <property role="TrG5h" value="e" />
              <node concept="3uibUv" id="6azle7m3uNc" role="1tU5fm">
                <ref role="3uigEE" to="wyt6:~IllegalAccessException" resolve="IllegalAccessException" />
              </node>
            </node>
          </node>
          <node concept="TDmWw" id="6azle7m3uNi" role="TEbGg">
            <node concept="3clFbS" id="6azle7m3uNl" role="TDEfX">
              <node concept="3clFbF" id="6azle7m3uNm" role="3cqZAp">
                <node concept="37vLTI" id="6azle7m3uNn" role="3clFbG">
                  <node concept="2OqwBi" id="6azle7m3uNo" role="37vLTx">
                    <node concept="37vLTw" id="3GM_nagTt0Z" role="2Oq$k0">
                      <ref role="3cqZAo" node="6azle7m3uNj" resolve="e" />
                    </node>
                    <node concept="liA8E" id="6azle7m3uNq" role="2OqNvi">
                      <ref role="37wK5l" to="t6h5:~InvocationTargetException.getTargetException():java.lang.Throwable" resolve="getTargetException" />
                    </node>
                  </node>
                  <node concept="37vLTw" id="3GM_nagTx9j" role="37vLTJ">
                    <ref role="3cqZAo" node="6azle7m3uMP" resolve="exception" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3cpWsn" id="6azle7m3uNj" role="TDEfY">
              <property role="TrG5h" value="e" />
              <node concept="3uibUv" id="6azle7m3uNk" role="1tU5fm">
                <ref role="3uigEE" to="t6h5:~InvocationTargetException" resolve="InvocationTargetException" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="6azle7m3uNs" role="3cqZAp">
          <node concept="37vLTw" id="3GM_nagTy22" role="3cqZAk">
            <ref role="3cqZAo" node="6azle7m3uMP" resolve="exception" />
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="6azle7m3uMF" role="1B3o_S" />
      <node concept="3uibUv" id="6azle7m3uMG" role="3clF45">
        <ref role="3uigEE" to="wyt6:~Throwable" resolve="Throwable" />
      </node>
      <node concept="37vLTG" id="6azle7m3uMH" role="3clF46">
        <property role="TrG5h" value="clazz" />
        <node concept="3uibUv" id="6azle7m3uMI" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~Class" resolve="Class" />
        </node>
      </node>
      <node concept="37vLTG" id="6azle7m3uMJ" role="3clF46">
        <property role="TrG5h" value="methodName" />
        <node concept="17QB3L" id="6azle7m3uMK" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="6azle7m3uML" role="3clF46">
        <property role="TrG5h" value="obj" />
        <node concept="3uibUv" id="6azle7m3uMM" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
        </node>
      </node>
    </node>
    <node concept="3Tm1VV" id="6azle7m2XHC" role="1B3o_S" />
  </node>
  <node concept="3HP615" id="e$hNri9cbt">
    <property role="TrG5h" value="TransformationTest" />
    <property role="3GE5qa" value="transformation" />
    <node concept="3clFb_" id="e$hNri9cbv" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="setProject" />
      <node concept="3cqZAl" id="e$hNri9cbw" role="3clF45" />
      <node concept="3Tm1VV" id="e$hNri9cbx" role="1B3o_S" />
      <node concept="3clFbS" id="e$hNri9cby" role="3clF47" />
      <node concept="37vLTG" id="e$hNri9cbz" role="3clF46">
        <property role="TrG5h" value="project" />
        <node concept="3uibUv" id="e$hNri9cb$" role="1tU5fm">
          <ref role="3uigEE" to="z1c3:~Project" resolve="Project" />
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="DRazW7Yr7b" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="setTestRunner" />
      <node concept="3cqZAl" id="DRazW7Yr7d" role="3clF45" />
      <node concept="3Tm1VV" id="DRazW7Yr7e" role="1B3o_S" />
      <node concept="3clFbS" id="DRazW7Yr7f" role="3clF47" />
      <node concept="37vLTG" id="DRazW7Z25q" role="3clF46">
        <property role="TrG5h" value="runner" />
        <node concept="3uibUv" id="DRazW80lTu" role="1tU5fm">
          <ref role="3uigEE" node="4_ksyPqMhZ7" resolve="TestRunner" />
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="DRazW80b9I" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="getTestRunner" />
      <node concept="3uibUv" id="DRazW80lS3" role="3clF45">
        <ref role="3uigEE" node="4_ksyPqMhZ7" resolve="TestRunner" />
      </node>
      <node concept="3Tm1VV" id="DRazW80b9L" role="1B3o_S" />
      <node concept="3clFbS" id="DRazW80b9M" role="3clF47" />
    </node>
    <node concept="3clFb_" id="e$hNri9cbB" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="getProject" />
      <node concept="3Tm1VV" id="e$hNri9cbD" role="1B3o_S" />
      <node concept="3clFbS" id="e$hNri9cbE" role="3clF47" />
      <node concept="3uibUv" id="e$hNri9cbF" role="3clF45">
        <ref role="3uigEE" to="z1c3:~Project" resolve="Project" />
      </node>
    </node>
    <node concept="3clFb_" id="7P8zeXPHTzc" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="setModelDescriptor" />
      <node concept="37vLTG" id="7P8zeXPHTzd" role="3clF46">
        <property role="TrG5h" value="descriptor" />
        <node concept="3uibUv" id="7P8zeXPHTze" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SModel" resolve="SModel" />
        </node>
      </node>
      <node concept="3cqZAl" id="7P8zeXPHTzf" role="3clF45" />
      <node concept="3Tm1VV" id="7P8zeXPHTzg" role="1B3o_S" />
      <node concept="3clFbS" id="7P8zeXPHTzh" role="3clF47" />
    </node>
    <node concept="3clFb_" id="wQDhRCDNC8" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="setTransientModelDescriptor" />
      <node concept="37vLTG" id="wQDhRCDNC9" role="3clF46">
        <property role="TrG5h" value="descriptor" />
        <node concept="3uibUv" id="wQDhRCDNCa" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SModel" resolve="SModel" />
        </node>
      </node>
      <node concept="3cqZAl" id="wQDhRCDNCb" role="3clF45" />
      <node concept="3Tm1VV" id="wQDhRCDNCc" role="1B3o_S" />
      <node concept="3clFbS" id="wQDhRCDNCd" role="3clF47" />
    </node>
    <node concept="3clFb_" id="e$hNri9ceN" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="getModelDescriptor" />
      <node concept="3clFbS" id="e$hNri9ceQ" role="3clF47" />
      <node concept="3Tm1VV" id="e$hNri9ceP" role="1B3o_S" />
      <node concept="3uibUv" id="e$hNri9ceX" role="3clF45">
        <ref role="3uigEE" to="mhbf:~SModel" resolve="SModel" />
      </node>
    </node>
    <node concept="3clFb_" id="e$hNri9cfd" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="getTransientModelDescriptor" />
      <node concept="3Tm1VV" id="e$hNri9cfe" role="1B3o_S" />
      <node concept="3clFbS" id="e$hNri9cff" role="3clF47" />
      <node concept="3uibUv" id="e$hNri9cfg" role="3clF45">
        <ref role="3uigEE" to="mhbf:~SModel" resolve="SModel" />
      </node>
    </node>
    <node concept="3clFb_" id="7P8zeXPIrdY" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="init" />
      <node concept="3Tm1VV" id="7P8zeXPIre0" role="1B3o_S" />
      <node concept="3clFbS" id="7P8zeXPIre1" role="3clF47" />
      <node concept="3cqZAl" id="7P8zeXPIrdZ" role="3clF45" />
    </node>
    <node concept="3clFb_" id="6OQSQAx9h3Q" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="dispose" />
      <node concept="3cqZAl" id="6OQSQAx9h3S" role="3clF45" />
      <node concept="3Tm1VV" id="6OQSQAx9h3T" role="1B3o_S" />
      <node concept="3clFbS" id="6OQSQAx9h3U" role="3clF47" />
    </node>
    <node concept="3Tm1VV" id="e$hNri9cbu" role="1B3o_S" />
  </node>
  <node concept="312cEu" id="e$hNri8RAJ">
    <property role="TrG5h" value="BaseTransformationTest" />
    <property role="1sVAO0" value="true" />
    <property role="3GE5qa" value="transformation" />
    <node concept="312cEg" id="e$hNri9PeB" role="jymVt">
      <property role="TrG5h" value="myProject" />
      <property role="3TUv4t" value="false" />
      <node concept="3Tm6S6" id="e$hNri9PeC" role="1B3o_S" />
      <node concept="3uibUv" id="e$hNri9PeD" role="1tU5fm">
        <ref role="3uigEE" to="z1c3:~Project" resolve="Project" />
      </node>
    </node>
    <node concept="312cEg" id="e$hNri9Pex" role="jymVt">
      <property role="TrG5h" value="myModel" />
      <node concept="3Tm6S6" id="e$hNri9Pey" role="1B3o_S" />
      <node concept="3uibUv" id="e$hNri9Pez" role="1tU5fm">
        <ref role="3uigEE" to="mhbf:~SModel" resolve="SModel" />
      </node>
    </node>
    <node concept="312cEg" id="e$hNri9Pe$" role="jymVt">
      <property role="TrG5h" value="myTransientModel" />
      <node concept="3Tm6S6" id="e$hNri9Pe_" role="1B3o_S" />
      <node concept="3uibUv" id="e$hNri9PeA" role="1tU5fm">
        <ref role="3uigEE" to="mhbf:~SModel" resolve="SModel" />
      </node>
    </node>
    <node concept="312cEg" id="e$hNri8RBd" role="jymVt">
      <property role="TrG5h" value="myRunner" />
      <node concept="3uibUv" id="4_ksyPqPw$Z" role="1tU5fm">
        <ref role="3uigEE" node="4_ksyPqMhZ7" resolve="TestRunner" />
      </node>
      <node concept="3Tm6S6" id="e$hNri8RBe" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="17FLbikLRxn" role="jymVt" />
    <node concept="2YIFZL" id="2VDNdDcejGL" role="jymVt">
      <property role="TrG5h" value="isExecutionInProcess" />
      <property role="DiZV1" value="false" />
      <property role="od$2w" value="false" />
      <node concept="3clFbS" id="50N5GDnpzNo" role="3clF47">
        <node concept="3cpWs6" id="50N5GDnp$HF" role="3cqZAp">
          <node concept="3clFbC" id="5XEoQWqWbH" role="3cqZAk">
            <node concept="Rm8GO" id="5XEoQWqWKA" role="3uHU7w">
              <ref role="Rm8GQ" to="fyhk:~TestMode.IN_PROCESS" resolve="IN_PROCESS" />
              <ref role="1Px2BO" to="fyhk:~TestMode" resolve="TestMode" />
            </node>
            <node concept="2YIFZM" id="5XEoQWqVOA" role="3uHU7B">
              <ref role="37wK5l" to="fyhk:~RuntimeFlags.getTestMode():jetbrains.mps.TestMode" resolve="getTestMode" />
              <ref role="1Pybhc" to="fyhk:~RuntimeFlags" resolve="RuntimeFlags" />
            </node>
          </node>
        </node>
      </node>
      <node concept="10P_77" id="50N5GDnp$HN" role="3clF45" />
      <node concept="3Tm1VV" id="50N5GDnp$j7" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="50N5GDnpzkp" role="jymVt" />
    <node concept="2YIFZL" id="2VDNdDcejoD" role="jymVt">
      <property role="TrG5h" value="defaultTestRunner" />
      <property role="DiZV1" value="false" />
      <property role="od$2w" value="false" />
      <node concept="2AHcQZ" id="2VDNdDce9DW" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
      </node>
      <node concept="3clFbS" id="4_ksyPqPvYv" role="3clF47">
        <node concept="3clFbJ" id="4_ksyPqPvYw" role="3cqZAp">
          <node concept="1rXfSq" id="50N5GDnqghD" role="3clFbw">
            <ref role="37wK5l" node="2VDNdDcejGL" resolve="isExecutionInProcess" />
          </node>
          <node concept="3clFbS" id="4_ksyPqPvYx" role="3clFbx">
            <node concept="3cpWs6" id="2VDNdDce9r_" role="3cqZAp">
              <node concept="2ShNRf" id="4_ksyPqPvYG" role="3cqZAk">
                <node concept="1pGfFk" id="ECLZhkoCQr" role="2ShVmc">
                  <ref role="37wK5l" node="2ky3Rs1tOO6" resolve="TransformationTestLightRunner" />
                </node>
              </node>
            </node>
          </node>
          <node concept="9aQIb" id="4_ksyPqPvYC" role="9aQIa">
            <node concept="3clFbS" id="4_ksyPqPvYD" role="9aQI4">
              <node concept="3cpWs8" id="2ky3Rs1tMB7" role="3cqZAp">
                <node concept="3cpWsn" id="2ky3Rs1tMB8" role="3cpWs9">
                  <property role="TrG5h" value="ideaEnv" />
                  <node concept="3uibUv" id="2ky3Rs1tMB6" role="1tU5fm">
                    <ref role="3uigEE" to="79ha:HKKzfMjqRV" resolve="Environment" />
                  </node>
                  <node concept="2YIFZM" id="2ky3Rs1tMB9" role="33vP2m">
                    <ref role="37wK5l" to="cky9:6LlhC3WJZzD" resolve="getOrCreate" />
                    <ref role="1Pybhc" to="cky9:6rx4kZDk5Br" resolve="IdeaEnvironment" />
                    <node concept="2YIFZM" id="2ky3Rs1tMBa" role="37wK5m">
                      <ref role="37wK5l" to="79ha:6rx4kZDkZ7z" resolve="defaultConfig" />
                      <ref role="1Pybhc" to="79ha:6rx4kZDk5A9" resolve="EnvironmentConfig" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3cpWs6" id="2VDNdDce85b" role="3cqZAp">
                <node concept="2ShNRf" id="4_ksyPqPvY$" role="3cqZAk">
                  <node concept="1pGfFk" id="4_ksyPqPvY_" role="2ShVmc">
                    <ref role="37wK5l" node="6azle7m2XHD" resolve="TransformationTestRunner" />
                    <node concept="37vLTw" id="2ky3Rs1tMBb" role="37wK5m">
                      <ref role="3cqZAo" node="2ky3Rs1tMB8" resolve="ideaEnv" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="2VDNdDce70$" role="3clF45">
        <ref role="3uigEE" node="4_ksyPqMhZ7" resolve="TestRunner" />
      </node>
      <node concept="3Tm6S6" id="4_ksyPqPvYM" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="4_ksyPqPfW9" role="jymVt" />
    <node concept="3clFbW" id="3yZ0KeTxuOv" role="jymVt">
      <node concept="3cqZAl" id="3yZ0KeTxuOw" role="3clF45" />
      <node concept="3clFbS" id="3yZ0KeTxuOy" role="3clF47" />
      <node concept="3Tm1VV" id="3yZ0KeTxusK" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="3yZ0KeTxj3d" role="jymVt" />
    <node concept="3clFbW" id="2VDNdDce3vK" role="jymVt">
      <node concept="3cqZAl" id="2VDNdDce3vL" role="3clF45" />
      <node concept="3clFbS" id="2VDNdDce3vM" role="3clF47">
        <node concept="3clFbF" id="2VDNdDceaNq" role="3cqZAp">
          <node concept="1rXfSq" id="2VDNdDceaNo" role="3clFbG">
            <ref role="37wK5l" node="DRazW7Z8Gq" resolve="setTestRunner" />
            <node concept="37vLTw" id="2VDNdDceaWu" role="37wK5m">
              <ref role="3cqZAo" node="2VDNdDce6Sk" resolve="runner" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="2VDNdDce3vP" role="1B3o_S" />
      <node concept="37vLTG" id="2VDNdDce6Sk" role="3clF46">
        <property role="TrG5h" value="runner" />
        <node concept="3uibUv" id="2VDNdDce6Sj" role="1tU5fm">
          <ref role="3uigEE" node="4_ksyPqMhZ7" resolve="TestRunner" />
        </node>
        <node concept="2AHcQZ" id="2VDNdDce6WL" role="2AJF6D">
          <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="50N5GDnoD7C" role="jymVt" />
    <node concept="3clFbW" id="e$hNri8RD9" role="jymVt">
      <node concept="37vLTG" id="e$hNri8RDn" role="3clF46">
        <property role="TrG5h" value="project" />
        <node concept="3uibUv" id="e$hNri8RDo" role="1tU5fm">
          <ref role="3uigEE" to="z1c3:~Project" resolve="Project" />
        </node>
      </node>
      <node concept="3Tm1VV" id="e$hNri8RDb" role="1B3o_S" />
      <node concept="3cqZAl" id="e$hNri8RDa" role="3clF45" />
      <node concept="3clFbS" id="e$hNri8RDc" role="3clF47">
        <node concept="3clFbF" id="e$hNri8RDe" role="3cqZAp">
          <node concept="37vLTI" id="e$hNri8RDf" role="3clFbG">
            <node concept="37vLTw" id="2BHiRxgm8nW" role="37vLTx">
              <ref role="3cqZAo" node="e$hNri8RDn" resolve="project" />
            </node>
            <node concept="37vLTw" id="2BHiRxeunoS" role="37vLTJ">
              <ref role="3cqZAo" node="e$hNri9PeB" resolve="myProject" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="7P8zeXPIrdy" role="3cqZAp">
          <node concept="37vLTI" id="7P8zeXPIrdS" role="3clFbG">
            <node concept="37vLTw" id="2BHiRxeufOC" role="37vLTJ">
              <ref role="3cqZAo" node="e$hNri9Pex" resolve="myModel" />
            </node>
            <node concept="37vLTw" id="2BHiRxghbCm" role="37vLTx">
              <ref role="3cqZAo" node="e$hNri8RDp" resolve="modelDescriptor" />
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="e$hNri8RDp" role="3clF46">
        <property role="TrG5h" value="modelDescriptor" />
        <node concept="3uibUv" id="e$hNri8RDq" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SModel" resolve="SModel" />
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="DRazW7Z7EV" role="jymVt" />
    <node concept="3clFb_" id="DRazW7Z8Gq" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="setTestRunner" />
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <node concept="3clFbS" id="DRazW7Z8Gt" role="3clF47">
        <node concept="3clFbF" id="DRazW7ZaHa" role="3cqZAp">
          <node concept="37vLTI" id="DRazW7ZaIt" role="3clFbG">
            <node concept="37vLTw" id="DRazW7ZaJx" role="37vLTx">
              <ref role="3cqZAo" node="DRazW7ZadA" resolve="runner" />
            </node>
            <node concept="37vLTw" id="DRazW7ZaH9" role="37vLTJ">
              <ref role="3cqZAo" node="e$hNri8RBd" resolve="myRunner" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="DRazW7Z8mw" role="1B3o_S" />
      <node concept="3cqZAl" id="DRazW7Z8Gn" role="3clF45" />
      <node concept="37vLTG" id="DRazW7ZadA" role="3clF46">
        <property role="TrG5h" value="runner" />
        <node concept="3uibUv" id="DRazW80leL" role="1tU5fm">
          <ref role="3uigEE" node="4_ksyPqMhZ7" resolve="TestRunner" />
        </node>
      </node>
      <node concept="2AHcQZ" id="DRazW7ZaPN" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="2tJIrI" id="DRazW80hzc" role="jymVt" />
    <node concept="3clFb_" id="DRazW80irx" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getTestRunner" />
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <node concept="3clFbS" id="DRazW80ir$" role="3clF47">
        <node concept="3cpWs6" id="DRazW80kbk" role="3cqZAp">
          <node concept="37vLTw" id="DRazW80kry" role="3cqZAk">
            <ref role="3cqZAo" node="e$hNri8RBd" resolve="myRunner" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="DRazW80i5$" role="1B3o_S" />
      <node concept="3uibUv" id="DRazW80lrl" role="3clF45">
        <ref role="3uigEE" node="4_ksyPqMhZ7" resolve="TestRunner" />
      </node>
      <node concept="2AHcQZ" id="DRazW80jmC" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="2tJIrI" id="4_ksyPqPi8r" role="jymVt" />
    <node concept="3clFb_" id="e$hNri8RB$" role="jymVt">
      <property role="TrG5h" value="initTest" />
      <node concept="3clFbS" id="e$hNri8RBG" role="3clF47">
        <node concept="3clFbF" id="1_xw4QB0S1r" role="3cqZAp">
          <node concept="1rXfSq" id="4hiugqyz96E" role="3clFbG">
            <ref role="37wK5l" node="1_xw4QB0RG_" resolve="initTest" />
            <node concept="37vLTw" id="2BHiRxglpJm" role="37wK5m">
              <ref role="3cqZAo" node="e$hNri8RB_" resolve="projectName" />
            </node>
            <node concept="37vLTw" id="2BHiRxgm2um" role="37wK5m">
              <ref role="3cqZAo" node="e$hNri8RBC" resolve="model" />
            </node>
            <node concept="3clFbT" id="ThWTaQhHfz" role="37wK5m">
              <property role="3clFbU" value="false" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3cqZAl" id="e$hNri8RBE" role="3clF45" />
      <node concept="3Tm1VV" id="e$hNri8RBF" role="1B3o_S" />
      <node concept="37vLTG" id="e$hNri8RB_" role="3clF46">
        <property role="TrG5h" value="projectName" />
        <node concept="2AHcQZ" id="e$hNri8RBA" role="2AJF6D">
          <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
        </node>
        <node concept="17QB3L" id="e$hNri8RBB" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="e$hNri8RBC" role="3clF46">
        <property role="TrG5h" value="model" />
        <property role="3TUv4t" value="true" />
        <node concept="17QB3L" id="e$hNri8RBD" role="1tU5fm" />
      </node>
      <node concept="3uibUv" id="e$hNri8RBO" role="Sfmx6">
        <ref role="3uigEE" to="wyt6:~Exception" resolve="Exception" />
      </node>
    </node>
    <node concept="2tJIrI" id="6jL1eIc2cAZ" role="jymVt" />
    <node concept="3clFb_" id="1_xw4QB0RG_" role="jymVt">
      <property role="TrG5h" value="initTest" />
      <node concept="3uibUv" id="1_xw4QB0RGP" role="Sfmx6">
        <ref role="3uigEE" to="wyt6:~Exception" resolve="Exception" />
      </node>
      <node concept="3Tm1VV" id="1_xw4QB0RGG" role="1B3o_S" />
      <node concept="3clFbS" id="1_xw4QB0RGH" role="3clF47">
        <node concept="3clFbJ" id="2VDNdDcf22T" role="3cqZAp">
          <node concept="3clFbS" id="2VDNdDcf22V" role="3clFbx">
            <node concept="3clFbF" id="2VDNdDcf2KP" role="3cqZAp">
              <node concept="1rXfSq" id="2VDNdDcf2KN" role="3clFbG">
                <ref role="37wK5l" node="DRazW7Z8Gq" resolve="setTestRunner" />
                <node concept="1rXfSq" id="2VDNdDcf2Zz" role="37wK5m">
                  <ref role="37wK5l" node="2VDNdDcejoD" resolve="defaultTestRunner" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbC" id="2VDNdDcf2gG" role="3clFbw">
            <node concept="10Nm6u" id="2VDNdDcf2ns" role="3uHU7w" />
            <node concept="37vLTw" id="2VDNdDcf29H" role="3uHU7B">
              <ref role="3cqZAo" node="e$hNri8RBd" resolve="myRunner" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1_xw4QB0RGI" role="3cqZAp">
          <node concept="2OqwBi" id="1_xw4QB0RGJ" role="3clFbG">
            <node concept="liA8E" id="1_xw4QB0RGL" role="2OqNvi">
              <ref role="37wK5l" node="4_ksyPqMjK0" resolve="initTest" />
              <node concept="Xjq3P" id="1_xw4QB0RGM" role="37wK5m" />
              <node concept="37vLTw" id="2BHiRxgkYZB" role="37wK5m">
                <ref role="3cqZAo" node="1_xw4QB0RGA" resolve="projectName" />
              </node>
              <node concept="37vLTw" id="2BHiRxgm9Ax" role="37wK5m">
                <ref role="3cqZAo" node="1_xw4QB0RGD" resolve="model" />
              </node>
              <node concept="37vLTw" id="2BHiRxgmau6" role="37wK5m">
                <ref role="3cqZAo" node="ThWTaQhHf$" resolve="reOpenProject" />
              </node>
            </node>
            <node concept="37vLTw" id="2BHiRxeugcA" role="2Oq$k0">
              <ref role="3cqZAo" node="e$hNri8RBd" resolve="myRunner" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3cqZAl" id="1_xw4QB0RGF" role="3clF45" />
      <node concept="37vLTG" id="1_xw4QB0RGA" role="3clF46">
        <property role="TrG5h" value="projectName" />
        <node concept="17QB3L" id="1_xw4QB0RGC" role="1tU5fm" />
        <node concept="2AHcQZ" id="1_xw4QB0RGB" role="2AJF6D">
          <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
        </node>
      </node>
      <node concept="37vLTG" id="1_xw4QB0RGD" role="3clF46">
        <property role="TrG5h" value="model" />
        <property role="3TUv4t" value="true" />
        <node concept="17QB3L" id="1_xw4QB0RGE" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="ThWTaQhHf$" role="3clF46">
        <property role="TrG5h" value="reOpenProject" />
        <node concept="10P_77" id="ThWTaQhHfA" role="1tU5fm" />
      </node>
    </node>
    <node concept="2tJIrI" id="4_ksyPqPj3q" role="jymVt" />
    <node concept="3clFb_" id="e$hNri8RCI" role="jymVt">
      <property role="TrG5h" value="runTest" />
      <node concept="3uibUv" id="e$hNri8RD0" role="Sfmx6">
        <ref role="3uigEE" to="wyt6:~Throwable" resolve="Throwable" />
      </node>
      <node concept="3Tm1VV" id="e$hNri8RCK" role="1B3o_S" />
      <node concept="3clFbS" id="e$hNri8RCL" role="3clF47">
        <node concept="3clFbF" id="e$hNri8RCM" role="3cqZAp">
          <node concept="2OqwBi" id="e$hNri8RCN" role="3clFbG">
            <node concept="37vLTw" id="2BHiRxeunen" role="2Oq$k0">
              <ref role="3cqZAo" node="e$hNri8RBd" resolve="myRunner" />
            </node>
            <node concept="liA8E" id="e$hNri8RCP" role="2OqNvi">
              <ref role="37wK5l" node="4_ksyPqMVtv" resolve="runTest" />
              <node concept="Xjq3P" id="e$hNri8RCQ" role="37wK5m" />
              <node concept="37vLTw" id="2BHiRxgmE7V" role="37wK5m">
                <ref role="3cqZAo" node="e$hNri8RCU" resolve="className" />
              </node>
              <node concept="37vLTw" id="2BHiRxgltfx" role="37wK5m">
                <ref role="3cqZAo" node="e$hNri8RCW" resolve="methodName" />
              </node>
              <node concept="37vLTw" id="2BHiRxghgpB" role="37wK5m">
                <ref role="3cqZAo" node="e$hNri8RCY" resolve="runInCommand" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="e$hNri8RCU" role="3clF46">
        <property role="TrG5h" value="className" />
        <node concept="17QB3L" id="e$hNri8RCV" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="e$hNri8RCW" role="3clF46">
        <property role="TrG5h" value="methodName" />
        <property role="3TUv4t" value="true" />
        <node concept="17QB3L" id="e$hNri8RCX" role="1tU5fm" />
      </node>
      <node concept="3cqZAl" id="e$hNri8RCJ" role="3clF45" />
      <node concept="37vLTG" id="e$hNri8RCY" role="3clF46">
        <property role="TrG5h" value="runInCommand" />
        <property role="3TUv4t" value="true" />
        <node concept="10P_77" id="e$hNri8RCZ" role="1tU5fm" />
      </node>
    </node>
    <node concept="2tJIrI" id="51zp1jJqDqd" role="jymVt" />
    <node concept="3clFb_" id="7P8zeXPIrdk" role="jymVt">
      <property role="TrG5h" value="init" />
      <node concept="3Tm1VV" id="7P8zeXPIrdm" role="1B3o_S" />
      <node concept="3clFbS" id="7P8zeXPIrdn" role="3clF47">
        <node concept="3clFbF" id="7P8zeXPIoQs" role="3cqZAp">
          <node concept="37vLTI" id="7P8zeXPIoQt" role="3clFbG">
            <node concept="2OqwBi" id="6OQSQAx9mGE" role="37vLTx">
              <node concept="liA8E" id="6OQSQAx9nzG" role="2OqNvi">
                <ref role="37wK5l" to="tqvn:~TemporaryModels.create(boolean,jetbrains.mps.smodel.tempmodel.TempModuleOptions):org.jetbrains.mps.openapi.model.SModel" resolve="create" />
                <node concept="3clFbT" id="6OQSQAx9nLK" role="37wK5m">
                  <property role="3clFbU" value="false" />
                </node>
                <node concept="2YIFZM" id="6OQSQAx9Leq" role="37wK5m">
                  <ref role="37wK5l" to="tqvn:~TempModuleOptions.forDefaultModule():jetbrains.mps.smodel.tempmodel.TempModuleOptions" resolve="forDefaultModule" />
                  <ref role="1Pybhc" to="tqvn:~TempModuleOptions" resolve="TempModuleOptions" />
                </node>
              </node>
              <node concept="2YIFZM" id="6OQSQAx8ev2" role="2Oq$k0">
                <ref role="37wK5l" to="tqvn:~TemporaryModels.getInstance():jetbrains.mps.smodel.tempmodel.TemporaryModels" resolve="getInstance" />
                <ref role="1Pybhc" to="tqvn:~TemporaryModels" resolve="TemporaryModels" />
              </node>
            </node>
            <node concept="2OqwBi" id="7P8zeXPIoQu" role="37vLTJ">
              <node concept="2OwXpG" id="7P8zeXPIoQw" role="2OqNvi">
                <ref role="2Oxat5" node="e$hNri9Pe$" resolve="myTransientModel" />
              </node>
              <node concept="Xjq3P" id="7P8zeXPIoQv" role="2Oq$k0" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6cgtlBrHUhg" role="3cqZAp">
          <node concept="2OqwBi" id="6cgtlBrIDMf" role="3clFbG">
            <node concept="2ShNRf" id="6cgtlBrHUhc" role="2Oq$k0">
              <node concept="1pGfFk" id="6cgtlBrICKr" role="2ShVmc">
                <ref role="37wK5l" to="80j5:~CloneUtil.&lt;init&gt;(org.jetbrains.mps.openapi.model.SModel,org.jetbrains.mps.openapi.model.SModel)" resolve="CloneUtil" />
                <node concept="2OqwBi" id="6cgtlBrICNB" role="37wK5m">
                  <node concept="Xjq3P" id="6cgtlBrICKV" role="2Oq$k0" />
                  <node concept="2OwXpG" id="6cgtlBrID8i" role="2OqNvi">
                    <ref role="2Oxat5" node="e$hNri9Pex" resolve="myModel" />
                  </node>
                </node>
                <node concept="2OqwBi" id="6cgtlBrIDkk" role="37wK5m">
                  <node concept="Xjq3P" id="6cgtlBrIDgL" role="2Oq$k0" />
                  <node concept="2OwXpG" id="6cgtlBrIDDT" role="2OqNvi">
                    <ref role="2Oxat5" node="e$hNri9Pe$" resolve="myTransientModel" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="liA8E" id="6cgtlBrIEqj" role="2OqNvi">
              <ref role="37wK5l" to="80j5:~CloneUtil.cloneModelWithAllImports():void" resolve="cloneModelWithAllImports" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3cqZAl" id="7P8zeXPIrdl" role="3clF45" />
      <node concept="2AHcQZ" id="3tYsUK_SfVL" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="2tJIrI" id="4_ksyPqPjwW" role="jymVt" />
    <node concept="3clFb_" id="6OQSQAx9fp3" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="dispose" />
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <node concept="3clFbS" id="6OQSQAx9fp6" role="3clF47">
        <node concept="3clFbF" id="6OQSQAx9OI$" role="3cqZAp">
          <node concept="2OqwBi" id="6OQSQAx9P75" role="3clFbG">
            <node concept="liA8E" id="6OQSQAx9PXd" role="2OqNvi">
              <ref role="37wK5l" to="tqvn:~TemporaryModels.dispose(org.jetbrains.mps.openapi.model.SModel):void" resolve="dispose" />
              <node concept="37vLTw" id="6OQSQAx9Qa3" role="37wK5m">
                <ref role="3cqZAo" node="e$hNri9Pe$" resolve="myTransientModel" />
              </node>
            </node>
            <node concept="2YIFZM" id="6OQSQAx9OSE" role="2Oq$k0">
              <ref role="37wK5l" to="tqvn:~TemporaryModels.getInstance():jetbrains.mps.smodel.tempmodel.TemporaryModels" resolve="getInstance" />
              <ref role="1Pybhc" to="tqvn:~TemporaryModels" resolve="TemporaryModels" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6OQSQAx9Q$I" role="3cqZAp">
          <node concept="37vLTI" id="6OQSQAx9QPl" role="3clFbG">
            <node concept="10Nm6u" id="6OQSQAx9R3z" role="37vLTx" />
            <node concept="37vLTw" id="6OQSQAx9Q$H" role="37vLTJ">
              <ref role="3cqZAo" node="e$hNri9Pe$" resolve="myTransientModel" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6OQSQAx9eZh" role="1B3o_S" />
      <node concept="3cqZAl" id="6OQSQAx9fjF" role="3clF45" />
      <node concept="2AHcQZ" id="6OQSQAx9m7E" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="2tJIrI" id="5Nkzt7QuQAh" role="jymVt" />
    <node concept="3clFb_" id="e$hNri9PfO" role="jymVt">
      <property role="TrG5h" value="getModelDescriptor" />
      <node concept="3uibUv" id="e$hNri9PfP" role="3clF45">
        <ref role="3uigEE" to="mhbf:~SModel" resolve="SModel" />
      </node>
      <node concept="3clFbS" id="e$hNri9PfR" role="3clF47">
        <node concept="3clFbF" id="e$hNri9PfS" role="3cqZAp">
          <node concept="37vLTw" id="2BHiRxeudJk" role="3clFbG">
            <ref role="3cqZAo" node="e$hNri9Pex" resolve="myModel" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="e$hNri9PfQ" role="1B3o_S" />
      <node concept="2AHcQZ" id="3tYsUK_SfVK" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="3clFb_" id="7P8zeXPIiHi" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="setModelDescriptor" />
      <node concept="3clFbS" id="7P8zeXPIiHn" role="3clF47">
        <node concept="3clFbF" id="7P8zeXPIiHo" role="3cqZAp">
          <node concept="37vLTI" id="7P8zeXPIiHI" role="3clFbG">
            <node concept="37vLTw" id="2BHiRxeumtP" role="37vLTJ">
              <ref role="3cqZAo" node="e$hNri9Pex" resolve="myModel" />
            </node>
            <node concept="37vLTw" id="2BHiRxglt6h" role="37vLTx">
              <ref role="3cqZAo" node="7P8zeXPIiHj" resolve="descriptor" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="7P8zeXPIiHm" role="1B3o_S" />
      <node concept="3cqZAl" id="7P8zeXPIiHl" role="3clF45" />
      <node concept="37vLTG" id="7P8zeXPIiHj" role="3clF46">
        <property role="TrG5h" value="descriptor" />
        <node concept="3uibUv" id="7P8zeXPIiHk" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SModel" resolve="SModel" />
        </node>
      </node>
      <node concept="2AHcQZ" id="3tYsUK_SfVF" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="3clFb_" id="wQDhRCDPiv" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="setTransientModelDescriptor" />
      <node concept="3clFbS" id="wQDhRCDPiw" role="3clF47">
        <node concept="3clFbF" id="wQDhRCDPix" role="3cqZAp">
          <node concept="37vLTI" id="wQDhRCDPiy" role="3clFbG">
            <node concept="37vLTw" id="wQDhRCDQE$" role="37vLTJ">
              <ref role="3cqZAo" node="e$hNri9Pe$" resolve="myTransientModel" />
            </node>
            <node concept="37vLTw" id="wQDhRCDPi$" role="37vLTx">
              <ref role="3cqZAo" node="wQDhRCDPiB" resolve="descriptor" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="wQDhRCDPi_" role="1B3o_S" />
      <node concept="3cqZAl" id="wQDhRCDPiA" role="3clF45" />
      <node concept="37vLTG" id="wQDhRCDPiB" role="3clF46">
        <property role="TrG5h" value="descriptor" />
        <node concept="3uibUv" id="wQDhRCDPiC" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SModel" resolve="SModel" />
        </node>
      </node>
      <node concept="2AHcQZ" id="wQDhRCDPiD" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="3clFb_" id="e$hNri9PfU" role="jymVt">
      <property role="TrG5h" value="getTransientModelDescriptor" />
      <node concept="3clFbS" id="e$hNri9PfX" role="3clF47">
        <node concept="3clFbF" id="e$hNri9PfY" role="3cqZAp">
          <node concept="37vLTw" id="2BHiRxeuzDs" role="3clFbG">
            <ref role="3cqZAo" node="e$hNri9Pe$" resolve="myTransientModel" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="e$hNri9PfW" role="1B3o_S" />
      <node concept="3uibUv" id="e$hNri9PfV" role="3clF45">
        <ref role="3uigEE" to="mhbf:~SModel" resolve="SModel" />
      </node>
      <node concept="2AHcQZ" id="3tYsUK_SfVJ" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="3clFb_" id="e$hNri9Pga" role="jymVt">
      <property role="TrG5h" value="getProject" />
      <node concept="3clFbS" id="e$hNri9Pgd" role="3clF47">
        <node concept="3clFbF" id="e$hNri9Pge" role="3cqZAp">
          <node concept="37vLTw" id="2BHiRxeuoOV" role="3clFbG">
            <ref role="3cqZAo" node="e$hNri9PeB" resolve="myProject" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="e$hNri9Pgc" role="1B3o_S" />
      <node concept="3uibUv" id="e$hNri9Pgb" role="3clF45">
        <ref role="3uigEE" to="z1c3:~Project" resolve="Project" />
      </node>
      <node concept="2AHcQZ" id="3tYsUK_SfVE" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="3clFb_" id="e$hNri9Pgg" role="jymVt">
      <property role="TrG5h" value="setProject" />
      <node concept="37vLTG" id="e$hNri9Pgo" role="3clF46">
        <property role="TrG5h" value="project" />
        <node concept="3uibUv" id="e$hNri9Pgp" role="1tU5fm">
          <ref role="3uigEE" to="z1c3:~Project" resolve="Project" />
        </node>
      </node>
      <node concept="3cqZAl" id="e$hNri9Pgh" role="3clF45" />
      <node concept="3Tm1VV" id="e$hNri9Pgi" role="1B3o_S" />
      <node concept="3clFbS" id="e$hNri9Pgj" role="3clF47">
        <node concept="3clFbF" id="e$hNri9Pgk" role="3cqZAp">
          <node concept="37vLTI" id="e$hNri9Pgl" role="3clFbG">
            <node concept="37vLTw" id="2BHiRxgm91M" role="37vLTx">
              <ref role="3cqZAo" node="e$hNri9Pgo" resolve="project" />
            </node>
            <node concept="37vLTw" id="2BHiRxeuKml" role="37vLTJ">
              <ref role="3cqZAo" node="e$hNri9PeB" resolve="myProject" />
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3tYsUK_SfVI" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="3Tm1VV" id="e$hNri8RD1" role="1B3o_S" />
    <node concept="3uibUv" id="e$hNri9cbG" role="EKbjA">
      <ref role="3uigEE" node="e$hNri9cbt" resolve="TransformationTest" />
    </node>
  </node>
  <node concept="312cEu" id="18jf_F1WDsS">
    <property role="TrG5h" value="NodeCheckerUtil" />
    <property role="3GE5qa" value="util" />
    <node concept="2tJIrI" id="18jf_F1WDtK" role="jymVt" />
    <node concept="2YIFZL" id="18jf_F1WDtL" role="jymVt">
      <property role="TrG5h" value="nodeWithIdToString" />
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <node concept="3clFbS" id="18jf_F1WDtM" role="3clF47">
        <node concept="3cpWs6" id="18jf_F1WDtN" role="3cqZAp">
          <node concept="3cpWs3" id="18jf_F1WDtO" role="3cqZAk">
            <node concept="3cpWs3" id="18jf_F1WDtP" role="3uHU7B">
              <node concept="3cpWs3" id="18jf_F1WDtQ" role="3uHU7B">
                <node concept="37vLTw" id="18jf_F1WDtR" role="3uHU7B">
                  <ref role="3cqZAo" node="18jf_F1WDu0" resolve="node" />
                </node>
                <node concept="Xl_RD" id="18jf_F1WDtS" role="3uHU7w">
                  <property role="Xl_RC" value=" [" />
                </node>
              </node>
              <node concept="2OqwBi" id="18jf_F1WDtT" role="3uHU7w">
                <node concept="2JrnkZ" id="18jf_F1WDtU" role="2Oq$k0">
                  <node concept="37vLTw" id="18jf_F1WDtV" role="2JrQYb">
                    <ref role="3cqZAo" node="18jf_F1WDu0" resolve="node" />
                  </node>
                </node>
                <node concept="liA8E" id="18jf_F1WDtW" role="2OqNvi">
                  <ref role="37wK5l" to="mhbf:~SNode.getNodeId():org.jetbrains.mps.openapi.model.SNodeId" resolve="getNodeId" />
                </node>
              </node>
            </node>
            <node concept="Xl_RD" id="18jf_F1WDtX" role="3uHU7w">
              <property role="Xl_RC" value="]" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="18jf_F1WDtY" role="1B3o_S" />
      <node concept="17QB3L" id="18jf_F1WDtZ" role="3clF45" />
      <node concept="37vLTG" id="18jf_F1WDu0" role="3clF46">
        <property role="TrG5h" value="node" />
        <property role="3TUv4t" value="true" />
        <node concept="3Tqbb2" id="18jf_F1WDu1" role="1tU5fm" />
      </node>
    </node>
    <node concept="2tJIrI" id="18jf_F1WDu2" role="jymVt" />
    <node concept="2YIFZL" id="18jf_F1WDu3" role="jymVt">
      <property role="TrG5h" value="assertTypesAreTheSame" />
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <node concept="3clFbS" id="18jf_F1WDu4" role="3clF47">
        <node concept="3cpWs8" id="6W6OD37ZE3W" role="3cqZAp">
          <node concept="3cpWsn" id="6W6OD37ZE3X" role="3cpWs9">
            <property role="TrG5h" value="errorString" />
            <node concept="17QB3L" id="6W6OD37ZE3R" role="1tU5fm" />
            <node concept="3cpWs3" id="6W6OD37ZE3Y" role="33vP2m">
              <node concept="Xl_RD" id="6W6OD37ZE3Z" role="3uHU7w">
                <property role="Xl_RC" value="'!" />
              </node>
              <node concept="3cpWs3" id="6W6OD37ZE40" role="3uHU7B">
                <node concept="3cpWs3" id="6W6OD37ZE41" role="3uHU7B">
                  <node concept="3cpWs3" id="6W6OD37ZE42" role="3uHU7B">
                    <node concept="Xl_RD" id="6W6OD37ZE43" role="3uHU7B">
                      <property role="Xl_RC" value="node '" />
                    </node>
                    <node concept="1rXfSq" id="6W6OD37ZE44" role="3uHU7w">
                      <ref role="37wK5l" node="18jf_F1WDtL" resolve="nodeWithIdToString" />
                      <node concept="37vLTw" id="6W6OD37ZE45" role="37wK5m">
                        <ref role="3cqZAo" node="18jf_F1WDun" resolve="node" />
                      </node>
                    </node>
                  </node>
                  <node concept="Xl_RD" id="6W6OD37ZE46" role="3uHU7w">
                    <property role="Xl_RC" value="' does not have type '" />
                  </node>
                </node>
                <node concept="1rXfSq" id="6W6OD37ZE47" role="3uHU7w">
                  <ref role="37wK5l" node="18jf_F1WDtL" resolve="nodeWithIdToString" />
                  <node concept="37vLTw" id="6W6OD37ZE48" role="37wK5m">
                    <ref role="3cqZAo" node="18jf_F1WDur" resolve="type2" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3ykFI1" id="18jf_F1WDu5" role="3cqZAp">
          <node concept="2YIFZM" id="18jf_F1WDu6" role="3ykU8v">
            <ref role="37wK5l" to="y5e1:7MIYyntE09E" resolve="matchNodes" />
            <ref role="1Pybhc" to="y5e1:7MIYyntE09$" resolve="NodesMatcher" />
            <node concept="37vLTw" id="18jf_F1WDu7" role="37wK5m">
              <ref role="3cqZAo" node="18jf_F1WDup" resolve="type1" />
            </node>
            <node concept="37vLTw" id="18jf_F1WDu8" role="37wK5m">
              <ref role="3cqZAo" node="18jf_F1WDur" resolve="type2" />
            </node>
          </node>
          <node concept="3_1$Yv" id="18jf_F1WDu9" role="3_9lra">
            <node concept="37vLTw" id="6W6OD37ZE49" role="3_1BAH">
              <ref role="3cqZAo" node="6W6OD37ZE3X" resolve="errorString" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="18jf_F1WDul" role="1B3o_S" />
      <node concept="3cqZAl" id="18jf_F1WDum" role="3clF45" />
      <node concept="37vLTG" id="18jf_F1WDun" role="3clF46">
        <property role="TrG5h" value="node" />
        <node concept="3Tqbb2" id="18jf_F1WDuo" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="18jf_F1WDup" role="3clF46">
        <property role="TrG5h" value="type1" />
        <property role="3TUv4t" value="true" />
        <node concept="3Tqbb2" id="18jf_F1WDuq" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="18jf_F1WDur" role="3clF46">
        <property role="TrG5h" value="type2" />
        <property role="3TUv4t" value="true" />
        <node concept="3Tqbb2" id="18jf_F1WDus" role="1tU5fm" />
      </node>
    </node>
    <node concept="2tJIrI" id="18jf_F1WDw0" role="jymVt" />
    <node concept="2YIFZL" id="18jf_F1WDw1" role="jymVt">
      <property role="TrG5h" value="getRuleNodeFromReporter" />
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <node concept="3clFbS" id="18jf_F1WDw2" role="3clF47">
        <node concept="3cpWs8" id="18jf_F1WDw3" role="3cqZAp">
          <node concept="3cpWsn" id="18jf_F1WDw4" role="3cpWs9">
            <property role="TrG5h" value="ref" />
            <node concept="3uibUv" id="18jf_F1WDw5" role="1tU5fm">
              <ref role="3uigEE" to="w1kc:~SNodePointer" resolve="SNodePointer" />
            </node>
            <node concept="2ShNRf" id="18jf_F1WDw6" role="33vP2m">
              <node concept="1pGfFk" id="18jf_F1WDw7" role="2ShVmc">
                <ref role="37wK5l" to="w1kc:~SNodePointer.&lt;init&gt;(java.lang.String,java.lang.String)" resolve="SNodePointer" />
                <node concept="2OqwBi" id="18jf_F1WDw8" role="37wK5m">
                  <node concept="37vLTw" id="18jf_F1WDw9" role="2Oq$k0">
                    <ref role="3cqZAo" node="18jf_F1WDwl" resolve="reporter" />
                  </node>
                  <node concept="liA8E" id="18jf_F1WDwa" role="2OqNvi">
                    <ref role="37wK5l" to="2gg1:~IErrorReporter.getRuleModel():java.lang.String" resolve="getRuleModel" />
                  </node>
                </node>
                <node concept="2OqwBi" id="18jf_F1WDwb" role="37wK5m">
                  <node concept="37vLTw" id="18jf_F1WDwc" role="2Oq$k0">
                    <ref role="3cqZAo" node="18jf_F1WDwl" resolve="reporter" />
                  </node>
                  <node concept="liA8E" id="18jf_F1WDwd" role="2OqNvi">
                    <ref role="37wK5l" to="2gg1:~IErrorReporter.getRuleId():java.lang.String" resolve="getRuleId" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="18jf_F1WDwe" role="3cqZAp">
          <node concept="2OqwBi" id="18jf_F1WDwg" role="3clFbG">
            <node concept="37vLTw" id="18jf_F1WDwh" role="2Oq$k0">
              <ref role="3cqZAo" node="18jf_F1WDw4" resolve="ref" />
            </node>
            <node concept="liA8E" id="18jf_F1WDwi" role="2OqNvi">
              <ref role="37wK5l" to="w1kc:~SNodePointer.resolve(org.jetbrains.mps.openapi.module.SRepository):org.jetbrains.mps.openapi.model.SNode" resolve="resolve" />
              <node concept="2YIFZM" id="18jf_F1WDwj" role="37wK5m">
                <ref role="37wK5l" to="w1kc:~MPSModuleRepository.getInstance():jetbrains.mps.smodel.MPSModuleRepository" resolve="getInstance" />
                <ref role="1Pybhc" to="w1kc:~MPSModuleRepository" resolve="MPSModuleRepository" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="18jf_F1WDwk" role="1B3o_S" />
      <node concept="37vLTG" id="18jf_F1WDwl" role="3clF46">
        <property role="TrG5h" value="reporter" />
        <node concept="3uibUv" id="18jf_F1WDwm" role="1tU5fm">
          <ref role="3uigEE" to="2gg1:~IErrorReporter" resolve="IErrorReporter" />
        </node>
      </node>
      <node concept="3Tqbb2" id="18jf_F1WDwn" role="3clF45">
        <ref role="ehGHo" to="tpck:gw2VY9q" resolve="BaseConcept" />
      </node>
    </node>
    <node concept="2tJIrI" id="7q8Fd7cq4fr" role="jymVt" />
    <node concept="2YIFZL" id="7q8Fd7cpYEQ" role="jymVt">
      <property role="TrG5h" value="checkNodeForErrorMessages" />
      <node concept="3cqZAl" id="7q8Fd7cpYER" role="3clF45" />
      <node concept="3Tm1VV" id="7q8Fd7cpYES" role="1B3o_S" />
      <node concept="3clFbS" id="7q8Fd7cpYET" role="3clF47">
        <node concept="3cpWs8" id="7q8Fd7cpYEU" role="3cqZAp">
          <node concept="3cpWsn" id="7q8Fd7cpYEV" role="3cpWs9">
            <property role="TrG5h" value="checkErrorsAction" />
            <node concept="3uibUv" id="6MWlVHU4MDe" role="1tU5fm">
              <ref role="3uigEE" to="wyt6:~Runnable" resolve="Runnable" />
            </node>
            <node concept="2ShNRf" id="7q8Fd7cpYEX" role="33vP2m">
              <node concept="1pGfFk" id="7q8Fd7cpYEY" role="2ShVmc">
                <ref role="37wK5l" node="6MWlVHU2Nwl" resolve="CheckErrorMessagesAction" />
                <node concept="37vLTw" id="7q8Fd7cpYEZ" role="37wK5m">
                  <ref role="3cqZAo" node="7q8Fd7cpYF6" resolve="node" />
                </node>
                <node concept="37vLTw" id="7q8Fd7cpYF0" role="37wK5m">
                  <ref role="3cqZAo" node="7q8Fd7cpYFa" resolve="allowWarnings" />
                </node>
                <node concept="37vLTw" id="7q8Fd7cpYF1" role="37wK5m">
                  <ref role="3cqZAo" node="7q8Fd7cpYF8" resolve="allowErrors" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6MWlVHU4Oba" role="3cqZAp">
          <node concept="2OqwBi" id="6MWlVHU4Ocu" role="3clFbG">
            <node concept="37vLTw" id="6MWlVHU4Ob9" role="2Oq$k0">
              <ref role="3cqZAo" node="7q8Fd7cpYEV" resolve="checkErrorsAction" />
            </node>
            <node concept="liA8E" id="6MWlVHU4Oju" role="2OqNvi">
              <ref role="37wK5l" to="wyt6:~Runnable.run():void" resolve="run" />
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="7q8Fd7cpYF6" role="3clF46">
        <property role="TrG5h" value="node" />
        <property role="3TUv4t" value="true" />
        <node concept="3Tqbb2" id="7q8Fd7cpYF7" role="1tU5fm">
          <ref role="ehGHo" to="tpck:gw2VY9q" resolve="BaseConcept" />
        </node>
      </node>
      <node concept="37vLTG" id="7q8Fd7cpYF8" role="3clF46">
        <property role="TrG5h" value="allowErrors" />
        <property role="3TUv4t" value="true" />
        <node concept="10P_77" id="7q8Fd7cpYF9" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="7q8Fd7cpYFa" role="3clF46">
        <property role="TrG5h" value="allowWarnings" />
        <property role="3TUv4t" value="true" />
        <node concept="10P_77" id="7q8Fd7cpYFb" role="1tU5fm" />
      </node>
    </node>
    <node concept="2tJIrI" id="18jf_F1WDyW" role="jymVt" />
    <node concept="3Tm1VV" id="18jf_F1WDyX" role="1B3o_S" />
  </node>
  <node concept="312cEu" id="6MWlVHU2Nwa">
    <property role="TrG5h" value="CheckErrorMessagesAction" />
    <property role="3GE5qa" value="util" />
    <node concept="312cEg" id="6MWlVHU2Nwb" role="jymVt">
      <property role="34CwA1" value="false" />
      <property role="eg7rD" value="false" />
      <property role="TrG5h" value="node" />
      <property role="3TUv4t" value="false" />
      <node concept="3Tm6S6" id="6MWlVHU2Nwc" role="1B3o_S" />
      <node concept="3Tqbb2" id="6MWlVHU2Nwd" role="1tU5fm">
        <ref role="ehGHo" to="tpck:gw2VY9q" resolve="BaseConcept" />
      </node>
    </node>
    <node concept="312cEg" id="6MWlVHU2Nwe" role="jymVt">
      <property role="34CwA1" value="false" />
      <property role="eg7rD" value="false" />
      <property role="TrG5h" value="allowsWarnings" />
      <property role="3TUv4t" value="false" />
      <node concept="3Tm6S6" id="6MWlVHU2Nwf" role="1B3o_S" />
      <node concept="10P_77" id="6MWlVHU2Nwg" role="1tU5fm" />
    </node>
    <node concept="312cEg" id="6MWlVHU2Nwh" role="jymVt">
      <property role="34CwA1" value="false" />
      <property role="eg7rD" value="false" />
      <property role="TrG5h" value="allowsErrors" />
      <property role="3TUv4t" value="false" />
      <node concept="3Tm6S6" id="6MWlVHU2Nwi" role="1B3o_S" />
      <node concept="10P_77" id="6MWlVHU2Nwj" role="1tU5fm" />
    </node>
    <node concept="2tJIrI" id="6MWlVHU2Nwk" role="jymVt" />
    <node concept="3clFbW" id="6MWlVHU2Nwl" role="jymVt">
      <node concept="3cqZAl" id="6MWlVHU2Nwm" role="3clF45" />
      <node concept="3clFbS" id="6MWlVHU2Nwn" role="3clF47">
        <node concept="3clFbF" id="6MWlVHU2Nwo" role="3cqZAp">
          <node concept="37vLTI" id="6MWlVHU2Nwp" role="3clFbG">
            <node concept="37vLTw" id="6MWlVHU2Nwq" role="37vLTx">
              <ref role="3cqZAo" node="6MWlVHU2NwF" resolve="node" />
            </node>
            <node concept="2OqwBi" id="6MWlVHU2Nwr" role="37vLTJ">
              <node concept="Xjq3P" id="6MWlVHU2Nws" role="2Oq$k0" />
              <node concept="2OwXpG" id="6MWlVHU2Nwt" role="2OqNvi">
                <ref role="2Oxat5" node="6MWlVHU2Nwb" resolve="node" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6MWlVHU2Nwu" role="3cqZAp">
          <node concept="37vLTI" id="6MWlVHU2Nwv" role="3clFbG">
            <node concept="37vLTw" id="6MWlVHU2Nww" role="37vLTx">
              <ref role="3cqZAo" node="6MWlVHU2NwH" resolve="allowsWarnings" />
            </node>
            <node concept="2OqwBi" id="6MWlVHU2Nwx" role="37vLTJ">
              <node concept="Xjq3P" id="6MWlVHU2Nwy" role="2Oq$k0" />
              <node concept="2OwXpG" id="6MWlVHU2Nwz" role="2OqNvi">
                <ref role="2Oxat5" node="6MWlVHU2Nwe" resolve="allowsWarnings" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6MWlVHU2Nw$" role="3cqZAp">
          <node concept="37vLTI" id="6MWlVHU2Nw_" role="3clFbG">
            <node concept="37vLTw" id="6MWlVHU2NwA" role="37vLTx">
              <ref role="3cqZAo" node="6MWlVHU2NwJ" resolve="allowsErrors" />
            </node>
            <node concept="2OqwBi" id="6MWlVHU2NwB" role="37vLTJ">
              <node concept="Xjq3P" id="6MWlVHU2NwC" role="2Oq$k0" />
              <node concept="2OwXpG" id="6MWlVHU2NwD" role="2OqNvi">
                <ref role="2Oxat5" node="6MWlVHU2Nwh" resolve="allowsErrors" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6MWlVHU2NwE" role="1B3o_S" />
      <node concept="37vLTG" id="6MWlVHU2NwF" role="3clF46">
        <property role="TrG5h" value="node" />
        <node concept="3Tqbb2" id="6MWlVHU2NwG" role="1tU5fm">
          <ref role="ehGHo" to="tpck:gw2VY9q" resolve="BaseConcept" />
        </node>
      </node>
      <node concept="37vLTG" id="6MWlVHU2NwH" role="3clF46">
        <property role="TrG5h" value="allowsWarnings" />
        <node concept="10P_77" id="6MWlVHU2NwI" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="6MWlVHU2NwJ" role="3clF46">
        <property role="TrG5h" value="allowsErrors" />
        <node concept="10P_77" id="6MWlVHU2NwK" role="1tU5fm" />
      </node>
    </node>
    <node concept="2tJIrI" id="6MWlVHU2NwL" role="jymVt" />
    <node concept="3clFb_" id="6MWlVHU2NwM" role="jymVt">
      <property role="IEkAT" value="false" />
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="run" />
      <property role="DiZV1" value="false" />
      <node concept="3Tm1VV" id="6MWlVHU2NwN" role="1B3o_S" />
      <node concept="3cqZAl" id="6MWlVHU2NwO" role="3clF45" />
      <node concept="3clFbS" id="6MWlVHU2NwR" role="3clF47">
        <node concept="3cpWs8" id="6MWlVHU2Nx9" role="3cqZAp">
          <node concept="3cpWsn" id="6MWlVHU2Nxa" role="3cpWs9">
            <property role="TrG5h" value="checker" />
            <node concept="3uibUv" id="1sQrDa2DbdQ" role="1tU5fm">
              <ref role="3uigEE" node="3fCX6WCBvHP" resolve="TestsErrorsChecker" />
            </node>
            <node concept="2ShNRf" id="6MWlVHU2Nxc" role="33vP2m">
              <node concept="1pGfFk" id="4EqzFphzXdp" role="2ShVmc">
                <ref role="37wK5l" node="3fCX6WCBvHU" resolve="TestsErrorsChecker" />
                <node concept="2OqwBi" id="4EqzFphzXfH" role="37wK5m">
                  <node concept="37vLTw" id="4EqzFphzXeg" role="2Oq$k0">
                    <ref role="3cqZAo" node="6MWlVHU2Nwb" resolve="node" />
                  </node>
                  <node concept="2Rxl7S" id="4EqzFphzXsa" role="2OqNvi" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="4qBxKS6UZJ_" role="3cqZAp">
          <node concept="3cpWsn" id="4qBxKS6UZJA" role="3cpWs9">
            <property role="TrG5h" value="descendants" />
            <node concept="2I9FWS" id="4qBxKS6UZJz" role="1tU5fm">
              <ref role="2I9WkF" to="tpck:gw2VY9q" resolve="BaseConcept" />
            </node>
            <node concept="2OqwBi" id="4qBxKS6UZJB" role="33vP2m">
              <node concept="37vLTw" id="4qBxKS6UZJC" role="2Oq$k0">
                <ref role="3cqZAo" node="6MWlVHU2Nwb" resolve="node" />
              </node>
              <node concept="2Rf3mk" id="4qBxKS6UZJD" role="2OqNvi">
                <node concept="1xMEDy" id="4qBxKS6UZJE" role="1xVPHs">
                  <node concept="chp4Y" id="4qBxKS6UZJF" role="ri$Ld">
                    <ref role="cht4Q" to="tpck:gw2VY9q" resolve="BaseConcept" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="6MWlVHU2Nxf" role="3cqZAp">
          <node concept="3cpWsn" id="6MWlVHU2Nxg" role="3cpWs9">
            <property role="3TUv4t" value="true" />
            <property role="TrG5h" value="reporters" />
            <node concept="A3Dl8" id="16WnrUwxnLm" role="1tU5fm">
              <node concept="3uibUv" id="16WnrUwxnLo" role="A3Ik2">
                <ref role="3uigEE" to="2gg1:~IErrorReporter" resolve="IErrorReporter" />
              </node>
            </node>
            <node concept="2OqwBi" id="6MWlVHU2Nxj" role="33vP2m">
              <node concept="37vLTw" id="6MWlVHU2Nxk" role="2Oq$k0">
                <ref role="3cqZAo" node="6MWlVHU2Nxa" resolve="checker" />
              </node>
              <node concept="liA8E" id="6MWlVHU2Nxl" role="2OqNvi">
                <ref role="37wK5l" node="4qBxKS6Uyw5" resolve="getAllErrors" />
              </node>
            </node>
          </node>
        </node>
        <node concept="1DcWWT" id="6MWlVHU2Nxm" role="3cqZAp">
          <node concept="3clFbS" id="6MWlVHU2Nxn" role="2LFqv$">
            <node concept="3cpWs8" id="4qBxKS6V2Dk" role="3cqZAp">
              <node concept="3cpWsn" id="4qBxKS6V2Dn" role="3cpWs9">
                <property role="TrG5h" value="child" />
                <node concept="3Tqbb2" id="4qBxKS6V2Di" role="1tU5fm" />
                <node concept="2OqwBi" id="4qBxKS6V2Js" role="33vP2m">
                  <node concept="37vLTw" id="4qBxKS6V2I$" role="2Oq$k0">
                    <ref role="3cqZAo" node="6MWlVHU2NxA" resolve="reporter" />
                  </node>
                  <node concept="liA8E" id="4qBxKS6V2Pg" role="2OqNvi">
                    <ref role="37wK5l" to="2gg1:~IErrorReporter.getSNode():org.jetbrains.mps.openapi.model.SNode" resolve="getSNode" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="1gVbGN" id="4qBxKS6V2Vt" role="3cqZAp">
              <node concept="3y3z36" id="4qBxKS6V32f" role="1gVkn0">
                <node concept="10Nm6u" id="4qBxKS6V32Q" role="3uHU7w" />
                <node concept="37vLTw" id="4qBxKS6V30x" role="3uHU7B">
                  <ref role="3cqZAo" node="4qBxKS6V2Dn" resolve="child" />
                </node>
              </node>
            </node>
            <node concept="3clFbJ" id="4qBxKS6V38V" role="3cqZAp">
              <node concept="3clFbS" id="4qBxKS6V38Y" role="3clFbx">
                <node concept="3N13vt" id="4qBxKS6V6et" role="3cqZAp" />
              </node>
              <node concept="3fqX7Q" id="4qBxKS6V6cp" role="3clFbw">
                <node concept="2OqwBi" id="4qBxKS6V6cr" role="3fr31v">
                  <node concept="37vLTw" id="4qBxKS6V6cs" role="2Oq$k0">
                    <ref role="3cqZAo" node="4qBxKS6UZJA" resolve="descendants" />
                  </node>
                  <node concept="3JPx81" id="4qBxKS6V6ct" role="2OqNvi">
                    <node concept="37vLTw" id="4qBxKS6V6cu" role="25WWJ7">
                      <ref role="3cqZAo" node="4qBxKS6V2Dn" resolve="child" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbJ" id="4qBxKS6V6ly" role="3cqZAp">
              <node concept="3clFbS" id="4qBxKS6V6l_" role="3clFbx">
                <node concept="3N13vt" id="4qBxKS6V6v7" role="3cqZAp" />
              </node>
              <node concept="1rXfSq" id="4qBxKS6V6sS" role="3clFbw">
                <ref role="37wK5l" node="6MWlVHU2NxJ" resolve="hasErrorOrWarningCheckOperationTag" />
                <node concept="37vLTw" id="4qBxKS6V6uc" role="37wK5m">
                  <ref role="3cqZAo" node="4qBxKS6V2Dn" resolve="child" />
                </node>
              </node>
            </node>
            <node concept="3cpWs8" id="6MWlVHU2Nxo" role="3cqZAp">
              <node concept="3cpWsn" id="6MWlVHU2Nxp" role="3cpWs9">
                <property role="TrG5h" value="messageString" />
                <property role="3TUv4t" value="true" />
                <node concept="17QB3L" id="6MWlVHU2Nxq" role="1tU5fm" />
                <node concept="1rXfSq" id="6MWlVHU2Nxr" role="33vP2m">
                  <ref role="37wK5l" node="6MWlVHU2Nz2" resolve="getErrorString" />
                  <node concept="37vLTw" id="6MWlVHU2Nxs" role="37wK5m">
                    <ref role="3cqZAo" node="6MWlVHU2NxA" resolve="reporter" />
                  </node>
                  <node concept="37vLTw" id="4qBxKS6V6XS" role="37wK5m">
                    <ref role="3cqZAo" node="4qBxKS6V2Dn" resolve="child" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbF" id="6MWlVHU2Nxu" role="3cqZAp">
              <node concept="1rXfSq" id="6MWlVHU2Nxv" role="3clFbG">
                <ref role="37wK5l" node="6MWlVHU2Nyo" resolve="checkWarnings" />
                <node concept="37vLTw" id="6MWlVHU2Nxw" role="37wK5m">
                  <ref role="3cqZAo" node="6MWlVHU2NxA" resolve="reporter" />
                </node>
                <node concept="37vLTw" id="6MWlVHU2Nxx" role="37wK5m">
                  <ref role="3cqZAo" node="6MWlVHU2Nxp" resolve="messageString" />
                </node>
              </node>
            </node>
            <node concept="3clFbF" id="6MWlVHU2Nxy" role="3cqZAp">
              <node concept="1rXfSq" id="6MWlVHU2Nxz" role="3clFbG">
                <ref role="37wK5l" node="6MWlVHU2NyH" resolve="checkErrors" />
                <node concept="37vLTw" id="6MWlVHU2Nx$" role="37wK5m">
                  <ref role="3cqZAo" node="6MWlVHU2NxA" resolve="reporter" />
                </node>
                <node concept="37vLTw" id="6MWlVHU2Nx_" role="37wK5m">
                  <ref role="3cqZAo" node="6MWlVHU2Nxp" resolve="messageString" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3cpWsn" id="6MWlVHU2NxA" role="1Duv9x">
            <property role="TrG5h" value="reporter" />
            <node concept="3uibUv" id="6MWlVHU2NxB" role="1tU5fm">
              <ref role="3uigEE" to="2gg1:~IErrorReporter" resolve="IErrorReporter" />
            </node>
          </node>
          <node concept="37vLTw" id="6MWlVHU2NxC" role="1DdaDG">
            <ref role="3cqZAo" node="6MWlVHU2Nxg" resolve="reporters" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="6MWlVHU2NxH" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="2tJIrI" id="6MWlVHU2NxI" role="jymVt" />
    <node concept="2YIFZL" id="6MWlVHU2NxJ" role="jymVt">
      <property role="TrG5h" value="hasErrorOrWarningCheckOperationTag" />
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <node concept="3clFbS" id="6MWlVHU2NxK" role="3clF47">
        <node concept="3clFbJ" id="6MWlVHU2NxL" role="3cqZAp">
          <node concept="3clFbS" id="6MWlVHU2NxM" role="3clFbx">
            <node concept="3cpWs6" id="6MWlVHU2NxN" role="3cqZAp">
              <node concept="3clFbT" id="6MWlVHU2NxO" role="3cqZAk">
                <property role="3clFbU" value="false" />
              </node>
            </node>
          </node>
          <node concept="3clFbC" id="6MWlVHU2NxP" role="3clFbw">
            <node concept="10Nm6u" id="6MWlVHU2NxQ" role="3uHU7w" />
            <node concept="2OqwBi" id="6MWlVHU2NxR" role="3uHU7B">
              <node concept="37vLTw" id="6MWlVHU2NxS" role="2Oq$k0">
                <ref role="3cqZAo" node="6MWlVHU2Nyl" resolve="node" />
              </node>
              <node concept="3CFZ6_" id="6MWlVHU2NxT" role="2OqNvi">
                <node concept="3CFYIy" id="6MWlVHU2NxU" role="3CFYIz">
                  <ref role="3CFYIx" to="tp5g:hG7CXiP" resolve="NodeOperationsContainer" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="6MWlVHU2NxV" role="3cqZAp">
          <node concept="3cpWsn" id="6MWlVHU2NxW" role="3cpWs9">
            <property role="TrG5h" value="container" />
            <node concept="3Tqbb2" id="6MWlVHU2NxX" role="1tU5fm">
              <ref role="ehGHo" to="tp5g:hG7CXiP" resolve="NodeOperationsContainer" />
            </node>
            <node concept="2OqwBi" id="6MWlVHU2NxY" role="33vP2m">
              <node concept="3CFZ6_" id="6MWlVHU2NxZ" role="2OqNvi">
                <node concept="3CFYIy" id="6MWlVHU2Ny0" role="3CFYIz">
                  <ref role="3CFYIx" to="tp5g:hG7CXiP" resolve="NodeOperationsContainer" />
                </node>
              </node>
              <node concept="37vLTw" id="6MWlVHU2Ny1" role="2Oq$k0">
                <ref role="3cqZAo" node="6MWlVHU2Nyl" resolve="node" />
              </node>
            </node>
          </node>
        </node>
        <node concept="1DcWWT" id="6MWlVHU2Ny2" role="3cqZAp">
          <node concept="2OqwBi" id="6MWlVHU2Ny3" role="1DdaDG">
            <node concept="37vLTw" id="6MWlVHU2Ny4" role="2Oq$k0">
              <ref role="3cqZAo" node="6MWlVHU2NxW" resolve="container" />
            </node>
            <node concept="3Tsc0h" id="6MWlVHU2Ny5" role="2OqNvi">
              <ref role="3TtcxE" to="tp5g:hG7EUTW" />
            </node>
          </node>
          <node concept="3cpWsn" id="6MWlVHU2Ny6" role="1Duv9x">
            <property role="TrG5h" value="property" />
            <node concept="3Tqbb2" id="6MWlVHU2Ny7" role="1tU5fm">
              <ref role="ehGHo" to="tp5g:hG7unSw" resolve="NodeCheckOperation" />
            </node>
          </node>
          <node concept="3clFbS" id="6MWlVHU2Ny8" role="2LFqv$">
            <node concept="3clFbJ" id="6MWlVHU2Ny9" role="3cqZAp">
              <node concept="3clFbS" id="6MWlVHU2Nya" role="3clFbx">
                <node concept="3cpWs6" id="6MWlVHU2Nyb" role="3cqZAp">
                  <node concept="3clFbT" id="6MWlVHU2Nyc" role="3cqZAk">
                    <property role="3clFbU" value="true" />
                  </node>
                </node>
              </node>
              <node concept="2OqwBi" id="6MWlVHU2Nyd" role="3clFbw">
                <node concept="37vLTw" id="6MWlVHU2Nye" role="2Oq$k0">
                  <ref role="3cqZAo" node="6MWlVHU2Ny6" resolve="property" />
                </node>
                <node concept="1mIQ4w" id="6MWlVHU2Nyf" role="2OqNvi">
                  <node concept="chp4Y" id="6MWlVHU2Nyg" role="cj9EA">
                    <ref role="cht4Q" to="tp5g:7scb9XIYnWK" resolve="IChecksRules" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="6MWlVHU2Nyh" role="3cqZAp">
          <node concept="3clFbT" id="6MWlVHU2Nyi" role="3cqZAk">
            <property role="3clFbU" value="false" />
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="6MWlVHU2Nyj" role="1B3o_S" />
      <node concept="10P_77" id="6MWlVHU2Nyk" role="3clF45" />
      <node concept="37vLTG" id="6MWlVHU2Nyl" role="3clF46">
        <property role="TrG5h" value="node" />
        <node concept="3Tqbb2" id="6MWlVHU2Nym" role="1tU5fm">
          <ref role="ehGHo" to="tpck:gw2VY9q" resolve="BaseConcept" />
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="6MWlVHU2Nyn" role="jymVt" />
    <node concept="3clFb_" id="6MWlVHU2Nyo" role="jymVt">
      <property role="TrG5h" value="checkWarnings" />
      <node concept="3Tm6S6" id="6MWlVHU2Nyp" role="1B3o_S" />
      <node concept="3cqZAl" id="6MWlVHU2Nyq" role="3clF45" />
      <node concept="37vLTG" id="6MWlVHU2Nyr" role="3clF46">
        <property role="TrG5h" value="reporter" />
        <node concept="3uibUv" id="6MWlVHU2Nys" role="1tU5fm">
          <ref role="3uigEE" to="2gg1:~IErrorReporter" resolve="IErrorReporter" />
        </node>
      </node>
      <node concept="37vLTG" id="6MWlVHU2Nyt" role="3clF46">
        <property role="TrG5h" value="warningMsg" />
        <node concept="17QB3L" id="6MWlVHU2Nyu" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="6MWlVHU2Nyv" role="3clF47">
        <node concept="3clFbJ" id="6MWlVHU2Nyw" role="3cqZAp">
          <node concept="3clFbS" id="6MWlVHU2Nyx" role="3clFbx">
            <node concept="3vwNmj" id="6MWlVHU2Nyy" role="3cqZAp">
              <node concept="3_1$Yv" id="6MWlVHU2Nyz" role="3_9lra">
                <node concept="37vLTw" id="6MWlVHU2Ny$" role="3_1BAH">
                  <ref role="3cqZAo" node="6MWlVHU2Nyt" resolve="warningMsg" />
                </node>
              </node>
              <node concept="3y3z36" id="6MWlVHU2Ny_" role="3vwVQn">
                <node concept="2OqwBi" id="6MWlVHU2NyA" role="3uHU7B">
                  <node concept="37vLTw" id="6MWlVHU2NyB" role="2Oq$k0">
                    <ref role="3cqZAo" node="6MWlVHU2Nyr" resolve="reporter" />
                  </node>
                  <node concept="liA8E" id="6MWlVHU2NyC" role="2OqNvi">
                    <ref role="37wK5l" to="2gg1:~IErrorReporter.getMessageStatus():jetbrains.mps.errors.MessageStatus" resolve="getMessageStatus" />
                  </node>
                </node>
                <node concept="Rm8GO" id="6MWlVHU2NyD" role="3uHU7w">
                  <ref role="Rm8GQ" to="2gg1:~MessageStatus.WARNING" resolve="WARNING" />
                  <ref role="1Px2BO" to="2gg1:~MessageStatus" resolve="MessageStatus" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3fqX7Q" id="6MWlVHU2NyE" role="3clFbw">
            <node concept="37vLTw" id="6MWlVHU2NyF" role="3fr31v">
              <ref role="3cqZAo" node="6MWlVHU2Nwe" resolve="allowsWarnings" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="6MWlVHU2NyG" role="jymVt" />
    <node concept="3clFb_" id="6MWlVHU2NyH" role="jymVt">
      <property role="TrG5h" value="checkErrors" />
      <node concept="3Tm6S6" id="6MWlVHU2NyI" role="1B3o_S" />
      <node concept="3cqZAl" id="6MWlVHU2NyJ" role="3clF45" />
      <node concept="37vLTG" id="6MWlVHU2NyK" role="3clF46">
        <property role="TrG5h" value="reporter" />
        <node concept="3uibUv" id="6MWlVHU2NyL" role="1tU5fm">
          <ref role="3uigEE" to="2gg1:~IErrorReporter" resolve="IErrorReporter" />
        </node>
      </node>
      <node concept="37vLTG" id="6MWlVHU2NyM" role="3clF46">
        <property role="TrG5h" value="errorMsg" />
        <node concept="17QB3L" id="6MWlVHU2NyN" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="6MWlVHU2NyO" role="3clF47">
        <node concept="3clFbJ" id="6MWlVHU2NyP" role="3cqZAp">
          <node concept="3clFbS" id="6MWlVHU2NyQ" role="3clFbx">
            <node concept="3vwNmj" id="6MWlVHU2NyR" role="3cqZAp">
              <node concept="3_1$Yv" id="6MWlVHU2NyS" role="3_9lra">
                <node concept="37vLTw" id="6MWlVHU2NyT" role="3_1BAH">
                  <ref role="3cqZAo" node="6MWlVHU2NyM" resolve="errorMsg" />
                </node>
              </node>
              <node concept="3y3z36" id="6MWlVHU2NyU" role="3vwVQn">
                <node concept="2OqwBi" id="6MWlVHU2NyV" role="3uHU7B">
                  <node concept="37vLTw" id="6MWlVHU2NyW" role="2Oq$k0">
                    <ref role="3cqZAo" node="6MWlVHU2NyK" resolve="reporter" />
                  </node>
                  <node concept="liA8E" id="6MWlVHU2NyX" role="2OqNvi">
                    <ref role="37wK5l" to="2gg1:~IErrorReporter.getMessageStatus():jetbrains.mps.errors.MessageStatus" resolve="getMessageStatus" />
                  </node>
                </node>
                <node concept="Rm8GO" id="6MWlVHU2NyY" role="3uHU7w">
                  <ref role="1Px2BO" to="2gg1:~MessageStatus" resolve="MessageStatus" />
                  <ref role="Rm8GQ" to="2gg1:~MessageStatus.ERROR" resolve="ERROR" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3fqX7Q" id="6MWlVHU2NyZ" role="3clFbw">
            <node concept="37vLTw" id="6MWlVHU2Nz0" role="3fr31v">
              <ref role="3cqZAo" node="6MWlVHU2Nwh" resolve="allowsErrors" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="6MWlVHU2Nz1" role="jymVt" />
    <node concept="3clFb_" id="6MWlVHU2Nz2" role="jymVt">
      <property role="TrG5h" value="getErrorString" />
      <node concept="3Tm6S6" id="6MWlVHU2Nz3" role="1B3o_S" />
      <node concept="17QB3L" id="6MWlVHU2Nz4" role="3clF45" />
      <node concept="37vLTG" id="6MWlVHU2Nz5" role="3clF46">
        <property role="TrG5h" value="reporter" />
        <node concept="3uibUv" id="6MWlVHU2Nz6" role="1tU5fm">
          <ref role="3uigEE" to="2gg1:~IErrorReporter" resolve="IErrorReporter" />
        </node>
      </node>
      <node concept="37vLTG" id="6MWlVHU2Nz7" role="3clF46">
        <property role="TrG5h" value="node" />
        <node concept="3Tqbb2" id="6MWlVHU2Nz8" role="1tU5fm">
          <ref role="ehGHo" to="tpck:gw2VY9q" resolve="BaseConcept" />
        </node>
      </node>
      <node concept="3clFbS" id="6MWlVHU2Nz9" role="3clF47">
        <node concept="3cpWs6" id="6MWlVHU2Nza" role="3cqZAp">
          <node concept="3cpWs3" id="6MWlVHU2Nzb" role="3cqZAk">
            <node concept="Xl_RD" id="6MWlVHU2Nzc" role="3uHU7w">
              <property role="Xl_RC" value="'" />
            </node>
            <node concept="3cpWs3" id="6MWlVHU2Nzd" role="3uHU7B">
              <node concept="3cpWs3" id="6MWlVHU2Nze" role="3uHU7B">
                <node concept="2OqwBi" id="6MWlVHU2Nzf" role="3uHU7B">
                  <node concept="37vLTw" id="6MWlVHU2Nzg" role="2Oq$k0">
                    <ref role="3cqZAo" node="6MWlVHU2Nz5" resolve="reporter" />
                  </node>
                  <node concept="liA8E" id="6MWlVHU2Nzh" role="2OqNvi">
                    <ref role="37wK5l" to="2gg1:~IErrorReporter.reportError():java.lang.String" resolve="reportError" />
                  </node>
                </node>
                <node concept="Xl_RD" id="6MWlVHU2Nzi" role="3uHU7w">
                  <property role="Xl_RC" value=". Node '" />
                </node>
              </node>
              <node concept="2YIFZM" id="6MWlVHU2Nzj" role="3uHU7w">
                <ref role="1Pybhc" node="18jf_F1WDsS" resolve="NodeCheckerUtil" />
                <ref role="37wK5l" node="18jf_F1WDtL" resolve="nodeWithIdToString" />
                <node concept="37vLTw" id="6MWlVHU2Nzk" role="37wK5m">
                  <ref role="3cqZAo" node="6MWlVHU2Nz7" resolve="node" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3Tm1VV" id="6MWlVHU2Nzl" role="1B3o_S" />
    <node concept="3uibUv" id="6MWlVHU4L8e" role="EKbjA">
      <ref role="3uigEE" to="wyt6:~Runnable" resolve="Runnable" />
    </node>
  </node>
  <node concept="312cEu" id="3fCX6WCBvHP">
    <property role="3GE5qa" value="util" />
    <property role="TrG5h" value="TestsErrorsChecker" />
    <node concept="312cEg" id="3fCX6WCBvHQ" role="jymVt">
      <property role="34CwA1" value="false" />
      <property role="eg7rD" value="false" />
      <property role="TrG5h" value="myRoot" />
      <property role="3TUv4t" value="false" />
      <node concept="3Tm6S6" id="3fCX6WCBvHR" role="1B3o_S" />
      <node concept="3Tqbb2" id="3fCX6WCBvHS" role="1tU5fm">
        <ref role="ehGHo" to="tpck:gw2VY9q" resolve="BaseConcept" />
      </node>
    </node>
    <node concept="2tJIrI" id="16ZaSqD$0n1" role="jymVt" />
    <node concept="Wx3nA" id="16WnrUwrkaI" role="jymVt">
      <property role="IEkAT" value="false" />
      <property role="TrG5h" value="ourModelErrorsHolder" />
      <property role="3TUv4t" value="false" />
      <node concept="3uibUv" id="16WnrUwrdHO" role="1tU5fm">
        <ref role="3uigEE" node="4zLXJmJvOQ8" resolve="TestsErrorsChecker.ModelErrorsHolder" />
        <node concept="3uibUv" id="16WnrUwrdIt" role="11_B2D">
          <ref role="3uigEE" to="2gg1:~IErrorReporter" resolve="IErrorReporter" />
        </node>
      </node>
      <node concept="3Tm6S6" id="4zLXJmJyGiB" role="1B3o_S" />
      <node concept="2ShNRf" id="16WnrUwz_a$" role="33vP2m">
        <node concept="HV5vD" id="16WnrUwzSy6" role="2ShVmc">
          <ref role="HV5vE" node="4zLXJmJvOQ8" resolve="TestsErrorsChecker.ModelErrorsHolder" />
          <node concept="3uibUv" id="6Ek5dow8KoF" role="HU9BZ">
            <ref role="3uigEE" to="2gg1:~IErrorReporter" resolve="IErrorReporter" />
          </node>
        </node>
      </node>
      <node concept="z59LJ" id="16ZaSqD$cTh" role="lGtFl">
        <node concept="TZ5HA" id="16ZaSqD$cTi" role="TZ5H$">
          <node concept="1dT_AC" id="16ZaSqD$cTj" role="1dT_Ay">
            <property role="1dT_AB" value="contains cached warnings and errors for the current root" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="5CXWFgmWBFz" role="jymVt" />
    <node concept="Wx3nA" id="5CXWFgmVN2B" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="TrG5h" value="ourModelChangesListener" />
      <property role="3TUv4t" value="false" />
      <node concept="3Tm6S6" id="5CXWFgmVKDG" role="1B3o_S" />
      <node concept="3uibUv" id="5CXWFgmVOt9" role="1tU5fm">
        <ref role="3uigEE" to="j9co:~SModelCommandListener" resolve="SModelCommandListener" />
      </node>
      <node concept="z59LJ" id="5CXWFgmWCP2" role="lGtFl">
        <node concept="TZ5HA" id="5CXWFgmWCP3" role="TZ5H$">
          <node concept="1dT_AC" id="5CXWFgmWCP4" role="1dT_Ay">
            <property role="1dT_AB" value="clears our cache on any model change" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="5CXWFgmWAeP" role="jymVt" />
    <node concept="2YIFZL" id="16ZaSqD$gp4" role="jymVt">
      <property role="TrG5h" value="initModelListener" />
      <property role="DiZV1" value="false" />
      <property role="od$2w" value="false" />
      <node concept="3clFbS" id="5CXWFgmWysz" role="3clF47">
        <node concept="3clFbJ" id="5CXWFgmWys$" role="3cqZAp">
          <node concept="3clFbS" id="5CXWFgmWys_" role="3clFbx">
            <node concept="3clFbF" id="5CXWFgmWysA" role="3cqZAp">
              <node concept="37vLTI" id="5CXWFgmWysB" role="3clFbG">
                <node concept="2ShNRf" id="5CXWFgmWysC" role="37vLTx">
                  <node concept="YeOm9" id="5CXWFgmWysD" role="2ShVmc">
                    <node concept="1Y3b0j" id="5CXWFgmWysE" role="YeSDq">
                      <property role="2bfB8j" value="true" />
                      <ref role="1Y3XeK" to="j9co:~SModelCommandListener" resolve="SModelCommandListener" />
                      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
                      <node concept="3Tm1VV" id="5CXWFgmWysF" role="1B3o_S" />
                      <node concept="3clFb_" id="5CXWFgmWysG" role="jymVt">
                        <property role="1EzhhJ" value="false" />
                        <property role="TrG5h" value="eventsHappenedInCommand" />
                        <property role="DiZV1" value="false" />
                        <property role="od$2w" value="false" />
                        <node concept="3Tm1VV" id="5CXWFgmWysH" role="1B3o_S" />
                        <node concept="3cqZAl" id="5CXWFgmWysI" role="3clF45" />
                        <node concept="37vLTG" id="5CXWFgmWysJ" role="3clF46">
                          <property role="TrG5h" value="events" />
                          <node concept="3uibUv" id="5CXWFgmWysK" role="1tU5fm">
                            <ref role="3uigEE" to="33ny:~List" resolve="List" />
                            <node concept="3uibUv" id="5CXWFgmWysL" role="11_B2D">
                              <ref role="3uigEE" to="j9co:~SModelEvent" resolve="SModelEvent" />
                            </node>
                          </node>
                        </node>
                        <node concept="3clFbS" id="5CXWFgmWysM" role="3clF47">
                          <node concept="3clFbJ" id="5CXWFgmWysN" role="3cqZAp">
                            <node concept="3clFbS" id="5CXWFgmWysO" role="3clFbx">
                              <node concept="3clFbF" id="5CXWFgmWysP" role="3cqZAp">
                                <node concept="37vLTI" id="5CXWFgmWysQ" role="3clFbG">
                                  <node concept="2ShNRf" id="5CXWFgmWysR" role="37vLTx">
                                    <node concept="HV5vD" id="5CXWFgmWysS" role="2ShVmc">
                                      <ref role="HV5vE" node="4zLXJmJvOQ8" resolve="TestsErrorsChecker.ModelErrorsHolder" />
                                    </node>
                                  </node>
                                  <node concept="37vLTw" id="5CXWFgmWysT" role="37vLTJ">
                                    <ref role="3cqZAo" node="16WnrUwrkaI" resolve="ourModelErrorsHolder" />
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node concept="3fqX7Q" id="5CXWFgmWysU" role="3clFbw">
                              <node concept="2OqwBi" id="5CXWFgmWysV" role="3fr31v">
                                <node concept="37vLTw" id="5CXWFgmWysW" role="2Oq$k0">
                                  <ref role="3cqZAo" node="5CXWFgmWysJ" resolve="events" />
                                </node>
                                <node concept="liA8E" id="5CXWFgmWysX" role="2OqNvi">
                                  <ref role="37wK5l" to="33ny:~List.isEmpty():boolean" resolve="isEmpty" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="37vLTw" id="5CXWFgmWysY" role="37vLTJ">
                  <ref role="3cqZAo" node="5CXWFgmVN2B" resolve="ourModelChangesListener" />
                </node>
              </node>
            </node>
            <node concept="3clFbF" id="5CXWFgmWTvj" role="3cqZAp">
              <node concept="2OqwBi" id="5CXWFgmWTx6" role="3clFbG">
                <node concept="2YIFZM" id="5CXWFgmWTwv" role="2Oq$k0">
                  <ref role="37wK5l" to="w1kc:~GlobalSModelEventsManager.getInstance():jetbrains.mps.smodel.GlobalSModelEventsManager" resolve="getInstance" />
                  <ref role="1Pybhc" to="w1kc:~GlobalSModelEventsManager" resolve="GlobalSModelEventsManager" />
                </node>
                <node concept="liA8E" id="5CXWFgmWT$r" role="2OqNvi">
                  <ref role="37wK5l" to="w1kc:~GlobalSModelEventsManager.addGlobalCommandListener(jetbrains.mps.smodel.event.SModelCommandListener):void" resolve="addGlobalCommandListener" />
                  <node concept="37vLTw" id="5CXWFgmWTG$" role="37wK5m">
                    <ref role="3cqZAo" node="5CXWFgmVN2B" resolve="ourModelChangesListener" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbC" id="5CXWFgmWysZ" role="3clFbw">
            <node concept="10Nm6u" id="5CXWFgmWyt0" role="3uHU7w" />
            <node concept="37vLTw" id="5CXWFgmWyt1" role="3uHU7B">
              <ref role="3cqZAo" node="5CXWFgmVN2B" resolve="ourModelChangesListener" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3cqZAl" id="5CXWFgmWyt6" role="3clF45" />
      <node concept="3Tm6S6" id="5CXWFgmWyt5" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="16ZaSqD$hGc" role="jymVt" />
    <node concept="1Pe0a1" id="16ZaSqD$iRj" role="jymVt">
      <node concept="3clFbS" id="16ZaSqD$iRl" role="1Pe0a2">
        <node concept="3clFbF" id="5CXWFgmWyt8" role="3cqZAp">
          <node concept="1rXfSq" id="5CXWFgmWyt7" role="3clFbG">
            <ref role="37wK5l" node="16ZaSqD$gp4" resolve="initModelListener" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="5CXWFgmVLMt" role="jymVt" />
    <node concept="3clFbW" id="3fCX6WCBvHU" role="jymVt">
      <node concept="3cqZAl" id="3fCX6WCBvHV" role="3clF45" />
      <node concept="3clFbS" id="3fCX6WCBvHW" role="3clF47">
        <node concept="1gVbGN" id="6XmLCMAaS_X" role="3cqZAp">
          <node concept="3clFbC" id="6XmLCMAaTML" role="1gVkn0">
            <node concept="37vLTw" id="6XmLCMAaSAm" role="3uHU7B">
              <ref role="3cqZAo" node="3fCX6WCBvI4" resolve="root" />
            </node>
            <node concept="2OqwBi" id="6XmLCMAaTAK" role="3uHU7w">
              <node concept="37vLTw" id="6XmLCMAaSKR" role="2Oq$k0">
                <ref role="3cqZAo" node="3fCX6WCBvI4" resolve="root" />
              </node>
              <node concept="2Rxl7S" id="6XmLCMAaTLs" role="2OqNvi" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3fCX6WCBvHX" role="3cqZAp">
          <node concept="37vLTI" id="3fCX6WCBvHY" role="3clFbG">
            <node concept="37vLTw" id="3fCX6WCBvHZ" role="37vLTx">
              <ref role="3cqZAo" node="3fCX6WCBvI4" resolve="root" />
            </node>
            <node concept="37vLTw" id="6Ek5dow8Vab" role="37vLTJ">
              <ref role="3cqZAo" node="3fCX6WCBvHQ" resolve="myRoot" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="3fCX6WCBvI3" role="1B3o_S" />
      <node concept="37vLTG" id="3fCX6WCBvI4" role="3clF46">
        <property role="TrG5h" value="root" />
        <node concept="3Tqbb2" id="3fCX6WCBvI5" role="1tU5fm">
          <ref role="ehGHo" to="tpck:gw2VY9q" resolve="BaseConcept" />
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="1sQrDa2DcFy" role="jymVt" />
    <node concept="3clFb_" id="4qBxKS6Uyw5" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getAllErrors" />
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <node concept="3clFbS" id="4qBxKS6Uyw8" role="3clF47">
        <node concept="3cpWs6" id="4qBxKS6UAya" role="3cqZAp">
          <node concept="1rXfSq" id="4qBxKS6UD59" role="3cqZAk">
            <ref role="37wK5l" node="1YoECRzVFCT" resolve="getRootErrors" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="4qBxKS6Ut8D" role="1B3o_S" />
      <node concept="A3Dl8" id="4qBxKS6UyuT" role="3clF45">
        <node concept="3uibUv" id="4qBxKS6UyuY" role="A3Ik2">
          <ref role="3uigEE" to="2gg1:~IErrorReporter" resolve="IErrorReporter" />
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="4u_hDHVFY3D" role="jymVt" />
    <node concept="3clFb_" id="3fCX6WCBvJp" role="jymVt">
      <property role="TrG5h" value="getErrors" />
      <property role="IEkAT" value="false" />
      <property role="DiZV1" value="false" />
      <property role="od$2w" value="false" />
      <node concept="A3Dl8" id="16WnrUwtAFS" role="3clF45">
        <node concept="3uibUv" id="16WnrUwtAFT" role="A3Ik2">
          <ref role="3uigEE" to="2gg1:~IErrorReporter" resolve="IErrorReporter" />
        </node>
      </node>
      <node concept="3clFbS" id="3fCX6WCBvJq" role="3clF47">
        <node concept="3cpWs8" id="3fCX6WCBvJr" role="3cqZAp">
          <node concept="3cpWsn" id="3fCX6WCBvJs" role="3cpWs9">
            <property role="TrG5h" value="result" />
            <node concept="1rXfSq" id="1YoECRzVFCX" role="33vP2m">
              <ref role="37wK5l" node="1YoECRzVFCT" resolve="getRootErrors" />
            </node>
            <node concept="A3Dl8" id="1YoECRzWidv" role="1tU5fm">
              <node concept="3uibUv" id="1YoECRzWidy" role="A3Ik2">
                <ref role="3uigEE" to="2gg1:~IErrorReporter" resolve="IErrorReporter" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="3fCX6WCBvJG" role="3cqZAp">
          <node concept="1rXfSq" id="1YoECRzVbyI" role="3cqZAk">
            <ref role="37wK5l" node="3fCX6WCBvIX" resolve="filterReportersByNode" />
            <node concept="37vLTw" id="1YoECRzVwgX" role="37wK5m">
              <ref role="3cqZAo" node="3fCX6WCBvJs" resolve="result" />
            </node>
            <node concept="37vLTw" id="4u_hDHVFGQ6" role="37wK5m">
              <ref role="3cqZAo" node="4u_hDHVFCSX" resolve="node" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="3fCX6WCBvJK" role="1B3o_S" />
      <node concept="37vLTG" id="4u_hDHVFCSX" role="3clF46">
        <property role="TrG5h" value="node" />
        <node concept="3Tqbb2" id="4u_hDHVFCSW" role="1tU5fm" />
        <node concept="2AHcQZ" id="6XmLCMAaTO0" role="2AJF6D">
          <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="4u_hDHVGDnj" role="jymVt" />
    <node concept="3clFb_" id="3fCX6WCBvJM" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getErrorsSpecificType" />
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <node concept="A3Dl8" id="16WnrUwvDx3" role="3clF45">
        <node concept="3uibUv" id="16WnrUwvIu0" role="A3Ik2">
          <ref role="3uigEE" to="2gg1:~IErrorReporter" resolve="IErrorReporter" />
        </node>
      </node>
      <node concept="3clFbS" id="3fCX6WCBvJN" role="3clF47">
        <node concept="3cpWs8" id="3fCX6WCBvJO" role="3cqZAp">
          <node concept="3cpWsn" id="3fCX6WCBvJP" role="3cpWs9">
            <property role="TrG5h" value="result" />
            <node concept="2hMVRd" id="16WnrUwvLM5" role="1tU5fm">
              <node concept="3uibUv" id="16WnrUwvLM7" role="2hN53Y">
                <ref role="3uigEE" to="2gg1:~IErrorReporter" resolve="IErrorReporter" />
              </node>
            </node>
            <node concept="2ShNRf" id="3fCX6WCBvJS" role="33vP2m">
              <node concept="2i4dXS" id="16WnrUwvUBr" role="2ShVmc">
                <node concept="3uibUv" id="16WnrUwvUBt" role="HW$YZ">
                  <ref role="3uigEE" to="2gg1:~IErrorReporter" resolve="IErrorReporter" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3fCX6WCBvJV" role="3cqZAp">
          <node concept="2OqwBi" id="3fCX6WCBvJW" role="3clFbG">
            <node concept="37vLTw" id="3fCX6WCBvJX" role="2Oq$k0">
              <ref role="3cqZAo" node="3fCX6WCBvJP" resolve="result" />
            </node>
            <node concept="X8dFx" id="3fCX6WCBvJY" role="2OqNvi">
              <node concept="2OqwBi" id="3fCX6WCBvJZ" role="25WWJ7">
                <node concept="1rXfSq" id="3fCX6WCBvK0" role="2Oq$k0">
                  <ref role="37wK5l" node="3fCX6WCBvJp" resolve="getErrors" />
                  <node concept="37vLTw" id="4u_hDHVGK9J" role="37wK5m">
                    <ref role="3cqZAo" node="4u_hDHVGGJv" resolve="node" />
                  </node>
                </node>
                <node concept="3zZkjj" id="3fCX6WCBvK1" role="2OqNvi">
                  <node concept="1bVj0M" id="3fCX6WCBvK2" role="23t8la">
                    <node concept="3clFbS" id="3fCX6WCBvK3" role="1bW5cS">
                      <node concept="3clFbF" id="3fCX6WCBvK4" role="3cqZAp">
                        <node concept="3clFbC" id="3fCX6WCBvK5" role="3clFbG">
                          <node concept="37vLTw" id="3fCX6WCBvK6" role="3uHU7w">
                            <ref role="3cqZAo" node="3fCX6WCBvKh" resolve="errorType" />
                          </node>
                          <node concept="2OqwBi" id="3fCX6WCBvK7" role="3uHU7B">
                            <node concept="37vLTw" id="3fCX6WCBvK8" role="2Oq$k0">
                              <ref role="3cqZAo" node="3fCX6WCBvKa" resolve="it" />
                            </node>
                            <node concept="liA8E" id="3fCX6WCBvK9" role="2OqNvi">
                              <ref role="37wK5l" to="2gg1:~IErrorReporter.getMessageStatus():jetbrains.mps.errors.MessageStatus" resolve="getMessageStatus" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="Rh6nW" id="3fCX6WCBvKa" role="1bW2Oz">
                      <property role="TrG5h" value="it" />
                      <node concept="2jxLKc" id="3fCX6WCBvKb" role="1tU5fm" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="3fCX6WCBvKc" role="3cqZAp">
          <node concept="37vLTw" id="3fCX6WCBvKd" role="3cqZAk">
            <ref role="3cqZAo" node="3fCX6WCBvJP" resolve="result" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="3fCX6WCBvKe" role="1B3o_S" />
      <node concept="37vLTG" id="4u_hDHVGGJv" role="3clF46">
        <property role="TrG5h" value="node" />
        <node concept="3Tqbb2" id="4u_hDHVGK8B" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3fCX6WCBvKh" role="3clF46">
        <property role="TrG5h" value="errorType" />
        <node concept="3uibUv" id="3fCX6WCBvKi" role="1tU5fm">
          <ref role="3uigEE" to="2gg1:~MessageStatus" resolve="MessageStatus" />
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="3fCX6WCBvIW" role="jymVt" />
    <node concept="3clFb_" id="3fCX6WCBvIX" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="filterReportersByNode" />
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <node concept="A3Dl8" id="16WnrUwtv8G" role="3clF45">
        <node concept="3uibUv" id="16WnrUwtwOi" role="A3Ik2">
          <ref role="3uigEE" to="2gg1:~IErrorReporter" resolve="IErrorReporter" />
        </node>
      </node>
      <node concept="3clFbS" id="3fCX6WCBvIY" role="3clF47">
        <node concept="3cpWs6" id="3fCX6WCBvIZ" role="3cqZAp">
          <node concept="2OqwBi" id="3fCX6WCBvJ1" role="3cqZAk">
            <node concept="37vLTw" id="3fCX6WCBvJ2" role="2Oq$k0">
              <ref role="3cqZAo" node="3fCX6WCBvJj" resolve="errors" />
            </node>
            <node concept="3zZkjj" id="3fCX6WCBvJ3" role="2OqNvi">
              <node concept="1bVj0M" id="3fCX6WCBvJ4" role="23t8la">
                <node concept="3clFbS" id="3fCX6WCBvJ5" role="1bW5cS">
                  <node concept="1gVbGN" id="1sQrDa2E8lq" role="3cqZAp">
                    <node concept="3y3z36" id="1sQrDa2EmTF" role="1gVkn0">
                      <node concept="10Nm6u" id="1sQrDa2EmU3" role="3uHU7w" />
                      <node concept="2OqwBi" id="1sQrDa2EeHB" role="3uHU7B">
                        <node concept="37vLTw" id="1sQrDa2EbOL" role="2Oq$k0">
                          <ref role="3cqZAo" node="3fCX6WCBvJd" resolve="it" />
                        </node>
                        <node concept="liA8E" id="1sQrDa2Eijm" role="2OqNvi">
                          <ref role="37wK5l" to="2gg1:~IErrorReporter.getSNode():org.jetbrains.mps.openapi.model.SNode" resolve="getSNode" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="6RioKE3wciH" role="3cqZAp">
                    <node concept="2OqwBi" id="6RioKE3xQXd" role="3clFbG">
                      <node concept="2OqwBi" id="6RioKE3xIfO" role="2Oq$k0">
                        <node concept="2OqwBi" id="6RioKE3we5Z" role="2Oq$k0">
                          <node concept="37vLTw" id="6RioKE3wciF" role="2Oq$k0">
                            <ref role="3cqZAo" node="3fCX6WCBvJd" resolve="it" />
                          </node>
                          <node concept="liA8E" id="6RioKE3xEC3" role="2OqNvi">
                            <ref role="37wK5l" to="2gg1:~IErrorReporter.getSNode():org.jetbrains.mps.openapi.model.SNode" resolve="getSNode" />
                          </node>
                        </node>
                        <node concept="liA8E" id="6RioKE3xN8m" role="2OqNvi">
                          <ref role="37wK5l" to="mhbf:~SNode.getNodeId():org.jetbrains.mps.openapi.model.SNodeId" resolve="getNodeId" />
                        </node>
                      </node>
                      <node concept="liA8E" id="6RioKE3xVVr" role="2OqNvi">
                        <ref role="37wK5l" to="wyt6:~Object.equals(java.lang.Object):boolean" resolve="equals" />
                        <node concept="2OqwBi" id="6RioKE3CZDL" role="37wK5m">
                          <node concept="2JrnkZ" id="6RioKE3CUAr" role="2Oq$k0">
                            <node concept="37vLTw" id="6RioKE3Cddf" role="2JrQYb">
                              <ref role="3cqZAo" node="3fCX6WCBvJm" resolve="aNode" />
                            </node>
                          </node>
                          <node concept="liA8E" id="6RioKE3D4g_" role="2OqNvi">
                            <ref role="37wK5l" to="mhbf:~SNode.getNodeId():org.jetbrains.mps.openapi.model.SNodeId" resolve="getNodeId" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="Rh6nW" id="3fCX6WCBvJd" role="1bW2Oz">
                  <property role="TrG5h" value="it" />
                  <node concept="2jxLKc" id="3fCX6WCBvJe" role="1tU5fm" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="3fCX6WCBvJg" role="1B3o_S" />
      <node concept="37vLTG" id="3fCX6WCBvJj" role="3clF46">
        <property role="TrG5h" value="errors" />
        <property role="3TUv4t" value="true" />
        <node concept="A3Dl8" id="1YoECRzWpzx" role="1tU5fm">
          <node concept="3uibUv" id="1YoECRzWpzz" role="A3Ik2">
            <ref role="3uigEE" to="2gg1:~IErrorReporter" resolve="IErrorReporter" />
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="3fCX6WCBvJm" role="3clF46">
        <property role="TrG5h" value="aNode" />
        <node concept="3Tqbb2" id="3fCX6WCBvJn" role="1tU5fm" />
        <node concept="2AHcQZ" id="6XmLCMAaLMq" role="2AJF6D">
          <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="1YoECRzVW$e" role="jymVt" />
    <node concept="3clFb_" id="1YoECRzVFCT" role="jymVt">
      <property role="TrG5h" value="getRootErrors" />
      <node concept="3Tm6S6" id="1YoECRzVFCU" role="1B3o_S" />
      <node concept="A3Dl8" id="1YoECRzWeuv" role="3clF45">
        <node concept="3uibUv" id="1YoECRzWeux" role="A3Ik2">
          <ref role="3uigEE" to="2gg1:~IErrorReporter" resolve="IErrorReporter" />
        </node>
      </node>
      <node concept="3clFbS" id="1YoECRzVFCn" role="3clF47">
        <node concept="3cpWs8" id="16WnrUwr$0M" role="3cqZAp">
          <node concept="3cpWsn" id="16WnrUwr$0N" role="3cpWs9">
            <property role="TrG5h" value="cachedErrors" />
            <node concept="2hMVRd" id="16WnrUwr$0H" role="1tU5fm">
              <node concept="3uibUv" id="16WnrUwr$0K" role="2hN53Y">
                <ref role="3uigEE" to="2gg1:~IErrorReporter" resolve="IErrorReporter" />
              </node>
            </node>
            <node concept="2OqwBi" id="16WnrUwr$0O" role="33vP2m">
              <node concept="10M0yZ" id="7ofrMmP9H8Q" role="2Oq$k0">
                <ref role="1PxDUh" node="3fCX6WCBvHP" resolve="TestsErrorsChecker" />
                <ref role="3cqZAo" node="16WnrUwrkaI" resolve="ourModelErrorsHolder" />
              </node>
              <node concept="liA8E" id="16WnrUwr$0Q" role="2OqNvi">
                <ref role="37wK5l" node="4zLXJmJvRk$" resolve="get" />
                <node concept="37vLTw" id="16WnrUwr$0S" role="37wK5m">
                  <ref role="3cqZAo" node="3fCX6WCBvHQ" resolve="myRoot" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="16WnrUwriNf" role="3cqZAp">
          <node concept="3clFbS" id="16WnrUwriNi" role="3clFbx">
            <node concept="3cpWs6" id="16WnrUwrzYO" role="3cqZAp">
              <node concept="2OqwBi" id="16WnrUwrE0Y" role="3cqZAk">
                <node concept="37vLTw" id="1YoECRzW6uH" role="2Oq$k0">
                  <ref role="3cqZAo" node="16WnrUwr$0N" resolve="cachedErrors" />
                </node>
                <node concept="ANE8D" id="16WnrUwrG6R" role="2OqNvi" />
              </node>
            </node>
          </node>
          <node concept="3y3z36" id="16WnrUwrxW2" role="3clFbw">
            <node concept="10Nm6u" id="16WnrUwryaU" role="3uHU7w" />
            <node concept="37vLTw" id="16WnrUwr$0U" role="3uHU7B">
              <ref role="3cqZAo" node="16WnrUwr$0N" resolve="cachedErrors" />
            </node>
          </node>
        </node>
        <node concept="3clFbH" id="63oasX2eHq0" role="3cqZAp" />
        <node concept="34ab3g" id="6RioKE3GLOm" role="3cqZAp">
          <property role="35gtTG" value="debug" />
          <node concept="3cpWs3" id="6RioKE3H1JB" role="34bqiv">
            <node concept="37vLTw" id="6RioKE3H4gl" role="3uHU7w">
              <ref role="3cqZAo" node="3fCX6WCBvHQ" resolve="myRoot" />
            </node>
            <node concept="Xl_RD" id="6RioKE3GLOo" role="3uHU7B">
              <property role="Xl_RC" value="Collecting errors in the root " />
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="1YoECRzWOc1" role="3cqZAp">
          <node concept="3cpWsn" id="1YoECRzWOc2" role="3cpWs9">
            <property role="TrG5h" value="result" />
            <node concept="2hMVRd" id="1YoECRzWOc3" role="1tU5fm">
              <node concept="3uibUv" id="1YoECRzWOc4" role="2hN53Y">
                <ref role="3uigEE" to="2gg1:~IErrorReporter" resolve="IErrorReporter" />
              </node>
            </node>
            <node concept="2ShNRf" id="1YoECRzWOc5" role="33vP2m">
              <node concept="2i4dXS" id="1YoECRzWOc6" role="2ShVmc">
                <node concept="3uibUv" id="1YoECRzWOc7" role="HW$YZ">
                  <ref role="3uigEE" to="2gg1:~IErrorReporter" resolve="IErrorReporter" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1YoECRzWOc8" role="3cqZAp">
          <node concept="2OqwBi" id="1YoECRzWOc9" role="3clFbG">
            <node concept="37vLTw" id="1YoECRzWOca" role="2Oq$k0">
              <ref role="3cqZAo" node="1YoECRzWOc2" resolve="result" />
            </node>
            <node concept="X8dFx" id="1YoECRzWOcb" role="2OqNvi">
              <node concept="2OqwBi" id="3fCX6WCBvIi" role="25WWJ7">
                <node concept="2ShNRf" id="63oasX2ebIj" role="2Oq$k0">
                  <node concept="1pGfFk" id="63oasX2ebIk" role="2ShVmc">
                    <ref role="37wK5l" to="k8ev:4yqv8vrxVuu" resolve="TypesystemChecker" />
                  </node>
                </node>
                <node concept="liA8E" id="3fCX6WCBvIk" role="2OqNvi">
                  <ref role="37wK5l" to="k8ev:4yqv8vrxVuB" resolve="getErrors" />
                  <node concept="37vLTw" id="3fCX6WCBvIm" role="37wK5m">
                    <ref role="3cqZAo" node="3fCX6WCBvHQ" resolve="myRoot" />
                  </node>
                  <node concept="10Nm6u" id="3fCX6WCBvIo" role="37wK5m" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1YoECRzWOcd" role="3cqZAp">
          <node concept="2OqwBi" id="1YoECRzWOce" role="3clFbG">
            <node concept="37vLTw" id="1YoECRzWOcf" role="2Oq$k0">
              <ref role="3cqZAo" node="1YoECRzWOc2" resolve="result" />
            </node>
            <node concept="X8dFx" id="1YoECRzWOcg" role="2OqNvi">
              <node concept="2OqwBi" id="63oasX2e11f" role="25WWJ7">
                <node concept="2ShNRf" id="3fCX6WCBvI_" role="2Oq$k0">
                  <node concept="1pGfFk" id="3fCX6WCBvIA" role="2ShVmc">
                    <ref role="37wK5l" to="wsw7:2UMCgvoqxz3" resolve="LanguageChecker" />
                  </node>
                </node>
                <node concept="liA8E" id="63oasX2e1OB" role="2OqNvi">
                  <ref role="37wK5l" to="wsw7:6qi2OtU3unN" resolve="getErrors" />
                  <node concept="37vLTw" id="63oasX2ebiu" role="37wK5m">
                    <ref role="3cqZAo" node="3fCX6WCBvHQ" resolve="myRoot" />
                  </node>
                  <node concept="10Nm6u" id="63oasX2ebyb" role="37wK5m" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="4FNJx8ts4x6" role="3cqZAp">
          <node concept="2YIFZM" id="4FNJx8ts6go" role="3clFbG">
            <ref role="37wK5l" to="6if8:~ValidationUtil.validateModelContent(java.lang.Iterable,org.jetbrains.mps.openapi.util.Processor):void" resolve="validateModelContent" />
            <ref role="1Pybhc" to="6if8:~ValidationUtil" resolve="ValidationUtil" />
            <node concept="2ShNRf" id="4FNJx8ts7CM" role="37wK5m">
              <node concept="2HTt$P" id="4FNJx8tsAqT" role="2ShVmc">
                <node concept="3Tqbb2" id="4FNJx8tsAsC" role="2HTBi0" />
                <node concept="37vLTw" id="4FNJx8tsAvi" role="2HTEbv">
                  <ref role="3cqZAo" node="3fCX6WCBvHQ" resolve="myRoot" />
                </node>
              </node>
            </node>
            <node concept="1bVj0M" id="4FNJx8tsE_T" role="37wK5m">
              <node concept="3clFbS" id="4FNJx8tsE_V" role="1bW5cS">
                <node concept="3clFbJ" id="4FNJx8tsER9" role="3cqZAp">
                  <node concept="3clFbS" id="4FNJx8tsERb" role="3clFbx">
                    <node concept="3cpWs6" id="4FNJx8tsHz$" role="3cqZAp">
                      <node concept="3clFbT" id="4FNJx8tsHBL" role="3cqZAk">
                        <property role="3clFbU" value="true" />
                      </node>
                    </node>
                  </node>
                  <node concept="3fqX7Q" id="4FNJx8tsEVz" role="3clFbw">
                    <node concept="1eOMI4" id="4FNJx8tsF35" role="3fr31v">
                      <node concept="2ZW3vV" id="4FNJx8tsF7c" role="1eOMHV">
                        <node concept="3uibUv" id="4FNJx8tsHv0" role="2ZW6by">
                          <ref role="3uigEE" to="6if8:~NodeValidationProblem" resolve="NodeValidationProblem" />
                        </node>
                        <node concept="37vLTw" id="4FNJx8tsF36" role="2ZW6bz">
                          <ref role="3cqZAo" node="4FNJx8tsED4" resolve="vp" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3cpWs8" id="4FNJx8tsIne" role="3cqZAp">
                  <node concept="3cpWsn" id="4FNJx8tsInf" role="3cpWs9">
                    <property role="TrG5h" value="node" />
                    <node concept="3uibUv" id="4FNJx8tsInb" role="1tU5fm">
                      <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
                    </node>
                    <node concept="2OqwBi" id="4FNJx8tsIng" role="33vP2m">
                      <node concept="1eOMI4" id="4FNJx8tsInh" role="2Oq$k0">
                        <node concept="10QFUN" id="4FNJx8tsIni" role="1eOMHV">
                          <node concept="37vLTw" id="4FNJx8tsInj" role="10QFUP">
                            <ref role="3cqZAo" node="4FNJx8tsED4" resolve="vp" />
                          </node>
                          <node concept="3uibUv" id="4FNJx8tsInk" role="10QFUM">
                            <ref role="3uigEE" to="6if8:~NodeValidationProblem" resolve="NodeValidationProblem" />
                          </node>
                        </node>
                      </node>
                      <node concept="liA8E" id="4FNJx8tsInl" role="2OqNvi">
                        <ref role="37wK5l" to="6if8:~NodeValidationProblem.getNode():org.jetbrains.mps.openapi.model.SNode" resolve="getNode" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbF" id="4FNJx8tsIOA" role="3cqZAp">
                  <node concept="2OqwBi" id="4FNJx8tsKd$" role="3clFbG">
                    <node concept="37vLTw" id="4FNJx8tsIO$" role="2Oq$k0">
                      <ref role="3cqZAo" node="1YoECRzWOc2" resolve="result" />
                    </node>
                    <node concept="TSZUe" id="4FNJx8tsLbN" role="2OqNvi">
                      <node concept="2ShNRf" id="4FNJx8tsMfh" role="25WWJ7">
                        <node concept="1pGfFk" id="4FNJx8tsNDX" role="2ShVmc">
                          <ref role="37wK5l" to="2gg1:~SimpleErrorReporter.&lt;init&gt;(org.jetbrains.mps.openapi.model.SNode,java.lang.String,java.lang.String,java.lang.String)" resolve="SimpleErrorReporter" />
                          <node concept="37vLTw" id="4FNJx8tsO8j" role="37wK5m">
                            <ref role="3cqZAo" node="4FNJx8tsInf" resolve="node" />
                          </node>
                          <node concept="2OqwBi" id="4FNJx8tsOz3" role="37wK5m">
                            <node concept="37vLTw" id="4FNJx8tsOkn" role="2Oq$k0">
                              <ref role="3cqZAo" node="4FNJx8tsED4" resolve="vp" />
                            </node>
                            <node concept="liA8E" id="4FNJx8tsOJg" role="2OqNvi">
                              <ref role="37wK5l" to="6if8:~ValidationProblem.getMessage():java.lang.String" resolve="getMessage" />
                            </node>
                          </node>
                          <node concept="10Nm6u" id="4FNJx8tsOW8" role="37wK5m" />
                          <node concept="10Nm6u" id="4FNJx8tsP90" role="37wK5m" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3cpWs6" id="4FNJx8tsM0S" role="3cqZAp">
                  <node concept="3clFbT" id="4FNJx8tsM0T" role="3cqZAk">
                    <property role="3clFbU" value="true" />
                  </node>
                </node>
              </node>
              <node concept="37vLTG" id="4FNJx8tsED4" role="1bW2Oz">
                <property role="TrG5h" value="vp" />
                <node concept="3uibUv" id="4FNJx8tsED3" role="1tU5fm">
                  <ref role="3uigEE" to="6if8:~ValidationProblem" resolve="ValidationProblem" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbH" id="3efgZvcN9up" role="3cqZAp" />
        <node concept="3cpWs8" id="3efgZvcMHaW" role="3cqZAp">
          <node concept="3cpWsn" id="3efgZvcMHaX" role="3cpWs9">
            <property role="TrG5h" value="res" />
            <node concept="2hMVRd" id="3efgZvcMMMB" role="1tU5fm">
              <node concept="3uibUv" id="3efgZvcMMMD" role="2hN53Y">
                <ref role="3uigEE" to="2gg1:~IErrorReporter" resolve="IErrorReporter" />
              </node>
            </node>
            <node concept="2ShNRf" id="3efgZvcMVfl" role="33vP2m">
              <node concept="2i4dXS" id="3efgZvcMYae" role="2ShVmc">
                <node concept="3uibUv" id="3efgZvcN34u" role="HW$YZ">
                  <ref role="3uigEE" to="2gg1:~IErrorReporter" resolve="IErrorReporter" />
                </node>
                <node concept="2OqwBi" id="3efgZvcMHaY" role="I$8f6">
                  <node concept="37vLTw" id="3efgZvcMHaZ" role="2Oq$k0">
                    <ref role="3cqZAo" node="1YoECRzWOc2" resolve="result" />
                  </node>
                  <node concept="3zZkjj" id="3efgZvcMHb0" role="2OqNvi">
                    <node concept="1bVj0M" id="3efgZvcMHb1" role="23t8la">
                      <node concept="3clFbS" id="3efgZvcMHb2" role="1bW5cS">
                        <node concept="3clFbF" id="3efgZvcMHb3" role="3cqZAp">
                          <node concept="3fqX7Q" id="3efgZvcMHb4" role="3clFbG">
                            <node concept="2YIFZM" id="3efgZvcMHb5" role="3fr31v">
                              <ref role="1Pybhc" to="wsw7:5TGjZPCODxZ" resolve="ErrorReportUtil" />
                              <ref role="37wK5l" to="wsw7:3efgZvcMhmD" resolve="manuallySuppressed" />
                              <node concept="2OqwBi" id="3efgZvcMHb6" role="37wK5m">
                                <node concept="37vLTw" id="3efgZvcMHb7" role="2Oq$k0">
                                  <ref role="3cqZAo" node="3efgZvcMHb9" resolve="it" />
                                </node>
                                <node concept="liA8E" id="3efgZvcMHb8" role="2OqNvi">
                                  <ref role="37wK5l" to="2gg1:~IErrorReporter.getSNode():org.jetbrains.mps.openapi.model.SNode" resolve="getSNode" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="Rh6nW" id="3efgZvcMHb9" role="1bW2Oz">
                        <property role="TrG5h" value="it" />
                        <node concept="2jxLKc" id="3efgZvcMHba" role="1tU5fm" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1YoECRzWOci" role="3cqZAp">
          <node concept="2OqwBi" id="1YoECRzWOcj" role="3clFbG">
            <node concept="10M0yZ" id="7ofrMmP9H8R" role="2Oq$k0">
              <ref role="3cqZAo" node="16WnrUwrkaI" resolve="ourModelErrorsHolder" />
              <ref role="1PxDUh" node="3fCX6WCBvHP" resolve="TestsErrorsChecker" />
            </node>
            <node concept="liA8E" id="1YoECRzWOcl" role="2OqNvi">
              <ref role="37wK5l" node="4zLXJmJw9Sj" resolve="set" />
              <node concept="37vLTw" id="1YoECRzWOcn" role="37wK5m">
                <ref role="3cqZAo" node="3fCX6WCBvHQ" resolve="myRoot" />
              </node>
              <node concept="37vLTw" id="3efgZvcMKNM" role="37wK5m">
                <ref role="3cqZAo" node="3efgZvcMHaX" resolve="res" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="1YoECRzWOcq" role="3cqZAp">
          <node concept="37vLTw" id="3efgZvcMKUz" role="3cqZAk">
            <ref role="3cqZAo" node="3efgZvcMHaX" resolve="res" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="6Ek5dow8VaW" role="jymVt" />
    <node concept="312cEu" id="4zLXJmJvOQ8" role="jymVt">
      <property role="2bfB8j" value="false" />
      <property role="1sVAO0" value="false" />
      <property role="1EXbeo" value="false" />
      <property role="TrG5h" value="ModelErrorsHolder" />
      <node concept="3Tm6S6" id="4zLXJmJvOiL" role="1B3o_S" />
      <node concept="312cEg" id="4zLXJmJxRag" role="jymVt">
        <property role="IEkAT" value="false" />
        <property role="3TUv4t" value="false" />
        <property role="TrG5h" value="myCachedErrors" />
        <node concept="2hMVRd" id="4zLXJmJxQPX" role="1tU5fm">
          <node concept="16syzq" id="4zLXJmJxWzg" role="2hN53Y">
            <ref role="16sUi3" node="4zLXJmJxAQt" resolve="T" />
          </node>
        </node>
        <node concept="3Tm6S6" id="4zLXJmJvPqR" role="1B3o_S" />
      </node>
      <node concept="312cEg" id="4zLXJmJxSGw" role="jymVt">
        <property role="IEkAT" value="false" />
        <property role="TrG5h" value="myRoot" />
        <property role="3TUv4t" value="false" />
        <node concept="3Tqbb2" id="4u_hDHVBwQJ" role="1tU5fm" />
        <node concept="3Tm6S6" id="4zLXJmJvRcj" role="1B3o_S" />
      </node>
      <node concept="2tJIrI" id="4zLXJmJvRey" role="jymVt" />
      <node concept="3clFb_" id="4zLXJmJvRk$" role="jymVt">
        <property role="1EzhhJ" value="false" />
        <property role="TrG5h" value="get" />
        <property role="od$2w" value="false" />
        <property role="DiZV1" value="false" />
        <node concept="3clFbS" id="4zLXJmJvRkB" role="3clF47">
          <node concept="3clFbJ" id="4zLXJmJvRnn" role="3cqZAp">
            <node concept="1Wc70l" id="4u_hDHVBUzg" role="3clFbw">
              <node concept="1rXfSq" id="4u_hDHVLFUM" role="3uHU7w">
                <ref role="37wK5l" node="4u_hDHVLFUI" resolve="sameRoot" />
                <node concept="37vLTw" id="4u_hDHVLFUL" role="37wK5m">
                  <ref role="3cqZAo" node="4zLXJmJw57R" resolve="root" />
                </node>
              </node>
              <node concept="3y3z36" id="4zLXJmJvRPu" role="3uHU7B">
                <node concept="37vLTw" id="4zLXJmJvRo0" role="3uHU7B">
                  <ref role="3cqZAo" node="4zLXJmJxRag" resolve="myCachedErrors" />
                </node>
                <node concept="10Nm6u" id="4zLXJmJvRXo" role="3uHU7w" />
              </node>
            </node>
            <node concept="3clFbS" id="4zLXJmJvRno" role="3clFbx">
              <node concept="3cpWs6" id="4zLXJmJvWwD" role="3cqZAp">
                <node concept="37vLTw" id="4zLXJmJvWFe" role="3cqZAk">
                  <ref role="3cqZAo" node="4zLXJmJxRag" resolve="myCachedErrors" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3cpWs6" id="4zLXJmJw1Sz" role="3cqZAp">
            <node concept="10Nm6u" id="4zLXJmJw27H" role="3cqZAk" />
          </node>
        </node>
        <node concept="3Tm1VV" id="4zLXJmJvRkj" role="1B3o_S" />
        <node concept="2hMVRd" id="4zLXJmJvRmp" role="3clF45">
          <node concept="16syzq" id="4zLXJmJyyx1" role="2hN53Y">
            <ref role="16sUi3" node="4zLXJmJxAQt" resolve="T" />
          </node>
        </node>
        <node concept="2AHcQZ" id="4zLXJmJw2mL" role="2AJF6D">
          <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
        </node>
        <node concept="37vLTG" id="4zLXJmJw57R" role="3clF46">
          <property role="TrG5h" value="root" />
          <node concept="3Tqbb2" id="4u_hDHVBHQ2" role="1tU5fm" />
        </node>
      </node>
      <node concept="2tJIrI" id="4u_hDHVLLhi" role="jymVt" />
      <node concept="3clFb_" id="4u_hDHVLFUI" role="jymVt">
        <property role="TrG5h" value="sameRoot" />
        <node concept="3Tm6S6" id="4u_hDHVLFUJ" role="1B3o_S" />
        <node concept="10P_77" id="4u_hDHVLFUK" role="3clF45" />
        <node concept="37vLTG" id="4u_hDHVLFTr" role="3clF46">
          <property role="TrG5h" value="root" />
          <node concept="3Tqbb2" id="4u_hDHVLFTs" role="1tU5fm" />
        </node>
        <node concept="3clFbS" id="4u_hDHVLFS0" role="3clF47">
          <node concept="3cpWs6" id="4u_hDHVLFTg" role="3cqZAp">
            <node concept="3clFbC" id="6RioKE3DQIa" role="3cqZAk">
              <node concept="37vLTw" id="6RioKE3DV$e" role="3uHU7w">
                <ref role="3cqZAo" node="4zLXJmJxSGw" resolve="myRoot" />
              </node>
              <node concept="37vLTw" id="4u_hDHVLFTt" role="3uHU7B">
                <ref role="3cqZAo" node="4u_hDHVLFTr" resolve="root" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2tJIrI" id="4zLXJmJw9gj" role="jymVt" />
      <node concept="3clFb_" id="4zLXJmJw9Sj" role="jymVt">
        <property role="1EzhhJ" value="false" />
        <property role="TrG5h" value="set" />
        <property role="od$2w" value="false" />
        <property role="DiZV1" value="false" />
        <node concept="3clFbS" id="4zLXJmJw9Sm" role="3clF47">
          <node concept="3clFbF" id="4zLXJmJwaC5" role="3cqZAp">
            <node concept="37vLTI" id="4zLXJmJwaDZ" role="3clFbG">
              <node concept="37vLTw" id="4zLXJmJwaG9" role="37vLTx">
                <ref role="3cqZAo" node="4zLXJmJwa5N" resolve="root" />
              </node>
              <node concept="37vLTw" id="4zLXJmJwaC4" role="37vLTJ">
                <ref role="3cqZAo" node="4zLXJmJxSGw" resolve="myRoot" />
              </node>
            </node>
          </node>
          <node concept="3clFbF" id="4zLXJmJwaIN" role="3cqZAp">
            <node concept="37vLTI" id="4zLXJmJwGyy" role="3clFbG">
              <node concept="37vLTw" id="4zLXJmJwaIM" role="37vLTJ">
                <ref role="3cqZAo" node="4zLXJmJxRag" resolve="myCachedErrors" />
              </node>
              <node concept="2ShNRf" id="4zLXJmJxifx" role="37vLTx">
                <node concept="2i4dXS" id="4zLXJmJxyB4" role="2ShVmc">
                  <node concept="16syzq" id="4zLXJmJxGtp" role="HW$YZ">
                    <ref role="16sUi3" node="4zLXJmJxAQt" resolve="T" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbF" id="4zLXJmJxz_o" role="3cqZAp">
            <node concept="2OqwBi" id="4zLXJmJxzYI" role="3clFbG">
              <node concept="37vLTw" id="4zLXJmJxz_n" role="2Oq$k0">
                <ref role="3cqZAo" node="4zLXJmJxRag" resolve="myCachedErrors" />
              </node>
              <node concept="X8dFx" id="4zLXJmJx$MK" role="2OqNvi">
                <node concept="37vLTw" id="4zLXJmJxA5U" role="25WWJ7">
                  <ref role="3cqZAo" node="4zLXJmJwaiN" resolve="errors" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3Tm1VV" id="4zLXJmJw9EU" role="1B3o_S" />
        <node concept="3cqZAl" id="4zLXJmJw9Sh" role="3clF45" />
        <node concept="37vLTG" id="4zLXJmJwa5N" role="3clF46">
          <property role="TrG5h" value="root" />
          <node concept="3Tqbb2" id="4u_hDHVCwTw" role="1tU5fm" />
        </node>
        <node concept="37vLTG" id="4zLXJmJwaiN" role="3clF46">
          <property role="TrG5h" value="errors" />
          <node concept="2hMVRd" id="4zLXJmJwavS" role="1tU5fm">
            <node concept="16syzq" id="4zLXJmJxFD1" role="2hN53Y">
              <ref role="16sUi3" node="4zLXJmJxAQt" resolve="T" />
            </node>
          </node>
        </node>
      </node>
      <node concept="16euLQ" id="4zLXJmJxAQt" role="16eVyc">
        <property role="TrG5h" value="T" />
      </node>
    </node>
    <node concept="3Tm1VV" id="3fCX6WCBvKk" role="1B3o_S" />
    <node concept="3UR2Jj" id="5CXWFgmWryv" role="lGtFl">
      <node concept="TZ5HI" id="5CXWFgmWsAJ" role="3nqlJM">
        <node concept="TZ5HA" id="5CXWFgmWsAK" role="3HnX3l">
          <node concept="1dT_AC" id="5CXWFgmWtEV" role="1dT_Ay">
            <property role="1dT_AB" value="needs to be united with the common model checking logic. Here we have the second cache of the same things." />
          </node>
        </node>
      </node>
    </node>
    <node concept="2AHcQZ" id="5CXWFgmWsAL" role="2AJF6D">
      <ref role="2AI5Lk" to="wyt6:~Deprecated" resolve="Deprecated" />
    </node>
  </node>
  <node concept="312cEu" id="4_ksyPqOTAx">
    <property role="3GE5qa" value="transformation" />
    <property role="TrG5h" value="TransformationTestLightRunner" />
    <node concept="3clFbW" id="2ky3Rs1tOO6" role="jymVt">
      <node concept="3cqZAl" id="2ky3Rs1tOO7" role="3clF45" />
      <node concept="3clFbS" id="2ky3Rs1tOO9" role="3clF47">
        <node concept="XkiVB" id="2ky3Rs1tQfG" role="3cqZAp">
          <ref role="37wK5l" node="6azle7m2XHD" resolve="TransformationTestRunner" />
          <node concept="2ShNRf" id="2ky3Rs1tQv1" role="37wK5m">
            <node concept="HV5vD" id="2ky3Rs1umcg" role="2ShVmc">
              <ref role="HV5vE" node="2ky3Rs1t$JN" resolve="LightEnvironment" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="2ky3Rs1tNrd" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="2ky3Rs1tPmP" role="jymVt" />
    <node concept="3clFb_" id="4_ksyPqOXjz" role="jymVt">
      <property role="TrG5h" value="initTest" />
      <property role="1EzhhJ" value="false" />
      <node concept="3uibUv" id="4_ksyPqOXj$" role="Sfmx6">
        <ref role="3uigEE" to="wyt6:~Exception" resolve="Exception" />
      </node>
      <node concept="3cqZAl" id="4_ksyPqOXjX" role="3clF45" />
      <node concept="3Tm1VV" id="4_ksyPqOXjY" role="1B3o_S" />
      <node concept="37vLTG" id="4_ksyPqOXjZ" role="3clF46">
        <property role="TrG5h" value="test" />
        <property role="3TUv4t" value="true" />
        <node concept="3uibUv" id="4_ksyPqOXk0" role="1tU5fm">
          <ref role="3uigEE" node="e$hNri9cbt" resolve="TransformationTest" />
        </node>
        <node concept="2AHcQZ" id="4_ksyPqOXk1" role="2AJF6D">
          <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
        </node>
      </node>
      <node concept="37vLTG" id="4_ksyPqOXk2" role="3clF46">
        <property role="TrG5h" value="projectPath" />
        <node concept="2AHcQZ" id="4_ksyPqOXk3" role="2AJF6D">
          <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
        </node>
        <node concept="17QB3L" id="4_ksyPqOXk4" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="4_ksyPqOXk5" role="3clF46">
        <property role="TrG5h" value="modelName" />
        <property role="3TUv4t" value="false" />
        <node concept="17QB3L" id="4_ksyPqOXk6" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="4_ksyPqOXk9" role="3clF46">
        <property role="TrG5h" value="reopenProject" />
        <node concept="10P_77" id="4_ksyPqOXka" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="4_ksyPqOXkb" role="3clF47">
        <node concept="3cpWs8" id="7iFq8OZSZ5W" role="3cqZAp">
          <node concept="3cpWsn" id="7iFq8OZSZ5U" role="3cpWs9">
            <property role="3TUv4t" value="true" />
            <property role="TrG5h" value="testProject" />
            <node concept="3uibUv" id="7iFq8OZSZ9F" role="1tU5fm">
              <ref role="3uigEE" to="z1c3:~Project" resolve="Project" />
            </node>
            <node concept="1rXfSq" id="7iFq8OZUzKm" role="33vP2m">
              <ref role="37wK5l" node="7iFq8OZT5rH" resolve="findProject" />
              <node concept="37vLTw" id="5Jy6yRTOjhE" role="37wK5m">
                <ref role="3cqZAo" node="4_ksyPqOXk5" resolve="modelName" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="5Jy6yRTQhjz" role="3cqZAp">
          <node concept="3clFbS" id="5Jy6yRTQhj_" role="3clFbx">
            <node concept="YS8fn" id="5Jy6yRTQi2J" role="3cqZAp">
              <node concept="2ShNRf" id="5Jy6yRTQi6q" role="YScLw">
                <node concept="1pGfFk" id="5Jy6yRTQj2W" role="2ShVmc">
                  <ref role="37wK5l" to="wyt6:~IllegalStateException.&lt;init&gt;(java.lang.String)" resolve="IllegalStateException" />
                  <node concept="3cpWs3" id="oe_zxYU_y" role="37wK5m">
                    <node concept="Xl_RD" id="oe_zxYUAE" role="3uHU7w">
                      <property role="Xl_RC" value=" was not found" />
                    </node>
                    <node concept="3cpWs3" id="oe_zxYMrC" role="3uHU7B">
                      <node concept="Xl_RD" id="5Jy6yRTQhOf" role="3uHU7B">
                        <property role="Xl_RC" value="Cannot execute test in-process : the context project containing the model " />
                      </node>
                      <node concept="37vLTw" id="oe_zxYTZ0" role="3uHU7w">
                        <ref role="3cqZAo" node="4_ksyPqOXk5" resolve="modelName" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbC" id="5Jy6yRTQhEm" role="3clFbw">
            <node concept="10Nm6u" id="5Jy6yRTQhFy" role="3uHU7w" />
            <node concept="37vLTw" id="5Jy6yRTQhsM" role="3uHU7B">
              <ref role="3cqZAo" node="7iFq8OZSZ5U" resolve="testProject" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="4_ksyPqP76P" role="3cqZAp">
          <node concept="1rXfSq" id="4_ksyPqP76Q" role="3clFbG">
            <ref role="37wK5l" node="5sV3JxOSGjI" resolve="doInitTest" />
            <node concept="37vLTw" id="4_ksyPqP76R" role="37wK5m">
              <ref role="3cqZAo" node="4_ksyPqOXjZ" resolve="test" />
            </node>
            <node concept="37vLTw" id="7iFq8OZT0LG" role="37wK5m">
              <ref role="3cqZAo" node="7iFq8OZSZ5U" resolve="testProject" />
            </node>
            <node concept="37vLTw" id="4_ksyPqP76T" role="37wK5m">
              <ref role="3cqZAo" node="4_ksyPqOXk5" resolve="modelName" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="4_ksyPqP76W" role="3cqZAp">
          <node concept="2OqwBi" id="4_ksyPqP76X" role="3clFbG">
            <node concept="2YIFZM" id="4_ksyPqP76Y" role="2Oq$k0">
              <ref role="1Pybhc" to="w1kc:~ModelAccess" resolve="ModelAccess" />
              <ref role="37wK5l" to="w1kc:~ModelAccess.instance():jetbrains.mps.smodel.ModelAccess" resolve="instance" />
            </node>
            <node concept="liA8E" id="4_ksyPqP76Z" role="2OqNvi">
              <ref role="37wK5l" to="w1kc:~ModelCommandExecutor.flushEventQueue():void" resolve="flushEventQueue" />
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="4_ksyPqOXkc" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="2tJIrI" id="6jL1eIc2Ejh" role="jymVt" />
    <node concept="3clFb_" id="6jL1eIc2Fr3" role="jymVt">
      <property role="TrG5h" value="runTest" />
      <property role="1EzhhJ" value="false" />
      <node concept="37vLTG" id="6jL1eIc2Fr4" role="3clF46">
        <property role="TrG5h" value="projectTest" />
        <property role="3TUv4t" value="true" />
        <node concept="2AHcQZ" id="6jL1eIc2Fr5" role="2AJF6D">
          <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
        </node>
        <node concept="3uibUv" id="6jL1eIc2Fr6" role="1tU5fm">
          <ref role="3uigEE" node="e$hNri9cbt" resolve="TransformationTest" />
        </node>
      </node>
      <node concept="3uibUv" id="6jL1eIc2Fr7" role="Sfmx6">
        <ref role="3uigEE" to="wyt6:~Throwable" resolve="Throwable" />
      </node>
      <node concept="3cqZAl" id="6jL1eIc2Fr8" role="3clF45" />
      <node concept="3Tm1VV" id="6jL1eIc2Ftw" role="1B3o_S" />
      <node concept="37vLTG" id="6jL1eIc2Ftx" role="3clF46">
        <property role="TrG5h" value="className" />
        <node concept="17QB3L" id="6jL1eIc2Fty" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="6jL1eIc2Ftz" role="3clF46">
        <property role="TrG5h" value="methodName" />
        <property role="3TUv4t" value="true" />
        <node concept="17QB3L" id="6jL1eIc2Ft$" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="6jL1eIc2Ft_" role="3clF46">
        <property role="TrG5h" value="runInCommand" />
        <property role="3TUv4t" value="false" />
        <node concept="10P_77" id="6jL1eIc2FtA" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="6jL1eIc2FA3" role="3clF47">
        <node concept="3clFbF" id="6jL1eIc2FAa" role="3cqZAp">
          <node concept="3nyPlj" id="6jL1eIc2FA9" role="3clFbG">
            <ref role="37wK5l" node="6azle7m3uJU" resolve="runTest" />
            <node concept="37vLTw" id="6jL1eIc2FA5" role="37wK5m">
              <ref role="3cqZAo" node="6jL1eIc2Fr4" resolve="projectTest" />
            </node>
            <node concept="37vLTw" id="6jL1eIc2FA6" role="37wK5m">
              <ref role="3cqZAo" node="6jL1eIc2Ftx" resolve="className" />
            </node>
            <node concept="37vLTw" id="6jL1eIc2FA7" role="37wK5m">
              <ref role="3cqZAo" node="6jL1eIc2Ftz" resolve="methodName" />
            </node>
            <node concept="37vLTw" id="6jL1eIc2FA8" role="37wK5m">
              <ref role="3cqZAo" node="6jL1eIc2Ft_" resolve="runInCommand" />
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="6jL1eIc2FA4" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="2tJIrI" id="7iFq8OZT3Lx" role="jymVt" />
    <node concept="3clFb_" id="7iFq8OZT5rH" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="findProject" />
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <node concept="3clFbS" id="7iFq8OZT5rK" role="3clF47">
        <node concept="3cpWs8" id="5Jy6yRTOjMC" role="3cqZAp">
          <node concept="3cpWsn" id="5Jy6yRTOjMD" role="3cpWs9">
            <property role="TrG5h" value="contextModel" />
            <node concept="3uibUv" id="5Jy6yRTOjM_" role="1tU5fm">
              <ref role="3uigEE" to="mhbf:~SModel" resolve="SModel" />
            </node>
            <node concept="1rXfSq" id="5Jy6yRTOjME" role="33vP2m">
              <ref role="37wK5l" node="4zIz0VbYUHq" resolve="findModel" />
              <node concept="37vLTw" id="5Jy6yRTOjMF" role="37wK5m">
                <ref role="3cqZAo" node="5Jy6yRTOidY" resolve="modelName" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="5Jy6yRTPuIk" role="3cqZAp">
          <node concept="3cpWsn" id="5Jy6yRTPuIl" role="3cpWs9">
            <property role="TrG5h" value="contextModule" />
            <node concept="3uibUv" id="5Jy6yRTPuIh" role="1tU5fm">
              <ref role="3uigEE" to="lui2:~SModule" resolve="SModule" />
            </node>
            <node concept="2EnYce" id="5Jy6yRTPuIm" role="33vP2m">
              <node concept="37vLTw" id="5Jy6yRTPuIn" role="2Oq$k0">
                <ref role="3cqZAo" node="5Jy6yRTOjMD" resolve="contextModel" />
              </node>
              <node concept="liA8E" id="5Jy6yRTPuIo" role="2OqNvi">
                <ref role="37wK5l" to="mhbf:~SModel.getModule():org.jetbrains.mps.openapi.module.SModule" resolve="getModule" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="5Jy6yRTPxlW" role="3cqZAp">
          <node concept="3clFbS" id="5Jy6yRTPxlY" role="3clFbx">
            <node concept="3cpWs6" id="5Jy6yRTPymL" role="3cqZAp">
              <node concept="10Nm6u" id="5Jy6yRTPzUC" role="3cqZAk" />
            </node>
          </node>
          <node concept="3clFbC" id="5Jy6yRTPyjC" role="3clFbw">
            <node concept="10Nm6u" id="5Jy6yRTPykO" role="3uHU7w" />
            <node concept="37vLTw" id="5Jy6yRTPydC" role="3uHU7B">
              <ref role="3cqZAo" node="5Jy6yRTPuIl" resolve="contextModule" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="4w5CHoiM$BH" role="3cqZAp">
          <node concept="2OqwBi" id="4w5CHoiMB28" role="3clFbG">
            <node concept="2YIFZM" id="2eLOOWopCZE" role="2Oq$k0">
              <ref role="37wK5l" to="w1kc:~ModelAccess.instance():jetbrains.mps.smodel.ModelAccess" resolve="instance" />
              <ref role="1Pybhc" to="w1kc:~ModelAccess" resolve="ModelAccess" />
            </node>
            <node concept="liA8E" id="4w5CHoiMCdg" role="2OqNvi">
              <ref role="37wK5l" to="w1kc:~ModelCommandExecutor.runReadAction(jetbrains.mps.util.Computable):java.lang.Object" resolve="runReadAction" />
              <node concept="1bVj0M" id="4w5CHoiMCRg" role="37wK5m">
                <node concept="3clFbS" id="4w5CHoiMCRh" role="1bW5cS">
                  <node concept="3cpWs8" id="4w5CHoiLpY8" role="3cqZAp">
                    <node concept="3cpWsn" id="4w5CHoiLpY9" role="3cpWs9">
                      <property role="TrG5h" value="runtimeDeps" />
                      <node concept="3uibUv" id="4w5CHoiLpY3" role="1tU5fm">
                        <ref role="3uigEE" to="33ny:~Collection" resolve="Collection" />
                        <node concept="3uibUv" id="4w5CHoiLpY6" role="11_B2D">
                          <ref role="3uigEE" to="lui2:~SModule" resolve="SModule" />
                        </node>
                      </node>
                      <node concept="2OqwBi" id="4w5CHoiLpYa" role="33vP2m">
                        <node concept="2ShNRf" id="4w5CHoiLpYb" role="2Oq$k0">
                          <node concept="1pGfFk" id="4w5CHoiLpYc" role="2ShVmc">
                            <ref role="37wK5l" to="gp7a:~GlobalModuleDependenciesManager.&lt;init&gt;(org.jetbrains.mps.openapi.module.SModule)" resolve="GlobalModuleDependenciesManager" />
                            <node concept="37vLTw" id="4w5CHoiLpYd" role="37wK5m">
                              <ref role="3cqZAo" node="5Jy6yRTPuIl" resolve="contextModule" />
                            </node>
                          </node>
                        </node>
                        <node concept="liA8E" id="4w5CHoiLpYe" role="2OqNvi">
                          <ref role="37wK5l" to="gp7a:~GlobalModuleDependenciesManager.getModules(jetbrains.mps.project.dependency.GlobalModuleDependenciesManager$Deptype):java.util.Collection" resolve="getModules" />
                          <node concept="Rm8GO" id="4w5CHoiLpYf" role="37wK5m">
                            <ref role="Rm8GQ" to="gp7a:~GlobalModuleDependenciesManager$Deptype.EXECUTE" resolve="EXECUTE" />
                            <ref role="1Px2BO" to="gp7a:~GlobalModuleDependenciesManager$Deptype" resolve="GlobalModuleDependenciesManager.Deptype" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="1DcWWT" id="5Jy6yRTPETt" role="3cqZAp">
                    <node concept="3clFbS" id="5Jy6yRTPETu" role="2LFqv$">
                      <node concept="3cpWs8" id="4w5CHoiM13q" role="3cqZAp">
                        <node concept="3cpWsn" id="4w5CHoiM13r" role="3cpWs9">
                          <property role="TrG5h" value="repo" />
                          <node concept="3uibUv" id="4w5CHoiM13s" role="1tU5fm">
                            <ref role="3uigEE" to="lui2:~SRepository" resolve="SRepository" />
                          </node>
                          <node concept="2OqwBi" id="4w5CHoiM21t" role="33vP2m">
                            <node concept="37vLTw" id="4w5CHoiM1TK" role="2Oq$k0">
                              <ref role="3cqZAo" node="5Jy6yRTPETA" resolve="project" />
                            </node>
                            <node concept="liA8E" id="4w5CHoiM2yD" role="2OqNvi">
                              <ref role="37wK5l" to="z1c3:~Project.getRepository():org.jetbrains.mps.openapi.module.SRepository" resolve="getRepository" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="3cpWs8" id="4w5CHoiMbB7" role="3cqZAp">
                        <node concept="3cpWsn" id="4w5CHoiMbBa" role="3cpWs9">
                          <property role="TrG5h" value="found" />
                          <node concept="10P_77" id="4w5CHoiMbB5" role="1tU5fm" />
                          <node concept="3clFbT" id="4w5CHoiMc$I" role="33vP2m">
                            <property role="3clFbU" value="true" />
                          </node>
                        </node>
                      </node>
                      <node concept="2Gpval" id="4w5CHoiM7sG" role="3cqZAp">
                        <node concept="2GrKxI" id="4w5CHoiM7sI" role="2Gsz3X">
                          <property role="TrG5h" value="module" />
                        </node>
                        <node concept="3clFbS" id="4w5CHoiM7sK" role="2LFqv$">
                          <node concept="3clFbJ" id="4w5CHoiMb3H" role="3cqZAp">
                            <node concept="3clFbS" id="4w5CHoiMb3I" role="3clFbx">
                              <node concept="3clFbF" id="4w5CHoiMcA_" role="3cqZAp">
                                <node concept="37vLTI" id="4w5CHoiMcJi" role="3clFbG">
                                  <node concept="3clFbT" id="4w5CHoiMcKF" role="37vLTx">
                                    <property role="3clFbU" value="false" />
                                  </node>
                                  <node concept="37vLTw" id="4w5CHoiMcA$" role="37vLTJ">
                                    <ref role="3cqZAo" node="4w5CHoiMbBa" resolve="found" />
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node concept="3clFbC" id="4w5CHoiMblI" role="3clFbw">
                              <node concept="2OqwBi" id="4w5CHoiM8Pk" role="3uHU7B">
                                <node concept="37vLTw" id="4w5CHoiM8tZ" role="2Oq$k0">
                                  <ref role="3cqZAo" node="4w5CHoiM13r" resolve="repo" />
                                </node>
                                <node concept="liA8E" id="4w5CHoiM8Wm" role="2OqNvi">
                                  <ref role="37wK5l" to="lui2:~SRepository.getModule(org.jetbrains.mps.openapi.module.SModuleId):org.jetbrains.mps.openapi.module.SModule" resolve="getModule" />
                                  <node concept="2OqwBi" id="4w5CHoiM92n" role="37wK5m">
                                    <node concept="2GrUjf" id="4w5CHoiM8Zp" role="2Oq$k0">
                                      <ref role="2Gs0qQ" node="4w5CHoiM7sI" resolve="module" />
                                    </node>
                                    <node concept="liA8E" id="4w5CHoiMaLj" role="2OqNvi">
                                      <ref role="37wK5l" to="lui2:~SModule.getModuleId():org.jetbrains.mps.openapi.module.SModuleId" resolve="getModuleId" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                              <node concept="10Nm6u" id="4w5CHoiMbka" role="3uHU7w" />
                            </node>
                          </node>
                        </node>
                        <node concept="37vLTw" id="4w5CHoiM8mb" role="2GsD0m">
                          <ref role="3cqZAo" node="4w5CHoiLpY9" resolve="runtimeDeps" />
                        </node>
                      </node>
                      <node concept="3clFbJ" id="4w5CHoiMcZH" role="3cqZAp">
                        <node concept="3clFbS" id="4w5CHoiMcZJ" role="3clFbx">
                          <node concept="3cpWs6" id="4w5CHoiMdZ5" role="3cqZAp">
                            <node concept="37vLTw" id="4w5CHoiMee2" role="3cqZAk">
                              <ref role="3cqZAo" node="5Jy6yRTPETA" resolve="project" />
                            </node>
                          </node>
                        </node>
                        <node concept="37vLTw" id="4w5CHoiMde8" role="3clFbw">
                          <ref role="3cqZAo" node="4w5CHoiMbBa" resolve="found" />
                        </node>
                      </node>
                    </node>
                    <node concept="3cpWsn" id="5Jy6yRTPETA" role="1Duv9x">
                      <property role="TrG5h" value="project" />
                      <node concept="3uibUv" id="5Jy6yRTPETB" role="1tU5fm">
                        <ref role="3uigEE" to="z1c3:~Project" resolve="Project" />
                      </node>
                    </node>
                    <node concept="2OqwBi" id="5Jy6yRTPETC" role="1DdaDG">
                      <node concept="2YIFZM" id="5Jy6yRTPETD" role="2Oq$k0">
                        <ref role="37wK5l" to="z1c3:~ProjectManager.getInstance():jetbrains.mps.project.ProjectManager" resolve="getInstance" />
                        <ref role="1Pybhc" to="z1c3:~ProjectManager" resolve="ProjectManager" />
                      </node>
                      <node concept="liA8E" id="5Jy6yRTPETE" role="2OqNvi">
                        <ref role="37wK5l" to="z1c3:~ProjectManager.getOpenedProjects():java.util.List" resolve="getOpenedProjects" />
                      </node>
                    </node>
                  </node>
                  <node concept="3cpWs6" id="5Jy6yRTQ1Nv" role="3cqZAp">
                    <node concept="10Nm6u" id="5Jy6yRTQ2bk" role="3cqZAk" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="7iFq8OZT4uG" role="1B3o_S" />
      <node concept="3uibUv" id="7iFq8OZT60F" role="3clF45">
        <ref role="3uigEE" to="z1c3:~Project" resolve="Project" />
      </node>
      <node concept="2AHcQZ" id="7iFq8OZUyVW" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
      </node>
      <node concept="37vLTG" id="5Jy6yRTOidY" role="3clF46">
        <property role="TrG5h" value="modelName" />
        <node concept="17QB3L" id="5Jy6yRTOidX" role="1tU5fm" />
      </node>
    </node>
    <node concept="3Tm1VV" id="4_ksyPqOTAy" role="1B3o_S" />
    <node concept="3uibUv" id="4_ksyPqOTBR" role="1zkMxy">
      <ref role="3uigEE" node="6azle7m2XHB" resolve="TransformationTestRunner" />
    </node>
  </node>
  <node concept="312cEu" id="5s44y2LfYy2">
    <property role="3GE5qa" value="util" />
    <property role="TrG5h" value="MouseEventsDispatcher" />
    <node concept="312cEg" id="62Gc_ZToOa_" role="jymVt">
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myEditorTest" />
      <node concept="3Tm6S6" id="62Gc_ZToOaA" role="1B3o_S" />
      <node concept="3uibUv" id="62Gc_ZToP1E" role="1tU5fm">
        <ref role="3uigEE" node="hPMdj4e" resolve="BaseEditorTestBody" />
      </node>
    </node>
    <node concept="2tJIrI" id="5s44y2LhRMx" role="jymVt" />
    <node concept="3clFbW" id="5s44y2LhRMy" role="jymVt">
      <node concept="3cqZAl" id="5s44y2LhRMz" role="3clF45" />
      <node concept="3clFbS" id="5s44y2LhRM$" role="3clF47">
        <node concept="3clFbF" id="62Gc_ZToSgE" role="3cqZAp">
          <node concept="37vLTI" id="62Gc_ZToSr5" role="3clFbG">
            <node concept="37vLTw" id="62Gc_ZToSt5" role="37vLTx">
              <ref role="3cqZAo" node="62Gc_ZToMSd" resolve="editorTest" />
            </node>
            <node concept="37vLTw" id="62Gc_ZToSgC" role="37vLTJ">
              <ref role="3cqZAo" node="62Gc_ZToOa_" resolve="myEditorTest" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5s44y2LhRMD" role="1B3o_S" />
      <node concept="37vLTG" id="62Gc_ZToMSd" role="3clF46">
        <property role="TrG5h" value="editorTest" />
        <node concept="3uibUv" id="62Gc_ZToN0_" role="1tU5fm">
          <ref role="3uigEE" node="hPMdj4e" resolve="BaseEditorTestBody" />
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="5s44y2LhPo8" role="jymVt" />
    <node concept="2YIFZL" id="7jrLbSWXnrL" role="jymVt">
      <property role="TrG5h" value="createMouseEvent" />
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <node concept="3clFbS" id="7jrLbSWXnrO" role="3clF47">
        <node concept="3cpWs6" id="7jrLbSWXqWf" role="3cqZAp">
          <node concept="2ShNRf" id="7jrLbSWXqWY" role="3cqZAk">
            <node concept="1pGfFk" id="7jrLbSWXqWZ" role="2ShVmc">
              <ref role="37wK5l" to="hyam:~MouseEvent.&lt;init&gt;(java.awt.Component,int,long,int,int,int,int,int,int,boolean,int)" resolve="MouseEvent" />
              <node concept="37vLTw" id="7jrLbSWXrJE" role="37wK5m">
                <ref role="3cqZAo" node="7jrLbSWXrsc" resolve="targetComponent" />
              </node>
              <node concept="37vLTw" id="7jrLbSWXx7_" role="37wK5m">
                <ref role="3cqZAo" node="7jrLbSWXsCR" resolve="id" />
              </node>
              <node concept="2YIFZM" id="7jrLbSWXqX2" role="37wK5m">
                <ref role="1Pybhc" to="wyt6:~System" resolve="System" />
                <ref role="37wK5l" to="wyt6:~System.currentTimeMillis():long" resolve="currentTimeMillis" />
              </node>
              <node concept="3cmrfG" id="7jrLbSWXqX3" role="37wK5m">
                <property role="3cmrfH" value="0" />
              </node>
              <node concept="37vLTw" id="7jrLbSWXybl" role="37wK5m">
                <ref role="3cqZAo" node="7jrLbSWXy0w" resolve="x" />
              </node>
              <node concept="37vLTw" id="7jrLbSWXyg6" role="37wK5m">
                <ref role="3cqZAo" node="7jrLbSWXy5t" resolve="y" />
              </node>
              <node concept="37vLTw" id="7jrLbSWXykO" role="37wK5m">
                <ref role="3cqZAo" node="7jrLbSWXy0w" resolve="x" />
              </node>
              <node concept="37vLTw" id="7jrLbSWXypv" role="37wK5m">
                <ref role="3cqZAo" node="7jrLbSWXy5t" resolve="y" />
              </node>
              <node concept="3cmrfG" id="7jrLbSWXqX8" role="37wK5m">
                <property role="3cmrfH" value="1" />
              </node>
              <node concept="3clFbT" id="7jrLbSWXqX9" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
              <node concept="10M0yZ" id="7jrLbSWXqXa" role="37wK5m">
                <ref role="3cqZAo" to="hyam:~MouseEvent.BUTTON1" resolve="BUTTON1" />
                <ref role="1PxDUh" to="hyam:~MouseEvent" resolve="MouseEvent" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="7jrLbSWXkIE" role="1B3o_S" />
      <node concept="3uibUv" id="7jrLbSWXmDy" role="3clF45">
        <ref role="3uigEE" to="hyam:~MouseEvent" resolve="MouseEvent" />
      </node>
      <node concept="37vLTG" id="7jrLbSWXrsc" role="3clF46">
        <property role="TrG5h" value="targetComponent" />
        <node concept="3uibUv" id="7jrLbSWXrsb" role="1tU5fm">
          <ref role="3uigEE" to="z60i:~Component" resolve="Component" />
        </node>
      </node>
      <node concept="37vLTG" id="7jrLbSWXsCR" role="3clF46">
        <property role="TrG5h" value="id" />
        <node concept="10Oyi0" id="7jrLbSWXx5W" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="7jrLbSWXy0w" role="3clF46">
        <property role="TrG5h" value="x" />
        <node concept="10Oyi0" id="7jrLbSWXy4_" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="7jrLbSWXy5t" role="3clF46">
        <property role="TrG5h" value="y" />
        <node concept="10Oyi0" id="7jrLbSWXy9S" role="1tU5fm" />
      </node>
    </node>
    <node concept="2tJIrI" id="5s44y2LfYyI" role="jymVt" />
    <node concept="3clFb_" id="5s44y2Lo_oh" role="jymVt">
      <property role="TrG5h" value="processSecondaryMouseEvent" />
      <property role="DiZV1" value="false" />
      <node concept="3cqZAl" id="bG3Ez5jbNt" role="3clF45" />
      <node concept="37vLTG" id="bG3Ez5jeyv" role="3clF46">
        <property role="TrG5h" value="targetComponent" />
        <property role="3TUv4t" value="true" />
        <node concept="3uibUv" id="3CVcUJxQLOE" role="1tU5fm">
          <ref role="3uigEE" to="z60i:~Component" resolve="Component" />
        </node>
      </node>
      <node concept="37vLTG" id="bG3Ez5jeyx" role="3clF46">
        <property role="TrG5h" value="x" />
        <node concept="10Oyi0" id="bG3Ez5jeyy" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="bG3Ez5jeyz" role="3clF46">
        <property role="TrG5h" value="y" />
        <node concept="10Oyi0" id="bG3Ez5jey$" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="bG3Ez5jqZ4" role="3clF46">
        <property role="TrG5h" value="eventType" />
        <node concept="10Oyi0" id="bG3Ez5jr0N" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="bG3Ez5jbNv" role="3clF47">
        <node concept="3cpWs8" id="4CPWB7q0L89" role="3cqZAp">
          <node concept="3cpWsn" id="4CPWB7q0L8a" role="3cpWs9">
            <property role="TrG5h" value="componentPoint" />
            <node concept="3uibUv" id="4CPWB7q0L8b" role="1tU5fm">
              <ref role="3uigEE" to="z60i:~Point" resolve="Point" />
            </node>
            <node concept="1rXfSq" id="4CPWB7q1bm5" role="33vP2m">
              <ref role="37wK5l" node="4CPWB7q1blZ" resolve="convertToComponent" />
              <node concept="37vLTw" id="4CPWB7q1bm2" role="37wK5m">
                <ref role="3cqZAo" node="bG3Ez5jeyx" resolve="x" />
              </node>
              <node concept="37vLTw" id="4CPWB7q1bm3" role="37wK5m">
                <ref role="3cqZAo" node="bG3Ez5jeyz" resolve="y" />
              </node>
              <node concept="37vLTw" id="4CPWB7q1bm4" role="37wK5m">
                <ref role="3cqZAo" node="bG3Ez5jeyv" resolve="targetComponent" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbH" id="4CPWB7q0KQc" role="3cqZAp" />
        <node concept="3cpWs8" id="bG3Ez5js35" role="3cqZAp">
          <node concept="3cpWsn" id="bG3Ez5js36" role="3cpWs9">
            <property role="TrG5h" value="e" />
            <property role="3TUv4t" value="true" />
            <node concept="3uibUv" id="bG3Ez5js37" role="1tU5fm">
              <ref role="3uigEE" to="hyam:~MouseEvent" resolve="MouseEvent" />
            </node>
            <node concept="2YIFZM" id="5s44y2LhoDq" role="33vP2m">
              <ref role="1Pybhc" node="5s44y2LfYy2" resolve="MouseEventsDispatcher" />
              <ref role="37wK5l" node="7jrLbSWXnrL" resolve="createMouseEvent" />
              <node concept="37vLTw" id="5s44y2LhoDr" role="37wK5m">
                <ref role="3cqZAo" node="bG3Ez5jeyv" resolve="targetComponent" />
              </node>
              <node concept="37vLTw" id="5s44y2LhoDs" role="37wK5m">
                <ref role="3cqZAo" node="bG3Ez5jqZ4" resolve="eventType" />
              </node>
              <node concept="2OqwBi" id="4CPWB7q19bK" role="37wK5m">
                <node concept="37vLTw" id="4CPWB7q1aMd" role="2Oq$k0">
                  <ref role="3cqZAo" node="4CPWB7q0L8a" resolve="componentPoint" />
                </node>
                <node concept="2OwXpG" id="4CPWB7q1aVp" role="2OqNvi">
                  <ref role="2Oxat5" to="z60i:~Point.x" resolve="x" />
                </node>
              </node>
              <node concept="2OqwBi" id="4CPWB7q1bbL" role="37wK5m">
                <node concept="37vLTw" id="4CPWB7q1b5D" role="2Oq$k0">
                  <ref role="3cqZAo" node="4CPWB7q0L8a" resolve="componentPoint" />
                </node>
                <node concept="2OwXpG" id="4CPWB7q1bhk" role="2OqNvi">
                  <ref role="2Oxat5" to="z60i:~Point.y" resolve="y" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5s44y2LosjG" role="3cqZAp">
          <node concept="2OqwBi" id="5s44y2Loswo" role="3clFbG">
            <node concept="37vLTw" id="62Gc_ZToVnf" role="2Oq$k0">
              <ref role="3cqZAo" node="62Gc_ZToOa_" resolve="myEditorTest" />
            </node>
            <node concept="liA8E" id="5s44y2LosF5" role="2OqNvi">
              <ref role="37wK5l" node="62Gc_ZTkJBT" resolve="runUndoableInEDTAndWait" />
              <node concept="1bVj0M" id="5s44y2LosMx" role="37wK5m">
                <node concept="3clFbS" id="5s44y2LosMy" role="1bW5cS">
                  <node concept="3clFbF" id="5s44y2LosV6" role="3cqZAp">
                    <node concept="2OqwBi" id="5s44y2LosV7" role="3clFbG">
                      <node concept="37vLTw" id="5s44y2LosV8" role="2Oq$k0">
                        <ref role="3cqZAo" node="bG3Ez5jeyv" resolve="targetComponent" />
                      </node>
                      <node concept="liA8E" id="5s44y2LosV9" role="2OqNvi">
                        <ref role="37wK5l" to="z60i:~Component.dispatchEvent(java.awt.AWTEvent):void" resolve="dispatchEvent" />
                        <node concept="37vLTw" id="5s44y2LosVa" role="37wK5m">
                          <ref role="3cqZAo" node="bG3Ez5js36" resolve="e" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="bG3Ez5jz6L" role="Sfmx6">
        <ref role="3uigEE" to="t6h5:~InvocationTargetException" resolve="InvocationTargetException" />
      </node>
      <node concept="3uibUv" id="bG3Ez5j$4G" role="Sfmx6">
        <ref role="3uigEE" to="wyt6:~InterruptedException" resolve="InterruptedException" />
      </node>
      <node concept="3Tm1VV" id="bG3Ez5jbNu" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="4CPWB7q1bLY" role="jymVt" />
    <node concept="3clFb_" id="4CPWB7q1blZ" role="jymVt">
      <property role="TrG5h" value="convertToComponent" />
      <node concept="3Tm6S6" id="4CPWB7q1bm0" role="1B3o_S" />
      <node concept="3uibUv" id="4CPWB7q1bm1" role="3clF45">
        <ref role="3uigEE" to="z60i:~Point" resolve="Point" />
      </node>
      <node concept="37vLTG" id="4CPWB7q1blO" role="3clF46">
        <property role="TrG5h" value="x" />
        <node concept="10Oyi0" id="4CPWB7q1blP" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="4CPWB7q1blQ" role="3clF46">
        <property role="TrG5h" value="y" />
        <node concept="10Oyi0" id="4CPWB7q1blR" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="4CPWB7q1blS" role="3clF46">
        <property role="TrG5h" value="targetComponent" />
        <property role="3TUv4t" value="true" />
        <node concept="3uibUv" id="4CPWB7q1blT" role="1tU5fm">
          <ref role="3uigEE" to="z60i:~Component" resolve="Component" />
        </node>
      </node>
      <node concept="3clFbS" id="4CPWB7q1blb" role="3clF47">
        <node concept="3cpWs8" id="4CPWB7q1ble" role="3cqZAp">
          <node concept="3cpWsn" id="4CPWB7q1blf" role="3cpWs9">
            <property role="TrG5h" value="editorComponent" />
            <property role="3TUv4t" value="true" />
            <node concept="3uibUv" id="4CPWB7q1blg" role="1tU5fm">
              <ref role="3uigEE" to="exr9:~EditorComponent" resolve="EditorComponent" />
            </node>
            <node concept="2OqwBi" id="4CPWB7q1blh" role="33vP2m">
              <node concept="37vLTw" id="4CPWB7q1bli" role="2Oq$k0">
                <ref role="3cqZAo" node="62Gc_ZToOa_" resolve="myEditorTest" />
              </node>
              <node concept="liA8E" id="4CPWB7q1blj" role="2OqNvi">
                <ref role="37wK5l" node="1BrKW0d9mQ7" resolve="getEditorComponent" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="4CPWB7q1blk" role="3cqZAp">
          <node concept="3cpWsn" id="4CPWB7q1bll" role="3cpWs9">
            <property role="TrG5h" value="rootCell" />
            <node concept="3uibUv" id="4CPWB7q1blm" role="1tU5fm">
              <ref role="3uigEE" to="g51k:~EditorCell" resolve="EditorCell" />
            </node>
            <node concept="2OqwBi" id="4CPWB7q1bln" role="33vP2m">
              <node concept="37vLTw" id="4CPWB7q1blo" role="2Oq$k0">
                <ref role="3cqZAo" node="4CPWB7q1blf" resolve="editorComponent" />
              </node>
              <node concept="liA8E" id="4CPWB7q1blp" role="2OqNvi">
                <ref role="37wK5l" to="exr9:~EditorComponent.getRootCell():jetbrains.mps.nodeEditor.cells.EditorCell" resolve="getRootCell" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="4CPWB7q1blM" role="3cqZAp">
          <node concept="2YIFZM" id="4CPWB7q1blI" role="3cqZAk">
            <ref role="1Pybhc" to="dxuu:~SwingUtilities" resolve="SwingUtilities" />
            <ref role="37wK5l" to="dxuu:~SwingUtilities.convertPoint(java.awt.Component,int,int,java.awt.Component):java.awt.Point" resolve="convertPoint" />
            <node concept="37vLTw" id="4CPWB7q1blJ" role="37wK5m">
              <ref role="3cqZAo" node="4CPWB7q1blf" resolve="editorComponent" />
            </node>
            <node concept="3cpWs3" id="4CPWB7q1jTd" role="37wK5m">
              <node concept="2OqwBi" id="4CPWB7q1k$Y" role="3uHU7w">
                <node concept="37vLTw" id="4CPWB7q1kf8" role="2Oq$k0">
                  <ref role="3cqZAo" node="4CPWB7q1bll" resolve="rootCell" />
                </node>
                <node concept="liA8E" id="4CPWB7q1kUb" role="2OqNvi">
                  <ref role="37wK5l" to="f4zo:~EditorCell.getX():int" resolve="getX" />
                </node>
              </node>
              <node concept="37vLTw" id="4CPWB7q1jtr" role="3uHU7B">
                <ref role="3cqZAo" node="4CPWB7q1blO" resolve="x" />
              </node>
            </node>
            <node concept="3cpWs3" id="4CPWB7q1mnP" role="37wK5m">
              <node concept="2OqwBi" id="4CPWB7q1n3_" role="3uHU7w">
                <node concept="37vLTw" id="4CPWB7q1mHn" role="2Oq$k0">
                  <ref role="3cqZAo" node="4CPWB7q1bll" resolve="rootCell" />
                </node>
                <node concept="liA8E" id="4CPWB7q1np8" role="2OqNvi">
                  <ref role="37wK5l" to="f4zo:~EditorCell.getY():int" resolve="getY" />
                </node>
              </node>
              <node concept="37vLTw" id="4CPWB7q1lVB" role="3uHU7B">
                <ref role="3cqZAo" node="4CPWB7q1blQ" resolve="y" />
              </node>
            </node>
            <node concept="37vLTw" id="4CPWB7q1blV" role="37wK5m">
              <ref role="3cqZAo" node="4CPWB7q1blS" resolve="targetComponent" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="2j6lZA3yXt5" role="jymVt" />
    <node concept="3clFb_" id="5s44y2LhEs2" role="jymVt">
      <property role="TrG5h" value="processMouseEvent" />
      <property role="DiZV1" value="false" />
      <node concept="3uibUv" id="5s44y2LhEs3" role="3clF45">
        <ref role="3uigEE" to="z60i:~Component" resolve="Component" />
      </node>
      <node concept="37vLTG" id="5s44y2LhEs4" role="3clF46">
        <property role="TrG5h" value="x" />
        <node concept="10Oyi0" id="5s44y2LhEs5" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="5s44y2LhEs6" role="3clF46">
        <property role="TrG5h" value="y" />
        <node concept="10Oyi0" id="5s44y2LhEs7" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="5s44y2LhEs8" role="3clF46">
        <property role="TrG5h" value="eventType" />
        <node concept="10Oyi0" id="5s44y2LhEs9" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="5s44y2LhEsa" role="3clF47">
        <node concept="3cpWs8" id="4CPWB7q00tu" role="3cqZAp">
          <node concept="3cpWsn" id="4CPWB7q00tv" role="3cpWs9">
            <property role="TrG5h" value="editorComponent" />
            <property role="3TUv4t" value="true" />
            <node concept="3uibUv" id="4CPWB7q00tr" role="1tU5fm">
              <ref role="3uigEE" to="exr9:~EditorComponent" resolve="EditorComponent" />
            </node>
            <node concept="2OqwBi" id="4CPWB7q00tw" role="33vP2m">
              <node concept="37vLTw" id="4CPWB7q00tx" role="2Oq$k0">
                <ref role="3cqZAo" node="62Gc_ZToOa_" resolve="myEditorTest" />
              </node>
              <node concept="liA8E" id="4CPWB7q00ty" role="2OqNvi">
                <ref role="37wK5l" node="1BrKW0d9mQ7" resolve="getEditorComponent" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="5s44y2LhEsg" role="3cqZAp">
          <node concept="3cpWsn" id="5s44y2LhEsh" role="3cpWs9">
            <property role="TrG5h" value="rootCell" />
            <node concept="3uibUv" id="5s44y2LhEsi" role="1tU5fm">
              <ref role="3uigEE" to="g51k:~EditorCell" resolve="EditorCell" />
            </node>
            <node concept="2OqwBi" id="5s44y2LhEsj" role="33vP2m">
              <node concept="37vLTw" id="4CPWB7q00t$" role="2Oq$k0">
                <ref role="3cqZAo" node="4CPWB7q00tv" resolve="editorComponent" />
              </node>
              <node concept="liA8E" id="5s44y2LhEsl" role="2OqNvi">
                <ref role="37wK5l" to="exr9:~EditorComponent.getRootCell():jetbrains.mps.nodeEditor.cells.EditorCell" resolve="getRootCell" />
              </node>
            </node>
          </node>
        </node>
        <node concept="1gVbGN" id="5s44y2LhEsm" role="3cqZAp">
          <node concept="3y3z36" id="5s44y2LhEsn" role="1gVkn0">
            <node concept="10Nm6u" id="5s44y2LhEso" role="3uHU7w" />
            <node concept="37vLTw" id="5s44y2LhEsp" role="3uHU7B">
              <ref role="3cqZAo" node="5s44y2LhEsh" resolve="rootCell" />
            </node>
          </node>
        </node>
        <node concept="3clFbH" id="4CPWB7q01lL" role="3cqZAp" />
        <node concept="3cpWs8" id="5s44y2LhEsq" role="3cqZAp">
          <node concept="3cpWsn" id="5s44y2LhEsr" role="3cpWs9">
            <property role="TrG5h" value="cellCandidates" />
            <node concept="3O6Q9H" id="5s44y2LhEss" role="1tU5fm">
              <node concept="3uibUv" id="5s44y2LhEst" role="3O5elw">
                <ref role="3uigEE" to="f4zo:~EditorCell" resolve="EditorCell" />
              </node>
            </node>
            <node concept="2ShNRf" id="5s44y2LhEsu" role="33vP2m">
              <node concept="2Jqq0_" id="5s44y2LhEsv" role="2ShVmc">
                <node concept="3uibUv" id="5s44y2LhEsw" role="HW$YZ">
                  <ref role="3uigEE" to="f4zo:~EditorCell" resolve="EditorCell" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5s44y2LhEsx" role="3cqZAp">
          <node concept="2OqwBi" id="5s44y2LhEsy" role="3clFbG">
            <node concept="37vLTw" id="5s44y2LhEsz" role="2Oq$k0">
              <ref role="3cqZAo" node="5s44y2LhEsr" resolve="cellCandidates" />
            </node>
            <node concept="2Ke9KJ" id="5s44y2LhEs$" role="2OqNvi">
              <node concept="37vLTw" id="5s44y2LhEs_" role="25WWJ7">
                <ref role="3cqZAo" node="5s44y2LhEsh" resolve="rootCell" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="5s44y2LhEsA" role="3cqZAp">
          <node concept="3cpWsn" id="5s44y2LhEsB" role="3cpWs9">
            <property role="TrG5h" value="editorX" />
            <node concept="10Oyi0" id="5s44y2LhEsC" role="1tU5fm" />
            <node concept="3cpWs3" id="5s44y2LhEsD" role="33vP2m">
              <node concept="2OqwBi" id="5s44y2LhEsE" role="3uHU7w">
                <node concept="37vLTw" id="5s44y2LhEsF" role="2Oq$k0">
                  <ref role="3cqZAo" node="5s44y2LhEsh" resolve="rootCell" />
                </node>
                <node concept="liA8E" id="5s44y2LhEsG" role="2OqNvi">
                  <ref role="37wK5l" to="f4zo:~EditorCell.getX():int" resolve="getX" />
                </node>
              </node>
              <node concept="37vLTw" id="5s44y2LhEsH" role="3uHU7B">
                <ref role="3cqZAo" node="5s44y2LhEs4" resolve="x" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="5s44y2LhEsI" role="3cqZAp">
          <node concept="3cpWsn" id="5s44y2LhEsJ" role="3cpWs9">
            <property role="TrG5h" value="editorY" />
            <node concept="10Oyi0" id="5s44y2LhEsK" role="1tU5fm" />
            <node concept="3cpWs3" id="5s44y2LhEsL" role="33vP2m">
              <node concept="2OqwBi" id="5s44y2LhEsM" role="3uHU7w">
                <node concept="37vLTw" id="5s44y2LhEsN" role="2Oq$k0">
                  <ref role="3cqZAo" node="5s44y2LhEsh" resolve="rootCell" />
                </node>
                <node concept="liA8E" id="5s44y2LhEsO" role="2OqNvi">
                  <ref role="37wK5l" to="f4zo:~EditorCell.getY():int" resolve="getY" />
                </node>
              </node>
              <node concept="37vLTw" id="5s44y2LhEsP" role="3uHU7B">
                <ref role="3cqZAo" node="5s44y2LhEs6" resolve="y" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="5s44y2LhEsQ" role="3cqZAp">
          <node concept="3cpWsn" id="5s44y2LhEsR" role="3cpWs9">
            <property role="TrG5h" value="eventTargetCell" />
            <node concept="3uibUv" id="5s44y2LhEsS" role="1tU5fm">
              <ref role="3uigEE" to="f4zo:~EditorCell" resolve="EditorCell" />
            </node>
            <node concept="10Nm6u" id="5s44y2LhEsT" role="33vP2m" />
          </node>
        </node>
        <node concept="2$JKZl" id="5s44y2LhEsU" role="3cqZAp">
          <node concept="3clFbS" id="5s44y2LhEsV" role="2LFqv$">
            <node concept="3cpWs8" id="5s44y2LhEsW" role="3cqZAp">
              <node concept="3cpWsn" id="5s44y2LhEsX" role="3cpWs9">
                <property role="TrG5h" value="nextCell" />
                <node concept="3uibUv" id="5s44y2LhEsY" role="1tU5fm">
                  <ref role="3uigEE" to="f4zo:~EditorCell" resolve="EditorCell" />
                </node>
                <node concept="2OqwBi" id="5s44y2LhEsZ" role="33vP2m">
                  <node concept="37vLTw" id="5s44y2LhEt0" role="2Oq$k0">
                    <ref role="3cqZAo" node="5s44y2LhEsr" resolve="cellCandidates" />
                  </node>
                  <node concept="2Kt2Hk" id="5s44y2LhEt1" role="2OqNvi" />
                </node>
              </node>
            </node>
            <node concept="3clFbJ" id="5s44y2LhEt2" role="3cqZAp">
              <node concept="3clFbS" id="5s44y2LhEt3" role="3clFbx">
                <node concept="3clFbF" id="5s44y2LhEt4" role="3cqZAp">
                  <node concept="37vLTI" id="5s44y2LhEt5" role="3clFbG">
                    <node concept="37vLTw" id="5s44y2LhEt6" role="37vLTx">
                      <ref role="3cqZAo" node="5s44y2LhEsX" resolve="nextCell" />
                    </node>
                    <node concept="37vLTw" id="5s44y2LhEt7" role="37vLTJ">
                      <ref role="3cqZAo" node="5s44y2LhEsR" resolve="eventTargetCell" />
                    </node>
                  </node>
                </node>
                <node concept="3clFbJ" id="5s44y2LhEt8" role="3cqZAp">
                  <node concept="3clFbS" id="5s44y2LhEt9" role="3clFbx">
                    <node concept="3clFbF" id="5s44y2LhEta" role="3cqZAp">
                      <node concept="2OqwBi" id="5s44y2LhEtb" role="3clFbG">
                        <node concept="37vLTw" id="5s44y2LhEtc" role="2Oq$k0">
                          <ref role="3cqZAo" node="5s44y2LhEsr" resolve="cellCandidates" />
                        </node>
                        <node concept="X8dFx" id="5s44y2LhEtd" role="2OqNvi">
                          <node concept="10QFUN" id="5s44y2LhEte" role="25WWJ7">
                            <node concept="3uibUv" id="5s44y2LhEtf" role="10QFUM">
                              <ref role="3uigEE" to="f4zo:~EditorCell_Collection" resolve="EditorCell_Collection" />
                            </node>
                            <node concept="37vLTw" id="5s44y2LhEtg" role="10QFUP">
                              <ref role="3cqZAo" node="5s44y2LhEsX" resolve="nextCell" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="2ZW3vV" id="5s44y2LhEth" role="3clFbw">
                    <node concept="3uibUv" id="5s44y2LhEti" role="2ZW6by">
                      <ref role="3uigEE" to="f4zo:~EditorCell_Collection" resolve="EditorCell_Collection" />
                    </node>
                    <node concept="37vLTw" id="5s44y2LhEtj" role="2ZW6bz">
                      <ref role="3cqZAo" node="5s44y2LhEsX" resolve="nextCell" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="1Wc70l" id="5s44y2LhEtk" role="3clFbw">
                <node concept="3eOSWO" id="5s44y2LhEtl" role="3uHU7w">
                  <node concept="37vLTw" id="5s44y2LhEtm" role="3uHU7w">
                    <ref role="3cqZAo" node="5s44y2LhEsJ" resolve="editorY" />
                  </node>
                  <node concept="3cpWs3" id="5s44y2LhEtn" role="3uHU7B">
                    <node concept="2OqwBi" id="5s44y2LhEto" role="3uHU7B">
                      <node concept="37vLTw" id="5s44y2LhEtp" role="2Oq$k0">
                        <ref role="3cqZAo" node="5s44y2LhEsX" resolve="nextCell" />
                      </node>
                      <node concept="liA8E" id="5s44y2LhEtq" role="2OqNvi">
                        <ref role="37wK5l" to="f4zo:~EditorCell.getY():int" resolve="getY" />
                      </node>
                    </node>
                    <node concept="2OqwBi" id="5s44y2LhEtr" role="3uHU7w">
                      <node concept="37vLTw" id="5s44y2LhEts" role="2Oq$k0">
                        <ref role="3cqZAo" node="5s44y2LhEsX" resolve="nextCell" />
                      </node>
                      <node concept="liA8E" id="5s44y2LhEtt" role="2OqNvi">
                        <ref role="37wK5l" to="f4zo:~EditorCell.getHeight():int" resolve="getHeight" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="1Wc70l" id="5s44y2LhEtu" role="3uHU7B">
                  <node concept="1Wc70l" id="5s44y2LhEtv" role="3uHU7B">
                    <node concept="2dkUwp" id="5s44y2LhEtw" role="3uHU7B">
                      <node concept="2OqwBi" id="5s44y2LhEtx" role="3uHU7B">
                        <node concept="37vLTw" id="5s44y2LhEty" role="2Oq$k0">
                          <ref role="3cqZAo" node="5s44y2LhEsX" resolve="nextCell" />
                        </node>
                        <node concept="liA8E" id="5s44y2LhEtz" role="2OqNvi">
                          <ref role="37wK5l" to="f4zo:~EditorCell.getX():int" resolve="getX" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="5s44y2LhEt$" role="3uHU7w">
                        <ref role="3cqZAo" node="5s44y2LhEsB" resolve="editorX" />
                      </node>
                    </node>
                    <node concept="2dkUwp" id="5s44y2LhEt_" role="3uHU7w">
                      <node concept="2OqwBi" id="5s44y2LhEtA" role="3uHU7B">
                        <node concept="37vLTw" id="5s44y2LhEtB" role="2Oq$k0">
                          <ref role="3cqZAo" node="5s44y2LhEsX" resolve="nextCell" />
                        </node>
                        <node concept="liA8E" id="5s44y2LhEtC" role="2OqNvi">
                          <ref role="37wK5l" to="f4zo:~EditorCell.getY():int" resolve="getY" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="5s44y2LhEtD" role="3uHU7w">
                        <ref role="3cqZAo" node="5s44y2LhEsJ" resolve="editorY" />
                      </node>
                    </node>
                  </node>
                  <node concept="3eOSWO" id="5s44y2LhEtE" role="3uHU7w">
                    <node concept="3cpWs3" id="5s44y2LhEtF" role="3uHU7B">
                      <node concept="2OqwBi" id="5s44y2LhEtG" role="3uHU7B">
                        <node concept="37vLTw" id="5s44y2LhEtH" role="2Oq$k0">
                          <ref role="3cqZAo" node="5s44y2LhEsX" resolve="nextCell" />
                        </node>
                        <node concept="liA8E" id="5s44y2LhEtI" role="2OqNvi">
                          <ref role="37wK5l" to="f4zo:~EditorCell.getX():int" resolve="getX" />
                        </node>
                      </node>
                      <node concept="2OqwBi" id="5s44y2LhEtJ" role="3uHU7w">
                        <node concept="37vLTw" id="5s44y2LhEtK" role="2Oq$k0">
                          <ref role="3cqZAo" node="5s44y2LhEsX" resolve="nextCell" />
                        </node>
                        <node concept="liA8E" id="5s44y2LhEtL" role="2OqNvi">
                          <ref role="37wK5l" to="f4zo:~EditorCell.getWidth():int" resolve="getWidth" />
                        </node>
                      </node>
                    </node>
                    <node concept="37vLTw" id="5s44y2LhEtM" role="3uHU7w">
                      <ref role="3cqZAo" node="5s44y2LhEsB" resolve="editorX" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="2OqwBi" id="5s44y2LhEtN" role="2$JKZa">
            <node concept="37vLTw" id="5s44y2LhEtO" role="2Oq$k0">
              <ref role="3cqZAo" node="5s44y2LhEsr" resolve="cellCandidates" />
            </node>
            <node concept="3GX2aA" id="5s44y2LhEtP" role="2OqNvi" />
          </node>
        </node>
        <node concept="1gVbGN" id="5s44y2LhEtQ" role="3cqZAp">
          <node concept="3y3z36" id="5s44y2LhEtR" role="1gVkn0">
            <node concept="10Nm6u" id="5s44y2LhEtS" role="3uHU7w" />
            <node concept="37vLTw" id="5s44y2LhEtT" role="3uHU7B">
              <ref role="3cqZAo" node="5s44y2LhEsR" resolve="eventTargetCell" />
            </node>
          </node>
        </node>
        <node concept="3clFbH" id="5s44y2LhEtU" role="3cqZAp" />
        <node concept="3cpWs8" id="5s44y2LhEtV" role="3cqZAp">
          <node concept="3cpWsn" id="5s44y2LhEtW" role="3cpWs9">
            <property role="TrG5h" value="cellComponent" />
            <node concept="3uibUv" id="5s44y2LhEtX" role="1tU5fm">
              <ref role="3uigEE" to="z60i:~Component" resolve="Component" />
            </node>
            <node concept="2YIFZM" id="5s44y2LhH84" role="33vP2m">
              <ref role="37wK5l" node="5s44y2LgV2w" resolve="getEventTargetComponent" />
              <ref role="1Pybhc" node="5s44y2Lh6_5" resolve="EditorUtil" />
              <node concept="37vLTw" id="5s44y2LhLUC" role="37wK5m">
                <ref role="3cqZAo" node="5s44y2LhEsR" resolve="eventTargetCell" />
              </node>
              <node concept="37vLTw" id="4CPWB7q00t_" role="37wK5m">
                <ref role="3cqZAo" node="4CPWB7q00tv" resolve="editorComponent" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="4CPWB7pZSA7" role="3cqZAp">
          <node concept="3cpWsn" id="4CPWB7pZSA8" role="3cpWs9">
            <property role="TrG5h" value="cellComponentPoint" />
            <node concept="3uibUv" id="4CPWB7pZSA9" role="1tU5fm">
              <ref role="3uigEE" to="z60i:~Point" resolve="Point" />
            </node>
            <node concept="2YIFZM" id="4CPWB7pZSWp" role="33vP2m">
              <ref role="1Pybhc" to="dxuu:~SwingUtilities" resolve="SwingUtilities" />
              <ref role="37wK5l" to="dxuu:~SwingUtilities.convertPoint(java.awt.Component,int,int,java.awt.Component):java.awt.Point" resolve="convertPoint" />
              <node concept="37vLTw" id="4CPWB7q00tA" role="37wK5m">
                <ref role="3cqZAo" node="4CPWB7q00tv" resolve="editorComponent" />
              </node>
              <node concept="37vLTw" id="4CPWB7pZU33" role="37wK5m">
                <ref role="3cqZAo" node="5s44y2LhEsB" resolve="editorX" />
              </node>
              <node concept="37vLTw" id="4CPWB7pZUbE" role="37wK5m">
                <ref role="3cqZAo" node="5s44y2LhEsJ" resolve="editorY" />
              </node>
              <node concept="37vLTw" id="4CPWB7pZUse" role="37wK5m">
                <ref role="3cqZAo" node="5s44y2LhEtW" resolve="cellComponent" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbH" id="4CPWB7pZPKn" role="3cqZAp" />
        <node concept="3cpWs8" id="4CPWB7pZXC7" role="3cqZAp">
          <node concept="3cpWsn" id="4CPWB7pZXC8" role="3cpWs9">
            <property role="TrG5h" value="targetComponent" />
            <node concept="3uibUv" id="4CPWB7pZXC9" role="1tU5fm">
              <ref role="3uigEE" to="z60i:~Component" resolve="Component" />
            </node>
            <node concept="2OqwBi" id="4CPWB7pZXX4" role="33vP2m">
              <node concept="37vLTw" id="4CPWB7pZXX5" role="2Oq$k0">
                <ref role="3cqZAo" node="5s44y2LhEtW" resolve="cellComponent" />
              </node>
              <node concept="liA8E" id="4CPWB7pZXX6" role="2OqNvi">
                <ref role="37wK5l" to="z60i:~Component.getComponentAt(java.awt.Point):java.awt.Component" resolve="getComponentAt" />
                <node concept="37vLTw" id="4CPWB7pZXX7" role="37wK5m">
                  <ref role="3cqZAo" node="4CPWB7pZSA8" resolve="cellComponentPoint" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="1gVbGN" id="5s44y2LhEu9" role="3cqZAp">
          <node concept="3y3z36" id="5s44y2LhEua" role="1gVkn0">
            <node concept="10Nm6u" id="5s44y2LhEub" role="3uHU7w" />
            <node concept="37vLTw" id="4CPWB7pZYm0" role="3uHU7B">
              <ref role="3cqZAo" node="4CPWB7pZXC8" resolve="targetComponent" />
            </node>
          </node>
        </node>
        <node concept="3clFbH" id="4CPWB7pZRXh" role="3cqZAp" />
        <node concept="3cpWs8" id="4CPWB7pZZxy" role="3cqZAp">
          <node concept="3cpWsn" id="4CPWB7pZZxz" role="3cpWs9">
            <property role="TrG5h" value="targetComponentPoint" />
            <node concept="3uibUv" id="4CPWB7pZZx$" role="1tU5fm">
              <ref role="3uigEE" to="z60i:~Point" resolve="Point" />
            </node>
            <node concept="2YIFZM" id="4CPWB7pZZS2" role="33vP2m">
              <ref role="37wK5l" to="dxuu:~SwingUtilities.convertPoint(java.awt.Component,int,int,java.awt.Component):java.awt.Point" resolve="convertPoint" />
              <ref role="1Pybhc" to="dxuu:~SwingUtilities" resolve="SwingUtilities" />
              <node concept="37vLTw" id="4CPWB7q00tz" role="37wK5m">
                <ref role="3cqZAo" node="4CPWB7q00tv" resolve="editorComponent" />
              </node>
              <node concept="37vLTw" id="4CPWB7pZZS6" role="37wK5m">
                <ref role="3cqZAo" node="5s44y2LhEsB" resolve="editorX" />
              </node>
              <node concept="37vLTw" id="4CPWB7pZZS7" role="37wK5m">
                <ref role="3cqZAo" node="5s44y2LhEsJ" resolve="editorY" />
              </node>
              <node concept="37vLTw" id="4CPWB7q08f4" role="37wK5m">
                <ref role="3cqZAo" node="4CPWB7pZXC8" resolve="targetComponent" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbH" id="5s44y2LhEud" role="3cqZAp" />
        <node concept="3cpWs8" id="5s44y2LhEue" role="3cqZAp">
          <node concept="3cpWsn" id="5s44y2LhEuf" role="3cpWs9">
            <property role="TrG5h" value="e" />
            <property role="3TUv4t" value="true" />
            <node concept="3uibUv" id="5s44y2LhEug" role="1tU5fm">
              <ref role="3uigEE" to="hyam:~MouseEvent" resolve="MouseEvent" />
            </node>
            <node concept="2YIFZM" id="5s44y2LhEuh" role="33vP2m">
              <ref role="1Pybhc" node="5s44y2LfYy2" resolve="MouseEventsDispatcher" />
              <ref role="37wK5l" node="7jrLbSWXnrL" resolve="createMouseEvent" />
              <node concept="37vLTw" id="5s44y2LhEui" role="37wK5m">
                <ref role="3cqZAo" node="5s44y2LhEtW" resolve="cellComponent" />
              </node>
              <node concept="37vLTw" id="5s44y2LhEuj" role="37wK5m">
                <ref role="3cqZAo" node="5s44y2LhEs8" resolve="eventType" />
              </node>
              <node concept="2OqwBi" id="4CPWB7pZVJJ" role="37wK5m">
                <node concept="37vLTw" id="4CPWB7q00it" role="2Oq$k0">
                  <ref role="3cqZAo" node="4CPWB7pZZxz" resolve="targetComponentPoint" />
                </node>
                <node concept="2OwXpG" id="4CPWB7pZVOk" role="2OqNvi">
                  <ref role="2Oxat5" to="z60i:~Point.x" resolve="x" />
                </node>
              </node>
              <node concept="2OqwBi" id="4CPWB7pZW1w" role="37wK5m">
                <node concept="37vLTw" id="4CPWB7q00pG" role="2Oq$k0">
                  <ref role="3cqZAo" node="4CPWB7pZZxz" resolve="targetComponentPoint" />
                </node>
                <node concept="2OwXpG" id="4CPWB7pZW7a" role="2OqNvi">
                  <ref role="2Oxat5" to="z60i:~Point.y" resolve="y" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5s44y2LoF7u" role="3cqZAp">
          <node concept="2OqwBi" id="5s44y2LoF7v" role="3clFbG">
            <node concept="37vLTw" id="62Gc_ZTp4Vo" role="2Oq$k0">
              <ref role="3cqZAo" node="62Gc_ZToOa_" resolve="myEditorTest" />
            </node>
            <node concept="liA8E" id="5s44y2LoF7x" role="2OqNvi">
              <ref role="37wK5l" node="62Gc_ZTkJBT" resolve="runUndoableInEDTAndWait" />
              <node concept="1bVj0M" id="5s44y2LoF7y" role="37wK5m">
                <node concept="3clFbS" id="5s44y2LoF7z" role="1bW5cS">
                  <node concept="3clFbF" id="5s44y2LoF7$" role="3cqZAp">
                    <node concept="2OqwBi" id="5s44y2LoF7_" role="3clFbG">
                      <node concept="37vLTw" id="4CPWB7q0xDi" role="2Oq$k0">
                        <ref role="3cqZAo" node="4CPWB7pZXC8" resolve="targetComponent" />
                      </node>
                      <node concept="liA8E" id="5s44y2LoF7B" role="2OqNvi">
                        <ref role="37wK5l" to="z60i:~Component.dispatchEvent(java.awt.AWTEvent):void" resolve="dispatchEvent" />
                        <node concept="37vLTw" id="5s44y2LoF7C" role="37wK5m">
                          <ref role="3cqZAo" node="5s44y2LhEuf" resolve="e" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="5s44y2LhEuv" role="3cqZAp">
          <node concept="37vLTw" id="4CPWB7q0DI4" role="3cqZAk">
            <ref role="3cqZAo" node="4CPWB7pZXC8" resolve="targetComponent" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5s44y2LhEux" role="Sfmx6">
        <ref role="3uigEE" to="t6h5:~InvocationTargetException" resolve="InvocationTargetException" />
      </node>
      <node concept="3uibUv" id="5s44y2LhEuy" role="Sfmx6">
        <ref role="3uigEE" to="wyt6:~InterruptedException" resolve="InterruptedException" />
      </node>
      <node concept="3Tm1VV" id="5s44y2LhEuz" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="5s44y2Lhxfw" role="jymVt" />
    <node concept="3Tm1VV" id="5s44y2LfYy3" role="1B3o_S" />
  </node>
  <node concept="312cEu" id="5s44y2Lh6_5">
    <property role="3GE5qa" value="util" />
    <property role="TrG5h" value="EditorUtil" />
    <node concept="2YIFZL" id="5s44y2LgV2w" role="jymVt">
      <property role="TrG5h" value="getEventTargetComponent" />
      <node concept="37vLTG" id="5s44y2LgV2x" role="3clF46">
        <property role="TrG5h" value="currentCell" />
        <node concept="3uibUv" id="5s44y2LgV2y" role="1tU5fm">
          <ref role="3uigEE" to="f4zo:~EditorCell" resolve="EditorCell" />
        </node>
      </node>
      <node concept="37vLTG" id="5s44y2LgV2z" role="3clF46">
        <property role="TrG5h" value="editorComponent" />
        <node concept="3uibUv" id="5s44y2LgV2$" role="1tU5fm">
          <ref role="3uigEE" to="exr9:~EditorComponent" resolve="EditorComponent" />
        </node>
      </node>
      <node concept="3uibUv" id="5s44y2LgV2_" role="3clF45">
        <ref role="3uigEE" to="dxuu:~JComponent" resolve="JComponent" />
      </node>
      <node concept="3Tm1VV" id="5s44y2Lh8YW" role="1B3o_S" />
      <node concept="3clFbS" id="5s44y2LgV2B" role="3clF47">
        <node concept="2$JKZl" id="5s44y2LgV2C" role="3cqZAp">
          <node concept="3clFbS" id="5s44y2LgV2D" role="2LFqv$">
            <node concept="3clFbJ" id="5s44y2LgV2E" role="3cqZAp">
              <node concept="3clFbS" id="5s44y2LgV2F" role="3clFbx">
                <node concept="3cpWs6" id="5s44y2LgV2G" role="3cqZAp">
                  <node concept="2OqwBi" id="5s44y2LgV2H" role="3cqZAk">
                    <node concept="1eOMI4" id="5s44y2LgV2I" role="2Oq$k0">
                      <node concept="10QFUN" id="5s44y2LgV2J" role="1eOMHV">
                        <node concept="3uibUv" id="5s44y2LgV2K" role="10QFUM">
                          <ref role="3uigEE" to="exr9:~EditorCell_WithComponent" resolve="EditorCell_WithComponent" />
                        </node>
                        <node concept="37vLTw" id="5s44y2LgV2L" role="10QFUP">
                          <ref role="3cqZAo" node="5s44y2LgV2x" resolve="currentCell" />
                        </node>
                      </node>
                    </node>
                    <node concept="liA8E" id="5s44y2LgV2M" role="2OqNvi">
                      <ref role="37wK5l" to="exr9:~EditorCell_WithComponent.getComponent():javax.swing.JComponent" resolve="getComponent" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="2ZW3vV" id="5s44y2LgV2N" role="3clFbw">
                <node concept="3uibUv" id="5s44y2LgV2O" role="2ZW6by">
                  <ref role="3uigEE" to="exr9:~EditorCell_WithComponent" resolve="EditorCell_WithComponent" />
                </node>
                <node concept="37vLTw" id="5s44y2LgV2P" role="2ZW6bz">
                  <ref role="3cqZAo" node="5s44y2LgV2x" resolve="currentCell" />
                </node>
              </node>
            </node>
            <node concept="3clFbF" id="5s44y2LgV2Q" role="3cqZAp">
              <node concept="37vLTI" id="5s44y2LgV2R" role="3clFbG">
                <node concept="2OqwBi" id="5s44y2LgV2S" role="37vLTx">
                  <node concept="37vLTw" id="5s44y2LgV2T" role="2Oq$k0">
                    <ref role="3cqZAo" node="5s44y2LgV2x" resolve="currentCell" />
                  </node>
                  <node concept="liA8E" id="5s44y2LgV2U" role="2OqNvi">
                    <ref role="37wK5l" to="f4zo:~EditorCell.getParent():jetbrains.mps.openapi.editor.cells.EditorCell_Collection" resolve="getParent" />
                  </node>
                </node>
                <node concept="37vLTw" id="5s44y2LgV2V" role="37vLTJ">
                  <ref role="3cqZAo" node="5s44y2LgV2x" resolve="currentCell" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3y3z36" id="5s44y2LgV2W" role="2$JKZa">
            <node concept="37vLTw" id="5s44y2LgV2X" role="3uHU7B">
              <ref role="3cqZAo" node="5s44y2LgV2x" resolve="currentCell" />
            </node>
            <node concept="10Nm6u" id="5s44y2LgV2Y" role="3uHU7w" />
          </node>
        </node>
        <node concept="3cpWs6" id="5s44y2LgV2Z" role="3cqZAp">
          <node concept="37vLTw" id="5s44y2LgV30" role="3cqZAk">
            <ref role="3cqZAo" node="5s44y2LgV2z" resolve="editorComponent" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3Tm1VV" id="5s44y2Lh6_6" role="1B3o_S" />
  </node>
  <node concept="312cEu" id="wQDhRCClc9">
    <property role="3GE5qa" value="transformation" />
    <property role="TrG5h" value="TestModelSaver" />
    <node concept="Wx3nA" id="4zIz0VbXUNr" role="jymVt">
      <property role="IEkAT" value="false" />
      <property role="TrG5h" value="ourInstance" />
      <property role="3TUv4t" value="false" />
      <node concept="3uibUv" id="4zIz0VbXUD0" role="1tU5fm">
        <ref role="3uigEE" node="wQDhRCClc9" resolve="TestModelSaver" />
      </node>
      <node concept="3Tm6S6" id="4zIz0VbXUAS" role="1B3o_S" />
      <node concept="2ShNRf" id="21nkJZKpKmQ" role="33vP2m">
        <node concept="1pGfFk" id="21nkJZKqh9g" role="2ShVmc">
          <ref role="37wK5l" node="4zIz0VbXUrR" resolve="TestModelSaver" />
        </node>
      </node>
    </node>
    <node concept="Wx3nA" id="21nkJZKp5h$" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="TrG5h" value="ourListener" />
      <property role="3TUv4t" value="false" />
      <node concept="3Tm6S6" id="21nkJZKp5b$" role="1B3o_S" />
      <node concept="3uibUv" id="6fRJ2$ADzsd" role="1tU5fm">
        <ref role="3uigEE" to="fnd7:70xkT3P5f2P" resolve="MpsRunListener" />
      </node>
      <node concept="1rXfSq" id="21nkJZKp8If" role="33vP2m">
        <ref role="37wK5l" node="21nkJZKp8xQ" resolve="createListener" />
      </node>
    </node>
    <node concept="312cEg" id="wQDhRCEOcN" role="jymVt">
      <property role="34CwA1" value="true" />
      <property role="eg7rD" value="false" />
      <property role="TrG5h" value="myTest" />
      <property role="3TUv4t" value="false" />
      <node concept="3Tm6S6" id="wQDhRCEO3j" role="1B3o_S" />
      <node concept="3uibUv" id="21nkJZKpl14" role="1tU5fm">
        <ref role="3uigEE" node="e$hNri9cbt" resolve="TransformationTest" />
      </node>
      <node concept="10Nm6u" id="wQDhRCEOgp" role="33vP2m" />
    </node>
    <node concept="2tJIrI" id="wQDhRCCreA" role="jymVt" />
    <node concept="3clFbW" id="4zIz0VbXUrR" role="jymVt">
      <node concept="3cqZAl" id="4zIz0VbXUrS" role="3clF45" />
      <node concept="3clFbS" id="4zIz0VbXUrU" role="3clF47" />
      <node concept="3Tm6S6" id="21nkJZKqhaG" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="4zIz0VbXUtx" role="jymVt" />
    <node concept="2YIFZL" id="4zIz0VbXUyu" role="jymVt">
      <property role="TrG5h" value="getInstance" />
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <node concept="3clFbS" id="4zIz0VbXUyx" role="3clF47">
        <node concept="3cpWs6" id="4zIz0VbXU$m" role="3cqZAp">
          <node concept="10M0yZ" id="21nkJZKpnVW" role="3cqZAk">
            <ref role="3cqZAo" node="4zIz0VbXUNr" resolve="ourInstance" />
            <ref role="1PxDUh" node="wQDhRCClc9" resolve="TestModelSaver" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="4zIz0VbXUwG" role="1B3o_S" />
      <node concept="3uibUv" id="4zIz0VbXUyl" role="3clF45">
        <ref role="3uigEE" node="wQDhRCClc9" resolve="TestModelSaver" />
      </node>
    </node>
    <node concept="2tJIrI" id="4zIz0VbXUkQ" role="jymVt" />
    <node concept="3clFb_" id="wQDhRCEOn6" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getTest" />
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <node concept="3clFbS" id="wQDhRCEOn9" role="3clF47">
        <node concept="3cpWs6" id="wQDhRCEOpm" role="3cqZAp">
          <node concept="37vLTw" id="wQDhRCEOr2" role="3cqZAk">
            <ref role="3cqZAo" node="wQDhRCEOcN" resolve="myTest" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="wQDhRCEOkS" role="1B3o_S" />
      <node concept="3uibUv" id="21nkJZKplbe" role="3clF45">
        <ref role="3uigEE" node="e$hNri9cbt" resolve="TransformationTest" />
      </node>
    </node>
    <node concept="2tJIrI" id="wQDhRCEOtB" role="jymVt" />
    <node concept="3clFb_" id="wQDhRCEOxC" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="setTest" />
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <node concept="3clFbS" id="wQDhRCEOxF" role="3clF47">
        <node concept="1gVbGN" id="7wzkfrshBDG" role="3cqZAp">
          <node concept="3clFbC" id="7wzkfrshBG9" role="1gVkn0">
            <node concept="10Nm6u" id="7wzkfrshBGn" role="3uHU7w" />
            <node concept="37vLTw" id="7wzkfrshBEN" role="3uHU7B">
              <ref role="3cqZAo" node="wQDhRCEOcN" resolve="myTest" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="wQDhRCEOAX" role="3cqZAp">
          <node concept="37vLTI" id="wQDhRCEOC1" role="3clFbG">
            <node concept="37vLTw" id="wQDhRCEOCz" role="37vLTx">
              <ref role="3cqZAo" node="wQDhRCEO$s" resolve="test" />
            </node>
            <node concept="37vLTw" id="wQDhRCEOAW" role="37vLTJ">
              <ref role="3cqZAo" node="wQDhRCEOcN" resolve="myTest" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="wQDhRCEOuX" role="1B3o_S" />
      <node concept="3cqZAl" id="wQDhRCEOvG" role="3clF45" />
      <node concept="37vLTG" id="wQDhRCEO$s" role="3clF46">
        <property role="TrG5h" value="test" />
        <node concept="3uibUv" id="21nkJZKplkS" role="1tU5fm">
          <ref role="3uigEE" node="e$hNri9cbt" resolve="TransformationTest" />
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="4zIz0VbYSr8" role="jymVt" />
    <node concept="3clFb_" id="4zIz0VbYSyo" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="clean" />
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <node concept="3clFbS" id="4zIz0VbYSyr" role="3clF47">
        <node concept="3clFbJ" id="7_C3CS07Ofu" role="3cqZAp">
          <node concept="3clFbS" id="7_C3CS07Ofx" role="3clFbx">
            <node concept="3cpWs6" id="7_C3CS07Osk" role="3cqZAp" />
          </node>
          <node concept="3clFbC" id="7_C3CS07Ooe" role="3clFbw">
            <node concept="10Nm6u" id="7_C3CS07Orc" role="3uHU7w" />
            <node concept="37vLTw" id="7_C3CS07OkS" role="3uHU7B">
              <ref role="3cqZAo" node="wQDhRCEOcN" resolve="myTest" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5Nkzt7Qvdyc" role="3cqZAp">
          <node concept="2OqwBi" id="5Nkzt7Qvd$Z" role="3clFbG">
            <node concept="2OqwBi" id="6BLo1MggNJ5" role="2Oq$k0">
              <node concept="2OqwBi" id="6BLo1MggNCy" role="2Oq$k0">
                <node concept="37vLTw" id="6BLo1MggN$w" role="2Oq$k0">
                  <ref role="3cqZAo" node="wQDhRCEOcN" resolve="myTest" />
                </node>
                <node concept="liA8E" id="6BLo1MggNGj" role="2OqNvi">
                  <ref role="37wK5l" node="e$hNri9cbB" resolve="getProject" />
                </node>
              </node>
              <node concept="liA8E" id="6BLo1MggNQQ" role="2OqNvi">
                <ref role="37wK5l" to="z1c3:~Project.getModelAccess():org.jetbrains.mps.openapi.module.ModelAccess" resolve="getModelAccess" />
              </node>
            </node>
            <node concept="liA8E" id="5Nkzt7QvdNA" role="2OqNvi">
              <ref role="37wK5l" to="lui2:~ModelAccess.runWriteInEDT(java.lang.Runnable):void" resolve="runWriteInEDT" />
              <node concept="1bVj0M" id="4LXHHl0MRsd" role="37wK5m">
                <node concept="3clFbS" id="4LXHHl0MRse" role="1bW5cS">
                  <node concept="3clFbF" id="4zIz0VbYS_a" role="3cqZAp">
                    <node concept="2OqwBi" id="4zIz0VbYS_K" role="3clFbG">
                      <node concept="37vLTw" id="4zIz0VbYS_9" role="2Oq$k0">
                        <ref role="3cqZAo" node="wQDhRCEOcN" resolve="myTest" />
                      </node>
                      <node concept="liA8E" id="4zIz0VbYSBg" role="2OqNvi">
                        <ref role="37wK5l" node="6OQSQAx9h3Q" resolve="dispose" />
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="5Nkzt7Qvdt2" role="3cqZAp">
                    <node concept="37vLTI" id="5Nkzt7QvduP" role="3clFbG">
                      <node concept="10Nm6u" id="5Nkzt7QvdvG" role="37vLTx" />
                      <node concept="37vLTw" id="5Nkzt7Qvdt0" role="37vLTJ">
                        <ref role="3cqZAo" node="wQDhRCEOcN" resolve="myTest" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6BLo1MggOlM" role="3cqZAp">
          <node concept="2OqwBi" id="6BLo1MggOvi" role="3clFbG">
            <node concept="2YIFZM" id="6BLo1MggOtZ" role="2Oq$k0">
              <ref role="37wK5l" to="w1kc:~ModelAccess.instance():jetbrains.mps.smodel.ModelAccess" resolve="instance" />
              <ref role="1Pybhc" to="w1kc:~ModelAccess" resolve="ModelAccess" />
            </node>
            <node concept="liA8E" id="6BLo1MggOCj" role="2OqNvi">
              <ref role="37wK5l" to="w1kc:~ModelCommandExecutor.flushEventQueue():void" resolve="flushEventQueue" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="4zIz0VbYSvJ" role="1B3o_S" />
      <node concept="3cqZAl" id="4zIz0VbYSym" role="3clF45" />
    </node>
    <node concept="2tJIrI" id="21nkJZKp8gG" role="jymVt" />
    <node concept="2YIFZL" id="21nkJZKp8xQ" role="jymVt">
      <property role="TrG5h" value="createListener" />
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <node concept="3clFbS" id="21nkJZKp8xT" role="3clF47">
        <node concept="3cpWs8" id="21nkJZKp8JE" role="3cqZAp">
          <node concept="3cpWsn" id="21nkJZKp8JF" role="3cpWs9">
            <property role="TrG5h" value="listener" />
            <node concept="3uibUv" id="6fRJ2$ADyci" role="1tU5fm">
              <ref role="3uigEE" to="fnd7:70xkT3P5f2P" resolve="MpsRunListener" />
            </node>
            <node concept="2ShNRf" id="21nkJZKp8JG" role="33vP2m">
              <node concept="YeOm9" id="21nkJZKp8JH" role="2ShVmc">
                <node concept="1Y3b0j" id="21nkJZKp8JI" role="YeSDq">
                  <property role="2bfB8j" value="true" />
                  <ref role="1Y3XeK" to="fnd7:70xkT3P5f2P" resolve="MpsRunListener" />
                  <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
                  <node concept="3Tm1VV" id="21nkJZKp8JJ" role="1B3o_S" />
                  <node concept="3clFb_" id="21nkJZKp8JK" role="jymVt">
                    <property role="1EzhhJ" value="false" />
                    <property role="TrG5h" value="testRunDone" />
                    <property role="DiZV1" value="false" />
                    <property role="IEkAT" value="false" />
                    <node concept="3Tm1VV" id="21nkJZKp8JL" role="1B3o_S" />
                    <node concept="3cqZAl" id="21nkJZKp8JM" role="3clF45" />
                    <node concept="3clFbS" id="21nkJZKp8JQ" role="3clF47">
                      <node concept="3clFbF" id="21nkJZKp8JR" role="3cqZAp">
                        <node concept="2OqwBi" id="21nkJZKp8JS" role="3clFbG">
                          <node concept="10M0yZ" id="21nkJZKpnVZ" role="2Oq$k0">
                            <ref role="3cqZAo" node="4zIz0VbXUNr" resolve="ourInstance" />
                            <ref role="1PxDUh" node="wQDhRCClc9" resolve="TestModelSaver" />
                          </node>
                          <node concept="liA8E" id="21nkJZKp8JU" role="2OqNvi">
                            <ref role="37wK5l" node="4zIz0VbYSyo" resolve="clean" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="2AHcQZ" id="21nkJZKp8JV" role="2AJF6D">
                      <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="21nkJZKp8TN" role="3cqZAp">
          <node concept="2OqwBi" id="21nkJZKp8Ys" role="3clFbG">
            <node concept="2YIFZM" id="21nkJZKp8Xe" role="2Oq$k0">
              <ref role="1Pybhc" to="fnd7:21nkJZKnWjm" resolve="RunEventsDispatcher" />
              <ref role="37wK5l" to="fnd7:21nkJZKo9oB" resolve="getInstance" />
            </node>
            <node concept="liA8E" id="21nkJZKp93i" role="2OqNvi">
              <ref role="37wK5l" to="fnd7:21nkJZKo3qt" resolve="setListener" />
              <node concept="37vLTw" id="21nkJZKp95j" role="37wK5m">
                <ref role="3cqZAo" node="21nkJZKp8JF" resolve="listener" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="21nkJZKp9a9" role="3cqZAp">
          <node concept="37vLTw" id="21nkJZKp9gC" role="3cqZAk">
            <ref role="3cqZAo" node="21nkJZKp8JF" resolve="listener" />
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="21nkJZKp8rF" role="1B3o_S" />
      <node concept="3uibUv" id="6fRJ2$ADy1V" role="3clF45">
        <ref role="3uigEE" to="fnd7:70xkT3P5f2P" resolve="MpsRunListener" />
      </node>
    </node>
    <node concept="3Tm1VV" id="wQDhRCClca" role="1B3o_S" />
  </node>
  <node concept="312cEu" id="5s44y2Lg6Up">
    <property role="3GE5qa" value="util" />
    <property role="TrG5h" value="KeyEventsDispatcher" />
    <node concept="312cEg" id="62Gc_ZTn_Aq" role="jymVt">
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myEditorTest" />
      <node concept="3Tm6S6" id="62Gc_ZTn_Ar" role="1B3o_S" />
      <node concept="3uibUv" id="62Gc_ZTnBTC" role="1tU5fm">
        <ref role="3uigEE" node="hPMdj4e" resolve="BaseEditorTestBody" />
      </node>
    </node>
    <node concept="2tJIrI" id="62Gc_ZTnzjq" role="jymVt" />
    <node concept="3clFbW" id="5s44y2Lgn6H" role="jymVt">
      <node concept="3cqZAl" id="5s44y2Lgn6I" role="3clF45" />
      <node concept="3clFbS" id="5s44y2Lgn6K" role="3clF47">
        <node concept="3clFbF" id="62Gc_ZTnD71" role="3cqZAp">
          <node concept="37vLTI" id="62Gc_ZTnDiC" role="3clFbG">
            <node concept="37vLTw" id="62Gc_ZTnDl$" role="37vLTx">
              <ref role="3cqZAo" node="62Gc_ZTmt1l" resolve="editorTest" />
            </node>
            <node concept="37vLTw" id="62Gc_ZTnD6Z" role="37vLTJ">
              <ref role="3cqZAo" node="62Gc_ZTn_Aq" resolve="myEditorTest" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5s44y2Lgn6r" role="1B3o_S" />
      <node concept="37vLTG" id="62Gc_ZTmt1l" role="3clF46">
        <property role="TrG5h" value="editorTest" />
        <node concept="3uibUv" id="62Gc_ZTmt9G" role="1tU5fm">
          <ref role="3uigEE" node="hPMdj4e" resolve="BaseEditorTestBody" />
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="5s44y2LjiOh" role="jymVt" />
    <node concept="3clFb_" id="5s44y2LjkVI" role="jymVt">
      <property role="TrG5h" value="typeString" />
      <property role="DiZV1" value="false" />
      <node concept="3cqZAl" id="5s44y2LjkVJ" role="3clF45" />
      <node concept="37vLTG" id="5s44y2LjkVK" role="3clF46">
        <property role="TrG5h" value="text" />
        <property role="3TUv4t" value="true" />
        <node concept="17QB3L" id="5s44y2LjkVL" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="5s44y2LjkVM" role="3clF47">
        <node concept="3cpWs8" id="5s44y2LjkVR" role="3cqZAp">
          <node concept="3cpWsn" id="5s44y2LjkVS" role="3cpWs9">
            <property role="TrG5h" value="events" />
            <node concept="A3Dl8" id="5s44y2LjkVT" role="1tU5fm">
              <node concept="3uibUv" id="5s44y2LjkVU" role="A3Ik2">
                <ref role="3uigEE" to="hyam:~KeyEvent" resolve="KeyEvent" />
              </node>
            </node>
            <node concept="2OqwBi" id="5s44y2LjkVV" role="33vP2m">
              <node concept="2OqwBi" id="5s44y2LjkVW" role="2Oq$k0">
                <node concept="2OqwBi" id="5s44y2LjkVX" role="2Oq$k0">
                  <node concept="37vLTw" id="5s44y2LjkVY" role="2Oq$k0">
                    <ref role="3cqZAo" node="5s44y2LjkVK" resolve="text" />
                  </node>
                  <node concept="liA8E" id="5s44y2LjkVZ" role="2OqNvi">
                    <ref role="37wK5l" to="wyt6:~String.toCharArray():char[]" resolve="toCharArray" />
                  </node>
                </node>
                <node concept="39bAoz" id="5s44y2LjkW0" role="2OqNvi" />
              </node>
              <node concept="3$u5V9" id="5s44y2LjkW1" role="2OqNvi">
                <node concept="1bVj0M" id="5s44y2LjkW2" role="23t8la">
                  <node concept="3clFbS" id="5s44y2LjkW3" role="1bW5cS">
                    <node concept="3clFbF" id="5s44y2LjkW4" role="3cqZAp">
                      <node concept="2ShNRf" id="5s44y2LjkW5" role="3clFbG">
                        <node concept="1pGfFk" id="5s44y2LjkW6" role="2ShVmc">
                          <ref role="37wK5l" to="hyam:~KeyEvent.&lt;init&gt;(java.awt.Component,int,long,int,int,char)" resolve="KeyEvent" />
                          <node concept="2OqwBi" id="62Gc_ZTnJlP" role="37wK5m">
                            <node concept="37vLTw" id="62Gc_ZTnIYl" role="2Oq$k0">
                              <ref role="3cqZAo" node="62Gc_ZTn_Aq" resolve="myEditorTest" />
                            </node>
                            <node concept="liA8E" id="62Gc_ZTnK63" role="2OqNvi">
                              <ref role="37wK5l" node="1BrKW0d9mQ7" resolve="getEditorComponent" />
                            </node>
                          </node>
                          <node concept="10M0yZ" id="5s44y2LjkW8" role="37wK5m">
                            <ref role="3cqZAo" to="hyam:~KeyEvent.KEY_TYPED" resolve="KEY_TYPED" />
                            <ref role="1PxDUh" to="hyam:~KeyEvent" resolve="KeyEvent" />
                          </node>
                          <node concept="3cmrfG" id="5s44y2LjkW9" role="37wK5m">
                            <property role="3cmrfH" value="0" />
                          </node>
                          <node concept="3cmrfG" id="5s44y2LjkWa" role="37wK5m">
                            <property role="3cmrfH" value="0" />
                          </node>
                          <node concept="3cmrfG" id="5s44y2LjkWb" role="37wK5m">
                            <property role="3cmrfH" value="0" />
                          </node>
                          <node concept="37vLTw" id="5s44y2LjkWc" role="37wK5m">
                            <ref role="3cqZAo" node="5s44y2LjkWd" resolve="it" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="Rh6nW" id="5s44y2LjkWd" role="1bW2Oz">
                    <property role="TrG5h" value="it" />
                    <node concept="2jxLKc" id="5s44y2LjkWe" role="1tU5fm" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5s44y2LjkWf" role="3cqZAp">
          <node concept="1rXfSq" id="5s44y2LjkWg" role="3clFbG">
            <ref role="37wK5l" node="5s44y2LgrQy" resolve="processKeyEvents" />
            <node concept="37vLTw" id="5s44y2LjkWh" role="37wK5m">
              <ref role="3cqZAo" node="5s44y2LjkVS" resolve="events" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5s44y2LjkWi" role="Sfmx6">
        <ref role="3uigEE" to="wyt6:~InterruptedException" resolve="InterruptedException" />
      </node>
      <node concept="3uibUv" id="5s44y2LjkWj" role="Sfmx6">
        <ref role="3uigEE" to="t6h5:~InvocationTargetException" resolve="InvocationTargetException" />
      </node>
      <node concept="3Tm1VV" id="5s44y2LjkWk" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="5s44y2LiLBl" role="jymVt" />
    <node concept="3clFb_" id="5s44y2LiJ$Z" role="jymVt">
      <property role="TrG5h" value="pressKeys" />
      <property role="DiZV1" value="false" />
      <node concept="3cqZAl" id="5s44y2LiJ_0" role="3clF45" />
      <node concept="37vLTG" id="5s44y2LiJ_1" role="3clF46">
        <property role="TrG5h" value="keyStrokes" />
        <property role="3TUv4t" value="true" />
        <node concept="_YKpA" id="5s44y2LiJ_2" role="1tU5fm">
          <node concept="17QB3L" id="5s44y2LiJ_3" role="_ZDj9" />
        </node>
      </node>
      <node concept="3clFbS" id="5s44y2LiJ_4" role="3clF47">
        <node concept="3cpWs8" id="5s44y2LiJ_5" role="3cqZAp">
          <node concept="3cpWsn" id="5s44y2LiJ_6" role="3cpWs9">
            <property role="TrG5h" value="events" />
            <node concept="A3Dl8" id="5s44y2LiJ_7" role="1tU5fm">
              <node concept="3uibUv" id="5s44y2LiJ_8" role="A3Ik2">
                <ref role="3uigEE" to="hyam:~KeyEvent" resolve="KeyEvent" />
              </node>
            </node>
            <node concept="2OqwBi" id="5s44y2LiJ_9" role="33vP2m">
              <node concept="37vLTw" id="5s44y2LiJ_a" role="2Oq$k0">
                <ref role="3cqZAo" node="5s44y2LiJ_1" resolve="keyStrokes" />
              </node>
              <node concept="3goQfb" id="5s44y2LiJ_b" role="2OqNvi">
                <node concept="1bVj0M" id="5s44y2LiJ_c" role="23t8la">
                  <node concept="3clFbS" id="5s44y2LiJ_d" role="1bW5cS">
                    <node concept="3cpWs8" id="5s44y2LiJ_e" role="3cqZAp">
                      <node concept="3cpWsn" id="5s44y2LiJ_f" role="3cpWs9">
                        <property role="TrG5h" value="stroke" />
                        <node concept="2YIFZM" id="5s44y2LiJ_g" role="33vP2m">
                          <ref role="1Pybhc" to="dxuu:~KeyStroke" resolve="KeyStroke" />
                          <ref role="37wK5l" to="dxuu:~KeyStroke.getKeyStroke(java.lang.String):javax.swing.KeyStroke" resolve="getKeyStroke" />
                          <node concept="37vLTw" id="5s44y2LiJ_h" role="37wK5m">
                            <ref role="3cqZAo" node="5s44y2LiJAx" resolve="it" />
                          </node>
                        </node>
                        <node concept="3uibUv" id="5s44y2LiJ_i" role="1tU5fm">
                          <ref role="3uigEE" to="dxuu:~KeyStroke" resolve="KeyStroke" />
                        </node>
                      </node>
                    </node>
                    <node concept="3cpWs8" id="5s44y2LiJ_j" role="3cqZAp">
                      <node concept="3cpWsn" id="5s44y2LiJ_k" role="3cpWs9">
                        <property role="TrG5h" value="keyCode" />
                        <node concept="10Oyi0" id="5s44y2LiJ_l" role="1tU5fm" />
                        <node concept="2OqwBi" id="5s44y2LiJ_m" role="33vP2m">
                          <node concept="37vLTw" id="5s44y2LiJ_n" role="2Oq$k0">
                            <ref role="3cqZAo" node="5s44y2LiJ_f" resolve="stroke" />
                          </node>
                          <node concept="liA8E" id="5s44y2LiJ_o" role="2OqNvi">
                            <ref role="37wK5l" to="z60i:~AWTKeyStroke.getKeyCode():int" resolve="getKeyCode" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3cpWs8" id="5s44y2LiJ_p" role="3cqZAp">
                      <node concept="3cpWsn" id="5s44y2LiJ_q" role="3cpWs9">
                        <property role="TrG5h" value="keyChar" />
                        <node concept="10Pfzv" id="5s44y2LiJ_r" role="1tU5fm" />
                        <node concept="2OqwBi" id="5s44y2LiJ_s" role="33vP2m">
                          <node concept="liA8E" id="5s44y2LiJ_t" role="2OqNvi">
                            <ref role="37wK5l" to="z60i:~AWTKeyStroke.getKeyChar():char" resolve="getKeyChar" />
                          </node>
                          <node concept="37vLTw" id="5s44y2LiJ_u" role="2Oq$k0">
                            <ref role="3cqZAo" node="5s44y2LiJ_f" resolve="stroke" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3clFbJ" id="5s44y2LiJ_v" role="3cqZAp">
                      <node concept="3clFbS" id="5s44y2LiJ_w" role="3clFbx">
                        <node concept="3SKdUt" id="5s44y2LiJ_x" role="3cqZAp">
                          <node concept="3SKdUq" id="5s44y2LiJ_y" role="3SKWNk">
                            <property role="3SKdUp" value="todo it may be worthwhile to also detect other unicode chars from keyCode and supply them into keyChar" />
                          </node>
                        </node>
                        <node concept="3SKdUt" id="5s44y2LiJ_z" role="3cqZAp">
                          <node concept="3SKdUq" id="5s44y2LiJ_$" role="3SKWNk">
                            <property role="3SKdUp" value="There is currently no good complete cross-platform code to char conversion utility, it seems" />
                          </node>
                        </node>
                        <node concept="3SKdUt" id="5s44y2LiJ__" role="3cqZAp">
                          <node concept="3SKdUq" id="5s44y2LiJ_A" role="3SKWNk">
                            <property role="3SKdUp" value="KEY_PRESSED events may or may not contain a concrete keyChar. Its presence is definitely not a problem" />
                          </node>
                        </node>
                        <node concept="3clFbF" id="5s44y2LiJ_B" role="3cqZAp">
                          <node concept="37vLTI" id="5s44y2LiJ_C" role="3clFbG">
                            <node concept="10QFUN" id="5s44y2LiJ_D" role="37vLTx">
                              <node concept="37vLTw" id="5s44y2LiJ_E" role="10QFUP">
                                <ref role="3cqZAo" node="5s44y2LiJ_k" resolve="keyCode" />
                              </node>
                              <node concept="10Pfzv" id="5s44y2LiJ_F" role="10QFUM" />
                            </node>
                            <node concept="37vLTw" id="5s44y2LiJ_G" role="37vLTJ">
                              <ref role="3cqZAo" node="5s44y2LiJ_q" resolve="keyChar" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="1Wc70l" id="5s44y2LiJ_H" role="3clFbw">
                        <node concept="1Wc70l" id="5s44y2LiJ_I" role="3uHU7B">
                          <node concept="3clFbC" id="5s44y2LiJ_J" role="3uHU7B">
                            <node concept="37vLTw" id="5s44y2LiJ_K" role="3uHU7B">
                              <ref role="3cqZAo" node="5s44y2LiJ_q" resolve="keyChar" />
                            </node>
                            <node concept="10M0yZ" id="5s44y2LiJ_L" role="3uHU7w">
                              <ref role="3cqZAo" to="hyam:~KeyEvent.CHAR_UNDEFINED" resolve="CHAR_UNDEFINED" />
                              <ref role="1PxDUh" to="hyam:~KeyEvent" resolve="KeyEvent" />
                            </node>
                          </node>
                          <node concept="3y3z36" id="5s44y2LiJ_M" role="3uHU7w">
                            <node concept="37vLTw" id="5s44y2LiJ_N" role="3uHU7B">
                              <ref role="3cqZAo" node="5s44y2LiJ_k" resolve="keyCode" />
                            </node>
                            <node concept="10M0yZ" id="5s44y2LiJ_O" role="3uHU7w">
                              <ref role="1PxDUh" to="hyam:~KeyEvent" resolve="KeyEvent" />
                              <ref role="3cqZAo" to="hyam:~KeyEvent.VK_UNDEFINED" resolve="VK_UNDEFINED" />
                            </node>
                          </node>
                        </node>
                        <node concept="1eOMI4" id="5s44y2LiJ_P" role="3uHU7w">
                          <node concept="22lmx$" id="5s44y2LiJ_Q" role="1eOMHV">
                            <node concept="1eOMI4" id="5s44y2LiJ_R" role="3uHU7B">
                              <node concept="1Wc70l" id="5s44y2LiJ_S" role="1eOMHV">
                                <node concept="2dkUwp" id="5s44y2LiJ_T" role="3uHU7w">
                                  <node concept="10M0yZ" id="5s44y2LiJ_U" role="3uHU7w">
                                    <ref role="3cqZAo" to="hyam:~KeyEvent.VK_9" resolve="VK_9" />
                                    <ref role="1PxDUh" to="hyam:~KeyEvent" resolve="KeyEvent" />
                                  </node>
                                  <node concept="37vLTw" id="5s44y2LiJ_V" role="3uHU7B">
                                    <ref role="3cqZAo" node="5s44y2LiJ_k" resolve="keyCode" />
                                  </node>
                                </node>
                                <node concept="2d3UOw" id="5s44y2LiJ_W" role="3uHU7B">
                                  <node concept="37vLTw" id="5s44y2LiJ_X" role="3uHU7B">
                                    <ref role="3cqZAo" node="5s44y2LiJ_k" resolve="keyCode" />
                                  </node>
                                  <node concept="10M0yZ" id="5s44y2LiJ_Y" role="3uHU7w">
                                    <ref role="1PxDUh" to="hyam:~KeyEvent" resolve="KeyEvent" />
                                    <ref role="3cqZAo" to="hyam:~KeyEvent.VK_0" resolve="VK_0" />
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node concept="1eOMI4" id="5s44y2LiJ_Z" role="3uHU7w">
                              <node concept="1Wc70l" id="5s44y2LiJA0" role="1eOMHV">
                                <node concept="2dkUwp" id="5s44y2LiJA1" role="3uHU7w">
                                  <node concept="10M0yZ" id="5s44y2LiJA2" role="3uHU7w">
                                    <ref role="3cqZAo" to="hyam:~KeyEvent.VK_Z" resolve="VK_Z" />
                                    <ref role="1PxDUh" to="hyam:~KeyEvent" resolve="KeyEvent" />
                                  </node>
                                  <node concept="37vLTw" id="5s44y2LiJA3" role="3uHU7B">
                                    <ref role="3cqZAo" node="5s44y2LiJ_k" resolve="keyCode" />
                                  </node>
                                </node>
                                <node concept="2d3UOw" id="5s44y2LiJA4" role="3uHU7B">
                                  <node concept="37vLTw" id="5s44y2LiJA5" role="3uHU7B">
                                    <ref role="3cqZAo" node="5s44y2LiJ_k" resolve="keyCode" />
                                  </node>
                                  <node concept="10M0yZ" id="5s44y2LiJA6" role="3uHU7w">
                                    <ref role="1PxDUh" to="hyam:~KeyEvent" resolve="KeyEvent" />
                                    <ref role="3cqZAo" to="hyam:~KeyEvent.VK_A" resolve="VK_A" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="2n63Yl" id="5s44y2LiJAb" role="3cqZAp">
                      <node concept="2ShNRf" id="5s44y2LiJAc" role="2n6tg2">
                        <node concept="1pGfFk" id="5s44y2LiJAd" role="2ShVmc">
                          <ref role="37wK5l" to="hyam:~KeyEvent.&lt;init&gt;(java.awt.Component,int,long,int,int,char)" resolve="KeyEvent" />
                          <node concept="2OqwBi" id="62Gc_ZTnY1Y" role="37wK5m">
                            <node concept="37vLTw" id="62Gc_ZTnY1Z" role="2Oq$k0">
                              <ref role="3cqZAo" node="62Gc_ZTn_Aq" resolve="myEditorTest" />
                            </node>
                            <node concept="liA8E" id="62Gc_ZTnY20" role="2OqNvi">
                              <ref role="37wK5l" node="1BrKW0d9mQ7" resolve="getEditorComponent" />
                            </node>
                          </node>
                          <node concept="10M0yZ" id="5s44y2LiJAf" role="37wK5m">
                            <ref role="3cqZAo" to="hyam:~KeyEvent.KEY_PRESSED" resolve="KEY_PRESSED" />
                            <ref role="1PxDUh" to="hyam:~KeyEvent" resolve="KeyEvent" />
                          </node>
                          <node concept="3cmrfG" id="5s44y2LiJAg" role="37wK5m">
                            <property role="3cmrfH" value="0" />
                          </node>
                          <node concept="2OqwBi" id="5s44y2LiJAh" role="37wK5m">
                            <node concept="liA8E" id="5s44y2LiJAi" role="2OqNvi">
                              <ref role="37wK5l" to="z60i:~AWTKeyStroke.getModifiers():int" resolve="getModifiers" />
                            </node>
                            <node concept="37vLTw" id="5s44y2LiJAj" role="2Oq$k0">
                              <ref role="3cqZAo" node="5s44y2LiJ_f" resolve="stroke" />
                            </node>
                          </node>
                          <node concept="37vLTw" id="5s44y2LiJAk" role="37wK5m">
                            <ref role="3cqZAo" node="5s44y2LiJ_k" resolve="keyCode" />
                          </node>
                          <node concept="37vLTw" id="5s44y2LiJAl" role="37wK5m">
                            <ref role="3cqZAo" node="5s44y2LiJ_q" resolve="keyChar" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="2n63Yl" id="5s44y2LiJAm" role="3cqZAp">
                      <node concept="2ShNRf" id="5s44y2LiJAn" role="2n6tg2">
                        <node concept="1pGfFk" id="5s44y2LiJAo" role="2ShVmc">
                          <ref role="37wK5l" to="hyam:~KeyEvent.&lt;init&gt;(java.awt.Component,int,long,int,int,char)" resolve="KeyEvent" />
                          <node concept="2OqwBi" id="62Gc_ZTo0VM" role="37wK5m">
                            <node concept="37vLTw" id="62Gc_ZTo0VN" role="2Oq$k0">
                              <ref role="3cqZAo" node="62Gc_ZTn_Aq" resolve="myEditorTest" />
                            </node>
                            <node concept="liA8E" id="62Gc_ZTo0VO" role="2OqNvi">
                              <ref role="37wK5l" node="1BrKW0d9mQ7" resolve="getEditorComponent" />
                            </node>
                          </node>
                          <node concept="10M0yZ" id="5s44y2LiJAq" role="37wK5m">
                            <ref role="3cqZAo" to="hyam:~KeyEvent.KEY_RELEASED" resolve="KEY_RELEASED" />
                            <ref role="1PxDUh" to="hyam:~KeyEvent" resolve="KeyEvent" />
                          </node>
                          <node concept="3cmrfG" id="5s44y2LiJAr" role="37wK5m">
                            <property role="3cmrfH" value="0" />
                          </node>
                          <node concept="2OqwBi" id="5s44y2LiJAs" role="37wK5m">
                            <node concept="37vLTw" id="5s44y2LiJAt" role="2Oq$k0">
                              <ref role="3cqZAo" node="5s44y2LiJ_f" resolve="stroke" />
                            </node>
                            <node concept="liA8E" id="5s44y2LiJAu" role="2OqNvi">
                              <ref role="37wK5l" to="z60i:~AWTKeyStroke.getModifiers():int" resolve="getModifiers" />
                            </node>
                          </node>
                          <node concept="37vLTw" id="5s44y2LiJAv" role="37wK5m">
                            <ref role="3cqZAo" node="5s44y2LiJ_k" resolve="keyCode" />
                          </node>
                          <node concept="37vLTw" id="5s44y2LiJAw" role="37wK5m">
                            <ref role="3cqZAo" node="5s44y2LiJ_q" resolve="keyChar" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="Rh6nW" id="5s44y2LiJAx" role="1bW2Oz">
                    <property role="TrG5h" value="it" />
                    <node concept="2jxLKc" id="5s44y2LiJAy" role="1tU5fm" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5s44y2LiJAz" role="3cqZAp">
          <node concept="1rXfSq" id="5s44y2LiJA$" role="3clFbG">
            <ref role="37wK5l" node="5s44y2LgrQy" resolve="processKeyEvents" />
            <node concept="37vLTw" id="5s44y2LiJA_" role="37wK5m">
              <ref role="3cqZAo" node="5s44y2LiJ_6" resolve="events" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5s44y2LiJAA" role="Sfmx6">
        <ref role="3uigEE" to="wyt6:~InterruptedException" resolve="InterruptedException" />
      </node>
      <node concept="3uibUv" id="5s44y2LiJAB" role="Sfmx6">
        <ref role="3uigEE" to="t6h5:~InvocationTargetException" resolve="InvocationTargetException" />
      </node>
      <node concept="3Tm1VV" id="5s44y2LiJAC" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="5s44y2LgnLS" role="jymVt" />
    <node concept="3clFb_" id="5s44y2LgrQy" role="jymVt">
      <property role="TrG5h" value="processKeyEvents" />
      <property role="DiZV1" value="false" />
      <node concept="3cqZAl" id="5s44y2LgrQz" role="3clF45" />
      <node concept="37vLTG" id="5s44y2LgrQ$" role="3clF46">
        <property role="TrG5h" value="events" />
        <property role="3TUv4t" value="true" />
        <node concept="A3Dl8" id="5s44y2LgrQ_" role="1tU5fm">
          <node concept="3uibUv" id="5s44y2LgrQA" role="A3Ik2">
            <ref role="3uigEE" to="hyam:~KeyEvent" resolve="KeyEvent" />
          </node>
        </node>
      </node>
      <node concept="3clFbS" id="5s44y2LgrQB" role="3clF47">
        <node concept="3cpWs8" id="5s44y2LgrQG" role="3cqZAp">
          <node concept="3cpWsn" id="5s44y2LgrQH" role="3cpWs9">
            <property role="TrG5h" value="eventTargetComponent" />
            <property role="3TUv4t" value="true" />
            <node concept="3uibUv" id="5s44y2LgrQI" role="1tU5fm">
              <ref role="3uigEE" to="z60i:~Component" resolve="Component" />
            </node>
            <node concept="1rXfSq" id="5s44y2LgrQJ" role="33vP2m">
              <ref role="37wK5l" node="5s44y2LgzbX" resolve="getKeyEventTargetComponent" />
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="5s44y2LgrQK" role="3cqZAp">
          <node concept="3cpWsn" id="5s44y2LgrQL" role="3cpWs9">
            <property role="TrG5h" value="processKeyEventMethod" />
            <property role="3TUv4t" value="true" />
            <node concept="3uibUv" id="5s44y2LgrQM" role="1tU5fm">
              <ref role="3uigEE" to="t6h5:~Method" resolve="Method" />
            </node>
            <node concept="2YIFZM" id="5s44y2Lgsrl" role="33vP2m">
              <ref role="1Pybhc" node="5s44y2Lg6Up" resolve="KeyEventsDispatcher" />
              <ref role="37wK5l" node="5s44y2LgIl$" resolve="getProcessKeyEventMethod" />
              <node concept="37vLTw" id="5s44y2Lgsrm" role="37wK5m">
                <ref role="3cqZAo" node="5s44y2LgrQH" resolve="eventTargetComponent" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="5s44y2LgrQP" role="3cqZAp">
          <node concept="3cpWsn" id="5s44y2LgrQQ" role="3cpWs9">
            <property role="TrG5h" value="eventsPassed" />
            <property role="3TUv4t" value="true" />
            <node concept="10Q1$e" id="5s44y2LgrQR" role="1tU5fm">
              <node concept="10P_77" id="5s44y2LgrQS" role="10Q1$1" />
            </node>
            <node concept="2ShNRf" id="5s44y2LgrQT" role="33vP2m">
              <node concept="3g6Rrh" id="5s44y2LgrQU" role="2ShVmc">
                <node concept="10P_77" id="5s44y2LgrQV" role="3g7fb8" />
                <node concept="3clFbT" id="5s44y2LgrQW" role="3g7hyw">
                  <property role="3clFbU" value="true" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="5s44y2LgrR8" role="3cqZAp">
          <node concept="3clFbS" id="5s44y2LgrR9" role="3clFbx">
            <node concept="3clFbF" id="62Gc_ZTowlT" role="3cqZAp">
              <node concept="2OqwBi" id="62Gc_ZTowyI" role="3clFbG">
                <node concept="37vLTw" id="62Gc_ZTowlR" role="2Oq$k0">
                  <ref role="3cqZAo" node="62Gc_ZTn_Aq" resolve="myEditorTest" />
                </node>
                <node concept="liA8E" id="62Gc_ZTowX0" role="2OqNvi">
                  <ref role="37wK5l" node="62Gc_ZTkJBT" resolve="runUndoableInEDTAndWait" />
                  <node concept="1bVj0M" id="1TAMqXLJ4h3" role="37wK5m">
                    <node concept="3clFbS" id="1TAMqXLJ4h4" role="1bW5cS">
                      <node concept="3clFbF" id="5s44y2LgrRa" role="3cqZAp">
                        <node concept="2OqwBi" id="5s44y2LgrRb" role="3clFbG">
                          <node concept="37vLTw" id="5s44y2LgrRc" role="2Oq$k0">
                            <ref role="3cqZAo" node="5s44y2LgrQ$" resolve="events" />
                          </node>
                          <node concept="2es0OD" id="5s44y2LgrRd" role="2OqNvi">
                            <node concept="1bVj0M" id="5s44y2LgrRe" role="23t8la">
                              <node concept="3clFbS" id="5s44y2LgrRf" role="1bW5cS">
                                <node concept="3clFbJ" id="5s44y2LgrRg" role="3cqZAp">
                                  <node concept="3clFbS" id="5s44y2LgrRh" role="3clFbx">
                                    <node concept="3clFbF" id="4_5pru_FD95" role="3cqZAp">
                                      <node concept="2OqwBi" id="4_5pru_FD96" role="3clFbG">
                                        <node concept="liA8E" id="4_5pru_FD97" role="2OqNvi">
                                          <ref role="37wK5l" to="exr9:~EditorComponent.processKeyTyped(java.awt.event.KeyEvent):void" resolve="processKeyTyped" />
                                          <node concept="37vLTw" id="4_5pru_FD98" role="37wK5m">
                                            <ref role="3cqZAo" node="5s44y2LgrRJ" resolve="it" />
                                          </node>
                                        </node>
                                        <node concept="2OqwBi" id="62Gc_ZToAJj" role="2Oq$k0">
                                          <node concept="37vLTw" id="62Gc_ZToAJk" role="2Oq$k0">
                                            <ref role="3cqZAo" node="62Gc_ZTn_Aq" resolve="myEditorTest" />
                                          </node>
                                          <node concept="liA8E" id="62Gc_ZToAJl" role="2OqNvi">
                                            <ref role="37wK5l" node="1BrKW0d9mQ7" resolve="getEditorComponent" />
                                          </node>
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                  <node concept="3clFbC" id="5s44y2LgrRn" role="3clFbw">
                                    <node concept="10M0yZ" id="5s44y2LgrRo" role="3uHU7w">
                                      <ref role="1PxDUh" to="hyam:~KeyEvent" resolve="KeyEvent" />
                                      <ref role="3cqZAo" to="hyam:~KeyEvent.KEY_TYPED" resolve="KEY_TYPED" />
                                    </node>
                                    <node concept="2OqwBi" id="5s44y2LgrRp" role="3uHU7B">
                                      <node concept="37vLTw" id="5s44y2LgrRq" role="2Oq$k0">
                                        <ref role="3cqZAo" node="5s44y2LgrRJ" resolve="it" />
                                      </node>
                                      <node concept="liA8E" id="5s44y2LgrRr" role="2OqNvi">
                                        <ref role="37wK5l" to="z60i:~AWTEvent.getID():int" resolve="getID" />
                                      </node>
                                    </node>
                                  </node>
                                  <node concept="3eNFk2" id="5s44y2LgrRz" role="3eNLev">
                                    <node concept="3clFbS" id="5s44y2LgrR$" role="3eOfB_">
                                      <node concept="3clFbF" id="4_5pru_FG3p" role="3cqZAp">
                                        <node concept="2OqwBi" id="4_5pru_FG3q" role="3clFbG">
                                          <node concept="liA8E" id="4_5pru_FG3r" role="2OqNvi">
                                            <ref role="37wK5l" to="exr9:~EditorComponent.processKeyPressed(java.awt.event.KeyEvent):void" resolve="processKeyPressed" />
                                            <node concept="37vLTw" id="4_5pru_FG3s" role="37wK5m">
                                              <ref role="3cqZAo" node="5s44y2LgrRJ" resolve="it" />
                                            </node>
                                          </node>
                                          <node concept="2OqwBi" id="62Gc_ZToB9E" role="2Oq$k0">
                                            <node concept="37vLTw" id="62Gc_ZToB9F" role="2Oq$k0">
                                              <ref role="3cqZAo" node="62Gc_ZTn_Aq" resolve="myEditorTest" />
                                            </node>
                                            <node concept="liA8E" id="62Gc_ZToB9G" role="2OqNvi">
                                              <ref role="37wK5l" node="1BrKW0d9mQ7" resolve="getEditorComponent" />
                                            </node>
                                          </node>
                                        </node>
                                      </node>
                                    </node>
                                    <node concept="3clFbC" id="5s44y2LgrRE" role="3eO9$A">
                                      <node concept="10M0yZ" id="5s44y2LgrRF" role="3uHU7w">
                                        <ref role="1PxDUh" to="hyam:~KeyEvent" resolve="KeyEvent" />
                                        <ref role="3cqZAo" to="hyam:~KeyEvent.KEY_PRESSED" resolve="KEY_PRESSED" />
                                      </node>
                                      <node concept="2OqwBi" id="5s44y2LgrRG" role="3uHU7B">
                                        <node concept="37vLTw" id="5s44y2LgrRH" role="2Oq$k0">
                                          <ref role="3cqZAo" node="5s44y2LgrRJ" resolve="it" />
                                        </node>
                                        <node concept="liA8E" id="5s44y2LgrRI" role="2OqNvi">
                                          <ref role="37wK5l" to="z60i:~AWTEvent.getID():int" resolve="getID" />
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                  <node concept="3eNFk2" id="4_5pru_FNfL" role="3eNLev">
                                    <node concept="3clFbS" id="4_5pru_FNfM" role="3eOfB_">
                                      <node concept="3clFbF" id="4_5pru_FNfT" role="3cqZAp">
                                        <node concept="2OqwBi" id="4_5pru_FNfU" role="3clFbG">
                                          <node concept="liA8E" id="4_5pru_FNfV" role="2OqNvi">
                                            <ref role="37wK5l" to="exr9:~EditorComponent.processKeyReleased(java.awt.event.KeyEvent):void" resolve="processKeyReleased" />
                                            <node concept="37vLTw" id="4_5pru_FNfW" role="37wK5m">
                                              <ref role="3cqZAo" node="5s44y2LgrRJ" resolve="it" />
                                            </node>
                                          </node>
                                          <node concept="2OqwBi" id="62Gc_ZToB_1" role="2Oq$k0">
                                            <node concept="37vLTw" id="62Gc_ZToB_2" role="2Oq$k0">
                                              <ref role="3cqZAo" node="62Gc_ZTn_Aq" resolve="myEditorTest" />
                                            </node>
                                            <node concept="liA8E" id="62Gc_ZToB_3" role="2OqNvi">
                                              <ref role="37wK5l" node="1BrKW0d9mQ7" resolve="getEditorComponent" />
                                            </node>
                                          </node>
                                        </node>
                                      </node>
                                    </node>
                                    <node concept="3clFbC" id="4_5pru_FXhq" role="3eO9$A">
                                      <node concept="10M0yZ" id="4_5pru_FY4N" role="3uHU7w">
                                        <ref role="3cqZAo" to="hyam:~KeyEvent.KEY_RELEASED" resolve="KEY_RELEASED" />
                                        <ref role="1PxDUh" to="hyam:~KeyEvent" resolve="KeyEvent" />
                                      </node>
                                      <node concept="2OqwBi" id="4_5pru_FPk1" role="3uHU7B">
                                        <node concept="37vLTw" id="4_5pru_FP0H" role="2Oq$k0">
                                          <ref role="3cqZAo" node="5s44y2LgrRJ" resolve="it" />
                                        </node>
                                        <node concept="liA8E" id="4_5pru_FTYc" role="2OqNvi">
                                          <ref role="37wK5l" to="z60i:~AWTEvent.getID():int" resolve="getID" />
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                  <node concept="9aQIb" id="4_5pru_G1EV" role="9aQIa">
                                    <node concept="3clFbS" id="4_5pru_G1EW" role="9aQI4">
                                      <node concept="1gVbGN" id="4_5pru_Go6x" role="3cqZAp">
                                        <node concept="3clFbT" id="4_5pru_GoMr" role="1gVkn0" />
                                        <node concept="3cpWs3" id="4_5pru_GbQo" role="1gVpfI">
                                          <node concept="2OqwBi" id="4_5pru_Gcwq" role="3uHU7w">
                                            <node concept="37vLTw" id="4_5pru_GbQR" role="2Oq$k0">
                                              <ref role="3cqZAo" node="5s44y2LgrRJ" resolve="it" />
                                            </node>
                                            <node concept="liA8E" id="4_5pru_Gdua" role="2OqNvi">
                                              <ref role="37wK5l" to="z60i:~AWTEvent.getID():int" resolve="getID" />
                                            </node>
                                          </node>
                                          <node concept="Xl_RD" id="4_5pru_G41t" role="3uHU7B">
                                            <property role="Xl_RC" value="Wrong Id " />
                                          </node>
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                              <node concept="Rh6nW" id="5s44y2LgrRJ" role="1bW2Oz">
                                <property role="TrG5h" value="it" />
                                <node concept="2jxLKc" id="5s44y2LgrRK" role="1tU5fm" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbC" id="5s44y2LgrRL" role="3clFbw">
            <node concept="37vLTw" id="5s44y2LgrRM" role="3uHU7B">
              <ref role="3cqZAo" node="5s44y2LgrQH" resolve="eventTargetComponent" />
            </node>
            <node concept="10Nm6u" id="5s44y2LgrRN" role="3uHU7w" />
          </node>
          <node concept="9aQIb" id="5s44y2LgrRO" role="9aQIa">
            <node concept="3clFbS" id="5s44y2LgrRP" role="9aQI4">
              <node concept="3clFbF" id="62Gc_ZToyet" role="3cqZAp">
                <node concept="2OqwBi" id="62Gc_ZToyev" role="3clFbG">
                  <node concept="37vLTw" id="62Gc_ZToyew" role="2Oq$k0">
                    <ref role="3cqZAo" node="62Gc_ZTn_Aq" resolve="myEditorTest" />
                  </node>
                  <node concept="liA8E" id="62Gc_ZTo$tt" role="2OqNvi">
                    <ref role="37wK5l" node="62Gc_ZTkJBT" resolve="runUndoableInEDTAndWait" />
                    <node concept="1bVj0M" id="4_5pru_GfnP" role="37wK5m">
                      <node concept="3clFbS" id="4_5pru_GfnQ" role="1bW5cS">
                        <node concept="2Gpval" id="5s44y2LgrRQ" role="3cqZAp">
                          <node concept="2GrKxI" id="5s44y2LgrRR" role="2Gsz3X">
                            <property role="TrG5h" value="event" />
                          </node>
                          <node concept="37vLTw" id="5s44y2LgrRS" role="2GsD0m">
                            <ref role="3cqZAo" node="5s44y2LgrQ$" resolve="events" />
                          </node>
                          <node concept="3clFbS" id="5s44y2LgrRT" role="2LFqv$">
                            <node concept="SfApY" id="5s44y2LgrRU" role="3cqZAp">
                              <node concept="3clFbS" id="5s44y2LgrRV" role="SfCbr">
                                <node concept="3clFbF" id="5s44y2LgrRW" role="3cqZAp">
                                  <node concept="2OqwBi" id="5s44y2LgrRX" role="3clFbG">
                                    <node concept="37vLTw" id="5s44y2LgrRY" role="2Oq$k0">
                                      <ref role="3cqZAo" node="5s44y2LgrQL" resolve="processKeyEventMethod" />
                                    </node>
                                    <node concept="liA8E" id="5s44y2LgrRZ" role="2OqNvi">
                                      <ref role="37wK5l" to="t6h5:~Method.invoke(java.lang.Object,java.lang.Object...):java.lang.Object" resolve="invoke" />
                                      <node concept="37vLTw" id="5s44y2LgrS0" role="37wK5m">
                                        <ref role="3cqZAo" node="5s44y2LgrQH" resolve="eventTargetComponent" />
                                      </node>
                                      <node concept="2GrUjf" id="5s44y2LgrS1" role="37wK5m">
                                        <ref role="2Gs0qQ" node="5s44y2LgrRR" resolve="event" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                              <node concept="TDmWw" id="5s44y2LgrS2" role="TEbGg">
                                <node concept="3clFbS" id="5s44y2LgrS3" role="TDEfX">
                                  <node concept="3clFbF" id="5s44y2LgrS4" role="3cqZAp">
                                    <node concept="37vLTI" id="5s44y2LgrS5" role="3clFbG">
                                      <node concept="3clFbT" id="5s44y2LgrS6" role="37vLTx">
                                        <property role="3clFbU" value="false" />
                                      </node>
                                      <node concept="AH0OO" id="5s44y2LgrS7" role="37vLTJ">
                                        <node concept="3cmrfG" id="5s44y2LgrS8" role="AHEQo">
                                          <property role="3cmrfH" value="0" />
                                        </node>
                                        <node concept="37vLTw" id="5s44y2LgrS9" role="AHHXb">
                                          <ref role="3cqZAo" node="5s44y2LgrQQ" resolve="eventsPassed" />
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                </node>
                                <node concept="3cpWsn" id="5s44y2LgrSa" role="TDEfY">
                                  <property role="TrG5h" value="e" />
                                  <node concept="3uibUv" id="5s44y2LgrSb" role="1tU5fm">
                                    <ref role="3uigEE" to="t6h5:~InvocationTargetException" resolve="InvocationTargetException" />
                                  </node>
                                </node>
                              </node>
                              <node concept="TDmWw" id="5s44y2LgrSc" role="TEbGg">
                                <node concept="3clFbS" id="5s44y2LgrSd" role="TDEfX">
                                  <node concept="3clFbF" id="5s44y2LgrSe" role="3cqZAp">
                                    <node concept="37vLTI" id="5s44y2LgrSf" role="3clFbG">
                                      <node concept="3clFbT" id="5s44y2LgrSg" role="37vLTx">
                                        <property role="3clFbU" value="false" />
                                      </node>
                                      <node concept="AH0OO" id="5s44y2LgrSh" role="37vLTJ">
                                        <node concept="3cmrfG" id="5s44y2LgrSi" role="AHEQo">
                                          <property role="3cmrfH" value="0" />
                                        </node>
                                        <node concept="37vLTw" id="5s44y2LgrSj" role="AHHXb">
                                          <ref role="3cqZAo" node="5s44y2LgrQQ" resolve="eventsPassed" />
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                </node>
                                <node concept="3cpWsn" id="5s44y2LgrSk" role="TDEfY">
                                  <property role="TrG5h" value="e" />
                                  <node concept="3uibUv" id="5s44y2LgrSl" role="1tU5fm">
                                    <ref role="3uigEE" to="wyt6:~IllegalAccessException" resolve="IllegalAccessException" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3vwNmj" id="5s44y2LgrSq" role="3cqZAp">
          <node concept="AH0OO" id="5s44y2LgrSr" role="3vwVQn">
            <node concept="3cmrfG" id="5s44y2LgrSs" role="AHEQo">
              <property role="3cmrfH" value="0" />
            </node>
            <node concept="37vLTw" id="5s44y2LgrSt" role="AHHXb">
              <ref role="3cqZAo" node="5s44y2LgrQQ" resolve="eventsPassed" />
            </node>
          </node>
          <node concept="3_1$Yv" id="5s44y2LgrSu" role="3_9lra">
            <node concept="Xl_RD" id="5s44y2LgrSv" role="3_1BAH">
              <property role="Xl_RC" value="Keyboard events were not passed to corresponding component" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5s44y2LgrSw" role="Sfmx6">
        <ref role="3uigEE" to="wyt6:~InterruptedException" resolve="InterruptedException" />
      </node>
      <node concept="3uibUv" id="5s44y2LgrSx" role="Sfmx6">
        <ref role="3uigEE" to="t6h5:~InvocationTargetException" resolve="InvocationTargetException" />
      </node>
      <node concept="3Tm6S6" id="5s44y2Ln_6G" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="5s44y2LgAF1" role="jymVt" />
    <node concept="3clFb_" id="5s44y2LgzbX" role="jymVt">
      <property role="TrG5h" value="getKeyEventTargetComponent" />
      <property role="DiZV1" value="false" />
      <node concept="3uibUv" id="5s44y2LgzbY" role="3clF45">
        <ref role="3uigEE" to="z60i:~Component" resolve="Component" />
      </node>
      <node concept="3clFbS" id="5s44y2LgzbZ" role="3clF47">
        <node concept="3cpWs8" id="5s44y2Lgzc0" role="3cqZAp">
          <node concept="3cpWsn" id="5s44y2Lgzc1" role="3cpWs9">
            <property role="TrG5h" value="editorComponent" />
            <node concept="3uibUv" id="5s44y2Lgzc2" role="1tU5fm">
              <ref role="3uigEE" to="exr9:~EditorComponent" resolve="EditorComponent" />
            </node>
            <node concept="2OqwBi" id="62Gc_ZTnNvz" role="33vP2m">
              <node concept="37vLTw" id="62Gc_ZTnNv$" role="2Oq$k0">
                <ref role="3cqZAo" node="62Gc_ZTn_Aq" resolve="myEditorTest" />
              </node>
              <node concept="liA8E" id="62Gc_ZTnNv_" role="2OqNvi">
                <ref role="37wK5l" node="1BrKW0d9mQ7" resolve="getEditorComponent" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="5s44y2Lgzc4" role="3cqZAp">
          <node concept="3cpWsn" id="5s44y2Lgzc5" role="3cpWs9">
            <property role="TrG5h" value="selectedCell" />
            <node concept="3uibUv" id="5s44y2Lgzc6" role="1tU5fm">
              <ref role="3uigEE" to="f4zo:~EditorCell" resolve="EditorCell" />
            </node>
            <node concept="2OqwBi" id="5s44y2Lgzc7" role="33vP2m">
              <node concept="37vLTw" id="5s44y2Lgzc8" role="2Oq$k0">
                <ref role="3cqZAo" node="5s44y2Lgzc1" resolve="editorComponent" />
              </node>
              <node concept="liA8E" id="5s44y2Lgzc9" role="2OqNvi">
                <ref role="37wK5l" to="exr9:~EditorComponent.getSelectedCell():jetbrains.mps.openapi.editor.cells.EditorCell" resolve="getSelectedCell" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="5s44y2Lgzca" role="3cqZAp">
          <node concept="3clFbS" id="5s44y2Lgzcb" role="3clFbx">
            <node concept="3SKdUt" id="5s44y2Lgzcc" role="3cqZAp">
              <node concept="3SKdUq" id="5s44y2Lgzcd" role="3SKWNk">
                <property role="3SKdUp" value="TODO: return editorComponent here" />
              </node>
            </node>
            <node concept="3cpWs6" id="5s44y2Lgzce" role="3cqZAp">
              <node concept="10Nm6u" id="5s44y2Lgzcf" role="3cqZAk" />
            </node>
          </node>
          <node concept="3clFbC" id="5s44y2Lgzcg" role="3clFbw">
            <node concept="10Nm6u" id="5s44y2Lgzch" role="3uHU7w" />
            <node concept="37vLTw" id="5s44y2Lgzci" role="3uHU7B">
              <ref role="3cqZAo" node="5s44y2Lgzc5" resolve="selectedCell" />
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="5s44y2Lgzcj" role="3cqZAp">
          <node concept="3cpWsn" id="5s44y2Lgzck" role="3cpWs9">
            <property role="TrG5h" value="eventTarget" />
            <node concept="3uibUv" id="5s44y2Lgzcl" role="1tU5fm">
              <ref role="3uigEE" to="z60i:~Component" resolve="Component" />
            </node>
            <node concept="2YIFZM" id="5s44y2Lg_tr" role="33vP2m">
              <ref role="37wK5l" node="5s44y2LgV2w" resolve="getEventTargetComponent" />
              <ref role="1Pybhc" node="5s44y2Lh6_5" resolve="EditorUtil" />
              <node concept="37vLTw" id="5s44y2Lg_ts" role="37wK5m">
                <ref role="3cqZAo" node="5s44y2Lgzc5" resolve="selectedCell" />
              </node>
              <node concept="37vLTw" id="5s44y2Lg_tt" role="37wK5m">
                <ref role="3cqZAo" node="5s44y2Lgzc1" resolve="editorComponent" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="5s44y2Lgzcp" role="3cqZAp">
          <node concept="3clFbS" id="5s44y2Lgzcq" role="3clFbx">
            <node concept="3SKdUt" id="5s44y2Lgzcr" role="3cqZAp">
              <node concept="3SKdUq" id="5s44y2Lgzcs" role="3SKWNk">
                <property role="3SKdUp" value="TODO: return editorComponent here" />
              </node>
            </node>
            <node concept="3cpWs6" id="5s44y2Lgzct" role="3cqZAp">
              <node concept="10Nm6u" id="5s44y2Lgzcu" role="3cqZAk" />
            </node>
          </node>
          <node concept="3clFbC" id="5s44y2Lgzcv" role="3clFbw">
            <node concept="37vLTw" id="5s44y2Lgzcw" role="3uHU7w">
              <ref role="3cqZAo" node="5s44y2Lgzc1" resolve="editorComponent" />
            </node>
            <node concept="37vLTw" id="5s44y2Lgzcx" role="3uHU7B">
              <ref role="3cqZAo" node="5s44y2Lgzck" resolve="eventTarget" />
            </node>
          </node>
        </node>
        <node concept="2$JKZl" id="5s44y2Lgzcy" role="3cqZAp">
          <node concept="3clFbS" id="5s44y2Lgzcz" role="2LFqv$">
            <node concept="3clFbF" id="5s44y2Lgzc$" role="3cqZAp">
              <node concept="37vLTI" id="5s44y2Lgzc_" role="3clFbG">
                <node concept="2OqwBi" id="5s44y2LgzcA" role="37vLTx">
                  <node concept="liA8E" id="5s44y2LgzcB" role="2OqNvi">
                    <ref role="37wK5l" to="z60i:~Container.getComponent(int):java.awt.Component" resolve="getComponent" />
                    <node concept="3cpWsd" id="5s44y2LgzcC" role="37wK5m">
                      <node concept="3cmrfG" id="5s44y2LgzcD" role="3uHU7w">
                        <property role="3cmrfH" value="1" />
                      </node>
                      <node concept="2OqwBi" id="5s44y2LgzcE" role="3uHU7B">
                        <node concept="1eOMI4" id="5s44y2LgzcF" role="2Oq$k0">
                          <node concept="10QFUN" id="5s44y2LgzcG" role="1eOMHV">
                            <node concept="3uibUv" id="5s44y2LgzcH" role="10QFUM">
                              <ref role="3uigEE" to="dxuu:~JComponent" resolve="JComponent" />
                            </node>
                            <node concept="37vLTw" id="5s44y2LgzcI" role="10QFUP">
                              <ref role="3cqZAo" node="5s44y2Lgzck" resolve="eventTarget" />
                            </node>
                          </node>
                        </node>
                        <node concept="liA8E" id="5s44y2LgzcJ" role="2OqNvi">
                          <ref role="37wK5l" to="z60i:~Container.getComponentCount():int" resolve="getComponentCount" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="1eOMI4" id="5s44y2LgzcK" role="2Oq$k0">
                    <node concept="10QFUN" id="5s44y2LgzcL" role="1eOMHV">
                      <node concept="3uibUv" id="5s44y2LgzcM" role="10QFUM">
                        <ref role="3uigEE" to="dxuu:~JComponent" resolve="JComponent" />
                      </node>
                      <node concept="37vLTw" id="5s44y2LgzcN" role="10QFUP">
                        <ref role="3cqZAo" node="5s44y2Lgzck" resolve="eventTarget" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="37vLTw" id="5s44y2LgzcO" role="37vLTJ">
                  <ref role="3cqZAo" node="5s44y2Lgzck" resolve="eventTarget" />
                </node>
              </node>
            </node>
          </node>
          <node concept="1Wc70l" id="5s44y2LgzcP" role="2$JKZa">
            <node concept="1eOMI4" id="5s44y2LgzcQ" role="3uHU7B">
              <node concept="2ZW3vV" id="5s44y2LgzcR" role="1eOMHV">
                <node concept="3uibUv" id="5s44y2LgzcS" role="2ZW6by">
                  <ref role="3uigEE" to="dxuu:~JComponent" resolve="JComponent" />
                </node>
                <node concept="37vLTw" id="5s44y2LgzcT" role="2ZW6bz">
                  <ref role="3cqZAo" node="5s44y2Lgzck" resolve="eventTarget" />
                </node>
              </node>
            </node>
            <node concept="3eOSWO" id="5s44y2LgzcU" role="3uHU7w">
              <node concept="3cmrfG" id="5s44y2LgzcV" role="3uHU7w">
                <property role="3cmrfH" value="0" />
              </node>
              <node concept="2OqwBi" id="5s44y2LgzcW" role="3uHU7B">
                <node concept="1eOMI4" id="5s44y2LgzcX" role="2Oq$k0">
                  <node concept="10QFUN" id="5s44y2LgzcY" role="1eOMHV">
                    <node concept="3uibUv" id="5s44y2LgzcZ" role="10QFUM">
                      <ref role="3uigEE" to="dxuu:~JComponent" resolve="JComponent" />
                    </node>
                    <node concept="37vLTw" id="5s44y2Lgzd0" role="10QFUP">
                      <ref role="3cqZAo" node="5s44y2Lgzck" resolve="eventTarget" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="5s44y2Lgzd1" role="2OqNvi">
                  <ref role="37wK5l" to="z60i:~Container.getComponentCount():int" resolve="getComponentCount" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="5s44y2Lgzd2" role="3cqZAp">
          <node concept="37vLTw" id="5s44y2Lgzd3" role="3cqZAk">
            <ref role="3cqZAo" node="5s44y2Lgzck" resolve="eventTarget" />
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="5s44y2Lgzd4" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="5s44y2LgLMU" role="jymVt" />
    <node concept="2tJIrI" id="5s44y2LgIlz" role="jymVt" />
    <node concept="2YIFZL" id="5s44y2LgIl$" role="jymVt">
      <property role="TrG5h" value="getProcessKeyEventMethod" />
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <node concept="37vLTG" id="5s44y2LgIl_" role="3clF46">
        <property role="TrG5h" value="eventTargetComponent" />
        <node concept="3uibUv" id="5s44y2LgIlA" role="1tU5fm">
          <ref role="3uigEE" to="z60i:~Component" resolve="Component" />
        </node>
      </node>
      <node concept="3clFbS" id="5s44y2LgIlB" role="3clF47">
        <node concept="3clFbJ" id="5s44y2LgIlC" role="3cqZAp">
          <node concept="3clFbS" id="5s44y2LgIlD" role="3clFbx">
            <node concept="3cpWs6" id="5s44y2LgIlE" role="3cqZAp">
              <node concept="10Nm6u" id="5s44y2LgIlF" role="3cqZAk" />
            </node>
          </node>
          <node concept="3clFbC" id="5s44y2LgIlG" role="3clFbw">
            <node concept="37vLTw" id="5s44y2LgIlH" role="3uHU7B">
              <ref role="3cqZAo" node="5s44y2LgIl_" resolve="eventTargetComponent" />
            </node>
            <node concept="10Nm6u" id="5s44y2LgIlI" role="3uHU7w" />
          </node>
        </node>
        <node concept="3cpWs8" id="5s44y2LgIlJ" role="3cqZAp">
          <node concept="3cpWsn" id="5s44y2LgIlK" role="3cpWs9">
            <property role="TrG5h" value="clazz" />
            <node concept="3uibUv" id="5s44y2LgIlL" role="1tU5fm">
              <ref role="3uigEE" to="wyt6:~Class" resolve="Class" />
              <node concept="3qTvmN" id="5s44y2LgIlM" role="11_B2D" />
            </node>
            <node concept="2OqwBi" id="5s44y2LgIlN" role="33vP2m">
              <node concept="37vLTw" id="5s44y2LgIlO" role="2Oq$k0">
                <ref role="3cqZAo" node="5s44y2LgIl_" resolve="eventTargetComponent" />
              </node>
              <node concept="liA8E" id="5s44y2LgIlP" role="2OqNvi">
                <ref role="37wK5l" to="wyt6:~Object.getClass():java.lang.Class" resolve="getClass" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="5s44y2LgIlQ" role="3cqZAp">
          <node concept="3cpWsn" id="5s44y2LgIlR" role="3cpWs9">
            <property role="TrG5h" value="theMethod" />
            <node concept="3uibUv" id="5s44y2LgIlS" role="1tU5fm">
              <ref role="3uigEE" to="t6h5:~Method" resolve="Method" />
            </node>
            <node concept="10Nm6u" id="5s44y2LgIlT" role="33vP2m" />
          </node>
        </node>
        <node concept="2$JKZl" id="5s44y2LgIlU" role="3cqZAp">
          <node concept="3clFbS" id="5s44y2LgIlV" role="2LFqv$">
            <node concept="SfApY" id="5s44y2LgIlW" role="3cqZAp">
              <node concept="3clFbS" id="5s44y2LgIlX" role="SfCbr">
                <node concept="3clFbF" id="5s44y2LgIlY" role="3cqZAp">
                  <node concept="37vLTI" id="5s44y2LgIlZ" role="3clFbG">
                    <node concept="2OqwBi" id="5s44y2LgIm0" role="37vLTx">
                      <node concept="37vLTw" id="5s44y2LgIm1" role="2Oq$k0">
                        <ref role="3cqZAo" node="5s44y2LgIlK" resolve="clazz" />
                      </node>
                      <node concept="liA8E" id="5s44y2LgIm2" role="2OqNvi">
                        <ref role="37wK5l" to="wyt6:~Class.getDeclaredMethod(java.lang.String,java.lang.Class...):java.lang.reflect.Method" resolve="getDeclaredMethod" />
                        <node concept="Xl_RD" id="5s44y2LgIm3" role="37wK5m">
                          <property role="Xl_RC" value="processKeyEvent" />
                        </node>
                        <node concept="3VsKOn" id="5s44y2LgIm4" role="37wK5m">
                          <ref role="3VsUkX" to="hyam:~KeyEvent" resolve="KeyEvent" />
                        </node>
                      </node>
                    </node>
                    <node concept="37vLTw" id="5s44y2LgIm5" role="37vLTJ">
                      <ref role="3cqZAo" node="5s44y2LgIlR" resolve="theMethod" />
                    </node>
                  </node>
                </node>
                <node concept="3clFbF" id="5s44y2LgIm6" role="3cqZAp">
                  <node concept="2OqwBi" id="5s44y2LgIm7" role="3clFbG">
                    <node concept="37vLTw" id="5s44y2LgIm8" role="2Oq$k0">
                      <ref role="3cqZAo" node="5s44y2LgIlR" resolve="theMethod" />
                    </node>
                    <node concept="liA8E" id="5s44y2LgIm9" role="2OqNvi">
                      <ref role="37wK5l" to="t6h5:~AccessibleObject.setAccessible(boolean):void" resolve="setAccessible" />
                      <node concept="3clFbT" id="5s44y2LgIma" role="37wK5m">
                        <property role="3clFbU" value="true" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3cpWs6" id="5s44y2LgImb" role="3cqZAp">
                  <node concept="37vLTw" id="5s44y2LgImc" role="3cqZAk">
                    <ref role="3cqZAo" node="5s44y2LgIlR" resolve="theMethod" />
                  </node>
                </node>
              </node>
              <node concept="TDmWw" id="5s44y2LgImd" role="TEbGg">
                <node concept="3clFbS" id="5s44y2LgIme" role="TDEfX" />
                <node concept="3cpWsn" id="5s44y2LgImf" role="TDEfY">
                  <property role="TrG5h" value="e" />
                  <node concept="3uibUv" id="5s44y2LgImg" role="1tU5fm">
                    <ref role="3uigEE" to="wyt6:~NoSuchMethodException" resolve="NoSuchMethodException" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbF" id="5s44y2LgImh" role="3cqZAp">
              <node concept="37vLTI" id="5s44y2LgImi" role="3clFbG">
                <node concept="2OqwBi" id="5s44y2LgImj" role="37vLTx">
                  <node concept="37vLTw" id="5s44y2LgImk" role="2Oq$k0">
                    <ref role="3cqZAo" node="5s44y2LgIlK" resolve="clazz" />
                  </node>
                  <node concept="liA8E" id="5s44y2LgIml" role="2OqNvi">
                    <ref role="37wK5l" to="wyt6:~Class.getSuperclass():java.lang.Class" resolve="getSuperclass" />
                  </node>
                </node>
                <node concept="37vLTw" id="5s44y2LgImm" role="37vLTJ">
                  <ref role="3cqZAo" node="5s44y2LgIlK" resolve="clazz" />
                </node>
              </node>
            </node>
          </node>
          <node concept="1Wc70l" id="5s44y2LgImn" role="2$JKZa">
            <node concept="3clFbC" id="5s44y2LgImo" role="3uHU7B">
              <node concept="10Nm6u" id="5s44y2LgImp" role="3uHU7w" />
              <node concept="37vLTw" id="5s44y2LgImq" role="3uHU7B">
                <ref role="3cqZAo" node="5s44y2LgIlR" resolve="theMethod" />
              </node>
            </node>
            <node concept="3y3z36" id="5s44y2LgImr" role="3uHU7w">
              <node concept="10Nm6u" id="5s44y2LgIms" role="3uHU7w" />
              <node concept="37vLTw" id="5s44y2LgImt" role="3uHU7B">
                <ref role="3cqZAo" node="5s44y2LgIlK" resolve="clazz" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3xETmq" id="5s44y2LgImu" role="3cqZAp">
          <node concept="3_1$Yv" id="5s44y2LgImv" role="3_9lra">
            <node concept="3cpWs3" id="5s44y2LgImw" role="3_1BAH">
              <node concept="Xl_RD" id="5s44y2LgImx" role="3uHU7w">
                <property role="Xl_RC" value="class" />
              </node>
              <node concept="3cpWs3" id="5s44y2LgImy" role="3uHU7B">
                <node concept="Xl_RD" id="5s44y2LgImz" role="3uHU7B">
                  <property role="Xl_RC" value="Cannot find processKeyEvent method in " />
                </node>
                <node concept="2OqwBi" id="5s44y2LgIm$" role="3uHU7w">
                  <node concept="37vLTw" id="5s44y2LgIm_" role="2Oq$k0">
                    <ref role="3cqZAo" node="5s44y2LgIl_" resolve="eventTargetComponent" />
                  </node>
                  <node concept="liA8E" id="5s44y2LgImA" role="2OqNvi">
                    <ref role="37wK5l" to="wyt6:~Object.getClass():java.lang.Class" resolve="getClass" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="5s44y2LgImB" role="3cqZAp">
          <node concept="10Nm6u" id="5s44y2LgImC" role="3cqZAk" />
        </node>
      </node>
      <node concept="3Tm6S6" id="5s44y2LgImD" role="1B3o_S" />
      <node concept="3uibUv" id="5s44y2LgImE" role="3clF45">
        <ref role="3uigEE" to="t6h5:~Method" resolve="Method" />
      </node>
    </node>
    <node concept="3Tm1VV" id="5s44y2Lg6Uq" role="1B3o_S" />
  </node>
  <node concept="3HP615" id="4_ksyPqMhZ7">
    <property role="TrG5h" value="TestRunner" />
    <property role="3GE5qa" value="transformation" />
    <node concept="3clFb_" id="4_ksyPqMjK0" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="initTest" />
      <node concept="37vLTG" id="4_ksyPqMmPh" role="3clF46">
        <property role="TrG5h" value="test" />
        <property role="3TUv4t" value="true" />
        <node concept="3uibUv" id="4_ksyPqMmPi" role="1tU5fm">
          <ref role="3uigEE" node="e$hNri9cbt" resolve="TransformationTest" />
        </node>
      </node>
      <node concept="37vLTG" id="4_ksyPqMRlr" role="3clF46">
        <property role="TrG5h" value="projectPath" />
        <node concept="2AHcQZ" id="4_ksyPqMRls" role="2AJF6D">
          <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
        </node>
        <node concept="17QB3L" id="4_ksyPqMRlt" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="4_ksyPqMr4g" role="3clF46">
        <property role="TrG5h" value="modelName" />
        <property role="3TUv4t" value="false" />
        <node concept="17QB3L" id="4_ksyPqMr4h" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="4_ksyPqMFas" role="3clF46">
        <property role="TrG5h" value="reOpenProject" />
        <node concept="10P_77" id="4_ksyPqMFaA" role="1tU5fm" />
      </node>
      <node concept="3cqZAl" id="4_ksyPqMjK2" role="3clF45" />
      <node concept="3Tm1VV" id="4_ksyPqMjK3" role="1B3o_S" />
      <node concept="3clFbS" id="4_ksyPqMjK4" role="3clF47" />
      <node concept="3uibUv" id="4_ksyPqO9wR" role="Sfmx6">
        <ref role="3uigEE" to="wyt6:~Exception" resolve="Exception" />
      </node>
    </node>
    <node concept="3clFb_" id="4_ksyPqMVtv" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="runTest" />
      <node concept="37vLTG" id="4_ksyPqMVvt" role="3clF46">
        <property role="3TUv4t" value="true" />
        <property role="TrG5h" value="test" />
        <node concept="3uibUv" id="4_ksyPqMVvu" role="1tU5fm">
          <ref role="3uigEE" node="e$hNri9cbt" resolve="TransformationTest" />
        </node>
      </node>
      <node concept="37vLTG" id="4_ksyPqN9pC" role="3clF46">
        <property role="TrG5h" value="className" />
        <node concept="17QB3L" id="4_ksyPqN9pD" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="4_ksyPqNbjn" role="3clF46">
        <property role="TrG5h" value="methodName" />
        <property role="3TUv4t" value="true" />
        <node concept="17QB3L" id="4_ksyPqNbj_" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="4_ksyPqNdbc" role="3clF46">
        <property role="TrG5h" value="runInCommand" />
        <node concept="10P_77" id="4_ksyPqNdbq" role="1tU5fm" />
      </node>
      <node concept="3cqZAl" id="4_ksyPqMVtx" role="3clF45" />
      <node concept="3Tm1VV" id="4_ksyPqMVty" role="1B3o_S" />
      <node concept="3clFbS" id="4_ksyPqMVtz" role="3clF47" />
      <node concept="3uibUv" id="4_ksyPqOcjV" role="Sfmx6">
        <ref role="3uigEE" to="wyt6:~Throwable" resolve="Throwable" />
      </node>
    </node>
    <node concept="3Tm1VV" id="4_ksyPqMhZ8" role="1B3o_S" />
  </node>
  <node concept="312cEu" id="2ky3Rs1t$JN">
    <property role="3GE5qa" value="transformation" />
    <property role="TrG5h" value="LightEnvironment" />
    <node concept="3Tm1VV" id="2ky3Rs1t$JO" role="1B3o_S" />
    <node concept="3uibUv" id="2ky3Rs1tG7N" role="EKbjA">
      <ref role="3uigEE" to="79ha:HKKzfMjqRV" resolve="Environment" />
    </node>
    <node concept="3clFb_" id="2ky3Rs1tG84" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="createEmptyProject" />
      <node concept="3uibUv" id="2ky3Rs1tG85" role="3clF45">
        <ref role="3uigEE" to="z1c3:~Project" resolve="Project" />
      </node>
      <node concept="3Tm1VV" id="2ky3Rs1tG86" role="1B3o_S" />
      <node concept="2AHcQZ" id="2ky3Rs1tG88" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
      </node>
      <node concept="3clFbS" id="2ky3Rs1tG8d" role="3clF47">
        <node concept="YS8fn" id="3gkLS5jheHP" role="3cqZAp">
          <node concept="2ShNRf" id="3gkLS5jheHQ" role="YScLw">
            <node concept="1pGfFk" id="3gkLS5jheHR" role="2ShVmc">
              <ref role="37wK5l" to="wyt6:~UnsupportedOperationException.&lt;init&gt;()" resolve="UnsupportedOperationException" />
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="2ky3Rs1tGlP" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="2tJIrI" id="2ky3Rs1tGfq" role="jymVt" />
    <node concept="3clFb_" id="2ky3Rs1tG8g" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="createProject" />
      <node concept="3uibUv" id="2ky3Rs1tG8h" role="3clF45">
        <ref role="3uigEE" to="z1c3:~Project" resolve="Project" />
      </node>
      <node concept="3Tm1VV" id="2ky3Rs1tG8i" role="1B3o_S" />
      <node concept="2AHcQZ" id="2ky3Rs1tG8k" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
      </node>
      <node concept="37vLTG" id="2ky3Rs1tG8l" role="3clF46">
        <property role="TrG5h" value="strategy" />
        <node concept="3uibUv" id="2ky3Rs1tG8m" role="1tU5fm">
          <ref role="3uigEE" to="79ha:5A5jZrz4rws" resolve="ProjectStrategy" />
        </node>
        <node concept="2AHcQZ" id="2ky3Rs1tG8n" role="2AJF6D">
          <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
        </node>
      </node>
      <node concept="3clFbS" id="2ky3Rs1tG8s" role="3clF47">
        <node concept="YS8fn" id="3gkLS5jgGtk" role="3cqZAp">
          <node concept="2ShNRf" id="3gkLS5jgGx7" role="YScLw">
            <node concept="1pGfFk" id="3gkLS5jheHx" role="2ShVmc">
              <ref role="37wK5l" to="wyt6:~UnsupportedOperationException.&lt;init&gt;()" resolve="UnsupportedOperationException" />
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="2ky3Rs1tGlO" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="2tJIrI" id="2ky3Rs1tKuC" role="jymVt" />
    <node concept="3clFb_" id="2ky3Rs1tG8v" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="dispose" />
      <node concept="3cqZAl" id="2ky3Rs1tG8w" role="3clF45" />
      <node concept="3Tm1VV" id="2ky3Rs1tG8x" role="1B3o_S" />
      <node concept="3clFbS" id="2ky3Rs1tG8A" role="3clF47" />
      <node concept="2AHcQZ" id="2ky3Rs1tGlL" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="2tJIrI" id="2ky3Rs1tKo$" role="jymVt" />
    <node concept="3clFb_" id="2ky3Rs1tG8B" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="flushAllEvents" />
      <node concept="3Tm1VV" id="2ky3Rs1tG8D" role="1B3o_S" />
      <node concept="3cqZAl" id="2ky3Rs1tG8E" role="3clF45" />
      <node concept="3clFbS" id="2ky3Rs1tG8I" role="3clF47">
        <node concept="3clFbF" id="6m1MVDkUQcP" role="3cqZAp">
          <node concept="2YIFZM" id="6m1MVDkUQcQ" role="3clFbG">
            <ref role="37wK5l" to="3a50:~ThreadUtils.runInUIThreadAndWait(java.lang.Runnable):java.lang.Exception" resolve="runInUIThreadAndWait" />
            <ref role="1Pybhc" to="3a50:~ThreadUtils" resolve="ThreadUtils" />
            <node concept="1bVj0M" id="3rTF030YdQj" role="37wK5m">
              <node concept="3clFbS" id="3rTF030YdQs" role="1bW5cS">
                <node concept="3cpWs6" id="3rTF030YBUl" role="3cqZAp" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="2ky3Rs1tGlM" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="2tJIrI" id="2ky3Rs1tKix" role="jymVt" />
    <node concept="3clFb_" id="2ky3Rs1tG8J" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getPlatform" />
      <node concept="3uibUv" id="2ky3Rs1tG8K" role="3clF45">
        <ref role="3uigEE" to="4o98:~Platform" resolve="Platform" />
      </node>
      <node concept="3Tm1VV" id="2ky3Rs1tG8L" role="1B3o_S" />
      <node concept="3clFbS" id="2ky3Rs1tG8P" role="3clF47">
        <node concept="3clFbF" id="2ky3Rs1tG8R" role="3cqZAp">
          <node concept="10Nm6u" id="2ky3Rs1tG8Q" role="3clFbG" />
        </node>
      </node>
      <node concept="2AHcQZ" id="2ky3Rs1tGlK" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="2tJIrI" id="2ky3Rs1tKcv" role="jymVt" />
    <node concept="3clFb_" id="2ky3Rs1tG8S" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="init" />
      <node concept="3Tm1VV" id="2ky3Rs1tG8U" role="1B3o_S" />
      <node concept="3cqZAl" id="2ky3Rs1tG8V" role="3clF45" />
      <node concept="3clFbS" id="2ky3Rs1tG8W" role="3clF47" />
      <node concept="2AHcQZ" id="2ky3Rs1tGlQ" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="2tJIrI" id="2ky3Rs1tK6u" role="jymVt" />
    <node concept="3clFb_" id="2ky3Rs1tG8X" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="openProject" />
      <property role="IEkAT" value="false" />
      <node concept="37vLTG" id="2ky3Rs1tG8Y" role="3clF46">
        <property role="TrG5h" value="projectFile" />
        <node concept="3uibUv" id="2ky3Rs1tG8Z" role="1tU5fm">
          <ref role="3uigEE" to="guwi:~File" resolve="File" />
        </node>
        <node concept="2AHcQZ" id="2ky3Rs1tG90" role="2AJF6D">
          <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
        </node>
      </node>
      <node concept="3uibUv" id="2ky3Rs1tG91" role="3clF45">
        <ref role="3uigEE" to="z1c3:~Project" resolve="Project" />
      </node>
      <node concept="3Tm1VV" id="2ky3Rs1tG92" role="1B3o_S" />
      <node concept="2AHcQZ" id="2ky3Rs1tG94" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
      </node>
      <node concept="3clFbS" id="2ky3Rs1tG95" role="3clF47">
        <node concept="YS8fn" id="3gkLS5jhf33" role="3cqZAp">
          <node concept="2ShNRf" id="3gkLS5jhf6O" role="YScLw">
            <node concept="1pGfFk" id="3gkLS5jhgqS" role="2ShVmc">
              <ref role="37wK5l" to="wyt6:~UnsupportedOperationException.&lt;init&gt;()" resolve="UnsupportedOperationException" />
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="2ky3Rs1tGlN" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="2tJIrI" id="2ky3Rs1tGy5" role="jymVt" />
    <node concept="3clFb_" id="2ky3Rs1tGqG" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="release" />
      <node concept="3Tm1VV" id="2ky3Rs1tGqI" role="1B3o_S" />
      <node concept="3cqZAl" id="2ky3Rs1tGqJ" role="3clF45" />
      <node concept="3clFbS" id="2ky3Rs1tGqO" role="3clF47" />
      <node concept="2AHcQZ" id="2ky3Rs1tKFs" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="2tJIrI" id="2ky3Rs1tK$H" role="jymVt" />
    <node concept="3clFb_" id="2ky3Rs1tGqP" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="retain" />
      <node concept="3Tm1VV" id="2ky3Rs1tGqR" role="1B3o_S" />
      <node concept="3cqZAl" id="2ky3Rs1tGqS" role="3clF45" />
      <node concept="3clFbS" id="2ky3Rs1tGqX" role="3clF47" />
      <node concept="2AHcQZ" id="2ky3Rs1tKFr" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
  </node>
</model>

