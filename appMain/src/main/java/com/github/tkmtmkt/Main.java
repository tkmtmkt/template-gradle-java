package com.github.tkmtmkt;

import com.tangosol.net.CacheFactory;
import com.tangosol.net.NamedCache;

public class Main
{
    public static void main(String[] args) {
        NamedCache hoge = CacheFactory.getCache("hoge");
        Book book = new Book();
        book.setTitle("Scalaで学ぶ関数脳入門");
        book.setAuthor("株式会社テクノロジックアート");
        hoge.put("ISBN978-4-7741-4436-8", book);
    }
}
