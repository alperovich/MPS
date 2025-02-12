package jetbrains.mps.lang.structure.structure;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;

public enum AnnotationLinkStereotype {
  node("node", "node"),
  link("link", "link"),
  property("property", "property");

  private String myName;

  public String getName() {
    return this.myName;
  }

  public String getValueAsString() {
    return this.myValue;
  }

  public static List<AnnotationLinkStereotype> getConstants() {
    List<AnnotationLinkStereotype> list = ListSequence.fromList(new LinkedList<AnnotationLinkStereotype>());
    ListSequence.fromList(list).addElement(AnnotationLinkStereotype.node);
    ListSequence.fromList(list).addElement(AnnotationLinkStereotype.link);
    ListSequence.fromList(list).addElement(AnnotationLinkStereotype.property);
    return list;
  }

  public static AnnotationLinkStereotype getDefault() {
    return AnnotationLinkStereotype.node;
  }

  public static AnnotationLinkStereotype parseValue(String value) {
    if (value == null) {
      return AnnotationLinkStereotype.getDefault();
    }
    if (value.equals(AnnotationLinkStereotype.node.getValueAsString())) {
      return AnnotationLinkStereotype.node;
    }
    if (value.equals(AnnotationLinkStereotype.link.getValueAsString())) {
      return AnnotationLinkStereotype.link;
    }
    if (value.equals(AnnotationLinkStereotype.property.getValueAsString())) {
      return AnnotationLinkStereotype.property;
    }
    return AnnotationLinkStereotype.getDefault();
  }

  private String myValue;

  AnnotationLinkStereotype(String name, String value) {
    this.myName = name;
    this.myValue = value;
  }

  public String getValue() {
    return this.myValue;
  }
}
