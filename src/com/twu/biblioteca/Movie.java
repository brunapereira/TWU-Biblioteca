package com.twu.biblioteca;

import static java.lang.String.format;

/**
 * Created by bpereira on 9/18/15.
 */
public class Movie extends Product{

    private String director;
    private int rating;

    public Movie(boolean availability, String name, String year, String director, int rating) {
        this.availability = availability;
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
    }

    public String getDirector() {
        return director;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return format("%-30s%-10s%-20s%-2s", this.getName(), this.getDirector(), this.getYear(), this.getRating());
    }


}
