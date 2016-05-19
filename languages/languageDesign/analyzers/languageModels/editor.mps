<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:f6eee33a-bfb4-4e1b-8340-0fa8c23aeb2e(jetbrains.mps.lang.dataFlow.analyzers.editor)">
  <persistence version="9" />
  <languages>
    <use id="83888646-71ce-4f1c-9c53-c54016f6ad4f" name="jetbrains.mps.baseLanguage.collections" version="0" />
    <use id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel" version="2" />
    <use id="774bf8a0-62e5-41e1-af63-f4812e60e48b" name="jetbrains.mps.baseLanguage.checkedDots" version="0" />
    <use id="18bc6592-03a6-4e29-a83a-7ff23bde13ba" name="jetbrains.mps.lang.editor" version="3" />
    <use id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage" version="4" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports>
    <import index="bj1v" ref="r:8b09f5e2-b403-4747-aaa3-eac5acb1f753(jetbrains.mps.lang.dataFlow.analyzers.structure)" />
    <import index="tp3t" ref="r:00000000-0000-4000-0000-011c89590345(jetbrains.mps.lang.pattern.structure)" />
    <import index="tpen" ref="r:00000000-0000-4000-0000-011c895902c3(jetbrains.mps.baseLanguage.editor)" />
    <import index="18ew" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.util(MPS.Core/)" />
    <import index="tpco" ref="r:00000000-0000-4000-0000-011c89590284(jetbrains.mps.lang.core.editor)" />
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
    <import index="tpee" ref="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="18bc6592-03a6-4e29-a83a-7ff23bde13ba" name="jetbrains.mps.lang.editor">
      <concept id="1071666914219" name="jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration" flags="ig" index="24kQdi" />
      <concept id="1140524381322" name="jetbrains.mps.lang.editor.structure.CellModel_ListWithRole" flags="ng" index="2czfm3">
        <property id="1140524450554" name="vertical" index="2czwfN" />
        <property id="1140524450557" name="separatorText" index="2czwfO" />
        <child id="1140524464360" name="cellLayout" index="2czzBx" />
      </concept>
      <concept id="1106270549637" name="jetbrains.mps.lang.editor.structure.CellLayout_Horizontal" flags="nn" index="2iRfu4" />
      <concept id="1106270571710" name="jetbrains.mps.lang.editor.structure.CellLayout_Vertical" flags="nn" index="2iRkQZ" />
      <concept id="1237303669825" name="jetbrains.mps.lang.editor.structure.CellLayout_Indent" flags="nn" index="l2Vlx" />
      <concept id="1237307900041" name="jetbrains.mps.lang.editor.structure.IndentLayoutIndentStyleClassItem" flags="ln" index="lj46D" />
      <concept id="1237308012275" name="jetbrains.mps.lang.editor.structure.IndentLayoutNewLineStyleClassItem" flags="ln" index="ljvvj" />
      <concept id="1237375020029" name="jetbrains.mps.lang.editor.structure.IndentLayoutNewLineChildrenStyleClassItem" flags="ln" index="pj6Ft" />
      <concept id="1142886221719" name="jetbrains.mps.lang.editor.structure.QueryFunction_NodeCondition" flags="in" index="pkWqt" />
      <concept id="1142886811589" name="jetbrains.mps.lang.editor.structure.ConceptFunctionParameter_node" flags="nn" index="pncrf" />
      <concept id="1237385578942" name="jetbrains.mps.lang.editor.structure.IndentLayoutOnNewLineStyleClassItem" flags="ln" index="pVoyu" />
      <concept id="1080736578640" name="jetbrains.mps.lang.editor.structure.BaseEditorComponent" flags="ig" index="2wURMF">
        <child id="1080736633877" name="cellModel" index="2wV5jI" />
      </concept>
      <concept id="1164824717996" name="jetbrains.mps.lang.editor.structure.CellMenuDescriptor" flags="ng" index="OXEIz">
        <child id="1164824815888" name="cellMenuPart" index="OY2wv" />
      </concept>
      <concept id="1078939183254" name="jetbrains.mps.lang.editor.structure.CellModel_Component" flags="sg" stub="3162947552742194261" index="PMmxH">
        <reference id="1078939183255" name="editorComponent" index="PMmxG" />
      </concept>
      <concept id="1186403694788" name="jetbrains.mps.lang.editor.structure.ColorStyleClassItem" flags="ln" index="VaVBg">
        <property id="1186403713874" name="color" index="Vb096" />
      </concept>
      <concept id="1186403751766" name="jetbrains.mps.lang.editor.structure.FontStyleStyleClassItem" flags="ln" index="Vb9p2">
        <property id="1186403771423" name="style" index="Vbekb" />
      </concept>
      <concept id="1186404549998" name="jetbrains.mps.lang.editor.structure.ForegroundColorStyleClassItem" flags="ln" index="VechU" />
      <concept id="1186414536763" name="jetbrains.mps.lang.editor.structure.BooleanStyleSheetItem" flags="ln" index="VOi$J">
        <property id="1186414551515" name="flag" index="VOm3f" />
      </concept>
      <concept id="1186414860679" name="jetbrains.mps.lang.editor.structure.EditableStyleClassItem" flags="ln" index="VPxyj" />
      <concept id="1186414928363" name="jetbrains.mps.lang.editor.structure.SelectableStyleSheetItem" flags="ln" index="VPM3Z" />
      <concept id="1233758997495" name="jetbrains.mps.lang.editor.structure.PunctuationLeftStyleClassItem" flags="ln" index="11L4FC" />
      <concept id="1233759184865" name="jetbrains.mps.lang.editor.structure.PunctuationRightStyleClassItem" flags="ln" index="11LMrY" />
      <concept id="1088013125922" name="jetbrains.mps.lang.editor.structure.CellModel_RefCell" flags="sg" stub="730538219795941030" index="1iCGBv">
        <child id="1088186146602" name="editorComponent" index="1sWHZn" />
      </concept>
      <concept id="1381004262292414836" name="jetbrains.mps.lang.editor.structure.ICellStyle" flags="ng" index="1k5N5V">
        <reference id="1381004262292426837" name="parentStyleClass" index="1k5W1q" />
      </concept>
      <concept id="1236262245656" name="jetbrains.mps.lang.editor.structure.MatchingLabelStyleClassItem" flags="ln" index="3mYdg7">
        <property id="1238091709220" name="labelName" index="1413C4" />
      </concept>
      <concept id="1088185857835" name="jetbrains.mps.lang.editor.structure.InlineEditorComponent" flags="ig" index="1sVBvm" />
      <concept id="1180615838666" name="jetbrains.mps.lang.editor.structure.CellMenuPart_PropertyPostfixHints" flags="ng" index="3yc0Fo">
        <child id="1180615838667" name="postfixesFunction" index="3yc0Fp" />
      </concept>
      <concept id="1180616057533" name="jetbrains.mps.lang.editor.structure.CellMenuPart_PropertyPostfixHints_GetPostfixes" flags="in" index="3ycQeJ" />
      <concept id="1139848536355" name="jetbrains.mps.lang.editor.structure.CellModel_WithRole" flags="ng" index="1$h60E">
        <property id="1140017977771" name="readOnly" index="1Intyy" />
        <reference id="1140103550593" name="relationDeclaration" index="1NtTu8" />
      </concept>
      <concept id="1073389214265" name="jetbrains.mps.lang.editor.structure.EditorCellModel" flags="ng" index="3EYTF0">
        <property id="1130859485024" name="attractsFocus" index="1cu_pB" />
        <child id="1142887637401" name="renderingCondition" index="pqm2j" />
        <child id="1164826688380" name="menuDescriptor" index="P5bDN" />
      </concept>
      <concept id="1073389446423" name="jetbrains.mps.lang.editor.structure.CellModel_Collection" flags="sn" stub="3013115976261988961" index="3EZMnI">
        <property id="1073389446425" name="vertical" index="3EZMnw" />
        <child id="1106270802874" name="cellLayout" index="2iSdaV" />
        <child id="1073389446424" name="childCellModel" index="3EZMnx" />
      </concept>
      <concept id="1073389577006" name="jetbrains.mps.lang.editor.structure.CellModel_Constant" flags="sn" stub="3610246225209162225" index="3F0ifn">
        <property id="1073389577007" name="text" index="3F0ifm" />
      </concept>
      <concept id="1073389658414" name="jetbrains.mps.lang.editor.structure.CellModel_Property" flags="sg" stub="730538219796134133" index="3F0A7n" />
      <concept id="1219418625346" name="jetbrains.mps.lang.editor.structure.IStyleContainer" flags="ng" index="3F0Thp">
        <child id="1219418656006" name="styleItem" index="3F10Kt" />
      </concept>
      <concept id="1073389882823" name="jetbrains.mps.lang.editor.structure.CellModel_RefNode" flags="sg" stub="730538219795960754" index="3F1sOY" />
      <concept id="1073390211982" name="jetbrains.mps.lang.editor.structure.CellModel_RefNodeList" flags="sg" stub="2794558372793454595" index="3F2HdR" />
      <concept id="1163613822479" name="jetbrains.mps.lang.editor.structure.CellMenuPart_Abstract_editedNode" flags="nn" index="3GMtW1" />
      <concept id="1198256887712" name="jetbrains.mps.lang.editor.structure.CellModel_Indent" flags="ng" index="3XFhqQ" />
      <concept id="1166049232041" name="jetbrains.mps.lang.editor.structure.AbstractComponent" flags="ng" index="1XWOmA">
        <reference id="1166049300910" name="conceptDeclaration" index="1XX52x" />
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
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
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
      <concept id="1070534934090" name="jetbrains.mps.baseLanguage.structure.CastExpression" flags="nn" index="10QFUN">
        <child id="1070534934091" name="type" index="10QFUM" />
        <child id="1070534934092" name="expression" index="10QFUP" />
      </concept>
      <concept id="1068431474542" name="jetbrains.mps.baseLanguage.structure.VariableDeclaration" flags="ng" index="33uBYm">
        <child id="1068431790190" name="initializer" index="33vP2m" />
      </concept>
      <concept id="1068498886296" name="jetbrains.mps.baseLanguage.structure.VariableReference" flags="nn" index="37vLTw">
        <reference id="1068581517664" name="variableDeclaration" index="3cqZAo" />
      </concept>
      <concept id="1068498886294" name="jetbrains.mps.baseLanguage.structure.AssignmentExpression" flags="nn" index="37vLTI" />
      <concept id="1225271177708" name="jetbrains.mps.baseLanguage.structure.StringType" flags="in" index="17QB3L" />
      <concept id="4972933694980447171" name="jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration" flags="ng" index="19Szcq">
        <child id="5680397130376446158" name="type" index="1tU5fm" />
      </concept>
      <concept id="1068580123152" name="jetbrains.mps.baseLanguage.structure.EqualsExpression" flags="nn" index="3clFbC" />
      <concept id="1068580123155" name="jetbrains.mps.baseLanguage.structure.ExpressionStatement" flags="nn" index="3clFbF">
        <child id="1068580123156" name="expression" index="3clFbG" />
      </concept>
      <concept id="1068580123159" name="jetbrains.mps.baseLanguage.structure.IfStatement" flags="nn" index="3clFbJ">
        <child id="1082485599094" name="ifFalseStatement" index="9aQIa" />
        <child id="1068580123160" name="condition" index="3clFbw" />
        <child id="1068580123161" name="ifTrue" index="3clFbx" />
      </concept>
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
      <concept id="1068581242864" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" flags="nn" index="3cpWs8">
        <child id="1068581242865" name="localVariableDeclaration" index="3cpWs9" />
      </concept>
      <concept id="1068581242863" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" flags="nr" index="3cpWsn" />
      <concept id="1204053956946" name="jetbrains.mps.baseLanguage.structure.IMethodCall" flags="ng" index="1ndlxa">
        <reference id="1068499141037" name="baseMethodDeclaration" index="37wK5l" />
        <child id="1068499141038" name="actualArgument" index="37wK5m" />
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
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1204851882688" name="jetbrains.mps.lang.smodel.structure.LinkRefQualifier" flags="ng" index="26LbJo">
        <reference id="1204851882689" name="link" index="26LbJp" />
      </concept>
      <concept id="1177026924588" name="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" flags="nn" index="chp4Y">
        <reference id="1177026940964" name="conceptDeclaration" index="cht4Q" />
      </concept>
      <concept id="1138411891628" name="jetbrains.mps.lang.smodel.structure.SNodeOperation" flags="nn" index="eCIE_">
        <child id="1144104376918" name="parameter" index="1xVPHs" />
      </concept>
      <concept id="7835263205327057228" name="jetbrains.mps.lang.smodel.structure.Node_GetChildrenAndChildAttributesOperation" flags="ng" index="Bykcj" />
      <concept id="1171407110247" name="jetbrains.mps.lang.smodel.structure.Node_GetAncestorOperation" flags="nn" index="2Xjw5R" />
      <concept id="5168775467716640652" name="jetbrains.mps.lang.smodel.structure.OperationParm_LinkQualifier" flags="ng" index="1aIX9F">
        <child id="5168775467716640653" name="linkQualifier" index="1aIX9E" />
      </concept>
      <concept id="1139621453865" name="jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation" flags="nn" index="1mIQ4w">
        <child id="1177027386292" name="conceptArgument" index="cj9EA" />
      </concept>
      <concept id="1172008320231" name="jetbrains.mps.lang.smodel.structure.Node_IsNotNullOperation" flags="nn" index="3x8VRR" />
      <concept id="1144101972840" name="jetbrains.mps.lang.smodel.structure.OperationParm_Concept" flags="ng" index="1xMEDy">
        <child id="1207343664468" name="conceptArgument" index="ri$Ld" />
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
      </concept>
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
    <language id="83888646-71ce-4f1c-9c53-c54016f6ad4f" name="jetbrains.mps.baseLanguage.collections">
      <concept id="1151688443754" name="jetbrains.mps.baseLanguage.collections.structure.ListType" flags="in" index="_YKpA">
        <child id="1151688676805" name="elementType" index="_ZDj9" />
      </concept>
      <concept id="1237721394592" name="jetbrains.mps.baseLanguage.collections.structure.AbstractContainerCreator" flags="nn" index="HWqM0">
        <child id="1237721435807" name="elementType" index="HW$YZ" />
      </concept>
      <concept id="1160600644654" name="jetbrains.mps.baseLanguage.collections.structure.ListCreatorWithInit" flags="nn" index="Tc6Ow" />
      <concept id="1176501494711" name="jetbrains.mps.baseLanguage.collections.structure.IsNotEmptyOperation" flags="nn" index="3GX2aA" />
    </language>
  </registry>
  <node concept="24kQdi" id="47tk9ge7sQX">
    <property role="3GE5qa" value="Analyzer" />
    <ref role="1XX52x" to="bj1v:5JpT3MjX6u9" resolve="Analyzer" />
    <node concept="3EZMnI" id="47tk9ge7sR0" role="2wV5jI">
      <node concept="3F0ifn" id="47tk9ge7sR3" role="3EZMnx">
        <property role="3F0ifm" value="analyzer" />
      </node>
      <node concept="3F0A7n" id="47tk9ge7sR5" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="ljvvj" id="47tk9ge7sR8" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="7XrupC0KJIs" role="3EZMnx">
        <property role="3F0ifm" value="analysis direction:" />
      </node>
      <node concept="3F1sOY" id="7XrupC0KJIu" role="3EZMnx">
        <ref role="1NtTu8" to="bj1v:7XrupC0KJIo" />
        <node concept="ljvvj" id="7XrupC0KJIv" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="7XrupC0LhIX" role="3EZMnx">
        <property role="3F0ifm" value="lattice element type:" />
      </node>
      <node concept="3F1sOY" id="7XrupC0LhJ1" role="3EZMnx">
        <ref role="1NtTu8" to="bj1v:7XrupC0LhIV" />
        <node concept="ljvvj" id="7XrupC0LhJ2" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="7fxZEB1sZxv" role="3EZMnx">
        <property role="3F0ifm" value="uses instructions from" />
      </node>
      <node concept="3F2HdR" id="7fxZEB1sZ$7" role="3EZMnx">
        <ref role="1NtTu8" to="bj1v:7fxZEB1sZw4" />
        <node concept="l2Vlx" id="7fxZEB1sZ$b" role="2czzBx" />
        <node concept="ljvvj" id="7fxZEB1sZ_1" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="66ZZ2RilY7M" role="3EZMnx">
        <property role="3F0ifm" value="construction parameters" />
        <node concept="ljvvj" id="3tEjlbSL1Zs" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="66ZZ2RilY7N" role="3EZMnx">
        <property role="3EZMnw" value="false" />
        <node concept="VPM3Z" id="66ZZ2RilY7O" role="3F10Kt">
          <property role="VOm3f" value="false" />
        </node>
        <node concept="3XFhqQ" id="66ZZ2RilY7P" role="3EZMnx" />
        <node concept="3F2HdR" id="66ZZ2RilY7Q" role="3EZMnx">
          <property role="2czwfN" value="true" />
          <ref role="1NtTu8" to="bj1v:3tEjlbSKIc3" />
          <node concept="2iRkQZ" id="66ZZ2RilY7R" role="2czzBx" />
        </node>
        <node concept="2iRfu4" id="66ZZ2RilY7S" role="2iSdaV" />
      </node>
      <node concept="3F0ifn" id="3tEjlbSL1At" role="3EZMnx">
        <node concept="pVoyu" id="3tEjlbSL1XI" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="ljvvj" id="3tEjlbSL1Va" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="1iCGBv" id="47tk9ge7tj4" role="3EZMnx">
        <ref role="1NtTu8" to="bj1v:47tk9ge7tjt" />
        <node concept="1sVBvm" id="47tk9ge7tj5" role="1sWHZn">
          <node concept="PMmxH" id="2wdLO7KhY9v" role="2wV5jI">
            <property role="1cu_pB" value="0" />
            <ref role="PMmxG" to="tpco:2wZex4PafBj" resolve="alias" />
          </node>
        </node>
      </node>
      <node concept="3F1sOY" id="47tk9ge7sR9" role="3EZMnx">
        <ref role="1NtTu8" to="bj1v:47tk9ge7tjt" />
        <node concept="ljvvj" id="47tk9ge7tjn" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="nUEAIXm3EF" role="3EZMnx">
        <property role="3F0ifm" value="" />
        <node concept="ljvvj" id="nUEAIXm3EG" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="VPxyj" id="nUEAIXm3EP" role="3F10Kt">
          <property role="VOm3f" value="false" />
        </node>
      </node>
      <node concept="1iCGBv" id="47tk9ge7tjo" role="3EZMnx">
        <ref role="1NtTu8" to="bj1v:47tk9ge7sFc" />
        <node concept="1sVBvm" id="47tk9ge7tjp" role="1sWHZn">
          <node concept="PMmxH" id="2wdLO7KhYa0" role="2wV5jI">
            <property role="1cu_pB" value="0" />
            <ref role="PMmxG" to="tpco:2wZex4PafBj" resolve="alias" />
          </node>
        </node>
      </node>
      <node concept="3F1sOY" id="47tk9ge7tjw" role="3EZMnx">
        <ref role="1NtTu8" to="bj1v:47tk9ge7sFc" />
        <node concept="ljvvj" id="47tk9ge7tjy" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="nUEAIXm3EI" role="3EZMnx">
        <property role="3F0ifm" value="" />
        <node concept="ljvvj" id="nUEAIXm3EJ" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="VPxyj" id="nUEAIXm3EN" role="3F10Kt">
          <property role="VOm3f" value="false" />
        </node>
      </node>
      <node concept="1iCGBv" id="47tk9ge7tj$" role="3EZMnx">
        <ref role="1NtTu8" to="bj1v:47tk9ge7tju" />
        <node concept="1sVBvm" id="47tk9ge7tj_" role="1sWHZn">
          <node concept="PMmxH" id="2wdLO7KhY5J" role="2wV5jI">
            <property role="1cu_pB" value="0" />
            <ref role="PMmxG" to="tpco:2wZex4PafBj" resolve="alias" />
          </node>
        </node>
      </node>
      <node concept="3F1sOY" id="47tk9ge7tjC" role="3EZMnx">
        <ref role="1NtTu8" to="bj1v:47tk9ge7tju" />
        <node concept="ljvvj" id="2S_HFuhAG4Y" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="2S_HFuhAG4X" role="3EZMnx">
        <property role="3F0ifm" value="" />
        <node concept="ljvvj" id="2S_HFuhAG4Z" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="7fxZEB1t0wF" role="3EZMnx">
        <node concept="l2Vlx" id="7fxZEB1t0wG" role="2iSdaV" />
        <node concept="3F0ifn" id="7fxZEB1t0eb" role="3EZMnx">
          <property role="3F0ifm" value="deprecated" />
          <node concept="VechU" id="3Z61ZaM65Ly" role="3F10Kt">
            <property role="Vb096" value="red" />
          </node>
          <node concept="ljvvj" id="7fxZEB1t0wA" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="2S_HFuhAG51" role="3EZMnx">
          <property role="3F0ifm" value="instructions:" />
          <node concept="ljvvj" id="2S_HFuhAG52" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="2S_HFuhAG4U" role="3EZMnx">
          <ref role="1NtTu8" to="bj1v:2S_HFuhAG4S" />
          <node concept="l2Vlx" id="2S_HFuhAG4V" role="2czzBx" />
          <node concept="pj6Ft" id="2S_HFuhAG53" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="3kyrMdC9zOY" role="3EZMnx">
          <property role="3F0ifm" value="" />
          <node concept="ljvvj" id="3kyrMdC9zP0" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="pkWqt" id="7fxZEB1t0zP" role="pqm2j">
          <node concept="3clFbS" id="7fxZEB1t0zQ" role="2VODD2">
            <node concept="3clFbF" id="7fxZEB1t0$Z" role="3cqZAp">
              <node concept="2OqwBi" id="7fxZEB1t0P5" role="3clFbG">
                <node concept="2OqwBi" id="7fxZEB1t0BA" role="2Oq$k0">
                  <node concept="pncrf" id="7fxZEB1t0$Y" role="2Oq$k0" />
                  <node concept="Bykcj" id="7fxZEB1t0Hl" role="2OqNvi">
                    <node concept="1aIX9F" id="7fxZEB1t0Hn" role="1xVPHs">
                      <node concept="26LbJo" id="7fxZEB1t0Lo" role="1aIX9E">
                        <ref role="26LbJp" to="bj1v:2S_HFuhAG4S" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3GX2aA" id="7fxZEB1t0Y1" role="2OqNvi" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="l2Vlx" id="47tk9ge7sR2" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="7XrupC0KJIg">
    <property role="3GE5qa" value="Analyzer.AnalysisDirection" />
    <ref role="1XX52x" to="bj1v:7XrupC0KJI6" resolve="AnalysisDirection" />
    <node concept="3EZMnI" id="7XrupC0KJIi" role="2wV5jI">
      <node concept="PMmxH" id="2wdLO7KhY8Z" role="3EZMnx">
        <property role="1cu_pB" value="0" />
        <ref role="PMmxG" to="tpco:2wZex4PafBj" resolve="alias" />
      </node>
      <node concept="l2Vlx" id="7XrupC0KJIk" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="7XrupC0L6li">
    <property role="3GE5qa" value="Instructions" />
    <ref role="1XX52x" to="bj1v:5JpT3MjX6ua" resolve="Instruction" />
    <node concept="3EZMnI" id="7XrupC0L6lk" role="2wV5jI">
      <node concept="3F0A7n" id="7XrupC0L6ln" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="2S_HFuhAG56" role="3EZMnx">
        <property role="3F0ifm" value="(" />
        <node concept="11LMrY" id="2S_HFuhAGav" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F2HdR" id="2S_HFuhAG58" role="3EZMnx">
        <property role="2czwfO" value="," />
        <ref role="1NtTu8" to="bj1v:2S_HFuhAG54" />
        <node concept="l2Vlx" id="2S_HFuhAG59" role="2czzBx" />
      </node>
      <node concept="3F0ifn" id="2S_HFuhAG5b" role="3EZMnx">
        <property role="3F0ifm" value=")" />
        <node concept="11L4FC" id="2S_HFuhAGaw" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="l2Vlx" id="7XrupC0L6lm" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="nUEAIXm0o5">
    <ref role="1XX52x" to="bj1v:nUEAIXlVr8" resolve="Rule" />
    <node concept="3EZMnI" id="nUEAIXm0o7" role="2wV5jI">
      <node concept="3F0ifn" id="nUEAIXm0ou" role="3EZMnx">
        <property role="3F0ifm" value="analyzer rule" />
      </node>
      <node concept="3F0A7n" id="2S_HFuhBowW" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="ljvvj" id="2S_HFuhBowX" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="3_iNRJnrAh2" role="3EZMnx">
        <property role="3F0ifm" value="for" />
      </node>
      <node concept="1iCGBv" id="3_iNRJnrAh4" role="3EZMnx">
        <ref role="1NtTu8" to="bj1v:3_iNRJnrAh0" />
        <node concept="1sVBvm" id="3_iNRJnrAh5" role="1sWHZn">
          <node concept="3F0A7n" id="3_iNRJnrAh7" role="2wV5jI">
            <property role="1Intyy" value="true" />
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="3_iNRJnrAh9" role="3EZMnx">
        <property role="3F0ifm" value="analyzer" />
        <node concept="ljvvj" id="3_iNRJnrAha" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F1sOY" id="2S_HFuhBt_n" role="3EZMnx">
        <ref role="1NtTu8" to="bj1v:2S_HFuhBt_m" />
        <node concept="ljvvj" id="2S_HFuhBt_o" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="1cPrQmLdZsr" role="3EZMnx">
        <property role="3F0ifm" value="" />
        <node concept="ljvvj" id="1cPrQmLdZss" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F1sOY" id="4ipeeu8Vzec" role="3EZMnx">
        <ref role="1NtTu8" to="bj1v:4ipeeu8Vzea" />
        <node concept="pkWqt" id="4ipeeu8Vzed" role="pqm2j">
          <node concept="3clFbS" id="4ipeeu8Vzee" role="2VODD2">
            <node concept="3clFbF" id="4ipeeu8Vzef" role="3cqZAp">
              <node concept="2OqwBi" id="4ipeeu8Vzem" role="3clFbG">
                <node concept="2OqwBi" id="4ipeeu8Vzeh" role="2Oq$k0">
                  <node concept="pncrf" id="4ipeeu8Vzeg" role="2Oq$k0" />
                  <node concept="3TrEf2" id="4ipeeu8Vzel" role="2OqNvi">
                    <ref role="3Tt5mk" to="bj1v:2S_HFuhBt_m" />
                  </node>
                </node>
                <node concept="1mIQ4w" id="4ipeeu8Vzeq" role="2OqNvi">
                  <node concept="chp4Y" id="4ipeeu8Vzes" role="cj9EA">
                    <ref role="cht4Q" to="bj1v:4ipeeu8UrBu" resolve="ConceptCondition" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="l2Vlx" id="nUEAIXm0o9" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="2S_HFuhBlFu">
    <property role="3GE5qa" value="Instructions" />
    <ref role="1XX52x" to="bj1v:nUEAIXm3Ew" resolve="InstructionParameter" />
    <node concept="3EZMnI" id="2S_HFuhBlFw" role="2wV5jI">
      <node concept="3F1sOY" id="2S_HFuhBlFz" role="3EZMnx">
        <ref role="1NtTu8" to="bj1v:nUEAIXm3Ey" />
      </node>
      <node concept="3F0A7n" id="2S_HFuhBlF_" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="l2Vlx" id="2S_HFuhBlFy" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="3OYWvKo51la">
    <ref role="1XX52x" to="bj1v:2S_HFuhBwHz" resolve="PatternCondition" />
    <node concept="3EZMnI" id="3OYWvKo51lc" role="2wV5jI">
      <node concept="3F1sOY" id="3OYWvKo51lf" role="3EZMnx">
        <ref role="1NtTu8" to="bj1v:2S_HFuhBx12" />
      </node>
      <node concept="l2Vlx" id="3OYWvKo51le" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="3E8vDQwGY_t">
    <ref role="1XX52x" to="bj1v:3E8vDQwGYyk" resolve="EmitInstruction" />
    <node concept="3EZMnI" id="3E8vDQwGY_v" role="2wV5jI">
      <node concept="l2Vlx" id="3E8vDQwGY_x" role="2iSdaV" />
      <node concept="3F0ifn" id="7N36lZ1OwuW" role="3EZMnx">
        <property role="3F0ifm" value="insert" />
      </node>
      <node concept="3F1sOY" id="3E8vDQwHfPt" role="3EZMnx">
        <ref role="1NtTu8" to="bj1v:3E8vDQwHfPr" />
      </node>
      <node concept="3EZMnI" id="1l_fWI5bCs" role="3EZMnx">
        <node concept="VPM3Z" id="1l_fWI5bCt" role="3F10Kt">
          <property role="VOm3f" value="false" />
        </node>
        <node concept="3F1sOY" id="1l_fWI5bCH" role="3EZMnx">
          <ref role="1NtTu8" to="bj1v:1l_fWI5bCG" />
        </node>
        <node concept="3F1sOY" id="1l_fWI5bCw" role="3EZMnx">
          <ref role="1NtTu8" to="bj1v:hWYZ0eE_w2" />
        </node>
        <node concept="l2Vlx" id="1l_fWI5bCv" role="2iSdaV" />
        <node concept="pkWqt" id="1l_fWI5bCI" role="pqm2j">
          <node concept="3clFbS" id="1l_fWI5bCJ" role="2VODD2">
            <node concept="3clFbF" id="1l_fWI5bCK" role="3cqZAp">
              <node concept="3clFbC" id="1l_fWI5bCL" role="3clFbG">
                <node concept="10Nm6u" id="1l_fWI5bCM" role="3uHU7w" />
                <node concept="2OqwBi" id="1l_fWI5bCN" role="3uHU7B">
                  <node concept="pncrf" id="1l_fWI5bCO" role="2Oq$k0" />
                  <node concept="2Xjw5R" id="1l_fWI5bCP" role="2OqNvi">
                    <node concept="1xMEDy" id="1l_fWI5bCQ" role="1xVPHs">
                      <node concept="chp4Y" id="1l_fWI5bCR" role="ri$Ld">
                        <ref role="cht4Q" to="tp3t:gyDMOuf" resolve="Pattern" />
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
  <node concept="24kQdi" id="3E8vDQwHcVu">
    <ref role="1XX52x" to="bj1v:3E8vDQwHcVs" resolve="InstructionReference" />
    <node concept="3EZMnI" id="3E8vDQwHcVw" role="2wV5jI">
      <node concept="1iCGBv" id="3E8vDQwHcVB" role="3EZMnx">
        <ref role="1NtTu8" to="bj1v:3E8vDQwHcV_" />
        <node concept="1sVBvm" id="3E8vDQwHcVC" role="1sWHZn">
          <node concept="3F0A7n" id="3E8vDQwHcVE" role="2wV5jI">
            <property role="1Intyy" value="true" />
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
            <node concept="11LMrY" id="3y47OhSErOJ" role="3F10Kt">
              <property role="VOm3f" value="true" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="3E8vDQwHcVG" role="3EZMnx">
        <property role="3F0ifm" value="(" />
        <node concept="11LMrY" id="3E8vDQwHcVH" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F2HdR" id="3E8vDQwHcVz" role="3EZMnx">
        <property role="2czwfO" value="," />
        <ref role="1NtTu8" to="bj1v:3E8vDQwHcVt" />
        <node concept="l2Vlx" id="3E8vDQwHcV$" role="2czzBx" />
      </node>
      <node concept="3F0ifn" id="3E8vDQwHcVJ" role="3EZMnx">
        <property role="3F0ifm" value=")" />
        <node concept="11L4FC" id="3E8vDQwHcVK" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="l2Vlx" id="3E8vDQwHcVy" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="DMZNGGDWmM">
    <property role="3GE5qa" value="Rules" />
    <ref role="1XX52x" to="bj1v:DMZNGGDWmK" resolve="RuleReference" />
    <node concept="1iCGBv" id="DMZNGGDWmO" role="2wV5jI">
      <ref role="1NtTu8" to="bj1v:DMZNGGDWmL" />
      <node concept="1sVBvm" id="DMZNGGDWmP" role="1sWHZn">
        <node concept="3F0A7n" id="DMZNGGDWmR" role="2wV5jI">
          <property role="1Intyy" value="true" />
          <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="5hLfAui9Co">
    <property role="3GE5qa" value="Analyzer" />
    <ref role="1XX52x" to="bj1v:5hLfAui9Cm" resolve="AnalyzerRunnerCreator" />
    <node concept="3EZMnI" id="5hLfAui9Cq" role="2wV5jI">
      <node concept="l2Vlx" id="5hLfAui9Cs" role="2iSdaV" />
      <node concept="1iCGBv" id="5hLfAui9Cv" role="3EZMnx">
        <ref role="1NtTu8" to="bj1v:5hLfAui9Cn" />
        <node concept="1sVBvm" id="5hLfAui9Cw" role="1sWHZn">
          <node concept="3F0A7n" id="5hLfAui9Cy" role="2wV5jI">
            <property role="1Intyy" value="true" />
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="9V7Nft$SQc" role="3EZMnx">
        <property role="3F0ifm" value="analyzerRunner" />
        <node concept="11LMrY" id="3y47OhSEgx2" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="9V7Nft_oMz" role="3EZMnx">
        <property role="3F0ifm" value="(" />
        <node concept="11LMrY" id="3y47OhSEgx3" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="3tEjlbSOgRw" role="3EZMnx">
        <node concept="2iRfu4" id="3tEjlbSOgRx" role="2iSdaV" />
        <node concept="3F1sOY" id="9V7Nft_oMB" role="3EZMnx">
          <ref role="1NtTu8" to="bj1v:9V7Nft_oMw" />
        </node>
        <node concept="3EZMnI" id="5JXsuoWrbry" role="3EZMnx">
          <node concept="l2Vlx" id="5JXsuoWrbrz" role="2iSdaV" />
          <node concept="3F0ifn" id="3tEjlbSOgSc" role="3EZMnx">
            <property role="3F0ifm" value="," />
            <node concept="Vb9p2" id="5JXsuoWrbru" role="3F10Kt" />
            <node concept="11L4FC" id="5JXsuoWrbpL" role="3F10Kt">
              <property role="VOm3f" value="true" />
            </node>
          </node>
          <node concept="3F2HdR" id="3tEjlbSOgRM" role="3EZMnx">
            <property role="2czwfO" value="," />
            <ref role="1NtTu8" to="bj1v:3tEjlbSOgR6" />
            <node concept="l2Vlx" id="3tEjlbSOgS4" role="2czzBx" />
          </node>
          <node concept="pkWqt" id="5JXsuoWrbKR" role="pqm2j">
            <node concept="3clFbS" id="5JXsuoWrbKS" role="2VODD2">
              <node concept="3clFbF" id="5JXsuoWqYsk" role="3cqZAp">
                <node concept="22lmx$" id="5JXsuoWrczl" role="3clFbG">
                  <node concept="2OqwBi" id="2_1mL0eofVg" role="3uHU7B">
                    <node concept="2OqwBi" id="5JXsuoWrcDJ" role="2Oq$k0">
                      <node concept="pncrf" id="5JXsuoWrcAN" role="2Oq$k0" />
                      <node concept="Bykcj" id="2_1mL0eofVd" role="2OqNvi">
                        <node concept="1aIX9F" id="2_1mL0eofVe" role="1xVPHs">
                          <node concept="26LbJo" id="2_1mL0eofVf" role="1aIX9E">
                            <ref role="26LbJp" to="bj1v:3tEjlbSOgR6" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3GX2aA" id="2_1mL0eofVh" role="2OqNvi" />
                  </node>
                  <node concept="2EnYce" id="5JXsuoWr1m_" role="3uHU7w">
                    <node concept="2EnYce" id="5JXsuoWqZd4" role="2Oq$k0">
                      <node concept="2OqwBi" id="5JXsuoWqYuV" role="2Oq$k0">
                        <node concept="pncrf" id="5JXsuoWqYsj" role="2Oq$k0" />
                        <node concept="3TrEf2" id="5JXsuoWqYBJ" role="2OqNvi">
                          <ref role="3Tt5mk" to="bj1v:5hLfAui9Cn" />
                        </node>
                      </node>
                      <node concept="3Tsc0h" id="5JXsuoWqZos" role="2OqNvi">
                        <ref role="3TtcxE" to="bj1v:3tEjlbSKIc3" />
                      </node>
                    </node>
                    <node concept="3GX2aA" id="5JXsuoWr3Iq" role="2OqNvi" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="9V7Nft_oMA" role="3EZMnx">
        <property role="3F0ifm" value=")" />
        <node concept="11L4FC" id="3y47OhSEgx4" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="6OapBP3wQAW">
    <property role="3GE5qa" value="Analyzer" />
    <ref role="1XX52x" to="bj1v:5hLfAui9Ch" resolve="AnalyzerRunnerAnalyzeOperation" />
    <node concept="3EZMnI" id="6OapBP3x6oN" role="2wV5jI">
      <node concept="3F0ifn" id="6OapBP3x6oQ" role="3EZMnx">
        <property role="3F0ifm" value="analyze" />
      </node>
      <node concept="3F0ifn" id="9V7Nft_94w" role="3EZMnx">
        <property role="3F0ifm" value="(" />
      </node>
      <node concept="3F0ifn" id="9V7Nft_94y" role="3EZMnx">
        <property role="3F0ifm" value=")" />
      </node>
      <node concept="l2Vlx" id="6OapBP3x6oP" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="6ViLkrkrEh$">
    <property role="3GE5qa" value="Instructions" />
    <ref role="1XX52x" to="bj1v:6ViLkrkrEhy" resolve="IsOperation" />
    <node concept="3EZMnI" id="6ViLkrkrEhB" role="2wV5jI">
      <node concept="l2Vlx" id="6ViLkrkrEhC" role="2iSdaV" />
      <node concept="3F1sOY" id="6ViLkrkrJVP" role="3EZMnx">
        <ref role="1NtTu8" to="bj1v:6ViLkrkrJVL" />
      </node>
      <node concept="3F0ifn" id="6ViLkrkrJVO" role="3EZMnx">
        <property role="3F0ifm" value="is" />
      </node>
      <node concept="1iCGBv" id="6ViLkrkrEhF" role="3EZMnx">
        <ref role="1NtTu8" to="bj1v:6ViLkrkrEhz" />
        <node concept="1sVBvm" id="6ViLkrkrEhG" role="1sWHZn">
          <node concept="3F0A7n" id="6ViLkrkrEhI" role="2wV5jI">
            <property role="1Intyy" value="true" />
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="4ipeeu8Vyep">
    <property role="3GE5qa" value="Rules" />
    <ref role="1XX52x" to="bj1v:4ipeeu8UrBu" resolve="ConceptCondition" />
    <node concept="3EZMnI" id="4ipeeu8Vyer" role="2wV5jI">
      <node concept="3F0ifn" id="4ipeeu8Vyes" role="3EZMnx">
        <property role="3F0ifm" value="concept" />
        <ref role="1k5W1q" to="tpen:hgVS8CF" resolve="KeyWord" />
      </node>
      <node concept="3F0ifn" id="4ipeeu8Vyet" role="3EZMnx">
        <property role="3F0ifm" value="=" />
      </node>
      <node concept="1iCGBv" id="4ipeeu8Vyfm" role="3EZMnx">
        <ref role="1NtTu8" to="bj1v:4ipeeu8Vyel" />
        <node concept="1sVBvm" id="4ipeeu8Vyfn" role="1sWHZn">
          <node concept="3F0A7n" id="4ipeeu8Vyfp" role="2wV5jI">
            <property role="1Intyy" value="true" />
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="4ipeeu8Vyex" role="3EZMnx">
        <property role="3F0ifm" value="as" />
        <ref role="1k5W1q" to="tpen:hgVS8CF" resolve="KeyWord" />
      </node>
      <node concept="3F0A7n" id="4ipeeu8Vyey" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="OXEIz" id="4ipeeu8Vyez" role="P5bDN">
          <node concept="3yc0Fo" id="4ipeeu8Vye$" role="OY2wv">
            <node concept="3ycQeJ" id="4ipeeu8Vye_" role="3yc0Fp">
              <node concept="3clFbS" id="4ipeeu8VyeA" role="2VODD2">
                <node concept="3cpWs8" id="4ipeeu8VyeB" role="3cqZAp">
                  <node concept="3cpWsn" id="4ipeeu8VyeC" role="3cpWs9">
                    <property role="TrG5h" value="result" />
                    <node concept="_YKpA" id="4ipeeu8Vz9q" role="1tU5fm">
                      <node concept="17QB3L" id="7y2QyN30T9N" role="_ZDj9" />
                    </node>
                  </node>
                </node>
                <node concept="3clFbJ" id="4ipeeu8VyeF" role="3cqZAp">
                  <node concept="3clFbS" id="4ipeeu8VyeG" role="3clFbx">
                    <node concept="3cpWs8" id="4ipeeu8VyeH" role="3cqZAp">
                      <node concept="3cpWsn" id="4ipeeu8VyeI" role="3cpWs9">
                        <property role="TrG5h" value="name" />
                        <node concept="17QB3L" id="4ipeeu8VyeJ" role="1tU5fm" />
                        <node concept="2YIFZM" id="4ipeeu8VyeK" role="33vP2m">
                          <ref role="1Pybhc" to="18ew:~NameUtil" resolve="NameUtil" />
                          <ref role="37wK5l" to="18ew:~NameUtil.decapitalize(java.lang.String):java.lang.String" resolve="decapitalize" />
                          <node concept="2OqwBi" id="4ipeeu8VyeL" role="37wK5m">
                            <node concept="2OqwBi" id="4ipeeu8VyeM" role="2Oq$k0">
                              <node concept="3GMtW1" id="4ipeeu8VyeN" role="2Oq$k0" />
                              <node concept="3TrEf2" id="4ipeeu8Vyhb" role="2OqNvi">
                                <ref role="3Tt5mk" to="bj1v:4ipeeu8Vyel" />
                              </node>
                            </node>
                            <node concept="3TrcHB" id="4ipeeu8VyeP" role="2OqNvi">
                              <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3clFbF" id="4ipeeu8VyeQ" role="3cqZAp">
                      <node concept="37vLTI" id="4ipeeu8VyeR" role="3clFbG">
                        <node concept="37vLTw" id="3GM_nagTtcZ" role="37vLTJ">
                          <ref role="3cqZAo" node="4ipeeu8VyeC" resolve="result" />
                        </node>
                        <node concept="10QFUN" id="7y2QyN30T9O" role="37vLTx">
                          <node concept="_YKpA" id="7y2QyN30T9R" role="10QFUM">
                            <node concept="17QB3L" id="7y2QyN30T9T" role="_ZDj9" />
                          </node>
                          <node concept="2YIFZM" id="4ipeeu8VyeT" role="10QFUP">
                            <ref role="1Pybhc" to="18ew:~NameUtil" resolve="NameUtil" />
                            <ref role="37wK5l" to="18ew:~NameUtil.splitByCamels(java.lang.String):java.util.List" resolve="splitByCamels" />
                            <node concept="37vLTw" id="3GM_nagT$wo" role="37wK5m">
                              <ref role="3cqZAo" node="4ipeeu8VyeI" resolve="name" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="1Wc70l" id="4ipeeu8VyeV" role="3clFbw">
                    <node concept="3y3z36" id="4ipeeu8VyeW" role="3uHU7w">
                      <node concept="10Nm6u" id="4ipeeu8VyeX" role="3uHU7w" />
                      <node concept="2OqwBi" id="4ipeeu8VyeY" role="3uHU7B">
                        <node concept="2OqwBi" id="4ipeeu8VyeZ" role="2Oq$k0">
                          <node concept="3GMtW1" id="4ipeeu8Vyf0" role="2Oq$k0" />
                          <node concept="3TrEf2" id="4ipeeu8Vyha" role="2OqNvi">
                            <ref role="3Tt5mk" to="bj1v:4ipeeu8Vyel" />
                          </node>
                        </node>
                        <node concept="3TrcHB" id="4ipeeu8Vyf2" role="2OqNvi">
                          <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                        </node>
                      </node>
                    </node>
                    <node concept="2OqwBi" id="4ipeeu8Vyf3" role="3uHU7B">
                      <node concept="2OqwBi" id="4ipeeu8Vyf4" role="2Oq$k0">
                        <node concept="3GMtW1" id="4ipeeu8Vyf5" role="2Oq$k0" />
                        <node concept="3TrEf2" id="4ipeeu8Vyh9" role="2OqNvi">
                          <ref role="3Tt5mk" to="bj1v:4ipeeu8Vyel" />
                        </node>
                      </node>
                      <node concept="3x8VRR" id="4ipeeu8Vyf7" role="2OqNvi" />
                    </node>
                  </node>
                  <node concept="9aQIb" id="4ipeeu8Vyf8" role="9aQIa">
                    <node concept="3clFbS" id="4ipeeu8Vyf9" role="9aQI4">
                      <node concept="3clFbF" id="4ipeeu8Vyfa" role="3cqZAp">
                        <node concept="37vLTI" id="4ipeeu8Vyfb" role="3clFbG">
                          <node concept="2ShNRf" id="4ipeeu8Vyfc" role="37vLTx">
                            <node concept="Tc6Ow" id="4ipeeu8Vyfd" role="2ShVmc">
                              <node concept="17QB3L" id="4ipeeu8Vyfe" role="HW$YZ" />
                            </node>
                          </node>
                          <node concept="37vLTw" id="3GM_nagTx3R" role="37vLTJ">
                            <ref role="3cqZAo" node="4ipeeu8VyeC" resolve="result" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbF" id="4ipeeu8Vyfg" role="3cqZAp">
                  <node concept="37vLTw" id="3GM_nagTy0q" role="3clFbG">
                    <ref role="3cqZAo" node="4ipeeu8VyeC" resolve="result" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="Vb9p2" id="4ipeeu8Vyfi" role="3F10Kt">
          <property role="Vbekb" value="ITALIC" />
        </node>
        <node concept="VechU" id="4ipeeu8Vyfj" role="3F10Kt">
          <property role="Vb096" value="DARK_BLUE" />
        </node>
      </node>
      <node concept="2iRfu4" id="4ipeeu8Vyfk" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="4ipeeu8WK4i">
    <property role="3GE5qa" value="Rules" />
    <ref role="1XX52x" to="bj1v:4ipeeu8WK4g" resolve="ApplicableNodeReference" />
    <node concept="3EZMnI" id="4ipeeu8WK4k" role="2wV5jI">
      <node concept="1iCGBv" id="4ipeeu8WK4n" role="3EZMnx">
        <ref role="1NtTu8" to="bj1v:4ipeeu8WK4h" />
        <node concept="1sVBvm" id="4ipeeu8WK4o" role="1sWHZn">
          <node concept="3F0A7n" id="4ipeeu8WK4q" role="2wV5jI">
            <property role="1Intyy" value="true" />
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="l2Vlx" id="4ipeeu8WK4m" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="7jE3VEJNOTX">
    <ref role="1XX52x" to="bj1v:7jE3VEJNFWz" resolve="InsertPosition" />
    <node concept="3F0ifn" id="7jE3VEJNOTZ" role="2wV5jI">
      <property role="3F0ifm" value="" />
    </node>
  </node>
  <node concept="24kQdi" id="3tEjlbSL282">
    <property role="3GE5qa" value="Analyzer" />
    <ref role="1XX52x" to="bj1v:3tEjlbSL22K" resolve="AnalyzerConstructorParameter" />
    <node concept="3EZMnI" id="3tEjlbSL284" role="2wV5jI">
      <node concept="3F1sOY" id="3tEjlbSL28e" role="3EZMnx">
        <ref role="1NtTu8" to="tpee:4VkOLwjf83e" />
      </node>
      <node concept="3F0A7n" id="3tEjlbSL28k" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="3tEjlbSL28s" role="3EZMnx">
        <property role="3F0ifm" value=";" />
        <ref role="1k5W1q" to="tpen:hFDgi_W" resolve="Semicolon" />
      </node>
      <node concept="l2Vlx" id="3tEjlbSL287" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="3tEjlbSMO_3">
    <property role="3GE5qa" value="Analyzer" />
    <ref role="1XX52x" to="bj1v:3tEjlbSL27S" resolve="AnalyzerConstructorParameterReference" />
    <node concept="1iCGBv" id="3tEjlbSMO_5" role="2wV5jI">
      <ref role="1NtTu8" to="bj1v:3tEjlbSL27T" />
      <node concept="1sVBvm" id="3tEjlbSMO_7" role="1sWHZn">
        <node concept="3F0A7n" id="3tEjlbSMO_h" role="2wV5jI">
          <property role="1Intyy" value="true" />
          <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="7fxZEB1sH3M">
    <property role="3GE5qa" value="Instructions" />
    <ref role="1XX52x" to="bj1v:7fxZEB1sFyL" resolve="CustomInstructionsContainer" />
    <node concept="3EZMnI" id="7fxZEB1sH4$" role="2wV5jI">
      <node concept="l2Vlx" id="7fxZEB1sH4_" role="2iSdaV" />
      <node concept="3F0ifn" id="7fxZEB1sH4A" role="3EZMnx">
        <property role="3F0ifm" value="custom instructions container" />
      </node>
      <node concept="3F0A7n" id="7fxZEB1sH4B" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="7fxZEB1sH4C" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="3mYdg7" id="7fxZEB1sH4D" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="7fxZEB1sH4E" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="7fxZEB1sH4F" role="3EZMnx">
        <node concept="l2Vlx" id="7fxZEB1sH4G" role="2iSdaV" />
        <node concept="lj46D" id="7fxZEB1sH4H" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F2HdR" id="7fxZEB1sH4M" role="3EZMnx">
          <ref role="1NtTu8" to="bj1v:7fxZEB1sH3D" />
          <node concept="l2Vlx" id="7fxZEB1sH4N" role="2czzBx" />
          <node concept="pj6Ft" id="7fxZEB1sH4O" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="7fxZEB1sH4P" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="7fxZEB1sH4Q" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="7fxZEB1sH4R" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="7fxZEB1sH4S" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="7fxZEB1sSur">
    <property role="3GE5qa" value="Instructions" />
    <ref role="1XX52x" to="bj1v:7fxZEB1sSuo" resolve="CustomInstructionsContainerReference" />
    <node concept="1iCGBv" id="7fxZEB1sSux" role="2wV5jI">
      <ref role="1NtTu8" to="bj1v:7fxZEB1sSup" />
      <node concept="1sVBvm" id="7fxZEB1sSu$" role="1sWHZn">
        <node concept="3F0A7n" id="7fxZEB1sSuA" role="2wV5jI">
          <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        </node>
      </node>
    </node>
  </node>
</model>

