package BT1;

public class SinhVien {
	private int MaSV;
	private String HoTen;
	private float DiemLT;
	private float DiemTH;
	
	public SinhVien() {
		
	}

	public SinhVien(int maSV, String hoTen, float diemLT, float diemTH) {
		super();
		MaSV = maSV;
		HoTen = hoTen;
		DiemLT = diemLT;
		DiemTH = diemTH;
	}

	public int getMaSV() {
		return MaSV;
	}

	public void setMaSV(int maSV) {
		MaSV = maSV;
	}

	public String getHoTen() {
		return HoTen;
	}

	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}

	public float getDiemLT() {
		return DiemLT;
	}

	public void setDiemLT(float diemLT) {
		DiemLT = diemLT;
	}

	public float getDiemTH() {
		return DiemTH;
	}

	public void setDiemTH(float diemTH) {
		DiemTH = diemTH;
	}

	@Override
	public String toString() {
		return "SinhVien [MaSV=" + MaSV + ", HoTen=" + HoTen + ", DiemTB=" + DiemTB() + "]";
	}
	public float DiemTB() {
		return (DiemLT+DiemTH)/2;
		
	}
    public void inSV() {
        System.out.printf("%6d %-18s %10.2f %12.2f %12.2f \n", MaSV, HoTen, DiemLT, DiemTH, DiemTB());
    }
}
