package ex05;

public class RefBook extends Book {
	private double tax;

	public RefBook() {

	}

	public RefBook(String idB, double cost, String author, double tax) {
		super(idB, cost, author);
		this.tax = tax;
	}
	
	public static RefBook setRefBook(String idB, double cost, String author, double tax) {
		RefBook refbook = new RefBook(idB, cost, author, tax);
		return refbook;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "ReferenceBook [id= "+ this.idB + ", cost=" + this.cost + ", author: "+ this.getAuthor()  + ", tax: "+ this.tax +  "]";
	}

}
