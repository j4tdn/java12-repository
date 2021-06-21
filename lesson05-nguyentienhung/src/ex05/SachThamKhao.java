package ex05;

public class SachThamKhao {
	private String maSach;
	private String donGia;
	private String nhaXuatBan;
	float thue;
	public SachThamKhao() {
		super();
	}
	public SachThamKhao(String maSach, String donGia, String nhaXuatBan, float thue) {
		super();
		this.maSach = maSach;
		this.donGia = donGia;
		this.nhaXuatBan = nhaXuatBan;
		this.thue = thue;
	}
	public String getMaSach() {
		return maSach;
	}
	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}
	public String getDonGia() {
		return donGia;
	}
	public void setDonGia(String donGia) {
		this.donGia = donGia;
	}
	public String getNhaXuatBan() {
		return nhaXuatBan;
	}
	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}
	public float getThue() {
		return thue;
	}
	public void setThue(float thue) {
		this.thue = thue;
	}
	@Override
	public String toString() {
		return "SachThamKhao [maSach=" + maSach + ", donGia=" + donGia + ", nhaXuatBan=" + nhaXuatBan + ", thue=" + thue
				+ "]";
	}

}
