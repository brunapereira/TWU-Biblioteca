package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


/**
 * Created by bpereira on 9/17/15.
 */

public class BibliotecaTest {

    Biblioteca biblioteca;
    ArrayList<Book> books = new ArrayList<Book>();
    ArrayList<Movie> movies = new ArrayList<Movie>();
    ArrayList<User> users = new ArrayList<User>();
    Menu menu = new Menu();


    @Before
    public void setUp() {
        books.add(Mockito.spy(new Book(true, "Alice in Wonderland", "Bruna", "1992")));
        books.add(Mockito.spy(new Book(false, "Java", "Author", "1964")));

        movies.add(new Movie(true, "Pokemon", "Bruna", "1999", 5));
        movies.add(new Movie(false, "Chaves", "El chavo", "1999", 5));

        users.add(new User("123-1111", "Julia", "juliapass", "julia@tw.com", "9876-9999"));
        biblioteca = new Biblioteca(books, movies, users, menu);
    }

    @Test
    public void logInAuthenticatesWhenUserAndPasswordsAreRight() throws Exception {
        assertEquals(biblioteca.logIn("123-1111", "juliapass"), true);
    }

    @Test
    public void logInDoesntAuthenticateWhenUserAndPasswordDontMatch() throws Exception {
        assertEquals(biblioteca.logIn("Julia", "julia"), false);
    }

    @Test
    public void findBookIsFindingTheRightBookToCheckout() throws Exception {
        biblioteca.findBook("Alice in Wonderland", "checkOut");
        assertEquals(books.get(0).isAvailability(), false);
    }

    @Test
    public void findMovieIsFindingTheRightMovieToCheckout() throws Exception {
        biblioteca.findMovie("Pokemon", "checkOut");
        assertEquals(movies.get(0).isAvailability(), false);
    }

    @Test
    public void findBookIsFindingTheRightBookToGiveBack() throws Exception {
        biblioteca.findBook("Java", "giveBack");
        assertEquals(books.get(1).isAvailability(), true);
    }

    @Test
    public void findMovieIsFindingTheRightBookToGiveBack() throws Exception {
        biblioteca.findMovie("Chaves", "giveBack");
        assertEquals(movies.get(1).isAvailability(), true);
    }
}