package com.bootcoding.collection;

import com.bootcoding.oops.encapsulation.Books;


import java.util.HashMap;
import java.util.Map;

public class BooksCollection {

    Map<Integer, Books> bookStore = new HashMap<>();

    public void addBooks(Books b) {
        bookStore.put(b.getPages(), b);
    }

    public void printBooks() {
        for (Books b : bookStore.values()) {
            System.out.println("Author" + b.getAuthor());
            System.out.println("Description" + b.getDescription());
            System.out.println("Title" + b.getTitle());
            System.out.println("PublisherName" + b.getPublisherName());
            System.out.println("Pages" + b.getPages());
        }
    }

    public static void main(String[] args) {
        BooksCollection bc = new BooksCollection();
        for (int i = 1; i < 10; i++) {
            Books b = new Books();
            b.setAuthor("R.j Rohit" + i);
            b.setPages(+i);
            b.setDescription("Java" + i);
            b.setTitle("Programing");
            b.setPublisherName("HimalyaPublication");
            bc.addBooks(b);

        }
        bc.printBooks();

    }
}