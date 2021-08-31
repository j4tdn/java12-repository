package Ex05;

public class expenditure {
	private String information;
	private double total;

	public expenditure() {

	}

	public expenditure(String information, double total) {
		super();
		this.information = information;
		this.total = total;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "expenditure [information=" + information + ", total=" + total + "]";
	}
}
