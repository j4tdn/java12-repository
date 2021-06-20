package ex04;

public class TruongPhong extends People {
	private int slNVquanly;
	
	public TruongPhong() {
	}

	public TruongPhong(String hoten, String namsinh, double hsluong, int slNVquanly) {
		super(hoten, namsinh, hsluong);
		this.slNVquanly = slNVquanly;
	}

	public int getSlNVquanly() {
		return slNVquanly;
	}

	public void setSlNVquanly(int slNVquanly) {
		this.slNVquanly = slNVquanly;
	}
	
	
	
	@Override
	public String toString() {
		return "TruongPhong [hoten=" + hoten + ", namsinh=" + namsinh + ", hsluong="
				+ hsluong + ", slNVquanly=" + slNVquanly + "]";
	}

	@Override
	public int money() {
		return (int) ((hsluong)*2200000);
	}
	
	
}
