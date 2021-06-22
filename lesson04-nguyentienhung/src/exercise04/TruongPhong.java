package exercise04;

public class TruongPhong extends People {
	private int soLuongNhanVien;

	public TruongPhong() {
		super();
	}

	public TruongPhong(String hoVaTen, int namSinh, float heSoLuong, int soLuongNhanVien) {
		super(hoVaTen, namSinh, heSoLuong);
		this.soLuongNhanVien = soLuongNhanVien;
	}

	public int getSoLuongNhanVien() {
		return soLuongNhanVien;
	}

	public void setSoLuongNhanVien(int soLuongNhanVien) {
		this.soLuongNhanVien = soLuongNhanVien;
	}

	public float calculateSalary() {
		return heSoLuong * 2200000;
	}

	@Override
	public String toString() {
		return this.hoVaTen + "\t\t" + this.namSinh + "\t\t" + this.heSoLuong + "\t\t" + this.soLuongNhanVien + "\t\t"
				+ calculateSalary();
	}
}
