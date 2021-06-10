package ex05;

public class BookReceipt {
    private Customer customer;
    private Book[] books;

    public BookReceipt(Customer customer, Book[] books) {
        this.customer = customer;
        this.books = books;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
}
