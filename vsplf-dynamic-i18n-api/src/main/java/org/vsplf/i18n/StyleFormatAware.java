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

/**
 * The Style format aware interface for checking supported style format and associated style.
 *
 * @author <a href="http://hoatle.net">hoatle (hoatlevan at gmail dot com)</a>
 * @since  Mar 31, 2012
 */
public interface StyleFormatAware {
  /**
   * Checks if an extension format style is supported by implementation vendors.
   *
   * @param formatStyle the extension format style
   *
   * @return true if that format style is supported.
   *         false if that format style is not supported.
   */
  boolean isSupportedFormatStyle(String formatStyle);

  /**
   * Checks if a message pattern's format matches the format style's format.
   *
   * @param formatStyle the format style
   * @param messagePattern the message pattern
   * @return true if the message pattern's format matches the format style's format.
   *         false if the message pattern's format does not match the format style's format.
   */
  boolean isValidFormatStyle(String formatStyle, String messagePattern);

  /**
   * Checks if a style of a specified format style is supported by implementation vendors.
   * @param formatStyle the extension format style
   * @param style the style of that format style
   *
   * @return true if that style of a specified format style is supported.
   *         false if that style of a specified format style is not supported.
   */
  boolean isSupportedFormatStyle(String formatStyle, String style);

  /**
   * Checks if a message pattern's format matches the style format of a format style.
   *
   * @param formatStyle the format style
   * @param style       the associated style
   * @param messagePattern the message pattern
   * @return true if the message pattern's format matches the style format of a format style.
   *         false if the message pattern's format does not match the style format of a format style.
   */
  boolean isValidFormatStyle(String formatStyle, String style, String messagePattern);
}
