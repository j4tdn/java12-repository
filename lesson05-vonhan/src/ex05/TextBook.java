package ex05;

public class TextBook {
	private int id;
	private double price;
	private String author;
	private String status;
	
	public TextBook() {
		// TODO Auto-generated constructor stub
	}

	public TextBook(int id, double price, String author, String status) {
		super();
		this.id = id;
		this.price = price;
		this.author = author;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TextBook [id=" + id + ", price=" + price + ", author=" + author + ", status=" + status + "]";
	}
	
	
}
