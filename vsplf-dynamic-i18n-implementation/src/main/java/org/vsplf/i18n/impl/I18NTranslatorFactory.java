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

import java.util.List;
import java.util.Locale;

import org.vsplf.i18n.TranslatorBuilder;
import org.vsplf.i18n.TranslatorFactory;
import org.vsplf.i18n.Translator;

/**
 * I18N I18N native implementation.
 *
 * @author <a href="http://hoatle.net">hoatle (hoatlevan at gmail dot com)</a>
 * @since Feb 27, 2012
 */
public class I18NTranslatorFactory implements TranslatorFactory {

  @Override
  public TranslatorBuilder getTranslatorBuilder() {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  @Override
  public Translator getTranslator() {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  @Override
  public Locale getSelectedLocale() {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  @Override
  public void setSelectedLocale(Locale selectedLocale) {
    //To change body of implemented methods use File | Settings | File Templates.
  }

  @Override
  public Locale getDefaultLocale() {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  @Override
  public List<Locale> getSupportedLocales() {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }
}
