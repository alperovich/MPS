/*
 * Copyright 2003-2011 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.mps.make.java;

import jetbrains.mps.generator.GenerationStatus;
import jetbrains.mps.generator.cache.XmlBasedModelCache;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.util.FileUtil;
import jetbrains.mps.util.JDOMUtil;
import org.jdom.Element;
import org.jetbrains.annotations.NotNull;
import org.xml.sax.InputSource;
import org.xml.sax.SAXParseException;

import javax.xml.parsers.SAXParser;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BLDependenciesCache extends XmlBasedModelCache<ModelDependencies> {

  private static BLDependenciesCache INSTANCE;

  public static BLDependenciesCache getInstance() {
    return INSTANCE;
  }

  public BLDependenciesCache(SModelRepository modelRepository) {
    super(modelRepository);
  }

  @Override
  public void init() {
    if (INSTANCE != null) {
      throw new IllegalStateException("double initialization");
    }

    INSTANCE = this;
    super.init();
  }

  @Override
  public void dispose() {
    super.dispose();
    INSTANCE = null;
  }

  @Override
  @NotNull
  public String getCacheFileName() {
    return "dependencies";
  }

  @Override
  protected Element toXml(ModelDependencies modelDependencies) {
    return modelDependencies.toXml();
  }

  @Override
  protected ModelDependencies fromXml(Element e) {
    return ModelDependencies.fromXml(e);
  }

  @Override
  protected ModelDependencies generateCache(GenerationStatus status) {
    return status.getBLDependencies();
  }

  @Override
  protected ModelDependencies load(InputStream is) throws IOException {
    try {
      SAXParser saxParser = JDOMUtil.createSAXParser();
      BLDependenciesHandler handler = new BLDependenciesHandler();
      saxParser.parse(new InputSource(new InputStreamReader(is, FileUtil.DEFAULT_CHARSET)), handler);
      ModelDependencies dependencies = handler.getResult();
      if (dependencies != null) {
        return dependencies;
      }
      throw new IOException("empty result");
    } catch (SAXParseException ex) {
      throw new IOException(ex);
    } catch (Exception ex) {
      throw new IOException(ex);
    }
  }
}
