package com.twu.biblioteca;

/**
 * Created by bpereira on 9/22/15.
 */
abstract class Product {

    boolean availability;
    String name;
    String year;

    public boolean isAvailability(){
        return this.availability;
    }

    public String getName(){
        return this.name;
    }

    public String getYear(){
        return this.year;
    }

    public void setAvailability(boolean a){
        this.availability = a;
    }

    public String rent() throws Exception {
        String result;
        if (this.isAvailability()) {
            this.setAvailability(false);
            result = "Thank you! Enjoy.";
        }
        else
            result = "Already Rented!";

        System.out.println(result);
        return result;
    }

    public String giveBack() throws Exception {
        String result;
        if (!this.isAvailability()) {
            this.setAvailability(true);
            result = "Thank you for returning!";
        }
        else
            result = "It's already here!";

        System.out.println(result);
        return result;
    }
}
