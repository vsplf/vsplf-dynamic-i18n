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
package org.vsplf.i18n;

import java.util.List;
import java.util.Locale;

/**
 * The LocaleAware interface.
 *
 * @author <a href="http://hoatle.net">hoatle (hoatlevan at gmail dot com)</a>
 * @since Feb 27, 2012
 */
public interface LocaleAware {

  /**
   * Gets the current selected locale.
   *
   * @return the current selected locale.
   */
  Locale getCurrentSelectedLocale();

  /**
   * Sets the current selected locale.
   *
   * @param selectedLocale the selected locale.
   */
  void setCurrentSelectedLocale(Locale selectedLocale);

  /**
   * Gets the system default Locale.
   *
   * @return the system default locale.
   */
  Locale getDefaultLocale();

  /**
   * Gets the list of supported locales.
   *
   * @return the list of supported locales.
   */
  List<Locale> getSupportedLocales();
}
