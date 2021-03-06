/*
 * Copyright (C) VSPLF Software Foundation (VSF), the origin author or authors.
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
package org.vsplf.i18n.spi;

import org.vsplf.i18n.TranslatorFactory;

/**
 * The TranslatorFactoryBinder as service provider interface for alternative implementations.
 *
 * @author <a href="http://hoatle.net">hoatle (hoatlevan at gmail dot com)</a>
 * @since Feb 26, 2012
 */
public interface TranslatorFactoryBinder {

  /**
   * Gets the TranslatorFactory instance.
   *
   * @return the translator factory
   */
  TranslatorFactory getTranslatorFactory();

}
