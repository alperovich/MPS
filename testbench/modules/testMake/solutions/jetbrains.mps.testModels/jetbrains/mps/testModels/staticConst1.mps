<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:05c7a8c5-37ec-4f66-ba51-8932d01fd089(jetbrains.mps.testModels.staticConst1)" doNotGenerate="true">
  <persistence version="8" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <import index="521u" modelUID="r:3d6eb713-f66e-4101-9aa3-d4d364fcec63(jetbrains.mps.testModels.staticConst2)" version="-1" />
  <import index="tpck" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <import index="tpee" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="4" implicit="yes" />
  <root type="tpee.ClassConcept" typeId="tpee.1068390468198" id="5451769301631257084" nodeInfo="ig">
    <property name="name" nameId="tpck.1169194664001" value="TestGetter" />
    <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="5451769301631257085" nodeInfo="nn" />
    <node role="member" roleId="tpee.5375687026011219971" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="5451769301631257090" nodeInfo="igu">
      <property name="name" nameId="tpck.1169194664001" value="constEquals123" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="5451769301631257092" nodeInfo="nn" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="5451769301631257093" nodeInfo="sn">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="5451769301631257095" nodeInfo="nn">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.EqualsExpression" typeId="tpee.1068580123152" id="5451769301631262281" nodeInfo="nn">
            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="5451769301631262284" nodeInfo="nn">
              <property name="value" nameId="tpee.1068580320021" value="123" />
            </node>
            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="5451769301631257097" nodeInfo="nn">
              <link role="classifier" roleId="tpee.1144433057691" targetNodeId="521u.7489932710218379845" resolveInfo="TestUtil" />
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="521u.7489932710218379851" resolveInfo="test" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.BooleanType" typeId="tpee.1070534644030" id="5451769301631257094" nodeInfo="in" />
    </node>
  </root>
</model>

