package ex01;

public class SinhVien {
	 private int MSSV;
	 private String HoTen;
	 private float diemLT,diemTH;
	 
	 public SinhVien() {
		
	}

	public SinhVien(int mSSV, String hoTen, float diemLT, float diemTH) {
		super();
		MSSV = mSSV;
		HoTen = hoTen;
		this.diemLT = diemLT;
		this.diemTH = diemTH;
	}

	public int getMSSV() {
		return MSSV;
	}

	public void setMSSV(int mSSV) {
		MSSV = mSSV;
	}

	public String getHoTen() {
		return HoTen;
	}

	public void setHoTen(String hoTen) {
		HoTen = hoTen;
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
	public float diemTB() {
		return (float)(diemLT*0.4 + diemTH*0.6);
	}
	@Override
	public String toString() {
		return "SinhVien [MSSV=" + MSSV + ", HoTen=" + HoTen + ", diemLT=" + diemLT + ", diemTH=" + diemTH + "]";
	}
	 
}
