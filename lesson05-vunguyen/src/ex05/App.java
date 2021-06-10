package ex05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
	
    public static void main(String[] args) {
        Book[] books = createBooks();
        System.out.println(Arrays.toString(findBooksByPublisher(books)));
        System.out.println(Arrays.toString(findBooksByPrice(books)));
        System.out.println(Arrays.toString(findTextBookByPrice(books)));

        BookReceipt bookReceipt = new BookReceipt(
                new Customer("01", "A", "118", "7 Tran Cao Van")
                , new Book[]{books[0], books[3]});
        System.out.println("Customer has to pay: " + exportReceipt(bookReceipt));
    }

    private static Book[] createBooks() {
        Book b1 = new TextBook("SGK1", 15, "Nhi Dong", true);
        Book b2 = new TextBook("SGK2", 55, "Giao Duc", false);
        Book b3 = new TextBook("SGK3", 105, "Phuong Nam", true);
        Book b4 = new ReferBook("STK1", 150, "Nhi Dong", 10);
        Book b5 = new ReferBook("STK2", 35, "Thang Long", 15);
        return new Book[]{b1, b2, b3, b4, b5};
    }

    private static Book[] findBooksByPublisher(Book[] books) {
        List<Book> bookArrs = new ArrayList<>();
        for (Book book : books) {
            if (book.getBookPublisher().equals("Nhi Dong")) {
                bookArrs.add(book);
            }
        }
        return bookArrs.toArray(new Book[0]);
    }

    private static Book[] findBooksByPrice(Book[] books) {
        List<Book> bookArrs = new ArrayList<>();
        for (Book book : books) {
            if (book.getBookPrice() < 50) {
                bookArrs.add(book);
            }
        }
        return bookArrs.toArray(new Book[0]);
    }

    private static Book[] findTextBookByPrice(Book[] books) {
        List<Book> bookArrs = new ArrayList<>();
        for (Book book : books) {
            if (book.getBookID().matches("^SGK.*") && book.getBookPrice() <= 200 && book.getBookPrice() >= 100) {
                bookArrs.add(book);
            }
        }
        return bookArrs.toArray(new Book[0]);
    }

    private static double exportReceipt(BookReceipt bookReceipt) {
        double money = 0;
        Book[] books = bookReceipt.getBooks();
        for (Book book: books) {
            if (book.getBookID().matches("^SGK.*")) {
                money += book.getBookPrice() * 30 / 100;
                
            }
            if (book.getBookID().matches("^STK,*")) {
                money += book.getBookPrice() * (1 + ((ReferBook)book).getTax() / 100);
            }
        }
        return money;
    }
}
