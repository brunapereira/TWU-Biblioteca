package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by bpereira on 9/22/15.
 */
public class BibliotecaFactory {

    private ArrayList<Book> books;
    private ArrayList<Movie> movies;
    private ArrayList<User> users;
    private Menu menu;

    public ArrayList<Book> createBooks() {
        books = new ArrayList<Book>();
        books.add(new Book(true, "Alice in Wonderland", "Bruna", "1992"));
        books.add(new Book(true, "Ruby the Right Way", "Julia", "1999"));
        books.add(new Book(true, "Java Best Parts", "Fernanda", "2003"));
        books.add(new Book(false, "Javascript Best Parts", "Junior", "2003"));

        return books;
    }

    public ArrayList<Movie> createMovies() {
        movies = new ArrayList<Movie>();
        movies.add(new Movie(true, "Pokemon", "Bruna", "1999", 5));
        movies.add(new Movie(true, "The Goodfather", "Julia", "1994", 4));
        movies.add(new Movie(true, "The last movie", "Fernanda", "2003", 4));
        movies.add(new Movie(false, "Movies", "Junior", "2003", 5));

        return movies;
    }

    public ArrayList<User> createUsers() {
        users = new ArrayList<User>();
        users.add(new User("123-4567", "Bruna", "passwordbruna", "bpereira@tw.com", "9999-9999"));
        users.add(new User("123-1111", "Julia", "juliapass", "julia@tw.com", "9876-9999"));
        users.add(new User("111-2345", "Fernanda", "ferpassword", "fernanda@tw.com", "9009-9009"));

        return users;
    }

    public Menu createMenu() {
        menu = new Menu();
        return menu;
    }
}
