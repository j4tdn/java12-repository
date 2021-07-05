package bean;

public class Item {
	 private int id;
	 private String name;
	 private double price;
	 
	public Item() {
		// TODO Auto-generated constructor stub
	}
	public Item(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	//Item i1 = new Item();
	//Object i2 = new Item();
	
	//Collection , Hash table
	@Override
	public boolean equals(Object obj) {
		if(this ==obj) {
			return true;
		}
		if(!(obj instanceof Item)) {
			return false;
		}
		Item that = (Item)obj;
		return that.getId()==getId();
	}
	 
}
