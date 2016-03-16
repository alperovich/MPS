<?xml version="1.0" encoding="UTF-8"?>
<model ref="2af156ab-65c1-4a62-bd0d-ea734f71eab6/r:a1d8bbbf-d4f0-431f-8dcd-a6badc777315(jetbrains.mps.dataFlow.runtime/jetbrains.mps.lang.dataFlow)">
  <persistence version="9" />
  <languages>
    <use id="83888646-71ce-4f1c-9c53-c54016f6ad4f" name="jetbrains.mps.baseLanguage.collections" version="0" />
    <use id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel" version="2" />
    <use id="760a0a8c-eabb-4521-8bfd-65db761a9ba3" name="jetbrains.mps.baseLanguage.logging" version="0" />
    <use id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage" version="4" />
    <use id="f2801650-65d5-424e-bb1b-463a8781b786" name="jetbrains.mps.baseLanguage.javadoc" version="2" />
  </languages>
  <imports>
    <import index="tpee" ref="f3061a53-9226-4cc5-a443-f952ceaf5816/r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage/jetbrains.mps.baseLanguage.structure)" />
    <import index="33ny" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.util(JDK/)" />
    <import index="wyt6" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)" />
    <import index="1fjm" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.lang.dataFlow.framework(MPS.Core/)" />
    <import index="w1kc" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel(MPS.Core/)" />
    <import index="dau9" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.lang.dataFlow.framework.instructions(MPS.Core/)" />
    <import index="zkib" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.reloading(MPS.Core/)" />
    <import index="18ew" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.util(MPS.Core/)" />
    <import index="wwqx" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.logging(MPS.Core/)" />
    <import index="z1c3" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.project(MPS.Core/)" />
    <import index="wyuk" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.components(MPS.Core/)" />
    <import index="mhbf" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.model(MPS.OpenAPI/)" />
    <import index="unno" ref="2d3c70e9-aab2-4870-8d8d-6036800e4103/r:61e3d524-8c49-4491-b5e3-f6d6e9364527(jetbrains.mps.kernel/jetbrains.mps.util)" />
    <import index="3qmy" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.classloading(MPS.Core/)" />
    <import index="q7tw" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:org.apache.log4j(MPS.Core/)" />
    <import index="lui2" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.module(MPS.OpenAPI/)" />
    <import index="48b2" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.cleanup(MPS.Core/)" />
    <import index="j8aq" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.module(MPS.Core/)" />
    <import index="c17a" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.language(MPS.OpenAPI/)" />
    <import index="vndm" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel.language(MPS.Core/)" />
    <import index="ncw5" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.util.annotation(MPS.Core/)" />
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
      <concept id="1202948039474" name="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" flags="nn" index="liA8E" />
      <concept id="1465982738277781862" name="jetbrains.mps.baseLanguage.structure.PlaceholderMember" flags="ng" index="2tJIrI" />
      <concept id="1188207840427" name="jetbrains.mps.baseLanguage.structure.AnnotationInstance" flags="nn" index="2AHcQZ">
        <reference id="1188208074048" name="annotation" index="2AI5Lk" />
        <child id="1188214630783" name="value" index="2B76xF" />
      </concept>
      <concept id="1188208481402" name="jetbrains.mps.baseLanguage.structure.HasAnnotation" flags="ng" index="2AJDlI">
        <child id="1188208488637" name="annotation" index="2AJF6D" />
      </concept>
      <concept id="1188214545140" name="jetbrains.mps.baseLanguage.structure.AnnotationInstanceValue" flags="ng" index="2B6LJw">
        <reference id="1188214555875" name="key" index="2B6OnR" />
        <child id="1188214607812" name="value" index="2B70Vg" />
      </concept>
      <concept id="1153952380246" name="jetbrains.mps.baseLanguage.structure.TryStatement" flags="nn" index="2GUZhq">
        <child id="1153952416686" name="body" index="2GV8ay" />
        <child id="1153952429843" name="finallyBody" index="2GVbov" />
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
      <concept id="1070534644030" name="jetbrains.mps.baseLanguage.structure.BooleanType" flags="in" index="10P_77" />
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
        <child id="1095933932569" name="implementedInterface" index="EKbjA" />
        <child id="1165602531693" name="superclass" index="1zkMxy" />
      </concept>
      <concept id="1068431474542" name="jetbrains.mps.baseLanguage.structure.VariableDeclaration" flags="ng" index="33uBYm">
        <property id="1176718929932" name="isFinal" index="3TUv4t" />
        <child id="1068431790190" name="initializer" index="33vP2m" />
      </concept>
      <concept id="1068498886296" name="jetbrains.mps.baseLanguage.structure.VariableReference" flags="nn" index="37vLTw">
        <reference id="1068581517664" name="variableDeclaration" index="3cqZAo" />
      </concept>
      <concept id="1068498886292" name="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" flags="ir" index="37vLTG" />
      <concept id="1068498886294" name="jetbrains.mps.baseLanguage.structure.AssignmentExpression" flags="nn" index="37vLTI" />
      <concept id="1225271177708" name="jetbrains.mps.baseLanguage.structure.StringType" flags="in" index="17QB3L" />
      <concept id="4972933694980447171" name="jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration" flags="ng" index="19Szcq">
        <child id="5680397130376446158" name="type" index="1tU5fm" />
      </concept>
      <concept id="1111509017652" name="jetbrains.mps.baseLanguage.structure.FloatingPointConstant" flags="nn" index="3b6qkQ">
        <property id="1113006610751" name="value" index="$nhwW" />
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
      <concept id="1204053956946" name="jetbrains.mps.baseLanguage.structure.IMethodCall" flags="ng" index="1ndlxa">
        <reference id="1068499141037" name="baseMethodDeclaration" index="37wK5l" />
        <child id="1068499141038" name="actualArgument" index="37wK5m" />
      </concept>
      <concept id="1073063089578" name="jetbrains.mps.baseLanguage.structure.SuperMethodCall" flags="nn" index="3nyPlj" />
      <concept id="1212685548494" name="jetbrains.mps.baseLanguage.structure.ClassCreator" flags="nn" index="1pGfFk">
        <child id="1212687122400" name="typeParameter" index="1pMfVU" />
      </concept>
      <concept id="1107461130800" name="jetbrains.mps.baseLanguage.structure.Classifier" flags="ng" index="3pOWGL">
        <property id="521412098689998745" name="nonStatic" index="2bfB8j" />
        <child id="5375687026011219971" name="member" index="jymVt" unordered="true" />
      </concept>
      <concept id="1171903916106" name="jetbrains.mps.baseLanguage.structure.UpperBoundType" flags="in" index="3qUE_q">
        <child id="1171903916107" name="bound" index="3qUE_r" />
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
      <concept id="1081855346303" name="jetbrains.mps.baseLanguage.structure.BreakStatement" flags="nn" index="3zACq4" />
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
      <concept id="1170345865475" name="jetbrains.mps.baseLanguage.structure.AnonymousClass" flags="ig" index="1Y3b0j">
        <reference id="1170346070688" name="classifier" index="1Y3XeK" />
      </concept>
    </language>
    <language id="f2801650-65d5-424e-bb1b-463a8781b786" name="jetbrains.mps.baseLanguage.javadoc">
      <concept id="2546654756694997551" name="jetbrains.mps.baseLanguage.javadoc.structure.LinkInlineDocTag" flags="ng" index="92FcH">
        <child id="2546654756694997556" name="reference" index="92FcQ" />
        <child id="3106559687488913694" name="line" index="2XjZqd" />
      </concept>
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
      <concept id="2217234381367530212" name="jetbrains.mps.baseLanguage.javadoc.structure.ClassifierDocReference" flags="ng" index="VXe08">
        <reference id="2217234381367530213" name="classifier" index="VXe09" />
      </concept>
      <concept id="2217234381367530195" name="jetbrains.mps.baseLanguage.javadoc.structure.MethodDocReference" flags="ng" index="VXe0Z">
        <reference id="2217234381367530196" name="methodDeclaration" index="VXe0S" />
      </concept>
      <concept id="8970989240999019145" name="jetbrains.mps.baseLanguage.javadoc.structure.InlineTagCommentLinePart" flags="ng" index="1dT_AA">
        <child id="6962838954693749192" name="tag" index="qph3F" />
      </concept>
      <concept id="8970989240999019143" name="jetbrains.mps.baseLanguage.javadoc.structure.TextCommentLinePart" flags="ng" index="1dT_AC">
        <property id="8970989240999019144" name="text" index="1dT_AB" />
      </concept>
      <concept id="2068944020170241612" name="jetbrains.mps.baseLanguage.javadoc.structure.ClassifierDocComment" flags="ng" index="3UR2Jj" />
    </language>
    <language id="760a0a8c-eabb-4521-8bfd-65db761a9ba3" name="jetbrains.mps.baseLanguage.logging">
      <concept id="1167227138527" name="jetbrains.mps.baseLanguage.logging.structure.LogStatement" flags="nn" index="34ab3g">
        <property id="1167228628751" name="hasException" index="34fQS0" />
        <property id="1167245565795" name="severity" index="35gtTG" />
        <child id="1167227463056" name="logExpression" index="34bqiv" />
        <child id="1167227561449" name="exception" index="34bMjA" />
      </concept>
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1177026924588" name="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" flags="nn" index="chp4Y">
        <reference id="1177026940964" name="conceptDeclaration" index="cht4Q" />
      </concept>
      <concept id="1138411891628" name="jetbrains.mps.lang.smodel.structure.SNodeOperation" flags="nn" index="eCIE_">
        <child id="1144104376918" name="parameter" index="1xVPHs" />
      </concept>
      <concept id="7453996997717780434" name="jetbrains.mps.lang.smodel.structure.Node_GetSConceptOperation" flags="nn" index="2yIwOk" />
      <concept id="1171407110247" name="jetbrains.mps.lang.smodel.structure.Node_GetAncestorOperation" flags="nn" index="2Xjw5R" />
      <concept id="6677504323281689838" name="jetbrains.mps.lang.smodel.structure.SConceptType" flags="in" index="3bZ5Sz" />
      <concept id="1139613262185" name="jetbrains.mps.lang.smodel.structure.Node_GetParentOperation" flags="nn" index="1mfA1w" />
      <concept id="1139621453865" name="jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation" flags="nn" index="1mIQ4w">
        <child id="1177027386292" name="conceptArgument" index="cj9EA" />
      </concept>
      <concept id="1180457458947" name="jetbrains.mps.lang.smodel.structure.Concept_GetAllSuperConcepts" flags="nn" index="3oJPKh" />
      <concept id="1144100932627" name="jetbrains.mps.lang.smodel.structure.OperationParm_Inclusion" flags="ng" index="1xIGOp" />
      <concept id="1144101972840" name="jetbrains.mps.lang.smodel.structure.OperationParm_Concept" flags="ng" index="1xMEDy">
        <child id="1207343664468" name="conceptArgument" index="ri$Ld" />
      </concept>
      <concept id="1138055754698" name="jetbrains.mps.lang.smodel.structure.SNodeType" flags="in" index="3Tqbb2" />
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1133920641626" name="jetbrains.mps.lang.core.structure.BaseConcept" flags="ng" index="2VYdi">
        <child id="5169995583184591170" name="smodelAttribute" index="lGtFl" />
      </concept>
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
      <concept id="4222318806802425298" name="jetbrains.mps.lang.core.structure.SuppressErrorsAnnotation" flags="ng" index="15s5l7" />
    </language>
  </registry>
  <node concept="312cEu" id="3HJD4JbIvBk">
    <property role="TrG5h" value="MPSProgramBuilder" />
    <node concept="3Tm1VV" id="3HJD4JbIvBl" role="1B3o_S" />
    <node concept="3uibUv" id="3HJD4JbIvBm" role="1zkMxy">
      <ref role="3uigEE" to="1fjm:~StructuralProgramBuilder" resolve="StructuralProgramBuilder" />
      <node concept="3uibUv" id="3HJD4JbIvBn" role="11_B2D">
        <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
      </node>
    </node>
    <node concept="312cEg" id="3HJD4JbIvBo" role="jymVt">
      <property role="TrG5h" value="myDataFlowManager" />
      <node concept="3uibUv" id="3HJD4JbIvBp" role="1tU5fm">
        <ref role="3uigEE" node="3HJD4JbIwfM" resolve="DataFlowManager" />
      </node>
      <node concept="3Tm6S6" id="3HJD4JbIvBq" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="3HJD4JbIvBr" role="jymVt">
      <property role="TrG5h" value="myMayBeUnreachable" />
      <node concept="10P_77" id="3HJD4JbIvBs" role="1tU5fm" />
      <node concept="3Tm6S6" id="3HJD4JbIvBt" role="1B3o_S" />
      <node concept="3clFbT" id="3HJD4JbIvBu" role="33vP2m" />
    </node>
    <node concept="312cEg" id="qrAFe9jpfC" role="jymVt">
      <property role="TrG5h" value="myRepository" />
      <node concept="3Tm6S6" id="qrAFe9jpfA" role="1B3o_S" />
      <node concept="3uibUv" id="qrAFe9jpfB" role="1tU5fm">
        <ref role="3uigEE" to="lui2:~SRepository" resolve="SRepository" />
      </node>
    </node>
    <node concept="2tJIrI" id="qrAFe9j894" role="jymVt" />
    <node concept="3clFbW" id="4mpxoQud1f6" role="jymVt">
      <node concept="3cqZAl" id="4mpxoQud1f7" role="3clF45" />
      <node concept="3clFbS" id="4mpxoQud1f9" role="3clF47">
        <node concept="3SKdUt" id="4mpxoQud1s2" role="3cqZAp">
          <node concept="3SKdUq" id="4mpxoQud1s3" role="3SKWNk">
            <property role="3SKdUp" value="todo remove after 3.4" />
          </node>
        </node>
        <node concept="3clFbF" id="4mpxoQud1s4" role="3cqZAp">
          <node concept="37vLTI" id="4mpxoQud1s5" role="3clFbG">
            <node concept="2YIFZM" id="4mpxoQud1s6" role="37vLTx">
              <ref role="37wK5l" node="3HJD4JbIwg9" resolve="getInstance" />
              <ref role="1Pybhc" node="3HJD4JbIwfM" resolve="DataFlowManager" />
            </node>
            <node concept="2OqwBi" id="4mpxoQud1s7" role="37vLTJ">
              <node concept="Xjq3P" id="4mpxoQud1s8" role="2Oq$k0" />
              <node concept="2OwXpG" id="4mpxoQud1s9" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvBo" resolve="myDataFlowManager" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="4mpxoQud12h" role="1B3o_S" />
    </node>
    <node concept="3clFbW" id="4mpxoQud1uV" role="jymVt">
      <node concept="37vLTG" id="4mpxoQud1HG" role="3clF46">
        <property role="TrG5h" value="builder" />
        <node concept="3uibUv" id="4mpxoQud1HH" role="1tU5fm">
          <ref role="3uigEE" to="dau9:~InstructionBuilder" resolve="InstructionBuilder" />
        </node>
      </node>
      <node concept="3cqZAl" id="4mpxoQud1uW" role="3clF45" />
      <node concept="3clFbS" id="4mpxoQud1uX" role="3clF47">
        <node concept="XkiVB" id="4mpxoQud1II" role="3cqZAp">
          <ref role="37wK5l" to="1fjm:~StructuralProgramBuilder.&lt;init&gt;(jetbrains.mps.lang.dataFlow.framework.instructions.InstructionBuilder)" resolve="StructuralProgramBuilder" />
          <node concept="37vLTw" id="4mpxoQud21k" role="37wK5m">
            <ref role="3cqZAo" node="4mpxoQud1HG" resolve="builder" />
          </node>
        </node>
        <node concept="3SKdUt" id="4mpxoQud1uY" role="3cqZAp">
          <node concept="3SKdUq" id="4mpxoQud1uZ" role="3SKWNk">
            <property role="3SKdUp" value="todo remove after 3.4" />
          </node>
        </node>
        <node concept="3clFbF" id="4mpxoQud1v0" role="3cqZAp">
          <node concept="37vLTI" id="4mpxoQud1v1" role="3clFbG">
            <node concept="2YIFZM" id="4mpxoQud1v2" role="37vLTx">
              <ref role="37wK5l" node="3HJD4JbIwg9" resolve="getInstance" />
              <ref role="1Pybhc" node="3HJD4JbIwfM" resolve="DataFlowManager" />
            </node>
            <node concept="2OqwBi" id="4mpxoQud1v3" role="37vLTJ">
              <node concept="Xjq3P" id="4mpxoQud1v4" role="2Oq$k0" />
              <node concept="2OwXpG" id="4mpxoQud1v5" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvBo" resolve="myDataFlowManager" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="4mpxoQud1v6" role="1B3o_S" />
    </node>
    <node concept="3clFbW" id="qrAFe9j8zl" role="jymVt">
      <node concept="3cqZAl" id="qrAFe9j8zm" role="3clF45" />
      <node concept="3clFbS" id="qrAFe9j8zo" role="3clF47">
        <node concept="3clFbF" id="qrAFe9jpfJ" role="3cqZAp">
          <node concept="37vLTI" id="qrAFe9jpfK" role="3clFbG">
            <node concept="2OqwBi" id="qrAFe9jpfL" role="37vLTJ">
              <node concept="Xjq3P" id="qrAFe9jpfM" role="2Oq$k0" />
              <node concept="2OwXpG" id="qrAFe9jpfN" role="2OqNvi">
                <ref role="2Oxat5" node="qrAFe9jpfC" resolve="myRepository" />
              </node>
            </node>
            <node concept="37vLTw" id="qrAFe9jpfO" role="37vLTx">
              <ref role="3cqZAo" node="qrAFe9jp9r" resolve="repository" />
            </node>
          </node>
        </node>
        <node concept="3SKdUt" id="qrAFe9jlOk" role="3cqZAp">
          <node concept="3SKdUq" id="qrAFe9jlOm" role="3SKWNk">
            <property role="3SKdUp" value="todo remove after 3.4" />
          </node>
        </node>
        <node concept="3clFbF" id="qrAFe9jlsa" role="3cqZAp">
          <node concept="37vLTI" id="qrAFe9jlFV" role="3clFbG">
            <node concept="2YIFZM" id="qrAFe9jlLq" role="37vLTx">
              <ref role="37wK5l" node="3HJD4JbIwg9" resolve="getInstance" />
              <ref role="1Pybhc" node="3HJD4JbIwfM" resolve="DataFlowManager" />
            </node>
            <node concept="2OqwBi" id="qrAFe9jlt2" role="37vLTJ">
              <node concept="Xjq3P" id="qrAFe9jls9" role="2Oq$k0" />
              <node concept="2OwXpG" id="qrAFe9jl_P" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvBo" resolve="myDataFlowManager" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="qrAFe9j8t3" role="1B3o_S" />
      <node concept="37vLTG" id="qrAFe9jp9r" role="3clF46">
        <property role="TrG5h" value="repository" />
        <node concept="3uibUv" id="qrAFe9jp9q" role="1tU5fm">
          <ref role="3uigEE" to="lui2:~SRepository" resolve="SRepository" />
        </node>
      </node>
    </node>
    <node concept="3clFbW" id="3LlMlIU2hez" role="jymVt">
      <property role="TrG5h" value="StructuralProgramBuilder" />
      <node concept="3cqZAl" id="3LlMlIU2he$" role="3clF45" />
      <node concept="3Tm1VV" id="3LlMlIU2he_" role="1B3o_S" />
      <node concept="37vLTG" id="3LlMlIU2hqt" role="3clF46">
        <property role="TrG5h" value="repository" />
        <node concept="3uibUv" id="3LlMlIU2hr6" role="1tU5fm">
          <ref role="3uigEE" to="lui2:~SRepository" resolve="SRepository" />
        </node>
      </node>
      <node concept="37vLTG" id="3LlMlIU2heB" role="3clF46">
        <property role="TrG5h" value="builder" />
        <node concept="3uibUv" id="3LlMlIU2heC" role="1tU5fm">
          <ref role="3uigEE" to="dau9:~InstructionBuilder" resolve="InstructionBuilder" />
        </node>
      </node>
      <node concept="3clFbS" id="3LlMlIU2heD" role="3clF47">
        <node concept="XkiVB" id="3LlMlIU2heF" role="3cqZAp">
          <ref role="37wK5l" to="1fjm:~StructuralProgramBuilder.&lt;init&gt;(jetbrains.mps.lang.dataFlow.framework.instructions.InstructionBuilder)" resolve="StructuralProgramBuilder" />
          <node concept="37vLTw" id="3LlMlIU2heE" role="37wK5m">
            <ref role="3cqZAo" node="3LlMlIU2heB" resolve="builder" />
          </node>
        </node>
        <node concept="3clFbF" id="3LlMlIU2hW9" role="3cqZAp">
          <node concept="37vLTI" id="3LlMlIU2hWa" role="3clFbG">
            <node concept="2OqwBi" id="3LlMlIU2hWb" role="37vLTJ">
              <node concept="Xjq3P" id="3LlMlIU2hWc" role="2Oq$k0" />
              <node concept="2OwXpG" id="3LlMlIU2hWd" role="2OqNvi">
                <ref role="2Oxat5" node="qrAFe9jpfC" resolve="myRepository" />
              </node>
            </node>
            <node concept="37vLTw" id="3LlMlIU2hWe" role="37vLTx">
              <ref role="3cqZAo" node="3LlMlIU2hqt" resolve="repository" />
            </node>
          </node>
        </node>
        <node concept="3SKdUt" id="3LlMlIU2hWU" role="3cqZAp">
          <node concept="3SKdUq" id="3LlMlIU2hWV" role="3SKWNk">
            <property role="3SKdUp" value="todo remove after 3.4" />
          </node>
        </node>
        <node concept="3clFbF" id="3LlMlIU2hWW" role="3cqZAp">
          <node concept="37vLTI" id="3LlMlIU2hWX" role="3clFbG">
            <node concept="2YIFZM" id="3LlMlIU2hWY" role="37vLTx">
              <ref role="37wK5l" node="3HJD4JbIwg9" resolve="getInstance" />
              <ref role="1Pybhc" node="3HJD4JbIwfM" resolve="DataFlowManager" />
            </node>
            <node concept="2OqwBi" id="3LlMlIU2hWZ" role="37vLTJ">
              <node concept="Xjq3P" id="3LlMlIU2hX0" role="2Oq$k0" />
              <node concept="2OwXpG" id="3LlMlIU2hX1" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvBo" resolve="myDataFlowManager" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="3LlMlIU2hrS" role="jymVt" />
    <node concept="3clFbW" id="3HJD4JbIvBv" role="jymVt">
      <node concept="3Tm1VV" id="3HJD4JbIvBw" role="1B3o_S" />
      <node concept="37vLTG" id="3HJD4JbIvBx" role="3clF46">
        <property role="TrG5h" value="dataFlowManager" />
        <node concept="3uibUv" id="3HJD4JbIvBy" role="1tU5fm">
          <ref role="3uigEE" node="3HJD4JbIwfM" resolve="DataFlowManager" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIvBz" role="3clF47">
        <node concept="3clFbF" id="3HJD4JbIvB$" role="3cqZAp">
          <node concept="37vLTI" id="3HJD4JbIvB_" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIvBA" role="37vLTJ">
              <node concept="2OwXpG" id="3HJD4JbIvBB" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvBo" resolve="myDataFlowManager" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIvBC" role="2Oq$k0" />
            </node>
            <node concept="37vLTw" id="2BHiRxgmySR" role="37vLTx">
              <ref role="3cqZAo" node="3HJD4JbIvBx" resolve="dataFlowManager" />
            </node>
          </node>
        </node>
      </node>
      <node concept="P$JXv" id="qrAFe9j8me" role="lGtFl">
        <node concept="TZ5HI" id="qrAFe9j8mf" role="3nqlJM">
          <node concept="TZ5HA" id="qrAFe9j8mg" role="3HnX3l" />
        </node>
      </node>
      <node concept="2AHcQZ" id="qrAFe9j8mh" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Deprecated" resolve="Deprecated" />
      </node>
    </node>
    <node concept="3clFb_" id="3LlMlIU252u" role="jymVt">
      <property role="TrG5h" value="createContext" />
      <property role="DiZV1" value="false" />
      <property role="od$2w" value="false" />
      <node concept="37vLTG" id="3LlMlIU252v" role="3clF46">
        <property role="TrG5h" value="node" />
        <property role="3TUv4t" value="false" />
        <node concept="3Tqbb2" id="3LlMlIU28Bp" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="3LlMlIU252x" role="3clF47">
        <node concept="3cpWs6" id="3LlMlIU252y" role="3cqZAp">
          <node concept="2ShNRf" id="3LlMlIU252C" role="3cqZAk">
            <node concept="1pGfFk" id="3LlMlIU252D" role="2ShVmc">
              <ref role="37wK5l" node="3HJD4JbIvKC" resolve="DataFlowBuilderContext" />
              <node concept="37vLTw" id="3LlMlIU252$" role="37wK5m">
                <ref role="3cqZAo" node="3LlMlIU252v" resolve="node" />
              </node>
              <node concept="Xjq3P" id="3LlMlIU252_" role="37wK5m" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tmbuc" id="3LlMlIU252A" role="1B3o_S" />
      <node concept="3uibUv" id="3LlMlIU252B" role="3clF45">
        <ref role="3uigEE" node="3HJD4JbIvKw" resolve="DataFlowBuilderContext" />
      </node>
    </node>
    <node concept="2tJIrI" id="3LlMlIU24Ru" role="jymVt" />
    <node concept="3clFb_" id="3HJD4JbIvBE" role="jymVt">
      <property role="TrG5h" value="doBuild" />
      <node concept="3Tmbuc" id="3HJD4JbIvBF" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIvBG" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIvBH" role="3clF46">
        <property role="TrG5h" value="node" />
        <node concept="3uibUv" id="3HJD4JbIvBI" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIvBJ" role="3clF47">
        <node concept="3clFbJ" id="3HJD4JbIvBK" role="3cqZAp">
          <node concept="3clFbC" id="3HJD4JbIvBL" role="3clFbw">
            <node concept="37vLTw" id="2BHiRxgm6pG" role="3uHU7B">
              <ref role="3cqZAo" node="3HJD4JbIvBH" resolve="node" />
            </node>
            <node concept="10Nm6u" id="3HJD4JbIvBN" role="3uHU7w" />
          </node>
          <node concept="3clFbS" id="3HJD4JbIvBO" role="3clFbx">
            <node concept="3cpWs6" id="3HJD4JbIvBP" role="3cqZAp" />
          </node>
        </node>
        <node concept="3cpWs8" id="3HJD4JbIvBQ" role="3cqZAp">
          <node concept="3cpWsn" id="3HJD4JbIvBR" role="3cpWs9">
            <property role="TrG5h" value="snode" />
            <node concept="3Tqbb2" id="7laMVk8YvqW" role="1tU5fm" />
            <node concept="37vLTw" id="2BHiRxglp42" role="33vP2m">
              <ref role="3cqZAo" node="3HJD4JbIvBH" resolve="node" />
            </node>
          </node>
        </node>
        <node concept="1DcWWT" id="3HJD4JbIvC4" role="3cqZAp">
          <node concept="3cpWsn" id="3HJD4JbIvC6" role="1Duv9x">
            <property role="TrG5h" value="concept" />
            <node concept="3bZ5Sz" id="6hI7daPNX6r" role="1tU5fm" />
          </node>
          <node concept="3clFbS" id="3HJD4JbIvC8" role="2LFqv$">
            <node concept="3cpWs8" id="qrAFe9jhS9" role="3cqZAp">
              <node concept="3cpWsn" id="qrAFe9jhSa" role="3cpWs9">
                <property role="TrG5h" value="dataFlowBuilder" />
                <node concept="3uibUv" id="qrAFe9jhS8" role="1tU5fm">
                  <ref role="3uigEE" to="1fjm:~IDataFlowBuilder" resolve="IDataFlowBuilder" />
                </node>
                <node concept="1rXfSq" id="qrAFe9jhSb" role="33vP2m">
                  <ref role="37wK5l" node="qrAFe9jgjN" resolve="getDataFlowBuilder" />
                  <node concept="37vLTw" id="qrAFe9jhSc" role="37wK5m">
                    <ref role="3cqZAo" node="3HJD4JbIvC6" resolve="concept" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbH" id="qrAFe9jiGO" role="3cqZAp" />
            <node concept="3SKdUt" id="qrAFe9jiEi" role="3cqZAp">
              <node concept="3SKdUq" id="qrAFe9jiEk" role="3SKWNk">
                <property role="3SKdUp" value="todo to remove after 3.4" />
              </node>
            </node>
            <node concept="3clFbJ" id="qrAFe9ji17" role="3cqZAp">
              <node concept="3clFbS" id="qrAFe9ji19" role="3clFbx">
                <node concept="3clFbF" id="qrAFe9jifr" role="3cqZAp">
                  <node concept="37vLTI" id="qrAFe9jihP" role="3clFbG">
                    <node concept="37vLTw" id="qrAFe9jifp" role="37vLTJ">
                      <ref role="3cqZAo" node="qrAFe9jhSa" resolve="dataFlowBuilder" />
                    </node>
                    <node concept="2OqwBi" id="qrAFe9jii4" role="37vLTx">
                      <node concept="2OqwBi" id="qrAFe9jii5" role="2Oq$k0">
                        <node concept="2OwXpG" id="qrAFe9jii6" role="2OqNvi">
                          <ref role="2Oxat5" node="3HJD4JbIvBo" resolve="myDataFlowManager" />
                        </node>
                        <node concept="Xjq3P" id="qrAFe9jii7" role="2Oq$k0" />
                      </node>
                      <node concept="liA8E" id="qrAFe9jii8" role="2OqNvi">
                        <ref role="37wK5l" node="qrAFe9iBU8" resolve="getBuilderFor" />
                        <node concept="2OqwBi" id="qrAFe9urnY" role="37wK5m">
                          <node concept="37vLTw" id="qrAFe9jii9" role="2Oq$k0">
                            <ref role="3cqZAo" node="3HJD4JbIvC6" resolve="concept" />
                          </node>
                          <node concept="liA8E" id="qrAFe9urqC" role="2OqNvi">
                            <ref role="37wK5l" to="c17a:~SAbstractConcept.getQualifiedName():java.lang.String" resolve="getQualifiedName" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="1Wc70l" id="qrAFe9jl10" role="3clFbw">
                <node concept="3y3z36" id="qrAFe9jlml" role="3uHU7w">
                  <node concept="10Nm6u" id="qrAFe9jlp$" role="3uHU7w" />
                  <node concept="2OqwBi" id="qrAFe9jl7i" role="3uHU7B">
                    <node concept="Xjq3P" id="qrAFe9jl43" role="2Oq$k0" />
                    <node concept="2OwXpG" id="qrAFe9jlgo" role="2OqNvi">
                      <ref role="2Oxat5" node="3HJD4JbIvBo" resolve="myDataFlowManager" />
                    </node>
                  </node>
                </node>
                <node concept="3clFbC" id="qrAFe9ji9v" role="3uHU7B">
                  <node concept="37vLTw" id="qrAFe9ji73" role="3uHU7B">
                    <ref role="3cqZAo" node="qrAFe9jhSa" resolve="dataFlowBuilder" />
                  </node>
                  <node concept="10Nm6u" id="qrAFe9jibz" role="3uHU7w" />
                </node>
              </node>
            </node>
            <node concept="3clFbJ" id="3HJD4JbIvCj" role="3cqZAp">
              <node concept="3y3z36" id="3HJD4JbIvCk" role="3clFbw">
                <node concept="37vLTw" id="qrAFe9jiqK" role="3uHU7B">
                  <ref role="3cqZAo" node="qrAFe9jhSa" resolve="dataFlowBuilder" />
                </node>
                <node concept="10Nm6u" id="3HJD4JbIvCm" role="3uHU7w" />
              </node>
              <node concept="3clFbS" id="3HJD4JbIvCn" role="3clFbx">
                <node concept="3clFbF" id="3HJD4JbIvCo" role="3cqZAp">
                  <node concept="2OqwBi" id="3HJD4JbIvCp" role="3clFbG">
                    <node concept="37vLTw" id="qrAFe9ji_f" role="2Oq$k0">
                      <ref role="3cqZAo" node="qrAFe9jhSa" resolve="dataFlowBuilder" />
                    </node>
                    <node concept="liA8E" id="3HJD4JbIvCr" role="2OqNvi">
                      <ref role="37wK5l" to="1fjm:~IDataFlowBuilder.build(jetbrains.mps.lang.dataFlow.DataFlowBuilderContext):void" resolve="build" />
                      <node concept="1rXfSq" id="3LlMlIU2eXv" role="37wK5m">
                        <ref role="37wK5l" node="3LlMlIU252u" resolve="createContext" />
                        <node concept="37vLTw" id="3LlMlIU2fgo" role="37wK5m">
                          <ref role="3cqZAo" node="3HJD4JbIvBR" resolve="snode" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="15s5l7" id="3LlMlIU2jJE" role="lGtFl" />
                </node>
                <node concept="3zACq4" id="3HJD4JbIvCx" role="3cqZAp" />
              </node>
            </node>
          </node>
          <node concept="2OqwBi" id="6hI7daPNWfY" role="1DdaDG">
            <node concept="2OqwBi" id="6hI7daPNLZt" role="2Oq$k0">
              <node concept="37vLTw" id="6hI7daPNLB9" role="2Oq$k0">
                <ref role="3cqZAo" node="3HJD4JbIvBR" resolve="snode" />
              </node>
              <node concept="2yIwOk" id="6hI7daPNW43" role="2OqNvi" />
            </node>
            <node concept="3oJPKh" id="6hI7daPNWto" role="2OqNvi">
              <node concept="1xIGOp" id="6hI7daPOr8K" role="1xVPHs" />
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3tYsUK_sScU" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIvCy" role="jymVt">
      <property role="TrG5h" value="emitMayBeUnreachable" />
      <node concept="3Tm1VV" id="3HJD4JbIvCz" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIvC$" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIvC_" role="3clF46">
        <property role="TrG5h" value="r" />
        <node concept="3uibUv" id="3HJD4JbIvCA" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~Runnable" resolve="Runnable" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIvCB" role="3clF47">
        <node concept="3cpWs8" id="3HJD4JbIvCC" role="3cqZAp">
          <node concept="3cpWsn" id="3HJD4JbIvCD" role="3cpWs9">
            <property role="TrG5h" value="oldMayBeUnreachable" />
            <node concept="10P_77" id="3HJD4JbIvCE" role="1tU5fm" />
            <node concept="2OqwBi" id="3HJD4JbIvCF" role="33vP2m">
              <node concept="2OwXpG" id="3HJD4JbIvCG" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvBr" resolve="myMayBeUnreachable" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIvCH" role="2Oq$k0" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIvCI" role="3cqZAp">
          <node concept="37vLTI" id="3HJD4JbIvCJ" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIvCK" role="37vLTJ">
              <node concept="2OwXpG" id="3HJD4JbIvCL" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvBr" resolve="myMayBeUnreachable" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIvCM" role="2Oq$k0" />
            </node>
            <node concept="3clFbT" id="3HJD4JbIvCN" role="37vLTx">
              <property role="3clFbU" value="true" />
            </node>
          </node>
        </node>
        <node concept="2GUZhq" id="3HJD4JbIvCO" role="3cqZAp">
          <node concept="3clFbS" id="3HJD4JbIvCP" role="2GVbov">
            <node concept="3clFbF" id="3HJD4JbIvCQ" role="3cqZAp">
              <node concept="37vLTI" id="3HJD4JbIvCR" role="3clFbG">
                <node concept="2OqwBi" id="3HJD4JbIvCS" role="37vLTJ">
                  <node concept="2OwXpG" id="3HJD4JbIvCT" role="2OqNvi">
                    <ref role="2Oxat5" node="3HJD4JbIvBr" resolve="myMayBeUnreachable" />
                  </node>
                  <node concept="Xjq3P" id="3HJD4JbIvCU" role="2Oq$k0" />
                </node>
                <node concept="37vLTw" id="3GM_nagTAp_" role="37vLTx">
                  <ref role="3cqZAo" node="3HJD4JbIvCD" resolve="oldMayBeUnreachable" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbS" id="3HJD4JbIvCW" role="2GV8ay">
            <node concept="3clFbF" id="3HJD4JbIvCX" role="3cqZAp">
              <node concept="2OqwBi" id="3HJD4JbIvCY" role="3clFbG">
                <node concept="37vLTw" id="2BHiRxglqe3" role="2Oq$k0">
                  <ref role="3cqZAo" node="3HJD4JbIvC_" resolve="r" />
                </node>
                <node concept="liA8E" id="3HJD4JbIvD0" role="2OqNvi">
                  <ref role="37wK5l" to="wyt6:~Runnable.run():void" resolve="run" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIvD1" role="jymVt">
      <property role="TrG5h" value="onInstructionEmitted" />
      <node concept="3Tmbuc" id="3HJD4JbIvD2" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIvD3" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIvD4" role="3clF46">
        <property role="TrG5h" value="instruction" />
        <node concept="3uibUv" id="3HJD4JbIvD5" role="1tU5fm">
          <ref role="3uigEE" to="dau9:~Instruction" resolve="Instruction" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIvD6" role="3clF47">
        <node concept="3clFbF" id="3HJD4JbIvD7" role="3cqZAp">
          <node concept="3nyPlj" id="3HJD4JbIvD8" role="3clFbG">
            <ref role="37wK5l" to="1fjm:~StructuralProgramBuilder.onInstructionEmitted(jetbrains.mps.lang.dataFlow.framework.instructions.Instruction):void" resolve="onInstructionEmitted" />
            <node concept="37vLTw" id="2BHiRxgmpfz" role="37wK5m">
              <ref role="3cqZAo" node="3HJD4JbIvD4" resolve="instruction" />
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="3HJD4JbIvDa" role="3cqZAp">
          <node concept="22lmx$" id="3HJD4JbIvDb" role="3clFbw">
            <node concept="2OqwBi" id="3HJD4JbIvDc" role="3uHU7B">
              <node concept="2OwXpG" id="3HJD4JbIvDd" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvBr" resolve="myMayBeUnreachable" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIvDe" role="2Oq$k0" />
            </node>
            <node concept="2ZW3vV" id="3HJD4JbIvDf" role="3uHU7w">
              <node concept="37vLTw" id="2BHiRxghiGD" role="2ZW6bz">
                <ref role="3cqZAo" node="3HJD4JbIvD4" resolve="instruction" />
              </node>
              <node concept="3uibUv" id="3HJD4JbIvDh" role="2ZW6by">
                <ref role="3uigEE" to="dau9:~EndTryInstruction" resolve="EndTryInstruction" />
              </node>
            </node>
          </node>
          <node concept="3clFbS" id="3HJD4JbIvDi" role="3clFbx">
            <node concept="3clFbF" id="3HJD4JbIvDj" role="3cqZAp">
              <node concept="2OqwBi" id="3HJD4JbIvDk" role="3clFbG">
                <node concept="37vLTw" id="2BHiRxgkWlG" role="2Oq$k0">
                  <ref role="3cqZAo" node="3HJD4JbIvD4" resolve="instruction" />
                </node>
                <node concept="liA8E" id="3HJD4JbIvDm" role="2OqNvi">
                  <ref role="37wK5l" to="dau9:~Instruction.putUserObject(java.lang.Object,java.lang.Object):void" resolve="putUserObject" />
                  <node concept="10M0yZ" id="3HJD4JbIvDn" role="37wK5m">
                    <ref role="1PxDUh" node="3HJD4JbIw9v" resolve="DataFlow" />
                    <ref role="3cqZAo" node="3HJD4JbIw9x" resolve="MAY_BE_UNREACHABLE" />
                  </node>
                  <node concept="3clFbT" id="3HJD4JbIvDo" role="37wK5m">
                    <property role="3clFbU" value="true" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3tYsUK_sScT" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="2tJIrI" id="qrAFe9jg0P" role="jymVt" />
    <node concept="3clFb_" id="qrAFe9jgjN" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getDataFlowBuilder" />
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <node concept="3clFbS" id="qrAFe9jgjQ" role="3clF47">
        <node concept="3cpWs8" id="qrAFe9jprH" role="3cqZAp">
          <node concept="3cpWsn" id="qrAFe9jprI" role="3cpWs9">
            <property role="TrG5h" value="instance" />
            <node concept="3uibUv" id="qrAFe9jprG" role="1tU5fm">
              <ref role="3uigEE" to="vndm:~LanguageRegistry" resolve="LanguageRegistry" />
            </node>
            <node concept="3K4zz7" id="qrAFe9jraf" role="33vP2m">
              <node concept="3y3z36" id="qrAFe9jr_5" role="3K4Cdx">
                <node concept="10Nm6u" id="qrAFe9jrLx" role="3uHU7w" />
                <node concept="37vLTw" id="qrAFe9jrnO" role="3uHU7B">
                  <ref role="3cqZAo" node="qrAFe9jpfC" resolve="myRepository" />
                </node>
              </node>
              <node concept="2YIFZM" id="qrAFe9jprJ" role="3K4E3e">
                <ref role="1Pybhc" to="vndm:~LanguageRegistry" resolve="LanguageRegistry" />
                <ref role="37wK5l" to="vndm:~LanguageRegistry.getInstance(org.jetbrains.mps.openapi.module.SRepository):jetbrains.mps.smodel.language.LanguageRegistry" resolve="getInstance" />
                <node concept="37vLTw" id="qrAFe9jpXu" role="37wK5m">
                  <ref role="3cqZAo" node="qrAFe9jpfC" resolve="myRepository" />
                </node>
              </node>
              <node concept="2YIFZM" id="qrAFe9jrXZ" role="3K4GZi">
                <ref role="1Pybhc" to="vndm:~LanguageRegistry" resolve="LanguageRegistry" />
                <ref role="37wK5l" to="vndm:~LanguageRegistry.getInstance():jetbrains.mps.smodel.language.LanguageRegistry" resolve="getInstance" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="qrAFe9iHkl" role="3cqZAp">
          <node concept="3cpWsn" id="qrAFe9iHkm" role="3cpWs9">
            <property role="TrG5h" value="language" />
            <node concept="3uibUv" id="qrAFe9iHke" role="1tU5fm">
              <ref role="3uigEE" to="vndm:~LanguageRuntime" resolve="LanguageRuntime" />
            </node>
            <node concept="2OqwBi" id="qrAFe9iHkn" role="33vP2m">
              <node concept="37vLTw" id="qrAFe9jprK" role="2Oq$k0">
                <ref role="3cqZAo" node="qrAFe9jprI" resolve="instance" />
              </node>
              <node concept="liA8E" id="qrAFe9iHkp" role="2OqNvi">
                <ref role="37wK5l" to="vndm:~LanguageRegistry.getLanguage(org.jetbrains.mps.openapi.language.SLanguage):jetbrains.mps.smodel.language.LanguageRuntime" resolve="getLanguage" />
                <node concept="2OqwBi" id="qrAFe9iHkq" role="37wK5m">
                  <node concept="37vLTw" id="qrAFe9jgGa" role="2Oq$k0">
                    <ref role="3cqZAo" node="qrAFe9jg$2" resolve="concept" />
                  </node>
                  <node concept="liA8E" id="qrAFe9iHks" role="2OqNvi">
                    <ref role="37wK5l" to="c17a:~SAbstractConcept.getLanguage():org.jetbrains.mps.openapi.language.SLanguage" resolve="getLanguage" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="qrAFe9j4qe" role="3cqZAp">
          <node concept="3clFbS" id="qrAFe9j4qg" role="3clFbx">
            <node concept="3cpWs8" id="qrAFe9iHZO" role="3cqZAp">
              <node concept="3cpWsn" id="qrAFe9iHZP" role="3cpWs9">
                <property role="TrG5h" value="aspect" />
                <node concept="3uibUv" id="qrAFe9iHZ_" role="1tU5fm">
                  <ref role="3uigEE" to="1fjm:~DataFlowAspectDescriptor" resolve="DataFlowAspectDescriptor" />
                </node>
                <node concept="2OqwBi" id="qrAFe9iHZQ" role="33vP2m">
                  <node concept="37vLTw" id="qrAFe9iHZR" role="2Oq$k0">
                    <ref role="3cqZAo" node="qrAFe9iHkm" resolve="language" />
                  </node>
                  <node concept="liA8E" id="qrAFe9iHZS" role="2OqNvi">
                    <ref role="37wK5l" to="vndm:~LanguageRuntime.getAspect(java.lang.Class):jetbrains.mps.smodel.runtime.ILanguageAspect" resolve="getAspect" />
                    <node concept="3VsKOn" id="qrAFe9iHZT" role="37wK5m">
                      <ref role="3VsUkX" to="1fjm:~DataFlowAspectDescriptor" resolve="DataFlowAspectDescriptor" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbJ" id="qrAFe9iItf" role="3cqZAp">
              <node concept="3clFbS" id="qrAFe9iIth" role="3clFbx">
                <node concept="3cpWs8" id="qrAFe9iJ$$" role="3cqZAp">
                  <node concept="3cpWsn" id="qrAFe9iJ$_" role="3cpWs9">
                    <property role="TrG5h" value="dataFlowBuilders" />
                    <node concept="3uibUv" id="qrAFe9iJ$t" role="1tU5fm">
                      <ref role="3uigEE" to="33ny:~Collection" resolve="Collection" />
                      <node concept="3uibUv" id="qrAFe9iJ$w" role="11_B2D">
                        <ref role="3uigEE" to="1fjm:~IDataFlowBuilder" resolve="IDataFlowBuilder" />
                      </node>
                    </node>
                    <node concept="2OqwBi" id="qrAFe9iJ$A" role="33vP2m">
                      <node concept="1eOMI4" id="qrAFe9iJ$B" role="2Oq$k0">
                        <node concept="10QFUN" id="qrAFe9iJ$C" role="1eOMHV">
                          <node concept="37vLTw" id="qrAFe9iJ$D" role="10QFUP">
                            <ref role="3cqZAo" node="qrAFe9iHZP" resolve="aspect" />
                          </node>
                          <node concept="3uibUv" id="qrAFe9iJ$E" role="10QFUM">
                            <ref role="3uigEE" to="1fjm:~DataFlowAspectDescriptorBase" resolve="DataFlowAspectDescriptorBase" />
                          </node>
                        </node>
                      </node>
                      <node concept="liA8E" id="qrAFe9iJ$F" role="2OqNvi">
                        <ref role="37wK5l" to="1fjm:~DataFlowAspectDescriptorBase.getDataFlowBuilders(org.jetbrains.mps.openapi.language.SAbstractConcept):java.util.Collection" resolve="getDataFlowBuilders" />
                        <node concept="37vLTw" id="qrAFe9jgUI" role="37wK5m">
                          <ref role="3cqZAo" node="qrAFe9jg$2" resolve="concept" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbJ" id="qrAFe9iJNS" role="3cqZAp">
                  <node concept="3clFbS" id="qrAFe9iJNU" role="3clFbx">
                    <node concept="3cpWs6" id="qrAFe9iKlg" role="3cqZAp">
                      <node concept="2OqwBi" id="qrAFe9iQBZ" role="3cqZAk">
                        <node concept="2OqwBi" id="qrAFe9iQC0" role="2Oq$k0">
                          <node concept="37vLTw" id="qrAFe9iQC1" role="2Oq$k0">
                            <ref role="3cqZAo" node="qrAFe9iJ$_" resolve="dataFlowBuilders" />
                          </node>
                          <node concept="liA8E" id="qrAFe9iQC2" role="2OqNvi">
                            <ref role="37wK5l" to="33ny:~Collection.iterator():java.util.Iterator" resolve="iterator" />
                          </node>
                        </node>
                        <node concept="liA8E" id="qrAFe9iQC3" role="2OqNvi">
                          <ref role="37wK5l" to="33ny:~Iterator.next():java.lang.Object" resolve="next" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3fqX7Q" id="qrAFe9iKjq" role="3clFbw">
                    <node concept="2OqwBi" id="qrAFe9iKjs" role="3fr31v">
                      <node concept="37vLTw" id="qrAFe9iKjt" role="2Oq$k0">
                        <ref role="3cqZAo" node="qrAFe9iJ$_" resolve="dataFlowBuilders" />
                      </node>
                      <node concept="liA8E" id="qrAFe9iKju" role="2OqNvi">
                        <ref role="37wK5l" to="33ny:~Collection.isEmpty():boolean" resolve="isEmpty" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="2ZW3vV" id="qrAFe9iIY9" role="3clFbw">
                <node concept="3uibUv" id="qrAFe9iJ07" role="2ZW6by">
                  <ref role="3uigEE" to="1fjm:~DataFlowAspectDescriptorBase" resolve="DataFlowAspectDescriptorBase" />
                </node>
                <node concept="37vLTw" id="qrAFe9iICf" role="2ZW6bz">
                  <ref role="3cqZAo" node="qrAFe9iHZP" resolve="aspect" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3y3z36" id="qrAFe9j4P7" role="3clFbw">
            <node concept="10Nm6u" id="qrAFe9j51P" role="3uHU7w" />
            <node concept="37vLTw" id="qrAFe9j4Ca" role="3uHU7B">
              <ref role="3cqZAo" node="qrAFe9iHkm" resolve="language" />
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="qrAFe9iRCN" role="3cqZAp">
          <node concept="10Nm6u" id="qrAFe9iRPM" role="3cqZAk" />
        </node>
      </node>
      <node concept="3Tm6S6" id="qrAFe9jgds" role="1B3o_S" />
      <node concept="37vLTG" id="qrAFe9jg$2" role="3clF46">
        <property role="TrG5h" value="concept" />
        <node concept="3uibUv" id="qrAFe9jg$1" role="1tU5fm">
          <ref role="3uigEE" to="c17a:~SAbstractConcept" resolve="SAbstractConcept" />
        </node>
      </node>
      <node concept="3uibUv" id="qrAFe9jh0E" role="3clF45">
        <ref role="3uigEE" to="1fjm:~IDataFlowBuilder" resolve="IDataFlowBuilder" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="3HJD4JbIvKw">
    <property role="TrG5h" value="DataFlowBuilderContext" />
    <node concept="3Tm1VV" id="3HJD4JbIvKx" role="1B3o_S" />
    <node concept="312cEg" id="3HJD4JbIvKy" role="jymVt">
      <property role="TrG5h" value="myNode" />
      <node concept="3uibUv" id="3HJD4JbIvKz" role="1tU5fm">
        <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
      </node>
      <node concept="3Tm6S6" id="3HJD4JbIvK$" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="3HJD4JbIvK_" role="jymVt">
      <property role="TrG5h" value="myBuilder" />
      <node concept="3uibUv" id="3HJD4JbIvKA" role="1tU5fm">
        <ref role="3uigEE" node="3HJD4JbIvBk" resolve="MPSProgramBuilder" />
      </node>
      <node concept="3Tm6S6" id="3HJD4JbIvKB" role="1B3o_S" />
    </node>
    <node concept="3clFbW" id="3HJD4JbIvKC" role="jymVt">
      <node concept="3Tm1VV" id="3HJD4JbIvKD" role="1B3o_S" />
      <node concept="37vLTG" id="3HJD4JbIvKE" role="3clF46">
        <property role="TrG5h" value="node" />
        <node concept="3uibUv" id="3HJD4JbIvKF" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
        </node>
      </node>
      <node concept="37vLTG" id="3HJD4JbIvKG" role="3clF46">
        <property role="TrG5h" value="builder" />
        <node concept="3uibUv" id="3HJD4JbIvKH" role="1tU5fm">
          <ref role="3uigEE" node="3HJD4JbIvBk" resolve="MPSProgramBuilder" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIvKI" role="3clF47">
        <node concept="3clFbF" id="3HJD4JbIvKJ" role="3cqZAp">
          <node concept="37vLTI" id="3HJD4JbIvKK" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIvKL" role="37vLTJ">
              <node concept="2OwXpG" id="3HJD4JbIvKM" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvKy" resolve="myNode" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIvKN" role="2Oq$k0" />
            </node>
            <node concept="37vLTw" id="2BHiRxgm6M5" role="37vLTx">
              <ref role="3cqZAo" node="3HJD4JbIvKE" resolve="node" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIvKP" role="3cqZAp">
          <node concept="37vLTI" id="3HJD4JbIvKQ" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIvKR" role="37vLTJ">
              <node concept="2OwXpG" id="3HJD4JbIvKS" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIvK_" resolve="myBuilder" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIvKT" role="2Oq$k0" />
            </node>
            <node concept="37vLTw" id="2BHiRxgkWBW" role="37vLTx">
              <ref role="3cqZAo" node="3HJD4JbIvKG" resolve="builder" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIvKV" role="jymVt">
      <property role="TrG5h" value="getBuilder" />
      <node concept="3Tm1VV" id="3HJD4JbIvKW" role="1B3o_S" />
      <node concept="3uibUv" id="3HJD4JbIvKX" role="3clF45">
        <ref role="3uigEE" node="3HJD4JbIvBk" resolve="MPSProgramBuilder" />
      </node>
      <node concept="3clFbS" id="3HJD4JbIvKY" role="3clF47">
        <node concept="3cpWs6" id="3HJD4JbIvKZ" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIvL0" role="3cqZAk">
            <node concept="2OwXpG" id="3HJD4JbIvL1" role="2OqNvi">
              <ref role="2Oxat5" node="3HJD4JbIvK_" resolve="myBuilder" />
            </node>
            <node concept="Xjq3P" id="3HJD4JbIvL2" role="2Oq$k0" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIvL3" role="jymVt">
      <property role="TrG5h" value="getNode" />
      <node concept="3Tm1VV" id="3HJD4JbIvL4" role="1B3o_S" />
      <node concept="3uibUv" id="3HJD4JbIvL5" role="3clF45">
        <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
      </node>
      <node concept="3clFbS" id="3HJD4JbIvL6" role="3clF47">
        <node concept="3cpWs6" id="3HJD4JbIvL7" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIvL8" role="3cqZAk">
            <node concept="2OwXpG" id="3HJD4JbIvL9" role="2OqNvi">
              <ref role="2Oxat5" node="3HJD4JbIvKy" resolve="myNode" />
            </node>
            <node concept="Xjq3P" id="3HJD4JbIvLa" role="2Oq$k0" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="312cEu" id="3HJD4JbIw7C">
    <property role="TrG5h" value="DataflowBuilderException" />
    <node concept="3Tm1VV" id="3HJD4JbIw7D" role="1B3o_S" />
    <node concept="3uibUv" id="3HJD4JbIw7E" role="1zkMxy">
      <ref role="3uigEE" to="wyt6:~RuntimeException" resolve="RuntimeException" />
    </node>
    <node concept="3clFbW" id="3HJD4JbIw7F" role="jymVt">
      <node concept="3Tm1VV" id="3HJD4JbIw7G" role="1B3o_S" />
      <node concept="37vLTG" id="3HJD4JbIw7H" role="3clF46">
        <property role="TrG5h" value="s" />
        <node concept="17QB3L" id="3MUxWWhZPsH" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="3HJD4JbIw7J" role="3clF47">
        <node concept="XkiVB" id="3HJD4JbIw7K" role="3cqZAp">
          <ref role="37wK5l" to="wyt6:~RuntimeException.&lt;init&gt;(java.lang.String)" resolve="RuntimeException" />
          <node concept="37vLTw" id="2BHiRxgm6ZD" role="37wK5m">
            <ref role="3cqZAo" node="3HJD4JbIw7H" resolve="s" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="312cEu" id="3HJD4JbIw9v">
    <property role="TrG5h" value="DataFlow" />
    <node concept="3Tm1VV" id="3HJD4JbIw9w" role="1B3o_S" />
    <node concept="Wx3nA" id="3HJD4JbIw9x" role="jymVt">
      <property role="TrG5h" value="MAY_BE_UNREACHABLE" />
      <property role="3TUv4t" value="true" />
      <node concept="17QB3L" id="3MUxWWhZPst" role="1tU5fm" />
      <node concept="Xl_RD" id="3HJD4JbIw9z" role="33vP2m">
        <property role="Xl_RC" value="mayBeUnreachable" />
      </node>
    </node>
    <node concept="3clFbW" id="3HJD4JbIw9$" role="jymVt">
      <node concept="3Tm1VV" id="3HJD4JbIw9_" role="1B3o_S" />
      <node concept="3clFbS" id="3HJD4JbIw9A" role="3clF47" />
    </node>
    <node concept="2YIFZL" id="3HJD4JbIw9B" role="jymVt">
      <property role="TrG5h" value="mayBeUnreachable" />
      <node concept="3Tm6S6" id="3HJD4JbIw9C" role="1B3o_S" />
      <node concept="10P_77" id="3HJD4JbIw9D" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIw9E" role="3clF46">
        <property role="TrG5h" value="instruction" />
        <node concept="3uibUv" id="3HJD4JbIw9F" role="1tU5fm">
          <ref role="3uigEE" to="dau9:~Instruction" resolve="Instruction" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIw9G" role="3clF47">
        <node concept="3cpWs6" id="3HJD4JbIw9H" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIw9I" role="3cqZAk">
            <node concept="10M0yZ" id="3HJD4JbIw9J" role="2Oq$k0">
              <ref role="1PxDUh" to="wyt6:~Boolean" resolve="Boolean" />
              <ref role="3cqZAo" to="wyt6:~Boolean.TRUE" resolve="TRUE" />
            </node>
            <node concept="liA8E" id="3HJD4JbIw9K" role="2OqNvi">
              <ref role="37wK5l" to="wyt6:~Boolean.equals(java.lang.Object):boolean" resolve="equals" />
              <node concept="2OqwBi" id="3HJD4JbIw9L" role="37wK5m">
                <node concept="37vLTw" id="2BHiRxgliMq" role="2Oq$k0">
                  <ref role="3cqZAo" node="3HJD4JbIw9E" resolve="instruction" />
                </node>
                <node concept="liA8E" id="3HJD4JbIw9N" role="2OqNvi">
                  <ref role="37wK5l" to="dau9:~Instruction.getUserObject(java.lang.Object):java.lang.Object" resolve="getUserObject" />
                  <node concept="37vLTw" id="2BHiRxeohbq" role="37wK5m">
                    <ref role="3cqZAo" node="3HJD4JbIw9x" resolve="MAY_BE_UNREACHABLE" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2YIFZL" id="3HJD4JbIw9P" role="jymVt">
      <property role="TrG5h" value="buildProgram" />
      <node concept="3Tm1VV" id="3HJD4JbIw9Q" role="1B3o_S" />
      <node concept="3uibUv" id="3HJD4JbIw9R" role="3clF45">
        <ref role="3uigEE" to="1fjm:~Program" resolve="Program" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIw9S" role="3clF46">
        <property role="TrG5h" value="node" />
        <node concept="3uibUv" id="3HJD4JbIw9T" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIw9U" role="3clF47">
        <node concept="3cpWs6" id="3HJD4JbIw9V" role="3cqZAp">
          <node concept="2OqwBi" id="qrAFe9jSKo" role="3cqZAk">
            <node concept="2ShNRf" id="qrAFe9jSKp" role="2Oq$k0">
              <node concept="1pGfFk" id="qrAFe9jSKq" role="2ShVmc">
                <ref role="37wK5l" node="4mpxoQud1f6" resolve="MPSProgramBuilder" />
              </node>
            </node>
            <node concept="liA8E" id="qrAFe9jSKs" role="2OqNvi">
              <ref role="37wK5l" to="1fjm:~StructuralProgramBuilder.buildProgram(java.lang.Object):jetbrains.mps.lang.dataFlow.framework.Program" resolve="buildProgram" />
              <node concept="37vLTw" id="qrAFe9k5pL" role="37wK5m">
                <ref role="3cqZAo" node="3HJD4JbIw9S" resolve="node" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2YIFZL" id="3HJD4JbIwa0" role="jymVt">
      <property role="TrG5h" value="getUnreachableNodes" />
      <node concept="3Tm1VV" id="3HJD4JbIwa1" role="1B3o_S" />
      <node concept="3uibUv" id="3HJD4JbIwa2" role="3clF45">
        <ref role="3uigEE" to="33ny:~Set" resolve="Set" />
        <node concept="3uibUv" id="3HJD4JbIwa3" role="11_B2D">
          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
        </node>
      </node>
      <node concept="37vLTG" id="3HJD4JbIwa4" role="3clF46">
        <property role="TrG5h" value="program" />
        <node concept="3uibUv" id="3HJD4JbIwa5" role="1tU5fm">
          <ref role="3uigEE" to="1fjm:~Program" resolve="Program" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIwa6" role="3clF47">
        <node concept="3cpWs8" id="3HJD4JbIwa7" role="3cqZAp">
          <node concept="3cpWsn" id="3HJD4JbIwa8" role="3cpWs9">
            <property role="TrG5h" value="unreachable" />
            <node concept="3uibUv" id="3HJD4JbIwa9" role="1tU5fm">
              <ref role="3uigEE" to="33ny:~Set" resolve="Set" />
              <node concept="3uibUv" id="3HJD4JbIwaa" role="11_B2D">
                <ref role="3uigEE" to="dau9:~Instruction" resolve="Instruction" />
              </node>
            </node>
            <node concept="2OqwBi" id="3HJD4JbIwab" role="33vP2m">
              <node concept="37vLTw" id="2BHiRxglpNw" role="2Oq$k0">
                <ref role="3cqZAo" node="3HJD4JbIwa4" resolve="program" />
              </node>
              <node concept="liA8E" id="3HJD4JbIwad" role="2OqNvi">
                <ref role="37wK5l" to="1fjm:~Program.getUnreachableInstructions():java.util.Set" resolve="getUnreachableInstructions" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="3HJD4JbIwae" role="3cqZAp">
          <node concept="3cpWsn" id="3HJD4JbIwaf" role="3cpWs9">
            <property role="TrG5h" value="unreachableNodes" />
            <node concept="3uibUv" id="3HJD4JbIwag" role="1tU5fm">
              <ref role="3uigEE" to="33ny:~Set" resolve="Set" />
              <node concept="3uibUv" id="3HJD4JbIwah" role="11_B2D">
                <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
              </node>
            </node>
            <node concept="2ShNRf" id="3HJD4JbIwai" role="33vP2m">
              <node concept="1pGfFk" id="3HJD4JbIwaj" role="2ShVmc">
                <ref role="37wK5l" to="33ny:~HashSet.&lt;init&gt;()" resolve="HashSet" />
                <node concept="3uibUv" id="3HJD4JbIwak" role="1pMfVU">
                  <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="1DcWWT" id="3HJD4JbIwal" role="3cqZAp">
          <node concept="37vLTw" id="3GM_nagT$9P" role="1DdaDG">
            <ref role="3cqZAo" node="3HJD4JbIwa8" resolve="unreachable" />
          </node>
          <node concept="3cpWsn" id="3HJD4JbIwan" role="1Duv9x">
            <property role="TrG5h" value="i" />
            <node concept="3uibUv" id="3HJD4JbIwao" role="1tU5fm">
              <ref role="3uigEE" to="dau9:~Instruction" resolve="Instruction" />
            </node>
          </node>
          <node concept="3clFbS" id="3HJD4JbIwap" role="2LFqv$">
            <node concept="3clFbJ" id="3HJD4JbIwaq" role="3cqZAp">
              <node concept="1Wc70l" id="3HJD4JbIwar" role="3clFbw">
                <node concept="3fqX7Q" id="3HJD4JbIwas" role="3uHU7B">
                  <node concept="2YIFZM" id="3HJD4JbIwat" role="3fr31v">
                    <ref role="1Pybhc" node="3HJD4JbIw9v" resolve="DataFlow" />
                    <ref role="37wK5l" node="3HJD4JbIw9B" resolve="mayBeUnreachable" />
                    <node concept="37vLTw" id="3GM_nagTure" role="37wK5m">
                      <ref role="3cqZAo" node="3HJD4JbIwan" resolve="i" />
                    </node>
                  </node>
                </node>
                <node concept="3y3z36" id="3HJD4JbIwav" role="3uHU7w">
                  <node concept="2OqwBi" id="3HJD4JbIwaw" role="3uHU7B">
                    <node concept="37vLTw" id="3GM_nagTtoE" role="2Oq$k0">
                      <ref role="3cqZAo" node="3HJD4JbIwan" resolve="i" />
                    </node>
                    <node concept="liA8E" id="3HJD4JbIway" role="2OqNvi">
                      <ref role="37wK5l" to="dau9:~Instruction.getSource():java.lang.Object" resolve="getSource" />
                    </node>
                  </node>
                  <node concept="10Nm6u" id="3HJD4JbIwaz" role="3uHU7w" />
                </node>
              </node>
              <node concept="3clFbS" id="3HJD4JbIwa$" role="3clFbx">
                <node concept="3cpWs8" id="3HJD4JbIwa_" role="3cqZAp">
                  <node concept="3cpWsn" id="3HJD4JbIwaA" role="3cpWs9">
                    <property role="TrG5h" value="unreachableNode" />
                    <node concept="3Tqbb2" id="2Jvt1sWdbVu" role="1tU5fm" />
                    <node concept="10QFUN" id="3HJD4JbIwaC" role="33vP2m">
                      <node concept="2OqwBi" id="3HJD4JbIwaD" role="10QFUP">
                        <node concept="37vLTw" id="3GM_nagTBd2" role="2Oq$k0">
                          <ref role="3cqZAo" node="3HJD4JbIwan" resolve="i" />
                        </node>
                        <node concept="liA8E" id="3HJD4JbIwaF" role="2OqNvi">
                          <ref role="37wK5l" to="dau9:~Instruction.getSource():java.lang.Object" resolve="getSource" />
                        </node>
                      </node>
                      <node concept="3uibUv" id="3HJD4JbIwaG" role="10QFUM">
                        <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbJ" id="3HJD4JbIwaH" role="3cqZAp">
                  <node concept="2OqwBi" id="2VIQpAUTB8s" role="3clFbw">
                    <node concept="37vLTw" id="3GM_nagT_Hf" role="2Oq$k0">
                      <ref role="3cqZAo" node="3HJD4JbIwaA" resolve="unreachableNode" />
                    </node>
                    <node concept="1mIQ4w" id="2VIQpAUTB8x" role="2OqNvi">
                      <node concept="chp4Y" id="2VIQpAUTB8z" role="cj9EA">
                        <ref role="cht4Q" to="tpee:fzclF8l" resolve="Statement" />
                      </node>
                    </node>
                  </node>
                  <node concept="9aQIb" id="3HJD4JbIwaM" role="9aQIa">
                    <node concept="3clFbS" id="3HJD4JbIwaN" role="9aQI4">
                      <node concept="3clFbJ" id="3HJD4JbIwaO" role="3cqZAp">
                        <node concept="2OqwBi" id="3HJD4JbIwaP" role="3clFbw">
                          <node concept="37vLTw" id="3GM_nagTxME" role="2Oq$k0">
                            <ref role="3cqZAo" node="3HJD4JbIwaA" resolve="unreachableNode" />
                          </node>
                          <node concept="1mIQ4w" id="2VIQpAUTB8D" role="2OqNvi">
                            <node concept="chp4Y" id="2VIQpAUTB8F" role="cj9EA">
                              <ref role="cht4Q" to="tpee:fzclF80" resolve="StatementList" />
                            </node>
                          </node>
                        </node>
                        <node concept="9aQIb" id="3HJD4JbIwaT" role="9aQIa">
                          <node concept="3clFbS" id="3HJD4JbIwaU" role="9aQI4">
                            <node concept="3clFbF" id="3HJD4JbIwb0" role="3cqZAp">
                              <node concept="2OqwBi" id="3HJD4JbIwb1" role="3clFbG">
                                <node concept="37vLTw" id="3GM_nagTrCF" role="2Oq$k0">
                                  <ref role="3cqZAo" node="3HJD4JbIwaf" resolve="unreachableNodes" />
                                </node>
                                <node concept="liA8E" id="3HJD4JbIwb3" role="2OqNvi">
                                  <ref role="37wK5l" to="33ny:~Set.add(java.lang.Object):boolean" resolve="add" />
                                  <node concept="2OqwBi" id="3HJD4JbIwb5" role="37wK5m">
                                    <node concept="37vLTw" id="3GM_nagTxGR" role="2Oq$k0">
                                      <ref role="3cqZAo" node="3HJD4JbIwaA" resolve="unreachableNode" />
                                    </node>
                                    <node concept="2Xjw5R" id="2Jvt1sWdbVx" role="2OqNvi">
                                      <node concept="1xMEDy" id="2Jvt1sWdbVy" role="1xVPHs">
                                        <node concept="chp4Y" id="2Jvt1sWdbVA" role="ri$Ld">
                                          <ref role="cht4Q" to="tpee:fzclF8l" resolve="Statement" />
                                        </node>
                                      </node>
                                      <node concept="1xIGOp" id="2Jvt1sWdbVF" role="1xVPHs" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node concept="3clFbS" id="3HJD4JbIwba" role="3clFbx">
                          <node concept="3clFbJ" id="3HJD4JbIwbb" role="3cqZAp">
                            <node concept="3fqX7Q" id="3HJD4JbIwbc" role="3clFbw">
                              <node concept="2OqwBi" id="2VIQpAUTB8R" role="3fr31v">
                                <node concept="2OqwBi" id="3HJD4JbIwbe" role="2Oq$k0">
                                  <node concept="37vLTw" id="3GM_nagTrC8" role="2Oq$k0">
                                    <ref role="3cqZAo" node="3HJD4JbIwaA" resolve="unreachableNode" />
                                  </node>
                                  <node concept="1mfA1w" id="566yzxn6qL6" role="2OqNvi" />
                                </node>
                                <node concept="1mIQ4w" id="2VIQpAUTB8W" role="2OqNvi">
                                  <node concept="chp4Y" id="2VIQpAUTB8Y" role="cj9EA">
                                    <ref role="cht4Q" to="tpee:fzclF8l" resolve="Statement" />
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node concept="3clFbS" id="3HJD4JbIwbj" role="3clFbx">
                              <node concept="3clFbF" id="3HJD4JbIwbk" role="3cqZAp">
                                <node concept="2OqwBi" id="3HJD4JbIwbl" role="3clFbG">
                                  <node concept="37vLTw" id="3GM_nagTwB2" role="2Oq$k0">
                                    <ref role="3cqZAo" node="3HJD4JbIwaf" resolve="unreachableNodes" />
                                  </node>
                                  <node concept="liA8E" id="3HJD4JbIwbn" role="2OqNvi">
                                    <ref role="37wK5l" to="33ny:~Set.add(java.lang.Object):boolean" resolve="add" />
                                    <node concept="10QFUN" id="3HJD4JbIwbo" role="37wK5m">
                                      <node concept="2OqwBi" id="3HJD4JbIwbp" role="10QFUP">
                                        <node concept="37vLTw" id="3GM_nagT$gi" role="2Oq$k0">
                                          <ref role="3cqZAo" node="3HJD4JbIwan" resolve="i" />
                                        </node>
                                        <node concept="liA8E" id="3HJD4JbIwbr" role="2OqNvi">
                                          <ref role="37wK5l" to="dau9:~Instruction.getSource():java.lang.Object" resolve="getSource" />
                                        </node>
                                      </node>
                                      <node concept="3uibUv" id="3HJD4JbIwbs" role="10QFUM">
                                        <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
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
                  <node concept="3clFbS" id="3HJD4JbIwbt" role="3clFbx">
                    <node concept="3clFbF" id="3HJD4JbIwbu" role="3cqZAp">
                      <node concept="2OqwBi" id="3HJD4JbIwbv" role="3clFbG">
                        <node concept="37vLTw" id="3GM_nagTrJk" role="2Oq$k0">
                          <ref role="3cqZAo" node="3HJD4JbIwaf" resolve="unreachableNodes" />
                        </node>
                        <node concept="liA8E" id="3HJD4JbIwbx" role="2OqNvi">
                          <ref role="37wK5l" to="33ny:~Set.add(java.lang.Object):boolean" resolve="add" />
                          <node concept="10QFUN" id="3HJD4JbIwby" role="37wK5m">
                            <node concept="2OqwBi" id="3HJD4JbIwbz" role="10QFUP">
                              <node concept="37vLTw" id="3GM_nagTvSX" role="2Oq$k0">
                                <ref role="3cqZAo" node="3HJD4JbIwan" resolve="i" />
                              </node>
                              <node concept="liA8E" id="3HJD4JbIwb_" role="2OqNvi">
                                <ref role="37wK5l" to="dau9:~Instruction.getSource():java.lang.Object" resolve="getSource" />
                              </node>
                            </node>
                            <node concept="3uibUv" id="3HJD4JbIwbA" role="10QFUM">
                              <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
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
        <node concept="3cpWs6" id="3HJD4JbIwbB" role="3cqZAp">
          <node concept="37vLTw" id="3GM_nagTxYl" role="3cqZAk">
            <ref role="3cqZAo" node="3HJD4JbIwaf" resolve="unreachableNodes" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2YIFZL" id="3HJD4JbIwbD" role="jymVt">
      <property role="TrG5h" value="getExpectedReturns" />
      <node concept="3Tm1VV" id="3HJD4JbIwbE" role="1B3o_S" />
      <node concept="3uibUv" id="3HJD4JbIwbF" role="3clF45">
        <ref role="3uigEE" to="33ny:~Set" resolve="Set" />
        <node concept="3uibUv" id="3HJD4JbIwbG" role="11_B2D">
          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
        </node>
      </node>
      <node concept="37vLTG" id="3HJD4JbIwbH" role="3clF46">
        <property role="TrG5h" value="program" />
        <node concept="3uibUv" id="3HJD4JbIwbI" role="1tU5fm">
          <ref role="3uigEE" to="1fjm:~Program" resolve="Program" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIwbJ" role="3clF47">
        <node concept="3cpWs8" id="3HJD4JbIwbK" role="3cqZAp">
          <node concept="3cpWsn" id="3HJD4JbIwbL" role="3cpWs9">
            <property role="TrG5h" value="expectedReturns" />
            <node concept="3uibUv" id="3HJD4JbIwbM" role="1tU5fm">
              <ref role="3uigEE" to="33ny:~Set" resolve="Set" />
              <node concept="3uibUv" id="3HJD4JbIwbN" role="11_B2D">
                <ref role="3uigEE" to="dau9:~Instruction" resolve="Instruction" />
              </node>
            </node>
            <node concept="2OqwBi" id="3HJD4JbIwbO" role="33vP2m">
              <node concept="37vLTw" id="2BHiRxgl5d0" role="2Oq$k0">
                <ref role="3cqZAo" node="3HJD4JbIwbH" resolve="program" />
              </node>
              <node concept="liA8E" id="3HJD4JbIwbQ" role="2OqNvi">
                <ref role="37wK5l" to="1fjm:~Program.getExpectedReturns():java.util.Set" resolve="getExpectedReturns" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="3HJD4JbIwbR" role="3cqZAp">
          <node concept="3cpWsn" id="3HJD4JbIwbS" role="3cpWs9">
            <property role="TrG5h" value="result" />
            <node concept="3uibUv" id="3HJD4JbIwbT" role="1tU5fm">
              <ref role="3uigEE" to="33ny:~Set" resolve="Set" />
              <node concept="3uibUv" id="3HJD4JbIwbU" role="11_B2D">
                <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
              </node>
            </node>
            <node concept="2ShNRf" id="3HJD4JbIwbV" role="33vP2m">
              <node concept="1pGfFk" id="3HJD4JbIwbW" role="2ShVmc">
                <ref role="37wK5l" to="33ny:~HashSet.&lt;init&gt;()" resolve="HashSet" />
                <node concept="3uibUv" id="3HJD4JbIwbX" role="1pMfVU">
                  <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="1DcWWT" id="3HJD4JbIwbY" role="3cqZAp">
          <node concept="37vLTw" id="3GM_nagTxU1" role="1DdaDG">
            <ref role="3cqZAo" node="3HJD4JbIwbL" resolve="expectedReturns" />
          </node>
          <node concept="3cpWsn" id="3HJD4JbIwc0" role="1Duv9x">
            <property role="TrG5h" value="instr" />
            <node concept="3uibUv" id="3HJD4JbIwc1" role="1tU5fm">
              <ref role="3uigEE" to="dau9:~Instruction" resolve="Instruction" />
            </node>
          </node>
          <node concept="3clFbS" id="3HJD4JbIwc2" role="2LFqv$">
            <node concept="3clFbF" id="3HJD4JbIwc3" role="3cqZAp">
              <node concept="2OqwBi" id="3HJD4JbIwc4" role="3clFbG">
                <node concept="37vLTw" id="3GM_nagTyWv" role="2Oq$k0">
                  <ref role="3cqZAo" node="3HJD4JbIwbS" resolve="result" />
                </node>
                <node concept="liA8E" id="3HJD4JbIwc6" role="2OqNvi">
                  <ref role="37wK5l" to="33ny:~Set.add(java.lang.Object):boolean" resolve="add" />
                  <node concept="10QFUN" id="3HJD4JbIwc7" role="37wK5m">
                    <node concept="2OqwBi" id="3HJD4JbIwc8" role="10QFUP">
                      <node concept="37vLTw" id="3GM_nagTwBd" role="2Oq$k0">
                        <ref role="3cqZAo" node="3HJD4JbIwc0" resolve="instr" />
                      </node>
                      <node concept="liA8E" id="3HJD4JbIwca" role="2OqNvi">
                        <ref role="37wK5l" to="dau9:~Instruction.getSource():java.lang.Object" resolve="getSource" />
                      </node>
                    </node>
                    <node concept="3uibUv" id="3HJD4JbIwcb" role="10QFUM">
                      <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="3HJD4JbIwcc" role="3cqZAp">
          <node concept="37vLTw" id="3GM_nagTsak" role="3cqZAk">
            <ref role="3cqZAo" node="3HJD4JbIwbS" resolve="result" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2YIFZL" id="3HJD4JbIwce" role="jymVt">
      <property role="TrG5h" value="getUninitializedReads" />
      <node concept="3Tm1VV" id="3HJD4JbIwcf" role="1B3o_S" />
      <node concept="3uibUv" id="3HJD4JbIwcg" role="3clF45">
        <ref role="3uigEE" to="33ny:~Set" resolve="Set" />
        <node concept="3uibUv" id="3HJD4JbIwch" role="11_B2D">
          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
        </node>
      </node>
      <node concept="37vLTG" id="3HJD4JbIwci" role="3clF46">
        <property role="TrG5h" value="program" />
        <node concept="3uibUv" id="3HJD4JbIwcj" role="1tU5fm">
          <ref role="3uigEE" to="1fjm:~Program" resolve="Program" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIwck" role="3clF47">
        <node concept="3cpWs8" id="3HJD4JbIwcl" role="3cqZAp">
          <node concept="3cpWsn" id="3HJD4JbIwcm" role="3cpWs9">
            <property role="TrG5h" value="reads" />
            <node concept="3uibUv" id="3HJD4JbIwcn" role="1tU5fm">
              <ref role="3uigEE" to="33ny:~Set" resolve="Set" />
              <node concept="3uibUv" id="3HJD4JbIwco" role="11_B2D">
                <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
              </node>
            </node>
            <node concept="2ShNRf" id="3HJD4JbIwcp" role="33vP2m">
              <node concept="1pGfFk" id="3HJD4JbIwcq" role="2ShVmc">
                <ref role="37wK5l" to="33ny:~HashSet.&lt;init&gt;()" resolve="HashSet" />
                <node concept="3uibUv" id="3HJD4JbIwcr" role="1pMfVU">
                  <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="1DcWWT" id="3HJD4JbIwcs" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIwct" role="1DdaDG">
            <node concept="37vLTw" id="2BHiRxgm8ja" role="2Oq$k0">
              <ref role="3cqZAo" node="3HJD4JbIwci" resolve="program" />
            </node>
            <node concept="liA8E" id="3HJD4JbIwcv" role="2OqNvi">
              <ref role="37wK5l" to="1fjm:~Program.getUninitializedReads():java.util.Set" resolve="getUninitializedReads" />
            </node>
          </node>
          <node concept="3cpWsn" id="3HJD4JbIwcw" role="1Duv9x">
            <property role="TrG5h" value="read" />
            <node concept="3uibUv" id="3HJD4JbIwcx" role="1tU5fm">
              <ref role="3uigEE" to="dau9:~ReadInstruction" resolve="ReadInstruction" />
            </node>
          </node>
          <node concept="3clFbS" id="3HJD4JbIwcy" role="2LFqv$">
            <node concept="3clFbF" id="3HJD4JbIwcz" role="3cqZAp">
              <node concept="2OqwBi" id="3HJD4JbIwc$" role="3clFbG">
                <node concept="37vLTw" id="3GM_nagTu9g" role="2Oq$k0">
                  <ref role="3cqZAo" node="3HJD4JbIwcm" resolve="reads" />
                </node>
                <node concept="liA8E" id="3HJD4JbIwcA" role="2OqNvi">
                  <ref role="37wK5l" to="33ny:~Set.add(java.lang.Object):boolean" resolve="add" />
                  <node concept="10QFUN" id="3HJD4JbIwcB" role="37wK5m">
                    <node concept="2OqwBi" id="3HJD4JbIwcC" role="10QFUP">
                      <node concept="37vLTw" id="3GM_nagTvLW" role="2Oq$k0">
                        <ref role="3cqZAo" node="3HJD4JbIwcw" resolve="read" />
                      </node>
                      <node concept="liA8E" id="3HJD4JbIwcE" role="2OqNvi">
                        <ref role="37wK5l" to="dau9:~Instruction.getSource():java.lang.Object" resolve="getSource" />
                      </node>
                    </node>
                    <node concept="3uibUv" id="3HJD4JbIwcF" role="10QFUM">
                      <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="3HJD4JbIwcG" role="3cqZAp">
          <node concept="37vLTw" id="3GM_nagTrzy" role="3cqZAk">
            <ref role="3cqZAo" node="3HJD4JbIwcm" resolve="reads" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2YIFZL" id="4gNLpVtobGZ" role="jymVt">
      <property role="TrG5h" value="isInitializedRewritten" />
      <node concept="10P_77" id="4gNLpVtojUJ" role="3clF45" />
      <node concept="3Tm1VV" id="4gNLpVtobH1" role="1B3o_S" />
      <node concept="3clFbS" id="4gNLpVtobH2" role="3clF47">
        <node concept="3cpWs8" id="4gNLpVtojUP" role="3cqZAp">
          <node concept="3cpWsn" id="4gNLpVtojUQ" role="3cpWs9">
            <property role="TrG5h" value="writeInstruction" />
            <node concept="3uibUv" id="4gNLpVtojUR" role="1tU5fm">
              <ref role="3uigEE" to="dau9:~WriteInstruction" resolve="WriteInstruction" />
            </node>
            <node concept="10Nm6u" id="4gNLpVtojUT" role="33vP2m" />
          </node>
        </node>
        <node concept="1DcWWT" id="4gNLpVtojUV" role="3cqZAp">
          <node concept="3clFbS" id="4gNLpVtojUW" role="2LFqv$">
            <node concept="3clFbJ" id="4gNLpVtojVq" role="3cqZAp">
              <node concept="3clFbS" id="4gNLpVtojVr" role="3clFbx">
                <node concept="3clFbF" id="4gNLpVtojVK" role="3cqZAp">
                  <node concept="37vLTI" id="4gNLpVtojVM" role="3clFbG">
                    <node concept="10QFUN" id="4gNLpVtojVP" role="37vLTx">
                      <node concept="3uibUv" id="4gNLpVtojVQ" role="10QFUM">
                        <ref role="3uigEE" to="dau9:~WriteInstruction" resolve="WriteInstruction" />
                      </node>
                      <node concept="37vLTw" id="3GM_nagT_Vz" role="10QFUP">
                        <ref role="3cqZAo" node="4gNLpVtojUZ" resolve="instruction" />
                      </node>
                    </node>
                    <node concept="37vLTw" id="3GM_nagTwud" role="37vLTJ">
                      <ref role="3cqZAo" node="4gNLpVtojUQ" resolve="writeInstruction" />
                    </node>
                  </node>
                </node>
                <node concept="3zACq4" id="4gNLpVtojVU" role="3cqZAp" />
              </node>
              <node concept="1Wc70l" id="4gNLpVtojVz" role="3clFbw">
                <node concept="3clFbC" id="4gNLpVtojVG" role="3uHU7w">
                  <node concept="37vLTw" id="2BHiRxgmwWD" role="3uHU7w">
                    <ref role="3cqZAo" node="4gNLpVtojUM" resolve="write" />
                  </node>
                  <node concept="2OqwBi" id="4gNLpVtojVB" role="3uHU7B">
                    <node concept="37vLTw" id="3GM_nagT$6e" role="2Oq$k0">
                      <ref role="3cqZAo" node="4gNLpVtojUZ" resolve="instruction" />
                    </node>
                    <node concept="liA8E" id="4gNLpVtojVF" role="2OqNvi">
                      <ref role="37wK5l" to="dau9:~Instruction.getSource():java.lang.Object" resolve="getSource" />
                    </node>
                  </node>
                </node>
                <node concept="2ZW3vV" id="4gNLpVtojVv" role="3uHU7B">
                  <node concept="3uibUv" id="4gNLpVtojVy" role="2ZW6by">
                    <ref role="3uigEE" to="dau9:~WriteInstruction" resolve="WriteInstruction" />
                  </node>
                  <node concept="37vLTw" id="3GM_nagTvk9" role="2ZW6bz">
                    <ref role="3cqZAo" node="4gNLpVtojUZ" resolve="instruction" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="2OqwBi" id="4gNLpVtojVc" role="1DdaDG">
            <node concept="37vLTw" id="2BHiRxglwxt" role="2Oq$k0">
              <ref role="3cqZAo" node="4gNLpVtojUK" resolve="program" />
            </node>
            <node concept="liA8E" id="4gNLpVtojVi" role="2OqNvi">
              <ref role="37wK5l" to="1fjm:~Program.getInstructionsFor(java.lang.Object):java.util.List" resolve="getInstructionsFor" />
              <node concept="37vLTw" id="2BHiRxgm6x6" role="37wK5m">
                <ref role="3cqZAo" node="4gNLpVtojUM" resolve="write" />
              </node>
            </node>
          </node>
          <node concept="3cpWsn" id="4gNLpVtojUZ" role="1Duv9x">
            <property role="TrG5h" value="instruction" />
            <node concept="3uibUv" id="4gNLpVtojV4" role="1tU5fm">
              <ref role="3uigEE" to="dau9:~Instruction" resolve="Instruction" />
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="4gNLpVtojVX" role="3cqZAp">
          <node concept="3clFbS" id="4gNLpVtojVY" role="3clFbx">
            <node concept="3cpWs6" id="4gNLpVtojW6" role="3cqZAp">
              <node concept="2OqwBi" id="4gNLpVtojW9" role="3cqZAk">
                <node concept="37vLTw" id="2BHiRxgmKM2" role="2Oq$k0">
                  <ref role="3cqZAo" node="4gNLpVtojUK" resolve="program" />
                </node>
                <node concept="liA8E" id="4gNLpVtojWd" role="2OqNvi">
                  <ref role="37wK5l" to="1fjm:~Program.isInitializedRewritten(jetbrains.mps.lang.dataFlow.framework.instructions.WriteInstruction):boolean" resolve="isInitializedRewritten" />
                  <node concept="37vLTw" id="3GM_nagTzU4" role="37wK5m">
                    <ref role="3cqZAo" node="4gNLpVtojUQ" resolve="writeInstruction" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3y3z36" id="4gNLpVtojW2" role="3clFbw">
            <node concept="10Nm6u" id="4gNLpVtojW5" role="3uHU7w" />
            <node concept="37vLTw" id="3GM_nagTyyi" role="3uHU7B">
              <ref role="3cqZAo" node="4gNLpVtojUQ" resolve="writeInstruction" />
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="4gNLpVtojWh" role="3cqZAp">
          <node concept="3clFbT" id="4gNLpVtojWj" role="3cqZAk">
            <property role="3clFbU" value="false" />
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="4gNLpVtojUK" role="3clF46">
        <property role="TrG5h" value="program" />
        <node concept="3uibUv" id="4gNLpVtojUL" role="1tU5fm">
          <ref role="3uigEE" to="1fjm:~Program" resolve="Program" />
        </node>
      </node>
      <node concept="37vLTG" id="4gNLpVtojUM" role="3clF46">
        <property role="TrG5h" value="write" />
        <node concept="3uibUv" id="4gNLpVtojUO" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
        </node>
      </node>
    </node>
    <node concept="2YIFZL" id="3HJD4JbIwcI" role="jymVt">
      <property role="TrG5h" value="getUsedVariables" />
      <node concept="3Tm1VV" id="3HJD4JbIwcJ" role="1B3o_S" />
      <node concept="3uibUv" id="3HJD4JbIwcK" role="3clF45">
        <ref role="3uigEE" to="33ny:~Set" resolve="Set" />
        <node concept="3uibUv" id="3HJD4JbIwcL" role="11_B2D">
          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
        </node>
      </node>
      <node concept="37vLTG" id="3HJD4JbIwcM" role="3clF46">
        <property role="TrG5h" value="program" />
        <node concept="3uibUv" id="3HJD4JbIwcN" role="1tU5fm">
          <ref role="3uigEE" to="1fjm:~Program" resolve="Program" />
        </node>
      </node>
      <node concept="37vLTG" id="3HJD4JbIwcO" role="3clF46">
        <property role="TrG5h" value="node" />
        <node concept="3uibUv" id="3HJD4JbIwcP" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIwcQ" role="3clF47">
        <node concept="3cpWs8" id="3HJD4JbIwcR" role="3cqZAp">
          <node concept="3cpWsn" id="3HJD4JbIwcS" role="3cpWs9">
            <property role="TrG5h" value="readVars" />
            <node concept="3uibUv" id="3HJD4JbIwcT" role="1tU5fm">
              <ref role="3uigEE" to="33ny:~Set" resolve="Set" />
              <node concept="3uibUv" id="3HJD4JbIwcU" role="11_B2D">
                <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
              </node>
            </node>
            <node concept="2ShNRf" id="3HJD4JbIwcV" role="33vP2m">
              <node concept="1pGfFk" id="3HJD4JbIwcW" role="2ShVmc">
                <ref role="37wK5l" to="33ny:~HashSet.&lt;init&gt;()" resolve="HashSet" />
                <node concept="3uibUv" id="3HJD4JbIwcX" role="1pMfVU">
                  <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="1DcWWT" id="3HJD4JbIwcY" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIwcZ" role="1DdaDG">
            <node concept="37vLTw" id="2BHiRxgm7rb" role="2Oq$k0">
              <ref role="3cqZAo" node="3HJD4JbIwcM" resolve="program" />
            </node>
            <node concept="liA8E" id="3HJD4JbIwd1" role="2OqNvi">
              <ref role="37wK5l" to="1fjm:~Program.getInstructions():java.util.List" resolve="getInstructions" />
            </node>
          </node>
          <node concept="3cpWsn" id="3HJD4JbIwd2" role="1Duv9x">
            <property role="TrG5h" value="i" />
            <node concept="3uibUv" id="3HJD4JbIwd3" role="1tU5fm">
              <ref role="3uigEE" to="dau9:~Instruction" resolve="Instruction" />
            </node>
          </node>
          <node concept="3clFbS" id="3HJD4JbIwd4" role="2LFqv$">
            <node concept="3clFbJ" id="3HJD4JbIwd5" role="3cqZAp">
              <node concept="2ZW3vV" id="3HJD4JbIwd6" role="3clFbw">
                <node concept="37vLTw" id="3GM_nagTv1R" role="2ZW6bz">
                  <ref role="3cqZAo" node="3HJD4JbIwd2" resolve="i" />
                </node>
                <node concept="3uibUv" id="3HJD4JbIwd8" role="2ZW6by">
                  <ref role="3uigEE" to="dau9:~ReadInstruction" resolve="ReadInstruction" />
                </node>
              </node>
              <node concept="3clFbS" id="3HJD4JbIwd9" role="3clFbx">
                <node concept="3clFbF" id="3HJD4JbIwda" role="3cqZAp">
                  <node concept="2OqwBi" id="3HJD4JbIwdb" role="3clFbG">
                    <node concept="37vLTw" id="3GM_nagTzIN" role="2Oq$k0">
                      <ref role="3cqZAo" node="3HJD4JbIwcS" resolve="readVars" />
                    </node>
                    <node concept="liA8E" id="3HJD4JbIwdd" role="2OqNvi">
                      <ref role="37wK5l" to="33ny:~Set.add(java.lang.Object):boolean" resolve="add" />
                      <node concept="10QFUN" id="3HJD4JbIwde" role="37wK5m">
                        <node concept="2OqwBi" id="3HJD4JbIwdf" role="10QFUP">
                          <node concept="1eOMI4" id="3HJD4JbIwdg" role="2Oq$k0">
                            <node concept="10QFUN" id="3HJD4JbIwdh" role="1eOMHV">
                              <node concept="37vLTw" id="3GM_nagTr$V" role="10QFUP">
                                <ref role="3cqZAo" node="3HJD4JbIwd2" resolve="i" />
                              </node>
                              <node concept="3uibUv" id="3HJD4JbIwdj" role="10QFUM">
                                <ref role="3uigEE" to="dau9:~ReadInstruction" resolve="ReadInstruction" />
                              </node>
                            </node>
                          </node>
                          <node concept="liA8E" id="3HJD4JbIwdk" role="2OqNvi">
                            <ref role="37wK5l" to="dau9:~ReadInstruction.getVariable():java.lang.Object" resolve="getVariable" />
                          </node>
                        </node>
                        <node concept="3uibUv" id="3HJD4JbIwdl" role="10QFUM">
                          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="3HJD4JbIwdm" role="3cqZAp">
          <node concept="37vLTw" id="3GM_nagT$in" role="3cqZAk">
            <ref role="3cqZAo" node="3HJD4JbIwcS" resolve="readVars" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2YIFZL" id="3HJD4JbIwdo" role="jymVt">
      <property role="TrG5h" value="getUnusedAssignments" />
      <node concept="3Tm1VV" id="3HJD4JbIwdp" role="1B3o_S" />
      <node concept="3uibUv" id="3HJD4JbIwdq" role="3clF45">
        <ref role="3uigEE" to="33ny:~Set" resolve="Set" />
        <node concept="3uibUv" id="3HJD4JbIwdr" role="11_B2D">
          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
        </node>
      </node>
      <node concept="37vLTG" id="3HJD4JbIwds" role="3clF46">
        <property role="TrG5h" value="node" />
        <node concept="3uibUv" id="3HJD4JbIwdt" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIwdu" role="3clF47">
        <node concept="3cpWs6" id="3HJD4JbIwdv" role="3cqZAp">
          <node concept="2YIFZM" id="3HJD4JbIwdw" role="3cqZAk">
            <ref role="1Pybhc" node="3HJD4JbIw9v" resolve="DataFlow" />
            <ref role="37wK5l" node="3HJD4JbIwdz" resolve="getUnusedAssignments" />
            <node concept="2YIFZM" id="3HJD4JbIwdx" role="37wK5m">
              <ref role="1Pybhc" node="3HJD4JbIw9v" resolve="DataFlow" />
              <ref role="37wK5l" node="3HJD4JbIw9P" resolve="buildProgram" />
              <node concept="37vLTw" id="2BHiRxglMKd" role="37wK5m">
                <ref role="3cqZAo" node="3HJD4JbIwds" resolve="node" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2YIFZL" id="3HJD4JbIwdz" role="jymVt">
      <property role="TrG5h" value="getUnusedAssignments" />
      <node concept="3Tm1VV" id="3HJD4JbIwd$" role="1B3o_S" />
      <node concept="3uibUv" id="3HJD4JbIwd_" role="3clF45">
        <ref role="3uigEE" to="33ny:~Set" resolve="Set" />
        <node concept="3uibUv" id="3HJD4JbIwdA" role="11_B2D">
          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
        </node>
      </node>
      <node concept="37vLTG" id="3HJD4JbIwdB" role="3clF46">
        <property role="TrG5h" value="program" />
        <node concept="3uibUv" id="3HJD4JbIwdC" role="1tU5fm">
          <ref role="3uigEE" to="1fjm:~Program" resolve="Program" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIwdD" role="3clF47">
        <node concept="3cpWs8" id="3HJD4JbIwdE" role="3cqZAp">
          <node concept="3cpWsn" id="3HJD4JbIwdF" role="3cpWs9">
            <property role="TrG5h" value="unusedAssignments" />
            <node concept="3uibUv" id="3HJD4JbIwdG" role="1tU5fm">
              <ref role="3uigEE" to="33ny:~Set" resolve="Set" />
              <node concept="3uibUv" id="3HJD4JbIwdH" role="11_B2D">
                <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
              </node>
            </node>
            <node concept="2ShNRf" id="3HJD4JbIwdI" role="33vP2m">
              <node concept="1pGfFk" id="3HJD4JbIwdJ" role="2ShVmc">
                <ref role="37wK5l" to="33ny:~HashSet.&lt;init&gt;()" resolve="HashSet" />
                <node concept="3uibUv" id="3HJD4JbIwdK" role="1pMfVU">
                  <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="1DcWWT" id="3HJD4JbIwdL" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIwdM" role="1DdaDG">
            <node concept="37vLTw" id="2BHiRxghfuU" role="2Oq$k0">
              <ref role="3cqZAo" node="3HJD4JbIwdB" resolve="program" />
            </node>
            <node concept="liA8E" id="3HJD4JbIwdO" role="2OqNvi">
              <ref role="37wK5l" to="1fjm:~Program.getUnusedAssignments():java.util.Set" resolve="getUnusedAssignments" />
            </node>
          </node>
          <node concept="3cpWsn" id="3HJD4JbIwdP" role="1Duv9x">
            <property role="TrG5h" value="write" />
            <node concept="3uibUv" id="3HJD4JbIwdQ" role="1tU5fm">
              <ref role="3uigEE" to="dau9:~WriteInstruction" resolve="WriteInstruction" />
            </node>
          </node>
          <node concept="3clFbS" id="3HJD4JbIwdR" role="2LFqv$">
            <node concept="3clFbF" id="3HJD4JbIwdS" role="3cqZAp">
              <node concept="2OqwBi" id="3HJD4JbIwdT" role="3clFbG">
                <node concept="37vLTw" id="3GM_nagTBLn" role="2Oq$k0">
                  <ref role="3cqZAo" node="3HJD4JbIwdF" resolve="unusedAssignments" />
                </node>
                <node concept="liA8E" id="3HJD4JbIwdV" role="2OqNvi">
                  <ref role="37wK5l" to="33ny:~Set.add(java.lang.Object):boolean" resolve="add" />
                  <node concept="10QFUN" id="3HJD4JbIwdW" role="37wK5m">
                    <node concept="2OqwBi" id="3HJD4JbIwdX" role="10QFUP">
                      <node concept="37vLTw" id="3GM_nagTACo" role="2Oq$k0">
                        <ref role="3cqZAo" node="3HJD4JbIwdP" resolve="write" />
                      </node>
                      <node concept="liA8E" id="3HJD4JbIwdZ" role="2OqNvi">
                        <ref role="37wK5l" to="dau9:~Instruction.getSource():java.lang.Object" resolve="getSource" />
                      </node>
                    </node>
                    <node concept="3uibUv" id="3HJD4JbIwe0" role="10QFUM">
                      <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="3HJD4JbIwe1" role="3cqZAp">
          <node concept="37vLTw" id="3GM_nagTANc" role="3cqZAk">
            <ref role="3cqZAo" node="3HJD4JbIwdF" resolve="unusedAssignments" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="312cEu" id="3HJD4JbIwe3">
    <property role="TrG5h" value="DataFlowBuilders" />
    <property role="1sVAO0" value="true" />
    <node concept="3Tm1VV" id="3HJD4JbIwe4" role="1B3o_S" />
    <node concept="3clFbW" id="3HJD4JbIwe5" role="jymVt">
      <node concept="3Tm1VV" id="3HJD4JbIwe6" role="1B3o_S" />
      <node concept="3clFbS" id="3HJD4JbIwe7" role="3clF47" />
    </node>
    <node concept="3clFb_" id="3HJD4JbIwe8" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="install" />
      <node concept="3Tm1VV" id="3HJD4JbIwe9" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIwea" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIweb" role="3clF46">
        <property role="TrG5h" value="manager" />
        <node concept="3uibUv" id="3HJD4JbIwec" role="1tU5fm">
          <ref role="3uigEE" node="3HJD4JbIwfM" resolve="DataFlowManager" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIwed" role="3clF47" />
    </node>
  </node>
  <node concept="312cEu" id="3HJD4JbIwf_">
    <property role="TrG5h" value="DataFlowBuilder" />
    <property role="1sVAO0" value="true" />
    <node concept="2tJIrI" id="4dNj9j_5KJa" role="jymVt" />
    <node concept="3Tm1VV" id="3HJD4JbIwfA" role="1B3o_S" />
    <node concept="3clFb_" id="3HJD4JbIwfE" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="build" />
      <node concept="3Tm1VV" id="3HJD4JbIwfF" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIwfG" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIwfH" role="3clF46">
        <property role="TrG5h" value="operationContext" />
        <node concept="3uibUv" id="3HJD4JbIwfI" role="1tU5fm">
          <ref role="3uigEE" to="w1kc:~IOperationContext" resolve="IOperationContext" />
        </node>
      </node>
      <node concept="37vLTG" id="3HJD4JbIwfJ" role="3clF46">
        <property role="TrG5h" value="context" />
        <node concept="3uibUv" id="3HJD4JbIwfK" role="1tU5fm">
          <ref role="3uigEE" node="3HJD4JbIvKw" resolve="DataFlowBuilderContext" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIwfL" role="3clF47" />
      <node concept="P$JXv" id="4dNj9j_5KJK" role="lGtFl">
        <node concept="TZ5HI" id="4dNj9j_5KJL" role="3nqlJM">
          <node concept="TZ5HA" id="4dNj9j_5KJM" role="3HnX3l" />
        </node>
        <node concept="TZ5HA" id="4dNj9j_5KKh" role="TZ5H$">
          <node concept="1dT_AC" id="4dNj9j_5KKi" role="1dT_Ay">
            <property role="1dT_AB" value="Since MPS 3.4 use " />
          </node>
          <node concept="1dT_AA" id="4dNj9j_5KKn" role="1dT_Ay">
            <node concept="92FcH" id="4dNj9j_5KKt" role="qph3F">
              <node concept="TZ5HA" id="4dNj9j_5KKv" role="2XjZqd" />
              <node concept="VXe0Z" id="4dNj9j_7np7" role="92FcQ">
                <ref role="VXe0S" node="4dNj9j_5Kld" resolve="build" />
              </node>
            </node>
          </node>
          <node concept="1dT_AC" id="4dNj9j_5KKm" role="1dT_Ay">
            <property role="1dT_AB" value="}" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="4dNj9j_5KJN" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Deprecated" resolve="Deprecated" />
      </node>
    </node>
    <node concept="2tJIrI" id="4dNj9j_5KkV" role="jymVt" />
    <node concept="3clFb_" id="4dNj9j_5Kld" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="build" />
      <node concept="3Tm1VV" id="4dNj9j_5Kle" role="1B3o_S" />
      <node concept="3cqZAl" id="4dNj9j_5Klf" role="3clF45" />
      <node concept="37vLTG" id="4dNj9j_5Klg" role="3clF46">
        <property role="TrG5h" value="context" />
        <node concept="3uibUv" id="4dNj9j_5Klh" role="1tU5fm">
          <ref role="3uigEE" node="3HJD4JbIvKw" resolve="DataFlowBuilderContext" />
        </node>
      </node>
      <node concept="3clFbS" id="4dNj9j_5Klj" role="3clF47">
        <node concept="3clFbF" id="4dNj9j_5KFK" role="3cqZAp">
          <node concept="1rXfSq" id="4dNj9j_5KFJ" role="3clFbG">
            <ref role="37wK5l" node="3HJD4JbIwfE" resolve="build" />
            <node concept="10Nm6u" id="4dNj9j_5KGx" role="37wK5m" />
            <node concept="37vLTw" id="4dNj9j_5KI1" role="37wK5m">
              <ref role="3cqZAo" node="4dNj9j_5Klg" resolve="context" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3uibUv" id="4dNj9j_76Qf" role="EKbjA">
      <ref role="3uigEE" to="1fjm:~IDataFlowBuilder" resolve="IDataFlowBuilder" />
    </node>
  </node>
  <node concept="312cEu" id="3HJD4JbIwfM">
    <property role="TrG5h" value="DataFlowManager" />
    <node concept="3Tm1VV" id="3HJD4JbIwfN" role="1B3o_S" />
    <node concept="3uibUv" id="3MUxWWhZPrm" role="EKbjA">
      <ref role="3uigEE" to="wyuk:~CoreComponent" resolve="CoreComponent" />
    </node>
    <node concept="Wx3nA" id="1km689rKrob" role="jymVt">
      <property role="TrG5h" value="INSTANCE" />
      <node concept="3Tm6S6" id="1km689rKroc" role="1B3o_S" />
      <node concept="3uibUv" id="1km689rKroe" role="1tU5fm">
        <ref role="3uigEE" node="3HJD4JbIwfM" resolve="DataFlowManager" />
      </node>
    </node>
    <node concept="312cEg" id="3cMIXQCIplA" role="jymVt">
      <property role="34CwA1" value="false" />
      <property role="eg7rD" value="false" />
      <property role="TrG5h" value="myManager" />
      <property role="3TUv4t" value="true" />
      <node concept="3uibUv" id="1uMvfR614kT" role="1tU5fm">
        <ref role="3uigEE" to="3qmy:~ClassLoaderManager" resolve="ClassLoaderManager" />
      </node>
      <node concept="3Tm6S6" id="3cMIXQCIoDn" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="UJ6EPBeTYA" role="jymVt">
      <property role="TrG5h" value="myListener" />
      <property role="3TUv4t" value="true" />
      <node concept="3uibUv" id="1uMvfR614r4" role="1tU5fm">
        <ref role="3uigEE" to="3qmy:~MPSClassesListener" resolve="MPSClassesListener" />
      </node>
      <node concept="3Tm6S6" id="UJ6EPBeTYB" role="1B3o_S" />
      <node concept="2ShNRf" id="UJ6EPBeTYD" role="33vP2m">
        <node concept="YeOm9" id="69fW80uxgos" role="2ShVmc">
          <node concept="1Y3b0j" id="69fW80uxgot" role="YeSDq">
            <property role="2bfB8j" value="true" />
            <ref role="1Y3XeK" to="3qmy:~MPSClassesListenerAdapter" resolve="MPSClassesListenerAdapter" />
            <ref role="37wK5l" to="3qmy:~MPSClassesListenerAdapter.&lt;init&gt;()" resolve="MPSClassesListenerAdapter" />
            <node concept="3Tm1VV" id="69fW80uxgou" role="1B3o_S" />
            <node concept="3clFb_" id="3cMIXQCHbpS" role="jymVt">
              <property role="1EzhhJ" value="false" />
              <property role="TrG5h" value="beforeClassesUnloaded" />
              <property role="od$2w" value="false" />
              <property role="DiZV1" value="false" />
              <property role="2aFKle" value="false" />
              <node concept="37vLTG" id="1uMvfR615FI" role="3clF46">
                <property role="TrG5h" value="modules" />
                <node concept="3uibUv" id="1uMvfR615FH" role="1tU5fm">
                  <ref role="3uigEE" to="33ny:~Set" resolve="Set" />
                  <node concept="3qUE_q" id="1uMvfR615Nq" role="11_B2D">
                    <node concept="3uibUv" id="1uMvfR615O5" role="3qUE_r">
                      <ref role="3uigEE" to="j8aq:~ReloadableModuleBase" resolve="ReloadableModuleBase" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3clFbS" id="3cMIXQCHbpV" role="3clF47">
                <node concept="3clFbF" id="3cMIXQCHbF9" role="3cqZAp">
                  <node concept="2OqwBi" id="3cMIXQCHbMh" role="3clFbG">
                    <node concept="Xjq3P" id="3cMIXQCInIJ" role="2Oq$k0">
                      <ref role="1HBi2w" node="3HJD4JbIwfM" resolve="DataFlowManager" />
                    </node>
                    <node concept="liA8E" id="3cMIXQCHc4A" role="2OqNvi">
                      <ref role="37wK5l" node="3HJD4JbIwhO" resolve="clear" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3Tm1VV" id="3cMIXQCHbj0" role="1B3o_S" />
              <node concept="3cqZAl" id="3cMIXQCHbo0" role="3clF45" />
              <node concept="2AHcQZ" id="3cMIXQCHbyC" role="2AJF6D">
                <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="312cEg" id="3HJD4JbIwg0" role="jymVt">
      <property role="TrG5h" value="myBuilders" />
      <node concept="3uibUv" id="3HJD4JbIwg1" role="1tU5fm">
        <ref role="3uigEE" to="33ny:~Map" resolve="Map" />
        <node concept="17QB3L" id="3MUxWWhZPsz" role="11_B2D" />
        <node concept="3uibUv" id="qrAFe9upm7" role="11_B2D">
          <ref role="3uigEE" node="3HJD4JbIwf_" resolve="DataFlowBuilder" />
        </node>
      </node>
      <node concept="3Tm6S6" id="3HJD4JbIwg4" role="1B3o_S" />
      <node concept="2ShNRf" id="3HJD4JbIwg5" role="33vP2m">
        <node concept="1pGfFk" id="3HJD4JbIwg6" role="2ShVmc">
          <ref role="37wK5l" to="33ny:~HashMap.&lt;init&gt;()" resolve="HashMap" />
          <node concept="17QB3L" id="3MUxWWhZPsy" role="1pMfVU" />
          <node concept="3uibUv" id="qrAFe9upw0" role="1pMfVU">
            <ref role="3uigEE" node="3HJD4JbIwf_" resolve="DataFlowBuilder" />
          </node>
        </node>
      </node>
    </node>
    <node concept="312cEg" id="77rbAYG3qvA" role="jymVt">
      <property role="TrG5h" value="myLoaded" />
      <node concept="3Tm6S6" id="77rbAYG3qvB" role="1B3o_S" />
      <node concept="10P_77" id="77rbAYG3qPP" role="1tU5fm" />
      <node concept="3clFbT" id="77rbAYG3qPR" role="33vP2m">
        <property role="3clFbU" value="false" />
      </node>
    </node>
    <node concept="2tJIrI" id="3cMIXQCIZN0" role="jymVt" />
    <node concept="3clFbW" id="3HJD4JbIwgi" role="jymVt">
      <node concept="3Tm1VV" id="3HJD4JbIwgj" role="1B3o_S" />
      <node concept="3clFbS" id="3HJD4JbIwgo" role="3clF47">
        <node concept="3clFbF" id="3HJD4JbIwgp" role="3cqZAp">
          <node concept="37vLTI" id="1km689rKroK" role="3clFbG">
            <node concept="37vLTw" id="1uMvfR6147g" role="37vLTx">
              <ref role="3cqZAo" node="1uMvfR61445" resolve="manager" />
            </node>
            <node concept="37vLTw" id="3cMIXQCIwoa" role="37vLTJ">
              <ref role="3cqZAo" node="3cMIXQCIplA" resolve="myManager" />
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="1km689rKroO" role="3clF46">
        <property role="TrG5h" value="moduleRepository" />
        <node concept="3uibUv" id="1km689rKroQ" role="1tU5fm">
          <ref role="3uigEE" to="w1kc:~MPSModuleRepository" resolve="MPSModuleRepository" />
        </node>
      </node>
      <node concept="37vLTG" id="1uMvfR61445" role="3clF46">
        <property role="TrG5h" value="manager" />
        <node concept="3uibUv" id="1uMvfR6146B" role="1tU5fm">
          <ref role="3uigEE" to="3qmy:~ClassLoaderManager" resolve="ClassLoaderManager" />
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="3cMIXQCJ19i" role="jymVt" />
    <node concept="3clFb_" id="3HJD4JbIwg_" role="jymVt">
      <property role="TrG5h" value="init" />
      <node concept="3Tm1VV" id="3HJD4JbIwgA" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIwgB" role="3clF45" />
      <node concept="3clFbS" id="3HJD4JbIwgC" role="3clF47">
        <node concept="3clFbJ" id="1km689rKrov" role="3cqZAp">
          <node concept="3clFbS" id="1km689rKrow" role="3clFbx">
            <node concept="YS8fn" id="1km689rKroC" role="3cqZAp">
              <node concept="2ShNRf" id="1km689rKroE" role="YScLw">
                <node concept="1pGfFk" id="1km689rKroG" role="2ShVmc">
                  <ref role="37wK5l" to="wyt6:~IllegalStateException.&lt;init&gt;(java.lang.String)" resolve="IllegalStateException" />
                  <node concept="Xl_RD" id="1km689rKroH" role="37wK5m">
                    <property role="Xl_RC" value="double initialization" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3y3z36" id="1km689rKro$" role="3clFbw">
            <node concept="10Nm6u" id="1km689rKroB" role="3uHU7w" />
            <node concept="37vLTw" id="2BHiRxeofRQ" role="3uHU7B">
              <ref role="3cqZAo" node="1km689rKrob" resolve="INSTANCE" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1km689rKron" role="3cqZAp">
          <node concept="37vLTI" id="1km689rKrop" role="3clFbG">
            <node concept="37vLTw" id="2BHiRxeonmk" role="37vLTJ">
              <ref role="3cqZAo" node="1km689rKrob" resolve="INSTANCE" />
            </node>
            <node concept="Xjq3P" id="1km689rKros" role="37vLTx" />
          </node>
        </node>
        <node concept="3clFbF" id="3HJD4JbIwgD" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIwgE" role="3clFbG">
            <node concept="37vLTw" id="3cMIXQCIqaK" role="2Oq$k0">
              <ref role="3cqZAo" node="3cMIXQCIplA" resolve="myManager" />
            </node>
            <node concept="liA8E" id="3cMIXQCIwyV" role="2OqNvi">
              <ref role="37wK5l" to="3qmy:~ClassLoaderManager.addClassesHandler(jetbrains.mps.classloading.MPSClassesListener):void" resolve="addClassesHandler" />
              <node concept="37vLTw" id="3cMIXQCIwBd" role="37wK5m">
                <ref role="3cqZAo" node="UJ6EPBeTYA" resolve="myListener" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3tYsUK_sScf" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIwgV" role="jymVt">
      <property role="TrG5h" value="dispose" />
      <node concept="3Tm1VV" id="3HJD4JbIwgW" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIwgX" role="3clF45" />
      <node concept="3clFbS" id="3HJD4JbIwgY" role="3clF47">
        <node concept="3clFbF" id="4jgiyxeECgo" role="3cqZAp">
          <node concept="2OqwBi" id="4jgiyxeECgp" role="3clFbG">
            <node concept="37vLTw" id="3cMIXQCIqph" role="2Oq$k0">
              <ref role="3cqZAo" node="3cMIXQCIplA" resolve="myManager" />
            </node>
            <node concept="liA8E" id="3cMIXQCIwUz" role="2OqNvi">
              <ref role="37wK5l" to="3qmy:~ClassLoaderManager.removeClassesHandler(jetbrains.mps.classloading.MPSClassesListener):void" resolve="removeClassesHandler" />
              <node concept="37vLTw" id="3cMIXQCIwXL" role="37wK5m">
                <ref role="3cqZAo" node="UJ6EPBeTYA" resolve="myListener" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1km689rKrog" role="3cqZAp">
          <node concept="37vLTI" id="1km689rKroi" role="3clFbG">
            <node concept="37vLTw" id="2BHiRxeon93" role="37vLTJ">
              <ref role="3cqZAo" node="1km689rKrob" resolve="INSTANCE" />
            </node>
            <node concept="10Nm6u" id="1km689rKrol" role="37vLTx" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3tYsUK_sScg" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIwgZ" role="jymVt">
      <property role="TrG5h" value="register" />
      <node concept="3Tm1VV" id="3HJD4JbIwh0" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIwh1" role="3clF45" />
      <node concept="37vLTG" id="3HJD4JbIwh2" role="3clF46">
        <property role="TrG5h" value="conceptFqName" />
        <node concept="17QB3L" id="3MUxWWhZPs$" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIwh4" role="3clF46">
        <property role="TrG5h" value="builder" />
        <node concept="3uibUv" id="3HJD4JbIwh5" role="1tU5fm">
          <ref role="3uigEE" node="3HJD4JbIwf_" resolve="DataFlowBuilder" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIwh6" role="3clF47">
        <node concept="3clFbF" id="3HJD4JbIwh7" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIwh8" role="3clFbG">
            <node concept="2OqwBi" id="3HJD4JbIwh9" role="2Oq$k0">
              <node concept="2OwXpG" id="3HJD4JbIwha" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIwg0" resolve="myBuilders" />
              </node>
              <node concept="Xjq3P" id="3HJD4JbIwhb" role="2Oq$k0" />
            </node>
            <node concept="liA8E" id="3HJD4JbIwhc" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~Map.put(java.lang.Object,java.lang.Object):java.lang.Object" resolve="put" />
              <node concept="37vLTw" id="2BHiRxghfcW" role="37wK5m">
                <ref role="3cqZAo" node="3HJD4JbIwh2" resolve="conceptFqName" />
              </node>
              <node concept="37vLTw" id="2BHiRxgmP7S" role="37wK5m">
                <ref role="3cqZAo" node="3HJD4JbIwh4" resolve="builder" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIwhr" role="jymVt">
      <property role="TrG5h" value="buildProgramFor" />
      <node concept="3Tm1VV" id="3HJD4JbIwhs" role="1B3o_S" />
      <node concept="3uibUv" id="3HJD4JbIwht" role="3clF45">
        <ref role="3uigEE" to="1fjm:~Program" resolve="Program" />
      </node>
      <node concept="37vLTG" id="3HJD4JbIwhu" role="3clF46">
        <property role="TrG5h" value="node" />
        <node concept="3uibUv" id="3HJD4JbIwhv" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
        </node>
      </node>
      <node concept="3clFbS" id="3HJD4JbIwhw" role="3clF47">
        <node concept="3clFbF" id="77rbAYG3qTc" role="3cqZAp">
          <node concept="1rXfSq" id="4hiugqyz6ke" role="3clFbG">
            <ref role="37wK5l" node="77rbAYG3qPS" resolve="checkLoaded" />
          </node>
        </node>
        <node concept="3cpWs6" id="3HJD4JbIwhx" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIwhy" role="3cqZAk">
            <node concept="2ShNRf" id="3HJD4JbIwhz" role="2Oq$k0">
              <node concept="1pGfFk" id="3HJD4JbIwh$" role="2ShVmc">
                <ref role="37wK5l" node="3HJD4JbIvBv" resolve="MPSProgramBuilder" />
                <node concept="Xjq3P" id="3HJD4JbIwh_" role="37wK5m" />
              </node>
            </node>
            <node concept="liA8E" id="3HJD4JbIwhA" role="2OqNvi">
              <ref role="37wK5l" to="1fjm:~StructuralProgramBuilder.buildProgram(java.lang.Object):jetbrains.mps.lang.dataFlow.framework.Program" resolve="buildProgram" />
              <node concept="37vLTw" id="2BHiRxghibx" role="37wK5m">
                <ref role="3cqZAo" node="3HJD4JbIwhu" resolve="node" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="qrAFe9iC9k" role="jymVt" />
    <node concept="3clFb_" id="qrAFe9iBU8" role="jymVt">
      <property role="TrG5h" value="getBuilderFor" />
      <node concept="3uibUv" id="qrAFe9upzP" role="3clF45">
        <ref role="3uigEE" node="3HJD4JbIwf_" resolve="DataFlowBuilder" />
      </node>
      <node concept="37vLTG" id="qrAFe9iBUa" role="3clF46">
        <property role="TrG5h" value="concept" />
        <node concept="17QB3L" id="qrAFe9uqBM" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="qrAFe9iBUc" role="3clF47">
        <node concept="3clFbF" id="qrAFe9iBUd" role="3cqZAp">
          <node concept="1rXfSq" id="qrAFe9iBUe" role="3clFbG">
            <ref role="37wK5l" node="77rbAYG3qPS" resolve="checkLoaded" />
          </node>
        </node>
        <node concept="3cpWs6" id="qrAFe9iBUf" role="3cqZAp">
          <node concept="2OqwBi" id="qrAFe9iBUg" role="3cqZAk">
            <node concept="2OqwBi" id="qrAFe9iBUh" role="2Oq$k0">
              <node concept="2OwXpG" id="qrAFe9iBUi" role="2OqNvi">
                <ref role="2Oxat5" node="3HJD4JbIwg0" resolve="myBuilders" />
              </node>
              <node concept="Xjq3P" id="qrAFe9iBUj" role="2Oq$k0" />
            </node>
            <node concept="liA8E" id="qrAFe9iBUk" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~Map.get(java.lang.Object):java.lang.Object" resolve="get" />
              <node concept="37vLTw" id="qrAFe9uqKE" role="37wK5m">
                <ref role="3cqZAo" node="qrAFe9iBUa" resolve="concept" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="3HJD4JbIwhO" role="jymVt">
      <property role="TrG5h" value="clear" />
      <node concept="3Tm6S6" id="3HJD4JbIwhP" role="1B3o_S" />
      <node concept="3cqZAl" id="3HJD4JbIwhQ" role="3clF45" />
      <node concept="3clFbS" id="3HJD4JbIwhR" role="3clF47">
        <node concept="3clFbF" id="3HJD4JbIwhS" role="3cqZAp">
          <node concept="2OqwBi" id="3HJD4JbIwhT" role="3clFbG">
            <node concept="37vLTw" id="3cMIXQCIcN4" role="2Oq$k0">
              <ref role="3cqZAo" node="3HJD4JbIwg0" resolve="myBuilders" />
            </node>
            <node concept="liA8E" id="3HJD4JbIwhX" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~Map.clear():void" resolve="clear" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="77rbAYG3qQ9" role="3cqZAp">
          <node concept="37vLTI" id="77rbAYG3qQb" role="3clFbG">
            <node concept="3clFbT" id="77rbAYG3qQe" role="37vLTx" />
            <node concept="37vLTw" id="2BHiRxeujQg" role="37vLTJ">
              <ref role="3cqZAo" node="77rbAYG3qvA" resolve="myLoaded" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="77rbAYG3qPS" role="jymVt">
      <property role="TrG5h" value="checkLoaded" />
      <property role="od$2w" value="true" />
      <node concept="3cqZAl" id="77rbAYG3qPT" role="3clF45" />
      <node concept="3Tm6S6" id="77rbAYG3qT8" role="1B3o_S" />
      <node concept="3clFbS" id="77rbAYG3qPV" role="3clF47">
        <node concept="3clFbJ" id="77rbAYG3qPW" role="3cqZAp">
          <node concept="3clFbS" id="77rbAYG3qPY" role="3clFbx">
            <node concept="3cpWs6" id="77rbAYG3qQ0" role="3cqZAp" />
          </node>
          <node concept="37vLTw" id="2BHiRxeuTzT" role="3clFbw">
            <ref role="3cqZAo" node="77rbAYG3qvA" resolve="myLoaded" />
          </node>
        </node>
        <node concept="3clFbF" id="77rbAYG3qQ2" role="3cqZAp">
          <node concept="37vLTI" id="77rbAYG3qQ4" role="3clFbG">
            <node concept="3clFbT" id="77rbAYG3qQ7" role="37vLTx">
              <property role="3clFbU" value="true" />
            </node>
            <node concept="37vLTw" id="2BHiRxeuuYB" role="37vLTJ">
              <ref role="3cqZAo" node="77rbAYG3qvA" resolve="myLoaded" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="77rbAYG3qT3" role="3cqZAp">
          <node concept="2OqwBi" id="77rbAYG3qT4" role="3clFbG">
            <node concept="Xjq3P" id="77rbAYG3qT5" role="2Oq$k0" />
            <node concept="liA8E" id="77rbAYG3qT6" role="2OqNvi">
              <ref role="37wK5l" node="77rbAYG3qRN" resolve="load" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="77rbAYG3qRN" role="jymVt">
      <property role="TrG5h" value="load" />
      <node concept="3Tm6S6" id="77rbAYG3qRO" role="1B3o_S" />
      <node concept="3cqZAl" id="77rbAYG3qRP" role="3clF45" />
      <node concept="3clFbS" id="77rbAYG3qRQ" role="3clF47">
        <node concept="1DcWWT" id="77rbAYG3qRR" role="3cqZAp">
          <node concept="3cpWsn" id="77rbAYG3qRG" role="1Duv9x">
            <property role="TrG5h" value="l" />
            <node concept="3uibUv" id="77rbAYG3qRX" role="1tU5fm">
              <ref role="3uigEE" to="w1kc:~Language" resolve="Language" />
            </node>
          </node>
          <node concept="3clFbS" id="77rbAYG3qRY" role="2LFqv$">
            <node concept="3cpWs8" id="77rbAYG3qRZ" role="3cqZAp">
              <node concept="3cpWsn" id="77rbAYG3qRH" role="3cpWs9">
                <property role="TrG5h" value="dfaModel" />
                <node concept="3uibUv" id="77rbAYG3qS0" role="1tU5fm">
                  <ref role="3uigEE" to="mhbf:~SModel" resolve="SModel" />
                </node>
                <node concept="2OqwBi" id="77rbAYG3qS1" role="33vP2m">
                  <node concept="Rm8GO" id="77rbAYG3qT7" role="2Oq$k0">
                    <ref role="Rm8GQ" to="w1kc:~LanguageAspect.DATA_FLOW" resolve="DATA_FLOW" />
                    <ref role="1Px2BO" to="w1kc:~LanguageAspect" resolve="LanguageAspect" />
                  </node>
                  <node concept="liA8E" id="77rbAYG3qS3" role="2OqNvi">
                    <ref role="37wK5l" to="w1kc:~LanguageAspect.get(jetbrains.mps.smodel.Language):org.jetbrains.mps.openapi.model.SModel" resolve="get" />
                    <node concept="37vLTw" id="3GM_nagTBkK" role="37wK5m">
                      <ref role="3cqZAo" node="77rbAYG3qRG" resolve="l" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbJ" id="77rbAYG3qS5" role="3cqZAp">
              <node concept="1Wc70l" id="77rbAYG3qS6" role="3clFbw">
                <node concept="3y3z36" id="77rbAYG3qS7" role="3uHU7B">
                  <node concept="37vLTw" id="3GM_nagTz6g" role="3uHU7B">
                    <ref role="3cqZAo" node="77rbAYG3qRH" resolve="dfaModel" />
                  </node>
                  <node concept="10Nm6u" id="77rbAYG3qS9" role="3uHU7w" />
                </node>
                <node concept="2OqwBi" id="7wd6Nbj6RcH" role="3uHU7w">
                  <node concept="liA8E" id="7wd6Nbj6SMG" role="2OqNvi">
                    <ref role="37wK5l" to="33ny:~Iterator.hasNext():boolean" resolve="hasNext" />
                  </node>
                  <node concept="2OqwBi" id="7wd6Nbj6Pt3" role="2Oq$k0">
                    <node concept="liA8E" id="7wd6Nbj6QDf" role="2OqNvi">
                      <ref role="37wK5l" to="wyt6:~Iterable.iterator():java.util.Iterator" resolve="iterator" />
                    </node>
                    <node concept="2OqwBi" id="2wNMEwGdWmt" role="2Oq$k0">
                      <node concept="37vLTw" id="3GM_nagTst0" role="2Oq$k0">
                        <ref role="3cqZAo" node="77rbAYG3qRH" resolve="dfaModel" />
                      </node>
                      <node concept="liA8E" id="2wNMEwGdWmx" role="2OqNvi">
                        <ref role="37wK5l" to="mhbf:~SModel.getRootNodes():java.lang.Iterable" resolve="getRootNodes" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3clFbS" id="77rbAYG3qSe" role="3clFbx">
                <node concept="3cpWs8" id="77rbAYG3qSf" role="3cqZAp">
                  <node concept="3cpWsn" id="77rbAYG3qRI" role="3cpWs9">
                    <property role="TrG5h" value="dfaBuildersClassName" />
                    <node concept="17QB3L" id="3MUxWWhZPs_" role="1tU5fm" />
                    <node concept="3cpWs3" id="77rbAYG3qSh" role="33vP2m">
                      <node concept="2YIFZM" id="791rit5f65P" role="3uHU7B">
                        <ref role="37wK5l" to="unno:7WvVJ3rORmu" resolve="getModelLongName" />
                        <ref role="1Pybhc" to="unno:1NYD3hytmTa" resolve="SNodeOperations" />
                        <node concept="37vLTw" id="3GM_nagTshz" role="37wK5m">
                          <ref role="3cqZAo" node="77rbAYG3qRH" resolve="dfaModel" />
                        </node>
                      </node>
                      <node concept="Xl_RD" id="77rbAYG3qSl" role="3uHU7w">
                        <property role="Xl_RC" value=".DFABuilders" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3cpWs8" id="77rbAYG3qSm" role="3cqZAp">
                  <node concept="3cpWsn" id="77rbAYG3qRJ" role="3cpWs9">
                    <property role="TrG5h" value="buildersClass" />
                    <node concept="10Nm6u" id="1C7aCPi5hm8" role="33vP2m" />
                    <node concept="3uibUv" id="77rbAYG3qSn" role="1tU5fm">
                      <ref role="3uigEE" to="wyt6:~Class" resolve="Class" />
                      <node concept="3qUE_q" id="77rbAYG3qSo" role="11_B2D">
                        <node concept="3uibUv" id="77rbAYG3qSp" role="3qUE_r">
                          <ref role="3uigEE" node="3HJD4JbIwe3" resolve="DataFlowBuilders" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="SfApY" id="1C7aCPi5eMc" role="3cqZAp">
                  <node concept="3clFbS" id="1C7aCPi5eMd" role="SfCbr">
                    <node concept="3clFbF" id="1C7aCPi5faR" role="3cqZAp">
                      <node concept="37vLTI" id="1C7aCPi5faT" role="3clFbG">
                        <node concept="1eOMI4" id="57Uo7fzItpq" role="37vLTx">
                          <node concept="10QFUN" id="57Uo7fzIt4f" role="1eOMHV">
                            <node concept="3uibUv" id="57Uo7fzItI$" role="10QFUM">
                              <ref role="3uigEE" to="wyt6:~Class" resolve="Class" />
                              <node concept="3qUE_q" id="57Uo7fzIuOE" role="11_B2D">
                                <node concept="3uibUv" id="57Uo7fzIv5B" role="3qUE_r">
                                  <ref role="3uigEE" node="3HJD4JbIwe3" resolve="DataFlowBuilders" />
                                </node>
                              </node>
                            </node>
                            <node concept="2OqwBi" id="57Uo7fzIr06" role="10QFUP">
                              <node concept="37vLTw" id="57Uo7fzIqOI" role="2Oq$k0">
                                <ref role="3cqZAo" node="77rbAYG3qRG" resolve="l" />
                              </node>
                              <node concept="liA8E" id="57Uo7fzIrV9" role="2OqNvi">
                                <ref role="37wK5l" to="j8aq:~ReloadableModuleBase.getOwnClass(java.lang.String):java.lang.Class" resolve="getOwnClass" />
                                <node concept="37vLTw" id="57Uo7fzIsdT" role="37wK5m">
                                  <ref role="3cqZAo" node="77rbAYG3qRI" resolve="dfaBuildersClassName" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node concept="37vLTw" id="1C7aCPi5faX" role="37vLTJ">
                          <ref role="3cqZAo" node="77rbAYG3qRJ" resolve="buildersClass" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="TDmWw" id="1C7aCPi5eM8" role="TEbGg">
                    <node concept="3clFbS" id="1C7aCPi5eM9" role="TDEfX" />
                    <node concept="3cpWsn" id="1C7aCPi5eMa" role="TDEfY">
                      <property role="TrG5h" value="ignored" />
                      <node concept="3uibUv" id="1C7aCPi5eMb" role="1tU5fm">
                        <ref role="3uigEE" to="wyt6:~ClassNotFoundException" resolve="ClassNotFoundException" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbJ" id="77rbAYG3qSu" role="3cqZAp">
                  <node concept="3y3z36" id="77rbAYG3qSv" role="3clFbw">
                    <node concept="37vLTw" id="1C7aCPi5gZ9" role="3uHU7B">
                      <ref role="3cqZAo" node="77rbAYG3qRJ" resolve="buildersClass" />
                    </node>
                    <node concept="10Nm6u" id="77rbAYG3qSx" role="3uHU7w" />
                  </node>
                  <node concept="3clFbS" id="77rbAYG3qSy" role="3clFbx">
                    <node concept="SfApY" id="3cMIXQCJXpZ" role="3cqZAp">
                      <node concept="3clFbS" id="3cMIXQCJXq0" role="SfCbr">
                        <node concept="3cpWs8" id="77rbAYG3qSz" role="3cqZAp">
                          <node concept="3cpWsn" id="77rbAYG3qRM" role="3cpWs9">
                            <property role="TrG5h" value="builders" />
                            <node concept="3uibUv" id="77rbAYG3qS$" role="1tU5fm">
                              <ref role="3uigEE" node="3HJD4JbIwe3" resolve="DataFlowBuilders" />
                            </node>
                            <node concept="2OqwBi" id="77rbAYG3qSV" role="33vP2m">
                              <node concept="37vLTw" id="3GM_nagTuOQ" role="2Oq$k0">
                                <ref role="3cqZAo" node="77rbAYG3qRJ" resolve="buildersClass" />
                              </node>
                              <node concept="liA8E" id="77rbAYG3qSX" role="2OqNvi">
                                <ref role="37wK5l" to="wyt6:~Class.newInstance():java.lang.Object" resolve="newInstance" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node concept="3clFbF" id="77rbAYG3qSY" role="3cqZAp">
                          <node concept="2OqwBi" id="77rbAYG3qSZ" role="3clFbG">
                            <node concept="37vLTw" id="3GM_nagTx0M" role="2Oq$k0">
                              <ref role="3cqZAo" node="77rbAYG3qRM" resolve="builders" />
                            </node>
                            <node concept="liA8E" id="77rbAYG3qT1" role="2OqNvi">
                              <ref role="37wK5l" node="3HJD4JbIwe8" resolve="install" />
                              <node concept="Xjq3P" id="77rbAYG3qT2" role="37wK5m" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="TDmWw" id="3cMIXQCJXpR" role="TEbGg">
                        <node concept="3clFbS" id="3cMIXQCJXpS" role="TDEfX">
                          <node concept="34ab3g" id="3cMIXQCJYIj" role="3cqZAp">
                            <property role="35gtTG" value="error" />
                            <property role="34fQS0" value="true" />
                            <node concept="37vLTw" id="3cMIXQCJYIn" role="34bMjA">
                              <ref role="3cqZAo" node="3cMIXQCJXpT" resolve="e" />
                            </node>
                            <node concept="Xl_RD" id="3cMIXQCK8ek" role="34bqiv">
                              <property role="Xl_RC" value="" />
                            </node>
                          </node>
                        </node>
                        <node concept="3cpWsn" id="3cMIXQCJXpT" role="TDEfY">
                          <property role="TrG5h" value="e" />
                          <node concept="3uibUv" id="3cMIXQCJXpU" role="1tU5fm">
                            <ref role="3uigEE" to="wyt6:~InstantiationException" resolve="InstantiationException" />
                          </node>
                        </node>
                      </node>
                      <node concept="TDmWw" id="3cMIXQCJXpV" role="TEbGg">
                        <node concept="3clFbS" id="3cMIXQCJXpW" role="TDEfX">
                          <node concept="34ab3g" id="3cMIXQCK00R" role="3cqZAp">
                            <property role="35gtTG" value="error" />
                            <property role="34fQS0" value="true" />
                            <node concept="Xl_RD" id="3cMIXQCK00T" role="34bqiv" />
                            <node concept="37vLTw" id="3cMIXQCK00V" role="34bMjA">
                              <ref role="3cqZAo" node="3cMIXQCJXpX" resolve="e" />
                            </node>
                          </node>
                        </node>
                        <node concept="3cpWsn" id="3cMIXQCJXpX" role="TDEfY">
                          <property role="TrG5h" value="e" />
                          <node concept="3uibUv" id="3cMIXQCJXpY" role="1tU5fm">
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
          <node concept="2OqwBi" id="36Wp1D7i$iB" role="1DdaDG">
            <node concept="2YIFZM" id="1GCO8oCT5tk" role="2Oq$k0">
              <ref role="37wK5l" to="w1kc:~ModuleRepositoryFacade.getInstance():jetbrains.mps.smodel.ModuleRepositoryFacade" resolve="getInstance" />
              <ref role="1Pybhc" to="w1kc:~ModuleRepositoryFacade" resolve="ModuleRepositoryFacade" />
            </node>
            <node concept="liA8E" id="36Wp1D7i$iD" role="2OqNvi">
              <ref role="37wK5l" to="w1kc:~ModuleRepositoryFacade.getAllModules(java.lang.Class):java.util.Collection" resolve="getAllModules" />
              <node concept="3VsKOn" id="604XUKHaeE0" role="37wK5m">
                <ref role="3VsUkX" to="w1kc:~Language" resolve="Language" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2YIFZL" id="3HJD4JbIwg9" role="jymVt">
      <property role="TrG5h" value="getInstance" />
      <node concept="3Tm1VV" id="3HJD4JbIwga" role="1B3o_S" />
      <node concept="3uibUv" id="3HJD4JbIwgb" role="3clF45">
        <ref role="3uigEE" node="3HJD4JbIwfM" resolve="DataFlowManager" />
      </node>
      <node concept="3clFbS" id="3HJD4JbIwgc" role="3clF47">
        <node concept="3cpWs6" id="3HJD4JbIwgd" role="3cqZAp">
          <node concept="37vLTw" id="2BHiRxeogqE" role="3cqZAk">
            <ref role="3cqZAo" node="1km689rKrob" resolve="INSTANCE" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3UR2Jj" id="qrAFe9joRg" role="lGtFl">
      <node concept="TZ5HI" id="qrAFe9joRh" role="3nqlJM">
        <node concept="TZ5HA" id="qrAFe9joRi" role="3HnX3l">
          <node concept="1dT_AC" id="5uYjGaoZwh0" role="1dT_Ay">
            <property role="1dT_AB" value="use " />
          </node>
          <node concept="1dT_AA" id="5uYjGaoZwhp" role="1dT_Ay">
            <node concept="92FcH" id="5uYjGaoZwoZ" role="qph3F">
              <node concept="TZ5HA" id="5uYjGaoZwp1" role="2XjZqd" />
              <node concept="VXe08" id="5uYjGaoZIgd" role="92FcQ">
                <ref role="VXe09" node="3HJD4JbIvBk" resolve="MPSProgramBuilder" />
              </node>
            </node>
          </node>
          <node concept="1dT_AC" id="5uYjGaoZwho" role="1dT_Ay">
            <property role="1dT_AB" value=" directly to build program" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2AHcQZ" id="qrAFe9joRj" role="2AJF6D">
      <ref role="2AI5Lk" to="wyt6:~Deprecated" resolve="Deprecated" />
    </node>
    <node concept="2AHcQZ" id="5uYjGaoZrK7" role="2AJF6D">
      <ref role="2AI5Lk" to="ncw5:~ToRemove" resolve="ToRemove" />
      <node concept="2B6LJw" id="5uYjGaoZvcq" role="2B76xF">
        <ref role="2B6OnR" to="ncw5:~ToRemove.version()" resolve="version" />
        <node concept="3b6qkQ" id="5uYjGaoZvdv" role="2B70Vg">
          <property role="$nhwW" value="3.4" />
        </node>
      </node>
    </node>
  </node>
</model>

