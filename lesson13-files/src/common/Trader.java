package common;

public class Trader implements FileHandler<Trader>{
	private String name;
	private String city;
	
	public Trader() {
	}

	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String toLine() {
		return getCity() + ", " + getName();
	}
	
	@Override
	public String toString() {
		return "Trader [name=" + name + ", city=" + city + "]";
	}

	@Override
	public Trader toObject() {
		// TODO Auto-generated method stub
		return null;
	}
}
