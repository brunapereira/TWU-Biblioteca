package com.twu.biblioteca;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class BibliotecaApp {

    private void welcomeMessage(){
        System.out.println("Hi! Welcome to the biblioteca from TWU 46!");
        System.out.println("Here you can check-out any available book.");
        System.out.println("I suggest you to check all the book we have available by choosing option 1. Try it out!\n");
    }

    private void menu(){
        Scanner input = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println(
                "1- List books\n" +
                "2- Finish"
        );

        int selection = input.nextInt();
        input.nextLine();

        chooseAction(selection);
    }

    private void chooseAction(int option){
        switch (option) {
            case 1:
                System.out.println("You choose 1");
                break;
            case 2:
                System.out.println("Até a próxima!");
                System.exit(1);
            default:
                System.out.println("Invalid Option");
                break;
        }
    }

    public static void main(String[] args) {
        BibliotecaApp biblioteca = new BibliotecaApp();

        biblioteca.welcomeMessage();
        while(true) {
            biblioteca.menu();
        }
    }
}
