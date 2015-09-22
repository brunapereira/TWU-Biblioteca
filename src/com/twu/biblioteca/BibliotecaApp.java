package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) throws Exception {
        BibliotecaFactory factory = new BibliotecaFactory();
        Biblioteca biblioteca = new Biblioteca(factory.createBooks(), factory.createMovies(), factory.createUsers(), factory.createMenu());

        biblioteca.welcomeMessage();

        if (biblioteca.logIn()){
            while(true) { biblioteca.showMenu(); }
        } else {
            biblioteca.showLoginError();
        }
    }
}
