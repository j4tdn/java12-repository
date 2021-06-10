package ex05;

public class Book {
	String maSach;
	double donGia;
	String nhaXuatBan;
	public String getMaSach() {
		return maSach;
	}
	
	public Book(String maSach, double donGia, String nhaXuatBan) {
		super();
		this.maSach = maSach;
		this.donGia = donGia;
		this.nhaXuatBan = nhaXuatBan;
	}

	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public String getNhaXuatBan() {
		return nhaXuatBan;
	}
	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}
}
