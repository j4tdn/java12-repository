package exercise01;

public class SinhVien {
	private int maSinhVien;
	private String hoVaten;
	private float diemLT;
	private float diemTH;

	public SinhVien() {
		super();
		this.maSinhVien = 0;
		this.hoVaten = "";
		this.diemLT = 0;
		this.diemTH = 0;
	}

	public SinhVien(int maSinhVien, String hoVaten, float diemLT, float diemTH) {
		super();
		this.maSinhVien = maSinhVien;
		this.hoVaten = hoVaten;
		this.diemLT = diemLT;
		this.diemTH = diemTH;
	}

	public int getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getHoVaten() {
		return hoVaten;
	}

	public void setHoVaten(String hoVaten) {
		this.hoVaten = hoVaten;
	}

	public float getDiemLT() {
		return diemLT;
	}

	public void setDiemLT(float diemLT) {
		this.diemLT = diemLT;
	}

	public float getDiemTH() {
		return diemTH;
	}

	public void setDiemTH(float diemTH) {
		this.diemTH = diemTH;
	}

	@Override
	public String toString() {
		return maSinhVien + "\t\t" + hoVaten + "\t\t" + diemLT + "\t\t" + diemTH + "\t\t" + this.calculateAverage();
	}

	public float calculateAverage() {
		return (this.diemLT + this.diemTH) / 2;
	}

}
