package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


/**
 * Created by bpereira on 9/17/15.
 */
public class BibliotecaTest {

    Biblioteca biblioteca;
    ArrayList<Book> books = new ArrayList<Book>();

    @Before
    public void setUp() {
        books.add(new Book(true, "Alice in Wonderland", "Bruna", "1992"));
        biblioteca = new Biblioteca(books);
    }

    @Test
    public void findBookIsFindingTheRightBook() throws Exception {
        biblioteca.findBook("Alice in Wonderland", "checkOut");
        assertEquals(books.get(0).getAvailability(), false);
    }


}