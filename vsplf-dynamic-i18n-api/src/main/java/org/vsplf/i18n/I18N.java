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
 * The the main entry point for client's code.
 *
 * @author <a href="http://hoatle.net">hoatle (hoatlevan at gmail dot com)</a>
 * @since Feb 23, 2012
 */
public final class I18N {

  /**
   * Gets the translator builder provided by implementation.
   *
   * @return the translator builder.
   */
  public static TranslatorBuilder getTranslatorBuilder() {
    return null;
  }


  /**
   * Gets the translator provided by implementation.
   *
   * @return the translator instance.
   */
  public static Translator getTranslator() {
    return null;
  }

  /**
   * Gets the default locale provided by system runtime.
   *
   * @return the default system locale.
   */
  public static Locale getDefaultLocale() {
    return null;
  }

  /**
   * Gets the current setting locale of the application.
   *
   * @return the current setting locale.
   */
  public static Locale getCurrentLocale() {
    return null;
  }

  /**
   * Sets the current locale for the application.
   *
   */
  public static void setCurrentLocale() {

  }


  /**
   * Gets the list of supported locales for the application.
   *
   * @return a list of supported locales.
   */
  public static List<Locale> getSupportedLocales() {
    return null;
  }

  /**
   * Gets the associated {@link TranslatorFactory} instance.
   *
   * @return the {@link TranslatorFactory} instance.
   */
  public static TranslatorFactory getITranslatorFactory() {
    return null;
  }

  /**
   * Avoid create instance for this class.
   */
  private I18N() {

  }

}
