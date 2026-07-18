package Uni;

import java.util.Scanner;

public class Book {

    
     int bookId;
     String title;
     String author;
     double price;

    
     static String libraryName;
     static int bookCount = 0;


    public Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;

       
        bookCount++;
    }

    
    public void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println("--------------------------");
    }

    
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }


    public static void displayBookCount() {
        System.out.println("Total Books Created: " + bookCount);
    }

   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter library name: ");
        libraryName = sc.nextLine();

        
        System.out.print("Enter the number of books: ");
        int numberOfBooks = sc.nextInt();
        sc.nextLine();

        
        Book[] books = new Book[numberOfBooks];

       
        for (int i = 0; i < numberOfBooks; i++) {

            System.out.println("\nEnter details of Book " + (i + 1));

            System.out.print("Enter Book ID: ");
            int bookId = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter title: ");
            String title = sc.nextLine();

            System.out.print("Enter author: ");
            String author = sc.nextLine();

            System.out.print("Enter price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            
            books[i] = new Book(bookId, title, author, price);
        }

        
        System.out.println("\nBOOK DETAILS");

        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println("\nBook " + (i + 1));
            books[i].displayBook();
        }

        // Calling static methods using the class name
        Book.displayLibraryName();
        Book.displayBookCount();

        sc.close();
    }
}

