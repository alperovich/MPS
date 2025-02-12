<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:19bf018c-b5e7-418d-8415-b23921421325(sandboxModel)">
  <persistence version="8" />
  <language namespace="7c9e2807-94ad-4afc-adf0-aaee45eb2895(jetbrains.mps.samples.lambdaCalculus)" />
  <import index="tpck" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <import index="qjd" modelUID="r:d30b7004-00fd-4d3e-bdd6-6ae5346d9b86(jetbrains.mps.samples.lambdaCalculus.structure)" version="1" implicit="yes" />
  <root type="qjd.Program" typeId="qjd.4022026349915669385" id="5277476162361142416" nodeInfo="ng">
    <property name="name" nameId="tpck.1169194664001" value="test2" />
    <node role="expression" roleId="qjd.4022026349915669386" type="qjd.LambdaApplication" typeId="qjd.4022026349914762717" id="5277476162361142445" nodeInfo="ng">
      <node role="argument" roleId="qjd.4022026349914762721" type="qjd.NumericConstant" typeId="qjd.4022026349914762709" id="5277476162361142452" nodeInfo="ng">
        <property name="value" nameId="qjd.4022026349914762710" value="2" />
      </node>
      <node role="function" roleId="qjd.4022026349914762720" type="qjd.LambdaAbstraction" typeId="qjd.4022026349914673024" id="5277476162361142418" nodeInfo="ng">
        <node role="variable" roleId="qjd.4022026349914762681" type="qjd.AbstractionVariable" typeId="qjd.4022026349914673025" id="5277476162361142419" nodeInfo="ng">
          <property name="name" nameId="tpck.1169194664001" value="x" />
        </node>
        <node role="body" roleId="qjd.4022026349914762693" type="qjd.AbstractionVarRef" typeId="qjd.4022026349915821199" id="7255885626191296040" nodeInfo="ng">
          <link role="variable" roleId="qjd.8981808925914862845" targetNodeId="5277476162361142419" resolveInfo="x" />
        </node>
      </node>
    </node>
  </root>
  <root type="qjd.Program" typeId="qjd.4022026349915669385" id="2167053794906818090" nodeInfo="ng">
    <property name="name" nameId="tpck.1169194664001" value="sim" />
    <node role="expression" roleId="qjd.4022026349915669386" type="qjd.LetExpression" typeId="qjd.4939219901991602079" id="2167053794906818091" nodeInfo="ng">
      <node role="value" roleId="qjd.4939219901991602080" type="qjd.LambdaAbstraction" typeId="qjd.4022026349914673024" id="2167053794906818092" nodeInfo="ng">
        <node role="variable" roleId="qjd.4022026349914762681" type="qjd.AbstractionVariable" typeId="qjd.4022026349914673025" id="2167053794906818093" nodeInfo="ng">
          <property name="name" nameId="tpck.1169194664001" value="x" />
        </node>
        <node role="body" roleId="qjd.4022026349914762693" type="qjd.MultiplyOperation" typeId="qjd.6645816968628162282" id="2167053794906818094" nodeInfo="ng">
          <node role="left" roleId="qjd.1934341835352312156" type="qjd.AbstractionVarRef" typeId="qjd.4022026349915821199" id="2167053794906818095" nodeInfo="ng">
            <link role="variable" roleId="qjd.8981808925914862845" targetNodeId="2167053794906818093" resolveInfo="x" />
          </node>
          <node role="right" roleId="qjd.1934341835352312157" type="qjd.AbstractionVarRef" typeId="qjd.4022026349915821199" id="2167053794906818096" nodeInfo="ng">
            <link role="variable" roleId="qjd.8981808925914862845" targetNodeId="2167053794906818093" resolveInfo="x" />
          </node>
        </node>
      </node>
      <node role="expression" roleId="qjd.4939219901991602081" type="qjd.ParenthesisExpression" typeId="qjd.3978364766705449817" id="2167053794906818097" nodeInfo="ng">
        <node role="expression" roleId="qjd.3978364766705449818" type="qjd.LambdaApplication" typeId="qjd.4022026349914762717" id="2167053794906818098" nodeInfo="ng">
          <node role="argument" roleId="qjd.4022026349914762721" type="qjd.LambdaApplication" typeId="qjd.4022026349914762717" id="2167053794906818099" nodeInfo="ng">
            <node role="argument" roleId="qjd.4022026349914762721" type="qjd.NumericConstant" typeId="qjd.4022026349914762709" id="2167053794906818100" nodeInfo="ng">
              <property name="value" nameId="qjd.4022026349914762710" value="2" />
            </node>
            <node role="function" roleId="qjd.4022026349914762720" type="qjd.LetRef" typeId="qjd.4939219901992083820" id="2167053794906818101" nodeInfo="ng">
              <link role="variable" roleId="qjd.8981808925914862844" targetNodeId="2167053794906818103" resolveInfo="sq" />
            </node>
          </node>
          <node role="function" roleId="qjd.4022026349914762720" type="qjd.LetRef" typeId="qjd.4939219901992083820" id="2167053794906818102" nodeInfo="ng">
            <link role="variable" roleId="qjd.8981808925914862844" targetNodeId="2167053794906818103" resolveInfo="sq" />
          </node>
        </node>
      </node>
      <node role="variable" roleId="qjd.8360767178776358704" type="qjd.LetVariable" typeId="qjd.8360767178776325736" id="2167053794906818103" nodeInfo="ng">
        <property name="name" nameId="tpck.1169194664001" value="sq" />
      </node>
    </node>
  </root>
  <root type="qjd.Program" typeId="qjd.4022026349915669385" id="816130369292750457" nodeInfo="ng">
    <property name="name" nameId="tpck.1169194664001" value="sumsq" />
    <node role="expression" roleId="qjd.4022026349915669386" type="qjd.LambdaApplication" typeId="qjd.4022026349914762717" id="816130369292750664" nodeInfo="ng">
      <node role="argument" roleId="qjd.4022026349914762721" type="qjd.NumericConstant" typeId="qjd.4022026349914762709" id="816130369292750677" nodeInfo="ng">
        <property name="value" nameId="qjd.4022026349914762710" value="6" />
      </node>
      <node role="function" roleId="qjd.4022026349914762720" type="qjd.LambdaApplication" typeId="qjd.4022026349914762717" id="816130369292750642" nodeInfo="ng">
        <node role="argument" roleId="qjd.4022026349914762721" type="qjd.NumericConstant" typeId="qjd.4022026349914762709" id="816130369292750654" nodeInfo="ng">
          <property name="value" nameId="qjd.4022026349914762710" value="5" />
        </node>
        <node role="function" roleId="qjd.4022026349914762720" type="qjd.LambdaAbstraction" typeId="qjd.4022026349914673024" id="816130369292750459" nodeInfo="ng">
          <node role="variable" roleId="qjd.4022026349914762681" type="qjd.AbstractionVariable" typeId="qjd.4022026349914673025" id="816130369292750460" nodeInfo="ng">
            <property name="name" nameId="tpck.1169194664001" value="x" />
          </node>
          <node role="variable" roleId="qjd.4022026349914762681" type="qjd.AbstractionVariable" typeId="qjd.4022026349914673025" id="816130369292750464" nodeInfo="ng">
            <property name="name" nameId="tpck.1169194664001" value="y" />
          </node>
          <node role="body" roleId="qjd.4022026349914762693" type="qjd.LetExpression" typeId="qjd.4939219901991602079" id="816130369292750468" nodeInfo="ng">
            <node role="value" roleId="qjd.4939219901991602080" type="qjd.AddOperation" typeId="qjd.1934341835352312169" id="816130369292750486" nodeInfo="ng">
              <node role="right" roleId="qjd.1934341835352312157" type="qjd.AbstractionVarRef" typeId="qjd.4022026349915821199" id="816130369292750492" nodeInfo="ng">
                <link role="variable" roleId="qjd.8981808925914862845" targetNodeId="816130369292750464" resolveInfo="y" />
              </node>
              <node role="left" roleId="qjd.1934341835352312156" type="qjd.AbstractionVarRef" typeId="qjd.4022026349915821199" id="816130369292750482" nodeInfo="ng">
                <link role="variable" roleId="qjd.8981808925914862845" targetNodeId="816130369292750460" resolveInfo="x" />
              </node>
            </node>
            <node role="expression" roleId="qjd.4939219901991602081" type="qjd.LetExpression" typeId="qjd.4939219901991602079" id="816130369292750496" nodeInfo="ng">
              <node role="value" roleId="qjd.4939219901991602080" type="qjd.MultiplyOperation" typeId="qjd.6645816968628162282" id="816130369292750505" nodeInfo="ng">
                <node role="right" roleId="qjd.1934341835352312157" type="qjd.AbstractionVarRef" typeId="qjd.4022026349915821199" id="816130369292750511" nodeInfo="ng">
                  <link role="variable" roleId="qjd.8981808925914862845" targetNodeId="816130369292750464" resolveInfo="y" />
                </node>
                <node role="left" roleId="qjd.1934341835352312156" type="qjd.AbstractionVarRef" typeId="qjd.4022026349915821199" id="816130369292750504" nodeInfo="ng">
                  <link role="variable" roleId="qjd.8981808925914862845" targetNodeId="816130369292750460" resolveInfo="x" />
                </node>
              </node>
              <node role="expression" roleId="qjd.4939219901991602081" type="qjd.LambdaApplication" typeId="qjd.4022026349914762717" id="816130369292750539" nodeInfo="ng">
                <node role="argument" roleId="qjd.4022026349914762721" type="qjd.LetRef" typeId="qjd.4939219901992083820" id="816130369292750549" nodeInfo="ng">
                  <link role="variable" roleId="qjd.8981808925914862844" targetNodeId="816130369292750478" resolveInfo="sum" />
                </node>
                <node role="function" roleId="qjd.4022026349914762720" type="qjd.LambdaAbstraction" typeId="qjd.4022026349914673024" id="816130369292750515" nodeInfo="ng">
                  <node role="variable" roleId="qjd.4022026349914762681" type="qjd.AbstractionVariable" typeId="qjd.4022026349914673025" id="816130369292750516" nodeInfo="ng">
                    <property name="name" nameId="tpck.1169194664001" value="z" />
                  </node>
                  <node role="body" roleId="qjd.4022026349914762693" type="qjd.MultiplyOperation" typeId="qjd.6645816968628162282" id="816130369292750530" nodeInfo="ng">
                    <node role="right" roleId="qjd.1934341835352312157" type="qjd.SubtractOperation" typeId="qjd.6645816968628162284" id="816130369292750606" nodeInfo="ng">
                      <node role="right" roleId="qjd.1934341835352312157" type="qjd.MultiplyOperation" typeId="qjd.6645816968628162282" id="816130369292750624" nodeInfo="ng">
                        <node role="right" roleId="qjd.1934341835352312157" type="qjd.LetRef" typeId="qjd.4939219901992083820" id="816130369292750634" nodeInfo="ng">
                          <link role="variable" roleId="qjd.8981808925914862844" targetNodeId="816130369292750499" resolveInfo="mult" />
                        </node>
                        <node role="left" roleId="qjd.1934341835352312156" type="qjd.NumericConstant" typeId="qjd.4022026349914762709" id="816130369292750616" nodeInfo="ng">
                          <property name="value" nameId="qjd.4022026349914762710" value="2" />
                        </node>
                      </node>
                      <node role="left" roleId="qjd.1934341835352312156" type="qjd.AbstractionVarRef" typeId="qjd.4022026349915821199" id="816130369292750533" nodeInfo="ng">
                        <link role="variable" roleId="qjd.8981808925914862845" targetNodeId="816130369292750516" resolveInfo="z" />
                      </node>
                    </node>
                    <node role="left" roleId="qjd.1934341835352312156" type="qjd.AbstractionVarRef" typeId="qjd.4022026349915821199" id="816130369292750529" nodeInfo="ng">
                      <link role="variable" roleId="qjd.8981808925914862845" targetNodeId="816130369292750516" resolveInfo="z" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="variable" roleId="qjd.8360767178776358704" type="qjd.LetVariable" typeId="qjd.8360767178776325736" id="816130369292750499" nodeInfo="ng">
                <property name="name" nameId="tpck.1169194664001" value="mult" />
              </node>
            </node>
            <node role="variable" roleId="qjd.8360767178776358704" type="qjd.LetVariable" typeId="qjd.8360767178776325736" id="816130369292750478" nodeInfo="ng">
              <property name="name" nameId="tpck.1169194664001" value="sum" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </root>
  <root type="qjd.Program" typeId="qjd.4022026349915669385" id="816130369292806252" nodeInfo="ng">
    <property name="name" nameId="tpck.1169194664001" value="letlet" />
    <node role="expression" roleId="qjd.4022026349915669386" type="qjd.LetExpression" typeId="qjd.4939219901991602079" id="816130369292806253" nodeInfo="ng">
      <node role="value" roleId="qjd.4939219901991602080" type="qjd.NumericConstant" typeId="qjd.4022026349914762709" id="816130369292806254" nodeInfo="ng">
        <property name="value" nameId="qjd.4022026349914762710" value="1" />
      </node>
      <node role="expression" roleId="qjd.4939219901991602081" type="qjd.LetExpression" typeId="qjd.4939219901991602079" id="816130369292806255" nodeInfo="ng">
        <node role="value" roleId="qjd.4939219901991602080" type="qjd.NumericConstant" typeId="qjd.4022026349914762709" id="816130369292806256" nodeInfo="ng">
          <property name="value" nameId="qjd.4022026349914762710" value="2" />
        </node>
        <node role="expression" roleId="qjd.4939219901991602081" type="qjd.AddOperation" typeId="qjd.1934341835352312169" id="816130369292806257" nodeInfo="ng">
          <node role="right" roleId="qjd.1934341835352312157" type="qjd.LetRef" typeId="qjd.4939219901992083820" id="816130369292806258" nodeInfo="ng">
            <link role="variable" roleId="qjd.8981808925914862844" targetNodeId="816130369292806260" resolveInfo="q2" />
          </node>
          <node role="left" roleId="qjd.1934341835352312156" type="qjd.LetRef" typeId="qjd.4939219901992083820" id="816130369292806259" nodeInfo="ng">
            <link role="variable" roleId="qjd.8981808925914862844" targetNodeId="816130369292806261" resolveInfo="q1" />
          </node>
        </node>
        <node role="variable" roleId="qjd.8360767178776358704" type="qjd.LetVariable" typeId="qjd.8360767178776325736" id="816130369292806260" nodeInfo="ng">
          <property name="name" nameId="tpck.1169194664001" value="q2" />
        </node>
      </node>
      <node role="variable" roleId="qjd.8360767178776358704" type="qjd.LetVariable" typeId="qjd.8360767178776325736" id="816130369292806261" nodeInfo="ng">
        <property name="name" nameId="tpck.1169194664001" value="q1" />
      </node>
    </node>
  </root>
</model>

