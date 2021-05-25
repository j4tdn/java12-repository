package bean;

/**
 * 
 * create model Audi @@@@
 *
 */
public class CarAdv {
	private int serial;
	public static String model;
	private String color;
	
	public CarAdv() {
	}

	public CarAdv(int serial, String color) {
		this.serial = serial;
		this.color = color;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [serial=" + serial + ", model=" + model + ", color=" + color + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(!(obj instanceof CarAdv)) {
			return false;
		}
		
		CarAdv that = (CarAdv)obj;
		return this.getSerial() == that.getSerial();
	}
}
