package jetbrains.mps.project.foreign;

/*Generated by MPS */

import jetbrains.mps.project.structure.model.ModelRootDescriptor;
import org.jdom.Element;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.util.xml.XmlUtil;
import jetbrains.mps.project.structure.model.ModelRoot;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import org.jetbrains.mps.openapi.persistence.Memento;
import jetbrains.mps.persistence.MementoImpl;
import jetbrains.mps.project.persistence.ModuleDescriptorPersistence;
import jetbrains.mps.persistence.MementoUtil;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class MPSFacetConfiguration {
  private static final String OPT_VALUE = "value";
  public String UUID;
  public String generatorOutputPath;
  public boolean useModuleSourceFolder = false;
  public boolean useTransientOutputFolder = false;
  public String[] usedLanguages;
  public ModelRootDescriptor[] rootDescriptors;

  public MPSFacetConfiguration() {
  }

  public void readFromXml(Element config) throws FacetConfigurationFormatException {
    List<ModelRootDescriptor> descriptors = new ArrayList<ModelRootDescriptor>();
    for (Element ch : XmlUtil.children(config, "option")) {
      String optionName = ch.getAttributeValue("name");
      if ("UUID".equals(optionName)) {
        this.UUID = ch.getAttributeValue(OPT_VALUE);
      } else if ("generatorOutputPath".equals(optionName)) {
        this.generatorOutputPath = ch.getAttributeValue(OPT_VALUE);
      } else if ("modelRoots".equals(optionName)) {
        ModelRootDescriptor[] cache = new ModelRootDescriptor[2];
        for (ModelRoot root : SetSequence.fromSet(readModelRoots(XmlUtil.first(ch, "set")))) {
          Memento m = new MementoImpl();
          root.save(m);
          ModelRootDescriptor descr = ModuleDescriptorPersistence.createDescriptor(null, m, null, cache);
          if (descr != null) {
            descriptors.add(descr);
          }
        }
      } else if ("usedLanguages".equals(optionName)) {
        this.usedLanguages = readArray(XmlUtil.first(ch, "array"));
      } else if ("useModuleSourceFolder".equals(optionName)) {
        this.useModuleSourceFolder = "true".equals(ch.getAttributeValue(OPT_VALUE));
      } else if ("useTransientOutputFolder".equals(optionName)) {
        this.useTransientOutputFolder = "true".equals(ch.getAttributeValue(OPT_VALUE));
      }
    }
    for (Element modelRoot : XmlUtil.children(XmlUtil.first(config, "modelRoots"), "modelRoot")) {
      Element settings = XmlUtil.first(modelRoot, "settings");
      Memento m = new MementoImpl();
      if (settings != null) {
        MementoUtil.readMemento(m, settings);
      }
      descriptors.add(new ModelRootDescriptor(modelRoot.getAttributeValue("type"), m));
    }
    rootDescriptors = descriptors.toArray(new ModelRootDescriptor[descriptors.size()]);
  }

  private Set<ModelRoot> readModelRoots(Element array) {
    Set<ModelRoot> res = SetSequence.fromSet(new HashSet<ModelRoot>());
    for (Element o : XmlUtil.children(array, "ModelRoot")) {
      String path = getPath(o);
      if (path != null) {
        SetSequence.fromSet(res).addElement(new ModelRoot(path, null));
      }
    }
    return res;
  }

  private String getPath(Element modelRootElement) {
    for (Element optionChild : Sequence.fromIterable(XmlUtil.children(modelRootElement, "option"))) {
      if ("path".equals(optionChild.getAttributeValue("name")) && optionChild.getAttributeValue("value") != null) {
        return optionChild.getAttributeValue("value");
      }
    }
    return null;
  }

  private String[] readArray(Element array) {
    List<String> res = ListSequence.fromList(new ArrayList<String>());
    for (Element o : XmlUtil.children(array, "option")) {
      ListSequence.fromList(res).addElement(o.getAttributeValue("value"));
    }
    return ListSequence.fromList(res).toGenericArray(String.class);
  }
}
