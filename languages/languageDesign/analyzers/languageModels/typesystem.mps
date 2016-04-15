<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:139daa25-c5a7-4ac9-85a2-eb14d22e8f56(jetbrains.mps.lang.dataFlow.analyzers.typesystem)">
  <persistence version="9" />
  <languages>
    <use id="83888646-71ce-4f1c-9c53-c54016f6ad4f" name="jetbrains.mps.baseLanguage.collections" version="0" />
    <use id="3a13115c-633c-4c5c-bbcc-75c4219e9555" name="jetbrains.mps.lang.quotation" version="0" />
    <use id="7a5dda62-9140-4668-ab76-d5ed1746f2b2" name="jetbrains.mps.lang.typesystem" version="0" />
    <use id="774bf8a0-62e5-41e1-af63-f4812e60e48b" name="jetbrains.mps.baseLanguage.checkedDots" version="0" />
    <use id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel" version="2" />
    <use id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage" version="4" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports>
    <import index="bj1v" ref="r:8b09f5e2-b403-4747-aaa3-eac5acb1f753(jetbrains.mps.lang.dataFlow.analyzers.structure)" />
    <import index="mu20" ref="r:fc94574f-a075-45e6-9927-48e7e87153e6(jetbrains.mps.analyzers.runtime.framework)" />
    <import index="wyt6" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang()" />
    <import index="1fjm" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.lang.dataFlow.framework(MPS.Core/)" />
    <import index="dau9" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.lang.dataFlow.framework.instructions(MPS.Core/)" />
    <import index="w1kc" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel(MPS.Core/)" />
    <import index="iwwu" ref="r:2c4d9270-b6d6-44af-aecd-e01a223680db(jetbrains.mps.kernel.model)" />
    <import index="lui2" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.module(MPS.OpenAPI/)" />
    <import index="mhbf" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.model(MPS.OpenAPI/)" />
    <import index="lijz" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.project.dependency.modules(MPS.Core/)" />
    <import index="tpcj" ref="r:00000000-0000-4000-0000-011c8959028f(jetbrains.mps.lang.structure.typesystem)" />
    <import index="mhfm" ref="3f233e7f-b8a6-46d2-a57f-795d56775243/java:org.jetbrains.annotations(Annotations/)" />
    <import index="33ny" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.util(JDK/)" />
    <import index="z1c3" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.project(MPS.Core/)" implicit="true" />
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
    <import index="tpee" ref="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" implicit="true" />
    <import index="tpek" ref="r:00000000-0000-4000-0000-011c895902c0(jetbrains.mps.baseLanguage.behavior)" implicit="true" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1202948039474" name="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" flags="nn" index="liA8E" />
      <concept id="1154032098014" name="jetbrains.mps.baseLanguage.structure.AbstractLoopStatement" flags="nn" index="2LF5Ji">
        <child id="1154032183016" name="body" index="2LFqv$" />
      </concept>
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
      </concept>
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
      <concept id="1070534058343" name="jetbrains.mps.baseLanguage.structure.NullLiteral" flags="nn" index="10Nm6u" />
      <concept id="1070534934090" name="jetbrains.mps.baseLanguage.structure.CastExpression" flags="nn" index="10QFUN">
        <child id="1070534934091" name="type" index="10QFUM" />
        <child id="1070534934092" name="expression" index="10QFUP" />
      </concept>
      <concept id="1068431474542" name="jetbrains.mps.baseLanguage.structure.VariableDeclaration" flags="ng" index="33uBYm">
        <child id="1068431790190" name="initializer" index="33vP2m" />
      </concept>
      <concept id="1068431790189" name="jetbrains.mps.baseLanguage.structure.Type" flags="in" index="33vP2l" />
      <concept id="1068498886296" name="jetbrains.mps.baseLanguage.structure.VariableReference" flags="nn" index="37vLTw">
        <reference id="1068581517664" name="variableDeclaration" index="3cqZAo" />
      </concept>
      <concept id="4972933694980447171" name="jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration" flags="ng" index="19Szcq">
        <child id="5680397130376446158" name="type" index="1tU5fm" />
      </concept>
      <concept id="1068580123152" name="jetbrains.mps.baseLanguage.structure.EqualsExpression" flags="nn" index="3clFbC" />
      <concept id="1068580123159" name="jetbrains.mps.baseLanguage.structure.IfStatement" flags="nn" index="3clFbJ">
        <child id="1068580123160" name="condition" index="3clFbw" />
        <child id="1068580123161" name="ifTrue" index="3clFbx" />
      </concept>
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
      <concept id="1068581242875" name="jetbrains.mps.baseLanguage.structure.PlusExpression" flags="nn" index="3cpWs3" />
      <concept id="1068581242878" name="jetbrains.mps.baseLanguage.structure.ReturnStatement" flags="nn" index="3cpWs6" />
      <concept id="1068581242864" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" flags="nn" index="3cpWs8">
        <child id="1068581242865" name="localVariableDeclaration" index="3cpWs9" />
      </concept>
      <concept id="1068581242863" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" flags="nr" index="3cpWsn" />
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
      <concept id="1107535904670" name="jetbrains.mps.baseLanguage.structure.ClassifierType" flags="in" index="3uibUv">
        <reference id="1107535924139" name="classifier" index="3uigEE" />
        <child id="1109201940907" name="parameter" index="11_B2D" />
      </concept>
      <concept id="1081773326031" name="jetbrains.mps.baseLanguage.structure.BinaryOperation" flags="nn" index="3uHJSO">
        <child id="1081773367579" name="rightExpression" index="3uHU7w" />
        <child id="1081773367580" name="leftExpression" index="3uHU7B" />
      </concept>
      <concept id="1073239437375" name="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" flags="nn" index="3y3z36" />
      <concept id="1080120340718" name="jetbrains.mps.baseLanguage.structure.AndExpression" flags="nn" index="1Wc70l" />
    </language>
    <language id="774bf8a0-62e5-41e1-af63-f4812e60e48b" name="jetbrains.mps.baseLanguage.checkedDots">
      <concept id="4079382982702596667" name="jetbrains.mps.baseLanguage.checkedDots.structure.CheckedDotExpression" flags="nn" index="2EnYce" />
    </language>
    <language id="3a13115c-633c-4c5c-bbcc-75c4219e9555" name="jetbrains.mps.lang.quotation">
      <concept id="1196350785110" name="jetbrains.mps.lang.quotation.structure.AbstractAntiquotation" flags="ng" index="2c44t0">
        <child id="1196350785111" name="expression" index="2c44t1" />
      </concept>
      <concept id="1196350785117" name="jetbrains.mps.lang.quotation.structure.ReferenceAntiquotation" flags="ng" index="2c44tb" />
      <concept id="1196350785112" name="jetbrains.mps.lang.quotation.structure.Antiquotation" flags="ng" index="2c44te" />
      <concept id="1196350785113" name="jetbrains.mps.lang.quotation.structure.Quotation" flags="nn" index="2c44tf">
        <child id="1196350785114" name="quotedNode" index="2c44tc" />
      </concept>
    </language>
    <language id="7a5dda62-9140-4668-ab76-d5ed1746f2b2" name="jetbrains.mps.lang.typesystem">
      <concept id="1185788614172" name="jetbrains.mps.lang.typesystem.structure.NormalTypeClause" flags="ng" index="mw_s8">
        <child id="1185788644032" name="normalType" index="mwGJk" />
      </concept>
      <concept id="1175517767210" name="jetbrains.mps.lang.typesystem.structure.ReportErrorStatement" flags="nn" index="2MkqsV">
        <child id="1175517851849" name="errorString" index="2MkJ7o" />
      </concept>
      <concept id="1227096498176" name="jetbrains.mps.lang.typesystem.structure.PropertyMessageTarget" flags="ng" index="2ODE4t">
        <reference id="1227096521710" name="propertyDeclaration" index="2ODJFN" />
      </concept>
      <concept id="1227096774658" name="jetbrains.mps.lang.typesystem.structure.MessageStatement" flags="ng" index="2OEH$v">
        <child id="1227096802791" name="helginsIntention" index="2OEOjU" />
        <child id="1227096802790" name="nodeToReport" index="2OEOjV" />
        <child id="1227096836496" name="messageTarget" index="2OEWyd" />
      </concept>
      <concept id="1195213580585" name="jetbrains.mps.lang.typesystem.structure.AbstractCheckingRule" flags="ig" index="18hYwZ">
        <child id="1195213635060" name="body" index="18ibNy" />
      </concept>
      <concept id="1195214364922" name="jetbrains.mps.lang.typesystem.structure.NonTypesystemRule" flags="ig" index="18kY7G" />
      <concept id="1210784285454" name="jetbrains.mps.lang.typesystem.structure.TypesystemIntention" flags="ng" index="3Cnw8n">
        <reference id="1216388525179" name="quickFix" index="QpYPw" />
        <child id="1210784493590" name="actualArgument" index="3Coj4f" />
      </concept>
      <concept id="1210784384552" name="jetbrains.mps.lang.typesystem.structure.TypesystemIntentionArgument" flags="ng" index="3CnSsL">
        <reference id="1216386999476" name="quickFixArgument" index="QkamJ" />
        <child id="1210784642750" name="value" index="3CoRuB" />
      </concept>
      <concept id="1174642788531" name="jetbrains.mps.lang.typesystem.structure.ConceptReference" flags="ig" index="1YaCAy">
        <reference id="1174642800329" name="concept" index="1YaFvo" />
      </concept>
      <concept id="1174643105530" name="jetbrains.mps.lang.typesystem.structure.InferenceRule" flags="ig" index="1YbPZF" />
      <concept id="1174648085619" name="jetbrains.mps.lang.typesystem.structure.AbstractRule" flags="ng" index="1YuPPy">
        <child id="1174648101952" name="applicableNode" index="1YuTPh" />
      </concept>
      <concept id="1174650418652" name="jetbrains.mps.lang.typesystem.structure.ApplicableNodeReference" flags="nn" index="1YBJjd">
        <reference id="1174650432090" name="applicableNode" index="1YBMHb" />
      </concept>
      <concept id="1174657487114" name="jetbrains.mps.lang.typesystem.structure.TypeOfExpression" flags="nn" index="1Z2H0r">
        <child id="1174657509053" name="term" index="1Z2MuG" />
      </concept>
      <concept id="1174658326157" name="jetbrains.mps.lang.typesystem.structure.CreateEquationStatement" flags="nn" index="1Z5TYs" />
      <concept id="1174660718586" name="jetbrains.mps.lang.typesystem.structure.AbstractEquationStatement" flags="nn" index="1Zf1VF">
        <property id="1206359757216" name="checkOnly" index="3wDh2S" />
        <child id="1174660783413" name="leftExpression" index="1ZfhK$" />
        <child id="1174660783414" name="rightExpression" index="1ZfhKB" />
      </concept>
      <concept id="1174663118805" name="jetbrains.mps.lang.typesystem.structure.CreateLessThanInequationStatement" flags="nn" index="1ZobV4" />
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1177026924588" name="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" flags="nn" index="chp4Y">
        <reference id="1177026940964" name="conceptDeclaration" index="cht4Q" />
      </concept>
      <concept id="1138411891628" name="jetbrains.mps.lang.smodel.structure.SNodeOperation" flags="nn" index="eCIE_">
        <child id="1144104376918" name="parameter" index="1xVPHs" />
      </concept>
      <concept id="1179409122411" name="jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall" flags="nn" index="2qgKlT" />
      <concept id="1143234257716" name="jetbrains.mps.lang.smodel.structure.Node_GetModelOperation" flags="nn" index="I4A8Y" />
      <concept id="1145404486709" name="jetbrains.mps.lang.smodel.structure.SemanticDowncastExpression" flags="nn" index="2JrnkZ">
        <child id="1145404616321" name="leftExpression" index="2JrQYb" />
      </concept>
      <concept id="1171407110247" name="jetbrains.mps.lang.smodel.structure.Node_GetAncestorOperation" flags="nn" index="2Xjw5R" />
      <concept id="1144101972840" name="jetbrains.mps.lang.smodel.structure.OperationParm_Concept" flags="ng" index="1xMEDy">
        <child id="1207343664468" name="conceptArgument" index="ri$Ld" />
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
      <concept id="3364660638048049745" name="jetbrains.mps.lang.core.structure.LinkAttribute" flags="ng" index="A9Btn">
        <property id="1757699476691236116" name="linkRole" index="2qtEX8" />
        <property id="1341860900488019036" name="linkId" index="P3scX" />
      </concept>
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
    <language id="83888646-71ce-4f1c-9c53-c54016f6ad4f" name="jetbrains.mps.baseLanguage.collections">
      <concept id="540871147943773365" name="jetbrains.mps.baseLanguage.collections.structure.SingleArgumentSequenceOperation" flags="nn" index="25WWJ4">
        <child id="540871147943773366" name="argument" index="25WWJ7" />
      </concept>
      <concept id="1226511727824" name="jetbrains.mps.baseLanguage.collections.structure.SetType" flags="in" index="2hMVRd">
        <child id="1226511765987" name="elementType" index="2hN53Y" />
      </concept>
      <concept id="1151688443754" name="jetbrains.mps.baseLanguage.collections.structure.ListType" flags="in" index="_YKpA">
        <child id="1151688676805" name="elementType" index="_ZDj9" />
      </concept>
      <concept id="1162935959151" name="jetbrains.mps.baseLanguage.collections.structure.GetSizeOperation" flags="nn" index="34oBXx" />
      <concept id="9042586985346099698" name="jetbrains.mps.baseLanguage.collections.structure.MultiForEachStatement" flags="nn" index="1_o_46">
        <child id="9042586985346099734" name="forEach" index="1_o_by" />
      </concept>
      <concept id="9042586985346099733" name="jetbrains.mps.baseLanguage.collections.structure.MultiForEachPair" flags="ng" index="1_o_bx">
        <child id="9042586985346099778" name="variable" index="1_o_aQ" />
        <child id="9042586985346099735" name="input" index="1_o_bz" />
      </concept>
      <concept id="9042586985346099736" name="jetbrains.mps.baseLanguage.collections.structure.MultiForEachVariable" flags="ng" index="1_o_bG" />
      <concept id="1172254888721" name="jetbrains.mps.baseLanguage.collections.structure.ContainsOperation" flags="nn" index="3JPx81" />
      <concept id="8293956702609956630" name="jetbrains.mps.baseLanguage.collections.structure.MultiForEachVariableReference" flags="nn" index="3M$PaV">
        <reference id="8293956702609966325" name="variable" index="3M$S_o" />
      </concept>
    </language>
  </registry>
  <node concept="1YbPZF" id="7XrupC0L7m4">
    <property role="TrG5h" value="typeof_AnalyzerFunParameterProgramState" />
    <property role="3GE5qa" value="Analyzer.AnalyzerFunctions" />
    <node concept="3clFbS" id="7XrupC0L7m5" role="18ibNy">
      <node concept="1Z5TYs" id="7XrupC0L8K0" role="3cqZAp">
        <node concept="mw_s8" id="7XrupC0L8K3" role="1ZfhK$">
          <node concept="1Z2H0r" id="7XrupC0L81L" role="mwGJk">
            <node concept="1YBJjd" id="7XrupC0L8JZ" role="1Z2MuG">
              <ref role="1YBMHb" node="7XrupC0L7m6" resolve="programState" />
            </node>
          </node>
        </node>
        <node concept="mw_s8" id="7XrupC0LhIe" role="1ZfhKB">
          <node concept="2c44tf" id="7XrupC0LhIf" role="mwGJk">
            <node concept="3uibUv" id="7XrupC0LhIi" role="2c44tc">
              <ref role="3uigEE" to="1fjm:~ProgramState" resolve="ProgramState" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="7XrupC0L7m6" role="1YuTPh">
      <property role="TrG5h" value="programState" />
      <ref role="1YaFvo" to="bj1v:47tk9ge7tji" resolve="AnalyzerFunParameterProgramState" />
    </node>
  </node>
  <node concept="1YbPZF" id="7XrupC0LhJB">
    <property role="TrG5h" value="typeof_AnalyzerMergeParameterInput" />
    <property role="3GE5qa" value="Analyzer.AnalyzerFunctions" />
    <node concept="3clFbS" id="7XrupC0LhJC" role="18ibNy">
      <node concept="1Z5TYs" id="7XrupC0LhJV" role="3cqZAp">
        <node concept="mw_s8" id="7XrupC0LhKu" role="1ZfhKB">
          <node concept="2c44tf" id="7XrupC0LhKG" role="mwGJk">
            <node concept="_YKpA" id="7XrupC0LhKH" role="2c44tc">
              <node concept="33vP2l" id="7XrupC0LhKI" role="_ZDj9">
                <node concept="2c44te" id="7XrupC0LhKJ" role="lGtFl">
                  <node concept="2OqwBi" id="7XrupC0LhKK" role="2c44t1">
                    <node concept="2OqwBi" id="7XrupC0LhKL" role="2Oq$k0">
                      <node concept="1YBJjd" id="7XrupC0LhKM" role="2Oq$k0">
                        <ref role="1YBMHb" node="7XrupC0LhJD" resolve="input" />
                      </node>
                      <node concept="2Xjw5R" id="7XrupC0LhKN" role="2OqNvi">
                        <node concept="1xMEDy" id="7XrupC0LhKO" role="1xVPHs">
                          <node concept="chp4Y" id="7XrupC0LhKP" role="ri$Ld">
                            <ref role="cht4Q" to="bj1v:5JpT3MjX6u9" resolve="Analyzer" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3TrEf2" id="7XrupC0LhKQ" role="2OqNvi">
                      <ref role="3Tt5mk" to="bj1v:7XrupC0LhIV" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="mw_s8" id="7XrupC0LhJY" role="1ZfhK$">
          <node concept="1Z2H0r" id="7XrupC0LhJS" role="mwGJk">
            <node concept="1YBJjd" id="7XrupC0LhJU" role="1Z2MuG">
              <ref role="1YBMHb" node="7XrupC0LhJD" resolve="input" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="7XrupC0LhJD" role="1YuTPh">
      <property role="TrG5h" value="input" />
      <ref role="1YaFvo" to="bj1v:47tk9ge7nV5" resolve="AnalyzerMergeParameterInput" />
    </node>
  </node>
  <node concept="1YbPZF" id="7XrupC0LiYQ">
    <property role="TrG5h" value="typeof_AnalyzerFunParameterInput" />
    <property role="3GE5qa" value="Analyzer.AnalyzerFunctions" />
    <node concept="3clFbS" id="7XrupC0LiYR" role="18ibNy">
      <node concept="1Z5TYs" id="7XrupC0LiYX" role="3cqZAp">
        <node concept="mw_s8" id="7XrupC0LiZ0" role="1ZfhK$">
          <node concept="1Z2H0r" id="7XrupC0LiYU" role="mwGJk">
            <node concept="1YBJjd" id="7XrupC0LiYW" role="1Z2MuG">
              <ref role="1YBMHb" node="7XrupC0LiYS" resolve="input" />
            </node>
          </node>
        </node>
        <node concept="mw_s8" id="nUEAIXlxGt" role="1ZfhKB">
          <node concept="2OqwBi" id="nUEAIXlBeX" role="mwGJk">
            <node concept="2OqwBi" id="nUEAIXlxG_" role="2Oq$k0">
              <node concept="1YBJjd" id="nUEAIXlxGu" role="2Oq$k0">
                <ref role="1YBMHb" node="7XrupC0LiYS" resolve="input" />
              </node>
              <node concept="2Xjw5R" id="nUEAIXlBeS" role="2OqNvi">
                <node concept="1xMEDy" id="nUEAIXlBeT" role="1xVPHs">
                  <node concept="chp4Y" id="nUEAIXlBeW" role="ri$Ld">
                    <ref role="cht4Q" to="bj1v:5JpT3MjX6u9" resolve="Analyzer" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3TrEf2" id="nUEAIXlBf1" role="2OqNvi">
              <ref role="3Tt5mk" to="bj1v:7XrupC0LhIV" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="7XrupC0LiYS" role="1YuTPh">
      <property role="TrG5h" value="input" />
      <ref role="1YaFvo" to="bj1v:47tk9ge7tjk" resolve="AnalyzerFunParameterInput" />
    </node>
  </node>
  <node concept="1YbPZF" id="7XrupC0LiZk">
    <property role="TrG5h" value="typeof_AnalyzerFunctionResultType" />
    <property role="3GE5qa" value="Analyzer.AnalyzerFunctions" />
    <node concept="3clFbS" id="7XrupC0LiZl" role="18ibNy">
      <node concept="1Z5TYs" id="nUEAIXlTbu" role="3cqZAp">
        <node concept="mw_s8" id="nUEAIXlTby" role="1ZfhKB">
          <node concept="1YBJjd" id="nUEAIXlTbz" role="mwGJk">
            <ref role="1YBMHb" node="7XrupC0LiZm" resolve="resultType" />
          </node>
        </node>
        <node concept="mw_s8" id="nUEAIXlTbx" role="1ZfhK$">
          <node concept="2OqwBi" id="nUEAIXlTbn" role="mwGJk">
            <node concept="2OqwBi" id="nUEAIXlTbo" role="2Oq$k0">
              <node concept="1YBJjd" id="nUEAIXlTbp" role="2Oq$k0">
                <ref role="1YBMHb" node="7XrupC0LiZm" resolve="resultType" />
              </node>
              <node concept="2Xjw5R" id="nUEAIXlTbq" role="2OqNvi">
                <node concept="1xMEDy" id="nUEAIXlTbr" role="1xVPHs">
                  <node concept="chp4Y" id="nUEAIXlTbs" role="ri$Ld">
                    <ref role="cht4Q" to="bj1v:5JpT3MjX6u9" resolve="Analyzer" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3TrEf2" id="nUEAIXlTbt" role="2OqNvi">
              <ref role="3Tt5mk" to="bj1v:7XrupC0LhIV" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="7XrupC0LiZm" role="1YuTPh">
      <property role="TrG5h" value="resultType" />
      <ref role="1YaFvo" to="bj1v:7XrupC0LiYB" resolve="AnalyzerFunctionResultType" />
    </node>
  </node>
  <node concept="1YbPZF" id="7XrupC0LiZS">
    <property role="TrG5h" value="typeof_AnalyzerParameterProgram" />
    <property role="3GE5qa" value="Analyzer.AnalyzerFunctions" />
    <node concept="3clFbS" id="7XrupC0LiZT" role="18ibNy">
      <node concept="1Z5TYs" id="7XrupC0LiZV" role="3cqZAp">
        <node concept="mw_s8" id="7XrupC0LiZW" role="1ZfhK$">
          <node concept="1Z2H0r" id="7XrupC0LiZX" role="mwGJk">
            <node concept="1YBJjd" id="7XrupC0Lj02" role="1Z2MuG">
              <ref role="1YBMHb" node="7XrupC0LiZU" resolve="program" />
            </node>
          </node>
        </node>
        <node concept="mw_s8" id="7XrupC0LiZZ" role="1ZfhKB">
          <node concept="2c44tf" id="7XrupC0Lj00" role="mwGJk">
            <node concept="3uibUv" id="7XrupC0Lj03" role="2c44tc">
              <ref role="3uigEE" to="1fjm:~Program" resolve="Program" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="7XrupC0LiZU" role="1YuTPh">
      <property role="TrG5h" value="program" />
      <ref role="1YaFvo" to="bj1v:47tk9ge7nUW" resolve="AnalyzerParameterProgram" />
    </node>
  </node>
  <node concept="1YbPZF" id="3E8vDQwHcVL">
    <property role="TrG5h" value="typeof_InstructionReference" />
    <node concept="3clFbS" id="3E8vDQwHcVM" role="18ibNy">
      <node concept="1Z5TYs" id="3E8vDQwHcVZ" role="3cqZAp">
        <node concept="mw_s8" id="3E8vDQwHcW2" role="1ZfhK$">
          <node concept="1Z2H0r" id="3E8vDQwHcVP" role="mwGJk">
            <node concept="1YBJjd" id="3E8vDQwHcVR" role="1Z2MuG">
              <ref role="1YBMHb" node="3E8vDQwHcVN" resolve="reference" />
            </node>
          </node>
        </node>
        <node concept="mw_s8" id="3E8vDQwHcW3" role="1ZfhKB">
          <node concept="2OqwBi" id="3E8vDQwHcW5" role="mwGJk">
            <node concept="1YBJjd" id="3E8vDQwHcW4" role="2Oq$k0">
              <ref role="1YBMHb" node="3E8vDQwHcVN" resolve="reference" />
            </node>
            <node concept="3TrEf2" id="3E8vDQwHcW9" role="2OqNvi">
              <ref role="3Tt5mk" to="bj1v:3E8vDQwHcV_" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="3E8vDQwHcVN" role="1YuTPh">
      <property role="TrG5h" value="reference" />
      <ref role="1YaFvo" to="bj1v:3E8vDQwHcVs" resolve="InstructionReference" />
    </node>
  </node>
  <node concept="1YbPZF" id="9V7Nft$SQ0">
    <property role="TrG5h" value="typeof_AnalyzerRunnerCreator" />
    <property role="3GE5qa" value="Analyzer" />
    <node concept="3clFbS" id="9V7Nft$SQ1" role="18ibNy">
      <node concept="1Z5TYs" id="9V7Nft_t_p" role="3cqZAp">
        <node concept="mw_s8" id="9V7Nft_t_s" role="1ZfhK$">
          <node concept="1Z2H0r" id="9V7Nft_t_m" role="mwGJk">
            <node concept="1YBJjd" id="9V7Nft_t_o" role="1Z2MuG">
              <ref role="1YBMHb" node="9V7Nft$SQ2" resolve="analyzerRunnerCreator" />
            </node>
          </node>
        </node>
        <node concept="mw_s8" id="3y47OhSEeOe" role="1ZfhKB">
          <node concept="2c44tf" id="3y47OhSEeOf" role="mwGJk">
            <node concept="3uibUv" id="3y47OhSEeOh" role="2c44tc">
              <ref role="3uigEE" to="mu20:9V7Nft_x9B" resolve="CustomAnalyzerRunner" />
              <node concept="33vP2l" id="3y47OhSEeOi" role="11_B2D">
                <node concept="2c44te" id="3y47OhSEeOj" role="lGtFl">
                  <node concept="2OqwBi" id="3y47OhSEf9J" role="2c44t1">
                    <node concept="2OqwBi" id="3y47OhSEeOm" role="2Oq$k0">
                      <node concept="1YBJjd" id="3y47OhSEeOl" role="2Oq$k0">
                        <ref role="1YBMHb" node="9V7Nft$SQ2" resolve="analyzerRunnerCreator" />
                      </node>
                      <node concept="3TrEf2" id="3y47OhSEf9I" role="2OqNvi">
                        <ref role="3Tt5mk" to="bj1v:5hLfAui9Cn" />
                      </node>
                    </node>
                    <node concept="3TrEf2" id="3y47OhSEf9N" role="2OqNvi">
                      <ref role="3Tt5mk" to="bj1v:7XrupC0LhIV" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3cpWs8" id="3tEjlbSOxOr" role="3cqZAp">
        <node concept="3cpWsn" id="3tEjlbSOxOs" role="3cpWs9">
          <property role="TrG5h" value="analyzer" />
          <node concept="3Tqbb2" id="3tEjlbSOxOo" role="1tU5fm">
            <ref role="ehGHo" to="bj1v:5JpT3MjX6u9" resolve="Analyzer" />
          </node>
          <node concept="2OqwBi" id="3tEjlbSOxOt" role="33vP2m">
            <node concept="1YBJjd" id="5JXsuoWqqLn" role="2Oq$k0">
              <ref role="1YBMHb" node="9V7Nft$SQ2" resolve="analyzerRunnerCreator" />
            </node>
            <node concept="3TrEf2" id="3tEjlbSOxOv" role="2OqNvi">
              <ref role="3Tt5mk" to="bj1v:5hLfAui9Cn" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3clFbJ" id="3tEjlbSOuOS" role="3cqZAp">
        <node concept="3clFbS" id="3tEjlbSOuOU" role="3clFbx">
          <node concept="2MkqsV" id="3tEjlbSOzVF" role="3cqZAp">
            <node concept="Xl_RD" id="3tEjlbSOzVU" role="2MkJ7o">
              <property role="Xl_RC" value="wrong number of parameters" />
            </node>
            <node concept="1YBJjd" id="5JXsuoWqrfO" role="2OEOjV">
              <ref role="1YBMHb" node="9V7Nft$SQ2" resolve="analyzerRunnerCreator" />
            </node>
          </node>
        </node>
        <node concept="3y3z36" id="3tEjlbSOx$a" role="3clFbw">
          <node concept="2OqwBi" id="3tEjlbSOyM8" role="3uHU7w">
            <node concept="2OqwBi" id="3tEjlbSOxXX" role="2Oq$k0">
              <node concept="37vLTw" id="3tEjlbSOxTd" role="2Oq$k0">
                <ref role="3cqZAo" node="3tEjlbSOxOs" resolve="analyzer" />
              </node>
              <node concept="3Tsc0h" id="3tEjlbSOy3A" role="2OqNvi">
                <ref role="3TtcxE" to="bj1v:3tEjlbSKIc3" />
              </node>
            </node>
            <node concept="34oBXx" id="3tEjlbSOzSg" role="2OqNvi" />
          </node>
          <node concept="2OqwBi" id="3tEjlbSOvid" role="3uHU7B">
            <node concept="2OqwBi" id="5JXsuoWqr1A" role="2Oq$k0">
              <node concept="1YBJjd" id="5JXsuoWqqY4" role="2Oq$k0">
                <ref role="1YBMHb" node="9V7Nft$SQ2" resolve="analyzerRunnerCreator" />
              </node>
              <node concept="3Tsc0h" id="5JXsuoWqrbW" role="2OqNvi">
                <ref role="3TtcxE" to="bj1v:3tEjlbSOgR6" />
              </node>
            </node>
            <node concept="34oBXx" id="3tEjlbSOwH3" role="2OqNvi" />
          </node>
        </node>
      </node>
      <node concept="1_o_46" id="5JXsuoWqs6W" role="3cqZAp">
        <node concept="3clFbS" id="5JXsuoWqs6Y" role="2LFqv$">
          <node concept="1ZobV4" id="5JXsuoWqsDX" role="3cqZAp">
            <property role="3wDh2S" value="true" />
            <node concept="mw_s8" id="5JXsuoWqsJB" role="1ZfhKB">
              <node concept="1Z2H0r" id="5JXsuoWqsJz" role="mwGJk">
                <node concept="3M$PaV" id="5JXsuoWqsKG" role="1Z2MuG">
                  <ref role="3M$S_o" node="5JXsuoWqspI" resolve="parameter" />
                </node>
              </node>
            </node>
            <node concept="mw_s8" id="5JXsuoWqsE7" role="1ZfhK$">
              <node concept="1Z2H0r" id="5JXsuoWqsE3" role="mwGJk">
                <node concept="3M$PaV" id="5JXsuoWqsEo" role="1Z2MuG">
                  <ref role="3M$S_o" node="5JXsuoWqs74" resolve="actualParameter" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="1_o_bx" id="5JXsuoWqs70" role="1_o_by">
          <node concept="2OqwBi" id="5JXsuoWqsdy" role="1_o_bz">
            <node concept="1YBJjd" id="5JXsuoWqsbv" role="2Oq$k0">
              <ref role="1YBMHb" node="9V7Nft$SQ2" resolve="analyzerRunnerCreator" />
            </node>
            <node concept="3Tsc0h" id="5JXsuoWqslp" role="2OqNvi">
              <ref role="3TtcxE" to="bj1v:3tEjlbSOgR6" />
            </node>
          </node>
          <node concept="1_o_bG" id="5JXsuoWqs74" role="1_o_aQ">
            <property role="TrG5h" value="actualParameter" />
          </node>
        </node>
        <node concept="1_o_bx" id="5JXsuoWqspG" role="1_o_by">
          <node concept="2OqwBi" id="5JXsuoWqstu" role="1_o_bz">
            <node concept="37vLTw" id="5JXsuoWqsrr" role="2Oq$k0">
              <ref role="3cqZAo" node="3tEjlbSOxOs" resolve="analyzer" />
            </node>
            <node concept="3Tsc0h" id="5JXsuoWqsD3" role="2OqNvi">
              <ref role="3TtcxE" to="bj1v:3tEjlbSKIc3" />
            </node>
          </node>
          <node concept="1_o_bG" id="5JXsuoWqspI" role="1_o_aQ">
            <property role="TrG5h" value="parameter" />
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="9V7Nft$SQ2" role="1YuTPh">
      <property role="TrG5h" value="analyzerRunnerCreator" />
      <ref role="1YaFvo" to="bj1v:5hLfAui9Cm" resolve="AnalyzerRunnerCreator" />
    </node>
  </node>
  <node concept="1YbPZF" id="6ViLkrkrI9N">
    <property role="TrG5h" value="typeof_InstructionType" />
    <property role="3GE5qa" value="Instructions" />
    <node concept="3clFbS" id="6ViLkrkrI9O" role="18ibNy">
      <node concept="1Z5TYs" id="6ViLkrkrJW9" role="3cqZAp">
        <node concept="mw_s8" id="6ViLkrkrJWa" role="1ZfhK$">
          <node concept="1Z2H0r" id="6ViLkrkrJWb" role="mwGJk">
            <node concept="1YBJjd" id="6ViLkrkrJWc" role="1Z2MuG">
              <ref role="1YBMHb" node="6ViLkrkrI9P" resolve="isOperation" />
            </node>
          </node>
        </node>
        <node concept="mw_s8" id="6ViLkrkrJWe" role="1ZfhKB">
          <node concept="2c44tf" id="6ViLkrkrJWf" role="mwGJk">
            <node concept="3uibUv" id="6ViLkrkrJWk" role="2c44tc">
              <ref role="3uigEE" to="wyt6:~Boolean" resolve="Boolean" />
            </node>
          </node>
        </node>
      </node>
      <node concept="1Z5TYs" id="6ViLkrkrJWm" role="3cqZAp">
        <node concept="mw_s8" id="6ViLkrkrJWn" role="1ZfhK$">
          <node concept="1Z2H0r" id="6ViLkrkrJWo" role="mwGJk">
            <node concept="2OqwBi" id="6ViLkrkrJWu" role="1Z2MuG">
              <node concept="1YBJjd" id="6ViLkrkrJWp" role="2Oq$k0">
                <ref role="1YBMHb" node="6ViLkrkrI9P" resolve="isOperation" />
              </node>
              <node concept="3TrEf2" id="6ViLkrkrJWy" role="2OqNvi">
                <ref role="3Tt5mk" to="bj1v:6ViLkrkrJVL" />
              </node>
            </node>
          </node>
        </node>
        <node concept="mw_s8" id="6ViLkrkrJWq" role="1ZfhKB">
          <node concept="2c44tf" id="6ViLkrkrJWr" role="mwGJk">
            <node concept="3uibUv" id="6ViLkrkrJWt" role="2c44tc">
              <ref role="3uigEE" to="dau9:~Instruction" resolve="Instruction" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="6ViLkrkrI9P" role="1YuTPh">
      <property role="TrG5h" value="isOperation" />
      <ref role="1YaFvo" to="bj1v:6ViLkrkrEhy" resolve="IsOperation" />
    </node>
  </node>
  <node concept="1YbPZF" id="4ipeeu8Vzai">
    <property role="TrG5h" value="typeof_ConceptCondition" />
    <property role="3GE5qa" value="Rules" />
    <node concept="3clFbS" id="4ipeeu8Vzaj" role="18ibNy">
      <node concept="3cpWs8" id="4ipeeu8Vzal" role="3cqZAp">
        <node concept="3cpWsn" id="4ipeeu8Vzam" role="3cpWs9">
          <property role="TrG5h" value="conceptReference" />
          <node concept="3Tqbb2" id="4ipeeu8Vzan" role="1tU5fm">
            <ref role="ehGHo" to="bj1v:4ipeeu8UrBu" resolve="ConceptCondition" />
          </node>
          <node concept="1YBJjd" id="4ipeeu8Vza$" role="33vP2m">
            <ref role="1YBMHb" node="4ipeeu8Vzak" resolve="conceptCondition" />
          </node>
        </node>
      </node>
      <node concept="1Z5TYs" id="4ipeeu8Vzap" role="3cqZAp">
        <node concept="mw_s8" id="4ipeeu8Vzaq" role="1ZfhK$">
          <node concept="1Z2H0r" id="4ipeeu8Vzar" role="mwGJk">
            <node concept="37vLTw" id="3GM_nagTBvf" role="1Z2MuG">
              <ref role="3cqZAo" node="4ipeeu8Vzam" resolve="conceptReference" />
            </node>
          </node>
        </node>
        <node concept="mw_s8" id="4ipeeu8Vzat" role="1ZfhKB">
          <node concept="2c44tf" id="4ipeeu8Vzau" role="mwGJk">
            <node concept="3Tqbb2" id="4ipeeu8Vzav" role="2c44tc">
              <node concept="2c44tb" id="4ipeeu8Vzaw" role="lGtFl">
                <property role="2qtEX8" value="concept" />
                <property role="P3scX" value="7866978e-a0f0-4cc7-81bc-4d213d9375e1/1138055754698/1138405853777" />
                <node concept="2OqwBi" id="4ipeeu8Vzax" role="2c44t1">
                  <node concept="37vLTw" id="3GM_nagTwc4" role="2Oq$k0">
                    <ref role="3cqZAo" node="4ipeeu8Vzam" resolve="conceptReference" />
                  </node>
                  <node concept="3TrEf2" id="4ipeeu8Vza_" role="2OqNvi">
                    <ref role="3Tt5mk" to="bj1v:4ipeeu8Vyel" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="4ipeeu8Vzak" role="1YuTPh">
      <property role="TrG5h" value="conceptCondition" />
      <ref role="1YaFvo" to="bj1v:4ipeeu8UrBu" resolve="ConceptCondition" />
    </node>
  </node>
  <node concept="1YbPZF" id="4ipeeu8WK4s">
    <property role="TrG5h" value="typeof_ApplicableNodeReference" />
    <property role="3GE5qa" value="Rules" />
    <node concept="3clFbS" id="4ipeeu8WK4t" role="18ibNy">
      <node concept="1Z5TYs" id="4ipeeu8WK4z" role="3cqZAp">
        <node concept="mw_s8" id="4ipeeu8WK4B" role="1ZfhKB">
          <node concept="1Z2H0r" id="4ipeeu8WK4C" role="mwGJk">
            <node concept="2OqwBi" id="4ipeeu8WK4F" role="1Z2MuG">
              <node concept="1YBJjd" id="4ipeeu8WK4E" role="2Oq$k0">
                <ref role="1YBMHb" node="4ipeeu8WK4u" resolve="applicableNodeReference" />
              </node>
              <node concept="3TrEf2" id="4ipeeu8WK4J" role="2OqNvi">
                <ref role="3Tt5mk" to="bj1v:4ipeeu8WK4h" />
              </node>
            </node>
          </node>
        </node>
        <node concept="mw_s8" id="4ipeeu8WK4A" role="1ZfhK$">
          <node concept="1Z2H0r" id="4ipeeu8WK4w" role="mwGJk">
            <node concept="1YBJjd" id="4ipeeu8WK4y" role="1Z2MuG">
              <ref role="1YBMHb" node="4ipeeu8WK4u" resolve="applicableNodeReference" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="4ipeeu8WK4u" role="1YuTPh">
      <property role="TrG5h" value="applicableNodeReference" />
      <ref role="1YaFvo" to="bj1v:4ipeeu8WK4g" resolve="ApplicableNodeReference" />
    </node>
  </node>
  <node concept="18kY7G" id="hYjEYMI">
    <property role="TrG5h" value="check_ExtendedAnalyzersAreInExtendedLanguages" />
    <property role="3GE5qa" value="Rules" />
    <node concept="3clFbS" id="hYjEYMJ" role="18ibNy">
      <node concept="3cpWs8" id="5420fVrSLxA" role="3cqZAp">
        <node concept="3cpWsn" id="5420fVrSLxB" role="3cpWs9">
          <property role="TrG5h" value="module" />
          <node concept="3uibUv" id="5420fVrSLxv" role="1tU5fm">
            <ref role="3uigEE" to="lui2:~SModule" resolve="SModule" />
          </node>
          <node concept="2EnYce" id="fTB4jwI2KP" role="33vP2m">
            <node concept="2JrnkZ" id="5420fVrSLxD" role="2Oq$k0">
              <node concept="2OqwBi" id="5420fVrSLxE" role="2JrQYb">
                <node concept="1YBJjd" id="5420fVrSLxF" role="2Oq$k0">
                  <ref role="1YBMHb" node="hYjF4xm" resolve="rule" />
                </node>
                <node concept="I4A8Y" id="5420fVrSLxG" role="2OqNvi" />
              </node>
            </node>
            <node concept="liA8E" id="5420fVrSLxH" role="2OqNvi">
              <ref role="37wK5l" to="mhbf:~SModel.getModule():org.jetbrains.mps.openapi.module.SModule" resolve="getModule" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3clFbJ" id="5420fVrSOs1" role="3cqZAp">
        <node concept="3clFbS" id="5420fVrSOs3" role="3clFbx">
          <node concept="3cpWs6" id="5420fVrST2N" role="3cqZAp" />
        </node>
        <node concept="3fqX7Q" id="5420fVrSSKU" role="3clFbw">
          <node concept="2ZW3vV" id="5420fVrSSKV" role="3fr31v">
            <node concept="3uibUv" id="5420fVrSSKW" role="2ZW6by">
              <ref role="3uigEE" to="w1kc:~Language" resolve="Language" />
            </node>
            <node concept="37vLTw" id="5420fVrSSKX" role="2ZW6bz">
              <ref role="3cqZAo" node="5420fVrSLxB" resolve="module" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3cpWs8" id="hYjR2Jb" role="3cqZAp">
        <node concept="3cpWsn" id="hYjR2Jc" role="3cpWs9">
          <property role="TrG5h" value="ruleLanguage" />
          <node concept="3uibUv" id="hYjR2Jd" role="1tU5fm">
            <ref role="3uigEE" to="w1kc:~Language" resolve="Language" />
          </node>
          <node concept="1eOMI4" id="5420fVrSWph" role="33vP2m">
            <node concept="10QFUN" id="5420fVrSWpi" role="1eOMHV">
              <node concept="37vLTw" id="5420fVrSWpg" role="10QFUP">
                <ref role="3cqZAo" node="5420fVrSLxB" resolve="module" />
              </node>
              <node concept="3uibUv" id="5420fVrSWpf" role="10QFUM">
                <ref role="3uigEE" to="w1kc:~Language" resolve="Language" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3cpWs8" id="hYjRie0" role="3cqZAp">
        <node concept="3cpWsn" id="hYjRie1" role="3cpWs9">
          <property role="TrG5h" value="extendedLanguages" />
          <node concept="2hMVRd" id="2u_1aB3ByY8" role="1tU5fm">
            <node concept="3uibUv" id="2u_1aB3ByY9" role="2hN53Y">
              <ref role="3uigEE" to="w1kc:~Language" resolve="Language" />
            </node>
          </node>
          <node concept="2YIFZM" id="1e8VADAXv6j" role="33vP2m">
            <ref role="1Pybhc" to="lijz:~LanguageDependenciesManager" resolve="LanguageDependenciesManager" />
            <ref role="37wK5l" to="lijz:~LanguageDependenciesManager.getAllExtendedLanguages(jetbrains.mps.smodel.Language):java.util.Set" resolve="getAllExtendedLanguages" />
            <node concept="37vLTw" id="1e8VADAXv6l" role="37wK5m">
              <ref role="3cqZAo" node="hYjR2Jc" resolve="ruleLanguage" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3cpWs8" id="5420fVrT2gm" role="3cqZAp">
        <node concept="3cpWsn" id="5420fVrT2gp" role="3cpWs9">
          <property role="TrG5h" value="analyzer" />
          <node concept="3Tqbb2" id="5420fVrT2gk" role="1tU5fm">
            <ref role="ehGHo" to="bj1v:5JpT3MjX6u9" resolve="Analyzer" />
          </node>
          <node concept="2OqwBi" id="5420fVrT2uq" role="33vP2m">
            <node concept="1YBJjd" id="5420fVrT2sy" role="2Oq$k0">
              <ref role="1YBMHb" node="hYjF4xm" resolve="rule" />
            </node>
            <node concept="3TrEf2" id="7ePCaSBBw3g" role="2OqNvi">
              <ref role="3Tt5mk" to="bj1v:3_iNRJnrAh0" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3clFbJ" id="fTB4jwHZEQ" role="3cqZAp">
        <node concept="3clFbS" id="fTB4jwHZES" role="3clFbx">
          <node concept="3cpWs6" id="fTB4jwHZTs" role="3cqZAp" />
        </node>
        <node concept="3clFbC" id="fTB4jwHZSQ" role="3clFbw">
          <node concept="10Nm6u" id="fTB4jwHZTb" role="3uHU7w" />
          <node concept="37vLTw" id="fTB4jwHZQZ" role="3uHU7B">
            <ref role="3cqZAo" node="5420fVrT2gp" resolve="analyzer" />
          </node>
        </node>
      </node>
      <node concept="3cpWs8" id="5420fVrT3TO" role="3cqZAp">
        <node concept="3cpWsn" id="5420fVrT3TP" role="3cpWs9">
          <property role="TrG5h" value="analyzerModule" />
          <node concept="3uibUv" id="5420fVrT3TQ" role="1tU5fm">
            <ref role="3uigEE" to="lui2:~SModule" resolve="SModule" />
          </node>
          <node concept="2EnYce" id="fTB4jwI40g" role="33vP2m">
            <node concept="2JrnkZ" id="5420fVrT3TS" role="2Oq$k0">
              <node concept="2OqwBi" id="5420fVrT3TT" role="2JrQYb">
                <node concept="37vLTw" id="5420fVrT4kN" role="2Oq$k0">
                  <ref role="3cqZAo" node="5420fVrT2gp" resolve="analyzer" />
                </node>
                <node concept="I4A8Y" id="5420fVrT3TV" role="2OqNvi" />
              </node>
            </node>
            <node concept="liA8E" id="5420fVrT3TW" role="2OqNvi">
              <ref role="37wK5l" to="mhbf:~SModel.getModule():org.jetbrains.mps.openapi.module.SModule" resolve="getModule" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3clFbJ" id="5420fVrT3TX" role="3cqZAp">
        <node concept="3clFbS" id="5420fVrT3TY" role="3clFbx">
          <node concept="3cpWs6" id="5420fVrT3TZ" role="3cqZAp" />
        </node>
        <node concept="3fqX7Q" id="5420fVrT3U1" role="3clFbw">
          <node concept="2ZW3vV" id="5420fVrT3U2" role="3fr31v">
            <node concept="3uibUv" id="5420fVrT3U3" role="2ZW6by">
              <ref role="3uigEE" to="w1kc:~Language" resolve="Language" />
            </node>
            <node concept="37vLTw" id="5420fVrT3U4" role="2ZW6bz">
              <ref role="3cqZAo" node="5420fVrT3TP" resolve="analyzerModule" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3cpWs8" id="5420fVrT3U8" role="3cqZAp">
        <node concept="3cpWsn" id="5420fVrT3U9" role="3cpWs9">
          <property role="TrG5h" value="analyzerLanguage" />
          <node concept="3uibUv" id="5420fVrT3Ua" role="1tU5fm">
            <ref role="3uigEE" to="w1kc:~Language" resolve="Language" />
          </node>
          <node concept="1eOMI4" id="5420fVrT3Ub" role="33vP2m">
            <node concept="10QFUN" id="5420fVrT3Uc" role="1eOMHV">
              <node concept="37vLTw" id="5420fVrT3Ud" role="10QFUP">
                <ref role="3cqZAo" node="5420fVrT3TP" resolve="analyzerModule" />
              </node>
              <node concept="3uibUv" id="5420fVrT3Ue" role="10QFUM">
                <ref role="3uigEE" to="w1kc:~Language" resolve="Language" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3clFbJ" id="hYjRJRO" role="3cqZAp">
        <node concept="1Wc70l" id="hYjRQgr" role="3clFbw">
          <node concept="3y3z36" id="hYjRS1x" role="3uHU7B">
            <node concept="37vLTw" id="3GM_nagT$f7" role="3uHU7w">
              <ref role="3cqZAo" node="hYjR2Jc" resolve="ruleLanguage" />
            </node>
            <node concept="37vLTw" id="5420fVrT4EN" role="3uHU7B">
              <ref role="3cqZAo" node="5420fVrT3U9" resolve="analyzerLanguage" />
            </node>
          </node>
          <node concept="3fqX7Q" id="hYjRNVk" role="3uHU7w">
            <node concept="2OqwBi" id="i05NXB4" role="3fr31v">
              <node concept="37vLTw" id="3GM_nagT_E6" role="2Oq$k0">
                <ref role="3cqZAo" node="hYjRie1" resolve="extendedLanguages" />
              </node>
              <node concept="3JPx81" id="i05NXZC" role="2OqNvi">
                <node concept="37vLTw" id="7ePCaSBBw$z" role="25WWJ7">
                  <ref role="3cqZAo" node="5420fVrT3U9" resolve="analyzerLanguage" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbS" id="hYjRJRP" role="3clFbx">
          <node concept="2MkqsV" id="hYjRU9R" role="3cqZAp">
            <node concept="3Cnw8n" id="5420fVrTaBC" role="2OEOjU">
              <ref role="QpYPw" to="tpcj:2BhfHtuWIb6" resolve="AddExtendedLanguage" />
              <node concept="3CnSsL" id="5420fVrTaKZ" role="3Coj4f">
                <ref role="QkamJ" to="tpcj:2BhfHtuWIbq" resolve="extLang" />
                <node concept="37vLTw" id="7ePCaSBCsgv" role="3CoRuB">
                  <ref role="3cqZAo" node="5420fVrT3U9" resolve="analyzerLanguage" />
                </node>
              </node>
              <node concept="3CnSsL" id="5420fVrTb4p" role="3Coj4f">
                <ref role="QkamJ" to="tpcj:2BhfHtuWIbx" resolve="lang" />
                <node concept="37vLTw" id="7ePCaSBCskt" role="3CoRuB">
                  <ref role="3cqZAo" node="hYjR2Jc" resolve="ruleLanguage" />
                </node>
              </node>
            </node>
            <node concept="3cpWs3" id="hYjSzt8" role="2MkJ7o">
              <node concept="2OqwBi" id="hYjS_2y" role="3uHU7w">
                <node concept="37vLTw" id="3GM_nagTtER" role="2Oq$k0">
                  <ref role="3cqZAo" node="hYjR2Jc" resolve="ruleLanguage" />
                </node>
                <node concept="liA8E" id="4WpFdPuvzu_" role="2OqNvi">
                  <ref role="37wK5l" to="z1c3:~AbstractModule.getModuleName():java.lang.String" resolve="getModuleName" />
                </node>
              </node>
              <node concept="3cpWs3" id="hYjSaT1" role="3uHU7B">
                <node concept="3cpWs3" id="hYjSWi0" role="3uHU7B">
                  <node concept="2OqwBi" id="hYjSXi$" role="3uHU7w">
                    <node concept="37vLTw" id="5420fVrT6uq" role="2Oq$k0">
                      <ref role="3cqZAo" node="5420fVrT2gp" resolve="analyzer" />
                    </node>
                    <node concept="3TrcHB" id="hYjSX_o" role="2OqNvi">
                      <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                    </node>
                  </node>
                  <node concept="3cpWs3" id="hYjSRYd" role="3uHU7B">
                    <node concept="3cpWs3" id="hYjS450" role="3uHU7B">
                      <node concept="Xl_RD" id="hYjRUzZ" role="3uHU7B">
                        <property role="Xl_RC" value="language " />
                      </node>
                      <node concept="2OqwBi" id="hYjS5Fq" role="3uHU7w">
                        <node concept="37vLTw" id="5420fVrT6mj" role="2Oq$k0">
                          <ref role="3cqZAo" node="5420fVrT3U9" resolve="analyzerLanguage" />
                        </node>
                        <node concept="liA8E" id="4WpFdPuvzuB" role="2OqNvi">
                          <ref role="37wK5l" to="z1c3:~AbstractModule.getModuleName():java.lang.String" resolve="getModuleName" />
                        </node>
                      </node>
                    </node>
                    <node concept="Xl_RD" id="hYjSSdx" role="3uHU7w">
                      <property role="Xl_RC" value=" of analyzer " />
                    </node>
                  </node>
                </node>
                <node concept="Xl_RD" id="hYjScx7" role="3uHU7w">
                  <property role="Xl_RC" value=" is not extended by " />
                </node>
              </node>
            </node>
            <node concept="1YBJjd" id="hYjSA9g" role="2OEOjV">
              <ref role="1YBMHb" node="hYjF4xm" resolve="rule" />
            </node>
            <node concept="2ODE4t" id="1_pmkPdyp_X" role="2OEWyd">
              <ref role="2ODJFN" to="tpck:h0TrG11" resolve="name" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="hYjF4xm" role="1YuTPh">
      <property role="TrG5h" value="rule" />
      <ref role="1YaFvo" to="bj1v:nUEAIXlVr8" resolve="Rule" />
    </node>
  </node>
  <node concept="1YbPZF" id="7UkgJtnqqHl">
    <property role="TrG5h" value="typeof_AnalyzerFunParameterStateValues" />
    <property role="3GE5qa" value="Analyzer.AnalyzerFunctions" />
    <node concept="3clFbS" id="7UkgJtnqqHm" role="18ibNy">
      <node concept="3cpWs8" id="7UkgJtnqqS7" role="3cqZAp">
        <node concept="3cpWsn" id="7UkgJtnqqSa" role="3cpWs9">
          <property role="TrG5h" value="type" />
          <node concept="3Tqbb2" id="7UkgJtnqqS5" role="1tU5fm">
            <ref role="ehGHo" to="tpee:fz3vP1H" resolve="Type" />
          </node>
          <node concept="2OqwBi" id="4bvk9q_P99Z" role="33vP2m">
            <node concept="2OqwBi" id="7UkgJtnqrb3" role="2Oq$k0">
              <node concept="2OqwBi" id="7UkgJtnqqYo" role="2Oq$k0">
                <node concept="1YBJjd" id="7UkgJtnqqV3" role="2Oq$k0">
                  <ref role="1YBMHb" node="7UkgJtnqqHo" resolve="values" />
                </node>
                <node concept="2Xjw5R" id="7UkgJtnqr6$" role="2OqNvi">
                  <node concept="1xMEDy" id="7UkgJtnqr6A" role="1xVPHs">
                    <node concept="chp4Y" id="7UkgJtnqr76" role="ri$Ld">
                      <ref role="cht4Q" to="bj1v:5JpT3MjX6u9" resolve="Analyzer" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3TrEf2" id="7UkgJtnqrj$" role="2OqNvi">
                <ref role="3Tt5mk" to="bj1v:7XrupC0LhIV" />
              </node>
            </node>
            <node concept="2qgKlT" id="4bvk9q_P9hu" role="2OqNvi">
              <ref role="37wK5l" to="tpek:hEwIzNC" resolve="getBoxedType" />
            </node>
          </node>
        </node>
      </node>
      <node concept="1Z5TYs" id="7UkgJtnqqHs" role="3cqZAp">
        <node concept="mw_s8" id="7UkgJtnqqHt" role="1ZfhK$">
          <node concept="1Z2H0r" id="7UkgJtnqqHu" role="mwGJk">
            <node concept="1YBJjd" id="7UkgJtnqqJV" role="1Z2MuG">
              <ref role="1YBMHb" node="7UkgJtnqqHo" resolve="values" />
            </node>
          </node>
        </node>
        <node concept="mw_s8" id="7UkgJtnqrn$" role="1ZfhKB">
          <node concept="2c44tf" id="7UkgJtnqrnw" role="mwGJk">
            <node concept="3uibUv" id="7UkgJtnqror" role="2c44tc">
              <ref role="3uigEE" to="33ny:~Map" resolve="Map" />
              <node concept="3uibUv" id="7UkgJtnqstQ" role="11_B2D">
                <ref role="3uigEE" to="1fjm:~ProgramState" resolve="ProgramState" />
              </node>
              <node concept="3uibUv" id="7UkgJtnqsv3" role="11_B2D">
                <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
                <node concept="2c44te" id="7UkgJtnqsvJ" role="lGtFl">
                  <node concept="37vLTw" id="7UkgJtnqsvZ" role="2c44t1">
                    <ref role="3cqZAo" node="7UkgJtnqqSa" resolve="type" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="7UkgJtnqqHo" role="1YuTPh">
      <property role="TrG5h" value="values" />
      <ref role="1YaFvo" to="bj1v:7UkgJtnqqHe" resolve="AnalyzerFunParameterStateValues" />
    </node>
  </node>
</model>

