package ex05;

public class Textbook extends Book {
	private boolean status;

	public Textbook() {

	}

	public Textbook(String idB, double cost, String author, boolean status) {
		super(idB, cost, author);
		this.status = status;
	}
	
	public static Textbook setTextbook(String idB, double cost, String author, boolean status) {
		Textbook textbook = new Textbook(idB, cost, author, status);
		return textbook;
	}
	
	public String setStatus() {
		if (this.status == true) return "Moi";
		return "Cu";
	}
	
	public String getStatus() {
		return setStatus();
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Textbook [id= "+ this.idB + ", cost=" + this.cost + ", author: "+ this.getAuthor()  + ", status: "+ this.getStatus() +  "]"; 
	}

}
