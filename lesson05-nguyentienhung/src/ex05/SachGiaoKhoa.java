package ex05;

public class SachGiaoKhoa {
private String maSach;
private String donGia;
private String nhaXuatBan;
private String TinhTrang;
public SachGiaoKhoa(String maSach, String donGia, String nhaXuatBan, String tinhTrang) {
	super();
	this.maSach = maSach;
	this.donGia = donGia;
	this.nhaXuatBan = nhaXuatBan;
	TinhTrang = tinhTrang;
}
public SachGiaoKhoa() {
	super();
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
public String getTinhTrang() {
	return TinhTrang;
}
public void setTinhTrang(String tinhTrang) {
	TinhTrang = tinhTrang;
}
@Override
public String toString() {
	return "SachGiaoKhoa [maSach=" + maSach + ", donGia=" + donGia + ", nhaXuatBan=" + nhaXuatBan + ", TinhTrang="
			+ TinhTrang + "]";
}

}
