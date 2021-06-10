package ex05;

public class Textbook {
	private String idS;
	private double cost;
	private String author;
	private String status;
	
	public Textbook() {
		// TODO Auto-generated constructor stub
	}
	
	public Textbook(String idS, double cost, String author, String status) {
		this.idS = idS;
		this.cost = cost;
		this.author = author;
		this.status = status;
	}

	public String getStatus() {
		return status;
	}



	public String getIdS() {
		return idS;
	}
	
	public void setIdS(String idS) {
		this.idS = idS;
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
	
	public String isStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Textbook [idS=" + idS + ", cost=" + cost + ", author=" + author + ", status=" + status + "]";
	}
	
	
}
