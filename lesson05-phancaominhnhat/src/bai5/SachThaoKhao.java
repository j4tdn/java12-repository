package bai5;

public class SachThaoKhao extends Sach {
	public SachThaoKhao(String maSach, int donGia, String nhaXuatBan, Double thue) {
		super(maSach, donGia, nhaXuatBan);
		this.thue = thue;
	}

	private Double thue;

	public Double getThue() {
		return thue;
	}

	public void setThue(Double thue) {
		this.thue = thue;
	}
	
}
