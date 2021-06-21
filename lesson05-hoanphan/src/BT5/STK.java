package BT5;

public class STK {
	private String MaSTK;
	private double DonGia;
	private String NXB;
	private double Thue;
	
	public STK() {
	}
	public String getMaSTK() {
		return MaSTK;
	}

	public void setMaSTK(String maSTK) {
		MaSTK = maSTK;
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

	public double getThue() {
		return Thue;
	}

	public void setThue(double thue) {
		Thue = thue;
	}

	public STK(String maSTK, double donGia, String nXB, double thue) {
		super();
		MaSTK = maSTK;
		DonGia = donGia;
		NXB = nXB;
		Thue = thue;
	}

}
