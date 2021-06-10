package ex05;

public class SachThamKhao extends Book{
	double tax;
	
	
	public SachThamKhao(String maSach, double donGia, String nhaXuatBan) {
		super(maSach, donGia, nhaXuatBan);
		// TODO Auto-generated constructor stub
	}
	public SachThamKhao(String maSach, double donGia, String nhaXuatBan, double tax) {
		super(maSach, donGia, nhaXuatBan);
		this.tax = tax;
	}
	@Override
	public String toString() {
		return "SachThamKhao [tax=" + tax + ", maSach=" + maSach + ", donGia=" + donGia + ", nhaXuatBan=" + nhaXuatBan
				+ "]";
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
}
