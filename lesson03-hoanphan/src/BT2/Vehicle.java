package BT2;

public class Vehicle {
	private String owner;
	private String type;
	private int capacity;
	private double cost;
	private double tax;

	public Vehicle(String owner, String type, int capacity, double cost) {
		this.owner = owner;
		this.type = type;
		this.capacity = capacity;
		this.cost = cost;
		payTax();
	}

	

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCapacity() {
		return this.capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getCost() {
		return this.cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getTax() {
		return this.tax;
	}

	private void payTax() {
		if (capacity < 100)
			this.tax = (cost * 0.01);
		if (capacity < 200)
			this.tax = (cost * 0.03);
		else
			this.tax = (cost * 0.05);
	}
	
	@Override
	public String toString() {
		return this.owner + ", " + this.type + ", " + this.capacity + ", " + this.cost + ", " + this.tax;
	}

}
