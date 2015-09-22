package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bpereira on 9/18/15.
 */
public class MovieTest {

    Movie movie;

    @Before
    public void setUp() throws Exception {
        movie = new Movie(true, "Pokemon", "1999", "Bruna", 5);
    }

    @Test
    public void availabilityIsTrue() throws Exception {
        assertEquals(movie.isAvailability(), true);
    }

    @Test
    public void nameIsPokemon() throws Exception {
        assertEquals(movie.getName(), "Pokemon");
    }

    @Test
    public void yearIs1999() throws Exception {
        assertEquals(movie.getYear(), "1999");
    }

    @Test
    public void directorIsBruna() throws Exception {
        assertEquals(movie.getDirector(), "Bruna");
    }

    @Test
    public void ratingIs5() throws Exception {
        assertEquals(movie.getRating(), 5);
    }

    @Test
    public void movieIsUnavailableWhenRented() throws Exception {
        movie.rent();
        assertEquals(movie.isAvailability(), false);
    }

    @Test
    public void movieIsAvailableWhenReturned() throws Exception {
        movie.setAvailability(false);
        movie.giveBack();
        assertEquals(movie.isAvailability(), true);
    }

    @Test
    public void movieCantBeRentedIfAvailabilityIsFalse() throws Exception {
        movie.setAvailability(false);
        assertEquals("Already Rented!", movie.rent());
    }

    @Test
    public void movieCantBeReturnedIfAvailabilityIsTrue() throws Exception {
        movie.setAvailability(true);
        assertEquals("It's already here!", movie.giveBack());
    }

    @Test
    public void movieRentedCorrectly() throws Exception {
        movie.setAvailability(true);
        assertEquals("Thank you! Enjoy.", movie.rent());
    }

    @Test
    public void movieReturnedCorrectly() throws Exception {
        movie.setAvailability(false);
        assertEquals("Thank you for returning!", movie.giveBack());
    }

}