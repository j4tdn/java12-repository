package bai5;

public class SachThaoKhao extends Sach {
	public SachThaoKhao(String maSach, int donGia, String nhaXuatBan, int thue) {
		super(maSach, donGia, nhaXuatBan);
		this.thue = thue;
	}

	private int thue;

	public int getThue() {
		return thue;
	}

	public void setThue(int thue) {
		this.thue = thue;
	}
	
}
