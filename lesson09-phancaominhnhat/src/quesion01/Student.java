package quesion01;

public class Student {
	private int maSinhVien;
	private String hoTen;
	private XepLoai xepLoai;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int maSinhVien, String hoTen, XepLoai xepLoai) {
		this.maSinhVien = maSinhVien;
		this.hoTen = hoTen;
		this.xepLoai = xepLoai;
	}

	public int getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public XepLoai getXepLoai() {
		return xepLoai;
	}

	public void setXepLoai(XepLoai xepLoai) {
		this.xepLoai = xepLoai;
	}

	@Override
	public String toString() {
		return "Student [maSinhVien=" + maSinhVien + ", hoTen=" + hoTen + ", xepLoai=" + xepLoai + "]";
	}
}
