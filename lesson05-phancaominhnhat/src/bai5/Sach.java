package bai5;

public class Sach {
	private String maSach;
	private int donGia;
	private String nhaXuatBan;
	
	public Sach(String maSach, int donGia, String nhaXuatBan) {
		this.maSach = maSach;
		this.donGia = donGia;
		this.nhaXuatBan = nhaXuatBan;
	}
	
	public String getMaSach() {
		return maSach;
	}
	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}
	public int getDonGia() {
		return donGia;
	}
	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}
	public String getNhaXuatBan() {
		return nhaXuatBan;
	}
	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}

	@Override
	public String toString() {
		return "Sach [maSach=" + maSach + ", donGia=" + donGia + ", nhaXuatBan=" + nhaXuatBan + "]";
	}
	
}
