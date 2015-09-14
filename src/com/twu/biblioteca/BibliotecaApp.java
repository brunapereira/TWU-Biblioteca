package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaApp {

    private ArrayList<Book> books;

    public BibliotecaApp(ArrayList<Book> books) {
        this.books = books;
    }

    private void welcomeMessage(){
        System.out.println("Hi! Welcome to biblioteca from TWU 46!");
        System.out.println("Here you can check-out any available book.");
        System.out.println("I suggest you to check all the book we have available by choosing option 1. Try it out!\n");
    }

    private void menu() throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println(
                "1- List books\n" +
                "2- Check out\n" +
                "3- Quit"
        );

        int selection = input.nextInt();
        input.nextLine();

        chooseAction(selection);
    }

    private void chooseAction(int option) throws Exception {
        switch (option) {
            case 1:
                System.out.println("So far, these are the books we have available in our library. \n");
                listBooks();
                break;
            case 2:
                System.out.println("What book do you want?");
                listBooks();
                System.out.println("I felt free to show you the available books again :)");
                Scanner scan= new Scanner(System.in);
                String bookToCheckOut = scan.nextLine();
                findBook(bookToCheckOut);
                break;
            case 3:
                quit();
            default:
                System.out.println("Invalid Option");
                break;
        }
    }

    private void findBook(String bookToCheckOut) throws Exception {
        for (Book book : this.books) {
            if (book.getName().toLowerCase().equals(bookToCheckOut.toLowerCase())) {
                book.rent();
            }
        }
    }

    private void listBooks() {
        System.out.println(String.format("%-40s%-40s%-4s", "Book Name", "Author", "Year"));
        for (Book book : books) {
            if (book.getAvailability())
                book.print();
        }
    }

    private void quit() {
        System.exit(1);
    }

    private void addBooks() {
        books.add(new Book(true, "Alice in Wonderland", "Bruna", "1992"));
        books.add(new Book(true, "Ruby the Right Way", "Julia", "1999"));
        books.add(new Book(true, "Java Best Parts", "Fernanda", "2003"));
        books.add(new Book(false, "Javascript Best Parts", "Junior", "2003"));
    }

    public static void main(String[] args) throws Exception {
        ArrayList<Book> books = new ArrayList<Book>();
        BibliotecaApp biblioteca = new BibliotecaApp(books);
        biblioteca.addBooks();

        biblioteca.welcomeMessage();
        while(true) {
            biblioteca.menu();
        }
    }
}
