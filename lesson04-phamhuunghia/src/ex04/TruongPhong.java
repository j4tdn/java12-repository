package ex04;

public class TruongPhong extends Person{
	private int soLuongNhanVien;
	
	
	public TruongPhong(String name, int yearOfBirth, float heSoLuong, int soLuongNhanVien) {
		super(name, yearOfBirth, heSoLuong);
		this.soLuongNhanVien = soLuongNhanVien;
	}
	
	public int getSoLuongNhanVien() {
		return soLuongNhanVien;
	}
	public void setSoLuongNhanVien(int soLuongNhanVien) {
		this.soLuongNhanVien = soLuongNhanVien;
	}
	

	@Override
	public float getSalary() {
		return heSoLuong*300000;
	}

	@Override
	public String toString() {
		return "TruongPhong [soLuongNhanVien=" + soLuongNhanVien + ", name=" + name + ", yearOfBirth=" + yearOfBirth
				+ ", heSoLuong=" + heSoLuong + "]";
	}
}
