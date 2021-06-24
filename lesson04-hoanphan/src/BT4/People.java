package BT4;

public class People {
	private String HoTen;
	private int NS;
	private Double HeSoLuong;
	public People(String hoTen, int nS, Double heSoLuong) {
		super();
		HoTen = hoTen;
		NS = nS;
		HeSoLuong = heSoLuong;
	}
	public People() {
	
	}
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	public int getNS() {
		return NS;
	}
	public void setNS(int nS) {
		NS = nS;
	}
	public Double getHeSoLuong() {
		return HeSoLuong;
	}
	public void setHeSoLuong(Double heSoLuong) {
		HeSoLuong = heSoLuong;
	}
	@Override
	public String toString() {
		return "People [HoTen=" + HoTen + ", NS=" + NS + ", HeSoLuong=" + HeSoLuong + "]";
	}
	
	
	
}
