package BT4;

public class TruongPhong extends People{
	private int SoLuongNVQuanLy;

	public TruongPhong(String hoTen, int nS, Double heSoLuong, int soLuongNVQuanLy) {
		super(hoTen, nS, heSoLuong);
		SoLuongNVQuanLy = soLuongNVQuanLy;
	}
	public TruongPhong() {
	}
	public int getSoLuongNVQuanLy() {
		return SoLuongNVQuanLy;
	}
	public void setSoLuongNVQuanLy(int soLuongNVQuanLy) {
		SoLuongNVQuanLy = soLuongNVQuanLy;
	}
	int salary() {
		return (int) ((getHeSoLuong())*2200000);
		
	}
	@Override
	public String toString() {
		return this.getHoTen() + "\t" + this.getNS() + "\t" + this.getHeSoLuong() + "\t" + this.getSoLuongNVQuanLy() + "\t"
				+ salary();
	}
	
}
