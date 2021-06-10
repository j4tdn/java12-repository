package bai5;

public class SachGiaoKhoa extends Sach {
	public SachGiaoKhoa( String maSach, int donGia, String nhaXuatBan, boolean tinhTrang ) {
		super(maSach, donGia, nhaXuatBan);
		this.tinhTrang = tinhTrang;
	}
	private boolean tinhTrang;
	
	public boolean isTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(boolean tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	
	
	

}
