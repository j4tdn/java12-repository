package common;

import java.io.Serializable;

public class Trader implements FileHandle,Serializable{
	private static final long serialize =1; 
	private String name;
	 private String city;
	 
	 public Trader() {
		// TODO Auto-generated constructor stub
	}

	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	
	public Trader(String line){
		String[] items=line.split(",\\s");
		if (items.length == 2) {
			this.city = items[1];
			this.name=items[0];
		}
		
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

	@Override
	public String toString() {
		return "Trader [name=" + name + ", city=" + city + "]";
	}
	 
	public String toLine() {
		return this.getName()+" in "+this.getCity();
	}
	
	public static Trader toObject(String line) {
		String[] items=line.split(",\\s");
		if (items.length != 2) {
			return null;
		}
		return new Trader(items[1],items[0]);
	}

	@Override
	public String toline() {
		// TODO Auto-generated method stub
		return null;
	}

	
}