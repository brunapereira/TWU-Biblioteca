package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) throws Exception {
        BibliotecaFactory factory = new BibliotecaFactory();
        Biblioteca biblioteca = new Biblioteca(factory.createBooks(), factory.createMovies(), factory.createUsers(), factory.createMenu());

        biblioteca.welcomeMessage();

        Scanner scan = new Scanner(System.in);
        System.out.print("Login:");
        String login = scan.nextLine();
        System.out.print("\nSenha:");
        String password = scan.nextLine();

        if (biblioteca.logIn(login, password)){
            while(true) { biblioteca.showMenu(); }
        } else {
            biblioteca.showLoginError();
        }
    }
}
