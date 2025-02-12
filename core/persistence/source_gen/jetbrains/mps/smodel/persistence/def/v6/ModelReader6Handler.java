package jetbrains.mps.smodel.persistence.def.v6;

/*Generated by MPS */

import jetbrains.mps.util.xml.XMLSAXHandler;
import jetbrains.mps.smodel.loading.ModelLoadResult;
import java.util.Stack;
import org.xml.sax.Locator;
import jetbrains.mps.smodel.loading.ModelLoadingState;
import jetbrains.mps.smodel.SModelHeader;
import jetbrains.mps.smodel.DefaultSModel;
import org.xml.sax.SAXException;
import org.xml.sax.Attributes;
import org.xml.sax.SAXParseException;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.util.xml.BreakParseSAXException;
import jetbrains.mps.smodel.LazySNode;
import jetbrains.mps.util.InternUtil;
import org.jetbrains.mps.openapi.model.SNodeId;
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;
import org.apache.log4j.Priority;
import org.jetbrains.mps.openapi.model.SReference;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class ModelReader6Handler extends XMLSAXHandler<ModelLoadResult> {
  private static String[] EMPTY_ARRAY = new String[0];
  private ModelReader6Handler.ModelElementHandler modelhandler = new ModelReader6Handler.ModelElementHandler();
  private ModelReader6Handler.PersistenceElementHandler persistencehandler = new ModelReader6Handler.PersistenceElementHandler();
  private ModelReader6Handler.Tag_with_namespaceElementHandler tag_with_namespacehandler = new ModelReader6Handler.Tag_with_namespaceElementHandler();
  private ModelReader6Handler.ImportElementHandler importhandler = new ModelReader6Handler.ImportElementHandler();
  private ModelReader6Handler.Root_stubsElementHandler root_stubshandler = new ModelReader6Handler.Root_stubsElementHandler();
  private ModelReader6Handler.NodeElementHandler nodehandler = new ModelReader6Handler.NodeElementHandler();
  private ModelReader6Handler.PropertyElementHandler propertyhandler = new ModelReader6Handler.PropertyElementHandler();
  private ModelReader6Handler.LinkElementHandler linkhandler = new ModelReader6Handler.LinkElementHandler();
  private Stack<ModelReader6Handler.ElementHandler> myHandlersStack = new Stack<ModelReader6Handler.ElementHandler>();
  private Stack<ModelReader6Handler.ChildHandler> myChildHandlersStack = new Stack<ModelReader6Handler.ChildHandler>();
  private Stack<Object> myValues = new Stack<Object>();
  private Locator myLocator;
  private ModelLoadResult myResult;
  private ModelLoadingState fieldtoState;
  private SModelHeader fieldheader;
  private DefaultSModel fieldmodel;
  private VersionUtil fieldhelper;

  public ModelReader6Handler(ModelLoadingState toState, SModelHeader header) {
    fieldtoState = toState;
    fieldheader = header;
  }

  public ModelLoadResult getResult() {
    return myResult;
  }

  @Override
  public void setDocumentLocator(Locator locator) {
    myLocator = locator;
  }

  @Override
  public void characters(char[] array, int start, int len) throws SAXException {
    ModelReader6Handler.ElementHandler current = (myHandlersStack.empty() ?
      (ModelReader6Handler.ElementHandler) null :
      myHandlersStack.peek()
    );
    if (current != null) {
      current.handleText(myValues.peek(), new String(array, start, len));
    }
  }

  @Override
  public void endElement(String uri, String localName, String qName) throws SAXException {
    ModelReader6Handler.ElementHandler current = myHandlersStack.pop();
    Object childValue = myValues.pop();
    current.validate(childValue);
    if (myChildHandlersStack.empty()) {
      myResult = (ModelLoadResult) childValue;
    } else {
      ModelReader6Handler.ChildHandler ch = myChildHandlersStack.pop();
      if (ch != null) {
        ch.apply(myValues.peek(), childValue);
      }
    }
  }

  @Override
  public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
    ModelReader6Handler.ElementHandler current = (myHandlersStack.empty() ?
      (ModelReader6Handler.ElementHandler) null :
      myHandlersStack.peek()
    );
    if (current == null) {
      // root 
      current = modelhandler;
    } else {
      current = current.createChild(myValues.peek(), qName, attributes);
    }

    // check required 
    for (String attr : current.requiredAttributes()) {
      if (attributes.getValue(attr) == null) {
        throw new SAXParseException("attribute " + attr + " is absent", null);
      }
    }

    Object result = current.createObject(attributes);
    if (myHandlersStack.empty()) {
      myResult = (ModelLoadResult) result;
    }

    // handle attributes 
    for (int i = 0; i < attributes.getLength(); i++) {
      String name = attributes.getQName(i);
      String value = attributes.getValue(i);
      current.handleAttribute(result, name, value);
    }
    myHandlersStack.push(current);
    myValues.push(result);
  }

  private static interface ChildHandler {
    public void apply(Object resultObject, Object value) throws SAXException;
  }

  private class ElementHandler {
    private ElementHandler() {
    }

    protected Object createObject(Attributes attrs) throws SAXException {
      return null;
    }

    protected void handleAttribute(Object resultObject, String name, String value) throws SAXException {
    }

    protected ModelReader6Handler.ElementHandler createChild(Object resultObject, String tagName, Attributes attrs) throws SAXException {
      throw new SAXParseException("unknown tag: " + tagName, null);
    }

    protected void handleText(Object resultObject, String value) throws SAXException {
      if (value.trim().length() == 0) {
        return;
      }
      throw new SAXParseException("text is not accepted: '" + value + "'", null);
    }

    protected String[] requiredAttributes() {
      return ModelReader6Handler.EMPTY_ARRAY;
    }

    protected void validate(Object resultObject) throws SAXException {
    }
  }

  public class ModelElementHandler extends ModelReader6Handler.ElementHandler {
    private String[] requiredAttributes = new String[]{"modelUID"};

    public ModelElementHandler() {
    }

    @Override
    protected ModelLoadResult createObject(Attributes attrs) throws SAXException {
      fieldmodel = new DefaultSModel(PersistenceFacade.getInstance().createModelReference(attrs.getValue("modelUID")));
      fieldmodel.setPersistenceVersion(6);
      fieldmodel.getSModelHeader().updateDefaults(fieldheader);
      fieldhelper = new VersionUtil(fieldmodel.getReference());
      return new ModelLoadResult(fieldmodel, ModelLoadingState.NOT_LOADED);
    }

    @Override
    protected String[] requiredAttributes() {
      return requiredAttributes;
    }

    @Override
    protected void handleAttribute(Object resultObject, String name, String value) throws SAXException {
      ModelLoadResult result = (ModelLoadResult) resultObject;
      if ("modelUID".equals(name)) {
        return;
      }
      super.handleAttribute(resultObject, name, value);
    }

    @Override
    protected ModelReader6Handler.ElementHandler createChild(Object resultObject, String tagName, Attributes attrs) throws SAXException {
      if ("persistence".equals(tagName)) {
        myChildHandlersStack.push(null);
        return persistencehandler;
      }
      if ("language".equals(tagName)) {
        myChildHandlersStack.push(new ModelReader6Handler.ChildHandler() {
          @Override
          public void apply(Object resultObject, Object value) throws SAXException {
            handleChild_7319439566871678401(resultObject, value);
          }
        });
        return tag_with_namespacehandler;
      }
      if ("language-engaged-on-generation".equals(tagName)) {
        myChildHandlersStack.push(new ModelReader6Handler.ChildHandler() {
          @Override
          public void apply(Object resultObject, Object value) throws SAXException {
            handleChild_7319439566871678410(resultObject, value);
          }
        });
        return tag_with_namespacehandler;
      }
      if ("devkit".equals(tagName)) {
        myChildHandlersStack.push(new ModelReader6Handler.ChildHandler() {
          @Override
          public void apply(Object resultObject, Object value) throws SAXException {
            handleChild_7319439566871678419(resultObject, value);
          }
        });
        return tag_with_namespacehandler;
      }
      if ("import".equals(tagName)) {
        myChildHandlersStack.push(new ModelReader6Handler.ChildHandler() {
          @Override
          public void apply(Object resultObject, Object value) throws SAXException {
            handleChild_7319439566871678428(resultObject, value);
          }
        });
        return importhandler;
      }
      if ("node".equals(tagName)) {
        myChildHandlersStack.push(new ModelReader6Handler.ChildHandler() {
          @Override
          public void apply(Object resultObject, Object value) throws SAXException {
            handleChild_7319439566871678452(resultObject, value);
          }
        });
        return nodehandler;
      }
      if ("root_stubs".equals(tagName)) {
        myChildHandlersStack.push(new ModelReader6Handler.ChildHandler() {
          @Override
          public void apply(Object resultObject, Object value) throws SAXException {
            handleChild_4813471910141063838(resultObject, value);
          }
        });
        return root_stubshandler;
      }
      return super.createChild(resultObject, tagName, attrs);
    }

    private void handleChild_7319439566871678401(Object resultObject, Object value) throws SAXException {
      String child = (String) value;
      fieldmodel.addLanguage(PersistenceFacade.getInstance().createModuleReference(child));
    }

    private void handleChild_7319439566871678410(Object resultObject, Object value) throws SAXException {
      String child = (String) value;
      fieldmodel.addEngagedOnGenerationLanguage(PersistenceFacade.getInstance().createModuleReference(child));
    }

    private void handleChild_7319439566871678419(Object resultObject, Object value) throws SAXException {
      String child = (String) value;
      fieldmodel.addDevKit(PersistenceFacade.getInstance().createModuleReference(child));
    }

    private void handleChild_7319439566871678428(Object resultObject, Object value) throws SAXException {
      String[] child = (String[]) value;
      fieldhelper.addImport(fieldmodel, child[0], child[1], Integer.parseInt(child[2]), child[3] != null);
    }

    private void handleChild_7319439566871678452(Object resultObject, Object value) throws SAXException {
      SNode child = (SNode) value;
      if (child != null) {
        fieldmodel.addRootNode(child);
      }
    }

    private void handleChild_4813471910141063838(Object resultObject, Object value) throws SAXException {
      ModelLoadResult result = (ModelLoadResult) resultObject;
      Object child = (Object) value;
      if (fieldtoState == ModelLoadingState.INTERFACE_LOADED) {
        result.setState(ModelLoadingState.INTERFACE_LOADED);
        throw new BreakParseSAXException();
      }
    }

    @Override
    protected void validate(Object resultObject) throws SAXException {
      if (!(validateInternal((ModelLoadResult) resultObject))) {
        throw new SAXParseException("missing tags", null);
      }
    }

    private boolean validateInternal(ModelLoadResult result) throws SAXException {
      result.setState(ModelLoadingState.FULLY_LOADED);
      return true;
    }
  }

  public class PersistenceElementHandler extends ModelReader6Handler.ElementHandler {
    private String[] requiredAttributes = new String[]{"version"};

    public PersistenceElementHandler() {
    }

    @Override
    protected Integer createObject(Attributes attrs) throws SAXException {
      return Integer.parseInt(attrs.getValue("version"));
    }

    @Override
    protected String[] requiredAttributes() {
      return requiredAttributes;
    }

    @Override
    protected void handleAttribute(Object resultObject, String name, String value) throws SAXException {
      Integer result = (Integer) resultObject;
      if ("version".equals(name)) {
        return;
      }
      super.handleAttribute(resultObject, name, value);
    }
  }

  public class Tag_with_namespaceElementHandler extends ModelReader6Handler.ElementHandler {
    private String[] requiredAttributes = new String[]{"namespace"};

    public Tag_with_namespaceElementHandler() {
    }

    @Override
    protected String createObject(Attributes attrs) throws SAXException {
      return attrs.getValue("namespace");
    }

    @Override
    protected String[] requiredAttributes() {
      return requiredAttributes;
    }

    @Override
    protected void handleAttribute(Object resultObject, String name, String value) throws SAXException {
      String result = (String) resultObject;
      if ("namespace".equals(name)) {
        return;
      }
      super.handleAttribute(resultObject, name, value);
    }
  }

  public class ImportElementHandler extends ModelReader6Handler.ElementHandler {
    private String[] requiredAttributes = new String[]{"index", "version", "modelUID"};

    public ImportElementHandler() {
    }

    @Override
    protected String[] createObject(Attributes attrs) throws SAXException {
      return new String[]{attrs.getValue("index"), attrs.getValue("modelUID"), attrs.getValue("version"), null};
    }

    @Override
    protected String[] requiredAttributes() {
      return requiredAttributes;
    }

    @Override
    protected void handleAttribute(Object resultObject, String name, String value) throws SAXException {
      String[] result = (String[]) resultObject;
      if ("index".equals(name)) {
        return;
      }
      if ("version".equals(name)) {
        return;
      }
      if ("modelUID".equals(name)) {
        return;
      }
      if ("implicit".equals(name)) {
        result[3] = value;
        return;
      }
      super.handleAttribute(resultObject, name, value);
    }
  }

  public class Root_stubsElementHandler extends ModelReader6Handler.ElementHandler {
    private String[] requiredAttributes = new String[]{};

    public Root_stubsElementHandler() {
    }

    @Override
    protected ModelReader6Handler.ElementHandler createChild(Object resultObject, String tagName, Attributes attrs) throws SAXException {
      if ("node".equals(tagName)) {
        myChildHandlersStack.push(new ModelReader6Handler.ChildHandler() {
          @Override
          public void apply(Object resultObject, Object value) throws SAXException {
            handleChild_4813471910141063860(resultObject, value);
          }
        });
        return nodehandler;
      }
      return super.createChild(resultObject, tagName, attrs);
    }

    private void handleChild_4813471910141063860(Object resultObject, Object value) throws SAXException {
      SNode child = (SNode) value;
      if (fieldtoState == ModelLoadingState.INTERFACE_LOADED && child != null) {
        fieldmodel.addRootNode(child);
      }
    }
  }

  public class NodeElementHandler extends ModelReader6Handler.ElementHandler {
    private String[] requiredAttributes = new String[]{"type"};

    public NodeElementHandler() {
    }

    @Override
    protected SNode createObject(Attributes attrs) throws SAXException {
      return new LazySNode(InternUtil.intern(fieldhelper.readType(attrs.getValue("type"))));
    }

    @Override
    protected String[] requiredAttributes() {
      return requiredAttributes;
    }

    @Override
    protected void handleAttribute(Object resultObject, String name, String value) throws SAXException {
      SNode result = (SNode) resultObject;
      if ("type".equals(name)) {
        return;
      }
      if ("role".equals(name)) {
        result.putUserObject("role", fieldhelper.readRole(value));
        return;
      }
      if ("id".equals(name)) {
        SNodeId id = jetbrains.mps.smodel.SNodeId.fromString(value);
        if (id == null) {
          throw new SAXParseException("bad node ID", null);
        }
        ((jetbrains.mps.smodel.SNode) result).setId(id);
        return;
      }
      super.handleAttribute(resultObject, name, value);
    }

    @Override
    protected ModelReader6Handler.ElementHandler createChild(Object resultObject, String tagName, Attributes attrs) throws SAXException {
      if ("property".equals(tagName)) {
        myChildHandlersStack.push(new ModelReader6Handler.ChildHandler() {
          @Override
          public void apply(Object resultObject, Object value) throws SAXException {
            handleChild_7319439566871678585(resultObject, value);
          }
        });
        return propertyhandler;
      }
      if ("link".equals(tagName)) {
        myChildHandlersStack.push(new ModelReader6Handler.ChildHandler() {
          @Override
          public void apply(Object resultObject, Object value) throws SAXException {
            handleChild_7319439566871678608(resultObject, value);
          }
        });
        return linkhandler;
      }
      if ("node".equals(tagName)) {
        myChildHandlersStack.push(new ModelReader6Handler.ChildHandler() {
          @Override
          public void apply(Object resultObject, Object value) throws SAXException {
            handleChild_7319439566871678637(resultObject, value);
          }
        });
        return nodehandler;
      }
      return super.createChild(resultObject, tagName, attrs);
    }

    private void handleChild_7319439566871678585(Object resultObject, Object value) throws SAXException {
      SNode result = (SNode) resultObject;
      String[] child = (String[]) value;
      if (child[1] != null) {
        SNodeAccessUtil.setProperty(result, fieldhelper.readName(child[0]), child[1]);
      }
    }

    private void handleChild_7319439566871678608(Object resultObject, Object value) throws SAXException {
      SNode result = (SNode) resultObject;
      String[] child = (String[]) value;
      if (child[2] == null) {
        if (LOG.isEnabledFor(Priority.ERROR)) {
          LOG.error("couldn't create reference '" + child[0] + "' : traget node id is null");
        }
        return;
      }
      SReference ref = fieldhelper.readLink(result, child[0], child[2], child[1]);
      if (ref != null) {
        result.setReference(ref.getRole(), ref);
      }
    }

    private void handleChild_7319439566871678637(Object resultObject, Object value) throws SAXException {
      SNode result = (SNode) resultObject;
      SNode child = (SNode) value;
      result.addChild(((String) child.getUserObject("role")), child);
      child.putUserObject("role", null);
    }
  }

  public class PropertyElementHandler extends ModelReader6Handler.ElementHandler {
    private String[] requiredAttributes = new String[]{"name"};

    public PropertyElementHandler() {
    }

    @Override
    protected String[] createObject(Attributes attrs) throws SAXException {
      return new String[]{attrs.getValue("name"), null};
    }

    @Override
    protected String[] requiredAttributes() {
      return requiredAttributes;
    }

    @Override
    protected void handleAttribute(Object resultObject, String name, String value) throws SAXException {
      String[] result = (String[]) resultObject;
      if ("name".equals(name)) {
        return;
      }
      if ("value".equals(name)) {
        result[1] = value;
        return;
      }
      super.handleAttribute(resultObject, name, value);
    }
  }

  public class LinkElementHandler extends ModelReader6Handler.ElementHandler {
    private String[] requiredAttributes = new String[]{};

    public LinkElementHandler() {
    }

    @Override
    protected String[] createObject(Attributes attrs) throws SAXException {
      return new String[]{null, null, null};
    }

    @Override
    protected void handleAttribute(Object resultObject, String name, String value) throws SAXException {
      String[] result = (String[]) resultObject;
      if ("role".equals(name)) {
        result[0] = value;
        return;
      }
      if ("resolveInfo".equals(name)) {
        result[1] = value;
        return;
      }
      if ("targetNodeId".equals(name)) {
        result[2] = value;
        return;
      }
      super.handleAttribute(resultObject, name, value);
    }
  }

  protected static Logger LOG = LogManager.getLogger(ModelReader6Handler.class);
}
