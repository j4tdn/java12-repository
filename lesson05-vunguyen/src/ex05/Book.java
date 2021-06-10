package ex05;

public class Book {
    private String id;
    private double price;
    private String publisher;
    private String status;
    private double tax;

    public Book(String id, double price, String publisher, String status) {
        this(id, price, publisher, status, 0);
    }

    public Book(String id, double price, String publisher, double tax) {
        this(id, price, publisher, null, tax);
    }

    public Book(String id, double price, String publisher, String status, double tax) {
        this.id = id;
        this.price = price;
        this.publisher = publisher;
        this.status = status;
        this.tax = tax;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
}
