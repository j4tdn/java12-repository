package ex05;

public class Book {
	protected String idB;
	protected double cost;
	private String author;
	
	public Book() {
		
	}

	public Book(String idB, double cost, String author) {
		this.idB = idB;
		this.cost = cost;
		this.author = author;
	}

	public String getId() {
		return idB;
	}

	public void setId(String idB) {
		this.idB = idB;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id=" + idB + ", cost=" + cost + ", author=" + author + "]";
	}

	public void setBook(String idB, double cost, String author) {
		this.idB = idB;
		this.cost = cost;
		this.author = author;
		
	}
	
	
}
