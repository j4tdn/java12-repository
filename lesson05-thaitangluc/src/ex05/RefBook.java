package ex05;

public class RefBook extends Textbook{
	private String idS;
	private double cost;
	private String author;
	private double tax;
	
	public RefBook() {
		// TODO Auto-generated constructor stub
	}
	
	public RefBook(String idS, double cost, String author, double tax) {
		this.idS = idS;
		this.cost = cost;
		this.author = author;
		this.tax = tax;
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

	
	

	public String getIdS() {
		return idS;
	}


	public void setIdS(String idS) {
		this.idS = idS;
	}


	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	
}
