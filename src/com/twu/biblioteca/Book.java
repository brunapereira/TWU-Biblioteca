package com.twu.biblioteca;


import static java.lang.String.format;

/**
 * Created by bpereira on 9/11/15.
 */
public class Book extends Product {

    private String author;

    public Book(boolean availability, String name, String author, String year) {
        this.availability = availability;
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getAuthor(){
        return this.author;
    }

    @Override
    public String toString() {
        return format("%-40s%-40s%-4s", this.getName(), this.getAuthor(), this.getYear());
    }
}
