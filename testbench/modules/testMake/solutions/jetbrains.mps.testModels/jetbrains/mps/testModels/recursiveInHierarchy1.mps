<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:52ab5bea-7329-4884-b79e-85d8eb3d6921(jetbrains.mps.testModels.recursiveInHierarchy1)" doNotGenerate="true">
  <persistence version="8" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <import index="af0x" modelUID="r:efeaae46-06f7-44f8-b5cd-cacdae3a27e2(jetbrains.mps.testModels.recursiveInHierarchy2)" version="-1" />
  <import index="tpee" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="4" implicit="yes" />
  <import index="tpck" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <root type="tpee.ClassConcept" typeId="tpee.1068390468198" id="3043583937669651982" nodeInfo="ig">
    <property name="name" nameId="tpck.1169194664001" value="MyClass1" />
    <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="3043583937669651983" nodeInfo="nn" />
    <node role="superclass" roleId="tpee.1165602531693" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="2265759664131688325" nodeInfo="in">
      <link role="classifier" roleId="tpee.1107535924139" targetNodeId="af0x.3043583937669651988" resolveInfo="MyClass2" />
    </node>
    <node role="member" roleId="tpee.5375687026011219971" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="3043583937669651984" nodeInfo="igu">
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="3043583937669651985" nodeInfo="in" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="3043583937669651986" nodeInfo="nn" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="3043583937669651987" nodeInfo="sn" />
    </node>
  </root>
</model>

