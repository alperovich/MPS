<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:c6e01f98-6040-4dd0-a88b-62f17e77e610(jetbrains.mps.ide.dataFlow.presentation)">
  <persistence version="9" />
  <languages>
    <use id="fd392034-7849-419d-9071-12563d152375" name="jetbrains.mps.baseLanguage.closures" version="0" />
    <use id="760a0a8c-eabb-4521-8bfd-65db761a9ba3" name="jetbrains.mps.baseLanguage.logging" version="0" />
    <use id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage" version="4" />
    <use id="f2801650-65d5-424e-bb1b-463a8781b786" name="jetbrains.mps.baseLanguage.javadoc" version="2" />
  </languages>
  <imports>
    <import index="z60i" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.awt(JDK/)" />
    <import index="hyam" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.awt.event(JDK/)" />
    <import index="33ny" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.util(JDK/)" />
    <import index="mhbf" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.model(MPS.OpenAPI/)" />
    <import index="dush" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.persistence(MPS.OpenAPI/)" />
    <import index="dau9" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.lang.dataFlow.framework.instructions(MPS.Core/)" />
    <import index="w1kc" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel(MPS.Core/)" />
    <import index="1fjm" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.lang.dataFlow.framework(MPS.Core/)" />
    <import index="jkm4" ref="498d89d2-c2e9-11e2-ad49-6cf049e62fe5/java:com.intellij.openapi.ui(MPS.IDEA/)" />
    <import index="mhfm" ref="3f233e7f-b8a6-46d2-a57f-795d56775243/java:org.jetbrains.annotations(Annotations/)" />
    <import index="lzb2" ref="498d89d2-c2e9-11e2-ad49-6cf049e62fe5/java:com.intellij.ui(MPS.IDEA/)" />
    <import index="dxuu" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:javax.swing(JDK/)" />
    <import index="4nm9" ref="498d89d2-c2e9-11e2-ad49-6cf049e62fe5/java:com.intellij.openapi.project(MPS.IDEA/)" />
    <import index="kz9k" ref="1ed103c3-3aa6-49b7-9c21-6765ee11f224/java:jetbrains.mps.openapi.navigation(MPS.Editor/)" />
    <import index="z1c3" ref="742f6602-5a2f-4313-aa6e-ae1cd4ffdc61/java:jetbrains.mps.project(MPS.Platform/)" />
    <import index="wyt6" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)" implicit="true" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1082485599095" name="jetbrains.mps.baseLanguage.structure.BlockStatement" flags="nn" index="9aQIb">
        <child id="1082485599096" name="statements" index="9aQI4" />
      </concept>
      <concept id="1215693861676" name="jetbrains.mps.baseLanguage.structure.BaseAssignmentExpression" flags="nn" index="d038R">
        <child id="1068498886297" name="rValue" index="37vLTx" />
        <child id="1068498886295" name="lValue" index="37vLTJ" />
      </concept>
      <concept id="1153417849900" name="jetbrains.mps.baseLanguage.structure.GreaterThanOrEqualsExpression" flags="nn" index="2d3UOw" />
      <concept id="1215695189714" name="jetbrains.mps.baseLanguage.structure.PlusAssignmentExpression" flags="nn" index="d57v9" />
      <concept id="1153422305557" name="jetbrains.mps.baseLanguage.structure.LessThanOrEqualsExpression" flags="nn" index="2dkUwp" />
      <concept id="1202948039474" name="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" flags="nn" index="liA8E" />
      <concept id="1465982738277781862" name="jetbrains.mps.baseLanguage.structure.PlaceholderMember" flags="ng" index="2tJIrI" />
      <concept id="5279705229678483897" name="jetbrains.mps.baseLanguage.structure.FloatingPointFloatConstant" flags="nn" index="2$xPTn">
        <property id="5279705229678483899" name="value" index="2$xPTl" />
      </concept>
      <concept id="1076505808687" name="jetbrains.mps.baseLanguage.structure.WhileStatement" flags="nn" index="2$JKZl">
        <child id="1076505808688" name="condition" index="2$JKZa" />
      </concept>
      <concept id="1239714755177" name="jetbrains.mps.baseLanguage.structure.AbstractUnaryNumberOperation" flags="nn" index="2$Kvd9">
        <child id="1239714902950" name="expression" index="2$L3a6" />
      </concept>
      <concept id="1188207840427" name="jetbrains.mps.baseLanguage.structure.AnnotationInstance" flags="nn" index="2AHcQZ">
        <reference id="1188208074048" name="annotation" index="2AI5Lk" />
      </concept>
      <concept id="1188208481402" name="jetbrains.mps.baseLanguage.structure.HasAnnotation" flags="ng" index="2AJDlI">
        <child id="1188208488637" name="annotation" index="2AJF6D" />
      </concept>
      <concept id="1095950406618" name="jetbrains.mps.baseLanguage.structure.DivExpression" flags="nn" index="FJ1c_" />
      <concept id="2820489544401957797" name="jetbrains.mps.baseLanguage.structure.DefaultClassCreator" flags="nn" index="HV5vD">
        <reference id="2820489544401957798" name="classifier" index="HV5vE" />
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
      <concept id="1083245097125" name="jetbrains.mps.baseLanguage.structure.EnumClass" flags="ig" index="Qs71p">
        <child id="1083245396908" name="enumConstant" index="Qtgdg" />
      </concept>
      <concept id="1083245299891" name="jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration" flags="ig" index="QsSxf">
        <child id="492581319488141108" name="method" index="2HKRsH" />
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
      <concept id="1070462154015" name="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration" flags="ig" index="Wx3nA" />
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
      <concept id="1109279763828" name="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration" flags="ng" index="16euLQ">
        <property id="1214996933829" name="extends" index="3ztuRv" />
        <child id="1214996921760" name="bound" index="3ztrMU" />
      </concept>
      <concept id="1109279851642" name="jetbrains.mps.baseLanguage.structure.GenericDeclaration" flags="ng" index="16eOlS">
        <child id="1109279881614" name="typeVariableDeclaration" index="16eVyc" />
      </concept>
      <concept id="1109283449304" name="jetbrains.mps.baseLanguage.structure.TypeVariableReference" flags="in" index="16syzq">
        <reference id="1109283546497" name="typeVariableDeclaration" index="16sUi3" />
      </concept>
      <concept id="1092119917967" name="jetbrains.mps.baseLanguage.structure.MulExpression" flags="nn" index="17qRlL" />
      <concept id="1068498886296" name="jetbrains.mps.baseLanguage.structure.VariableReference" flags="nn" index="37vLTw">
        <reference id="1068581517664" name="variableDeclaration" index="3cqZAo" />
      </concept>
      <concept id="1068498886292" name="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" flags="ir" index="37vLTG" />
      <concept id="1068498886294" name="jetbrains.mps.baseLanguage.structure.AssignmentExpression" flags="nn" index="37vLTI" />
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
      <concept id="1068581242869" name="jetbrains.mps.baseLanguage.structure.MinusExpression" flags="nn" index="3cpWsd" />
      <concept id="1068581242863" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" flags="nr" index="3cpWsn" />
      <concept id="1068581517677" name="jetbrains.mps.baseLanguage.structure.VoidType" flags="in" index="3cqZAl" />
      <concept id="1079359253375" name="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" flags="nn" index="1eOMI4">
        <child id="1079359253376" name="expression" index="1eOMHV" />
      </concept>
      <concept id="1081506762703" name="jetbrains.mps.baseLanguage.structure.GreaterThanExpression" flags="nn" index="3eOSWO" />
      <concept id="1081506773034" name="jetbrains.mps.baseLanguage.structure.LessThanExpression" flags="nn" index="3eOVzh" />
      <concept id="1204053956946" name="jetbrains.mps.baseLanguage.structure.IMethodCall" flags="ng" index="1ndlxa">
        <reference id="1068499141037" name="baseMethodDeclaration" index="37wK5l" />
        <child id="1068499141038" name="actualArgument" index="37wK5m" />
      </concept>
      <concept id="1212685548494" name="jetbrains.mps.baseLanguage.structure.ClassCreator" flags="nn" index="1pGfFk">
        <child id="1212687122400" name="typeParameter" index="1pMfVU" />
      </concept>
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
      <concept id="1214918800624" name="jetbrains.mps.baseLanguage.structure.PostfixIncrementExpression" flags="nn" index="3uNrnE" />
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
      <concept id="1144231330558" name="jetbrains.mps.baseLanguage.structure.ForStatement" flags="nn" index="1Dw8fO">
        <child id="1144231399730" name="condition" index="1Dwp0S" />
        <child id="1144231408325" name="iteration" index="1Dwrff" />
      </concept>
      <concept id="1107796713796" name="jetbrains.mps.baseLanguage.structure.Interface" flags="ig" index="3HP615" />
      <concept id="1146644602865" name="jetbrains.mps.baseLanguage.structure.PublicVisibility" flags="nn" index="3Tm1VV" />
      <concept id="1146644623116" name="jetbrains.mps.baseLanguage.structure.PrivateVisibility" flags="nn" index="3Tm6S6" />
      <concept id="1146644641414" name="jetbrains.mps.baseLanguage.structure.ProtectedVisibility" flags="nn" index="3Tmbuc" />
      <concept id="1178893518978" name="jetbrains.mps.baseLanguage.structure.ThisConstructorInvocation" flags="nn" index="1VxSAg" />
      <concept id="1080120340718" name="jetbrains.mps.baseLanguage.structure.AndExpression" flags="nn" index="1Wc70l" />
      <concept id="1170345865475" name="jetbrains.mps.baseLanguage.structure.AnonymousClass" flags="ig" index="1Y3b0j">
        <reference id="1170346070688" name="classifier" index="1Y3XeK" />
      </concept>
      <concept id="8064396509828172209" name="jetbrains.mps.baseLanguage.structure.UnaryMinus" flags="nn" index="1ZRNhn" />
    </language>
    <language id="f2801650-65d5-424e-bb1b-463a8781b786" name="jetbrains.mps.baseLanguage.javadoc">
      <concept id="5349172909345501395" name="jetbrains.mps.baseLanguage.javadoc.structure.BaseDocComment" flags="ng" index="P$AiS">
        <child id="5383422241790532083" name="tags" index="3nqlJM" />
      </concept>
      <concept id="5349172909345532724" name="jetbrains.mps.baseLanguage.javadoc.structure.MethodDocComment" flags="ng" index="P$JXv" />
      <concept id="8465538089690331500" name="jetbrains.mps.baseLanguage.javadoc.structure.CommentLine" flags="ng" index="TZ5HA" />
      <concept id="8465538089690331492" name="jetbrains.mps.baseLanguage.javadoc.structure.DeprecatedBlockDocTag" flags="ng" index="TZ5HI">
        <child id="2667874559098216723" name="text" index="3HnX3l" />
      </concept>
    </language>
    <language id="760a0a8c-eabb-4521-8bfd-65db761a9ba3" name="jetbrains.mps.baseLanguage.logging">
      <concept id="1167227138527" name="jetbrains.mps.baseLanguage.logging.structure.LogStatement" flags="nn" index="34ab3g">
        <property id="1167228628751" name="hasException" index="34fQS0" />
        <property id="1167245565795" name="severity" index="35gtTG" />
        <child id="1167227463056" name="logExpression" index="34bqiv" />
        <child id="1167227561449" name="exception" index="34bMjA" />
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
  </registry>
  <node concept="312cEu" id="3HJD4JbIvDp">
    <property role="TrG5h" value="WriteBlock" />
    <property role="3GE5qa" value="block" />
    <node concept="3Tm1VV" id="3HJD4JbIvDq" role="1B3o_S" />
    <node concept="3uibUv" id="3HJD4JbIvDu" role="1zkMxy">
      <ref role="3uigEE" node="3HJD4JbIvLb" resolve="AbstractBlock" />
    </node>
    <node concept="3clFbW" id="3HJD4JbIvDw" role="jymVt">
      <node concept="3Tm1VV" id="3HJD4JbIvDx" role="1B3o_S" />
      <node concept="37vLTG" id="3HJD4JbIvDy" role="3clF46">
        <property role="TrG5h" value="x" />
        <node concept="10Oyi0" id="3HJD4JbIvDz" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIvD$" role="3clF46">
        <property role="TrG5h" value="y" />
        <node concept="10Oyi0" id="3HJD4JbIvD_" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIvDA" role="3clF46">
        <property role="TrG5h" value="width" />
        <node concept="10Oyi0" id="3HJD4JbIvDB" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIvDC" role="3clF46">
        <property role="TrG5h" value="height" />
        <node concept="10Oyi0" id="3HJD4JbIvDD" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIvDE" role="3clF46">
        <property role="TrG5h" value="source" />
        <node concept="3uibUv" id="6bzHk29ogqF" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNodeReference" resolve="SNodeReference" />
        </node>
      </node>
      <node concept="37vLTG" id="6j7_9uL$zAx" role="3clF46">
        <property role="TrG5h" value="caption" />
        <node concept="3uibUv" id="6j7_9uL$zAz" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="37vLTG" id="GzG95QnlIz" role="3clF46">
        <property role="TrG5h" value="ruleNodeReference" />
        <node concept="3uibUv" id="GzG95QnlI$" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIvDG" role="3clF47">
        <node concept="XkiVB" id="3HJD4JbIvDH" role="3cqZAp">
          <ref role="37wK5l" node="3HJD4JbIvLU" resolve="AbstractBlock" />
          <node concept="37vLTw" id="2BHiRxgm8kF" role="37wK5m">
            <ref role="3cqZAo" node="3HJD4JbIvDy" resolve="x" />
          </node>
          <node concept="37vLTw" id="2BHiRxglaXI" role="37wK5m">
            <ref role="3cqZAo" node="3HJD4JbIvD$" resolve="y" />
          </node>
          <node concept="37vLTw" id="2BHiRxglni_" role="37wK5m">
            <ref role="3cqZAo" node="3HJD4JbIvDA" resolve="width" />
          </node>
          <node concept="37vLTw" id="2BHiRxghfWx" role="37wK5m">
            <ref role="3cqZAo" node="3HJD4JbIvDC" resolve="height" />
          </node>
          <node concept="37vLTw" id="2BHiRxgmyu$" role="37wK5m">
            <ref role="3cqZAo" node="3HJD4JbIvDE" resolve="source" />
          </node>
          <node concept="37vLTw" id="2BHiRxglGWy" role="37wK5m">
            <ref role="3cqZAo" node="6j7_9uL$zAx" resolve="caption" />
          </node>
          <node concept="37vLTw" id="GzG95Qnn_J" role="37wK5m">
            <ref role="3cqZAo" node="GzG95QnlIz" resolve="ruleNodeReference" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIvDN" role="jymVt">
      <property role="TrG5h" value="paintBlock" />
      <node concept="3Tm1VV" id="3HJD4JbIvDO" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIvDP" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIvDQ" role="3clF46">
        <property role="TrG5h" value="g" />
        <node concept="3uibUv" id="3HJD4JbIvDR" role="1tU5fm">
          <ref role="3uigEE" to="z60i:~Graphics" resolve="Graphics" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIvDS" role="3clF47">
        <node concept="3clFbF" id="3HJD4JbIvDT" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIvDU" role="3clFbG">
            <node concept="37vLTw" id="2BHiRxgmv5y" role="2Oq$k0">
              <ref role="3cqZAo" node="3HJD4JbIvDQ" resolve="g" />
            </node>
            <node concept="liA8E" id="3HJD4JbIvDW" role="2OqNvi">
              <ref role="37wK5l" to="z60i:~Graphics.setColor(java.awt.Color):void" resolve="setColor" />
              <node concept="2ShNRf" id="3HJD4JbIvDX" role="37wK5m">
                <node concept="1pGfFk" id="3HJD4JbIvDY" role="2ShVmc">
                  <ref role="37wK5l" to="z60i:~Color.&lt;init&gt;(int,int,int)" resolve="Color" />
                  <node concept="3cmrfG" id="3HJD4JbIvDZ" role="37wK5m">
                    <property role="3cmrfH" value="245" />
                  </node>
                  <node concept="3cmrfG" id="3HJD4JbIvE0" role="37wK5m">
                    <property role="3cmrfH" value="160" />
                  </node>
                  <node concept="3cmrfG" id="3HJD4JbIvE1" role="37wK5m">
                    <property role="3cmrfH" value="210" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIvE2" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIvE3" role="3clFbG">
            <node concept="37vLTw" id="2BHiRxghiVj" role="2Oq$k0">
              <ref role="3cqZAo" node="3HJD4JbIvDQ" resolve="g" />
            </node>
            <node concept="liA8E" id="3HJD4JbIvE5" role="2OqNvi">
              <ref role="37wK5l" to="z60i:~Graphics.fillRect(int,int,int,int):void" resolve="fillRect" />
              <node concept="2OqwBi" id="3HJD4JbIvE6" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIvE7" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLi" resolve="myX" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIvE8" role="2Oq$k0" />
              </node>
              <node concept="2OqwBi" id="3HJD4JbIvE9" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIvEa" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLl" resolve="myY" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIvEb" role="2Oq$k0" />
              </node>
              <node concept="2OqwBi" id="3HJD4JbIvEc" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIvEd" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLo" resolve="myWidth" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIvEe" role="2Oq$k0" />
              </node>
              <node concept="2OqwBi" id="3HJD4JbIvEf" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIvEg" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLr" resolve="myHeight" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIvEh" role="2Oq$k0" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIvEi" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIvEj" role="3clFbG">
            <node concept="37vLTw" id="2BHiRxglllA" role="2Oq$k0">
              <ref role="3cqZAo" node="3HJD4JbIvDQ" resolve="g" />
            </node>
            <node concept="liA8E" id="3HJD4JbIvEl" role="2OqNvi">
              <ref role="37wK5l" to="z60i:~Graphics.setColor(java.awt.Color):void" resolve="setColor" />
              <node concept="10M0yZ" id="3HJD4JbIvEm" role="37wK5m">
                <ref role="1PxDUh" to="z60i:~Color" resolve="Color" />
                <ref role="3cqZAo" to="z60i:~Color.BLACK" resolve="BLACK" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIvEn" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIvEo" role="3clFbG">
            <node concept="37vLTw" id="2BHiRxgmaMi" role="2Oq$k0">
              <ref role="3cqZAo" node="3HJD4JbIvDQ" resolve="g" />
            </node>
            <node concept="liA8E" id="3HJD4JbIvEq" role="2OqNvi">
              <ref role="37wK5l" to="z60i:~Graphics.drawRect(int,int,int,int):void" resolve="drawRect" />
              <node concept="2OqwBi" id="3HJD4JbIvEr" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIvEs" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLi" resolve="myX" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIvEt" role="2Oq$k0" />
              </node>
              <node concept="2OqwBi" id="3HJD4JbIvEu" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIvEv" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLl" resolve="myY" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIvEw" role="2Oq$k0" />
              </node>
              <node concept="2OqwBi" id="3HJD4JbIvEx" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIvEy" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLo" resolve="myWidth" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIvEz" role="2Oq$k0" />
              </node>
              <node concept="2OqwBi" id="3HJD4JbIvE$" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIvE_" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLr" resolve="myHeight" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIvEA" role="2Oq$k0" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3tYsUK_RXO_" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="3HJD4JbIvBj">
    <property role="TrG5h" value="InstructionWrapper" />
    <node concept="3Tm1VV" id="3HJD4JbIvEB" role="1B3o_S" />
    <node concept="3uibUv" id="3HJD4JbIvEC" role="EKbjA">
      <ref role="3uigEE" node="3HJD4JbIvSt" resolve="IInstruction" />
      <node concept="3uibUv" id="3HJD4JbIvED" role="11_B2D">
        <ref role="3uigEE" node="3HJD4JbIvBj" resolve="InstructionWrapper" />
      </node>
    </node>
    <node concept="312cEg" id="3HJD4JbIvEE" role="jymVt">
      <property role="TrG5h" value="myInstruction" />
      <node concept="3uibUv" id="3HJD4JbIvEF" role="1tU5fm">
        <ref role="3uigEE" to="dau9:~Instruction" resolve="Instruction" />
      </node>
      <node concept="3Tm6S6" id="3HJD4JbIvEG" role="1B3o_S" />
    </node>
    <node concept="3clFbW" id="3HJD4JbIvEH" role="jymVt">
      <node concept="3Tm1VV" id="3HJD4JbIvEI" role="1B3o_S" />
      <node concept="37vLTG" id="3HJD4JbIvEJ" role="3clF46">
        <property role="TrG5h" value="instruction" />
        <node concept="3uibUv" id="3HJD4JbIvEK" role="1tU5fm">
          <ref role="3uigEE" to="dau9:~Instruction" resolve="Instruction" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIvEL" role="3clF47">
        <node concept="3clFbF" id="3HJD4JbIvEM" role="3cqZAp">
          <node concept="37vLTI" id="3HJD4JbIvEN" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIvEO" role="37vLTJ">
              <node concept="2OwXpG" id="3HJD4JbIvEP" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvEE" resolve="myInstruction" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIvEQ" role="2Oq$k0" />
            </node>
            <node concept="37vLTw" id="2BHiRxglWLL" role="37vLTx">
              <ref role="3cqZAo" node="3HJD4JbIvEJ" resolve="instruction" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIvES" role="jymVt">
      <property role="TrG5h" value="succ" />
      <node concept="3Tm1VV" id="3HJD4JbIvET" role="1B3o_S" />
      <node concept="3uibUv" id="3HJD4JbIvEU" role="3clF45">
        <ref role="3uigEE" to="33ny:~Set" resolve="Set" />
        <node concept="3uibUv" id="3HJD4JbIvEV" role="11_B2D">
          <ref role="3uigEE" node="3HJD4JbIvBj" resolve="InstructionWrapper" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIvEW" role="3clF47">
        <node concept="3cpWs8" id="3HJD4JbIvEX" role="3cqZAp">
          <node concept="3cpWsn" id="3HJD4JbIvEY" role="3cpWs9">
            <property role="TrG5h" value="result" />
            <node concept="3uibUv" id="3HJD4JbIvEZ" role="1tU5fm">
              <ref role="3uigEE" to="33ny:~Set" resolve="Set" />
              <node concept="3uibUv" id="3HJD4JbIvF0" role="11_B2D">
                <ref role="3uigEE" node="3HJD4JbIvBj" resolve="InstructionWrapper" />
              </node>
            </node>
            <node concept="2ShNRf" id="3HJD4JbIvF1" role="33vP2m">
              <node concept="1pGfFk" id="3HJD4JbIvF2" role="2ShVmc">
                <ref role="37wK5l" to="33ny:~HashSet.&lt;init&gt;()" resolve="HashSet" />
                <node concept="3uibUv" id="3HJD4JbIvF3" role="1pMfVU">
                  <ref role="3uigEE" node="3HJD4JbIvBj" resolve="InstructionWrapper" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="1DcWWT" id="3HJD4JbIvF4" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIvF5" role="1DdaDG">
            <node concept="2OqwBi" id="3HJD4JbIvF6" role="2Oq$k0">
              <node concept="2OwXpG" id="3HJD4JbIvF7" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvEE" resolve="myInstruction" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIvF8" role="2Oq$k0" />
            </node>
            <node concept="liA8E" id="3HJD4JbIvF9" role="2OqNvi">
              <ref role="37wK5l" to="dau9:~Instruction.succ():java.util.Set" resolve="succ" />
            </node>
          </node>
          <node concept="3cpWsn" id="3HJD4JbIvFa" role="1Duv9x">
            <property role="TrG5h" value="instruction" />
            <node concept="3uibUv" id="3HJD4JbIvFb" role="1tU5fm">
              <ref role="3uigEE" to="dau9:~Instruction" resolve="Instruction" />
            </node>
          </node>
          <node concept="3clFbS" id="3HJD4JbIvFc" role="2LFqv$">
            <node concept="3clFbF" id="3HJD4JbIvFd" role="3cqZAp">
              <node concept="2OqwBi" id="3HJD4JbIvFe" role="3clFbG">
                <node concept="37vLTw" id="3GM_nagTAxH" role="2Oq$k0">
                  <ref role="3cqZAo" node="3HJD4JbIvEY" resolve="result" />
                </node>
                <node concept="liA8E" id="3HJD4JbIvFg" role="2OqNvi">
                  <ref role="37wK5l" to="33ny:~Set.add(java.lang.Object):boolean" resolve="add" />
                  <node concept="2ShNRf" id="3HJD4JbIvFh" role="37wK5m">
                    <node concept="1pGfFk" id="3HJD4JbIvFi" role="2ShVmc">
                      <ref role="37wK5l" node="3HJD4JbIvEH" resolve="InstructionWrapper" />
                      <node concept="37vLTw" id="3GM_nagTuII" role="37wK5m">
                        <ref role="3cqZAo" node="3HJD4JbIvFa" resolve="instruction" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="3HJD4JbIvFk" role="3cqZAp">
          <node concept="37vLTw" id="3GM_nagTuoY" role="3cqZAk">
            <ref role="3cqZAo" node="3HJD4JbIvEY" resolve="result" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3tYsUK_RUps" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIvFm" role="jymVt">
      <property role="TrG5h" value="pred" />
      <node concept="3Tm1VV" id="3HJD4JbIvFn" role="1B3o_S" />
      <node concept="3uibUv" id="3HJD4JbIvFo" role="3clF45">
        <ref role="3uigEE" to="33ny:~Set" resolve="Set" />
        <node concept="3uibUv" id="3HJD4JbIvFp" role="11_B2D">
          <ref role="3uigEE" node="3HJD4JbIvBj" resolve="InstructionWrapper" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIvFq" role="3clF47">
        <node concept="3cpWs8" id="3HJD4JbIvFr" role="3cqZAp">
          <node concept="3cpWsn" id="3HJD4JbIvFs" role="3cpWs9">
            <property role="TrG5h" value="result" />
            <node concept="3uibUv" id="3HJD4JbIvFt" role="1tU5fm">
              <ref role="3uigEE" to="33ny:~Set" resolve="Set" />
              <node concept="3uibUv" id="3HJD4JbIvFu" role="11_B2D">
                <ref role="3uigEE" node="3HJD4JbIvBj" resolve="InstructionWrapper" />
              </node>
            </node>
            <node concept="2ShNRf" id="3HJD4JbIvFv" role="33vP2m">
              <node concept="1pGfFk" id="3HJD4JbIvFw" role="2ShVmc">
                <ref role="37wK5l" to="33ny:~HashSet.&lt;init&gt;()" resolve="HashSet" />
                <node concept="3uibUv" id="3HJD4JbIvFx" role="1pMfVU">
                  <ref role="3uigEE" node="3HJD4JbIvBj" resolve="InstructionWrapper" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="1DcWWT" id="3HJD4JbIvFy" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIvFz" role="1DdaDG">
            <node concept="2OqwBi" id="3HJD4JbIvF$" role="2Oq$k0">
              <node concept="2OwXpG" id="3HJD4JbIvF_" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvEE" resolve="myInstruction" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIvFA" role="2Oq$k0" />
            </node>
            <node concept="liA8E" id="3HJD4JbIvFB" role="2OqNvi">
              <ref role="37wK5l" to="dau9:~Instruction.pred():java.util.Set" resolve="pred" />
            </node>
          </node>
          <node concept="3cpWsn" id="3HJD4JbIvFC" role="1Duv9x">
            <property role="TrG5h" value="instruction" />
            <node concept="3uibUv" id="3HJD4JbIvFD" role="1tU5fm">
              <ref role="3uigEE" to="dau9:~Instruction" resolve="Instruction" />
            </node>
          </node>
          <node concept="3clFbS" id="3HJD4JbIvFE" role="2LFqv$">
            <node concept="3clFbF" id="3HJD4JbIvFF" role="3cqZAp">
              <node concept="2OqwBi" id="3HJD4JbIvFG" role="3clFbG">
                <node concept="37vLTw" id="3GM_nagTuNP" role="2Oq$k0">
                  <ref role="3cqZAo" node="3HJD4JbIvFs" resolve="result" />
                </node>
                <node concept="liA8E" id="3HJD4JbIvFI" role="2OqNvi">
                  <ref role="37wK5l" to="33ny:~Set.add(java.lang.Object):boolean" resolve="add" />
                  <node concept="2ShNRf" id="3HJD4JbIvFJ" role="37wK5m">
                    <node concept="1pGfFk" id="3HJD4JbIvFK" role="2ShVmc">
                      <ref role="37wK5l" node="3HJD4JbIvEH" resolve="InstructionWrapper" />
                      <node concept="37vLTw" id="3GM_nagTuES" role="37wK5m">
                        <ref role="3cqZAo" node="3HJD4JbIvFC" resolve="instruction" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="3HJD4JbIvFM" role="3cqZAp">
          <node concept="37vLTw" id="3GM_nagTBDo" role="3cqZAk">
            <ref role="3cqZAo" node="3HJD4JbIvFs" resolve="result" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3tYsUK_RUpp" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIvFO" role="jymVt">
      <property role="TrG5h" value="getInstruction" />
      <node concept="3Tm1VV" id="3HJD4JbIvFP" role="1B3o_S" />
      <node concept="3uibUv" id="3HJD4JbIvFQ" role="3clF45">
        <ref role="3uigEE" to="dau9:~Instruction" resolve="Instruction" />
      </node>
      <node concept="3clFbS" id="3HJD4JbIvFR" role="3clF47">
        <node concept="3cpWs6" id="3HJD4JbIvFS" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIvFT" role="3cqZAk">
            <node concept="2OwXpG" id="3HJD4JbIvFU" role="2OqNvi">
              <ref role="2Oxat5" node="3HJD4JbIvEE" resolve="myInstruction" />
            </node>
            <node concept="Xjq3P" id="3HJD4JbIvFV" role="2Oq$k0" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIvFW" role="jymVt">
      <property role="TrG5h" value="toString" />
      <node concept="3Tm1VV" id="3HJD4JbIvFX" role="1B3o_S" />
      <node concept="3uibUv" id="3HJD4JbIvFY" role="3clF45">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
      <node concept="3clFbS" id="3HJD4JbIvFZ" role="3clF47">
        <node concept="3cpWs6" id="3HJD4JbIvG0" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIvG1" role="3cqZAk">
            <node concept="2OqwBi" id="3HJD4JbIvG2" role="2Oq$k0">
              <node concept="2OwXpG" id="3HJD4JbIvG3" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvEE" resolve="myInstruction" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIvG4" role="2Oq$k0" />
            </node>
            <node concept="liA8E" id="3HJD4JbIvG5" role="2OqNvi">
              <ref role="37wK5l" to="dau9:~Instruction.toString():java.lang.String" resolve="toString" />
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3tYsUK_RUpq" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIvG6" role="jymVt">
      <property role="TrG5h" value="hashCode" />
      <node concept="3Tm1VV" id="3HJD4JbIvG7" role="1B3o_S" />
      <node concept="10Oyi0" id="3HJD4JbIvG8" role="3clF45" />
      <node concept="3clFbS" id="3HJD4JbIvG9" role="3clF47">
        <node concept="3cpWs6" id="3HJD4JbIvGa" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIvGb" role="3cqZAk">
            <node concept="2OqwBi" id="3HJD4JbIvGc" role="2Oq$k0">
              <node concept="2OwXpG" id="3HJD4JbIvGd" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvEE" resolve="myInstruction" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIvGe" role="2Oq$k0" />
            </node>
            <node concept="liA8E" id="3HJD4JbIvGf" role="2OqNvi">
              <ref role="37wK5l" to="wyt6:~Object.hashCode():int" resolve="hashCode" />
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3tYsUK_RUpt" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIvGg" role="jymVt">
      <property role="TrG5h" value="equals" />
      <node concept="3Tm1VV" id="3HJD4JbIvGh" role="1B3o_S" />
      <node concept="10P_77" id="3HJD4JbIvGi" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIvGj" role="3clF46">
        <property role="TrG5h" value="obj" />
        <node concept="3uibUv" id="3HJD4JbIvGk" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIvGl" role="3clF47">
        <node concept="3clFbJ" id="3HJD4JbIvGm" role="3cqZAp">
          <node concept="2ZW3vV" id="3HJD4JbIvGn" role="3clFbw">
            <node concept="37vLTw" id="2BHiRxgm820" role="2ZW6bz">
              <ref role="3cqZAo" node="3HJD4JbIvGj" resolve="obj" />
            </node>
            <node concept="3uibUv" id="3HJD4JbIvGp" role="2ZW6by">
              <ref role="3uigEE" node="3HJD4JbIvBj" resolve="InstructionWrapper" />
            </node>
          </node>
          <node concept="3clFbS" id="3HJD4JbIvGq" role="3clFbx">
            <node concept="3cpWs6" id="3HJD4JbIvGr" role="3cqZAp">
              <node concept="1eOMI4" id="3HJD4JbIvGs" role="3cqZAk">
                <node concept="2OqwBi" id="3HJD4JbIvGt" role="1eOMHV">
                  <node concept="2OqwBi" id="3HJD4JbIvGu" role="2Oq$k0">
                    <node concept="2OwXpG" id="3HJD4JbIvGv" role="2OqNvi">
                      <ref role="2Oxat5" node="3HJD4JbIvEE" resolve="myInstruction" />
                    </node>
                    <node concept="Xjq3P" id="3HJD4JbIvGw" role="2Oq$k0" />
                  </node>
                  <node concept="liA8E" id="3HJD4JbIvGx" role="2OqNvi">
                    <ref role="37wK5l" to="wyt6:~Object.equals(java.lang.Object):boolean" resolve="equals" />
                    <node concept="2OqwBi" id="3HJD4JbIvGy" role="37wK5m">
                      <node concept="2OwXpG" id="3HJD4JbIvGz" role="2OqNvi">
                        <ref role="2Oxat5" node="3HJD4JbIvEE" resolve="myInstruction" />
                      </node>
                      <node concept="1eOMI4" id="3HJD4JbIvG$" role="2Oq$k0">
                        <node concept="10QFUN" id="3HJD4JbIvG_" role="1eOMHV">
                          <node concept="37vLTw" id="2BHiRxgm_4A" role="10QFUP">
                            <ref role="3cqZAo" node="3HJD4JbIvGj" resolve="obj" />
                          </node>
                          <node concept="3uibUv" id="3HJD4JbIvGB" role="10QFUM">
                            <ref role="3uigEE" node="3HJD4JbIvBj" resolve="InstructionWrapper" />
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
        <node concept="3cpWs6" id="3HJD4JbIvGC" role="3cqZAp">
          <node concept="3clFbT" id="3HJD4JbIvGD" role="3cqZAk" />
        </node>
      </node>
      <node concept="2AHcQZ" id="3tYsUK_RUpr" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="3HJD4JbIvGE">
    <property role="TrG5h" value="GraphCreator" />
    <node concept="3Tm1VV" id="3HJD4JbIvGF" role="1B3o_S" />
    <node concept="3uibUv" id="3HJD4JbIvGG" role="EKbjA">
      <ref role="3uigEE" node="3HJD4JbIw7M" resolve="IGraphCreator" />
      <node concept="3uibUv" id="3HJD4JbIvGH" role="11_B2D">
        <ref role="3uigEE" node="3HJD4JbIvBj" resolve="InstructionWrapper" />
      </node>
    </node>
    <node concept="3clFbW" id="3HJD4JbIvGV" role="jymVt">
      <node concept="3Tm1VV" id="3HJD4JbIvGW" role="1B3o_S" />
      <node concept="3clFbS" id="3HJD4JbIvGX" role="3clF47" />
    </node>
    <node concept="3clFb_" id="3HJD4JbIvIy" role="jymVt">
      <property role="TrG5h" value="createBlock" />
      <node concept="3Tm1VV" id="3HJD4JbIvIz" role="1B3o_S" />
      <node concept="3uibUv" id="3HJD4JbIvI$" role="3clF45">
        <ref role="3uigEE" node="3HJD4JbIw8e" resolve="IBlock" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIvIA" role="3clF46">
        <property role="TrG5h" value="wrapper" />
        <node concept="3uibUv" id="3HJD4JbIvIB" role="1tU5fm">
          <ref role="3uigEE" node="3HJD4JbIvBj" resolve="InstructionWrapper" />
        </node>
      </node>
      <node concept="37vLTG" id="3HJD4JbIvIC" role="3clF46">
        <property role="TrG5h" value="x" />
        <node concept="10Oyi0" id="3HJD4JbIvID" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIvIE" role="3clF46">
        <property role="TrG5h" value="y" />
        <node concept="10Oyi0" id="3HJD4JbIvIF" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIvIG" role="3clF46">
        <property role="TrG5h" value="width" />
        <node concept="10Oyi0" id="3HJD4JbIvIH" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIvII" role="3clF46">
        <property role="TrG5h" value="height" />
        <node concept="10Oyi0" id="3HJD4JbIvIJ" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="3HJD4JbIvIK" role="3clF47">
        <node concept="3cpWs8" id="3HJD4JbIvHd" role="3cqZAp">
          <node concept="3cpWsn" id="3HJD4JbIvHe" role="3cpWs9">
            <property role="TrG5h" value="instruction" />
            <node concept="3uibUv" id="3HJD4JbIvHf" role="1tU5fm">
              <ref role="3uigEE" to="dau9:~Instruction" resolve="Instruction" />
            </node>
            <node concept="2OqwBi" id="3HJD4JbIvHg" role="33vP2m">
              <node concept="37vLTw" id="2BHiRxgmDzi" role="2Oq$k0">
                <ref role="3cqZAo" node="3HJD4JbIvIA" resolve="wrapper" />
              </node>
              <node concept="liA8E" id="3HJD4JbIvHi" role="2OqNvi">
                <ref role="37wK5l" node="3HJD4JbIvFO" resolve="getInstruction" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="6bzHk29ogmO" role="3cqZAp">
          <node concept="3cpWsn" id="6bzHk29ogmP" role="3cpWs9">
            <property role="TrG5h" value="pointer" />
            <node concept="3uibUv" id="6bzHk29ogmQ" role="1tU5fm">
              <ref role="3uigEE" to="mhbf:~SNodeReference" resolve="SNodeReference" />
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="6bzHk29ognN" role="3cqZAp">
          <node concept="3clFbS" id="6bzHk29ognO" role="3clFbx">
            <node concept="3clFbF" id="6bzHk29ogoI" role="3cqZAp">
              <node concept="37vLTI" id="6bzHk29ogoJ" role="3clFbG">
                <node concept="2ShNRf" id="6bzHk29ogng" role="37vLTx">
                  <node concept="1pGfFk" id="6bzHk29ogni" role="2ShVmc">
                    <ref role="37wK5l" to="w1kc:~SNodePointer.&lt;init&gt;(org.jetbrains.mps.openapi.model.SNode)" resolve="SNodePointer" />
                    <node concept="1eOMI4" id="6bzHk29ognl" role="37wK5m">
                      <node concept="10QFUN" id="6bzHk29ognm" role="1eOMHV">
                        <node concept="2OqwBi" id="6bzHk29ognn" role="10QFUP">
                          <node concept="37vLTw" id="3GM_nagTz_I" role="2Oq$k0">
                            <ref role="3cqZAo" node="3HJD4JbIvHe" resolve="instruction" />
                          </node>
                          <node concept="liA8E" id="6bzHk29ognp" role="2OqNvi">
                            <ref role="37wK5l" to="dau9:~Instruction.getSource():java.lang.Object" resolve="getSource" />
                          </node>
                        </node>
                        <node concept="3uibUv" id="6bzHk29ognq" role="10QFUM">
                          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="37vLTw" id="3GM_nagT_mF" role="37vLTJ">
                  <ref role="3cqZAo" node="6bzHk29ogmP" resolve="pointer" />
                </node>
              </node>
            </node>
          </node>
          <node concept="2ZW3vV" id="6bzHk29ogoe" role="3clFbw">
            <node concept="3uibUv" id="6bzHk29ogoh" role="2ZW6by">
              <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
            </node>
            <node concept="2OqwBi" id="6bzHk29ogo3" role="2ZW6bz">
              <node concept="37vLTw" id="3GM_nagT_sL" role="2Oq$k0">
                <ref role="3cqZAo" node="3HJD4JbIvHe" resolve="instruction" />
              </node>
              <node concept="liA8E" id="6bzHk29ogo8" role="2OqNvi">
                <ref role="37wK5l" to="dau9:~Instruction.getSource():java.lang.Object" resolve="getSource" />
              </node>
            </node>
          </node>
          <node concept="9aQIb" id="6bzHk29ogoQ" role="9aQIa">
            <node concept="3clFbS" id="6bzHk29ogoR" role="9aQI4">
              <node concept="3clFbF" id="6bzHk29ogoS" role="3cqZAp">
                <node concept="37vLTI" id="6bzHk29ogp4" role="3clFbG">
                  <node concept="37vLTw" id="3GM_nagT_O3" role="37vLTJ">
                    <ref role="3cqZAo" node="6bzHk29ogmP" resolve="pointer" />
                  </node>
                  <node concept="10Nm6u" id="6bzHk29ogpb" role="37vLTx" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="6j7_9uL$zAU" role="3cqZAp">
          <node concept="3cpWsn" id="6j7_9uL$zAV" role="3cpWs9">
            <property role="TrG5h" value="caption" />
            <node concept="3uibUv" id="6j7_9uL$zAW" role="1tU5fm">
              <ref role="3uigEE" to="wyt6:~String" resolve="String" />
            </node>
            <node concept="2OqwBi" id="6j7_9uL$zB9" role="33vP2m">
              <node concept="37vLTw" id="3GM_nagTAHC" role="2Oq$k0">
                <ref role="3cqZAo" node="3HJD4JbIvHe" resolve="instruction" />
              </node>
              <node concept="liA8E" id="6j7_9uL$zBe" role="2OqNvi">
                <ref role="37wK5l" to="dau9:~Instruction.toString():java.lang.String" resolve="toString" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="GzG95Qnq9D" role="3cqZAp">
          <node concept="3cpWsn" id="GzG95Qnq9E" role="3cpWs9">
            <property role="TrG5h" value="rule" />
            <node concept="3uibUv" id="GzG95Qnq9F" role="1tU5fm">
              <ref role="3uigEE" to="wyt6:~String" resolve="String" />
            </node>
            <node concept="2OqwBi" id="GzG95Qnsnp" role="33vP2m">
              <node concept="37vLTw" id="GzG95Qnscn" role="2Oq$k0">
                <ref role="3cqZAo" node="3HJD4JbIvHe" resolve="instruction" />
              </node>
              <node concept="liA8E" id="GzG95Qnug7" role="2OqNvi">
                <ref role="37wK5l" to="dau9:~Instruction.getRuleReference():java.lang.String" resolve="getRuleReference" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="3HJD4JbIvHj" role="3cqZAp">
          <node concept="2ZW3vV" id="3HJD4JbIvHk" role="3clFbw">
            <node concept="37vLTw" id="3GM_nagTAi7" role="2ZW6bz">
              <ref role="3cqZAo" node="3HJD4JbIvHe" resolve="instruction" />
            </node>
            <node concept="3uibUv" id="3HJD4JbIvHm" role="2ZW6by">
              <ref role="3uigEE" to="dau9:~IfJumpInstruction" resolve="IfJumpInstruction" />
            </node>
          </node>
          <node concept="3clFbS" id="3HJD4JbIvHn" role="3clFbx">
            <node concept="3cpWs6" id="3HJD4JbIvHo" role="3cqZAp">
              <node concept="2ShNRf" id="3HJD4JbIvHp" role="3cqZAk">
                <node concept="1pGfFk" id="3HJD4JbIvHq" role="2ShVmc">
                  <ref role="37wK5l" node="3HJD4JbIwlh" resolve="AltBlock" />
                  <node concept="37vLTw" id="2BHiRxgha96" role="37wK5m">
                    <ref role="3cqZAo" node="3HJD4JbIvIC" resolve="x" />
                  </node>
                  <node concept="37vLTw" id="2BHiRxgl6uX" role="37wK5m">
                    <ref role="3cqZAo" node="3HJD4JbIvIE" resolve="y" />
                  </node>
                  <node concept="37vLTw" id="2BHiRxgkX$9" role="37wK5m">
                    <ref role="3cqZAo" node="3HJD4JbIvIG" resolve="width" />
                  </node>
                  <node concept="37vLTw" id="2BHiRxgm7A2" role="37wK5m">
                    <ref role="3cqZAo" node="3HJD4JbIvII" resolve="height" />
                  </node>
                  <node concept="37vLTw" id="3GM_nagTySD" role="37wK5m">
                    <ref role="3cqZAo" node="6bzHk29ogmP" resolve="pointer" />
                  </node>
                  <node concept="37vLTw" id="3GM_nagTvjk" role="37wK5m">
                    <ref role="3cqZAo" node="6j7_9uL$zAV" resolve="caption" />
                  </node>
                  <node concept="37vLTw" id="GzG95QnuQO" role="37wK5m">
                    <ref role="3cqZAo" node="GzG95Qnq9E" resolve="rule" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="3HJD4JbIvHx" role="3cqZAp">
          <node concept="2ZW3vV" id="3HJD4JbIvHy" role="3clFbw">
            <node concept="37vLTw" id="3GM_nagTuKN" role="2ZW6bz">
              <ref role="3cqZAo" node="3HJD4JbIvHe" resolve="instruction" />
            </node>
            <node concept="3uibUv" id="3HJD4JbIvH$" role="2ZW6by">
              <ref role="3uigEE" to="dau9:~JumpInstruction" resolve="JumpInstruction" />
            </node>
          </node>
          <node concept="3clFbS" id="3HJD4JbIvH_" role="3clFbx">
            <node concept="3cpWs6" id="3HJD4JbIvHA" role="3cqZAp">
              <node concept="2ShNRf" id="3HJD4JbIvHB" role="3cqZAk">
                <node concept="1pGfFk" id="3HJD4JbIvHC" role="2ShVmc">
                  <ref role="37wK5l" node="3HJD4JbIwv_" resolve="JumpBlock" />
                  <node concept="37vLTw" id="2BHiRxgmpKC" role="37wK5m">
                    <ref role="3cqZAo" node="3HJD4JbIvIC" resolve="x" />
                  </node>
                  <node concept="37vLTw" id="2BHiRxglEry" role="37wK5m">
                    <ref role="3cqZAo" node="3HJD4JbIvIE" resolve="y" />
                  </node>
                  <node concept="37vLTw" id="2BHiRxgm9Bk" role="37wK5m">
                    <ref role="3cqZAo" node="3HJD4JbIvIG" resolve="width" />
                  </node>
                  <node concept="37vLTw" id="2BHiRxglf74" role="37wK5m">
                    <ref role="3cqZAo" node="3HJD4JbIvII" resolve="height" />
                  </node>
                  <node concept="37vLTw" id="3GM_nagTv85" role="37wK5m">
                    <ref role="3cqZAo" node="6bzHk29ogmP" resolve="pointer" />
                  </node>
                  <node concept="37vLTw" id="3GM_nagTzxe" role="37wK5m">
                    <ref role="3cqZAo" node="6j7_9uL$zAV" resolve="caption" />
                  </node>
                  <node concept="37vLTw" id="GzG95Qnvme" role="37wK5m">
                    <ref role="3cqZAo" node="GzG95Qnq9E" resolve="rule" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="3HJD4JbIvHJ" role="3cqZAp">
          <node concept="2ZW3vV" id="3HJD4JbIvHK" role="3clFbw">
            <node concept="37vLTw" id="3GM_nagTtwD" role="2ZW6bz">
              <ref role="3cqZAo" node="3HJD4JbIvHe" resolve="instruction" />
            </node>
            <node concept="3uibUv" id="3HJD4JbIvHM" role="2ZW6by">
              <ref role="3uigEE" to="dau9:~WriteInstruction" resolve="WriteInstruction" />
            </node>
          </node>
          <node concept="3clFbS" id="3HJD4JbIvHN" role="3clFbx">
            <node concept="3cpWs6" id="3HJD4JbIvHO" role="3cqZAp">
              <node concept="2ShNRf" id="3HJD4JbIvHP" role="3cqZAk">
                <node concept="1pGfFk" id="3HJD4JbIvHQ" role="2ShVmc">
                  <ref role="37wK5l" node="3HJD4JbIvDw" resolve="WriteBlock" />
                  <node concept="37vLTw" id="2BHiRxgm6w7" role="37wK5m">
                    <ref role="3cqZAo" node="3HJD4JbIvIC" resolve="x" />
                  </node>
                  <node concept="37vLTw" id="2BHiRxgh9YY" role="37wK5m">
                    <ref role="3cqZAo" node="3HJD4JbIvIE" resolve="y" />
                  </node>
                  <node concept="37vLTw" id="2BHiRxgh9WW" role="37wK5m">
                    <ref role="3cqZAo" node="3HJD4JbIvIG" resolve="width" />
                  </node>
                  <node concept="37vLTw" id="2BHiRxgkWr5" role="37wK5m">
                    <ref role="3cqZAo" node="3HJD4JbIvII" resolve="height" />
                  </node>
                  <node concept="37vLTw" id="3GM_nagTw$E" role="37wK5m">
                    <ref role="3cqZAo" node="6bzHk29ogmP" resolve="pointer" />
                  </node>
                  <node concept="37vLTw" id="3GM_nagTzca" role="37wK5m">
                    <ref role="3cqZAo" node="6j7_9uL$zAV" resolve="caption" />
                  </node>
                  <node concept="37vLTw" id="GzG95QnvmD" role="37wK5m">
                    <ref role="3cqZAo" node="GzG95Qnq9E" resolve="rule" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="3HJD4JbIvHX" role="3cqZAp">
          <node concept="2ZW3vV" id="3HJD4JbIvHY" role="3clFbw">
            <node concept="37vLTw" id="3GM_nagTy$8" role="2ZW6bz">
              <ref role="3cqZAo" node="3HJD4JbIvHe" resolve="instruction" />
            </node>
            <node concept="3uibUv" id="3HJD4JbIvI0" role="2ZW6by">
              <ref role="3uigEE" to="dau9:~ReadInstruction" resolve="ReadInstruction" />
            </node>
          </node>
          <node concept="3clFbS" id="3HJD4JbIvI1" role="3clFbx">
            <node concept="3cpWs6" id="3HJD4JbIvI2" role="3cqZAp">
              <node concept="2ShNRf" id="3HJD4JbIvI3" role="3cqZAk">
                <node concept="1pGfFk" id="3HJD4JbIvI4" role="2ShVmc">
                  <ref role="37wK5l" node="3HJD4JbIw_V" resolve="ReadBlock" />
                  <node concept="37vLTw" id="2BHiRxgmyPX" role="37wK5m">
                    <ref role="3cqZAo" node="3HJD4JbIvIC" resolve="x" />
                  </node>
                  <node concept="37vLTw" id="2BHiRxgm9MG" role="37wK5m">
                    <ref role="3cqZAo" node="3HJD4JbIvIE" resolve="y" />
                  </node>
                  <node concept="37vLTw" id="2BHiRxghfq7" role="37wK5m">
                    <ref role="3cqZAo" node="3HJD4JbIvIG" resolve="width" />
                  </node>
                  <node concept="37vLTw" id="2BHiRxgmalj" role="37wK5m">
                    <ref role="3cqZAo" node="3HJD4JbIvII" resolve="height" />
                  </node>
                  <node concept="37vLTw" id="3GM_nagTw_u" role="37wK5m">
                    <ref role="3cqZAo" node="6bzHk29ogmP" resolve="pointer" />
                  </node>
                  <node concept="37vLTw" id="3GM_nagTw_4" role="37wK5m">
                    <ref role="3cqZAo" node="6j7_9uL$zAV" resolve="caption" />
                  </node>
                  <node concept="37vLTw" id="GzG95Qnvn4" role="37wK5m">
                    <ref role="3cqZAo" node="GzG95Qnq9E" resolve="rule" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="3HJD4JbIvIb" role="3cqZAp">
          <node concept="2ZW3vV" id="3HJD4JbIvIc" role="3clFbw">
            <node concept="37vLTw" id="3GM_nagTBqS" role="2ZW6bz">
              <ref role="3cqZAo" node="3HJD4JbIvHe" resolve="instruction" />
            </node>
            <node concept="3uibUv" id="3HJD4JbIvIe" role="2ZW6by">
              <ref role="3uigEE" to="dau9:~RetInstruction" resolve="RetInstruction" />
            </node>
          </node>
          <node concept="3clFbS" id="3HJD4JbIvIf" role="3clFbx">
            <node concept="3cpWs6" id="3HJD4JbIvIg" role="3cqZAp">
              <node concept="2ShNRf" id="3HJD4JbIvIh" role="3cqZAk">
                <node concept="1pGfFk" id="3HJD4JbIvIi" role="2ShVmc">
                  <ref role="37wK5l" node="3HJD4JbIwey" resolve="ReturnBlock" />
                  <node concept="37vLTw" id="2BHiRxglG9f" role="37wK5m">
                    <ref role="3cqZAo" node="3HJD4JbIvIC" resolve="x" />
                  </node>
                  <node concept="37vLTw" id="2BHiRxgmD$A" role="37wK5m">
                    <ref role="3cqZAo" node="3HJD4JbIvIE" resolve="y" />
                  </node>
                  <node concept="37vLTw" id="2BHiRxghfX6" role="37wK5m">
                    <ref role="3cqZAo" node="3HJD4JbIvIG" resolve="width" />
                  </node>
                  <node concept="37vLTw" id="2BHiRxgmhDk" role="37wK5m">
                    <ref role="3cqZAo" node="3HJD4JbIvII" resolve="height" />
                  </node>
                  <node concept="37vLTw" id="3GM_nagTrMa" role="37wK5m">
                    <ref role="3cqZAo" node="6bzHk29ogmP" resolve="pointer" />
                  </node>
                  <node concept="37vLTw" id="3GM_nagTBZN" role="37wK5m">
                    <ref role="3cqZAo" node="6j7_9uL$zAV" resolve="caption" />
                  </node>
                  <node concept="37vLTw" id="GzG95Qnvnv" role="37wK5m">
                    <ref role="3cqZAo" node="GzG95Qnq9E" resolve="rule" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="3HJD4JbIvIp" role="3cqZAp">
          <node concept="2ShNRf" id="3HJD4JbIvIq" role="3cqZAk">
            <node concept="1pGfFk" id="3HJD4JbIvIr" role="2ShVmc">
              <ref role="37wK5l" node="3HJD4JbIvJt" resolve="SimpleBlock" />
              <node concept="37vLTw" id="2BHiRxghcEY" role="37wK5m">
                <ref role="3cqZAo" node="3HJD4JbIvIC" resolve="x" />
              </node>
              <node concept="37vLTw" id="2BHiRxglJS0" role="37wK5m">
                <ref role="3cqZAo" node="3HJD4JbIvIE" resolve="y" />
              </node>
              <node concept="37vLTw" id="2BHiRxghiYI" role="37wK5m">
                <ref role="3cqZAo" node="3HJD4JbIvIG" resolve="width" />
              </node>
              <node concept="37vLTw" id="2BHiRxgm_oI" role="37wK5m">
                <ref role="3cqZAo" node="3HJD4JbIvII" resolve="height" />
              </node>
              <node concept="37vLTw" id="3GM_nagTtNS" role="37wK5m">
                <ref role="3cqZAo" node="6bzHk29ogmP" resolve="pointer" />
              </node>
              <node concept="37vLTw" id="3GM_nagTxVv" role="37wK5m">
                <ref role="3cqZAo" node="6j7_9uL$zAV" resolve="caption" />
              </node>
              <node concept="37vLTw" id="GzG95Qnw1j" role="37wK5m">
                <ref role="3cqZAo" node="GzG95Qnq9E" resolve="rule" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3tYsUK_SkPS" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="3HJD4JbIvJm">
    <property role="TrG5h" value="SimpleBlock" />
    <property role="3GE5qa" value="block" />
    <node concept="3Tm1VV" id="3HJD4JbIvJn" role="1B3o_S" />
    <node concept="3uibUv" id="3HJD4JbIvJr" role="1zkMxy">
      <ref role="3uigEE" node="3HJD4JbIvLb" resolve="AbstractBlock" />
    </node>
    <node concept="3clFbW" id="3HJD4JbIvJt" role="jymVt">
      <node concept="3Tm1VV" id="3HJD4JbIvJu" role="1B3o_S" />
      <node concept="37vLTG" id="3HJD4JbIvJv" role="3clF46">
        <property role="TrG5h" value="x" />
        <node concept="10Oyi0" id="3HJD4JbIvJw" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIvJx" role="3clF46">
        <property role="TrG5h" value="y" />
        <node concept="10Oyi0" id="3HJD4JbIvJy" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIvJz" role="3clF46">
        <property role="TrG5h" value="width" />
        <node concept="10Oyi0" id="3HJD4JbIvJ$" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIvJ_" role="3clF46">
        <property role="TrG5h" value="height" />
        <node concept="10Oyi0" id="3HJD4JbIvJA" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIvJB" role="3clF46">
        <property role="TrG5h" value="source" />
        <node concept="3uibUv" id="6bzHk29ogqj" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNodeReference" resolve="SNodeReference" />
        </node>
      </node>
      <node concept="37vLTG" id="6j7_9uL$zAo" role="3clF46">
        <property role="TrG5h" value="caption" />
        <node concept="3uibUv" id="6j7_9uL$zAq" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="37vLTG" id="GzG95QnfX9" role="3clF46">
        <property role="TrG5h" value="ruleNodeReference" />
        <node concept="3uibUv" id="GzG95QnfXa" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIvJD" role="3clF47">
        <node concept="XkiVB" id="3HJD4JbIvJE" role="3cqZAp">
          <ref role="37wK5l" node="3HJD4JbIvLU" resolve="AbstractBlock" />
          <node concept="37vLTw" id="2BHiRxglWLn" role="37wK5m">
            <ref role="3cqZAo" node="3HJD4JbIvJv" resolve="x" />
          </node>
          <node concept="37vLTw" id="2BHiRxgmyxi" role="37wK5m">
            <ref role="3cqZAo" node="3HJD4JbIvJx" resolve="y" />
          </node>
          <node concept="37vLTw" id="2BHiRxghf3L" role="37wK5m">
            <ref role="3cqZAo" node="3HJD4JbIvJz" resolve="width" />
          </node>
          <node concept="37vLTw" id="2BHiRxgmBWD" role="37wK5m">
            <ref role="3cqZAo" node="3HJD4JbIvJ_" resolve="height" />
          </node>
          <node concept="37vLTw" id="2BHiRxgllbW" role="37wK5m">
            <ref role="3cqZAo" node="3HJD4JbIvJB" resolve="source" />
          </node>
          <node concept="37vLTw" id="2BHiRxgllid" role="37wK5m">
            <ref role="3cqZAo" node="6j7_9uL$zAo" resolve="caption" />
          </node>
          <node concept="37vLTw" id="GzG95QniHA" role="37wK5m">
            <ref role="3cqZAo" node="GzG95QnfX9" resolve="ruleNodeReference" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIvJK" role="jymVt">
      <property role="TrG5h" value="paintBlock" />
      <node concept="3Tm1VV" id="3HJD4JbIvJL" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIvJM" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIvJN" role="3clF46">
        <property role="TrG5h" value="g" />
        <node concept="3uibUv" id="3HJD4JbIvJO" role="1tU5fm">
          <ref role="3uigEE" to="z60i:~Graphics" resolve="Graphics" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIvJP" role="3clF47">
        <node concept="3clFbF" id="3HJD4JbIvJQ" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIvJR" role="3clFbG">
            <node concept="37vLTw" id="2BHiRxgm6Kj" role="2Oq$k0">
              <ref role="3cqZAo" node="3HJD4JbIvJN" resolve="g" />
            </node>
            <node concept="liA8E" id="3HJD4JbIvJT" role="2OqNvi">
              <ref role="37wK5l" to="z60i:~Graphics.setColor(java.awt.Color):void" resolve="setColor" />
              <node concept="10M0yZ" id="3HJD4JbIvJU" role="37wK5m">
                <ref role="1PxDUh" to="z60i:~Color" resolve="Color" />
                <ref role="3cqZAo" to="z60i:~Color.WHITE" resolve="WHITE" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIvJV" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIvJW" role="3clFbG">
            <node concept="37vLTw" id="2BHiRxghg1$" role="2Oq$k0">
              <ref role="3cqZAo" node="3HJD4JbIvJN" resolve="g" />
            </node>
            <node concept="liA8E" id="3HJD4JbIvJY" role="2OqNvi">
              <ref role="37wK5l" to="z60i:~Graphics.fillRect(int,int,int,int):void" resolve="fillRect" />
              <node concept="2OqwBi" id="3HJD4JbIvJZ" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIvK0" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLi" resolve="myX" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIvK1" role="2Oq$k0" />
              </node>
              <node concept="2OqwBi" id="3HJD4JbIvK2" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIvK3" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLl" resolve="myY" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIvK4" role="2Oq$k0" />
              </node>
              <node concept="2OqwBi" id="3HJD4JbIvK5" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIvK6" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLo" resolve="myWidth" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIvK7" role="2Oq$k0" />
              </node>
              <node concept="2OqwBi" id="3HJD4JbIvK8" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIvK9" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLr" resolve="myHeight" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIvKa" role="2Oq$k0" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIvKb" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIvKc" role="3clFbG">
            <node concept="37vLTw" id="2BHiRxgm$a0" role="2Oq$k0">
              <ref role="3cqZAo" node="3HJD4JbIvJN" resolve="g" />
            </node>
            <node concept="liA8E" id="3HJD4JbIvKe" role="2OqNvi">
              <ref role="37wK5l" to="z60i:~Graphics.setColor(java.awt.Color):void" resolve="setColor" />
              <node concept="10M0yZ" id="3HJD4JbIvKf" role="37wK5m">
                <ref role="1PxDUh" to="z60i:~Color" resolve="Color" />
                <ref role="3cqZAo" to="z60i:~Color.BLACK" resolve="BLACK" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIvKg" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIvKh" role="3clFbG">
            <node concept="37vLTw" id="2BHiRxglnp0" role="2Oq$k0">
              <ref role="3cqZAo" node="3HJD4JbIvJN" resolve="g" />
            </node>
            <node concept="liA8E" id="3HJD4JbIvKj" role="2OqNvi">
              <ref role="37wK5l" to="z60i:~Graphics.drawRect(int,int,int,int):void" resolve="drawRect" />
              <node concept="2OqwBi" id="3HJD4JbIvKk" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIvKl" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLi" resolve="myX" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIvKm" role="2Oq$k0" />
              </node>
              <node concept="2OqwBi" id="3HJD4JbIvKn" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIvKo" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLl" resolve="myY" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIvKp" role="2Oq$k0" />
              </node>
              <node concept="2OqwBi" id="3HJD4JbIvKq" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIvKr" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLo" resolve="myWidth" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIvKs" role="2Oq$k0" />
              </node>
              <node concept="2OqwBi" id="3HJD4JbIvKt" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIvKu" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLr" resolve="myHeight" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIvKv" role="2Oq$k0" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3tYsUK_RXuz" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="3HJD4JbIvLb">
    <property role="TrG5h" value="AbstractBlock" />
    <property role="3GE5qa" value="block" />
    <property role="1sVAO0" value="true" />
    <node concept="3Tm1VV" id="3HJD4JbIvLc" role="1B3o_S" />
    <node concept="3uibUv" id="3HJD4JbIvLg" role="EKbjA">
      <ref role="3uigEE" node="3HJD4JbIw8e" resolve="IBlock" />
    </node>
    <node concept="312cEg" id="3HJD4JbIvLi" role="jymVt">
      <property role="TrG5h" value="myX" />
      <node concept="10Oyi0" id="3HJD4JbIvLj" role="1tU5fm" />
      <node concept="3Tmbuc" id="3HJD4JbIvLk" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="3HJD4JbIvLl" role="jymVt">
      <property role="TrG5h" value="myY" />
      <node concept="10Oyi0" id="3HJD4JbIvLm" role="1tU5fm" />
      <node concept="3Tmbuc" id="3HJD4JbIvLn" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="3HJD4JbIvLo" role="jymVt">
      <property role="TrG5h" value="myWidth" />
      <node concept="10Oyi0" id="3HJD4JbIvLp" role="1tU5fm" />
      <node concept="3Tmbuc" id="3HJD4JbIvLq" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="3HJD4JbIvLr" role="jymVt">
      <property role="TrG5h" value="myHeight" />
      <node concept="10Oyi0" id="3HJD4JbIvLs" role="1tU5fm" />
      <node concept="3Tmbuc" id="3HJD4JbIvLt" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="3HJD4JbIvLu" role="jymVt">
      <property role="TrG5h" value="mySourceNode" />
      <node concept="3Tmbuc" id="3HJD4JbIvLw" role="1B3o_S" />
      <node concept="3uibUv" id="6bzHk29ogem" role="1tU5fm">
        <ref role="3uigEE" to="mhbf:~SNodeReference" resolve="SNodeReference" />
      </node>
    </node>
    <node concept="312cEg" id="2fWCKaogIb_" role="jymVt">
      <property role="TrG5h" value="myRuleNodeReference" />
      <node concept="3Tm6S6" id="2fWCKaogW3K" role="1B3o_S" />
      <node concept="3uibUv" id="GzG95QsPc$" role="1tU5fm">
        <ref role="3uigEE" to="mhbf:~SNodeReference" resolve="SNodeReference" />
      </node>
    </node>
    <node concept="312cEg" id="3HJD4JbIvLx" role="jymVt">
      <property role="TrG5h" value="myPaddingX" />
      <node concept="10Oyi0" id="3HJD4JbIvLy" role="1tU5fm" />
      <node concept="3Tm6S6" id="3HJD4JbIvLz" role="1B3o_S" />
      <node concept="3cmrfG" id="3HJD4JbIvL$" role="33vP2m">
        <property role="3cmrfH" value="0" />
      </node>
    </node>
    <node concept="312cEg" id="3HJD4JbIvL_" role="jymVt">
      <property role="TrG5h" value="myPaddingY" />
      <node concept="10Oyi0" id="3HJD4JbIvLA" role="1tU5fm" />
      <node concept="3Tm6S6" id="3HJD4JbIvLB" role="1B3o_S" />
      <node concept="3cmrfG" id="3HJD4JbIvLC" role="33vP2m">
        <property role="3cmrfH" value="0" />
      </node>
    </node>
    <node concept="312cEg" id="3HJD4JbIvLD" role="jymVt">
      <property role="TrG5h" value="myCharHeight" />
      <node concept="10Oyi0" id="3HJD4JbIvLE" role="1tU5fm" />
      <node concept="3Tm6S6" id="3HJD4JbIvLF" role="1B3o_S" />
      <node concept="3cmrfG" id="3HJD4JbIvLG" role="33vP2m">
        <property role="3cmrfH" value="0" />
      </node>
    </node>
    <node concept="312cEg" id="3HJD4JbIvLH" role="jymVt">
      <property role="TrG5h" value="myStringWidth" />
      <node concept="10Oyi0" id="3HJD4JbIvLI" role="1tU5fm" />
      <node concept="3Tm6S6" id="3HJD4JbIvLJ" role="1B3o_S" />
      <node concept="3cmrfG" id="3HJD4JbIvLK" role="33vP2m">
        <property role="3cmrfH" value="0" />
      </node>
    </node>
    <node concept="312cEg" id="1b27iyfOU2s" role="jymVt">
      <property role="TrG5h" value="myCaption" />
      <node concept="3Tm6S6" id="1b27iyfOU2t" role="1B3o_S" />
      <node concept="3uibUv" id="1b27iyfOU2y" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
    </node>
    <node concept="312cEg" id="3HJD4JbIvLL" role="jymVt">
      <property role="TrG5h" value="myBlockListeners" />
      <node concept="3uibUv" id="3HJD4JbIvLM" role="1tU5fm">
        <ref role="3uigEE" to="33ny:~Set" resolve="Set" />
        <node concept="3uibUv" id="3HJD4JbIvLN" role="11_B2D">
          <ref role="3uigEE" node="3HJD4JbIvBi" resolve="IBlockListener" />
        </node>
      </node>
      <node concept="3Tm6S6" id="3HJD4JbIvLP" role="1B3o_S" />
      <node concept="2ShNRf" id="3HJD4JbIvLQ" role="33vP2m">
        <node concept="1pGfFk" id="3HJD4JbIvLR" role="2ShVmc">
          <ref role="37wK5l" to="33ny:~HashSet.&lt;init&gt;()" resolve="HashSet" />
          <node concept="3uibUv" id="3HJD4JbIvLS" role="1pMfVU">
            <ref role="3uigEE" node="3HJD4JbIvBi" resolve="IBlockListener" />
          </node>
        </node>
      </node>
    </node>
    <node concept="312cEg" id="6bzHk29ogiy" role="jymVt">
      <property role="TrG5h" value="mySucc" />
      <node concept="3Tm6S6" id="6bzHk29ogiz" role="1B3o_S" />
      <node concept="3uibUv" id="6bzHk29ogiC" role="1tU5fm">
        <ref role="3uigEE" to="33ny:~Set" resolve="Set" />
        <node concept="3uibUv" id="6bzHk29ogiE" role="11_B2D">
          <ref role="3uigEE" node="3HJD4JbIw8e" resolve="IBlock" />
        </node>
      </node>
    </node>
    <node concept="3clFbW" id="3HJD4JbIvLU" role="jymVt">
      <node concept="3Tm1VV" id="3HJD4JbIvLV" role="1B3o_S" />
      <node concept="37vLTG" id="3HJD4JbIvLW" role="3clF46">
        <property role="TrG5h" value="x" />
        <node concept="10Oyi0" id="3HJD4JbIvLX" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIvLY" role="3clF46">
        <property role="TrG5h" value="y" />
        <node concept="10Oyi0" id="3HJD4JbIvLZ" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIvM0" role="3clF46">
        <property role="TrG5h" value="width" />
        <node concept="10Oyi0" id="3HJD4JbIvM1" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIvM2" role="3clF46">
        <property role="TrG5h" value="height" />
        <node concept="10Oyi0" id="3HJD4JbIvM3" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIvM4" role="3clF46">
        <property role="TrG5h" value="sourceNode" />
        <node concept="3uibUv" id="6bzHk29ogbi" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNodeReference" resolve="SNodeReference" />
        </node>
      </node>
      <node concept="37vLTG" id="6j7_9uL$z_O" role="3clF46">
        <property role="TrG5h" value="caption" />
        <node concept="3uibUv" id="6j7_9uL$z_Q" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="37vLTG" id="GzG95Qj0hI" role="3clF46">
        <property role="TrG5h" value="ruleNodeReference" />
        <node concept="3uibUv" id="GzG95QjbLC" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIvM6" role="3clF47">
        <node concept="3clFbF" id="3HJD4JbIvM7" role="3cqZAp">
          <node concept="37vLTI" id="3HJD4JbIvM8" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIvM9" role="37vLTJ">
              <node concept="2OwXpG" id="3HJD4JbIvMa" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvLi" resolve="myX" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIvMb" role="2Oq$k0" />
            </node>
            <node concept="37vLTw" id="2BHiRxgm98S" role="37vLTx">
              <ref role="3cqZAo" node="3HJD4JbIvLW" resolve="x" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIvMd" role="3cqZAp">
          <node concept="37vLTI" id="3HJD4JbIvMe" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIvMf" role="37vLTJ">
              <node concept="2OwXpG" id="3HJD4JbIvMg" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvLl" resolve="myY" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIvMh" role="2Oq$k0" />
            </node>
            <node concept="37vLTw" id="2BHiRxgmyyj" role="37vLTx">
              <ref role="3cqZAo" node="3HJD4JbIvLY" resolve="y" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIvMj" role="3cqZAp">
          <node concept="37vLTI" id="3HJD4JbIvMk" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIvMl" role="37vLTJ">
              <node concept="2OwXpG" id="3HJD4JbIvMm" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvLo" resolve="myWidth" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIvMn" role="2Oq$k0" />
            </node>
            <node concept="37vLTw" id="2BHiRxgm9iT" role="37vLTx">
              <ref role="3cqZAo" node="3HJD4JbIvM0" resolve="width" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIvMp" role="3cqZAp">
          <node concept="37vLTI" id="3HJD4JbIvMq" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIvMr" role="37vLTJ">
              <node concept="2OwXpG" id="3HJD4JbIvMs" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvLr" resolve="myHeight" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIvMt" role="2Oq$k0" />
            </node>
            <node concept="37vLTw" id="2BHiRxgmkIA" role="37vLTx">
              <ref role="3cqZAo" node="3HJD4JbIvM2" resolve="height" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIvMv" role="3cqZAp">
          <node concept="37vLTI" id="3HJD4JbIvMw" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIvMx" role="37vLTJ">
              <node concept="2OwXpG" id="3HJD4JbIvMy" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvLu" resolve="mySourceNode" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIvMz" role="2Oq$k0" />
            </node>
            <node concept="37vLTw" id="2BHiRxgm_eW" role="37vLTx">
              <ref role="3cqZAo" node="3HJD4JbIvM4" resolve="sourceNode" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1b27iyfOU2_" role="3cqZAp">
          <node concept="37vLTI" id="1b27iyfOU2Y" role="3clFbG">
            <node concept="2OqwBi" id="1b27iyfOU2J" role="37vLTJ">
              <node concept="Xjq3P" id="1b27iyfOU2A" role="2Oq$k0" />
              <node concept="2OwXpG" id="1b27iyfOU2O" role="2OqNvi">
                <ref role="2Oxat5" node="1b27iyfOU2s" resolve="myCaption" />
              </node>
            </node>
            <node concept="37vLTw" id="2BHiRxgmFkg" role="37vLTx">
              <ref role="3cqZAo" node="6j7_9uL$z_O" resolve="caption" />
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="GzG95QtcyF" role="3cqZAp">
          <node concept="3clFbS" id="GzG95QtcyI" role="3clFbx">
            <node concept="SfApY" id="GzG95QtIZy" role="3cqZAp">
              <node concept="3clFbS" id="GzG95QtIZz" role="SfCbr">
                <node concept="3clFbF" id="GzG95QtUmV" role="3cqZAp">
                  <node concept="37vLTI" id="GzG95QuufK" role="3clFbG">
                    <node concept="2OqwBi" id="GzG95QuULl" role="37vLTx">
                      <node concept="2YIFZM" id="GzG95QuP0l" role="2Oq$k0">
                        <ref role="37wK5l" to="dush:~PersistenceFacade.getInstance():org.jetbrains.mps.openapi.persistence.PersistenceFacade" resolve="getInstance" />
                        <ref role="1Pybhc" to="dush:~PersistenceFacade" resolve="PersistenceFacade" />
                      </node>
                      <node concept="liA8E" id="GzG95Qv73t" role="2OqNvi">
                        <ref role="37wK5l" to="dush:~PersistenceFacade.createNodeReference(java.lang.String):org.jetbrains.mps.openapi.model.SNodeReference" resolve="createNodeReference" />
                        <node concept="37vLTw" id="GzG95Qvisl" role="37wK5m">
                          <ref role="3cqZAo" node="GzG95Qj0hI" resolve="ruleNodeReference" />
                        </node>
                      </node>
                    </node>
                    <node concept="2OqwBi" id="GzG95QtUx1" role="37vLTJ">
                      <node concept="Xjq3P" id="GzG95QtUmU" role="2Oq$k0" />
                      <node concept="2OwXpG" id="GzG95Qu6yJ" role="2OqNvi">
                        <ref role="2Oxat5" node="2fWCKaogIb_" resolve="myRuleNodeReference" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="TDmWw" id="GzG95QtIZ$" role="TEbGg">
                <node concept="3cpWsn" id="GzG95QtIZ_" role="TDEfY">
                  <property role="TrG5h" value="e" />
                  <node concept="3uibUv" id="GzG95QvEde" role="1tU5fm">
                    <ref role="3uigEE" to="wyt6:~IllegalArgumentException" resolve="IllegalArgumentException" />
                  </node>
                </node>
                <node concept="3clFbS" id="GzG95QtIZB" role="TDEfX">
                  <node concept="34ab3g" id="GzG95QwpOi" role="3cqZAp">
                    <property role="35gtTG" value="error" />
                    <property role="34fQS0" value="true" />
                    <node concept="3cpWs3" id="GzG95Qx7Pp" role="34bqiv">
                      <node concept="Xl_RD" id="GzG95QwpOk" role="3uHU7B">
                        <property role="Xl_RC" value="Can't find node: " />
                      </node>
                      <node concept="37vLTw" id="GzG95QxjnK" role="3uHU7w">
                        <ref role="3cqZAo" node="GzG95Qj0hI" resolve="ruleNodeReference" />
                      </node>
                    </node>
                    <node concept="37vLTw" id="GzG95QwpOm" role="34bMjA">
                      <ref role="3cqZAo" node="GzG95QtIZ_" resolve="e" />
                    </node>
                  </node>
                  <node concept="3clFbF" id="GzG95QxuZa" role="3cqZAp">
                    <node concept="37vLTI" id="GzG95QxXp8" role="3clFbG">
                      <node concept="10Nm6u" id="GzG95Qy95T" role="37vLTx" />
                      <node concept="2OqwBi" id="GzG95Qx$Un" role="37vLTJ">
                        <node concept="Xjq3P" id="GzG95QxuZ8" role="2Oq$k0" />
                        <node concept="2OwXpG" id="GzG95QxL6P" role="2OqNvi">
                          <ref role="2Oxat5" node="2fWCKaogIb_" resolve="myRuleNodeReference" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3y3z36" id="GzG95QtzCo" role="3clFbw">
            <node concept="10Nm6u" id="GzG95QtzCB" role="3uHU7w" />
            <node concept="37vLTw" id="GzG95QtnTY" role="3uHU7B">
              <ref role="3cqZAo" node="GzG95Qj0hI" resolve="ruleNodeReference" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIvM_" role="jymVt">
      <property role="TrG5h" value="getSourceNode" />
      <node concept="3Tm1VV" id="3HJD4JbIvMA" role="1B3o_S" />
      <node concept="3uibUv" id="6bzHk29ogbo" role="3clF45">
        <ref role="3uigEE" to="mhbf:~SNodeReference" resolve="SNodeReference" />
      </node>
      <node concept="3clFbS" id="3HJD4JbIvMC" role="3clF47">
        <node concept="3cpWs6" id="3HJD4JbIvMD" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIvME" role="3cqZAk">
            <node concept="2OwXpG" id="3HJD4JbIvMF" role="2OqNvi">
              <ref role="2Oxat5" node="3HJD4JbIvLu" resolve="mySourceNode" />
            </node>
            <node concept="Xjq3P" id="3HJD4JbIvMG" role="2Oq$k0" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3tYsUK_Sgfs" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="2tJIrI" id="2fWCKaofJaf" role="jymVt" />
    <node concept="3clFb_" id="2fWCKaogiTX" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getRuleNodeReference" />
      <node concept="3Tm1VV" id="2fWCKaogiTY" role="1B3o_S" />
      <node concept="3clFbS" id="2fWCKaogiTZ" role="3clF47">
        <node concept="3cpWs6" id="2fWCKaombKY" role="3cqZAp">
          <node concept="2OqwBi" id="2fWCKaomAD5" role="3cqZAk">
            <node concept="2OwXpG" id="2fWCKaomOBe" role="2OqNvi">
              <ref role="2Oxat5" node="2fWCKaogIb_" resolve="myRuleNodeReference" />
            </node>
            <node concept="Xjq3P" id="2fWCKaomp4t" role="2Oq$k0" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="GzG95QsDcu" role="3clF45">
        <ref role="3uigEE" to="mhbf:~SNodeReference" resolve="SNodeReference" />
      </node>
    </node>
    <node concept="2tJIrI" id="2fWCKaofWN1" role="jymVt" />
    <node concept="3clFb_" id="3HJD4JbIvMH" role="jymVt">
      <property role="TrG5h" value="getX" />
      <node concept="3Tm1VV" id="3HJD4JbIvMI" role="1B3o_S" />
      <node concept="10Oyi0" id="3HJD4JbIvMJ" role="3clF45" />
      <node concept="3clFbS" id="3HJD4JbIvMK" role="3clF47">
        <node concept="3cpWs6" id="3HJD4JbIvML" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIvMM" role="3cqZAk">
            <node concept="2OwXpG" id="3HJD4JbIvMN" role="2OqNvi">
              <ref role="2Oxat5" node="3HJD4JbIvLi" resolve="myX" />
            </node>
            <node concept="Xjq3P" id="3HJD4JbIvMO" role="2Oq$k0" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3tYsUK_Sgf$" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIvMP" role="jymVt">
      <property role="TrG5h" value="getY" />
      <node concept="3Tm1VV" id="3HJD4JbIvMQ" role="1B3o_S" />
      <node concept="10Oyi0" id="3HJD4JbIvMR" role="3clF45" />
      <node concept="3clFbS" id="3HJD4JbIvMS" role="3clF47">
        <node concept="3cpWs6" id="3HJD4JbIvMT" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIvMU" role="3cqZAk">
            <node concept="2OwXpG" id="3HJD4JbIvMV" role="2OqNvi">
              <ref role="2Oxat5" node="3HJD4JbIvLl" resolve="myY" />
            </node>
            <node concept="Xjq3P" id="3HJD4JbIvMW" role="2Oq$k0" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3tYsUK_Sgf_" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIvMX" role="jymVt">
      <property role="TrG5h" value="getWidth" />
      <node concept="3Tm1VV" id="3HJD4JbIvMY" role="1B3o_S" />
      <node concept="10Oyi0" id="3HJD4JbIvMZ" role="3clF45" />
      <node concept="3clFbS" id="3HJD4JbIvN0" role="3clF47">
        <node concept="3cpWs6" id="3HJD4JbIvN1" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIvN2" role="3cqZAk">
            <node concept="2OwXpG" id="3HJD4JbIvN3" role="2OqNvi">
              <ref role="2Oxat5" node="3HJD4JbIvLo" resolve="myWidth" />
            </node>
            <node concept="Xjq3P" id="3HJD4JbIvN4" role="2Oq$k0" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3tYsUK_Sgfy" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIvN5" role="jymVt">
      <property role="TrG5h" value="getHeight" />
      <node concept="3Tm1VV" id="3HJD4JbIvN6" role="1B3o_S" />
      <node concept="10Oyi0" id="3HJD4JbIvN7" role="3clF45" />
      <node concept="3clFbS" id="3HJD4JbIvN8" role="3clF47">
        <node concept="3cpWs6" id="3HJD4JbIvN9" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIvNa" role="3cqZAk">
            <node concept="2OwXpG" id="3HJD4JbIvNb" role="2OqNvi">
              <ref role="2Oxat5" node="3HJD4JbIvLr" resolve="myHeight" />
            </node>
            <node concept="Xjq3P" id="3HJD4JbIvNc" role="2Oq$k0" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3tYsUK_Sgfw" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIvNd" role="jymVt">
      <property role="TrG5h" value="addBlockListener" />
      <node concept="3Tm1VV" id="3HJD4JbIvNe" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIvNf" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIvNg" role="3clF46">
        <property role="TrG5h" value="listener" />
        <node concept="3uibUv" id="3HJD4JbIvNh" role="1tU5fm">
          <ref role="3uigEE" node="3HJD4JbIvBi" resolve="IBlockListener" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIvNj" role="3clF47">
        <node concept="3clFbF" id="3HJD4JbIvNk" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIvNl" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIvNm" role="2Oq$k0">
              <node concept="2OwXpG" id="3HJD4JbIvNn" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvLL" resolve="myBlockListeners" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIvNo" role="2Oq$k0" />
            </node>
            <node concept="liA8E" id="3HJD4JbIvNp" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~Set.add(java.lang.Object):boolean" resolve="add" />
              <node concept="37vLTw" id="2BHiRxgkWB4" role="37wK5m">
                <ref role="3cqZAo" node="3HJD4JbIvNg" resolve="listener" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3tYsUK_SgfD" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIvNr" role="jymVt">
      <property role="TrG5h" value="removeBlockListener" />
      <node concept="3Tm1VV" id="3HJD4JbIvNs" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIvNt" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIvNu" role="3clF46">
        <property role="TrG5h" value="listener" />
        <node concept="3uibUv" id="3HJD4JbIvNv" role="1tU5fm">
          <ref role="3uigEE" node="3HJD4JbIvBi" resolve="IBlockListener" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIvNx" role="3clF47">
        <node concept="3clFbF" id="3HJD4JbIvNy" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIvNz" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIvN$" role="2Oq$k0">
              <node concept="2OwXpG" id="3HJD4JbIvN_" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvLL" resolve="myBlockListeners" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIvNA" role="2Oq$k0" />
            </node>
            <node concept="liA8E" id="3HJD4JbIvNB" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~Set.remove(java.lang.Object):boolean" resolve="remove" />
              <node concept="37vLTw" id="2BHiRxgmJi0" role="37wK5m">
                <ref role="3cqZAo" node="3HJD4JbIvNu" resolve="listener" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3tYsUK_Sgfx" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="3clFb_" id="6bzHk29oghR" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="setSucc" />
      <node concept="3cqZAl" id="6bzHk29oghS" role="3clF45" />
      <node concept="3Tm1VV" id="6bzHk29oghT" role="1B3o_S" />
      <node concept="37vLTG" id="6bzHk29oghU" role="3clF46">
        <property role="TrG5h" value="succ" />
        <node concept="3uibUv" id="6bzHk29oghV" role="1tU5fm">
          <ref role="3uigEE" to="33ny:~Set" resolve="Set" />
          <node concept="3uibUv" id="6bzHk29oghW" role="11_B2D">
            <ref role="3uigEE" node="3HJD4JbIw8e" resolve="IBlock" />
          </node>
        </node>
      </node>
      <node concept="3clFbS" id="6bzHk29oghX" role="3clF47">
        <node concept="3clFbF" id="6bzHk29ogiF" role="3cqZAp">
          <node concept="37vLTI" id="6bzHk29ogj9" role="3clFbG">
            <node concept="37vLTw" id="2BHiRxgmC5G" role="37vLTx">
              <ref role="3cqZAo" node="6bzHk29oghU" resolve="succ" />
            </node>
            <node concept="2OqwBi" id="6bzHk29ogiR" role="37vLTJ">
              <node concept="Xjq3P" id="6bzHk29ogiG" role="2Oq$k0" />
              <node concept="2OwXpG" id="6bzHk29ogiX" role="2OqNvi">
                <ref role="2Oxat5" node="6bzHk29ogiy" resolve="mySucc" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3tYsUK_Sgfu" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="3clFb_" id="6bzHk29ogif" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="succ" />
      <node concept="3uibUv" id="6bzHk29ogig" role="3clF45">
        <ref role="3uigEE" to="33ny:~Set" resolve="Set" />
        <node concept="3uibUv" id="6bzHk29ogih" role="11_B2D">
          <ref role="3uigEE" node="3HJD4JbIw8e" resolve="IBlock" />
        </node>
      </node>
      <node concept="3Tm1VV" id="6bzHk29ogii" role="1B3o_S" />
      <node concept="3clFbS" id="6bzHk29ogij" role="3clF47">
        <node concept="3clFbF" id="6bzHk29ogjY" role="3cqZAp">
          <node concept="2OqwBi" id="6bzHk29ogka" role="3clFbG">
            <node concept="Xjq3P" id="6bzHk29ogjZ" role="2Oq$k0" />
            <node concept="2OwXpG" id="6bzHk29ogkg" role="2OqNvi">
              <ref role="2Oxat5" node="6bzHk29ogiy" resolve="mySucc" />
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3tYsUK_Sgft" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIvND" role="jymVt">
      <property role="TrG5h" value="processMousePressed" />
      <node concept="3Tm1VV" id="3HJD4JbIvNE" role="1B3o_S" />
      <node concept="10P_77" id="3HJD4JbIvNF" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIvNG" role="3clF46">
        <property role="TrG5h" value="mEvent" />
        <node concept="3uibUv" id="3HJD4JbIvNH" role="1tU5fm">
          <ref role="3uigEE" to="hyam:~MouseEvent" resolve="MouseEvent" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIvNI" role="3clF47">
        <node concept="3cpWs8" id="3HJD4JbIvNJ" role="3cqZAp">
          <node concept="3cpWsn" id="3HJD4JbIvNK" role="3cpWs9">
            <property role="TrG5h" value="x" />
            <node concept="10Oyi0" id="3HJD4JbIvNL" role="1tU5fm" />
            <node concept="2OqwBi" id="3HJD4JbIvNM" role="33vP2m">
              <node concept="37vLTw" id="2BHiRxgm5ET" role="2Oq$k0">
                <ref role="3cqZAo" node="3HJD4JbIvNG" resolve="mEvent" />
              </node>
              <node concept="liA8E" id="3HJD4JbIvNO" role="2OqNvi">
                <ref role="37wK5l" to="hyam:~MouseEvent.getX():int" resolve="getX" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="3HJD4JbIvNP" role="3cqZAp">
          <node concept="3cpWsn" id="3HJD4JbIvNQ" role="3cpWs9">
            <property role="TrG5h" value="y" />
            <node concept="10Oyi0" id="3HJD4JbIvNR" role="1tU5fm" />
            <node concept="2OqwBi" id="3HJD4JbIvNS" role="33vP2m">
              <node concept="37vLTw" id="2BHiRxgkX$F" role="2Oq$k0">
                <ref role="3cqZAo" node="3HJD4JbIvNG" resolve="mEvent" />
              </node>
              <node concept="liA8E" id="3HJD4JbIvNU" role="2OqNvi">
                <ref role="37wK5l" to="hyam:~MouseEvent.getY():int" resolve="getY" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="3HJD4JbIvNV" role="3cqZAp">
          <node concept="1Wc70l" id="3HJD4JbIvNW" role="3clFbw">
            <node concept="1Wc70l" id="3HJD4JbIvNX" role="3uHU7B">
              <node concept="1Wc70l" id="3HJD4JbIvNY" role="3uHU7B">
                <node concept="2d3UOw" id="3HJD4JbIvNZ" role="3uHU7B">
                  <node concept="37vLTw" id="3GM_nagT_3z" role="3uHU7B">
                    <ref role="3cqZAo" node="3HJD4JbIvNK" resolve="x" />
                  </node>
                  <node concept="2OqwBi" id="3HJD4JbIvO1" role="3uHU7w">
                    <node concept="2OwXpG" id="3HJD4JbIvO2" role="2OqNvi">
                      <ref role="2Oxat5" node="3HJD4JbIvLi" resolve="myX" />
                    </node>
                    <node concept="Xjq3P" id="3HJD4JbIvO3" role="2Oq$k0" />
                  </node>
                </node>
                <node concept="2dkUwp" id="3HJD4JbIvO4" role="3uHU7w">
                  <node concept="37vLTw" id="3GM_nagTvy1" role="3uHU7B">
                    <ref role="3cqZAo" node="3HJD4JbIvNK" resolve="x" />
                  </node>
                  <node concept="3cpWs3" id="3HJD4JbIvO6" role="3uHU7w">
                    <node concept="2OqwBi" id="3HJD4JbIvO7" role="3uHU7B">
                      <node concept="2OwXpG" id="3HJD4JbIvO8" role="2OqNvi">
                        <ref role="2Oxat5" node="3HJD4JbIvLi" resolve="myX" />
                      </node>
                      <node concept="Xjq3P" id="3HJD4JbIvO9" role="2Oq$k0" />
                    </node>
                    <node concept="2OqwBi" id="3HJD4JbIvOa" role="3uHU7w">
                      <node concept="2OwXpG" id="3HJD4JbIvOb" role="2OqNvi">
                        <ref role="2Oxat5" node="3HJD4JbIvLo" resolve="myWidth" />
                      </node>
                      <node concept="Xjq3P" id="3HJD4JbIvOc" role="2Oq$k0" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3eOSWO" id="3HJD4JbIvOd" role="3uHU7w">
                <node concept="37vLTw" id="3GM_nagT_rW" role="3uHU7B">
                  <ref role="3cqZAo" node="3HJD4JbIvNQ" resolve="y" />
                </node>
                <node concept="2OqwBi" id="3HJD4JbIvOf" role="3uHU7w">
                  <node concept="2OwXpG" id="3HJD4JbIvOg" role="2OqNvi">
                    <ref role="2Oxat5" node="3HJD4JbIvLl" resolve="myY" />
                  </node>
                  <node concept="Xjq3P" id="3HJD4JbIvOh" role="2Oq$k0" />
                </node>
              </node>
            </node>
            <node concept="2dkUwp" id="3HJD4JbIvOi" role="3uHU7w">
              <node concept="37vLTw" id="3GM_nagTud7" role="3uHU7B">
                <ref role="3cqZAo" node="3HJD4JbIvNQ" resolve="y" />
              </node>
              <node concept="3cpWs3" id="3HJD4JbIvOk" role="3uHU7w">
                <node concept="2OqwBi" id="3HJD4JbIvOl" role="3uHU7B">
                  <node concept="2OwXpG" id="3HJD4JbIvOm" role="2OqNvi">
                    <ref role="2Oxat5" node="3HJD4JbIvLl" resolve="myY" />
                  </node>
                  <node concept="Xjq3P" id="3HJD4JbIvOn" role="2Oq$k0" />
                </node>
                <node concept="2OqwBi" id="3HJD4JbIvOo" role="3uHU7w">
                  <node concept="2OwXpG" id="3HJD4JbIvOp" role="2OqNvi">
                    <ref role="2Oxat5" node="3HJD4JbIvLr" resolve="myHeight" />
                  </node>
                  <node concept="Xjq3P" id="3HJD4JbIvOq" role="2Oq$k0" />
                </node>
              </node>
            </node>
          </node>
          <node concept="9aQIb" id="3HJD4JbIvOr" role="9aQIa">
            <node concept="3clFbS" id="3HJD4JbIvOs" role="9aQI4">
              <node concept="3cpWs6" id="3HJD4JbIvOt" role="3cqZAp">
                <node concept="3clFbT" id="3HJD4JbIvOu" role="3cqZAk" />
              </node>
            </node>
          </node>
          <node concept="3clFbS" id="3HJD4JbIvOv" role="3clFbx">
            <node concept="1DcWWT" id="3HJD4JbIvOw" role="3cqZAp">
              <node concept="2OqwBi" id="3HJD4JbIvOx" role="1DdaDG">
                <node concept="2OwXpG" id="3HJD4JbIvOy" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLL" resolve="myBlockListeners" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIvOz" role="2Oq$k0" />
              </node>
              <node concept="3cpWsn" id="3HJD4JbIvO$" role="1Duv9x">
                <property role="TrG5h" value="listener" />
                <node concept="3uibUv" id="3HJD4JbIvO_" role="1tU5fm">
                  <ref role="3uigEE" node="3HJD4JbIvBi" resolve="IBlockListener" />
                </node>
              </node>
              <node concept="3clFbS" id="3HJD4JbIvOB" role="2LFqv$">
                <node concept="3clFbF" id="3HJD4JbIvOC" role="3cqZAp">
                  <node concept="2OqwBi" id="3HJD4JbIvOD" role="3clFbG">
                    <node concept="37vLTw" id="3GM_nagTuYs" role="2Oq$k0">
                      <ref role="3cqZAo" node="3HJD4JbIvO$" resolve="listener" />
                    </node>
                    <node concept="liA8E" id="3HJD4JbIvOF" role="2OqNvi">
                      <ref role="37wK5l" node="3HJD4JbIwei" resolve="mousePressed" />
                      <node concept="37vLTw" id="2BHiRxgm6LA" role="37wK5m">
                        <ref role="3cqZAo" node="3HJD4JbIvNG" resolve="mEvent" />
                      </node>
                      <node concept="Xjq3P" id="3HJD4JbIvOI" role="37wK5m">
                        <ref role="1HBi2w" node="3HJD4JbIvLb" resolve="AbstractBlock" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3cpWs6" id="3HJD4JbIvOK" role="3cqZAp">
              <node concept="3clFbT" id="3HJD4JbIvOL" role="3cqZAk">
                <property role="3clFbU" value="true" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3tYsUK_SgfA" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIvOM" role="jymVt">
      <property role="TrG5h" value="relayout" />
      <node concept="3Tm1VV" id="3HJD4JbIvON" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIvOO" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIvOP" role="3clF46">
        <property role="TrG5h" value="c" />
        <node concept="3uibUv" id="3HJD4JbIvOQ" role="1tU5fm">
          <ref role="3uigEE" to="z60i:~Component" resolve="Component" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIvOR" role="3clF47">
        <node concept="3cpWs8" id="3HJD4JbIvP0" role="3cqZAp">
          <node concept="3cpWsn" id="3HJD4JbIvP1" role="3cpWs9">
            <property role="TrG5h" value="font" />
            <node concept="3uibUv" id="3HJD4JbIvP2" role="1tU5fm">
              <ref role="3uigEE" to="z60i:~Font" resolve="Font" />
            </node>
            <node concept="2OqwBi" id="3HJD4JbIvP3" role="33vP2m">
              <node concept="37vLTw" id="2BHiRxgmKqR" role="2Oq$k0">
                <ref role="3cqZAo" node="3HJD4JbIvOP" resolve="c" />
              </node>
              <node concept="liA8E" id="3HJD4JbIvP5" role="2OqNvi">
                <ref role="37wK5l" to="z60i:~Component.getFont():java.awt.Font" resolve="getFont" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="3HJD4JbIvP6" role="3cqZAp">
          <node concept="3cpWsn" id="3HJD4JbIvP7" role="3cpWs9">
            <property role="TrG5h" value="metrics" />
            <node concept="3uibUv" id="3HJD4JbIvP8" role="1tU5fm">
              <ref role="3uigEE" to="z60i:~FontMetrics" resolve="FontMetrics" />
            </node>
            <node concept="2OqwBi" id="3HJD4JbIvP9" role="33vP2m">
              <node concept="37vLTw" id="2BHiRxgmFbG" role="2Oq$k0">
                <ref role="3cqZAo" node="3HJD4JbIvOP" resolve="c" />
              </node>
              <node concept="liA8E" id="3HJD4JbIvPb" role="2OqNvi">
                <ref role="37wK5l" to="z60i:~Component.getFontMetrics(java.awt.Font):java.awt.FontMetrics" resolve="getFontMetrics" />
                <node concept="37vLTw" id="3GM_nagTtpE" role="37wK5m">
                  <ref role="3cqZAo" node="3HJD4JbIvP1" resolve="font" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIvPd" role="3cqZAp">
          <node concept="37vLTI" id="3HJD4JbIvPe" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIvPf" role="37vLTJ">
              <node concept="2OwXpG" id="3HJD4JbIvPg" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvLH" resolve="myStringWidth" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIvPh" role="2Oq$k0" />
            </node>
            <node concept="2OqwBi" id="3HJD4JbIvPi" role="37vLTx">
              <node concept="37vLTw" id="3GM_nagTxSm" role="2Oq$k0">
                <ref role="3cqZAo" node="3HJD4JbIvP7" resolve="metrics" />
              </node>
              <node concept="liA8E" id="3HJD4JbIvPk" role="2OqNvi">
                <ref role="37wK5l" to="z60i:~FontMetrics.stringWidth(java.lang.String):int" resolve="stringWidth" />
                <node concept="2OqwBi" id="1b27iyfOU3R" role="37wK5m">
                  <node concept="Xjq3P" id="1b27iyfOU3M" role="2Oq$k0" />
                  <node concept="2OwXpG" id="1b27iyfOU3Y" role="2OqNvi">
                    <ref role="2Oxat5" node="1b27iyfOU2s" resolve="myCaption" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIvPm" role="3cqZAp">
          <node concept="37vLTI" id="3HJD4JbIvPn" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIvPo" role="37vLTJ">
              <node concept="2OwXpG" id="3HJD4JbIvPp" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvLD" resolve="myCharHeight" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIvPq" role="2Oq$k0" />
            </node>
            <node concept="2OqwBi" id="3HJD4JbIvPr" role="37vLTx">
              <node concept="37vLTw" id="3GM_nagTvhL" role="2Oq$k0">
                <ref role="3cqZAo" node="3HJD4JbIvP7" resolve="metrics" />
              </node>
              <node concept="liA8E" id="3HJD4JbIvPt" role="2OqNvi">
                <ref role="37wK5l" to="z60i:~FontMetrics.getHeight():int" resolve="getHeight" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIvPu" role="3cqZAp">
          <node concept="37vLTI" id="3HJD4JbIvPv" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIvPw" role="37vLTJ">
              <node concept="2OwXpG" id="3HJD4JbIvPx" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvLo" resolve="myWidth" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIvPy" role="2Oq$k0" />
            </node>
            <node concept="3cpWs3" id="3HJD4JbIvPz" role="37vLTx">
              <node concept="2OqwBi" id="3HJD4JbIvP$" role="3uHU7B">
                <node concept="2OwXpG" id="3HJD4JbIvP_" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLH" resolve="myStringWidth" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIvPA" role="2Oq$k0" />
              </node>
              <node concept="17qRlL" id="3HJD4JbIvPB" role="3uHU7w">
                <node concept="3cmrfG" id="3HJD4JbIvPC" role="3uHU7B">
                  <property role="3cmrfH" value="2" />
                </node>
                <node concept="2OqwBi" id="3HJD4JbIvPD" role="3uHU7w">
                  <node concept="Xjq3P" id="3HJD4JbIvPE" role="2Oq$k0">
                    <ref role="1HBi2w" node="3HJD4JbIvLb" resolve="AbstractBlock" />
                  </node>
                  <node concept="liA8E" id="3HJD4JbIvPF" role="2OqNvi">
                    <ref role="37wK5l" node="3HJD4JbIvPW" resolve="getPaddingX" />
                    <node concept="37vLTw" id="3GM_nagTwBi" role="37wK5m">
                      <ref role="3cqZAo" node="3HJD4JbIvP7" resolve="metrics" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIvPH" role="3cqZAp">
          <node concept="37vLTI" id="3HJD4JbIvPI" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIvPJ" role="37vLTJ">
              <node concept="2OwXpG" id="3HJD4JbIvPK" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvLr" resolve="myHeight" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIvPL" role="2Oq$k0" />
            </node>
            <node concept="3cpWs3" id="3HJD4JbIvPM" role="37vLTx">
              <node concept="2OqwBi" id="3HJD4JbIvPN" role="3uHU7B">
                <node concept="2OwXpG" id="3HJD4JbIvPO" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLD" resolve="myCharHeight" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIvPP" role="2Oq$k0" />
              </node>
              <node concept="17qRlL" id="3HJD4JbIvPQ" role="3uHU7w">
                <node concept="3cmrfG" id="3HJD4JbIvPR" role="3uHU7B">
                  <property role="3cmrfH" value="2" />
                </node>
                <node concept="2OqwBi" id="3HJD4JbIvPS" role="3uHU7w">
                  <node concept="Xjq3P" id="3HJD4JbIvPT" role="2Oq$k0">
                    <ref role="1HBi2w" node="3HJD4JbIvLb" resolve="AbstractBlock" />
                  </node>
                  <node concept="liA8E" id="3HJD4JbIvPU" role="2OqNvi">
                    <ref role="37wK5l" node="3HJD4JbIvQ8" resolve="getPaddingY" />
                    <node concept="37vLTw" id="3GM_nagTyP7" role="37wK5m">
                      <ref role="3cqZAo" node="3HJD4JbIvP7" resolve="metrics" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3tYsUK_SgfB" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIvPW" role="jymVt">
      <property role="TrG5h" value="getPaddingX" />
      <node concept="3Tm6S6" id="3HJD4JbIvPX" role="1B3o_S" />
      <node concept="10Oyi0" id="3HJD4JbIvPY" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIvPZ" role="3clF46">
        <property role="TrG5h" value="metrics" />
        <node concept="3uibUv" id="3HJD4JbIvQ0" role="1tU5fm">
          <ref role="3uigEE" to="z60i:~FontMetrics" resolve="FontMetrics" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIvQ1" role="3clF47">
        <node concept="3cpWs6" id="3HJD4JbIvQ2" role="3cqZAp">
          <node concept="FJ1c_" id="3HJD4JbIvQ3" role="3cqZAk">
            <node concept="2OqwBi" id="3HJD4JbIvQ4" role="3uHU7B">
              <node concept="37vLTw" id="2BHiRxgm8hE" role="2Oq$k0">
                <ref role="3cqZAo" node="3HJD4JbIvPZ" resolve="metrics" />
              </node>
              <node concept="liA8E" id="3HJD4JbIvQ6" role="2OqNvi">
                <ref role="37wK5l" to="z60i:~FontMetrics.getHeight():int" resolve="getHeight" />
              </node>
            </node>
            <node concept="3cmrfG" id="3HJD4JbIvQ7" role="3uHU7w">
              <property role="3cmrfH" value="2" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIvQ8" role="jymVt">
      <property role="TrG5h" value="getPaddingY" />
      <node concept="3Tm6S6" id="3HJD4JbIvQ9" role="1B3o_S" />
      <node concept="10Oyi0" id="3HJD4JbIvQa" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIvQb" role="3clF46">
        <property role="TrG5h" value="metrics" />
        <node concept="3uibUv" id="3HJD4JbIvQc" role="1tU5fm">
          <ref role="3uigEE" to="z60i:~FontMetrics" resolve="FontMetrics" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIvQd" role="3clF47">
        <node concept="3cpWs6" id="3HJD4JbIvQe" role="3cqZAp">
          <node concept="FJ1c_" id="3HJD4JbIvQf" role="3cqZAk">
            <node concept="2OqwBi" id="3HJD4JbIvQg" role="3uHU7B">
              <node concept="37vLTw" id="2BHiRxglRMt" role="2Oq$k0">
                <ref role="3cqZAo" node="3HJD4JbIvQb" resolve="metrics" />
              </node>
              <node concept="liA8E" id="3HJD4JbIvQi" role="2OqNvi">
                <ref role="37wK5l" to="z60i:~FontMetrics.getHeight():int" resolve="getHeight" />
              </node>
            </node>
            <node concept="3cmrfG" id="3HJD4JbIvQj" role="3uHU7w">
              <property role="3cmrfH" value="3" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIvQk" role="jymVt">
      <property role="TrG5h" value="setWidth" />
      <node concept="3Tm1VV" id="3HJD4JbIvQl" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIvQm" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIvQn" role="3clF46">
        <property role="TrG5h" value="width" />
        <node concept="10Oyi0" id="3HJD4JbIvQo" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="3HJD4JbIvQp" role="3clF47">
        <node concept="3clFbF" id="3HJD4JbIvQq" role="3cqZAp">
          <node concept="37vLTI" id="3HJD4JbIvQr" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIvQs" role="37vLTJ">
              <node concept="2OwXpG" id="3HJD4JbIvQt" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvLo" resolve="myWidth" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIvQu" role="2Oq$k0" />
            </node>
            <node concept="37vLTw" id="2BHiRxghfvZ" role="37vLTx">
              <ref role="3cqZAo" node="3HJD4JbIvQn" resolve="width" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIvQw" role="3cqZAp">
          <node concept="37vLTI" id="3HJD4JbIvQx" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIvQy" role="37vLTJ">
              <node concept="2OwXpG" id="3HJD4JbIvQz" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvLx" resolve="myPaddingX" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIvQ$" role="2Oq$k0" />
            </node>
            <node concept="FJ1c_" id="3HJD4JbIvQ_" role="37vLTx">
              <node concept="1eOMI4" id="3HJD4JbIvQA" role="3uHU7B">
                <node concept="3cpWsd" id="3HJD4JbIvQB" role="1eOMHV">
                  <node concept="2OqwBi" id="3HJD4JbIvQC" role="3uHU7B">
                    <node concept="2OwXpG" id="3HJD4JbIvQD" role="2OqNvi">
                      <ref role="2Oxat5" node="3HJD4JbIvLo" resolve="myWidth" />
                    </node>
                    <node concept="Xjq3P" id="3HJD4JbIvQE" role="2Oq$k0" />
                  </node>
                  <node concept="2OqwBi" id="3HJD4JbIvQF" role="3uHU7w">
                    <node concept="2OwXpG" id="3HJD4JbIvQG" role="2OqNvi">
                      <ref role="2Oxat5" node="3HJD4JbIvLH" resolve="myStringWidth" />
                    </node>
                    <node concept="Xjq3P" id="3HJD4JbIvQH" role="2Oq$k0" />
                  </node>
                </node>
              </node>
              <node concept="3cmrfG" id="3HJD4JbIvQI" role="3uHU7w">
                <property role="3cmrfH" value="2" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3tYsUK_Sgfv" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIvQJ" role="jymVt">
      <property role="TrG5h" value="setHeight" />
      <node concept="3Tm1VV" id="3HJD4JbIvQK" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIvQL" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIvQM" role="3clF46">
        <property role="TrG5h" value="height" />
        <node concept="10Oyi0" id="3HJD4JbIvQN" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="3HJD4JbIvQO" role="3clF47">
        <node concept="3clFbF" id="3HJD4JbIvQP" role="3cqZAp">
          <node concept="37vLTI" id="3HJD4JbIvQQ" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIvQR" role="37vLTJ">
              <node concept="2OwXpG" id="3HJD4JbIvQS" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvLr" resolve="myHeight" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIvQT" role="2Oq$k0" />
            </node>
            <node concept="37vLTw" id="2BHiRxgllea" role="37vLTx">
              <ref role="3cqZAo" node="3HJD4JbIvQM" resolve="height" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIvQV" role="3cqZAp">
          <node concept="37vLTI" id="3HJD4JbIvQW" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIvQX" role="37vLTJ">
              <node concept="2OwXpG" id="3HJD4JbIvQY" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvL_" resolve="myPaddingY" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIvQZ" role="2Oq$k0" />
            </node>
            <node concept="FJ1c_" id="3HJD4JbIvR0" role="37vLTx">
              <node concept="1eOMI4" id="3HJD4JbIvR1" role="3uHU7B">
                <node concept="3cpWsd" id="3HJD4JbIvR2" role="1eOMHV">
                  <node concept="2OqwBi" id="3HJD4JbIvR3" role="3uHU7B">
                    <node concept="2OwXpG" id="3HJD4JbIvR4" role="2OqNvi">
                      <ref role="2Oxat5" node="3HJD4JbIvLr" resolve="myHeight" />
                    </node>
                    <node concept="Xjq3P" id="3HJD4JbIvR5" role="2Oq$k0" />
                  </node>
                  <node concept="2OqwBi" id="3HJD4JbIvR6" role="3uHU7w">
                    <node concept="2OwXpG" id="3HJD4JbIvR7" role="2OqNvi">
                      <ref role="2Oxat5" node="3HJD4JbIvLD" resolve="myCharHeight" />
                    </node>
                    <node concept="Xjq3P" id="3HJD4JbIvR8" role="2Oq$k0" />
                  </node>
                </node>
              </node>
              <node concept="3cmrfG" id="3HJD4JbIvR9" role="3uHU7w">
                <property role="3cmrfH" value="2" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3tYsUK_SgfC" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIvRa" role="jymVt">
      <property role="TrG5h" value="setX" />
      <node concept="3Tm1VV" id="3HJD4JbIvRb" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIvRc" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIvRd" role="3clF46">
        <property role="TrG5h" value="x" />
        <node concept="10Oyi0" id="3HJD4JbIvRe" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="3HJD4JbIvRf" role="3clF47">
        <node concept="3clFbF" id="3HJD4JbIvRg" role="3cqZAp">
          <node concept="37vLTI" id="3HJD4JbIvRh" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIvRi" role="37vLTJ">
              <node concept="2OwXpG" id="3HJD4JbIvRj" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvLi" resolve="myX" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIvRk" role="2Oq$k0" />
            </node>
            <node concept="37vLTw" id="2BHiRxgm8km" role="37vLTx">
              <ref role="3cqZAo" node="3HJD4JbIvRd" resolve="x" />
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3tYsUK_SgfE" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIvRm" role="jymVt">
      <property role="TrG5h" value="setY" />
      <node concept="3Tm1VV" id="3HJD4JbIvRn" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIvRo" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIvRp" role="3clF46">
        <property role="TrG5h" value="y" />
        <node concept="10Oyi0" id="3HJD4JbIvRq" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="3HJD4JbIvRr" role="3clF47">
        <node concept="3clFbF" id="3HJD4JbIvRs" role="3cqZAp">
          <node concept="37vLTI" id="3HJD4JbIvRt" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIvRu" role="37vLTJ">
              <node concept="2OwXpG" id="3HJD4JbIvRv" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvLl" resolve="myY" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIvRw" role="2Oq$k0" />
            </node>
            <node concept="37vLTw" id="2BHiRxglp3p" role="37vLTx">
              <ref role="3cqZAo" node="3HJD4JbIvRp" resolve="y" />
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3tYsUK_Sgfr" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIvRy" role="jymVt">
      <property role="TrG5h" value="paintCaption" />
      <node concept="3Tmbuc" id="3HJD4JbIvRz" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIvR$" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIvR_" role="3clF46">
        <property role="TrG5h" value="g" />
        <node concept="3uibUv" id="3HJD4JbIvRA" role="1tU5fm">
          <ref role="3uigEE" to="z60i:~Graphics" resolve="Graphics" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIvRB" role="3clF47">
        <node concept="3clFbF" id="3HJD4JbIvRK" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIvRL" role="3clFbG">
            <node concept="37vLTw" id="2BHiRxgmxJc" role="2Oq$k0">
              <ref role="3cqZAo" node="3HJD4JbIvR_" resolve="g" />
            </node>
            <node concept="liA8E" id="3HJD4JbIvRN" role="2OqNvi">
              <ref role="37wK5l" to="z60i:~Graphics.drawString(java.lang.String,int,int):void" resolve="drawString" />
              <node concept="2OqwBi" id="1b27iyfOU6C" role="37wK5m">
                <node concept="Xjq3P" id="1b27iyfOU6v" role="2Oq$k0" />
                <node concept="2OwXpG" id="1b27iyfOU6O" role="2OqNvi">
                  <ref role="2Oxat5" node="1b27iyfOU2s" resolve="myCaption" />
                </node>
              </node>
              <node concept="3cpWs3" id="3HJD4JbIvRP" role="37wK5m">
                <node concept="2OqwBi" id="3HJD4JbIvRQ" role="3uHU7B">
                  <node concept="2OwXpG" id="3HJD4JbIvRR" role="2OqNvi">
                    <ref role="2Oxat5" node="3HJD4JbIvLi" resolve="myX" />
                  </node>
                  <node concept="Xjq3P" id="3HJD4JbIvRS" role="2Oq$k0" />
                </node>
                <node concept="2OqwBi" id="3HJD4JbIvRT" role="3uHU7w">
                  <node concept="2OwXpG" id="3HJD4JbIvRU" role="2OqNvi">
                    <ref role="2Oxat5" node="3HJD4JbIvLx" resolve="myPaddingX" />
                  </node>
                  <node concept="Xjq3P" id="3HJD4JbIvRV" role="2Oq$k0" />
                </node>
              </node>
              <node concept="3cpWs3" id="3HJD4JbIvRW" role="37wK5m">
                <node concept="3cpWs3" id="3HJD4JbIvRX" role="3uHU7B">
                  <node concept="2OqwBi" id="3HJD4JbIvRY" role="3uHU7B">
                    <node concept="2OwXpG" id="3HJD4JbIvRZ" role="2OqNvi">
                      <ref role="2Oxat5" node="3HJD4JbIvLl" resolve="myY" />
                    </node>
                    <node concept="Xjq3P" id="3HJD4JbIvS0" role="2Oq$k0" />
                  </node>
                  <node concept="2OqwBi" id="3HJD4JbIvS1" role="3uHU7w">
                    <node concept="2OwXpG" id="3HJD4JbIvS2" role="2OqNvi">
                      <ref role="2Oxat5" node="3HJD4JbIvL_" resolve="myPaddingY" />
                    </node>
                    <node concept="Xjq3P" id="3HJD4JbIvS3" role="2Oq$k0" />
                  </node>
                </node>
                <node concept="2OqwBi" id="3HJD4JbIvS4" role="3uHU7w">
                  <node concept="2OwXpG" id="3HJD4JbIvS5" role="2OqNvi">
                    <ref role="2Oxat5" node="3HJD4JbIvLD" resolve="myCharHeight" />
                  </node>
                  <node concept="Xjq3P" id="3HJD4JbIvS6" role="2Oq$k0" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIvS7" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="paintBlock" />
      <node concept="3Tmbuc" id="3HJD4JbIvS8" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIvS9" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIvSa" role="3clF46">
        <property role="TrG5h" value="g" />
        <node concept="3uibUv" id="3HJD4JbIvSb" role="1tU5fm">
          <ref role="3uigEE" to="z60i:~Graphics" resolve="Graphics" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIvSc" role="3clF47" />
    </node>
    <node concept="3clFb_" id="3HJD4JbIvSd" role="jymVt">
      <property role="TrG5h" value="paint" />
      <node concept="3Tm1VV" id="3HJD4JbIvSe" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIvSf" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIvSg" role="3clF46">
        <property role="TrG5h" value="g" />
        <node concept="3uibUv" id="3HJD4JbIvSh" role="1tU5fm">
          <ref role="3uigEE" to="z60i:~Graphics" resolve="Graphics" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIvSi" role="3clF47">
        <node concept="3clFbF" id="3HJD4JbIvSj" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIvSk" role="3clFbG">
            <node concept="Xjq3P" id="3HJD4JbIvSl" role="2Oq$k0">
              <ref role="1HBi2w" node="3HJD4JbIvLb" resolve="AbstractBlock" />
            </node>
            <node concept="liA8E" id="3HJD4JbIvSm" role="2OqNvi">
              <ref role="37wK5l" node="3HJD4JbIvS7" resolve="paintBlock" />
              <node concept="37vLTw" id="2BHiRxgl_5H" role="37wK5m">
                <ref role="3cqZAo" node="3HJD4JbIvSg" resolve="g" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIvSo" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIvSp" role="3clFbG">
            <node concept="Xjq3P" id="3HJD4JbIvSq" role="2Oq$k0">
              <ref role="1HBi2w" node="3HJD4JbIvLb" resolve="AbstractBlock" />
            </node>
            <node concept="liA8E" id="3HJD4JbIvSr" role="2OqNvi">
              <ref role="37wK5l" node="3HJD4JbIvRy" resolve="paintCaption" />
              <node concept="37vLTw" id="2BHiRxgm81b" role="37wK5m">
                <ref role="3cqZAo" node="3HJD4JbIvSg" resolve="g" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3tYsUK_Sgfz" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
  </node>
  <node concept="3HP615" id="3HJD4JbIvSt">
    <property role="TrG5h" value="IInstruction" />
    <node concept="3Tm1VV" id="3HJD4JbIvSu" role="1B3o_S" />
    <node concept="16euLQ" id="3HJD4JbIvSv" role="16eVyc">
      <property role="3ztuRv" value="true" />
      <property role="TrG5h" value="T" />
      <node concept="3uibUv" id="3HJD4JbIvSw" role="3ztrMU">
        <ref role="3uigEE" node="3HJD4JbIvSt" resolve="IInstruction" />
        <node concept="16syzq" id="3HJD4JbIvSx" role="11_B2D">
          <ref role="16sUi3" node="3HJD4JbIvSv" resolve="T" />
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIvSy" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="succ" />
      <node concept="3Tm1VV" id="3HJD4JbIvSz" role="1B3o_S" />
      <node concept="3uibUv" id="3HJD4JbIvS$" role="3clF45">
        <ref role="3uigEE" to="33ny:~Set" resolve="Set" />
        <node concept="16syzq" id="3HJD4JbIvS_" role="11_B2D">
          <ref role="16sUi3" node="3HJD4JbIvSv" resolve="T" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIvSA" role="3clF47" />
    </node>
    <node concept="3clFb_" id="3HJD4JbIvSB" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="pred" />
      <node concept="3Tm1VV" id="3HJD4JbIvSC" role="1B3o_S" />
      <node concept="3uibUv" id="3HJD4JbIvSD" role="3clF45">
        <ref role="3uigEE" to="33ny:~Set" resolve="Set" />
        <node concept="16syzq" id="3HJD4JbIvSE" role="11_B2D">
          <ref role="16sUi3" node="3HJD4JbIvSv" resolve="T" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIvSF" role="3clF47" />
    </node>
  </node>
  <node concept="312cEu" id="3HJD4JbIvSG">
    <property role="TrG5h" value="ControlFlowGraph" />
    <node concept="3Tm1VV" id="3HJD4JbIvSH" role="1B3o_S" />
    <node concept="16euLQ" id="3HJD4JbIvSI" role="16eVyc">
      <property role="3ztuRv" value="true" />
      <property role="TrG5h" value="T" />
      <node concept="3uibUv" id="3HJD4JbIvSJ" role="3ztrMU">
        <ref role="3uigEE" node="3HJD4JbIvSt" resolve="IInstruction" />
        <node concept="16syzq" id="3HJD4JbIvSK" role="11_B2D">
          <ref role="16sUi3" node="3HJD4JbIvSI" resolve="T" />
        </node>
      </node>
    </node>
    <node concept="Wx3nA" id="3HJD4JbIvSL" role="jymVt">
      <property role="TrG5h" value="MARGIN_X" />
      <property role="3TUv4t" value="true" />
      <node concept="10Oyi0" id="3HJD4JbIvSM" role="1tU5fm" />
      <node concept="3Tm6S6" id="3HJD4JbIvSN" role="1B3o_S" />
      <node concept="3cmrfG" id="3HJD4JbIvSO" role="33vP2m">
        <property role="3cmrfH" value="20" />
      </node>
    </node>
    <node concept="Wx3nA" id="3HJD4JbIvSP" role="jymVt">
      <property role="TrG5h" value="MARGIN_Y" />
      <property role="3TUv4t" value="true" />
      <node concept="10Oyi0" id="3HJD4JbIvSQ" role="1tU5fm" />
      <node concept="3Tm6S6" id="3HJD4JbIvSR" role="1B3o_S" />
      <node concept="3cmrfG" id="3HJD4JbIvSS" role="33vP2m">
        <property role="3cmrfH" value="20" />
      </node>
    </node>
    <node concept="Wx3nA" id="3HJD4JbIvST" role="jymVt">
      <property role="TrG5h" value="LINE_SEGMENT_SIZE" />
      <property role="3TUv4t" value="true" />
      <node concept="10Oyi0" id="3HJD4JbIvSU" role="1tU5fm" />
      <node concept="3Tm6S6" id="3HJD4JbIvSV" role="1B3o_S" />
      <node concept="3cmrfG" id="3HJD4JbIvSW" role="33vP2m">
        <property role="3cmrfH" value="40" />
      </node>
    </node>
    <node concept="312cEg" id="3HJD4JbIvSX" role="jymVt">
      <property role="TrG5h" value="myGraphCreator" />
      <property role="3TUv4t" value="true" />
      <node concept="3uibUv" id="3HJD4JbIvSY" role="1tU5fm">
        <ref role="3uigEE" node="3HJD4JbIw7M" resolve="IGraphCreator" />
        <node concept="16syzq" id="3HJD4JbIvSZ" role="11_B2D">
          <ref role="16sUi3" node="3HJD4JbIvSI" resolve="T" />
        </node>
      </node>
      <node concept="3Tmbuc" id="JwZXmxYBdW" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="3HJD4JbIvT1" role="jymVt">
      <property role="TrG5h" value="myProgram" />
      <property role="3TUv4t" value="true" />
      <node concept="3uibUv" id="3HJD4JbIvT2" role="1tU5fm">
        <ref role="3uigEE" node="3HJD4JbIwB2" resolve="IProgram" />
        <node concept="16syzq" id="3HJD4JbIvT3" role="11_B2D">
          <ref role="16sUi3" node="3HJD4JbIvSI" resolve="T" />
        </node>
      </node>
      <node concept="3Tmbuc" id="JwZXmxYAfY" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="3HJD4JbIvT5" role="jymVt">
      <property role="TrG5h" value="myComponent" />
      <node concept="3uibUv" id="3HJD4JbIvT6" role="1tU5fm">
        <ref role="3uigEE" to="z60i:~Component" resolve="Component" />
      </node>
      <node concept="3Tmbuc" id="JwZXmxZ9kO" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="3HJD4JbIvT8" role="jymVt">
      <property role="TrG5h" value="myBlocks" />
      <node concept="3uibUv" id="3HJD4JbIvT9" role="1tU5fm">
        <ref role="3uigEE" to="33ny:~List" resolve="List" />
        <node concept="3uibUv" id="3HJD4JbIvTa" role="11_B2D">
          <ref role="3uigEE" node="3HJD4JbIw8e" resolve="IBlock" />
        </node>
      </node>
      <node concept="3Tmbuc" id="JwZXmxYA8d" role="1B3o_S" />
      <node concept="2ShNRf" id="3HJD4JbIvTd" role="33vP2m">
        <node concept="1pGfFk" id="3HJD4JbIvTe" role="2ShVmc">
          <ref role="37wK5l" to="33ny:~ArrayList.&lt;init&gt;()" resolve="ArrayList" />
          <node concept="3uibUv" id="3HJD4JbIvTf" role="1pMfVU">
            <ref role="3uigEE" node="3HJD4JbIw8e" resolve="IBlock" />
          </node>
        </node>
      </node>
    </node>
    <node concept="312cEg" id="3HJD4JbIvTh" role="jymVt">
      <property role="TrG5h" value="myLines" />
      <node concept="3uibUv" id="3HJD4JbIvTi" role="1tU5fm">
        <ref role="3uigEE" to="33ny:~List" resolve="List" />
        <node concept="3uibUv" id="3HJD4JbIvTj" role="11_B2D">
          <ref role="3uigEE" node="3HJD4JbIwEp" resolve="Line" />
        </node>
      </node>
      <node concept="3Tmbuc" id="JwZXmxYA1X" role="1B3o_S" />
      <node concept="2ShNRf" id="3HJD4JbIvTl" role="33vP2m">
        <node concept="1pGfFk" id="3HJD4JbIvTm" role="2ShVmc">
          <ref role="37wK5l" to="33ny:~ArrayList.&lt;init&gt;()" resolve="ArrayList" />
          <node concept="3uibUv" id="3HJD4JbIvTn" role="1pMfVU">
            <ref role="3uigEE" node="3HJD4JbIwEp" resolve="Line" />
          </node>
        </node>
      </node>
    </node>
    <node concept="312cEg" id="3HJD4JbIvTo" role="jymVt">
      <property role="TrG5h" value="myArrowHeads" />
      <node concept="3uibUv" id="3HJD4JbIvTp" role="1tU5fm">
        <ref role="3uigEE" to="33ny:~Set" resolve="Set" />
        <node concept="3uibUv" id="3HJD4JbIvTq" role="11_B2D">
          <ref role="3uigEE" node="3HJD4JbIwjx" resolve="ArrowHead" />
        </node>
      </node>
      <node concept="3Tmbuc" id="JwZXmxZ9m9" role="1B3o_S" />
      <node concept="2ShNRf" id="3HJD4JbIvTs" role="33vP2m">
        <node concept="1pGfFk" id="3HJD4JbIvTt" role="2ShVmc">
          <ref role="37wK5l" to="33ny:~HashSet.&lt;init&gt;()" resolve="HashSet" />
          <node concept="3uibUv" id="3HJD4JbIvTu" role="1pMfVU">
            <ref role="3uigEE" node="3HJD4JbIwjx" resolve="ArrowHead" />
          </node>
        </node>
      </node>
    </node>
    <node concept="312cEg" id="3HJD4JbIvTv" role="jymVt">
      <property role="TrG5h" value="myFreeZoneMap" />
      <node concept="3uibUv" id="3HJD4JbIvTw" role="1tU5fm">
        <ref role="3uigEE" to="33ny:~Map" resolve="Map" />
        <node concept="3uibUv" id="3HJD4JbIvTx" role="11_B2D">
          <ref role="3uigEE" to="wyt6:~Integer" resolve="Integer" />
        </node>
        <node concept="3uibUv" id="3HJD4JbIvTy" role="11_B2D">
          <ref role="3uigEE" node="3HJD4JbIwwC" resolve="FreeZone" />
        </node>
      </node>
      <node concept="3Tm6S6" id="3HJD4JbIvTz" role="1B3o_S" />
      <node concept="2ShNRf" id="3HJD4JbIvT$" role="33vP2m">
        <node concept="1pGfFk" id="3HJD4JbIvT_" role="2ShVmc">
          <ref role="37wK5l" to="33ny:~HashMap.&lt;init&gt;()" resolve="HashMap" />
          <node concept="3uibUv" id="3HJD4JbIvTA" role="1pMfVU">
            <ref role="3uigEE" to="wyt6:~Integer" resolve="Integer" />
          </node>
          <node concept="3uibUv" id="3HJD4JbIvTB" role="1pMfVU">
            <ref role="3uigEE" node="3HJD4JbIwwC" resolve="FreeZone" />
          </node>
        </node>
      </node>
    </node>
    <node concept="312cEg" id="3HJD4JbIvTC" role="jymVt">
      <property role="TrG5h" value="myMaxLineIndentRight" />
      <node concept="10Oyi0" id="3HJD4JbIvTD" role="1tU5fm" />
    </node>
    <node concept="312cEg" id="3HJD4JbIvTE" role="jymVt">
      <property role="TrG5h" value="myMaxLineIndentLeft" />
      <node concept="10Oyi0" id="3HJD4JbIvTF" role="1tU5fm" />
    </node>
    <node concept="312cEg" id="3HJD4JbIvTG" role="jymVt">
      <property role="TrG5h" value="myWidth" />
      <node concept="10Oyi0" id="3HJD4JbIvTH" role="1tU5fm" />
      <node concept="3Tm6S6" id="3HJD4JbIvTI" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="3HJD4JbIvTJ" role="jymVt">
      <property role="TrG5h" value="myHeight" />
      <node concept="10Oyi0" id="3HJD4JbIvTK" role="1tU5fm" />
      <node concept="3Tm6S6" id="3HJD4JbIvTL" role="1B3o_S" />
    </node>
    <node concept="3clFbW" id="3HJD4JbIvTM" role="jymVt">
      <node concept="3Tm1VV" id="3HJD4JbIvTN" role="1B3o_S" />
      <node concept="37vLTG" id="3HJD4JbIvTO" role="3clF46">
        <property role="TrG5h" value="program" />
        <node concept="3uibUv" id="3HJD4JbIvTP" role="1tU5fm">
          <ref role="3uigEE" node="3HJD4JbIwB2" resolve="IProgram" />
          <node concept="16syzq" id="3HJD4JbIvTQ" role="11_B2D">
            <ref role="16sUi3" node="3HJD4JbIvSI" resolve="T" />
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="3HJD4JbIvTR" role="3clF46">
        <property role="TrG5h" value="graphCreator" />
        <node concept="3uibUv" id="3HJD4JbIvTS" role="1tU5fm">
          <ref role="3uigEE" node="3HJD4JbIw7M" resolve="IGraphCreator" />
          <node concept="16syzq" id="3HJD4JbIvTT" role="11_B2D">
            <ref role="16sUi3" node="3HJD4JbIvSI" resolve="T" />
          </node>
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIvTW" role="3clF47">
        <node concept="3clFbF" id="3HJD4JbIvTX" role="3cqZAp">
          <node concept="37vLTI" id="3HJD4JbIvTY" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIvTZ" role="37vLTJ">
              <node concept="2OwXpG" id="3HJD4JbIvU0" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvT1" resolve="myProgram" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIvU1" role="2Oq$k0" />
            </node>
            <node concept="37vLTw" id="2BHiRxghePz" role="37vLTx">
              <ref role="3cqZAo" node="3HJD4JbIvTO" resolve="program" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIvU3" role="3cqZAp">
          <node concept="37vLTI" id="3HJD4JbIvU4" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIvU5" role="37vLTJ">
              <node concept="2OwXpG" id="3HJD4JbIvU6" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvSX" resolve="myGraphCreator" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIvU7" role="2Oq$k0" />
            </node>
            <node concept="37vLTw" id="2BHiRxgmaZu" role="37vLTx">
              <ref role="3cqZAo" node="3HJD4JbIvTR" resolve="graphCreator" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIvUf" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIvUg" role="3clFbG">
            <node concept="Xjq3P" id="3HJD4JbIvUh" role="2Oq$k0">
              <ref role="1HBi2w" node="3HJD4JbIvSG" resolve="ControlFlowGraph" />
            </node>
            <node concept="liA8E" id="3HJD4JbIvUi" role="2OqNvi">
              <ref role="37wK5l" node="3HJD4JbIvUj" resolve="buildBlocks" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIvUj" role="jymVt">
      <property role="TrG5h" value="buildBlocks" />
      <node concept="3Tm1VV" id="3HJD4JbIvUk" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIvUl" role="3clF45" />
      <node concept="3clFbS" id="3HJD4JbIvUm" role="3clF47">
        <node concept="3cpWs8" id="6bzHk29ogrj" role="3cqZAp">
          <node concept="3cpWsn" id="6bzHk29ogrk" role="3cpWs9">
            <property role="TrG5h" value="instructionToBlock" />
            <node concept="3uibUv" id="6bzHk29ogrl" role="1tU5fm">
              <ref role="3uigEE" to="33ny:~Map" resolve="Map" />
              <node concept="3uibUv" id="6bzHk29ogrn" role="11_B2D">
                <ref role="3uigEE" node="3HJD4JbIvSt" resolve="IInstruction" />
                <node concept="16syzq" id="6bzHk29ogvg" role="11_B2D">
                  <ref role="16sUi3" node="3HJD4JbIvSI" resolve="T" />
                </node>
              </node>
              <node concept="3uibUv" id="6bzHk29ogrp" role="11_B2D">
                <ref role="3uigEE" node="3HJD4JbIw8e" resolve="IBlock" />
              </node>
            </node>
            <node concept="2ShNRf" id="6bzHk29ogrr" role="33vP2m">
              <node concept="1pGfFk" id="6bzHk29ogrt" role="2ShVmc">
                <ref role="37wK5l" to="33ny:~HashMap.&lt;init&gt;()" resolve="HashMap" />
                <node concept="3uibUv" id="6bzHk29ogrD" role="1pMfVU">
                  <ref role="3uigEE" node="3HJD4JbIvSt" resolve="IInstruction" />
                  <node concept="16syzq" id="2YLwg5UNXl7" role="11_B2D">
                    <ref role="16sUi3" node="3HJD4JbIvSI" resolve="T" />
                  </node>
                </node>
                <node concept="3uibUv" id="6bzHk29ogrG" role="1pMfVU">
                  <ref role="3uigEE" node="3HJD4JbIw8e" resolve="IBlock" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="1DcWWT" id="3HJD4JbIvUn" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIvUo" role="1DdaDG">
            <node concept="2OqwBi" id="3HJD4JbIvUp" role="2Oq$k0">
              <node concept="2OwXpG" id="3HJD4JbIvUq" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvT1" resolve="myProgram" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIvUr" role="2Oq$k0" />
            </node>
            <node concept="liA8E" id="3HJD4JbIvUs" role="2OqNvi">
              <ref role="37wK5l" node="3HJD4JbIwBh" resolve="getInstructions" />
            </node>
          </node>
          <node concept="3cpWsn" id="3HJD4JbIvUt" role="1Duv9x">
            <property role="TrG5h" value="instruction" />
            <node concept="3uibUv" id="3HJD4JbIvUu" role="1tU5fm">
              <ref role="3uigEE" node="3HJD4JbIvSt" resolve="IInstruction" />
              <node concept="16syzq" id="3HJD4JbIvUv" role="11_B2D">
                <ref role="16sUi3" node="3HJD4JbIvSI" resolve="T" />
              </node>
            </node>
          </node>
          <node concept="3clFbS" id="3HJD4JbIvUw" role="2LFqv$">
            <node concept="3cpWs8" id="6bzHk29ogs6" role="3cqZAp">
              <node concept="3cpWsn" id="6bzHk29ogs7" role="3cpWs9">
                <property role="TrG5h" value="block" />
                <node concept="3uibUv" id="6bzHk29ogs8" role="1tU5fm">
                  <ref role="3uigEE" node="3HJD4JbIw8e" resolve="IBlock" />
                </node>
                <node concept="2OqwBi" id="3HJD4JbIvUB" role="33vP2m">
                  <node concept="2OqwBi" id="3HJD4JbIvUC" role="2Oq$k0">
                    <node concept="2OwXpG" id="3HJD4JbIvUD" role="2OqNvi">
                      <ref role="2Oxat5" node="3HJD4JbIvSX" resolve="myGraphCreator" />
                    </node>
                    <node concept="Xjq3P" id="3HJD4JbIvUE" role="2Oq$k0" />
                  </node>
                  <node concept="liA8E" id="3HJD4JbIvUF" role="2OqNvi">
                    <ref role="37wK5l" node="3HJD4JbIw7R" resolve="createBlock" />
                    <node concept="10QFUN" id="3HJD4JbIvUG" role="37wK5m">
                      <node concept="37vLTw" id="3GM_nagTB33" role="10QFUP">
                        <ref role="3cqZAo" node="3HJD4JbIvUt" resolve="instruction" />
                      </node>
                      <node concept="16syzq" id="3HJD4JbIvUI" role="10QFUM">
                        <ref role="16sUi3" node="3HJD4JbIvSI" resolve="T" />
                      </node>
                    </node>
                    <node concept="37vLTw" id="2BHiRxeonLy" role="37wK5m">
                      <ref role="3cqZAo" node="3HJD4JbIvSL" resolve="MARGIN_X" />
                    </node>
                    <node concept="3cmrfG" id="3HJD4JbIvUK" role="37wK5m">
                      <property role="3cmrfH" value="0" />
                    </node>
                    <node concept="3cmrfG" id="3HJD4JbIvUL" role="37wK5m">
                      <property role="3cmrfH" value="0" />
                    </node>
                    <node concept="3cmrfG" id="3HJD4JbIvUM" role="37wK5m">
                      <property role="3cmrfH" value="0" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbF" id="3HJD4JbIvUx" role="3cqZAp">
              <node concept="2OqwBi" id="3HJD4JbIvUy" role="3clFbG">
                <node concept="2OqwBi" id="3HJD4JbIvUz" role="2Oq$k0">
                  <node concept="2OwXpG" id="3HJD4JbIvU$" role="2OqNvi">
                    <ref role="2Oxat5" node="3HJD4JbIvT8" resolve="myBlocks" />
                  </node>
                  <node concept="Xjq3P" id="3HJD4JbIvU_" role="2Oq$k0" />
                </node>
                <node concept="liA8E" id="3HJD4JbIvUA" role="2OqNvi">
                  <ref role="37wK5l" to="33ny:~List.add(java.lang.Object):boolean" resolve="add" />
                  <node concept="37vLTw" id="3GM_nagTAo9" role="37wK5m">
                    <ref role="3cqZAo" node="6bzHk29ogs7" resolve="block" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbF" id="6bzHk29ogrI" role="3cqZAp">
              <node concept="2OqwBi" id="6bzHk29ogrU" role="3clFbG">
                <node concept="37vLTw" id="3GM_nagT$kj" role="2Oq$k0">
                  <ref role="3cqZAo" node="6bzHk29ogrk" resolve="instructionToBlock" />
                </node>
                <node concept="liA8E" id="6bzHk29ogs0" role="2OqNvi">
                  <ref role="37wK5l" to="33ny:~Map.put(java.lang.Object,java.lang.Object):java.lang.Object" resolve="put" />
                  <node concept="37vLTw" id="3GM_nagTsyl" role="37wK5m">
                    <ref role="3cqZAo" node="3HJD4JbIvUt" resolve="instruction" />
                  </node>
                  <node concept="37vLTw" id="3GM_nagTtCe" role="37wK5m">
                    <ref role="3cqZAo" node="6bzHk29ogs7" resolve="block" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="1DcWWT" id="6bzHk29ogsg" role="3cqZAp">
          <node concept="3clFbS" id="6bzHk29ogsh" role="2LFqv$">
            <node concept="3cpWs8" id="6bzHk29ogsU" role="3cqZAp">
              <node concept="3cpWsn" id="6bzHk29ogsV" role="3cpWs9">
                <property role="TrG5h" value="block" />
                <node concept="3uibUv" id="6bzHk29ogsW" role="1tU5fm">
                  <ref role="3uigEE" node="3HJD4JbIw8e" resolve="IBlock" />
                </node>
                <node concept="2OqwBi" id="6bzHk29ogt9" role="33vP2m">
                  <node concept="37vLTw" id="3GM_nagTr1M" role="2Oq$k0">
                    <ref role="3cqZAo" node="6bzHk29ogrk" resolve="instructionToBlock" />
                  </node>
                  <node concept="liA8E" id="6bzHk29ogtf" role="2OqNvi">
                    <ref role="37wK5l" to="33ny:~Map.get(java.lang.Object):java.lang.Object" resolve="get" />
                    <node concept="37vLTw" id="3GM_nagTsHw" role="37wK5m">
                      <ref role="3cqZAo" node="6bzHk29ogsj" resolve="instruction" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3cpWs8" id="6bzHk29ogu1" role="3cqZAp">
              <node concept="3cpWsn" id="6bzHk29ogu2" role="3cpWs9">
                <property role="TrG5h" value="succ" />
                <node concept="3uibUv" id="6bzHk29ogu3" role="1tU5fm">
                  <ref role="3uigEE" to="33ny:~Set" resolve="Set" />
                  <node concept="3uibUv" id="6bzHk29ogu6" role="11_B2D">
                    <ref role="3uigEE" node="3HJD4JbIw8e" resolve="IBlock" />
                  </node>
                </node>
                <node concept="2ShNRf" id="6bzHk29ogu8" role="33vP2m">
                  <node concept="1pGfFk" id="6bzHk29ogun" role="2ShVmc">
                    <ref role="37wK5l" to="33ny:~HashSet.&lt;init&gt;()" resolve="HashSet" />
                    <node concept="3uibUv" id="6bzHk29oguq" role="1pMfVU">
                      <ref role="3uigEE" node="3HJD4JbIw8e" resolve="IBlock" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="1DcWWT" id="6bzHk29ogti" role="3cqZAp">
              <node concept="3clFbS" id="6bzHk29ogtj" role="2LFqv$">
                <node concept="3clFbF" id="6bzHk29ogur" role="3cqZAp">
                  <node concept="2OqwBi" id="6bzHk29oguB" role="3clFbG">
                    <node concept="37vLTw" id="3GM_nagTw9M" role="2Oq$k0">
                      <ref role="3cqZAo" node="6bzHk29ogu2" resolve="succ" />
                    </node>
                    <node concept="liA8E" id="6bzHk29oguH" role="2OqNvi">
                      <ref role="37wK5l" to="33ny:~Set.add(java.lang.Object):boolean" resolve="add" />
                      <node concept="2OqwBi" id="6bzHk29oguT" role="37wK5m">
                        <node concept="37vLTw" id="3GM_nagTBe7" role="2Oq$k0">
                          <ref role="3cqZAo" node="6bzHk29ogrk" resolve="instructionToBlock" />
                        </node>
                        <node concept="liA8E" id="6bzHk29oguZ" role="2OqNvi">
                          <ref role="37wK5l" to="33ny:~Map.get(java.lang.Object):java.lang.Object" resolve="get" />
                          <node concept="37vLTw" id="3GM_nagTz4D" role="37wK5m">
                            <ref role="3cqZAo" node="6bzHk29ogtl" resolve="instructionSucc" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3cpWsn" id="6bzHk29ogtl" role="1Duv9x">
                <property role="TrG5h" value="instructionSucc" />
                <node concept="3uibUv" id="6bzHk29ogve" role="1tU5fm">
                  <ref role="3uigEE" node="3HJD4JbIvSt" resolve="IInstruction" />
                  <node concept="16syzq" id="6bzHk29ogvV" role="11_B2D">
                    <ref role="16sUi3" node="3HJD4JbIvSI" resolve="T" />
                  </node>
                </node>
              </node>
              <node concept="2OqwBi" id="6bzHk29ogtz" role="1DdaDG">
                <node concept="37vLTw" id="3GM_nagTvEl" role="2Oq$k0">
                  <ref role="3cqZAo" node="6bzHk29ogsj" resolve="instruction" />
                </node>
                <node concept="liA8E" id="6bzHk29ogtD" role="2OqNvi">
                  <ref role="37wK5l" node="3HJD4JbIvSy" resolve="succ" />
                </node>
              </node>
            </node>
            <node concept="3clFbF" id="6bzHk29ogvX" role="3cqZAp">
              <node concept="2OqwBi" id="6bzHk29ogw9" role="3clFbG">
                <node concept="37vLTw" id="3GM_nagTr5J" role="2Oq$k0">
                  <ref role="3cqZAo" node="6bzHk29ogsV" resolve="block" />
                </node>
                <node concept="liA8E" id="6bzHk29ogwf" role="2OqNvi">
                  <ref role="37wK5l" node="6bzHk29ogh9" resolve="setSucc" />
                  <node concept="37vLTw" id="3GM_nagTrm1" role="37wK5m">
                    <ref role="3cqZAo" node="6bzHk29ogu2" resolve="succ" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3cpWsn" id="6bzHk29ogsj" role="1Duv9x">
            <property role="TrG5h" value="instruction" />
            <node concept="3uibUv" id="6bzHk29ogsl" role="1tU5fm">
              <ref role="3uigEE" node="3HJD4JbIvSt" resolve="IInstruction" />
              <node concept="16syzq" id="6bzHk29ogvG" role="11_B2D">
                <ref role="16sUi3" node="3HJD4JbIvSI" resolve="T" />
              </node>
            </node>
          </node>
          <node concept="2OqwBi" id="6bzHk29ogsM" role="1DdaDG">
            <node concept="2OqwBi" id="6bzHk29ogsx" role="2Oq$k0">
              <node concept="Xjq3P" id="6bzHk29ogsm" role="2Oq$k0" />
              <node concept="2OwXpG" id="6bzHk29ogsA" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvT1" resolve="myProgram" />
              </node>
            </node>
            <node concept="liA8E" id="6bzHk29ogsR" role="2OqNvi">
              <ref role="37wK5l" node="3HJD4JbIwBh" resolve="getInstructions" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIvUR" role="jymVt">
      <property role="TrG5h" value="paint" />
      <node concept="3Tm1VV" id="3HJD4JbIvUS" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIvUT" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIvUU" role="3clF46">
        <property role="TrG5h" value="g" />
        <node concept="3uibUv" id="3HJD4JbIvUV" role="1tU5fm">
          <ref role="3uigEE" to="z60i:~Graphics" resolve="Graphics" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIvUW" role="3clF47">
        <node concept="1DcWWT" id="3HJD4JbIvUX" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIvUY" role="1DdaDG">
            <node concept="2OwXpG" id="3HJD4JbIvUZ" role="2OqNvi">
              <ref role="2Oxat5" node="3HJD4JbIvT8" resolve="myBlocks" />
            </node>
            <node concept="Xjq3P" id="3HJD4JbIvV0" role="2Oq$k0" />
          </node>
          <node concept="3cpWsn" id="3HJD4JbIvV1" role="1Duv9x">
            <property role="TrG5h" value="block" />
            <node concept="3uibUv" id="3HJD4JbIvV2" role="1tU5fm">
              <ref role="3uigEE" node="3HJD4JbIw8e" resolve="IBlock" />
            </node>
          </node>
          <node concept="3clFbS" id="3HJD4JbIvV3" role="2LFqv$">
            <node concept="3clFbF" id="3HJD4JbIvV4" role="3cqZAp">
              <node concept="2OqwBi" id="3HJD4JbIvV5" role="3clFbG">
                <node concept="37vLTw" id="3GM_nagTwJc" role="2Oq$k0">
                  <ref role="3cqZAo" node="3HJD4JbIvV1" resolve="block" />
                </node>
                <node concept="liA8E" id="3HJD4JbIvV7" role="2OqNvi">
                  <ref role="37wK5l" node="3HJD4JbIw8j" resolve="paint" />
                  <node concept="37vLTw" id="2BHiRxgm65P" role="37wK5m">
                    <ref role="3cqZAo" node="3HJD4JbIvUU" resolve="g" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="3HJD4JbIvV9" role="3cqZAp">
          <node concept="3cpWsn" id="3HJD4JbIvVa" role="3cpWs9">
            <property role="TrG5h" value="lines" />
            <node concept="3uibUv" id="3HJD4JbIvVb" role="1tU5fm">
              <ref role="3uigEE" to="33ny:~List" resolve="List" />
              <node concept="3uibUv" id="3HJD4JbIvVc" role="11_B2D">
                <ref role="3uigEE" node="3HJD4JbIwEp" resolve="Line" />
              </node>
            </node>
            <node concept="2ShNRf" id="3HJD4JbIvVd" role="33vP2m">
              <node concept="1pGfFk" id="3HJD4JbIvVe" role="2ShVmc">
                <ref role="37wK5l" to="33ny:~ArrayList.&lt;init&gt;(java.util.Collection)" resolve="ArrayList" />
                <node concept="3uibUv" id="3HJD4JbIvVf" role="1pMfVU">
                  <ref role="3uigEE" node="3HJD4JbIwEp" resolve="Line" />
                </node>
                <node concept="2OqwBi" id="3HJD4JbIvVg" role="37wK5m">
                  <node concept="2OwXpG" id="3HJD4JbIvVh" role="2OqNvi">
                    <ref role="2Oxat5" node="3HJD4JbIvTh" resolve="myLines" />
                  </node>
                  <node concept="Xjq3P" id="3HJD4JbIvVi" role="2Oq$k0" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIvVj" role="3cqZAp">
          <node concept="2YIFZM" id="3HJD4JbIvVk" role="3clFbG">
            <ref role="1Pybhc" to="33ny:~Collections" resolve="Collections" />
            <ref role="37wK5l" to="33ny:~Collections.sort(java.util.List):void" resolve="sort" />
            <node concept="37vLTw" id="3GM_nagTv71" role="37wK5m">
              <ref role="3cqZAo" node="3HJD4JbIvVa" resolve="lines" />
            </node>
          </node>
        </node>
        <node concept="1DcWWT" id="3HJD4JbIvVm" role="3cqZAp">
          <node concept="37vLTw" id="3GM_nagTs8v" role="1DdaDG">
            <ref role="3cqZAo" node="3HJD4JbIvVa" resolve="lines" />
          </node>
          <node concept="3cpWsn" id="3HJD4JbIvVo" role="1Duv9x">
            <property role="TrG5h" value="line" />
            <node concept="3uibUv" id="3HJD4JbIvVp" role="1tU5fm">
              <ref role="3uigEE" node="3HJD4JbIwEp" resolve="Line" />
            </node>
          </node>
          <node concept="3clFbS" id="3HJD4JbIvVq" role="2LFqv$">
            <node concept="3clFbF" id="3HJD4JbIvVr" role="3cqZAp">
              <node concept="2OqwBi" id="3HJD4JbIvVs" role="3clFbG">
                <node concept="37vLTw" id="3GM_nagTxnn" role="2Oq$k0">
                  <ref role="3cqZAo" node="3HJD4JbIvVo" resolve="line" />
                </node>
                <node concept="liA8E" id="3HJD4JbIvVu" role="2OqNvi">
                  <ref role="37wK5l" node="JwZXmy0ik1" resolve="paint" />
                  <node concept="37vLTw" id="2BHiRxghfNG" role="37wK5m">
                    <ref role="3cqZAo" node="3HJD4JbIvUU" resolve="g" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="1DcWWT" id="3HJD4JbIvV_" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIvVA" role="1DdaDG">
            <node concept="2OwXpG" id="3HJD4JbIvVB" role="2OqNvi">
              <ref role="2Oxat5" node="3HJD4JbIvTo" resolve="myArrowHeads" />
            </node>
            <node concept="Xjq3P" id="3HJD4JbIvVC" role="2Oq$k0" />
          </node>
          <node concept="3cpWsn" id="3HJD4JbIvVD" role="1Duv9x">
            <property role="TrG5h" value="arrowHead" />
            <node concept="3uibUv" id="3HJD4JbIvVE" role="1tU5fm">
              <ref role="3uigEE" node="3HJD4JbIwjx" resolve="ArrowHead" />
            </node>
          </node>
          <node concept="3clFbS" id="3HJD4JbIvVF" role="2LFqv$">
            <node concept="3clFbF" id="3HJD4JbIvVG" role="3cqZAp">
              <node concept="2OqwBi" id="3HJD4JbIvVH" role="3clFbG">
                <node concept="37vLTw" id="3GM_nagTAF6" role="2Oq$k0">
                  <ref role="3cqZAo" node="3HJD4JbIvVD" resolve="arrowHead" />
                </node>
                <node concept="liA8E" id="3HJD4JbIvVJ" role="2OqNvi">
                  <ref role="37wK5l" node="3HJD4JbIwkR" resolve="paint" />
                  <node concept="37vLTw" id="2BHiRxgmCog" role="37wK5m">
                    <ref role="3cqZAo" node="3HJD4JbIvUU" resolve="g" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="1ekf28us_WC" role="jymVt">
      <property role="TrG5h" value="setComponent" />
      <node concept="3cqZAl" id="1ekf28us_WD" role="3clF45" />
      <node concept="3Tm1VV" id="1ekf28us_WE" role="1B3o_S" />
      <node concept="3clFbS" id="1ekf28us_WF" role="3clF47">
        <node concept="3clFbF" id="1ekf28us_Xg" role="3cqZAp">
          <node concept="37vLTI" id="1ekf28us_XD" role="3clFbG">
            <node concept="37vLTw" id="2BHiRxgm7Cj" role="37vLTx">
              <ref role="3cqZAo" node="1ekf28us_WX" resolve="component" />
            </node>
            <node concept="2OqwBi" id="1ekf28us_Xq" role="37vLTJ">
              <node concept="Xjq3P" id="1ekf28us_Xh" role="2Oq$k0" />
              <node concept="2OwXpG" id="1ekf28us_Xv" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvT5" resolve="myComponent" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="1ekf28us_WX" role="3clF46">
        <property role="TrG5h" value="component" />
        <node concept="3uibUv" id="1ekf28us_WY" role="1tU5fm">
          <ref role="3uigEE" to="z60i:~Component" resolve="Component" />
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIvVL" role="jymVt">
      <property role="TrG5h" value="relayout" />
      <node concept="3Tm1VV" id="3HJD4JbIvVM" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIvVN" role="3clF45" />
      <node concept="3clFbS" id="3HJD4JbIvVO" role="3clF47">
        <node concept="3clFbF" id="3HJD4JbIvVP" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIvVQ" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIvVR" role="2Oq$k0">
              <node concept="2OwXpG" id="3HJD4JbIvVS" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvTh" resolve="myLines" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIvVT" role="2Oq$k0" />
            </node>
            <node concept="liA8E" id="3HJD4JbIvVU" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~List.clear():void" resolve="clear" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIvVV" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIvVW" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIvVX" role="2Oq$k0">
              <node concept="2OwXpG" id="3HJD4JbIvVY" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvTo" resolve="myArrowHeads" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIvVZ" role="2Oq$k0" />
            </node>
            <node concept="liA8E" id="3HJD4JbIvW0" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~Set.clear():void" resolve="clear" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIvW1" role="3cqZAp">
          <node concept="37vLTI" id="3HJD4JbIvW2" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIvW3" role="37vLTJ">
              <node concept="2OwXpG" id="3HJD4JbIvW4" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvTC" resolve="myMaxLineIndentRight" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIvW5" role="2Oq$k0" />
            </node>
            <node concept="3cmrfG" id="3HJD4JbIvW6" role="37vLTx">
              <property role="3cmrfH" value="0" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIvW7" role="3cqZAp">
          <node concept="37vLTI" id="3HJD4JbIvW8" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIvW9" role="37vLTJ">
              <node concept="2OwXpG" id="3HJD4JbIvWa" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvTE" resolve="myMaxLineIndentLeft" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIvWb" role="2Oq$k0" />
            </node>
            <node concept="3cmrfG" id="3HJD4JbIvWc" role="37vLTx">
              <property role="3cmrfH" value="0" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIvWd" role="3cqZAp">
          <node concept="37vLTI" id="3HJD4JbIvWe" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIvWf" role="37vLTJ">
              <node concept="2OwXpG" id="3HJD4JbIvWg" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvTv" resolve="myFreeZoneMap" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIvWh" role="2Oq$k0" />
            </node>
            <node concept="2ShNRf" id="3HJD4JbIvWi" role="37vLTx">
              <node concept="1pGfFk" id="3HJD4JbIvWj" role="2ShVmc">
                <ref role="37wK5l" to="33ny:~HashMap.&lt;init&gt;()" resolve="HashMap" />
                <node concept="3uibUv" id="3HJD4JbIvWk" role="1pMfVU">
                  <ref role="3uigEE" to="wyt6:~Integer" resolve="Integer" />
                </node>
                <node concept="3uibUv" id="3HJD4JbIvWl" role="1pMfVU">
                  <ref role="3uigEE" node="3HJD4JbIwwC" resolve="FreeZone" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="1DcWWT" id="3HJD4JbIvWm" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIvWn" role="1DdaDG">
            <node concept="2OwXpG" id="3HJD4JbIvWo" role="2OqNvi">
              <ref role="2Oxat5" node="3HJD4JbIvT8" resolve="myBlocks" />
            </node>
            <node concept="Xjq3P" id="3HJD4JbIvWp" role="2Oq$k0" />
          </node>
          <node concept="3cpWsn" id="3HJD4JbIvWq" role="1Duv9x">
            <property role="TrG5h" value="block" />
            <node concept="3uibUv" id="3HJD4JbIvWr" role="1tU5fm">
              <ref role="3uigEE" node="3HJD4JbIw8e" resolve="IBlock" />
            </node>
          </node>
          <node concept="3clFbS" id="3HJD4JbIvWt" role="2LFqv$">
            <node concept="3clFbF" id="3HJD4JbIvWu" role="3cqZAp">
              <node concept="2OqwBi" id="3HJD4JbIvWv" role="3clFbG">
                <node concept="37vLTw" id="3GM_nagTwta" role="2Oq$k0">
                  <ref role="3cqZAo" node="3HJD4JbIvWq" resolve="block" />
                </node>
                <node concept="liA8E" id="3HJD4JbIvWx" role="2OqNvi">
                  <ref role="37wK5l" node="3HJD4JbIw8p" resolve="relayout" />
                  <node concept="2OqwBi" id="3HJD4JbIvWy" role="37wK5m">
                    <node concept="2OwXpG" id="3HJD4JbIvWz" role="2OqNvi">
                      <ref role="2Oxat5" node="3HJD4JbIvT5" resolve="myComponent" />
                    </node>
                    <node concept="Xjq3P" id="3HJD4JbIvW$" role="2Oq$k0" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="3HJD4JbIvW_" role="3cqZAp">
          <node concept="3cpWsn" id="3HJD4JbIvWA" role="3cpWs9">
            <property role="TrG5h" value="maxWidth" />
            <node concept="10Oyi0" id="3HJD4JbIvWB" role="1tU5fm" />
            <node concept="3cmrfG" id="3HJD4JbIvWC" role="33vP2m">
              <property role="3cmrfH" value="0" />
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="3HJD4JbIvWD" role="3cqZAp">
          <node concept="3cpWsn" id="3HJD4JbIvWE" role="3cpWs9">
            <property role="TrG5h" value="maxHeight" />
            <node concept="10Oyi0" id="3HJD4JbIvWF" role="1tU5fm" />
            <node concept="3cmrfG" id="3HJD4JbIvWG" role="33vP2m">
              <property role="3cmrfH" value="0" />
            </node>
          </node>
        </node>
        <node concept="1DcWWT" id="3HJD4JbIvWH" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIvWI" role="1DdaDG">
            <node concept="2OwXpG" id="3HJD4JbIvWJ" role="2OqNvi">
              <ref role="2Oxat5" node="3HJD4JbIvT8" resolve="myBlocks" />
            </node>
            <node concept="Xjq3P" id="3HJD4JbIvWK" role="2Oq$k0" />
          </node>
          <node concept="3cpWsn" id="3HJD4JbIvWL" role="1Duv9x">
            <property role="TrG5h" value="block" />
            <node concept="3uibUv" id="3HJD4JbIvWM" role="1tU5fm">
              <ref role="3uigEE" node="3HJD4JbIw8e" resolve="IBlock" />
            </node>
          </node>
          <node concept="3clFbS" id="3HJD4JbIvWO" role="2LFqv$">
            <node concept="3clFbF" id="3HJD4JbIvWP" role="3cqZAp">
              <node concept="37vLTI" id="3HJD4JbIvWQ" role="3clFbG">
                <node concept="37vLTw" id="3GM_nagTAHk" role="37vLTJ">
                  <ref role="3cqZAo" node="3HJD4JbIvWA" resolve="maxWidth" />
                </node>
                <node concept="2YIFZM" id="3HJD4JbIvWS" role="37vLTx">
                  <ref role="1Pybhc" to="wyt6:~Math" resolve="Math" />
                  <ref role="37wK5l" to="wyt6:~Math.max(int,int):int" resolve="max" />
                  <node concept="37vLTw" id="3GM_nagTvyY" role="37wK5m">
                    <ref role="3cqZAo" node="3HJD4JbIvWA" resolve="maxWidth" />
                  </node>
                  <node concept="2OqwBi" id="3HJD4JbIvWU" role="37wK5m">
                    <node concept="37vLTw" id="3GM_nagTxy3" role="2Oq$k0">
                      <ref role="3cqZAo" node="3HJD4JbIvWL" resolve="block" />
                    </node>
                    <node concept="liA8E" id="3HJD4JbIvWW" role="2OqNvi">
                      <ref role="37wK5l" node="3HJD4JbIw8F" resolve="getWidth" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbF" id="3HJD4JbIvWX" role="3cqZAp">
              <node concept="37vLTI" id="3HJD4JbIvWY" role="3clFbG">
                <node concept="37vLTw" id="3GM_nagTBGn" role="37vLTJ">
                  <ref role="3cqZAo" node="3HJD4JbIvWE" resolve="maxHeight" />
                </node>
                <node concept="2YIFZM" id="3HJD4JbIvX0" role="37vLTx">
                  <ref role="1Pybhc" to="wyt6:~Math" resolve="Math" />
                  <ref role="37wK5l" to="wyt6:~Math.max(int,int):int" resolve="max" />
                  <node concept="37vLTw" id="3GM_nagTve3" role="37wK5m">
                    <ref role="3cqZAo" node="3HJD4JbIvWE" resolve="maxHeight" />
                  </node>
                  <node concept="2OqwBi" id="3HJD4JbIvX2" role="37wK5m">
                    <node concept="37vLTw" id="3GM_nagTAl3" role="2Oq$k0">
                      <ref role="3cqZAo" node="3HJD4JbIvWL" resolve="block" />
                    </node>
                    <node concept="liA8E" id="3HJD4JbIvX4" role="2OqNvi">
                      <ref role="37wK5l" node="3HJD4JbIw8J" resolve="getHeight" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="3HJD4JbIvX5" role="3cqZAp">
          <node concept="3cpWsn" id="3HJD4JbIvX6" role="3cpWs9">
            <property role="TrG5h" value="y" />
            <node concept="10Oyi0" id="3HJD4JbIvX7" role="1tU5fm" />
            <node concept="37vLTw" id="2BHiRxeoq8x" role="33vP2m">
              <ref role="3cqZAo" node="3HJD4JbIvSP" resolve="MARGIN_Y" />
            </node>
          </node>
        </node>
        <node concept="1DcWWT" id="3HJD4JbIvX9" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIvXa" role="1DdaDG">
            <node concept="2OwXpG" id="3HJD4JbIvXb" role="2OqNvi">
              <ref role="2Oxat5" node="3HJD4JbIvT8" resolve="myBlocks" />
            </node>
            <node concept="Xjq3P" id="3HJD4JbIvXc" role="2Oq$k0" />
          </node>
          <node concept="3cpWsn" id="3HJD4JbIvXd" role="1Duv9x">
            <property role="TrG5h" value="block" />
            <node concept="3uibUv" id="3HJD4JbIvXe" role="1tU5fm">
              <ref role="3uigEE" node="3HJD4JbIw8e" resolve="IBlock" />
            </node>
          </node>
          <node concept="3clFbS" id="3HJD4JbIvXg" role="2LFqv$">
            <node concept="3clFbF" id="3HJD4JbIvXh" role="3cqZAp">
              <node concept="2OqwBi" id="3HJD4JbIvXi" role="3clFbG">
                <node concept="37vLTw" id="3GM_nagTyG7" role="2Oq$k0">
                  <ref role="3cqZAo" node="3HJD4JbIvXd" resolve="block" />
                </node>
                <node concept="liA8E" id="3HJD4JbIvXk" role="2OqNvi">
                  <ref role="37wK5l" node="3HJD4JbIw8N" resolve="setWidth" />
                  <node concept="37vLTw" id="3GM_nagTyqB" role="37wK5m">
                    <ref role="3cqZAo" node="3HJD4JbIvWA" resolve="maxWidth" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbF" id="3HJD4JbIvXm" role="3cqZAp">
              <node concept="2OqwBi" id="3HJD4JbIvXn" role="3clFbG">
                <node concept="37vLTw" id="3GM_nagTxHG" role="2Oq$k0">
                  <ref role="3cqZAo" node="3HJD4JbIvXd" resolve="block" />
                </node>
                <node concept="liA8E" id="3HJD4JbIvXp" role="2OqNvi">
                  <ref role="37wK5l" node="3HJD4JbIw8Z" resolve="setX" />
                  <node concept="37vLTw" id="2BHiRxeoryk" role="37wK5m">
                    <ref role="3cqZAo" node="3HJD4JbIvSL" resolve="MARGIN_X" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbF" id="3HJD4JbIvXr" role="3cqZAp">
              <node concept="2OqwBi" id="3HJD4JbIvXs" role="3clFbG">
                <node concept="37vLTw" id="3GM_nagT_2E" role="2Oq$k0">
                  <ref role="3cqZAo" node="3HJD4JbIvXd" resolve="block" />
                </node>
                <node concept="liA8E" id="3HJD4JbIvXu" role="2OqNvi">
                  <ref role="37wK5l" node="3HJD4JbIw95" resolve="setY" />
                  <node concept="37vLTw" id="3GM_nagTulO" role="37wK5m">
                    <ref role="3cqZAo" node="3HJD4JbIvX6" resolve="y" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbF" id="3HJD4JbIvXw" role="3cqZAp">
              <node concept="d57v9" id="3HJD4JbIvXx" role="3clFbG">
                <node concept="37vLTw" id="3GM_nagTubC" role="37vLTJ">
                  <ref role="3cqZAo" node="3HJD4JbIvX6" resolve="y" />
                </node>
                <node concept="2OqwBi" id="3HJD4JbIvXz" role="37vLTx">
                  <node concept="37vLTw" id="3GM_nagTyDh" role="2Oq$k0">
                    <ref role="3cqZAo" node="3HJD4JbIvXd" resolve="block" />
                  </node>
                  <node concept="liA8E" id="3HJD4JbIvX_" role="2OqNvi">
                    <ref role="37wK5l" node="3HJD4JbIw8J" resolve="getHeight" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbF" id="3HJD4JbIvXA" role="3cqZAp">
              <node concept="d57v9" id="3HJD4JbIvXB" role="3clFbG">
                <node concept="37vLTw" id="3GM_nagTylG" role="37vLTJ">
                  <ref role="3cqZAo" node="3HJD4JbIvX6" resolve="y" />
                </node>
                <node concept="FJ1c_" id="3HJD4JbIvXD" role="37vLTx">
                  <node concept="37vLTw" id="3GM_nagTyc3" role="3uHU7B">
                    <ref role="3cqZAo" node="3HJD4JbIvWE" resolve="maxHeight" />
                  </node>
                  <node concept="3cmrfG" id="3HJD4JbIvXF" role="3uHU7w">
                    <property role="3cmrfH" value="2" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="1Dw8fO" id="3HJD4JbIvXG" role="3cqZAp">
          <node concept="3eOVzh" id="3HJD4JbIvXH" role="1Dwp0S">
            <node concept="37vLTw" id="3GM_nagTtkS" role="3uHU7B">
              <ref role="3cqZAo" node="3HJD4JbIvYJ" resolve="i" />
            </node>
            <node concept="2OqwBi" id="3HJD4JbIvXJ" role="3uHU7w">
              <node concept="2OqwBi" id="3HJD4JbIvXK" role="2Oq$k0">
                <node concept="2OwXpG" id="3HJD4JbIvXL" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvT8" resolve="myBlocks" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIvXM" role="2Oq$k0" />
              </node>
              <node concept="liA8E" id="3HJD4JbIvXN" role="2OqNvi">
                <ref role="37wK5l" to="33ny:~List.size():int" resolve="size" />
              </node>
            </node>
          </node>
          <node concept="3clFbS" id="3HJD4JbIvXO" role="2LFqv$">
            <node concept="3cpWs8" id="3HJD4JbIvXP" role="3cqZAp">
              <node concept="3cpWsn" id="3HJD4JbIvXQ" role="3cpWs9">
                <property role="TrG5h" value="block" />
                <node concept="3uibUv" id="3HJD4JbIvXR" role="1tU5fm">
                  <ref role="3uigEE" node="3HJD4JbIw8e" resolve="IBlock" />
                </node>
                <node concept="2OqwBi" id="3HJD4JbIvXT" role="33vP2m">
                  <node concept="2OqwBi" id="3HJD4JbIvXU" role="2Oq$k0">
                    <node concept="2OwXpG" id="3HJD4JbIvXV" role="2OqNvi">
                      <ref role="2Oxat5" node="3HJD4JbIvT8" resolve="myBlocks" />
                    </node>
                    <node concept="Xjq3P" id="3HJD4JbIvXW" role="2Oq$k0" />
                  </node>
                  <node concept="liA8E" id="3HJD4JbIvXX" role="2OqNvi">
                    <ref role="37wK5l" to="33ny:~List.get(int):java.lang.Object" resolve="get" />
                    <node concept="37vLTw" id="3GM_nagTz3_" role="37wK5m">
                      <ref role="3cqZAo" node="3HJD4JbIvYJ" resolve="i" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="1DcWWT" id="3HJD4JbIvXZ" role="3cqZAp">
              <node concept="2OqwBi" id="3HJD4JbIvY0" role="1DdaDG">
                <node concept="37vLTw" id="3GM_nagTBW2" role="2Oq$k0">
                  <ref role="3cqZAo" node="3HJD4JbIvXQ" resolve="block" />
                </node>
                <node concept="liA8E" id="3HJD4JbIvY4" role="2OqNvi">
                  <ref role="37wK5l" node="6bzHk29oghz" resolve="succ" />
                </node>
              </node>
              <node concept="3cpWsn" id="3HJD4JbIvY5" role="1Duv9x">
                <property role="TrG5h" value="succBlock" />
                <node concept="3uibUv" id="6bzHk29ogl4" role="1tU5fm">
                  <ref role="3uigEE" node="3HJD4JbIw8e" resolve="IBlock" />
                </node>
              </node>
              <node concept="3clFbS" id="3HJD4JbIvY8" role="2LFqv$">
                <node concept="3clFbJ" id="3HJD4JbIvYj" role="3cqZAp">
                  <node concept="3clFbC" id="3HJD4JbIvYk" role="3clFbw">
                    <node concept="2OqwBi" id="3HJD4JbIvYl" role="3uHU7B">
                      <node concept="2OqwBi" id="3HJD4JbIvYm" role="2Oq$k0">
                        <node concept="2OwXpG" id="3HJD4JbIvYn" role="2OqNvi">
                          <ref role="2Oxat5" node="3HJD4JbIvT8" resolve="myBlocks" />
                        </node>
                        <node concept="Xjq3P" id="3HJD4JbIvYo" role="2Oq$k0" />
                      </node>
                      <node concept="liA8E" id="3HJD4JbIvYp" role="2OqNvi">
                        <ref role="37wK5l" to="33ny:~List.indexOf(java.lang.Object):int" resolve="indexOf" />
                        <node concept="37vLTw" id="3GM_nagTtd5" role="37wK5m">
                          <ref role="3cqZAo" node="3HJD4JbIvY5" resolve="succBlock" />
                        </node>
                      </node>
                    </node>
                    <node concept="3cpWs3" id="3HJD4JbIvYr" role="3uHU7w">
                      <node concept="37vLTw" id="3GM_nagTrtM" role="3uHU7B">
                        <ref role="3cqZAo" node="3HJD4JbIvYJ" resolve="i" />
                      </node>
                      <node concept="3cmrfG" id="3HJD4JbIvYt" role="3uHU7w">
                        <property role="3cmrfH" value="1" />
                      </node>
                    </node>
                  </node>
                  <node concept="9aQIb" id="3HJD4JbIvYu" role="9aQIa">
                    <node concept="3clFbS" id="3HJD4JbIvYv" role="9aQI4">
                      <node concept="3clFbF" id="3HJD4JbIvYw" role="3cqZAp">
                        <node concept="2OqwBi" id="3HJD4JbIvYx" role="3clFbG">
                          <node concept="Xjq3P" id="3HJD4JbIvYy" role="2Oq$k0">
                            <ref role="1HBi2w" node="3HJD4JbIvSG" resolve="ControlFlowGraph" />
                          </node>
                          <node concept="liA8E" id="3HJD4JbIvYz" role="2OqNvi">
                            <ref role="37wK5l" node="JwZXmy2H1R" resolve="addAdditionalLine" />
                            <node concept="37vLTw" id="3GM_nagTBR3" role="37wK5m">
                              <ref role="3cqZAo" node="3HJD4JbIvXQ" resolve="block" />
                            </node>
                            <node concept="37vLTw" id="3GM_nagT$KE" role="37wK5m">
                              <ref role="3cqZAo" node="3HJD4JbIvY5" resolve="succBlock" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbS" id="3HJD4JbIvYA" role="3clFbx">
                    <node concept="3clFbF" id="3HJD4JbIvYB" role="3cqZAp">
                      <node concept="2OqwBi" id="3HJD4JbIvYC" role="3clFbG">
                        <node concept="Xjq3P" id="3HJD4JbIvYD" role="2Oq$k0">
                          <ref role="1HBi2w" node="3HJD4JbIvSG" resolve="ControlFlowGraph" />
                        </node>
                        <node concept="liA8E" id="3HJD4JbIvYE" role="2OqNvi">
                          <ref role="37wK5l" node="JwZXmy4vES" resolve="addSimpleLine" />
                          <node concept="37vLTw" id="3GM_nagT$nl" role="37wK5m">
                            <ref role="3cqZAo" node="3HJD4JbIvXQ" resolve="block" />
                          </node>
                          <node concept="37vLTw" id="3GM_nagTtXN" role="37wK5m">
                            <ref role="3cqZAo" node="3HJD4JbIvY5" resolve="succBlock" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3uNrnE" id="3HJD4JbIvYH" role="1Dwrff">
            <node concept="37vLTw" id="3GM_nagTwzp" role="2$L3a6">
              <ref role="3cqZAo" node="3HJD4JbIvYJ" resolve="i" />
            </node>
          </node>
          <node concept="3cpWsn" id="3HJD4JbIvYJ" role="1Duv9x">
            <property role="TrG5h" value="i" />
            <node concept="10Oyi0" id="3HJD4JbIvYK" role="1tU5fm" />
            <node concept="3cmrfG" id="3HJD4JbIvYL" role="33vP2m">
              <property role="3cmrfH" value="0" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIvYM" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIvYN" role="3clFbG">
            <node concept="Xjq3P" id="3HJD4JbIvYO" role="2Oq$k0">
              <ref role="1HBi2w" node="3HJD4JbIvSG" resolve="ControlFlowGraph" />
            </node>
            <node concept="liA8E" id="3HJD4JbIvYP" role="2OqNvi">
              <ref role="37wK5l" node="3HJD4JbIvZo" resolve="shiftLeft" />
              <node concept="17qRlL" id="3HJD4JbIvYQ" role="37wK5m">
                <node concept="2OqwBi" id="3HJD4JbIvYR" role="3uHU7B">
                  <node concept="2OwXpG" id="3HJD4JbIvYS" role="2OqNvi">
                    <ref role="2Oxat5" node="3HJD4JbIvTE" resolve="myMaxLineIndentLeft" />
                  </node>
                  <node concept="Xjq3P" id="3HJD4JbIvYT" role="2Oq$k0" />
                </node>
                <node concept="37vLTw" id="2BHiRxeorzZ" role="3uHU7w">
                  <ref role="3cqZAo" node="3HJD4JbIvST" resolve="LINE_SEGMENT_SIZE" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIvYV" role="3cqZAp">
          <node concept="37vLTI" id="3HJD4JbIvYW" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIvYX" role="37vLTJ">
              <node concept="2OwXpG" id="3HJD4JbIvYY" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvTG" resolve="myWidth" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIvYZ" role="2Oq$k0" />
            </node>
            <node concept="3cpWs3" id="3HJD4JbIvZ0" role="37vLTx">
              <node concept="3cpWs3" id="3HJD4JbIvZ1" role="3uHU7B">
                <node concept="17qRlL" id="3HJD4JbIvZ2" role="3uHU7B">
                  <node concept="37vLTw" id="2BHiRxeon9b" role="3uHU7B">
                    <ref role="3cqZAo" node="3HJD4JbIvSL" resolve="MARGIN_X" />
                  </node>
                  <node concept="3cmrfG" id="3HJD4JbIvZ4" role="3uHU7w">
                    <property role="3cmrfH" value="2" />
                  </node>
                </node>
                <node concept="37vLTw" id="3GM_nagTAC3" role="3uHU7w">
                  <ref role="3cqZAo" node="3HJD4JbIvWA" resolve="maxWidth" />
                </node>
              </node>
              <node concept="17qRlL" id="3HJD4JbIvZ6" role="3uHU7w">
                <node concept="1eOMI4" id="3HJD4JbIvZ7" role="3uHU7B">
                  <node concept="3cpWs3" id="3HJD4JbIvZ8" role="1eOMHV">
                    <node concept="2OqwBi" id="3HJD4JbIvZ9" role="3uHU7B">
                      <node concept="2OwXpG" id="3HJD4JbIvZa" role="2OqNvi">
                        <ref role="2Oxat5" node="3HJD4JbIvTC" resolve="myMaxLineIndentRight" />
                      </node>
                      <node concept="Xjq3P" id="3HJD4JbIvZb" role="2Oq$k0" />
                    </node>
                    <node concept="2OqwBi" id="3HJD4JbIvZc" role="3uHU7w">
                      <node concept="2OwXpG" id="3HJD4JbIvZd" role="2OqNvi">
                        <ref role="2Oxat5" node="3HJD4JbIvTE" resolve="myMaxLineIndentLeft" />
                      </node>
                      <node concept="Xjq3P" id="3HJD4JbIvZe" role="2Oq$k0" />
                    </node>
                  </node>
                </node>
                <node concept="37vLTw" id="2BHiRxeonOh" role="3uHU7w">
                  <ref role="3cqZAo" node="3HJD4JbIvST" resolve="LINE_SEGMENT_SIZE" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIvZg" role="3cqZAp">
          <node concept="37vLTI" id="3HJD4JbIvZh" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIvZi" role="37vLTJ">
              <node concept="2OwXpG" id="3HJD4JbIvZj" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvTJ" resolve="myHeight" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIvZk" role="2Oq$k0" />
            </node>
            <node concept="3cpWs3" id="3HJD4JbIvZl" role="37vLTx">
              <node concept="37vLTw" id="3GM_nagTzUB" role="3uHU7B">
                <ref role="3cqZAo" node="3HJD4JbIvX6" resolve="y" />
              </node>
              <node concept="37vLTw" id="2BHiRxeok$y" role="3uHU7w">
                <ref role="3cqZAo" node="3HJD4JbIvSP" resolve="MARGIN_Y" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIvZo" role="jymVt">
      <property role="TrG5h" value="shiftLeft" />
      <node concept="3Tm6S6" id="3HJD4JbIvZp" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIvZq" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIvZr" role="3clF46">
        <property role="TrG5h" value="indent" />
        <node concept="10Oyi0" id="3HJD4JbIvZs" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="3HJD4JbIvZt" role="3clF47">
        <node concept="1DcWWT" id="3HJD4JbIvZu" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIvZv" role="1DdaDG">
            <node concept="2OwXpG" id="3HJD4JbIvZw" role="2OqNvi">
              <ref role="2Oxat5" node="3HJD4JbIvT8" resolve="myBlocks" />
            </node>
            <node concept="Xjq3P" id="3HJD4JbIvZx" role="2Oq$k0" />
          </node>
          <node concept="3cpWsn" id="3HJD4JbIvZy" role="1Duv9x">
            <property role="TrG5h" value="block" />
            <node concept="3uibUv" id="3HJD4JbIvZz" role="1tU5fm">
              <ref role="3uigEE" node="3HJD4JbIw8e" resolve="IBlock" />
            </node>
          </node>
          <node concept="3clFbS" id="3HJD4JbIvZ$" role="2LFqv$">
            <node concept="3clFbF" id="3HJD4JbIvZ_" role="3cqZAp">
              <node concept="2OqwBi" id="3HJD4JbIvZA" role="3clFbG">
                <node concept="37vLTw" id="3GM_nagTxfe" role="2Oq$k0">
                  <ref role="3cqZAo" node="3HJD4JbIvZy" resolve="block" />
                </node>
                <node concept="liA8E" id="3HJD4JbIvZC" role="2OqNvi">
                  <ref role="37wK5l" node="3HJD4JbIw8Z" resolve="setX" />
                  <node concept="3cpWs3" id="3HJD4JbIvZD" role="37wK5m">
                    <node concept="2OqwBi" id="3HJD4JbIvZE" role="3uHU7B">
                      <node concept="37vLTw" id="3GM_nagTzEl" role="2Oq$k0">
                        <ref role="3cqZAo" node="3HJD4JbIvZy" resolve="block" />
                      </node>
                      <node concept="liA8E" id="3HJD4JbIvZG" role="2OqNvi">
                        <ref role="37wK5l" node="3HJD4JbIw8z" resolve="getX" />
                      </node>
                    </node>
                    <node concept="37vLTw" id="2BHiRxglp6a" role="3uHU7w">
                      <ref role="3cqZAo" node="3HJD4JbIvZr" resolve="indent" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="1DcWWT" id="3HJD4JbIvZI" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIvZJ" role="1DdaDG">
            <node concept="2OwXpG" id="3HJD4JbIvZK" role="2OqNvi">
              <ref role="2Oxat5" node="3HJD4JbIvTo" resolve="myArrowHeads" />
            </node>
            <node concept="Xjq3P" id="3HJD4JbIvZL" role="2Oq$k0" />
          </node>
          <node concept="3cpWsn" id="3HJD4JbIvZM" role="1Duv9x">
            <property role="TrG5h" value="arrowHead" />
            <node concept="3uibUv" id="3HJD4JbIvZN" role="1tU5fm">
              <ref role="3uigEE" node="3HJD4JbIwjx" resolve="ArrowHead" />
            </node>
          </node>
          <node concept="3clFbS" id="3HJD4JbIvZO" role="2LFqv$">
            <node concept="3clFbF" id="3HJD4JbIvZP" role="3cqZAp">
              <node concept="2OqwBi" id="3HJD4JbIvZQ" role="3clFbG">
                <node concept="37vLTw" id="3GM_nagTrgC" role="2Oq$k0">
                  <ref role="3cqZAo" node="3HJD4JbIvZM" resolve="arrowHead" />
                </node>
                <node concept="liA8E" id="3HJD4JbIvZS" role="2OqNvi">
                  <ref role="37wK5l" node="3HJD4JbIwkn" resolve="setX" />
                  <node concept="3cpWs3" id="3HJD4JbIvZT" role="37wK5m">
                    <node concept="2OqwBi" id="3HJD4JbIvZU" role="3uHU7B">
                      <node concept="37vLTw" id="3GM_nagTyxh" role="2Oq$k0">
                        <ref role="3cqZAo" node="3HJD4JbIvZM" resolve="arrowHead" />
                      </node>
                      <node concept="liA8E" id="3HJD4JbIvZW" role="2OqNvi">
                        <ref role="37wK5l" node="3HJD4JbIwk7" resolve="getX" />
                      </node>
                    </node>
                    <node concept="37vLTw" id="2BHiRxgl1eU" role="3uHU7w">
                      <ref role="3cqZAo" node="3HJD4JbIvZr" resolve="indent" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="1DcWWT" id="3HJD4JbIvZY" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIvZZ" role="1DdaDG">
            <node concept="2OwXpG" id="3HJD4JbIw00" role="2OqNvi">
              <ref role="2Oxat5" node="3HJD4JbIvTh" resolve="myLines" />
            </node>
            <node concept="Xjq3P" id="3HJD4JbIw01" role="2Oq$k0" />
          </node>
          <node concept="3cpWsn" id="3HJD4JbIw02" role="1Duv9x">
            <property role="TrG5h" value="line" />
            <node concept="3uibUv" id="3HJD4JbIw03" role="1tU5fm">
              <ref role="3uigEE" node="3HJD4JbIwEp" resolve="Line" />
            </node>
          </node>
          <node concept="3clFbS" id="3HJD4JbIw04" role="2LFqv$">
            <node concept="3clFbF" id="3HJD4JbIw05" role="3cqZAp">
              <node concept="2OqwBi" id="3HJD4JbIw06" role="3clFbG">
                <node concept="37vLTw" id="3GM_nagTti$" role="2Oq$k0">
                  <ref role="3cqZAo" node="3HJD4JbIw02" resolve="line" />
                </node>
                <node concept="liA8E" id="3HJD4JbIw08" role="2OqNvi">
                  <ref role="37wK5l" node="3HJD4JbIwGk" resolve="shiftLeft" />
                  <node concept="37vLTw" id="2BHiRxgmaDD" role="37wK5m">
                    <ref role="3cqZAo" node="3HJD4JbIvZr" resolve="indent" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="JwZXmy2H1R" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="addAdditionalLine" />
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <node concept="37vLTG" id="JwZXmy2OqH" role="3clF46">
        <property role="TrG5h" value="startBlock" />
        <node concept="3uibUv" id="JwZXmy2OqI" role="1tU5fm">
          <ref role="3uigEE" node="3HJD4JbIw8e" resolve="IBlock" />
        </node>
      </node>
      <node concept="37vLTG" id="JwZXmy2OqJ" role="3clF46">
        <property role="TrG5h" value="endBlock" />
        <node concept="3uibUv" id="JwZXmy2OqK" role="1tU5fm">
          <ref role="3uigEE" node="3HJD4JbIw8e" resolve="IBlock" />
        </node>
      </node>
      <node concept="3clFbS" id="JwZXmy2H1U" role="3clF47">
        <node concept="3clFbF" id="JwZXmy2QAr" role="3cqZAp">
          <node concept="1rXfSq" id="JwZXmy2QAq" role="3clFbG">
            <ref role="37wK5l" node="3HJD4JbIw0a" resolve="addAdditionalLine" />
            <node concept="37vLTw" id="JwZXmy2QLR" role="37wK5m">
              <ref role="3cqZAo" node="JwZXmy2OqH" resolve="startBlock" />
            </node>
            <node concept="37vLTw" id="JwZXmy2QRY" role="37wK5m">
              <ref role="3cqZAo" node="JwZXmy2OqJ" resolve="endBlock" />
            </node>
            <node concept="2ShNRf" id="JwZXmy3$mq" role="37wK5m">
              <node concept="HV5vD" id="JwZXmy4XUv" role="2ShVmc">
                <ref role="HV5vE" node="JwZXmy4Tej" resolve="ControlFlowGraph.SimpleLineCreator" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tmbuc" id="JwZXmy2EQE" role="1B3o_S" />
      <node concept="3cqZAl" id="JwZXmy2H1_" role="3clF45" />
    </node>
    <node concept="3clFb_" id="3HJD4JbIw0a" role="jymVt">
      <property role="TrG5h" value="addAdditionalLine" />
      <node concept="3Tmbuc" id="JwZXmy0x6k" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIw0c" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIw0d" role="3clF46">
        <property role="TrG5h" value="startBlock" />
        <node concept="3uibUv" id="3HJD4JbIw0e" role="1tU5fm">
          <ref role="3uigEE" node="3HJD4JbIw8e" resolve="IBlock" />
        </node>
      </node>
      <node concept="37vLTG" id="3HJD4JbIw0g" role="3clF46">
        <property role="TrG5h" value="endBlock" />
        <node concept="3uibUv" id="3HJD4JbIw0h" role="1tU5fm">
          <ref role="3uigEE" node="3HJD4JbIw8e" resolve="IBlock" />
        </node>
      </node>
      <node concept="37vLTG" id="JwZXmy2Asm" role="3clF46">
        <property role="TrG5h" value="lineCreator" />
        <node concept="3uibUv" id="JwZXmy3$bT" role="1tU5fm">
          <ref role="3uigEE" node="JwZXmy2XW9" resolve="ControlFlowGraph.LineCreator" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIw0j" role="3clF47">
        <node concept="3cpWs8" id="3HJD4JbIw0k" role="3cqZAp">
          <node concept="3cpWsn" id="3HJD4JbIw0l" role="3cpWs9">
            <property role="TrG5h" value="startIndex" />
            <node concept="10Oyi0" id="3HJD4JbIw0m" role="1tU5fm" />
            <node concept="2OqwBi" id="3HJD4JbIw0n" role="33vP2m">
              <node concept="2OqwBi" id="3HJD4JbIw0o" role="2Oq$k0">
                <node concept="2OwXpG" id="3HJD4JbIw0p" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvT8" resolve="myBlocks" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIw0q" role="2Oq$k0" />
              </node>
              <node concept="liA8E" id="3HJD4JbIw0r" role="2OqNvi">
                <ref role="37wK5l" to="33ny:~List.indexOf(java.lang.Object):int" resolve="indexOf" />
                <node concept="37vLTw" id="2BHiRxgm_i2" role="37wK5m">
                  <ref role="3cqZAo" node="3HJD4JbIw0d" resolve="startBlock" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="3HJD4JbIw0t" role="3cqZAp">
          <node concept="3cpWsn" id="3HJD4JbIw0u" role="3cpWs9">
            <property role="TrG5h" value="endIndex" />
            <node concept="10Oyi0" id="3HJD4JbIw0v" role="1tU5fm" />
            <node concept="2OqwBi" id="3HJD4JbIw0w" role="33vP2m">
              <node concept="2OqwBi" id="3HJD4JbIw0x" role="2Oq$k0">
                <node concept="2OwXpG" id="3HJD4JbIw0y" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvT8" resolve="myBlocks" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIw0z" role="2Oq$k0" />
              </node>
              <node concept="liA8E" id="3HJD4JbIw0$" role="2OqNvi">
                <ref role="37wK5l" to="33ny:~List.indexOf(java.lang.Object):int" resolve="indexOf" />
                <node concept="37vLTw" id="2BHiRxgm7bp" role="37wK5m">
                  <ref role="3cqZAo" node="3HJD4JbIw0g" resolve="endBlock" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="3HJD4JbIw0A" role="3cqZAp">
          <node concept="3cpWsn" id="3HJD4JbIw0B" role="3cpWs9">
            <property role="TrG5h" value="rightIndent" />
            <node concept="10Oyi0" id="3HJD4JbIw0C" role="1tU5fm" />
            <node concept="3cmrfG" id="3HJD4JbIw0D" role="33vP2m">
              <property role="3cmrfH" value="0" />
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="3HJD4JbIw0E" role="3cqZAp">
          <node concept="3cpWsn" id="3HJD4JbIw0F" role="3cpWs9">
            <property role="TrG5h" value="leftIndent" />
            <node concept="10Oyi0" id="3HJD4JbIw0G" role="1tU5fm" />
            <node concept="3cmrfG" id="3HJD4JbIw0H" role="33vP2m">
              <property role="3cmrfH" value="0" />
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="3HJD4JbIw0I" role="3cqZAp">
          <node concept="3cpWsn" id="3HJD4JbIw0J" role="3cpWs9">
            <property role="TrG5h" value="first" />
            <node concept="10Oyi0" id="3HJD4JbIw0K" role="1tU5fm" />
            <node concept="2YIFZM" id="3HJD4JbIw0L" role="33vP2m">
              <ref role="1Pybhc" to="wyt6:~Math" resolve="Math" />
              <ref role="37wK5l" to="wyt6:~Math.min(int,int):int" resolve="min" />
              <node concept="37vLTw" id="3GM_nagTsDy" role="37wK5m">
                <ref role="3cqZAo" node="3HJD4JbIw0l" resolve="startIndex" />
              </node>
              <node concept="37vLTw" id="3GM_nagTveU" role="37wK5m">
                <ref role="3cqZAo" node="3HJD4JbIw0u" resolve="endIndex" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="3HJD4JbIw0O" role="3cqZAp">
          <node concept="3cpWsn" id="3HJD4JbIw0P" role="3cpWs9">
            <property role="TrG5h" value="last" />
            <node concept="10Oyi0" id="3HJD4JbIw0Q" role="1tU5fm" />
            <node concept="2YIFZM" id="3HJD4JbIw0R" role="33vP2m">
              <ref role="1Pybhc" to="wyt6:~Math" resolve="Math" />
              <ref role="37wK5l" to="wyt6:~Math.max(int,int):int" resolve="max" />
              <node concept="37vLTw" id="3GM_nagTB39" role="37wK5m">
                <ref role="3cqZAo" node="3HJD4JbIw0l" resolve="startIndex" />
              </node>
              <node concept="37vLTw" id="3GM_nagTwJn" role="37wK5m">
                <ref role="3cqZAo" node="3HJD4JbIw0u" resolve="endIndex" />
              </node>
            </node>
          </node>
        </node>
        <node concept="1Dw8fO" id="3HJD4JbIw0U" role="3cqZAp">
          <node concept="3clFbT" id="3HJD4JbIw0V" role="1Dwp0S">
            <property role="3clFbU" value="true" />
          </node>
          <node concept="3clFbS" id="3HJD4JbIw0W" role="2LFqv$">
            <node concept="3cpWs8" id="3HJD4JbIw0X" role="3cqZAp">
              <node concept="3cpWsn" id="3HJD4JbIw0Y" role="3cpWs9">
                <property role="TrG5h" value="canBeAdded" />
                <node concept="10P_77" id="3HJD4JbIw0Z" role="1tU5fm" />
                <node concept="2OqwBi" id="3HJD4JbIw10" role="33vP2m">
                  <node concept="Xjq3P" id="3HJD4JbIw11" role="2Oq$k0">
                    <ref role="1HBi2w" node="3HJD4JbIvSG" resolve="ControlFlowGraph" />
                  </node>
                  <node concept="liA8E" id="3HJD4JbIw12" role="2OqNvi">
                    <ref role="37wK5l" node="3HJD4JbIw4L" resolve="canBeAdded" />
                    <node concept="37vLTw" id="3GM_nagTxQB" role="37wK5m">
                      <ref role="3cqZAo" node="3HJD4JbIw0J" resolve="first" />
                    </node>
                    <node concept="37vLTw" id="3GM_nagT$7r" role="37wK5m">
                      <ref role="3cqZAo" node="3HJD4JbIw0P" resolve="last" />
                    </node>
                    <node concept="37vLTw" id="3GM_nagT$JL" role="37wK5m">
                      <ref role="3cqZAo" node="3HJD4JbIw1y" resolve="i" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbJ" id="3HJD4JbIw16" role="3cqZAp">
              <node concept="37vLTw" id="3GM_nagTyf2" role="3clFbw">
                <ref role="3cqZAo" node="3HJD4JbIw0Y" resolve="canBeAdded" />
              </node>
              <node concept="3clFbS" id="3HJD4JbIw18" role="3clFbx">
                <node concept="3clFbF" id="3HJD4JbIw19" role="3cqZAp">
                  <node concept="37vLTI" id="3HJD4JbIw1a" role="3clFbG">
                    <node concept="37vLTw" id="3GM_nagTuxk" role="37vLTJ">
                      <ref role="3cqZAo" node="3HJD4JbIw0B" resolve="rightIndent" />
                    </node>
                    <node concept="37vLTw" id="3GM_nagTs9Q" role="37vLTx">
                      <ref role="3cqZAo" node="3HJD4JbIw1y" resolve="i" />
                    </node>
                  </node>
                </node>
                <node concept="3zACq4" id="3HJD4JbIw1d" role="3cqZAp" />
              </node>
            </node>
            <node concept="3clFbF" id="3HJD4JbIw1e" role="3cqZAp">
              <node concept="37vLTI" id="3HJD4JbIw1f" role="3clFbG">
                <node concept="37vLTw" id="3GM_nagTuA0" role="37vLTJ">
                  <ref role="3cqZAo" node="3HJD4JbIw0Y" resolve="canBeAdded" />
                </node>
                <node concept="2OqwBi" id="3HJD4JbIw1h" role="37vLTx">
                  <node concept="Xjq3P" id="3HJD4JbIw1i" role="2Oq$k0">
                    <ref role="1HBi2w" node="3HJD4JbIvSG" resolve="ControlFlowGraph" />
                  </node>
                  <node concept="liA8E" id="3HJD4JbIw1j" role="2OqNvi">
                    <ref role="37wK5l" node="3HJD4JbIw4L" resolve="canBeAdded" />
                    <node concept="37vLTw" id="3GM_nagTBHm" role="37wK5m">
                      <ref role="3cqZAo" node="3HJD4JbIw0J" resolve="first" />
                    </node>
                    <node concept="37vLTw" id="3GM_nagTAAW" role="37wK5m">
                      <ref role="3cqZAo" node="3HJD4JbIw0P" resolve="last" />
                    </node>
                    <node concept="1ZRNhn" id="3HJD4JbIw1m" role="37wK5m">
                      <node concept="37vLTw" id="3GM_nagTxQS" role="2$L3a6">
                        <ref role="3cqZAo" node="3HJD4JbIw1y" resolve="i" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbJ" id="3HJD4JbIw1o" role="3cqZAp">
              <node concept="37vLTw" id="3GM_nagTALr" role="3clFbw">
                <ref role="3cqZAo" node="3HJD4JbIw0Y" resolve="canBeAdded" />
              </node>
              <node concept="3clFbS" id="3HJD4JbIw1q" role="3clFbx">
                <node concept="3clFbF" id="3HJD4JbIw1r" role="3cqZAp">
                  <node concept="37vLTI" id="3HJD4JbIw1s" role="3clFbG">
                    <node concept="37vLTw" id="3GM_nagTw$a" role="37vLTJ">
                      <ref role="3cqZAo" node="3HJD4JbIw0F" resolve="leftIndent" />
                    </node>
                    <node concept="37vLTw" id="3GM_nagTBR1" role="37vLTx">
                      <ref role="3cqZAo" node="3HJD4JbIw1y" resolve="i" />
                    </node>
                  </node>
                </node>
                <node concept="3zACq4" id="3HJD4JbIw1v" role="3cqZAp" />
              </node>
            </node>
          </node>
          <node concept="3uNrnE" id="3HJD4JbIw1w" role="1Dwrff">
            <node concept="37vLTw" id="3GM_nagTv$M" role="2$L3a6">
              <ref role="3cqZAo" node="3HJD4JbIw1y" resolve="i" />
            </node>
          </node>
          <node concept="3cpWsn" id="3HJD4JbIw1y" role="1Duv9x">
            <property role="TrG5h" value="i" />
            <node concept="10Oyi0" id="3HJD4JbIw1z" role="1tU5fm" />
            <node concept="3cmrfG" id="3HJD4JbIw1$" role="33vP2m">
              <property role="3cmrfH" value="1" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIw1_" role="3cqZAp">
          <node concept="37vLTI" id="3HJD4JbIw1A" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIw1B" role="37vLTJ">
              <node concept="2OwXpG" id="3HJD4JbIw1C" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvTC" resolve="myMaxLineIndentRight" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIw1D" role="2Oq$k0" />
            </node>
            <node concept="2YIFZM" id="3HJD4JbIw1E" role="37vLTx">
              <ref role="1Pybhc" to="wyt6:~Math" resolve="Math" />
              <ref role="37wK5l" to="wyt6:~Math.max(int,int):int" resolve="max" />
              <node concept="2OqwBi" id="3HJD4JbIw1F" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIw1G" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvTC" resolve="myMaxLineIndentRight" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIw1H" role="2Oq$k0" />
              </node>
              <node concept="37vLTw" id="3GM_nagTwLe" role="37wK5m">
                <ref role="3cqZAo" node="3HJD4JbIw0B" resolve="rightIndent" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIw1J" role="3cqZAp">
          <node concept="37vLTI" id="3HJD4JbIw1K" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIw1L" role="37vLTJ">
              <node concept="2OwXpG" id="3HJD4JbIw1M" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvTE" resolve="myMaxLineIndentLeft" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIw1N" role="2Oq$k0" />
            </node>
            <node concept="2YIFZM" id="3HJD4JbIw1O" role="37vLTx">
              <ref role="1Pybhc" to="wyt6:~Math" resolve="Math" />
              <ref role="37wK5l" to="wyt6:~Math.max(int,int):int" resolve="max" />
              <node concept="2OqwBi" id="3HJD4JbIw1P" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIw1Q" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvTE" resolve="myMaxLineIndentLeft" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIw1R" role="2Oq$k0" />
              </node>
              <node concept="37vLTw" id="3GM_nagTtJ$" role="37wK5m">
                <ref role="3cqZAo" node="3HJD4JbIw0F" resolve="leftIndent" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="3HJD4JbIw1T" role="3cqZAp">
          <node concept="3cpWsn" id="3HJD4JbIw1U" role="3cpWs9">
            <property role="TrG5h" value="startBlockLevel" />
            <node concept="10Oyi0" id="3HJD4JbIw1V" role="1tU5fm" />
            <node concept="3cpWs3" id="3HJD4JbIw1W" role="33vP2m">
              <node concept="2OqwBi" id="3HJD4JbIw1X" role="3uHU7B">
                <node concept="37vLTw" id="2BHiRxghcwi" role="2Oq$k0">
                  <ref role="3cqZAo" node="3HJD4JbIw0d" resolve="startBlock" />
                </node>
                <node concept="liA8E" id="3HJD4JbIw1Z" role="2OqNvi">
                  <ref role="37wK5l" node="3HJD4JbIw8B" resolve="getY" />
                </node>
              </node>
              <node concept="FJ1c_" id="3HJD4JbIw20" role="3uHU7w">
                <node concept="2OqwBi" id="3HJD4JbIw21" role="3uHU7B">
                  <node concept="37vLTw" id="2BHiRxglRGg" role="2Oq$k0">
                    <ref role="3cqZAo" node="3HJD4JbIw0d" resolve="startBlock" />
                  </node>
                  <node concept="liA8E" id="3HJD4JbIw23" role="2OqNvi">
                    <ref role="37wK5l" node="3HJD4JbIw8J" resolve="getHeight" />
                  </node>
                </node>
                <node concept="3cmrfG" id="3HJD4JbIw24" role="3uHU7w">
                  <property role="3cmrfH" value="2" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="3HJD4JbIw25" role="3cqZAp">
          <node concept="3cpWsn" id="3HJD4JbIw26" role="3cpWs9">
            <property role="TrG5h" value="endBlockLevel" />
            <node concept="10Oyi0" id="3HJD4JbIw27" role="1tU5fm" />
            <node concept="3cpWs3" id="3HJD4JbIw28" role="33vP2m">
              <node concept="2OqwBi" id="3HJD4JbIw29" role="3uHU7B">
                <node concept="37vLTw" id="2BHiRxgmF06" role="2Oq$k0">
                  <ref role="3cqZAo" node="3HJD4JbIw0g" resolve="endBlock" />
                </node>
                <node concept="liA8E" id="3HJD4JbIw2b" role="2OqNvi">
                  <ref role="37wK5l" node="3HJD4JbIw8B" resolve="getY" />
                </node>
              </node>
              <node concept="FJ1c_" id="3HJD4JbIw2c" role="3uHU7w">
                <node concept="2OqwBi" id="3HJD4JbIw2d" role="3uHU7B">
                  <node concept="37vLTw" id="2BHiRxgm97W" role="2Oq$k0">
                    <ref role="3cqZAo" node="3HJD4JbIw0g" resolve="endBlock" />
                  </node>
                  <node concept="liA8E" id="3HJD4JbIw2f" role="2OqNvi">
                    <ref role="37wK5l" node="3HJD4JbIw8J" resolve="getHeight" />
                  </node>
                </node>
                <node concept="3cmrfG" id="3HJD4JbIw2g" role="3uHU7w">
                  <property role="3cmrfH" value="2" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="3HJD4JbIw2h" role="3cqZAp">
          <node concept="3y3z36" id="3HJD4JbIw2i" role="3clFbw">
            <node concept="37vLTw" id="3GM_nagTvDx" role="3uHU7B">
              <ref role="3cqZAo" node="3HJD4JbIw0B" resolve="rightIndent" />
            </node>
            <node concept="3cmrfG" id="3HJD4JbIw2k" role="3uHU7w">
              <property role="3cmrfH" value="0" />
            </node>
          </node>
          <node concept="3clFbJ" id="3HJD4JbIw2l" role="9aQIa">
            <node concept="3y3z36" id="3HJD4JbIw2m" role="3clFbw">
              <node concept="37vLTw" id="3GM_nagTzaD" role="3uHU7B">
                <ref role="3cqZAo" node="3HJD4JbIw0F" resolve="leftIndent" />
              </node>
              <node concept="3cmrfG" id="3HJD4JbIw2o" role="3uHU7w">
                <property role="3cmrfH" value="0" />
              </node>
            </node>
            <node concept="3clFbS" id="3HJD4JbIw2p" role="3clFbx">
              <node concept="3cpWs8" id="3HJD4JbIw2q" role="3cqZAp">
                <node concept="3cpWsn" id="3HJD4JbIw2r" role="3cpWs9">
                  <property role="TrG5h" value="startBlockExit" />
                  <node concept="10Oyi0" id="3HJD4JbIw2s" role="1tU5fm" />
                  <node concept="2OqwBi" id="3HJD4JbIw2t" role="33vP2m">
                    <node concept="37vLTw" id="2BHiRxghirm" role="2Oq$k0">
                      <ref role="3cqZAo" node="3HJD4JbIw0d" resolve="startBlock" />
                    </node>
                    <node concept="liA8E" id="3HJD4JbIw2v" role="2OqNvi">
                      <ref role="37wK5l" node="3HJD4JbIw8z" resolve="getX" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3cpWs8" id="3HJD4JbIw2w" role="3cqZAp">
                <node concept="3cpWsn" id="3HJD4JbIw2x" role="3cpWs9">
                  <property role="TrG5h" value="endBlockExit" />
                  <node concept="10Oyi0" id="3HJD4JbIw2y" role="1tU5fm" />
                  <node concept="2OqwBi" id="3HJD4JbIw2z" role="33vP2m">
                    <node concept="37vLTw" id="2BHiRxgmNGR" role="2Oq$k0">
                      <ref role="3cqZAo" node="3HJD4JbIw0g" resolve="endBlock" />
                    </node>
                    <node concept="liA8E" id="3HJD4JbIw2_" role="2OqNvi">
                      <ref role="37wK5l" node="3HJD4JbIw8z" resolve="getX" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3clFbF" id="3HJD4JbIw2A" role="3cqZAp">
                <node concept="2OqwBi" id="3HJD4JbIw2B" role="3clFbG">
                  <node concept="2OqwBi" id="3HJD4JbIw2C" role="2Oq$k0">
                    <node concept="2OwXpG" id="3HJD4JbIw2D" role="2OqNvi">
                      <ref role="2Oxat5" node="3HJD4JbIvTh" resolve="myLines" />
                    </node>
                    <node concept="Xjq3P" id="3HJD4JbIw2E" role="2Oq$k0" />
                  </node>
                  <node concept="liA8E" id="3HJD4JbIw2F" role="2OqNvi">
                    <ref role="37wK5l" to="33ny:~List.add(java.lang.Object):boolean" resolve="add" />
                    <node concept="2OqwBi" id="JwZXmy3YE4" role="37wK5m">
                      <node concept="37vLTw" id="JwZXmy3YE5" role="2Oq$k0">
                        <ref role="3cqZAo" node="JwZXmy2Asm" resolve="lineCreator" />
                      </node>
                      <node concept="liA8E" id="JwZXmy3YE6" role="2OqNvi">
                        <ref role="37wK5l" node="JwZXmy30g5" resolve="createLine" />
                        <node concept="37vLTw" id="3GM_nagTy1t" role="37wK5m">
                          <ref role="3cqZAo" node="3HJD4JbIw2r" resolve="startBlockExit" />
                        </node>
                        <node concept="3cpWsd" id="3HJD4JbIw2J" role="37wK5m">
                          <node concept="37vLTw" id="3GM_nagTyae" role="3uHU7B">
                            <ref role="3cqZAo" node="3HJD4JbIw2r" resolve="startBlockExit" />
                          </node>
                          <node concept="17qRlL" id="3HJD4JbIw2L" role="3uHU7w">
                            <node concept="37vLTw" id="2BHiRxeomLD" role="3uHU7B">
                              <ref role="3cqZAo" node="3HJD4JbIvST" resolve="LINE_SEGMENT_SIZE" />
                            </node>
                            <node concept="37vLTw" id="3GM_nagTu1f" role="3uHU7w">
                              <ref role="3cqZAo" node="3HJD4JbIw0F" resolve="leftIndent" />
                            </node>
                          </node>
                        </node>
                        <node concept="37vLTw" id="3GM_nagTArh" role="37wK5m">
                          <ref role="3cqZAo" node="3HJD4JbIw1U" resolve="startBlockLevel" />
                        </node>
                        <node concept="Rm8GO" id="4zooVZdvj2y" role="37wK5m">
                          <ref role="Rm8GQ" node="3HJD4JbIwst" resolve="HORIZONTAL" />
                          <ref role="1Px2BO" node="3HJD4JbIwsr" resolve="LineDirection" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3clFbF" id="3HJD4JbIw2Q" role="3cqZAp">
                <node concept="2OqwBi" id="3HJD4JbIw2R" role="3clFbG">
                  <node concept="2OqwBi" id="3HJD4JbIw2S" role="2Oq$k0">
                    <node concept="2OwXpG" id="3HJD4JbIw2T" role="2OqNvi">
                      <ref role="2Oxat5" node="3HJD4JbIvTh" resolve="myLines" />
                    </node>
                    <node concept="Xjq3P" id="3HJD4JbIw2U" role="2Oq$k0" />
                  </node>
                  <node concept="liA8E" id="3HJD4JbIw2V" role="2OqNvi">
                    <ref role="37wK5l" to="33ny:~List.add(java.lang.Object):boolean" resolve="add" />
                    <node concept="2OqwBi" id="JwZXmy40vd" role="37wK5m">
                      <node concept="37vLTw" id="JwZXmy40ve" role="2Oq$k0">
                        <ref role="3cqZAo" node="JwZXmy2Asm" resolve="lineCreator" />
                      </node>
                      <node concept="liA8E" id="JwZXmy40vf" role="2OqNvi">
                        <ref role="37wK5l" node="JwZXmy30g5" resolve="createLine" />
                        <node concept="37vLTw" id="3GM_nagTtvX" role="37wK5m">
                          <ref role="3cqZAo" node="3HJD4JbIw2x" resolve="endBlockExit" />
                        </node>
                        <node concept="3cpWsd" id="3HJD4JbIw2Z" role="37wK5m">
                          <node concept="37vLTw" id="3GM_nagTvck" role="3uHU7B">
                            <ref role="3cqZAo" node="3HJD4JbIw2x" resolve="endBlockExit" />
                          </node>
                          <node concept="17qRlL" id="3HJD4JbIw31" role="3uHU7w">
                            <node concept="37vLTw" id="2BHiRxeodkz" role="3uHU7B">
                              <ref role="3cqZAo" node="3HJD4JbIvST" resolve="LINE_SEGMENT_SIZE" />
                            </node>
                            <node concept="37vLTw" id="3GM_nagTsz2" role="3uHU7w">
                              <ref role="3cqZAo" node="3HJD4JbIw0F" resolve="leftIndent" />
                            </node>
                          </node>
                        </node>
                        <node concept="37vLTw" id="3GM_nagT_Yz" role="37wK5m">
                          <ref role="3cqZAo" node="3HJD4JbIw26" resolve="endBlockLevel" />
                        </node>
                        <node concept="Rm8GO" id="4zooVZdvj2z" role="37wK5m">
                          <ref role="Rm8GQ" node="3HJD4JbIwst" resolve="HORIZONTAL" />
                          <ref role="1Px2BO" node="3HJD4JbIwsr" resolve="LineDirection" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3clFbF" id="3HJD4JbIw36" role="3cqZAp">
                <node concept="2OqwBi" id="3HJD4JbIw37" role="3clFbG">
                  <node concept="2OqwBi" id="3HJD4JbIw38" role="2Oq$k0">
                    <node concept="2OwXpG" id="3HJD4JbIw39" role="2OqNvi">
                      <ref role="2Oxat5" node="3HJD4JbIvTh" resolve="myLines" />
                    </node>
                    <node concept="Xjq3P" id="3HJD4JbIw3a" role="2Oq$k0" />
                  </node>
                  <node concept="liA8E" id="3HJD4JbIw3b" role="2OqNvi">
                    <ref role="37wK5l" to="33ny:~List.add(java.lang.Object):boolean" resolve="add" />
                    <node concept="2OqwBi" id="JwZXmy44LP" role="37wK5m">
                      <node concept="37vLTw" id="JwZXmy44LQ" role="2Oq$k0">
                        <ref role="3cqZAo" node="JwZXmy2Asm" resolve="lineCreator" />
                      </node>
                      <node concept="liA8E" id="JwZXmy44LR" role="2OqNvi">
                        <ref role="37wK5l" node="JwZXmy30g5" resolve="createLine" />
                        <node concept="37vLTw" id="3GM_nagTwMq" role="37wK5m">
                          <ref role="3cqZAo" node="3HJD4JbIw1U" resolve="startBlockLevel" />
                        </node>
                        <node concept="37vLTw" id="3GM_nagTA4B" role="37wK5m">
                          <ref role="3cqZAo" node="3HJD4JbIw26" resolve="endBlockLevel" />
                        </node>
                        <node concept="3cpWsd" id="3HJD4JbIw3g" role="37wK5m">
                          <node concept="37vLTw" id="3GM_nagTtqg" role="3uHU7B">
                            <ref role="3cqZAo" node="3HJD4JbIw2r" resolve="startBlockExit" />
                          </node>
                          <node concept="17qRlL" id="3HJD4JbIw3i" role="3uHU7w">
                            <node concept="37vLTw" id="JwZXmy2g5q" role="3uHU7B">
                              <ref role="3cqZAo" node="3HJD4JbIvST" resolve="LINE_SEGMENT_SIZE" />
                            </node>
                            <node concept="37vLTw" id="3GM_nagTwiV" role="3uHU7w">
                              <ref role="3cqZAo" node="3HJD4JbIw0F" resolve="leftIndent" />
                            </node>
                          </node>
                        </node>
                        <node concept="Rm8GO" id="4zooVZdvj2$" role="37wK5m">
                          <ref role="1Px2BO" node="3HJD4JbIwsr" resolve="LineDirection" />
                          <ref role="Rm8GQ" node="3HJD4JbIwtl" resolve="VERTICAL" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3clFbF" id="3HJD4JbIw3m" role="3cqZAp">
                <node concept="2OqwBi" id="3HJD4JbIw3n" role="3clFbG">
                  <node concept="2OqwBi" id="3HJD4JbIw3o" role="2Oq$k0">
                    <node concept="2OwXpG" id="3HJD4JbIw3p" role="2OqNvi">
                      <ref role="2Oxat5" node="3HJD4JbIvTo" resolve="myArrowHeads" />
                    </node>
                    <node concept="Xjq3P" id="3HJD4JbIw3q" role="2Oq$k0" />
                  </node>
                  <node concept="liA8E" id="3HJD4JbIw3r" role="2OqNvi">
                    <ref role="37wK5l" to="33ny:~Set.add(java.lang.Object):boolean" resolve="add" />
                    <node concept="1rXfSq" id="JwZXmy2ocL" role="37wK5m">
                      <ref role="37wK5l" node="JwZXmy0HLq" resolve="createArrowHead" />
                      <node concept="37vLTw" id="3GM_nagTxtj" role="37wK5m">
                        <ref role="3cqZAo" node="3HJD4JbIw2x" resolve="endBlockExit" />
                      </node>
                      <node concept="37vLTw" id="3GM_nagT_LW" role="37wK5m">
                        <ref role="3cqZAo" node="3HJD4JbIw26" resolve="endBlockLevel" />
                      </node>
                      <node concept="Rm8GO" id="4zooVZdvj2_" role="37wK5m">
                        <ref role="1Px2BO" node="3HJD4JbIwBn" resolve="ArrowHeadDirection" />
                        <ref role="Rm8GQ" node="3HJD4JbIwDs" resolve="RIGHT" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbS" id="3HJD4JbIw3x" role="3clFbx">
            <node concept="3cpWs8" id="3HJD4JbIw3y" role="3cqZAp">
              <node concept="3cpWsn" id="3HJD4JbIw3z" role="3cpWs9">
                <property role="TrG5h" value="startBlockExit" />
                <node concept="10Oyi0" id="3HJD4JbIw3$" role="1tU5fm" />
                <node concept="3cpWs3" id="3HJD4JbIw3_" role="33vP2m">
                  <node concept="2OqwBi" id="3HJD4JbIw3A" role="3uHU7B">
                    <node concept="37vLTw" id="2BHiRxghiyd" role="2Oq$k0">
                      <ref role="3cqZAo" node="3HJD4JbIw0d" resolve="startBlock" />
                    </node>
                    <node concept="liA8E" id="3HJD4JbIw3C" role="2OqNvi">
                      <ref role="37wK5l" node="3HJD4JbIw8z" resolve="getX" />
                    </node>
                  </node>
                  <node concept="2OqwBi" id="3HJD4JbIw3D" role="3uHU7w">
                    <node concept="37vLTw" id="2BHiRxgm9kB" role="2Oq$k0">
                      <ref role="3cqZAo" node="3HJD4JbIw0d" resolve="startBlock" />
                    </node>
                    <node concept="liA8E" id="3HJD4JbIw3F" role="2OqNvi">
                      <ref role="37wK5l" node="3HJD4JbIw8F" resolve="getWidth" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3cpWs8" id="3HJD4JbIw3G" role="3cqZAp">
              <node concept="3cpWsn" id="3HJD4JbIw3H" role="3cpWs9">
                <property role="TrG5h" value="endBlockExit" />
                <node concept="10Oyi0" id="3HJD4JbIw3I" role="1tU5fm" />
                <node concept="3cpWs3" id="3HJD4JbIw3J" role="33vP2m">
                  <node concept="2OqwBi" id="3HJD4JbIw3K" role="3uHU7B">
                    <node concept="37vLTw" id="2BHiRxgmcWq" role="2Oq$k0">
                      <ref role="3cqZAo" node="3HJD4JbIw0g" resolve="endBlock" />
                    </node>
                    <node concept="liA8E" id="3HJD4JbIw3M" role="2OqNvi">
                      <ref role="37wK5l" node="3HJD4JbIw8z" resolve="getX" />
                    </node>
                  </node>
                  <node concept="2OqwBi" id="3HJD4JbIw3N" role="3uHU7w">
                    <node concept="37vLTw" id="2BHiRxgm6Tx" role="2Oq$k0">
                      <ref role="3cqZAo" node="3HJD4JbIw0g" resolve="endBlock" />
                    </node>
                    <node concept="liA8E" id="3HJD4JbIw3P" role="2OqNvi">
                      <ref role="37wK5l" node="3HJD4JbIw8F" resolve="getWidth" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbF" id="3HJD4JbIw3Q" role="3cqZAp">
              <node concept="2OqwBi" id="3HJD4JbIw3R" role="3clFbG">
                <node concept="2OqwBi" id="3HJD4JbIw3S" role="2Oq$k0">
                  <node concept="2OwXpG" id="3HJD4JbIw3T" role="2OqNvi">
                    <ref role="2Oxat5" node="3HJD4JbIvTh" resolve="myLines" />
                  </node>
                  <node concept="Xjq3P" id="3HJD4JbIw3U" role="2Oq$k0" />
                </node>
                <node concept="liA8E" id="3HJD4JbIw3V" role="2OqNvi">
                  <ref role="37wK5l" to="33ny:~List.add(java.lang.Object):boolean" resolve="add" />
                  <node concept="2OqwBi" id="JwZXmy3Ee_" role="37wK5m">
                    <node concept="37vLTw" id="JwZXmy3DZM" role="2Oq$k0">
                      <ref role="3cqZAo" node="JwZXmy2Asm" resolve="lineCreator" />
                    </node>
                    <node concept="liA8E" id="JwZXmy3EqL" role="2OqNvi">
                      <ref role="37wK5l" node="JwZXmy30g5" resolve="createLine" />
                      <node concept="37vLTw" id="3GM_nagT_sI" role="37wK5m">
                        <ref role="3cqZAo" node="3HJD4JbIw3z" resolve="startBlockExit" />
                      </node>
                      <node concept="3cpWs3" id="3HJD4JbIw3Z" role="37wK5m">
                        <node concept="37vLTw" id="3GM_nagTzrp" role="3uHU7B">
                          <ref role="3cqZAo" node="3HJD4JbIw3z" resolve="startBlockExit" />
                        </node>
                        <node concept="17qRlL" id="3HJD4JbIw41" role="3uHU7w">
                          <node concept="37vLTw" id="2BHiRxeodlf" role="3uHU7B">
                            <ref role="3cqZAo" node="3HJD4JbIvST" resolve="LINE_SEGMENT_SIZE" />
                          </node>
                          <node concept="37vLTw" id="3GM_nagTtqw" role="3uHU7w">
                            <ref role="3cqZAo" node="3HJD4JbIw0B" resolve="rightIndent" />
                          </node>
                        </node>
                      </node>
                      <node concept="37vLTw" id="3GM_nagTrdN" role="37wK5m">
                        <ref role="3cqZAo" node="3HJD4JbIw1U" resolve="startBlockLevel" />
                      </node>
                      <node concept="Rm8GO" id="4zooVZdvj2v" role="37wK5m">
                        <ref role="Rm8GQ" node="3HJD4JbIwst" resolve="HORIZONTAL" />
                        <ref role="1Px2BO" node="3HJD4JbIwsr" resolve="LineDirection" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbF" id="3HJD4JbIw46" role="3cqZAp">
              <node concept="2OqwBi" id="3HJD4JbIw47" role="3clFbG">
                <node concept="2OqwBi" id="3HJD4JbIw48" role="2Oq$k0">
                  <node concept="2OwXpG" id="3HJD4JbIw49" role="2OqNvi">
                    <ref role="2Oxat5" node="3HJD4JbIvTh" resolve="myLines" />
                  </node>
                  <node concept="Xjq3P" id="3HJD4JbIw4a" role="2Oq$k0" />
                </node>
                <node concept="liA8E" id="3HJD4JbIw4b" role="2OqNvi">
                  <ref role="37wK5l" to="33ny:~List.add(java.lang.Object):boolean" resolve="add" />
                  <node concept="2OqwBi" id="JwZXmy3G7C" role="37wK5m">
                    <node concept="37vLTw" id="JwZXmy3FSp" role="2Oq$k0">
                      <ref role="3cqZAo" node="JwZXmy2Asm" resolve="lineCreator" />
                    </node>
                    <node concept="liA8E" id="JwZXmy3Gkg" role="2OqNvi">
                      <ref role="37wK5l" node="JwZXmy30g5" resolve="createLine" />
                      <node concept="37vLTw" id="3GM_nagTA5I" role="37wK5m">
                        <ref role="3cqZAo" node="3HJD4JbIw3H" resolve="endBlockExit" />
                      </node>
                      <node concept="3cpWs3" id="3HJD4JbIw4f" role="37wK5m">
                        <node concept="37vLTw" id="3GM_nagTrlb" role="3uHU7B">
                          <ref role="3cqZAo" node="3HJD4JbIw3H" resolve="endBlockExit" />
                        </node>
                        <node concept="17qRlL" id="3HJD4JbIw4h" role="3uHU7w">
                          <node concept="37vLTw" id="2BHiRxeon9D" role="3uHU7B">
                            <ref role="3cqZAo" node="3HJD4JbIvST" resolve="LINE_SEGMENT_SIZE" />
                          </node>
                          <node concept="37vLTw" id="3GM_nagT$$$" role="3uHU7w">
                            <ref role="3cqZAo" node="3HJD4JbIw0B" resolve="rightIndent" />
                          </node>
                        </node>
                      </node>
                      <node concept="37vLTw" id="3GM_nagTtJI" role="37wK5m">
                        <ref role="3cqZAo" node="3HJD4JbIw26" resolve="endBlockLevel" />
                      </node>
                      <node concept="Rm8GO" id="4zooVZdvj2u" role="37wK5m">
                        <ref role="Rm8GQ" node="3HJD4JbIwst" resolve="HORIZONTAL" />
                        <ref role="1Px2BO" node="3HJD4JbIwsr" resolve="LineDirection" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbF" id="3HJD4JbIw4m" role="3cqZAp">
              <node concept="2OqwBi" id="3HJD4JbIw4n" role="3clFbG">
                <node concept="2OqwBi" id="3HJD4JbIw4o" role="2Oq$k0">
                  <node concept="2OwXpG" id="3HJD4JbIw4p" role="2OqNvi">
                    <ref role="2Oxat5" node="3HJD4JbIvTh" resolve="myLines" />
                  </node>
                  <node concept="Xjq3P" id="3HJD4JbIw4q" role="2Oq$k0" />
                </node>
                <node concept="liA8E" id="3HJD4JbIw4r" role="2OqNvi">
                  <ref role="37wK5l" to="33ny:~List.add(java.lang.Object):boolean" resolve="add" />
                  <node concept="2OqwBi" id="JwZXmy3OqA" role="37wK5m">
                    <node concept="37vLTw" id="JwZXmy3OqB" role="2Oq$k0">
                      <ref role="3cqZAo" node="JwZXmy2Asm" resolve="lineCreator" />
                    </node>
                    <node concept="liA8E" id="JwZXmy3OqC" role="2OqNvi">
                      <ref role="37wK5l" node="JwZXmy30g5" resolve="createLine" />
                      <node concept="37vLTw" id="JwZXmy1uzu" role="37wK5m">
                        <ref role="3cqZAo" node="3HJD4JbIw1U" resolve="startBlockLevel" />
                      </node>
                      <node concept="37vLTw" id="JwZXmy1ucr" role="37wK5m">
                        <ref role="3cqZAo" node="3HJD4JbIw26" resolve="endBlockLevel" />
                      </node>
                      <node concept="3cpWs3" id="3HJD4JbIw4w" role="37wK5m">
                        <node concept="37vLTw" id="JwZXmy1ulH" role="3uHU7B">
                          <ref role="3cqZAo" node="3HJD4JbIw3z" resolve="startBlockExit" />
                        </node>
                        <node concept="17qRlL" id="3HJD4JbIw4y" role="3uHU7w">
                          <node concept="37vLTw" id="JwZXmy1uqi" role="3uHU7B">
                            <ref role="3cqZAo" node="3HJD4JbIvST" resolve="LINE_SEGMENT_SIZE" />
                          </node>
                          <node concept="37vLTw" id="JwZXmy1uuR" role="3uHU7w">
                            <ref role="3cqZAo" node="3HJD4JbIw0B" resolve="rightIndent" />
                          </node>
                        </node>
                      </node>
                      <node concept="Rm8GO" id="JwZXmy1u7P" role="37wK5m">
                        <ref role="Rm8GQ" node="3HJD4JbIwtl" resolve="VERTICAL" />
                        <ref role="1Px2BO" node="3HJD4JbIwsr" resolve="LineDirection" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbF" id="3HJD4JbIw4A" role="3cqZAp">
              <node concept="2OqwBi" id="3HJD4JbIw4B" role="3clFbG">
                <node concept="2OqwBi" id="3HJD4JbIw4C" role="2Oq$k0">
                  <node concept="2OwXpG" id="3HJD4JbIw4D" role="2OqNvi">
                    <ref role="2Oxat5" node="3HJD4JbIvTo" resolve="myArrowHeads" />
                  </node>
                  <node concept="Xjq3P" id="3HJD4JbIw4E" role="2Oq$k0" />
                </node>
                <node concept="liA8E" id="3HJD4JbIw4F" role="2OqNvi">
                  <ref role="37wK5l" to="33ny:~Set.add(java.lang.Object):boolean" resolve="add" />
                  <node concept="1rXfSq" id="JwZXmy22l2" role="37wK5m">
                    <ref role="37wK5l" node="JwZXmy0HLq" resolve="createArrowHead" />
                    <node concept="37vLTw" id="3GM_nagTr2P" role="37wK5m">
                      <ref role="3cqZAo" node="3HJD4JbIw3H" resolve="endBlockExit" />
                    </node>
                    <node concept="37vLTw" id="3GM_nagTyWm" role="37wK5m">
                      <ref role="3cqZAo" node="3HJD4JbIw26" resolve="endBlockLevel" />
                    </node>
                    <node concept="Rm8GO" id="4zooVZdvj2x" role="37wK5m">
                      <ref role="Rm8GQ" node="3HJD4JbIwCO" resolve="LEFT" />
                      <ref role="1Px2BO" node="3HJD4JbIwBn" resolve="ArrowHeadDirection" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIw4L" role="jymVt">
      <property role="TrG5h" value="canBeAdded" />
      <node concept="3Tm6S6" id="3HJD4JbIw4M" role="1B3o_S" />
      <node concept="10P_77" id="3HJD4JbIw4N" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIw4O" role="3clF46">
        <property role="TrG5h" value="first" />
        <node concept="10Oyi0" id="3HJD4JbIw4P" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIw4Q" role="3clF46">
        <property role="TrG5h" value="last" />
        <node concept="10Oyi0" id="3HJD4JbIw4R" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIw4S" role="3clF46">
        <property role="TrG5h" value="i" />
        <node concept="10Oyi0" id="3HJD4JbIw4T" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="3HJD4JbIw4U" role="3clF47">
        <node concept="3cpWs8" id="3HJD4JbIw4V" role="3cqZAp">
          <node concept="3cpWsn" id="3HJD4JbIw4W" role="3cpWs9">
            <property role="TrG5h" value="freeZone" />
            <node concept="3uibUv" id="3HJD4JbIw4X" role="1tU5fm">
              <ref role="3uigEE" node="3HJD4JbIwwC" resolve="FreeZone" />
            </node>
            <node concept="2OqwBi" id="3HJD4JbIw4Y" role="33vP2m">
              <node concept="2OqwBi" id="3HJD4JbIw4Z" role="2Oq$k0">
                <node concept="2OwXpG" id="3HJD4JbIw50" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvTv" resolve="myFreeZoneMap" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIw51" role="2Oq$k0" />
              </node>
              <node concept="liA8E" id="3HJD4JbIw52" role="2OqNvi">
                <ref role="37wK5l" to="33ny:~Map.get(java.lang.Object):java.lang.Object" resolve="get" />
                <node concept="37vLTw" id="2BHiRxgm2uF" role="37wK5m">
                  <ref role="3cqZAo" node="3HJD4JbIw4S" resolve="i" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="3HJD4JbIw54" role="3cqZAp">
          <node concept="3clFbC" id="3HJD4JbIw55" role="3clFbw">
            <node concept="37vLTw" id="3GM_nagT__6" role="3uHU7B">
              <ref role="3cqZAo" node="3HJD4JbIw4W" resolve="freeZone" />
            </node>
            <node concept="10Nm6u" id="3HJD4JbIw57" role="3uHU7w" />
          </node>
          <node concept="3clFbS" id="3HJD4JbIw58" role="3clFbx">
            <node concept="3clFbF" id="3HJD4JbIw59" role="3cqZAp">
              <node concept="37vLTI" id="3HJD4JbIw5a" role="3clFbG">
                <node concept="37vLTw" id="3GM_nagT$DF" role="37vLTJ">
                  <ref role="3cqZAo" node="3HJD4JbIw4W" resolve="freeZone" />
                </node>
                <node concept="2ShNRf" id="3HJD4JbIw5c" role="37vLTx">
                  <node concept="1pGfFk" id="3HJD4JbIw5d" role="2ShVmc">
                    <ref role="37wK5l" node="3HJD4JbIwwU" resolve="FreeZone" />
                    <node concept="3cmrfG" id="3HJD4JbIw5e" role="37wK5m">
                      <property role="3cmrfH" value="0" />
                    </node>
                    <node concept="2OqwBi" id="3HJD4JbIw5f" role="37wK5m">
                      <node concept="2OqwBi" id="3HJD4JbIw5g" role="2Oq$k0">
                        <node concept="2OwXpG" id="3HJD4JbIw5h" role="2OqNvi">
                          <ref role="2Oxat5" node="3HJD4JbIvT8" resolve="myBlocks" />
                        </node>
                        <node concept="Xjq3P" id="3HJD4JbIw5i" role="2Oq$k0" />
                      </node>
                      <node concept="liA8E" id="3HJD4JbIw5j" role="2OqNvi">
                        <ref role="37wK5l" to="33ny:~List.size():int" resolve="size" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbF" id="3HJD4JbIw5k" role="3cqZAp">
              <node concept="2OqwBi" id="3HJD4JbIw5l" role="3clFbG">
                <node concept="2OqwBi" id="3HJD4JbIw5m" role="2Oq$k0">
                  <node concept="2OwXpG" id="3HJD4JbIw5n" role="2OqNvi">
                    <ref role="2Oxat5" node="3HJD4JbIvTv" resolve="myFreeZoneMap" />
                  </node>
                  <node concept="Xjq3P" id="3HJD4JbIw5o" role="2Oq$k0" />
                </node>
                <node concept="liA8E" id="3HJD4JbIw5p" role="2OqNvi">
                  <ref role="37wK5l" to="33ny:~Map.put(java.lang.Object,java.lang.Object):java.lang.Object" resolve="put" />
                  <node concept="37vLTw" id="2BHiRxgm8j1" role="37wK5m">
                    <ref role="3cqZAo" node="3HJD4JbIw4S" resolve="i" />
                  </node>
                  <node concept="37vLTw" id="3GM_nagTtgK" role="37wK5m">
                    <ref role="3cqZAo" node="3HJD4JbIw4W" resolve="freeZone" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="3HJD4JbIw5s" role="3cqZAp">
          <node concept="3cpWsn" id="3HJD4JbIw5t" role="3cpWs9">
            <property role="TrG5h" value="canBeAdded" />
            <node concept="10P_77" id="3HJD4JbIw5u" role="1tU5fm" />
            <node concept="2OqwBi" id="3HJD4JbIw5v" role="33vP2m">
              <node concept="37vLTw" id="3GM_nagTu3F" role="2Oq$k0">
                <ref role="3cqZAo" node="3HJD4JbIw4W" resolve="freeZone" />
              </node>
              <node concept="liA8E" id="3HJD4JbIw5x" role="2OqNvi">
                <ref role="37wK5l" node="3HJD4JbIw$A" resolve="canBeAdded" />
                <node concept="37vLTw" id="2BHiRxghfJD" role="37wK5m">
                  <ref role="3cqZAo" node="3HJD4JbIw4O" resolve="first" />
                </node>
                <node concept="37vLTw" id="2BHiRxglIeb" role="37wK5m">
                  <ref role="3cqZAo" node="3HJD4JbIw4Q" resolve="last" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="3HJD4JbIw5$" role="3cqZAp">
          <node concept="37vLTw" id="3GM_nagTxLI" role="3cqZAk">
            <ref role="3cqZAo" node="3HJD4JbIw5t" resolve="canBeAdded" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="JwZXmy4tvh" role="jymVt" />
    <node concept="3clFb_" id="JwZXmy4vES" role="jymVt">
      <property role="TrG5h" value="addSimpleLine" />
      <node concept="3Tmbuc" id="JwZXmy4vET" role="1B3o_S" />
      <node concept="3cqZAl" id="JwZXmy4vEU" role="3clF45" />
      <node concept="37vLTG" id="JwZXmy4vEV" role="3clF46">
        <property role="TrG5h" value="block" />
        <node concept="3uibUv" id="JwZXmy4vEW" role="1tU5fm">
          <ref role="3uigEE" node="3HJD4JbIw8e" resolve="IBlock" />
        </node>
      </node>
      <node concept="37vLTG" id="JwZXmy4vEX" role="3clF46">
        <property role="TrG5h" value="nextBlock" />
        <node concept="3uibUv" id="JwZXmy4vEY" role="1tU5fm">
          <ref role="3uigEE" node="3HJD4JbIw8e" resolve="IBlock" />
        </node>
      </node>
      <node concept="3clFbS" id="JwZXmy4vF1" role="3clF47">
        <node concept="3clFbF" id="JwZXmy4Cyy" role="3cqZAp">
          <node concept="1rXfSq" id="JwZXmy4Cyx" role="3clFbG">
            <ref role="37wK5l" node="3HJD4JbIw5A" resolve="addSimpleLine" />
            <node concept="37vLTw" id="JwZXmy4EBo" role="37wK5m">
              <ref role="3cqZAo" node="JwZXmy4vEV" resolve="block" />
            </node>
            <node concept="37vLTw" id="JwZXmy4EMn" role="37wK5m">
              <ref role="3cqZAo" node="JwZXmy4vEX" resolve="nextBlock" />
            </node>
            <node concept="2ShNRf" id="JwZXmy4ETA" role="37wK5m">
              <node concept="HV5vD" id="JwZXmy4WUk" role="2ShVmc">
                <ref role="HV5vE" node="JwZXmy4Tej" resolve="ControlFlowGraph.SimpleLineCreator" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIw5A" role="jymVt">
      <property role="TrG5h" value="addSimpleLine" />
      <node concept="3Tmbuc" id="JwZXmxYZ9s" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIw5C" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIw5D" role="3clF46">
        <property role="TrG5h" value="block" />
        <node concept="3uibUv" id="3HJD4JbIw5E" role="1tU5fm">
          <ref role="3uigEE" node="3HJD4JbIw8e" resolve="IBlock" />
        </node>
      </node>
      <node concept="37vLTG" id="3HJD4JbIw5F" role="3clF46">
        <property role="TrG5h" value="nextBlock" />
        <node concept="3uibUv" id="3HJD4JbIw5G" role="1tU5fm">
          <ref role="3uigEE" node="3HJD4JbIw8e" resolve="IBlock" />
        </node>
      </node>
      <node concept="37vLTG" id="JwZXmy4gjF" role="3clF46">
        <property role="TrG5h" value="lineCreator" />
        <node concept="3uibUv" id="JwZXmy4ipo" role="1tU5fm">
          <ref role="3uigEE" node="JwZXmy2XW9" resolve="ControlFlowGraph.LineCreator" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIw5H" role="3clF47">
        <node concept="3cpWs8" id="3HJD4JbIw5I" role="3cqZAp">
          <node concept="3cpWsn" id="3HJD4JbIw5J" role="3cpWs9">
            <property role="TrG5h" value="levelX" />
            <node concept="10Oyi0" id="3HJD4JbIw5K" role="1tU5fm" />
            <node concept="3cpWs3" id="3HJD4JbIw5L" role="33vP2m">
              <node concept="2OqwBi" id="3HJD4JbIw5M" role="3uHU7B">
                <node concept="37vLTw" id="2BHiRxgheMn" role="2Oq$k0">
                  <ref role="3cqZAo" node="3HJD4JbIw5D" resolve="block" />
                </node>
                <node concept="liA8E" id="3HJD4JbIw5O" role="2OqNvi">
                  <ref role="37wK5l" node="3HJD4JbIw8z" resolve="getX" />
                </node>
              </node>
              <node concept="FJ1c_" id="3HJD4JbIw5P" role="3uHU7w">
                <node concept="2OqwBi" id="3HJD4JbIw5Q" role="3uHU7B">
                  <node concept="37vLTw" id="2BHiRxglBAX" role="2Oq$k0">
                    <ref role="3cqZAo" node="3HJD4JbIw5D" resolve="block" />
                  </node>
                  <node concept="liA8E" id="3HJD4JbIw5S" role="2OqNvi">
                    <ref role="37wK5l" node="3HJD4JbIw8F" resolve="getWidth" />
                  </node>
                </node>
                <node concept="3cmrfG" id="3HJD4JbIw5T" role="3uHU7w">
                  <property role="3cmrfH" value="2" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="JwZXmy0$sc" role="3cqZAp">
          <node concept="3cpWsn" id="JwZXmy0$sd" role="3cpWs9">
            <property role="TrG5h" value="y1" />
            <node concept="10Oyi0" id="JwZXmy0$s5" role="1tU5fm" />
            <node concept="3cpWs3" id="JwZXmy0$se" role="33vP2m">
              <node concept="2OqwBi" id="JwZXmy0$sf" role="3uHU7B">
                <node concept="37vLTw" id="JwZXmy0$sg" role="2Oq$k0">
                  <ref role="3cqZAo" node="3HJD4JbIw5D" resolve="block" />
                </node>
                <node concept="liA8E" id="JwZXmy0$sh" role="2OqNvi">
                  <ref role="37wK5l" node="3HJD4JbIw8B" resolve="getY" />
                </node>
              </node>
              <node concept="2OqwBi" id="JwZXmy0$si" role="3uHU7w">
                <node concept="37vLTw" id="JwZXmy0$sj" role="2Oq$k0">
                  <ref role="3cqZAo" node="3HJD4JbIw5D" resolve="block" />
                </node>
                <node concept="liA8E" id="JwZXmy0$sk" role="2OqNvi">
                  <ref role="37wK5l" node="3HJD4JbIw8J" resolve="getHeight" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="JwZXmy0_OS" role="3cqZAp">
          <node concept="3cpWsn" id="JwZXmy0_OT" role="3cpWs9">
            <property role="TrG5h" value="y2" />
            <node concept="10Oyi0" id="JwZXmy0_OQ" role="1tU5fm" />
            <node concept="2OqwBi" id="JwZXmy0_OU" role="33vP2m">
              <node concept="37vLTw" id="JwZXmy0_OV" role="2Oq$k0">
                <ref role="3cqZAo" node="3HJD4JbIw5F" resolve="nextBlock" />
              </node>
              <node concept="liA8E" id="JwZXmy0_OW" role="2OqNvi">
                <ref role="37wK5l" node="3HJD4JbIw8B" resolve="getY" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIw5U" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIw5V" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIw5W" role="2Oq$k0">
              <node concept="2OwXpG" id="3HJD4JbIw5X" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvTh" resolve="myLines" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIw5Y" role="2Oq$k0" />
            </node>
            <node concept="liA8E" id="3HJD4JbIw5Z" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~List.add(java.lang.Object):boolean" resolve="add" />
              <node concept="2OqwBi" id="JwZXmy4lVE" role="37wK5m">
                <node concept="37vLTw" id="JwZXmy4lVF" role="2Oq$k0">
                  <ref role="3cqZAo" node="JwZXmy4gjF" resolve="lineCreator" />
                </node>
                <node concept="liA8E" id="JwZXmy4lVG" role="2OqNvi">
                  <ref role="37wK5l" node="JwZXmy30g5" resolve="createLine" />
                  <node concept="37vLTw" id="JwZXmy0Bqj" role="37wK5m">
                    <ref role="3cqZAo" node="JwZXmy0$sd" resolve="y1" />
                  </node>
                  <node concept="37vLTw" id="JwZXmy0Bqk" role="37wK5m">
                    <ref role="3cqZAo" node="JwZXmy0_OT" resolve="y2" />
                  </node>
                  <node concept="37vLTw" id="JwZXmy0Bql" role="37wK5m">
                    <ref role="3cqZAo" node="3HJD4JbIw5J" resolve="levelX" />
                  </node>
                  <node concept="Rm8GO" id="JwZXmy0AJ1" role="37wK5m">
                    <ref role="1Px2BO" node="3HJD4JbIwsr" resolve="LineDirection" />
                    <ref role="Rm8GQ" node="3HJD4JbIwtl" resolve="VERTICAL" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIw6e" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIw6f" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIw6g" role="2Oq$k0">
              <node concept="2OwXpG" id="3HJD4JbIw6h" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvTo" resolve="myArrowHeads" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIw6i" role="2Oq$k0" />
            </node>
            <node concept="liA8E" id="3HJD4JbIw6j" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~Set.add(java.lang.Object):boolean" resolve="add" />
              <node concept="1rXfSq" id="JwZXmy0HLv" role="37wK5m">
                <ref role="37wK5l" node="JwZXmy0HLq" resolve="createArrowHead" />
                <node concept="37vLTw" id="JwZXmy0HLt" role="37wK5m">
                  <ref role="3cqZAo" node="3HJD4JbIw5J" resolve="levelX" />
                </node>
                <node concept="37vLTw" id="JwZXmy0HLu" role="37wK5m">
                  <ref role="3cqZAo" node="JwZXmy0_OT" resolve="y2" />
                </node>
                <node concept="Rm8GO" id="JwZXmy0HFh" role="37wK5m">
                  <ref role="Rm8GQ" node="3HJD4JbIwCc" resolve="DOWN" />
                  <ref role="1Px2BO" node="3HJD4JbIwBn" resolve="ArrowHeadDirection" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="JwZXmy0HLq" role="jymVt">
      <property role="TrG5h" value="createArrowHead" />
      <node concept="3Tmbuc" id="JwZXmy0JVm" role="1B3o_S" />
      <node concept="3uibUv" id="JwZXmy0HLs" role="3clF45">
        <ref role="3uigEE" node="3HJD4JbIwjx" resolve="ArrowHead" />
      </node>
      <node concept="37vLTG" id="JwZXmy0HFi" role="3clF46">
        <property role="TrG5h" value="x" />
        <node concept="10Oyi0" id="JwZXmy0HFj" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="JwZXmy0HFk" role="3clF46">
        <property role="TrG5h" value="y" />
        <node concept="10Oyi0" id="JwZXmy0HFl" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="JwZXmy1UkT" role="3clF46">
        <property role="TrG5h" value="direction" />
        <node concept="3uibUv" id="JwZXmy1WhP" role="1tU5fm">
          <ref role="3uigEE" node="3HJD4JbIwBn" resolve="ArrowHeadDirection" />
        </node>
      </node>
      <node concept="3clFbS" id="JwZXmy0H_a" role="3clF47">
        <node concept="3cpWs6" id="JwZXmy0HFc" role="3cqZAp">
          <node concept="2ShNRf" id="JwZXmy0HFd" role="3cqZAk">
            <node concept="1pGfFk" id="JwZXmy0HFe" role="2ShVmc">
              <ref role="37wK5l" node="3HJD4JbIwjG" resolve="ArrowHead" />
              <node concept="37vLTw" id="JwZXmy0HFn" role="37wK5m">
                <ref role="3cqZAo" node="JwZXmy0HFi" resolve="x" />
              </node>
              <node concept="37vLTw" id="JwZXmy0HFm" role="37wK5m">
                <ref role="3cqZAo" node="JwZXmy0HFk" resolve="y" />
              </node>
              <node concept="37vLTw" id="JwZXmy20fe" role="37wK5m">
                <ref role="3cqZAo" node="JwZXmy1UkT" resolve="direction" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIw6r" role="jymVt">
      <property role="TrG5h" value="getWidth" />
      <node concept="3Tm1VV" id="3HJD4JbIw6s" role="1B3o_S" />
      <node concept="10Oyi0" id="3HJD4JbIw6t" role="3clF45" />
      <node concept="3clFbS" id="3HJD4JbIw6u" role="3clF47">
        <node concept="3cpWs6" id="3HJD4JbIw6v" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIw6w" role="3cqZAk">
            <node concept="2OwXpG" id="3HJD4JbIw6x" role="2OqNvi">
              <ref role="2Oxat5" node="3HJD4JbIvTG" resolve="myWidth" />
            </node>
            <node concept="Xjq3P" id="3HJD4JbIw6y" role="2Oq$k0" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIw6z" role="jymVt">
      <property role="TrG5h" value="getHeight" />
      <node concept="3Tm1VV" id="3HJD4JbIw6$" role="1B3o_S" />
      <node concept="10Oyi0" id="3HJD4JbIw6_" role="3clF45" />
      <node concept="3clFbS" id="3HJD4JbIw6A" role="3clF47">
        <node concept="3cpWs6" id="3HJD4JbIw6B" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIw6C" role="3cqZAk">
            <node concept="2OwXpG" id="3HJD4JbIw6D" role="2OqNvi">
              <ref role="2Oxat5" node="3HJD4JbIvTJ" resolve="myHeight" />
            </node>
            <node concept="Xjq3P" id="3HJD4JbIw6E" role="2Oq$k0" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIw6F" role="jymVt">
      <property role="TrG5h" value="addBlockListener" />
      <node concept="3Tm1VV" id="3HJD4JbIw6G" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIw6H" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIw6I" role="3clF46">
        <property role="TrG5h" value="listener" />
        <node concept="3uibUv" id="3HJD4JbIw6J" role="1tU5fm">
          <ref role="3uigEE" node="3HJD4JbIvBi" resolve="IBlockListener" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIw6L" role="3clF47">
        <node concept="1DcWWT" id="3HJD4JbIw6M" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIw6N" role="1DdaDG">
            <node concept="2OwXpG" id="3HJD4JbIw6O" role="2OqNvi">
              <ref role="2Oxat5" node="3HJD4JbIvT8" resolve="myBlocks" />
            </node>
            <node concept="Xjq3P" id="3HJD4JbIw6P" role="2Oq$k0" />
          </node>
          <node concept="3cpWsn" id="3HJD4JbIw6Q" role="1Duv9x">
            <property role="TrG5h" value="block" />
            <node concept="3uibUv" id="3HJD4JbIw6R" role="1tU5fm">
              <ref role="3uigEE" node="3HJD4JbIw8e" resolve="IBlock" />
            </node>
          </node>
          <node concept="3clFbS" id="3HJD4JbIw6T" role="2LFqv$">
            <node concept="3clFbF" id="3HJD4JbIw6U" role="3cqZAp">
              <node concept="2OqwBi" id="3HJD4JbIw6V" role="3clFbG">
                <node concept="37vLTw" id="3GM_nagT_J7" role="2Oq$k0">
                  <ref role="3cqZAo" node="3HJD4JbIw6Q" resolve="block" />
                </node>
                <node concept="liA8E" id="3HJD4JbIw6X" role="2OqNvi">
                  <ref role="37wK5l" node="3HJD4JbIw9b" resolve="addBlockListener" />
                  <node concept="37vLTw" id="2BHiRxglkgt" role="37wK5m">
                    <ref role="3cqZAo" node="3HJD4JbIw6I" resolve="listener" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIw6Z" role="jymVt">
      <property role="TrG5h" value="removeBlockListener" />
      <node concept="3Tm1VV" id="3HJD4JbIw70" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIw71" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIw72" role="3clF46">
        <property role="TrG5h" value="listener" />
        <node concept="3uibUv" id="3HJD4JbIw73" role="1tU5fm">
          <ref role="3uigEE" node="3HJD4JbIvBi" resolve="IBlockListener" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIw75" role="3clF47">
        <node concept="1DcWWT" id="3HJD4JbIw76" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIw77" role="1DdaDG">
            <node concept="2OwXpG" id="3HJD4JbIw78" role="2OqNvi">
              <ref role="2Oxat5" node="3HJD4JbIvT8" resolve="myBlocks" />
            </node>
            <node concept="Xjq3P" id="3HJD4JbIw79" role="2Oq$k0" />
          </node>
          <node concept="3cpWsn" id="3HJD4JbIw7a" role="1Duv9x">
            <property role="TrG5h" value="block" />
            <node concept="3uibUv" id="3HJD4JbIw7b" role="1tU5fm">
              <ref role="3uigEE" node="3HJD4JbIw8e" resolve="IBlock" />
            </node>
          </node>
          <node concept="3clFbS" id="3HJD4JbIw7d" role="2LFqv$">
            <node concept="3clFbF" id="3HJD4JbIw7e" role="3cqZAp">
              <node concept="2OqwBi" id="3HJD4JbIw7f" role="3clFbG">
                <node concept="37vLTw" id="3GM_nagTAWn" role="2Oq$k0">
                  <ref role="3cqZAo" node="3HJD4JbIw7a" resolve="block" />
                </node>
                <node concept="liA8E" id="3HJD4JbIw7h" role="2OqNvi">
                  <ref role="37wK5l" node="3HJD4JbIw9i" resolve="removeBlockListener" />
                  <node concept="37vLTw" id="2BHiRxghipE" role="37wK5m">
                    <ref role="3cqZAo" node="3HJD4JbIw72" resolve="listener" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIw7j" role="jymVt">
      <property role="TrG5h" value="processMousePressed" />
      <node concept="3Tm1VV" id="3HJD4JbIw7k" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIw7l" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIw7m" role="3clF46">
        <property role="TrG5h" value="event" />
        <node concept="3uibUv" id="3HJD4JbIw7n" role="1tU5fm">
          <ref role="3uigEE" to="hyam:~MouseEvent" resolve="MouseEvent" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIw7o" role="3clF47">
        <node concept="1DcWWT" id="3HJD4JbIw7p" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIw7q" role="1DdaDG">
            <node concept="2OwXpG" id="3HJD4JbIw7r" role="2OqNvi">
              <ref role="2Oxat5" node="3HJD4JbIvT8" resolve="myBlocks" />
            </node>
            <node concept="Xjq3P" id="3HJD4JbIw7s" role="2Oq$k0" />
          </node>
          <node concept="3cpWsn" id="3HJD4JbIw7t" role="1Duv9x">
            <property role="TrG5h" value="block" />
            <node concept="3uibUv" id="3HJD4JbIw7u" role="1tU5fm">
              <ref role="3uigEE" node="3HJD4JbIw8e" resolve="IBlock" />
            </node>
          </node>
          <node concept="3clFbS" id="3HJD4JbIw7w" role="2LFqv$">
            <node concept="3clFbJ" id="3HJD4JbIw7x" role="3cqZAp">
              <node concept="2OqwBi" id="3HJD4JbIw7y" role="3clFbw">
                <node concept="37vLTw" id="3GM_nagTBNW" role="2Oq$k0">
                  <ref role="3cqZAo" node="3HJD4JbIw7t" resolve="block" />
                </node>
                <node concept="liA8E" id="3HJD4JbIw7$" role="2OqNvi">
                  <ref role="37wK5l" node="3HJD4JbIw9p" resolve="processMousePressed" />
                  <node concept="37vLTw" id="2BHiRxgl6wV" role="37wK5m">
                    <ref role="3cqZAo" node="3HJD4JbIw7m" resolve="event" />
                  </node>
                </node>
              </node>
              <node concept="3clFbS" id="3HJD4JbIw7A" role="3clFbx">
                <node concept="3cpWs6" id="3HJD4JbIw7B" role="3cqZAp" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="JwZXmy2Rpk" role="jymVt" />
    <node concept="3HP615" id="JwZXmy2XW9" role="jymVt">
      <property role="2bfB8j" value="true" />
      <property role="TrG5h" value="LineCreator" />
      <node concept="3clFb_" id="JwZXmy30g5" role="jymVt">
        <property role="1EzhhJ" value="true" />
        <property role="2aFKle" value="false" />
        <property role="TrG5h" value="createLine" />
        <node concept="3clFbS" id="JwZXmy30g8" role="3clF47" />
        <node concept="3Tm1VV" id="JwZXmy30g9" role="1B3o_S" />
        <node concept="3uibUv" id="JwZXmy30fg" role="3clF45">
          <ref role="3uigEE" node="3HJD4JbIwEp" resolve="Line" />
        </node>
        <node concept="37vLTG" id="JwZXmy30l3" role="3clF46">
          <property role="TrG5h" value="first" />
          <node concept="10Oyi0" id="JwZXmy30l2" role="1tU5fm" />
        </node>
        <node concept="37vLTG" id="JwZXmy30lj" role="3clF46">
          <property role="TrG5h" value="second" />
          <node concept="10Oyi0" id="JwZXmy30p_" role="1tU5fm" />
        </node>
        <node concept="37vLTG" id="JwZXmy30pW" role="3clF46">
          <property role="TrG5h" value="level" />
          <node concept="10Oyi0" id="JwZXmy30ui" role="1tU5fm" />
        </node>
        <node concept="37vLTG" id="JwZXmy3i5h" role="3clF46">
          <property role="TrG5h" value="direction" />
          <node concept="3uibUv" id="JwZXmy3idF" role="1tU5fm">
            <ref role="3uigEE" node="3HJD4JbIwsr" resolve="LineDirection" />
          </node>
        </node>
      </node>
      <node concept="3Tmbuc" id="JwZXmy2VJP" role="1B3o_S" />
    </node>
    <node concept="312cEu" id="JwZXmy4Tej" role="jymVt">
      <property role="2bfB8j" value="true" />
      <property role="1sVAO0" value="false" />
      <property role="1EXbeo" value="false" />
      <property role="TrG5h" value="SimpleLineCreator" />
      <node concept="3clFb_" id="JwZXmy4VFR" role="jymVt">
        <property role="1EzhhJ" value="false" />
        <property role="2aFKle" value="false" />
        <property role="TrG5h" value="createLine" />
        <node concept="3Tm1VV" id="JwZXmy4VFT" role="1B3o_S" />
        <node concept="3uibUv" id="JwZXmy4VFU" role="3clF45">
          <ref role="3uigEE" node="3HJD4JbIwEp" resolve="Line" />
        </node>
        <node concept="37vLTG" id="JwZXmy4VFV" role="3clF46">
          <property role="TrG5h" value="first" />
          <node concept="10Oyi0" id="JwZXmy4VFW" role="1tU5fm" />
        </node>
        <node concept="37vLTG" id="JwZXmy4VFX" role="3clF46">
          <property role="TrG5h" value="second" />
          <node concept="10Oyi0" id="JwZXmy4VFY" role="1tU5fm" />
        </node>
        <node concept="37vLTG" id="JwZXmy4VFZ" role="3clF46">
          <property role="TrG5h" value="level" />
          <node concept="10Oyi0" id="JwZXmy4VG0" role="1tU5fm" />
        </node>
        <node concept="37vLTG" id="JwZXmy4VG1" role="3clF46">
          <property role="TrG5h" value="direction" />
          <node concept="3uibUv" id="JwZXmy4VG2" role="1tU5fm">
            <ref role="3uigEE" node="3HJD4JbIwsr" resolve="LineDirection" />
          </node>
        </node>
        <node concept="3clFbS" id="JwZXmy4VG3" role="3clF47">
          <node concept="3cpWs6" id="JwZXmy4FWe" role="3cqZAp">
            <node concept="2ShNRf" id="JwZXmy4FWf" role="3cqZAk">
              <node concept="1pGfFk" id="JwZXmy4FWg" role="2ShVmc">
                <ref role="37wK5l" node="3HJD4JbIwEA" resolve="Line" />
                <node concept="37vLTw" id="JwZXmy4FWh" role="37wK5m">
                  <ref role="3cqZAo" node="JwZXmy4VFV" resolve="first" />
                </node>
                <node concept="37vLTw" id="JwZXmy4FWi" role="37wK5m">
                  <ref role="3cqZAo" node="JwZXmy4VFX" resolve="second" />
                </node>
                <node concept="37vLTw" id="JwZXmy4FWj" role="37wK5m">
                  <ref role="3cqZAo" node="JwZXmy4VFZ" resolve="level" />
                </node>
                <node concept="37vLTw" id="JwZXmy4FWk" role="37wK5m">
                  <ref role="3cqZAo" node="JwZXmy4VG1" resolve="direction" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="JwZXmy4QYj" role="1B3o_S" />
      <node concept="3uibUv" id="JwZXmy4VBu" role="EKbjA">
        <ref role="3uigEE" node="JwZXmy2XW9" resolve="ControlFlowGraph.LineCreator" />
      </node>
    </node>
  </node>
  <node concept="3HP615" id="3HJD4JbIw7M">
    <property role="TrG5h" value="IGraphCreator" />
    <node concept="3Tm1VV" id="3HJD4JbIw7N" role="1B3o_S" />
    <node concept="16euLQ" id="3HJD4JbIw7O" role="16eVyc">
      <property role="3ztuRv" value="true" />
      <property role="TrG5h" value="T" />
      <node concept="3uibUv" id="3HJD4JbIw7P" role="3ztrMU">
        <ref role="3uigEE" node="3HJD4JbIvSt" resolve="IInstruction" />
        <node concept="16syzq" id="3HJD4JbIw7Q" role="11_B2D">
          <ref role="16sUi3" node="3HJD4JbIw7O" resolve="T" />
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIw7R" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="createBlock" />
      <node concept="3Tm1VV" id="3HJD4JbIw7S" role="1B3o_S" />
      <node concept="3uibUv" id="3HJD4JbIw7T" role="3clF45">
        <ref role="3uigEE" node="3HJD4JbIw8e" resolve="IBlock" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIw7V" role="3clF46">
        <property role="TrG5h" value="instruction" />
        <node concept="16syzq" id="3HJD4JbIw7W" role="1tU5fm">
          <ref role="16sUi3" node="3HJD4JbIw7O" resolve="T" />
        </node>
      </node>
      <node concept="37vLTG" id="3HJD4JbIw7X" role="3clF46">
        <property role="TrG5h" value="x" />
        <node concept="10Oyi0" id="3HJD4JbIw7Y" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIw7Z" role="3clF46">
        <property role="TrG5h" value="y" />
        <node concept="10Oyi0" id="3HJD4JbIw80" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIw81" role="3clF46">
        <property role="TrG5h" value="width" />
        <node concept="10Oyi0" id="3HJD4JbIw82" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIw83" role="3clF46">
        <property role="TrG5h" value="height" />
        <node concept="10Oyi0" id="3HJD4JbIw84" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="3HJD4JbIw85" role="3clF47" />
    </node>
  </node>
  <node concept="3HP615" id="3HJD4JbIw8e">
    <property role="TrG5h" value="IBlock" />
    <node concept="3Tm1VV" id="3HJD4JbIw8f" role="1B3o_S" />
    <node concept="3clFb_" id="3HJD4JbIw8j" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="paint" />
      <node concept="3Tm1VV" id="3HJD4JbIw8k" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIw8l" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIw8m" role="3clF46">
        <property role="TrG5h" value="g" />
        <node concept="3uibUv" id="3HJD4JbIw8n" role="1tU5fm">
          <ref role="3uigEE" to="z60i:~Graphics" resolve="Graphics" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIw8o" role="3clF47" />
    </node>
    <node concept="3clFb_" id="3HJD4JbIw8p" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="relayout" />
      <node concept="3Tm1VV" id="3HJD4JbIw8q" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIw8r" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIw8s" role="3clF46">
        <property role="TrG5h" value="component" />
        <node concept="3uibUv" id="3HJD4JbIw8t" role="1tU5fm">
          <ref role="3uigEE" to="z60i:~Component" resolve="Component" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIw8u" role="3clF47" />
    </node>
    <node concept="3clFb_" id="3HJD4JbIw8v" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="getSourceNode" />
      <node concept="3Tm1VV" id="3HJD4JbIw8w" role="1B3o_S" />
      <node concept="3uibUv" id="6bzHk29oeyh" role="3clF45">
        <ref role="3uigEE" to="mhbf:~SNodeReference" resolve="SNodeReference" />
      </node>
      <node concept="3clFbS" id="3HJD4JbIw8y" role="3clF47" />
    </node>
    <node concept="3clFb_" id="2fWCKaofx2s" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="getRuleNodeReference" />
      <node concept="3Tm1VV" id="2fWCKaofx2v" role="1B3o_S" />
      <node concept="3clFbS" id="2fWCKaofx2w" role="3clF47" />
      <node concept="3uibUv" id="GzG95QssyO" role="3clF45">
        <ref role="3uigEE" to="mhbf:~SNodeReference" resolve="SNodeReference" />
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIw8z" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="getX" />
      <node concept="3Tm1VV" id="3HJD4JbIw8$" role="1B3o_S" />
      <node concept="10Oyi0" id="3HJD4JbIw8_" role="3clF45" />
      <node concept="3clFbS" id="3HJD4JbIw8A" role="3clF47" />
    </node>
    <node concept="3clFb_" id="3HJD4JbIw8B" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="getY" />
      <node concept="3Tm1VV" id="3HJD4JbIw8C" role="1B3o_S" />
      <node concept="10Oyi0" id="3HJD4JbIw8D" role="3clF45" />
      <node concept="3clFbS" id="3HJD4JbIw8E" role="3clF47" />
    </node>
    <node concept="3clFb_" id="3HJD4JbIw8F" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="getWidth" />
      <node concept="3Tm1VV" id="3HJD4JbIw8G" role="1B3o_S" />
      <node concept="10Oyi0" id="3HJD4JbIw8H" role="3clF45" />
      <node concept="3clFbS" id="3HJD4JbIw8I" role="3clF47" />
    </node>
    <node concept="3clFb_" id="3HJD4JbIw8J" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="getHeight" />
      <node concept="3Tm1VV" id="3HJD4JbIw8K" role="1B3o_S" />
      <node concept="10Oyi0" id="3HJD4JbIw8L" role="3clF45" />
      <node concept="3clFbS" id="3HJD4JbIw8M" role="3clF47" />
    </node>
    <node concept="3clFb_" id="3HJD4JbIw8N" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="setWidth" />
      <node concept="3Tm1VV" id="3HJD4JbIw8O" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIw8P" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIw8Q" role="3clF46">
        <property role="TrG5h" value="width" />
        <node concept="10Oyi0" id="3HJD4JbIw8R" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="3HJD4JbIw8S" role="3clF47" />
    </node>
    <node concept="3clFb_" id="3HJD4JbIw8T" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="setHeight" />
      <node concept="3Tm1VV" id="3HJD4JbIw8U" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIw8V" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIw8W" role="3clF46">
        <property role="TrG5h" value="height" />
        <node concept="10Oyi0" id="3HJD4JbIw8X" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="3HJD4JbIw8Y" role="3clF47" />
    </node>
    <node concept="3clFb_" id="3HJD4JbIw8Z" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="setX" />
      <node concept="3Tm1VV" id="3HJD4JbIw90" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIw91" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIw92" role="3clF46">
        <property role="TrG5h" value="x" />
        <node concept="10Oyi0" id="3HJD4JbIw93" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="3HJD4JbIw94" role="3clF47" />
    </node>
    <node concept="3clFb_" id="3HJD4JbIw95" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="setY" />
      <node concept="3Tm1VV" id="3HJD4JbIw96" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIw97" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIw98" role="3clF46">
        <property role="TrG5h" value="y" />
        <node concept="10Oyi0" id="3HJD4JbIw99" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="3HJD4JbIw9a" role="3clF47" />
    </node>
    <node concept="3clFb_" id="3HJD4JbIw9b" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="addBlockListener" />
      <node concept="3Tm1VV" id="3HJD4JbIw9c" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIw9d" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIw9e" role="3clF46">
        <property role="TrG5h" value="listener" />
        <node concept="3uibUv" id="3HJD4JbIw9f" role="1tU5fm">
          <ref role="3uigEE" node="3HJD4JbIvBi" resolve="IBlockListener" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIw9h" role="3clF47" />
    </node>
    <node concept="3clFb_" id="3HJD4JbIw9i" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="removeBlockListener" />
      <node concept="3Tm1VV" id="3HJD4JbIw9j" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIw9k" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIw9l" role="3clF46">
        <property role="TrG5h" value="listener" />
        <node concept="3uibUv" id="3HJD4JbIw9m" role="1tU5fm">
          <ref role="3uigEE" node="3HJD4JbIvBi" resolve="IBlockListener" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIw9o" role="3clF47" />
    </node>
    <node concept="3clFb_" id="6bzHk29ogh9" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="setSucc" />
      <node concept="3cqZAl" id="6bzHk29ogha" role="3clF45" />
      <node concept="3Tm1VV" id="6bzHk29oghb" role="1B3o_S" />
      <node concept="3clFbS" id="6bzHk29oghc" role="3clF47" />
      <node concept="37vLTG" id="6bzHk29oghd" role="3clF46">
        <property role="TrG5h" value="succ" />
        <node concept="3uibUv" id="6bzHk29oghe" role="1tU5fm">
          <ref role="3uigEE" to="33ny:~Set" resolve="Set" />
          <node concept="3uibUv" id="6bzHk29oghg" role="11_B2D">
            <ref role="3uigEE" node="3HJD4JbIw8e" resolve="IBlock" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="6bzHk29oghz" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="succ" />
      <node concept="3uibUv" id="6bzHk29oghB" role="3clF45">
        <ref role="3uigEE" to="33ny:~Set" resolve="Set" />
        <node concept="3uibUv" id="6bzHk29oghD" role="11_B2D">
          <ref role="3uigEE" node="3HJD4JbIw8e" resolve="IBlock" />
        </node>
      </node>
      <node concept="3Tm1VV" id="6bzHk29ogh_" role="1B3o_S" />
      <node concept="3clFbS" id="6bzHk29oghA" role="3clF47" />
    </node>
    <node concept="3clFb_" id="3HJD4JbIw9p" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="processMousePressed" />
      <node concept="3Tm1VV" id="3HJD4JbIw9q" role="1B3o_S" />
      <node concept="10P_77" id="3HJD4JbIw9r" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIw9s" role="3clF46">
        <property role="TrG5h" value="mEvent" />
        <node concept="3uibUv" id="3HJD4JbIw9t" role="1tU5fm">
          <ref role="3uigEE" to="hyam:~MouseEvent" resolve="MouseEvent" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIw9u" role="3clF47" />
    </node>
  </node>
  <node concept="3HP615" id="3HJD4JbIvBi">
    <property role="TrG5h" value="IBlockListener" />
    <node concept="3Tm1VV" id="3HJD4JbIwee" role="1B3o_S" />
    <node concept="3clFb_" id="3HJD4JbIwei" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="mousePressed" />
      <node concept="3Tm1VV" id="3HJD4JbIwej" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIwek" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIwel" role="3clF46">
        <property role="TrG5h" value="event" />
        <node concept="3uibUv" id="3HJD4JbIwem" role="1tU5fm">
          <ref role="3uigEE" to="hyam:~MouseEvent" resolve="MouseEvent" />
        </node>
      </node>
      <node concept="37vLTG" id="3HJD4JbIwen" role="3clF46">
        <property role="TrG5h" value="block" />
        <node concept="3uibUv" id="6bzHk29oeyk" role="1tU5fm">
          <ref role="3uigEE" node="3HJD4JbIw8e" resolve="IBlock" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIweq" role="3clF47" />
    </node>
  </node>
  <node concept="312cEu" id="3HJD4JbIwer">
    <property role="TrG5h" value="ReturnBlock" />
    <property role="3GE5qa" value="block" />
    <node concept="3Tm1VV" id="3HJD4JbIwes" role="1B3o_S" />
    <node concept="3uibUv" id="3HJD4JbIwew" role="1zkMxy">
      <ref role="3uigEE" node="3HJD4JbIvLb" resolve="AbstractBlock" />
    </node>
    <node concept="3clFbW" id="3HJD4JbIwey" role="jymVt">
      <node concept="3Tm1VV" id="3HJD4JbIwez" role="1B3o_S" />
      <node concept="37vLTG" id="3HJD4JbIwe$" role="3clF46">
        <property role="TrG5h" value="x" />
        <node concept="10Oyi0" id="3HJD4JbIwe_" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIweA" role="3clF46">
        <property role="TrG5h" value="y" />
        <node concept="10Oyi0" id="3HJD4JbIweB" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIweC" role="3clF46">
        <property role="TrG5h" value="width" />
        <node concept="10Oyi0" id="3HJD4JbIweD" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIweE" role="3clF46">
        <property role="TrG5h" value="height" />
        <node concept="10Oyi0" id="3HJD4JbIweF" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIweG" role="3clF46">
        <property role="TrG5h" value="source" />
        <node concept="3uibUv" id="6bzHk29ogq2" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNodeReference" resolve="SNodeReference" />
        </node>
      </node>
      <node concept="37vLTG" id="6j7_9uL$zAh" role="3clF46">
        <property role="TrG5h" value="caption" />
        <node concept="3uibUv" id="6j7_9uL$zAj" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="37vLTG" id="GzG95QnbkZ" role="3clF46">
        <property role="TrG5h" value="ruleNodeReference" />
        <node concept="3uibUv" id="GzG95Qnbl0" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIweI" role="3clF47">
        <node concept="XkiVB" id="3HJD4JbIweJ" role="3cqZAp">
          <ref role="37wK5l" node="3HJD4JbIvLU" resolve="AbstractBlock" />
          <node concept="37vLTw" id="2BHiRxghg9Y" role="37wK5m">
            <ref role="3cqZAo" node="3HJD4JbIwe$" resolve="x" />
          </node>
          <node concept="37vLTw" id="2BHiRxghfu$" role="37wK5m">
            <ref role="3cqZAo" node="3HJD4JbIweA" resolve="y" />
          </node>
          <node concept="37vLTw" id="2BHiRxgm7Tl" role="37wK5m">
            <ref role="3cqZAo" node="3HJD4JbIweC" resolve="width" />
          </node>
          <node concept="37vLTw" id="2BHiRxglwwL" role="37wK5m">
            <ref role="3cqZAo" node="3HJD4JbIweE" resolve="height" />
          </node>
          <node concept="37vLTw" id="2BHiRxglJVx" role="37wK5m">
            <ref role="3cqZAo" node="3HJD4JbIweG" resolve="source" />
          </node>
          <node concept="37vLTw" id="2BHiRxgm9$2" role="37wK5m">
            <ref role="3cqZAo" node="6j7_9uL$zAh" resolve="caption" />
          </node>
          <node concept="37vLTw" id="GzG95Qndan" role="37wK5m">
            <ref role="3cqZAo" node="GzG95QnbkZ" resolve="ruleNodeReference" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIweP" role="jymVt">
      <property role="TrG5h" value="paintBlock" />
      <node concept="3Tmbuc" id="3HJD4JbIweQ" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIweR" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIweS" role="3clF46">
        <property role="TrG5h" value="g" />
        <node concept="3uibUv" id="3HJD4JbIweT" role="1tU5fm">
          <ref role="3uigEE" to="z60i:~Graphics" resolve="Graphics" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIweU" role="3clF47">
        <node concept="3clFbF" id="3HJD4JbIweV" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIweW" role="3clFbG">
            <node concept="37vLTw" id="2BHiRxglDtN" role="2Oq$k0">
              <ref role="3cqZAo" node="3HJD4JbIweS" resolve="g" />
            </node>
            <node concept="liA8E" id="3HJD4JbIweY" role="2OqNvi">
              <ref role="37wK5l" to="z60i:~Graphics.setColor(java.awt.Color):void" resolve="setColor" />
              <node concept="10M0yZ" id="3HJD4JbIweZ" role="37wK5m">
                <ref role="1PxDUh" to="z60i:~Color" resolve="Color" />
                <ref role="3cqZAo" to="z60i:~Color.MAGENTA" resolve="MAGENTA" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIwf0" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIwf1" role="3clFbG">
            <node concept="37vLTw" id="2BHiRxgmwVU" role="2Oq$k0">
              <ref role="3cqZAo" node="3HJD4JbIweS" resolve="g" />
            </node>
            <node concept="liA8E" id="3HJD4JbIwf3" role="2OqNvi">
              <ref role="37wK5l" to="z60i:~Graphics.fillOval(int,int,int,int):void" resolve="fillOval" />
              <node concept="2OqwBi" id="3HJD4JbIwf4" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIwf5" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLi" resolve="myX" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIwf6" role="2Oq$k0" />
              </node>
              <node concept="2OqwBi" id="3HJD4JbIwf7" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIwf8" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLl" resolve="myY" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIwf9" role="2Oq$k0" />
              </node>
              <node concept="2OqwBi" id="3HJD4JbIwfa" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIwfb" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLo" resolve="myWidth" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIwfc" role="2Oq$k0" />
              </node>
              <node concept="2OqwBi" id="3HJD4JbIwfd" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIwfe" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLr" resolve="myHeight" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIwff" role="2Oq$k0" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIwfg" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIwfh" role="3clFbG">
            <node concept="37vLTw" id="2BHiRxgll8d" role="2Oq$k0">
              <ref role="3cqZAo" node="3HJD4JbIweS" resolve="g" />
            </node>
            <node concept="liA8E" id="3HJD4JbIwfj" role="2OqNvi">
              <ref role="37wK5l" to="z60i:~Graphics.setColor(java.awt.Color):void" resolve="setColor" />
              <node concept="10M0yZ" id="3HJD4JbIwfk" role="37wK5m">
                <ref role="1PxDUh" to="z60i:~Color" resolve="Color" />
                <ref role="3cqZAo" to="z60i:~Color.BLACK" resolve="BLACK" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIwfl" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIwfm" role="3clFbG">
            <node concept="37vLTw" id="2BHiRxglIyO" role="2Oq$k0">
              <ref role="3cqZAo" node="3HJD4JbIweS" resolve="g" />
            </node>
            <node concept="liA8E" id="3HJD4JbIwfo" role="2OqNvi">
              <ref role="37wK5l" to="z60i:~Graphics.drawOval(int,int,int,int):void" resolve="drawOval" />
              <node concept="2OqwBi" id="3HJD4JbIwfp" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIwfq" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLi" resolve="myX" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIwfr" role="2Oq$k0" />
              </node>
              <node concept="2OqwBi" id="3HJD4JbIwfs" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIwft" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLl" resolve="myY" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIwfu" role="2Oq$k0" />
              </node>
              <node concept="2OqwBi" id="3HJD4JbIwfv" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIwfw" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLo" resolve="myWidth" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIwfx" role="2Oq$k0" />
              </node>
              <node concept="2OqwBi" id="3HJD4JbIwfy" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIwfz" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLr" resolve="myHeight" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIwf$" role="2Oq$k0" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3tYsUK_UCMi" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="3HJD4JbIwjx">
    <property role="TrG5h" value="ArrowHead" />
    <node concept="3Tm1VV" id="3HJD4JbIwjy" role="1B3o_S" />
    <node concept="312cEg" id="3HJD4JbIwjz" role="jymVt">
      <property role="TrG5h" value="myX" />
      <node concept="10Oyi0" id="3HJD4JbIwj$" role="1tU5fm" />
      <node concept="3Tm6S6" id="3HJD4JbIwj_" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="3HJD4JbIwjA" role="jymVt">
      <property role="TrG5h" value="myY" />
      <node concept="10Oyi0" id="3HJD4JbIwjB" role="1tU5fm" />
      <node concept="3Tm6S6" id="3HJD4JbIwjC" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="3HJD4JbIwjD" role="jymVt">
      <property role="TrG5h" value="myDirection" />
      <node concept="3uibUv" id="3HJD4JbIwjE" role="1tU5fm">
        <ref role="3uigEE" node="3HJD4JbIwBn" resolve="ArrowHeadDirection" />
      </node>
      <node concept="3Tm6S6" id="3HJD4JbIwjF" role="1B3o_S" />
    </node>
    <node concept="3clFbW" id="3HJD4JbIwjG" role="jymVt">
      <node concept="3Tm1VV" id="3HJD4JbIwjH" role="1B3o_S" />
      <node concept="37vLTG" id="3HJD4JbIwjI" role="3clF46">
        <property role="TrG5h" value="x" />
        <node concept="10Oyi0" id="3HJD4JbIwjJ" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIwjK" role="3clF46">
        <property role="TrG5h" value="y" />
        <node concept="10Oyi0" id="3HJD4JbIwjL" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIwjM" role="3clF46">
        <property role="TrG5h" value="direction" />
        <node concept="3uibUv" id="3HJD4JbIwjN" role="1tU5fm">
          <ref role="3uigEE" node="3HJD4JbIwBn" resolve="ArrowHeadDirection" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIwjO" role="3clF47">
        <node concept="3clFbF" id="3HJD4JbIwjP" role="3cqZAp">
          <node concept="37vLTI" id="3HJD4JbIwjQ" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIwjR" role="37vLTJ">
              <node concept="2OwXpG" id="3HJD4JbIwjS" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIwjz" resolve="myX" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIwjT" role="2Oq$k0" />
            </node>
            <node concept="37vLTw" id="2BHiRxgm6vf" role="37vLTx">
              <ref role="3cqZAo" node="3HJD4JbIwjI" resolve="x" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIwjV" role="3cqZAp">
          <node concept="37vLTI" id="3HJD4JbIwjW" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIwjX" role="37vLTJ">
              <node concept="2OwXpG" id="3HJD4JbIwjY" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIwjA" resolve="myY" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIwjZ" role="2Oq$k0" />
            </node>
            <node concept="37vLTw" id="2BHiRxgmvaR" role="37vLTx">
              <ref role="3cqZAo" node="3HJD4JbIwjK" resolve="y" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIwk1" role="3cqZAp">
          <node concept="37vLTI" id="3HJD4JbIwk2" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIwk3" role="37vLTJ">
              <node concept="2OwXpG" id="3HJD4JbIwk4" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIwjD" resolve="myDirection" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIwk5" role="2Oq$k0" />
            </node>
            <node concept="37vLTw" id="2BHiRxgm7JI" role="37vLTx">
              <ref role="3cqZAo" node="3HJD4JbIwjM" resolve="direction" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIwk7" role="jymVt">
      <property role="TrG5h" value="getX" />
      <node concept="3Tm1VV" id="3HJD4JbIwk8" role="1B3o_S" />
      <node concept="10Oyi0" id="3HJD4JbIwk9" role="3clF45" />
      <node concept="3clFbS" id="3HJD4JbIwka" role="3clF47">
        <node concept="3cpWs6" id="3HJD4JbIwkb" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIwkc" role="3cqZAk">
            <node concept="2OwXpG" id="3HJD4JbIwkd" role="2OqNvi">
              <ref role="2Oxat5" node="3HJD4JbIwjz" resolve="myX" />
            </node>
            <node concept="Xjq3P" id="3HJD4JbIwke" role="2Oq$k0" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIwkf" role="jymVt">
      <property role="TrG5h" value="getY" />
      <node concept="3Tm1VV" id="3HJD4JbIwkg" role="1B3o_S" />
      <node concept="10Oyi0" id="3HJD4JbIwkh" role="3clF45" />
      <node concept="3clFbS" id="3HJD4JbIwki" role="3clF47">
        <node concept="3cpWs6" id="3HJD4JbIwkj" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIwkk" role="3cqZAk">
            <node concept="2OwXpG" id="3HJD4JbIwkl" role="2OqNvi">
              <ref role="2Oxat5" node="3HJD4JbIwjA" resolve="myY" />
            </node>
            <node concept="Xjq3P" id="3HJD4JbIwkm" role="2Oq$k0" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIwkn" role="jymVt">
      <property role="TrG5h" value="setX" />
      <node concept="3Tm1VV" id="3HJD4JbIwko" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIwkp" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIwkq" role="3clF46">
        <property role="TrG5h" value="x" />
        <node concept="10Oyi0" id="3HJD4JbIwkr" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="3HJD4JbIwks" role="3clF47">
        <node concept="3clFbF" id="3HJD4JbIwkt" role="3cqZAp">
          <node concept="37vLTI" id="3HJD4JbIwku" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIwkv" role="37vLTJ">
              <node concept="2OwXpG" id="3HJD4JbIwkw" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIwjz" resolve="myX" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIwkx" role="2Oq$k0" />
            </node>
            <node concept="37vLTw" id="2BHiRxglyGt" role="37vLTx">
              <ref role="3cqZAo" node="3HJD4JbIwkq" resolve="x" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIwkz" role="jymVt">
      <property role="TrG5h" value="setY" />
      <node concept="3Tm1VV" id="3HJD4JbIwk$" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIwk_" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIwkA" role="3clF46">
        <property role="TrG5h" value="y" />
        <node concept="10Oyi0" id="3HJD4JbIwkB" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="3HJD4JbIwkC" role="3clF47">
        <node concept="3clFbF" id="3HJD4JbIwkD" role="3cqZAp">
          <node concept="37vLTI" id="3HJD4JbIwkE" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIwkF" role="37vLTJ">
              <node concept="2OwXpG" id="3HJD4JbIwkG" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIwjA" resolve="myY" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIwkH" role="2Oq$k0" />
            </node>
            <node concept="37vLTw" id="2BHiRxgl6w0" role="37vLTx">
              <ref role="3cqZAo" node="3HJD4JbIwkA" resolve="y" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIwkJ" role="jymVt">
      <property role="TrG5h" value="getDirection" />
      <node concept="3Tm1VV" id="3HJD4JbIwkK" role="1B3o_S" />
      <node concept="3uibUv" id="3HJD4JbIwkL" role="3clF45">
        <ref role="3uigEE" node="3HJD4JbIwBn" resolve="ArrowHeadDirection" />
      </node>
      <node concept="3clFbS" id="3HJD4JbIwkM" role="3clF47">
        <node concept="3cpWs6" id="3HJD4JbIwkN" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIwkO" role="3cqZAk">
            <node concept="2OwXpG" id="3HJD4JbIwkP" role="2OqNvi">
              <ref role="2Oxat5" node="3HJD4JbIwjD" resolve="myDirection" />
            </node>
            <node concept="Xjq3P" id="3HJD4JbIwkQ" role="2Oq$k0" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIwkR" role="jymVt">
      <property role="TrG5h" value="paint" />
      <node concept="3Tm1VV" id="3HJD4JbIwkS" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIwkT" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIwkU" role="3clF46">
        <property role="TrG5h" value="g" />
        <node concept="3uibUv" id="3HJD4JbIwkV" role="1tU5fm">
          <ref role="3uigEE" to="z60i:~Graphics" resolve="Graphics" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIwkW" role="3clF47">
        <node concept="3clFbF" id="3HJD4JbIwkX" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIwkY" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIwkZ" role="2Oq$k0">
              <node concept="2OwXpG" id="3HJD4JbIwl0" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIwjD" resolve="myDirection" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIwl1" role="2Oq$k0" />
            </node>
            <node concept="liA8E" id="3HJD4JbIwl2" role="2OqNvi">
              <ref role="37wK5l" node="3HJD4JbIwEf" resolve="paint" />
              <node concept="37vLTw" id="2BHiRxgm7Tb" role="37wK5m">
                <ref role="3cqZAo" node="3HJD4JbIwkU" resolve="g" />
              </node>
              <node concept="2OqwBi" id="3HJD4JbIwl4" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIwl5" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIwjz" resolve="myX" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIwl6" role="2Oq$k0" />
              </node>
              <node concept="2OqwBi" id="3HJD4JbIwl7" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIwl8" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIwjA" resolve="myY" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIwl9" role="2Oq$k0" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="312cEu" id="3HJD4JbIwla">
    <property role="TrG5h" value="AltBlock" />
    <property role="3GE5qa" value="block" />
    <node concept="3Tm1VV" id="3HJD4JbIwlb" role="1B3o_S" />
    <node concept="3uibUv" id="3HJD4JbIwlf" role="1zkMxy">
      <ref role="3uigEE" node="3HJD4JbIvLb" resolve="AbstractBlock" />
    </node>
    <node concept="3clFbW" id="3HJD4JbIwlh" role="jymVt">
      <node concept="3Tm1VV" id="3HJD4JbIwli" role="1B3o_S" />
      <node concept="37vLTG" id="3HJD4JbIwlj" role="3clF46">
        <property role="TrG5h" value="x" />
        <node concept="10Oyi0" id="3HJD4JbIwlk" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIwll" role="3clF46">
        <property role="TrG5h" value="y" />
        <node concept="10Oyi0" id="3HJD4JbIwlm" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIwln" role="3clF46">
        <property role="TrG5h" value="width" />
        <node concept="10Oyi0" id="3HJD4JbIwlo" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIwlp" role="3clF46">
        <property role="TrG5h" value="height" />
        <node concept="10Oyi0" id="3HJD4JbIwlq" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="6bzHk29ogms" role="3clF46">
        <property role="TrG5h" value="source" />
        <node concept="3uibUv" id="6bzHk29ogmu" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNodeReference" resolve="SNodeReference" />
        </node>
      </node>
      <node concept="37vLTG" id="6j7_9uL$z_W" role="3clF46">
        <property role="TrG5h" value="caption" />
        <node concept="3uibUv" id="6j7_9uL$z_Y" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="37vLTG" id="GzG95QmMyX" role="3clF46">
        <property role="TrG5h" value="ruleNodeReference" />
        <node concept="3uibUv" id="GzG95QmNts" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIwlt" role="3clF47">
        <node concept="XkiVB" id="3HJD4JbIwlu" role="3cqZAp">
          <ref role="37wK5l" node="3HJD4JbIvLU" resolve="AbstractBlock" />
          <node concept="37vLTw" id="2BHiRxgmCou" role="37wK5m">
            <ref role="3cqZAo" node="3HJD4JbIwlj" resolve="x" />
          </node>
          <node concept="37vLTw" id="2BHiRxgmax9" role="37wK5m">
            <ref role="3cqZAo" node="3HJD4JbIwll" resolve="y" />
          </node>
          <node concept="37vLTw" id="2BHiRxgm8N_" role="37wK5m">
            <ref role="3cqZAo" node="3HJD4JbIwln" resolve="width" />
          </node>
          <node concept="37vLTw" id="2BHiRxghivS" role="37wK5m">
            <ref role="3cqZAo" node="3HJD4JbIwlp" resolve="height" />
          </node>
          <node concept="37vLTw" id="2BHiRxgm8Ag" role="37wK5m">
            <ref role="3cqZAo" node="6bzHk29ogms" resolve="source" />
          </node>
          <node concept="37vLTw" id="2BHiRxglIdj" role="37wK5m">
            <ref role="3cqZAo" node="6j7_9uL$z_W" resolve="caption" />
          </node>
          <node concept="37vLTw" id="GzG95QmQe7" role="37wK5m">
            <ref role="3cqZAo" node="GzG95QmMyX" resolve="ruleNodeReference" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIwl$" role="jymVt">
      <property role="TrG5h" value="paintBlock" />
      <node concept="3Tm1VV" id="3HJD4JbIwl_" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIwlA" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIwlB" role="3clF46">
        <property role="TrG5h" value="g" />
        <node concept="3uibUv" id="3HJD4JbIwlC" role="1tU5fm">
          <ref role="3uigEE" to="z60i:~Graphics" resolve="Graphics" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIwlD" role="3clF47">
        <node concept="3clFbF" id="3HJD4JbIwlE" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIwlF" role="3clFbG">
            <node concept="37vLTw" id="2BHiRxgma5_" role="2Oq$k0">
              <ref role="3cqZAo" node="3HJD4JbIwlB" resolve="g" />
            </node>
            <node concept="liA8E" id="3HJD4JbIwlH" role="2OqNvi">
              <ref role="37wK5l" to="z60i:~Graphics.setColor(java.awt.Color):void" resolve="setColor" />
              <node concept="2ShNRf" id="3HJD4JbIwlI" role="37wK5m">
                <node concept="1pGfFk" id="3HJD4JbIwlJ" role="2ShVmc">
                  <ref role="37wK5l" to="z60i:~Color.&lt;init&gt;(int,int,int)" resolve="Color" />
                  <node concept="3cmrfG" id="3HJD4JbIwlK" role="37wK5m">
                    <property role="3cmrfH" value="251" />
                  </node>
                  <node concept="3cmrfG" id="3HJD4JbIwlL" role="37wK5m">
                    <property role="3cmrfH" value="217" />
                  </node>
                  <node concept="3cmrfG" id="3HJD4JbIwlM" role="37wK5m">
                    <property role="3cmrfH" value="154" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIwlN" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIwlO" role="3clFbG">
            <node concept="37vLTw" id="2BHiRxgm9Ow" role="2Oq$k0">
              <ref role="3cqZAo" node="3HJD4JbIwlB" resolve="g" />
            </node>
            <node concept="liA8E" id="3HJD4JbIwlQ" role="2OqNvi">
              <ref role="37wK5l" to="z60i:~Graphics.fillOval(int,int,int,int):void" resolve="fillOval" />
              <node concept="2OqwBi" id="3HJD4JbIwlR" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIwlS" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLi" resolve="myX" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIwlT" role="2Oq$k0" />
              </node>
              <node concept="2OqwBi" id="3HJD4JbIwlU" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIwlV" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLl" resolve="myY" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIwlW" role="2Oq$k0" />
              </node>
              <node concept="2OqwBi" id="3HJD4JbIwlX" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIwlY" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLo" resolve="myWidth" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIwlZ" role="2Oq$k0" />
              </node>
              <node concept="2OqwBi" id="3HJD4JbIwm0" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIwm1" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLr" resolve="myHeight" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIwm2" role="2Oq$k0" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIwm3" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIwm4" role="3clFbG">
            <node concept="37vLTw" id="2BHiRxgm6Kn" role="2Oq$k0">
              <ref role="3cqZAo" node="3HJD4JbIwlB" resolve="g" />
            </node>
            <node concept="liA8E" id="3HJD4JbIwm6" role="2OqNvi">
              <ref role="37wK5l" to="z60i:~Graphics.setColor(java.awt.Color):void" resolve="setColor" />
              <node concept="10M0yZ" id="3HJD4JbIwm7" role="37wK5m">
                <ref role="1PxDUh" to="z60i:~Color" resolve="Color" />
                <ref role="3cqZAo" to="z60i:~Color.BLACK" resolve="BLACK" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIwm8" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIwm9" role="3clFbG">
            <node concept="37vLTw" id="2BHiRxgm_$W" role="2Oq$k0">
              <ref role="3cqZAo" node="3HJD4JbIwlB" resolve="g" />
            </node>
            <node concept="liA8E" id="3HJD4JbIwmb" role="2OqNvi">
              <ref role="37wK5l" to="z60i:~Graphics.drawOval(int,int,int,int):void" resolve="drawOval" />
              <node concept="2OqwBi" id="3HJD4JbIwmc" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIwmd" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLi" resolve="myX" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIwme" role="2Oq$k0" />
              </node>
              <node concept="2OqwBi" id="3HJD4JbIwmf" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIwmg" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLl" resolve="myY" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIwmh" role="2Oq$k0" />
              </node>
              <node concept="2OqwBi" id="3HJD4JbIwmi" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIwmj" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLo" resolve="myWidth" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIwmk" role="2Oq$k0" />
              </node>
              <node concept="2OqwBi" id="3HJD4JbIwml" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIwmm" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLr" resolve="myHeight" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIwmn" role="2Oq$k0" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3tYsUK_Uwzm" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="3HJD4JbIwmo">
    <property role="TrG5h" value="ShowCFGDialog" />
    <node concept="3Tm1VV" id="3HJD4JbIwmp" role="1B3o_S" />
    <node concept="3uibUv" id="34LK9F8xq5e" role="1zkMxy">
      <ref role="3uigEE" to="jkm4:~DialogWrapper" resolve="DialogWrapper" />
    </node>
    <node concept="312cEg" id="3HJD4JbIwn7" role="jymVt">
      <property role="TrG5h" value="myScrollPane" />
      <node concept="3uibUv" id="3HJD4JbIwn8" role="1tU5fm">
        <ref role="3uigEE" to="dxuu:~JScrollPane" resolve="JScrollPane" />
      </node>
      <node concept="3Tm6S6" id="3HJD4JbIwn9" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="3HJD4JbIwna" role="jymVt">
      <property role="TrG5h" value="myComponent" />
      <node concept="3uibUv" id="3HJD4JbIwnb" role="1tU5fm">
        <ref role="3uigEE" node="3HJD4JbIwmr" resolve="ShowCFGDialog.MyComponent" />
      </node>
      <node concept="3Tm6S6" id="3HJD4JbIwnc" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="3HJD4JbIwnd" role="jymVt">
      <property role="TrG5h" value="myControlFlowGraph" />
      <node concept="3uibUv" id="3HJD4JbIwne" role="1tU5fm">
        <ref role="3uigEE" node="3HJD4JbIvSG" resolve="ControlFlowGraph" />
        <node concept="3uibUv" id="3HJD4JbIwnf" role="11_B2D">
          <ref role="3uigEE" node="3HJD4JbIvBj" resolve="InstructionWrapper" />
        </node>
      </node>
      <node concept="3Tm6S6" id="3HJD4JbIwng" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="4F1sLpFpIjM" role="jymVt">
      <property role="34CwA1" value="false" />
      <property role="eg7rD" value="false" />
      <property role="TrG5h" value="myProject" />
      <property role="3TUv4t" value="true" />
      <node concept="3Tm6S6" id="4F1sLpFpHM2" role="1B3o_S" />
      <node concept="3uibUv" id="4F1sLpFpIaj" role="1tU5fm">
        <ref role="3uigEE" to="z1c3:~MPSProject" resolve="MPSProject" />
      </node>
    </node>
    <node concept="3clFbW" id="3HJD4JbIwnh" role="jymVt">
      <node concept="3Tm1VV" id="3HJD4JbIwni" role="1B3o_S" />
      <node concept="37vLTG" id="3HJD4JbIwnj" role="3clF46">
        <property role="TrG5h" value="graph" />
        <node concept="2AHcQZ" id="4sNt2MbL8qm" role="2AJF6D">
          <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
        </node>
        <node concept="3uibUv" id="1ekf28us_XJ" role="1tU5fm">
          <ref role="3uigEE" node="3HJD4JbIvSG" resolve="ControlFlowGraph" />
          <node concept="3uibUv" id="21Iif$asAUx" role="11_B2D">
            <ref role="3uigEE" node="3HJD4JbIvBj" resolve="InstructionWrapper" />
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="3HJD4JbIwnn" role="3clF46">
        <property role="TrG5h" value="project" />
        <node concept="2AHcQZ" id="4sNt2MbL17T" role="2AJF6D">
          <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
        </node>
        <node concept="3uibUv" id="4F1sLpFpELB" role="1tU5fm">
          <ref role="3uigEE" to="z1c3:~MPSProject" resolve="MPSProject" />
        </node>
      </node>
      <node concept="37vLTG" id="4sNt2MbKSD9" role="3clF46">
        <property role="TrG5h" value="title" />
        <node concept="3uibUv" id="4sNt2MbKWBK" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
        <node concept="2AHcQZ" id="4sNt2MbKZS_" role="2AJF6D">
          <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIwnp" role="3clF47">
        <node concept="XkiVB" id="3HJD4JbIwnq" role="3cqZAp">
          <ref role="37wK5l" to="jkm4:~DialogWrapper.&lt;init&gt;(com.intellij.openapi.project.Project)" resolve="DialogWrapper" />
          <node concept="2OqwBi" id="4F1sLpFpEYW" role="37wK5m">
            <node concept="37vLTw" id="2BHiRxglBwr" role="2Oq$k0">
              <ref role="3cqZAo" node="3HJD4JbIwnn" resolve="project" />
            </node>
            <node concept="liA8E" id="4F1sLpFpFdG" role="2OqNvi">
              <ref role="37wK5l" to="z1c3:~MPSProject.getProject():com.intellij.openapi.project.Project" resolve="getProject" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="4F1sLpFpJ57" role="3cqZAp">
          <node concept="37vLTI" id="4F1sLpFpJlm" role="3clFbG">
            <node concept="37vLTw" id="4F1sLpFpJte" role="37vLTx">
              <ref role="3cqZAo" node="3HJD4JbIwnn" resolve="project" />
            </node>
            <node concept="37vLTw" id="4F1sLpFpJ55" role="37vLTJ">
              <ref role="3cqZAo" node="4F1sLpFpIjM" resolve="myProject" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIwnF" role="3cqZAp">
          <node concept="37vLTI" id="3HJD4JbIwnG" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIwnH" role="37vLTJ">
              <node concept="2OwXpG" id="3HJD4JbIwnI" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIwna" resolve="myComponent" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIwnJ" role="2Oq$k0" />
            </node>
            <node concept="2ShNRf" id="3HJD4JbIwnK" role="37vLTx">
              <node concept="1pGfFk" id="3HJD4JbIwnL" role="2ShVmc">
                <ref role="37wK5l" node="3HJD4JbIwmv" resolve="ShowCFGDialog.MyComponent" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIwnM" role="3cqZAp">
          <node concept="37vLTI" id="3HJD4JbIwnN" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIwnO" role="37vLTJ">
              <node concept="2OwXpG" id="3HJD4JbIwnP" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIwn7" resolve="myScrollPane" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIwnQ" role="2Oq$k0" />
            </node>
            <node concept="2YIFZM" id="23qY$NaTJ0r" role="37vLTx">
              <ref role="1Pybhc" to="lzb2:~ScrollPaneFactory" resolve="ScrollPaneFactory" />
              <ref role="37wK5l" to="lzb2:~ScrollPaneFactory.createScrollPane(java.awt.Component):javax.swing.JScrollPane" resolve="createScrollPane" />
              <node concept="37vLTw" id="2BHiRxeuoRl" role="37wK5m">
                <ref role="3cqZAo" node="3HJD4JbIwna" resolve="myComponent" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIwnW" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIwnX" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIwnY" role="2Oq$k0">
              <node concept="2OwXpG" id="3HJD4JbIwnZ" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIwn7" resolve="myScrollPane" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIwo0" role="2Oq$k0" />
            </node>
            <node concept="liA8E" id="3HJD4JbIwo1" role="2OqNvi">
              <ref role="37wK5l" to="dxuu:~JComponent.setBackground(java.awt.Color):void" resolve="setBackground" />
              <node concept="2OqwBi" id="3HJD4JbIwo2" role="37wK5m">
                <node concept="Xjq3P" id="3HJD4JbIwo3" role="2Oq$k0" />
                <node concept="liA8E" id="3HJD4JbIwo4" role="2OqNvi">
                  <ref role="37wK5l" node="3HJD4JbIwpb" resolve="getBackground" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIwod" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIwoe" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIwof" role="2Oq$k0">
              <node concept="2OwXpG" id="3HJD4JbIwog" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIwna" resolve="myComponent" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIwoh" role="2Oq$k0" />
            </node>
            <node concept="liA8E" id="3HJD4JbIwoi" role="2OqNvi">
              <ref role="37wK5l" to="dxuu:~JComponent.setFont(java.awt.Font):void" resolve="setFont" />
              <node concept="2OqwBi" id="3HJD4JbIwoj" role="37wK5m">
                <node concept="2OqwBi" id="3HJD4JbIwok" role="2Oq$k0">
                  <node concept="2OqwBi" id="3HJD4JbIwol" role="2Oq$k0">
                    <node concept="2OwXpG" id="3HJD4JbIwom" role="2OqNvi">
                      <ref role="2Oxat5" node="3HJD4JbIwna" resolve="myComponent" />
                    </node>
                    <node concept="Xjq3P" id="3HJD4JbIwon" role="2Oq$k0" />
                  </node>
                  <node concept="liA8E" id="3HJD4JbIwoo" role="2OqNvi">
                    <ref role="37wK5l" to="z60i:~Component.getFont():java.awt.Font" resolve="getFont" />
                  </node>
                </node>
                <node concept="liA8E" id="3HJD4JbIwop" role="2OqNvi">
                  <ref role="37wK5l" to="z60i:~Font.deriveFont(float):java.awt.Font" resolve="deriveFont" />
                  <node concept="2$xPTn" id="3HJD4JbIwoq" role="37wK5m">
                    <property role="2$xPTl" value="10.0f" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1ekf28usAqc" role="3cqZAp">
          <node concept="37vLTI" id="1ekf28usAqM" role="3clFbG">
            <node concept="37vLTw" id="4L6s$LYdwVy" role="37vLTx">
              <ref role="3cqZAo" node="3HJD4JbIwnj" resolve="graph" />
            </node>
            <node concept="2OqwBi" id="1ekf28usAqm" role="37vLTJ">
              <node concept="Xjq3P" id="1ekf28usAqd" role="2Oq$k0" />
              <node concept="2OwXpG" id="1ekf28usAqs" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIwnd" resolve="myControlFlowGraph" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1ekf28usAqR" role="3cqZAp">
          <node concept="2OqwBi" id="1ekf28usAr1" role="3clFbG">
            <node concept="37vLTw" id="2BHiRxgm5YD" role="2Oq$k0">
              <ref role="3cqZAo" node="3HJD4JbIwnj" resolve="graph" />
            </node>
            <node concept="liA8E" id="1ekf28usAr6" role="2OqNvi">
              <ref role="37wK5l" node="1ekf28us_WC" resolve="setComponent" />
              <node concept="37vLTw" id="2BHiRxeuuXA" role="37wK5m">
                <ref role="3cqZAo" node="3HJD4JbIwna" resolve="myComponent" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1ekf28usAr9" role="3cqZAp">
          <node concept="2OqwBi" id="1ekf28usArj" role="3clFbG">
            <node concept="37vLTw" id="2BHiRxgl0LI" role="2Oq$k0">
              <ref role="3cqZAo" node="3HJD4JbIwnj" resolve="graph" />
            </node>
            <node concept="liA8E" id="1ekf28usArp" role="2OqNvi">
              <ref role="37wK5l" node="3HJD4JbIvVL" resolve="relayout" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIwoF" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIwoG" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIwoH" role="2Oq$k0">
              <node concept="2OwXpG" id="3HJD4JbIwoI" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIwnd" resolve="myControlFlowGraph" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIwoJ" role="2Oq$k0" />
            </node>
            <node concept="liA8E" id="3HJD4JbIwoK" role="2OqNvi">
              <ref role="37wK5l" node="3HJD4JbIw6F" resolve="addBlockListener" />
              <node concept="2ShNRf" id="3HJD4JbIwoL" role="37wK5m">
                <node concept="YeOm9" id="3HJD4JbIwoM" role="2ShVmc">
                  <node concept="1Y3b0j" id="3HJD4JbIwoN" role="YeSDq">
                    <property role="TrG5h" value="" />
                    <ref role="1Y3XeK" node="3HJD4JbIvBi" resolve="IBlockListener" />
                    <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
                    <node concept="3clFb_" id="3HJD4JbIwoP" role="jymVt">
                      <property role="TrG5h" value="mousePressed" />
                      <node concept="3Tm1VV" id="3HJD4JbIwoQ" role="1B3o_S" />
                      <node concept="3cqZAl" id="3HJD4JbIwoR" role="3clF45" />
                      <node concept="37vLTG" id="3HJD4JbIwoS" role="3clF46">
                        <property role="TrG5h" value="event" />
                        <node concept="3uibUv" id="3HJD4JbIwoT" role="1tU5fm">
                          <ref role="3uigEE" to="hyam:~MouseEvent" resolve="MouseEvent" />
                        </node>
                      </node>
                      <node concept="37vLTG" id="6bzHk29oeyL" role="3clF46">
                        <property role="TrG5h" value="block" />
                        <node concept="3uibUv" id="21Iif$asqxe" role="1tU5fm">
                          <ref role="3uigEE" node="3HJD4JbIw8e" resolve="IBlock" />
                        </node>
                      </node>
                      <node concept="3clFbS" id="3HJD4JbIwqB" role="3clF47">
                        <node concept="3cpWs8" id="6bzHk29og6k" role="3cqZAp">
                          <node concept="3cpWsn" id="6bzHk29og6l" role="3cpWs9">
                            <property role="TrG5h" value="sourceRef" />
                            <property role="3TUv4t" value="true" />
                            <node concept="3uibUv" id="1xhh46Ul72T" role="1tU5fm">
                              <ref role="3uigEE" to="mhbf:~SNodeReference" resolve="SNodeReference" />
                            </node>
                            <node concept="2OqwBi" id="2q2JH_NuQkh" role="33vP2m">
                              <node concept="37vLTw" id="2BHiRxgmj1c" role="2Oq$k0">
                                <ref role="3cqZAo" node="6bzHk29oeyL" resolve="block" />
                              </node>
                              <node concept="liA8E" id="2q2JH_NuQkj" role="2OqNvi">
                                <ref role="37wK5l" node="3HJD4JbIw8v" resolve="getSourceNode" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node concept="3clFbJ" id="77$jdFuaaPJ" role="3cqZAp">
                          <node concept="2YIFZM" id="77$jdFuae5T" role="3clFbw">
                            <ref role="37wK5l" to="dxuu:~SwingUtilities.isRightMouseButton(java.awt.event.MouseEvent):boolean" resolve="isRightMouseButton" />
                            <ref role="1Pybhc" to="dxuu:~SwingUtilities" resolve="SwingUtilities" />
                            <node concept="37vLTw" id="77$jdFuaeNz" role="37wK5m">
                              <ref role="3cqZAo" node="3HJD4JbIwoS" resolve="event" />
                            </node>
                          </node>
                          <node concept="3clFbS" id="77$jdFuaaPM" role="3clFbx">
                            <node concept="3clFbH" id="77$jdFudu$Z" role="3cqZAp" />
                            <node concept="3cpWs8" id="77$jdFuagg4" role="3cqZAp">
                              <node concept="3cpWsn" id="77$jdFuagg5" role="3cpWs9">
                                <property role="TrG5h" value="menu" />
                                <node concept="2ShNRf" id="77$jdFuaiom" role="33vP2m">
                                  <node concept="1pGfFk" id="77$jdFua$AL" role="2ShVmc">
                                    <ref role="37wK5l" to="dxuu:~JPopupMenu.&lt;init&gt;()" resolve="JPopupMenu" />
                                  </node>
                                </node>
                                <node concept="3uibUv" id="77$jdFuagg6" role="1tU5fm">
                                  <ref role="3uigEE" to="dxuu:~JPopupMenu" resolve="JPopupMenu" />
                                </node>
                              </node>
                            </node>
                            <node concept="3cpWs8" id="77$jdFuaAKM" role="3cqZAp">
                              <node concept="3cpWsn" id="77$jdFuaAKN" role="3cpWs9">
                                <property role="TrG5h" value="ruleItem" />
                                <node concept="2ShNRf" id="77$jdFuaCXB" role="33vP2m">
                                  <node concept="1pGfFk" id="77$jdFuaCXA" role="2ShVmc">
                                    <ref role="37wK5l" to="dxuu:~JMenuItem.&lt;init&gt;(java.lang.String)" resolve="JMenuItem" />
                                    <node concept="Xl_RD" id="77$jdFuaEqR" role="37wK5m">
                                      <property role="Xl_RC" value="Go To Data Flow Rule" />
                                    </node>
                                  </node>
                                </node>
                                <node concept="3uibUv" id="77$jdFuaAKO" role="1tU5fm">
                                  <ref role="3uigEE" to="dxuu:~JMenuItem" resolve="JMenuItem" />
                                </node>
                              </node>
                            </node>
                            <node concept="3cpWs8" id="1xhh46UiTpU" role="3cqZAp">
                              <node concept="3cpWsn" id="1xhh46UiTpV" role="3cpWs9">
                                <property role="TrG5h" value="nodeItem" />
                                <node concept="2ShNRf" id="1xhh46UiTpW" role="33vP2m">
                                  <node concept="1pGfFk" id="1xhh46UiTpX" role="2ShVmc">
                                    <ref role="37wK5l" to="dxuu:~JMenuItem.&lt;init&gt;(java.lang.String)" resolve="JMenuItem" />
                                    <node concept="Xl_RD" id="1xhh46UiTpY" role="37wK5m">
                                      <property role="Xl_RC" value="Go To Node" />
                                    </node>
                                  </node>
                                </node>
                                <node concept="3uibUv" id="1xhh46UiTpZ" role="1tU5fm">
                                  <ref role="3uigEE" to="dxuu:~JMenuItem" resolve="JMenuItem" />
                                </node>
                              </node>
                            </node>
                            <node concept="3clFbF" id="77$jdFubxyD" role="3cqZAp">
                              <node concept="2OqwBi" id="77$jdFubxVu" role="3clFbG">
                                <node concept="liA8E" id="77$jdFubzCu" role="2OqNvi">
                                  <ref role="37wK5l" to="dxuu:~JPopupMenu.add(javax.swing.JMenuItem):javax.swing.JMenuItem" resolve="add" />
                                  <node concept="37vLTw" id="77$jdFub$o9" role="37wK5m">
                                    <ref role="3cqZAo" node="77$jdFuaAKN" resolve="ruleItem" />
                                  </node>
                                </node>
                                <node concept="37vLTw" id="77$jdFubxyC" role="2Oq$k0">
                                  <ref role="3cqZAo" node="77$jdFuagg5" resolve="menu" />
                                </node>
                              </node>
                            </node>
                            <node concept="3clFbF" id="1xhh46UiXhc" role="3cqZAp">
                              <node concept="2OqwBi" id="1xhh46UiXhd" role="3clFbG">
                                <node concept="liA8E" id="1xhh46UiXhe" role="2OqNvi">
                                  <ref role="37wK5l" to="dxuu:~JPopupMenu.add(javax.swing.JMenuItem):javax.swing.JMenuItem" resolve="add" />
                                  <node concept="37vLTw" id="1xhh46Uj0JV" role="37wK5m">
                                    <ref role="3cqZAo" node="1xhh46UiTpV" resolve="nodeItem" />
                                  </node>
                                </node>
                                <node concept="37vLTw" id="1xhh46UiXhg" role="2Oq$k0">
                                  <ref role="3cqZAo" node="77$jdFuagg5" resolve="menu" />
                                </node>
                              </node>
                            </node>
                            <node concept="3cpWs8" id="GzG95Qz0mq" role="3cqZAp">
                              <node concept="3cpWsn" id="GzG95Qz0mr" role="3cpWs9">
                                <property role="TrG5h" value="ruleNodeReference" />
                                <property role="3TUv4t" value="true" />
                                <node concept="3uibUv" id="GzG95Qz0mp" role="1tU5fm">
                                  <ref role="3uigEE" to="mhbf:~SNodeReference" resolve="SNodeReference" />
                                </node>
                                <node concept="2OqwBi" id="GzG95Qz0ms" role="33vP2m">
                                  <node concept="37vLTw" id="GzG95Qz0mt" role="2Oq$k0">
                                    <ref role="3cqZAo" node="6bzHk29oeyL" resolve="block" />
                                  </node>
                                  <node concept="liA8E" id="GzG95Qz0mu" role="2OqNvi">
                                    <ref role="37wK5l" node="2fWCKaofx2s" resolve="getRuleNodeReference" />
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node concept="3clFbF" id="GzG95QyvAc" role="3cqZAp">
                              <node concept="2OqwBi" id="GzG95Qywff" role="3clFbG">
                                <node concept="liA8E" id="GzG95Qy$FH" role="2OqNvi">
                                  <ref role="37wK5l" to="dxuu:~JMenuItem.setEnabled(boolean):void" resolve="setEnabled" />
                                  <node concept="3y3z36" id="GzG95QyGx$" role="37wK5m">
                                    <node concept="10Nm6u" id="GzG95QyGxW" role="3uHU7w" />
                                    <node concept="37vLTw" id="GzG95Qz0mv" role="3uHU7B">
                                      <ref role="3cqZAo" node="GzG95Qz0mr" resolve="ruleNodeReference" />
                                    </node>
                                  </node>
                                </node>
                                <node concept="37vLTw" id="2qNj7IVHQ6w" role="2Oq$k0">
                                  <ref role="3cqZAo" node="77$jdFuaAKN" resolve="ruleItem" />
                                </node>
                              </node>
                            </node>
                            <node concept="3clFbF" id="2qNj7IVHSC2" role="3cqZAp">
                              <node concept="2OqwBi" id="2qNj7IVHSC3" role="3clFbG">
                                <node concept="liA8E" id="2qNj7IVHSC4" role="2OqNvi">
                                  <ref role="37wK5l" to="dxuu:~JMenuItem.setEnabled(boolean):void" resolve="setEnabled" />
                                  <node concept="3y3z36" id="2qNj7IVHSC5" role="37wK5m">
                                    <node concept="10Nm6u" id="2qNj7IVHSC6" role="3uHU7w" />
                                    <node concept="37vLTw" id="2qNj7IVHXrG" role="3uHU7B">
                                      <ref role="3cqZAo" node="6bzHk29og6l" resolve="sourceRef" />
                                    </node>
                                  </node>
                                </node>
                                <node concept="37vLTw" id="2qNj7IVHW8t" role="2Oq$k0">
                                  <ref role="3cqZAo" node="1xhh46UiTpV" resolve="nodeItem" />
                                </node>
                              </node>
                            </node>
                            <node concept="3clFbF" id="77$jdFuaK3M" role="3cqZAp">
                              <node concept="2OqwBi" id="77$jdFuaLir" role="3clFbG">
                                <node concept="liA8E" id="77$jdFuc5it" role="2OqNvi">
                                  <ref role="37wK5l" to="dxuu:~JPopupMenu.show(java.awt.Component,int,int):void" resolve="show" />
                                  <node concept="2OqwBi" id="77$jdFucbpp" role="37wK5m">
                                    <node concept="liA8E" id="77$jdFucgEw" role="2OqNvi">
                                      <ref role="37wK5l" to="hyam:~ComponentEvent.getComponent():java.awt.Component" resolve="getComponent" />
                                    </node>
                                    <node concept="37vLTw" id="77$jdFuc8S1" role="2Oq$k0">
                                      <ref role="3cqZAo" node="3HJD4JbIwoS" resolve="event" />
                                    </node>
                                  </node>
                                  <node concept="2OqwBi" id="1xhh46UiAqd" role="37wK5m">
                                    <node concept="37vLTw" id="1xhh46Ui_B_" role="2Oq$k0">
                                      <ref role="3cqZAo" node="3HJD4JbIwoS" resolve="event" />
                                    </node>
                                    <node concept="liA8E" id="1xhh46UiEJh" role="2OqNvi">
                                      <ref role="37wK5l" to="hyam:~MouseEvent.getX():int" resolve="getX" />
                                    </node>
                                  </node>
                                  <node concept="2OqwBi" id="1xhh46UiMfX" role="37wK5m">
                                    <node concept="37vLTw" id="1xhh46UiJEX" role="2Oq$k0">
                                      <ref role="3cqZAo" node="3HJD4JbIwoS" resolve="event" />
                                    </node>
                                    <node concept="liA8E" id="1xhh46UiQJw" role="2OqNvi">
                                      <ref role="37wK5l" to="hyam:~MouseEvent.getY():int" resolve="getY" />
                                    </node>
                                  </node>
                                </node>
                                <node concept="37vLTw" id="77$jdFuaK3L" role="2Oq$k0">
                                  <ref role="3cqZAo" node="77$jdFuagg5" resolve="menu" />
                                </node>
                              </node>
                            </node>
                            <node concept="3clFbF" id="2z4yfY2jrWJ" role="3cqZAp">
                              <node concept="2OqwBi" id="2z4yfY2jsAW" role="3clFbG">
                                <node concept="liA8E" id="2z4yfY2j$5e" role="2OqNvi">
                                  <ref role="37wK5l" to="dxuu:~AbstractButton.addActionListener(java.awt.event.ActionListener):void" resolve="addActionListener" />
                                  <node concept="2ShNRf" id="2z4yfY2jC7d" role="37wK5m">
                                    <node concept="YeOm9" id="2z4yfY2k20B" role="2ShVmc">
                                      <node concept="1Y3b0j" id="2z4yfY2k20E" role="YeSDq">
                                        <property role="2bfB8j" value="true" />
                                        <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
                                        <ref role="1Y3XeK" to="hyam:~ActionListener" resolve="ActionListener" />
                                        <node concept="3Tm1VV" id="2z4yfY2k20F" role="1B3o_S" />
                                        <node concept="3clFb_" id="2z4yfY2k20G" role="jymVt">
                                          <property role="1EzhhJ" value="false" />
                                          <property role="TrG5h" value="actionPerformed" />
                                          <property role="DiZV1" value="false" />
                                          <property role="IEkAT" value="false" />
                                          <node concept="3Tm1VV" id="2z4yfY2k20H" role="1B3o_S" />
                                          <node concept="3cqZAl" id="2z4yfY2k20J" role="3clF45" />
                                          <node concept="37vLTG" id="2z4yfY2k20K" role="3clF46">
                                            <property role="TrG5h" value="p0" />
                                            <node concept="3uibUv" id="2z4yfY2k20L" role="1tU5fm">
                                              <ref role="3uigEE" to="hyam:~ActionEvent" resolve="ActionEvent" />
                                            </node>
                                          </node>
                                          <node concept="3clFbS" id="2z4yfY2k20M" role="3clF47">
                                            <node concept="3clFbF" id="1xhh46UkONI" role="3cqZAp">
                                              <node concept="1rXfSq" id="1xhh46UkONH" role="3clFbG">
                                                <ref role="37wK5l" node="1xhh46UjIT4" resolve="openNode" />
                                                <node concept="37vLTw" id="GzG95QzbaH" role="37wK5m">
                                                  <ref role="3cqZAo" node="GzG95Qz0mr" resolve="ruleNodeReference" />
                                                </node>
                                              </node>
                                            </node>
                                          </node>
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                </node>
                                <node concept="37vLTw" id="2z4yfY2jrWI" role="2Oq$k0">
                                  <ref role="3cqZAo" node="77$jdFuaAKN" resolve="ruleItem" />
                                </node>
                              </node>
                            </node>
                            <node concept="3clFbF" id="1xhh46Uj5uk" role="3cqZAp">
                              <node concept="2OqwBi" id="1xhh46Uj5ul" role="3clFbG">
                                <node concept="liA8E" id="1xhh46Uj5um" role="2OqNvi">
                                  <ref role="37wK5l" to="dxuu:~AbstractButton.addActionListener(java.awt.event.ActionListener):void" resolve="addActionListener" />
                                  <node concept="2ShNRf" id="1xhh46Uj5un" role="37wK5m">
                                    <node concept="YeOm9" id="1xhh46Uj5uo" role="2ShVmc">
                                      <node concept="1Y3b0j" id="1xhh46Uj5up" role="YeSDq">
                                        <property role="2bfB8j" value="true" />
                                        <ref role="1Y3XeK" to="hyam:~ActionListener" resolve="ActionListener" />
                                        <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
                                        <node concept="3Tm1VV" id="1xhh46Uj5uq" role="1B3o_S" />
                                        <node concept="3clFb_" id="1xhh46Uj5ur" role="jymVt">
                                          <property role="1EzhhJ" value="false" />
                                          <property role="TrG5h" value="actionPerformed" />
                                          <property role="DiZV1" value="false" />
                                          <property role="IEkAT" value="false" />
                                          <node concept="3Tm1VV" id="1xhh46Uj5us" role="1B3o_S" />
                                          <node concept="3cqZAl" id="1xhh46Uj5ut" role="3clF45" />
                                          <node concept="37vLTG" id="1xhh46Uj5uu" role="3clF46">
                                            <property role="TrG5h" value="p0" />
                                            <node concept="3uibUv" id="1xhh46Uj5uv" role="1tU5fm">
                                              <ref role="3uigEE" to="hyam:~ActionEvent" resolve="ActionEvent" />
                                            </node>
                                          </node>
                                          <node concept="3clFbS" id="1xhh46Uj5uw" role="3clF47">
                                            <node concept="3clFbF" id="1xhh46Ukzgu" role="3cqZAp">
                                              <node concept="1rXfSq" id="1xhh46Ukzgv" role="3clFbG">
                                                <ref role="37wK5l" node="1xhh46UjIT4" resolve="openNode" />
                                                <node concept="37vLTw" id="1xhh46Uk$IZ" role="37wK5m">
                                                  <ref role="3cqZAo" node="6bzHk29og6l" resolve="sourceRef" />
                                                </node>
                                              </node>
                                            </node>
                                          </node>
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                </node>
                                <node concept="37vLTw" id="1xhh46Uj9ma" role="2Oq$k0">
                                  <ref role="3cqZAo" node="1xhh46UiTpV" resolve="nodeItem" />
                                </node>
                              </node>
                            </node>
                          </node>
                          <node concept="9aQIb" id="77$jdFubQ0g" role="9aQIa">
                            <node concept="3clFbS" id="77$jdFubQ0h" role="9aQI4">
                              <node concept="3clFbF" id="1xhh46UjITe" role="3cqZAp">
                                <node concept="1rXfSq" id="1xhh46UjITd" role="3clFbG">
                                  <ref role="37wK5l" node="1xhh46UjIT4" resolve="openNode" />
                                  <node concept="37vLTw" id="1xhh46Uk9KT" role="37wK5m">
                                    <ref role="3cqZAo" node="6bzHk29og6l" resolve="sourceRef" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="2AHcQZ" id="3tYsUK_UvYx" role="2AJF6D">
                        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="4L6s$LYdSUL" role="3cqZAp">
          <node concept="1rXfSq" id="4L6s$LYdSUK" role="3clFbG">
            <ref role="37wK5l" to="jkm4:~DialogWrapper.setModal(boolean):void" resolve="setModal" />
            <node concept="3clFbT" id="4L6s$LYdUg7" role="37wK5m">
              <property role="3clFbU" value="false" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="4sNt2MbLPIC" role="3cqZAp">
          <node concept="1rXfSq" id="4sNt2MbLPIB" role="3clFbG">
            <ref role="37wK5l" to="jkm4:~DialogWrapper.setTitle(java.lang.String):void" resolve="setTitle" />
            <node concept="37vLTw" id="4sNt2MbLQy8" role="37wK5m">
              <ref role="3cqZAo" node="4sNt2MbKSD9" resolve="title" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="34LK9F8xrlO" role="3cqZAp">
          <node concept="1rXfSq" id="4hiugqyzcB3" role="3clFbG">
            <ref role="37wK5l" to="jkm4:~DialogWrapper.init():void" resolve="init" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="1xhh46UjIT4" role="jymVt">
      <property role="TrG5h" value="openNode" />
      <node concept="3Tm6S6" id="1xhh46UjIT5" role="1B3o_S" />
      <node concept="3cqZAl" id="1xhh46UjIT6" role="3clF45" />
      <node concept="37vLTG" id="1xhh46UjQDu" role="3clF46">
        <property role="TrG5h" value="nodeReference" />
        <node concept="3uibUv" id="1xhh46UkQYe" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNodeReference" resolve="SNodeReference" />
        </node>
      </node>
      <node concept="3clFbS" id="1xhh46UjISF" role="3clF47">
        <node concept="3clFbF" id="4yI1maGGstx" role="3cqZAp">
          <node concept="2OqwBi" id="4yI1maGGtnf" role="3clFbG">
            <node concept="2OqwBi" id="4yI1maGGtgI" role="2Oq$k0">
              <node concept="2OqwBi" id="4yI1maGGtba" role="2Oq$k0">
                <node concept="2ShNRf" id="4yI1maGGstt" role="2Oq$k0">
                  <node concept="1pGfFk" id="4yI1maGGt9A" role="2ShVmc">
                    <ref role="37wK5l" to="kz9k:~EditorNavigator.&lt;init&gt;(jetbrains.mps.project.Project)" resolve="EditorNavigator" />
                    <node concept="37vLTw" id="4yI1maGGt9S" role="37wK5m">
                      <ref role="3cqZAo" node="4F1sLpFpIjM" resolve="myProject" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="4yI1maGGtfb" role="2OqNvi">
                  <ref role="37wK5l" to="kz9k:~EditorNavigator.shallFocus(boolean):jetbrains.mps.openapi.navigation.EditorNavigator" resolve="shallFocus" />
                  <node concept="3clFbT" id="4yI1maGGtfR" role="37wK5m">
                    <property role="3clFbU" value="true" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="4yI1maGGtla" role="2OqNvi">
                <ref role="37wK5l" to="kz9k:~EditorNavigator.shallSelect(boolean):jetbrains.mps.openapi.navigation.EditorNavigator" resolve="shallSelect" />
                <node concept="3clFbT" id="4yI1maGGtm7" role="37wK5m">
                  <property role="3clFbU" value="true" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="4yI1maGGtrY" role="2OqNvi">
              <ref role="37wK5l" to="kz9k:~EditorNavigator.open(org.jetbrains.mps.openapi.model.SNodeReference):void" resolve="open" />
              <node concept="37vLTw" id="4yI1maGGttd" role="37wK5m">
                <ref role="3cqZAo" node="1xhh46UjQDu" resolve="nodeReference" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="4L6s$LYdg2O" role="jymVt" />
    <node concept="3clFb_" id="3HJD4JbIwpb" role="jymVt">
      <property role="TrG5h" value="getBackground" />
      <node concept="3Tm1VV" id="3HJD4JbIwpc" role="1B3o_S" />
      <node concept="3uibUv" id="3HJD4JbIwpd" role="3clF45">
        <ref role="3uigEE" to="z60i:~Color" resolve="Color" />
      </node>
      <node concept="3clFbS" id="3HJD4JbIwpe" role="3clF47">
        <node concept="3cpWs6" id="3HJD4JbIwpf" role="3cqZAp">
          <node concept="10M0yZ" id="3HJD4JbIwpg" role="3cqZAk">
            <ref role="1PxDUh" to="z60i:~Color" resolve="Color" />
            <ref role="3cqZAo" to="z60i:~Color.LIGHT_GRAY" resolve="LIGHT_GRAY" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="34LK9F8xr$c" role="jymVt">
      <property role="IEkAT" value="false" />
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="createCenterPanel" />
      <property role="DiZV1" value="false" />
      <node concept="3Tmbuc" id="34LK9F8xr$d" role="1B3o_S" />
      <node concept="3uibUv" id="34LK9F8xr$e" role="3clF45">
        <ref role="3uigEE" to="dxuu:~JComponent" resolve="JComponent" />
      </node>
      <node concept="2AHcQZ" id="34LK9F8xr$f" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
      </node>
      <node concept="3clFbS" id="34LK9F8xr$g" role="3clF47">
        <node concept="3cpWs6" id="34LK9F8xrAD" role="3cqZAp">
          <node concept="37vLTw" id="2BHiRxeu$Kg" role="3cqZAk">
            <ref role="3cqZAo" node="3HJD4JbIwn7" resolve="myScrollPane" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3tYsUK_Sg8I" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="3clFb_" id="cmHlGZb4uP" role="jymVt">
      <property role="TrG5h" value="createActions" />
      <node concept="10Q1$e" id="cmHlGZbbwc" role="3clF45">
        <node concept="3uibUv" id="cmHlGZbbwb" role="10Q1$1">
          <ref role="3uigEE" to="dxuu:~Action" resolve="Action" />
        </node>
      </node>
      <node concept="3Tmbuc" id="cmHlGZbbhe" role="1B3o_S" />
      <node concept="3clFbS" id="cmHlGZb4uS" role="3clF47">
        <node concept="3cpWs6" id="cmHlGZbbwf" role="3cqZAp">
          <node concept="2ShNRf" id="cmHlGZbbwh" role="3cqZAk">
            <node concept="3$_iS1" id="cmHlGZbts9" role="2ShVmc">
              <node concept="3$GHV9" id="cmHlGZbtsa" role="3$GQph">
                <node concept="3cmrfG" id="cmHlGZbtsd" role="3$I4v7">
                  <property role="3cmrfH" value="0" />
                </node>
              </node>
              <node concept="3uibUv" id="cmHlGZbtsc" role="3$_nBY">
                <ref role="3uigEE" to="dxuu:~Action" resolve="Action" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3tYsUK_Sg8H" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
      <node concept="2AHcQZ" id="5bg5ifjF45b" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
      </node>
    </node>
    <node concept="312cEu" id="3HJD4JbIwmr" role="jymVt">
      <property role="TrG5h" value="MyComponent" />
      <property role="2bfB8j" value="true" />
      <node concept="3Tm6S6" id="3HJD4JbIwms" role="1B3o_S" />
      <node concept="3uibUv" id="3HJD4JbIwmt" role="1zkMxy">
        <ref role="3uigEE" to="dxuu:~JComponent" resolve="JComponent" />
      </node>
      <node concept="3uibUv" id="3HJD4JbIwmu" role="EKbjA">
        <ref role="3uigEE" to="dxuu:~Scrollable" resolve="Scrollable" />
      </node>
      <node concept="3clFbW" id="3HJD4JbIwmv" role="jymVt">
        <node concept="3Tm1VV" id="3HJD4JbIwmw" role="1B3o_S" />
        <node concept="3clFbS" id="3HJD4JbIwph" role="3clF47">
          <node concept="3clFbF" id="3HJD4JbIwns" role="3cqZAp">
            <node concept="2OqwBi" id="3HJD4JbIwnt" role="3clFbG">
              <node concept="Xjq3P" id="3HJD4JbIwnu" role="2Oq$k0" />
              <node concept="liA8E" id="3HJD4JbIwnv" role="2OqNvi">
                <ref role="37wK5l" to="z60i:~Container.setLayout(java.awt.LayoutManager):void" resolve="setLayout" />
                <node concept="2ShNRf" id="3HJD4JbIwnw" role="37wK5m">
                  <node concept="1pGfFk" id="3HJD4JbIwnx" role="2ShVmc">
                    <ref role="37wK5l" to="z60i:~BorderLayout.&lt;init&gt;()" resolve="BorderLayout" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbF" id="3HJD4JbIwpi" role="3cqZAp">
            <node concept="2OqwBi" id="3HJD4JbIwpj" role="3clFbG">
              <node concept="Xjq3P" id="3HJD4JbIwpk" role="2Oq$k0" />
              <node concept="liA8E" id="3HJD4JbIwpl" role="2OqNvi">
                <ref role="37wK5l" to="z60i:~Component.addMouseListener(java.awt.event.MouseListener):void" resolve="addMouseListener" />
                <node concept="2ShNRf" id="3HJD4JbIwpm" role="37wK5m">
                  <node concept="YeOm9" id="3HJD4JbIwpn" role="2ShVmc">
                    <node concept="1Y3b0j" id="3HJD4JbIwpo" role="YeSDq">
                      <property role="TrG5h" value="" />
                      <ref role="1Y3XeK" to="hyam:~MouseAdapter" resolve="MouseAdapter" />
                      <ref role="37wK5l" to="hyam:~MouseAdapter.&lt;init&gt;()" resolve="MouseAdapter" />
                      <node concept="3clFb_" id="3HJD4JbIwpp" role="jymVt">
                        <property role="TrG5h" value="mousePressed" />
                        <node concept="3Tm1VV" id="3HJD4JbIwpq" role="1B3o_S" />
                        <node concept="3cqZAl" id="3HJD4JbIwpr" role="3clF45" />
                        <node concept="37vLTG" id="3HJD4JbIwps" role="3clF46">
                          <property role="TrG5h" value="e" />
                          <node concept="3uibUv" id="3HJD4JbIwpt" role="1tU5fm">
                            <ref role="3uigEE" to="hyam:~MouseEvent" resolve="MouseEvent" />
                          </node>
                        </node>
                        <node concept="3clFbS" id="3HJD4JbIwqv" role="3clF47">
                          <node concept="3clFbF" id="3HJD4JbIwqw" role="3cqZAp">
                            <node concept="2OqwBi" id="3HJD4JbIwqx" role="3clFbG">
                              <node concept="2OqwBi" id="3HJD4JbIwqy" role="2Oq$k0">
                                <node concept="2OwXpG" id="3HJD4JbIwqz" role="2OqNvi">
                                  <ref role="2Oxat5" node="3HJD4JbIwnd" resolve="myControlFlowGraph" />
                                </node>
                                <node concept="Xjq3P" id="3HJD4JbIwq$" role="2Oq$k0">
                                  <ref role="1HBi2w" node="3HJD4JbIwmo" resolve="ShowCFGDialog" />
                                </node>
                              </node>
                              <node concept="liA8E" id="3HJD4JbIwq_" role="2OqNvi">
                                <ref role="37wK5l" node="3HJD4JbIw7j" resolve="processMousePressed" />
                                <node concept="37vLTw" id="2BHiRxgmGfd" role="37wK5m">
                                  <ref role="3cqZAo" node="3HJD4JbIwps" resolve="e" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node concept="2AHcQZ" id="3tYsUK_S5UY" role="2AJF6D">
                          <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
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
      <node concept="3clFb_" id="3HJD4JbIwmx" role="jymVt">
        <property role="TrG5h" value="getBackground" />
        <node concept="3Tm1VV" id="3HJD4JbIwmy" role="1B3o_S" />
        <node concept="3uibUv" id="3HJD4JbIwmz" role="3clF45">
          <ref role="3uigEE" to="z60i:~Color" resolve="Color" />
        </node>
        <node concept="3clFbS" id="3HJD4JbIwpu" role="3clF47">
          <node concept="3cpWs6" id="3HJD4JbIwpv" role="3cqZAp">
            <node concept="2OqwBi" id="3HJD4JbIwpw" role="3cqZAk">
              <node concept="Xjq3P" id="3HJD4JbIwpx" role="2Oq$k0">
                <ref role="1HBi2w" node="3HJD4JbIwmo" resolve="ShowCFGDialog" />
              </node>
              <node concept="liA8E" id="3HJD4JbIwpy" role="2OqNvi">
                <ref role="37wK5l" node="3HJD4JbIwpb" resolve="getBackground" />
              </node>
            </node>
          </node>
        </node>
        <node concept="2AHcQZ" id="3tYsUK_UtTH" role="2AJF6D">
          <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        </node>
      </node>
      <node concept="3clFb_" id="3HJD4JbIwm$" role="jymVt">
        <property role="TrG5h" value="paint" />
        <node concept="3Tm1VV" id="3HJD4JbIwm_" role="1B3o_S" />
        <node concept="3cqZAl" id="3HJD4JbIwmA" role="3clF45" />
        <node concept="37vLTG" id="3HJD4JbIwmB" role="3clF46">
          <property role="TrG5h" value="g" />
          <node concept="3uibUv" id="3HJD4JbIwmC" role="1tU5fm">
            <ref role="3uigEE" to="z60i:~Graphics" resolve="Graphics" />
          </node>
        </node>
        <node concept="3clFbS" id="3HJD4JbIwpz" role="3clF47">
          <node concept="3clFbF" id="3HJD4JbIwp$" role="3cqZAp">
            <node concept="2OqwBi" id="3HJD4JbIwp_" role="3clFbG">
              <node concept="37vLTw" id="2BHiRxgmaZW" role="2Oq$k0">
                <ref role="3cqZAo" node="3HJD4JbIwmB" resolve="g" />
              </node>
              <node concept="liA8E" id="3HJD4JbIwpB" role="2OqNvi">
                <ref role="37wK5l" to="z60i:~Graphics.setColor(java.awt.Color):void" resolve="setColor" />
                <node concept="2OqwBi" id="3HJD4JbIwpC" role="37wK5m">
                  <node concept="Xjq3P" id="3HJD4JbIwpD" role="2Oq$k0" />
                  <node concept="liA8E" id="3HJD4JbIwpE" role="2OqNvi">
                    <ref role="37wK5l" node="3HJD4JbIwmx" resolve="getBackground" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbF" id="3HJD4JbIwpF" role="3cqZAp">
            <node concept="2OqwBi" id="3HJD4JbIwpG" role="3clFbG">
              <node concept="37vLTw" id="2BHiRxgmOEa" role="2Oq$k0">
                <ref role="3cqZAo" node="3HJD4JbIwmB" resolve="g" />
              </node>
              <node concept="liA8E" id="3HJD4JbIwpI" role="2OqNvi">
                <ref role="37wK5l" to="z60i:~Graphics.fillRect(int,int,int,int):void" resolve="fillRect" />
                <node concept="3cmrfG" id="3HJD4JbIwpJ" role="37wK5m">
                  <property role="3cmrfH" value="0" />
                </node>
                <node concept="3cmrfG" id="3HJD4JbIwpK" role="37wK5m">
                  <property role="3cmrfH" value="0" />
                </node>
                <node concept="2OqwBi" id="3HJD4JbIwpL" role="37wK5m">
                  <node concept="Xjq3P" id="3HJD4JbIwpM" role="2Oq$k0" />
                  <node concept="liA8E" id="3HJD4JbIwpN" role="2OqNvi">
                    <ref role="37wK5l" to="dxuu:~JComponent.getWidth():int" resolve="getWidth" />
                  </node>
                </node>
                <node concept="2OqwBi" id="3HJD4JbIwpO" role="37wK5m">
                  <node concept="Xjq3P" id="3HJD4JbIwpP" role="2Oq$k0" />
                  <node concept="liA8E" id="3HJD4JbIwpQ" role="2OqNvi">
                    <ref role="37wK5l" to="dxuu:~JComponent.getHeight():int" resolve="getHeight" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbF" id="3HJD4JbIwpR" role="3cqZAp">
            <node concept="2OqwBi" id="3HJD4JbIwpS" role="3clFbG">
              <node concept="2OqwBi" id="3HJD4JbIwpT" role="2Oq$k0">
                <node concept="2OwXpG" id="3HJD4JbIwpU" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIwnd" resolve="myControlFlowGraph" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIwpV" role="2Oq$k0">
                  <ref role="1HBi2w" node="3HJD4JbIwmo" resolve="ShowCFGDialog" />
                </node>
              </node>
              <node concept="liA8E" id="3HJD4JbIwpW" role="2OqNvi">
                <ref role="37wK5l" node="3HJD4JbIvUR" resolve="paint" />
                <node concept="37vLTw" id="2BHiRxgmznA" role="37wK5m">
                  <ref role="3cqZAo" node="3HJD4JbIwmB" resolve="g" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="2AHcQZ" id="3tYsUK_UtTJ" role="2AJF6D">
          <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        </node>
      </node>
      <node concept="3clFb_" id="3HJD4JbIwmD" role="jymVt">
        <property role="TrG5h" value="getPreferredScrollableViewportSize" />
        <node concept="3Tm1VV" id="3HJD4JbIwmE" role="1B3o_S" />
        <node concept="3uibUv" id="3HJD4JbIwmF" role="3clF45">
          <ref role="3uigEE" to="z60i:~Dimension" resolve="Dimension" />
        </node>
        <node concept="3clFbS" id="3HJD4JbIwpY" role="3clF47">
          <node concept="3cpWs6" id="3HJD4JbIwpZ" role="3cqZAp">
            <node concept="2OqwBi" id="3HJD4JbIwq0" role="3cqZAk">
              <node concept="Xjq3P" id="3HJD4JbIwq1" role="2Oq$k0" />
              <node concept="liA8E" id="3HJD4JbIwq2" role="2OqNvi">
                <ref role="37wK5l" node="3HJD4JbIwmG" resolve="getPreferredSize" />
              </node>
            </node>
          </node>
        </node>
        <node concept="2AHcQZ" id="3tYsUK_UtTI" role="2AJF6D">
          <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        </node>
      </node>
      <node concept="3clFb_" id="3HJD4JbIwmG" role="jymVt">
        <property role="TrG5h" value="getPreferredSize" />
        <node concept="3Tm1VV" id="3HJD4JbIwmH" role="1B3o_S" />
        <node concept="3uibUv" id="3HJD4JbIwmI" role="3clF45">
          <ref role="3uigEE" to="z60i:~Dimension" resolve="Dimension" />
        </node>
        <node concept="3clFbS" id="3HJD4JbIwq3" role="3clF47">
          <node concept="3cpWs6" id="3HJD4JbIwq4" role="3cqZAp">
            <node concept="2ShNRf" id="3HJD4JbIwq5" role="3cqZAk">
              <node concept="1pGfFk" id="3HJD4JbIwq6" role="2ShVmc">
                <ref role="37wK5l" to="z60i:~Dimension.&lt;init&gt;(int,int)" resolve="Dimension" />
                <node concept="2OqwBi" id="3HJD4JbIwq7" role="37wK5m">
                  <node concept="2OqwBi" id="3HJD4JbIwq8" role="2Oq$k0">
                    <node concept="2OwXpG" id="3HJD4JbIwq9" role="2OqNvi">
                      <ref role="2Oxat5" node="3HJD4JbIwnd" resolve="myControlFlowGraph" />
                    </node>
                    <node concept="Xjq3P" id="3HJD4JbIwqa" role="2Oq$k0">
                      <ref role="1HBi2w" node="3HJD4JbIwmo" resolve="ShowCFGDialog" />
                    </node>
                  </node>
                  <node concept="liA8E" id="3HJD4JbIwqb" role="2OqNvi">
                    <ref role="37wK5l" node="3HJD4JbIw6r" resolve="getWidth" />
                  </node>
                </node>
                <node concept="2OqwBi" id="3HJD4JbIwqc" role="37wK5m">
                  <node concept="2OqwBi" id="3HJD4JbIwqd" role="2Oq$k0">
                    <node concept="2OwXpG" id="3HJD4JbIwqe" role="2OqNvi">
                      <ref role="2Oxat5" node="3HJD4JbIwnd" resolve="myControlFlowGraph" />
                    </node>
                    <node concept="Xjq3P" id="3HJD4JbIwqf" role="2Oq$k0">
                      <ref role="1HBi2w" node="3HJD4JbIwmo" resolve="ShowCFGDialog" />
                    </node>
                  </node>
                  <node concept="liA8E" id="3HJD4JbIwqg" role="2OqNvi">
                    <ref role="37wK5l" node="3HJD4JbIw6z" resolve="getHeight" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="2AHcQZ" id="3tYsUK_UtTK" role="2AJF6D">
          <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        </node>
      </node>
      <node concept="3clFb_" id="3HJD4JbIwmJ" role="jymVt">
        <property role="TrG5h" value="getScrollableUnitIncrement" />
        <node concept="3Tm1VV" id="3HJD4JbIwmK" role="1B3o_S" />
        <node concept="10Oyi0" id="3HJD4JbIwmL" role="3clF45" />
        <node concept="37vLTG" id="3HJD4JbIwmM" role="3clF46">
          <property role="TrG5h" value="visibleRect" />
          <node concept="3uibUv" id="3HJD4JbIwmN" role="1tU5fm">
            <ref role="3uigEE" to="z60i:~Rectangle" resolve="Rectangle" />
          </node>
        </node>
        <node concept="37vLTG" id="3HJD4JbIwmO" role="3clF46">
          <property role="TrG5h" value="orientation" />
          <node concept="10Oyi0" id="3HJD4JbIwmP" role="1tU5fm" />
        </node>
        <node concept="37vLTG" id="3HJD4JbIwmQ" role="3clF46">
          <property role="TrG5h" value="direction" />
          <node concept="10Oyi0" id="3HJD4JbIwmR" role="1tU5fm" />
        </node>
        <node concept="3clFbS" id="3HJD4JbIwqh" role="3clF47">
          <node concept="3cpWs6" id="3HJD4JbIwqi" role="3cqZAp">
            <node concept="3cmrfG" id="3HJD4JbIwqj" role="3cqZAk">
              <property role="3cmrfH" value="20" />
            </node>
          </node>
        </node>
        <node concept="2AHcQZ" id="3tYsUK_UtTO" role="2AJF6D">
          <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        </node>
      </node>
      <node concept="3clFb_" id="3HJD4JbIwmS" role="jymVt">
        <property role="TrG5h" value="getScrollableBlockIncrement" />
        <node concept="3Tm1VV" id="3HJD4JbIwmT" role="1B3o_S" />
        <node concept="10Oyi0" id="3HJD4JbIwmU" role="3clF45" />
        <node concept="37vLTG" id="3HJD4JbIwmV" role="3clF46">
          <property role="TrG5h" value="visibleRect" />
          <node concept="3uibUv" id="3HJD4JbIwmW" role="1tU5fm">
            <ref role="3uigEE" to="z60i:~Rectangle" resolve="Rectangle" />
          </node>
        </node>
        <node concept="37vLTG" id="3HJD4JbIwmX" role="3clF46">
          <property role="TrG5h" value="orientation" />
          <node concept="10Oyi0" id="3HJD4JbIwmY" role="1tU5fm" />
        </node>
        <node concept="37vLTG" id="3HJD4JbIwmZ" role="3clF46">
          <property role="TrG5h" value="direction" />
          <node concept="10Oyi0" id="3HJD4JbIwn0" role="1tU5fm" />
        </node>
        <node concept="3clFbS" id="3HJD4JbIwqk" role="3clF47">
          <node concept="3cpWs6" id="3HJD4JbIwql" role="3cqZAp">
            <node concept="2OqwBi" id="3HJD4JbIwqm" role="3cqZAk">
              <node concept="2OwXpG" id="3HJD4JbIwqn" role="2OqNvi">
                <ref role="2Oxat5" to="z60i:~Rectangle.height" resolve="height" />
              </node>
              <node concept="37vLTw" id="2BHiRxghgq$" role="2Oq$k0">
                <ref role="3cqZAo" node="3HJD4JbIwmV" resolve="visibleRect" />
              </node>
            </node>
          </node>
        </node>
        <node concept="2AHcQZ" id="3tYsUK_UtTN" role="2AJF6D">
          <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        </node>
      </node>
      <node concept="3clFb_" id="3HJD4JbIwn1" role="jymVt">
        <property role="TrG5h" value="getScrollableTracksViewportWidth" />
        <node concept="3Tm1VV" id="3HJD4JbIwn2" role="1B3o_S" />
        <node concept="10P_77" id="3HJD4JbIwn3" role="3clF45" />
        <node concept="3clFbS" id="3HJD4JbIwqp" role="3clF47">
          <node concept="3cpWs6" id="3HJD4JbIwqq" role="3cqZAp">
            <node concept="3clFbT" id="3HJD4JbIwqr" role="3cqZAk" />
          </node>
        </node>
        <node concept="2AHcQZ" id="3tYsUK_UtTM" role="2AJF6D">
          <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        </node>
      </node>
      <node concept="3clFb_" id="3HJD4JbIwn4" role="jymVt">
        <property role="TrG5h" value="getScrollableTracksViewportHeight" />
        <node concept="3Tm1VV" id="3HJD4JbIwn5" role="1B3o_S" />
        <node concept="10P_77" id="3HJD4JbIwn6" role="3clF45" />
        <node concept="3clFbS" id="3HJD4JbIwqs" role="3clF47">
          <node concept="3cpWs6" id="3HJD4JbIwqt" role="3cqZAp">
            <node concept="3clFbT" id="3HJD4JbIwqu" role="3cqZAk" />
          </node>
        </node>
        <node concept="2AHcQZ" id="3tYsUK_UtTL" role="2AJF6D">
          <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        </node>
      </node>
    </node>
  </node>
  <node concept="312cEu" id="3HJD4JbIwre">
    <property role="TrG5h" value="ProgramWrapper" />
    <node concept="3Tm1VV" id="3HJD4JbIwrf" role="1B3o_S" />
    <node concept="3uibUv" id="3HJD4JbIwrg" role="EKbjA">
      <ref role="3uigEE" node="3HJD4JbIwB2" resolve="IProgram" />
      <node concept="3uibUv" id="3HJD4JbIwrh" role="11_B2D">
        <ref role="3uigEE" node="3HJD4JbIvBj" resolve="InstructionWrapper" />
      </node>
    </node>
    <node concept="312cEg" id="3HJD4JbIwri" role="jymVt">
      <property role="TrG5h" value="myProgram" />
      <node concept="3uibUv" id="3HJD4JbIwrj" role="1tU5fm">
        <ref role="3uigEE" to="1fjm:~Program" resolve="Program" />
      </node>
      <node concept="3Tm6S6" id="3HJD4JbIwrk" role="1B3o_S" />
    </node>
    <node concept="3clFbW" id="3HJD4JbIwrl" role="jymVt">
      <node concept="3Tm1VV" id="3HJD4JbIwrm" role="1B3o_S" />
      <node concept="37vLTG" id="3HJD4JbIwrn" role="3clF46">
        <property role="TrG5h" value="program" />
        <node concept="3uibUv" id="3HJD4JbIwro" role="1tU5fm">
          <ref role="3uigEE" to="1fjm:~Program" resolve="Program" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIwrp" role="3clF47">
        <node concept="3clFbF" id="3HJD4JbIwrq" role="3cqZAp">
          <node concept="37vLTI" id="3HJD4JbIwrr" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIwrs" role="37vLTJ">
              <node concept="2OwXpG" id="3HJD4JbIwrt" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIwri" resolve="myProgram" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIwru" role="2Oq$k0" />
            </node>
            <node concept="37vLTw" id="2BHiRxgmzmK" role="37vLTx">
              <ref role="3cqZAo" node="3HJD4JbIwrn" resolve="program" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIwrw" role="jymVt">
      <property role="TrG5h" value="getStart" />
      <node concept="3Tm1VV" id="3HJD4JbIwrx" role="1B3o_S" />
      <node concept="3uibUv" id="3HJD4JbIwry" role="3clF45">
        <ref role="3uigEE" node="3HJD4JbIvSt" resolve="IInstruction" />
        <node concept="3uibUv" id="3HJD4JbIwrz" role="11_B2D">
          <ref role="3uigEE" node="3HJD4JbIvBj" resolve="InstructionWrapper" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIwr$" role="3clF47">
        <node concept="3cpWs6" id="3HJD4JbIwr_" role="3cqZAp">
          <node concept="2ShNRf" id="3HJD4JbIwrA" role="3cqZAk">
            <node concept="1pGfFk" id="3HJD4JbIwrB" role="2ShVmc">
              <ref role="37wK5l" node="3HJD4JbIvEH" resolve="InstructionWrapper" />
              <node concept="2OqwBi" id="3HJD4JbIwrC" role="37wK5m">
                <node concept="2OqwBi" id="3HJD4JbIwrD" role="2Oq$k0">
                  <node concept="2OwXpG" id="3HJD4JbIwrE" role="2OqNvi">
                    <ref role="2Oxat5" node="3HJD4JbIwri" resolve="myProgram" />
                  </node>
                  <node concept="Xjq3P" id="3HJD4JbIwrF" role="2Oq$k0" />
                </node>
                <node concept="liA8E" id="3HJD4JbIwrG" role="2OqNvi">
                  <ref role="37wK5l" to="1fjm:~Program.getStart():jetbrains.mps.lang.dataFlow.framework.instructions.Instruction" resolve="getStart" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3tYsUK_Se6H" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIwrH" role="jymVt">
      <property role="TrG5h" value="getEnd" />
      <node concept="3Tm1VV" id="3HJD4JbIwrI" role="1B3o_S" />
      <node concept="3uibUv" id="3HJD4JbIwrJ" role="3clF45">
        <ref role="3uigEE" node="3HJD4JbIvSt" resolve="IInstruction" />
        <node concept="3uibUv" id="3HJD4JbIwrK" role="11_B2D">
          <ref role="3uigEE" node="3HJD4JbIvBj" resolve="InstructionWrapper" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIwrL" role="3clF47">
        <node concept="3cpWs6" id="3HJD4JbIwrM" role="3cqZAp">
          <node concept="2ShNRf" id="3HJD4JbIwrN" role="3cqZAk">
            <node concept="1pGfFk" id="3HJD4JbIwrO" role="2ShVmc">
              <ref role="37wK5l" node="3HJD4JbIvEH" resolve="InstructionWrapper" />
              <node concept="2OqwBi" id="3HJD4JbIwrP" role="37wK5m">
                <node concept="2OqwBi" id="3HJD4JbIwrQ" role="2Oq$k0">
                  <node concept="2OwXpG" id="3HJD4JbIwrR" role="2OqNvi">
                    <ref role="2Oxat5" node="3HJD4JbIwri" resolve="myProgram" />
                  </node>
                  <node concept="Xjq3P" id="3HJD4JbIwrS" role="2Oq$k0" />
                </node>
                <node concept="liA8E" id="3HJD4JbIwrT" role="2OqNvi">
                  <ref role="37wK5l" to="1fjm:~Program.getEnd():jetbrains.mps.lang.dataFlow.framework.instructions.Instruction" resolve="getEnd" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3tYsUK_Se6G" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIwrU" role="jymVt">
      <property role="TrG5h" value="getInstructions" />
      <node concept="3Tm1VV" id="3HJD4JbIwrV" role="1B3o_S" />
      <node concept="3uibUv" id="3HJD4JbIwrW" role="3clF45">
        <ref role="3uigEE" to="33ny:~List" resolve="List" />
        <node concept="3uibUv" id="3HJD4JbIwrX" role="11_B2D">
          <ref role="3uigEE" node="3HJD4JbIvSt" resolve="IInstruction" />
          <node concept="3uibUv" id="3HJD4JbIwrY" role="11_B2D">
            <ref role="3uigEE" node="3HJD4JbIvBj" resolve="InstructionWrapper" />
          </node>
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIwrZ" role="3clF47">
        <node concept="3cpWs8" id="3HJD4JbIws0" role="3cqZAp">
          <node concept="3cpWsn" id="3HJD4JbIws1" role="3cpWs9">
            <property role="TrG5h" value="result" />
            <node concept="3uibUv" id="3HJD4JbIws2" role="1tU5fm">
              <ref role="3uigEE" to="33ny:~List" resolve="List" />
              <node concept="3uibUv" id="3HJD4JbIws3" role="11_B2D">
                <ref role="3uigEE" node="3HJD4JbIvSt" resolve="IInstruction" />
                <node concept="3uibUv" id="3HJD4JbIws4" role="11_B2D">
                  <ref role="3uigEE" node="3HJD4JbIvBj" resolve="InstructionWrapper" />
                </node>
              </node>
            </node>
            <node concept="2ShNRf" id="3HJD4JbIws5" role="33vP2m">
              <node concept="1pGfFk" id="3HJD4JbIws6" role="2ShVmc">
                <ref role="37wK5l" to="33ny:~ArrayList.&lt;init&gt;()" resolve="ArrayList" />
                <node concept="3uibUv" id="3HJD4JbIws7" role="1pMfVU">
                  <ref role="3uigEE" node="3HJD4JbIvSt" resolve="IInstruction" />
                  <node concept="3uibUv" id="3HJD4JbIws8" role="11_B2D">
                    <ref role="3uigEE" node="3HJD4JbIvBj" resolve="InstructionWrapper" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="1DcWWT" id="3HJD4JbIws9" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIwsa" role="1DdaDG">
            <node concept="2OqwBi" id="3HJD4JbIwsb" role="2Oq$k0">
              <node concept="2OwXpG" id="3HJD4JbIwsc" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIwri" resolve="myProgram" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIwsd" role="2Oq$k0" />
            </node>
            <node concept="liA8E" id="3HJD4JbIwse" role="2OqNvi">
              <ref role="37wK5l" to="1fjm:~Program.getInstructions():java.util.List" resolve="getInstructions" />
            </node>
          </node>
          <node concept="3cpWsn" id="3HJD4JbIwsf" role="1Duv9x">
            <property role="TrG5h" value="instruction" />
            <node concept="3uibUv" id="3HJD4JbIwsg" role="1tU5fm">
              <ref role="3uigEE" to="dau9:~Instruction" resolve="Instruction" />
            </node>
          </node>
          <node concept="3clFbS" id="3HJD4JbIwsh" role="2LFqv$">
            <node concept="3clFbF" id="3HJD4JbIwsi" role="3cqZAp">
              <node concept="2OqwBi" id="3HJD4JbIwsj" role="3clFbG">
                <node concept="37vLTw" id="3GM_nagTulf" role="2Oq$k0">
                  <ref role="3cqZAo" node="3HJD4JbIws1" resolve="result" />
                </node>
                <node concept="liA8E" id="3HJD4JbIwsl" role="2OqNvi">
                  <ref role="37wK5l" to="33ny:~List.add(java.lang.Object):boolean" resolve="add" />
                  <node concept="2ShNRf" id="3HJD4JbIwsm" role="37wK5m">
                    <node concept="1pGfFk" id="3HJD4JbIwsn" role="2ShVmc">
                      <ref role="37wK5l" node="3HJD4JbIvEH" resolve="InstructionWrapper" />
                      <node concept="37vLTw" id="3GM_nagTvUz" role="37wK5m">
                        <ref role="3cqZAo" node="3HJD4JbIwsf" resolve="instruction" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="3HJD4JbIwsp" role="3cqZAp">
          <node concept="37vLTw" id="3GM_nagTso$" role="3cqZAk">
            <ref role="3cqZAo" node="3HJD4JbIws1" resolve="result" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3tYsUK_Se6F" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
  </node>
  <node concept="Qs71p" id="3HJD4JbIwsr">
    <property role="TrG5h" value="LineDirection" />
    <node concept="3Tm1VV" id="3HJD4JbIwss" role="1B3o_S" />
    <node concept="QsSxf" id="3HJD4JbIwst" role="Qtgdg">
      <property role="TrG5h" value="HORIZONTAL" />
      <ref role="37wK5l" node="3HJD4JbIwv5" resolve="LineDirection" />
      <node concept="3clFb_" id="JwZXmy5oGw" role="2HKRsH">
        <property role="1EzhhJ" value="false" />
        <property role="TrG5h" value="paint" />
        <node concept="3Tm1VV" id="JwZXmy5oGx" role="1B3o_S" />
        <node concept="3cqZAl" id="JwZXmy5oGy" role="3clF45" />
        <node concept="37vLTG" id="JwZXmy5oGz" role="3clF46">
          <property role="TrG5h" value="g" />
          <node concept="3uibUv" id="JwZXmy5oG$" role="1tU5fm">
            <ref role="3uigEE" to="z60i:~Graphics" resolve="Graphics" />
          </node>
        </node>
        <node concept="37vLTG" id="JwZXmy5oG_" role="3clF46">
          <property role="TrG5h" value="first" />
          <node concept="10Oyi0" id="JwZXmy5oGA" role="1tU5fm" />
        </node>
        <node concept="37vLTG" id="JwZXmy5oGB" role="3clF46">
          <property role="TrG5h" value="second" />
          <node concept="10Oyi0" id="JwZXmy5oGC" role="1tU5fm" />
        </node>
        <node concept="37vLTG" id="JwZXmy5oGD" role="3clF46">
          <property role="TrG5h" value="level" />
          <node concept="10Oyi0" id="JwZXmy5oGE" role="1tU5fm" />
        </node>
        <node concept="37vLTG" id="JwZXmy5oGF" role="3clF46">
          <property role="TrG5h" value="backgroundColor" />
          <node concept="3uibUv" id="JwZXmy5oGG" role="1tU5fm">
            <ref role="3uigEE" to="z60i:~Color" resolve="Color" />
          </node>
        </node>
        <node concept="2AHcQZ" id="JwZXmy5oGL" role="2AJF6D">
          <ref role="2AI5Lk" to="wyt6:~Deprecated" resolve="Deprecated" />
        </node>
        <node concept="3clFbS" id="JwZXmy5oGM" role="3clF47">
          <node concept="3clFbF" id="JwZXmy5s3T" role="3cqZAp">
            <node concept="2OqwBi" id="JwZXmy5s3V" role="3clFbG">
              <node concept="37vLTw" id="JwZXmy5s3W" role="2Oq$k0">
                <ref role="3cqZAo" node="JwZXmy5oGz" resolve="g" />
              </node>
              <node concept="liA8E" id="JwZXmy5s3X" role="2OqNvi">
                <ref role="37wK5l" to="z60i:~Graphics.drawLine(int,int,int,int):void" resolve="drawLine" />
                <node concept="37vLTw" id="JwZXmy5s3Z" role="37wK5m">
                  <ref role="3cqZAo" node="JwZXmy5oG_" resolve="first" />
                </node>
                <node concept="37vLTw" id="JwZXmy5s40" role="37wK5m">
                  <ref role="3cqZAo" node="JwZXmy5oGD" resolve="level" />
                </node>
                <node concept="37vLTw" id="JwZXmy5s41" role="37wK5m">
                  <ref role="3cqZAo" node="JwZXmy5oGB" resolve="second" />
                </node>
                <node concept="37vLTw" id="JwZXmy5s3Y" role="37wK5m">
                  <ref role="3cqZAo" node="JwZXmy5oGD" resolve="level" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3clFb_" id="JwZXmxZUkp" role="2HKRsH">
        <property role="1EzhhJ" value="false" />
        <property role="TrG5h" value="paint" />
        <node concept="3Tm1VV" id="JwZXmxZUkq" role="1B3o_S" />
        <node concept="3cqZAl" id="JwZXmxZUkr" role="3clF45" />
        <node concept="37vLTG" id="JwZXmy5n3Y" role="3clF46">
          <property role="TrG5h" value="line" />
          <node concept="3uibUv" id="JwZXmy5n3Z" role="1tU5fm">
            <ref role="3uigEE" node="3HJD4JbIwEp" resolve="Line" />
          </node>
        </node>
        <node concept="37vLTG" id="JwZXmxZUks" role="3clF46">
          <property role="TrG5h" value="g" />
          <node concept="3uibUv" id="JwZXmxZUkt" role="1tU5fm">
            <ref role="3uigEE" to="z60i:~Graphics" resolve="Graphics" />
          </node>
        </node>
        <node concept="37vLTG" id="JwZXmxZUku" role="3clF46">
          <property role="TrG5h" value="first" />
          <node concept="10Oyi0" id="JwZXmxZUkv" role="1tU5fm" />
        </node>
        <node concept="37vLTG" id="JwZXmxZUkw" role="3clF46">
          <property role="TrG5h" value="second" />
          <node concept="10Oyi0" id="JwZXmxZUkx" role="1tU5fm" />
        </node>
        <node concept="37vLTG" id="JwZXmxZUky" role="3clF46">
          <property role="TrG5h" value="level" />
          <node concept="10Oyi0" id="JwZXmxZUkz" role="1tU5fm" />
        </node>
        <node concept="3clFbS" id="JwZXmxZUkD" role="3clF47">
          <node concept="3clFbF" id="JwZXmxZUwS" role="3cqZAp">
            <node concept="2OqwBi" id="JwZXmxZUwT" role="3clFbG">
              <node concept="37vLTw" id="JwZXmy5nGs" role="2Oq$k0">
                <ref role="3cqZAo" node="JwZXmy5n3Y" resolve="line" />
              </node>
              <node concept="liA8E" id="JwZXmxZUwV" role="2OqNvi">
                <ref role="37wK5l" node="JwZXmxZHlW" resolve="drawLine" />
                <node concept="37vLTw" id="JwZXmxZUwW" role="37wK5m">
                  <ref role="3cqZAo" node="JwZXmxZUks" resolve="g" />
                </node>
                <node concept="37vLTw" id="JwZXmxZUwY" role="37wK5m">
                  <ref role="3cqZAo" node="JwZXmxZUku" resolve="first" />
                </node>
                <node concept="37vLTw" id="JwZXmxZUwZ" role="37wK5m">
                  <ref role="3cqZAo" node="JwZXmxZUky" resolve="level" />
                </node>
                <node concept="37vLTw" id="JwZXmxZUx0" role="37wK5m">
                  <ref role="3cqZAo" node="JwZXmxZUkw" resolve="second" />
                </node>
                <node concept="37vLTw" id="JwZXmy00sa" role="37wK5m">
                  <ref role="3cqZAo" node="JwZXmxZUky" resolve="level" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3clFb_" id="3HJD4JbIwsT" role="2HKRsH">
        <property role="TrG5h" value="shiftLeft" />
        <node concept="3Tm1VV" id="3HJD4JbIwsU" role="1B3o_S" />
        <node concept="3cqZAl" id="3HJD4JbIwsV" role="3clF45" />
        <node concept="37vLTG" id="3HJD4JbIwsW" role="3clF46">
          <property role="TrG5h" value="line" />
          <node concept="3uibUv" id="3HJD4JbIwsX" role="1tU5fm">
            <ref role="3uigEE" node="3HJD4JbIwEp" resolve="Line" />
          </node>
        </node>
        <node concept="37vLTG" id="3HJD4JbIwsY" role="3clF46">
          <property role="TrG5h" value="indent" />
          <node concept="10Oyi0" id="3HJD4JbIwsZ" role="1tU5fm" />
        </node>
        <node concept="3clFbS" id="3HJD4JbIwt0" role="3clF47">
          <node concept="3clFbF" id="3HJD4JbIwt1" role="3cqZAp">
            <node concept="37vLTI" id="3HJD4JbIwt2" role="3clFbG">
              <node concept="2OqwBi" id="3HJD4JbIwt3" role="37vLTJ">
                <node concept="2OwXpG" id="3HJD4JbIwt4" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIwEt" resolve="myFirst" />
                </node>
                <node concept="37vLTw" id="2BHiRxgmvMp" role="2Oq$k0">
                  <ref role="3cqZAo" node="3HJD4JbIwsW" resolve="line" />
                </node>
              </node>
              <node concept="3cpWs3" id="3HJD4JbIwt6" role="37vLTx">
                <node concept="2OqwBi" id="3HJD4JbIwt7" role="3uHU7B">
                  <node concept="2OwXpG" id="3HJD4JbIwt8" role="2OqNvi">
                    <ref role="2Oxat5" node="3HJD4JbIwEt" resolve="myFirst" />
                  </node>
                  <node concept="37vLTw" id="2BHiRxgmFkW" role="2Oq$k0">
                    <ref role="3cqZAo" node="3HJD4JbIwsW" resolve="line" />
                  </node>
                </node>
                <node concept="37vLTw" id="2BHiRxgmH1z" role="3uHU7w">
                  <ref role="3cqZAo" node="3HJD4JbIwsY" resolve="indent" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbF" id="3HJD4JbIwtb" role="3cqZAp">
            <node concept="37vLTI" id="3HJD4JbIwtc" role="3clFbG">
              <node concept="2OqwBi" id="3HJD4JbIwtd" role="37vLTJ">
                <node concept="2OwXpG" id="3HJD4JbIwte" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIwEv" resolve="mySecond" />
                </node>
                <node concept="37vLTw" id="2BHiRxgm_gD" role="2Oq$k0">
                  <ref role="3cqZAo" node="3HJD4JbIwsW" resolve="line" />
                </node>
              </node>
              <node concept="3cpWs3" id="3HJD4JbIwtg" role="37vLTx">
                <node concept="2OqwBi" id="3HJD4JbIwth" role="3uHU7B">
                  <node concept="2OwXpG" id="3HJD4JbIwti" role="2OqNvi">
                    <ref role="2Oxat5" node="3HJD4JbIwEv" resolve="mySecond" />
                  </node>
                  <node concept="37vLTw" id="2BHiRxghcwy" role="2Oq$k0">
                    <ref role="3cqZAo" node="3HJD4JbIwsW" resolve="line" />
                  </node>
                </node>
                <node concept="37vLTw" id="2BHiRxgmLqx" role="3uHU7w">
                  <ref role="3cqZAo" node="3HJD4JbIwsY" resolve="indent" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="QsSxf" id="3HJD4JbIwtl" role="Qtgdg">
      <property role="TrG5h" value="VERTICAL" />
      <ref role="37wK5l" node="3HJD4JbIwv5" resolve="LineDirection" />
      <node concept="3clFb_" id="JwZXmy5p5W" role="2HKRsH">
        <property role="1EzhhJ" value="false" />
        <property role="TrG5h" value="paint" />
        <node concept="3Tm1VV" id="JwZXmy5p5X" role="1B3o_S" />
        <node concept="3cqZAl" id="JwZXmy5p5Y" role="3clF45" />
        <node concept="37vLTG" id="JwZXmy5p5Z" role="3clF46">
          <property role="TrG5h" value="g" />
          <node concept="3uibUv" id="JwZXmy5p60" role="1tU5fm">
            <ref role="3uigEE" to="z60i:~Graphics" resolve="Graphics" />
          </node>
        </node>
        <node concept="37vLTG" id="JwZXmy5p61" role="3clF46">
          <property role="TrG5h" value="first" />
          <node concept="10Oyi0" id="JwZXmy5p62" role="1tU5fm" />
        </node>
        <node concept="37vLTG" id="JwZXmy5p63" role="3clF46">
          <property role="TrG5h" value="second" />
          <node concept="10Oyi0" id="JwZXmy5p64" role="1tU5fm" />
        </node>
        <node concept="37vLTG" id="JwZXmy5p65" role="3clF46">
          <property role="TrG5h" value="level" />
          <node concept="10Oyi0" id="JwZXmy5p66" role="1tU5fm" />
        </node>
        <node concept="37vLTG" id="JwZXmy5p67" role="3clF46">
          <property role="TrG5h" value="backgroundColor" />
          <node concept="3uibUv" id="JwZXmy5p68" role="1tU5fm">
            <ref role="3uigEE" to="z60i:~Color" resolve="Color" />
          </node>
        </node>
        <node concept="2AHcQZ" id="JwZXmy5p6d" role="2AJF6D">
          <ref role="2AI5Lk" to="wyt6:~Deprecated" resolve="Deprecated" />
        </node>
        <node concept="3clFbS" id="JwZXmy5p6e" role="3clF47">
          <node concept="3clFbF" id="JwZXmy5pQs" role="3cqZAp">
            <node concept="2OqwBi" id="JwZXmy5pQt" role="3clFbG">
              <node concept="37vLTw" id="JwZXmy5pQu" role="2Oq$k0">
                <ref role="3cqZAo" node="JwZXmy5p5Z" resolve="g" />
              </node>
              <node concept="liA8E" id="JwZXmy5pQv" role="2OqNvi">
                <ref role="37wK5l" to="z60i:~Graphics.drawLine(int,int,int,int):void" resolve="drawLine" />
                <node concept="37vLTw" id="JwZXmy5qt1" role="37wK5m">
                  <ref role="3cqZAo" node="JwZXmy5p65" resolve="level" />
                </node>
                <node concept="37vLTw" id="JwZXmy5r2x" role="37wK5m">
                  <ref role="3cqZAo" node="JwZXmy5p61" resolve="first" />
                </node>
                <node concept="37vLTw" id="JwZXmy5rnt" role="37wK5m">
                  <ref role="3cqZAo" node="JwZXmy5p65" resolve="level" />
                </node>
                <node concept="37vLTw" id="JwZXmy5rZH" role="37wK5m">
                  <ref role="3cqZAo" node="JwZXmy5p63" resolve="second" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3clFb_" id="JwZXmxZyaE" role="2HKRsH">
        <property role="1EzhhJ" value="false" />
        <property role="TrG5h" value="paint" />
        <node concept="3Tm1VV" id="JwZXmxZyaF" role="1B3o_S" />
        <node concept="3cqZAl" id="JwZXmxZyaG" role="3clF45" />
        <node concept="37vLTG" id="JwZXmy5mJ1" role="3clF46">
          <property role="TrG5h" value="line" />
          <node concept="3uibUv" id="JwZXmy5mW1" role="1tU5fm">
            <ref role="3uigEE" node="3HJD4JbIwEp" resolve="Line" />
          </node>
        </node>
        <node concept="37vLTG" id="JwZXmxZyaH" role="3clF46">
          <property role="TrG5h" value="g" />
          <node concept="3uibUv" id="JwZXmxZyaI" role="1tU5fm">
            <ref role="3uigEE" to="z60i:~Graphics" resolve="Graphics" />
          </node>
        </node>
        <node concept="37vLTG" id="JwZXmxZyaJ" role="3clF46">
          <property role="TrG5h" value="first" />
          <node concept="10Oyi0" id="JwZXmxZyaK" role="1tU5fm" />
        </node>
        <node concept="37vLTG" id="JwZXmxZyaL" role="3clF46">
          <property role="TrG5h" value="second" />
          <node concept="10Oyi0" id="JwZXmxZyaM" role="1tU5fm" />
        </node>
        <node concept="37vLTG" id="JwZXmxZyaN" role="3clF46">
          <property role="TrG5h" value="level" />
          <node concept="10Oyi0" id="JwZXmxZyaO" role="1tU5fm" />
        </node>
        <node concept="3clFbS" id="JwZXmxZyaZ" role="3clF47">
          <node concept="3clFbF" id="JwZXmxZ_V2" role="3cqZAp">
            <node concept="2OqwBi" id="JwZXmxZAcj" role="3clFbG">
              <node concept="37vLTw" id="JwZXmy5o1P" role="2Oq$k0">
                <ref role="3cqZAo" node="JwZXmy5mJ1" resolve="line" />
              </node>
              <node concept="liA8E" id="JwZXmxZAfz" role="2OqNvi">
                <ref role="37wK5l" node="JwZXmxZHlW" resolve="drawLine" />
                <node concept="37vLTw" id="JwZXmxZAA2" role="37wK5m">
                  <ref role="3cqZAo" node="JwZXmxZyaH" resolve="g" />
                </node>
                <node concept="37vLTw" id="JwZXmxZAg9" role="37wK5m">
                  <ref role="3cqZAo" node="JwZXmxZyaN" resolve="level" />
                </node>
                <node concept="37vLTw" id="JwZXmxZAga" role="37wK5m">
                  <ref role="3cqZAo" node="JwZXmxZyaJ" resolve="first" />
                </node>
                <node concept="37vLTw" id="JwZXmxZAgb" role="37wK5m">
                  <ref role="3cqZAo" node="JwZXmxZyaN" resolve="level" />
                </node>
                <node concept="37vLTw" id="JwZXmxZAgc" role="37wK5m">
                  <ref role="3cqZAo" node="JwZXmxZyaL" resolve="second" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="2AHcQZ" id="JwZXmxZyb0" role="2AJF6D">
          <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        </node>
      </node>
      <node concept="3clFb_" id="3HJD4JbIwuJ" role="2HKRsH">
        <property role="TrG5h" value="shiftLeft" />
        <node concept="3Tm1VV" id="3HJD4JbIwuK" role="1B3o_S" />
        <node concept="3cqZAl" id="3HJD4JbIwuL" role="3clF45" />
        <node concept="37vLTG" id="3HJD4JbIwuM" role="3clF46">
          <property role="TrG5h" value="line" />
          <node concept="3uibUv" id="3HJD4JbIwuN" role="1tU5fm">
            <ref role="3uigEE" node="3HJD4JbIwEp" resolve="Line" />
          </node>
        </node>
        <node concept="37vLTG" id="3HJD4JbIwuO" role="3clF46">
          <property role="TrG5h" value="indent" />
          <node concept="10Oyi0" id="3HJD4JbIwuP" role="1tU5fm" />
        </node>
        <node concept="3clFbS" id="3HJD4JbIwuQ" role="3clF47">
          <node concept="3clFbF" id="3HJD4JbIwuR" role="3cqZAp">
            <node concept="37vLTI" id="3HJD4JbIwuS" role="3clFbG">
              <node concept="2OqwBi" id="3HJD4JbIwuT" role="37vLTJ">
                <node concept="2OwXpG" id="JwZXmy5eRm" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIwEx" resolve="myLevel" />
                </node>
                <node concept="37vLTw" id="2BHiRxgmu3a" role="2Oq$k0">
                  <ref role="3cqZAo" node="3HJD4JbIwuM" resolve="line" />
                </node>
              </node>
              <node concept="3cpWs3" id="3HJD4JbIwuW" role="37vLTx">
                <node concept="2OqwBi" id="3HJD4JbIwuX" role="3uHU7B">
                  <node concept="2OwXpG" id="3HJD4JbIwuY" role="2OqNvi">
                    <ref role="2Oxat5" node="3HJD4JbIwEx" resolve="myLevel" />
                  </node>
                  <node concept="37vLTw" id="2BHiRxgmyUE" role="2Oq$k0">
                    <ref role="3cqZAo" node="3HJD4JbIwuM" resolve="line" />
                  </node>
                </node>
                <node concept="37vLTw" id="2BHiRxgha34" role="3uHU7w">
                  <ref role="3cqZAo" node="3HJD4JbIwuO" resolve="indent" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFbW" id="3HJD4JbIwv5" role="jymVt">
      <node concept="3Tm6S6" id="3HJD4JbIwv6" role="1B3o_S" />
      <node concept="3clFbS" id="3HJD4JbIwv7" role="3clF47" />
    </node>
    <node concept="3clFb_" id="3HJD4JbIwv8" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="paint" />
      <node concept="3Tm1VV" id="3HJD4JbIwv9" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIwva" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIwvb" role="3clF46">
        <property role="TrG5h" value="g" />
        <node concept="3uibUv" id="3HJD4JbIwvc" role="1tU5fm">
          <ref role="3uigEE" to="z60i:~Graphics" resolve="Graphics" />
        </node>
      </node>
      <node concept="37vLTG" id="3HJD4JbIwvd" role="3clF46">
        <property role="TrG5h" value="first" />
        <node concept="10Oyi0" id="3HJD4JbIwve" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIwvf" role="3clF46">
        <property role="TrG5h" value="second" />
        <node concept="10Oyi0" id="3HJD4JbIwvg" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIwvh" role="3clF46">
        <property role="TrG5h" value="level" />
        <node concept="10Oyi0" id="3HJD4JbIwvi" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIwvj" role="3clF46">
        <property role="TrG5h" value="backgroundColor" />
        <node concept="3uibUv" id="3HJD4JbIwvk" role="1tU5fm">
          <ref role="3uigEE" to="z60i:~Color" resolve="Color" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIwvl" role="3clF47" />
      <node concept="P$JXv" id="JwZXmy0eGJ" role="lGtFl">
        <node concept="TZ5HI" id="JwZXmy0eGK" role="3nqlJM">
          <node concept="TZ5HA" id="JwZXmy0eGL" role="3HnX3l" />
        </node>
      </node>
      <node concept="2AHcQZ" id="JwZXmy0eGM" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Deprecated" resolve="Deprecated" />
      </node>
    </node>
    <node concept="3clFb_" id="JwZXmxZjpo" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="paint" />
      <node concept="3Tm1VV" id="JwZXmxZjpp" role="1B3o_S" />
      <node concept="3cqZAl" id="JwZXmxZjpq" role="3clF45" />
      <node concept="37vLTG" id="JwZXmxZtjD" role="3clF46">
        <property role="TrG5h" value="line" />
        <node concept="3uibUv" id="JwZXmy5kMS" role="1tU5fm">
          <ref role="3uigEE" node="3HJD4JbIwEp" resolve="Line" />
        </node>
      </node>
      <node concept="37vLTG" id="JwZXmxZjpr" role="3clF46">
        <property role="TrG5h" value="g" />
        <node concept="3uibUv" id="JwZXmxZjps" role="1tU5fm">
          <ref role="3uigEE" to="z60i:~Graphics" resolve="Graphics" />
        </node>
      </node>
      <node concept="37vLTG" id="JwZXmxZjpt" role="3clF46">
        <property role="TrG5h" value="first" />
        <node concept="10Oyi0" id="JwZXmxZjpu" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="JwZXmxZjpv" role="3clF46">
        <property role="TrG5h" value="second" />
        <node concept="10Oyi0" id="JwZXmxZjpw" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="JwZXmxZjpx" role="3clF46">
        <property role="TrG5h" value="level" />
        <node concept="10Oyi0" id="JwZXmxZjpy" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="JwZXmxZjp_" role="3clF47" />
    </node>
    <node concept="3clFb_" id="3HJD4JbIwvm" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="shiftLeft" />
      <node concept="3Tm1VV" id="3HJD4JbIwvn" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIwvo" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIwvp" role="3clF46">
        <property role="TrG5h" value="line" />
        <node concept="3uibUv" id="3HJD4JbIwvq" role="1tU5fm">
          <ref role="3uigEE" node="3HJD4JbIwEp" resolve="Line" />
        </node>
      </node>
      <node concept="37vLTG" id="3HJD4JbIwvr" role="3clF46">
        <property role="TrG5h" value="indent" />
        <node concept="10Oyi0" id="3HJD4JbIwvs" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="3HJD4JbIwvt" role="3clF47" />
    </node>
    <node concept="2tJIrI" id="JwZXmxZtzc" role="jymVt" />
  </node>
  <node concept="312cEu" id="3HJD4JbIwvu">
    <property role="TrG5h" value="JumpBlock" />
    <property role="3GE5qa" value="block" />
    <node concept="3Tm1VV" id="3HJD4JbIwvv" role="1B3o_S" />
    <node concept="3uibUv" id="3HJD4JbIwvz" role="1zkMxy">
      <ref role="3uigEE" node="3HJD4JbIvLb" resolve="AbstractBlock" />
    </node>
    <node concept="3clFbW" id="3HJD4JbIwv_" role="jymVt">
      <node concept="3Tm1VV" id="3HJD4JbIwvA" role="1B3o_S" />
      <node concept="37vLTG" id="3HJD4JbIwvB" role="3clF46">
        <property role="TrG5h" value="x" />
        <node concept="10Oyi0" id="3HJD4JbIwvC" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIwvD" role="3clF46">
        <property role="TrG5h" value="y" />
        <node concept="10Oyi0" id="3HJD4JbIwvE" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIwvF" role="3clF46">
        <property role="TrG5h" value="width" />
        <node concept="10Oyi0" id="3HJD4JbIwvG" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIwvH" role="3clF46">
        <property role="TrG5h" value="height" />
        <node concept="10Oyi0" id="3HJD4JbIwvI" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIwvJ" role="3clF46">
        <property role="TrG5h" value="source" />
        <node concept="3uibUv" id="6bzHk29ogpC" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNodeReference" resolve="SNodeReference" />
        </node>
      </node>
      <node concept="37vLTG" id="6j7_9uL$zA2" role="3clF46">
        <property role="TrG5h" value="caption" />
        <node concept="3uibUv" id="6j7_9uL$zA4" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="37vLTG" id="GzG95Qn3S5" role="3clF46">
        <property role="TrG5h" value="ruleNodeReference" />
        <node concept="3uibUv" id="GzG95Qn3S6" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIwvL" role="3clF47">
        <node concept="XkiVB" id="3HJD4JbIwvM" role="3cqZAp">
          <ref role="37wK5l" node="3HJD4JbIvLU" resolve="AbstractBlock" />
          <node concept="37vLTw" id="2BHiRxghfQP" role="37wK5m">
            <ref role="3cqZAo" node="3HJD4JbIwvB" resolve="x" />
          </node>
          <node concept="37vLTw" id="2BHiRxglawx" role="37wK5m">
            <ref role="3cqZAo" node="3HJD4JbIwvD" resolve="y" />
          </node>
          <node concept="37vLTw" id="2BHiRxglRM_" role="37wK5m">
            <ref role="3cqZAo" node="3HJD4JbIwvF" resolve="width" />
          </node>
          <node concept="37vLTw" id="2BHiRxglEub" role="37wK5m">
            <ref role="3cqZAo" node="3HJD4JbIwvH" resolve="height" />
          </node>
          <node concept="37vLTw" id="2BHiRxglqeh" role="37wK5m">
            <ref role="3cqZAo" node="3HJD4JbIwvJ" resolve="source" />
          </node>
          <node concept="37vLTw" id="2BHiRxgmalx" role="37wK5m">
            <ref role="3cqZAo" node="6j7_9uL$zA2" resolve="caption" />
          </node>
          <node concept="37vLTw" id="GzG95Qn5Zo" role="37wK5m">
            <ref role="3cqZAo" node="GzG95Qn3S5" resolve="ruleNodeReference" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIwvS" role="jymVt">
      <property role="TrG5h" value="paintBlock" />
      <node concept="3Tmbuc" id="3HJD4JbIwvT" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIwvU" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIwvV" role="3clF46">
        <property role="TrG5h" value="g" />
        <node concept="3uibUv" id="3HJD4JbIwvW" role="1tU5fm">
          <ref role="3uigEE" to="z60i:~Graphics" resolve="Graphics" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIwvX" role="3clF47">
        <node concept="3clFbF" id="3HJD4JbIwvY" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIwvZ" role="3clFbG">
            <node concept="37vLTw" id="2BHiRxghfj9" role="2Oq$k0">
              <ref role="3cqZAo" node="3HJD4JbIwvV" resolve="g" />
            </node>
            <node concept="liA8E" id="3HJD4JbIww1" role="2OqNvi">
              <ref role="37wK5l" to="z60i:~Graphics.setColor(java.awt.Color):void" resolve="setColor" />
              <node concept="10M0yZ" id="3HJD4JbIww2" role="37wK5m">
                <ref role="1PxDUh" to="z60i:~Color" resolve="Color" />
                <ref role="3cqZAo" to="z60i:~Color.YELLOW" resolve="YELLOW" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIww3" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIww4" role="3clFbG">
            <node concept="37vLTw" id="2BHiRxghfBJ" role="2Oq$k0">
              <ref role="3cqZAo" node="3HJD4JbIwvV" resolve="g" />
            </node>
            <node concept="liA8E" id="3HJD4JbIww6" role="2OqNvi">
              <ref role="37wK5l" to="z60i:~Graphics.fillOval(int,int,int,int):void" resolve="fillOval" />
              <node concept="2OqwBi" id="3HJD4JbIww7" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIww8" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLi" resolve="myX" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIww9" role="2Oq$k0" />
              </node>
              <node concept="2OqwBi" id="3HJD4JbIwwa" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIwwb" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLl" resolve="myY" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIwwc" role="2Oq$k0" />
              </node>
              <node concept="2OqwBi" id="3HJD4JbIwwd" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIwwe" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLo" resolve="myWidth" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIwwf" role="2Oq$k0" />
              </node>
              <node concept="2OqwBi" id="3HJD4JbIwwg" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIwwh" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLr" resolve="myHeight" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIwwi" role="2Oq$k0" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIwwj" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIwwk" role="3clFbG">
            <node concept="37vLTw" id="2BHiRxgkWEw" role="2Oq$k0">
              <ref role="3cqZAo" node="3HJD4JbIwvV" resolve="g" />
            </node>
            <node concept="liA8E" id="3HJD4JbIwwm" role="2OqNvi">
              <ref role="37wK5l" to="z60i:~Graphics.setColor(java.awt.Color):void" resolve="setColor" />
              <node concept="10M0yZ" id="3HJD4JbIwwn" role="37wK5m">
                <ref role="1PxDUh" to="z60i:~Color" resolve="Color" />
                <ref role="3cqZAo" to="z60i:~Color.BLACK" resolve="BLACK" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIwwo" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIwwp" role="3clFbG">
            <node concept="37vLTw" id="2BHiRxghfWV" role="2Oq$k0">
              <ref role="3cqZAo" node="3HJD4JbIwvV" resolve="g" />
            </node>
            <node concept="liA8E" id="3HJD4JbIwwr" role="2OqNvi">
              <ref role="37wK5l" to="z60i:~Graphics.drawOval(int,int,int,int):void" resolve="drawOval" />
              <node concept="2OqwBi" id="3HJD4JbIwws" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIwwt" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLi" resolve="myX" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIwwu" role="2Oq$k0" />
              </node>
              <node concept="2OqwBi" id="3HJD4JbIwwv" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIwww" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLl" resolve="myY" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIwwx" role="2Oq$k0" />
              </node>
              <node concept="2OqwBi" id="3HJD4JbIwwy" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIwwz" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLo" resolve="myWidth" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIww$" role="2Oq$k0" />
              </node>
              <node concept="2OqwBi" id="3HJD4JbIww_" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIwwA" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLr" resolve="myHeight" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIwwB" role="2Oq$k0" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3tYsUK_S9eh" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="3HJD4JbIwwC">
    <property role="TrG5h" value="FreeZone" />
    <node concept="3Tm1VV" id="3HJD4JbIwwD" role="1B3o_S" />
    <node concept="312cEg" id="3HJD4JbIwwE" role="jymVt">
      <property role="TrG5h" value="myNext" />
      <node concept="3uibUv" id="3HJD4JbIwwF" role="1tU5fm">
        <ref role="3uigEE" node="3HJD4JbIwwC" resolve="FreeZone" />
      </node>
      <node concept="3Tm6S6" id="3HJD4JbIwwG" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="3HJD4JbIwwH" role="jymVt">
      <property role="TrG5h" value="myPrev" />
      <node concept="3uibUv" id="3HJD4JbIwwI" role="1tU5fm">
        <ref role="3uigEE" node="3HJD4JbIwwC" resolve="FreeZone" />
      </node>
      <node concept="3Tm6S6" id="3HJD4JbIwwJ" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="3HJD4JbIwwK" role="jymVt">
      <property role="TrG5h" value="myFirstIndex" />
      <node concept="10Oyi0" id="3HJD4JbIwwL" role="1tU5fm" />
      <node concept="3Tm6S6" id="3HJD4JbIwwM" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="3HJD4JbIwwN" role="jymVt">
      <property role="TrG5h" value="myLastIndex" />
      <node concept="10Oyi0" id="3HJD4JbIwwO" role="1tU5fm" />
      <node concept="3Tm6S6" id="3HJD4JbIwwP" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="3HJD4JbIwwQ" role="jymVt">
      <property role="TrG5h" value="myIsDeleted" />
      <node concept="10P_77" id="3HJD4JbIwwR" role="1tU5fm" />
      <node concept="3Tm6S6" id="3HJD4JbIwwS" role="1B3o_S" />
      <node concept="3clFbT" id="3HJD4JbIwwT" role="33vP2m" />
    </node>
    <node concept="3clFbW" id="3HJD4JbIwwU" role="jymVt">
      <node concept="3Tm1VV" id="3HJD4JbIwwV" role="1B3o_S" />
      <node concept="37vLTG" id="3HJD4JbIwwW" role="3clF46">
        <property role="TrG5h" value="firstIndex" />
        <node concept="10Oyi0" id="3HJD4JbIwwX" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIwwY" role="3clF46">
        <property role="TrG5h" value="lastIndex" />
        <node concept="10Oyi0" id="3HJD4JbIwwZ" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="3HJD4JbIwx0" role="3clF47">
        <node concept="3clFbF" id="3HJD4JbIwx1" role="3cqZAp">
          <node concept="37vLTI" id="3HJD4JbIwx2" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIwx3" role="37vLTJ">
              <node concept="2OwXpG" id="3HJD4JbIwx4" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIwwK" resolve="myFirstIndex" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIwx5" role="2Oq$k0" />
            </node>
            <node concept="37vLTw" id="2BHiRxgm_rT" role="37vLTx">
              <ref role="3cqZAo" node="3HJD4JbIwwW" resolve="firstIndex" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIwx7" role="3cqZAp">
          <node concept="37vLTI" id="3HJD4JbIwx8" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIwx9" role="37vLTJ">
              <node concept="2OwXpG" id="3HJD4JbIwxa" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIwwN" resolve="myLastIndex" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIwxb" role="2Oq$k0" />
            </node>
            <node concept="37vLTw" id="2BHiRxghfP0" role="37vLTx">
              <ref role="3cqZAo" node="3HJD4JbIwwY" resolve="lastIndex" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIwxd" role="jymVt">
      <property role="TrG5h" value="insert" />
      <node concept="3Tm1VV" id="3HJD4JbIwxe" role="1B3o_S" />
      <node concept="10P_77" id="3HJD4JbIwxf" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIwxg" role="3clF46">
        <property role="TrG5h" value="first" />
        <node concept="10Oyi0" id="3HJD4JbIwxh" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIwxi" role="3clF46">
        <property role="TrG5h" value="last" />
        <node concept="10Oyi0" id="3HJD4JbIwxj" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="3HJD4JbIwxk" role="3clF47">
        <node concept="3clFbJ" id="3HJD4JbIwxl" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIwxm" role="3clFbw">
            <node concept="2OwXpG" id="3HJD4JbIwxn" role="2OqNvi">
              <ref role="2Oxat5" node="3HJD4JbIwwQ" resolve="myIsDeleted" />
            </node>
            <node concept="Xjq3P" id="3HJD4JbIwxo" role="2Oq$k0" />
          </node>
          <node concept="3clFbS" id="3HJD4JbIwxp" role="3clFbx">
            <node concept="3cpWs6" id="3HJD4JbIwxq" role="3cqZAp">
              <node concept="3clFbT" id="3HJD4JbIwxr" role="3cqZAk" />
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="3HJD4JbIwxs" role="3cqZAp">
          <node concept="3eOVzh" id="3HJD4JbIwxt" role="3clFbw">
            <node concept="37vLTw" id="2BHiRxgm66$" role="3uHU7B">
              <ref role="3cqZAo" node="3HJD4JbIwxg" resolve="first" />
            </node>
            <node concept="2OqwBi" id="3HJD4JbIwxv" role="3uHU7w">
              <node concept="2OwXpG" id="3HJD4JbIwxw" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIwwK" resolve="myFirstIndex" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIwxx" role="2Oq$k0" />
            </node>
          </node>
          <node concept="3clFbS" id="3HJD4JbIwxy" role="3clFbx">
            <node concept="3cpWs6" id="3HJD4JbIwxz" role="3cqZAp">
              <node concept="3clFbT" id="3HJD4JbIwx$" role="3cqZAk" />
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="3HJD4JbIwx_" role="3cqZAp">
          <node concept="3eOSWO" id="3HJD4JbIwxA" role="3clFbw">
            <node concept="37vLTw" id="2BHiRxghgBu" role="3uHU7B">
              <ref role="3cqZAo" node="3HJD4JbIwxi" resolve="last" />
            </node>
            <node concept="2OqwBi" id="3HJD4JbIwxC" role="3uHU7w">
              <node concept="2OwXpG" id="3HJD4JbIwxD" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIwwN" resolve="myLastIndex" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIwxE" role="2Oq$k0" />
            </node>
          </node>
          <node concept="3clFbS" id="3HJD4JbIwxF" role="3clFbx">
            <node concept="3cpWs6" id="3HJD4JbIwxG" role="3cqZAp">
              <node concept="3clFbT" id="3HJD4JbIwxH" role="3cqZAk" />
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="3HJD4JbIwxI" role="3cqZAp">
          <node concept="3cpWsn" id="3HJD4JbIwxJ" role="3cpWs9">
            <property role="TrG5h" value="before" />
            <node concept="3uibUv" id="3HJD4JbIwxK" role="1tU5fm">
              <ref role="3uigEE" node="3HJD4JbIwwC" resolve="FreeZone" />
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="3HJD4JbIwxL" role="3cqZAp">
          <node concept="3cpWsn" id="3HJD4JbIwxM" role="3cpWs9">
            <property role="TrG5h" value="after" />
            <node concept="3uibUv" id="3HJD4JbIwxN" role="1tU5fm">
              <ref role="3uigEE" node="3HJD4JbIwwC" resolve="FreeZone" />
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="3HJD4JbIwxO" role="3cqZAp">
          <node concept="3cpWsn" id="3HJD4JbIwxP" role="3cpWs9">
            <property role="TrG5h" value="wasFirstIndex" />
            <node concept="10Oyi0" id="3HJD4JbIwxQ" role="1tU5fm" />
            <node concept="2OqwBi" id="3HJD4JbIwxR" role="33vP2m">
              <node concept="2OwXpG" id="3HJD4JbIwxS" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIwwK" resolve="myFirstIndex" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIwxT" role="2Oq$k0" />
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="3HJD4JbIwxU" role="3cqZAp">
          <node concept="3cpWsn" id="3HJD4JbIwxV" role="3cpWs9">
            <property role="TrG5h" value="wasLastIndex" />
            <node concept="10Oyi0" id="3HJD4JbIwxW" role="1tU5fm" />
            <node concept="2OqwBi" id="3HJD4JbIwxX" role="33vP2m">
              <node concept="2OwXpG" id="3HJD4JbIwxY" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIwwN" resolve="myLastIndex" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIwxZ" role="2Oq$k0" />
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="3HJD4JbIwy0" role="3cqZAp">
          <node concept="3clFbC" id="3HJD4JbIwy1" role="3clFbw">
            <node concept="2OqwBi" id="3HJD4JbIwy2" role="3uHU7B">
              <node concept="2OwXpG" id="3HJD4JbIwy3" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIwwH" resolve="myPrev" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIwy4" role="2Oq$k0" />
            </node>
            <node concept="10Nm6u" id="3HJD4JbIwy5" role="3uHU7w" />
          </node>
          <node concept="9aQIb" id="3HJD4JbIwy6" role="9aQIa">
            <node concept="3clFbS" id="3HJD4JbIwy7" role="9aQI4">
              <node concept="3clFbF" id="3HJD4JbIwy8" role="3cqZAp">
                <node concept="37vLTI" id="3HJD4JbIwy9" role="3clFbG">
                  <node concept="37vLTw" id="3GM_nagTyEg" role="37vLTJ">
                    <ref role="3cqZAo" node="3HJD4JbIwxJ" resolve="before" />
                  </node>
                  <node concept="2ShNRf" id="3HJD4JbIwyb" role="37vLTx">
                    <node concept="1pGfFk" id="3HJD4JbIwyc" role="2ShVmc">
                      <ref role="37wK5l" node="3HJD4JbIwwU" resolve="FreeZone" />
                      <node concept="1ZRNhn" id="3HJD4JbIwyd" role="37wK5m">
                        <node concept="3cmrfG" id="3HJD4JbIwye" role="2$L3a6">
                          <property role="3cmrfH" value="1" />
                        </node>
                      </node>
                      <node concept="1ZRNhn" id="3HJD4JbIwyf" role="37wK5m">
                        <node concept="3cmrfG" id="3HJD4JbIwyg" role="2$L3a6">
                          <property role="3cmrfH" value="1" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3clFbF" id="3HJD4JbIwyh" role="3cqZAp">
                <node concept="37vLTI" id="3HJD4JbIwyi" role="3clFbG">
                  <node concept="2OqwBi" id="3HJD4JbIwyj" role="37vLTJ">
                    <node concept="2OwXpG" id="3HJD4JbIwyk" role="2OqNvi">
                      <ref role="2Oxat5" node="3HJD4JbIwwE" resolve="myNext" />
                    </node>
                    <node concept="37vLTw" id="3GM_nagTAmA" role="2Oq$k0">
                      <ref role="3cqZAo" node="3HJD4JbIwxJ" resolve="before" />
                    </node>
                  </node>
                  <node concept="Xjq3P" id="3HJD4JbIwym" role="37vLTx" />
                </node>
              </node>
              <node concept="3clFbF" id="3HJD4JbIwyn" role="3cqZAp">
                <node concept="37vLTI" id="3HJD4JbIwyo" role="3clFbG">
                  <node concept="2OqwBi" id="3HJD4JbIwyp" role="37vLTJ">
                    <node concept="2OwXpG" id="3HJD4JbIwyq" role="2OqNvi">
                      <ref role="2Oxat5" node="3HJD4JbIwwH" resolve="myPrev" />
                    </node>
                    <node concept="37vLTw" id="3GM_nagTvZA" role="2Oq$k0">
                      <ref role="3cqZAo" node="3HJD4JbIwxJ" resolve="before" />
                    </node>
                  </node>
                  <node concept="2OqwBi" id="3HJD4JbIwys" role="37vLTx">
                    <node concept="2OwXpG" id="3HJD4JbIwyt" role="2OqNvi">
                      <ref role="2Oxat5" node="3HJD4JbIwwH" resolve="myPrev" />
                    </node>
                    <node concept="Xjq3P" id="3HJD4JbIwyu" role="2Oq$k0" />
                  </node>
                </node>
              </node>
              <node concept="3clFbJ" id="3HJD4JbIwyv" role="3cqZAp">
                <node concept="3y3z36" id="3HJD4JbIwyw" role="3clFbw">
                  <node concept="2OqwBi" id="3HJD4JbIwyx" role="3uHU7B">
                    <node concept="2OwXpG" id="3HJD4JbIwyy" role="2OqNvi">
                      <ref role="2Oxat5" node="3HJD4JbIwwH" resolve="myPrev" />
                    </node>
                    <node concept="Xjq3P" id="3HJD4JbIwyz" role="2Oq$k0" />
                  </node>
                  <node concept="10Nm6u" id="3HJD4JbIwy$" role="3uHU7w" />
                </node>
                <node concept="3clFbS" id="3HJD4JbIwy_" role="3clFbx">
                  <node concept="3clFbF" id="3HJD4JbIwyA" role="3cqZAp">
                    <node concept="37vLTI" id="3HJD4JbIwyB" role="3clFbG">
                      <node concept="2OqwBi" id="3HJD4JbIwyC" role="37vLTJ">
                        <node concept="2OwXpG" id="3HJD4JbIwyD" role="2OqNvi">
                          <ref role="2Oxat5" node="3HJD4JbIwwE" resolve="myNext" />
                        </node>
                        <node concept="2OqwBi" id="3HJD4JbIwyE" role="2Oq$k0">
                          <node concept="2OwXpG" id="3HJD4JbIwyF" role="2OqNvi">
                            <ref role="2Oxat5" node="3HJD4JbIwwH" resolve="myPrev" />
                          </node>
                          <node concept="Xjq3P" id="3HJD4JbIwyG" role="2Oq$k0" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="3GM_nagT$7y" role="37vLTx">
                        <ref role="3cqZAo" node="3HJD4JbIwxJ" resolve="before" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3clFbF" id="3HJD4JbIwyI" role="3cqZAp">
                <node concept="37vLTI" id="3HJD4JbIwyJ" role="3clFbG">
                  <node concept="2OqwBi" id="3HJD4JbIwyK" role="37vLTJ">
                    <node concept="2OwXpG" id="3HJD4JbIwyL" role="2OqNvi">
                      <ref role="2Oxat5" node="3HJD4JbIwwH" resolve="myPrev" />
                    </node>
                    <node concept="Xjq3P" id="3HJD4JbIwyM" role="2Oq$k0" />
                  </node>
                  <node concept="37vLTw" id="3GM_nagTxaZ" role="37vLTx">
                    <ref role="3cqZAo" node="3HJD4JbIwxJ" resolve="before" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbS" id="3HJD4JbIwyO" role="3clFbx">
            <node concept="3clFbF" id="3HJD4JbIwyP" role="3cqZAp">
              <node concept="37vLTI" id="3HJD4JbIwyQ" role="3clFbG">
                <node concept="37vLTw" id="3GM_nagTyk3" role="37vLTJ">
                  <ref role="3cqZAo" node="3HJD4JbIwxJ" resolve="before" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIwyS" role="37vLTx" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIwyT" role="3cqZAp">
          <node concept="37vLTI" id="3HJD4JbIwyU" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIwyV" role="37vLTJ">
              <node concept="2OwXpG" id="3HJD4JbIwyW" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIwwK" resolve="myFirstIndex" />
              </node>
              <node concept="37vLTw" id="3GM_nagTxTq" role="2Oq$k0">
                <ref role="3cqZAo" node="3HJD4JbIwxJ" resolve="before" />
              </node>
            </node>
            <node concept="37vLTw" id="3GM_nagTybj" role="37vLTx">
              <ref role="3cqZAo" node="3HJD4JbIwxP" resolve="wasFirstIndex" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIwyZ" role="3cqZAp">
          <node concept="37vLTI" id="3HJD4JbIwz0" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIwz1" role="37vLTJ">
              <node concept="2OwXpG" id="3HJD4JbIwz2" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIwwN" resolve="myLastIndex" />
              </node>
              <node concept="37vLTw" id="3GM_nagT_dq" role="2Oq$k0">
                <ref role="3cqZAo" node="3HJD4JbIwxJ" resolve="before" />
              </node>
            </node>
            <node concept="3cpWsd" id="3HJD4JbIwz4" role="37vLTx">
              <node concept="37vLTw" id="2BHiRxgm8jY" role="3uHU7B">
                <ref role="3cqZAo" node="3HJD4JbIwxg" resolve="first" />
              </node>
              <node concept="3cmrfG" id="3HJD4JbIwz6" role="3uHU7w">
                <property role="3cmrfH" value="1" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="3HJD4JbIwz7" role="3cqZAp">
          <node concept="3clFbC" id="3HJD4JbIwz8" role="3clFbw">
            <node concept="37vLTw" id="2BHiRxghfhm" role="3uHU7B">
              <ref role="3cqZAo" node="3HJD4JbIwxg" resolve="first" />
            </node>
            <node concept="37vLTw" id="3GM_nagTuMb" role="3uHU7w">
              <ref role="3cqZAo" node="3HJD4JbIwxP" resolve="wasFirstIndex" />
            </node>
          </node>
          <node concept="3clFbS" id="3HJD4JbIwzb" role="3clFbx">
            <node concept="3clFbF" id="3HJD4JbIwzc" role="3cqZAp">
              <node concept="2OqwBi" id="3HJD4JbIwzd" role="3clFbG">
                <node concept="37vLTw" id="3GM_nagTtY0" role="2Oq$k0">
                  <ref role="3cqZAo" node="3HJD4JbIwxJ" resolve="before" />
                </node>
                <node concept="liA8E" id="3HJD4JbIwzf" role="2OqNvi">
                  <ref role="37wK5l" node="3HJD4JbIw_8" resolve="delete" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="3HJD4JbIwzg" role="3cqZAp">
          <node concept="1Wc70l" id="3HJD4JbIwzh" role="3clFbw">
            <node concept="3clFbC" id="3HJD4JbIwzi" role="3uHU7B">
              <node concept="2OqwBi" id="3HJD4JbIwzj" role="3uHU7B">
                <node concept="2OwXpG" id="3HJD4JbIwzk" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIwwE" resolve="myNext" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIwzl" role="2Oq$k0" />
              </node>
              <node concept="10Nm6u" id="3HJD4JbIwzm" role="3uHU7w" />
            </node>
            <node concept="3y3z36" id="3HJD4JbIwzn" role="3uHU7w">
              <node concept="37vLTw" id="3GM_nagTyP5" role="3uHU7B">
                <ref role="3cqZAo" node="3HJD4JbIwxJ" resolve="before" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIwzp" role="3uHU7w" />
            </node>
          </node>
          <node concept="9aQIb" id="3HJD4JbIwzq" role="9aQIa">
            <node concept="3clFbS" id="3HJD4JbIwzr" role="9aQI4">
              <node concept="3clFbF" id="3HJD4JbIwzs" role="3cqZAp">
                <node concept="37vLTI" id="3HJD4JbIwzt" role="3clFbG">
                  <node concept="37vLTw" id="3GM_nagTt6S" role="37vLTJ">
                    <ref role="3cqZAo" node="3HJD4JbIwxM" resolve="after" />
                  </node>
                  <node concept="2ShNRf" id="3HJD4JbIwzv" role="37vLTx">
                    <node concept="1pGfFk" id="3HJD4JbIwzw" role="2ShVmc">
                      <ref role="37wK5l" node="3HJD4JbIwwU" resolve="FreeZone" />
                      <node concept="1ZRNhn" id="3HJD4JbIwzx" role="37wK5m">
                        <node concept="3cmrfG" id="3HJD4JbIwzy" role="2$L3a6">
                          <property role="3cmrfH" value="1" />
                        </node>
                      </node>
                      <node concept="1ZRNhn" id="3HJD4JbIwzz" role="37wK5m">
                        <node concept="3cmrfG" id="3HJD4JbIwz$" role="2$L3a6">
                          <property role="3cmrfH" value="1" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3clFbF" id="3HJD4JbIwz_" role="3cqZAp">
                <node concept="37vLTI" id="3HJD4JbIwzA" role="3clFbG">
                  <node concept="2OqwBi" id="3HJD4JbIwzB" role="37vLTJ">
                    <node concept="2OwXpG" id="3HJD4JbIwzC" role="2OqNvi">
                      <ref role="2Oxat5" node="3HJD4JbIwwH" resolve="myPrev" />
                    </node>
                    <node concept="37vLTw" id="3GM_nagTuP3" role="2Oq$k0">
                      <ref role="3cqZAo" node="3HJD4JbIwxM" resolve="after" />
                    </node>
                  </node>
                  <node concept="Xjq3P" id="3HJD4JbIwzE" role="37vLTx" />
                </node>
              </node>
              <node concept="3clFbF" id="3HJD4JbIwzF" role="3cqZAp">
                <node concept="37vLTI" id="3HJD4JbIwzG" role="3clFbG">
                  <node concept="2OqwBi" id="3HJD4JbIwzH" role="37vLTJ">
                    <node concept="2OwXpG" id="3HJD4JbIwzI" role="2OqNvi">
                      <ref role="2Oxat5" node="3HJD4JbIwwE" resolve="myNext" />
                    </node>
                    <node concept="37vLTw" id="3GM_nagTrKy" role="2Oq$k0">
                      <ref role="3cqZAo" node="3HJD4JbIwxM" resolve="after" />
                    </node>
                  </node>
                  <node concept="2OqwBi" id="3HJD4JbIwzK" role="37vLTx">
                    <node concept="2OwXpG" id="3HJD4JbIwzL" role="2OqNvi">
                      <ref role="2Oxat5" node="3HJD4JbIwwE" resolve="myNext" />
                    </node>
                    <node concept="Xjq3P" id="3HJD4JbIwzM" role="2Oq$k0" />
                  </node>
                </node>
              </node>
              <node concept="3clFbJ" id="3HJD4JbIwzN" role="3cqZAp">
                <node concept="3y3z36" id="3HJD4JbIwzO" role="3clFbw">
                  <node concept="2OqwBi" id="3HJD4JbIwzP" role="3uHU7B">
                    <node concept="2OwXpG" id="3HJD4JbIwzQ" role="2OqNvi">
                      <ref role="2Oxat5" node="3HJD4JbIwwE" resolve="myNext" />
                    </node>
                    <node concept="Xjq3P" id="3HJD4JbIwzR" role="2Oq$k0" />
                  </node>
                  <node concept="10Nm6u" id="3HJD4JbIwzS" role="3uHU7w" />
                </node>
                <node concept="3clFbS" id="3HJD4JbIwzT" role="3clFbx">
                  <node concept="3clFbF" id="3HJD4JbIwzU" role="3cqZAp">
                    <node concept="37vLTI" id="3HJD4JbIwzV" role="3clFbG">
                      <node concept="2OqwBi" id="3HJD4JbIwzW" role="37vLTJ">
                        <node concept="2OwXpG" id="3HJD4JbIwzX" role="2OqNvi">
                          <ref role="2Oxat5" node="3HJD4JbIwwH" resolve="myPrev" />
                        </node>
                        <node concept="2OqwBi" id="3HJD4JbIwzY" role="2Oq$k0">
                          <node concept="2OwXpG" id="3HJD4JbIwzZ" role="2OqNvi">
                            <ref role="2Oxat5" node="3HJD4JbIwwE" resolve="myNext" />
                          </node>
                          <node concept="Xjq3P" id="3HJD4JbIw$0" role="2Oq$k0" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="3GM_nagTASr" role="37vLTx">
                        <ref role="3cqZAo" node="3HJD4JbIwxM" resolve="after" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3clFbF" id="3HJD4JbIw$2" role="3cqZAp">
                <node concept="37vLTI" id="3HJD4JbIw$3" role="3clFbG">
                  <node concept="2OqwBi" id="3HJD4JbIw$4" role="37vLTJ">
                    <node concept="2OwXpG" id="3HJD4JbIw$5" role="2OqNvi">
                      <ref role="2Oxat5" node="3HJD4JbIwwE" resolve="myNext" />
                    </node>
                    <node concept="Xjq3P" id="3HJD4JbIw$6" role="2Oq$k0" />
                  </node>
                  <node concept="37vLTw" id="3GM_nagTtAh" role="37vLTx">
                    <ref role="3cqZAo" node="3HJD4JbIwxM" resolve="after" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbS" id="3HJD4JbIw$8" role="3clFbx">
            <node concept="3clFbF" id="3HJD4JbIw$9" role="3cqZAp">
              <node concept="37vLTI" id="3HJD4JbIw$a" role="3clFbG">
                <node concept="37vLTw" id="3GM_nagTtK7" role="37vLTJ">
                  <ref role="3cqZAo" node="3HJD4JbIwxM" resolve="after" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIw$c" role="37vLTx" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIw$d" role="3cqZAp">
          <node concept="37vLTI" id="3HJD4JbIw$e" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIw$f" role="37vLTJ">
              <node concept="2OwXpG" id="3HJD4JbIw$g" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIwwK" resolve="myFirstIndex" />
              </node>
              <node concept="37vLTw" id="3GM_nagTtVq" role="2Oq$k0">
                <ref role="3cqZAo" node="3HJD4JbIwxM" resolve="after" />
              </node>
            </node>
            <node concept="3cpWs3" id="3HJD4JbIw$i" role="37vLTx">
              <node concept="37vLTw" id="2BHiRxglIdd" role="3uHU7B">
                <ref role="3cqZAo" node="3HJD4JbIwxi" resolve="last" />
              </node>
              <node concept="3cmrfG" id="3HJD4JbIw$k" role="3uHU7w">
                <property role="3cmrfH" value="1" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIw$l" role="3cqZAp">
          <node concept="37vLTI" id="3HJD4JbIw$m" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIw$n" role="37vLTJ">
              <node concept="2OwXpG" id="3HJD4JbIw$o" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIwwN" resolve="myLastIndex" />
              </node>
              <node concept="37vLTw" id="3GM_nagTshq" role="2Oq$k0">
                <ref role="3cqZAo" node="3HJD4JbIwxM" resolve="after" />
              </node>
            </node>
            <node concept="37vLTw" id="3GM_nagTAB4" role="37vLTx">
              <ref role="3cqZAo" node="3HJD4JbIwxV" resolve="wasLastIndex" />
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="3HJD4JbIw$r" role="3cqZAp">
          <node concept="3clFbC" id="3HJD4JbIw$s" role="3clFbw">
            <node concept="37vLTw" id="2BHiRxgm_hW" role="3uHU7B">
              <ref role="3cqZAo" node="3HJD4JbIwxi" resolve="last" />
            </node>
            <node concept="37vLTw" id="3GM_nagTrpS" role="3uHU7w">
              <ref role="3cqZAo" node="3HJD4JbIwxV" resolve="wasLastIndex" />
            </node>
          </node>
          <node concept="3clFbS" id="3HJD4JbIw$v" role="3clFbx">
            <node concept="3clFbF" id="3HJD4JbIw$w" role="3cqZAp">
              <node concept="2OqwBi" id="3HJD4JbIw$x" role="3clFbG">
                <node concept="37vLTw" id="3GM_nagTrpa" role="2Oq$k0">
                  <ref role="3cqZAo" node="3HJD4JbIwxM" resolve="after" />
                </node>
                <node concept="liA8E" id="3HJD4JbIw$z" role="2OqNvi">
                  <ref role="37wK5l" node="3HJD4JbIw_8" resolve="delete" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="3HJD4JbIw$$" role="3cqZAp">
          <node concept="3clFbT" id="3HJD4JbIw$_" role="3cqZAk">
            <property role="3clFbU" value="true" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIw$A" role="jymVt">
      <property role="TrG5h" value="canBeAdded" />
      <node concept="3Tm1VV" id="3HJD4JbIw$B" role="1B3o_S" />
      <node concept="10P_77" id="3HJD4JbIw$C" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIw$D" role="3clF46">
        <property role="TrG5h" value="first" />
        <node concept="10Oyi0" id="3HJD4JbIw$E" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIw$F" role="3clF46">
        <property role="TrG5h" value="last" />
        <node concept="10Oyi0" id="3HJD4JbIw$G" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="3HJD4JbIw$H" role="3clF47">
        <node concept="3cpWs8" id="3HJD4JbIw$I" role="3cqZAp">
          <node concept="3cpWsn" id="3HJD4JbIw$J" role="3cpWs9">
            <property role="TrG5h" value="current" />
            <node concept="3uibUv" id="3HJD4JbIw$K" role="1tU5fm">
              <ref role="3uigEE" node="3HJD4JbIwwC" resolve="FreeZone" />
            </node>
            <node concept="Xjq3P" id="3HJD4JbIw$L" role="33vP2m" />
          </node>
        </node>
        <node concept="2$JKZl" id="3HJD4JbIw$M" role="3cqZAp">
          <node concept="3y3z36" id="3HJD4JbIw$N" role="2$JKZa">
            <node concept="37vLTw" id="3GM_nagTAfa" role="3uHU7B">
              <ref role="3cqZAo" node="3HJD4JbIw$J" resolve="current" />
            </node>
            <node concept="10Nm6u" id="3HJD4JbIw$P" role="3uHU7w" />
          </node>
          <node concept="3clFbS" id="3HJD4JbIw$Q" role="2LFqv$">
            <node concept="3clFbJ" id="3HJD4JbIw$R" role="3cqZAp">
              <node concept="2OqwBi" id="3HJD4JbIw$S" role="3clFbw">
                <node concept="37vLTw" id="3GM_nagTx72" role="2Oq$k0">
                  <ref role="3cqZAo" node="3HJD4JbIw$J" resolve="current" />
                </node>
                <node concept="liA8E" id="3HJD4JbIw$U" role="2OqNvi">
                  <ref role="37wK5l" node="3HJD4JbIwxd" resolve="insert" />
                  <node concept="37vLTw" id="2BHiRxgm5Q6" role="37wK5m">
                    <ref role="3cqZAo" node="3HJD4JbIw$D" resolve="first" />
                  </node>
                  <node concept="37vLTw" id="2BHiRxgm9Qg" role="37wK5m">
                    <ref role="3cqZAo" node="3HJD4JbIw$F" resolve="last" />
                  </node>
                </node>
              </node>
              <node concept="3clFbS" id="3HJD4JbIw$X" role="3clFbx">
                <node concept="3cpWs6" id="3HJD4JbIw$Y" role="3cqZAp">
                  <node concept="3clFbT" id="3HJD4JbIw$Z" role="3cqZAk">
                    <property role="3clFbU" value="true" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbF" id="3HJD4JbIw_0" role="3cqZAp">
              <node concept="37vLTI" id="3HJD4JbIw_1" role="3clFbG">
                <node concept="37vLTw" id="3GM_nagTwAc" role="37vLTJ">
                  <ref role="3cqZAo" node="3HJD4JbIw$J" resolve="current" />
                </node>
                <node concept="2OqwBi" id="3HJD4JbIw_3" role="37vLTx">
                  <node concept="2OwXpG" id="3HJD4JbIw_4" role="2OqNvi">
                    <ref role="2Oxat5" node="3HJD4JbIwwE" resolve="myNext" />
                  </node>
                  <node concept="37vLTw" id="3GM_nagTyaS" role="2Oq$k0">
                    <ref role="3cqZAo" node="3HJD4JbIw$J" resolve="current" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="3HJD4JbIw_6" role="3cqZAp">
          <node concept="3clFbT" id="3HJD4JbIw_7" role="3cqZAk" />
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIw_8" role="jymVt">
      <property role="TrG5h" value="delete" />
      <node concept="3Tm6S6" id="3HJD4JbIw_9" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIw_a" role="3clF45" />
      <node concept="3clFbS" id="3HJD4JbIw_b" role="3clF47">
        <node concept="3clFbJ" id="3HJD4JbIw_c" role="3cqZAp">
          <node concept="3y3z36" id="3HJD4JbIw_d" role="3clFbw">
            <node concept="2OqwBi" id="3HJD4JbIw_e" role="3uHU7B">
              <node concept="2OwXpG" id="3HJD4JbIw_f" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIwwH" resolve="myPrev" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIw_g" role="2Oq$k0" />
            </node>
            <node concept="10Nm6u" id="3HJD4JbIw_h" role="3uHU7w" />
          </node>
          <node concept="3clFbS" id="3HJD4JbIw_i" role="3clFbx">
            <node concept="3clFbF" id="3HJD4JbIw_j" role="3cqZAp">
              <node concept="37vLTI" id="3HJD4JbIw_k" role="3clFbG">
                <node concept="2OqwBi" id="3HJD4JbIw_l" role="37vLTJ">
                  <node concept="2OwXpG" id="3HJD4JbIw_m" role="2OqNvi">
                    <ref role="2Oxat5" node="3HJD4JbIwwE" resolve="myNext" />
                  </node>
                  <node concept="2OqwBi" id="3HJD4JbIw_n" role="2Oq$k0">
                    <node concept="2OwXpG" id="3HJD4JbIw_o" role="2OqNvi">
                      <ref role="2Oxat5" node="3HJD4JbIwwH" resolve="myPrev" />
                    </node>
                    <node concept="Xjq3P" id="3HJD4JbIw_p" role="2Oq$k0" />
                  </node>
                </node>
                <node concept="2OqwBi" id="3HJD4JbIw_q" role="37vLTx">
                  <node concept="2OwXpG" id="3HJD4JbIw_r" role="2OqNvi">
                    <ref role="2Oxat5" node="3HJD4JbIwwE" resolve="myNext" />
                  </node>
                  <node concept="Xjq3P" id="3HJD4JbIw_s" role="2Oq$k0" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="3HJD4JbIw_t" role="3cqZAp">
          <node concept="3y3z36" id="3HJD4JbIw_u" role="3clFbw">
            <node concept="2OqwBi" id="3HJD4JbIw_v" role="3uHU7B">
              <node concept="2OwXpG" id="3HJD4JbIw_w" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIwwE" resolve="myNext" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIw_x" role="2Oq$k0" />
            </node>
            <node concept="10Nm6u" id="3HJD4JbIw_y" role="3uHU7w" />
          </node>
          <node concept="3clFbS" id="3HJD4JbIw_z" role="3clFbx">
            <node concept="3clFbF" id="3HJD4JbIw_$" role="3cqZAp">
              <node concept="37vLTI" id="3HJD4JbIw__" role="3clFbG">
                <node concept="2OqwBi" id="3HJD4JbIw_A" role="37vLTJ">
                  <node concept="2OwXpG" id="3HJD4JbIw_B" role="2OqNvi">
                    <ref role="2Oxat5" node="3HJD4JbIwwH" resolve="myPrev" />
                  </node>
                  <node concept="2OqwBi" id="3HJD4JbIw_C" role="2Oq$k0">
                    <node concept="2OwXpG" id="3HJD4JbIw_D" role="2OqNvi">
                      <ref role="2Oxat5" node="3HJD4JbIwwE" resolve="myNext" />
                    </node>
                    <node concept="Xjq3P" id="3HJD4JbIw_E" role="2Oq$k0" />
                  </node>
                </node>
                <node concept="2OqwBi" id="3HJD4JbIw_F" role="37vLTx">
                  <node concept="2OwXpG" id="3HJD4JbIw_G" role="2OqNvi">
                    <ref role="2Oxat5" node="3HJD4JbIwwH" resolve="myPrev" />
                  </node>
                  <node concept="Xjq3P" id="3HJD4JbIw_H" role="2Oq$k0" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIw_I" role="3cqZAp">
          <node concept="37vLTI" id="3HJD4JbIw_J" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIw_K" role="37vLTJ">
              <node concept="2OwXpG" id="3HJD4JbIw_L" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIwwQ" resolve="myIsDeleted" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIw_M" role="2Oq$k0" />
            </node>
            <node concept="3clFbT" id="3HJD4JbIw_N" role="37vLTx">
              <property role="3clFbU" value="true" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="312cEu" id="3HJD4JbIw_O">
    <property role="TrG5h" value="ReadBlock" />
    <property role="3GE5qa" value="block" />
    <node concept="3Tm1VV" id="3HJD4JbIw_P" role="1B3o_S" />
    <node concept="3uibUv" id="3HJD4JbIw_T" role="1zkMxy">
      <ref role="3uigEE" node="3HJD4JbIvLb" resolve="AbstractBlock" />
    </node>
    <node concept="3clFbW" id="3HJD4JbIw_V" role="jymVt">
      <node concept="3Tm1VV" id="3HJD4JbIw_W" role="1B3o_S" />
      <node concept="37vLTG" id="3HJD4JbIw_X" role="3clF46">
        <property role="TrG5h" value="x" />
        <node concept="10Oyi0" id="3HJD4JbIw_Y" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIw_Z" role="3clF46">
        <property role="TrG5h" value="y" />
        <node concept="10Oyi0" id="3HJD4JbIwA0" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIwA1" role="3clF46">
        <property role="TrG5h" value="width" />
        <node concept="10Oyi0" id="3HJD4JbIwA2" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIwA3" role="3clF46">
        <property role="TrG5h" value="height" />
        <node concept="10Oyi0" id="3HJD4JbIwA4" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIwA5" role="3clF46">
        <property role="TrG5h" value="source" />
        <node concept="3uibUv" id="6bzHk29ogpN" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNodeReference" resolve="SNodeReference" />
        </node>
      </node>
      <node concept="37vLTG" id="6j7_9uL$zAb" role="3clF46">
        <property role="TrG5h" value="caption" />
        <node concept="3uibUv" id="6j7_9uL$zAd" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="37vLTG" id="GzG95Qn82_" role="3clF46">
        <property role="TrG5h" value="ruleNodeReference" />
        <node concept="3uibUv" id="GzG95Qn82A" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIwA7" role="3clF47">
        <node concept="XkiVB" id="3HJD4JbIwA8" role="3cqZAp">
          <ref role="37wK5l" node="3HJD4JbIvLU" resolve="AbstractBlock" />
          <node concept="37vLTw" id="2BHiRxgmtuV" role="37wK5m">
            <ref role="3cqZAo" node="3HJD4JbIw_X" resolve="x" />
          </node>
          <node concept="37vLTw" id="2BHiRxgm84u" role="37wK5m">
            <ref role="3cqZAo" node="3HJD4JbIw_Z" resolve="y" />
          </node>
          <node concept="37vLTw" id="2BHiRxglPgB" role="37wK5m">
            <ref role="3cqZAo" node="3HJD4JbIwA1" resolve="width" />
          </node>
          <node concept="37vLTw" id="2BHiRxgm2SJ" role="37wK5m">
            <ref role="3cqZAo" node="3HJD4JbIwA3" resolve="height" />
          </node>
          <node concept="37vLTw" id="2BHiRxgheJe" role="37wK5m">
            <ref role="3cqZAo" node="3HJD4JbIwA5" resolve="source" />
          </node>
          <node concept="37vLTw" id="2BHiRxgmyvd" role="37wK5m">
            <ref role="3cqZAo" node="6j7_9uL$zAb" resolve="caption" />
          </node>
          <node concept="37vLTw" id="GzG95Qn9rs" role="37wK5m">
            <ref role="3cqZAo" node="GzG95Qn82_" resolve="ruleNodeReference" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIwAe" role="jymVt">
      <property role="TrG5h" value="paintBlock" />
      <node concept="3Tm1VV" id="3HJD4JbIwAf" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIwAg" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIwAh" role="3clF46">
        <property role="TrG5h" value="g" />
        <node concept="3uibUv" id="3HJD4JbIwAi" role="1tU5fm">
          <ref role="3uigEE" to="z60i:~Graphics" resolve="Graphics" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIwAj" role="3clF47">
        <node concept="3clFbF" id="3HJD4JbIwAk" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIwAl" role="3clFbG">
            <node concept="37vLTw" id="2BHiRxgmycV" role="2Oq$k0">
              <ref role="3cqZAo" node="3HJD4JbIwAh" resolve="g" />
            </node>
            <node concept="liA8E" id="3HJD4JbIwAn" role="2OqNvi">
              <ref role="37wK5l" to="z60i:~Graphics.setColor(java.awt.Color):void" resolve="setColor" />
              <node concept="2ShNRf" id="3HJD4JbIwAo" role="37wK5m">
                <node concept="1pGfFk" id="3HJD4JbIwAp" role="2ShVmc">
                  <ref role="37wK5l" to="z60i:~Color.&lt;init&gt;(int,int,int)" resolve="Color" />
                  <node concept="3cmrfG" id="3HJD4JbIwAq" role="37wK5m">
                    <property role="3cmrfH" value="150" />
                  </node>
                  <node concept="3cmrfG" id="3HJD4JbIwAr" role="37wK5m">
                    <property role="3cmrfH" value="190" />
                  </node>
                  <node concept="3cmrfG" id="3HJD4JbIwAs" role="37wK5m">
                    <property role="3cmrfH" value="245" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIwAt" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIwAu" role="3clFbG">
            <node concept="37vLTw" id="2BHiRxglnL_" role="2Oq$k0">
              <ref role="3cqZAo" node="3HJD4JbIwAh" resolve="g" />
            </node>
            <node concept="liA8E" id="3HJD4JbIwAw" role="2OqNvi">
              <ref role="37wK5l" to="z60i:~Graphics.fillRect(int,int,int,int):void" resolve="fillRect" />
              <node concept="2OqwBi" id="3HJD4JbIwAx" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIwAy" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLi" resolve="myX" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIwAz" role="2Oq$k0" />
              </node>
              <node concept="2OqwBi" id="3HJD4JbIwA$" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIwA_" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLl" resolve="myY" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIwAA" role="2Oq$k0" />
              </node>
              <node concept="2OqwBi" id="3HJD4JbIwAB" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIwAC" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLo" resolve="myWidth" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIwAD" role="2Oq$k0" />
              </node>
              <node concept="2OqwBi" id="3HJD4JbIwAE" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIwAF" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLr" resolve="myHeight" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIwAG" role="2Oq$k0" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIwAH" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIwAI" role="3clFbG">
            <node concept="37vLTw" id="2BHiRxghiTc" role="2Oq$k0">
              <ref role="3cqZAo" node="3HJD4JbIwAh" resolve="g" />
            </node>
            <node concept="liA8E" id="3HJD4JbIwAK" role="2OqNvi">
              <ref role="37wK5l" to="z60i:~Graphics.setColor(java.awt.Color):void" resolve="setColor" />
              <node concept="10M0yZ" id="3HJD4JbIwAL" role="37wK5m">
                <ref role="1PxDUh" to="z60i:~Color" resolve="Color" />
                <ref role="3cqZAo" to="z60i:~Color.BLACK" resolve="BLACK" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIwAM" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIwAN" role="3clFbG">
            <node concept="37vLTw" id="2BHiRxglpOR" role="2Oq$k0">
              <ref role="3cqZAo" node="3HJD4JbIwAh" resolve="g" />
            </node>
            <node concept="liA8E" id="3HJD4JbIwAP" role="2OqNvi">
              <ref role="37wK5l" to="z60i:~Graphics.drawRect(int,int,int,int):void" resolve="drawRect" />
              <node concept="2OqwBi" id="3HJD4JbIwAQ" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIwAR" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLi" resolve="myX" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIwAS" role="2Oq$k0" />
              </node>
              <node concept="2OqwBi" id="3HJD4JbIwAT" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIwAU" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLl" resolve="myY" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIwAV" role="2Oq$k0" />
              </node>
              <node concept="2OqwBi" id="3HJD4JbIwAW" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIwAX" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLo" resolve="myWidth" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIwAY" role="2Oq$k0" />
              </node>
              <node concept="2OqwBi" id="3HJD4JbIwAZ" role="37wK5m">
                <node concept="2OwXpG" id="3HJD4JbIwB0" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIvLr" resolve="myHeight" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIwB1" role="2Oq$k0" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3tYsUK_Ut54" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
  </node>
  <node concept="3HP615" id="3HJD4JbIwB2">
    <property role="TrG5h" value="IProgram" />
    <node concept="3Tm1VV" id="3HJD4JbIwB3" role="1B3o_S" />
    <node concept="16euLQ" id="3HJD4JbIwB4" role="16eVyc">
      <property role="3ztuRv" value="true" />
      <property role="TrG5h" value="T" />
      <node concept="3uibUv" id="3HJD4JbIwB5" role="3ztrMU">
        <ref role="3uigEE" node="3HJD4JbIvSt" resolve="IInstruction" />
        <node concept="16syzq" id="3HJD4JbIwB6" role="11_B2D">
          <ref role="16sUi3" node="3HJD4JbIwB4" resolve="T" />
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIwB7" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="getStart" />
      <node concept="3Tm1VV" id="3HJD4JbIwB8" role="1B3o_S" />
      <node concept="3uibUv" id="3HJD4JbIwB9" role="3clF45">
        <ref role="3uigEE" node="3HJD4JbIvSt" resolve="IInstruction" />
        <node concept="16syzq" id="3HJD4JbIwBa" role="11_B2D">
          <ref role="16sUi3" node="3HJD4JbIwB4" resolve="T" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIwBb" role="3clF47" />
    </node>
    <node concept="3clFb_" id="3HJD4JbIwBc" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="getEnd" />
      <node concept="3Tm1VV" id="3HJD4JbIwBd" role="1B3o_S" />
      <node concept="3uibUv" id="3HJD4JbIwBe" role="3clF45">
        <ref role="3uigEE" node="3HJD4JbIvSt" resolve="IInstruction" />
        <node concept="16syzq" id="3HJD4JbIwBf" role="11_B2D">
          <ref role="16sUi3" node="3HJD4JbIwB4" resolve="T" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIwBg" role="3clF47" />
    </node>
    <node concept="3clFb_" id="3HJD4JbIwBh" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="getInstructions" />
      <node concept="3Tm1VV" id="3HJD4JbIwBi" role="1B3o_S" />
      <node concept="3uibUv" id="3HJD4JbIwBj" role="3clF45">
        <ref role="3uigEE" to="33ny:~List" resolve="List" />
        <node concept="3uibUv" id="3HJD4JbIwBk" role="11_B2D">
          <ref role="3uigEE" node="3HJD4JbIvSt" resolve="IInstruction" />
          <node concept="16syzq" id="3HJD4JbIwBl" role="11_B2D">
            <ref role="16sUi3" node="3HJD4JbIwB4" resolve="T" />
          </node>
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIwBm" role="3clF47" />
    </node>
  </node>
  <node concept="Qs71p" id="3HJD4JbIwBn">
    <property role="TrG5h" value="ArrowHeadDirection" />
    <node concept="3Tm1VV" id="3HJD4JbIwBo" role="1B3o_S" />
    <node concept="QsSxf" id="3HJD4JbIwBp" role="Qtgdg">
      <property role="TrG5h" value="NONE" />
      <ref role="37wK5l" node="3HJD4JbIwEc" resolve="ArrowHeadDirection" />
      <node concept="3clFb_" id="3HJD4JbIwBq" role="2HKRsH">
        <property role="TrG5h" value="paint" />
        <node concept="3Tm1VV" id="3HJD4JbIwBr" role="1B3o_S" />
        <node concept="3cqZAl" id="3HJD4JbIwBs" role="3clF45" />
        <node concept="37vLTG" id="3HJD4JbIwBt" role="3clF46">
          <property role="TrG5h" value="g" />
          <node concept="3uibUv" id="3HJD4JbIwBu" role="1tU5fm">
            <ref role="3uigEE" to="z60i:~Graphics" resolve="Graphics" />
          </node>
        </node>
        <node concept="37vLTG" id="3HJD4JbIwBv" role="3clF46">
          <property role="TrG5h" value="x" />
          <node concept="10Oyi0" id="3HJD4JbIwBw" role="1tU5fm" />
        </node>
        <node concept="37vLTG" id="3HJD4JbIwBx" role="3clF46">
          <property role="TrG5h" value="y" />
          <node concept="10Oyi0" id="3HJD4JbIwBy" role="1tU5fm" />
        </node>
        <node concept="3clFbS" id="3HJD4JbIwBz" role="3clF47" />
      </node>
    </node>
    <node concept="QsSxf" id="3HJD4JbIwB$" role="Qtgdg">
      <property role="TrG5h" value="UP" />
      <ref role="37wK5l" node="3HJD4JbIwEc" resolve="ArrowHeadDirection" />
      <node concept="3clFb_" id="3HJD4JbIwB_" role="2HKRsH">
        <property role="TrG5h" value="paint" />
        <node concept="3Tm1VV" id="3HJD4JbIwBA" role="1B3o_S" />
        <node concept="3cqZAl" id="3HJD4JbIwBB" role="3clF45" />
        <node concept="37vLTG" id="3HJD4JbIwBC" role="3clF46">
          <property role="TrG5h" value="g" />
          <node concept="3uibUv" id="3HJD4JbIwBD" role="1tU5fm">
            <ref role="3uigEE" to="z60i:~Graphics" resolve="Graphics" />
          </node>
        </node>
        <node concept="37vLTG" id="3HJD4JbIwBE" role="3clF46">
          <property role="TrG5h" value="x" />
          <node concept="10Oyi0" id="3HJD4JbIwBF" role="1tU5fm" />
        </node>
        <node concept="37vLTG" id="3HJD4JbIwBG" role="3clF46">
          <property role="TrG5h" value="y" />
          <node concept="10Oyi0" id="3HJD4JbIwBH" role="1tU5fm" />
        </node>
        <node concept="3clFbS" id="3HJD4JbIwBI" role="3clF47">
          <node concept="3clFbF" id="3HJD4JbIwBJ" role="3cqZAp">
            <node concept="2OqwBi" id="3HJD4JbIwBK" role="3clFbG">
              <node concept="37vLTw" id="2BHiRxgmhF5" role="2Oq$k0">
                <ref role="3cqZAo" node="3HJD4JbIwBC" resolve="g" />
              </node>
              <node concept="liA8E" id="3HJD4JbIwBM" role="2OqNvi">
                <ref role="37wK5l" to="z60i:~Graphics.setColor(java.awt.Color):void" resolve="setColor" />
                <node concept="10M0yZ" id="3HJD4JbIwBN" role="37wK5m">
                  <ref role="1PxDUh" to="z60i:~Color" resolve="Color" />
                  <ref role="3cqZAo" to="z60i:~Color.BLACK" resolve="BLACK" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbF" id="3HJD4JbIwBO" role="3cqZAp">
            <node concept="2OqwBi" id="3HJD4JbIwBP" role="3clFbG">
              <node concept="37vLTw" id="2BHiRxgmP6V" role="2Oq$k0">
                <ref role="3cqZAo" node="3HJD4JbIwBC" resolve="g" />
              </node>
              <node concept="liA8E" id="3HJD4JbIwBR" role="2OqNvi">
                <ref role="37wK5l" to="z60i:~Graphics.drawLine(int,int,int,int):void" resolve="drawLine" />
                <node concept="3cpWsd" id="3HJD4JbIwBS" role="37wK5m">
                  <node concept="37vLTw" id="2BHiRxglYD2" role="3uHU7B">
                    <ref role="3cqZAo" node="3HJD4JbIwBE" resolve="x" />
                  </node>
                  <node concept="37vLTw" id="2BHiRxeoou1" role="3uHU7w">
                    <ref role="3cqZAo" node="3HJD4JbIwE4" resolve="HALFWIDTH" />
                  </node>
                </node>
                <node concept="3cpWs3" id="3HJD4JbIwBV" role="37wK5m">
                  <node concept="37vLTw" id="2BHiRxglIQN" role="3uHU7B">
                    <ref role="3cqZAo" node="3HJD4JbIwBG" resolve="y" />
                  </node>
                  <node concept="37vLTw" id="2BHiRxeorFb" role="3uHU7w">
                    <ref role="3cqZAo" node="3HJD4JbIwE8" resolve="LENGTH" />
                  </node>
                </node>
                <node concept="37vLTw" id="2BHiRxgmb60" role="37wK5m">
                  <ref role="3cqZAo" node="3HJD4JbIwBE" resolve="x" />
                </node>
                <node concept="37vLTw" id="2BHiRxglWK1" role="37wK5m">
                  <ref role="3cqZAo" node="3HJD4JbIwBG" resolve="y" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbF" id="3HJD4JbIwC0" role="3cqZAp">
            <node concept="2OqwBi" id="3HJD4JbIwC1" role="3clFbG">
              <node concept="37vLTw" id="2BHiRxghire" role="2Oq$k0">
                <ref role="3cqZAo" node="3HJD4JbIwBC" resolve="g" />
              </node>
              <node concept="liA8E" id="3HJD4JbIwC3" role="2OqNvi">
                <ref role="37wK5l" to="z60i:~Graphics.drawLine(int,int,int,int):void" resolve="drawLine" />
                <node concept="3cpWs3" id="3HJD4JbIwC4" role="37wK5m">
                  <node concept="37vLTw" id="2BHiRxgm8ud" role="3uHU7B">
                    <ref role="3cqZAo" node="3HJD4JbIwBE" resolve="x" />
                  </node>
                  <node concept="37vLTw" id="2BHiRxeoeir" role="3uHU7w">
                    <ref role="3cqZAo" node="3HJD4JbIwE4" resolve="HALFWIDTH" />
                  </node>
                </node>
                <node concept="3cpWs3" id="3HJD4JbIwC7" role="37wK5m">
                  <node concept="37vLTw" id="2BHiRxglB28" role="3uHU7B">
                    <ref role="3cqZAo" node="3HJD4JbIwBG" resolve="y" />
                  </node>
                  <node concept="37vLTw" id="2BHiRxeon3J" role="3uHU7w">
                    <ref role="3cqZAo" node="3HJD4JbIwE8" resolve="LENGTH" />
                  </node>
                </node>
                <node concept="37vLTw" id="2BHiRxglPkp" role="37wK5m">
                  <ref role="3cqZAo" node="3HJD4JbIwBE" resolve="x" />
                </node>
                <node concept="37vLTw" id="2BHiRxgmIWf" role="37wK5m">
                  <ref role="3cqZAo" node="3HJD4JbIwBG" resolve="y" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="QsSxf" id="3HJD4JbIwCc" role="Qtgdg">
      <property role="TrG5h" value="DOWN" />
      <ref role="37wK5l" node="3HJD4JbIwEc" resolve="ArrowHeadDirection" />
      <node concept="3clFb_" id="3HJD4JbIwCd" role="2HKRsH">
        <property role="TrG5h" value="paint" />
        <node concept="3Tm1VV" id="3HJD4JbIwCe" role="1B3o_S" />
        <node concept="3cqZAl" id="3HJD4JbIwCf" role="3clF45" />
        <node concept="37vLTG" id="3HJD4JbIwCg" role="3clF46">
          <property role="TrG5h" value="g" />
          <node concept="3uibUv" id="3HJD4JbIwCh" role="1tU5fm">
            <ref role="3uigEE" to="z60i:~Graphics" resolve="Graphics" />
          </node>
        </node>
        <node concept="37vLTG" id="3HJD4JbIwCi" role="3clF46">
          <property role="TrG5h" value="x" />
          <node concept="10Oyi0" id="3HJD4JbIwCj" role="1tU5fm" />
        </node>
        <node concept="37vLTG" id="3HJD4JbIwCk" role="3clF46">
          <property role="TrG5h" value="y" />
          <node concept="10Oyi0" id="3HJD4JbIwCl" role="1tU5fm" />
        </node>
        <node concept="3clFbS" id="3HJD4JbIwCm" role="3clF47">
          <node concept="3clFbF" id="3HJD4JbIwCn" role="3cqZAp">
            <node concept="2OqwBi" id="3HJD4JbIwCo" role="3clFbG">
              <node concept="37vLTw" id="2BHiRxgm9kJ" role="2Oq$k0">
                <ref role="3cqZAo" node="3HJD4JbIwCg" resolve="g" />
              </node>
              <node concept="liA8E" id="3HJD4JbIwCq" role="2OqNvi">
                <ref role="37wK5l" to="z60i:~Graphics.setColor(java.awt.Color):void" resolve="setColor" />
                <node concept="10M0yZ" id="3HJD4JbIwCr" role="37wK5m">
                  <ref role="1PxDUh" to="z60i:~Color" resolve="Color" />
                  <ref role="3cqZAo" to="z60i:~Color.BLACK" resolve="BLACK" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbF" id="3HJD4JbIwCs" role="3cqZAp">
            <node concept="2OqwBi" id="3HJD4JbIwCt" role="3clFbG">
              <node concept="37vLTw" id="2BHiRxghgC8" role="2Oq$k0">
                <ref role="3cqZAo" node="3HJD4JbIwCg" resolve="g" />
              </node>
              <node concept="liA8E" id="3HJD4JbIwCv" role="2OqNvi">
                <ref role="37wK5l" to="z60i:~Graphics.drawLine(int,int,int,int):void" resolve="drawLine" />
                <node concept="3cpWsd" id="3HJD4JbIwCw" role="37wK5m">
                  <node concept="37vLTw" id="2BHiRxglsdO" role="3uHU7B">
                    <ref role="3cqZAo" node="3HJD4JbIwCi" resolve="x" />
                  </node>
                  <node concept="37vLTw" id="2BHiRxeoeiz" role="3uHU7w">
                    <ref role="3cqZAo" node="3HJD4JbIwE4" resolve="HALFWIDTH" />
                  </node>
                </node>
                <node concept="3cpWsd" id="3HJD4JbIwCz" role="37wK5m">
                  <node concept="37vLTw" id="2BHiRxgmasK" role="3uHU7B">
                    <ref role="3cqZAo" node="3HJD4JbIwCk" resolve="y" />
                  </node>
                  <node concept="37vLTw" id="2BHiRxeoidx" role="3uHU7w">
                    <ref role="3cqZAo" node="3HJD4JbIwE8" resolve="LENGTH" />
                  </node>
                </node>
                <node concept="37vLTw" id="2BHiRxgm2js" role="37wK5m">
                  <ref role="3cqZAo" node="3HJD4JbIwCi" resolve="x" />
                </node>
                <node concept="37vLTw" id="2BHiRxgl3lp" role="37wK5m">
                  <ref role="3cqZAo" node="3HJD4JbIwCk" resolve="y" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbF" id="3HJD4JbIwCC" role="3cqZAp">
            <node concept="2OqwBi" id="3HJD4JbIwCD" role="3clFbG">
              <node concept="37vLTw" id="2BHiRxglQGR" role="2Oq$k0">
                <ref role="3cqZAo" node="3HJD4JbIwCg" resolve="g" />
              </node>
              <node concept="liA8E" id="3HJD4JbIwCF" role="2OqNvi">
                <ref role="37wK5l" to="z60i:~Graphics.drawLine(int,int,int,int):void" resolve="drawLine" />
                <node concept="3cpWs3" id="3HJD4JbIwCG" role="37wK5m">
                  <node concept="37vLTw" id="2BHiRxgmKdH" role="3uHU7B">
                    <ref role="3cqZAo" node="3HJD4JbIwCi" resolve="x" />
                  </node>
                  <node concept="37vLTw" id="2BHiRxeosnZ" role="3uHU7w">
                    <ref role="3cqZAo" node="3HJD4JbIwE4" resolve="HALFWIDTH" />
                  </node>
                </node>
                <node concept="3cpWsd" id="3HJD4JbIwCJ" role="37wK5m">
                  <node concept="37vLTw" id="2BHiRxglIR7" role="3uHU7B">
                    <ref role="3cqZAo" node="3HJD4JbIwCk" resolve="y" />
                  </node>
                  <node concept="37vLTw" id="2BHiRxeonNY" role="3uHU7w">
                    <ref role="3cqZAo" node="3HJD4JbIwE8" resolve="LENGTH" />
                  </node>
                </node>
                <node concept="37vLTw" id="2BHiRxgmI8$" role="37wK5m">
                  <ref role="3cqZAo" node="3HJD4JbIwCi" resolve="x" />
                </node>
                <node concept="37vLTw" id="2BHiRxglEbv" role="37wK5m">
                  <ref role="3cqZAo" node="3HJD4JbIwCk" resolve="y" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="QsSxf" id="3HJD4JbIwCO" role="Qtgdg">
      <property role="TrG5h" value="LEFT" />
      <ref role="37wK5l" node="3HJD4JbIwEc" resolve="ArrowHeadDirection" />
      <node concept="3clFb_" id="3HJD4JbIwCP" role="2HKRsH">
        <property role="TrG5h" value="paint" />
        <node concept="3Tm1VV" id="3HJD4JbIwCQ" role="1B3o_S" />
        <node concept="3cqZAl" id="3HJD4JbIwCR" role="3clF45" />
        <node concept="37vLTG" id="3HJD4JbIwCS" role="3clF46">
          <property role="TrG5h" value="g" />
          <node concept="3uibUv" id="3HJD4JbIwCT" role="1tU5fm">
            <ref role="3uigEE" to="z60i:~Graphics" resolve="Graphics" />
          </node>
        </node>
        <node concept="37vLTG" id="3HJD4JbIwCU" role="3clF46">
          <property role="TrG5h" value="x" />
          <node concept="10Oyi0" id="3HJD4JbIwCV" role="1tU5fm" />
        </node>
        <node concept="37vLTG" id="3HJD4JbIwCW" role="3clF46">
          <property role="TrG5h" value="y" />
          <node concept="10Oyi0" id="3HJD4JbIwCX" role="1tU5fm" />
        </node>
        <node concept="3clFbS" id="3HJD4JbIwCY" role="3clF47">
          <node concept="3clFbF" id="3HJD4JbIwCZ" role="3cqZAp">
            <node concept="2OqwBi" id="3HJD4JbIwD0" role="3clFbG">
              <node concept="37vLTw" id="2BHiRxgmacF" role="2Oq$k0">
                <ref role="3cqZAo" node="3HJD4JbIwCS" resolve="g" />
              </node>
              <node concept="liA8E" id="3HJD4JbIwD2" role="2OqNvi">
                <ref role="37wK5l" to="z60i:~Graphics.setColor(java.awt.Color):void" resolve="setColor" />
                <node concept="10M0yZ" id="3HJD4JbIwD3" role="37wK5m">
                  <ref role="1PxDUh" to="z60i:~Color" resolve="Color" />
                  <ref role="3cqZAo" to="z60i:~Color.BLACK" resolve="BLACK" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbF" id="3HJD4JbIwD4" role="3cqZAp">
            <node concept="2OqwBi" id="3HJD4JbIwD5" role="3clFbG">
              <node concept="37vLTw" id="2BHiRxgm8hj" role="2Oq$k0">
                <ref role="3cqZAo" node="3HJD4JbIwCS" resolve="g" />
              </node>
              <node concept="liA8E" id="3HJD4JbIwD7" role="2OqNvi">
                <ref role="37wK5l" to="z60i:~Graphics.drawLine(int,int,int,int):void" resolve="drawLine" />
                <node concept="3cpWs3" id="3HJD4JbIwD8" role="37wK5m">
                  <node concept="37vLTw" id="2BHiRxghgBY" role="3uHU7B">
                    <ref role="3cqZAo" node="3HJD4JbIwCU" resolve="x" />
                  </node>
                  <node concept="37vLTw" id="2BHiRxeojZj" role="3uHU7w">
                    <ref role="3cqZAo" node="3HJD4JbIwE8" resolve="LENGTH" />
                  </node>
                </node>
                <node concept="3cpWs3" id="3HJD4JbIwDb" role="37wK5m">
                  <node concept="37vLTw" id="2BHiRxgmzu1" role="3uHU7B">
                    <ref role="3cqZAo" node="3HJD4JbIwCW" resolve="y" />
                  </node>
                  <node concept="37vLTw" id="2BHiRxeoie2" role="3uHU7w">
                    <ref role="3cqZAo" node="3HJD4JbIwE4" resolve="HALFWIDTH" />
                  </node>
                </node>
                <node concept="37vLTw" id="2BHiRxglL1z" role="37wK5m">
                  <ref role="3cqZAo" node="3HJD4JbIwCU" resolve="x" />
                </node>
                <node concept="37vLTw" id="2BHiRxgm6PJ" role="37wK5m">
                  <ref role="3cqZAo" node="3HJD4JbIwCW" resolve="y" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbF" id="3HJD4JbIwDg" role="3cqZAp">
            <node concept="2OqwBi" id="3HJD4JbIwDh" role="3clFbG">
              <node concept="37vLTw" id="2BHiRxgmj84" role="2Oq$k0">
                <ref role="3cqZAo" node="3HJD4JbIwCS" resolve="g" />
              </node>
              <node concept="liA8E" id="3HJD4JbIwDj" role="2OqNvi">
                <ref role="37wK5l" to="z60i:~Graphics.drawLine(int,int,int,int):void" resolve="drawLine" />
                <node concept="3cpWs3" id="3HJD4JbIwDk" role="37wK5m">
                  <node concept="37vLTw" id="2BHiRxgm1Os" role="3uHU7B">
                    <ref role="3cqZAo" node="3HJD4JbIwCU" resolve="x" />
                  </node>
                  <node concept="37vLTw" id="2BHiRxeogqx" role="3uHU7w">
                    <ref role="3cqZAo" node="3HJD4JbIwE8" resolve="LENGTH" />
                  </node>
                </node>
                <node concept="3cpWsd" id="3HJD4JbIwDn" role="37wK5m">
                  <node concept="37vLTw" id="2BHiRxglCxp" role="3uHU7B">
                    <ref role="3cqZAo" node="3HJD4JbIwCW" resolve="y" />
                  </node>
                  <node concept="37vLTw" id="2BHiRxeojk7" role="3uHU7w">
                    <ref role="3cqZAo" node="3HJD4JbIwE4" resolve="HALFWIDTH" />
                  </node>
                </node>
                <node concept="37vLTw" id="2BHiRxgm9Iq" role="37wK5m">
                  <ref role="3cqZAo" node="3HJD4JbIwCU" resolve="x" />
                </node>
                <node concept="37vLTw" id="2BHiRxglqQX" role="37wK5m">
                  <ref role="3cqZAo" node="3HJD4JbIwCW" resolve="y" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="QsSxf" id="3HJD4JbIwDs" role="Qtgdg">
      <property role="TrG5h" value="RIGHT" />
      <ref role="37wK5l" node="3HJD4JbIwEc" resolve="ArrowHeadDirection" />
      <node concept="3clFb_" id="3HJD4JbIwDt" role="2HKRsH">
        <property role="TrG5h" value="paint" />
        <node concept="3Tm1VV" id="3HJD4JbIwDu" role="1B3o_S" />
        <node concept="3cqZAl" id="3HJD4JbIwDv" role="3clF45" />
        <node concept="37vLTG" id="3HJD4JbIwDw" role="3clF46">
          <property role="TrG5h" value="g" />
          <node concept="3uibUv" id="3HJD4JbIwDx" role="1tU5fm">
            <ref role="3uigEE" to="z60i:~Graphics" resolve="Graphics" />
          </node>
        </node>
        <node concept="37vLTG" id="3HJD4JbIwDy" role="3clF46">
          <property role="TrG5h" value="x" />
          <node concept="10Oyi0" id="3HJD4JbIwDz" role="1tU5fm" />
        </node>
        <node concept="37vLTG" id="3HJD4JbIwD$" role="3clF46">
          <property role="TrG5h" value="y" />
          <node concept="10Oyi0" id="3HJD4JbIwD_" role="1tU5fm" />
        </node>
        <node concept="3clFbS" id="3HJD4JbIwDA" role="3clF47">
          <node concept="3clFbF" id="3HJD4JbIwDB" role="3cqZAp">
            <node concept="2OqwBi" id="3HJD4JbIwDC" role="3clFbG">
              <node concept="37vLTw" id="2BHiRxgmeYx" role="2Oq$k0">
                <ref role="3cqZAo" node="3HJD4JbIwDw" resolve="g" />
              </node>
              <node concept="liA8E" id="3HJD4JbIwDE" role="2OqNvi">
                <ref role="37wK5l" to="z60i:~Graphics.setColor(java.awt.Color):void" resolve="setColor" />
                <node concept="10M0yZ" id="3HJD4JbIwDF" role="37wK5m">
                  <ref role="1PxDUh" to="z60i:~Color" resolve="Color" />
                  <ref role="3cqZAo" to="z60i:~Color.BLACK" resolve="BLACK" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbF" id="3HJD4JbIwDG" role="3cqZAp">
            <node concept="2OqwBi" id="3HJD4JbIwDH" role="3clFbG">
              <node concept="37vLTw" id="2BHiRxgm85F" role="2Oq$k0">
                <ref role="3cqZAo" node="3HJD4JbIwDw" resolve="g" />
              </node>
              <node concept="liA8E" id="3HJD4JbIwDJ" role="2OqNvi">
                <ref role="37wK5l" to="z60i:~Graphics.drawLine(int,int,int,int):void" resolve="drawLine" />
                <node concept="3cpWsd" id="3HJD4JbIwDK" role="37wK5m">
                  <node concept="37vLTw" id="2BHiRxgmKsL" role="3uHU7B">
                    <ref role="3cqZAo" node="3HJD4JbIwDy" resolve="x" />
                  </node>
                  <node concept="37vLTw" id="2BHiRxeorz3" role="3uHU7w">
                    <ref role="3cqZAo" node="3HJD4JbIwE8" resolve="LENGTH" />
                  </node>
                </node>
                <node concept="3cpWs3" id="3HJD4JbIwDN" role="37wK5m">
                  <node concept="37vLTw" id="2BHiRxgmFjg" role="3uHU7B">
                    <ref role="3cqZAo" node="3HJD4JbIwD$" resolve="y" />
                  </node>
                  <node concept="37vLTw" id="2BHiRxeos5t" role="3uHU7w">
                    <ref role="3cqZAo" node="3HJD4JbIwE4" resolve="HALFWIDTH" />
                  </node>
                </node>
                <node concept="37vLTw" id="2BHiRxghg3T" role="37wK5m">
                  <ref role="3cqZAo" node="3HJD4JbIwDy" resolve="x" />
                </node>
                <node concept="37vLTw" id="2BHiRxgmaoB" role="37wK5m">
                  <ref role="3cqZAo" node="3HJD4JbIwD$" resolve="y" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbF" id="3HJD4JbIwDS" role="3cqZAp">
            <node concept="2OqwBi" id="3HJD4JbIwDT" role="3clFbG">
              <node concept="37vLTw" id="2BHiRxgm6T7" role="2Oq$k0">
                <ref role="3cqZAo" node="3HJD4JbIwDw" resolve="g" />
              </node>
              <node concept="liA8E" id="3HJD4JbIwDV" role="2OqNvi">
                <ref role="37wK5l" to="z60i:~Graphics.drawLine(int,int,int,int):void" resolve="drawLine" />
                <node concept="3cpWsd" id="3HJD4JbIwDW" role="37wK5m">
                  <node concept="37vLTw" id="2BHiRxgmtyF" role="3uHU7B">
                    <ref role="3cqZAo" node="3HJD4JbIwDy" resolve="x" />
                  </node>
                  <node concept="37vLTw" id="2BHiRxeorFd" role="3uHU7w">
                    <ref role="3cqZAo" node="3HJD4JbIwE8" resolve="LENGTH" />
                  </node>
                </node>
                <node concept="3cpWsd" id="3HJD4JbIwDZ" role="37wK5m">
                  <node concept="37vLTw" id="2BHiRxgmaZE" role="3uHU7B">
                    <ref role="3cqZAo" node="3HJD4JbIwD$" resolve="y" />
                  </node>
                  <node concept="37vLTw" id="2BHiRxeomqi" role="3uHU7w">
                    <ref role="3cqZAo" node="3HJD4JbIwE4" resolve="HALFWIDTH" />
                  </node>
                </node>
                <node concept="37vLTw" id="2BHiRxgl1q6" role="37wK5m">
                  <ref role="3cqZAo" node="3HJD4JbIwDy" resolve="x" />
                </node>
                <node concept="37vLTw" id="2BHiRxglgvo" role="37wK5m">
                  <ref role="3cqZAo" node="3HJD4JbIwD$" resolve="y" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="Wx3nA" id="3HJD4JbIwE4" role="jymVt">
      <property role="TrG5h" value="HALFWIDTH" />
      <property role="3TUv4t" value="true" />
      <node concept="10Oyi0" id="3HJD4JbIwE5" role="1tU5fm" />
      <node concept="3Tm6S6" id="3HJD4JbIwE6" role="1B3o_S" />
      <node concept="3cmrfG" id="3HJD4JbIwE7" role="33vP2m">
        <property role="3cmrfH" value="3" />
      </node>
    </node>
    <node concept="Wx3nA" id="3HJD4JbIwE8" role="jymVt">
      <property role="TrG5h" value="LENGTH" />
      <property role="3TUv4t" value="true" />
      <node concept="10Oyi0" id="3HJD4JbIwE9" role="1tU5fm" />
      <node concept="3Tm6S6" id="3HJD4JbIwEa" role="1B3o_S" />
      <node concept="3cmrfG" id="3HJD4JbIwEb" role="33vP2m">
        <property role="3cmrfH" value="5" />
      </node>
    </node>
    <node concept="3clFbW" id="3HJD4JbIwEc" role="jymVt">
      <node concept="3Tm6S6" id="3HJD4JbIwEd" role="1B3o_S" />
      <node concept="3clFbS" id="3HJD4JbIwEe" role="3clF47" />
    </node>
    <node concept="3clFb_" id="3HJD4JbIwEf" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="paint" />
      <node concept="3Tm1VV" id="3HJD4JbIwEg" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIwEh" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIwEi" role="3clF46">
        <property role="TrG5h" value="g" />
        <node concept="3uibUv" id="3HJD4JbIwEj" role="1tU5fm">
          <ref role="3uigEE" to="z60i:~Graphics" resolve="Graphics" />
        </node>
      </node>
      <node concept="37vLTG" id="3HJD4JbIwEk" role="3clF46">
        <property role="TrG5h" value="x" />
        <node concept="10Oyi0" id="3HJD4JbIwEl" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIwEm" role="3clF46">
        <property role="TrG5h" value="y" />
        <node concept="10Oyi0" id="3HJD4JbIwEn" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="3HJD4JbIwEo" role="3clF47" />
    </node>
  </node>
  <node concept="312cEu" id="3HJD4JbIwEp">
    <property role="TrG5h" value="Line" />
    <node concept="3Tm1VV" id="3HJD4JbIwEq" role="1B3o_S" />
    <node concept="3uibUv" id="3HJD4JbIwEr" role="EKbjA">
      <ref role="3uigEE" to="wyt6:~Comparable" resolve="Comparable" />
      <node concept="3uibUv" id="3HJD4JbIwEs" role="11_B2D">
        <ref role="3uigEE" node="3HJD4JbIwEp" resolve="Line" />
      </node>
    </node>
    <node concept="312cEg" id="3HJD4JbIwEt" role="jymVt">
      <property role="TrG5h" value="myFirst" />
      <property role="3TUv4t" value="false" />
      <node concept="10Oyi0" id="3HJD4JbIwEu" role="1tU5fm" />
      <node concept="3Tmbuc" id="JwZXmy5bp5" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="3HJD4JbIwEv" role="jymVt">
      <property role="TrG5h" value="mySecond" />
      <property role="3TUv4t" value="false" />
      <node concept="10Oyi0" id="3HJD4JbIwEw" role="1tU5fm" />
      <node concept="3Tmbuc" id="JwZXmy5bqF" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="3HJD4JbIwEx" role="jymVt">
      <property role="TrG5h" value="myLevel" />
      <property role="3TUv4t" value="false" />
      <node concept="10Oyi0" id="3HJD4JbIwEy" role="1tU5fm" />
      <node concept="3Tmbuc" id="JwZXmy5bsh" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="3HJD4JbIwEz" role="jymVt">
      <property role="TrG5h" value="myDirection" />
      <property role="3TUv4t" value="true" />
      <node concept="3uibUv" id="3HJD4JbIwE$" role="1tU5fm">
        <ref role="3uigEE" node="3HJD4JbIwsr" resolve="LineDirection" />
      </node>
      <node concept="3Tmbuc" id="JwZXmy59db" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="JwZXmy09wF" role="jymVt">
      <property role="34CwA1" value="false" />
      <property role="eg7rD" value="false" />
      <property role="TrG5h" value="myColor" />
      <property role="3TUv4t" value="true" />
      <node concept="3Tmbuc" id="JwZXmy56nW" role="1B3o_S" />
      <node concept="3uibUv" id="JwZXmy09w0" role="1tU5fm">
        <ref role="3uigEE" to="z60i:~Color" resolve="Color" />
      </node>
    </node>
    <node concept="3clFbW" id="3HJD4JbIwEA" role="jymVt">
      <node concept="3Tm1VV" id="3HJD4JbIwEB" role="1B3o_S" />
      <node concept="37vLTG" id="3HJD4JbIwEC" role="3clF46">
        <property role="TrG5h" value="first" />
        <node concept="10Oyi0" id="3HJD4JbIwED" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIwEE" role="3clF46">
        <property role="TrG5h" value="second" />
        <node concept="10Oyi0" id="3HJD4JbIwEF" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIwEG" role="3clF46">
        <property role="TrG5h" value="level" />
        <node concept="10Oyi0" id="3HJD4JbIwEH" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIwEI" role="3clF46">
        <property role="TrG5h" value="direction" />
        <node concept="3uibUv" id="3HJD4JbIwEJ" role="1tU5fm">
          <ref role="3uigEE" node="3HJD4JbIwsr" resolve="LineDirection" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIwEK" role="3clF47">
        <node concept="1VxSAg" id="JwZXmy0blW" role="3cqZAp">
          <ref role="37wK5l" node="JwZXmy08FT" resolve="Line" />
          <node concept="37vLTw" id="JwZXmy0bsT" role="37wK5m">
            <ref role="3cqZAo" node="3HJD4JbIwEC" resolve="first" />
          </node>
          <node concept="37vLTw" id="JwZXmy0bzq" role="37wK5m">
            <ref role="3cqZAo" node="3HJD4JbIwEE" resolve="second" />
          </node>
          <node concept="37vLTw" id="JwZXmy0bEg" role="37wK5m">
            <ref role="3cqZAo" node="3HJD4JbIwEG" resolve="level" />
          </node>
          <node concept="37vLTw" id="JwZXmy0bS7" role="37wK5m">
            <ref role="3cqZAo" node="3HJD4JbIwEI" resolve="direction" />
          </node>
          <node concept="10M0yZ" id="JwZXmy0c7C" role="37wK5m">
            <ref role="1PxDUh" to="z60i:~Color" resolve="Color" />
            <ref role="3cqZAo" to="z60i:~Color.BLACK" resolve="BLACK" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFbW" id="JwZXmy08FT" role="jymVt">
      <node concept="3Tm1VV" id="JwZXmy08FU" role="1B3o_S" />
      <node concept="37vLTG" id="JwZXmy08FV" role="3clF46">
        <property role="TrG5h" value="first" />
        <node concept="10Oyi0" id="JwZXmy08FW" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="JwZXmy08FX" role="3clF46">
        <property role="TrG5h" value="second" />
        <node concept="10Oyi0" id="JwZXmy08FY" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="JwZXmy08FZ" role="3clF46">
        <property role="TrG5h" value="level" />
        <node concept="10Oyi0" id="JwZXmy08G0" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="JwZXmy08G1" role="3clF46">
        <property role="TrG5h" value="direction" />
        <node concept="3uibUv" id="JwZXmy08G2" role="1tU5fm">
          <ref role="3uigEE" node="3HJD4JbIwsr" resolve="LineDirection" />
        </node>
      </node>
      <node concept="37vLTG" id="JwZXmy09GF" role="3clF46">
        <property role="TrG5h" value="color" />
        <node concept="3uibUv" id="JwZXmy09Ra" role="1tU5fm">
          <ref role="3uigEE" to="z60i:~Color" resolve="Color" />
        </node>
      </node>
      <node concept="3clFbS" id="JwZXmy08G3" role="3clF47">
        <node concept="3clFbF" id="JwZXmy08G4" role="3cqZAp">
          <node concept="37vLTI" id="JwZXmy08G5" role="3clFbG">
            <node concept="2OqwBi" id="JwZXmy08G6" role="37vLTJ">
              <node concept="2OwXpG" id="JwZXmy08G7" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIwEt" resolve="myFirst" />
              </node>
              <node concept="Xjq3P" id="JwZXmy08G8" role="2Oq$k0" />
            </node>
            <node concept="37vLTw" id="JwZXmy08G9" role="37vLTx">
              <ref role="3cqZAo" node="JwZXmy08FV" resolve="first" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="JwZXmy08Ga" role="3cqZAp">
          <node concept="37vLTI" id="JwZXmy08Gb" role="3clFbG">
            <node concept="2OqwBi" id="JwZXmy08Gc" role="37vLTJ">
              <node concept="2OwXpG" id="JwZXmy08Gd" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIwEv" resolve="mySecond" />
              </node>
              <node concept="Xjq3P" id="JwZXmy08Ge" role="2Oq$k0" />
            </node>
            <node concept="37vLTw" id="JwZXmy08Gf" role="37vLTx">
              <ref role="3cqZAo" node="JwZXmy08FX" resolve="second" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="JwZXmy08Gg" role="3cqZAp">
          <node concept="37vLTI" id="JwZXmy08Gh" role="3clFbG">
            <node concept="2OqwBi" id="JwZXmy08Gi" role="37vLTJ">
              <node concept="2OwXpG" id="JwZXmy08Gj" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIwEx" resolve="myLevel" />
              </node>
              <node concept="Xjq3P" id="JwZXmy08Gk" role="2Oq$k0" />
            </node>
            <node concept="37vLTw" id="JwZXmy08Gl" role="37vLTx">
              <ref role="3cqZAo" node="JwZXmy08FZ" resolve="level" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="JwZXmy08Gm" role="3cqZAp">
          <node concept="37vLTI" id="JwZXmy08Gn" role="3clFbG">
            <node concept="2OqwBi" id="JwZXmy08Go" role="37vLTJ">
              <node concept="2OwXpG" id="JwZXmy08Gp" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIwEz" resolve="myDirection" />
              </node>
              <node concept="Xjq3P" id="JwZXmy08Gq" role="2Oq$k0" />
            </node>
            <node concept="37vLTw" id="JwZXmy08Gr" role="37vLTx">
              <ref role="3cqZAo" node="JwZXmy08G1" resolve="direction" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="JwZXmy0acZ" role="3cqZAp">
          <node concept="37vLTI" id="JwZXmy0ak$" role="3clFbG">
            <node concept="37vLTw" id="JwZXmy0aro" role="37vLTx">
              <ref role="3cqZAo" node="JwZXmy09GF" resolve="color" />
            </node>
            <node concept="2OqwBi" id="JwZXmy0afx" role="37vLTJ">
              <node concept="Xjq3P" id="JwZXmy0acX" role="2Oq$k0" />
              <node concept="2OwXpG" id="JwZXmy0aia" role="2OqNvi">
                <ref role="2Oxat5" node="JwZXmy09wF" resolve="myColor" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIwF9" role="jymVt">
      <property role="TrG5h" value="getFirst" />
      <node concept="3Tm1VV" id="3HJD4JbIwFa" role="1B3o_S" />
      <node concept="10Oyi0" id="3HJD4JbIwFb" role="3clF45" />
      <node concept="3clFbS" id="3HJD4JbIwFc" role="3clF47">
        <node concept="3cpWs6" id="3HJD4JbIwFd" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIwFe" role="3cqZAk">
            <node concept="2OwXpG" id="3HJD4JbIwFf" role="2OqNvi">
              <ref role="2Oxat5" node="3HJD4JbIwEt" resolve="myFirst" />
            </node>
            <node concept="Xjq3P" id="3HJD4JbIwFg" role="2Oq$k0" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIwFh" role="jymVt">
      <property role="TrG5h" value="getSecond" />
      <node concept="3Tm1VV" id="3HJD4JbIwFi" role="1B3o_S" />
      <node concept="10Oyi0" id="3HJD4JbIwFj" role="3clF45" />
      <node concept="3clFbS" id="3HJD4JbIwFk" role="3clF47">
        <node concept="3cpWs6" id="3HJD4JbIwFl" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIwFm" role="3cqZAk">
            <node concept="2OwXpG" id="3HJD4JbIwFn" role="2OqNvi">
              <ref role="2Oxat5" node="3HJD4JbIwEv" resolve="mySecond" />
            </node>
            <node concept="Xjq3P" id="3HJD4JbIwFo" role="2Oq$k0" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIwFp" role="jymVt">
      <property role="TrG5h" value="getLevel" />
      <node concept="3Tm1VV" id="3HJD4JbIwFq" role="1B3o_S" />
      <node concept="10Oyi0" id="3HJD4JbIwFr" role="3clF45" />
      <node concept="3clFbS" id="3HJD4JbIwFs" role="3clF47">
        <node concept="3cpWs6" id="3HJD4JbIwFt" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIwFu" role="3cqZAk">
            <node concept="2OwXpG" id="3HJD4JbIwFv" role="2OqNvi">
              <ref role="2Oxat5" node="3HJD4JbIwEx" resolve="myLevel" />
            </node>
            <node concept="Xjq3P" id="3HJD4JbIwFw" role="2Oq$k0" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIwFx" role="jymVt">
      <property role="TrG5h" value="getDirection" />
      <node concept="3Tm1VV" id="3HJD4JbIwFy" role="1B3o_S" />
      <node concept="3uibUv" id="3HJD4JbIwFz" role="3clF45">
        <ref role="3uigEE" node="3HJD4JbIwsr" resolve="LineDirection" />
      </node>
      <node concept="3clFbS" id="3HJD4JbIwF$" role="3clF47">
        <node concept="3cpWs6" id="3HJD4JbIwF_" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIwFA" role="3cqZAk">
            <node concept="2OwXpG" id="3HJD4JbIwFB" role="2OqNvi">
              <ref role="2Oxat5" node="3HJD4JbIwEz" resolve="myDirection" />
            </node>
            <node concept="Xjq3P" id="3HJD4JbIwFC" role="2Oq$k0" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIwFD" role="jymVt">
      <property role="TrG5h" value="paint" />
      <node concept="3Tm1VV" id="3HJD4JbIwFE" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIwFF" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIwFG" role="3clF46">
        <property role="TrG5h" value="g" />
        <node concept="3uibUv" id="3HJD4JbIwFH" role="1tU5fm">
          <ref role="3uigEE" to="z60i:~Graphics" resolve="Graphics" />
        </node>
      </node>
      <node concept="37vLTG" id="3HJD4JbIwFI" role="3clF46">
        <property role="TrG5h" value="backgroundColor" />
        <node concept="3uibUv" id="3HJD4JbIwFJ" role="1tU5fm">
          <ref role="3uigEE" to="z60i:~Color" resolve="Color" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIwFK" role="3clF47">
        <node concept="3clFbF" id="JwZXmy0j8T" role="3cqZAp">
          <node concept="1rXfSq" id="JwZXmy0j8S" role="3clFbG">
            <ref role="37wK5l" node="JwZXmy0ik1" resolve="paint" />
            <node concept="37vLTw" id="JwZXmy0jml" role="37wK5m">
              <ref role="3cqZAo" node="3HJD4JbIwFG" resolve="g" />
            </node>
          </node>
        </node>
      </node>
      <node concept="P$JXv" id="JwZXmy0jmJ" role="lGtFl">
        <node concept="TZ5HI" id="JwZXmy0jmK" role="3nqlJM">
          <node concept="TZ5HA" id="JwZXmy0jmL" role="3HnX3l" />
        </node>
      </node>
      <node concept="2AHcQZ" id="JwZXmy0jmM" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Deprecated" resolve="Deprecated" />
      </node>
    </node>
    <node concept="3clFb_" id="JwZXmy0ik1" role="jymVt">
      <property role="TrG5h" value="paint" />
      <node concept="3Tm1VV" id="JwZXmy0ik2" role="1B3o_S" />
      <node concept="3cqZAl" id="JwZXmy0ik3" role="3clF45" />
      <node concept="37vLTG" id="JwZXmy0ik4" role="3clF46">
        <property role="TrG5h" value="g" />
        <node concept="3uibUv" id="JwZXmy0ik5" role="1tU5fm">
          <ref role="3uigEE" to="z60i:~Graphics" resolve="Graphics" />
        </node>
      </node>
      <node concept="3clFbS" id="JwZXmy0ik8" role="3clF47">
        <node concept="3clFbF" id="JwZXmy0ik9" role="3cqZAp">
          <node concept="2OqwBi" id="JwZXmy0ika" role="3clFbG">
            <node concept="37vLTw" id="JwZXmy0ikb" role="2Oq$k0">
              <ref role="3cqZAo" node="JwZXmy0ik4" resolve="g" />
            </node>
            <node concept="liA8E" id="JwZXmy0ikc" role="2OqNvi">
              <ref role="37wK5l" to="z60i:~Graphics.setColor(java.awt.Color):void" resolve="setColor" />
              <node concept="37vLTw" id="JwZXmy0ikd" role="37wK5m">
                <ref role="3cqZAo" node="JwZXmy09wF" resolve="myColor" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="JwZXmy0ike" role="3cqZAp">
          <node concept="2OqwBi" id="JwZXmy0ikf" role="3clFbG">
            <node concept="2OqwBi" id="JwZXmy0ikg" role="2Oq$k0">
              <node concept="2OwXpG" id="JwZXmy0ikh" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIwEz" resolve="myDirection" />
              </node>
              <node concept="Xjq3P" id="JwZXmy0iki" role="2Oq$k0" />
            </node>
            <node concept="liA8E" id="JwZXmy0ikj" role="2OqNvi">
              <ref role="37wK5l" node="JwZXmxZjpo" resolve="paint" />
              <node concept="Xjq3P" id="JwZXmy5m5s" role="37wK5m" />
              <node concept="37vLTw" id="JwZXmy0ikk" role="37wK5m">
                <ref role="3cqZAo" node="JwZXmy0ik4" resolve="g" />
              </node>
              <node concept="2OqwBi" id="JwZXmy0ikl" role="37wK5m">
                <node concept="2OwXpG" id="JwZXmy0ikm" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIwEt" resolve="myFirst" />
                </node>
                <node concept="Xjq3P" id="JwZXmy0ikn" role="2Oq$k0" />
              </node>
              <node concept="2OqwBi" id="JwZXmy0iko" role="37wK5m">
                <node concept="2OwXpG" id="JwZXmy0ikp" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIwEv" resolve="mySecond" />
                </node>
                <node concept="Xjq3P" id="JwZXmy0ikq" role="2Oq$k0" />
              </node>
              <node concept="2OqwBi" id="JwZXmy0ikr" role="37wK5m">
                <node concept="2OwXpG" id="JwZXmy0iks" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIwEx" resolve="myLevel" />
                </node>
                <node concept="Xjq3P" id="JwZXmy0ikt" role="2Oq$k0" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="JwZXmxZHlW" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="drawLine" />
      <node concept="3Tmbuc" id="JwZXmy5lxf" role="1B3o_S" />
      <node concept="3cqZAl" id="JwZXmxZHlZ" role="3clF45" />
      <node concept="37vLTG" id="JwZXmxZHm0" role="3clF46">
        <property role="TrG5h" value="g" />
        <node concept="3uibUv" id="JwZXmxZHm1" role="1tU5fm">
          <ref role="3uigEE" to="z60i:~Graphics" resolve="Graphics" />
        </node>
      </node>
      <node concept="37vLTG" id="JwZXmxZHm2" role="3clF46">
        <property role="TrG5h" value="x1" />
        <node concept="10Oyi0" id="JwZXmxZHm3" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="JwZXmxZHm4" role="3clF46">
        <property role="TrG5h" value="y1" />
        <node concept="10Oyi0" id="JwZXmxZHm5" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="JwZXmxZHm6" role="3clF46">
        <property role="TrG5h" value="x2" />
        <node concept="10Oyi0" id="JwZXmxZHm7" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="JwZXmxZHm8" role="3clF46">
        <property role="TrG5h" value="y2" />
        <node concept="10Oyi0" id="JwZXmxZHm9" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="JwZXmxZHma" role="3clF47">
        <node concept="3clFbF" id="JwZXmxZIfc" role="3cqZAp">
          <node concept="2OqwBi" id="JwZXmxZIfr" role="3clFbG">
            <node concept="37vLTw" id="JwZXmxZIfb" role="2Oq$k0">
              <ref role="3cqZAo" node="JwZXmxZHm0" resolve="g" />
            </node>
            <node concept="liA8E" id="JwZXmxZIil" role="2OqNvi">
              <ref role="37wK5l" to="z60i:~Graphics.drawLine(int,int,int,int):void" resolve="drawLine" />
              <node concept="37vLTw" id="JwZXmxZIEA" role="37wK5m">
                <ref role="3cqZAo" node="JwZXmxZHm2" resolve="x1" />
              </node>
              <node concept="37vLTw" id="JwZXmxZJ2w" role="37wK5m">
                <ref role="3cqZAo" node="JwZXmxZHm4" resolve="y1" />
              </node>
              <node concept="37vLTw" id="JwZXmxZJqA" role="37wK5m">
                <ref role="3cqZAo" node="JwZXmxZHm6" resolve="x2" />
              </node>
              <node concept="37vLTw" id="JwZXmxZJLL" role="37wK5m">
                <ref role="3cqZAo" node="JwZXmxZHm8" resolve="y2" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="JwZXmy5l9O" role="jymVt" />
    <node concept="2tJIrI" id="JwZXmxZcRm" role="jymVt" />
    <node concept="3clFb_" id="3HJD4JbIwG2" role="jymVt">
      <property role="TrG5h" value="compareTo" />
      <node concept="3Tm1VV" id="3HJD4JbIwG3" role="1B3o_S" />
      <node concept="10Oyi0" id="3HJD4JbIwG4" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIwG5" role="3clF46">
        <property role="TrG5h" value="o" />
        <node concept="3uibUv" id="3HJD4JbIwG6" role="1tU5fm">
          <ref role="3uigEE" node="3HJD4JbIwEp" resolve="Line" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIwG7" role="3clF47">
        <node concept="3cpWs6" id="3HJD4JbIwG8" role="3cqZAp">
          <node concept="3cpWsd" id="3HJD4JbIwG9" role="3cqZAk">
            <node concept="2OqwBi" id="3HJD4JbIwGa" role="3uHU7B">
              <node concept="2OqwBi" id="3HJD4JbIwGb" role="2Oq$k0">
                <node concept="2OwXpG" id="3HJD4JbIwGc" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIwEz" resolve="myDirection" />
                </node>
                <node concept="Xjq3P" id="3HJD4JbIwGd" role="2Oq$k0" />
              </node>
              <node concept="liA8E" id="3HJD4JbIwGe" role="2OqNvi">
                <ref role="37wK5l" to="wyt6:~Enum.ordinal():int" resolve="ordinal" />
              </node>
            </node>
            <node concept="2OqwBi" id="3HJD4JbIwGf" role="3uHU7w">
              <node concept="2OqwBi" id="3HJD4JbIwGg" role="2Oq$k0">
                <node concept="2OwXpG" id="3HJD4JbIwGh" role="2OqNvi">
                  <ref role="2Oxat5" node="3HJD4JbIwEz" resolve="myDirection" />
                </node>
                <node concept="37vLTw" id="2BHiRxgmwVM" role="2Oq$k0">
                  <ref role="3cqZAo" node="3HJD4JbIwG5" resolve="o" />
                </node>
              </node>
              <node concept="liA8E" id="3HJD4JbIwGj" role="2OqNvi">
                <ref role="37wK5l" to="wyt6:~Enum.ordinal():int" resolve="ordinal" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3tYsUK_Sc$Y" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIwGk" role="jymVt">
      <property role="TrG5h" value="shiftLeft" />
      <node concept="3Tm1VV" id="3HJD4JbIwGl" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIwGm" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIwGn" role="3clF46">
        <property role="TrG5h" value="indent" />
        <node concept="10Oyi0" id="3HJD4JbIwGo" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="3HJD4JbIwGp" role="3clF47">
        <node concept="3clFbF" id="3HJD4JbIwGq" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIwGr" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIwGs" role="2Oq$k0">
              <node concept="2OwXpG" id="3HJD4JbIwGt" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIwEz" resolve="myDirection" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIwGu" role="2Oq$k0" />
            </node>
            <node concept="liA8E" id="3HJD4JbIwGv" role="2OqNvi">
              <ref role="37wK5l" node="3HJD4JbIwvm" resolve="shiftLeft" />
              <node concept="Xjq3P" id="3HJD4JbIwGw" role="37wK5m" />
              <node concept="37vLTw" id="2BHiRxgm6MH" role="37wK5m">
                <ref role="3cqZAo" node="3HJD4JbIwGn" resolve="indent" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

