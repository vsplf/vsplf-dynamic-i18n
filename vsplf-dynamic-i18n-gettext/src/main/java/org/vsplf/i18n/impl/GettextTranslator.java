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
package org.vsplf.i18n.impl;

import java.util.Map;

import org.vsplf.i18n.Translator;

/**
 * Translator implementation for GNU gettext.
 *
 * @author <a href="http://hoatle.net">hoatle (hoatlevan at gmail dot com)</a>
 * @since Feb 27, 2012
 */
public class GettextTranslator implements Translator {

  @Override
  public String _(String messageId) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  @Override
  public String _(String messageId, Map<String, String> messageArguments) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  @Override
  public String plural_(String singularMessageId, String pluralMessageId, long count) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  @Override
  public String plural_(String singularMessageId, String pluralMessageId, long count, Map<String, String> messageArguments) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  @Override
  public String s_(String messageId) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  @Override
  public String sPlural_(String singularMessageId, String pluralMessageId, long count) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  @Override
  public String sPlural_(String singularMessageId, String pluralMessageId, long count, Map<String, String> messageArguments) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

}
