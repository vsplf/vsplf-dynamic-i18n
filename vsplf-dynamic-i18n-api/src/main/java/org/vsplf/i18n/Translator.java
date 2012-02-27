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

import java.util.Map;

/**
 * The Translator APIs to translate any message. This class must be used by client to have dynamic
 * i18n and for automatic tool handling.
 * <p/>
 * These APIs are inspired from Drupal's Locale APIs, gettext-commons APIs, GNU gettext APIs.
 * <p/>
 * Sample code for client code:
 * <pre>
 *   Translator t = TranslatorFactory.getTranslator();
 *   t._("Hello World Out There!");
 *   t.plural_("I see only 1 star", "I see {0} stars", 2);
 * </pre>
 *
 * @author <a href="http://hoatle.net">hoatle (hoatlevan at gmail dot com)</a>
 * @since Feb 22, 2012
 */
public interface Translator {

  /**
   * Translates a simple message id.
   *
   * @param messageId the message id
   * @return
   */
  String _(String messageId);

  String _(String messageId, Map<String, String> messageArguments);


  String plural_(String singularMessageId, String pluralMessageId, long count);

  //TODO count vs messageArguments?
  /*
    t.plural_("I see 1 star", "I see {0} starts", 2);

    Map<String, String> arguments = new HashMap<String, String>();
    arguments.put("star_count", 2);
    t.plural_("I see 1 star, "I see {@star_count}", 2, arguments); //TODO Is this good APIs?
   */
  String plural_(String singularMessageId, String pluralMessageId, long count,
                 Map<String, String> messageArguments);

  /*
  For the purpose of offline installation, static i18n, logging purpose (?)
  http://www.slf4j.org/localization.html
  */

  /*
  //TODO no need?
  String s_(String messageId);

  String sPlural_(String singularMessageId, String pluralMessageId, long count);

  String sPlural_(String singularMessageId, String pluralMessageId, long count,
                  Map<String, String> messageArguments);
  */

}
