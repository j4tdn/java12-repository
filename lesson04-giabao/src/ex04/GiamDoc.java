package ex04;

public class GiamDoc extends People {
	private double hschucvu;
	
	public GiamDoc() {
	}

	public GiamDoc(String hoten, String namsinh, double hsluong, double hschucvu) {
		super(hoten,namsinh,hsluong);
		this.hschucvu = hschucvu;
	}

	public double getHschucvu() {
		return hschucvu;
	}

	public void setHschucvu(double hschucvu) {
		this.hschucvu = hschucvu;
	}
	@Override
	public int money() {
		return (int) ((hsluong+hschucvu)*3000000);
	}
	
	@Override
	public String toString() {
		return "GiamDoc [hoten=" + hoten + ", namsinh=" + namsinh + ", hsluong=" + hsluong
				+ "hschucvu=" + hschucvu + "]";
	}

	
}
