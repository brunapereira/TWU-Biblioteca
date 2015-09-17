package com.twu.biblioteca;

import java.util.Scanner;

/**
 * Created by bpereira on 9/17/15.
 */
public class Menu {

    public void run(Biblioteca biblioteca) throws Exception {

        Scanner input = new Scanner(System.in);

        show();

        int selection = input.nextInt();
        input.nextLine();

        chooseAction(selection, biblioteca);
    }

    private void show(){
        System.out.println("\nChoose an option:");
        System.out.println(
                "1- List books\n" +
                "2- Check out\n" +
                "3- Give back\n" +
                "4- Quit"
        );
    }

    private void chooseAction(int option, Biblioteca biblioteca) throws Exception {
        switch (option) {
            case 1:
                System.out.println("So far, these are the books we have available in our library. \n");
                biblioteca.listBooks();
                break;
            case 2:
                System.out.println("What book do you want?");
                biblioteca.listBooks();
                System.out.println("I felt free to show you the available books again :)");
                Scanner scan = new Scanner(System.in);
                String bookToCheckOut = scan.nextLine();
                biblioteca.findBook(bookToCheckOut, "checkOut");
                break;
            case 3:
                System.out.println("What book will you give back?");
                Scanner scan2 = new Scanner(System.in);
                String bookToGiveBack = scan2.nextLine();
                biblioteca.findBook(bookToGiveBack, "giveBack");
                break;
            case 4:
                quit();
            default:
                System.out.println("Invalid Option");
                break;
        }
    }

    private void quit() {
        System.exit(1);
    }


}
