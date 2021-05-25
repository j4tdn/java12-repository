package bean;

public class CarAdv {
	public static String model;

	private int serial;
	private String color;

	public CarAdv() {
		super();
	}

	public CarAdv(int serial, String color) {
		super();
		this.serial = serial;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [serial=" + serial + ", model=" + model + ", color=" + color + "]";
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
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof CarAdv))
			return false;
		CarAdv that = (CarAdv) obj;
		return getSerial() == that.getSerial();
	}
}
