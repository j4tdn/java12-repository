package ex05;

public class TextBook extends Book {
    private boolean status;

    public TextBook(String bookID, double bookPrice, String bookPublisher, boolean status) {
        super(bookID, bookPrice, bookPublisher);
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
