<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:46f53b30-44a8-4c39-ba0f-5abf40394bee(sandboxModel2)">
  <persistence version="8" />
  <language namespace="7c9e2807-94ad-4afc-adf0-aaee45eb2895(jetbrains.mps.samples.lambdaCalculus)" />
  <import index="qjd" modelUID="r:d30b7004-00fd-4d3e-bdd6-6ae5346d9b86(jetbrains.mps.samples.lambdaCalculus.structure)" version="1" implicit="yes" />
  <import index="tpck" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <root type="qjd.Program" typeId="qjd.4022026349915669385" id="816130369292799544" nodeInfo="ng">
    <property name="name" nameId="tpck.1169194664001" value="first" />
    <node role="expression" roleId="qjd.4022026349915669386" type="qjd.LambdaApplication" typeId="qjd.4022026349914762717" id="816130369292799800" nodeInfo="ng">
      <node role="argument" roleId="qjd.4022026349914762721" type="qjd.NumericConstant" typeId="qjd.4022026349914762709" id="816130369292799817" nodeInfo="ng">
        <property name="value" nameId="qjd.4022026349914762710" value="3" />
      </node>
      <node role="function" roleId="qjd.4022026349914762720" type="qjd.LambdaAbstraction" typeId="qjd.4022026349914673024" id="816130369292799546" nodeInfo="ng">
        <node role="variable" roleId="qjd.4022026349914762681" type="qjd.AbstractionVariable" typeId="qjd.4022026349914673025" id="816130369292799547" nodeInfo="ng">
          <property name="name" nameId="tpck.1169194664001" value="x" />
        </node>
        <node role="body" roleId="qjd.4022026349914762693" type="qjd.LetExpression" typeId="qjd.4939219901991602079" id="816130369292799560" nodeInfo="ng">
          <node role="value" roleId="qjd.4939219901991602080" type="qjd.LambdaAbstraction" typeId="qjd.4022026349914673024" id="816130369292799568" nodeInfo="ng">
            <node role="variable" roleId="qjd.4022026349914762681" type="qjd.AbstractionVariable" typeId="qjd.4022026349914673025" id="816130369292799569" nodeInfo="ng">
              <property name="name" nameId="tpck.1169194664001" value="y" />
            </node>
            <node role="variable" roleId="qjd.4022026349914762681" type="qjd.AbstractionVariable" typeId="qjd.4022026349914673025" id="816130369292799577" nodeInfo="ng">
              <property name="name" nameId="tpck.1169194664001" value="z" />
            </node>
            <node role="body" roleId="qjd.4022026349914762693" type="qjd.MultiplyOperation" typeId="qjd.6645816968628162282" id="816130369292799620" nodeInfo="ng">
              <node role="right" roleId="qjd.1934341835352312157" type="qjd.ParenthesisExpression" typeId="qjd.3978364766705449817" id="816130369292799630" nodeInfo="ng">
                <node role="expression" roleId="qjd.3978364766705449818" type="qjd.AddOperation" typeId="qjd.1934341835352312169" id="816130369292799647" nodeInfo="ng">
                  <node role="right" roleId="qjd.1934341835352312157" type="qjd.AbstractionVarRef" typeId="qjd.4022026349915821199" id="816130369292799657" nodeInfo="ng">
                    <link role="variable" roleId="qjd.8981808925914862845" targetNodeId="816130369292799577" resolveInfo="z" />
                  </node>
                  <node role="left" roleId="qjd.1934341835352312156" type="qjd.AbstractionVarRef" typeId="qjd.4022026349915821199" id="816130369292799639" nodeInfo="ng">
                    <link role="variable" roleId="qjd.8981808925914862845" targetNodeId="816130369292799569" resolveInfo="y" />
                  </node>
                </node>
              </node>
              <node role="left" roleId="qjd.1934341835352312156" type="qjd.ParenthesisExpression" typeId="qjd.3978364766705449817" id="816130369292799585" nodeInfo="ng">
                <node role="expression" roleId="qjd.3978364766705449818" type="qjd.AddOperation" typeId="qjd.1934341835352312169" id="816130369292799602" nodeInfo="ng">
                  <node role="right" roleId="qjd.1934341835352312157" type="qjd.AbstractionVarRef" typeId="qjd.4022026349915821199" id="816130369292799612" nodeInfo="ng">
                    <link role="variable" roleId="qjd.8981808925914862845" targetNodeId="816130369292799577" resolveInfo="z" />
                  </node>
                  <node role="left" roleId="qjd.1934341835352312156" type="qjd.AbstractionVarRef" typeId="qjd.4022026349915821199" id="816130369292799594" nodeInfo="ng">
                    <link role="variable" roleId="qjd.8981808925914862845" targetNodeId="816130369292799569" resolveInfo="y" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="expression" roleId="qjd.4939219901991602081" type="qjd.LambdaApplication" typeId="qjd.4022026349914762717" id="816130369292799772" nodeInfo="ng">
            <node role="function" roleId="qjd.4022026349914762720" type="qjd.LambdaAbstraction" typeId="qjd.4022026349914673024" id="816130369292799665" nodeInfo="ng">
              <node role="variable" roleId="qjd.4022026349914762681" type="qjd.AbstractionVariable" typeId="qjd.4022026349914673025" id="816130369292799697" nodeInfo="ng">
                <property name="name" nameId="tpck.1169194664001" value="a" />
              </node>
              <node role="body" roleId="qjd.4022026349914762693" type="qjd.SubtractOperation" typeId="qjd.6645816968628162284" id="816130369292802039" nodeInfo="ng">
                <node role="right" roleId="qjd.1934341835352312157" type="qjd.AbstractionVarRef" typeId="qjd.4022026349915821199" id="816130369292802055" nodeInfo="ng">
                  <link role="variable" roleId="qjd.8981808925914862845" targetNodeId="816130369292799697" resolveInfo="a" />
                </node>
                <node role="left" roleId="qjd.1934341835352312156" type="qjd.LambdaApplication" typeId="qjd.4022026349914762717" id="816130369292799728" nodeInfo="ng">
                  <node role="argument" roleId="qjd.4022026349914762721" type="qjd.NumericConstant" typeId="qjd.4022026349914762709" id="816130369292801997" nodeInfo="ng">
                    <property name="value" nameId="qjd.4022026349914762710" value="2" />
                  </node>
                  <node role="argument" roleId="qjd.4022026349914762721" type="qjd.AbstractionVarRef" typeId="qjd.4022026349915821199" id="816130369292805170" nodeInfo="ng">
                    <link role="variable" roleId="qjd.8981808925914862845" targetNodeId="816130369292799547" resolveInfo="x" />
                  </node>
                  <node role="function" roleId="qjd.4022026349914762720" type="qjd.LetRef" typeId="qjd.4939219901992083820" id="816130369292799720" nodeInfo="ng">
                    <link role="variable" roleId="qjd.8981808925914862844" targetNodeId="816130369292799563" resolveInfo="sum_sq" />
                  </node>
                </node>
              </node>
            </node>
            <node role="argument" roleId="qjd.4022026349914762721" type="qjd.AbstractionVarRef" typeId="qjd.4022026349915821199" id="2985097847315899872" nodeInfo="ng">
              <link role="variable" roleId="qjd.8981808925914862845" targetNodeId="816130369292799547" resolveInfo="x" />
            </node>
          </node>
          <node role="variable" roleId="qjd.8360767178776358704" type="qjd.LetVariable" typeId="qjd.8360767178776325736" id="816130369292799563" nodeInfo="ng">
            <property name="name" nameId="tpck.1169194664001" value="sum_sq" />
          </node>
        </node>
      </node>
    </node>
  </root>
  <root type="qjd.Program" typeId="qjd.4022026349915669385" id="2985097847315873733" nodeInfo="ng">
    <property name="name" nameId="tpck.1169194664001" value="qwert" />
    <node role="expression" roleId="qjd.4022026349915669386" type="qjd.LambdaApplication" typeId="qjd.4022026349914762717" id="7255885626191294754" nodeInfo="ng">
      <node role="argument" roleId="qjd.4022026349914762721" type="qjd.NumericConstant" typeId="qjd.4022026349914762709" id="7255885626191294757" nodeInfo="ng">
        <property name="value" nameId="qjd.4022026349914762710" value="2" />
      </node>
      <node role="function" roleId="qjd.4022026349914762720" type="qjd.LambdaAbstraction" typeId="qjd.4022026349914673024" id="7255885626191294750" nodeInfo="ng">
        <node role="variable" roleId="qjd.4022026349914762681" type="qjd.AbstractionVariable" typeId="qjd.4022026349914673025" id="7255885626191294751" nodeInfo="ng">
          <property name="name" nameId="tpck.1169194664001" value="x" />
        </node>
        <node role="body" roleId="qjd.4022026349914762693" type="qjd.AbstractionVarRef" typeId="qjd.4022026349915821199" id="5213293814339673679" nodeInfo="ng">
          <link role="variable" roleId="qjd.8981808925914862845" targetNodeId="7255885626191294751" resolveInfo="x" />
        </node>
      </node>
    </node>
  </root>
</model>

