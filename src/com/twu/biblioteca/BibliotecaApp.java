package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) throws Exception {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.welcomeMessage();

        if (biblioteca.logIn()){
            while(true) {
                biblioteca.showMenu();
            }
    }
}
