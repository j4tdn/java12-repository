package ex05;

public class Book {
	
    private String bookID;
    private double bookPrice;
    private String bookPublisher;

    public Book(String bookID, double bookPrice, String bookPublisher) {
        this.bookID = bookID;
        this.bookPrice = bookPrice;
        this.bookPublisher = bookPublisher;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    @Override
    public String toString() {
        return "(" + bookID + ", " + bookPrice + ", " + bookPublisher + ")";
    }
}
