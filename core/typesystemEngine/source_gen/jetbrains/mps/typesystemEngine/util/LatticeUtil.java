package jetbrains.mps.typesystemEngine.util;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import java.util.Set;
import java.util.Iterator;
import java.util.HashSet;
import java.util.List;

public class LatticeUtil {
  public LatticeUtil() {
  }

  private static void processMeetsAndJoins(SNode node) {
    {
      SNode joinType = node;
      if (SNodeOperations.isInstanceOf(joinType, "jetbrains.mps.lang.typesystem.structure.JoinType")) {
        for (SNode child : SLinkOperations.getTargets(joinType, "argument", true)) {
          processMeetsAndJoins(child);
          {
            SNode childJoinType = child;
            if (SNodeOperations.isInstanceOf(childJoinType, "jetbrains.mps.lang.typesystem.structure.JoinType")) {
              for (SNode grandChild : SLinkOperations.getTargets(childJoinType, "argument", true)) {
                SNodeOperations.detachNode(grandChild);
                ListSequence.fromList(SLinkOperations.getTargets(joinType, "argument", true)).addElement(grandChild);
              }
              SNodeOperations.deleteNode(child);
            }
          }
        }
      }
    }
    {
      SNode meetType = node;
      if (SNodeOperations.isInstanceOf(meetType, "jetbrains.mps.lang.typesystem.structure.MeetType")) {
        for (SNode child : SLinkOperations.getTargets(meetType, "argument", true)) {
          processMeetsAndJoins(child);
          {
            SNode childMeetType = child;
            if (SNodeOperations.isInstanceOf(childMeetType, "jetbrains.mps.lang.typesystem.structure.MeetType")) {
              for (SNode grandChild : SLinkOperations.getTargets(childMeetType, "argument", true)) {
                SNodeOperations.detachNode(grandChild);
                ListSequence.fromList(SLinkOperations.getTargets(meetType, "argument", true)).addElement(grandChild);
              }
              SNodeOperations.deleteNode(child);
            }
          }
        }
      }
    }
  }

  private static SNode join(SNode node1, SNode node2) {
    SNode joinType = SConceptOperations.createNewNode("jetbrains.mps.lang.typesystem.structure.JoinType", null);
    if (SNodeOperations.isInstanceOf(node1, "jetbrains.mps.lang.typesystem.structure.JoinType")) {
      SNode joinWrapper1 = SNodeOperations.cast(node1, "jetbrains.mps.lang.typesystem.structure.JoinType");
      for (SNode bc : SLinkOperations.getTargets(joinWrapper1, "argument", true)) {
        ListSequence.fromList(SLinkOperations.getTargets(joinType, "argument", true)).addElement(HUtil.copyIfNecessary(bc));
      }
      if (SNodeOperations.isInstanceOf(node2, "jetbrains.mps.lang.typesystem.structure.JoinType")) {
        SNode joinWrapper2 = SNodeOperations.cast(node2, "jetbrains.mps.lang.typesystem.structure.JoinType");
        for (SNode bc : SLinkOperations.getTargets(joinWrapper2, "argument", true)) {
          ListSequence.fromList(SLinkOperations.getTargets(joinType, "argument", true)).addElement(HUtil.copyIfNecessary(bc));
        }
      } else {
        ListSequence.fromList(SLinkOperations.getTargets(joinType, "argument", true)).addElement(HUtil.copyIfNecessary(node2));
      }
    } else
    if (SNodeOperations.isInstanceOf(node2, "jetbrains.mps.lang.typesystem.structure.JoinType")) {
      SNode joinWrapper2 = SNodeOperations.cast(node2, "jetbrains.mps.lang.typesystem.structure.JoinType");
      ListSequence.fromList(SLinkOperations.getTargets(joinType, "argument", true)).addElement(HUtil.copyIfNecessary(node1));
      for (SNode bc : SLinkOperations.getTargets(joinWrapper2, "argument", true)) {
        ListSequence.fromList(SLinkOperations.getTargets(joinType, "argument", true)).addElement(HUtil.copyIfNecessary(bc));
      }
    } else {
      ListSequence.fromList(SLinkOperations.getTargets(joinType, "argument", true)).addElement(HUtil.copyIfNecessary(node1));
      ListSequence.fromList(SLinkOperations.getTargets(joinType, "argument", true)).addElement(HUtil.copyIfNecessary(node2));
    }
    return joinType;
  }

  private static SNode meet(SNode node1, SNode node2) {
    SNode meetType = SConceptOperations.createNewNode("jetbrains.mps.lang.typesystem.structure.MeetType", null);
    if (SNodeOperations.isInstanceOf(node1, "jetbrains.mps.lang.typesystem.structure.MeetType")) {
      SNode meetWrapper1 = SNodeOperations.cast(node1, "jetbrains.mps.lang.typesystem.structure.MeetType");
      for (SNode bc : SLinkOperations.getTargets(meetWrapper1, "argument", true)) {
        ListSequence.fromList(SLinkOperations.getTargets(meetType, "argument", true)).addElement(HUtil.copyIfNecessary(bc));
      }
      if (SNodeOperations.isInstanceOf(node2, "jetbrains.mps.lang.typesystem.structure.MeetType")) {
        SNode meetWrapper2 = SNodeOperations.cast(node2, "jetbrains.mps.lang.typesystem.structure.MeetType");
        for (SNode bc : SLinkOperations.getTargets(meetWrapper2, "argument", true)) {
          ListSequence.fromList(SLinkOperations.getTargets(meetType, "argument", true)).addElement(HUtil.copyIfNecessary(bc));
        }
      } else {
        ListSequence.fromList(SLinkOperations.getTargets(meetType, "argument", true)).addElement(HUtil.copyIfNecessary(node2));
      }
    } else
    if (SNodeOperations.isInstanceOf(node2, "jetbrains.mps.lang.typesystem.structure.MeetType")) {
      SNode meetWrapper2 = SNodeOperations.cast(node2, "jetbrains.mps.lang.typesystem.structure.MeetType");
      ListSequence.fromList(SLinkOperations.getTargets(meetType, "argument", true)).addElement(HUtil.copyIfNecessary(node1));
      for (SNode bc : SLinkOperations.getTargets(meetWrapper2, "argument", true)) {
        ListSequence.fromList(SLinkOperations.getTargets(meetType, "argument", true)).addElement(HUtil.copyIfNecessary(bc));
      }
    } else {
      ListSequence.fromList(SLinkOperations.getTargets(meetType, "argument", true)).addElement(HUtil.copyIfNecessary(node1));
      ListSequence.fromList(SLinkOperations.getTargets(meetType, "argument", true)).addElement(HUtil.copyIfNecessary(node2));
    }
    return meetType;
  }

  public static SNode joinNodes(Set<SNode> nodes) {
    if (nodes.isEmpty()) {
      return null;
    }
    if (nodes.size() == 1) {
      return nodes.iterator().next();
    }
    Iterator<SNode> iterator = nodes.iterator();
    SNode node1 = iterator.next();
    SNode node2 = iterator.next();
    Set<SNode> result = new HashSet<SNode>(nodes);
    result.remove(node1);
    result.remove(node2);
    result.add(join(node1, node2));
    return joinNodes(result);
  }

  public static SNode meetNodes(Set<SNode> nodes) {
    if (nodes.isEmpty()) {
      return null;
    }
    if (nodes.size() == 1) {
      return nodes.iterator().next();
    }
    Iterator<SNode> iterator = nodes.iterator();
    SNode node1 = iterator.next();
    SNode node2 = iterator.next();
    Set<SNode> result = new HashSet<SNode>(nodes);
    result.remove(node1);
    result.remove(node2);
    result.add(meet(node1, node2));
    return meetNodes(result);
  }

  public static boolean isMeet(SNode node) {
    return SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.typesystem.structure.MeetType");
  }

  public static boolean isJoin(SNode node) {
    return SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.typesystem.structure.JoinType");
  }

  public static boolean isPolymorphic(SNode node) {
    return SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.typesystem.structure.MeetType") || SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.typesystem.structure.JoinType") || SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.UpperBoundType") || SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.LowerBoundType");
  }

  public static List<SNode> getMeetArguments(SNode meet) {
    return SLinkOperations.getTargets(SNodeOperations.as(meet, "jetbrains.mps.lang.typesystem.structure.MeetType"), "argument", true);
  }

  public static List<SNode> getJoinArguments(SNode join) {
    return SLinkOperations.getTargets(SNodeOperations.as(join, "jetbrains.mps.lang.typesystem.structure.JoinType"), "argument", true);
  }
}
