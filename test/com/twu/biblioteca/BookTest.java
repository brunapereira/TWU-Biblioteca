package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bpereira on 9/11/15.
 */
public class BookTest {

    Book book;

    @Before
    public void setUp() throws Exception {
        book = new Book(true, "Book 1", "Bruna", "1992");
    }

    @Test
    public void availabilityIsTrue() throws Exception {
        assertEquals(book.isAvailability(), true);
    }

    @Test
    public void bookNameIsBook1() throws Exception {
        assertEquals(book.getName(), "Book 1");
    }

    @Test
    public void bookAuthorIsBruna() throws Exception {
        assertEquals(book.getAuthor(), "Bruna");
    }

    @Test
    public void bookYearIs1992() throws Exception {
        assertEquals(book.getYear(), "1992");
    }

    @Test
    public void bookIsUnavailableWhenRented() throws Exception {
        book.rent();
        assertEquals(book.isAvailability(), false);
    }

    @Test
    public void bookIsAvailableWhenReturned() throws Exception {
        book.setAvailability(false);
        book.giveBack();
        assertEquals(book.isAvailability(), true);
    }

    @Test
    public void bookCantBeRentedIfAvailabilityIsFalse() throws Exception {
        book.setAvailability(false);
        assertEquals("Already Rented!", book.rent());
    }

    @Test
     public void bookCantBeReturnedIfAvailabilityIsTrue() throws Exception {
        book.setAvailability(true);
        assertEquals("It's already here!", book.giveBack());
    }

}