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

import java.util.Locale;
import java.util.Map;

/**
 * The Translator APIs to translate any message. This class must be used by client to have dynamic
 * i18n and for automatic tool handling.
 * <p/>
 * These APIs are inspired from ICU MessageFormat, Drupal's Locale APIs, gettext-commons APIs,
 * GNU gettext APIs.
 * <p/>
 * Sample code for client code:
 * <pre>
 *   Translator t = TranslatorFactory.getTranslator();
 *   t._("Hello World Out There!");
 * </pre>
 *
 * @author <a href="http://hoatle.net">hoatle (hoatlevan at gmail dot com)</a>
 * @since Feb 22, 2012
 * @see <a href="http://icu-project.org/apiref/icu4j/com/ibm/icu/text/MessageFormat.html">
 *   (ICU) MessageFormat</a>
 */
public interface Translator {

  /**
   * Translates a message pattern (simples string) with locale aware.
   * <br />
   * For example:
   * <pre>
   *   Translator t = TranslatorFactory.getTranslator();
   *   t._("Hello World");
   * </pre>
   *
   * @param messagePattern the message pattern.
   *
   * @return the translated string.
   */
  String _(String messagePattern);

  /**
   * Translates a message pattern (simples string) with specified locale.
   * <br />
   * For example:
   * <pre>
   *   Translator t = TranslatorFactory.getTranslator();
   *   Locale vietnamese = new Locale("vi", "VN");
   *   t._("Hello World", vietnamese);
   * </pre>
   *
   * @param messagePattern the message pattern.
   * @param locale the specified locale.
   *
   * @return the translated string.
   */
  String _(String messagePattern, Locale locale);

  /**
   * Translates a message pattern with an array of message arguments (support numbered arguments)
   * with locale aware.
   * <br />
   * For example:
   * <pre>
   *   Translator t = TranslatorFactory.getTranslator();
   *   t._("Hello {0}", "World");
   * </pre>
   *
   * @param messagePattern the message pattern.
   * @param messageArguments the array of message arguments.
   *
   * @return the translated string.
   */
  String _(String messagePattern, Object[] messageArguments);

  /**
   * Translates a message pattern with an array of message arguments (support numbered arguments)
   * with a specified locale.
   * <br />
   * For example:
   * <pre>
   *   Translator t = TranslatorFactory.getTranslator();
   *   Locale vietnamese = new Locale("vi", "VN");
   *   t._("Hello {0}", "World", vietnamese);
   * </pre>
   *
   * @param messagePattern the message pattern.
   * @param messageArguments the array of message arguments.
   * @param locale the specified locale.
   *
   * @return the translated string.
   */
  String _(String messagePattern, Object[] messageArguments, Locale locale);

  /**
   * Translates a message pattern with a map of message arguments (support named arguments) with
   * locale aware.
   * <br />
   * For example:
   * <pre>
   *   Translator t = TranslatorFactory.getTranslator();
   *   Map<String, String> arguments = new HashMap<String, String>();
   *   arguments.put("name", "World");
   *   t._("Hello {name}", arguments);
   * </pre>
   *
   * @param messagePattern the message pattern.
   * @param messageArguments the map of message arguments.
   *
   * @return the translated string.
   */
  String _(String messagePattern, Map<String, Object> messageArguments);

  /**
   * Translates a message pattern with a map of message arguments (support named arguments) with
   * a specific locale.
   * <br />
   * For example:
   * <pre>
   *   Translator t = TranslatorFactory.getTranslator();
   *   Map<String, String> arguments = new HashMap<String, String>();
   *   arguments.put("name", "World");
   *   Locale vietnamese = new Locale("vi", "VN");
   *   t._("Hello {name}", arguments, vietnamese);
   * </pre>
   *
   * @param messagePattern the message pattern.
   * @param messageArguments the map of message arguments.
   * @param locale the specified locale.
   *
   * @return the translated string.
   */
  String _(String messagePattern, Map<String, Object> messageArguments, Locale locale);

}
