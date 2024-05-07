package bookapp;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Main {
    static Book[] books = new Book[2];

    public static void main(String[] args) {

        while (true) {


            System.out.println("""
                    1 - Kitablara  bax :
                    2 - Kitab elave et : 
                    3 - Kitabi axtar :
                    """);
            System.out.println("operationu daxil edin");
            int operation = new Scanner(System.in).nextInt();
            switch (operation) {
                case 1:
                    showBooks();
                    break;
                case 2:
                    addBook();
                    break;

                case 3:
                    System.out.println("""
                            1 : Qiymete gore axtarish etmek!
                            2 : Kitabin adina gore axtarish etmek!
                            3 : Qiymet araliginda olan kitablara gore axtarish etmek!
                            """);
                    int operationForThirdCase = new Scanner(System.in).nextInt();
                    switch (operationForThirdCase) {
                        case 1:
                            searchBookByPrice(books);
                            break;
                        case 2:
                            searchBookByName(books);
                            break;
                        case 3:
                            searchBookBetweenMinPriceAndMaxPrice(books);
                    }


            }
            System.out.println("""
                    1 - Davam etmek
                    2 - Bitirmek 
                    """);
            int operationForExit = new Scanner(System.in).nextInt();
            switch (operationForExit) {
                case 1:
                    continue;
                case 2:
                    System.exit(0);
            }
        }
    }

    public static void showBooks() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println("Name : " + books[i].name + " Price : " + books[i].price + " Count :" + books[i].count);
            }
        }
    }

    public static void addBook() {
        System.out.println("Kitabi elave edin :");
        String bookName = new Scanner(System.in).nextLine();
        System.out.println("Kitabin qiymetini elave edin");
        int bookPrice = new Scanner(System.in).nextInt();
        System.out.println("Kitabin sayini elave edin");
        int bookCount = new Scanner(System.in).nextInt();
        Book book = new Book(bookName, bookPrice, bookCount);
        boolean hasNull = false;
        for (int i = 0; i < books.length; i++) {

            if (books[i] == null) {
                books[i] = book;
                hasNull = true;
                break;
            }
        }
        if (hasNull == false) {
            Book[] newBook = new Book[books.length * 2];
            for (int i = 0; i < books.length; i++) {
                newBook[i] = books[i];
            }

            newBook[books.length] = book;
            books = newBook;
        }
    }

    public static void searchBookBetweenMinPriceAndMaxPrice(Book[] books) {
        System.out.println("Minimum qiymeti daxil edin :");
        int minPrice = new Scanner(System.in).nextInt();
        System.out.println("Maksimum qiymeti daxil edin :");
        int maxPrice = new Scanner(System.in).nextInt();
        for (int i = 0; i < books.length; i++) {
            if (books[i].price >= minPrice && books[i].price <= maxPrice) {
                System.out.println("Name : " + books[i].name + " Price : " + books[i].price + " Count : " + books[i].count);
            }
        }
    }

    public static void searchBookByName(Book[] books) {
        System.out.println("Kitabin adini daxil edin :");
        String bookName = new Scanner(System.in).nextLine();

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                if (bookName.equals(books[i].name)) {
                    System.out.println("Name : " + books[i].name + " Price : " + books[i].price + " Count :" + books[i].count);
                }
            }

        }
    }

    public static void searchBookByPrice(Book[] books) {
        System.out.println("Qiymeti daxil edin :");
        int constantPice = new Scanner(System.in).nextInt();
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {

                if (books[i].price >= constantPice) {
                    System.out.println("Name : " + books[i].name + " Price : " + books[i].price + " Count : " + books[i].count);
                }
            }
        }
    }
}

