package com.twu.biblioteca;

/**
 * Created by bpereira on 9/11/15.
 */
public class Book {

    private boolean availability;
    private String name;
    private String author;
    private String year;

    public Book(boolean availability, String name, String author, String year) {
        this.availability = availability;
        this.name = name;
        this.author = author;
        this.year = year;
    }
}
