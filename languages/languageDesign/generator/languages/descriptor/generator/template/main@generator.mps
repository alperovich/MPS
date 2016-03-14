<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:1dfaf07d-c77a-451e-91d3-b6f80f0f8508(jetbrains.mps.lang.descriptor.generator.template.main@generator)">
  <persistence version="9" />
  <languages>
    <use id="df345b11-b8c7-4213-ac66-48d2a9b75d88" name="jetbrains.mps.baseLanguageInternal" version="0" />
    <use id="f4ad079d-bc71-4ffb-9600-9328705cf998" name="jetbrains.mps.lang.descriptor" version="0" />
    <use id="b401a680-8325-4110-8fd3-84331ff25bef" name="jetbrains.mps.lang.generator" version="0" />
    <use id="d7706f63-9be2-479c-a3da-ae92af1e64d5" name="jetbrains.mps.lang.generator.generationContext" version="0" />
    <use id="86ef8290-12bb-4ca7-947f-093788f263a9" name="jetbrains.mps.lang.project" version="0" />
    <use id="c0080a47-7e37-4558-bee9-9ae18e690549" name="jetbrains.mps.lang.extension" version="1" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports>
    <import index="yv2q" ref="r:cdf8afc0-fdc6-47ca-b829-7b2226168efa(jetbrains.mps.lang.descriptor.structure)" />
    <import index="hypd" ref="r:aa31e43e-9240-4f4d-b6db-5c1c9a86c59e(jetbrains.mps.lang.project.structure)" />
    <import index="tp3b" ref="r:00000000-0000-4000-0000-011c8959035b(jetbrains.mps.lang.findUsages.structure)" />
    <import index="wev6" ref="r:f29914af-ae14-4589-b53d-f60c6018b368(jetbrains.mps.lang.project.behavior)" />
    <import index="vndm" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel.language(MPS.Core/)" />
    <import index="tpek" ref="r:00000000-0000-4000-0000-011c895902c0(jetbrains.mps.baseLanguage.behavior)" />
    <import index="tpc2" ref="r:00000000-0000-4000-0000-011c8959029e(jetbrains.mps.lang.editor.structure)" />
    <import index="tpee" ref="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" />
    <import index="zq1i" ref="r:db5137e2-4fb5-4a7c-926a-237f59e67877(jetbrains.mps.lang.descriptor.generator.template.utils)" />
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" />
    <import index="iwf0" ref="1ed103c3-3aa6-49b7-9c21-6765ee11f224/java:jetbrains.mps.openapi.editor.descriptor(MPS.Editor/)" />
    <import index="dush" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.persistence(MPS.OpenAPI/)" />
    <import index="mhbf" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.model(MPS.OpenAPI/)" />
    <import index="w1kc" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel(MPS.Core/)" />
    <import index="z1c3" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.project(MPS.Core/)" />
    <import index="33ny" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.util(JDK/)" />
    <import index="wyt6" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)" />
    <import index="lui2" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.module(MPS.OpenAPI/)" />
    <import index="tft2" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.generator.impl.plan(MPS.Core/)" />
    <import index="ze1i" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel.runtime(MPS.Core/)" />
    <import index="r99j" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.generator.runtime(MPS.Core/)" />
    <import index="w0gx" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.project.structure.modules(MPS.Core/)" />
    <import index="qurh" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.lang.typesystem.runtime(MPS.Core/)" />
    <import index="vvvw" ref="r:b16ff46d-fa06-479d-9f5c-5b6e17e7f1b2(jetbrains.mps.make.facet.structure)" />
    <import index="e8bb" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel.adapter.ids(MPS.Core/)" />
    <import index="9eus" ref="1ed103c3-3aa6-49b7-9c21-6765ee11f224/java:jetbrains.mps.openapi.actions.descriptor(MPS.Editor/)" />
    <import index="w386" ref="1ed103c3-3aa6-49b7-9c21-6765ee11f224/java:jetbrains.mps.actions.descriptor(MPS.Editor/)" />
    <import index="bj1v" ref="r:8b09f5e2-b403-4747-aaa3-eac5acb1f753(jetbrains.mps.lang.dataFlow.analyzers.structure)" />
    <import index="1fjm" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.lang.dataFlow.framework(MPS.Core/)" />
    <import index="yfwt" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.text.rt(MPS.Core/)" />
    <import index="gevi" ref="r:33cde0a0-dbcb-4270-bdee-9b4160731fdf(jetbrains.mps.lang.aspect.plugin)" />
    <import index="91lp" ref="1ed103c3-3aa6-49b7-9c21-6765ee11f224/java:jetbrains.mps.intentions(MPS.Editor/)" />
    <import index="nvof" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.lang.script.runtime(MPS.Core/)" />
    <import index="c17a" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.language(MPS.OpenAPI/)" />
    <import index="tp25" ref="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" />
    <import index="tpeu" ref="r:00000000-0000-4000-0000-011c895902fa(jetbrains.mps.lang.smodel.behavior)" />
    <import index="exr9" ref="1ed103c3-3aa6-49b7-9c21-6765ee11f224/java:jetbrains.mps.nodeEditor(MPS.Editor/)" />
    <import index="tpf8" ref="r:00000000-0000-4000-0000-011c895902e8(jetbrains.mps.lang.generator.structure)" />
    <import index="j8aq" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.module()" />
    <import index="unno" ref="r:61e3d524-8c49-4491-b5e3-f6d6e9364527(jetbrains.mps.util)" />
    <import index="t6h5" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang.reflect(JDK/)" />
    <import index="tp41" ref="r:00000000-0000-4000-0000-011c8959037d(jetbrains.mps.lang.dataFlow.structure)" />
    <import index="31cb" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.extapi.module(MPS.Core/)" implicit="true" />
    <import index="tpdg" ref="r:00000000-0000-4000-0000-011c895902a8(jetbrains.mps.lang.actions.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="86ef8290-12bb-4ca7-947f-093788f263a9" name="jetbrains.mps.lang.project">
      <concept id="6370754048397540895" name="jetbrains.mps.lang.project.structure.Language" flags="ng" index="3Yt8$i" />
      <concept id="6370754048397540894" name="jetbrains.mps.lang.project.structure.Module" flags="ng" index="3Yt8$j">
        <property id="6370754048397540899" name="namespace" index="3Yt8$I" />
        <property id="6370754048397540898" name="uuid" index="3Yt8$J" />
      </concept>
    </language>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1080223426719" name="jetbrains.mps.baseLanguage.structure.OrExpression" flags="nn" index="22lmx$" />
      <concept id="1082485599095" name="jetbrains.mps.baseLanguage.structure.BlockStatement" flags="nn" index="9aQIb">
        <child id="1082485599096" name="statements" index="9aQI4" />
      </concept>
      <concept id="1215693861676" name="jetbrains.mps.baseLanguage.structure.BaseAssignmentExpression" flags="nn" index="d038R">
        <child id="1068498886297" name="rValue" index="37vLTx" />
        <child id="1068498886295" name="lValue" index="37vLTJ" />
      </concept>
      <concept id="4836112446988635817" name="jetbrains.mps.baseLanguage.structure.UndefinedType" flags="in" index="2jxLKc" />
      <concept id="1202948039474" name="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" flags="nn" index="liA8E" />
      <concept id="1465982738277781862" name="jetbrains.mps.baseLanguage.structure.PlaceholderMember" flags="ng" index="2tJIrI" />
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
      <concept id="1145552977093" name="jetbrains.mps.baseLanguage.structure.GenericNewExpression" flags="nn" index="2ShNRf">
        <child id="1145553007750" name="creator" index="2ShVmc" />
      </concept>
      <concept id="1137021947720" name="jetbrains.mps.baseLanguage.structure.ConceptFunction" flags="in" index="2VMwT0">
        <child id="1137022507850" name="body" index="2VODD2" />
      </concept>
      <concept id="1070462154015" name="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration" flags="ig" index="Wx3nA" />
      <concept id="1070475354124" name="jetbrains.mps.baseLanguage.structure.ThisExpression" flags="nn" index="Xjq3P" />
      <concept id="1070475926800" name="jetbrains.mps.baseLanguage.structure.StringLiteral" flags="nn" index="Xl_RD">
        <property id="1070475926801" name="value" index="Xl_RC" />
      </concept>
      <concept id="1081236700937" name="jetbrains.mps.baseLanguage.structure.StaticMethodCall" flags="nn" index="2YIFZM">
        <reference id="1144433194310" name="classConcept" index="1Pybhc" />
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
      <concept id="1070534760951" name="jetbrains.mps.baseLanguage.structure.ArrayType" flags="in" index="10Q1$e">
        <child id="1070534760952" name="componentType" index="10Q1$1" />
      </concept>
      <concept id="1070534934090" name="jetbrains.mps.baseLanguage.structure.CastExpression" flags="nn" index="10QFUN">
        <child id="1070534934091" name="type" index="10QFUM" />
        <child id="1070534934092" name="expression" index="10QFUP" />
      </concept>
      <concept id="1068390468200" name="jetbrains.mps.baseLanguage.structure.FieldDeclaration" flags="ig" index="312cEg" />
      <concept id="1068390468198" name="jetbrains.mps.baseLanguage.structure.ClassConcept" flags="ig" index="312cEu">
        <child id="1165602531693" name="superclass" index="1zkMxy" />
      </concept>
      <concept id="1068431474542" name="jetbrains.mps.baseLanguage.structure.VariableDeclaration" flags="ng" index="33uBYm">
        <property id="1176718929932" name="isFinal" index="3TUv4t" />
        <child id="1068431790190" name="initializer" index="33vP2m" />
      </concept>
      <concept id="1109279763828" name="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration" flags="ng" index="16euLQ">
        <child id="1214996921760" name="bound" index="3ztrMU" />
      </concept>
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
      <concept id="1225271283259" name="jetbrains.mps.baseLanguage.structure.NPEEqualsExpression" flags="nn" index="17R0WA" />
      <concept id="1225271369338" name="jetbrains.mps.baseLanguage.structure.IsEmptyOperation" flags="nn" index="17RlXB" />
      <concept id="4972933694980447171" name="jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration" flags="ng" index="19Szcq">
        <child id="5680397130376446158" name="type" index="1tU5fm" />
      </concept>
      <concept id="1068580123132" name="jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration" flags="ng" index="3clF44">
        <property id="4276006055363816570" name="isSynchronized" index="od$2w" />
        <property id="1181808852946" name="isFinal" index="DiZV1" />
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
      <concept id="1068581242863" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" flags="nr" index="3cpWsn" />
      <concept id="1068581517677" name="jetbrains.mps.baseLanguage.structure.VoidType" flags="in" index="3cqZAl" />
      <concept id="1079359253375" name="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" flags="nn" index="1eOMI4">
        <child id="1079359253376" name="expression" index="1eOMHV" />
      </concept>
      <concept id="1081516740877" name="jetbrains.mps.baseLanguage.structure.NotExpression" flags="nn" index="3fqX7Q">
        <child id="1081516765348" name="expression" index="3fr31v" />
      </concept>
      <concept id="1154542696413" name="jetbrains.mps.baseLanguage.structure.ArrayCreatorWithInitializer" flags="nn" index="3g6Rrh">
        <child id="1154542793668" name="componentType" index="3g7fb8" />
        <child id="1154542803372" name="initValue" index="3g7hyw" />
      </concept>
      <concept id="1204053956946" name="jetbrains.mps.baseLanguage.structure.IMethodCall" flags="ng" index="1ndlxa">
        <reference id="1068499141037" name="baseMethodDeclaration" index="37wK5l" />
        <child id="1068499141038" name="actualArgument" index="37wK5m" />
        <child id="4972241301747169160" name="typeArgument" index="3PaCim" />
      </concept>
      <concept id="1073063089578" name="jetbrains.mps.baseLanguage.structure.SuperMethodCall" flags="nn" index="3nyPlj" />
      <concept id="1212685548494" name="jetbrains.mps.baseLanguage.structure.ClassCreator" flags="nn" index="1pGfFk" />
      <concept id="1107461130800" name="jetbrains.mps.baseLanguage.structure.Classifier" flags="ng" index="3pOWGL">
        <property id="521412098689998745" name="nonStatic" index="2bfB8j" />
        <child id="5375687026011219971" name="member" index="jymVt" unordered="true" />
      </concept>
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
      <concept id="1163668896201" name="jetbrains.mps.baseLanguage.structure.TernaryOperatorExpression" flags="nn" index="3K4zz7">
        <child id="1163668914799" name="condition" index="3K4Cdx" />
        <child id="1163668922816" name="ifTrue" index="3K4E3e" />
        <child id="1163668934364" name="ifFalse" index="3K4GZi" />
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
    </language>
    <language id="c0080a47-7e37-4558-bee9-9ae18e690549" name="jetbrains.mps.lang.extension">
      <concept id="6626851894249711936" name="jetbrains.mps.lang.extension.structure.ExtensionPointExpression" flags="nn" index="2O5UvJ">
        <reference id="6626851894249712469" name="extensionPoint" index="2O5UnU" />
      </concept>
      <concept id="3175313036448560967" name="jetbrains.mps.lang.extension.structure.GetExtensionObjectsOperation" flags="nn" index="SfwO_" />
    </language>
    <language id="b401a680-8325-4110-8fd3-84331ff25bef" name="jetbrains.mps.lang.generator">
      <concept id="1114706874351" name="jetbrains.mps.lang.generator.structure.CopySrcNodeMacro" flags="ln" index="29HgVG">
        <child id="1168024447342" name="sourceNodeQuery" index="3NFExx" />
      </concept>
      <concept id="1114729360583" name="jetbrains.mps.lang.generator.structure.CopySrcListMacro" flags="ln" index="2b32R4">
        <child id="1168278589236" name="sourceNodesQuery" index="2P8S$" />
      </concept>
      <concept id="1202776937179" name="jetbrains.mps.lang.generator.structure.AbandonInput_RuleConsequence" flags="lg" index="b5Tf3" />
      <concept id="1095416546421" name="jetbrains.mps.lang.generator.structure.MappingConfiguration" flags="ig" index="bUwia">
        <child id="1200911492601" name="mappingLabel" index="2rTMjI" />
        <child id="1167088157977" name="createRootRule" index="2VS0gm" />
        <child id="1167328349397" name="reductionMappingRule" index="3acgRq" />
        <child id="1167514678247" name="rootMappingRule" index="3lj3bC" />
      </concept>
      <concept id="1177093525992" name="jetbrains.mps.lang.generator.structure.InlineTemplate_RuleConsequence" flags="lg" index="gft3U">
        <child id="1177093586806" name="templateNode" index="gfFT$" />
      </concept>
      <concept id="5015072279636464462" name="jetbrains.mps.lang.generator.structure.VarMacro" flags="lg" index="2jeGV$">
        <child id="5015072279636624635" name="type" index="2jfP_h" />
        <child id="5015072279636624596" name="value" index="2jfP_Y" />
      </concept>
      <concept id="5015072279636592410" name="jetbrains.mps.lang.generator.structure.VarMacro_ValueQuery" flags="in" index="2jfdEK" />
      <concept id="1112730859144" name="jetbrains.mps.lang.generator.structure.TemplateSwitch" flags="ig" index="jVnub">
        <child id="1168558750579" name="defaultConsequence" index="jxRDz" />
        <child id="1167340453568" name="reductionMappingRule" index="3aUrZf" />
      </concept>
      <concept id="1168619357332" name="jetbrains.mps.lang.generator.structure.RootTemplateAnnotation" flags="lg" index="n94m4">
        <reference id="1168619429071" name="applicableConcept" index="n9lRv" />
      </concept>
      <concept id="1095672379244" name="jetbrains.mps.lang.generator.structure.TemplateFragment" flags="ng" index="raruj" />
      <concept id="1200911316486" name="jetbrains.mps.lang.generator.structure.MappingLabelDeclaration" flags="lg" index="2rT7sh">
        <reference id="1200911342686" name="sourceConcept" index="2rTdP9" />
        <reference id="1200913004646" name="targetConcept" index="2rZz_L" />
      </concept>
      <concept id="1722980698497626400" name="jetbrains.mps.lang.generator.structure.ITemplateCall" flags="ng" index="v9R3L">
        <reference id="1722980698497626483" name="template" index="v9R2y" />
        <child id="1722980698497626405" name="actualArgument" index="v9R3O" />
      </concept>
      <concept id="1167087469898" name="jetbrains.mps.lang.generator.structure.CreateRootRule" flags="lg" index="2VPoh5">
        <reference id="1167087469901" name="templateNode" index="2VPoh2" />
        <child id="1167087469900" name="conditionFunction" index="2VPoh3" />
      </concept>
      <concept id="1167087518662" name="jetbrains.mps.lang.generator.structure.CreateRootRule_Condition" flags="in" index="2VP$b9" />
      <concept id="1167168920554" name="jetbrains.mps.lang.generator.structure.BaseMappingRule_Condition" flags="in" index="30G5F_" />
      <concept id="1167169188348" name="jetbrains.mps.lang.generator.structure.TemplateFunctionParameter_sourceNode" flags="nn" index="30H73N" />
      <concept id="1167169308231" name="jetbrains.mps.lang.generator.structure.BaseMappingRule" flags="ng" index="30H$t8">
        <reference id="1200917515464" name="labelDeclaration" index="2sgKRv" />
        <reference id="1167169349424" name="applicableConcept" index="30HIoZ" />
        <child id="1167169362365" name="conditionFunction" index="30HLyM" />
      </concept>
      <concept id="1195158154974" name="jetbrains.mps.lang.generator.structure.InlineSwitch_RuleConsequence" flags="lg" index="14YyZ8">
        <child id="1195158241124" name="defaultConsequence" index="14YRTM" />
        <child id="1195158408710" name="case" index="14ZwWg" />
      </concept>
      <concept id="1195158388553" name="jetbrains.mps.lang.generator.structure.InlineSwitch_Case" flags="ng" index="14ZrTv">
        <child id="1195158608805" name="conditionFunction" index="150hEN" />
        <child id="1195158637244" name="caseConsequence" index="150oIE" />
      </concept>
      <concept id="1087833241328" name="jetbrains.mps.lang.generator.structure.PropertyMacro" flags="ln" index="17Uvod">
        <child id="1167756362303" name="propertyValueFunction" index="3zH0cK" />
      </concept>
      <concept id="1167327847730" name="jetbrains.mps.lang.generator.structure.Reduction_MappingRule" flags="lg" index="3aamgX">
        <child id="1169672767469" name="ruleConsequence" index="1lVwrX" />
      </concept>
      <concept id="1167514355419" name="jetbrains.mps.lang.generator.structure.Root_MappingRule" flags="lg" index="3lhOvk">
        <reference id="1167514355421" name="template" index="3lhOvi" />
      </concept>
      <concept id="982871510064032177" name="jetbrains.mps.lang.generator.structure.IParameterizedTemplate" flags="ng" index="1s_3nv">
        <child id="982871510064032342" name="parameter" index="1s_3oS" />
      </concept>
      <concept id="982871510068000147" name="jetbrains.mps.lang.generator.structure.TemplateSwitchMacro" flags="lg" index="1sPUBX" />
      <concept id="1167756080639" name="jetbrains.mps.lang.generator.structure.PropertyMacro_GetPropertyValue" flags="in" index="3zFVjK" />
      <concept id="1167770111131" name="jetbrains.mps.lang.generator.structure.ReferenceMacro_GetReferent" flags="in" index="3$xsQk" />
      <concept id="1311078761699563727" name="jetbrains.mps.lang.generator.structure.InsertMacro_CreateNodeQuery" flags="in" index="3_AbJw" />
      <concept id="1311078761699563726" name="jetbrains.mps.lang.generator.structure.InsertMacro" flags="ln" index="3_AbJx">
        <child id="1311078761699602381" name="createNodeQuery" index="3_A0Ny" />
      </concept>
      <concept id="4426797670061482024" name="jetbrains.mps.lang.generator.structure.TemplateArgumentVariableRefExpression" flags="ng" index="3_TokI">
        <reference id="2721957369897614810" name="varmacro" index="1bhEwk" />
      </concept>
      <concept id="1167945743726" name="jetbrains.mps.lang.generator.structure.IfMacro_Condition" flags="in" index="3IZrLx" />
      <concept id="1167951910403" name="jetbrains.mps.lang.generator.structure.SourceSubstituteMacro_SourceNodesQuery" flags="in" index="3JmXsc" />
      <concept id="8900764248744213868" name="jetbrains.mps.lang.generator.structure.InlineTemplateWithContext_RuleConsequence" flags="lg" index="1Koe21">
        <child id="8900764248744213871" name="contentNode" index="1Koe22" />
      </concept>
      <concept id="1805153994415891174" name="jetbrains.mps.lang.generator.structure.TemplateParameterDeclaration" flags="ng" index="1N15co">
        <child id="1805153994415893199" name="type" index="1N15GL" />
      </concept>
      <concept id="1168024337012" name="jetbrains.mps.lang.generator.structure.SourceSubstituteMacro_SourceNodeQuery" flags="in" index="3NFfHV" />
      <concept id="1118773211870" name="jetbrains.mps.lang.generator.structure.IfMacro" flags="ln" index="1W57fq">
        <child id="1194989344771" name="alternativeConsequence" index="UU_$l" />
        <child id="1167945861827" name="conditionFunction" index="3IZSJc" />
      </concept>
      <concept id="1118786554307" name="jetbrains.mps.lang.generator.structure.LoopMacro" flags="ln" index="1WS0z7">
        <property id="7430509679011668804" name="counterVarName" index="1qytDF" />
        <child id="1167952069335" name="sourceNodesQuery" index="3Jn$fo" />
      </concept>
      <concept id="1088761943574" name="jetbrains.mps.lang.generator.structure.ReferenceMacro" flags="ln" index="1ZhdrF">
        <child id="1167770376702" name="referentFunction" index="3$ytzL" />
      </concept>
    </language>
    <language id="fd392034-7849-419d-9071-12563d152375" name="jetbrains.mps.baseLanguage.closures">
      <concept id="1199569711397" name="jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral" flags="nn" index="1bVj0M">
        <child id="1199569906740" name="parameter" index="1bW2Oz" />
        <child id="1199569916463" name="body" index="1bW5cS" />
      </concept>
    </language>
    <language id="f4ad079d-bc71-4ffb-9600-9328705cf998" name="jetbrains.mps.lang.descriptor">
      <concept id="9020561928507175845" name="jetbrains.mps.lang.descriptor.structure.LanguageDescriptor" flags="ng" index="2ie$Fy">
        <child id="1698302279987270971" name="language" index="3wsg7n" />
      </concept>
    </language>
    <language id="d7706f63-9be2-479c-a3da-ae92af1e64d5" name="jetbrains.mps.lang.generator.generationContext">
      <concept id="1217960179967" name="jetbrains.mps.lang.generator.generationContext.structure.GenerationContextOp_ShowErrorMessage" flags="nn" index="2k5nB$" />
      <concept id="1217960314443" name="jetbrains.mps.lang.generator.generationContext.structure.GenerationContextOp_ShowMessageBase" flags="nn" index="2k5Stg">
        <child id="1217960314448" name="messageText" index="2k5Stb" />
        <child id="1217960407512" name="referenceNode" index="2k6f33" />
      </concept>
      <concept id="2721957369897614808" name="jetbrains.mps.lang.generator.generationContext.structure.GenerationContextOp_VarRef" flags="nn" index="1bhEwm">
        <reference id="2721957369897614810" name="varmacro" index="1bhEwl" />
      </concept>
      <concept id="5190093307972723402" name="jetbrains.mps.lang.generator.generationContext.structure.GenerationContextOp_ParameterRef" flags="nn" index="3cR$yn">
        <reference id="5190093307972736266" name="parameter" index="3cRzXn" />
      </concept>
      <concept id="1216860049627" name="jetbrains.mps.lang.generator.generationContext.structure.GenerationContextOp_GetOutputByLabelAndInput" flags="nn" index="1iwH70">
        <reference id="1216860049628" name="label" index="1iwH77" />
        <child id="1216860049632" name="inputNode" index="1iwH7V" />
      </concept>
      <concept id="1216860049635" name="jetbrains.mps.lang.generator.generationContext.structure.TemplateFunctionParameter_generationContext" flags="nn" index="1iwH7S" />
      <concept id="7430509679014182526" name="jetbrains.mps.lang.generator.generationContext.structure.GenerationContextOp_ContextVarRef" flags="ng" index="1qCSth">
        <property id="7430509679014182818" name="contextVarName" index="1qCSqd" />
      </concept>
      <concept id="1217026863835" name="jetbrains.mps.lang.generator.generationContext.structure.GenerationContextOp_GetOriginalInputModel" flags="nn" index="1st3f0" />
      <concept id="1217282130234" name="jetbrains.mps.lang.generator.generationContext.structure.GenerationContextOp_GetOutputModel" flags="nn" index="1FEO0x" />
      <concept id="1217369610610" name="jetbrains.mps.lang.generator.generationContext.structure.GenerationContextOp_GetTemplateNode" flags="nn" index="1KSxxD" />
    </language>
    <language id="df345b11-b8c7-4213-ac66-48d2a9b75d88" name="jetbrains.mps.baseLanguageInternal">
      <concept id="1173996401517" name="jetbrains.mps.baseLanguageInternal.structure.InternalNewExpression" flags="nn" index="1nCR9W">
        <property id="1173996588177" name="fqClassName" index="1nD$Q0" />
        <child id="1179332974947" name="type" index="2lIhxL" />
      </concept>
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1177026924588" name="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" flags="nn" index="chp4Y">
        <reference id="1177026940964" name="conceptDeclaration" index="cht4Q" />
      </concept>
      <concept id="1138411891628" name="jetbrains.mps.lang.smodel.structure.SNodeOperation" flags="nn" index="eCIE_">
        <child id="1144104376918" name="parameter" index="1xVPHs" />
      </concept>
      <concept id="4497478346159780083" name="jetbrains.mps.lang.smodel.structure.LanguageRefExpression" flags="ng" index="pHN19">
        <child id="3542851458883491298" name="languageId" index="2V$M_3" />
      </concept>
      <concept id="1179409122411" name="jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall" flags="nn" index="2qgKlT" />
      <concept id="1138676077309" name="jetbrains.mps.lang.smodel.structure.EnumMemberReference" flags="nn" index="uoxfO">
        <reference id="1138676095763" name="enumMember" index="uo_Cq" />
      </concept>
      <concept id="1143226024141" name="jetbrains.mps.lang.smodel.structure.SModelType" flags="in" index="H_c77" />
      <concept id="1143235216708" name="jetbrains.mps.lang.smodel.structure.Model_CreateNewNodeOperation" flags="nn" index="I8ghe">
        <reference id="1143235391024" name="concept" index="I8UWU" />
      </concept>
      <concept id="1145383075378" name="jetbrains.mps.lang.smodel.structure.SNodeListType" flags="in" index="2I9FWS">
        <reference id="1145383142433" name="elementConcept" index="2I9WkF" />
      </concept>
      <concept id="1145404486709" name="jetbrains.mps.lang.smodel.structure.SemanticDowncastExpression" flags="nn" index="2JrnkZ">
        <child id="1145404616321" name="leftExpression" index="2JrQYb" />
      </concept>
      <concept id="1171315804604" name="jetbrains.mps.lang.smodel.structure.Model_RootsOperation" flags="nn" index="2RRcyG">
        <reference id="1171315804605" name="concept" index="2RRcyH" />
      </concept>
      <concept id="3542851458883438784" name="jetbrains.mps.lang.smodel.structure.LanguageId" flags="ng" index="2V$Bhx">
        <property id="3542851458883439831" name="namespace" index="2V$B1Q" />
        <property id="3542851458883439832" name="languageId" index="2V$B1T" />
      </concept>
      <concept id="1171407110247" name="jetbrains.mps.lang.smodel.structure.Node_GetAncestorOperation" flags="nn" index="2Xjw5R" />
      <concept id="6995935425733782641" name="jetbrains.mps.lang.smodel.structure.Model_GetModule" flags="nn" index="13u695" />
      <concept id="2644386474300074836" name="jetbrains.mps.lang.smodel.structure.ConceptIdRefExpression" flags="nn" index="35c_gC">
        <reference id="2644386474300074837" name="conceptDeclaration" index="35c_gD" />
      </concept>
      <concept id="1139613262185" name="jetbrains.mps.lang.smodel.structure.Node_GetParentOperation" flags="nn" index="1mfA1w" />
      <concept id="1146171026731" name="jetbrains.mps.lang.smodel.structure.Property_HasValue_Enum" flags="nn" index="3t7uKx">
        <child id="1146171026732" name="value" index="3t7uKA" />
      </concept>
      <concept id="1144101972840" name="jetbrains.mps.lang.smodel.structure.OperationParm_Concept" flags="ng" index="1xMEDy">
        <child id="1207343664468" name="conceptArgument" index="ri$Ld" />
      </concept>
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
        <child id="5169995583184591170" name="smodelAttribute" index="lGtFl" />
      </concept>
      <concept id="3364660638048049750" name="jetbrains.mps.lang.core.structure.PropertyAttribute" flags="ng" index="A9Btg">
        <property id="1757699476691236117" name="propertyName" index="2qtEX9" />
        <property id="1341860900487648621" name="propertyId" index="P4ACc" />
      </concept>
      <concept id="3364660638048049745" name="jetbrains.mps.lang.core.structure.LinkAttribute" flags="ng" index="A9Btn">
        <property id="1757699476691236116" name="linkRole" index="2qtEX8" />
        <property id="1341860900488019036" name="linkId" index="P3scX" />
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
      <concept id="1151689724996" name="jetbrains.mps.baseLanguage.collections.structure.SequenceType" flags="in" index="A3Dl8">
        <child id="1151689745422" name="elementType" index="A3Ik2" />
      </concept>
      <concept id="1151702311717" name="jetbrains.mps.baseLanguage.collections.structure.ToListOperation" flags="nn" index="ANE8D" />
      <concept id="1203518072036" name="jetbrains.mps.baseLanguage.collections.structure.SmartClosureParameterDeclaration" flags="ig" index="Rh6nW" />
      <concept id="1205679737078" name="jetbrains.mps.baseLanguage.collections.structure.SortOperation" flags="nn" index="2S7cBI">
        <child id="1205679832066" name="ascending" index="2S7zOq" />
      </concept>
      <concept id="1171391069720" name="jetbrains.mps.baseLanguage.collections.structure.GetIndexOfOperation" flags="nn" index="2WmjW8" />
      <concept id="1162935959151" name="jetbrains.mps.baseLanguage.collections.structure.GetSizeOperation" flags="nn" index="34oBXx" />
      <concept id="1178286324487" name="jetbrains.mps.baseLanguage.collections.structure.SortDirection" flags="nn" index="1nlBCl" />
      <concept id="1165525191778" name="jetbrains.mps.baseLanguage.collections.structure.GetFirstOperation" flags="nn" index="1uHKPH" />
      <concept id="1165530316231" name="jetbrains.mps.baseLanguage.collections.structure.IsEmptyOperation" flags="nn" index="1v1jN8" />
      <concept id="1202120902084" name="jetbrains.mps.baseLanguage.collections.structure.WhereOperation" flags="nn" index="3zZkjj" />
      <concept id="1202128969694" name="jetbrains.mps.baseLanguage.collections.structure.SelectOperation" flags="nn" index="3$u5V9" />
      <concept id="1176501494711" name="jetbrains.mps.baseLanguage.collections.structure.IsNotEmptyOperation" flags="nn" index="3GX2aA" />
    </language>
  </registry>
  <node concept="312cEu" id="7OJukvJ5j$M">
    <property role="TrG5h" value="Language" />
    <node concept="3Tm1VV" id="7OJukvJ5j$N" role="1B3o_S" />
    <node concept="n94m4" id="7OJukvJ5j$S" role="lGtFl">
      <ref role="n9lRv" to="yv2q:7OJukvJ5je_" resolve="LanguageDescriptor" />
    </node>
    <node concept="3uibUv" id="4rgTJDg9HN_" role="1zkMxy">
      <ref role="3uigEE" to="vndm:~LanguageRuntime" resolve="LanguageRuntime" />
    </node>
    <node concept="Wx3nA" id="7OJukvJ5Pln" role="jymVt">
      <property role="TrG5h" value="MODULE_REF" />
      <node concept="3Tm1VV" id="7OJukvJ5Plo" role="1B3o_S" />
      <node concept="17QB3L" id="3yzCghJzkcM" role="1tU5fm" />
      <node concept="Xl_RD" id="7OJukvJ5Plr" role="33vP2m">
        <property role="Xl_RC" value="module.reference" />
        <node concept="17Uvod" id="7OJukvJ5Pls" role="lGtFl">
          <property role="2qtEX9" value="value" />
          <property role="P4ACc" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1070475926800/1070475926801" />
          <node concept="3zFVjK" id="7OJukvJ5Plt" role="3zH0cK">
            <node concept="3clFbS" id="7OJukvJ5Plu" role="2VODD2">
              <node concept="3clFbF" id="7OJukvJ5PlG" role="3cqZAp">
                <node concept="2OqwBi" id="7OJukvJ5PlN" role="3clFbG">
                  <node concept="2OqwBi" id="7OJukvJ5PlI" role="2Oq$k0">
                    <node concept="30H73N" id="7OJukvJ5PlH" role="2Oq$k0" />
                    <node concept="3TrEf2" id="1uh_eNRShj9" role="2OqNvi">
                      <ref role="3Tt5mk" to="yv2q:1uh_eNRS9kV" />
                    </node>
                  </node>
                  <node concept="2qgKlT" id="7OJukvJ5PQd" role="2OqNvi">
                    <ref role="37wK5l" to="wev6:7OJukvJ5PmG" resolve="getModuleReference" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFbW" id="7OJukvJ5j$O" role="jymVt">
      <node concept="3cqZAl" id="7OJukvJ5j$P" role="3clF45" />
      <node concept="3Tm1VV" id="7OJukvJ5j$Q" role="1B3o_S" />
      <node concept="3clFbS" id="7OJukvJ5j$R" role="3clF47" />
    </node>
    <node concept="3clFb_" id="4rgTJDg9HNA" role="jymVt">
      <property role="IEkAT" value="false" />
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getNamespace" />
      <property role="DiZV1" value="false" />
      <node concept="17QB3L" id="4rgTJDg9HNG" role="3clF45" />
      <node concept="3clFbS" id="4rgTJDg9HNC" role="3clF47">
        <node concept="3clFbF" id="4rgTJDg9HND" role="3cqZAp">
          <node concept="Xl_RD" id="4rgTJDg9HNH" role="3clFbG">
            <property role="Xl_RC" value="" />
            <node concept="17Uvod" id="4rgTJDg9HNI" role="lGtFl">
              <property role="2qtEX9" value="value" />
              <property role="P4ACc" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1070475926800/1070475926801" />
              <node concept="3zFVjK" id="4rgTJDg9HNJ" role="3zH0cK">
                <node concept="3clFbS" id="4rgTJDg9HNK" role="2VODD2">
                  <node concept="3clFbF" id="4rgTJDg9HNL" role="3cqZAp">
                    <node concept="2OqwBi" id="4rgTJDg9HNS" role="3clFbG">
                      <node concept="2OqwBi" id="4rgTJDg9HNN" role="2Oq$k0">
                        <node concept="30H73N" id="4rgTJDg9HNM" role="2Oq$k0" />
                        <node concept="3TrEf2" id="4rgTJDg9HNR" role="2OqNvi">
                          <ref role="3Tt5mk" to="yv2q:1uh_eNRS9kV" />
                        </node>
                      </node>
                      <node concept="3TrcHB" id="4rgTJDg9HNW" role="2OqNvi">
                        <ref role="3TsBF5" to="hypd:5xDtKQA7vSz" resolve="namespace" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="4rgTJDg9HNF" role="1B3o_S" />
      <node concept="2AHcQZ" id="3yzCghJAiil" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="2tJIrI" id="50LvD1$UHtt" role="jymVt" />
    <node concept="3clFb_" id="50LvD1$UT_j" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getVersion" />
      <property role="DiZV1" value="false" />
      <property role="IEkAT" value="false" />
      <node concept="3Tm1VV" id="50LvD1$UT_k" role="1B3o_S" />
      <node concept="10Oyi0" id="50LvD1$V2u0" role="3clF45" />
      <node concept="3clFbS" id="50LvD1$UT_n" role="3clF47">
        <node concept="3clFbF" id="50LvD1$UT_q" role="3cqZAp">
          <node concept="3cmrfG" id="50LvD1$V1ZS" role="3clFbG">
            <property role="3cmrfH" value="0" />
            <node concept="17Uvod" id="50LvD1$V208" role="lGtFl">
              <property role="2qtEX9" value="value" />
              <property role="P4ACc" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580320020/1068580320021" />
              <node concept="3zFVjK" id="50LvD1$V209" role="3zH0cK">
                <node concept="3clFbS" id="50LvD1$V20a" role="2VODD2">
                  <node concept="3clFbF" id="50LvD1$V4OO" role="3cqZAp">
                    <node concept="2OqwBi" id="50LvD1$V6vL" role="3clFbG">
                      <node concept="2OqwBi" id="50LvD1$V5gP" role="2Oq$k0">
                        <node concept="30H73N" id="50LvD1$V4ON" role="2Oq$k0" />
                        <node concept="3TrEf2" id="50LvD1$V64R" role="2OqNvi">
                          <ref role="3Tt5mk" to="yv2q:1uh_eNRS9kV" />
                        </node>
                      </node>
                      <node concept="3TrcHB" id="50LvD1$V9Ci" role="2OqNvi">
                        <ref role="3TsBF5" to="hypd:50LvD1$V79t" resolve="version" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="50LvD1$UT_o" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="2tJIrI" id="50LvD1$UV9q" role="jymVt" />
    <node concept="3clFb_" id="5RJlpHdaf$O" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getId" />
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <node concept="3clFbS" id="5RJlpHdaf$R" role="3clF47">
        <node concept="3cpWs6" id="5RJlpHdaj3I" role="3cqZAp">
          <node concept="2ShNRf" id="5RJlpHdakma" role="3cqZAk">
            <node concept="1pGfFk" id="5RJlpHdajMh" role="2ShVmc">
              <ref role="37wK5l" to="e8bb:~SLanguageId.&lt;init&gt;(java.util.UUID)" resolve="SLanguageId" />
              <node concept="2YIFZM" id="5RJlpHdaOri" role="37wK5m">
                <ref role="37wK5l" to="33ny:~UUID.fromString(java.lang.String):java.util.UUID" resolve="fromString" />
                <ref role="1Pybhc" to="33ny:~UUID" resolve="UUID" />
                <node concept="Xl_RD" id="5RJlpHdaoB9" role="37wK5m">
                  <property role="Xl_RC" value="moduleId" />
                  <node concept="17Uvod" id="5RJlpHdau28" role="lGtFl">
                    <property role="2qtEX9" value="value" />
                    <property role="P4ACc" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1070475926800/1070475926801" />
                    <node concept="3zFVjK" id="5RJlpHdau29" role="3zH0cK">
                      <node concept="3clFbS" id="5RJlpHdau2a" role="2VODD2">
                        <node concept="3clFbF" id="5RJlpHdavW8" role="3cqZAp">
                          <node concept="2OqwBi" id="5RJlpHdaJ6A" role="3clFbG">
                            <node concept="2OqwBi" id="5RJlpHdaw9p" role="2Oq$k0">
                              <node concept="30H73N" id="5RJlpHdavW5" role="2Oq$k0" />
                              <node concept="3TrEf2" id="5RJlpHdaIPA" role="2OqNvi">
                                <ref role="3Tt5mk" to="yv2q:1uh_eNRS9kV" />
                              </node>
                            </node>
                            <node concept="3TrcHB" id="5RJlpHdaJsP" role="2OqNvi">
                              <ref role="3TsBF5" to="hypd:5xDtKQA7vSy" resolve="uuid" />
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
      <node concept="3Tm1VV" id="5RJlpHda9Hc" role="1B3o_S" />
      <node concept="3uibUv" id="5RJlpHdahAh" role="3clF45">
        <ref role="3uigEE" to="e8bb:~SLanguageId" resolve="SLanguageId" />
      </node>
    </node>
    <node concept="3clFb_" id="1NW__Dx1w3K" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getExtendedLanguageIDs" />
      <property role="DiZV1" value="false" />
      <property role="IEkAT" value="false" />
      <node concept="10Q1$e" id="42arZwawrAT" role="3clF45">
        <node concept="17QB3L" id="42arZwawluK" role="10Q1$1" />
      </node>
      <node concept="3Tmbuc" id="1NW__Dx1w3L" role="1B3o_S" />
      <node concept="3clFbS" id="1NW__Dx1w3P" role="3clF47">
        <node concept="3cpWs6" id="1VJkMBFBnQM" role="3cqZAp">
          <node concept="2ShNRf" id="1VJkMBFARpx" role="3cqZAk">
            <node concept="3g6Rrh" id="1VJkMBFB9TE" role="2ShVmc">
              <node concept="17QB3L" id="1VJkMBFB3At" role="3g7fb8" />
              <node concept="Xl_RD" id="1VJkMBFBhKw" role="3g7hyw">
                <property role="Xl_RC" value="extendedLanguageID" />
                <node concept="1WS0z7" id="1VJkMBFC1Xo" role="lGtFl">
                  <node concept="3JmXsc" id="1VJkMBFC1Xq" role="3Jn$fo">
                    <node concept="3clFbS" id="1VJkMBFC1Xs" role="2VODD2">
                      <node concept="3clFbF" id="1VJkMBFC6$p" role="3cqZAp">
                        <node concept="2OqwBi" id="1VJkMBFCKYL" role="3clFbG">
                          <node concept="3Tsc0h" id="1VJkMBFCMcu" role="2OqNvi">
                            <ref role="3TtcxE" to="hypd:eY0iPzBvY1" />
                          </node>
                          <node concept="2OqwBi" id="1VJkMBFC6EJ" role="2Oq$k0">
                            <node concept="3TrEf2" id="1VJkMBFCJMk" role="2OqNvi">
                              <ref role="3Tt5mk" to="yv2q:1uh_eNRS9kV" />
                            </node>
                            <node concept="30H73N" id="1VJkMBFC6$o" role="2Oq$k0" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="17Uvod" id="1VJkMBFD9IZ" role="lGtFl">
                  <property role="2qtEX9" value="value" />
                  <property role="P4ACc" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1070475926800/1070475926801" />
                  <node concept="3zFVjK" id="1VJkMBFD9J0" role="3zH0cK">
                    <node concept="3clFbS" id="1VJkMBFD9J1" role="2VODD2">
                      <node concept="3clFbF" id="1VJkMBFDevp" role="3cqZAp">
                        <node concept="2OqwBi" id="1VJkMBFDfh6" role="3clFbG">
                          <node concept="3TrcHB" id="1VJkMBFDBR2" role="2OqNvi">
                            <ref role="3TsBF5" to="hypd:1AZH1sZHi4e" resolve="qualifiedName" />
                          </node>
                          <node concept="30H73N" id="1VJkMBFDevo" role="2Oq$k0" />
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
      <node concept="2AHcQZ" id="1NW__Dx1w3Q" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="3clFb_" id="4rgTJDg9JID" role="jymVt">
      <property role="TrG5h" value="getGenerators" />
      <node concept="3uibUv" id="4rgTJDg9JII" role="3clF45">
        <ref role="3uigEE" to="33ny:~Collection" resolve="Collection" />
        <node concept="3uibUv" id="4rgTJDg9JIK" role="11_B2D">
          <ref role="3uigEE" to="r99j:~TemplateModule" resolve="TemplateModule" />
        </node>
      </node>
      <node concept="3Tm1VV" id="4rgTJDg9JIF" role="1B3o_S" />
      <node concept="3clFbS" id="4rgTJDg9JIG" role="3clF47">
        <node concept="3clFbF" id="4OkbWYlmZGP" role="3cqZAp">
          <node concept="2YIFZM" id="4OkbWYlmZGQ" role="3clFbG">
            <ref role="37wK5l" to="r99j:~TemplateUtil.asCollection(java.lang.Object...):java.util.Collection" resolve="asCollection" />
            <ref role="1Pybhc" to="r99j:~TemplateUtil" resolve="TemplateUtil" />
            <node concept="2ShNRf" id="4OkbWYlmZGR" role="37wK5m">
              <node concept="1pGfFk" id="4OkbWYlmZGS" role="2ShVmc">
                <ref role="37wK5l" node="1uh_eNRS9l6" resolve="Generator" />
                <node concept="1ZhdrF" id="4OkbWYlmZGT" role="lGtFl">
                  <property role="2qtEX8" value="baseMethodDeclaration" />
                  <property role="P3scX" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1204053956946/1068499141037" />
                  <node concept="3$xsQk" id="4OkbWYlmZGU" role="3$ytzL">
                    <node concept="3clFbS" id="4OkbWYlmZGV" role="2VODD2">
                      <node concept="3clFbF" id="4OkbWYlmZGW" role="3cqZAp">
                        <node concept="2OqwBi" id="4OkbWYlmZGX" role="3clFbG">
                          <node concept="2OqwBi" id="4OkbWYlmZGY" role="2Oq$k0">
                            <node concept="2qgKlT" id="2oLu0Jc29zs" role="2OqNvi">
                              <ref role="37wK5l" to="tpek:4_LVZ3pCvsd" resolve="constructors" />
                            </node>
                            <node concept="2OqwBi" id="4OkbWYlmZGZ" role="2Oq$k0">
                              <node concept="1iwH7S" id="4OkbWYlmZH0" role="2Oq$k0" />
                              <node concept="1iwH70" id="4OkbWYlmZH1" role="2OqNvi">
                                <ref role="1iwH77" node="4rgTJDg9HNX" resolve="generator.descriptor" />
                                <node concept="30H73N" id="4OkbWYlmZH2" role="1iwH7V" />
                              </node>
                            </node>
                          </node>
                          <node concept="1uHKPH" id="4OkbWYlmZH4" role="2OqNvi" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="Xjq3P" id="4OkbWYlmZH5" role="37wK5m" />
              </node>
              <node concept="1WS0z7" id="4OkbWYlmZH6" role="lGtFl">
                <node concept="3JmXsc" id="4OkbWYlmZH7" role="3Jn$fo">
                  <node concept="3clFbS" id="4OkbWYlmZH8" role="2VODD2">
                    <node concept="3clFbF" id="4OkbWYlmZH9" role="3cqZAp">
                      <node concept="2OqwBi" id="4OkbWYlmZHa" role="3clFbG">
                        <node concept="2OqwBi" id="4OkbWYlmZHb" role="2Oq$k0">
                          <node concept="30H73N" id="4OkbWYlmZHc" role="2Oq$k0" />
                          <node concept="3TrEf2" id="4OkbWYlmZHd" role="2OqNvi">
                            <ref role="3Tt5mk" to="yv2q:1uh_eNRS9kV" />
                          </node>
                        </node>
                        <node concept="3Tsc0h" id="4OkbWYlmZHe" role="2OqNvi">
                          <ref role="3TtcxE" to="hypd:5xDtKQA7vSR" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="1W57fq" id="4OkbWYlmZHf" role="lGtFl">
                <node concept="3IZrLx" id="4OkbWYlmZHg" role="3IZSJc">
                  <node concept="3clFbS" id="4OkbWYlmZHh" role="2VODD2">
                    <node concept="3clFbF" id="4OkbWYlmZHi" role="3cqZAp">
                      <node concept="2OqwBi" id="4OkbWYlmZHj" role="3clFbG">
                        <node concept="30H73N" id="4OkbWYlmZHk" role="2Oq$k0" />
                        <node concept="3TrcHB" id="4OkbWYlmZHl" role="2OqNvi">
                          <ref role="3TsBF5" to="hypd:2A_smLtZHa0" resolve="generateTemplates" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="gft3U" id="4OkbWYlmZHm" role="UU_$l">
                  <node concept="2YIFZM" id="4OkbWYlmZHn" role="gfFT$">
                    <ref role="1Pybhc" to="r99j:~TemplateUtil" resolve="TemplateUtil" />
                    <ref role="37wK5l" to="r99j:~TemplateUtil.createInterpretedGenerator(jetbrains.mps.smodel.language.LanguageRuntime,java.lang.String):jetbrains.mps.generator.runtime.TemplateModule" resolve="createInterpretedGenerator" />
                    <node concept="Xjq3P" id="4OkbWYlmZHo" role="37wK5m" />
                    <node concept="Xl_RD" id="4OkbWYlmZHp" role="37wK5m">
                      <node concept="17Uvod" id="4OkbWYlmZHq" role="lGtFl">
                        <property role="2qtEX9" value="value" />
                        <property role="P4ACc" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1070475926800/1070475926801" />
                        <node concept="3zFVjK" id="4OkbWYlmZHr" role="3zH0cK">
                          <node concept="3clFbS" id="4OkbWYlmZHs" role="2VODD2">
                            <node concept="3clFbF" id="4OkbWYlmZHt" role="3cqZAp">
                              <node concept="2OqwBi" id="4OkbWYlmZHu" role="3clFbG">
                                <node concept="30H73N" id="4OkbWYlmZHv" role="2Oq$k0" />
                                <node concept="2qgKlT" id="4OkbWYlmZHw" role="2OqNvi">
                                  <ref role="37wK5l" to="wev6:7OJukvJ5PmG" resolve="getModuleReference" />
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
            <node concept="3uibUv" id="4OkbWYlmZHx" role="3PaCim">
              <ref role="3uigEE" to="r99j:~TemplateModule" resolve="TemplateModule" />
            </node>
            <node concept="1W57fq" id="4OkbWYlmZHH" role="lGtFl">
              <node concept="3IZrLx" id="4OkbWYlmZHI" role="3IZSJc">
                <node concept="3clFbS" id="4OkbWYlmZHJ" role="2VODD2">
                  <node concept="3clFbF" id="4OkbWYlmZI8" role="3cqZAp">
                    <node concept="2OqwBi" id="4OkbWYlmZI9" role="3clFbG">
                      <node concept="2OqwBi" id="4OkbWYlmZIa" role="2Oq$k0">
                        <node concept="2OqwBi" id="4OkbWYlmZIb" role="2Oq$k0">
                          <node concept="30H73N" id="4OkbWYlmZIc" role="2Oq$k0" />
                          <node concept="3TrEf2" id="4OkbWYlmZId" role="2OqNvi">
                            <ref role="3Tt5mk" to="yv2q:1uh_eNRS9kV" />
                          </node>
                        </node>
                        <node concept="3Tsc0h" id="4OkbWYlmZIe" role="2OqNvi">
                          <ref role="3TtcxE" to="hypd:5xDtKQA7vSR" />
                        </node>
                      </node>
                      <node concept="3GX2aA" id="4OkbWYlmZIf" role="2OqNvi" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="gft3U" id="4OkbWYlmZHQ" role="UU_$l">
                <node concept="10Nm6u" id="4OkbWYlmZHV" role="gfFT$" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3yzCghJAosq" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="3clFb_" id="NIUB61fbdT" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="DiZV1" value="false" />
      <property role="IEkAT" value="false" />
      <property role="TrG5h" value="createAspect" />
      <node concept="3Tmbuc" id="NIUB61fbdU" role="1B3o_S" />
      <node concept="16euLQ" id="NIUB61fdaT" role="16eVyc">
        <property role="TrG5h" value="T" />
        <node concept="3uibUv" id="4r8JClTjOLc" role="3ztrMU">
          <ref role="3uigEE" to="ze1i:~ILanguageAspect" resolve="ILanguageAspect" />
        </node>
      </node>
      <node concept="16syzq" id="NIUB61fhw_" role="3clF45">
        <ref role="16sUi3" node="NIUB61fdaT" resolve="T" />
      </node>
      <node concept="37vLTG" id="NIUB61fbdZ" role="3clF46">
        <property role="TrG5h" value="aspectClass" />
        <node concept="3uibUv" id="NIUB61fbe0" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~Class" resolve="Class" />
          <node concept="16syzq" id="NIUB61fiLc" role="11_B2D">
            <ref role="16sUi3" node="NIUB61fdaT" resolve="T" />
          </node>
        </node>
      </node>
      <node concept="3clFbS" id="NIUB61fbe2" role="3clF47">
        <node concept="3clFbJ" id="NIUB61fje3" role="3cqZAp">
          <node concept="1WS0z7" id="NIUB61fje4" role="lGtFl">
            <node concept="3JmXsc" id="NIUB61fje5" role="3Jn$fo">
              <node concept="3clFbS" id="NIUB61fje6" role="2VODD2">
                <node concept="3clFbF" id="NIUB61fje7" role="3cqZAp">
                  <node concept="2OqwBi" id="6ueU8$qk6D7" role="3clFbG">
                    <node concept="2OqwBi" id="NIUB61fje8" role="2Oq$k0">
                      <node concept="3Tsc0h" id="NIUB61fje9" role="2OqNvi">
                        <ref role="3TtcxE" to="hypd:5xDtKQA7vSF" />
                      </node>
                      <node concept="2OqwBi" id="NIUB61fjea" role="2Oq$k0">
                        <node concept="30H73N" id="NIUB61fjeb" role="2Oq$k0" />
                        <node concept="3TrEf2" id="NIUB61fjec" role="2OqNvi">
                          <ref role="3Tt5mk" to="yv2q:1uh_eNRS9kV" />
                        </node>
                      </node>
                    </node>
                    <node concept="2S7cBI" id="6ueU8$qk9$V" role="2OqNvi">
                      <node concept="1bVj0M" id="6ueU8$qk9$X" role="23t8la">
                        <node concept="3clFbS" id="6ueU8$qk9$Y" role="1bW5cS">
                          <node concept="3clFbF" id="6ueU8$qkclm" role="3cqZAp">
                            <node concept="2OqwBi" id="6ueU8$qkctn" role="3clFbG">
                              <node concept="37vLTw" id="6ueU8$qkcll" role="2Oq$k0">
                                <ref role="3cqZAo" node="6ueU8$qk9$Z" resolve="it" />
                              </node>
                              <node concept="3TrcHB" id="6ueU8$qkeAS" role="2OqNvi">
                                <ref role="3TsBF5" to="hypd:5xDtKQA7vSI" resolve="qualifiedName" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node concept="Rh6nW" id="6ueU8$qk9$Z" role="1bW2Oz">
                          <property role="TrG5h" value="it" />
                          <node concept="2jxLKc" id="6ueU8$qk9_0" role="1tU5fm" />
                        </node>
                      </node>
                      <node concept="1nlBCl" id="6ueU8$qk9_1" role="2S7zOq">
                        <property role="3clFbU" value="true" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="2jeGV$" id="NIUB61fjed" role="lGtFl">
            <property role="TrG5h" value="modelRef" />
            <node concept="2jfdEK" id="NIUB61fjee" role="2jfP_Y">
              <node concept="3clFbS" id="NIUB61fjef" role="2VODD2">
                <node concept="3clFbF" id="1KHvivZJuyr" role="3cqZAp">
                  <node concept="2OqwBi" id="NIUB61fjeh" role="3clFbG">
                    <node concept="2YIFZM" id="NIUB61fjei" role="2Oq$k0">
                      <ref role="37wK5l" to="dush:~PersistenceFacade.getInstance():org.jetbrains.mps.openapi.persistence.PersistenceFacade" resolve="getInstance" />
                      <ref role="1Pybhc" to="dush:~PersistenceFacade" resolve="PersistenceFacade" />
                    </node>
                    <node concept="liA8E" id="NIUB61fjej" role="2OqNvi">
                      <ref role="37wK5l" to="dush:~PersistenceFacade.createModelReference(java.lang.String):org.jetbrains.mps.openapi.model.SModelReference" resolve="createModelReference" />
                      <node concept="2OqwBi" id="NIUB61fjek" role="37wK5m">
                        <node concept="30H73N" id="NIUB61fjel" role="2Oq$k0" />
                        <node concept="2qgKlT" id="NIUB61fjem" role="2OqNvi">
                          <ref role="37wK5l" to="wev6:5qdugmiLBZZ" resolve="getModelReference" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3uibUv" id="NIUB61fjen" role="2jfP_h">
              <ref role="3uigEE" to="mhbf:~SModelReference" resolve="SModelReference" />
            </node>
          </node>
          <node concept="3clFbS" id="NIUB61fjeo" role="3clFbx" />
          <node concept="3clFbT" id="NIUB61fjep" role="3clFbw">
            <property role="3clFbU" value="true" />
          </node>
          <node concept="1sPUBX" id="NIUB61fjeq" role="lGtFl">
            <ref role="v9R2y" node="73oS_w7sjpL" resolve="returnLanguageAspectDescriptor" />
            <node concept="3_TokI" id="NIUB61fjer" role="v9R3O">
              <ref role="1bhEwk" node="2bjbvjqUthU" resolve="langModule" />
            </node>
            <node concept="3_TokI" id="NIUB61fjes" role="v9R3O">
              <ref role="1bhEwk" node="NIUB61fjed" resolve="modelRef" />
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="1KHvivZJs0g" role="3cqZAp">
          <node concept="1WS0z7" id="1KHvivZJs0h" role="lGtFl">
            <node concept="3JmXsc" id="1KHvivZJs0i" role="3Jn$fo">
              <node concept="3clFbS" id="1KHvivZJs0j" role="2VODD2">
                <node concept="3clFbF" id="1KHvivZJs0k" role="3cqZAp">
                  <node concept="2OqwBi" id="1KHvivZJwAY" role="3clFbG">
                    <node concept="2OqwBi" id="1KHvivZJs0l" role="2Oq$k0">
                      <node concept="2OqwBi" id="1KHvivZJs0m" role="2Oq$k0">
                        <node concept="3Tsc0h" id="1KHvivZJs0n" role="2OqNvi">
                          <ref role="3TtcxE" to="hypd:5xDtKQA7vSF" />
                        </node>
                        <node concept="2OqwBi" id="1KHvivZJs0o" role="2Oq$k0">
                          <node concept="30H73N" id="1KHvivZJs0p" role="2Oq$k0" />
                          <node concept="3TrEf2" id="1KHvivZJs0q" role="2OqNvi">
                            <ref role="3Tt5mk" to="yv2q:1uh_eNRS9kV" />
                          </node>
                        </node>
                      </node>
                      <node concept="2S7cBI" id="1KHvivZJs0r" role="2OqNvi">
                        <node concept="1bVj0M" id="1KHvivZJs0s" role="23t8la">
                          <node concept="3clFbS" id="1KHvivZJs0t" role="1bW5cS">
                            <node concept="3clFbF" id="1KHvivZJs0u" role="3cqZAp">
                              <node concept="2OqwBi" id="1KHvivZJs0v" role="3clFbG">
                                <node concept="37vLTw" id="1KHvivZJs0w" role="2Oq$k0">
                                  <ref role="3cqZAo" node="1KHvivZJs0y" resolve="it" />
                                </node>
                                <node concept="3TrcHB" id="1KHvivZJs0x" role="2OqNvi">
                                  <ref role="3TsBF5" to="hypd:5xDtKQA7vSI" resolve="qualifiedName" />
                                </node>
                              </node>
                            </node>
                          </node>
                          <node concept="Rh6nW" id="1KHvivZJs0y" role="1bW2Oz">
                            <property role="TrG5h" value="it" />
                            <node concept="2jxLKc" id="1KHvivZJs0z" role="1tU5fm" />
                          </node>
                        </node>
                        <node concept="1nlBCl" id="1KHvivZJs0$" role="2S7zOq">
                          <property role="3clFbU" value="true" />
                        </node>
                      </node>
                    </node>
                    <node concept="3zZkjj" id="1KHvivZJwPY" role="2OqNvi">
                      <node concept="1bVj0M" id="1KHvivZJwQ0" role="23t8la">
                        <node concept="3clFbS" id="1KHvivZJwQ1" role="1bW5cS">
                          <node concept="3clFbF" id="1KHvivZJx6T" role="3cqZAp">
                            <node concept="3y3z36" id="1KHvivZJ$7g" role="3clFbG">
                              <node concept="10Nm6u" id="1KHvivZJ$je" role="3uHU7w" />
                              <node concept="2OqwBi" id="1KHvivZJxOG" role="3uHU7B">
                                <node concept="2OqwBi" id="1KHvivZJx6U" role="2Oq$k0">
                                  <node concept="2YIFZM" id="1KHvivZJx6V" role="2Oq$k0">
                                    <ref role="37wK5l" to="dush:~PersistenceFacade.getInstance():org.jetbrains.mps.openapi.persistence.PersistenceFacade" resolve="getInstance" />
                                    <ref role="1Pybhc" to="dush:~PersistenceFacade" resolve="PersistenceFacade" />
                                  </node>
                                  <node concept="liA8E" id="1KHvivZJx6W" role="2OqNvi">
                                    <ref role="37wK5l" to="dush:~PersistenceFacade.createModelReference(java.lang.String):org.jetbrains.mps.openapi.model.SModelReference" resolve="createModelReference" />
                                    <node concept="2OqwBi" id="1KHvivZJx6X" role="37wK5m">
                                      <node concept="37vLTw" id="1KHvivZJxsB" role="2Oq$k0">
                                        <ref role="3cqZAo" node="1KHvivZJwQ2" resolve="it" />
                                      </node>
                                      <node concept="2qgKlT" id="1KHvivZJxDK" role="2OqNvi">
                                        <ref role="37wK5l" to="wev6:5qdugmiLBZZ" resolve="getModelReference" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                                <node concept="liA8E" id="1KHvivZJxXZ" role="2OqNvi">
                                  <ref role="37wK5l" to="mhbf:~SModelReference.resolve(org.jetbrains.mps.openapi.module.SRepository):org.jetbrains.mps.openapi.model.SModel" resolve="resolve" />
                                  <node concept="2OqwBi" id="1KHvivZJyBS" role="37wK5m">
                                    <node concept="2OqwBi" id="1KHvivZJyhe" role="2Oq$k0">
                                      <node concept="1iwH7S" id="1KHvivZJy8K" role="2Oq$k0" />
                                      <node concept="1bhEwm" id="1KHvivZJyt3" role="2OqNvi">
                                        <ref role="1bhEwl" node="2bjbvjqUthU" resolve="langModule" />
                                      </node>
                                    </node>
                                    <node concept="liA8E" id="1KHvivZJz0d" role="2OqNvi">
                                      <ref role="37wK5l" to="31cb:~SModuleBase.getRepository():org.jetbrains.mps.openapi.module.SRepository" resolve="getRepository" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node concept="Rh6nW" id="1KHvivZJwQ2" role="1bW2Oz">
                          <property role="TrG5h" value="it" />
                          <node concept="2jxLKc" id="1KHvivZJwQ3" role="1tU5fm" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="2jeGV$" id="1KHvivZJs0_" role="lGtFl">
            <property role="TrG5h" value="model" />
            <node concept="2jfdEK" id="1KHvivZJs0A" role="2jfP_Y">
              <node concept="3clFbS" id="1KHvivZJs0B" role="2VODD2">
                <node concept="3cpWs6" id="1KHvivZJs0C" role="3cqZAp">
                  <node concept="2OqwBi" id="1KHvivZJu07" role="3cqZAk">
                    <node concept="2OqwBi" id="1KHvivZJs0D" role="2Oq$k0">
                      <node concept="2YIFZM" id="1KHvivZJs0E" role="2Oq$k0">
                        <ref role="1Pybhc" to="dush:~PersistenceFacade" resolve="PersistenceFacade" />
                        <ref role="37wK5l" to="dush:~PersistenceFacade.getInstance():org.jetbrains.mps.openapi.persistence.PersistenceFacade" resolve="getInstance" />
                      </node>
                      <node concept="liA8E" id="1KHvivZJs0F" role="2OqNvi">
                        <ref role="37wK5l" to="dush:~PersistenceFacade.createModelReference(java.lang.String):org.jetbrains.mps.openapi.model.SModelReference" resolve="createModelReference" />
                        <node concept="2OqwBi" id="1KHvivZJs0G" role="37wK5m">
                          <node concept="30H73N" id="1KHvivZJs0H" role="2Oq$k0" />
                          <node concept="2qgKlT" id="1KHvivZJs0I" role="2OqNvi">
                            <ref role="37wK5l" to="wev6:5qdugmiLBZZ" resolve="getModelReference" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="liA8E" id="1KHvivZJu4A" role="2OqNvi">
                      <ref role="37wK5l" to="mhbf:~SModelReference.resolve(org.jetbrains.mps.openapi.module.SRepository):org.jetbrains.mps.openapi.model.SModel" resolve="resolve" />
                      <node concept="2OqwBi" id="1KHvivZJuf_" role="37wK5m">
                        <node concept="2OqwBi" id="1KHvivZJu92" role="2Oq$k0">
                          <node concept="1iwH7S" id="1KHvivZJu6W" role="2Oq$k0" />
                          <node concept="1bhEwm" id="1KHvivZJucs" role="2OqNvi">
                            <ref role="1bhEwl" node="2bjbvjqUthU" resolve="langModule" />
                          </node>
                        </node>
                        <node concept="liA8E" id="1KHvivZJuxC" role="2OqNvi">
                          <ref role="37wK5l" to="31cb:~SModuleBase.getRepository():org.jetbrains.mps.openapi.module.SRepository" resolve="getRepository" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="H_c77" id="1KHvivZJ$Ds" role="2jfP_h" />
          </node>
          <node concept="3clFbS" id="1KHvivZJs0K" role="3clFbx" />
          <node concept="3clFbT" id="1KHvivZJs0L" role="3clFbw">
            <property role="3clFbU" value="true" />
          </node>
          <node concept="1sPUBX" id="1KHvivZJs0M" role="lGtFl">
            <ref role="v9R2y" node="1KHvivZJsL7" resolve="InstantiateAspectDescriptor" />
            <node concept="3_TokI" id="1KHvivZK6wG" role="v9R3O">
              <ref role="1bhEwk" node="1KHvivZJs0_" resolve="model" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="4YpmBa68qXc" role="3cqZAp">
          <node concept="2ShNRf" id="4YpmBa68qX8" role="3clFbG">
            <node concept="1pGfFk" id="4YpmBa68sta" role="2ShVmc">
              <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
            </node>
          </node>
          <node concept="2b32R4" id="4YpmBa68sty" role="lGtFl">
            <node concept="3JmXsc" id="4YpmBa68st$" role="2P8S$">
              <node concept="3clFbS" id="4YpmBa68stA" role="2VODD2">
                <node concept="3cpWs8" id="4r8JClTlid6" role="3cqZAp">
                  <node concept="3cpWsn" id="4r8JClTlid7" role="3cpWs9">
                    <property role="TrG5h" value="languageModule" />
                    <node concept="3uibUv" id="4r8JClTlid1" role="1tU5fm">
                      <ref role="3uigEE" to="lui2:~SModule" resolve="SModule" />
                    </node>
                    <node concept="2OqwBi" id="4r8JClTlid8" role="33vP2m">
                      <node concept="2JrnkZ" id="4r8JClTlid9" role="2Oq$k0">
                        <node concept="2OqwBi" id="4r8JClTlida" role="2JrQYb">
                          <node concept="1iwH7S" id="4r8JClTlidb" role="2Oq$k0" />
                          <node concept="1st3f0" id="4r8JClTlidc" role="2OqNvi" />
                        </node>
                      </node>
                      <node concept="liA8E" id="4r8JClTlidd" role="2OqNvi">
                        <ref role="37wK5l" to="mhbf:~SModel.getModule():org.jetbrains.mps.openapi.module.SModule" resolve="getModule" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbF" id="4r8JClTkBr4" role="3cqZAp">
                  <node concept="2OqwBi" id="4r8JClTlmM8" role="3clFbG">
                    <node concept="2OqwBi" id="4r8JClTkBKq" role="2Oq$k0">
                      <node concept="2OqwBi" id="4r8JClTkwwj" role="2Oq$k0">
                        <node concept="2O5UvJ" id="4r8JClTkwwk" role="2Oq$k0">
                          <ref role="2O5UnU" to="gevi:2Sw9hCAHJv3" resolve="LanguageAspectsEP" />
                        </node>
                        <node concept="SfwO_" id="4r8JClTkwwl" role="2OqNvi" />
                      </node>
                      <node concept="3zZkjj" id="4r8JClTlhVm" role="2OqNvi">
                        <node concept="1bVj0M" id="4r8JClTlhVo" role="23t8la">
                          <node concept="3clFbS" id="4r8JClTlhVp" role="1bW5cS">
                            <node concept="3clFbF" id="4r8JClTlhVq" role="3cqZAp">
                              <node concept="1Wc70l" id="4YpmBa68jGE" role="3clFbG">
                                <node concept="3y3z36" id="4YpmBa68kJm" role="3uHU7w">
                                  <node concept="10Nm6u" id="4YpmBa68kVA" role="3uHU7w" />
                                  <node concept="2OqwBi" id="4YpmBa68kaL" role="3uHU7B">
                                    <node concept="37vLTw" id="4YpmBa68jYr" role="2Oq$k0">
                                      <ref role="3cqZAo" node="4r8JClTlhV$" resolve="it" />
                                    </node>
                                    <node concept="liA8E" id="4YpmBa68kt5" role="2OqNvi">
                                      <ref role="37wK5l" to="vndm:~LanguageAspectDescriptor.getGenerator():jetbrains.mps.smodel.language.LanguageAspectGenerator" resolve="getGenerator" />
                                    </node>
                                  </node>
                                </node>
                                <node concept="2OqwBi" id="4r8JClTlhVr" role="3uHU7B">
                                  <node concept="37vLTw" id="4r8JClTlhVs" role="2Oq$k0">
                                    <ref role="3cqZAo" node="4r8JClTlhV$" resolve="it" />
                                  </node>
                                  <node concept="liA8E" id="4r8JClTlhVt" role="2OqNvi">
                                    <ref role="37wK5l" to="vndm:~LanguageAspectDescriptor.hasAspect(org.jetbrains.mps.openapi.module.SModule):boolean" resolve="hasAspect" />
                                    <node concept="37vLTw" id="4r8JClTlmqm" role="37wK5m">
                                      <ref role="3cqZAo" node="4r8JClTlid7" resolve="languageModule" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                          <node concept="Rh6nW" id="4r8JClTlhV$" role="1bW2Oz">
                            <property role="TrG5h" value="it" />
                            <node concept="2jxLKc" id="4r8JClTlhV_" role="1tU5fm" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3$u5V9" id="4YpmBa68cLJ" role="2OqNvi">
                      <node concept="1bVj0M" id="4YpmBa68cLL" role="23t8la">
                        <node concept="3clFbS" id="4YpmBa68cLM" role="1bW5cS">
                          <node concept="3cpWs8" id="6j4BAERjtH0" role="3cqZAp">
                            <node concept="3cpWsn" id="6j4BAERjtH1" role="3cpWs9">
                              <property role="TrG5h" value="method" />
                              <node concept="3Tqbb2" id="6j4BAERjtGY" role="1tU5fm">
                                <ref role="ehGHo" to="tpee:fzclF8t" resolve="InstanceMethodDeclaration" />
                              </node>
                              <node concept="2OqwBi" id="6j4BAERjtH2" role="33vP2m">
                                <node concept="2OqwBi" id="6j4BAERjtH3" role="2Oq$k0">
                                  <node concept="1iwH7S" id="6j4BAERjtH4" role="2Oq$k0" />
                                  <node concept="1KSxxD" id="6j4BAERjtH5" role="2OqNvi" />
                                </node>
                                <node concept="2Xjw5R" id="6j4BAERjtH6" role="2OqNvi">
                                  <node concept="1xMEDy" id="6j4BAERjtH7" role="1xVPHs">
                                    <node concept="chp4Y" id="6j4BAERjtH8" role="ri$Ld">
                                      <ref role="cht4Q" to="tpee:fzclF8t" resolve="InstanceMethodDeclaration" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                          <node concept="3clFbF" id="4YpmBa68dky" role="3cqZAp">
                            <node concept="2OqwBi" id="4YpmBa68lzd" role="3clFbG">
                              <node concept="2OqwBi" id="4YpmBa68dwH" role="2Oq$k0">
                                <node concept="37vLTw" id="4YpmBa68dkx" role="2Oq$k0">
                                  <ref role="3cqZAo" node="4YpmBa68cLN" resolve="it" />
                                </node>
                                <node concept="liA8E" id="4YpmBa68lgB" role="2OqNvi">
                                  <ref role="37wK5l" to="vndm:~LanguageAspectDescriptor.getGenerator():jetbrains.mps.smodel.language.LanguageAspectGenerator" resolve="getGenerator" />
                                </node>
                              </node>
                              <node concept="liA8E" id="4YpmBa68lSJ" role="2OqNvi">
                                <ref role="37wK5l" to="vndm:~LanguageAspectGenerator.generateInstantiation(org.jetbrains.mps.openapi.model.SNode,org.jetbrains.mps.openapi.model.SNode,org.jetbrains.mps.openapi.model.SModel):org.jetbrains.mps.openapi.model.SNode" resolve="generateInstantiation" />
                                <node concept="2OqwBi" id="4YpmBa6c$ve" role="37wK5m">
                                  <node concept="2OqwBi" id="4YpmBa6cwod" role="2Oq$k0">
                                    <node concept="37vLTw" id="6j4BAERjtH9" role="2Oq$k0">
                                      <ref role="3cqZAo" node="6j4BAERjtH1" resolve="method" />
                                    </node>
                                    <node concept="3Tsc0h" id="4YpmBa6cxX6" role="2OqNvi">
                                      <ref role="3TtcxE" to="tpee:fzclF7Y" />
                                    </node>
                                  </node>
                                  <node concept="1uHKPH" id="4YpmBa6cF46" role="2OqNvi" />
                                </node>
                                <node concept="2OqwBi" id="6j4BAERjyPl" role="37wK5m">
                                  <node concept="2OqwBi" id="6j4BAERjv0P" role="2Oq$k0">
                                    <node concept="37vLTw" id="6j4BAERjtHa" role="2Oq$k0">
                                      <ref role="3cqZAo" node="6j4BAERjtH1" resolve="method" />
                                    </node>
                                    <node concept="3Tsc0h" id="6j4BAERjwF9" role="2OqNvi">
                                      <ref role="3TtcxE" to="tpee:g96eVAe" />
                                    </node>
                                  </node>
                                  <node concept="1uHKPH" id="6j4BAERjAHG" role="2OqNvi" />
                                </node>
                                <node concept="2OqwBi" id="724FTCDTTqS" role="37wK5m">
                                  <node concept="1iwH7S" id="724FTCDTTh5" role="2Oq$k0" />
                                  <node concept="1st3f0" id="724FTCDTTId" role="2OqNvi" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node concept="Rh6nW" id="4YpmBa68cLN" role="1bW2Oz">
                          <property role="TrG5h" value="it" />
                          <node concept="2jxLKc" id="4YpmBa68cLO" role="1tU5fm" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="NIUB61fjet" role="3cqZAp">
          <node concept="3nyPlj" id="4VH0fFEnEYw" role="3cqZAk">
            <ref role="37wK5l" to="vndm:~LanguageRuntime.createAspect(java.lang.Class):jetbrains.mps.smodel.runtime.ILanguageAspect" resolve="createAspect" />
            <node concept="37vLTw" id="4VH0fFEnHvw" role="37wK5m">
              <ref role="3cqZAo" node="NIUB61fbdZ" resolve="aspectClass" />
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="NIUB61fbe3" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="2jeGV$" id="2bjbvjqUthU" role="lGtFl">
      <property role="TrG5h" value="langModule" />
      <node concept="2jfdEK" id="2bjbvjqUthW" role="2jfP_Y">
        <node concept="3clFbS" id="2bjbvjqUthY" role="2VODD2">
          <node concept="3cpWs8" id="2bjbvjqUxFN" role="3cqZAp">
            <node concept="3cpWsn" id="2bjbvjqUxFO" role="3cpWs9">
              <property role="TrG5h" value="ref" />
              <node concept="3uibUv" id="2bjbvjqUxFP" role="1tU5fm">
                <ref role="3uigEE" to="lui2:~SModuleReference" resolve="SModuleReference" />
              </node>
              <node concept="2OqwBi" id="2bjbvjqUxFQ" role="33vP2m">
                <node concept="2YIFZM" id="2bjbvjqUxFR" role="2Oq$k0">
                  <ref role="1Pybhc" to="dush:~PersistenceFacade" resolve="PersistenceFacade" />
                  <ref role="37wK5l" to="dush:~PersistenceFacade.getInstance():org.jetbrains.mps.openapi.persistence.PersistenceFacade" resolve="getInstance" />
                </node>
                <node concept="liA8E" id="2bjbvjqUxFS" role="2OqNvi">
                  <ref role="37wK5l" to="dush:~PersistenceFacade.createModuleReference(java.lang.String):org.jetbrains.mps.openapi.module.SModuleReference" resolve="createModuleReference" />
                  <node concept="2OqwBi" id="2bjbvjqUxFT" role="37wK5m">
                    <node concept="2OqwBi" id="2bjbvjqUxFU" role="2Oq$k0">
                      <node concept="30H73N" id="2bjbvjqUxFV" role="2Oq$k0" />
                      <node concept="3TrEf2" id="2bjbvjqUxFW" role="2OqNvi">
                        <ref role="3Tt5mk" to="yv2q:1uh_eNRS9kV" />
                      </node>
                    </node>
                    <node concept="2qgKlT" id="2bjbvjqUxFX" role="2OqNvi">
                      <ref role="37wK5l" to="wev6:7OJukvJ5PmG" resolve="getModuleReference" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3cpWs8" id="2bjbvjqUxFY" role="3cqZAp">
            <node concept="3cpWsn" id="2bjbvjqUxFZ" role="3cpWs9">
              <property role="TrG5h" value="l" />
              <node concept="3uibUv" id="2bjbvjqUy$s" role="1tU5fm">
                <ref role="3uigEE" to="w1kc:~Language" resolve="Language" />
              </node>
              <node concept="2OqwBi" id="2bjbvjqUxG1" role="33vP2m">
                <node concept="2YIFZM" id="2bjbvjqUxG2" role="2Oq$k0">
                  <ref role="37wK5l" to="w1kc:~ModuleRepositoryFacade.getInstance():jetbrains.mps.smodel.ModuleRepositoryFacade" resolve="getInstance" />
                  <ref role="1Pybhc" to="w1kc:~ModuleRepositoryFacade" resolve="ModuleRepositoryFacade" />
                </node>
                <node concept="liA8E" id="2bjbvjqUxG3" role="2OqNvi">
                  <ref role="37wK5l" to="w1kc:~ModuleRepositoryFacade.getModule(org.jetbrains.mps.openapi.module.SModuleReference,java.lang.Class):org.jetbrains.mps.openapi.module.SModule" resolve="getModule" />
                  <node concept="37vLTw" id="2bjbvjqUxG4" role="37wK5m">
                    <ref role="3cqZAo" node="2bjbvjqUxFO" resolve="ref" />
                  </node>
                  <node concept="3VsKOn" id="2bjbvjqU_w5" role="37wK5m">
                    <ref role="3VsUkX" to="w1kc:~Language" resolve="Language" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbJ" id="2bjbvjqUxG6" role="3cqZAp">
            <node concept="3clFbS" id="2bjbvjqUxG7" role="3clFbx">
              <node concept="3clFbF" id="2bjbvjqUxG8" role="3cqZAp">
                <node concept="2OqwBi" id="2bjbvjqUxG9" role="3clFbG">
                  <node concept="1iwH7S" id="2bjbvjqUxGa" role="2Oq$k0" />
                  <node concept="2k5nB$" id="2bjbvjqUxGb" role="2OqNvi">
                    <node concept="3cpWs3" id="2bjbvjqUxGc" role="2k5Stb">
                      <node concept="2OqwBi" id="2bjbvjqUxGd" role="3uHU7w">
                        <node concept="2OqwBi" id="2bjbvjqUxGe" role="2Oq$k0">
                          <node concept="30H73N" id="2bjbvjqUxGf" role="2Oq$k0" />
                          <node concept="3TrEf2" id="2bjbvjqUxGg" role="2OqNvi">
                            <ref role="3Tt5mk" to="yv2q:1uh_eNRS9kV" />
                          </node>
                        </node>
                        <node concept="3TrcHB" id="2bjbvjqUxGh" role="2OqNvi">
                          <ref role="3TsBF5" to="hypd:5xDtKQA7vSz" resolve="namespace" />
                        </node>
                      </node>
                      <node concept="Xl_RD" id="2bjbvjqUxGi" role="3uHU7B">
                        <property role="Xl_RC" value="No language in repository: " />
                      </node>
                    </node>
                    <node concept="2OqwBi" id="2bjbvjqUxGj" role="2k6f33">
                      <node concept="30H73N" id="2bjbvjqUxGk" role="2Oq$k0" />
                      <node concept="3TrEf2" id="2bjbvjqUxGl" role="2OqNvi">
                        <ref role="3Tt5mk" to="yv2q:1uh_eNRS9kV" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbC" id="2bjbvjqUxGo" role="3clFbw">
              <node concept="10Nm6u" id="2bjbvjqUxGp" role="3uHU7w" />
              <node concept="37vLTw" id="2bjbvjqUxGq" role="3uHU7B">
                <ref role="3cqZAo" node="2bjbvjqUxFZ" resolve="l" />
              </node>
            </node>
          </node>
          <node concept="3cpWs6" id="2bjbvjqUyjy" role="3cqZAp">
            <node concept="37vLTw" id="2bjbvjqUyqv" role="3cqZAk">
              <ref role="3cqZAo" node="2bjbvjqUxFZ" resolve="l" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="2bjbvjqUBH7" role="2jfP_h">
        <ref role="3uigEE" to="w1kc:~Language" resolve="Language" />
      </node>
    </node>
  </node>
  <node concept="bUwia" id="7BqJJVi3vhD">
    <property role="TrG5h" value="main" />
    <node concept="3lhOvk" id="7BqJJVi3vhE" role="3lj3bC">
      <ref role="30HIoZ" to="yv2q:7OJukvJ5je_" resolve="LanguageDescriptor" />
      <ref role="3lhOvi" node="7OJukvJ5j$M" resolve="Language" />
    </node>
    <node concept="3lhOvk" id="1uh_eNRS9l3" role="3lj3bC">
      <ref role="30HIoZ" to="hypd:5xDtKQA7vSx" resolve="Generator" />
      <ref role="3lhOvi" node="1uh_eNRS9l4" resolve="Generator" />
      <ref role="2sgKRv" node="4rgTJDg9HNX" resolve="generator.descriptor" />
      <node concept="30G5F_" id="5LsHsRgAik7" role="30HLyM">
        <node concept="3clFbS" id="5LsHsRgAik8" role="2VODD2">
          <node concept="3clFbF" id="5LsHsRgAik9" role="3cqZAp">
            <node concept="2OqwBi" id="5LsHsRgAikb" role="3clFbG">
              <node concept="30H73N" id="5LsHsRgAika" role="2Oq$k0" />
              <node concept="3TrcHB" id="5LsHsRgAikf" role="2OqNvi">
                <ref role="3TsBF5" to="hypd:2A_smLtZHa0" resolve="generateTemplates" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3aamgX" id="1_4jpH9o4C7" role="3acgRq">
      <ref role="30HIoZ" to="hypd:5xDtKQA7vSS" resolve="MappingPriorityRule" />
      <node concept="14YyZ8" id="1_4jpH9o4Cu" role="1lVwrX">
        <node concept="14ZrTv" id="1_4jpH9o4Cw" role="14ZwWg">
          <node concept="30G5F_" id="1_4jpH9o4Cx" role="150hEN">
            <node concept="3clFbS" id="1_4jpH9o4Cy" role="2VODD2">
              <node concept="3clFbF" id="1_4jpH9o4Do" role="3cqZAp">
                <node concept="2OqwBi" id="1_4jpH9o4Dv" role="3clFbG">
                  <node concept="2OqwBi" id="1_4jpH9o4Dq" role="2Oq$k0">
                    <node concept="30H73N" id="1_4jpH9o4Dp" role="2Oq$k0" />
                    <node concept="3TrcHB" id="1_4jpH9o4Du" role="2OqNvi">
                      <ref role="3TsBF5" to="hypd:5xDtKQA7vSX" resolve="type" />
                    </node>
                  </node>
                  <node concept="3t7uKx" id="1_4jpH9o4Dz" role="2OqNvi">
                    <node concept="uoxfO" id="1_4jpH9o4D$" role="3t7uKA">
                      <ref role="uo_Cq" to="hypd:5xDtKQA7vSU" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="gft3U" id="1_4jpH9o4CY" role="150oIE">
            <node concept="2YIFZM" id="1_4jpH9o4D0" role="gfFT$">
              <ref role="37wK5l" to="r99j:~TemplateUtil.createStrictlyBeforeRule(jetbrains.mps.generator.runtime.TemplateMappingConfigRef,jetbrains.mps.generator.runtime.TemplateMappingConfigRef):jetbrains.mps.generator.runtime.TemplateMappingPriorityRule" resolve="createStrictlyBeforeRule" />
              <ref role="1Pybhc" to="r99j:~TemplateUtil" resolve="TemplateUtil" />
              <node concept="10Nm6u" id="1_4jpH9o4D1" role="37wK5m">
                <node concept="29HgVG" id="1_4jpH9o4D2" role="lGtFl">
                  <node concept="3NFfHV" id="1_4jpH9o4D3" role="3NFExx">
                    <node concept="3clFbS" id="1_4jpH9o4D4" role="2VODD2">
                      <node concept="3clFbF" id="1_4jpH9o4Da" role="3cqZAp">
                        <node concept="2OqwBi" id="1_4jpH9o4Dc" role="3clFbG">
                          <node concept="30H73N" id="1_4jpH9o4Db" role="2Oq$k0" />
                          <node concept="3TrEf2" id="1_4jpH9o4Dg" role="2OqNvi">
                            <ref role="3Tt5mk" to="hypd:2n3WChplKbH" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="10Nm6u" id="1_4jpH9o4D5" role="37wK5m">
                <node concept="29HgVG" id="1_4jpH9o4D6" role="lGtFl">
                  <node concept="3NFfHV" id="1_4jpH9o4D7" role="3NFExx">
                    <node concept="3clFbS" id="1_4jpH9o4D8" role="2VODD2">
                      <node concept="3clFbF" id="1_4jpH9o4Dh" role="3cqZAp">
                        <node concept="2OqwBi" id="1_4jpH9o4Dj" role="3clFbG">
                          <node concept="30H73N" id="1_4jpH9o4Di" role="2Oq$k0" />
                          <node concept="3TrEf2" id="1_4jpH9o4Dn" role="2OqNvi">
                            <ref role="3Tt5mk" to="hypd:2n3WChplKbI" />
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
        <node concept="14ZrTv" id="1_4jpH9o4D_" role="14ZwWg">
          <node concept="30G5F_" id="1_4jpH9o4DA" role="150hEN">
            <node concept="3clFbS" id="1_4jpH9o4DB" role="2VODD2">
              <node concept="3clFbF" id="1_4jpH9o4DD" role="3cqZAp">
                <node concept="2OqwBi" id="1_4jpH9o4DE" role="3clFbG">
                  <node concept="2OqwBi" id="1_4jpH9o4DF" role="2Oq$k0">
                    <node concept="30H73N" id="1_4jpH9o4DG" role="2Oq$k0" />
                    <node concept="3TrcHB" id="1_4jpH9o4DH" role="2OqNvi">
                      <ref role="3TsBF5" to="hypd:5xDtKQA7vSX" resolve="type" />
                    </node>
                  </node>
                  <node concept="3t7uKx" id="1_4jpH9o4DI" role="2OqNvi">
                    <node concept="uoxfO" id="1_4jpH9o4DJ" role="3t7uKA">
                      <ref role="uo_Cq" to="hypd:5xDtKQA7vSW" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="gft3U" id="1_4jpH9o4DK" role="150oIE">
            <node concept="2YIFZM" id="1_4jpH9o4Ek" role="gfFT$">
              <ref role="37wK5l" to="r99j:~TemplateUtil.createBeforeOrTogetherRule(jetbrains.mps.generator.runtime.TemplateMappingConfigRef,jetbrains.mps.generator.runtime.TemplateMappingConfigRef):jetbrains.mps.generator.runtime.TemplateMappingPriorityRule" resolve="createBeforeOrTogetherRule" />
              <ref role="1Pybhc" to="r99j:~TemplateUtil" resolve="TemplateUtil" />
              <node concept="10Nm6u" id="1_4jpH9o4El" role="37wK5m">
                <node concept="29HgVG" id="1_4jpH9o4Em" role="lGtFl">
                  <node concept="3NFfHV" id="1_4jpH9o4En" role="3NFExx">
                    <node concept="3clFbS" id="1_4jpH9o4Eo" role="2VODD2">
                      <node concept="3clFbF" id="1_4jpH9o4Ep" role="3cqZAp">
                        <node concept="2OqwBi" id="1_4jpH9o4Eq" role="3clFbG">
                          <node concept="30H73N" id="1_4jpH9o4Er" role="2Oq$k0" />
                          <node concept="3TrEf2" id="1_4jpH9o4Es" role="2OqNvi">
                            <ref role="3Tt5mk" to="hypd:2n3WChplKbH" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="10Nm6u" id="1_4jpH9o4Et" role="37wK5m">
                <node concept="29HgVG" id="1_4jpH9o4Eu" role="lGtFl">
                  <node concept="3NFfHV" id="1_4jpH9o4Ev" role="3NFExx">
                    <node concept="3clFbS" id="1_4jpH9o4Ew" role="2VODD2">
                      <node concept="3clFbF" id="1_4jpH9o4Ex" role="3cqZAp">
                        <node concept="2OqwBi" id="1_4jpH9o4Ey" role="3clFbG">
                          <node concept="30H73N" id="1_4jpH9o4Ez" role="2Oq$k0" />
                          <node concept="3TrEf2" id="1_4jpH9o4E$" role="2OqNvi">
                            <ref role="3Tt5mk" to="hypd:2n3WChplKbI" />
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
        <node concept="14ZrTv" id="2iI_8zFGm1M" role="14ZwWg">
          <node concept="30G5F_" id="2iI_8zFGm1N" role="150hEN">
            <node concept="3clFbS" id="2iI_8zFGm1O" role="2VODD2">
              <node concept="3clFbF" id="2iI_8zFGm1P" role="3cqZAp">
                <node concept="2OqwBi" id="2iI_8zFGm1Q" role="3clFbG">
                  <node concept="2OqwBi" id="2iI_8zFGm1R" role="2Oq$k0">
                    <node concept="30H73N" id="2iI_8zFGm1S" role="2Oq$k0" />
                    <node concept="3TrcHB" id="2iI_8zFGm1T" role="2OqNvi">
                      <ref role="3TsBF5" to="hypd:5xDtKQA7vSX" resolve="type" />
                    </node>
                  </node>
                  <node concept="3t7uKx" id="2iI_8zFGm1U" role="2OqNvi">
                    <node concept="uoxfO" id="2iI_8zFGm1V" role="3t7uKA">
                      <ref role="uo_Cq" to="hypd:2iI_8zFG7Cv" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="gft3U" id="2iI_8zFGm1W" role="150oIE">
            <node concept="2YIFZM" id="2iI_8zFGm2E" role="gfFT$">
              <ref role="37wK5l" to="r99j:~TemplateUtil.createStrictlyAfterRule(jetbrains.mps.generator.runtime.TemplateMappingConfigRef,jetbrains.mps.generator.runtime.TemplateMappingConfigRef):jetbrains.mps.generator.runtime.TemplateMappingPriorityRule" resolve="createStrictlyAfterRule" />
              <ref role="1Pybhc" to="r99j:~TemplateUtil" resolve="TemplateUtil" />
              <node concept="10Nm6u" id="2iI_8zFGm2F" role="37wK5m">
                <node concept="29HgVG" id="2iI_8zFGm2G" role="lGtFl">
                  <node concept="3NFfHV" id="2iI_8zFGm2H" role="3NFExx">
                    <node concept="3clFbS" id="2iI_8zFGm2I" role="2VODD2">
                      <node concept="3clFbF" id="2iI_8zFGm2J" role="3cqZAp">
                        <node concept="2OqwBi" id="2iI_8zFGm2K" role="3clFbG">
                          <node concept="30H73N" id="2iI_8zFGm2L" role="2Oq$k0" />
                          <node concept="3TrEf2" id="2iI_8zFGm2M" role="2OqNvi">
                            <ref role="3Tt5mk" to="hypd:2n3WChplKbH" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="10Nm6u" id="2iI_8zFGm2N" role="37wK5m">
                <node concept="29HgVG" id="2iI_8zFGm2O" role="lGtFl">
                  <node concept="3NFfHV" id="2iI_8zFGm2P" role="3NFExx">
                    <node concept="3clFbS" id="2iI_8zFGm2Q" role="2VODD2">
                      <node concept="3clFbF" id="2iI_8zFGm2R" role="3cqZAp">
                        <node concept="2OqwBi" id="2iI_8zFGm2S" role="3clFbG">
                          <node concept="30H73N" id="2iI_8zFGm2T" role="2Oq$k0" />
                          <node concept="3TrEf2" id="2iI_8zFGm2U" role="2OqNvi">
                            <ref role="3Tt5mk" to="hypd:2n3WChplKbI" />
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
        <node concept="14ZrTv" id="2iI_8zFGm2e" role="14ZwWg">
          <node concept="30G5F_" id="2iI_8zFGm2f" role="150hEN">
            <node concept="3clFbS" id="2iI_8zFGm2g" role="2VODD2">
              <node concept="3clFbF" id="2iI_8zFGm2h" role="3cqZAp">
                <node concept="2OqwBi" id="2iI_8zFGm2i" role="3clFbG">
                  <node concept="2OqwBi" id="2iI_8zFGm2j" role="2Oq$k0">
                    <node concept="30H73N" id="2iI_8zFGm2k" role="2Oq$k0" />
                    <node concept="3TrcHB" id="2iI_8zFGm2l" role="2OqNvi">
                      <ref role="3TsBF5" to="hypd:5xDtKQA7vSX" resolve="type" />
                    </node>
                  </node>
                  <node concept="3t7uKx" id="2iI_8zFGm2m" role="2OqNvi">
                    <node concept="uoxfO" id="2iI_8zFGm2n" role="3t7uKA">
                      <ref role="uo_Cq" to="hypd:2iI_8zFG7Cu" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="gft3U" id="2iI_8zFGm2o" role="150oIE">
            <node concept="2YIFZM" id="2iI_8zFGm2V" role="gfFT$">
              <ref role="37wK5l" to="r99j:~TemplateUtil.createAfterOrTogetherRule(jetbrains.mps.generator.runtime.TemplateMappingConfigRef,jetbrains.mps.generator.runtime.TemplateMappingConfigRef):jetbrains.mps.generator.runtime.TemplateMappingPriorityRule" resolve="createAfterOrTogetherRule" />
              <ref role="1Pybhc" to="r99j:~TemplateUtil" resolve="TemplateUtil" />
              <node concept="10Nm6u" id="2iI_8zFGm2W" role="37wK5m">
                <node concept="29HgVG" id="2iI_8zFGm2X" role="lGtFl">
                  <node concept="3NFfHV" id="2iI_8zFGm2Y" role="3NFExx">
                    <node concept="3clFbS" id="2iI_8zFGm2Z" role="2VODD2">
                      <node concept="3clFbF" id="2iI_8zFGm30" role="3cqZAp">
                        <node concept="2OqwBi" id="2iI_8zFGm31" role="3clFbG">
                          <node concept="30H73N" id="2iI_8zFGm32" role="2Oq$k0" />
                          <node concept="3TrEf2" id="2iI_8zFGm33" role="2OqNvi">
                            <ref role="3Tt5mk" to="hypd:2n3WChplKbH" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="10Nm6u" id="2iI_8zFGm34" role="37wK5m">
                <node concept="29HgVG" id="2iI_8zFGm35" role="lGtFl">
                  <node concept="3NFfHV" id="2iI_8zFGm36" role="3NFExx">
                    <node concept="3clFbS" id="2iI_8zFGm37" role="2VODD2">
                      <node concept="3clFbF" id="2iI_8zFGm38" role="3cqZAp">
                        <node concept="2OqwBi" id="2iI_8zFGm39" role="3clFbG">
                          <node concept="30H73N" id="2iI_8zFGm3a" role="2Oq$k0" />
                          <node concept="3TrEf2" id="2iI_8zFGm3b" role="2OqNvi">
                            <ref role="3Tt5mk" to="hypd:2n3WChplKbI" />
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
        <node concept="gft3U" id="1_4jpH9o4E2" role="14YRTM">
          <node concept="2YIFZM" id="1_4jpH9o4E_" role="gfFT$">
            <ref role="37wK5l" to="r99j:~TemplateUtil.createStrictlyTogetherRule(jetbrains.mps.generator.runtime.TemplateMappingConfigRef,jetbrains.mps.generator.runtime.TemplateMappingConfigRef):jetbrains.mps.generator.runtime.TemplateMappingPriorityRule" resolve="createStrictlyTogetherRule" />
            <ref role="1Pybhc" to="r99j:~TemplateUtil" resolve="TemplateUtil" />
            <node concept="10Nm6u" id="1_4jpH9o4EA" role="37wK5m">
              <node concept="29HgVG" id="1_4jpH9o4EB" role="lGtFl">
                <node concept="3NFfHV" id="1_4jpH9o4EC" role="3NFExx">
                  <node concept="3clFbS" id="1_4jpH9o4ED" role="2VODD2">
                    <node concept="3clFbF" id="1_4jpH9o4EE" role="3cqZAp">
                      <node concept="2OqwBi" id="1_4jpH9o4EF" role="3clFbG">
                        <node concept="30H73N" id="1_4jpH9o4EG" role="2Oq$k0" />
                        <node concept="3TrEf2" id="1_4jpH9o4EH" role="2OqNvi">
                          <ref role="3Tt5mk" to="hypd:2n3WChplKbH" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="10Nm6u" id="1_4jpH9o4EI" role="37wK5m">
              <node concept="29HgVG" id="1_4jpH9o4EJ" role="lGtFl">
                <node concept="3NFfHV" id="1_4jpH9o4EK" role="3NFExx">
                  <node concept="3clFbS" id="1_4jpH9o4EL" role="2VODD2">
                    <node concept="3clFbF" id="1_4jpH9o4EM" role="3cqZAp">
                      <node concept="2OqwBi" id="1_4jpH9o4EN" role="3clFbG">
                        <node concept="30H73N" id="1_4jpH9o4EO" role="2Oq$k0" />
                        <node concept="3TrEf2" id="1_4jpH9o4EP" role="2OqNvi">
                          <ref role="3Tt5mk" to="hypd:2n3WChplKbI" />
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
    <node concept="3aamgX" id="1_4jpH9o4EQ" role="3acgRq">
      <ref role="30HIoZ" to="hypd:2n3WChplMvx" resolve="MappingConfigExternalRef" />
      <node concept="gft3U" id="1_4jpH9o4ES" role="1lVwrX">
        <node concept="2YIFZM" id="1_4jpH9o4Fb" role="gfFT$">
          <ref role="37wK5l" to="r99j:~TemplateUtil.createRefExternal(java.lang.String,jetbrains.mps.generator.runtime.TemplateMappingConfigRef):jetbrains.mps.generator.runtime.TemplateMappingConfigRef" resolve="createRefExternal" />
          <ref role="1Pybhc" to="r99j:~TemplateUtil" resolve="TemplateUtil" />
          <node concept="Xl_RD" id="1_4jpH9o4GF" role="37wK5m">
            <property role="Xl_RC" value="" />
            <node concept="17Uvod" id="1_4jpH9o4GT" role="lGtFl">
              <property role="2qtEX9" value="value" />
              <property role="P4ACc" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1070475926800/1070475926801" />
              <node concept="3zFVjK" id="1_4jpH9o4GU" role="3zH0cK">
                <node concept="3clFbS" id="1_4jpH9o4GV" role="2VODD2">
                  <node concept="3SKdUt" id="1_4jpH9o4Vh" role="3cqZAp">
                    <node concept="3SKdUq" id="1_4jpH9o4Vi" role="3SKWNk">
                      <property role="3SKdUp" value="TODO" />
                    </node>
                  </node>
                  <node concept="3clFbF" id="1_4jpH9o4H3" role="3cqZAp">
                    <node concept="2OqwBi" id="1_4jpH9o4Vb" role="3clFbG">
                      <node concept="2ShNRf" id="1_4jpH9o4H4" role="2Oq$k0">
                        <node concept="1pGfFk" id="1_4jpH9o4UB" role="2ShVmc">
                          <ref role="37wK5l" to="w0gx:~ModuleReference.&lt;init&gt;(java.lang.String,java.lang.String)" resolve="ModuleReference" />
                          <node concept="2OqwBi" id="1_4jpH9o4UI" role="37wK5m">
                            <node concept="2OqwBi" id="1_4jpH9o4UD" role="2Oq$k0">
                              <node concept="30H73N" id="1_4jpH9o4UC" role="2Oq$k0" />
                              <node concept="3TrEf2" id="1_4jpH9o4UH" role="2OqNvi">
                                <ref role="3Tt5mk" to="hypd:2n3WChplMvz" />
                              </node>
                            </node>
                            <node concept="3TrcHB" id="1_4jpH9o4UM" role="2OqNvi">
                              <ref role="3TsBF5" to="hypd:1AZH1sZHi4e" resolve="qualifiedName" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="1_4jpH9o4V2" role="37wK5m">
                            <node concept="2OqwBi" id="1_4jpH9o4US" role="2Oq$k0">
                              <node concept="30H73N" id="1_4jpH9o4UR" role="2Oq$k0" />
                              <node concept="3TrEf2" id="1_4jpH9o4V1" role="2OqNvi">
                                <ref role="3Tt5mk" to="hypd:2n3WChplMvz" />
                              </node>
                            </node>
                            <node concept="3TrcHB" id="1_4jpH9o4Va" role="2OqNvi">
                              <ref role="3TsBF5" to="hypd:1AZH1sZHi4d" resolve="uuid" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="liA8E" id="1_4jpH9o4Vf" role="2OqNvi">
                        <ref role="37wK5l" to="w0gx:~ModuleReference.toString():java.lang.String" resolve="toString" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="10Nm6u" id="1_4jpH9o4GH" role="37wK5m">
            <node concept="29HgVG" id="1_4jpH9o4GJ" role="lGtFl">
              <node concept="3NFfHV" id="1_4jpH9o4GK" role="3NFExx">
                <node concept="3clFbS" id="1_4jpH9o4GL" role="2VODD2">
                  <node concept="3clFbF" id="1_4jpH9o4GM" role="3cqZAp">
                    <node concept="2OqwBi" id="1_4jpH9o4GO" role="3clFbG">
                      <node concept="30H73N" id="1_4jpH9o4GN" role="2Oq$k0" />
                      <node concept="3TrEf2" id="1_4jpH9o4GS" role="2OqNvi">
                        <ref role="3Tt5mk" to="hypd:2n3WChplMvy" />
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
    <node concept="3aamgX" id="1_4jpH9o4Fs" role="3acgRq">
      <ref role="30HIoZ" to="hypd:2n3WChplMtR" resolve="MappingConfigNormalRef" />
      <node concept="gft3U" id="1_4jpH9o4Ft" role="1lVwrX">
        <node concept="2YIFZM" id="1_4jpH9o4FC" role="gfFT$">
          <ref role="37wK5l" to="r99j:~TemplateUtil.createRefNormal(java.lang.String,java.lang.String):jetbrains.mps.generator.runtime.TemplateMappingConfigRef" resolve="createRefNormal" />
          <ref role="1Pybhc" to="r99j:~TemplateUtil" resolve="TemplateUtil" />
          <node concept="Xl_RD" id="1_4jpH9o4G2" role="37wK5m">
            <property role="Xl_RC" value="" />
            <node concept="17Uvod" id="1_4jpH9o4G5" role="lGtFl">
              <property role="2qtEX9" value="value" />
              <property role="P4ACc" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1070475926800/1070475926801" />
              <node concept="3zFVjK" id="1_4jpH9o4G6" role="3zH0cK">
                <node concept="3clFbS" id="1_4jpH9o4G7" role="2VODD2">
                  <node concept="3clFbF" id="1_4jpH9o4Gi" role="3cqZAp">
                    <node concept="2OqwBi" id="1_4jpH9o4Gk" role="3clFbG">
                      <node concept="30H73N" id="1_4jpH9o4Gj" role="2Oq$k0" />
                      <node concept="3TrcHB" id="1_4jpH9o4Go" role="2OqNvi">
                        <ref role="3TsBF5" to="hypd:2n3WChplMtS" resolve="modelUID" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="Xl_RD" id="1_4jpH9o4G4" role="37wK5m">
            <property role="Xl_RC" value="" />
            <node concept="17Uvod" id="1_4jpH9o4G8" role="lGtFl">
              <property role="2qtEX9" value="value" />
              <property role="P4ACc" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1070475926800/1070475926801" />
              <node concept="3zFVjK" id="1_4jpH9o4G9" role="3zH0cK">
                <node concept="3clFbS" id="1_4jpH9o4Ga" role="2VODD2">
                  <node concept="3clFbF" id="1_4jpH9o4Gb" role="3cqZAp">
                    <node concept="2OqwBi" id="1_4jpH9o4Gd" role="3clFbG">
                      <node concept="30H73N" id="1_4jpH9o4Gc" role="2Oq$k0" />
                      <node concept="3TrcHB" id="1_4jpH9o4Gh" role="2OqNvi">
                        <ref role="3TsBF5" to="hypd:2n3WChplMtT" resolve="nodeID" />
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
    <node concept="3aamgX" id="1_4jpH9o4Fv" role="3acgRq">
      <ref role="30HIoZ" to="hypd:2n3WChplfsf" resolve="MappingConfigRefAllGlobal" />
      <node concept="gft3U" id="1_4jpH9o4Fw" role="1lVwrX">
        <node concept="2YIFZM" id="1_4jpH9o4FD" role="gfFT$">
          <ref role="37wK5l" to="r99j:~TemplateUtil.createRefGlobal():jetbrains.mps.generator.runtime.TemplateMappingConfigRef" resolve="createRefGlobal" />
          <ref role="1Pybhc" to="r99j:~TemplateUtil" resolve="TemplateUtil" />
        </node>
      </node>
    </node>
    <node concept="3aamgX" id="1_4jpH9o4Fy" role="3acgRq">
      <ref role="30HIoZ" to="hypd:2n3WChplKbk" resolve="MappingConfigRefAllLocal" />
      <node concept="gft3U" id="1_4jpH9o4Fz" role="1lVwrX">
        <node concept="2YIFZM" id="1_4jpH9o4FE" role="gfFT$">
          <ref role="37wK5l" to="r99j:~TemplateUtil.createRefLocal():jetbrains.mps.generator.runtime.TemplateMappingConfigRef" resolve="createRefLocal" />
          <ref role="1Pybhc" to="r99j:~TemplateUtil" resolve="TemplateUtil" />
        </node>
      </node>
    </node>
    <node concept="3aamgX" id="1_4jpH9o4F_" role="3acgRq">
      <ref role="30HIoZ" to="hypd:2n3WChplKcb" resolve="MappingConfigRefSet" />
      <node concept="gft3U" id="1_4jpH9o4FA" role="1lVwrX">
        <node concept="2YIFZM" id="1_4jpH9o4FF" role="gfFT$">
          <ref role="37wK5l" to="r99j:~TemplateUtil.createRefSet(jetbrains.mps.generator.runtime.TemplateMappingConfigRef...):jetbrains.mps.generator.runtime.TemplateMappingConfigRef" resolve="createRefSet" />
          <ref role="1Pybhc" to="r99j:~TemplateUtil" resolve="TemplateUtil" />
          <node concept="10Nm6u" id="1_4jpH9o4FG" role="37wK5m">
            <node concept="2b32R4" id="2TxoddSUU7p" role="lGtFl">
              <node concept="3JmXsc" id="2TxoddSUU7r" role="2P8S$">
                <node concept="3clFbS" id="2TxoddSUU7s" role="2VODD2">
                  <node concept="3clFbF" id="2TxoddSUU7t" role="3cqZAp">
                    <node concept="2OqwBi" id="2TxoddSUU7u" role="3clFbG">
                      <node concept="30H73N" id="2TxoddSUU7v" role="2Oq$k0" />
                      <node concept="3Tsc0h" id="2TxoddSUU7w" role="2OqNvi">
                        <ref role="3TtcxE" to="hypd:2n3WChplKcc" />
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
    <node concept="2rT7sh" id="4rgTJDg9HNX" role="2rTMjI">
      <property role="TrG5h" value="generator.descriptor" />
      <ref role="2rTdP9" to="hypd:5xDtKQA7vSx" resolve="Generator" />
      <ref role="2rZz_L" to="tpee:fz12cDA" resolve="ClassConcept" />
    </node>
    <node concept="2rT7sh" id="3XrE5vco2r5" role="2rTMjI">
      <property role="TrG5h" value="aspect.descriptor.field" />
      <ref role="2rTdP9" to="hypd:5xDtKQA7vSB" resolve="ModelReference" />
      <ref role="2rZz_L" to="tpee:fz12cDC" resolve="FieldDeclaration" />
    </node>
    <node concept="2VPoh5" id="7BqJJVi3vjH" role="2VS0gm">
      <ref role="2VPoh2" node="1uh_eNRSFyP" resolve="descriptor" />
      <node concept="2VP$b9" id="7BqJJVi3$ML" role="2VPoh3">
        <node concept="3clFbS" id="7BqJJVi3$MM" role="2VODD2">
          <node concept="3clFbF" id="7BqJJVi3$MN" role="3cqZAp">
            <node concept="2OqwBi" id="7BqJJVi3$N5" role="3clFbG">
              <node concept="2YIFZM" id="2n9zn0CqMWC" role="2Oq$k0">
                <ref role="37wK5l" to="unno:7WvVJ3rO1Xl" resolve="getModelStereotype" />
                <ref role="1Pybhc" to="unno:1NYD3hytmTa" resolve="SNodeOperations" />
                <node concept="2JrnkZ" id="2n9zn0CqMWD" role="37wK5m">
                  <node concept="2OqwBi" id="2n9zn0CqMWE" role="2JrQYb">
                    <node concept="1iwH7S" id="2n9zn0CqMWF" role="2Oq$k0" />
                    <node concept="1st3f0" id="2n9zn0CqMWG" role="2OqNvi" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="7BqJJVi3$N9" role="2OqNvi">
                <ref role="37wK5l" to="wyt6:~String.equals(java.lang.Object):boolean" resolve="equals" />
                <node concept="Xl_RD" id="7BqJJVi3$Na" role="37wK5m">
                  <property role="Xl_RC" value="descriptor" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="2ie$Fy" id="1uh_eNRSFyP">
    <node concept="3Yt8$i" id="1uh_eNRSFyQ" role="3wsg7n">
      <property role="3Yt8$J" value="ddd" />
      <property role="3Yt8$I" value="ddd" />
      <node concept="3_AbJx" id="1jOtBURDG1F" role="lGtFl">
        <node concept="3_AbJw" id="1jOtBURDG1G" role="3_A0Ny">
          <node concept="3clFbS" id="1jOtBURDG1H" role="2VODD2">
            <node concept="3clFbF" id="1jOtBURDG1I" role="3cqZAp">
              <node concept="1PxgMI" id="1jOtBURDG1J" role="3clFbG">
                <ref role="1PxNhF" to="hypd:5xDtKQA7vSv" resolve="Language" />
                <node concept="2OqwBi" id="1jOtBURDG1K" role="1PxMeX">
                  <node concept="2OqwBi" id="1jOtBURDG1L" role="2Oq$k0">
                    <node concept="1iwH7S" id="1jOtBURDG1M" role="2Oq$k0" />
                    <node concept="1st3f0" id="1jOtBURDG1N" role="2OqNvi" />
                  </node>
                  <node concept="13u695" id="1jOtBURDG1O" role="2OqNvi" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="n94m4" id="1uh_eNRSFyR" role="lGtFl" />
  </node>
  <node concept="jVnub" id="73oS_w7sjpL">
    <property role="TrG5h" value="returnLanguageAspectDescriptor" />
    <node concept="1N15co" id="227lWzxTzAl" role="1s_3oS">
      <property role="TrG5h" value="langModule" />
      <node concept="3uibUv" id="227lWzxTCWS" role="1N15GL">
        <ref role="3uigEE" to="w1kc:~Language" resolve="Language" />
      </node>
    </node>
    <node concept="1N15co" id="227lWzxWwEv" role="1s_3oS">
      <property role="TrG5h" value="modelRef" />
      <node concept="3uibUv" id="227lWzxWxKc" role="1N15GL">
        <ref role="3uigEE" to="mhbf:~SModelReference" resolve="SModelReference" />
      </node>
    </node>
    <node concept="3aamgX" id="1na$wSWf3eT" role="3aUrZf">
      <ref role="30HIoZ" to="hypd:5xDtKQA7vSB" resolve="ModelReference" />
      <node concept="30G5F_" id="3amxxUikqkw" role="30HLyM">
        <node concept="3clFbS" id="3amxxUikqkx" role="2VODD2">
          <node concept="3cpWs8" id="3amxxUikqs6" role="3cqZAp">
            <node concept="3cpWsn" id="3amxxUikqs7" role="3cpWs9">
              <property role="TrG5h" value="aspectModel" />
              <node concept="2OqwBi" id="3amxxUikqs8" role="33vP2m">
                <node concept="Rm8GO" id="3amxxUiksvu" role="2Oq$k0">
                  <ref role="Rm8GQ" to="w1kc:~LanguageAspect.EDITOR" resolve="EDITOR" />
                  <ref role="1Px2BO" to="w1kc:~LanguageAspect" resolve="LanguageAspect" />
                </node>
                <node concept="liA8E" id="3amxxUikqsa" role="2OqNvi">
                  <ref role="37wK5l" to="w1kc:~LanguageAspect.get(jetbrains.mps.smodel.Language):org.jetbrains.mps.openapi.model.SModel" resolve="get" />
                  <node concept="2OqwBi" id="3amxxUikqsb" role="37wK5m">
                    <node concept="1iwH7S" id="3amxxUikqsc" role="2Oq$k0" />
                    <node concept="3cR$yn" id="3amxxUikqsd" role="2OqNvi">
                      <ref role="3cRzXn" node="227lWzxTzAl" resolve="langModule" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3uibUv" id="3amxxUikqse" role="1tU5fm">
                <ref role="3uigEE" to="mhbf:~SModel" resolve="SModel" />
              </node>
            </node>
          </node>
          <node concept="3clFbJ" id="3amxxUikqsf" role="3cqZAp">
            <node concept="3clFbS" id="3amxxUikqsg" role="3clFbx">
              <node concept="3cpWs6" id="3amxxUikqsh" role="3cqZAp">
                <node concept="3clFbT" id="3amxxUikqsi" role="3cqZAk">
                  <property role="3clFbU" value="false" />
                </node>
              </node>
            </node>
            <node concept="3clFbC" id="3amxxUikqsj" role="3clFbw">
              <node concept="37vLTw" id="3amxxUikqsk" role="3uHU7B">
                <ref role="3cqZAo" node="3amxxUikqs7" resolve="aspectModel" />
              </node>
              <node concept="10Nm6u" id="3amxxUikqsl" role="3uHU7w" />
            </node>
          </node>
          <node concept="3clFbJ" id="3amxxUikqsm" role="3cqZAp">
            <node concept="3clFbS" id="3amxxUikqsn" role="3clFbx">
              <node concept="3cpWs6" id="3amxxUikqso" role="3cqZAp">
                <node concept="3clFbT" id="3amxxUikqsp" role="3cqZAk">
                  <property role="3clFbU" value="false" />
                </node>
              </node>
            </node>
            <node concept="3fqX7Q" id="3amxxUikqsq" role="3clFbw">
              <node concept="2OqwBi" id="3amxxUikqsr" role="3fr31v">
                <node concept="2OqwBi" id="3amxxUikqss" role="2Oq$k0">
                  <node concept="liA8E" id="3amxxUikqst" role="2OqNvi">
                    <ref role="37wK5l" to="wyt6:~Object.toString():java.lang.String" resolve="toString" />
                  </node>
                  <node concept="2OqwBi" id="3amxxUikqsu" role="2Oq$k0">
                    <node concept="liA8E" id="3amxxUikqsv" role="2OqNvi">
                      <ref role="37wK5l" to="mhbf:~SModelReference.getModelId():org.jetbrains.mps.openapi.model.SModelId" resolve="getModelId" />
                    </node>
                    <node concept="2OqwBi" id="3amxxUikqsw" role="2Oq$k0">
                      <node concept="37vLTw" id="3amxxUikqsx" role="2Oq$k0">
                        <ref role="3cqZAo" node="3amxxUikqs7" resolve="aspectModel" />
                      </node>
                      <node concept="liA8E" id="3amxxUikqsy" role="2OqNvi">
                        <ref role="37wK5l" to="mhbf:~SModel.getReference():org.jetbrains.mps.openapi.model.SModelReference" resolve="getReference" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="3amxxUikqsz" role="2OqNvi">
                  <ref role="37wK5l" to="wyt6:~String.equals(java.lang.Object):boolean" resolve="equals" />
                  <node concept="2OqwBi" id="3amxxUikqs$" role="37wK5m">
                    <node concept="3TrcHB" id="3amxxUikqs_" role="2OqNvi">
                      <ref role="3TsBF5" to="hypd:5xDtKQA7vSH" resolve="uuid" />
                    </node>
                    <node concept="30H73N" id="3amxxUikqsA" role="2Oq$k0" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3cpWs6" id="3amxxUiksGx" role="3cqZAp">
            <node concept="3clFbT" id="3amxxUiksNQ" role="3cqZAk">
              <property role="3clFbU" value="true" />
            </node>
          </node>
        </node>
      </node>
      <node concept="1Koe21" id="3XrE5vcmThX" role="1lVwrX">
        <node concept="312cEu" id="3XrE5vcmTCT" role="1Koe22">
          <property role="2bfB8j" value="true" />
          <property role="TrG5h" value="containerClass" />
          <node concept="3clFb_" id="3XrE5vcna5M" role="jymVt">
            <property role="1EzhhJ" value="false" />
            <property role="TrG5h" value="createAspectDescriptor" />
            <property role="od$2w" value="false" />
            <property role="DiZV1" value="false" />
            <node concept="16syzq" id="3XrE5vcrvmy" role="3clF45">
              <ref role="16sUi3" node="3XrE5vcna68" resolve="T" />
            </node>
            <node concept="37vLTG" id="3XrE5vcna5N" role="3clF46">
              <property role="TrG5h" value="aspectClass" />
              <node concept="3uibUv" id="3XrE5vcna5O" role="1tU5fm">
                <ref role="3uigEE" to="wyt6:~Class" resolve="Class" />
                <node concept="16syzq" id="3XrE5vcrx4O" role="11_B2D">
                  <ref role="16sUi3" node="3XrE5vcna68" resolve="T" />
                </node>
              </node>
            </node>
            <node concept="3clFbS" id="3XrE5vcna5R" role="3clF47">
              <node concept="3clFbJ" id="3XrE5vcna5S" role="3cqZAp">
                <node concept="3clFbC" id="3XrE5vcni6x" role="3clFbw">
                  <node concept="3VsKOn" id="4T4DgDRJ5JL" role="3uHU7w">
                    <ref role="3VsUkX" to="iwf0:~EditorAspectDescriptor" resolve="EditorAspectDescriptor" />
                  </node>
                  <node concept="37vLTw" id="3XrE5vcnhrD" role="3uHU7B">
                    <ref role="3cqZAo" node="3XrE5vcna5N" resolve="aspectClass" />
                  </node>
                </node>
                <node concept="3clFbS" id="3XrE5vcna63" role="3clFbx">
                  <node concept="3cpWs6" id="3XrE5vcnqKv" role="3cqZAp">
                    <node concept="1W57fq" id="3jayZ6srZsG" role="lGtFl">
                      <node concept="3IZrLx" id="3jayZ6srZsI" role="3IZSJc">
                        <node concept="3clFbS" id="3jayZ6srZsK" role="2VODD2">
                          <node concept="3cpWs8" id="7IH442cXHPC" role="3cqZAp">
                            <node concept="3cpWsn" id="7IH442cXHPD" role="3cpWs9">
                              <property role="TrG5h" value="aspectModel" />
                              <node concept="2OqwBi" id="7IH442cXHPE" role="33vP2m">
                                <node concept="liA8E" id="7IH442cXHPG" role="2OqNvi">
                                  <ref role="37wK5l" to="w1kc:~LanguageAspect.get(jetbrains.mps.smodel.Language):org.jetbrains.mps.openapi.model.SModel" resolve="get" />
                                  <node concept="2OqwBi" id="7IH442cXHPH" role="37wK5m">
                                    <node concept="1iwH7S" id="7IH442cXHPI" role="2Oq$k0" />
                                    <node concept="3cR$yn" id="7IH442cXHPJ" role="2OqNvi">
                                      <ref role="3cRzXn" node="227lWzxTzAl" resolve="langModule" />
                                    </node>
                                  </node>
                                </node>
                                <node concept="Rm8GO" id="3S8kul4RZlZ" role="2Oq$k0">
                                  <ref role="Rm8GQ" to="w1kc:~LanguageAspect.EDITOR" resolve="EDITOR" />
                                  <ref role="1Px2BO" to="w1kc:~LanguageAspect" resolve="LanguageAspect" />
                                </node>
                              </node>
                              <node concept="3uibUv" id="7IH442cXHPK" role="1tU5fm">
                                <ref role="3uigEE" to="mhbf:~SModel" resolve="SModel" />
                              </node>
                            </node>
                          </node>
                          <node concept="3clFbJ" id="7IH442cXHPL" role="3cqZAp">
                            <node concept="3clFbS" id="7IH442cXHPM" role="3clFbx">
                              <node concept="3cpWs6" id="7IH442cXHPN" role="3cqZAp">
                                <node concept="3clFbT" id="7IH442cXHPO" role="3cqZAk">
                                  <property role="3clFbU" value="false" />
                                </node>
                              </node>
                            </node>
                            <node concept="3clFbC" id="7IH442cXHPP" role="3clFbw">
                              <node concept="37vLTw" id="7IH442cXHPQ" role="3uHU7B">
                                <ref role="3cqZAo" node="7IH442cXHPD" resolve="aspectModel" />
                              </node>
                              <node concept="10Nm6u" id="7IH442cXHPR" role="3uHU7w" />
                            </node>
                          </node>
                          <node concept="3clFbJ" id="6vKfkTrtP8" role="3cqZAp">
                            <node concept="3clFbS" id="6vKfkTrtPa" role="3clFbx">
                              <node concept="3cpWs6" id="6vKfkTrur3" role="3cqZAp">
                                <node concept="3clFbT" id="6vKfkTruxj" role="3cqZAk">
                                  <property role="3clFbU" value="false" />
                                </node>
                              </node>
                            </node>
                            <node concept="3fqX7Q" id="CgolD_yX0R" role="3clFbw">
                              <node concept="2OqwBi" id="CgolD_yX0S" role="3fr31v">
                                <node concept="2OqwBi" id="CgolD_yX0T" role="2Oq$k0">
                                  <node concept="liA8E" id="CgolD_yX0U" role="2OqNvi">
                                    <ref role="37wK5l" to="wyt6:~Object.toString():java.lang.String" resolve="toString" />
                                  </node>
                                  <node concept="2OqwBi" id="CgolD_yX0V" role="2Oq$k0">
                                    <node concept="liA8E" id="CgolD_yX0W" role="2OqNvi">
                                      <ref role="37wK5l" to="mhbf:~SModelReference.getModelId():org.jetbrains.mps.openapi.model.SModelId" resolve="getModelId" />
                                    </node>
                                    <node concept="2OqwBi" id="6vKfkTrsVq" role="2Oq$k0">
                                      <node concept="37vLTw" id="6vKfkTrsK8" role="2Oq$k0">
                                        <ref role="3cqZAo" node="7IH442cXHPD" resolve="aspectModel" />
                                      </node>
                                      <node concept="liA8E" id="6vKfkTrtah" role="2OqNvi">
                                        <ref role="37wK5l" to="mhbf:~SModel.getReference():org.jetbrains.mps.openapi.model.SModelReference" resolve="getReference" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                                <node concept="liA8E" id="CgolD_yX0Y" role="2OqNvi">
                                  <ref role="37wK5l" to="wyt6:~String.equals(java.lang.Object):boolean" resolve="equals" />
                                  <node concept="2OqwBi" id="CgolD_yX0Z" role="37wK5m">
                                    <node concept="3TrcHB" id="CgolD_yX10" role="2OqNvi">
                                      <ref role="3TsBF5" to="hypd:5xDtKQA7vSH" resolve="uuid" />
                                    </node>
                                    <node concept="30H73N" id="6vKfkTrtrE" role="2Oq$k0" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                          <node concept="3clFbH" id="6vKfkTruOQ" role="3cqZAp" />
                          <node concept="3cpWs6" id="3S8kul4RZlW" role="3cqZAp">
                            <node concept="22lmx$" id="CgolD_zmRe" role="3cqZAk">
                              <node concept="2YIFZM" id="CgolD_znvL" role="3uHU7w">
                                <ref role="1Pybhc" to="zq1i:3Y_BMlivqcz" resolve="LanguageRuntimeGeneratorUtils" />
                                <ref role="37wK5l" to="zq1i:CgolD_uRQD" resolve="hasManualEditorAspectDescriptor" />
                                <node concept="1iwH7S" id="CgolD_zo9W" role="37wK5m" />
                                <node concept="37vLTw" id="7IH442cXIKN" role="37wK5m">
                                  <ref role="3cqZAo" node="7IH442cXHPD" resolve="aspectModel" />
                                </node>
                              </node>
                              <node concept="2YIFZM" id="3S8kul4RZlX" role="3uHU7B">
                                <ref role="1Pybhc" to="zq1i:3Y_BMlivqcz" resolve="LanguageRuntimeGeneratorUtils" />
                                <ref role="37wK5l" to="zq1i:1XXGcSTYFLY" resolve="isAspectOfLanguage" />
                                <node concept="37vLTw" id="7IH442cXI5L" role="37wK5m">
                                  <ref role="3cqZAo" node="7IH442cXHPD" resolve="aspectModel" />
                                </node>
                                <node concept="1iwH7S" id="3S8kul4RZm0" role="37wK5m" />
                                <node concept="35c_gC" id="52UGxk5qCDB" role="37wK5m">
                                  <ref role="35c_gD" to="tpc2:fA4kQeF" resolve="ConceptEditorDeclaration" />
                                </node>
                                <node concept="35c_gC" id="4GorVqgrFnJ" role="37wK5m">
                                  <ref role="35c_gD" to="tpc2:fGPKFH7" resolve="EditorComponentDeclaration" />
                                </node>
                                <node concept="35c_gC" id="52UGxk5qDGN" role="37wK5m">
                                  <ref role="35c_gD" to="tpc2:59ZEGVOSPtB" resolve="ConceptEditorContextHints" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="gft3U" id="3jayZ6ss0SF" role="UU_$l">
                        <node concept="3cpWs6" id="3jayZ6ss11u" role="gfFT$">
                          <node concept="1eOMI4" id="3jayZ6sskA0" role="3cqZAk">
                            <node concept="10QFUN" id="3jayZ6sskA1" role="1eOMHV">
                              <node concept="2ShNRf" id="3jayZ6ssk_Y" role="10QFUP">
                                <node concept="1pGfFk" id="3jayZ6ssk_Z" role="2ShVmc">
                                  <ref role="37wK5l" to="exr9:~EditorAspectDescriptorBase.&lt;init&gt;()" resolve="EditorAspectDescriptorBase" />
                                </node>
                              </node>
                              <node concept="16syzq" id="3jayZ6ssk_X" role="10QFUM">
                                <ref role="16sUi3" node="3XrE5vcna68" resolve="T" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="10QFUN" id="41NAEYRI0B4" role="3cqZAk">
                      <node concept="16syzq" id="41NAEYRI1xb" role="10QFUM">
                        <ref role="16sUi3" node="3XrE5vcna68" resolve="T" />
                      </node>
                      <node concept="1nCR9W" id="3XrE5vcr$US" role="10QFUP">
                        <property role="1nD$Q0" value="EditorAspectDescriptor" />
                        <node concept="3uibUv" id="6ymW8j2Vi_s" role="2lIhxL">
                          <ref role="3uigEE" to="iwf0:~EditorAspectDescriptor" resolve="EditorAspectDescriptor" />
                        </node>
                        <node concept="17Uvod" id="3XrE5vcrElb" role="lGtFl">
                          <property role="2qtEX9" value="fqClassName" />
                          <property role="P4ACc" value="df345b11-b8c7-4213-ac66-48d2a9b75d88/1173996401517/1173996588177" />
                          <node concept="3zFVjK" id="3XrE5vcrElc" role="3zH0cK">
                            <node concept="3clFbS" id="3XrE5vcrEld" role="2VODD2">
                              <node concept="3clFbF" id="3XrE5vcrH7N" role="3cqZAp">
                                <node concept="3cpWs3" id="3XrE5vcrH7O" role="3clFbG">
                                  <node concept="Xl_RD" id="3XrE5vcrH7P" role="3uHU7w">
                                    <property role="Xl_RC" value=".EditorAspectDescriptorImpl" />
                                  </node>
                                  <node concept="2OqwBi" id="3XrE5vcrH7Q" role="3uHU7B">
                                    <node concept="3TrcHB" id="3XrE5vcrH7R" role="2OqNvi">
                                      <ref role="3TsBF5" to="hypd:5xDtKQA7vSI" resolve="qualifiedName" />
                                    </node>
                                    <node concept="30H73N" id="3XrE5vcrH7S" role="2Oq$k0" />
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
                <node concept="raruj" id="3XrE5vcnh3o" role="lGtFl" />
              </node>
              <node concept="3cpWs6" id="3XrE5vcna65" role="3cqZAp">
                <node concept="10Nm6u" id="3XrE5vcna66" role="3cqZAk" />
              </node>
            </node>
            <node concept="3Tm1VV" id="3XrE5vcna67" role="1B3o_S" />
            <node concept="16euLQ" id="3XrE5vcna68" role="16eVyc">
              <property role="TrG5h" value="T" />
              <node concept="3uibUv" id="4r8JClTjSeJ" role="3ztrMU">
                <ref role="3uigEE" to="ze1i:~ILanguageAspect" resolve="ILanguageAspect" />
              </node>
            </node>
          </node>
          <node concept="3Tm1VV" id="3XrE5vcmTCU" role="1B3o_S" />
        </node>
      </node>
    </node>
    <node concept="3aamgX" id="4UrKinLipNH" role="3aUrZf">
      <ref role="30HIoZ" to="hypd:5xDtKQA7vSB" resolve="ModelReference" />
      <node concept="30G5F_" id="4UrKinLipNI" role="30HLyM">
        <node concept="3clFbS" id="4UrKinLipNJ" role="2VODD2">
          <node concept="3cpWs8" id="7IH442cXDhK" role="3cqZAp">
            <node concept="3cpWsn" id="7IH442cXDhL" role="3cpWs9">
              <property role="TrG5h" value="aspectModel" />
              <node concept="2OqwBi" id="7IH442cXDhM" role="33vP2m">
                <node concept="Rm8GO" id="7IH442cXDhN" role="2Oq$k0">
                  <ref role="Rm8GQ" to="w1kc:~LanguageAspect.ACTIONS" resolve="ACTIONS" />
                  <ref role="1Px2BO" to="w1kc:~LanguageAspect" resolve="LanguageAspect" />
                </node>
                <node concept="liA8E" id="7IH442cXDhO" role="2OqNvi">
                  <ref role="37wK5l" to="w1kc:~LanguageAspect.get(jetbrains.mps.smodel.Language):org.jetbrains.mps.openapi.model.SModel" resolve="get" />
                  <node concept="2OqwBi" id="7IH442cXDhP" role="37wK5m">
                    <node concept="1iwH7S" id="7IH442cXDhQ" role="2Oq$k0" />
                    <node concept="3cR$yn" id="7IH442cXDhR" role="2OqNvi">
                      <ref role="3cRzXn" node="227lWzxTzAl" resolve="langModule" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3uibUv" id="7IH442cXDhS" role="1tU5fm">
                <ref role="3uigEE" to="mhbf:~SModel" resolve="SModel" />
              </node>
            </node>
          </node>
          <node concept="3clFbJ" id="7IH442cXDhT" role="3cqZAp">
            <node concept="3clFbS" id="7IH442cXDhU" role="3clFbx">
              <node concept="3cpWs6" id="7IH442cXDhV" role="3cqZAp">
                <node concept="3clFbT" id="7IH442cXDhW" role="3cqZAk">
                  <property role="3clFbU" value="false" />
                </node>
              </node>
            </node>
            <node concept="3clFbC" id="7IH442cXDhX" role="3clFbw">
              <node concept="37vLTw" id="7IH442cXDhY" role="3uHU7B">
                <ref role="3cqZAo" node="7IH442cXDhL" resolve="aspectModel" />
              </node>
              <node concept="10Nm6u" id="7IH442cXDhZ" role="3uHU7w" />
            </node>
          </node>
          <node concept="3clFbJ" id="6vKfkTrvT2" role="3cqZAp">
            <node concept="3clFbS" id="6vKfkTrvT3" role="3clFbx">
              <node concept="3cpWs6" id="6vKfkTrvT4" role="3cqZAp">
                <node concept="3clFbT" id="6vKfkTrvT5" role="3cqZAk">
                  <property role="3clFbU" value="false" />
                </node>
              </node>
            </node>
            <node concept="3fqX7Q" id="6vKfkTrvT6" role="3clFbw">
              <node concept="2OqwBi" id="6vKfkTrvT7" role="3fr31v">
                <node concept="2OqwBi" id="6vKfkTrvT8" role="2Oq$k0">
                  <node concept="liA8E" id="6vKfkTrvT9" role="2OqNvi">
                    <ref role="37wK5l" to="wyt6:~Object.toString():java.lang.String" resolve="toString" />
                  </node>
                  <node concept="2OqwBi" id="6vKfkTrvTa" role="2Oq$k0">
                    <node concept="liA8E" id="6vKfkTrvTb" role="2OqNvi">
                      <ref role="37wK5l" to="mhbf:~SModelReference.getModelId():org.jetbrains.mps.openapi.model.SModelId" resolve="getModelId" />
                    </node>
                    <node concept="2OqwBi" id="6vKfkTrvTc" role="2Oq$k0">
                      <node concept="37vLTw" id="6vKfkTrvTd" role="2Oq$k0">
                        <ref role="3cqZAo" node="7IH442cXDhL" resolve="aspectModel" />
                      </node>
                      <node concept="liA8E" id="6vKfkTrvTe" role="2OqNvi">
                        <ref role="37wK5l" to="mhbf:~SModel.getReference():org.jetbrains.mps.openapi.model.SModelReference" resolve="getReference" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="6vKfkTrvTf" role="2OqNvi">
                  <ref role="37wK5l" to="wyt6:~String.equals(java.lang.Object):boolean" resolve="equals" />
                  <node concept="2OqwBi" id="6vKfkTrvTg" role="37wK5m">
                    <node concept="3TrcHB" id="6vKfkTrvTh" role="2OqNvi">
                      <ref role="3TsBF5" to="hypd:5xDtKQA7vSH" resolve="uuid" />
                    </node>
                    <node concept="30H73N" id="6vKfkTrvTi" role="2Oq$k0" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbH" id="6vKfkTrvK0" role="3cqZAp" />
          <node concept="3cpWs6" id="4UrKinLirNL" role="3cqZAp">
            <node concept="2YIFZM" id="4UrKinLirNQ" role="3cqZAk">
              <ref role="1Pybhc" to="zq1i:3Y_BMlivqcz" resolve="LanguageRuntimeGeneratorUtils" />
              <ref role="37wK5l" to="zq1i:1XXGcSTYFLY" resolve="isAspectOfLanguage" />
              <node concept="37vLTw" id="7IH442cXDHc" role="37wK5m">
                <ref role="3cqZAo" node="7IH442cXDhL" resolve="aspectModel" />
              </node>
              <node concept="1iwH7S" id="4UrKinLirNT" role="37wK5m" />
              <node concept="35c_gC" id="4UrKinLirNU" role="37wK5m">
                <ref role="35c_gD" to="tpdg:gR7WgqM" resolve="NodeFactories" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="1Koe21" id="4UrKinLipOa" role="1lVwrX">
        <node concept="312cEu" id="4UrKinLipOb" role="1Koe22">
          <property role="2bfB8j" value="true" />
          <property role="TrG5h" value="containerClass" />
          <node concept="3clFb_" id="4UrKinLipOc" role="jymVt">
            <property role="1EzhhJ" value="false" />
            <property role="TrG5h" value="createAspectDescriptor" />
            <property role="od$2w" value="false" />
            <property role="DiZV1" value="false" />
            <node concept="16syzq" id="4UrKinLipOd" role="3clF45">
              <ref role="16sUi3" node="4UrKinLipOD" resolve="T" />
            </node>
            <node concept="37vLTG" id="4UrKinLipOe" role="3clF46">
              <property role="TrG5h" value="aspectClass" />
              <node concept="3uibUv" id="4UrKinLipOf" role="1tU5fm">
                <ref role="3uigEE" to="wyt6:~Class" resolve="Class" />
                <node concept="16syzq" id="4UrKinLipOg" role="11_B2D">
                  <ref role="16sUi3" node="4UrKinLipOD" resolve="T" />
                </node>
              </node>
            </node>
            <node concept="3clFbS" id="4UrKinLipOh" role="3clF47">
              <node concept="3clFbJ" id="4UrKinLipOi" role="3cqZAp">
                <node concept="3clFbC" id="4UrKinLipOj" role="3clFbw">
                  <node concept="3VsKOn" id="4UrKinLipOk" role="3uHU7w">
                    <ref role="3VsUkX" to="9eus:~ActionAspectDescriptor" resolve="ActionAspectDescriptor" />
                  </node>
                  <node concept="37vLTw" id="4UrKinLipOl" role="3uHU7B">
                    <ref role="3cqZAo" node="4UrKinLipOe" resolve="aspectClass" />
                  </node>
                </node>
                <node concept="3clFbS" id="4UrKinLipOm" role="3clFbx">
                  <node concept="3cpWs6" id="4UrKinLipOn" role="3cqZAp">
                    <node concept="10QFUN" id="4UrKinLipOo" role="3cqZAk">
                      <node concept="16syzq" id="4UrKinLipOp" role="10QFUM">
                        <ref role="16sUi3" node="4UrKinLipOD" resolve="T" />
                      </node>
                      <node concept="1nCR9W" id="4UrKinLipOq" role="10QFUP">
                        <property role="1nD$Q0" value="ActionAspectDescriptor" />
                        <node concept="3uibUv" id="6ymW8j2VhX6" role="2lIhxL">
                          <ref role="3uigEE" to="9eus:~ActionAspectDescriptor" resolve="ActionAspectDescriptor" />
                        </node>
                        <node concept="17Uvod" id="4UrKinLipOs" role="lGtFl">
                          <property role="2qtEX9" value="fqClassName" />
                          <property role="P4ACc" value="df345b11-b8c7-4213-ac66-48d2a9b75d88/1173996401517/1173996588177" />
                          <node concept="3zFVjK" id="4UrKinLipOt" role="3zH0cK">
                            <node concept="3clFbS" id="4UrKinLipOu" role="2VODD2">
                              <node concept="3clFbF" id="4UrKinLipOv" role="3cqZAp">
                                <node concept="3cpWs3" id="4UrKinLipOw" role="3clFbG">
                                  <node concept="Xl_RD" id="4UrKinLipOx" role="3uHU7w">
                                    <property role="Xl_RC" value=".ActionAspectDescriptorImpl" />
                                  </node>
                                  <node concept="2OqwBi" id="4UrKinLipOy" role="3uHU7B">
                                    <node concept="3TrcHB" id="4UrKinLipOz" role="2OqNvi">
                                      <ref role="3TsBF5" to="hypd:5xDtKQA7vSI" resolve="qualifiedName" />
                                    </node>
                                    <node concept="30H73N" id="4UrKinLipO$" role="2Oq$k0" />
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
                <node concept="raruj" id="4UrKinLipO_" role="lGtFl" />
              </node>
              <node concept="3cpWs6" id="4UrKinLipOA" role="3cqZAp">
                <node concept="10Nm6u" id="4UrKinLipOB" role="3cqZAk" />
              </node>
            </node>
            <node concept="3Tm1VV" id="4UrKinLipOC" role="1B3o_S" />
            <node concept="16euLQ" id="4UrKinLipOD" role="16eVyc">
              <property role="TrG5h" value="T" />
              <node concept="3uibUv" id="4r8JClTjS5q" role="3ztrMU">
                <ref role="3uigEE" to="ze1i:~ILanguageAspect" resolve="ILanguageAspect" />
              </node>
            </node>
          </node>
          <node concept="3Tm1VV" id="4UrKinLipOF" role="1B3o_S" />
        </node>
      </node>
    </node>
    <node concept="3aamgX" id="1XXGcSTYzlK" role="3aUrZf">
      <ref role="30HIoZ" to="hypd:5xDtKQA7vSB" resolve="ModelReference" />
      <node concept="30G5F_" id="1XXGcSTYzlL" role="30HLyM">
        <node concept="3clFbS" id="1XXGcSTYzlM" role="2VODD2">
          <node concept="3cpWs8" id="12VdU1xFSXE" role="3cqZAp">
            <node concept="3cpWsn" id="12VdU1xFSXF" role="3cpWs9">
              <property role="TrG5h" value="aspectModel" />
              <node concept="2OqwBi" id="12VdU1xFSXG" role="33vP2m">
                <node concept="Rm8GO" id="12VdU1xFTdc" role="2Oq$k0">
                  <ref role="Rm8GQ" to="w1kc:~LanguageAspect.ACTIONS" resolve="ACTIONS" />
                  <ref role="1Px2BO" to="w1kc:~LanguageAspect" resolve="LanguageAspect" />
                </node>
                <node concept="liA8E" id="12VdU1xFSXI" role="2OqNvi">
                  <ref role="37wK5l" to="w1kc:~LanguageAspect.get(jetbrains.mps.smodel.Language):org.jetbrains.mps.openapi.model.SModel" resolve="get" />
                  <node concept="2OqwBi" id="12VdU1xFSXJ" role="37wK5m">
                    <node concept="1iwH7S" id="12VdU1xFSXK" role="2Oq$k0" />
                    <node concept="3cR$yn" id="12VdU1xFSXL" role="2OqNvi">
                      <ref role="3cRzXn" node="227lWzxTzAl" resolve="langModule" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3uibUv" id="12VdU1xFSXM" role="1tU5fm">
                <ref role="3uigEE" to="mhbf:~SModel" resolve="SModel" />
              </node>
            </node>
          </node>
          <node concept="3clFbJ" id="12VdU1xGGvD" role="3cqZAp">
            <node concept="3clFbS" id="12VdU1xGGvE" role="3clFbx">
              <node concept="3cpWs6" id="12VdU1xGGvF" role="3cqZAp">
                <node concept="3clFbT" id="12VdU1xGGvG" role="3cqZAk">
                  <property role="3clFbU" value="false" />
                </node>
              </node>
            </node>
            <node concept="3clFbC" id="12VdU1xGGvI" role="3clFbw">
              <node concept="37vLTw" id="12VdU1xGGvJ" role="3uHU7B">
                <ref role="3cqZAo" node="12VdU1xFSXF" resolve="aspectModel" />
              </node>
              <node concept="10Nm6u" id="12VdU1xGGvK" role="3uHU7w" />
            </node>
          </node>
          <node concept="3cpWs6" id="12VdU1xGGvT" role="3cqZAp">
            <node concept="2OqwBi" id="12VdU1xGGvU" role="3cqZAk">
              <node concept="2OqwBi" id="12VdU1xGGvV" role="2Oq$k0">
                <node concept="37vLTw" id="12VdU1xGGvW" role="2Oq$k0">
                  <ref role="3cqZAo" node="12VdU1xFSXF" resolve="aspectModel" />
                </node>
                <node concept="liA8E" id="12VdU1xGGvX" role="2OqNvi">
                  <ref role="37wK5l" to="mhbf:~SModel.getReference():org.jetbrains.mps.openapi.model.SModelReference" resolve="getReference" />
                </node>
              </node>
              <node concept="liA8E" id="12VdU1xGGvY" role="2OqNvi">
                <ref role="37wK5l" to="wyt6:~Object.equals(java.lang.Object):boolean" resolve="equals" />
                <node concept="2OqwBi" id="12VdU1xGGvZ" role="37wK5m">
                  <node concept="1iwH7S" id="12VdU1xGGw0" role="2Oq$k0" />
                  <node concept="3cR$yn" id="12VdU1xGGw1" role="2OqNvi">
                    <ref role="3cRzXn" node="227lWzxWwEv" resolve="modelRef" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="1Koe21" id="1XXGcSTYzlY" role="1lVwrX">
        <node concept="312cEu" id="1XXGcSTYzlZ" role="1Koe22">
          <property role="2bfB8j" value="true" />
          <property role="TrG5h" value="containerClass" />
          <node concept="3clFb_" id="1XXGcSTYzm0" role="jymVt">
            <property role="1EzhhJ" value="false" />
            <property role="TrG5h" value="createAspectDescriptor" />
            <property role="od$2w" value="false" />
            <property role="DiZV1" value="false" />
            <node concept="16syzq" id="1XXGcSTYzm1" role="3clF45">
              <ref role="16sUi3" node="1XXGcSTYzmt" resolve="T" />
            </node>
            <node concept="37vLTG" id="1XXGcSTYzm2" role="3clF46">
              <property role="TrG5h" value="aspectClass" />
              <node concept="3uibUv" id="1XXGcSTYzm3" role="1tU5fm">
                <ref role="3uigEE" to="wyt6:~Class" resolve="Class" />
                <node concept="16syzq" id="1XXGcSTYzm4" role="11_B2D">
                  <ref role="16sUi3" node="1XXGcSTYzmt" resolve="T" />
                </node>
              </node>
            </node>
            <node concept="3clFbS" id="1XXGcSTYzm5" role="3clF47">
              <node concept="3clFbJ" id="1XXGcSTYzm6" role="3cqZAp">
                <node concept="3clFbC" id="1XXGcSTYzm7" role="3clFbw">
                  <node concept="3VsKOn" id="1XXGcSTYzm8" role="3uHU7w">
                    <ref role="3VsUkX" to="9eus:~ActionAspectDescriptor" resolve="ActionAspectDescriptor" />
                  </node>
                  <node concept="37vLTw" id="1XXGcSTYzm9" role="3uHU7B">
                    <ref role="3cqZAo" node="1XXGcSTYzm2" resolve="aspectClass" />
                  </node>
                </node>
                <node concept="3clFbS" id="1XXGcSTYzma" role="3clFbx">
                  <node concept="3cpWs6" id="1XXGcSTYzmb" role="3cqZAp">
                    <node concept="10QFUN" id="1XXGcSTYzmc" role="3cqZAk">
                      <node concept="16syzq" id="1XXGcSTYzmd" role="10QFUM">
                        <ref role="16sUi3" node="1XXGcSTYzmt" resolve="T" />
                      </node>
                      <node concept="2ShNRf" id="4UrKinLivJN" role="10QFUP">
                        <node concept="1pGfFk" id="5Ha3bNHxstC" role="2ShVmc">
                          <ref role="37wK5l" to="w386:~BaseActionAspectDescriptor.&lt;init&gt;()" resolve="BaseActionAspectDescriptor" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="raruj" id="1XXGcSTYzmp" role="lGtFl" />
              </node>
              <node concept="3cpWs6" id="1XXGcSTYzmq" role="3cqZAp">
                <node concept="10Nm6u" id="1XXGcSTYzmr" role="3cqZAk" />
              </node>
            </node>
            <node concept="3Tm1VV" id="1XXGcSTYzms" role="1B3o_S" />
            <node concept="16euLQ" id="1XXGcSTYzmt" role="16eVyc">
              <property role="TrG5h" value="T" />
              <node concept="3uibUv" id="4r8JClTjS3U" role="3ztrMU">
                <ref role="3uigEE" to="ze1i:~ILanguageAspect" resolve="ILanguageAspect" />
              </node>
            </node>
          </node>
          <node concept="3Tm1VV" id="1XXGcSTYzmv" role="1B3o_S" />
        </node>
      </node>
    </node>
    <node concept="3aamgX" id="1_Iic4WUlrH" role="3aUrZf">
      <ref role="30HIoZ" to="hypd:5xDtKQA7vSB" resolve="ModelReference" />
      <node concept="30G5F_" id="1_Iic4WUlrI" role="30HLyM">
        <node concept="3clFbS" id="1_Iic4WUlrJ" role="2VODD2">
          <node concept="3cpWs8" id="7IH442cXGYg" role="3cqZAp">
            <node concept="3cpWsn" id="7IH442cXGYh" role="3cpWs9">
              <property role="TrG5h" value="aspectModel" />
              <node concept="2OqwBi" id="7IH442cXGYi" role="33vP2m">
                <node concept="liA8E" id="7IH442cXGYk" role="2OqNvi">
                  <ref role="37wK5l" to="w1kc:~LanguageAspect.get(jetbrains.mps.smodel.Language):org.jetbrains.mps.openapi.model.SModel" resolve="get" />
                  <node concept="2OqwBi" id="7IH442cXGYl" role="37wK5m">
                    <node concept="1iwH7S" id="7IH442cXGYm" role="2Oq$k0" />
                    <node concept="3cR$yn" id="7IH442cXGYn" role="2OqNvi">
                      <ref role="3cRzXn" node="227lWzxTzAl" resolve="langModule" />
                    </node>
                  </node>
                </node>
                <node concept="Rm8GO" id="7IH442cXH89" role="2Oq$k0">
                  <ref role="Rm8GQ" to="w1kc:~LanguageAspect.DATA_FLOW" resolve="DATA_FLOW" />
                  <ref role="1Px2BO" to="w1kc:~LanguageAspect" resolve="LanguageAspect" />
                </node>
              </node>
              <node concept="3uibUv" id="7IH442cXGYo" role="1tU5fm">
                <ref role="3uigEE" to="mhbf:~SModel" resolve="SModel" />
              </node>
            </node>
          </node>
          <node concept="3clFbJ" id="7IH442cXGYp" role="3cqZAp">
            <node concept="3clFbS" id="7IH442cXGYq" role="3clFbx">
              <node concept="3cpWs6" id="7IH442cXGYr" role="3cqZAp">
                <node concept="3clFbT" id="7IH442cXGYs" role="3cqZAk">
                  <property role="3clFbU" value="false" />
                </node>
              </node>
            </node>
            <node concept="3clFbC" id="7IH442cXGYt" role="3clFbw">
              <node concept="37vLTw" id="7IH442cXGYu" role="3uHU7B">
                <ref role="3cqZAo" node="7IH442cXGYh" resolve="aspectModel" />
              </node>
              <node concept="10Nm6u" id="7IH442cXGYv" role="3uHU7w" />
            </node>
          </node>
          <node concept="3clFbJ" id="6vKfkTrwwI" role="3cqZAp">
            <node concept="3clFbS" id="6vKfkTrwwJ" role="3clFbx">
              <node concept="3cpWs6" id="6vKfkTrwwK" role="3cqZAp">
                <node concept="3clFbT" id="6vKfkTrwwL" role="3cqZAk">
                  <property role="3clFbU" value="false" />
                </node>
              </node>
            </node>
            <node concept="3fqX7Q" id="6vKfkTrwwM" role="3clFbw">
              <node concept="2OqwBi" id="6vKfkTrwwN" role="3fr31v">
                <node concept="2OqwBi" id="6vKfkTrwwO" role="2Oq$k0">
                  <node concept="liA8E" id="6vKfkTrwwP" role="2OqNvi">
                    <ref role="37wK5l" to="wyt6:~Object.toString():java.lang.String" resolve="toString" />
                  </node>
                  <node concept="2OqwBi" id="6vKfkTrwwQ" role="2Oq$k0">
                    <node concept="liA8E" id="6vKfkTrwwR" role="2OqNvi">
                      <ref role="37wK5l" to="mhbf:~SModelReference.getModelId():org.jetbrains.mps.openapi.model.SModelId" resolve="getModelId" />
                    </node>
                    <node concept="2OqwBi" id="6vKfkTrwwS" role="2Oq$k0">
                      <node concept="37vLTw" id="6vKfkTrwwT" role="2Oq$k0">
                        <ref role="3cqZAo" node="7IH442cXGYh" resolve="aspectModel" />
                      </node>
                      <node concept="liA8E" id="6vKfkTrwwU" role="2OqNvi">
                        <ref role="37wK5l" to="mhbf:~SModel.getReference():org.jetbrains.mps.openapi.model.SModelReference" resolve="getReference" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="6vKfkTrwwV" role="2OqNvi">
                  <ref role="37wK5l" to="wyt6:~String.equals(java.lang.Object):boolean" resolve="equals" />
                  <node concept="2OqwBi" id="6vKfkTrwwW" role="37wK5m">
                    <node concept="3TrcHB" id="6vKfkTrwwX" role="2OqNvi">
                      <ref role="3TsBF5" to="hypd:5xDtKQA7vSH" resolve="uuid" />
                    </node>
                    <node concept="30H73N" id="6vKfkTrwwY" role="2Oq$k0" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbH" id="6vKfkTrwq9" role="3cqZAp" />
          <node concept="3cpWs6" id="1_Iic4WUlrK" role="3cqZAp">
            <node concept="2YIFZM" id="1_Iic4WUlrL" role="3cqZAk">
              <ref role="37wK5l" to="zq1i:1XXGcSTYFLY" resolve="isAspectOfLanguage" />
              <ref role="1Pybhc" to="zq1i:3Y_BMlivqcz" resolve="LanguageRuntimeGeneratorUtils" />
              <node concept="37vLTw" id="7IH442cXHsX" role="37wK5m">
                <ref role="3cqZAo" node="7IH442cXGYh" resolve="aspectModel" />
              </node>
              <node concept="1iwH7S" id="1_Iic4WUlrO" role="37wK5m" />
              <node concept="35c_gC" id="75fuNknez0j" role="37wK5m">
                <ref role="35c_gD" to="tp41:hz_zdoP" resolve="DataFlowBuilderDeclaration" />
              </node>
              <node concept="35c_gC" id="1_Iic4WUlrP" role="37wK5m">
                <ref role="35c_gD" to="bj1v:nUEAIXlVr8" resolve="Rule" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="1Koe21" id="1_Iic4WUlrQ" role="1lVwrX">
        <node concept="312cEu" id="1_Iic4WUlrR" role="1Koe22">
          <property role="2bfB8j" value="true" />
          <property role="TrG5h" value="containerClass" />
          <node concept="3clFb_" id="1_Iic4WUlrS" role="jymVt">
            <property role="1EzhhJ" value="false" />
            <property role="TrG5h" value="createAspectDescriptor" />
            <property role="od$2w" value="false" />
            <property role="DiZV1" value="false" />
            <node concept="16syzq" id="1_Iic4WUlrT" role="3clF45">
              <ref role="16sUi3" node="1_Iic4WUlsl" resolve="T" />
            </node>
            <node concept="37vLTG" id="1_Iic4WUlrU" role="3clF46">
              <property role="TrG5h" value="aspectClass" />
              <node concept="3uibUv" id="1_Iic4WUlrV" role="1tU5fm">
                <ref role="3uigEE" to="wyt6:~Class" resolve="Class" />
                <node concept="16syzq" id="1_Iic4WUlrW" role="11_B2D">
                  <ref role="16sUi3" node="1_Iic4WUlsl" resolve="T" />
                </node>
              </node>
            </node>
            <node concept="3clFbS" id="1_Iic4WUlrX" role="3clF47">
              <node concept="3clFbJ" id="1_Iic4WUlrY" role="3cqZAp">
                <node concept="3clFbC" id="1_Iic4WUlrZ" role="3clFbw">
                  <node concept="3VsKOn" id="1_Iic4WUls0" role="3uHU7w">
                    <ref role="3VsUkX" to="1fjm:~DataFlowAspectDescriptor" resolve="DataFlowAspectDescriptor" />
                  </node>
                  <node concept="37vLTw" id="1_Iic4WUls1" role="3uHU7B">
                    <ref role="3cqZAo" node="1_Iic4WUlrU" resolve="aspectClass" />
                  </node>
                </node>
                <node concept="3clFbS" id="1_Iic4WUls2" role="3clFbx">
                  <node concept="3cpWs6" id="1_Iic4WUls3" role="3cqZAp">
                    <node concept="10QFUN" id="1_Iic4WUls4" role="3cqZAk">
                      <node concept="16syzq" id="1_Iic4WUls5" role="10QFUM">
                        <ref role="16sUi3" node="1_Iic4WUlsl" resolve="T" />
                      </node>
                      <node concept="1nCR9W" id="1_Iic4WUls6" role="10QFUP">
                        <property role="1nD$Q0" value="DataFlowAspectDescriptor" />
                        <node concept="3uibUv" id="1_Iic4WUqpa" role="2lIhxL">
                          <ref role="3uigEE" to="1fjm:~DataFlowAspectDescriptor" resolve="DataFlowAspectDescriptor" />
                        </node>
                        <node concept="17Uvod" id="1_Iic4WUls8" role="lGtFl">
                          <property role="2qtEX9" value="fqClassName" />
                          <property role="P4ACc" value="df345b11-b8c7-4213-ac66-48d2a9b75d88/1173996401517/1173996588177" />
                          <node concept="3zFVjK" id="1_Iic4WUls9" role="3zH0cK">
                            <node concept="3clFbS" id="1_Iic4WUlsa" role="2VODD2">
                              <node concept="3clFbF" id="1_Iic4WUlsb" role="3cqZAp">
                                <node concept="3cpWs3" id="1_Iic4WUlsc" role="3clFbG">
                                  <node concept="Xl_RD" id="1_Iic4WUlsd" role="3uHU7w">
                                    <property role="Xl_RC" value=".DataFlowAspectDescriptorImpl" />
                                  </node>
                                  <node concept="2OqwBi" id="1_Iic4WUlse" role="3uHU7B">
                                    <node concept="3TrcHB" id="1_Iic4WUlsf" role="2OqNvi">
                                      <ref role="3TsBF5" to="hypd:5xDtKQA7vSI" resolve="qualifiedName" />
                                    </node>
                                    <node concept="30H73N" id="1_Iic4WUlsg" role="2Oq$k0" />
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
                <node concept="raruj" id="1_Iic4WUlsh" role="lGtFl" />
              </node>
              <node concept="3cpWs6" id="1_Iic4WUlsi" role="3cqZAp">
                <node concept="10Nm6u" id="1_Iic4WUlsj" role="3cqZAk" />
              </node>
            </node>
            <node concept="3Tm1VV" id="1_Iic4WUlsk" role="1B3o_S" />
            <node concept="16euLQ" id="1_Iic4WUlsl" role="16eVyc">
              <property role="TrG5h" value="T" />
              <node concept="3uibUv" id="4r8JClTjRUB" role="3ztrMU">
                <ref role="3uigEE" to="ze1i:~ILanguageAspect" resolve="ILanguageAspect" />
              </node>
            </node>
          </node>
          <node concept="3Tm1VV" id="1_Iic4WUlsn" role="1B3o_S" />
        </node>
      </node>
    </node>
    <node concept="3aamgX" id="1_Iic4WUlso" role="3aUrZf">
      <ref role="30HIoZ" to="hypd:5xDtKQA7vSB" resolve="ModelReference" />
      <node concept="30G5F_" id="1_Iic4WUlsp" role="30HLyM">
        <node concept="3clFbS" id="1_Iic4WUlsq" role="2VODD2">
          <node concept="3cpWs8" id="1_Iic4WUlsr" role="3cqZAp">
            <node concept="3cpWsn" id="1_Iic4WUlss" role="3cpWs9">
              <property role="TrG5h" value="aspectModel" />
              <node concept="2OqwBi" id="1_Iic4WUlst" role="33vP2m">
                <node concept="Rm8GO" id="1_Iic4WUscP" role="2Oq$k0">
                  <ref role="1Px2BO" to="w1kc:~LanguageAspect" resolve="LanguageAspect" />
                  <ref role="Rm8GQ" to="w1kc:~LanguageAspect.DATA_FLOW" resolve="DATA_FLOW" />
                </node>
                <node concept="liA8E" id="1_Iic4WUlsv" role="2OqNvi">
                  <ref role="37wK5l" to="w1kc:~LanguageAspect.get(jetbrains.mps.smodel.Language):org.jetbrains.mps.openapi.model.SModel" resolve="get" />
                  <node concept="2OqwBi" id="1_Iic4WUlsw" role="37wK5m">
                    <node concept="1iwH7S" id="1_Iic4WUlsx" role="2Oq$k0" />
                    <node concept="3cR$yn" id="1_Iic4WUlsy" role="2OqNvi">
                      <ref role="3cRzXn" node="227lWzxTzAl" resolve="langModule" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3uibUv" id="1_Iic4WUlsz" role="1tU5fm">
                <ref role="3uigEE" to="mhbf:~SModel" resolve="SModel" />
              </node>
            </node>
          </node>
          <node concept="3clFbJ" id="1_Iic4WUls$" role="3cqZAp">
            <node concept="3clFbS" id="1_Iic4WUls_" role="3clFbx">
              <node concept="3cpWs6" id="1_Iic4WUlsA" role="3cqZAp">
                <node concept="3clFbT" id="1_Iic4WUlsB" role="3cqZAk">
                  <property role="3clFbU" value="false" />
                </node>
              </node>
            </node>
            <node concept="3clFbC" id="1_Iic4WUlsC" role="3clFbw">
              <node concept="37vLTw" id="1_Iic4WUlsD" role="3uHU7B">
                <ref role="3cqZAo" node="1_Iic4WUlss" resolve="aspectModel" />
              </node>
              <node concept="10Nm6u" id="1_Iic4WUlsE" role="3uHU7w" />
            </node>
          </node>
          <node concept="3cpWs6" id="1_Iic4WUlsF" role="3cqZAp">
            <node concept="2OqwBi" id="1_Iic4WUlsG" role="3cqZAk">
              <node concept="2OqwBi" id="1_Iic4WUlsH" role="2Oq$k0">
                <node concept="37vLTw" id="1_Iic4WUlsI" role="2Oq$k0">
                  <ref role="3cqZAo" node="1_Iic4WUlss" resolve="aspectModel" />
                </node>
                <node concept="liA8E" id="1_Iic4WUlsJ" role="2OqNvi">
                  <ref role="37wK5l" to="mhbf:~SModel.getReference():org.jetbrains.mps.openapi.model.SModelReference" resolve="getReference" />
                </node>
              </node>
              <node concept="liA8E" id="1_Iic4WUlsK" role="2OqNvi">
                <ref role="37wK5l" to="wyt6:~Object.equals(java.lang.Object):boolean" resolve="equals" />
                <node concept="2OqwBi" id="1_Iic4WUlsL" role="37wK5m">
                  <node concept="1iwH7S" id="1_Iic4WUlsM" role="2Oq$k0" />
                  <node concept="3cR$yn" id="1_Iic4WUlsN" role="2OqNvi">
                    <ref role="3cRzXn" node="227lWzxWwEv" resolve="modelRef" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="1Koe21" id="1_Iic4WUlsP" role="1lVwrX">
        <node concept="312cEu" id="1_Iic4WUlsQ" role="1Koe22">
          <property role="2bfB8j" value="true" />
          <property role="TrG5h" value="containerClass" />
          <node concept="3clFb_" id="1_Iic4WUlsR" role="jymVt">
            <property role="1EzhhJ" value="false" />
            <property role="TrG5h" value="createAspectDescriptor" />
            <property role="od$2w" value="false" />
            <property role="DiZV1" value="false" />
            <node concept="16syzq" id="1_Iic4WUlsS" role="3clF45">
              <ref role="16sUi3" node="1_Iic4WUltd" resolve="T" />
            </node>
            <node concept="37vLTG" id="1_Iic4WUlsT" role="3clF46">
              <property role="TrG5h" value="aspectClass" />
              <node concept="3uibUv" id="1_Iic4WUlsU" role="1tU5fm">
                <ref role="3uigEE" to="wyt6:~Class" resolve="Class" />
                <node concept="16syzq" id="1_Iic4WUlsV" role="11_B2D">
                  <ref role="16sUi3" node="1_Iic4WUltd" resolve="T" />
                </node>
              </node>
            </node>
            <node concept="3clFbS" id="1_Iic4WUlsW" role="3clF47">
              <node concept="3clFbJ" id="1_Iic4WUlsX" role="3cqZAp">
                <node concept="3clFbC" id="1_Iic4WUlsY" role="3clFbw">
                  <node concept="3VsKOn" id="1_Iic4WUlsZ" role="3uHU7w">
                    <ref role="3VsUkX" to="1fjm:~DataFlowAspectDescriptor" resolve="DataFlowAspectDescriptor" />
                  </node>
                  <node concept="37vLTw" id="1_Iic4WUlt0" role="3uHU7B">
                    <ref role="3cqZAo" node="1_Iic4WUlsT" resolve="aspectClass" />
                  </node>
                </node>
                <node concept="3clFbS" id="1_Iic4WUlt1" role="3clFbx">
                  <node concept="3cpWs6" id="1_Iic4WUlt2" role="3cqZAp">
                    <node concept="10QFUN" id="1_Iic4WUlt3" role="3cqZAk">
                      <node concept="16syzq" id="1_Iic4WUlt4" role="10QFUM">
                        <ref role="16sUi3" node="1_Iic4WUltd" resolve="T" />
                      </node>
                      <node concept="2ShNRf" id="1_Iic4WUlt5" role="10QFUP">
                        <node concept="1pGfFk" id="5MCOPSq4M2g" role="2ShVmc">
                          <ref role="37wK5l" to="1fjm:~DataFlowAspectDescriptorBase.&lt;init&gt;()" resolve="DataFlowAspectDescriptorBase" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="raruj" id="1_Iic4WUlt9" role="lGtFl" />
              </node>
              <node concept="3cpWs6" id="1_Iic4WUlta" role="3cqZAp">
                <node concept="10Nm6u" id="1_Iic4WUltb" role="3cqZAk" />
              </node>
            </node>
            <node concept="3Tm1VV" id="1_Iic4WUltc" role="1B3o_S" />
            <node concept="16euLQ" id="1_Iic4WUltd" role="16eVyc">
              <property role="TrG5h" value="T" />
              <node concept="3uibUv" id="4r8JClTjRT9" role="3ztrMU">
                <ref role="3uigEE" to="ze1i:~ILanguageAspect" resolve="ILanguageAspect" />
              </node>
            </node>
          </node>
          <node concept="3Tm1VV" id="1_Iic4WUltf" role="1B3o_S" />
        </node>
      </node>
    </node>
    <node concept="3aamgX" id="227lWzxTEC5" role="3aUrZf">
      <ref role="30HIoZ" to="hypd:5xDtKQA7vSB" resolve="ModelReference" />
      <node concept="30G5F_" id="227lWzxTFib" role="30HLyM">
        <node concept="3clFbS" id="227lWzxTFic" role="2VODD2">
          <node concept="3cpWs8" id="227lWzxTIBy" role="3cqZAp">
            <node concept="3cpWsn" id="227lWzxTIBz" role="3cpWs9">
              <property role="TrG5h" value="aspectModel" />
              <node concept="2OqwBi" id="227lWzxTIB$" role="33vP2m">
                <node concept="Rm8GO" id="227lWzxTIB_" role="2Oq$k0">
                  <ref role="Rm8GQ" to="w1kc:~LanguageAspect.STRUCTURE" resolve="STRUCTURE" />
                  <ref role="1Px2BO" to="w1kc:~LanguageAspect" resolve="LanguageAspect" />
                </node>
                <node concept="liA8E" id="227lWzxTIBA" role="2OqNvi">
                  <ref role="37wK5l" to="w1kc:~LanguageAspect.get(jetbrains.mps.smodel.Language):org.jetbrains.mps.openapi.model.SModel" resolve="get" />
                  <node concept="2OqwBi" id="227lWzxTIBB" role="37wK5m">
                    <node concept="1iwH7S" id="227lWzxTIBC" role="2Oq$k0" />
                    <node concept="3cR$yn" id="227lWzxTIBD" role="2OqNvi">
                      <ref role="3cRzXn" node="227lWzxTzAl" resolve="langModule" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3uibUv" id="227lWzxTP5q" role="1tU5fm">
                <ref role="3uigEE" to="mhbf:~SModel" resolve="SModel" />
              </node>
            </node>
          </node>
          <node concept="3clFbJ" id="227lWzxVIXW" role="3cqZAp">
            <node concept="3clFbS" id="227lWzxVIXX" role="3clFbx">
              <node concept="3cpWs6" id="227lWzxVIXY" role="3cqZAp">
                <node concept="3clFbT" id="227lWzxVIXZ" role="3cqZAk">
                  <property role="3clFbU" value="false" />
                </node>
              </node>
            </node>
            <node concept="22lmx$" id="227lWzxVIY0" role="3clFbw">
              <node concept="3clFbC" id="227lWzxVIY1" role="3uHU7B">
                <node concept="37vLTw" id="227lWzxVIY2" role="3uHU7B">
                  <ref role="3cqZAo" node="227lWzxTIBz" resolve="aspectModel" />
                </node>
                <node concept="10Nm6u" id="227lWzxVIY3" role="3uHU7w" />
              </node>
              <node concept="3fqX7Q" id="227lWzxVIY4" role="3uHU7w">
                <node concept="2OqwBi" id="227lWzxVIY5" role="3fr31v">
                  <node concept="2OqwBi" id="227lWzxVIY6" role="2Oq$k0">
                    <node concept="2OqwBi" id="227lWzxVIY7" role="2Oq$k0">
                      <node concept="37vLTw" id="227lWzxVIY8" role="2Oq$k0">
                        <ref role="3cqZAo" node="227lWzxTIBz" resolve="aspectModel" />
                      </node>
                      <node concept="liA8E" id="227lWzxVIY9" role="2OqNvi">
                        <ref role="37wK5l" to="mhbf:~SModel.getRootNodes():java.lang.Iterable" resolve="getRootNodes" />
                      </node>
                    </node>
                    <node concept="liA8E" id="227lWzxVIYa" role="2OqNvi">
                      <ref role="37wK5l" to="wyt6:~Iterable.iterator():java.util.Iterator" resolve="iterator" />
                    </node>
                  </node>
                  <node concept="liA8E" id="227lWzxVIYb" role="2OqNvi">
                    <ref role="37wK5l" to="33ny:~Iterator.hasNext():boolean" resolve="hasNext" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3cpWs6" id="227lWzxTK9a" role="3cqZAp">
            <node concept="2OqwBi" id="227lWzxTPDO" role="3cqZAk">
              <node concept="2OqwBi" id="227lWzxTLgg" role="2Oq$k0">
                <node concept="37vLTw" id="227lWzxTL8o" role="2Oq$k0">
                  <ref role="3cqZAo" node="227lWzxTIBz" resolve="aspectModel" />
                </node>
                <node concept="liA8E" id="227lWzxTPsp" role="2OqNvi">
                  <ref role="37wK5l" to="mhbf:~SModel.getReference():org.jetbrains.mps.openapi.model.SModelReference" resolve="getReference" />
                </node>
              </node>
              <node concept="liA8E" id="227lWzxTPY_" role="2OqNvi">
                <ref role="37wK5l" to="wyt6:~Object.equals(java.lang.Object):boolean" resolve="equals" />
                <node concept="2OqwBi" id="227lWzxWAPW" role="37wK5m">
                  <node concept="1iwH7S" id="227lWzxWAo5" role="2Oq$k0" />
                  <node concept="3cR$yn" id="227lWzxWBmN" role="2OqNvi">
                    <ref role="3cRzXn" node="227lWzxWwEv" resolve="modelRef" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="1Koe21" id="227lWzxU2xn" role="1lVwrX">
        <node concept="3clFb_" id="227lWzxU2YH" role="1Koe22">
          <property role="1EzhhJ" value="false" />
          <property role="TrG5h" value="createAspectDescriptor" />
          <property role="od$2w" value="false" />
          <property role="DiZV1" value="false" />
          <node concept="16syzq" id="227lWzxU2YI" role="3clF45">
            <ref role="16sUi3" node="227lWzxU2ZF" resolve="T" />
          </node>
          <node concept="37vLTG" id="227lWzxU2YJ" role="3clF46">
            <property role="TrG5h" value="aspectClass" />
            <node concept="3uibUv" id="227lWzxU2YK" role="1tU5fm">
              <ref role="3uigEE" to="wyt6:~Class" resolve="Class" />
              <node concept="16syzq" id="227lWzxU2YL" role="11_B2D">
                <ref role="16sUi3" node="227lWzxU2ZF" resolve="T" />
              </node>
            </node>
          </node>
          <node concept="3clFbS" id="227lWzxU2YM" role="3clF47">
            <node concept="3clFbJ" id="227lWzxU2YN" role="3cqZAp">
              <node concept="3clFbC" id="227lWzxU2YO" role="3clFbw">
                <node concept="3VsKOn" id="227lWzxU3L1" role="3uHU7w">
                  <ref role="3VsUkX" to="ze1i:~StructureAspectDescriptor" resolve="StructureAspectDescriptor" />
                </node>
                <node concept="37vLTw" id="227lWzxU2YQ" role="3uHU7B">
                  <ref role="3cqZAo" node="227lWzxU2YJ" resolve="aspectClass" />
                </node>
              </node>
              <node concept="3clFbS" id="227lWzxU2YR" role="3clFbx">
                <node concept="3cpWs6" id="227lWzxU2Zr" role="3cqZAp">
                  <node concept="10QFUN" id="227lWzxVNYm" role="3cqZAk">
                    <node concept="16syzq" id="227lWzxVNYn" role="10QFUM">
                      <ref role="16sUi3" node="227lWzxU2ZF" resolve="T" />
                    </node>
                    <node concept="1nCR9W" id="227lWzxVQTE" role="10QFUP">
                      <property role="1nD$Q0" value="structure.StructureAspectDescriptor" />
                      <node concept="3uibUv" id="6ymW8j2VhhK" role="2lIhxL">
                        <ref role="3uigEE" to="ze1i:~StructureAspectDescriptor" resolve="StructureAspectDescriptor" />
                      </node>
                      <node concept="17Uvod" id="227lWzxVQTG" role="lGtFl">
                        <property role="2qtEX9" value="fqClassName" />
                        <property role="P4ACc" value="df345b11-b8c7-4213-ac66-48d2a9b75d88/1173996401517/1173996588177" />
                        <node concept="3zFVjK" id="227lWzxVQTH" role="3zH0cK">
                          <node concept="3clFbS" id="227lWzxVQTI" role="2VODD2">
                            <node concept="3clFbF" id="227lWzxVQTJ" role="3cqZAp">
                              <node concept="3cpWs3" id="227lWzxVQTK" role="3clFbG">
                                <node concept="Xl_RD" id="227lWzxVQTL" role="3uHU7w">
                                  <property role="Xl_RC" value=".StructureAspectDescriptor" />
                                </node>
                                <node concept="2OqwBi" id="227lWzxVQTN" role="3uHU7B">
                                  <node concept="30H73N" id="227lWzxVQTO" role="2Oq$k0" />
                                  <node concept="3TrcHB" id="227lWzxWmUJ" role="2OqNvi">
                                    <ref role="3TsBF5" to="hypd:5xDtKQA7vSI" resolve="qualifiedName" />
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
              <node concept="raruj" id="227lWzxU2ZB" role="lGtFl" />
            </node>
            <node concept="3cpWs6" id="227lWzxU2ZC" role="3cqZAp">
              <node concept="10Nm6u" id="227lWzxU2ZD" role="3cqZAk" />
            </node>
          </node>
          <node concept="3Tm1VV" id="227lWzxU2ZE" role="1B3o_S" />
          <node concept="16euLQ" id="227lWzxU2ZF" role="16eVyc">
            <property role="TrG5h" value="T" />
            <node concept="3uibUv" id="4r8JClTjRJW" role="3ztrMU">
              <ref role="3uigEE" to="ze1i:~ILanguageAspect" resolve="ILanguageAspect" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3aamgX" id="227lWzxU6eO" role="3aUrZf">
      <ref role="30HIoZ" to="hypd:5xDtKQA7vSB" resolve="ModelReference" />
      <node concept="30G5F_" id="227lWzxU6X0" role="30HLyM">
        <node concept="3clFbS" id="227lWzxU6X1" role="2VODD2">
          <node concept="3cpWs8" id="227lWzxU78Y" role="3cqZAp">
            <node concept="3cpWsn" id="227lWzxU78Z" role="3cpWs9">
              <property role="TrG5h" value="aspectModel" />
              <node concept="2OqwBi" id="227lWzxU790" role="33vP2m">
                <node concept="Rm8GO" id="227lWzxU7sC" role="2Oq$k0">
                  <ref role="Rm8GQ" to="w1kc:~LanguageAspect.BEHAVIOR" resolve="BEHAVIOR" />
                  <ref role="1Px2BO" to="w1kc:~LanguageAspect" resolve="LanguageAspect" />
                </node>
                <node concept="liA8E" id="227lWzxU792" role="2OqNvi">
                  <ref role="37wK5l" to="w1kc:~LanguageAspect.get(jetbrains.mps.smodel.Language):org.jetbrains.mps.openapi.model.SModel" resolve="get" />
                  <node concept="2OqwBi" id="227lWzxU793" role="37wK5m">
                    <node concept="1iwH7S" id="227lWzxU794" role="2Oq$k0" />
                    <node concept="3cR$yn" id="227lWzxU795" role="2OqNvi">
                      <ref role="3cRzXn" node="227lWzxTzAl" resolve="langModule" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3uibUv" id="227lWzxU796" role="1tU5fm">
                <ref role="3uigEE" to="mhbf:~SModel" resolve="SModel" />
              </node>
            </node>
          </node>
          <node concept="3clFbJ" id="227lWzxVHbI" role="3cqZAp">
            <node concept="3clFbS" id="227lWzxVHbJ" role="3clFbx">
              <node concept="3cpWs6" id="227lWzxVHbK" role="3cqZAp">
                <node concept="3clFbT" id="227lWzxVHbL" role="3cqZAk">
                  <property role="3clFbU" value="false" />
                </node>
              </node>
            </node>
            <node concept="22lmx$" id="227lWzxVHbM" role="3clFbw">
              <node concept="3clFbC" id="227lWzxVHbN" role="3uHU7B">
                <node concept="37vLTw" id="227lWzxVHbO" role="3uHU7B">
                  <ref role="3cqZAo" node="227lWzxU78Z" resolve="aspectModel" />
                </node>
                <node concept="10Nm6u" id="227lWzxVHbP" role="3uHU7w" />
              </node>
              <node concept="3fqX7Q" id="227lWzxVHbQ" role="3uHU7w">
                <node concept="2OqwBi" id="227lWzxVHbR" role="3fr31v">
                  <node concept="2OqwBi" id="227lWzxVHbS" role="2Oq$k0">
                    <node concept="2OqwBi" id="227lWzxVHbT" role="2Oq$k0">
                      <node concept="37vLTw" id="227lWzxVHbU" role="2Oq$k0">
                        <ref role="3cqZAo" node="227lWzxU78Z" resolve="aspectModel" />
                      </node>
                      <node concept="liA8E" id="227lWzxVHbV" role="2OqNvi">
                        <ref role="37wK5l" to="mhbf:~SModel.getRootNodes():java.lang.Iterable" resolve="getRootNodes" />
                      </node>
                    </node>
                    <node concept="liA8E" id="227lWzxVHbW" role="2OqNvi">
                      <ref role="37wK5l" to="wyt6:~Iterable.iterator():java.util.Iterator" resolve="iterator" />
                    </node>
                  </node>
                  <node concept="liA8E" id="227lWzxVHbX" role="2OqNvi">
                    <ref role="37wK5l" to="33ny:~Iterator.hasNext():boolean" resolve="hasNext" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3cpWs6" id="227lWzxU797" role="3cqZAp">
            <node concept="2OqwBi" id="227lWzxU799" role="3cqZAk">
              <node concept="2OqwBi" id="227lWzxU79a" role="2Oq$k0">
                <node concept="37vLTw" id="227lWzxU79b" role="2Oq$k0">
                  <ref role="3cqZAo" node="227lWzxU78Z" resolve="aspectModel" />
                </node>
                <node concept="liA8E" id="227lWzxU79c" role="2OqNvi">
                  <ref role="37wK5l" to="mhbf:~SModel.getReference():org.jetbrains.mps.openapi.model.SModelReference" resolve="getReference" />
                </node>
              </node>
              <node concept="liA8E" id="227lWzxU79d" role="2OqNvi">
                <ref role="37wK5l" to="wyt6:~Object.equals(java.lang.Object):boolean" resolve="equals" />
                <node concept="2OqwBi" id="227lWzxWP7W" role="37wK5m">
                  <node concept="1iwH7S" id="227lWzxWP7X" role="2Oq$k0" />
                  <node concept="3cR$yn" id="227lWzxWP7Y" role="2OqNvi">
                    <ref role="3cRzXn" node="227lWzxWwEv" resolve="modelRef" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="1Koe21" id="227lWzxVSo3" role="1lVwrX">
        <node concept="3clFb_" id="227lWzxVSo4" role="1Koe22">
          <property role="1EzhhJ" value="false" />
          <property role="TrG5h" value="createAspectDescriptor" />
          <property role="od$2w" value="false" />
          <property role="DiZV1" value="false" />
          <node concept="16syzq" id="227lWzxVSo5" role="3clF45">
            <ref role="16sUi3" node="227lWzxVSoz" resolve="T" />
          </node>
          <node concept="37vLTG" id="227lWzxVSo6" role="3clF46">
            <property role="TrG5h" value="aspectClass" />
            <node concept="3uibUv" id="227lWzxVSo7" role="1tU5fm">
              <ref role="3uigEE" to="wyt6:~Class" resolve="Class" />
              <node concept="16syzq" id="227lWzxVSo8" role="11_B2D">
                <ref role="16sUi3" node="227lWzxVSoz" resolve="T" />
              </node>
            </node>
          </node>
          <node concept="3clFbS" id="227lWzxVSo9" role="3clF47">
            <node concept="3clFbJ" id="227lWzxVSoa" role="3cqZAp">
              <node concept="3clFbC" id="227lWzxVSob" role="3clFbw">
                <node concept="3VsKOn" id="227lWzxVSOv" role="3uHU7w">
                  <ref role="3VsUkX" to="ze1i:~BehaviorAspectDescriptor" resolve="BehaviorAspectDescriptor" />
                </node>
                <node concept="37vLTw" id="227lWzxVSod" role="3uHU7B">
                  <ref role="3cqZAo" node="227lWzxVSo6" resolve="aspectClass" />
                </node>
              </node>
              <node concept="3clFbS" id="227lWzxVSoe" role="3clFbx">
                <node concept="3cpWs6" id="227lWzxVSof" role="3cqZAp">
                  <node concept="10QFUN" id="227lWzxVSog" role="3cqZAk">
                    <node concept="16syzq" id="227lWzxVSoh" role="10QFUM">
                      <ref role="16sUi3" node="227lWzxVSoz" resolve="T" />
                    </node>
                    <node concept="1nCR9W" id="227lWzxVVrQ" role="10QFUP">
                      <property role="1nD$Q0" value="behavior.BehaviorAspectDescriptor" />
                      <node concept="17Uvod" id="227lWzxVVrR" role="lGtFl">
                        <property role="2qtEX9" value="fqClassName" />
                        <property role="P4ACc" value="df345b11-b8c7-4213-ac66-48d2a9b75d88/1173996401517/1173996588177" />
                        <node concept="3zFVjK" id="227lWzxVVrS" role="3zH0cK">
                          <node concept="3clFbS" id="227lWzxVVrT" role="2VODD2">
                            <node concept="3clFbF" id="227lWzxVVrU" role="3cqZAp">
                              <node concept="3cpWs3" id="227lWzxVVrV" role="3clFbG">
                                <node concept="Xl_RD" id="227lWzxVVrW" role="3uHU7w">
                                  <property role="Xl_RC" value=".BehaviorAspectDescriptor" />
                                </node>
                                <node concept="2OqwBi" id="227lWzxWnci" role="3uHU7B">
                                  <node concept="30H73N" id="227lWzxWncj" role="2Oq$k0" />
                                  <node concept="3TrcHB" id="227lWzxWnck" role="2OqNvi">
                                    <ref role="3TsBF5" to="hypd:5xDtKQA7vSI" resolve="qualifiedName" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="3uibUv" id="6ymW8j2Vgfy" role="2lIhxL">
                        <ref role="3uigEE" to="ze1i:~BehaviorAspectDescriptor" resolve="BehaviorAspectDescriptor" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="raruj" id="227lWzxVSov" role="lGtFl" />
            </node>
            <node concept="3cpWs6" id="227lWzxVSow" role="3cqZAp">
              <node concept="10Nm6u" id="227lWzxVSox" role="3cqZAk" />
            </node>
          </node>
          <node concept="3Tm1VV" id="227lWzxVSoy" role="1B3o_S" />
          <node concept="16euLQ" id="227lWzxVSoz" role="16eVyc">
            <property role="TrG5h" value="T" />
            <node concept="3uibUv" id="4r8JClTjRAK" role="3ztrMU">
              <ref role="3uigEE" to="ze1i:~ILanguageAspect" resolve="ILanguageAspect" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3aamgX" id="227lWzxU7Kt" role="3aUrZf">
      <ref role="30HIoZ" to="hypd:5xDtKQA7vSB" resolve="ModelReference" />
      <node concept="30G5F_" id="227lWzxU9X7" role="30HLyM">
        <node concept="3clFbS" id="227lWzxU9X8" role="2VODD2">
          <node concept="3cpWs8" id="227lWzxUa8G" role="3cqZAp">
            <node concept="3cpWsn" id="227lWzxUa8H" role="3cpWs9">
              <property role="TrG5h" value="aspectModel" />
              <node concept="2OqwBi" id="227lWzxUa8I" role="33vP2m">
                <node concept="Rm8GO" id="227lWzxUcoO" role="2Oq$k0">
                  <ref role="Rm8GQ" to="w1kc:~LanguageAspect.CONSTRAINTS" resolve="CONSTRAINTS" />
                  <ref role="1Px2BO" to="w1kc:~LanguageAspect" resolve="LanguageAspect" />
                </node>
                <node concept="liA8E" id="227lWzxUa8K" role="2OqNvi">
                  <ref role="37wK5l" to="w1kc:~LanguageAspect.get(jetbrains.mps.smodel.Language):org.jetbrains.mps.openapi.model.SModel" resolve="get" />
                  <node concept="2OqwBi" id="227lWzxUa8L" role="37wK5m">
                    <node concept="1iwH7S" id="227lWzxUa8M" role="2Oq$k0" />
                    <node concept="3cR$yn" id="227lWzxUa8N" role="2OqNvi">
                      <ref role="3cRzXn" node="227lWzxTzAl" resolve="langModule" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3uibUv" id="227lWzxUa8O" role="1tU5fm">
                <ref role="3uigEE" to="mhbf:~SModel" resolve="SModel" />
              </node>
            </node>
          </node>
          <node concept="3clFbJ" id="227lWzxV$P_" role="3cqZAp">
            <node concept="3clFbS" id="227lWzxV$PA" role="3clFbx">
              <node concept="3cpWs6" id="227lWzxV$PB" role="3cqZAp">
                <node concept="3clFbT" id="227lWzxV$PC" role="3cqZAk">
                  <property role="3clFbU" value="false" />
                </node>
              </node>
            </node>
            <node concept="22lmx$" id="227lWzxV$PD" role="3clFbw">
              <node concept="3clFbC" id="227lWzxV$PE" role="3uHU7B">
                <node concept="37vLTw" id="227lWzxV$PF" role="3uHU7B">
                  <ref role="3cqZAo" node="227lWzxUa8H" resolve="aspectModel" />
                </node>
                <node concept="10Nm6u" id="227lWzxV$PG" role="3uHU7w" />
              </node>
              <node concept="3fqX7Q" id="227lWzxV$PH" role="3uHU7w">
                <node concept="2OqwBi" id="227lWzxV$PI" role="3fr31v">
                  <node concept="2OqwBi" id="227lWzxV$PJ" role="2Oq$k0">
                    <node concept="2OqwBi" id="227lWzxV$PK" role="2Oq$k0">
                      <node concept="37vLTw" id="227lWzxV$PL" role="2Oq$k0">
                        <ref role="3cqZAo" node="227lWzxUa8H" resolve="aspectModel" />
                      </node>
                      <node concept="liA8E" id="227lWzxV$PM" role="2OqNvi">
                        <ref role="37wK5l" to="mhbf:~SModel.getRootNodes():java.lang.Iterable" resolve="getRootNodes" />
                      </node>
                    </node>
                    <node concept="liA8E" id="227lWzxV$PN" role="2OqNvi">
                      <ref role="37wK5l" to="wyt6:~Iterable.iterator():java.util.Iterator" resolve="iterator" />
                    </node>
                  </node>
                  <node concept="liA8E" id="227lWzxV$PO" role="2OqNvi">
                    <ref role="37wK5l" to="33ny:~Iterator.hasNext():boolean" resolve="hasNext" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3cpWs6" id="227lWzxUa8P" role="3cqZAp">
            <node concept="2OqwBi" id="227lWzxUa8R" role="3cqZAk">
              <node concept="2OqwBi" id="227lWzxUa8S" role="2Oq$k0">
                <node concept="37vLTw" id="227lWzxUa8T" role="2Oq$k0">
                  <ref role="3cqZAo" node="227lWzxUa8H" resolve="aspectModel" />
                </node>
                <node concept="liA8E" id="227lWzxUa8U" role="2OqNvi">
                  <ref role="37wK5l" to="mhbf:~SModel.getReference():org.jetbrains.mps.openapi.model.SModelReference" resolve="getReference" />
                </node>
              </node>
              <node concept="liA8E" id="227lWzxUa8V" role="2OqNvi">
                <ref role="37wK5l" to="wyt6:~Object.equals(java.lang.Object):boolean" resolve="equals" />
                <node concept="2OqwBi" id="227lWzxWPpK" role="37wK5m">
                  <node concept="1iwH7S" id="227lWzxWPpL" role="2Oq$k0" />
                  <node concept="3cR$yn" id="227lWzxWPpM" role="2OqNvi">
                    <ref role="3cRzXn" node="227lWzxWwEv" resolve="modelRef" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="1Koe21" id="227lWzxVCMS" role="1lVwrX">
        <node concept="3clFb_" id="227lWzxVCMT" role="1Koe22">
          <property role="1EzhhJ" value="false" />
          <property role="TrG5h" value="createAspectDescriptor" />
          <property role="od$2w" value="false" />
          <property role="DiZV1" value="false" />
          <node concept="16syzq" id="227lWzxVCMU" role="3clF45">
            <ref role="16sUi3" node="227lWzxVCNo" resolve="T" />
          </node>
          <node concept="37vLTG" id="227lWzxVCMV" role="3clF46">
            <property role="TrG5h" value="aspectClass" />
            <node concept="3uibUv" id="227lWzxVCMW" role="1tU5fm">
              <ref role="3uigEE" to="wyt6:~Class" resolve="Class" />
              <node concept="16syzq" id="227lWzxVCMX" role="11_B2D">
                <ref role="16sUi3" node="227lWzxVCNo" resolve="T" />
              </node>
            </node>
          </node>
          <node concept="3clFbS" id="227lWzxVCMY" role="3clF47">
            <node concept="3clFbJ" id="227lWzxVCMZ" role="3cqZAp">
              <node concept="3clFbC" id="227lWzxVCN0" role="3clFbw">
                <node concept="3VsKOn" id="227lWzxVDfN" role="3uHU7w">
                  <ref role="3VsUkX" to="ze1i:~ConstraintsAspectDescriptor" resolve="ConstraintsAspectDescriptor" />
                </node>
                <node concept="37vLTw" id="227lWzxVCN2" role="3uHU7B">
                  <ref role="3cqZAo" node="227lWzxVCMV" resolve="aspectClass" />
                </node>
              </node>
              <node concept="3clFbS" id="227lWzxVCN3" role="3clFbx">
                <node concept="3cpWs6" id="227lWzxVCN4" role="3cqZAp">
                  <node concept="10QFUN" id="227lWzxVCN5" role="3cqZAk">
                    <node concept="16syzq" id="227lWzxVCN6" role="10QFUM">
                      <ref role="16sUi3" node="227lWzxVCNo" resolve="T" />
                    </node>
                    <node concept="1nCR9W" id="227lWzxVFSC" role="10QFUP">
                      <property role="1nD$Q0" value="constraints.ConstraintsAspectDescriptor" />
                      <node concept="17Uvod" id="227lWzxVFSD" role="lGtFl">
                        <property role="2qtEX9" value="fqClassName" />
                        <property role="P4ACc" value="df345b11-b8c7-4213-ac66-48d2a9b75d88/1173996401517/1173996588177" />
                        <node concept="3zFVjK" id="227lWzxVFSE" role="3zH0cK">
                          <node concept="3clFbS" id="227lWzxVFSF" role="2VODD2">
                            <node concept="3clFbF" id="227lWzxVFSG" role="3cqZAp">
                              <node concept="3cpWs3" id="227lWzxVFSH" role="3clFbG">
                                <node concept="Xl_RD" id="227lWzxVFSI" role="3uHU7w">
                                  <property role="Xl_RC" value=".ConstraintsAspectDescriptor" />
                                </node>
                                <node concept="2OqwBi" id="227lWzxWoAI" role="3uHU7B">
                                  <node concept="30H73N" id="227lWzxWoAJ" role="2Oq$k0" />
                                  <node concept="3TrcHB" id="227lWzxWoAK" role="2OqNvi">
                                    <ref role="3TsBF5" to="hypd:5xDtKQA7vSI" resolve="qualifiedName" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="3uibUv" id="6ymW8j2VfC7" role="2lIhxL">
                        <ref role="3uigEE" to="ze1i:~ConstraintsAspectDescriptor" resolve="ConstraintsAspectDescriptor" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="raruj" id="227lWzxVCNk" role="lGtFl" />
            </node>
            <node concept="3cpWs6" id="227lWzxVCNl" role="3cqZAp">
              <node concept="10Nm6u" id="227lWzxVCNm" role="3cqZAk" />
            </node>
          </node>
          <node concept="3Tm1VV" id="227lWzxVCNn" role="1B3o_S" />
          <node concept="16euLQ" id="227lWzxVCNo" role="16eVyc">
            <property role="TrG5h" value="T" />
            <node concept="3uibUv" id="4r8JClTjRt_" role="3ztrMU">
              <ref role="3uigEE" to="ze1i:~ILanguageAspect" resolve="ILanguageAspect" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3aamgX" id="227lWzxU8Dv" role="3aUrZf">
      <ref role="30HIoZ" to="hypd:5xDtKQA7vSB" resolve="ModelReference" />
      <node concept="30G5F_" id="227lWzxU9rk" role="30HLyM">
        <node concept="3clFbS" id="227lWzxU9rl" role="2VODD2">
          <node concept="3cpWs8" id="227lWzxU9Dt" role="3cqZAp">
            <node concept="3cpWsn" id="227lWzxU9Du" role="3cpWs9">
              <property role="TrG5h" value="aspectModel" />
              <node concept="2OqwBi" id="227lWzxU9Dv" role="33vP2m">
                <node concept="Rm8GO" id="227lWzxUcMQ" role="2Oq$k0">
                  <ref role="Rm8GQ" to="w1kc:~LanguageAspect.TEXT_GEN" resolve="TEXT_GEN" />
                  <ref role="1Px2BO" to="w1kc:~LanguageAspect" resolve="LanguageAspect" />
                </node>
                <node concept="liA8E" id="227lWzxU9Dx" role="2OqNvi">
                  <ref role="37wK5l" to="w1kc:~LanguageAspect.get(jetbrains.mps.smodel.Language):org.jetbrains.mps.openapi.model.SModel" resolve="get" />
                  <node concept="2OqwBi" id="227lWzxU9Dy" role="37wK5m">
                    <node concept="1iwH7S" id="227lWzxU9Dz" role="2Oq$k0" />
                    <node concept="3cR$yn" id="227lWzxU9D$" role="2OqNvi">
                      <ref role="3cRzXn" node="227lWzxTzAl" resolve="langModule" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3uibUv" id="227lWzxU9D_" role="1tU5fm">
                <ref role="3uigEE" to="mhbf:~SModel" resolve="SModel" />
              </node>
            </node>
          </node>
          <node concept="3clFbJ" id="227lWzxVynj" role="3cqZAp">
            <node concept="3clFbS" id="227lWzxVynk" role="3clFbx">
              <node concept="3cpWs6" id="227lWzxVynl" role="3cqZAp">
                <node concept="3clFbT" id="227lWzxVynm" role="3cqZAk">
                  <property role="3clFbU" value="false" />
                </node>
              </node>
            </node>
            <node concept="22lmx$" id="227lWzxVynn" role="3clFbw">
              <node concept="3clFbC" id="227lWzxVyno" role="3uHU7B">
                <node concept="37vLTw" id="227lWzxVynp" role="3uHU7B">
                  <ref role="3cqZAo" node="227lWzxU9Du" resolve="aspectModel" />
                </node>
                <node concept="10Nm6u" id="227lWzxVynq" role="3uHU7w" />
              </node>
              <node concept="3fqX7Q" id="227lWzxVynr" role="3uHU7w">
                <node concept="2OqwBi" id="227lWzxVyns" role="3fr31v">
                  <node concept="2OqwBi" id="227lWzxVynt" role="2Oq$k0">
                    <node concept="2OqwBi" id="227lWzxVynu" role="2Oq$k0">
                      <node concept="37vLTw" id="227lWzxVynv" role="2Oq$k0">
                        <ref role="3cqZAo" node="227lWzxU9Du" resolve="aspectModel" />
                      </node>
                      <node concept="liA8E" id="227lWzxVynw" role="2OqNvi">
                        <ref role="37wK5l" to="mhbf:~SModel.getRootNodes():java.lang.Iterable" resolve="getRootNodes" />
                      </node>
                    </node>
                    <node concept="liA8E" id="227lWzxVynx" role="2OqNvi">
                      <ref role="37wK5l" to="wyt6:~Iterable.iterator():java.util.Iterator" resolve="iterator" />
                    </node>
                  </node>
                  <node concept="liA8E" id="227lWzxVyny" role="2OqNvi">
                    <ref role="37wK5l" to="33ny:~Iterator.hasNext():boolean" resolve="hasNext" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3cpWs6" id="227lWzxU9DA" role="3cqZAp">
            <node concept="2OqwBi" id="227lWzxU9DC" role="3cqZAk">
              <node concept="2OqwBi" id="227lWzxU9DD" role="2Oq$k0">
                <node concept="37vLTw" id="227lWzxU9DE" role="2Oq$k0">
                  <ref role="3cqZAo" node="227lWzxU9Du" resolve="aspectModel" />
                </node>
                <node concept="liA8E" id="227lWzxU9DF" role="2OqNvi">
                  <ref role="37wK5l" to="mhbf:~SModel.getReference():org.jetbrains.mps.openapi.model.SModelReference" resolve="getReference" />
                </node>
              </node>
              <node concept="liA8E" id="227lWzxU9DG" role="2OqNvi">
                <ref role="37wK5l" to="wyt6:~Object.equals(java.lang.Object):boolean" resolve="equals" />
                <node concept="2OqwBi" id="227lWzxWPF$" role="37wK5m">
                  <node concept="1iwH7S" id="227lWzxWPF_" role="2Oq$k0" />
                  <node concept="3cR$yn" id="227lWzxWPFA" role="2OqNvi">
                    <ref role="3cRzXn" node="227lWzxWwEv" resolve="modelRef" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="1Koe21" id="227lWzxUoaU" role="1lVwrX">
        <node concept="3clFb_" id="227lWzxUoaV" role="1Koe22">
          <property role="1EzhhJ" value="false" />
          <property role="TrG5h" value="createAspectDescriptor" />
          <property role="od$2w" value="false" />
          <property role="DiZV1" value="false" />
          <node concept="16syzq" id="227lWzxUoaW" role="3clF45">
            <ref role="16sUi3" node="227lWzxUobc" resolve="T" />
          </node>
          <node concept="37vLTG" id="227lWzxUoaX" role="3clF46">
            <property role="TrG5h" value="aspectClass" />
            <node concept="3uibUv" id="227lWzxUoaY" role="1tU5fm">
              <ref role="3uigEE" to="wyt6:~Class" resolve="Class" />
              <node concept="16syzq" id="227lWzxUoaZ" role="11_B2D">
                <ref role="16sUi3" node="227lWzxUobc" resolve="T" />
              </node>
            </node>
          </node>
          <node concept="3clFbS" id="227lWzxUob0" role="3clF47">
            <node concept="3clFbJ" id="227lWzxUob1" role="3cqZAp">
              <node concept="3clFbC" id="227lWzxUob2" role="3clFbw">
                <node concept="3VsKOn" id="227lWzxUoiV" role="3uHU7w">
                  <ref role="3VsUkX" to="yfwt:~TextGenAspectDescriptor" resolve="TextGenAspectDescriptor" />
                </node>
                <node concept="37vLTw" id="227lWzxUob4" role="3uHU7B">
                  <ref role="3cqZAo" node="227lWzxUoaX" resolve="aspectClass" />
                </node>
              </node>
              <node concept="3clFbS" id="227lWzxUob5" role="3clFbx">
                <node concept="3cpWs6" id="227lWzxUob6" role="3cqZAp">
                  <node concept="10QFUN" id="227lWzxU_BY" role="3cqZAk">
                    <node concept="1nCR9W" id="2aOQZH68nI3" role="10QFUP">
                      <property role="1nD$Q0" value="textgen.TextGenAspectDescriptor" />
                      <node concept="3uibUv" id="2aOQZH68oh9" role="2lIhxL">
                        <ref role="3uigEE" to="yfwt:~TextGenAspectDescriptor" resolve="TextGenAspectDescriptor" />
                      </node>
                      <node concept="17Uvod" id="2aOQZH68ohZ" role="lGtFl">
                        <property role="P4ACc" value="df345b11-b8c7-4213-ac66-48d2a9b75d88/1173996401517/1173996588177" />
                        <property role="2qtEX9" value="fqClassName" />
                        <node concept="3zFVjK" id="2aOQZH68oi0" role="3zH0cK">
                          <node concept="3clFbS" id="2aOQZH68oi1" role="2VODD2">
                            <node concept="3clFbF" id="2aOQZH68oo1" role="3cqZAp">
                              <node concept="3cpWs3" id="2aOQZH68oo2" role="3clFbG">
                                <node concept="Xl_RD" id="2aOQZH68oo3" role="3uHU7w">
                                  <property role="Xl_RC" value=".TextGenAspectDescriptor" />
                                </node>
                                <node concept="2OqwBi" id="2aOQZH68oo4" role="3uHU7B">
                                  <node concept="30H73N" id="2aOQZH68oo5" role="2Oq$k0" />
                                  <node concept="3TrcHB" id="2aOQZH68oo6" role="2OqNvi">
                                    <ref role="3TsBF5" to="hypd:5xDtKQA7vSI" resolve="qualifiedName" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="16syzq" id="227lWzxU_En" role="10QFUM">
                      <ref role="16sUi3" node="227lWzxUobc" resolve="T" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="raruj" id="227lWzxUob8" role="lGtFl" />
            </node>
            <node concept="3cpWs6" id="227lWzxUob9" role="3cqZAp">
              <node concept="10Nm6u" id="227lWzxUoba" role="3cqZAk" />
            </node>
          </node>
          <node concept="3Tm1VV" id="227lWzxUobb" role="1B3o_S" />
          <node concept="16euLQ" id="227lWzxUobc" role="16eVyc">
            <property role="TrG5h" value="T" />
            <node concept="3uibUv" id="4r8JClTjRkr" role="3ztrMU">
              <ref role="3uigEE" to="ze1i:~ILanguageAspect" resolve="ILanguageAspect" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3aamgX" id="227lWzxUgT6" role="3aUrZf">
      <ref role="30HIoZ" to="hypd:5xDtKQA7vSB" resolve="ModelReference" />
      <node concept="30G5F_" id="227lWzxUgT8" role="30HLyM">
        <node concept="3clFbS" id="227lWzxUgT9" role="2VODD2">
          <node concept="3cpWs8" id="227lWzxUgTa" role="3cqZAp">
            <node concept="3cpWsn" id="227lWzxUgTb" role="3cpWs9">
              <property role="TrG5h" value="aspectModel" />
              <node concept="2OqwBi" id="227lWzxUgTc" role="33vP2m">
                <node concept="Rm8GO" id="227lWzxUiZ4" role="2Oq$k0">
                  <ref role="Rm8GQ" to="w1kc:~LanguageAspect.FIND_USAGES" resolve="FIND_USAGES" />
                  <ref role="1Px2BO" to="w1kc:~LanguageAspect" resolve="LanguageAspect" />
                </node>
                <node concept="liA8E" id="227lWzxUgTe" role="2OqNvi">
                  <ref role="37wK5l" to="w1kc:~LanguageAspect.get(jetbrains.mps.smodel.Language):org.jetbrains.mps.openapi.model.SModel" resolve="get" />
                  <node concept="2OqwBi" id="227lWzxUgTf" role="37wK5m">
                    <node concept="1iwH7S" id="227lWzxUgTg" role="2Oq$k0" />
                    <node concept="3cR$yn" id="227lWzxUgTh" role="2OqNvi">
                      <ref role="3cRzXn" node="227lWzxTzAl" resolve="langModule" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3uibUv" id="227lWzxUgTi" role="1tU5fm">
                <ref role="3uigEE" to="mhbf:~SModel" resolve="SModel" />
              </node>
            </node>
          </node>
          <node concept="3clFbJ" id="227lWzxVomJ" role="3cqZAp">
            <node concept="3clFbS" id="227lWzxVomK" role="3clFbx">
              <node concept="3cpWs6" id="227lWzxVomL" role="3cqZAp">
                <node concept="3clFbT" id="227lWzxVomM" role="3cqZAk">
                  <property role="3clFbU" value="false" />
                </node>
              </node>
            </node>
            <node concept="22lmx$" id="227lWzxVomN" role="3clFbw">
              <node concept="3clFbC" id="227lWzxVomO" role="3uHU7B">
                <node concept="37vLTw" id="227lWzxVomP" role="3uHU7B">
                  <ref role="3cqZAo" node="227lWzxUgTb" resolve="aspectModel" />
                </node>
                <node concept="10Nm6u" id="227lWzxVomQ" role="3uHU7w" />
              </node>
              <node concept="2OqwBi" id="227lWzxUM88" role="3uHU7w">
                <node concept="2OqwBi" id="227lWzxUF2Y" role="2Oq$k0">
                  <node concept="1eOMI4" id="227lWzxUDKQ" role="2Oq$k0">
                    <node concept="10QFUN" id="227lWzxUDKN" role="1eOMHV">
                      <node concept="H_c77" id="227lWzxUEcb" role="10QFUM" />
                      <node concept="37vLTw" id="227lWzxUEB9" role="10QFUP">
                        <ref role="3cqZAo" node="227lWzxUgTb" resolve="aspectModel" />
                      </node>
                    </node>
                  </node>
                  <node concept="2RRcyG" id="227lWzxUFAG" role="2OqNvi">
                    <ref role="2RRcyH" to="tp3b:hqPqlEd" resolve="FinderDeclaration" />
                  </node>
                </node>
                <node concept="1v1jN8" id="227lWzxVvid" role="2OqNvi" />
              </node>
            </node>
          </node>
          <node concept="3cpWs6" id="227lWzxVomZ" role="3cqZAp">
            <node concept="2OqwBi" id="227lWzxVon0" role="3cqZAk">
              <node concept="2OqwBi" id="227lWzxVon1" role="2Oq$k0">
                <node concept="37vLTw" id="227lWzxVon2" role="2Oq$k0">
                  <ref role="3cqZAo" node="227lWzxUgTb" resolve="aspectModel" />
                </node>
                <node concept="liA8E" id="227lWzxVon3" role="2OqNvi">
                  <ref role="37wK5l" to="mhbf:~SModel.getReference():org.jetbrains.mps.openapi.model.SModelReference" resolve="getReference" />
                </node>
              </node>
              <node concept="liA8E" id="227lWzxVon4" role="2OqNvi">
                <ref role="37wK5l" to="wyt6:~Object.equals(java.lang.Object):boolean" resolve="equals" />
                <node concept="2OqwBi" id="227lWzxWQe$" role="37wK5m">
                  <node concept="1iwH7S" id="227lWzxWQe_" role="2Oq$k0" />
                  <node concept="3cR$yn" id="227lWzxWQeA" role="2OqNvi">
                    <ref role="3cRzXn" node="227lWzxWwEv" resolve="modelRef" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="1Koe21" id="227lWzxUTSa" role="1lVwrX">
        <node concept="3clFb_" id="227lWzxUTSb" role="1Koe22">
          <property role="1EzhhJ" value="false" />
          <property role="TrG5h" value="createAspectDescriptor" />
          <property role="od$2w" value="false" />
          <property role="DiZV1" value="false" />
          <node concept="16syzq" id="227lWzxUTSc" role="3clF45">
            <ref role="16sUi3" node="227lWzxUTSv" resolve="T" />
          </node>
          <node concept="37vLTG" id="227lWzxUTSd" role="3clF46">
            <property role="TrG5h" value="aspectClass" />
            <node concept="3uibUv" id="227lWzxUTSe" role="1tU5fm">
              <ref role="3uigEE" to="wyt6:~Class" resolve="Class" />
              <node concept="16syzq" id="227lWzxUTSf" role="11_B2D">
                <ref role="16sUi3" node="227lWzxUTSv" resolve="T" />
              </node>
            </node>
          </node>
          <node concept="3clFbS" id="227lWzxUTSg" role="3clF47">
            <node concept="3clFbJ" id="227lWzxUTSh" role="3cqZAp">
              <node concept="3clFbC" id="227lWzxUTSi" role="3clFbw">
                <node concept="3VsKOn" id="227lWzxUUjQ" role="3uHU7w">
                  <ref role="3VsUkX" to="ze1i:~FindUsageAspectDescriptor" resolve="FindUsageAspectDescriptor" />
                </node>
                <node concept="37vLTw" id="227lWzxUTSk" role="3uHU7B">
                  <ref role="3cqZAo" node="227lWzxUTSd" resolve="aspectClass" />
                </node>
              </node>
              <node concept="3clFbS" id="227lWzxUTSl" role="3clFbx">
                <node concept="3cpWs6" id="227lWzxUTSm" role="3cqZAp">
                  <node concept="10QFUN" id="227lWzxUTSn" role="3cqZAk">
                    <node concept="16syzq" id="227lWzxUTSo" role="10QFUM">
                      <ref role="16sUi3" node="227lWzxUTSv" resolve="T" />
                    </node>
                    <node concept="1nCR9W" id="227lWzxUWtE" role="10QFUP">
                      <property role="1nD$Q0" value="findUsages.FindUsagesDescriptor" />
                      <node concept="17Uvod" id="227lWzxUWtF" role="lGtFl">
                        <property role="2qtEX9" value="fqClassName" />
                        <property role="P4ACc" value="df345b11-b8c7-4213-ac66-48d2a9b75d88/1173996401517/1173996588177" />
                        <node concept="3zFVjK" id="227lWzxUWtG" role="3zH0cK">
                          <node concept="3clFbS" id="227lWzxUWtH" role="2VODD2">
                            <node concept="3clFbF" id="227lWzxUWtI" role="3cqZAp">
                              <node concept="3cpWs3" id="227lWzxUWtJ" role="3clFbG">
                                <node concept="Xl_RD" id="227lWzxUWtK" role="3uHU7w">
                                  <property role="Xl_RC" value=".FindUsagesDescriptor" />
                                </node>
                                <node concept="2OqwBi" id="227lWzxWpR5" role="3uHU7B">
                                  <node concept="30H73N" id="227lWzxWpR6" role="2Oq$k0" />
                                  <node concept="3TrcHB" id="227lWzxWpR7" role="2OqNvi">
                                    <ref role="3TsBF5" to="hypd:5xDtKQA7vSI" resolve="qualifiedName" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="3uibUv" id="6ymW8j2VeZ0" role="2lIhxL">
                        <ref role="3uigEE" to="ze1i:~FindUsageAspectDescriptor" resolve="FindUsageAspectDescriptor" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="raruj" id="227lWzxUTSr" role="lGtFl" />
            </node>
            <node concept="3cpWs6" id="227lWzxUTSs" role="3cqZAp">
              <node concept="10Nm6u" id="227lWzxUTSt" role="3cqZAk" />
            </node>
          </node>
          <node concept="3Tm1VV" id="227lWzxUTSu" role="1B3o_S" />
          <node concept="16euLQ" id="227lWzxUTSv" role="16eVyc">
            <property role="TrG5h" value="T" />
            <node concept="3uibUv" id="4r8JClTjRbi" role="3ztrMU">
              <ref role="3uigEE" to="ze1i:~ILanguageAspect" resolve="ILanguageAspect" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3aamgX" id="227lWzxUhUo" role="3aUrZf">
      <ref role="30HIoZ" to="hypd:5xDtKQA7vSB" resolve="ModelReference" />
      <node concept="30G5F_" id="227lWzxUhUq" role="30HLyM">
        <node concept="3clFbS" id="227lWzxUhUr" role="2VODD2">
          <node concept="3cpWs8" id="227lWzxUhUs" role="3cqZAp">
            <node concept="3cpWsn" id="227lWzxUhUt" role="3cpWs9">
              <property role="TrG5h" value="aspectModel" />
              <node concept="2OqwBi" id="227lWzxUhUu" role="33vP2m">
                <node concept="Rm8GO" id="227lWzxUjts" role="2Oq$k0">
                  <ref role="Rm8GQ" to="w1kc:~LanguageAspect.TYPESYSTEM" resolve="TYPESYSTEM" />
                  <ref role="1Px2BO" to="w1kc:~LanguageAspect" resolve="LanguageAspect" />
                </node>
                <node concept="liA8E" id="227lWzxUhUw" role="2OqNvi">
                  <ref role="37wK5l" to="w1kc:~LanguageAspect.get(jetbrains.mps.smodel.Language):org.jetbrains.mps.openapi.model.SModel" resolve="get" />
                  <node concept="2OqwBi" id="227lWzxUhUx" role="37wK5m">
                    <node concept="1iwH7S" id="227lWzxUhUy" role="2Oq$k0" />
                    <node concept="3cR$yn" id="227lWzxUhUz" role="2OqNvi">
                      <ref role="3cRzXn" node="227lWzxTzAl" resolve="langModule" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3uibUv" id="227lWzxUhU$" role="1tU5fm">
                <ref role="3uigEE" to="mhbf:~SModel" resolve="SModel" />
              </node>
            </node>
          </node>
          <node concept="3clFbJ" id="227lWzxVcWb" role="3cqZAp">
            <node concept="3clFbS" id="227lWzxVcWe" role="3clFbx">
              <node concept="3cpWs6" id="227lWzxVm7D" role="3cqZAp">
                <node concept="3clFbT" id="227lWzxVmvy" role="3cqZAk">
                  <property role="3clFbU" value="false" />
                </node>
              </node>
            </node>
            <node concept="22lmx$" id="227lWzxVkZm" role="3clFbw">
              <node concept="3clFbC" id="227lWzxVkZv" role="3uHU7B">
                <node concept="37vLTw" id="227lWzxVkZw" role="3uHU7B">
                  <ref role="3cqZAo" node="227lWzxUhUt" resolve="aspectModel" />
                </node>
                <node concept="10Nm6u" id="227lWzxVkZx" role="3uHU7w" />
              </node>
              <node concept="3fqX7Q" id="227lWzxVlA6" role="3uHU7w">
                <node concept="2OqwBi" id="227lWzxVlA8" role="3fr31v">
                  <node concept="2OqwBi" id="227lWzxVlA9" role="2Oq$k0">
                    <node concept="2OqwBi" id="227lWzxVlAa" role="2Oq$k0">
                      <node concept="37vLTw" id="227lWzxVlAb" role="2Oq$k0">
                        <ref role="3cqZAo" node="227lWzxUhUt" resolve="aspectModel" />
                      </node>
                      <node concept="liA8E" id="227lWzxVlAc" role="2OqNvi">
                        <ref role="37wK5l" to="mhbf:~SModel.getRootNodes():java.lang.Iterable" resolve="getRootNodes" />
                      </node>
                    </node>
                    <node concept="liA8E" id="227lWzxVlAd" role="2OqNvi">
                      <ref role="37wK5l" to="wyt6:~Iterable.iterator():java.util.Iterator" resolve="iterator" />
                    </node>
                  </node>
                  <node concept="liA8E" id="227lWzxVlAe" role="2OqNvi">
                    <ref role="37wK5l" to="33ny:~Iterator.hasNext():boolean" resolve="hasNext" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3cpWs6" id="227lWzxUhU_" role="3cqZAp">
            <node concept="2OqwBi" id="227lWzxUhUB" role="3cqZAk">
              <node concept="2OqwBi" id="227lWzxUhUC" role="2Oq$k0">
                <node concept="37vLTw" id="227lWzxUhUD" role="2Oq$k0">
                  <ref role="3cqZAo" node="227lWzxUhUt" resolve="aspectModel" />
                </node>
                <node concept="liA8E" id="227lWzxUhUE" role="2OqNvi">
                  <ref role="37wK5l" to="mhbf:~SModel.getReference():org.jetbrains.mps.openapi.model.SModelReference" resolve="getReference" />
                </node>
              </node>
              <node concept="liA8E" id="227lWzxUhUF" role="2OqNvi">
                <ref role="37wK5l" to="wyt6:~Object.equals(java.lang.Object):boolean" resolve="equals" />
                <node concept="2OqwBi" id="227lWzxWQJK" role="37wK5m">
                  <node concept="1iwH7S" id="227lWzxWQJL" role="2Oq$k0" />
                  <node concept="3cR$yn" id="227lWzxWQJM" role="2OqNvi">
                    <ref role="3cRzXn" node="227lWzxWwEv" resolve="modelRef" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="1Koe21" id="227lWzxV8i1" role="1lVwrX">
        <node concept="3clFb_" id="227lWzxV8i2" role="1Koe22">
          <property role="1EzhhJ" value="false" />
          <property role="TrG5h" value="createAspectDescriptor" />
          <property role="od$2w" value="false" />
          <property role="DiZV1" value="false" />
          <node concept="16syzq" id="227lWzxV8i3" role="3clF45">
            <ref role="16sUi3" node="227lWzxV8ix" resolve="T" />
          </node>
          <node concept="37vLTG" id="227lWzxV8i4" role="3clF46">
            <property role="TrG5h" value="aspectClass" />
            <node concept="3uibUv" id="227lWzxV8i5" role="1tU5fm">
              <ref role="3uigEE" to="wyt6:~Class" resolve="Class" />
              <node concept="16syzq" id="227lWzxV8i6" role="11_B2D">
                <ref role="16sUi3" node="227lWzxV8ix" resolve="T" />
              </node>
            </node>
          </node>
          <node concept="3clFbS" id="227lWzxV8i7" role="3clF47">
            <node concept="3clFbJ" id="227lWzxV8i8" role="3cqZAp">
              <node concept="3clFbC" id="227lWzxV8i9" role="3clFbw">
                <node concept="3VsKOn" id="227lWzxV8F6" role="3uHU7w">
                  <ref role="3VsUkX" to="qurh:~IHelginsDescriptor" resolve="IHelginsDescriptor" />
                </node>
                <node concept="37vLTw" id="227lWzxV8ib" role="3uHU7B">
                  <ref role="3cqZAo" node="227lWzxV8i4" resolve="aspectClass" />
                </node>
              </node>
              <node concept="3clFbS" id="227lWzxV8ic" role="3clFbx">
                <node concept="3cpWs6" id="227lWzxV8id" role="3cqZAp">
                  <node concept="10QFUN" id="227lWzxV8ie" role="3cqZAk">
                    <node concept="16syzq" id="227lWzxV8if" role="10QFUM">
                      <ref role="16sUi3" node="227lWzxV8ix" resolve="T" />
                    </node>
                    <node concept="1nCR9W" id="227lWzxVbdC" role="10QFUP">
                      <property role="1nD$Q0" value="typesystem.TypsystemDescriptor" />
                      <node concept="3uibUv" id="6ymW8j2Veoz" role="2lIhxL">
                        <ref role="3uigEE" to="qurh:~IHelginsDescriptor" resolve="IHelginsDescriptor" />
                      </node>
                      <node concept="17Uvod" id="227lWzxVbdE" role="lGtFl">
                        <property role="2qtEX9" value="fqClassName" />
                        <property role="P4ACc" value="df345b11-b8c7-4213-ac66-48d2a9b75d88/1173996401517/1173996588177" />
                        <node concept="3zFVjK" id="227lWzxVbdF" role="3zH0cK">
                          <node concept="3clFbS" id="227lWzxVbdG" role="2VODD2">
                            <node concept="3clFbF" id="227lWzxVbdH" role="3cqZAp">
                              <node concept="3cpWs3" id="227lWzxVbdI" role="3clFbG">
                                <node concept="Xl_RD" id="227lWzxVbdJ" role="3uHU7w">
                                  <property role="Xl_RC" value=".TypesystemDescriptor" />
                                </node>
                                <node concept="2OqwBi" id="227lWzxWr9A" role="3uHU7B">
                                  <node concept="30H73N" id="227lWzxWr9B" role="2Oq$k0" />
                                  <node concept="3TrcHB" id="227lWzxWr9C" role="2OqNvi">
                                    <ref role="3TsBF5" to="hypd:5xDtKQA7vSI" resolve="qualifiedName" />
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
              <node concept="raruj" id="227lWzxV8it" role="lGtFl" />
            </node>
            <node concept="3cpWs6" id="227lWzxV8iu" role="3cqZAp">
              <node concept="10Nm6u" id="227lWzxV8iv" role="3cqZAk" />
            </node>
          </node>
          <node concept="3Tm1VV" id="227lWzxV8iw" role="1B3o_S" />
          <node concept="16euLQ" id="227lWzxV8ix" role="16eVyc">
            <property role="TrG5h" value="T" />
            <node concept="3uibUv" id="4r8JClTjR2a" role="3ztrMU">
              <ref role="3uigEE" to="ze1i:~ILanguageAspect" resolve="ILanguageAspect" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3aamgX" id="1yZMluZ2aAR" role="3aUrZf">
      <ref role="30HIoZ" to="hypd:5xDtKQA7vSB" resolve="ModelReference" />
      <node concept="30G5F_" id="1yZMluZ2bra" role="30HLyM">
        <node concept="3clFbS" id="1yZMluZ2brb" role="2VODD2">
          <node concept="3cpWs8" id="1yZMluZ2e0m" role="3cqZAp">
            <node concept="3cpWsn" id="1yZMluZ2e0n" role="3cpWs9">
              <property role="TrG5h" value="aspectModel" />
              <node concept="2OqwBi" id="1yZMluZ2e0o" role="33vP2m">
                <node concept="Rm8GO" id="1yZMluZ2eOG" role="2Oq$k0">
                  <ref role="Rm8GQ" to="w1kc:~LanguageAspect.PLUGIN" resolve="PLUGIN" />
                  <ref role="1Px2BO" to="w1kc:~LanguageAspect" resolve="LanguageAspect" />
                </node>
                <node concept="liA8E" id="1yZMluZ2e0q" role="2OqNvi">
                  <ref role="37wK5l" to="w1kc:~LanguageAspect.get(jetbrains.mps.smodel.Language):org.jetbrains.mps.openapi.model.SModel" resolve="get" />
                  <node concept="2OqwBi" id="1yZMluZ2e0r" role="37wK5m">
                    <node concept="1iwH7S" id="1yZMluZ2e0s" role="2Oq$k0" />
                    <node concept="3cR$yn" id="1yZMluZ2e0t" role="2OqNvi">
                      <ref role="3cRzXn" node="227lWzxTzAl" resolve="langModule" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3uibUv" id="1yZMluZ2e0u" role="1tU5fm">
                <ref role="3uigEE" to="mhbf:~SModel" resolve="SModel" />
              </node>
            </node>
          </node>
          <node concept="3clFbJ" id="1yZMluZ2e0v" role="3cqZAp">
            <node concept="3clFbS" id="1yZMluZ2e0w" role="3clFbx">
              <node concept="3cpWs6" id="1yZMluZ2e0x" role="3cqZAp">
                <node concept="3clFbT" id="1yZMluZ2e0y" role="3cqZAk">
                  <property role="3clFbU" value="false" />
                </node>
              </node>
            </node>
            <node concept="22lmx$" id="1yZMluZ2e0z" role="3clFbw">
              <node concept="3clFbC" id="1yZMluZ2e0$" role="3uHU7B">
                <node concept="37vLTw" id="1yZMluZ2e0_" role="3uHU7B">
                  <ref role="3cqZAo" node="1yZMluZ2e0n" resolve="aspectModel" />
                </node>
                <node concept="10Nm6u" id="1yZMluZ2e0A" role="3uHU7w" />
              </node>
              <node concept="2OqwBi" id="1yZMluZ2e0B" role="3uHU7w">
                <node concept="2OqwBi" id="1yZMluZ2e0C" role="2Oq$k0">
                  <node concept="1eOMI4" id="1yZMluZ2e0D" role="2Oq$k0">
                    <node concept="10QFUN" id="1yZMluZ2e0E" role="1eOMHV">
                      <node concept="H_c77" id="1yZMluZ2e0F" role="10QFUM" />
                      <node concept="37vLTw" id="1yZMluZ2e0G" role="10QFUP">
                        <ref role="3cqZAo" node="1yZMluZ2e0n" resolve="aspectModel" />
                      </node>
                    </node>
                  </node>
                  <node concept="2RRcyG" id="1yZMluZ2e0H" role="2OqNvi">
                    <ref role="2RRcyH" to="vvvw:5$iCEGsO$Kj" resolve="FacetDeclaration" />
                  </node>
                </node>
                <node concept="1v1jN8" id="1yZMluZ2e0I" role="2OqNvi" />
              </node>
            </node>
          </node>
          <node concept="3cpWs6" id="1yZMluZ2e0J" role="3cqZAp">
            <node concept="2OqwBi" id="1yZMluZ2e0K" role="3cqZAk">
              <node concept="2OqwBi" id="1yZMluZ2e0L" role="2Oq$k0">
                <node concept="37vLTw" id="1yZMluZ2e0M" role="2Oq$k0">
                  <ref role="3cqZAo" node="1yZMluZ2e0n" resolve="aspectModel" />
                </node>
                <node concept="liA8E" id="1yZMluZ2e0N" role="2OqNvi">
                  <ref role="37wK5l" to="mhbf:~SModel.getReference():org.jetbrains.mps.openapi.model.SModelReference" resolve="getReference" />
                </node>
              </node>
              <node concept="liA8E" id="1yZMluZ2e0O" role="2OqNvi">
                <ref role="37wK5l" to="wyt6:~Object.equals(java.lang.Object):boolean" resolve="equals" />
                <node concept="2OqwBi" id="1yZMluZ2e0P" role="37wK5m">
                  <node concept="1iwH7S" id="1yZMluZ2e0Q" role="2Oq$k0" />
                  <node concept="3cR$yn" id="1yZMluZ2e0R" role="2OqNvi">
                    <ref role="3cRzXn" node="227lWzxWwEv" resolve="modelRef" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="1Koe21" id="1yZMluZ2mq_" role="1lVwrX">
        <node concept="3clFb_" id="1yZMluZ2mqA" role="1Koe22">
          <property role="1EzhhJ" value="false" />
          <property role="TrG5h" value="createAspectDescriptor" />
          <property role="od$2w" value="false" />
          <property role="DiZV1" value="false" />
          <node concept="16syzq" id="1yZMluZ2mqB" role="3clF45">
            <ref role="16sUi3" node="1yZMluZ2mr3" resolve="T" />
          </node>
          <node concept="37vLTG" id="1yZMluZ2mqC" role="3clF46">
            <property role="TrG5h" value="aspectClass" />
            <node concept="3uibUv" id="1yZMluZ2mqD" role="1tU5fm">
              <ref role="3uigEE" to="wyt6:~Class" resolve="Class" />
              <node concept="16syzq" id="1yZMluZ2mqE" role="11_B2D">
                <ref role="16sUi3" node="1yZMluZ2mr3" resolve="T" />
              </node>
            </node>
          </node>
          <node concept="3clFbS" id="1yZMluZ2mqF" role="3clF47">
            <node concept="3clFbJ" id="1yZMluZ2mqG" role="3cqZAp">
              <node concept="3clFbC" id="1yZMluZ2mqH" role="3clFbw">
                <node concept="3VsKOn" id="1yZMluZ2ptf" role="3uHU7w">
                  <ref role="3VsUkX" to="ze1i:~MakeAspectDescriptor" resolve="MakeAspectDescriptor" />
                </node>
                <node concept="37vLTw" id="1yZMluZ2mqJ" role="3uHU7B">
                  <ref role="3cqZAo" node="1yZMluZ2mqC" resolve="aspectClass" />
                </node>
              </node>
              <node concept="3clFbS" id="1yZMluZ2mqK" role="3clFbx">
                <node concept="3cpWs6" id="1yZMluZ2mqL" role="3cqZAp">
                  <node concept="10QFUN" id="1yZMluZ2mqM" role="3cqZAk">
                    <node concept="16syzq" id="1yZMluZ2mqN" role="10QFUM">
                      <ref role="16sUi3" node="1yZMluZ2mr3" resolve="T" />
                    </node>
                    <node concept="1nCR9W" id="1yZMluZ2mqO" role="10QFUP">
                      <property role="1nD$Q0" value="plugin.FacetAspectDescriptor" />
                      <node concept="3uibUv" id="6ymW8j2Ve5I" role="2lIhxL">
                        <ref role="3uigEE" to="ze1i:~MakeAspectDescriptor" resolve="MakeAspectDescriptor" />
                      </node>
                      <node concept="17Uvod" id="1yZMluZ2mqQ" role="lGtFl">
                        <property role="2qtEX9" value="fqClassName" />
                        <property role="P4ACc" value="df345b11-b8c7-4213-ac66-48d2a9b75d88/1173996401517/1173996588177" />
                        <node concept="3zFVjK" id="1yZMluZ2mqR" role="3zH0cK">
                          <node concept="3clFbS" id="1yZMluZ2mqS" role="2VODD2">
                            <node concept="3clFbF" id="1yZMluZ2mqT" role="3cqZAp">
                              <node concept="3cpWs3" id="1yZMluZ2mqU" role="3clFbG">
                                <node concept="Xl_RD" id="1yZMluZ2mqV" role="3uHU7w">
                                  <property role="Xl_RC" value=".FacetAspectDescriptor" />
                                </node>
                                <node concept="2OqwBi" id="1yZMluZ2mqW" role="3uHU7B">
                                  <node concept="30H73N" id="1yZMluZ2mqX" role="2Oq$k0" />
                                  <node concept="3TrcHB" id="1yZMluZ2mqY" role="2OqNvi">
                                    <ref role="3TsBF5" to="hypd:5xDtKQA7vSI" resolve="qualifiedName" />
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
              <node concept="raruj" id="1yZMluZ2mqZ" role="lGtFl" />
            </node>
            <node concept="3cpWs6" id="1yZMluZ2mr0" role="3cqZAp">
              <node concept="10Nm6u" id="1yZMluZ2mr1" role="3cqZAk" />
            </node>
          </node>
          <node concept="3Tm1VV" id="1yZMluZ2mr2" role="1B3o_S" />
          <node concept="16euLQ" id="1yZMluZ2mr3" role="16eVyc">
            <property role="TrG5h" value="T" />
            <node concept="3uibUv" id="4r8JClTjQT3" role="3ztrMU">
              <ref role="3uigEE" to="ze1i:~ILanguageAspect" resolve="ILanguageAspect" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3aamgX" id="5oi4Ew1Ucxt" role="3aUrZf">
      <ref role="30HIoZ" to="hypd:5xDtKQA7vSB" resolve="ModelReference" />
      <node concept="1Koe21" id="5oi4Ew1Uktf" role="1lVwrX">
        <node concept="3clFb_" id="5oi4Ew1UkBq" role="1Koe22">
          <property role="1EzhhJ" value="false" />
          <property role="TrG5h" value="createAspectDescriptor" />
          <property role="od$2w" value="false" />
          <property role="DiZV1" value="false" />
          <node concept="16syzq" id="5oi4Ew1UkBr" role="3clF45">
            <ref role="16sUi3" node="5oi4Ew1UkBR" resolve="T" />
          </node>
          <node concept="37vLTG" id="5oi4Ew1UkBs" role="3clF46">
            <property role="TrG5h" value="aspectClass" />
            <node concept="3uibUv" id="5oi4Ew1UkBt" role="1tU5fm">
              <ref role="3uigEE" to="wyt6:~Class" resolve="Class" />
              <node concept="16syzq" id="5oi4Ew1UkBu" role="11_B2D">
                <ref role="16sUi3" node="5oi4Ew1UkBR" resolve="T" />
              </node>
            </node>
          </node>
          <node concept="3clFbS" id="5oi4Ew1UkBv" role="3clF47">
            <node concept="3clFbJ" id="5oi4Ew1UkBw" role="3cqZAp">
              <node concept="3clFbC" id="5oi4Ew1UkBx" role="3clFbw">
                <node concept="3VsKOn" id="5oi4Ew1UkBy" role="3uHU7w">
                  <ref role="3VsUkX" to="91lp:~IntentionAspectDescriptor" resolve="IntentionAspectDescriptor" />
                </node>
                <node concept="37vLTw" id="5oi4Ew1UkBz" role="3uHU7B">
                  <ref role="3cqZAo" node="5oi4Ew1UkBs" resolve="aspectClass" />
                </node>
              </node>
              <node concept="3clFbS" id="5oi4Ew1UkB$" role="3clFbx">
                <node concept="3cpWs6" id="5oi4Ew1UkB_" role="3cqZAp">
                  <node concept="10QFUN" id="5oi4Ew1UkBA" role="3cqZAk">
                    <node concept="16syzq" id="5oi4Ew1UkBB" role="10QFUM">
                      <ref role="16sUi3" node="5oi4Ew1UkBR" resolve="T" />
                    </node>
                    <node concept="1nCR9W" id="5oi4Ew1UkBC" role="10QFUP">
                      <property role="1nD$Q0" value="intention.IntentionsDescriptor" />
                      <node concept="3uibUv" id="5oi4Ew1Ul4f" role="2lIhxL">
                        <ref role="3uigEE" to="91lp:~IntentionAspectDescriptor" resolve="IntentionAspectDescriptor" />
                      </node>
                      <node concept="17Uvod" id="5oi4Ew1UkBE" role="lGtFl">
                        <property role="2qtEX9" value="fqClassName" />
                        <property role="P4ACc" value="df345b11-b8c7-4213-ac66-48d2a9b75d88/1173996401517/1173996588177" />
                        <node concept="3zFVjK" id="5oi4Ew1UkBF" role="3zH0cK">
                          <node concept="3clFbS" id="5oi4Ew1UkBG" role="2VODD2">
                            <node concept="3clFbF" id="5oi4Ew1UkBH" role="3cqZAp">
                              <node concept="3cpWs3" id="5oi4Ew1UkBI" role="3clFbG">
                                <node concept="Xl_RD" id="5oi4Ew1UkBJ" role="3uHU7w">
                                  <property role="Xl_RC" value=".IntentionsDescriptor" />
                                </node>
                                <node concept="2OqwBi" id="5oi4Ew1UkBK" role="3uHU7B">
                                  <node concept="30H73N" id="5oi4Ew1UkBL" role="2Oq$k0" />
                                  <node concept="3TrcHB" id="5oi4Ew1UkBM" role="2OqNvi">
                                    <ref role="3TsBF5" to="hypd:5xDtKQA7vSI" resolve="qualifiedName" />
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
              <node concept="raruj" id="5oi4Ew1UkBN" role="lGtFl" />
            </node>
            <node concept="3cpWs6" id="5oi4Ew1UkBO" role="3cqZAp">
              <node concept="10Nm6u" id="5oi4Ew1UkBP" role="3cqZAk" />
            </node>
          </node>
          <node concept="3Tm1VV" id="5oi4Ew1UkBQ" role="1B3o_S" />
          <node concept="16euLQ" id="5oi4Ew1UkBR" role="16eVyc">
            <property role="TrG5h" value="T" />
            <node concept="3uibUv" id="5oi4Ew1UkBS" role="3ztrMU">
              <ref role="3uigEE" to="ze1i:~ILanguageAspect" resolve="ILanguageAspect" />
            </node>
          </node>
        </node>
      </node>
      <node concept="30G5F_" id="5oi4Ew1UhfJ" role="30HLyM">
        <node concept="3clFbS" id="5oi4Ew1UhfK" role="2VODD2">
          <node concept="3cpWs8" id="5oi4Ew1UhkI" role="3cqZAp">
            <node concept="3cpWsn" id="5oi4Ew1UhkJ" role="3cpWs9">
              <property role="TrG5h" value="aspectModel" />
              <node concept="2OqwBi" id="5oi4Ew1UhkK" role="33vP2m">
                <node concept="Rm8GO" id="5oi4Ew1UhCz" role="2Oq$k0">
                  <ref role="Rm8GQ" to="w1kc:~LanguageAspect.INTENTIONS" resolve="INTENTIONS" />
                  <ref role="1Px2BO" to="w1kc:~LanguageAspect" resolve="LanguageAspect" />
                </node>
                <node concept="liA8E" id="5oi4Ew1UhkM" role="2OqNvi">
                  <ref role="37wK5l" to="w1kc:~LanguageAspect.get(jetbrains.mps.smodel.Language):org.jetbrains.mps.openapi.model.SModel" resolve="get" />
                  <node concept="2OqwBi" id="5oi4Ew1UhkN" role="37wK5m">
                    <node concept="1iwH7S" id="5oi4Ew1UhkO" role="2Oq$k0" />
                    <node concept="3cR$yn" id="5oi4Ew1UhkP" role="2OqNvi">
                      <ref role="3cRzXn" node="227lWzxTzAl" resolve="langModule" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3uibUv" id="5oi4Ew1UhkQ" role="1tU5fm">
                <ref role="3uigEE" to="mhbf:~SModel" resolve="SModel" />
              </node>
            </node>
          </node>
          <node concept="3clFbJ" id="5oi4Ew1UhkR" role="3cqZAp">
            <node concept="3clFbS" id="5oi4Ew1UhkS" role="3clFbx">
              <node concept="3cpWs6" id="5oi4Ew1UhkT" role="3cqZAp">
                <node concept="3clFbT" id="5oi4Ew1UhkU" role="3cqZAk">
                  <property role="3clFbU" value="false" />
                </node>
              </node>
            </node>
            <node concept="22lmx$" id="5oi4Ew1UhkV" role="3clFbw">
              <node concept="3clFbC" id="5oi4Ew1UhkW" role="3uHU7B">
                <node concept="37vLTw" id="5oi4Ew1UhkX" role="3uHU7B">
                  <ref role="3cqZAo" node="5oi4Ew1UhkJ" resolve="aspectModel" />
                </node>
                <node concept="10Nm6u" id="5oi4Ew1UhkY" role="3uHU7w" />
              </node>
              <node concept="3fqX7Q" id="5oi4Ew1UhkZ" role="3uHU7w">
                <node concept="2OqwBi" id="5oi4Ew1Uhl0" role="3fr31v">
                  <node concept="2OqwBi" id="5oi4Ew1Uhl1" role="2Oq$k0">
                    <node concept="2OqwBi" id="5oi4Ew1Uhl2" role="2Oq$k0">
                      <node concept="37vLTw" id="5oi4Ew1Uhl3" role="2Oq$k0">
                        <ref role="3cqZAo" node="5oi4Ew1UhkJ" resolve="aspectModel" />
                      </node>
                      <node concept="liA8E" id="5oi4Ew1Uhl4" role="2OqNvi">
                        <ref role="37wK5l" to="mhbf:~SModel.getRootNodes():java.lang.Iterable" resolve="getRootNodes" />
                      </node>
                    </node>
                    <node concept="liA8E" id="5oi4Ew1Uhl5" role="2OqNvi">
                      <ref role="37wK5l" to="wyt6:~Iterable.iterator():java.util.Iterator" resolve="iterator" />
                    </node>
                  </node>
                  <node concept="liA8E" id="5oi4Ew1Uhl6" role="2OqNvi">
                    <ref role="37wK5l" to="33ny:~Iterator.hasNext():boolean" resolve="hasNext" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3cpWs6" id="5oi4Ew1UhTY" role="3cqZAp">
            <node concept="2OqwBi" id="5oi4Ew1UiCZ" role="3cqZAk">
              <node concept="2OqwBi" id="5oi4Ew1UihR" role="2Oq$k0">
                <node concept="37vLTw" id="5oi4Ew1Ui7h" role="2Oq$k0">
                  <ref role="3cqZAo" node="5oi4Ew1UhkJ" resolve="aspectModel" />
                </node>
                <node concept="liA8E" id="5oi4Ew1UiwA" role="2OqNvi">
                  <ref role="37wK5l" to="mhbf:~SModel.getReference():org.jetbrains.mps.openapi.model.SModelReference" resolve="getReference" />
                </node>
              </node>
              <node concept="liA8E" id="5oi4Ew1UiPl" role="2OqNvi">
                <ref role="37wK5l" to="wyt6:~Object.equals(java.lang.Object):boolean" resolve="equals" />
                <node concept="2OqwBi" id="5oi4Ew1Uj3J" role="37wK5m">
                  <node concept="1iwH7S" id="5oi4Ew1UiX$" role="2Oq$k0" />
                  <node concept="3cR$yn" id="5oi4Ew1UjgY" role="2OqNvi">
                    <ref role="3cRzXn" node="227lWzxWwEv" resolve="modelRef" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3aamgX" id="5c5EsYbmIDy" role="3aUrZf">
      <ref role="30HIoZ" to="hypd:5xDtKQA7vSB" resolve="ModelReference" />
      <node concept="1Koe21" id="5c5EsYbmIDz" role="1lVwrX">
        <node concept="3clFb_" id="5c5EsYbmID$" role="1Koe22">
          <property role="1EzhhJ" value="false" />
          <property role="TrG5h" value="createAspectDescriptor" />
          <property role="od$2w" value="false" />
          <property role="DiZV1" value="false" />
          <node concept="16syzq" id="5c5EsYbmID_" role="3clF45">
            <ref role="16sUi3" node="5c5EsYbmIE1" resolve="T" />
          </node>
          <node concept="37vLTG" id="5c5EsYbmIDA" role="3clF46">
            <property role="TrG5h" value="aspectClass" />
            <node concept="3uibUv" id="5c5EsYbmIDB" role="1tU5fm">
              <ref role="3uigEE" to="wyt6:~Class" resolve="Class" />
              <node concept="16syzq" id="5c5EsYbmIDC" role="11_B2D">
                <ref role="16sUi3" node="5c5EsYbmIE1" resolve="T" />
              </node>
            </node>
          </node>
          <node concept="3clFbS" id="5c5EsYbmIDD" role="3clF47">
            <node concept="3clFbJ" id="5c5EsYbmIDE" role="3cqZAp">
              <node concept="3clFbC" id="5c5EsYbmIDF" role="3clFbw">
                <node concept="3VsKOn" id="5c5EsYbmIDG" role="3uHU7w">
                  <ref role="3VsUkX" to="nvof:~ScriptAspectDescriptor" resolve="ScriptAspectDescriptor" />
                </node>
                <node concept="37vLTw" id="5c5EsYbmIDH" role="3uHU7B">
                  <ref role="3cqZAo" node="5c5EsYbmIDA" resolve="aspectClass" />
                </node>
              </node>
              <node concept="3clFbS" id="5c5EsYbmIDI" role="3clFbx">
                <node concept="3cpWs6" id="5c5EsYbmIDJ" role="3cqZAp">
                  <node concept="10QFUN" id="5c5EsYbmIDK" role="3cqZAk">
                    <node concept="16syzq" id="5c5EsYbmIDL" role="10QFUM">
                      <ref role="16sUi3" node="5c5EsYbmIE1" resolve="T" />
                    </node>
                    <node concept="1nCR9W" id="5c5EsYbmIDM" role="10QFUP">
                      <property role="1nD$Q0" value="scripts.ScriptsDescriptor" />
                      <node concept="3uibUv" id="5c5EsYbmP_i" role="2lIhxL">
                        <ref role="3uigEE" to="nvof:~ScriptAspectDescriptor" resolve="ScriptAspectDescriptor" />
                      </node>
                      <node concept="17Uvod" id="5c5EsYbmIDO" role="lGtFl">
                        <property role="2qtEX9" value="fqClassName" />
                        <property role="P4ACc" value="df345b11-b8c7-4213-ac66-48d2a9b75d88/1173996401517/1173996588177" />
                        <node concept="3zFVjK" id="5c5EsYbmIDP" role="3zH0cK">
                          <node concept="3clFbS" id="5c5EsYbmIDQ" role="2VODD2">
                            <node concept="3clFbF" id="5c5EsYbmIDR" role="3cqZAp">
                              <node concept="3cpWs3" id="5c5EsYbmIDS" role="3clFbG">
                                <node concept="Xl_RD" id="5c5EsYbmIDT" role="3uHU7w">
                                  <property role="Xl_RC" value=".ScriptsDescriptor" />
                                </node>
                                <node concept="2OqwBi" id="5c5EsYbmIDU" role="3uHU7B">
                                  <node concept="30H73N" id="5c5EsYbmIDV" role="2Oq$k0" />
                                  <node concept="3TrcHB" id="5c5EsYbmIDW" role="2OqNvi">
                                    <ref role="3TsBF5" to="hypd:5xDtKQA7vSI" resolve="qualifiedName" />
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
              <node concept="raruj" id="5c5EsYbmIDX" role="lGtFl" />
            </node>
            <node concept="3cpWs6" id="5c5EsYbmIDY" role="3cqZAp">
              <node concept="10Nm6u" id="5c5EsYbmIDZ" role="3cqZAk" />
            </node>
          </node>
          <node concept="3Tm1VV" id="5c5EsYbmIE0" role="1B3o_S" />
          <node concept="16euLQ" id="5c5EsYbmIE1" role="16eVyc">
            <property role="TrG5h" value="T" />
            <node concept="3uibUv" id="5c5EsYbmIE2" role="3ztrMU">
              <ref role="3uigEE" to="ze1i:~ILanguageAspect" resolve="ILanguageAspect" />
            </node>
          </node>
        </node>
      </node>
      <node concept="30G5F_" id="5c5EsYbmIE3" role="30HLyM">
        <node concept="3clFbS" id="5c5EsYbmIE4" role="2VODD2">
          <node concept="3cpWs8" id="5c5EsYbmIE5" role="3cqZAp">
            <node concept="3cpWsn" id="5c5EsYbmIE6" role="3cpWs9">
              <property role="TrG5h" value="aspectModel" />
              <node concept="2OqwBi" id="5c5EsYbmIE7" role="33vP2m">
                <node concept="Rm8GO" id="5c5EsYbmJtr" role="2Oq$k0">
                  <ref role="Rm8GQ" to="w1kc:~LanguageAspect.SCRIPTS" resolve="SCRIPTS" />
                  <ref role="1Px2BO" to="w1kc:~LanguageAspect" resolve="LanguageAspect" />
                </node>
                <node concept="liA8E" id="5c5EsYbmIE9" role="2OqNvi">
                  <ref role="37wK5l" to="w1kc:~LanguageAspect.get(jetbrains.mps.smodel.Language):org.jetbrains.mps.openapi.model.SModel" resolve="get" />
                  <node concept="2OqwBi" id="5c5EsYbmIEa" role="37wK5m">
                    <node concept="1iwH7S" id="5c5EsYbmIEb" role="2Oq$k0" />
                    <node concept="3cR$yn" id="5c5EsYbmIEc" role="2OqNvi">
                      <ref role="3cRzXn" node="227lWzxTzAl" resolve="langModule" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3uibUv" id="5c5EsYbmIEd" role="1tU5fm">
                <ref role="3uigEE" to="mhbf:~SModel" resolve="SModel" />
              </node>
            </node>
          </node>
          <node concept="3clFbJ" id="5c5EsYbmIEe" role="3cqZAp">
            <node concept="3clFbS" id="5c5EsYbmIEf" role="3clFbx">
              <node concept="3cpWs6" id="5c5EsYbmIEg" role="3cqZAp">
                <node concept="3clFbT" id="5c5EsYbmIEh" role="3cqZAk">
                  <property role="3clFbU" value="false" />
                </node>
              </node>
            </node>
            <node concept="22lmx$" id="5c5EsYbmIEi" role="3clFbw">
              <node concept="3clFbC" id="5c5EsYbmIEj" role="3uHU7B">
                <node concept="37vLTw" id="5c5EsYbmIEk" role="3uHU7B">
                  <ref role="3cqZAo" node="5c5EsYbmIE6" resolve="aspectModel" />
                </node>
                <node concept="10Nm6u" id="5c5EsYbmIEl" role="3uHU7w" />
              </node>
              <node concept="3fqX7Q" id="5c5EsYbmIEm" role="3uHU7w">
                <node concept="2OqwBi" id="5c5EsYbmIEn" role="3fr31v">
                  <node concept="2OqwBi" id="5c5EsYbmIEo" role="2Oq$k0">
                    <node concept="2OqwBi" id="5c5EsYbmIEp" role="2Oq$k0">
                      <node concept="37vLTw" id="5c5EsYbmIEq" role="2Oq$k0">
                        <ref role="3cqZAo" node="5c5EsYbmIE6" resolve="aspectModel" />
                      </node>
                      <node concept="liA8E" id="5c5EsYbmIEr" role="2OqNvi">
                        <ref role="37wK5l" to="mhbf:~SModel.getRootNodes():java.lang.Iterable" resolve="getRootNodes" />
                      </node>
                    </node>
                    <node concept="liA8E" id="5c5EsYbmIEs" role="2OqNvi">
                      <ref role="37wK5l" to="wyt6:~Iterable.iterator():java.util.Iterator" resolve="iterator" />
                    </node>
                  </node>
                  <node concept="liA8E" id="5c5EsYbmIEt" role="2OqNvi">
                    <ref role="37wK5l" to="33ny:~Iterator.hasNext():boolean" resolve="hasNext" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3cpWs6" id="5c5EsYbmIEu" role="3cqZAp">
            <node concept="2OqwBi" id="5c5EsYbmIEv" role="3cqZAk">
              <node concept="2OqwBi" id="5c5EsYbmIEw" role="2Oq$k0">
                <node concept="37vLTw" id="5c5EsYbmIEx" role="2Oq$k0">
                  <ref role="3cqZAo" node="5c5EsYbmIE6" resolve="aspectModel" />
                </node>
                <node concept="liA8E" id="5c5EsYbmIEy" role="2OqNvi">
                  <ref role="37wK5l" to="mhbf:~SModel.getReference():org.jetbrains.mps.openapi.model.SModelReference" resolve="getReference" />
                </node>
              </node>
              <node concept="liA8E" id="5c5EsYbmIEz" role="2OqNvi">
                <ref role="37wK5l" to="wyt6:~Object.equals(java.lang.Object):boolean" resolve="equals" />
                <node concept="2OqwBi" id="5c5EsYbmIE$" role="37wK5m">
                  <node concept="1iwH7S" id="5c5EsYbmIE_" role="2Oq$k0" />
                  <node concept="3cR$yn" id="5c5EsYbmIEA" role="2OqNvi">
                    <ref role="3cRzXn" node="227lWzxWwEv" resolve="modelRef" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="b5Tf3" id="1KHvivZKmyl" role="jxRDz" />
  </node>
  <node concept="jVnub" id="1KHvivZJsL7">
    <property role="TrG5h" value="InstantiateAspectDescriptor" />
    <node concept="1N15co" id="1KHvivZJ$Gx" role="1s_3oS">
      <property role="TrG5h" value="model" />
      <node concept="H_c77" id="1KHvivZJ$GD" role="1N15GL" />
    </node>
    <node concept="b5Tf3" id="1KHvivZJ$GI" role="jxRDz" />
  </node>
  <node concept="312cEu" id="1uh_eNRS9l4">
    <property role="TrG5h" value="Generator" />
    <node concept="3uibUv" id="5Dlzt79RINl" role="1zkMxy">
      <ref role="3uigEE" to="r99j:~TemplateModuleBase" resolve="TemplateModuleBase" />
    </node>
    <node concept="3Tm1VV" id="1uh_eNRS9l5" role="1B3o_S" />
    <node concept="n94m4" id="1uh_eNRS9la" role="lGtFl">
      <ref role="n9lRv" to="hypd:5xDtKQA7vSx" resolve="Generator" />
    </node>
    <node concept="17Uvod" id="1uh_eNRSFzm" role="lGtFl">
      <property role="2qtEX9" value="name" />
      <property role="P4ACc" value="ceab5195-25ea-4f22-9b92-103b95ca8c0c/1169194658468/1169194664001" />
      <node concept="3zFVjK" id="1uh_eNRSFzn" role="3zH0cK">
        <node concept="3clFbS" id="1uh_eNRSFzo" role="2VODD2">
          <node concept="3cpWs8" id="1uh_eNRSFzA" role="3cqZAp">
            <node concept="3cpWsn" id="1uh_eNRSFzB" role="3cpWs9">
              <property role="TrG5h" value="l" />
              <node concept="3Tqbb2" id="1uh_eNRSFzC" role="1tU5fm">
                <ref role="ehGHo" to="hypd:5xDtKQA7vSv" resolve="Language" />
              </node>
              <node concept="1PxgMI" id="1uh_eNRSFzD" role="33vP2m">
                <ref role="1PxNhF" to="hypd:5xDtKQA7vSv" resolve="Language" />
                <node concept="2OqwBi" id="1uh_eNRSFzE" role="1PxMeX">
                  <node concept="30H73N" id="1uh_eNRSFzF" role="2Oq$k0" />
                  <node concept="1mfA1w" id="1uh_eNRSFzG" role="2OqNvi" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbF" id="1uh_eNRSFzN" role="3cqZAp">
            <node concept="3K4zz7" id="1uh_eNRSG0R" role="3clFbG">
              <node concept="Xl_RD" id="1uh_eNRSG0V" role="3K4E3e">
                <property role="Xl_RC" value="Generator" />
              </node>
              <node concept="3cpWs3" id="1jOtBURDz_q" role="3K4GZi">
                <node concept="Xl_RD" id="1uh_eNRSG0W" role="3uHU7B">
                  <property role="Xl_RC" value="Generator" />
                </node>
                <node concept="2OqwBi" id="1jOtBURDFzx" role="3uHU7w">
                  <node concept="2OqwBi" id="1jOtBURDz_u" role="2Oq$k0">
                    <node concept="37vLTw" id="3GM_nagTwPv" role="2Oq$k0">
                      <ref role="3cqZAo" node="1uh_eNRSFzB" resolve="l" />
                    </node>
                    <node concept="3Tsc0h" id="1jOtBURDFzw" role="2OqNvi">
                      <ref role="3TtcxE" to="hypd:5xDtKQA7vSR" />
                    </node>
                  </node>
                  <node concept="2WmjW8" id="1jOtBURDFz_" role="2OqNvi">
                    <node concept="30H73N" id="1jOtBURDFzB" role="25WWJ7" />
                  </node>
                </node>
              </node>
              <node concept="3clFbC" id="1uh_eNRSG0N" role="3K4Cdx">
                <node concept="3cmrfG" id="1uh_eNRSG0Q" role="3uHU7w">
                  <property role="3cmrfH" value="1" />
                </node>
                <node concept="2OqwBi" id="1uh_eNRSFzU" role="3uHU7B">
                  <node concept="2OqwBi" id="1uh_eNRSFzP" role="2Oq$k0">
                    <node concept="37vLTw" id="3GM_nagTwC_" role="2Oq$k0">
                      <ref role="3cqZAo" node="1uh_eNRSFzB" resolve="l" />
                    </node>
                    <node concept="3Tsc0h" id="1uh_eNRSFzT" role="2OqNvi">
                      <ref role="3TtcxE" to="hypd:5xDtKQA7vSR" />
                    </node>
                  </node>
                  <node concept="34oBXx" id="1uh_eNRSFzY" role="2OqNvi" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="Wx3nA" id="6BKcJ8DYH5s" role="jymVt">
      <property role="TrG5h" value="MODULE_REF" />
      <node concept="3Tm1VV" id="6BKcJ8DYH5t" role="1B3o_S" />
      <node concept="17QB3L" id="3yzCghJAHbT" role="1tU5fm" />
      <node concept="Xl_RD" id="6BKcJ8DYH5w" role="33vP2m">
        <property role="Xl_RC" value="module.reference" />
        <node concept="17Uvod" id="6BKcJ8DYH5x" role="lGtFl">
          <property role="2qtEX9" value="value" />
          <property role="P4ACc" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1070475926800/1070475926801" />
          <node concept="3zFVjK" id="6BKcJ8DYH5y" role="3zH0cK">
            <node concept="3clFbS" id="6BKcJ8DYH5z" role="2VODD2">
              <node concept="3clFbF" id="6BKcJ8DYH5$" role="3cqZAp">
                <node concept="2OqwBi" id="6BKcJ8DYH5_" role="3clFbG">
                  <node concept="30H73N" id="6BKcJ8DYH5B" role="2Oq$k0" />
                  <node concept="2qgKlT" id="6BKcJ8DYH5D" role="2OqNvi">
                    <ref role="37wK5l" to="wev6:7OJukvJ5PmG" resolve="getModuleReference" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="312cEg" id="7F8vtoiSlrp" role="jymVt">
      <property role="TrG5h" value="sourceLanguage" />
      <property role="3TUv4t" value="true" />
      <node concept="3Tm6S6" id="7F8vtoiSlrq" role="1B3o_S" />
      <node concept="3uibUv" id="7F8vtoiSlry" role="1tU5fm">
        <ref role="3uigEE" node="7OJukvJ5j$M" resolve="Language" />
      </node>
    </node>
    <node concept="312cEg" id="1_4jpH9nWCz" role="jymVt">
      <property role="TrG5h" value="priorities" />
      <property role="3TUv4t" value="true" />
      <node concept="3Tm6S6" id="1_4jpH9nWC$" role="1B3o_S" />
      <node concept="3uibUv" id="1_4jpH9nWCA" role="1tU5fm">
        <ref role="3uigEE" to="33ny:~Collection" resolve="Collection" />
        <node concept="3uibUv" id="1_4jpH9nWCC" role="11_B2D">
          <ref role="3uigEE" to="r99j:~TemplateMappingPriorityRule" resolve="TemplateMappingPriorityRule" />
        </node>
      </node>
      <node concept="1W57fq" id="1_4jpH9nWCE" role="lGtFl">
        <node concept="3IZrLx" id="1_4jpH9nWCF" role="3IZSJc">
          <node concept="3clFbS" id="1_4jpH9nWCG" role="2VODD2">
            <node concept="3clFbF" id="1_4jpH9nWCH" role="3cqZAp">
              <node concept="2OqwBi" id="1_4jpH9o4AM" role="3clFbG">
                <node concept="2OqwBi" id="1_4jpH9nWCJ" role="2Oq$k0">
                  <node concept="30H73N" id="1_4jpH9nWCI" role="2Oq$k0" />
                  <node concept="3Tsc0h" id="1_4jpH9o4AL" role="2OqNvi">
                    <ref role="3TtcxE" to="hypd:1AZH1sZHi4b" />
                  </node>
                </node>
                <node concept="3GX2aA" id="1_4jpH9o4AQ" role="2OqNvi" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="312cEg" id="15qhGW3fq$s" role="jymVt">
      <property role="TrG5h" value="referencedGenerators" />
      <property role="3TUv4t" value="true" />
      <node concept="3Tm6S6" id="15qhGW3fq$t" role="1B3o_S" />
      <node concept="3uibUv" id="15qhGW3fyyN" role="1tU5fm">
        <ref role="3uigEE" to="33ny:~Collection" resolve="Collection" />
        <node concept="3uibUv" id="15qhGW3fExE" role="11_B2D">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="1W57fq" id="15qhGW3fq$$" role="lGtFl">
        <node concept="3IZrLx" id="15qhGW3fq$_" role="3IZSJc">
          <node concept="3clFbS" id="15qhGW3fq$A" role="2VODD2">
            <node concept="3clFbF" id="15qhGW3fq$D" role="3cqZAp">
              <node concept="2OqwBi" id="15qhGW3fyyI" role="3clFbG">
                <node concept="2OqwBi" id="15qhGW3fq$F" role="2Oq$k0">
                  <node concept="30H73N" id="15qhGW3fq$E" role="2Oq$k0" />
                  <node concept="3Tsc0h" id="15qhGW3fyyH" role="2OqNvi">
                    <ref role="3TtcxE" to="hypd:1AZH1sZHi4f" />
                  </node>
                </node>
                <node concept="3GX2aA" id="15qhGW3fyyM" role="2OqNvi" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="312cEg" id="5LsHsRgAqee" role="jymVt">
      <property role="TrG5h" value="models" />
      <property role="3TUv4t" value="false" />
      <node concept="3Tm6S6" id="5LsHsRgAqef" role="1B3o_S" />
      <node concept="3uibUv" id="5LsHsRgAqei" role="1tU5fm">
        <ref role="3uigEE" to="33ny:~Collection" resolve="Collection" />
        <node concept="3uibUv" id="5LsHsRgAqem" role="11_B2D">
          <ref role="3uigEE" to="r99j:~TemplateModel" resolve="TemplateModel" />
        </node>
      </node>
      <node concept="1W57fq" id="5LsHsRgAqeq" role="lGtFl">
        <node concept="3IZrLx" id="5LsHsRgAqer" role="3IZSJc">
          <node concept="3clFbS" id="5LsHsRgAqes" role="2VODD2">
            <node concept="3clFbF" id="5LsHsRgAqeu" role="3cqZAp">
              <node concept="2OqwBi" id="5LsHsRgAqe_" role="3clFbG">
                <node concept="2OqwBi" id="5LsHsRgAqew" role="2Oq$k0">
                  <node concept="30H73N" id="5LsHsRgAqev" role="2Oq$k0" />
                  <node concept="3Tsc0h" id="5LsHsRgAqe$" role="2OqNvi">
                    <ref role="3TtcxE" to="hypd:5xDtKQA7vSF" />
                  </node>
                </node>
                <node concept="3GX2aA" id="5LsHsRgAqeD" role="2OqNvi" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="4XB9Qx8VQCX" role="jymVt" />
    <node concept="3clFbW" id="1uh_eNRS9l6" role="jymVt">
      <node concept="3cqZAl" id="1uh_eNRS9l7" role="3clF45" />
      <node concept="3Tm1VV" id="1uh_eNRS9l8" role="1B3o_S" />
      <node concept="3clFbS" id="1uh_eNRS9l9" role="3clF47">
        <node concept="3clFbF" id="7F8vtoiSlrK" role="3cqZAp">
          <node concept="37vLTI" id="7F8vtoiSls3" role="3clFbG">
            <node concept="2OqwBi" id="7F8vtoiSlrM" role="37vLTJ">
              <node concept="Xjq3P" id="7F8vtoiSlrL" role="2Oq$k0" />
              <node concept="2OwXpG" id="7F8vtoiSlrW" role="2OqNvi">
                <ref role="2Oxat5" node="7F8vtoiSlrp" resolve="sourceLanguage" />
              </node>
            </node>
            <node concept="37vLTw" id="2BHiRxghflL" role="37vLTx">
              <ref role="3cqZAo" node="7F8vtoiSlr5" resolve="sourceLanguage" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1_4jpH9o4AR" role="3cqZAp">
          <node concept="37vLTI" id="1_4jpH9o4AT" role="3clFbG">
            <node concept="37vLTw" id="2BHiRxeudDJ" role="37vLTJ">
              <ref role="3cqZAo" node="1_4jpH9nWCz" resolve="priorities" />
            </node>
            <node concept="2YIFZM" id="1_4jpH9o4AX" role="37vLTx">
              <ref role="37wK5l" to="r99j:~TemplateUtil.asCollection(java.lang.Object...):java.util.Collection" resolve="asCollection" />
              <ref role="1Pybhc" to="r99j:~TemplateUtil" resolve="TemplateUtil" />
              <node concept="2YIFZM" id="1_4jpH9o4AZ" role="37wK5m">
                <ref role="37wK5l" to="r99j:~TemplateUtil.createBeforeOrTogetherRule(jetbrains.mps.generator.runtime.TemplateMappingConfigRef,jetbrains.mps.generator.runtime.TemplateMappingConfigRef):jetbrains.mps.generator.runtime.TemplateMappingPriorityRule" resolve="createBeforeOrTogetherRule" />
                <ref role="1Pybhc" to="r99j:~TemplateUtil" resolve="TemplateUtil" />
                <node concept="10Nm6u" id="1_4jpH9o4B0" role="37wK5m" />
                <node concept="10Nm6u" id="1_4jpH9o4B3" role="37wK5m" />
                <node concept="2b32R4" id="2TxoddSUAv9" role="lGtFl">
                  <node concept="3JmXsc" id="2TxoddSUAvb" role="2P8S$">
                    <node concept="3clFbS" id="2TxoddSUAvc" role="2VODD2">
                      <node concept="3clFbF" id="2TxoddSUAvd" role="3cqZAp">
                        <node concept="2OqwBi" id="2TxoddSUAve" role="3clFbG">
                          <node concept="30H73N" id="2TxoddSUAvf" role="2Oq$k0" />
                          <node concept="3Tsc0h" id="2TxoddSUAvg" role="2OqNvi">
                            <ref role="3TtcxE" to="hypd:1AZH1sZHi4b" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="1W57fq" id="1_4jpH9o4Bx" role="lGtFl">
            <node concept="3IZrLx" id="1_4jpH9o4By" role="3IZSJc">
              <node concept="3clFbS" id="1_4jpH9o4Bz" role="2VODD2">
                <node concept="3clFbF" id="1_4jpH9o4B_" role="3cqZAp">
                  <node concept="2OqwBi" id="1_4jpH9o4BG" role="3clFbG">
                    <node concept="2OqwBi" id="1_4jpH9o4BB" role="2Oq$k0">
                      <node concept="30H73N" id="1_4jpH9o4BA" role="2Oq$k0" />
                      <node concept="3Tsc0h" id="1_4jpH9o4BF" role="2OqNvi">
                        <ref role="3TtcxE" to="hypd:1AZH1sZHi4b" />
                      </node>
                    </node>
                    <node concept="3GX2aA" id="1_4jpH9o4BK" role="2OqNvi" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="15qhGW3fE0E" role="3cqZAp">
          <node concept="37vLTI" id="15qhGW3fE0I" role="3clFbG">
            <node concept="37vLTw" id="2BHiRxeuMz6" role="37vLTJ">
              <ref role="3cqZAo" node="15qhGW3fq$s" resolve="referencedGenerators" />
            </node>
            <node concept="2YIFZM" id="15qhGW3fE0S" role="37vLTx">
              <ref role="37wK5l" to="r99j:~TemplateUtil.asCollection(java.lang.Object...):java.util.Collection" resolve="asCollection" />
              <ref role="1Pybhc" to="r99j:~TemplateUtil" resolve="TemplateUtil" />
              <node concept="Xl_RD" id="15qhGW3fE0V" role="37wK5m">
                <property role="Xl_RC" value="language.namespace/generator.uuid" />
                <node concept="1WS0z7" id="15qhGW3fE11" role="lGtFl">
                  <node concept="3JmXsc" id="15qhGW3fE12" role="3Jn$fo">
                    <node concept="3clFbS" id="15qhGW3fE13" role="2VODD2">
                      <node concept="3clFbF" id="15qhGW3fE16" role="3cqZAp">
                        <node concept="2OqwBi" id="15qhGW3fE18" role="3clFbG">
                          <node concept="30H73N" id="15qhGW3fE17" role="2Oq$k0" />
                          <node concept="3Tsc0h" id="15qhGW3fE1c" role="2OqNvi">
                            <ref role="3TtcxE" to="hypd:1AZH1sZHi4f" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="17Uvod" id="15qhGW3fE1x" role="lGtFl">
                  <property role="2qtEX9" value="value" />
                  <property role="P4ACc" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1070475926800/1070475926801" />
                  <node concept="3zFVjK" id="15qhGW3fE1y" role="3zH0cK">
                    <node concept="3clFbS" id="15qhGW3fE1z" role="2VODD2">
                      <node concept="3cpWs8" id="15qhGW3fE29" role="3cqZAp">
                        <node concept="3cpWsn" id="15qhGW3fE2a" role="3cpWs9">
                          <property role="TrG5h" value="m" />
                          <node concept="3uibUv" id="15qhGW3fE2b" role="1tU5fm">
                            <ref role="3uigEE" to="lui2:~SModule" resolve="SModule" />
                          </node>
                          <node concept="2OqwBi" id="15qhGW3fE2d" role="33vP2m">
                            <node concept="2YIFZM" id="3Zg7qv1pGrV" role="2Oq$k0">
                              <ref role="37wK5l" to="w1kc:~ModuleRepositoryFacade.getInstance():jetbrains.mps.smodel.ModuleRepositoryFacade" resolve="getInstance" />
                              <ref role="1Pybhc" to="w1kc:~ModuleRepositoryFacade" resolve="ModuleRepositoryFacade" />
                            </node>
                            <node concept="liA8E" id="15qhGW3fE2f" role="2OqNvi">
                              <ref role="37wK5l" to="w1kc:~ModuleRepositoryFacade.getModule(org.jetbrains.mps.openapi.module.SModuleReference):org.jetbrains.mps.openapi.module.SModule" resolve="getModule" />
                              <node concept="2OqwBi" id="625yo8RO1in" role="37wK5m">
                                <node concept="2YIFZM" id="625yo8RO1io" role="2Oq$k0">
                                  <ref role="37wK5l" to="dush:~PersistenceFacade.getInstance():org.jetbrains.mps.openapi.persistence.PersistenceFacade" resolve="getInstance" />
                                  <ref role="1Pybhc" to="dush:~PersistenceFacade" resolve="PersistenceFacade" />
                                </node>
                                <node concept="liA8E" id="625yo8RO1ip" role="2OqNvi">
                                  <ref role="37wK5l" to="dush:~PersistenceFacade.createModuleReference(java.lang.String):org.jetbrains.mps.openapi.module.SModuleReference" resolve="createModuleReference" />
                                  <node concept="2OqwBi" id="625yo8RO1ik" role="37wK5m">
                                    <node concept="30H73N" id="625yo8RO1il" role="2Oq$k0" />
                                    <node concept="2qgKlT" id="625yo8RO1im" role="2OqNvi">
                                      <ref role="37wK5l" to="wev6:15qhGW3fE3K" resolve="getModuleReference" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="3clFbJ" id="15qhGW3fE2k" role="3cqZAp">
                        <node concept="3clFbS" id="15qhGW3fE2l" role="3clFbx">
                          <node concept="3cpWs8" id="15qhGW3fEvo" role="3cqZAp">
                            <node concept="3cpWsn" id="15qhGW3fEvp" role="3cpWs9">
                              <property role="TrG5h" value="g" />
                              <node concept="3uibUv" id="15qhGW3fEvq" role="1tU5fm">
                                <ref role="3uigEE" to="w1kc:~Generator" resolve="Generator" />
                              </node>
                              <node concept="10QFUN" id="15qhGW3fEvt" role="33vP2m">
                                <node concept="3uibUv" id="15qhGW3fEvw" role="10QFUM">
                                  <ref role="3uigEE" to="w1kc:~Generator" resolve="Generator" />
                                </node>
                                <node concept="37vLTw" id="3GM_nagTw9Z" role="10QFUP">
                                  <ref role="3cqZAo" node="15qhGW3fE2a" resolve="m" />
                                </node>
                              </node>
                            </node>
                          </node>
                          <node concept="3cpWs6" id="15qhGW3fEvz" role="3cqZAp">
                            <node concept="3cpWs3" id="15qhGW3fExf" role="3cqZAk">
                              <node concept="2OqwBi" id="15qhGW3fExu" role="3uHU7w">
                                <node concept="37vLTw" id="3GM_nagT_nc" role="2Oq$k0">
                                  <ref role="3cqZAo" node="15qhGW3fEvp" resolve="g" />
                                </node>
                                <node concept="liA8E" id="15qhGW3fExy" role="2OqNvi">
                                  <ref role="37wK5l" to="z1c3:~AbstractModule.getModuleName():java.lang.String" resolve="getModuleName" />
                                </node>
                              </node>
                              <node concept="3cpWs3" id="15qhGW3fExb" role="3uHU7B">
                                <node concept="2OqwBi" id="15qhGW3fEvF" role="3uHU7B">
                                  <node concept="2OqwBi" id="15qhGW3fEvA" role="2Oq$k0">
                                    <node concept="37vLTw" id="3GM_nagTv3K" role="2Oq$k0">
                                      <ref role="3cqZAo" node="15qhGW3fEvp" resolve="g" />
                                    </node>
                                    <node concept="liA8E" id="15qhGW3fEvE" role="2OqNvi">
                                      <ref role="37wK5l" to="w1kc:~Generator.getSourceLanguage():jetbrains.mps.smodel.Language" resolve="getSourceLanguage" />
                                    </node>
                                  </node>
                                  <node concept="liA8E" id="15qhGW3fExa" role="2OqNvi">
                                    <ref role="37wK5l" to="z1c3:~AbstractModule.getModuleName():java.lang.String" resolve="getModuleName" />
                                  </node>
                                </node>
                                <node concept="Xl_RD" id="15qhGW3fExe" role="3uHU7w">
                                  <property role="Xl_RC" value="/" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node concept="2ZW3vV" id="15qhGW3fE2r" role="3clFbw">
                          <node concept="3uibUv" id="15qhGW3fE2u" role="2ZW6by">
                            <ref role="3uigEE" to="w1kc:~Generator" resolve="Generator" />
                          </node>
                          <node concept="37vLTw" id="3GM_nagTxHQ" role="2ZW6bz">
                            <ref role="3cqZAo" node="15qhGW3fE2a" resolve="m" />
                          </node>
                        </node>
                        <node concept="9aQIb" id="15qhGW3fE2y" role="9aQIa">
                          <node concept="3clFbS" id="15qhGW3fE2z" role="9aQI4">
                            <node concept="3clFbF" id="15qhGW3fE2$" role="3cqZAp">
                              <node concept="2OqwBi" id="15qhGW3fE2A" role="3clFbG">
                                <node concept="1iwH7S" id="15qhGW3fE2_" role="2Oq$k0" />
                                <node concept="2k5nB$" id="15qhGW3fE2E" role="2OqNvi">
                                  <node concept="3cpWs3" id="15qhGW3fE3k" role="2k5Stb">
                                    <node concept="30H73N" id="15qhGW3fE3p" role="3uHU7w" />
                                    <node concept="Xl_RD" id="15qhGW3fE2G" role="3uHU7B">
                                      <property role="Xl_RC" value="referenced generator is not available: " />
                                    </node>
                                  </node>
                                  <node concept="30H73N" id="15qhGW3fE3n" role="2k6f33" />
                                </node>
                              </node>
                            </node>
                            <node concept="3cpWs6" id="15qhGW3fE3t" role="3cqZAp">
                              <node concept="Xl_RD" id="15qhGW3fE3v" role="3cqZAk">
                                <property role="Xl_RC" value="????" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3uibUv" id="15qhGW3fExQ" role="3PaCim">
                <ref role="3uigEE" to="wyt6:~String" resolve="String" />
              </node>
            </node>
          </node>
          <node concept="1W57fq" id="15qhGW3fE1g" role="lGtFl">
            <node concept="3IZrLx" id="15qhGW3fE1h" role="3IZSJc">
              <node concept="3clFbS" id="15qhGW3fE1i" role="2VODD2">
                <node concept="3clFbF" id="15qhGW3fE1l" role="3cqZAp">
                  <node concept="2OqwBi" id="15qhGW3fE1s" role="3clFbG">
                    <node concept="2OqwBi" id="15qhGW3fE1n" role="2Oq$k0">
                      <node concept="30H73N" id="15qhGW3fE1m" role="2Oq$k0" />
                      <node concept="3Tsc0h" id="15qhGW3fE1r" role="2OqNvi">
                        <ref role="3TtcxE" to="hypd:1AZH1sZHi4f" />
                      </node>
                    </node>
                    <node concept="3GX2aA" id="15qhGW3fE1w" role="2OqNvi" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="7F8vtoiSlr5" role="3clF46">
        <property role="TrG5h" value="sourceLanguage" />
        <node concept="3uibUv" id="7F8vtoiSlr6" role="1tU5fm">
          <ref role="3uigEE" node="7OJukvJ5j$M" resolve="Language" />
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="4rgTJDg9uCF" role="jymVt">
      <property role="IEkAT" value="false" />
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getAlias" />
      <property role="DiZV1" value="false" />
      <node concept="3Tm1VV" id="4rgTJDg9uCG" role="1B3o_S" />
      <node concept="17QB3L" id="4rgTJDg9uD6" role="3clF45" />
      <node concept="3clFbS" id="4rgTJDg9uCI" role="3clF47">
        <node concept="3clFbF" id="4rgTJDg9uCX" role="3cqZAp">
          <node concept="Xl_RD" id="4rgTJDg9uD5" role="3clFbG">
            <property role="Xl_RC" value="" />
            <node concept="17Uvod" id="4rgTJDg9uD7" role="lGtFl">
              <property role="2qtEX9" value="value" />
              <property role="P4ACc" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1070475926800/1070475926801" />
              <node concept="3zFVjK" id="4rgTJDg9uD8" role="3zH0cK">
                <node concept="3clFbS" id="4rgTJDg9uD9" role="2VODD2">
                  <node concept="3cpWs8" id="4rgTJDg9uDa" role="3cqZAp">
                    <node concept="3cpWsn" id="4rgTJDg9uDb" role="3cpWs9">
                      <property role="TrG5h" value="l" />
                      <node concept="3Tqbb2" id="4rgTJDg9uDc" role="1tU5fm">
                        <ref role="ehGHo" to="hypd:5xDtKQA7vSv" resolve="Language" />
                      </node>
                      <node concept="1PxgMI" id="4rgTJDg9uDd" role="33vP2m">
                        <ref role="1PxNhF" to="hypd:5xDtKQA7vSv" resolve="Language" />
                        <node concept="2OqwBi" id="4rgTJDg9uDe" role="1PxMeX">
                          <node concept="30H73N" id="4rgTJDg9uDf" role="2Oq$k0" />
                          <node concept="1mfA1w" id="4rgTJDg9uDg" role="2OqNvi" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="4rgTJDg9uGI" role="3cqZAp">
                    <node concept="3cpWs3" id="4rgTJDg9AER" role="3clFbG">
                      <node concept="1eOMI4" id="4rgTJDg9AEU" role="3uHU7w">
                        <node concept="3K4zz7" id="4rgTJDg9AFx" role="1eOMHV">
                          <node concept="Xl_RD" id="4rgTJDg9AF_" role="3K4E3e">
                            <property role="Xl_RC" value="&lt;no name&gt;" />
                          </node>
                          <node concept="2OqwBi" id="4rgTJDg9AFB" role="3K4GZi">
                            <node concept="30H73N" id="4rgTJDg9AFA" role="2Oq$k0" />
                            <node concept="3TrcHB" id="4rgTJDg9AFF" role="2OqNvi">
                              <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="4rgTJDg9AFs" role="3K4Cdx">
                            <node concept="2OqwBi" id="4rgTJDg9AFn" role="2Oq$k0">
                              <node concept="30H73N" id="4rgTJDg9AFm" role="2Oq$k0" />
                              <node concept="3TrcHB" id="4rgTJDg9AFr" role="2OqNvi">
                                <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                              </node>
                            </node>
                            <node concept="17RlXB" id="4rgTJDg9AFw" role="2OqNvi" />
                          </node>
                        </node>
                      </node>
                      <node concept="3cpWs3" id="4rgTJDg9AEN" role="3uHU7B">
                        <node concept="2OqwBi" id="4rgTJDg9uGK" role="3uHU7B">
                          <node concept="37vLTw" id="3GM_nagTrsN" role="2Oq$k0">
                            <ref role="3cqZAo" node="4rgTJDg9uDb" resolve="l" />
                          </node>
                          <node concept="3TrcHB" id="4rgTJDg9AEM" role="2OqNvi">
                            <ref role="3TsBF5" to="hypd:5xDtKQA7vSz" resolve="namespace" />
                          </node>
                        </node>
                        <node concept="Xl_RD" id="4rgTJDg9AEQ" role="3uHU7w">
                          <property role="Xl_RC" value="/" />
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
      <node concept="2AHcQZ" id="3yzCghJCcF5" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="2tJIrI" id="4XB9Qx8VS9o" role="jymVt" />
    <node concept="3clFb_" id="4rgTJDg9uCJ" role="jymVt">
      <property role="IEkAT" value="false" />
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getModels" />
      <property role="DiZV1" value="false" />
      <node concept="3Tm1VV" id="4rgTJDg9uCK" role="1B3o_S" />
      <node concept="3uibUv" id="4rgTJDg9uCL" role="3clF45">
        <ref role="3uigEE" to="33ny:~Collection" resolve="Collection" />
        <node concept="3uibUv" id="4rgTJDg9uCM" role="11_B2D">
          <ref role="3uigEE" to="r99j:~TemplateModel" resolve="TemplateModel" />
        </node>
      </node>
      <node concept="3clFbS" id="4rgTJDg9uCN" role="3clF47">
        <node concept="3clFbJ" id="70kYuUL5Uuh" role="3cqZAp">
          <node concept="3clFbS" id="70kYuUL5Uuj" role="3clFbx">
            <node concept="3clFbF" id="70kYuUL5UDX" role="3cqZAp">
              <node concept="37vLTI" id="70kYuUL5UUe" role="3clFbG">
                <node concept="37vLTw" id="70kYuUL5UDV" role="37vLTJ">
                  <ref role="3cqZAo" node="5LsHsRgAqee" resolve="models" />
                </node>
                <node concept="2YIFZM" id="70kYuUL6vcz" role="37vLTx">
                  <ref role="37wK5l" to="33ny:~Arrays.asList(java.lang.Object...):java.util.List" resolve="asList" />
                  <ref role="1Pybhc" to="33ny:~Arrays" resolve="Arrays" />
                  <node concept="1rXfSq" id="70kYuUL6vc$" role="37wK5m">
                    <ref role="37wK5l" to="r99j:~TemplateModuleBase.loadModel(java.lang.String):jetbrains.mps.generator.runtime.TemplateModel" resolve="loadModel" />
                    <node concept="Xl_RD" id="70kYuUL6vc_" role="37wK5m">
                      <property role="Xl_RC" value="model.TemplateModelImpl" />
                      <node concept="17Uvod" id="70kYuUL6vcA" role="lGtFl">
                        <property role="2qtEX9" value="value" />
                        <property role="P4ACc" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1070475926800/1070475926801" />
                        <node concept="3zFVjK" id="70kYuUL6vcB" role="3zH0cK">
                          <node concept="3clFbS" id="70kYuUL6vcC" role="2VODD2">
                            <node concept="3clFbF" id="70kYuUL6vcD" role="3cqZAp">
                              <node concept="3cpWs3" id="70kYuUL6vcE" role="3clFbG">
                                <node concept="2OqwBi" id="70kYuUL6vcF" role="3uHU7B">
                                  <node concept="3TrcHB" id="70kYuUL6vcG" role="2OqNvi">
                                    <ref role="3TsBF5" to="hypd:5xDtKQA7vSI" resolve="qualifiedName" />
                                  </node>
                                  <node concept="30H73N" id="70kYuUL6vcH" role="2Oq$k0" />
                                </node>
                                <node concept="Xl_RD" id="70kYuUL6vcI" role="3uHU7w">
                                  <property role="Xl_RC" value=".TemplateModelImpl" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="1WS0z7" id="70kYuUL6vcJ" role="lGtFl">
                      <node concept="3JmXsc" id="70kYuUL6vcK" role="3Jn$fo">
                        <node concept="3clFbS" id="70kYuUL6vcL" role="2VODD2">
                          <node concept="3clFbF" id="70kYuUL6vcM" role="3cqZAp">
                            <node concept="2OqwBi" id="70kYuUL6vcN" role="3clFbG">
                              <node concept="1iwH7S" id="70kYuUL6vcO" role="2Oq$k0" />
                              <node concept="1bhEwm" id="70kYuUL6vcP" role="2OqNvi">
                                <ref role="1bhEwl" node="70kYuUL64iP" resolve="templateModelNames" />
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
          <node concept="3clFbC" id="70kYuUL5UB3" role="3clFbw">
            <node concept="10Nm6u" id="70kYuUL5UCs" role="3uHU7w" />
            <node concept="37vLTw" id="70kYuUL5UwC" role="3uHU7B">
              <ref role="3cqZAo" node="5LsHsRgAqee" resolve="models" />
            </node>
          </node>
          <node concept="1W57fq" id="70kYuUL5UZ9" role="lGtFl">
            <node concept="3IZrLx" id="70kYuUL5UZc" role="3IZSJc">
              <node concept="3clFbS" id="70kYuUL5UZd" role="2VODD2">
                <node concept="3clFbF" id="5LsHsRgAClr" role="3cqZAp">
                  <node concept="2OqwBi" id="5LsHsRgACls" role="3clFbG">
                    <node concept="2OqwBi" id="5LsHsRgAClt" role="2Oq$k0">
                      <node concept="30H73N" id="5LsHsRgAClu" role="2Oq$k0" />
                      <node concept="3Tsc0h" id="5LsHsRgAClv" role="2OqNvi">
                        <ref role="3TtcxE" to="hypd:5xDtKQA7vSF" />
                      </node>
                    </node>
                    <node concept="3GX2aA" id="5LsHsRgAClw" role="2OqNvi" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="2jeGV$" id="70kYuUL64iP" role="lGtFl">
            <property role="TrG5h" value="templateModelNames" />
            <node concept="2jfdEK" id="70kYuUL64iR" role="2jfP_Y">
              <node concept="3clFbS" id="70kYuUL64iT" role="2VODD2">
                <node concept="3clFbF" id="70kYuUL65bu" role="3cqZAp">
                  <node concept="2OqwBi" id="70kYuUL6dzH" role="3clFbG">
                    <node concept="2OqwBi" id="70kYuUL65bv" role="2Oq$k0">
                      <node concept="2OqwBi" id="70kYuUL65bx" role="2Oq$k0">
                        <node concept="2OqwBi" id="70kYuUL65by" role="2Oq$k0">
                          <node concept="30H73N" id="70kYuUL65bz" role="2Oq$k0" />
                          <node concept="3Tsc0h" id="70kYuUL65b$" role="2OqNvi">
                            <ref role="3TtcxE" to="hypd:5xDtKQA7vSF" />
                          </node>
                        </node>
                        <node concept="3zZkjj" id="70kYuUL65b_" role="2OqNvi">
                          <node concept="1bVj0M" id="70kYuUL65bA" role="23t8la">
                            <node concept="3clFbS" id="70kYuUL65bB" role="1bW5cS">
                              <node concept="3clFbF" id="70kYuUL65bC" role="3cqZAp">
                                <node concept="17R0WA" id="70kYuUL65bD" role="3clFbG">
                                  <node concept="10M0yZ" id="70kYuUL65bE" role="3uHU7w">
                                    <ref role="1PxDUh" to="w1kc:~SModelStereotype" resolve="SModelStereotype" />
                                    <ref role="3cqZAo" to="w1kc:~SModelStereotype.GENERATOR" resolve="GENERATOR" />
                                  </node>
                                  <node concept="2OqwBi" id="70kYuUL65bF" role="3uHU7B">
                                    <node concept="37vLTw" id="70kYuUL65bG" role="2Oq$k0">
                                      <ref role="3cqZAo" node="70kYuUL65bI" resolve="it" />
                                    </node>
                                    <node concept="3TrcHB" id="70kYuUL65bH" role="2OqNvi">
                                      <ref role="3TsBF5" to="hypd:5LsHsRgAFYL" resolve="stereotype" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node concept="Rh6nW" id="70kYuUL65bI" role="1bW2Oz">
                              <property role="TrG5h" value="it" />
                              <node concept="2jxLKc" id="70kYuUL65bJ" role="1tU5fm" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="2S7cBI" id="70kYuUL65cz" role="2OqNvi">
                        <node concept="1bVj0M" id="70kYuUL65c$" role="23t8la">
                          <node concept="3clFbS" id="70kYuUL65c_" role="1bW5cS">
                            <node concept="3clFbF" id="70kYuUL65cA" role="3cqZAp">
                              <node concept="2OqwBi" id="70kYuUL65cB" role="3clFbG">
                                <node concept="37vLTw" id="70kYuUL65cC" role="2Oq$k0">
                                  <ref role="3cqZAo" node="70kYuUL65cE" resolve="it" />
                                </node>
                                <node concept="3TrcHB" id="70kYuUL65cD" role="2OqNvi">
                                  <ref role="3TsBF5" to="hypd:5xDtKQA7vSI" resolve="qualifiedName" />
                                </node>
                              </node>
                            </node>
                          </node>
                          <node concept="Rh6nW" id="70kYuUL65cE" role="1bW2Oz">
                            <property role="TrG5h" value="it" />
                            <node concept="2jxLKc" id="70kYuUL65cF" role="1tU5fm" />
                          </node>
                        </node>
                        <node concept="1nlBCl" id="70kYuUL65cG" role="2S7zOq">
                          <property role="3clFbU" value="true" />
                        </node>
                      </node>
                    </node>
                    <node concept="ANE8D" id="70kYuUL6dVS" role="2OqNvi" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="2I9FWS" id="70kYuUL69SQ" role="2jfP_h">
              <ref role="2I9WkF" to="hypd:5xDtKQA7vSB" resolve="ModelReference" />
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="70kYuUL5VlJ" role="3cqZAp">
          <node concept="37vLTw" id="2BHiRxeuhgP" role="3cqZAk">
            <ref role="3cqZAo" node="5LsHsRgAqee" resolve="models" />
            <node concept="1W57fq" id="5LsHsRgAClo" role="lGtFl">
              <node concept="3IZrLx" id="5LsHsRgAClp" role="3IZSJc">
                <node concept="3clFbS" id="5LsHsRgAClq" role="2VODD2">
                  <node concept="3clFbF" id="70kYuUL5Zlt" role="3cqZAp">
                    <node concept="2OqwBi" id="70kYuUL5Zlu" role="3clFbG">
                      <node concept="2OqwBi" id="70kYuUL5Zlv" role="2Oq$k0">
                        <node concept="30H73N" id="70kYuUL5Zlw" role="2Oq$k0" />
                        <node concept="3Tsc0h" id="70kYuUL5Zlx" role="2OqNvi">
                          <ref role="3TtcxE" to="hypd:5xDtKQA7vSF" />
                        </node>
                      </node>
                      <node concept="3GX2aA" id="70kYuUL5Zly" role="2OqNvi" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="gft3U" id="5LsHsRgAClx" role="UU_$l">
                <node concept="10Nm6u" id="5LsHsRgAClz" role="gfFT$" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3yzCghJCcFb" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="2tJIrI" id="4XB9Qx8VTCy" role="jymVt" />
    <node concept="3clFb_" id="4rgTJDg9uCO" role="jymVt">
      <property role="IEkAT" value="false" />
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getPriorities" />
      <property role="DiZV1" value="false" />
      <node concept="3Tm1VV" id="4rgTJDg9uCP" role="1B3o_S" />
      <node concept="3uibUv" id="4rgTJDg9uCQ" role="3clF45">
        <ref role="3uigEE" to="33ny:~Collection" resolve="Collection" />
        <node concept="3uibUv" id="1_4jpH9nWCy" role="11_B2D">
          <ref role="3uigEE" to="r99j:~TemplateMappingPriorityRule" resolve="TemplateMappingPriorityRule" />
        </node>
      </node>
      <node concept="3clFbS" id="4rgTJDg9uCS" role="3clF47">
        <node concept="3clFbF" id="1_4jpH9o4BM" role="3cqZAp">
          <node concept="37vLTw" id="2BHiRxeujZj" role="3clFbG">
            <ref role="3cqZAo" node="1_4jpH9nWCz" resolve="priorities" />
            <node concept="1W57fq" id="1_4jpH9o4BP" role="lGtFl">
              <node concept="3IZrLx" id="1_4jpH9o4BQ" role="3IZSJc">
                <node concept="3clFbS" id="1_4jpH9o4BR" role="2VODD2">
                  <node concept="3clFbF" id="1_4jpH9o4BS" role="3cqZAp">
                    <node concept="2OqwBi" id="1_4jpH9o4BZ" role="3clFbG">
                      <node concept="2OqwBi" id="1_4jpH9o4BU" role="2Oq$k0">
                        <node concept="30H73N" id="1_4jpH9o4BT" role="2Oq$k0" />
                        <node concept="3Tsc0h" id="1_4jpH9o4BY" role="2OqNvi">
                          <ref role="3TtcxE" to="hypd:1AZH1sZHi4b" />
                        </node>
                      </node>
                      <node concept="3GX2aA" id="1_4jpH9o4C3" role="2OqNvi" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="gft3U" id="1_4jpH9o4C4" role="UU_$l">
                <node concept="10Nm6u" id="1_4jpH9o4C6" role="gfFT$" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3yzCghJCcF8" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="2tJIrI" id="4XB9Qx8VV7H" role="jymVt" />
    <node concept="3clFb_" id="4rgTJDg9uCT" role="jymVt">
      <property role="IEkAT" value="false" />
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getReference" />
      <property role="DiZV1" value="false" />
      <node concept="3Tm1VV" id="4rgTJDg9uCU" role="1B3o_S" />
      <node concept="3uibUv" id="4rgTJDg9uCV" role="3clF45">
        <ref role="3uigEE" to="lui2:~SModuleReference" resolve="SModuleReference" />
      </node>
      <node concept="3clFbS" id="4rgTJDg9uCW" role="3clF47">
        <node concept="3clFbF" id="3yzCghJAX_u" role="3cqZAp">
          <node concept="2OqwBi" id="3yzCghJBa8f" role="3clFbG">
            <node concept="2YIFZM" id="3yzCghJB3Ol" role="2Oq$k0">
              <ref role="37wK5l" to="dush:~PersistenceFacade.getInstance():org.jetbrains.mps.openapi.persistence.PersistenceFacade" resolve="getInstance" />
              <ref role="1Pybhc" to="dush:~PersistenceFacade" resolve="PersistenceFacade" />
            </node>
            <node concept="liA8E" id="3yzCghJBh7U" role="2OqNvi">
              <ref role="37wK5l" to="dush:~PersistenceFacade.createModuleReference(java.lang.String):org.jetbrains.mps.openapi.module.SModuleReference" resolve="createModuleReference" />
              <node concept="37vLTw" id="3yzCghJBnnw" role="37wK5m">
                <ref role="3cqZAo" node="6BKcJ8DYH5s" resolve="MODULE_REF" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3yzCghJCcF6" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="2tJIrI" id="2$rNyahpIqe" role="jymVt" />
    <node concept="3clFb_" id="2$rNyahpJF_" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getTargetLanguages" />
      <property role="DiZV1" value="false" />
      <property role="od$2w" value="false" />
      <node concept="3Tm1VV" id="2$rNyahpJFA" role="1B3o_S" />
      <node concept="3uibUv" id="2$rNyahpJFC" role="3clF45">
        <ref role="3uigEE" to="33ny:~Collection" resolve="Collection" />
        <node concept="3uibUv" id="2$rNyahpJFD" role="11_B2D">
          <ref role="3uigEE" to="c17a:~SLanguage" resolve="SLanguage" />
        </node>
      </node>
      <node concept="3clFbS" id="2$rNyahpJFH" role="3clF47">
        <node concept="3cpWs8" id="4XB9Qx8Un52" role="3cqZAp">
          <node concept="3cpWsn" id="4XB9Qx8Un58" role="3cpWs9">
            <property role="TrG5h" value="rv" />
            <node concept="10Q1$e" id="4XB9Qx8Un5a" role="1tU5fm">
              <node concept="3uibUv" id="4XB9Qx8Un5c" role="10Q1$1">
                <ref role="3uigEE" to="c17a:~SLanguage" resolve="SLanguage" />
              </node>
            </node>
            <node concept="2ShNRf" id="4XB9Qx8UoAy" role="33vP2m">
              <node concept="3$_iS1" id="4XB9Qx8U_Pv" role="2ShVmc">
                <node concept="3$GHV9" id="4XB9Qx8U_Pw" role="3$GQph">
                  <node concept="3cmrfG" id="4XB9Qx8UIF7" role="3$I4v7">
                    <property role="3cmrfH" value="0" />
                    <node concept="17Uvod" id="4XB9Qx8UIG_" role="lGtFl">
                      <property role="P4ACc" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580320020/1068580320021" />
                      <property role="2qtEX9" value="value" />
                      <node concept="3zFVjK" id="4XB9Qx8UIGA" role="3zH0cK">
                        <node concept="3clFbS" id="4XB9Qx8UIGB" role="2VODD2">
                          <node concept="3clFbF" id="4XB9Qx8UIZP" role="3cqZAp">
                            <node concept="2OqwBi" id="4XB9Qx8UJAd" role="3clFbG">
                              <node concept="2OqwBi" id="4XB9Qx8UJnX" role="2Oq$k0">
                                <node concept="1iwH7S" id="4XB9Qx8UIZO" role="2Oq$k0" />
                                <node concept="1bhEwm" id="4XB9Qx8UJu1" role="2OqNvi">
                                  <ref role="1bhEwl" node="4XB9Qx8UEgI" resolve="targetLanguages" />
                                </node>
                              </node>
                              <node concept="34oBXx" id="4XB9Qx8UJJM" role="2OqNvi" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3uibUv" id="4XB9Qx8U_Gh" role="3$_nBY">
                  <ref role="3uigEE" to="c17a:~SLanguage" resolve="SLanguage" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="4XB9Qx8Va5S" role="3cqZAp">
          <node concept="37vLTI" id="4XB9Qx8VbJH" role="3clFbG">
            <node concept="AH0OO" id="4XB9Qx8Vbch" role="37vLTJ">
              <node concept="3cmrfG" id="4XB9Qx8VbHX" role="AHEQo">
                <property role="3cmrfH" value="0" />
                <node concept="17Uvod" id="4XB9Qx8Vq3x" role="lGtFl">
                  <property role="P4ACc" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580320020/1068580320021" />
                  <property role="2qtEX9" value="value" />
                  <node concept="3zFVjK" id="4XB9Qx8Vq3y" role="3zH0cK">
                    <node concept="3clFbS" id="4XB9Qx8Vq3z" role="2VODD2">
                      <node concept="3clFbF" id="4XB9Qx8VqCz" role="3cqZAp">
                        <node concept="2OqwBi" id="4XB9Qx8VqIj" role="3clFbG">
                          <node concept="1iwH7S" id="4XB9Qx8VqCy" role="2Oq$k0" />
                          <node concept="1qCSth" id="4XB9Qx8VqMt" role="2OqNvi">
                            <property role="1qCSqd" value="c" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="37vLTw" id="4XB9Qx8Va5Q" role="AHHXb">
                <ref role="3cqZAo" node="4XB9Qx8Un58" resolve="rv" />
              </node>
            </node>
            <node concept="pHN19" id="2$rNyahpVVq" role="37vLTx">
              <node concept="2V$Bhx" id="2$rNyahpXef" role="2V$M_3">
                <property role="2V$B1T" value="b401a680-8325-4110-8fd3-84331ff25bef" />
                <property role="2V$B1Q" value="jetbrains.mps.lang.generator" />
                <node concept="3_AbJx" id="2$rNyahqxwa" role="lGtFl">
                  <node concept="3_AbJw" id="2$rNyahqxwc" role="3_A0Ny">
                    <node concept="3clFbS" id="2$rNyahqxwe" role="2VODD2">
                      <node concept="3clFbF" id="2$rNyahqxx7" role="3cqZAp">
                        <node concept="30H73N" id="2$rNyahqxx6" role="3clFbG" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="1WS0z7" id="4XB9Qx8VoGk" role="lGtFl">
            <property role="1qytDF" value="c" />
            <node concept="3JmXsc" id="4XB9Qx8VoGm" role="3Jn$fo">
              <node concept="3clFbS" id="4XB9Qx8VoGo" role="2VODD2">
                <node concept="3clFbF" id="4XB9Qx8VpAh" role="3cqZAp">
                  <node concept="2OqwBi" id="4XB9Qx8VpDQ" role="3clFbG">
                    <node concept="1iwH7S" id="4XB9Qx8VpAg" role="2Oq$k0" />
                    <node concept="1bhEwm" id="4XB9Qx8VpJT" role="2OqNvi">
                      <ref role="1bhEwl" node="4XB9Qx8UEgI" resolve="targetLanguages" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="2$rNyahpSaH" role="3cqZAp">
          <node concept="2YIFZM" id="2$rNyahpUGI" role="3cqZAk">
            <ref role="37wK5l" to="33ny:~Arrays.asList(java.lang.Object...):java.util.List" resolve="asList" />
            <ref role="1Pybhc" to="33ny:~Arrays" resolve="Arrays" />
            <node concept="37vLTw" id="4XB9Qx8VqZl" role="37wK5m">
              <ref role="3cqZAo" node="4XB9Qx8Un58" resolve="rv" />
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="2$rNyahpJFI" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
      <node concept="2jeGV$" id="4XB9Qx8UEgI" role="lGtFl">
        <property role="TrG5h" value="targetLanguages" />
        <node concept="2jfdEK" id="4XB9Qx8UEgK" role="2jfP_Y">
          <node concept="3clFbS" id="4XB9Qx8UEgM" role="2VODD2">
            <node concept="3cpWs8" id="4XB9Qx8UFHr" role="3cqZAp">
              <node concept="3cpWsn" id="4XB9Qx8UFHs" role="3cpWs9">
                <property role="TrG5h" value="repo" />
                <node concept="3uibUv" id="4XB9Qx8UFHt" role="1tU5fm">
                  <ref role="3uigEE" to="lui2:~SRepository" resolve="SRepository" />
                </node>
                <node concept="2OqwBi" id="4XB9Qx8UFHu" role="33vP2m">
                  <node concept="2JrnkZ" id="4XB9Qx8UFHv" role="2Oq$k0">
                    <node concept="2OqwBi" id="4XB9Qx8UFHw" role="2JrQYb">
                      <node concept="1iwH7S" id="4XB9Qx8UFHx" role="2Oq$k0" />
                      <node concept="1st3f0" id="4XB9Qx8UFHy" role="2OqNvi" />
                    </node>
                  </node>
                  <node concept="liA8E" id="4XB9Qx8UFHz" role="2OqNvi">
                    <ref role="37wK5l" to="mhbf:~SModel.getRepository():org.jetbrains.mps.openapi.module.SRepository" resolve="getRepository" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3cpWs8" id="4XB9Qx8UFH$" role="3cqZAp">
              <node concept="3cpWsn" id="4XB9Qx8UFH_" role="3cpWs9">
                <property role="TrG5h" value="generatorModuleRef" />
                <node concept="3uibUv" id="4XB9Qx8UFHA" role="1tU5fm">
                  <ref role="3uigEE" to="lui2:~SModuleReference" resolve="SModuleReference" />
                </node>
                <node concept="2OqwBi" id="4XB9Qx8UFHB" role="33vP2m">
                  <node concept="2YIFZM" id="4XB9Qx8UFHC" role="2Oq$k0">
                    <ref role="1Pybhc" to="dush:~PersistenceFacade" resolve="PersistenceFacade" />
                    <ref role="37wK5l" to="dush:~PersistenceFacade.getInstance():org.jetbrains.mps.openapi.persistence.PersistenceFacade" resolve="getInstance" />
                  </node>
                  <node concept="liA8E" id="4XB9Qx8UFHD" role="2OqNvi">
                    <ref role="37wK5l" to="dush:~PersistenceFacade.createModuleReference(java.lang.String):org.jetbrains.mps.openapi.module.SModuleReference" resolve="createModuleReference" />
                    <node concept="2OqwBi" id="4XB9Qx8UFHE" role="37wK5m">
                      <node concept="30H73N" id="4XB9Qx8UFHF" role="2Oq$k0" />
                      <node concept="2qgKlT" id="4XB9Qx8UFHG" role="2OqNvi">
                        <ref role="37wK5l" to="wev6:7OJukvJ5PmG" resolve="getModuleReference" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3cpWs8" id="4XB9Qx8UFHH" role="3cqZAp">
              <node concept="3cpWsn" id="4XB9Qx8UFHI" role="3cpWs9">
                <property role="TrG5h" value="generatorModule" />
                <node concept="3uibUv" id="4XB9Qx8UFHJ" role="1tU5fm">
                  <ref role="3uigEE" to="lui2:~SModule" resolve="SModule" />
                </node>
                <node concept="2OqwBi" id="4XB9Qx8UFHK" role="33vP2m">
                  <node concept="37vLTw" id="4XB9Qx8UFHL" role="2Oq$k0">
                    <ref role="3cqZAo" node="4XB9Qx8UFH_" resolve="generatorModuleRef" />
                  </node>
                  <node concept="liA8E" id="4XB9Qx8UFHM" role="2OqNvi">
                    <ref role="37wK5l" to="lui2:~SModuleReference.resolve(org.jetbrains.mps.openapi.module.SRepository):org.jetbrains.mps.openapi.module.SModule" resolve="resolve" />
                    <node concept="37vLTw" id="4XB9Qx8UFHN" role="37wK5m">
                      <ref role="3cqZAo" node="4XB9Qx8UFHs" resolve="repo" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3cpWs8" id="4XB9Qx8UFHO" role="3cqZAp">
              <node concept="3cpWsn" id="4XB9Qx8UFHP" role="3cpWs9">
                <property role="TrG5h" value="ms" />
                <node concept="3uibUv" id="4XB9Qx8UFHQ" role="1tU5fm">
                  <ref role="3uigEE" to="tft2:~ModelScanner" resolve="ModelScanner" />
                </node>
                <node concept="2ShNRf" id="4XB9Qx8UFHR" role="33vP2m">
                  <node concept="1pGfFk" id="4XB9Qx8UFHS" role="2ShVmc">
                    <ref role="37wK5l" to="tft2:~ModelScanner.&lt;init&gt;()" resolve="ModelScanner" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3SKdUt" id="4XB9Qx8UFHT" role="3cqZAp">
              <node concept="3SKdUq" id="4XB9Qx8UFHU" role="3SKWNk">
                <property role="3SKdUp" value="don't want to cast to smodel.Generator, mimic its getOwnTemplateModels()" />
              </node>
            </node>
            <node concept="1DcWWT" id="4XB9Qx8UFHV" role="3cqZAp">
              <node concept="3clFbS" id="4XB9Qx8UFHW" role="2LFqv$">
                <node concept="3clFbJ" id="4XB9Qx8UFHX" role="3cqZAp">
                  <node concept="3clFbS" id="4XB9Qx8UFHY" role="3clFbx">
                    <node concept="3clFbF" id="4XB9Qx8UFHZ" role="3cqZAp">
                      <node concept="2OqwBi" id="4XB9Qx8UFI0" role="3clFbG">
                        <node concept="37vLTw" id="4XB9Qx8UFI1" role="2Oq$k0">
                          <ref role="3cqZAo" node="4XB9Qx8UFHP" resolve="ms" />
                        </node>
                        <node concept="liA8E" id="4XB9Qx8UFI2" role="2OqNvi">
                          <ref role="37wK5l" to="tft2:~ModelScanner.scan(org.jetbrains.mps.openapi.model.SModel):jetbrains.mps.generator.impl.plan.ModelScanner" resolve="scan" />
                          <node concept="37vLTw" id="4XB9Qx8UFI3" role="37wK5m">
                            <ref role="3cqZAo" node="4XB9Qx8UFI6" resolve="m" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="2YIFZM" id="4XB9Qx8UFI4" role="3clFbw">
                    <ref role="1Pybhc" to="w1kc:~SModelStereotype" resolve="SModelStereotype" />
                    <ref role="37wK5l" to="w1kc:~SModelStereotype.isGeneratorModel(org.jetbrains.mps.openapi.model.SModel):boolean" resolve="isGeneratorModel" />
                    <node concept="37vLTw" id="4XB9Qx8UFI5" role="37wK5m">
                      <ref role="3cqZAo" node="4XB9Qx8UFI6" resolve="m" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3cpWsn" id="4XB9Qx8UFI6" role="1Duv9x">
                <property role="TrG5h" value="m" />
                <node concept="3uibUv" id="4XB9Qx8UFI7" role="1tU5fm">
                  <ref role="3uigEE" to="mhbf:~SModel" resolve="SModel" />
                </node>
              </node>
              <node concept="2OqwBi" id="4XB9Qx8UFI8" role="1DdaDG">
                <node concept="37vLTw" id="4XB9Qx8UFI9" role="2Oq$k0">
                  <ref role="3cqZAo" node="4XB9Qx8UFHI" resolve="generatorModule" />
                </node>
                <node concept="liA8E" id="4XB9Qx8UFIa" role="2OqNvi">
                  <ref role="37wK5l" to="lui2:~SModule.getModels():java.lang.Iterable" resolve="getModels" />
                </node>
              </node>
            </node>
            <node concept="3cpWs8" id="4XB9Qx8UFIb" role="3cqZAp">
              <node concept="3cpWsn" id="4XB9Qx8UFIc" role="3cpWs9">
                <property role="TrG5h" value="targetLanguages" />
                <node concept="A3Dl8" id="4XB9Qx8UFId" role="1tU5fm">
                  <node concept="3uibUv" id="4XB9Qx8UFIe" role="A3Ik2">
                    <ref role="3uigEE" to="c17a:~SLanguage" resolve="SLanguage" />
                  </node>
                </node>
                <node concept="2OqwBi" id="4XB9Qx8UFIf" role="33vP2m">
                  <node concept="37vLTw" id="4XB9Qx8UFIg" role="2Oq$k0">
                    <ref role="3cqZAo" node="4XB9Qx8UFHP" resolve="ms" />
                  </node>
                  <node concept="liA8E" id="4XB9Qx8UFIh" role="2OqNvi">
                    <ref role="37wK5l" to="tft2:~ModelScanner.getTargetLanguages():java.util.Set" resolve="getTargetLanguages" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3cpWs6" id="4XB9Qx8UFIi" role="3cqZAp">
              <node concept="2OqwBi" id="4XB9Qx8UPVT" role="3cqZAk">
                <node concept="2OqwBi" id="4XB9Qx8UPVU" role="2Oq$k0">
                  <node concept="2OqwBi" id="4XB9Qx8UPVV" role="2Oq$k0">
                    <node concept="37vLTw" id="4XB9Qx8UPVW" role="2Oq$k0">
                      <ref role="3cqZAo" node="4XB9Qx8UFIc" resolve="targetLanguages" />
                    </node>
                    <node concept="2S7cBI" id="4XB9Qx8UPVX" role="2OqNvi">
                      <node concept="1bVj0M" id="4XB9Qx8UPVY" role="23t8la">
                        <node concept="3clFbS" id="4XB9Qx8UPVZ" role="1bW5cS">
                          <node concept="3clFbF" id="4XB9Qx8UPW0" role="3cqZAp">
                            <node concept="2OqwBi" id="4XB9Qx8UPW1" role="3clFbG">
                              <node concept="37vLTw" id="4XB9Qx8UPW2" role="2Oq$k0">
                                <ref role="3cqZAo" node="4XB9Qx8UPW4" resolve="it" />
                              </node>
                              <node concept="liA8E" id="4XB9Qx8UPW3" role="2OqNvi">
                                <ref role="37wK5l" to="c17a:~SLanguage.getQualifiedName():java.lang.String" resolve="getQualifiedName" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node concept="Rh6nW" id="4XB9Qx8UPW4" role="1bW2Oz">
                          <property role="TrG5h" value="it" />
                          <node concept="2jxLKc" id="4XB9Qx8UPW5" role="1tU5fm" />
                        </node>
                      </node>
                      <node concept="1nlBCl" id="4XB9Qx8UPW6" role="2S7zOq">
                        <property role="3clFbU" value="true" />
                      </node>
                    </node>
                  </node>
                  <node concept="3$u5V9" id="4XB9Qx8UPW7" role="2OqNvi">
                    <node concept="1bVj0M" id="4XB9Qx8UPW8" role="23t8la">
                      <node concept="3clFbS" id="4XB9Qx8UPW9" role="1bW5cS">
                        <node concept="3cpWs8" id="4XB9Qx8UPWa" role="3cqZAp">
                          <node concept="3cpWsn" id="4XB9Qx8UPWb" role="3cpWs9">
                            <property role="TrG5h" value="lid" />
                            <node concept="3Tqbb2" id="4XB9Qx8UPWc" role="1tU5fm">
                              <ref role="ehGHo" to="tp25:34EJa6aIcz0" resolve="LanguageId" />
                            </node>
                            <node concept="2OqwBi" id="4XB9Qx8UPWd" role="33vP2m">
                              <node concept="2OqwBi" id="4XB9Qx8UPWe" role="2Oq$k0">
                                <node concept="1iwH7S" id="4XB9Qx8UPWf" role="2Oq$k0" />
                                <node concept="1FEO0x" id="4XB9Qx8UPWg" role="2OqNvi" />
                              </node>
                              <node concept="I8ghe" id="4XB9Qx8UPWh" role="2OqNvi">
                                <ref role="I8UWU" to="tp25:34EJa6aIcz0" resolve="LanguageId" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node concept="3clFbF" id="4XB9Qx8UPWi" role="3cqZAp">
                          <node concept="2OqwBi" id="4XB9Qx8UPWj" role="3clFbG">
                            <node concept="37vLTw" id="4XB9Qx8UPWk" role="2Oq$k0">
                              <ref role="3cqZAo" node="4XB9Qx8UPWb" resolve="lid" />
                            </node>
                            <node concept="2qgKlT" id="4XB9Qx8UPWl" role="2OqNvi">
                              <ref role="37wK5l" to="tpeu:34EJa6aIcyw" resolve="setLanguage" />
                              <node concept="37vLTw" id="4XB9Qx8UPWm" role="37wK5m">
                                <ref role="3cqZAo" node="4XB9Qx8UPWp" resolve="it" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node concept="3cpWs6" id="4XB9Qx8UPWn" role="3cqZAp">
                          <node concept="37vLTw" id="4XB9Qx8UPWo" role="3cqZAk">
                            <ref role="3cqZAo" node="4XB9Qx8UPWb" resolve="lid" />
                          </node>
                        </node>
                      </node>
                      <node concept="Rh6nW" id="4XB9Qx8UPWp" role="1bW2Oz">
                        <property role="TrG5h" value="it" />
                        <node concept="2jxLKc" id="4XB9Qx8UPWq" role="1tU5fm" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="ANE8D" id="4XB9Qx8UPWr" role="2OqNvi" />
              </node>
            </node>
          </node>
        </node>
        <node concept="2I9FWS" id="4XB9Qx8UNlU" role="2jfP_h">
          <ref role="2I9WkF" to="tp25:34EJa6aIcz0" resolve="LanguageId" />
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="2$rNyahpO9S" role="jymVt" />
    <node concept="3clFb_" id="7F8vtoiSlrd" role="jymVt">
      <property role="IEkAT" value="false" />
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getSourceLanguage" />
      <property role="DiZV1" value="false" />
      <node concept="3Tm1VV" id="7F8vtoiSlre" role="1B3o_S" />
      <node concept="3uibUv" id="7F8vtoiSlrf" role="3clF45">
        <ref role="3uigEE" to="vndm:~LanguageRuntime" resolve="LanguageRuntime" />
      </node>
      <node concept="3clFbS" id="7F8vtoiSlrg" role="3clF47">
        <node concept="3clFbF" id="7F8vtoiSlrh" role="3cqZAp">
          <node concept="37vLTw" id="2BHiRxeuhfF" role="3clFbG">
            <ref role="3cqZAo" node="7F8vtoiSlrp" resolve="sourceLanguage" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3yzCghJCcF9" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="2tJIrI" id="4XB9Qx8VWB2" role="jymVt" />
    <node concept="3clFb_" id="15qhGW3fqs1" role="jymVt">
      <property role="IEkAT" value="false" />
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getReferencedModules" />
      <property role="DiZV1" value="false" />
      <node concept="3Tm1VV" id="15qhGW3fqs2" role="1B3o_S" />
      <node concept="3uibUv" id="15qhGW3fqs3" role="3clF45">
        <ref role="3uigEE" to="33ny:~Collection" resolve="Collection" />
        <node concept="3uibUv" id="15qhGW3fExD" role="11_B2D">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="15qhGW3fqs5" role="3clF47">
        <node concept="3clFbF" id="15qhGW3fqs8" role="3cqZAp">
          <node concept="37vLTw" id="2BHiRxeu_7H" role="3clFbG">
            <ref role="3cqZAo" node="15qhGW3fq$s" resolve="referencedGenerators" />
            <node concept="1W57fq" id="15qhGW3fE1C" role="lGtFl">
              <node concept="3IZrLx" id="15qhGW3fE1D" role="3IZSJc">
                <node concept="3clFbS" id="15qhGW3fE1E" role="2VODD2">
                  <node concept="3clFbF" id="15qhGW3fE1I" role="3cqZAp">
                    <node concept="2OqwBi" id="15qhGW3fEx$" role="3clFbG">
                      <node concept="2OqwBi" id="15qhGW3fE1K" role="2Oq$k0">
                        <node concept="30H73N" id="15qhGW3fE1J" role="2Oq$k0" />
                        <node concept="3Tsc0h" id="15qhGW3fExz" role="2OqNvi">
                          <ref role="3TtcxE" to="hypd:1AZH1sZHi4f" />
                        </node>
                      </node>
                      <node concept="3GX2aA" id="15qhGW3fExC" role="2OqNvi" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="gft3U" id="15qhGW3fE1F" role="UU_$l">
                <node concept="10Nm6u" id="15qhGW3fE1H" role="gfFT$" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3yzCghJCcFa" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
  </node>
</model>

