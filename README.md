template-gradle-java
====================

環境
----

    ~/apps/
    ├─jdk1.8.0/
    └─payara41/

    ~/.gradle/
    └─init.gradle

    template-gradle-java/
    ├─gradle/
    │  └─wrapper/
    │      ├─gradle-wrapper.jar
    │      └─gradle-wrapper.properties
    ├─gradlew
    ├─gradlew.bat
    ├─gradle.properties
    ├─settings.gradle
    ├─build.gradle
    ├─config/
    │  └─checkstyle/
    │      └─google_checks.xml
    ├─lib/
    └─subprojects/
        ├─appData/
        │  ├─build.gradle
        │  └─src/
        │      ├─main/
        │      │  ├─java/
        │      │  └─resources/
        │      └─test/
        │          ├─gradle/
        │          └─java/
        ├─appMain
        │  ├─build.gradle
        │  └─src/
        └─integration
            ├─build.gradle
            └─src/

`~/.gradle/init.gradle`

```groovy
startParameter.offline = false

def proxyHost = "www.somehost.org"
def proxyPort = "8080"
System.setProperty("http.proxyHost", proxyHost)
System.setProperty("http.proxyPort", proxyPort)
System.setProperty("https.proxyHost", proxyHost)
System.setProperty("https.proxyPort", proxyPort)

allprojects {
  repositories {
    jcenter()
  }
}
```


準備
----

### eclipse設定

* 「ヘルプ」→「新規ソフトウェアのインストール」
  * http://dist.springsource.org/release/GRECLIPSE/e4.3/
    * Extra Groovy compilers
    * Groovy Eclipse SDK
    * Groovy-Eclipse
    * その他＞JDT Core patch for Groovy-Eclipse plugin

 * 「ファイル」→「新規」「Groovy Project」
   * 「デフォルトロケーション」のチェックを外す
   * 「ロケーション」にプロジェクトのフォルダ指定

#### カバレッジ計測
 * 「実行」→「カバレッジ...」
   * テスト
     * 選択されたプロジェクト
   * カバレッジ
     * srcにチェック
   * 引数
     * VM引数に -Dxxxx など設定
   * 共通
     * ファイル：${workspace_loc:/app-data}/out/SystemOut.txt
 * 「ファイル」→「エクスポート」
   * 「実行/デバッグ」→「実行構成」
     * 「JUnit」→「構成の名前」


参考
----
* [JavaプロジェクトでGroovyを導入すべき５つの理由](http://d.hatena.ne.jp/kyon_mm/20110711/1310396094)

<!-- vim: set ft=markdown ts=4 sw=4 et:-->
