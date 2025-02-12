package jetbrains.mps.traceInfo;

/*Generated by MPS */

import org.jetbrains.annotations.NotNull;
import org.jdom.Element;
import org.jdom.DataConversionException;
import org.jdom.Attribute;

public class UnitPositionInfo extends PositionInfo {
  private static final String UNIT_NAME = "unitName";
  private String myUnitName;

  public UnitPositionInfo() {
  }

  public UnitPositionInfo(@NotNull Element element) throws DataConversionException {
    super(element);
    myUnitName = check_9jw0bh_a0b0d(element.getAttribute(UnitPositionInfo.UNIT_NAME));
  }

  @Override
  public void saveTo(Element element) {
    super.saveTo(element);
    if (myUnitName != null) {
      element.setAttribute(UNIT_NAME, myUnitName);
    }
  }

  public String getUnitName() {
    return myUnitName;
  }

  public void setUnitName(String unitName) {
    myUnitName = unitName;
  }

  @Override
  public int compareTo(PositionInfo p) {
    UnitPositionInfo upi = (UnitPositionInfo) p;
    int compareTo = super.compareTo(upi);
    if (compareTo != 0) {
      return compareTo;
    }
    if (myUnitName == null) {
      if (upi.myUnitName == null) {
        return 0;
      }
      return 1;
    }
    if (upi.myUnitName == null) {
      return -1;
    }
    return myUnitName.compareTo(upi.myUnitName);
  }

  private static String check_9jw0bh_a0b0d(Attribute checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getValue();
    }
    return null;
  }
}
