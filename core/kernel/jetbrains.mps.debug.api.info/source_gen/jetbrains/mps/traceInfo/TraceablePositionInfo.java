package jetbrains.mps.traceInfo;

/*Generated by MPS */

import org.jdom.Element;
import org.jdom.DataConversionException;
import jetbrains.mps.util.InternUtil;
import org.jetbrains.annotations.Nullable;
import org.jdom.Attribute;

public class TraceablePositionInfo extends PositionInfo {
  private static String CONCEPT_FQ_NAME = "conceptFqName";
  private static String PROPERTY_STRING = "propertyString";
  private String myConceptFqName;
  private String myPropertyString;

  public TraceablePositionInfo() {
  }

  public TraceablePositionInfo(Element element) throws DataConversionException {
    super(element);
    myConceptFqName = InternUtil.intern(check_cke0sr_a0a1a5(element.getAttribute(CONCEPT_FQ_NAME)));
    myPropertyString = element.getAttributeValue(PROPERTY_STRING);
  }

  @Override
  public void saveTo(Element element) {
    super.saveTo(element);
    if (myConceptFqName != null) {
      element.setAttribute(CONCEPT_FQ_NAME, myConceptFqName);
    }
    if (myPropertyString != null) {
      element.setAttribute(PROPERTY_STRING, myPropertyString);
    }

  }

  @Nullable
  public String getConceptFqName() {
    return myConceptFqName;
  }

  public void setConceptFqName(String conceptFqName) {
    myConceptFqName = InternUtil.intern(conceptFqName);
  }

  public String getPropertyString() {
    return myPropertyString;
  }

  public void setPropertyString(String propertyString) {
    myPropertyString = propertyString;
  }

  @Override
  public int compareTo(PositionInfo p) {
    int result = super.compareTo(p);
    if (result != 0) {
      return result;
    }
    assert p instanceof TraceablePositionInfo;
    TraceablePositionInfo tpi = (TraceablePositionInfo) p;
    if (myConceptFqName != null) {
      result = myConceptFqName.compareTo(tpi.myConceptFqName);
      if (result != 0) {
        return result;
      }
    }
    if (myPropertyString != null) {
      return myPropertyString.compareTo(tpi.myPropertyString);
    }
    if (tpi.myConceptFqName == null && tpi.myPropertyString == null) {
      return 0;
    }
    return -1;
  }

  private static String check_cke0sr_a0a1a5(Attribute checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getValue();
    }
    return null;
  }
}
