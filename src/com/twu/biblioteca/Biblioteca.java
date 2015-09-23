package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by bpereira on 9/17/15.
 */

public class Biblioteca {
    private ArrayList<Book> books;
    private ArrayList<Movie> movies;
    private ArrayList<User> users;
    private Menu menu;
    private String userLoggedIn;

    public Biblioteca(ArrayList<Book> books, ArrayList<Movie> movies, ArrayList<User> users, Menu menu) {
        this.books = books;
        this.movies = movies;
        this.users = users;
        this.menu = menu;
    }

    public void welcomeMessage(){
        System.out.println("Hi! Welcome to biblioteca from TWU 46!");
        System.out.println("Here you can check-out any available book.");
        System.out.println("I suggest you to check all the books and movies we have available by choosing option 1. Try it out!\n");
    }

    public boolean logIn(String login, String password){
        for (User user : this.users) {
            if (user.getLibraryNumber().equals(login) && (user.getPassword().equals(password))) {
                userLoggedIn = user.getLibraryNumber();
                return true;
            }
        }
        return false;
    }

    public void showMenu() throws Exception {
        menu.run(this);
    }

    public void showLoginError() throws Exception {
        System.out.println("Wrong user or password!");
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
            if (book.isAvailability())
                book.print();
        }
    }

    public void listMovies() {
        System.out.println(String.format("%-30s%-10s%-20s%-2s", "Movie Name", "Year", "Director", "Rating"));
        for (Movie movie : movies) {
            if (movie.isAvailability())
                System.out.println(movie.toString());
        }
    }

    public void showUserInformation(){
        System.out.println(String.format("%-20s%-20s%-20s%-10s", "Library Number", "Name", "Email", "Phone"));
        for (User user : this.users) {
            if (userLoggedIn.equals(user.getLibraryNumber())) {
                System.out.println(user.toString());
            }
        }
    }
}
