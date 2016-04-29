/**
 * 参考： http://d.hatena.ne.jp/kyon_mm/20110711/1310396094
 */
package com.github.tkmtmkt;

import org.junit.Test

class BookTest {
  /**
   * PowerAssertの失敗表示を試す
   */
  @Test
  public void testTitle() {
    Book sut = new Book()

    println "テスト１"
    sut.setTitle("hoge")
    assert sut.title.equals("hoge")
  }

  @Test
  public void testAuthor() {
    Book sut = new Book()

    println "テスト２"
    sut.setAuthor("hoge")
    assert sut.author.equals("hoge")
  }

}
