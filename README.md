# VSPLF Dynamic I18N Framework

https://github.com/vsplf/vsplf-dynamic-i18n/wiki

## How to use this framework

### Download this framework's artifacts

* Download artifacts (api and implementation) at:
  * https://repository-vsplf.forge.cloudbees.com/release/ for released version.
  * http://repository-vsplf.forge.cloudbees.com/snapshot/ for developing version.
* Include download artifacts in your application's classpath.

### Usage
Anywhere in your application's code, use TranslatorBuilder like the sample below:
<pre>
package org.vsplf.i18n.sample;

import org.vsplf.i18n.TranslatorBuilder;
import org.vsplf.i18n.TranslatorFactory;

public class SampleClass {
  private static TranslatorBuilder sb = TranslatorFactory.getTranslatorBuilder();

  public void sayHi() {
    String message = sb._("Hello {0}, my name is {name}").
                        appendArgument("VSPLF").
                        appendArgument("name", "dynamic i18n").
                        translate();

    System.out.println(message);
  }

}
</pre>

Note: You can use Translator, too. Both will return the same result.

### Run the supported tools
//TODO

## How to develop


### Prepare your environment

Use [Apache Maven][maven] version 3.0.0 minimum. Version 3.0.3 and above is recommended.

[maven]: http://maven.apache.org "Apache Maven"

### Default Build

Use this command to build project:

<pre>
  mvn clean install
</pre>

### Violations Checking Build

To check any violations, use this command below:

<pre>
  git submodule init
  git submodule update
  mvn clean install -Dvsplf.violations.checking
</pre>

### Project resources

* Issues management: https://github.com/vsplf/vsplf-dynamic-i18n/issues
* Jenkins continuous integration build: https://vsplf.ci.cloudbees.com/job/vsplf-dynamic-i18n-master-ci/
* Artifact deployment:
  * release repository:  https://repository-vsplf.forge.cloudbees.com/release/
  * snapshot repository: http://repository-vsplf.forge.cloudbees.com/snapshot/
* Ohloh report: https://www.ohloh.net/p/vsplf-dynamic-i18n

### Logging
