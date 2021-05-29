package ex02;

public class Vehicle {
	private String nameOwner;
	private String type;
	private int capacity;
	private double cost;
	private double tax;
	public Vehicle() {
		
	}
	
	public Vehicle(String nameOwner, String type, int capacity, double cost) {
		this.nameOwner = nameOwner;
		this.type = type;
		this.capacity = capacity;
		this.cost = cost;
		setTax(cost);
	}

	public String getNameOwner() {
		return nameOwner;
	}

	public void setNameOwer(String nameOwner) {
		this.nameOwner = nameOwner;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public double getTax() {
		return tax;
	}

	public void setTax(double cost) {
		if (this.capacity < 100) this.tax = cost*0.01;
		else if (this.capacity < 200) this.tax = cost*0.03;
		else this.tax = cost*0.05;
	}

	@Override
	public String toString() {
		System.out.printf("%-20s%-15s%-15d%-20.2f%-20.2f\n", nameOwner, type , capacity, cost, tax);
		return "";
	}


	
	
}
