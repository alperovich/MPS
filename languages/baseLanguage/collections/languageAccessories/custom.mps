<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:dfdf3542-dbcf-43df-870a-3c3504b3c840(jetbrains.mps.baseLanguage.collections.custom)" doNotGenerate="true">
  <persistence version="8" />
  <language namespace="83888646-71ce-4f1c-9c53-c54016f6ad4f(jetbrains.mps.baseLanguage.collections)" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <import index="k7g3" modelUID="f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.util(JDK/java.util@java_stub)" version="-1" />
  <import index="msyo" modelUID="f:java_stub#6ed54515-acc8-4d1e-a16c-9fd6cfe951ea#jetbrains.mps.util(MPS.Core/jetbrains.mps.util@java_stub)" version="-1" />
  <import index="tpee" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="4" implicit="yes" />
  <import index="tp2q" modelUID="r:00000000-0000-4000-0000-011c8959032e(jetbrains.mps.baseLanguage.collections.structure)" version="7" implicit="yes" />
  <import index="tpck" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <root type="tp2q.CustomContainers" typeId="tp2q.6099516049394485324" id="4498918741262375223" nodeInfo="ng">
    <property name="name" nameId="tpck.1169194664001" value="WeakCollections" />
    <node role="containerDeclaration" roleId="tp2q.6099516049394485326" type="tp2q.CustomContainerDeclaration" typeId="tp2q.6099516049394485216" id="4498918741262375224" nodeInfo="ng">
      <property name="name" nameId="tpck.1169194664001" value="weakHashMap" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="4498918741262375225" nodeInfo="nn" />
      <node role="containerType" roleId="tp2q.6099516049394485311" type="tp2q.MapType" typeId="tp2q.1197683403723" id="4498918741262375228" nodeInfo="in">
        <node role="valueType" roleId="tp2q.1197683475734" type="tpee.TypeVariableReference" typeId="tpee.1109283449304" id="4498918741262375234" nodeInfo="in">
          <link role="typeVariableDeclaration" roleId="tpee.1109283546497" targetNodeId="4498918741262375232" resolveInfo="V" />
        </node>
        <node role="keyType" roleId="tp2q.1197683466920" type="tpee.TypeVariableReference" typeId="tpee.1109283449304" id="4498918741262375233" nodeInfo="in">
          <link role="typeVariableDeclaration" roleId="tpee.1109283546497" targetNodeId="4498918741262375231" resolveInfo="K" />
        </node>
      </node>
      <node role="runtimeType" roleId="tp2q.6099516049394485312" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="4498918741262375235" nodeInfo="in">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~WeakHashMap" resolveInfo="WeakHashMap" />
        <node role="parameter" roleId="tpee.1109201940907" type="tpee.TypeVariableReference" typeId="tpee.1109283449304" id="4498918741262381420" nodeInfo="in">
          <link role="typeVariableDeclaration" roleId="tpee.1109283546497" targetNodeId="4498918741262375231" resolveInfo="K" />
        </node>
        <node role="parameter" roleId="tpee.1109201940907" type="tpee.TypeVariableReference" typeId="tpee.1109283449304" id="4498918741262381422" nodeInfo="in">
          <link role="typeVariableDeclaration" roleId="tpee.1109283546497" targetNodeId="4498918741262375232" resolveInfo="V" />
        </node>
      </node>
      <node role="typeVariableDeclaration" roleId="tpee.1109279881614" type="tpee.TypeVariableDeclaration" typeId="tpee.1109279763828" id="4498918741262375231" nodeInfo="ng">
        <property name="name" nameId="tpck.1169194664001" value="K" />
      </node>
      <node role="typeVariableDeclaration" roleId="tpee.1109279881614" type="tpee.TypeVariableDeclaration" typeId="tpee.1109279763828" id="4498918741262375232" nodeInfo="ng">
        <property name="name" nameId="tpck.1169194664001" value="V" />
      </node>
    </node>
    <node role="containerDeclaration" roleId="tp2q.6099516049394485326" type="tp2q.CustomContainerDeclaration" typeId="tp2q.6099516049394485216" id="4498918741262480972" nodeInfo="ng">
      <property name="name" nameId="tpck.1169194664001" value="weakHashSet" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="4498918741262480973" nodeInfo="nn" />
      <node role="containerType" roleId="tp2q.6099516049394485311" type="tp2q.SetType" typeId="tp2q.1226511727824" id="4498918741262480976" nodeInfo="in">
        <node role="elementType" roleId="tp2q.1226511765987" type="tpee.TypeVariableReference" typeId="tpee.1109283449304" id="4498918741262480979" nodeInfo="in">
          <link role="typeVariableDeclaration" roleId="tpee.1109283546497" targetNodeId="4498918741262480978" resolveInfo="E" />
        </node>
      </node>
      <node role="runtimeType" roleId="tp2q.6099516049394485312" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="4498918741262482972" nodeInfo="in">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="msyo.~WeakSet" resolveInfo="WeakSet" />
        <node role="parameter" roleId="tpee.1109201940907" type="tpee.TypeVariableReference" typeId="tpee.1109283449304" id="4498918741262482974" nodeInfo="in">
          <link role="typeVariableDeclaration" roleId="tpee.1109283546497" targetNodeId="4498918741262480978" resolveInfo="E" />
        </node>
      </node>
      <node role="typeVariableDeclaration" roleId="tpee.1109279881614" type="tpee.TypeVariableDeclaration" typeId="tpee.1109279763828" id="4498918741262480978" nodeInfo="ng">
        <property name="name" nameId="tpck.1169194664001" value="E" />
      </node>
    </node>
  </root>
</model>

