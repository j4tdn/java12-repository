package ex04;


public class People {
	protected String hoten;
	protected String namsinh;
	protected double hsluong;
	
	public People() {
	}

	public People(String hoten, String namsinh, double hsluong) {
		super();
		this.hoten = hoten;
		this.namsinh = namsinh;
		this.hsluong = hsluong;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getNamsinh() {
		return namsinh;
	}

	public void setNamsinh(String namsinh) {
		this.namsinh = namsinh;
	}

	public double getHsluong() {
		return hsluong;
	}

	public void setHsluong(double d) {
		this.hsluong = d;
	}
	public int money() {
		return (int)hsluong;
	}

	@Override
	public String toString() {
		return "People [hoten=" + hoten + ", namsinh=" + namsinh + ", hsluong=" + hsluong + "]";
	}
	
	
}
