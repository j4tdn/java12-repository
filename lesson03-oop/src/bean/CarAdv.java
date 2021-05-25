package bean;

public class CarAdv {
	private int serial;
	public static String model;
	private String color;
	public int getSerial() {
		return serial;
	}
	public void setSerial(int serial) {
		this.serial = serial;
	}
	public String getModel() {
		return model;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public CarAdv(int serial, String color) {
		this.serial = serial;
		
		this.color = color;
	}
	public  CarAdv() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Car [serial=" + serial + ", model=" + model + ", color=" + color + "]";
	}
}
