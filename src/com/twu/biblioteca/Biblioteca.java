package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by bpereira on 9/17/15.
 */

public class Biblioteca {
    private ArrayList<Book> books;
    private ArrayList<Movie> movies;
    private Menu menu;

    public Biblioteca() {
        books = new ArrayList<Book>();
        movies = new ArrayList<Movie>();
        this.addBooks();
        this.addMovies();
        menu = new Menu();

    }

    public void welcomeMessage(){
        System.out.println("Hi! Welcome to biblioteca from TWU 46!");
        System.out.println("Here you can check-out any available book.");
        System.out.println("I suggest you to check all the books and movies we have available by choosing option 1. Try it out!\n");
    }

    public void showMenu() throws Exception {
        menu.run(this);
    }

    public void findBook(String bookTo, String option) throws Exception {
        for (Book book : this.books) {
            if (book.getName().toLowerCase().equals(bookTo.toLowerCase())) {
                if (option.equals("checkOut")) { book.rent(); }
                if (option.equals("giveBack")) { book.giveBack(); }
            }
        }
    }

    public void findMovie(String movieTo, String option) throws Exception {
        for (Movie movie : this.movies) {
            if (movie.getName().toLowerCase().equals(movieTo.toLowerCase())) {
                if (option.equals("checkOut")) { movie.rent(); }
                if (option.equals("giveBack")) { movie.giveBack(); }
            }
        }
    }

    public void listBooks() {
        System.out.println(String.format("%-40s%-40s%-4s", "Book Name", "Author", "Year"));
        for (Book book : books) {
            if (book.getAvailability())
                book.print();
        }
    }

    public void listMovies() {
        System.out.println(String.format("%-30s%-10s%-20s%-2s", "Movie Name", "Year", "Director", "Rating"));
        for (Movie movie : movies) {
            if (movie.isAvailability())
                movie.print();
        }
    }

    private void addBooks() {
        books.add(new Book(true, "Alice in Wonderland", "Bruna", "1992"));
        books.add(new Book(true, "Ruby the Right Way", "Julia", "1999"));
        books.add(new Book(true, "Java Best Parts", "Fernanda", "2003"));
        books.add(new Book(false, "Javascript Best Parts", "Junior", "2003"));
    }

    private void addMovies() {
        movies.add(new Movie(true, "Pokemon", "Bruna", "1999", 5));
        movies.add(new Movie(true, "The Goodfather", "Julia", "1994", 4));
        movies.add(new Movie(true, "The last movie", "Fernanda", "2003", 4));
        movies.add(new Movie(false, "Movies", "Junior", "2003", 5));
    }

}
