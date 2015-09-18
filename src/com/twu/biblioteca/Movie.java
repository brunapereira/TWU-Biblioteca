package com.twu.biblioteca;

import static java.lang.String.format;

/**
 * Created by bpereira on 9/18/15.
 */
public class Movie {
    private boolean availability;
    private String name;
    private String year;
    private String director;
    private int rating;

    public Movie(boolean availability, String name, String year, String director, int rating) {
        this.availability = availability;
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
    }

    public boolean isAvailability() {
        return availability;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }

    public int getRating() {
        return rating;
    }

    public void setAvailability(boolean a) {
        this.availability = a;
    }

    public String rent() {
        String result;
        if (this.isAvailability()) {
            this.setAvailability(false);
            result = "Thank you! Enjoy the movie.";
        }
        else
            result = "Movie Already Rented!";

        System.out.println(result);
        return result;
    }

    public String giveBack(){
        String result;
        if (!this.isAvailability()) {
            this.setAvailability(true);
            result = "Thank you for returning the movie!";
        }
        else
            result = "This movie is already here!";

        System.out.println(result);
        return result;
    }

    public void print() {
        System.out.println(format("%-30s%-10s%-20s%-2s", this.getName(), this.getDirector(), this.getYear(), this.getRating()));
    }


}
