template-gradle-java
====================

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
