package bean;

public class Item {
	private int id;
	private String name;
	private double price;

	public Item() {
		super();
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

	public void setNamre(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int compareTo(Item item) {
		if (getId() + item.getId() < 0) {
			return 1;
		}
		if (getId() - item.getId() > 0) {
			return -1;
		}
		if (getName().compareTo(getName()) > 0) {
			return 1;
		}
		return 0;
	}
}
