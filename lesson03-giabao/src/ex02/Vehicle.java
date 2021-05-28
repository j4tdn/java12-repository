package ex02;

public class Vehicle {
	private String tenchuxe;
	private String loaixe;
	private int dungtich;
	private double trigia;
	public Vehicle() {
		
	}
	public Vehicle(String tenchuxe, String loaixe, int dungtich, double trigia) {
		super();
		this.tenchuxe = tenchuxe;
		this.loaixe = loaixe;
		this.dungtich = dungtich;
		this.trigia = trigia;
	}
	public String getTenchuxe() {
		return tenchuxe;
	}
	public void setTenchuxe(String tenchuxe) {
		this.tenchuxe = tenchuxe;
	}
	public String getLoaixe() {
		return loaixe;
	}
	public void setLoaixe(String loaixe) {
		this.loaixe = loaixe;
	}
	public int getDungtich() {
		return dungtich;
	}
	public void setDungtich(int dungtich) {
		this.dungtich = dungtich;
	}
	public double getTrigia() {
		return trigia;
	}
	public void setTrigia(double trigia) {
		this.trigia = trigia;
	}
	@Override
	public String toString() {
		return "Vehicle [tenchuxe=" + tenchuxe + ", loaixe=" + loaixe + ", dungtich=" + dungtich + ", trigia=" + trigia
				+ "]";
	}
	
}
