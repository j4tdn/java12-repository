package exercise02;

public class Vehicle {
    private String name;
    private String model;
    private int capacity;
    private double cost;
    private double taxation;
    public Vehicle() {
		super();
	}
	public Vehicle(String name, String model, int capacity, double cost) {
		super();
		this.name = name;
		this.model = model;
		this.capacity = capacity;
		this.cost = cost;
		this.taxation=this.caculatedTaxation();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
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
	public double getTaxation() {
		return taxation;
	}
	public void setTaxation(double taxation) {
		this.taxation = taxation;
	}
	public double caculatedTaxation() {
		if(this.capacity<100)this.taxation=this.cost*0.01;
		else if(this.capacity<=200)this.taxation=this.cost*0.03;
		else this.taxation=this.cost*0.05;
		return this.taxation;
	}
	@Override
	public String toString() {
		return  name + "\t\t" + model + "\t\t" + capacity + "\t\t" + cost
				+ "\t\t" + taxation;
	}
	
}
