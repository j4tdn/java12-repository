package Ex02;

public class Vehicle {
	private String Owner;
	private String Group;
	private int Capacity;
	private double Cost;
	private double Tax;

	public String getOwner() {
		return Owner;
	}

	public void setOwner(String owner) {
		Owner = owner;
	}

	public String getGroup() {
		return Group;
	}

	public void setGroup(String group) {
		Group = group;
	}

	public int getCapacity() {
		return Capacity;
	}

	public void setCapacity(int capacity) {
		Capacity = capacity;
	}

	public double getCost() {
		return Cost;
	}

	public void setCost(double cost) {
		Cost = cost;
		settax();
	}

	public double getTax() {
		return Tax;
	}

	public Vehicle(String owner, String group, int capacity, long cost) {
		super();
		Owner = owner;
		Group = group;
		Capacity = capacity;
		Cost = cost;
		settax();
	}

	private void settax() {
		if (Capacity < 100)
			this.Tax = (Cost *0.01);
		if (Capacity < 200)
			this.Tax= (Cost * 0.03);
		else
			this.Tax= (Cost * 0.05);
	}

	@Override
	public String toString() {
		return Owner + "\t" + Group + "\t" + Capacity + "\t" + Cost + "\t" + Tax;
	}
}
