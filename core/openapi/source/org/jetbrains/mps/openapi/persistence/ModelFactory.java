/*
 * Copyright 2003-2012 JetBrains s.r.o.
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
package org.jetbrains.mps.openapi.persistence;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SModel;

import java.io.IOException;
import java.util.Map;

/**
 * Creates models (instances of SModel) from data sources
 */
public interface ModelFactory {

  static final String OPTION_MODULEREF = "moduleReference";
  static final String OPTION_PACKAGE = "package";
  static final String OPTION_RELPATH = "relativePath";
  static final String OPTION_MODELNAME = "modelName";
  static final String OPTION_CONTENT_ONLY = "contentOnly";

  /**
   * Instantiates a model on a given data source. Options can be used to pass additional parameters
   * like stream encoding (usually, the default is utf-8), package name, containing module reference
   * or module relative path of the source.
   *
   * @return The loaded model
   * @throws UnsupportedDataSourceException if the data source is not supported
   */
  @NotNull
  SModel load(@NotNull DataSource dataSource, @NotNull Map<String, String> options) throws IOException;

  /**
   * Creates a new empty model.
   *
   * @throws UnsupportedDataSourceException if the data source is not supported
   * @throws IOException if the model cannot be created
   */
  @NotNull
  SModel create(DataSource dataSource, @NotNull Map<String, String> options) throws IOException;

  /**
   * Indicates, whether the supplied data source can be used to hold models created by this factory.
   */
  boolean canCreate(DataSource dataSource, @NotNull Map<String, String> options);

  /**
   * Checks if the source content is outdated and needs to be upgraded.
   *
   * @throws UnsupportedDataSourceException if the data source is not supported
   */
  boolean needsUpgrade(DataSource dataSource) throws IOException;

  /**
   * Loads the model content, and saves it back in the up-to-date format.
   *
   * @throws UnsupportedDataSourceException if the data source is not supported
   */
  void upgrade(DataSource dataSource) throws IOException;

  /**
   * Saves the model in the factory-specific format (including conversion when needed).
   *
   * @throws UnsupportedDataSourceException if the data source is not supported
   */
  void save(SModel model, DataSource dataSource) throws ModelSaveException, IOException;

  /**
   * returns true if plain text is not enough to represent stored data.
   */
  boolean isBinary();

  /**
   * returns the file extension this factory is registered on
   */
  String getFileExtension();

  /**
   * User-readable title of the storage format.
   */
  String getFormatTitle();
}
