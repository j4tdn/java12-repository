package ex04;

public class GiamDoc extends Person{
	private int heSoChucVu;

	public GiamDoc(String name, int yearOfBirth, float heSoLuong, int heSoChucVu) {
		super(name, yearOfBirth, heSoLuong);
		this.heSoChucVu = heSoChucVu;
	}

	public int getHeSoChucVu() {
		return heSoChucVu;
	}

	public void setHeSoChucVu(int heSoChucVu) {
		this.heSoChucVu = heSoChucVu;
	}

	
	
	@Override
	public String toString() {
		return "GiamDoc [heSoChucVu=" + heSoChucVu + ", name=" + name + ", yearOfBirth=" + yearOfBirth + ", heSoLuong="
				+ heSoLuong + "]";
	}

	@Override
	public float getSalary() {
		return (heSoLuong+heSoChucVu)*300000;
	}
}
