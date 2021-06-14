package ex05;

public class Buying {
	private Customer customer;
	private Textbook textbook;
	private RefBook refBook;

	public Buying() {

	}

	public Buying(Customer customer, Textbook textbook, RefBook refBook) {
		this.customer = customer;
		this.textbook = textbook;
		this.refBook = refBook;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Book getTextbook() {
		return textbook;
	}

	public void setTextbook(Textbook textbook) {
		this.textbook = textbook;
	}

	public Book getRefBook() {
		return refBook;
	}

	public void setRefBook(RefBook refBook) {
		this.refBook = refBook;
	}

	@Override
	public String toString() {
		return "Buying [customer=" + customer + ", textbook=" + textbook + ", refBook=" + refBook + "]";
	}

}
