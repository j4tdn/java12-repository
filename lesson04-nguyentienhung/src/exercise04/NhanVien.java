package exercise04;

public class NhanVien extends People {
	private String tenDonVi;

	public NhanVien() {
		super();
	}

	public NhanVien(String hoVaTen, int namSinh, float heSoLuong, String tenDonVi) {
		super(hoVaTen, namSinh, heSoLuong);
		this.tenDonVi = tenDonVi;
	}

	public String getTenDonVi() {
		return tenDonVi;
	}

	public void setTenDonVi(String tenDonVi) {
		this.tenDonVi = tenDonVi;
	}

	public float calculateSalary() {
		return heSoLuong * 1250000;
	}

	@Override
	public String toString() {
		return this.hoVaTen + "\t\t" + this.namSinh + "\t\t" + this.heSoLuong + "\t\t" + this.tenDonVi + "\t\t"
				+ calculateSalary();
	}

}
