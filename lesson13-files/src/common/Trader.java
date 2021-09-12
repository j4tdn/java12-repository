package common;

import java.io.Serializable;

public class Trader implements FileHandler, Serializable{
	private static final long serialVersionUID = 3389211908752204611L;
	
	private transient String name;
	private String city;

	public Trader(String n, String c) {
		this.name = n;
		this.city = c;
	}
	
	public Trader(String line) {
		String[] items = line.split(",\\s");
		if(items.length == 2) {
			this.name = items[1];
			this.city = items[0];
		}
	}
	
	public String getName() {
		return this.name;
	}

	public String getCity() {
		return this.city;
	}

	public String toString() {
		return "Trader:" + this.name + " in " + this.city;
	}
	
	@Override
	public String toLine() {
		return getCity() + ", " + getName();
	}
}