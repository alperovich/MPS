<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:5dd83915-41f7-4078-8c06-e9d19fdeceb5(jetbrains.mps.core.baseLanguage.constructors.sandbox.test2)">
  <persistence version="8" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="0ae47ad3-5abd-486c-ac0f-298884f39393(jetbrains.mps.baseLanguage.constructors)" />
  <import index="ar19" modelUID="f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.awt.geom(JDK/java.awt.geom@java_stub)" version="-1" />
  <import index="e2lb" modelUID="f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(JDK/java.lang@java_stub)" version="-1" />
  <import index="fxg7" modelUID="f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.io(JDK/java.io@java_stub)" version="-1" />
  <import index="fbxt" modelUID="r:bd4b8fd9-079b-4b11-a733-9c0bea3600f2(jetbrains.mps.baseLanguage.constructors.structure)" version="0" implicit="yes" />
  <import index="tpee" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="4" implicit="yes" />
  <import index="tpck" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <root type="tpee.ClassConcept" typeId="tpee.1068390468198" id="3391577739832808340" nodeInfo="ig">
    <property name="name" nameId="tpck.1169194664001" value="test" />
    <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="3391577739832808341" nodeInfo="nn" />
    <node role="member" roleId="tpee.5375687026011219971" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="3391577739832808342" nodeInfo="igu">
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="3391577739832808343" nodeInfo="in" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="3391577739832808344" nodeInfo="nn" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="3391577739832808345" nodeInfo="sn" />
    </node>
    <node role="member" roleId="tpee.5375687026011219971" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="3391577739832808354" nodeInfo="igu">
      <property name="name" nameId="tpck.1169194664001" value="main" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="3391577739832808355" nodeInfo="in" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="3391577739832808356" nodeInfo="nn" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="3391577739832808357" nodeInfo="sn">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="3391577739832808402" nodeInfo="nn">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="3391577739832808403" nodeInfo="nr">
            <property name="name" nameId="tpck.1169194664001" value="r" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3391577739832808404" nodeInfo="in">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="ar19.~Rectangle2D" resolveInfo="Rectangle2D" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="fbxt.CustomConstructorUsage" typeId="fbxt.6820702584719416486" id="4867628140900395507" nodeInfo="nn">
              <link role="customConstructor" roleId="fbxt.6820702584719569331" targetNodeId="4413962600136184953" resolveInfo="Rectangle" />
              <node role="element" roleId="fbxt.6820702584719569344" type="fbxt.CustomConstructorUsage" typeId="fbxt.6820702584719416486" id="4867628140900395508" nodeInfo="nn">
                <link role="customConstructor" roleId="fbxt.6820702584719569331" targetNodeId="4413962600136177712" resolveInfo="Point" />
                <node role="element" roleId="fbxt.6820702584719569344" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="4867628140900395509" nodeInfo="nn">
                  <property name="value" nameId="tpee.1068580320021" value="2" />
                </node>
                <node role="element" roleId="fbxt.6820702584719569344" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="4867628140900395511" nodeInfo="nn">
                  <property name="value" nameId="tpee.1068580320021" value="3" />
                </node>
              </node>
              <node role="element" roleId="fbxt.6820702584719569344" type="fbxt.CustomConstructorUsage" typeId="fbxt.6820702584719416486" id="4867628140900395513" nodeInfo="nn">
                <link role="customConstructor" roleId="fbxt.6820702584719569331" targetNodeId="4413962600136177712" resolveInfo="Point" />
                <node role="element" roleId="fbxt.6820702584719569344" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="4867628140900395514" nodeInfo="nn">
                  <property name="value" nameId="tpee.1068580320021" value="4" />
                </node>
                <node role="element" roleId="fbxt.6820702584719569344" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="4867628140900395516" nodeInfo="nn">
                  <property name="value" nameId="tpee.1068580320021" value="6" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3391577739832808424" nodeInfo="nn">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3391577739832809101" nodeInfo="nn">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="3391577739832808425" nodeInfo="nn">
              <link role="classifier" roleId="tpee.1144433057691" targetNodeId="e2lb.~System" resolveInfo="System" />
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="e2lb.~System%dout" resolveInfo="out" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3391577739832809105" nodeInfo="nn">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~PrintStream%dprintln(java%dlang%dObject)%cvoid" resolveInfo="println" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.VariableReference" typeId="tpee.1068498886296" id="4265636116363090812" nodeInfo="nn">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3391577739832808403" resolveInfo="r" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="3391577739832809137" nodeInfo="ir">
        <property name="name" nameId="tpck.1169194664001" value="args" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ArrayType" typeId="tpee.1070534760951" id="3391577739832809147" nodeInfo="in">
          <node role="componentType" roleId="tpee.1070534760952" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3391577739832809138" nodeInfo="in">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" resolveInfo="String" />
          </node>
        </node>
      </node>
    </node>
  </root>
  <root type="fbxt.CustomConstructorContainer" typeId="fbxt.526936149311701953" id="4413962600136177711" nodeInfo="ng">
    <property name="name" nameId="tpck.1169194664001" value="Rectangle" />
    <node role="constructors" roleId="fbxt.3041831561922340678" type="fbxt.CustomConstructor" typeId="fbxt.526936149311701954" id="4413962600136177712" nodeInfo="ng">
      <property name="name" nameId="tpck.1169194664001" value="Point" />
      <property name="rightParenthesis" nameId="fbxt.3330196687714050065" value="}" />
      <property name="leftParenthesis" nameId="fbxt.3330196687714050064" value="{" />
      <property name="separator" nameId="fbxt.3330196687714050063" value="," />
      <node role="returnType" roleId="fbxt.3330196687714050067" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="4413962600136180686" nodeInfo="in">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="ar19.~Point2D" resolveInfo="Point2D" />
      </node>
      <node role="arguments" roleId="fbxt.5379647004618201111" type="fbxt.CustomArgumentClause" typeId="fbxt.5379647004618176186" id="4413962600136180680" nodeInfo="ng">
        <node role="parameter" roleId="fbxt.5379647004618201121" type="fbxt.CustomConstructorParameter" typeId="fbxt.5379647004618201113" id="4413962600136180681" nodeInfo="ng">
          <property name="name" nameId="tpck.1169194664001" value="x" />
          <node role="type" roleId="fbxt.5379647004618207272" type="tpee.DoubleType" typeId="tpee.1070534513062" id="4413962600136180682" nodeInfo="in" />
        </node>
        <node role="parameter" roleId="fbxt.5379647004618201121" type="fbxt.CustomConstructorParameter" typeId="fbxt.5379647004618201113" id="4413962600136180683" nodeInfo="ng">
          <property name="name" nameId="tpck.1169194664001" value="y" />
          <node role="type" roleId="fbxt.5379647004618207272" type="tpee.DoubleType" typeId="tpee.1070534513062" id="4413962600136180685" nodeInfo="in" />
        </node>
      </node>
      <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="4413962600136177715" nodeInfo="sn">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="4413962600136180687" nodeInfo="nn">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="4413962600136180689" nodeInfo="nn">
            <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="4413962600136184949" nodeInfo="nn">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="ar19.~Point2D$Double%d&lt;init&gt;(double,double)" resolveInfo="Point2D.Double" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="fbxt.ListParameterReference" typeId="fbxt.4739047193854255783" id="4413962600136184950" nodeInfo="nn">
                <link role="parameter" roleId="fbxt.5379647004618378853" targetNodeId="4413962600136180681" resolveInfo="x" />
              </node>
              <node role="actualArgument" roleId="tpee.1068499141038" type="fbxt.CustomConstructorParameterReference" typeId="fbxt.5379647004618378852" id="4413962600136184952" nodeInfo="nn">
                <link role="parameter" roleId="fbxt.5379647004618378853" targetNodeId="4413962600136180683" resolveInfo="y" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="constructors" roleId="fbxt.3041831561922340678" type="fbxt.CustomConstructor" typeId="fbxt.526936149311701954" id="4413962600136184953" nodeInfo="ng">
      <property name="name" nameId="tpck.1169194664001" value="Rectangle" />
      <property name="rightParenthesis" nameId="fbxt.3330196687714050065" value="]" />
      <property name="leftParenthesis" nameId="fbxt.3330196687714050064" value="[" />
      <property name="separator" nameId="fbxt.3330196687714050063" value="&gt;" />
      <node role="returnType" roleId="fbxt.3330196687714050067" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="4413962600136184963" nodeInfo="in">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="ar19.~Rectangle2D" resolveInfo="Rectangle2D" />
      </node>
      <node role="arguments" roleId="fbxt.5379647004618201111" type="fbxt.CustomArgumentClause" typeId="fbxt.5379647004618176186" id="4413962600136184957" nodeInfo="ng">
        <node role="parameter" roleId="fbxt.5379647004618201121" type="fbxt.CustomConstructorParameter" typeId="fbxt.5379647004618201113" id="4413962600136184958" nodeInfo="ng">
          <property name="name" nameId="tpck.1169194664001" value="topleft" />
          <node role="type" roleId="fbxt.5379647004618207272" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="4413962600136184959" nodeInfo="in">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="ar19.~Point2D" resolveInfo="Point2D" />
          </node>
        </node>
        <node role="parameter" roleId="fbxt.5379647004618201121" type="fbxt.CustomConstructorParameter" typeId="fbxt.5379647004618201113" id="4413962600136184960" nodeInfo="ng">
          <property name="name" nameId="tpck.1169194664001" value="bottomright" />
          <node role="type" roleId="fbxt.5379647004618207272" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="4413962600136184962" nodeInfo="in">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="ar19.~Point2D" resolveInfo="Point2D" />
          </node>
        </node>
      </node>
      <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="4413962600136184956" nodeInfo="sn">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="4413962600136184983" nodeInfo="nn">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="4413962600136184984" nodeInfo="nr">
            <property name="name" nameId="tpck.1169194664001" value="x" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.DoubleType" typeId="tpee.1070534513062" id="4413962600136184985" nodeInfo="in" />
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4413962600136184986" nodeInfo="nn">
              <node role="operand" roleId="tpee.1197027771414" type="fbxt.ListParameterReference" typeId="fbxt.4739047193854255783" id="4413962600136184987" nodeInfo="nn">
                <link role="parameter" roleId="fbxt.5379647004618378853" targetNodeId="4413962600136184958" resolveInfo="topleft" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="4413962600136184988" nodeInfo="nn">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="ar19.~Point2D%dgetX()%cdouble" resolveInfo="getX" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="4413962600136184990" nodeInfo="nn">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="4413962600136184991" nodeInfo="nr">
            <property name="name" nameId="tpck.1169194664001" value="y" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.DoubleType" typeId="tpee.1070534513062" id="4413962600136184992" nodeInfo="in" />
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4413962600136184993" nodeInfo="nn">
              <node role="operand" roleId="tpee.1197027771414" type="fbxt.ListParameterReference" typeId="fbxt.4739047193854255783" id="4413962600136184994" nodeInfo="nn">
                <link role="parameter" roleId="fbxt.5379647004618378853" targetNodeId="4413962600136184958" resolveInfo="topleft" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="4413962600136184995" nodeInfo="nn">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="ar19.~Point2D%dgetY()%cdouble" resolveInfo="getY" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="4413962600136184964" nodeInfo="nn">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="4413962600136184966" nodeInfo="nn">
            <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="4413962600136184968" nodeInfo="nn">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="ar19.~Rectangle2D$Double%d&lt;init&gt;(double,double,double,double)" resolveInfo="Rectangle2D.Double" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.VariableReference" typeId="tpee.1068498886296" id="4265636116363066424" nodeInfo="nn">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4413962600136184984" resolveInfo="x" />
              </node>
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.VariableReference" typeId="tpee.1068498886296" id="4265636116363084227" nodeInfo="nn">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4413962600136184991" resolveInfo="y" />
              </node>
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.MinusExpression" typeId="tpee.1068581242869" id="4413962600136184998" nodeInfo="nn">
                <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4413962600136185018" nodeInfo="nn">
                  <node role="operand" roleId="tpee.1197027771414" type="fbxt.ListParameterReference" typeId="fbxt.4739047193854255783" id="4413962600136185019" nodeInfo="nn">
                    <link role="parameter" roleId="fbxt.5379647004618378853" targetNodeId="4413962600136184960" resolveInfo="bottomright" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="4413962600136185020" nodeInfo="nn">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="ar19.~Point2D%dgetX()%cdouble" resolveInfo="getX" />
                  </node>
                </node>
                <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.VariableReference" typeId="tpee.1068498886296" id="4265636116363102556" nodeInfo="nn">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4413962600136184984" resolveInfo="x" />
                </node>
              </node>
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.MinusExpression" typeId="tpee.1068581242869" id="4413962600136185009" nodeInfo="nn">
                <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4413962600136185022" nodeInfo="nn">
                  <node role="operand" roleId="tpee.1197027771414" type="fbxt.ListParameterReference" typeId="fbxt.4739047193854255783" id="4413962600136185023" nodeInfo="nn">
                    <link role="parameter" roleId="fbxt.5379647004618378853" targetNodeId="4413962600136184960" resolveInfo="bottomright" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="4413962600136185024" nodeInfo="nn">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="ar19.~Point2D%dgetY()%cdouble" resolveInfo="getY" />
                  </node>
                </node>
                <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.VariableReference" typeId="tpee.1068498886296" id="4265636116363092162" nodeInfo="nn">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4413962600136184991" resolveInfo="y" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </root>
</model>

