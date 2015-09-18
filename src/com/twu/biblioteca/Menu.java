package com.twu.biblioteca;

import java.util.*;

/**
 * Created by bpereira on 9/17/15.
 */
public class Menu {

    private static final Map<String, Integer> options = new TreeMap<String, Integer>();

    public Menu() {
        this.createOptions();
    }

    public void run(Biblioteca biblioteca) throws Exception {
        show();
        chooseAction(optionFromKeyboard(), biblioteca);
    }

    private void show(){
        System.out.println("\nChoose an option:");


        for (String key : options.keySet()) {
            Integer value = options.get(key);
            System.out.println(value + " - " + key);
        }

    }

    private void chooseAction(int option, Biblioteca biblioteca) throws Exception {
        switch (option) {
            case 1:
                System.out.println("What book do you want?");
                biblioteca.findBook(bookFromKeyboard(), "checkOut");
                break;
            case 2:
                System.out.println("What movie do you want?");
                biblioteca.findBook(movieFromKeyboard(), "checkOut");
                break;
            case 3:
                System.out.println("What book will you give back?");
                biblioteca.findBook(bookFromKeyboard(), "giveBack");
                break;
            case 4:
                System.out.println("What movie will you give back?");
                biblioteca.findBook(movieFromKeyboard(), "giveBack");
                break;
            case 5:
                System.out.println("So far, these are the books we have available in our library. \n");
                biblioteca.listBooks();
                break;
            case 6:
                System.out.println("So far, these are the movies we have available in our library. \n");
                biblioteca.listMovies();
                break;
            case 7:
                quit();
            default:
                System.out.println("Invalid Option");
                break;
        }
    }

    private void quit() {
        System.exit(1);
    }

    private int optionFromKeyboard(){
        Scanner input = new Scanner(System.in);
        int selection = input.nextInt();
        input.nextLine();
        return selection;
    }

    private String bookFromKeyboard(){
        Scanner scan = new Scanner(System.in);
        String book = scan.nextLine();
        return book;
    }

    private void createOptions(){
        options.put("Check out book", 1);
        options.put("Check out movie", 2);
        options.put("Give back book", 3);
        options.put("Give back movie", 4);
        options.put("List books", 5);
        options.put("List movies", 6);
        options.put("Quit", 7);

    }
}
