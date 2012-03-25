# VSPLF Dynamic I18N Framework

https://github.com/vsplf/vsplf-dynamic-i18n/wiki

## Make it easy and painless to I18N-ize any java projects with: simple APIs and a wide range of supported tools.

* I18n-ize simple string:

  <pre>

    private static final TranslatorBuilder tb = TranslatorFactory.getTranslatorBuilder();

    public void translateSimple() {
      String message = tb._("hello world!").
                          translate();
      //output depends on locale context
      //if English:
      //            hello world!
      //if Vietnamese:
      //            Xin chào thế giới!
    }

  </pre>

* I18n-ize plural context:

  <pre>

    private static final TranslatorBuilder tb = TranslatorFactory.getTranslatorBuilder();

    public void translatePlural() {
      int numberOfFiles = 5;
      String diskName = tb._("My Disk").translate();

      String message = tb._("{num_files, plural, " +
                              "=0 {There are no files on disk \"{disk_name}\".}" +
                              "=1 {There is one file on disk \"{disk_name}\".}" +
                              "=other {There are # files on disk \"{disk_name}\".}" +
                            "}").
                          appendArgument("num_files", numberOfFiles).
                          appendArgument("disk_name", diskName).
                          translate();
      //output depends on locale context
      //if English:
      //           There are 5 files on disk "My Disk".
      //if Vietnamese:
      //           Có 5 tệp tin trong ổ đĩa "Ổ Đĩa Của Tôi".
    }

  </pre>

* I18n-ize gender context:

  <pre>

    private static final TranslatorBuilder tb = TranslatorFactory.getTranslatorBuilder();

    public void translateGender() {
      String userName = "John";
      String gender = "male";

      String message = tb._("{gender, select, " +
                              "male {{user_name} finished his task.}" +
                              "female {{user_name} finished her task.}" +
                              "other {{user_name} finished their task.}" +
                            "}").
                          appendArgument("user_name", userName).
                          appendArgument("gender", gender).
                          translate();
      //output depends on locale context
      //If English:
      //           John finished his task.
      //If Vietnamese:
      //           John đã hoàn hành nhiệm vụ.
    }

  </pre>

* I18n-ize both plural and gender context:

  <pre>

    private static final TranslatorBuilder tb = TranslatorFactory.getTranslatorBuilder();

    public void translateComplex() {
      int numberOfFiles = 2;
      String gender = "female";
      String userName = "Mary";
      String diskName = tb._("My Disk").translate();

      String message = tb._("{num_files, plural, " +
                              "=0 {gender, select, " +
                                   "male {{user_name} has no files on his disk \"{disk_name}\".}" +
                                   "female {{user_name} has no files on her disk \"{disk_name}\".}" +
                                   "other {{user_name} has no files on their disk \"{disk_name}\".}" +
                                  "}" +
                              "=1 {gender, select, " +
                                   "male {{user_name} has 1 file on his disk \"{disk_name}\"}." +
                                   "female {{user_name} has 1 file on her disk \"{disk_name}\".}" +
                                   "other {{user_name} has 1 file on their disk \"{disk_name}\".}" +
                                  "}" +
                              "=other {gender, select, " +
                                       "male {{user_name} has # files on his disk \"{disk_name}\".}" +
                                       "female {{user_name} has # files on her disk \"{disk_name}\".}" +
                                       "other {{user_name} has # files on their disk \"{disk_name}\".}" +
                                     "}" +
                            "}").
                          translate();
      //output depends on locale context
      //if English:
      //           Mary has 2 files on her disk "My Disk".
      //if Vietnamese:
      //           Mary có 2 tệp tin trong ổ đĩa "Ổ Đĩa Của Tôi".
    }

  </pre>

## How to use this framework

### Download this framework's artifacts

* Download artifacts (api and implementation) at:
  * https://repository-vsplf.forge.cloudbees.com/release/ for released version.
  * http://repository-vsplf.forge.cloudbees.com/snapshot/ for developing version.
* Include downloaded artifacts in your application's classpath.

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
