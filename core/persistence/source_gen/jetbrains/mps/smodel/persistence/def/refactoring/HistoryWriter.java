package jetbrains.mps.smodel.persistence.def.refactoring;

/*Generated by MPS */

import jetbrains.mps.smodel.persistence.def.v7.WriteHelper;
import org.jdom.Document;
import jetbrains.mps.refactoring.StructureModificationLog;
import org.jdom.Element;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.refactoring.StructureModification;
import jetbrains.mps.internal.collections.runtime.IMapping;
import org.jetbrains.mps.openapi.model.SModelReference;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import org.jetbrains.mps.openapi.model.SNodeReference;

public class HistoryWriter {
  public static final String MODIFICATION_HISTORY = "history";
  public static final String MODIFICATION_ELEMENT = "StructureModification";
  public static final String DEPENDENCIES = "dependencies";
  public static final String DEPEND_MODEL = "model";
  public static final String MODEL_INDEX = "index";
  public static final String MODEL_UID = "modelUID";
  public static final String MODEL_VERSION = "version";
  public static final String MODIFICATION_ENTRIES = "";
  public static final String MOVE_NODE = "move";
  public static final String RENAME_NODE = "rename";
  public static final String NODE_ID = "id";
  public static final String NEW_ID = "to";
  public static final String RENAME_TYPE = "type";
  public static final String OLD_VALUE = "from";
  public static final String NEW_VALUE = "to";
  private WriteHelper myHelper;

  public HistoryWriter() {
  }

  public Document saveHistory(StructureModificationLog history) {
    final Element root = new Element(MODIFICATION_HISTORY);
    ListSequence.fromList(history.getHistory()).visitAll(new IVisitor<StructureModification>() {
      public void visit(StructureModification it) {
        root.addContent(saveModification(it));
      }
    });
    return new Document(root);
  }

  public Element saveModification(StructureModification modification) {
    myHelper = new WriteHelper(null);

    final Element elem = new Element(MODIFICATION_ELEMENT);

    Element dependencies = new Element(DEPENDENCIES);
    elem.addContent(dependencies);
    for (IMapping<SModelReference, Integer> dependency : MapSequence.fromMap(modification.getDependencies())) {
      myHelper.addModelReference(dependency.key());
      Element model = new Element(DEPEND_MODEL);
      model.setAttribute(MODEL_INDEX, myHelper.getImportIndex(dependency.key()));
      model.setAttribute(MODEL_UID, dependency.key().toString());
      model.setAttribute(MODEL_VERSION, Integer.toString(dependency.value()));
      dependencies.addContent(model);
    }

    ListSequence.fromList(modification.getData()).visitAll(new IVisitor<StructureModification.Entry>() {
      public void visit(StructureModification.Entry it) {
        elem.addContent(saveData(it));
      }
    });

    return elem;
  }

  private String genId(SNodeReference ptr) {
    return myHelper.genReferenceId(ptr);
  }

  public Element saveData(StructureModification.Entry data) {
    if (data instanceof StructureModification.MoveNode) {
      return saveMoveNode((StructureModification.MoveNode) data);
    } else if (data instanceof StructureModification.RenameNode) {
      return saveRenameNode((StructureModification.RenameNode) data);
    } else if (data instanceof StructureModification.RenameModel) {
      return saveRenameModel((StructureModification.RenameModel) data);
    }
    return null;
  }

  public Element saveMoveNode(StructureModification.MoveNode data) {
    Element elem = new Element(MOVE_NODE);
    elem.setAttribute(NODE_ID, genId(data.oldID));
    elem.setAttribute(NEW_ID, genId(data.newID));
    if (data.resolveInfo != null) {
      elem.setAttribute("resolveInfo", data.resolveInfo);
    }
    return elem;
  }

  public Element saveRenameNode(StructureModification.RenameNode data) {
    Element elem = new Element(RENAME_NODE);
    elem.setAttribute(NODE_ID, genId(data.oldID));
    elem.setAttribute(RENAME_TYPE, data.type.name());
    if (data.oldValue != null) {
      elem.setAttribute(OLD_VALUE, data.oldValue);
    }
    elem.setAttribute(NEW_VALUE, data.newValue);
    return elem;
  }

  public Element saveRenameModel(StructureModification.RenameModel data) {
    Element elem = new Element("RenameModel");
    elem.setAttribute("oldModel", data.oldModel.toString());
    elem.setAttribute("newModel", data.newModel.toString());
    return elem;
  }
}
