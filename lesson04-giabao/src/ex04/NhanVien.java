package ex04;

public class NhanVien extends People {
	private String tendonvi;
	
	public NhanVien() {
	}

	public NhanVien(String hoten, String namsinh, double hsluong, String tendonvi) {
		super(hoten, namsinh, hsluong);
		this.tendonvi = tendonvi;
	}

	public String getTendonvi() {
		return tendonvi;
	}

	public void setTendonvi(String tendonvi) {
		this.tendonvi = tendonvi;
	}
	
	
	 @Override
	public String toString() {
		return "NhanVien [hoten=" + hoten + ", namsinh=" + namsinh + ", hsluong=" + hsluong
				+", tendonvi=" + tendonvi + "]";
	}

	@Override
	public int money() {
		// TODO Auto-generated method stub
		return (int) ((hsluong)*1250000);
	}
	
	
	
	
}
