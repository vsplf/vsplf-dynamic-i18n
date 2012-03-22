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
 * The TranslatorBuilder for easier usage of Translator. <br /> TranslatorBuilder must be
 * thread-safe. For example:
 * <pre>
 *  TranslatorBuilder tb = TranslatorFactory.getTranslatorBuilder();
 *  String message = tb._("hello {0}").
 *                      messageArguments(new String[]{"VSPLF"}).
 *                      message();
 * </pre>
 *
 * @author <a href="http://hoatle.net">hoatle (hoatlevan at gmail dot com)</a>
 * @since Mar 22, 2012
 */
public interface TranslatorBuilder {
  /**
   * Sets the message pattern for translating.
   *
   * @param messagePattern the message pattern.
   * @return the translator builder.
   */
  TranslatorBuilder _(String messagePattern);

  /**
   * Sets the message arguments as an array of object arguments.
   *
   * @param messageArguments an array of objects for message arguments.
   * @return the translator builder.
   */
  TranslatorBuilder messageArguments(Object[] messageArguments);

  /**
   * Appends a message argument with the type of Object to the array of object arguments.
   *
   * @param messageArgument an object argument
   * @return the translator builder.
   */
  TranslatorBuilder appendArgument(Object messageArgument);

  /**
   * Sets the message arguments as a map of objects with key as named argument.
   *
   * @param messageArguments a map of objects for message arguments.
   * @return the translator builder.
   */
  TranslatorBuilder messageArguments(Map<String, Object> messageArguments);

  /**
   * Appends a message argument with the type of Map<String, Object> to the array of message
   * arguments.
   *
   * @param keyName              the key name associated with message argument value.
   * @param messageArgumentValue the message argument value.
   * @return the translator builder.
   */
  TranslatorBuilder appendArgument(String keyName, Object messageArgumentValue);

  /**
   * Sets the specific locale to translate a message pattern.
   *
   * @param locale the specified locale.
   * @return the translator builder.
   */
  TranslatorBuilder locale(Locale locale);

  /**
   * Translates the message pattern with all the available context information.
   *
   * @return the translated message.
   */
  String message();
}
