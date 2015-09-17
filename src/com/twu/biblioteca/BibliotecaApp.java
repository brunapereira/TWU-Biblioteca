package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) throws Exception {
        ArrayList<Book> books = new ArrayList<Book>();
        Biblioteca biblioteca = new Biblioteca(books);
        biblioteca.addBooks();

        biblioteca.welcomeMessage();
        while(true) {
            biblioteca.menu();
        }
    }
}
