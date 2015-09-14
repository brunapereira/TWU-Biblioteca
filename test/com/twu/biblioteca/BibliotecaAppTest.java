package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by bpereira on 9/11/15.
 */
public class BibliotecaAppTest {

    BibliotecaApp biblioteca;

    @Before
    public void setUp() throws Exception {
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book(true, "Book 1", "Bruna", "1992"));
        books.add(new Book(true, "Book 2", "Julia", "1999"));
        books.add(new Book(true, "Book 2", "Fernanda", "2003"));
        biblioteca = new BibliotecaApp(books);
    }

    @Test
    public void test() throws Exception {
        
    }


}