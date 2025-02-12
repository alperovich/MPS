<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:14f06230-41df-42af-9a25-81de46539bf1(jetbrains.mps.build.workflow.accessories)">
  <persistence version="8" />
  <language namespace="698a8d22-a104-47a0-ba8d-10e3ec237f13(jetbrains.mps.build.workflow)" />
  <language namespace="479c7a8c-02f9-43b5-9139-d910cb22f298(jetbrains.mps.core.xml)" />
  <import index="tpck" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <import index="8xvf" modelUID="r:ed179f4d-7cf2-479d-8348-50c1fc63b96a(jetbrains.mps.build.workflow.structure)" version="0" implicit="yes" />
  <root type="8xvf.BwfTaskLibrary" typeId="8xvf.7306485738221391506" id="7306485738221408314" nodeInfo="ng">
    <property name="name" nameId="tpck.1169194664001" value="java" />
    <node role="parts" roleId="8xvf.7306485738221391508" type="8xvf.BwfTask" typeId="8xvf.2769948622284546675" id="7306485738221390862" nodeInfo="ng">
      <property name="name" nameId="tpck.1169194664001" value="compileJava" />
    </node>
    <node role="parts" roleId="8xvf.7306485738221391508" type="8xvf.BwfTask" typeId="8xvf.2769948622284546675" id="7306485738221390870" nodeInfo="ng">
      <property name="name" nameId="tpck.1169194664001" value="processResources" />
    </node>
    <node role="parts" roleId="8xvf.7306485738221391508" type="8xvf.BwfTask" typeId="8xvf.2769948622284546675" id="7306485738221390868" nodeInfo="ng">
      <property name="name" nameId="tpck.1169194664001" value="classes" />
      <node role="dependencies" roleId="8xvf.2769948622284574302" type="8xvf.BwfTaskDependency" typeId="8xvf.2769948622284574294" id="7306485738221390872" nodeInfo="ng">
        <link role="target" roleId="8xvf.2769948622284574295" targetNodeId="7306485738221390862" resolveInfo="compileJava" />
      </node>
      <node role="dependencies" roleId="8xvf.2769948622284574302" type="8xvf.BwfTaskDependency" typeId="8xvf.2769948622284574294" id="7306485738221390874" nodeInfo="ng">
        <link role="target" roleId="8xvf.2769948622284574295" targetNodeId="7306485738221390870" resolveInfo="processResources" />
      </node>
    </node>
    <node role="parts" roleId="8xvf.7306485738221391508" type="8xvf.BwfTaskPart" typeId="8xvf.3961775458390032824" id="4701820937132277086" nodeInfo="ng">
      <link role="task" roleId="8xvf.3961775458390032825" targetNodeId="4701820937132277082" resolveInfo="assemble" />
      <node role="additionalDependencies" roleId="8xvf.3961775458390352322" type="8xvf.BwfTaskDependency" typeId="8xvf.2769948622284574294" id="4701820937132277088" nodeInfo="ng">
        <link role="target" roleId="8xvf.2769948622284574295" targetNodeId="7306485738221390868" resolveInfo="classes" />
      </node>
    </node>
    <node role="parts" roleId="8xvf.7306485738221391508" type="8xvf.BwfTask" typeId="8xvf.2769948622284546675" id="7306485738221390885" nodeInfo="ng">
      <property name="name" nameId="tpck.1169194664001" value="test" />
      <node role="dependencies" roleId="8xvf.2769948622284574302" type="8xvf.BwfTaskDependency" typeId="8xvf.2769948622284574294" id="7306485738221390894" nodeInfo="ng">
        <link role="target" roleId="8xvf.2769948622284574295" targetNodeId="7306485738221390868" resolveInfo="classes" />
      </node>
    </node>
    <node role="parts" roleId="8xvf.7306485738221391508" type="8xvf.BwfTask" typeId="8xvf.2769948622284546675" id="7306485738221390881" nodeInfo="ng">
      <property name="name" nameId="tpck.1169194664001" value="check" />
      <node role="dependencies" roleId="8xvf.2769948622284574302" type="8xvf.BwfTaskDependency" typeId="8xvf.2769948622284574294" id="7306485738221390896" nodeInfo="ng">
        <link role="target" roleId="8xvf.2769948622284574295" targetNodeId="7306485738221390885" resolveInfo="test" />
      </node>
    </node>
    <node role="imports" roleId="8xvf.7306485738221455030" type="8xvf.BwfTaskLibraryDependency" typeId="8xvf.7306485738221471031" id="7306485738221487426" nodeInfo="ng">
      <link role="target" roleId="8xvf.7306485738221471032" targetNodeId="7306485738221408315" resolveInfo="common" />
    </node>
  </root>
  <root type="8xvf.BwfTaskLibrary" typeId="8xvf.7306485738221391506" id="7306485738221408315" nodeInfo="ng">
    <property name="name" nameId="tpck.1169194664001" value="common" />
    <node role="parts" roleId="8xvf.7306485738221391508" type="8xvf.BwfMacro" typeId="8xvf.6896005762093571400" id="7306485738221314459" nodeInfo="ng">
      <property name="isLocation" nameId="8xvf.6896005762093571407" value="true" />
      <property name="name" nameId="tpck.1169194664001" value="build.dir" />
      <property name="defaultValue" nameId="8xvf.6896005762093571402" value="build" />
    </node>
    <node role="parts" roleId="8xvf.7306485738221391508" type="8xvf.BwfTask" typeId="8xvf.2769948622284546675" id="4701820937132277082" nodeInfo="ng">
      <property name="name" nameId="tpck.1169194664001" value="assemble" />
    </node>
    <node role="parts" roleId="8xvf.7306485738221391508" type="8xvf.BwfTask" typeId="8xvf.2769948622284546675" id="6520682027041193815" nodeInfo="ng">
      <property name="name" nameId="tpck.1169194664001" value="buildDependents" />
    </node>
    <node role="parts" roleId="8xvf.7306485738221391508" type="8xvf.BwfTask" typeId="8xvf.2769948622284546675" id="7128123785277844790" nodeInfo="ng">
      <property name="name" nameId="tpck.1169194664001" value="fetchDependencies" />
    </node>
    <node role="parts" roleId="8xvf.7306485738221391508" type="8xvf.BwfTask" typeId="8xvf.2769948622284546675" id="7306485738221408317" nodeInfo="ng">
      <property name="name" nameId="tpck.1169194664001" value="build" />
      <node role="dependencies" roleId="8xvf.2769948622284574302" type="8xvf.BwfTaskDependency" typeId="8xvf.2769948622284574294" id="4701820937132277093" nodeInfo="ng">
        <link role="target" roleId="8xvf.2769948622284574295" targetNodeId="4701820937132277082" resolveInfo="assemble" />
      </node>
    </node>
    <node role="parts" roleId="8xvf.7306485738221391508" type="8xvf.BwfTask" typeId="8xvf.2769948622284546675" id="7306485738221390898" nodeInfo="ng">
      <property name="name" nameId="tpck.1169194664001" value="clean" />
    </node>
  </root>
</model>

