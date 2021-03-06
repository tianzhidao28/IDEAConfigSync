




# ALLEGRO INTELLIJ IDEA CODE TEMPLATES#

The repository contains set of live and file templates for IntelliJ IDEA IDE.

## 示例

![示例图][1]

## 若有中文目录 
* 
*       第三种方法，设置FTPClient的编码，这个终于OK了，关键就在最后的红字，ftpClient.controlEncoding=gb2312
*       String uri = "ftp://username@10.10.XX4.122/中文目录?password=xxxx&ftpClient.controlEncoding=gb2312";

### Installation ###
Copy folders *templates* and *fileTemplates* to one of the following location:

* Windows: \<your home directory\>\\.\<product name\>\<version number\>\config
* Linux: ~/.\<product name\>\<version number\>/config
* OS X: ~/Library/Preferences/\<product name\>\<version number\>


### Using file templates ###

* Go to: File -> New -> Java Class
* Type class name
* Choose one of the templates that starts with **$** sign

### Using live templates ###

* Open a Java class file
* Type Ctrl+J (Code -> Insert Live Template...)
* Choose one of the templates that starts with **$** sign

Note that you can insert **different live templates** depending on your cursor location (inside or outside of the method)




intellij-config
===============

Custom configuration for IntelliJ IDEA - code styles, live templates, etc.

Installation
--------------

#### Code Styles

Copy code style files to the following location:

* Windows: <code>&lt;USER HOME&gt;\\.IntelliJIdeaXX\config\codestyles</code>
* Linux: <code>~/.IntelliJIdeaXX/config/codestyles</code>
* OS X: <code>~/Library/Preferences/IntelliJIdeaXX/codestyles</code>

Upon IntelliJ IDEA restart, you may need to select the code style from the Settings / Preferences Dialog.

#### File Templates

Copy file template files to the following location:

* Windows: <code>&lt;USER HOME&gt;\\.IntelliJIdeaXX\config\fileTemplates</code>
* Linux: <code>~/.IntelliJIdeaXX/config/fileTemplates</code>
* OS X: <code>~/Library/Preferences/IntelliJIdeaXX/fileTemplates</code>

Restart IntelliJ IDEA.

#### Live Templates

Copy live template files to the following location:

* Windows: <code>&lt;USER HOME&gt;\\.IntelliJIdeaXX\config\templates</code>
* Linux: <code>~/.IntelliJIdeaXX/config/templates</code>
* OS X: <code>~/Library/Preferences/IntelliJIdeaXX/templates</code>

Restart IntelliJ IDEA.

Code Styles Usage
-----------------

<code>Alt + Cmd + L</code> (Mac) and <code>Alt + Ctrl + L</code> (Windows).

Live Templates Usage
--------------------

Note: For surround templates, highlight the text then hit <code>Alt + Cmd + J</code> (Mac) <code>Ctrl + Alt + J</code> (Windows) and select the template from the list.

#### Groovy - Spock

|Shortcut                                |Description                                                                |
|----------------------------------------|---------------------------------------------------------------------------|
|G1                                      |Surround class with <code>extends Specification</code>                     |
|<code>defs   + Tab</code>               |def setup                                                                  |
|<code>defc   + Tab</code>               |def cleanup                                                                |
|<code>defss  + Tab</code>               |def setup spec                                                             |
|<code>defcs  + Tab</code>               |def cleanup spec                                                           |
|<code>defwt  + Tab</code>               |def when then                                                              |
|<code>defgwt + Tab</code>               |def given when then                                                        |
|<code>defge  + Tab</code>               |def given expect                                                           |
|<code>defe   + Tab</code>               |def expect                                                                 |
|<code>defgew + Tab</code>               |def given expect where                                                     |
|<code>defew  + Tab</code>               |def expect where                                                           |

#### Java

|Shortcut                                |Description                                                                |
|----------------------------------------|---------------------------------------------------------------------------|
|J1                                      |Surround with <code>System.out.println(..)</code>                          |

#### JavaScript

|Shortcut                                |Description                                                                |
|----------------------------------------|---------------------------------------------------------------------------|
|JS1                                     |Surround with <code>console.log(..)</code>                                 |
|JS2                                     |Surround with <code>console.warn(..)</code>                                |
|JS3                                     |Surround with <code>console.error(..)</code>                               |
|JS4                                     |Surround with <code>JSON.stringify(..)</code>                              |
|<code>cl     + Tab</code>               |<code>console.log(..)</code>                                               |
|<code>cw     + Tab</code>               |<code>console.warn(..)</code>                                              |
|<code>ce     + Tab</code>               |<code>console.error(..)</code>                                             |

#### JavaScript - Bluebird

|Shortcut                                |Description                                                                |
|----------------------------------------|---------------------------------------------------------------------------|
|JSBB1                                   |Surround promise with <code>then(..).caught(..).lastly(..)</code>          |

#### JavaScript - Jasmine

|Shortcut                                |Description                                                                |
|----------------------------------------|---------------------------------------------------------------------------|
|<code>de     + Tab</code>               |describe                                                                   |
|<code>it     + Tab</code>               |it                                                                         |
|<code>etb    + Tab</code>               |expect to be                                                               |
|<code>entb   + Tab</code>               |expect not to be                                                           |
|<code>ete    + Tab</code>               |expect to equal                                                            |
|<code>ente   + Tab</code>               |expect not to equal                                                        |
|<code>etm    + Tab</code>               |expect to match                                                            |
|<code>entm   + Tab</code>               |expect not to match                                                        |
|<code>etbd   + Tab</code>               |expect to be defined                                                       |
|<code>entbd  + Tab</code>               |expect not to be defined                                                   |
|<code>etbu   + Tab</code>               |expect to be undefined                                                     |
|<code>entbu  + Tab</code>               |expect not to be undefined                                                 |
|<code>etbn   + Tab</code>               |expect to be null                                                          |
|<code>entbn  + Tab</code>               |expect not to be null                                                      |
|<code>etbt   + Tab</code>               |expect to be truthy                                                        |
|<code>entbt  + Tab</code>               |expect not to be truthy                                                    |
|<code>etbf   + Tab</code>               |expect to be falsy                                                         |
|<code>entbf  + Tab</code>               |expect not to be falsy                                                     |
|<code>etc    + Tab</code>               |expect to contain                                                          |
|<code>entc   + Tab</code>               |expect not to contain                                                      |
|<code>etblt  + Tab</code>               |expect to be less than                                                     |
|<code>entblt + Tab</code>               |expect not to be less than                                                 |
|<code>etbgt  + Tab</code>               |expect to be greater than                                                  |
|<code>entbgt + Tab</code>               |expect not to be greater than                                              |
|<code>etbct  + Tab</code>               |expect to be close to                                                      |
|<code>entbct + Tab</code>               |expect not to be close to                                                  |
|<code>ett    + Tab</code>               |expect to throw                                                            |
|<code>entt   + Tab</code>               |expect not to throw                                                        |
|<code>ethbc   + Tab</code>              |expect to have been called                                                 |
|<code>ethbcw  + Tab</code>              |expect to have been called with                                            |
|<code>ette   + Tab</code>               |expect to throw error                                                      |
|<code>so     + Tab</code>               |spy on                                                                     |
|<code>soact  + Tab</code>               |spy on and call through                                                    |
|<code>soarv  + Tab</code>               |spy on and                                                                 |
|<code>soacf  + Tab</code>               |spy on and call fake                                                       |
|<code>soate  + Tab</code>               |spy on and throw error                                                     |






  [1]: http://7xj6si.com1.z0.glb.clouddn.com/QQ%E6%88%AA%E5%9B%BE20151030203233.png