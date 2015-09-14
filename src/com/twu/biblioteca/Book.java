package com.twu.biblioteca;

import static java.lang.String.*;

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

    public boolean getAvailability(){
        return this.availability;
    }

    public String getName(){
        return this.name;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getYear(){
        return this.year;
    }

    public void setAvailability(boolean a){
        this.availability = a;
    }

    public String rent() throws Exception {
        String result;
        if (this.getAvailability()) {
            this.setAvailability(false);
            result = "Thank you! Enjoy the book";
        }
        else {
            result = "Book Already Rented!";
        }
        System.out.println(result);
        return result;
    }

    public void turnBack() throws Exception {
        if (!this.getAvailability()) {
            this.setAvailability(true);
            System.out.println("Thank you for returning the book!");
        }
        else { throw new Exception("This book is already here!"); }
    }

    public void print() {
        System.out.println(format("%-40s%-40s%-4s", this.getName(), this.getAuthor(), this.getYear()));
    }
}
