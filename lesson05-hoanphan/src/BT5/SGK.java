package BT5;

public class SGK {
	private String MaSGK;
	private double DonGia;
	private String NXB;
	private boolean State;
	
	public SGK() {
	}
	public String getMaSach() {
		return MaSGK;
	}

	public void setMaSach(String maSach) {
		MaSGK = maSach;
	}

	public double getDonGia() {
		return DonGia;
	}

	public void setDonGia(double donGia) {
		DonGia = donGia;
	}

	public String getNXB() {
		return NXB;
	}

	public void setNXB(String nXB) {
		NXB = nXB;
	}

	public boolean isState() {
		return State;
	}

	public void setState(boolean state) {
		State = state;
	}

	public SGK(String maSGK, double donGia, String nXB, boolean state) {
		super();
		MaSGK = maSGK;
		DonGia = donGia;
		NXB = nXB;
		State = state;
	}
	
}
