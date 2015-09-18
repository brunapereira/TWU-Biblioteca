package com.twu.biblioteca;

/**
 * Created by bpereira on 9/18/15.
 */
public class User {

    private String libraryNumber;
    private String name;
    private String password;
    private String email;
    private String phoneNumber;

    public User(String libraryNumber, String name, String password, String email, String phoneNumber) {
        this.libraryNumber = libraryNumber;
        this.name = name;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getLibraryNumber() {
        return libraryNumber;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
