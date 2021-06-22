package BT4;

public class NhanVien extends People{
	private String TenDonVi;

	public NhanVien(String hoTen, int nS, Double heSoLuong, String tenDonVi) {
		super(hoTen, nS, heSoLuong);
		TenDonVi = tenDonVi;
	}

	public NhanVien() {
		
	}

	public String getTenDonVi() {
		return TenDonVi;
	}

	public void setTenDonVi(String tenDonVi) {
		TenDonVi = tenDonVi;
	}
	int salary() {
		return (int) (getHeSoLuong()*1250000);
		
	}
	@Override
	public String toString() {
		return this.getHoTen() + "\t\t" + this.getNS() + "\t\t" + this.getHeSoLuong() + "\t\t" + this.getTenDonVi() + "\t\t"
				+ salary();
	}
	
	
}
