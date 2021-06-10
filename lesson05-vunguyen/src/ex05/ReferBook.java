package ex05;

public class ReferBook extends Book {
    private double tax;

    public ReferBook(String bookID, double bookPrice, String bookPublisher, double tax) {
        super(bookID, bookPrice, bookPublisher);
        this.tax = tax;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
}
