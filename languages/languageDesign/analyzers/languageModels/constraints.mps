<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:73c9a355-2bf0-4466-8a7d-8b8d8a945cd4(jetbrains.mps.lang.dataFlow.analyzers.constraints)">
  <persistence version="9" />
  <languages>
    <use id="83888646-71ce-4f1c-9c53-c54016f6ad4f" name="jetbrains.mps.baseLanguage.collections" version="0" />
    <use id="3f4bc5f5-c6c1-4a28-8b10-c83066ffa4a1" name="jetbrains.mps.lang.constraints" version="0" />
    <use id="13744753-c81f-424a-9c1b-cf8943bf4e86" name="jetbrains.mps.lang.sharedConcepts" version="0" />
    <use id="7a5dda62-9140-4668-ab76-d5ed1746f2b2" name="jetbrains.mps.lang.typesystem" version="0" />
    <use id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel" version="2" />
    <use id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage" version="4" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports>
    <import index="bj1v" ref="r:8b09f5e2-b403-4747-aaa3-eac5acb1f753(jetbrains.mps.lang.dataFlow.analyzers.structure)" />
    <import index="tpee" ref="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" />
    <import index="w1kc" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel(MPS.Core/)" />
    <import index="6xgk" ref="r:6e9ad488-5df2-49e4-8c01-8a7f3812adf7(jetbrains.mps.lang.scopes.runtime)" />
    <import index="tpcg" ref="r:00000000-0000-4000-0000-011c8959028c(jetbrains.mps.lang.structure.constraints)" />
  </imports>
  <registry>
    <language id="13744753-c81f-424a-9c1b-cf8943bf4e86" name="jetbrains.mps.lang.sharedConcepts">
      <concept id="1161622665029" name="jetbrains.mps.lang.sharedConcepts.structure.ConceptFunctionParameter_model" flags="nn" index="1Q6Npb" />
    </language>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1080223426719" name="jetbrains.mps.baseLanguage.structure.OrExpression" flags="nn" index="22lmx$" />
      <concept id="1202948039474" name="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" flags="nn" index="liA8E" />
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
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
      <concept id="1081236700937" name="jetbrains.mps.baseLanguage.structure.StaticMethodCall" flags="nn" index="2YIFZM">
        <reference id="1144433194310" name="classConcept" index="1Pybhc" />
      </concept>
      <concept id="1070534058343" name="jetbrains.mps.baseLanguage.structure.NullLiteral" flags="nn" index="10Nm6u" />
      <concept id="1068431474542" name="jetbrains.mps.baseLanguage.structure.VariableDeclaration" flags="ng" index="33uBYm">
        <child id="1068431790190" name="initializer" index="33vP2m" />
      </concept>
      <concept id="1068498886296" name="jetbrains.mps.baseLanguage.structure.VariableReference" flags="nn" index="37vLTw">
        <reference id="1068581517664" name="variableDeclaration" index="3cqZAo" />
      </concept>
      <concept id="4972933694980447171" name="jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration" flags="ng" index="19Szcq">
        <child id="5680397130376446158" name="type" index="1tU5fm" />
      </concept>
      <concept id="1068580123155" name="jetbrains.mps.baseLanguage.structure.ExpressionStatement" flags="nn" index="3clFbF">
        <child id="1068580123156" name="expression" index="3clFbG" />
      </concept>
      <concept id="1068580123159" name="jetbrains.mps.baseLanguage.structure.IfStatement" flags="nn" index="3clFbJ">
        <child id="1068580123160" name="condition" index="3clFbw" />
        <child id="1068580123161" name="ifTrue" index="3clFbx" />
      </concept>
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
      <concept id="1068581242878" name="jetbrains.mps.baseLanguage.structure.ReturnStatement" flags="nn" index="3cpWs6">
        <child id="1068581517676" name="expression" index="3cqZAk" />
      </concept>
      <concept id="1068581242864" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" flags="nn" index="3cpWs8">
        <child id="1068581242865" name="localVariableDeclaration" index="3cpWs9" />
      </concept>
      <concept id="1068581242863" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" flags="nr" index="3cpWsn" />
      <concept id="1204053956946" name="jetbrains.mps.baseLanguage.structure.IMethodCall" flags="ng" index="1ndlxa">
        <reference id="1068499141037" name="baseMethodDeclaration" index="37wK5l" />
        <child id="1068499141038" name="actualArgument" index="37wK5m" />
      </concept>
      <concept id="1212685548494" name="jetbrains.mps.baseLanguage.structure.ClassCreator" flags="nn" index="1pGfFk" />
      <concept id="1081773326031" name="jetbrains.mps.baseLanguage.structure.BinaryOperation" flags="nn" index="3uHJSO">
        <child id="1081773367579" name="rightExpression" index="3uHU7w" />
        <child id="1081773367580" name="leftExpression" index="3uHU7B" />
      </concept>
      <concept id="1073239437375" name="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" flags="nn" index="3y3z36" />
      <concept id="1080120340718" name="jetbrains.mps.baseLanguage.structure.AndExpression" flags="nn" index="1Wc70l" />
    </language>
    <language id="3f4bc5f5-c6c1-4a28-8b10-c83066ffa4a1" name="jetbrains.mps.lang.constraints">
      <concept id="1148934636683" name="jetbrains.mps.lang.constraints.structure.ConceptParameter_ReferentSearchScope_enclosingNode" flags="nn" index="21POm0" />
      <concept id="1202989531578" name="jetbrains.mps.lang.constraints.structure.ConstraintFunction_CanBeAChild" flags="in" index="nKS2y" />
      <concept id="1202989658459" name="jetbrains.mps.lang.constraints.structure.ConstraintFunctionParameter_parentNode" flags="nn" index="nLn13" />
      <concept id="8966504967485224688" name="jetbrains.mps.lang.constraints.structure.ConstraintFunctionParameter_contextNode" flags="nn" index="2rP1CM" />
      <concept id="1227084988347" name="jetbrains.mps.lang.constraints.structure.ConstraintFunction_CanBeARoot" flags="in" index="2NXJUA" />
      <concept id="5676632058862809931" name="jetbrains.mps.lang.constraints.structure.ConstraintFunction_ReferentSearchScope_Scope" flags="in" index="13QW63" />
      <concept id="1213093968558" name="jetbrains.mps.lang.constraints.structure.ConceptConstraints" flags="ng" index="1M2fIO">
        <reference id="1213093996982" name="concept" index="1M2myG" />
        <child id="1227085062429" name="canBeRoot" index="2NY200" />
        <child id="1213100494875" name="referent" index="1Mr941" />
        <child id="1213106463729" name="canBeChild" index="1MLUbF" />
      </concept>
      <concept id="1148684180339" name="jetbrains.mps.lang.constraints.structure.ConstraintFunction_ReferentSearchScope_Factory" flags="in" index="1MUpDS" />
      <concept id="1148687176410" name="jetbrains.mps.lang.constraints.structure.NodeReferentConstraint" flags="ng" index="1N5Pfh">
        <reference id="1148687202698" name="applicableLink" index="1N5Vy1" />
        <child id="1148687345559" name="searchScopeFactory" index="1N6uqs" />
      </concept>
    </language>
    <language id="7a5dda62-9140-4668-ab76-d5ed1746f2b2" name="jetbrains.mps.lang.typesystem">
      <concept id="1176544042499" name="jetbrains.mps.lang.typesystem.structure.Node_TypeOperation" flags="nn" index="3JvlWi" />
      <concept id="1178870617262" name="jetbrains.mps.lang.typesystem.structure.CoerceExpression" flags="nn" index="1UaxmW">
        <child id="1178870894644" name="pattern" index="1Ub_4A" />
        <child id="1178870894645" name="nodeToCoerce" index="1Ub_4B" />
      </concept>
      <concept id="1174642788531" name="jetbrains.mps.lang.typesystem.structure.ConceptReference" flags="ig" index="1YaCAy">
        <reference id="1174642800329" name="concept" index="1YaFvo" />
      </concept>
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1177026924588" name="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" flags="nn" index="chp4Y">
        <reference id="1177026940964" name="conceptDeclaration" index="cht4Q" />
      </concept>
      <concept id="1138411891628" name="jetbrains.mps.lang.smodel.structure.SNodeOperation" flags="nn" index="eCIE_">
        <child id="1144104376918" name="parameter" index="1xVPHs" />
      </concept>
      <concept id="1145383075378" name="jetbrains.mps.lang.smodel.structure.SNodeListType" flags="in" index="2I9FWS">
        <reference id="1145383142433" name="elementConcept" index="2I9WkF" />
      </concept>
      <concept id="1145404486709" name="jetbrains.mps.lang.smodel.structure.SemanticDowncastExpression" flags="nn" index="2JrnkZ">
        <child id="1145404616321" name="leftExpression" index="2JrQYb" />
      </concept>
      <concept id="1145567426890" name="jetbrains.mps.lang.smodel.structure.SNodeListCreator" flags="nn" index="2T8Vx0">
        <child id="1145567471833" name="createdType" index="2T96Bj" />
      </concept>
      <concept id="1171407110247" name="jetbrains.mps.lang.smodel.structure.Node_GetAncestorOperation" flags="nn" index="2Xjw5R" />
      <concept id="3562215692195599741" name="jetbrains.mps.lang.smodel.structure.SLinkImplicitSelect" flags="nn" index="13MTOL">
        <reference id="3562215692195600259" name="link" index="13MTZf" />
      </concept>
      <concept id="2644386474300074836" name="jetbrains.mps.lang.smodel.structure.ConceptIdRefExpression" flags="nn" index="35c_gC">
        <reference id="2644386474300074837" name="conceptDeclaration" index="35c_gD" />
      </concept>
      <concept id="1176109685393" name="jetbrains.mps.lang.smodel.structure.Model_RootsIncludingImportedOperation" flags="nn" index="3lApI0">
        <reference id="1176109685394" name="concept" index="3lApI3" />
      </concept>
      <concept id="1139621453865" name="jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation" flags="nn" index="1mIQ4w">
        <child id="1177027386292" name="conceptArgument" index="cj9EA" />
      </concept>
      <concept id="1144100932627" name="jetbrains.mps.lang.smodel.structure.OperationParm_Inclusion" flags="ng" index="1xIGOp" />
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
      <concept id="709746936026466394" name="jetbrains.mps.lang.core.structure.ChildAttribute" flags="ng" index="3VBwX9">
        <property id="709746936026609031" name="linkId" index="3V$3ak" />
        <property id="709746936026609029" name="linkRole" index="3V$3am" />
      </concept>
      <concept id="4452961908202556907" name="jetbrains.mps.lang.core.structure.BaseCommentAttribute" flags="ng" index="1X3_iC">
        <child id="3078666699043039389" name="commentedNode" index="8Wnug" />
      </concept>
    </language>
    <language id="83888646-71ce-4f1c-9c53-c54016f6ad4f" name="jetbrains.mps.baseLanguage.collections">
      <concept id="1176906603202" name="jetbrains.mps.baseLanguage.collections.structure.BinaryOperation" flags="nn" index="56pJg">
        <child id="1176906787974" name="rightExpression" index="576Qk" />
      </concept>
      <concept id="540871147943773365" name="jetbrains.mps.baseLanguage.collections.structure.SingleArgumentSequenceOperation" flags="nn" index="25WWJ4">
        <child id="540871147943773366" name="argument" index="25WWJ7" />
      </concept>
      <concept id="1160612413312" name="jetbrains.mps.baseLanguage.collections.structure.AddElementOperation" flags="nn" index="TSZUe" />
      <concept id="1160666733551" name="jetbrains.mps.baseLanguage.collections.structure.AddAllElementsOperation" flags="nn" index="X8dFx" />
      <concept id="1180964022718" name="jetbrains.mps.baseLanguage.collections.structure.ConcatOperation" flags="nn" index="3QWeyG" />
    </language>
  </registry>
  <node concept="1M2fIO" id="3E8vDQwHfOY">
    <property role="3GE5qa" value="Instructions" />
    <ref role="1M2myG" to="bj1v:3E8vDQwHcVs" resolve="InstructionReference" />
    <node concept="1N5Pfh" id="6pR8a$lPE8i" role="1Mr941">
      <ref role="1N5Vy1" to="bj1v:3E8vDQwHcV_" />
      <node concept="1MUpDS" id="6pR8a$lPE8j" role="1N6uqs">
        <node concept="3clFbS" id="6pR8a$lPE8k" role="2VODD2">
          <node concept="3cpWs8" id="6pR8a$lPE8l" role="3cqZAp">
            <node concept="3cpWsn" id="6pR8a$lPE8m" role="3cpWs9">
              <property role="TrG5h" value="result" />
              <node concept="2I9FWS" id="6pR8a$lPE8n" role="1tU5fm">
                <ref role="2I9WkF" to="bj1v:5JpT3MjX6ua" resolve="Instruction" />
              </node>
              <node concept="2ShNRf" id="6pR8a$lPE8o" role="33vP2m">
                <node concept="2T8Vx0" id="6pR8a$lPE8p" role="2ShVmc">
                  <node concept="2I9FWS" id="6pR8a$lPE8q" role="2T96Bj">
                    <ref role="2I9WkF" to="bj1v:5JpT3MjX6ua" resolve="Instruction" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3cpWs8" id="7fxZEB1xvkZ" role="3cqZAp">
            <node concept="3cpWsn" id="7fxZEB1xvl0" role="3cpWs9">
              <property role="TrG5h" value="analyzer" />
              <node concept="3Tqbb2" id="7fxZEB1xvkT" role="1tU5fm">
                <ref role="ehGHo" to="bj1v:5JpT3MjX6u9" resolve="Analyzer" />
              </node>
              <node concept="2OqwBi" id="7fxZEB1xvl1" role="33vP2m">
                <node concept="2OqwBi" id="7fxZEB1xvl2" role="2Oq$k0">
                  <node concept="2rP1CM" id="7fxZEB1xvl3" role="2Oq$k0" />
                  <node concept="2Xjw5R" id="7fxZEB1xvl4" role="2OqNvi">
                    <node concept="1xMEDy" id="7fxZEB1xvl5" role="1xVPHs">
                      <node concept="chp4Y" id="7fxZEB1xvl6" role="ri$Ld">
                        <ref role="cht4Q" to="bj1v:nUEAIXlVr8" resolve="Rule" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3TrEf2" id="7fxZEB1xvl7" role="2OqNvi">
                  <ref role="3Tt5mk" to="bj1v:3_iNRJnrAh0" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbF" id="6pR8a$lPE8v" role="3cqZAp">
            <node concept="2OqwBi" id="6pR8a$lPE8w" role="3clFbG">
              <node concept="37vLTw" id="3GM_nagTwHC" role="2Oq$k0">
                <ref role="3cqZAo" node="6pR8a$lPE8m" resolve="result" />
              </node>
              <node concept="X8dFx" id="6pR8a$lPE8y" role="2OqNvi">
                <node concept="2OqwBi" id="7fxZEB1xyLO" role="25WWJ7">
                  <node concept="2OqwBi" id="7fxZEB1xuOP" role="2Oq$k0">
                    <node concept="37vLTw" id="7fxZEB1xvl8" role="2Oq$k0">
                      <ref role="3cqZAo" node="7fxZEB1xvl0" resolve="analyzer" />
                    </node>
                    <node concept="3Tsc0h" id="7fxZEB1xxX4" role="2OqNvi">
                      <ref role="3TtcxE" to="bj1v:2S_HFuhAG4S" />
                    </node>
                  </node>
                  <node concept="3QWeyG" id="7fxZEB1x$qy" role="2OqNvi">
                    <node concept="2OqwBi" id="7fxZEB1xE$R" role="576Qk">
                      <node concept="2OqwBi" id="7fxZEB1xBRI" role="2Oq$k0">
                        <node concept="2OqwBi" id="7fxZEB1xAaE" role="2Oq$k0">
                          <node concept="37vLTw" id="7fxZEB1x_d_" role="2Oq$k0">
                            <ref role="3cqZAo" node="7fxZEB1xvl0" resolve="analyzer" />
                          </node>
                          <node concept="3Tsc0h" id="7fxZEB1xAy$" role="2OqNvi">
                            <ref role="3TtcxE" to="bj1v:7fxZEB1sZw4" />
                          </node>
                        </node>
                        <node concept="13MTOL" id="7fxZEB1xD4v" role="2OqNvi">
                          <ref role="13MTZf" to="bj1v:7fxZEB1sSup" />
                        </node>
                      </node>
                      <node concept="13MTOL" id="7fxZEB1xFzW" role="2OqNvi">
                        <ref role="13MTZf" to="bj1v:7fxZEB1sH3D" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbF" id="6pR8a$lPE8E" role="3cqZAp">
            <node concept="37vLTw" id="3GM_nagT_Ik" role="3clFbG">
              <ref role="3cqZAo" node="6pR8a$lPE8m" resolve="result" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="1M2fIO" id="5hLfAui9Cz">
    <property role="3GE5qa" value="Analyzer" />
    <ref role="1M2myG" to="bj1v:5hLfAui9Ch" resolve="AnalyzerRunnerAnalyzeOperation" />
    <node concept="nKS2y" id="5hLfAui9C$" role="1MLUbF">
      <node concept="3clFbS" id="5hLfAui9C_" role="2VODD2">
        <node concept="3clFbF" id="5hLfAui9CA" role="3cqZAp">
          <node concept="1Wc70l" id="5hLfAui9CB" role="3clFbG">
            <node concept="2OqwBi" id="5hLfAui9CC" role="3uHU7B">
              <node concept="nLn13" id="5hLfAui9CD" role="2Oq$k0" />
              <node concept="1mIQ4w" id="5hLfAui9CE" role="2OqNvi">
                <node concept="chp4Y" id="5hLfAui9CF" role="cj9EA">
                  <ref role="cht4Q" to="tpee:hqOqwz4" resolve="DotExpression" />
                </node>
              </node>
            </node>
            <node concept="3y3z36" id="5hLfAui9CG" role="3uHU7w">
              <node concept="10Nm6u" id="5hLfAui9CH" role="3uHU7w" />
              <node concept="1UaxmW" id="5hLfAui9CI" role="3uHU7B">
                <node concept="1YaCAy" id="5hLfAui9CJ" role="1Ub_4A">
                  <property role="TrG5h" value="analyzerRunnerType" />
                  <ref role="1YaFvo" to="bj1v:1LzFTOJeBWz" resolve="AnalyzerRunnerType" />
                </node>
                <node concept="2OqwBi" id="5hLfAui9CK" role="1Ub_4B">
                  <node concept="2OqwBi" id="5hLfAui9CL" role="2Oq$k0">
                    <node concept="1PxgMI" id="5hLfAui9CM" role="2Oq$k0">
                      <ref role="1PxNhF" to="tpee:hqOqwz4" resolve="DotExpression" />
                      <node concept="nLn13" id="5hLfAui9CN" role="1PxMeX" />
                    </node>
                    <node concept="3TrEf2" id="5hLfAui9CO" role="2OqNvi">
                      <ref role="3Tt5mk" to="tpee:hqOq$gm" />
                    </node>
                  </node>
                  <node concept="3JvlWi" id="5hLfAui9CP" role="2OqNvi" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="1M2fIO" id="9V7Nft$K_t">
    <property role="3GE5qa" value="Analyzer" />
    <ref role="1M2myG" to="bj1v:5hLfAui9Cm" resolve="AnalyzerRunnerCreator" />
    <node concept="1N5Pfh" id="9V7Nft$K_u" role="1Mr941">
      <ref role="1N5Vy1" to="bj1v:5hLfAui9Cn" />
      <node concept="1MUpDS" id="9V7Nft$K_v" role="1N6uqs">
        <node concept="3clFbS" id="9V7Nft$K_w" role="2VODD2">
          <node concept="3clFbF" id="9V7Nft$K_x" role="3cqZAp">
            <node concept="2OqwBi" id="9V7Nft$K_z" role="3clFbG">
              <node concept="1Q6Npb" id="9V7Nft$K_y" role="2Oq$k0" />
              <node concept="3lApI0" id="9V7Nft$K_B" role="2OqNvi">
                <ref role="3lApI3" to="bj1v:5JpT3MjX6u9" resolve="Analyzer" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="1M2fIO" id="6ViLkrkrH8i">
    <property role="3GE5qa" value="Instructions" />
    <ref role="1M2myG" to="bj1v:6ViLkrkrEhy" resolve="IsOperation" />
    <node concept="1N5Pfh" id="6ViLkrkrHiY" role="1Mr941">
      <ref role="1N5Vy1" to="bj1v:6ViLkrkrEhz" />
      <node concept="1MUpDS" id="6ViLkrkrHiZ" role="1N6uqs">
        <node concept="3clFbS" id="6ViLkrkrHj0" role="2VODD2">
          <node concept="3cpWs8" id="7fxZEB1x8yD" role="3cqZAp">
            <node concept="3cpWsn" id="7fxZEB1x8yE" role="3cpWs9">
              <property role="TrG5h" value="analyzer" />
              <node concept="3Tqbb2" id="7fxZEB1x8yC" role="1tU5fm">
                <ref role="ehGHo" to="bj1v:5JpT3MjX6u9" resolve="Analyzer" />
              </node>
              <node concept="2OqwBi" id="7fxZEB1x8yF" role="33vP2m">
                <node concept="21POm0" id="7fxZEB1x8yG" role="2Oq$k0" />
                <node concept="2Xjw5R" id="7fxZEB1x8yH" role="2OqNvi">
                  <node concept="1xMEDy" id="7fxZEB1x8yI" role="1xVPHs">
                    <node concept="chp4Y" id="7fxZEB1x8yJ" role="ri$Ld">
                      <ref role="cht4Q" to="bj1v:5JpT3MjX6u9" resolve="Analyzer" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbF" id="6ViLkrkrHj1" role="3cqZAp">
            <node concept="2OqwBi" id="7fxZEB1x7B2" role="3clFbG">
              <node concept="2OqwBi" id="6ViLkrkrHjc" role="2Oq$k0">
                <node concept="37vLTw" id="7fxZEB1x8yK" role="2Oq$k0">
                  <ref role="3cqZAo" node="7fxZEB1x8yE" resolve="analyzer" />
                </node>
                <node concept="3Tsc0h" id="6ViLkrkrHjg" role="2OqNvi">
                  <ref role="3TtcxE" to="bj1v:2S_HFuhAG4S" />
                </node>
              </node>
              <node concept="3QWeyG" id="7fxZEB1x8uN" role="2OqNvi">
                <node concept="2OqwBi" id="7fxZEB1xaRy" role="576Qk">
                  <node concept="2OqwBi" id="7fxZEB1x9j5" role="2Oq$k0">
                    <node concept="2OqwBi" id="7fxZEB1x8JZ" role="2Oq$k0">
                      <node concept="37vLTw" id="7fxZEB1x8G5" role="2Oq$k0">
                        <ref role="3cqZAo" node="7fxZEB1x8yE" resolve="analyzer" />
                      </node>
                      <node concept="3Tsc0h" id="7fxZEB1x8R2" role="2OqNvi">
                        <ref role="3TtcxE" to="bj1v:7fxZEB1sZw4" />
                      </node>
                    </node>
                    <node concept="13MTOL" id="7fxZEB1xa3S" role="2OqNvi">
                      <ref role="13MTZf" to="bj1v:7fxZEB1sSup" />
                    </node>
                  </node>
                  <node concept="13MTOL" id="7fxZEB1xaYR" role="2OqNvi">
                    <ref role="13MTZf" to="bj1v:7fxZEB1sH3D" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="nKS2y" id="6ViLkrkrH8j" role="1MLUbF">
      <node concept="3clFbS" id="6ViLkrkrH8k" role="2VODD2">
        <node concept="3clFbF" id="6ViLkrkrHiI" role="3cqZAp">
          <node concept="3y3z36" id="6ViLkrkrHiU" role="3clFbG">
            <node concept="10Nm6u" id="6ViLkrkrHiX" role="3uHU7w" />
            <node concept="2OqwBi" id="6ViLkrkrHiK" role="3uHU7B">
              <node concept="nLn13" id="6ViLkrkrHiJ" role="2Oq$k0" />
              <node concept="2Xjw5R" id="6ViLkrkrHiO" role="2OqNvi">
                <node concept="1xMEDy" id="6ViLkrkrHiP" role="1xVPHs">
                  <node concept="chp4Y" id="6ViLkrkrHiT" role="ri$Ld">
                    <ref role="cht4Q" to="bj1v:5JpT3MjX6u9" resolve="Analyzer" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="1M2fIO" id="4ipeeu8Vz9t">
    <property role="3GE5qa" value="Rules" />
    <ref role="1M2myG" to="bj1v:4ipeeu8UrBu" resolve="ConceptCondition" />
  </node>
  <node concept="1M2fIO" id="4ipeeu8WK4r">
    <property role="3GE5qa" value="Rules" />
    <ref role="1M2myG" to="bj1v:4ipeeu8WK4g" resolve="ApplicableNodeReference" />
    <node concept="1N5Pfh" id="4ipeeu8WK4K" role="1Mr941">
      <ref role="1N5Vy1" to="bj1v:4ipeeu8WK4h" />
      <node concept="1MUpDS" id="4ipeeu8WK4L" role="1N6uqs">
        <node concept="3clFbS" id="4ipeeu8WK4M" role="2VODD2">
          <node concept="3cpWs8" id="4ipeeu8WK59" role="3cqZAp">
            <node concept="3cpWsn" id="4ipeeu8WK5a" role="3cpWs9">
              <property role="TrG5h" value="result" />
              <node concept="2I9FWS" id="4ipeeu8WK5b" role="1tU5fm">
                <ref role="2I9WkF" to="bj1v:4ipeeu8UrBu" resolve="ConceptCondition" />
              </node>
              <node concept="2ShNRf" id="4ipeeu8WK5d" role="33vP2m">
                <node concept="2T8Vx0" id="4ipeeu8WK5e" role="2ShVmc">
                  <node concept="2I9FWS" id="4ipeeu8WK5f" role="2T96Bj">
                    <ref role="2I9WkF" to="bj1v:4ipeeu8UrBu" resolve="ConceptCondition" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3cpWs8" id="4ipeeu8WYPZ" role="3cqZAp">
            <node concept="3cpWsn" id="4ipeeu8WYQ0" role="3cpWs9">
              <property role="TrG5h" value="rule" />
              <node concept="3Tqbb2" id="4ipeeu8WYQ1" role="1tU5fm">
                <ref role="ehGHo" to="bj1v:nUEAIXlVr8" resolve="Rule" />
              </node>
              <node concept="2OqwBi" id="4ipeeu8WYQ3" role="33vP2m">
                <node concept="21POm0" id="4ipeeu8WYQ4" role="2Oq$k0" />
                <node concept="2Xjw5R" id="4ipeeu8WYQ5" role="2OqNvi">
                  <node concept="1xMEDy" id="4ipeeu8WYQ6" role="1xVPHs">
                    <node concept="chp4Y" id="4ipeeu8WZ4E" role="ri$Ld">
                      <ref role="cht4Q" to="bj1v:nUEAIXlVr8" resolve="Rule" />
                    </node>
                  </node>
                  <node concept="1xIGOp" id="4ipeeu8WYXu" role="1xVPHs" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbJ" id="4ipeeu8WZ4G" role="3cqZAp">
            <node concept="3clFbS" id="4ipeeu8WZ4H" role="3clFbx">
              <node concept="3clFbF" id="4ipeeu8WZ57" role="3cqZAp">
                <node concept="2OqwBi" id="4ipeeu8WZ58" role="3clFbG">
                  <node concept="37vLTw" id="3GM_nagTsLg" role="2Oq$k0">
                    <ref role="3cqZAo" node="4ipeeu8WK5a" resolve="result" />
                  </node>
                  <node concept="TSZUe" id="4ipeeu8WZ5a" role="2OqNvi">
                    <node concept="1PxgMI" id="4ipeeu8WZ5i" role="25WWJ7">
                      <ref role="1PxNhF" to="bj1v:4ipeeu8UrBu" resolve="ConceptCondition" />
                      <node concept="2OqwBi" id="4ipeeu8WZ5c" role="1PxMeX">
                        <node concept="37vLTw" id="3GM_nagTwqz" role="2Oq$k0">
                          <ref role="3cqZAo" node="4ipeeu8WYQ0" resolve="rule" />
                        </node>
                        <node concept="3TrEf2" id="4ipeeu8WZ5g" role="2OqNvi">
                          <ref role="3Tt5mk" to="bj1v:2S_HFuhBt_m" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="1Wc70l" id="4ipeeu8WZ4Z" role="3clFbw">
              <node concept="3y3z36" id="4ipeeu8WZ53" role="3uHU7B">
                <node concept="10Nm6u" id="4ipeeu8WZ56" role="3uHU7w" />
                <node concept="37vLTw" id="3GM_nagTBcc" role="3uHU7B">
                  <ref role="3cqZAo" node="4ipeeu8WYQ0" resolve="rule" />
                </node>
              </node>
              <node concept="2OqwBi" id="4ipeeu8WZ4Q" role="3uHU7w">
                <node concept="2OqwBi" id="4ipeeu8WZ4L" role="2Oq$k0">
                  <node concept="37vLTw" id="3GM_nagT_2S" role="2Oq$k0">
                    <ref role="3cqZAo" node="4ipeeu8WYQ0" resolve="rule" />
                  </node>
                  <node concept="3TrEf2" id="4ipeeu8WZ4P" role="2OqNvi">
                    <ref role="3Tt5mk" to="bj1v:2S_HFuhBt_m" />
                  </node>
                </node>
                <node concept="1mIQ4w" id="4ipeeu8WZ4U" role="2OqNvi">
                  <node concept="chp4Y" id="4ipeeu8WZ5h" role="cj9EA">
                    <ref role="cht4Q" to="bj1v:4ipeeu8UrBu" resolve="ConceptCondition" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbF" id="4ipeeu8WK4N" role="3cqZAp">
            <node concept="37vLTw" id="3GM_nagTsjF" role="3clFbG">
              <ref role="3cqZAo" node="4ipeeu8WK5a" resolve="result" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="1M2fIO" id="7jE3VEJNI2t">
    <ref role="1M2myG" to="bj1v:3E8vDQwGYyk" resolve="EmitInstruction" />
  </node>
  <node concept="1M2fIO" id="7ePCaSBBIUz">
    <property role="3GE5qa" value="Rules" />
    <ref role="1M2myG" to="bj1v:nUEAIXlVr8" resolve="Rule" />
    <node concept="2NXJUA" id="7ePCaSBBIWT" role="2NY200">
      <node concept="3clFbS" id="7ePCaSBBIWU" role="2VODD2">
        <node concept="3clFbF" id="hQOhF7$" role="3cqZAp">
          <node concept="22lmx$" id="1KFbmnBQvjo" role="3clFbG">
            <node concept="2OqwBi" id="hQOhFqa" role="3uHU7B">
              <node concept="Rm8GO" id="7ePCaSBBJ94" role="2Oq$k0">
                <ref role="Rm8GQ" to="w1kc:~LanguageAspect.DATA_FLOW" resolve="DATA_FLOW" />
                <ref role="1Px2BO" to="w1kc:~LanguageAspect" resolve="LanguageAspect" />
              </node>
              <node concept="liA8E" id="hQOhFPz" role="2OqNvi">
                <ref role="37wK5l" to="w1kc:~LanguageAspect.is(org.jetbrains.mps.openapi.model.SModel):boolean" resolve="is" />
                <node concept="2JrnkZ" id="6MGyrQSoDan" role="37wK5m">
                  <node concept="1Q6Npb" id="hQOhG0k" role="2JrQYb" />
                </node>
              </node>
            </node>
            <node concept="2YIFZM" id="1KFbmnBQr8p" role="3uHU7w">
              <ref role="1Pybhc" to="w1kc:~SModelStereotype" resolve="SModelStereotype" />
              <ref role="37wK5l" to="w1kc:~SModelStereotype.isGeneratorModel(org.jetbrains.mps.openapi.model.SModel):boolean" resolve="isGeneratorModel" />
              <node concept="1Q6Npb" id="1KFbmnBQr8r" role="37wK5m" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="1M2fIO" id="7ePCaSBBJfK">
    <property role="3GE5qa" value="Analyzer" />
    <ref role="1M2myG" to="bj1v:5JpT3MjX6u9" resolve="Analyzer" />
    <node concept="2NXJUA" id="7ePCaSBBJfL" role="2NY200">
      <node concept="3clFbS" id="7ePCaSBBJfM" role="2VODD2">
        <node concept="3clFbF" id="7ePCaSBBJiL" role="3cqZAp">
          <node concept="22lmx$" id="7ePCaSBBJiM" role="3clFbG">
            <node concept="2OqwBi" id="7ePCaSBBJiN" role="3uHU7B">
              <node concept="Rm8GO" id="7ePCaSBBJmW" role="2Oq$k0">
                <ref role="Rm8GQ" to="w1kc:~LanguageAspect.DATA_FLOW" resolve="DATA_FLOW" />
                <ref role="1Px2BO" to="w1kc:~LanguageAspect" resolve="LanguageAspect" />
              </node>
              <node concept="liA8E" id="7ePCaSBBJiO" role="2OqNvi">
                <ref role="37wK5l" to="w1kc:~LanguageAspect.is(org.jetbrains.mps.openapi.model.SModel):boolean" resolve="is" />
                <node concept="2JrnkZ" id="7ePCaSBBJiP" role="37wK5m">
                  <node concept="1Q6Npb" id="7ePCaSBBJiQ" role="2JrQYb" />
                </node>
              </node>
            </node>
            <node concept="2YIFZM" id="7ePCaSBBJiR" role="3uHU7w">
              <ref role="1Pybhc" to="w1kc:~SModelStereotype" resolve="SModelStereotype" />
              <ref role="37wK5l" to="w1kc:~SModelStereotype.isGeneratorModel(org.jetbrains.mps.openapi.model.SModel):boolean" resolve="isGeneratorModel" />
              <node concept="1Q6Npb" id="7ePCaSBBJiS" role="37wK5m" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="1M2fIO" id="3tEjlbSL859">
    <property role="3GE5qa" value="Analyzer" />
    <ref role="1M2myG" to="bj1v:3tEjlbSL27S" resolve="AnalyzerConstructorParameterReference" />
    <node concept="1N5Pfh" id="3tEjlbSL85a" role="1Mr941">
      <ref role="1N5Vy1" to="bj1v:3tEjlbSL27T" />
      <node concept="13QW63" id="3tEjlbSL85i" role="1N6uqs">
        <node concept="3clFbS" id="3tEjlbSL85k" role="2VODD2">
          <node concept="3cpWs6" id="3tEjlbSL97p" role="3cqZAp">
            <node concept="2ShNRf" id="3tEjlbSL97R" role="3cqZAk">
              <node concept="1pGfFk" id="3tEjlbSLay$" role="2ShVmc">
                <ref role="37wK5l" to="6xgk:7lHSllLpTWM" resolve="NamedElementsScope" />
                <node concept="2OqwBi" id="3tEjlbSLaIV" role="37wK5m">
                  <node concept="2OqwBi" id="3tEjlbSLa_8" role="2Oq$k0">
                    <node concept="21POm0" id="3tEjlbSLazj" role="2Oq$k0" />
                    <node concept="2Xjw5R" id="3tEjlbSLaBX" role="2OqNvi">
                      <node concept="1xMEDy" id="3tEjlbSLaBZ" role="1xVPHs">
                        <node concept="chp4Y" id="3tEjlbSLaFO" role="ri$Ld">
                          <ref role="cht4Q" to="bj1v:5JpT3MjX6u9" resolve="Analyzer" />
                        </node>
                      </node>
                      <node concept="1xIGOp" id="3tEjlbSLaE$" role="1xVPHs" />
                    </node>
                  </node>
                  <node concept="3Tsc0h" id="3tEjlbSLaOn" role="2OqNvi">
                    <ref role="3TtcxE" to="bj1v:3tEjlbSKIc3" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="1M2fIO" id="7fxZEB1t65_">
    <property role="3GE5qa" value="Instructions" />
    <ref role="1M2myG" to="bj1v:7fxZEB1sSuo" resolve="CustomInstructionsContainerReference" />
    <node concept="1N5Pfh" id="7fxZEB1t65E" role="1Mr941">
      <ref role="1N5Vy1" to="bj1v:7fxZEB1sSup" />
      <node concept="1X3_iC" id="7fxZEB1tr$N" role="lGtFl">
        <property role="3V$3am" value="searchScopeFactory" />
        <property role="3V$3ak" value="3f4bc5f5-c6c1-4a28-8b10-c83066ffa4a1/1148687176410/1148687345559" />
        <node concept="13QW63" id="7fxZEB1tgwP" role="8Wnug">
          <node concept="3clFbS" id="7fxZEB1tgwQ" role="2VODD2">
            <node concept="3clFbF" id="7fxZEB1thkR" role="3cqZAp">
              <node concept="2ShNRf" id="7fxZEB1thkP" role="3clFbG">
                <node concept="1pGfFk" id="7fxZEB1tj2r" role="2ShVmc">
                  <ref role="37wK5l" to="tpcg:2iCqkkxEdE4" resolve="LanguageConceptsScope" />
                  <node concept="1Q6Npb" id="7fxZEB1tlNE" role="37wK5m" />
                  <node concept="35c_gC" id="7fxZEB1tj4E" role="37wK5m">
                    <ref role="35c_gD" to="bj1v:7fxZEB1sFyL" resolve="CustomInstructionsContainer" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

