package ex05;

public class KhachHang {
	private String maKhachhang;
	private String hoTen;
	private String soDienThoai;
	private String address;
	
	public KhachHang() {
		super();
	}

	public KhachHang(String maKhachhang, String hoTen, String soDienThoai, String address) {
		super();
		this.maKhachhang = maKhachhang;
		this.hoTen = hoTen;
		this.soDienThoai = soDienThoai;
		this.address = address;
	}

	public String getMaKhachhang() {
		return maKhachhang;
	}

	public void setMaKhachhang(String maKhachhang) {
		this.maKhachhang = maKhachhang;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "KhachHang [maKhachhang=" + maKhachhang + ", hoTen=" + hoTen + ", soDienThoai=" + soDienThoai
				+ ", address=" + address + "]";
	}
	
}
