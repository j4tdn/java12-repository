package ex05;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Book[] books = createBookArrays();
    }

    private static Book[] createBookArrays() {
        Book[] books = new Book[] {
                new Book("SGK1", 15, "Nhi Dong", "new"),
                new Book("SGK2", 16, "B", "old"),
                new Book("SGK3", 101, "C", "new"),
                new Book("STK4", 150, "D", 10),
                new Book("STK5", 200, "C", 14)
        };
        return books;
    }

    private static List<Book> findBookByPublisher(Book[] a) {
        List<Book> books = new ArrayList<>();
        for (Book book: books) {
            if (book.getPublisher().equals("Nhi Dong")) {
                books.add(book);
            }
        }
        return books;
    }

    private static List<Book> findBookByPrice(Book[] a) {
        List<Book> books = new ArrayList<>();
        for (Book book: books) {
            if (book.getPrice() < 50) {
                books.add(book);
            }
        }
        return books;
    }

    private static List<Book> findTextBookByPrice(Book[] a) {
        List<Book> books = new ArrayList<>();
        for (Book book: books) {
            if (book.getTax() == 0 && book.getPrice() >= 100 && book.getPrice() <= 200) {
                books.add(book);
            }
        }
        return books;
    }
}
