package ex04;

public class NhanVien extends Person {
	protected String tenDonVi;

	public NhanVien(String name, int yearOfBirth, float heSoLuong, String tenDonVi) {
		super(name, yearOfBirth, heSoLuong);
		this.tenDonVi = tenDonVi;
	}

	public String getTenDonVi() {
		return tenDonVi;
	}

	public void setTenDonVi(String tenDonVi) {
		this.tenDonVi = tenDonVi;
	}
	
	@Override
	public float getSalary() {
		return heSoLuong*300000;
	}

	@Override
	public String toString() {
		return "NhanVien [tenDonVi=" + tenDonVi + ", name=" + name + ", yearOfBirth=" + yearOfBirth + ", heSoLuong="
				+ heSoLuong + "]";
	}
	
	
}
