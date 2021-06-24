package exercise04;

public class GiamDoc extends People {
	private float heSoChucVu;

	public GiamDoc() {
		super();
	}

	public GiamDoc(String hoVaTen, int namSinh, float heSoLuong, float heSoChucVu) {
		super(hoVaTen, namSinh, heSoLuong);
		this.heSoChucVu = heSoChucVu;
	}

	public float getHeSoChucVu() {
		return heSoChucVu;
	}

	public void setHeSoChucVu(float heSoChucVu) {
		this.heSoChucVu = heSoChucVu;
	}

	public float calculateSalary() {
		return (heSoChucVu + heSoLuong) * 3000000;
	}

	@Override
	public String toString() {
		return this.hoVaTen + "\t\t" + this.namSinh + "\t\t" + this.heSoLuong + "\t\t" + this.heSoChucVu + "\t\t"
				+ calculateSalary();
	}

}
