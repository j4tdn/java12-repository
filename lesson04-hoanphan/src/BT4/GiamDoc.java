package BT4;

public class GiamDoc extends People{
	private float HeSoChucVu;

	public GiamDoc(String hoTen, int nS, Double heSoLuong, float heSoChucVu) {
		super(hoTen, nS, heSoLuong);
		HeSoChucVu = heSoChucVu;
	}

	public GiamDoc() {
	}

	public float getHeSoChucVu() {
		return HeSoChucVu;
	}

	public void setHeSoChucVu(float heSoChucVu) {
		HeSoChucVu = heSoChucVu;
	}
	int salary() {
		return (int) ((getHeSoLuong()+HeSoChucVu)*300000);
		
	}
	@Override
	public String toString() {
		return this.getHoTen() + "\t\t" + this.getNS() + "\t\t" + this.getHeSoLuong() + "\t\t" + this.getHeSoChucVu() + "\t\t"
				+ salary();
	}
	
	
	
}
