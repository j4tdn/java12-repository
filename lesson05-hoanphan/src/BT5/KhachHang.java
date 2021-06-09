package BT5;

public class KhachHang {

		private String MaKH;
		private String Hoten;
		private int SDT;
		private String DiaChi;
		
		public KhachHang() {
		}
		public KhachHang(String maKH, String hoten, int sDT, String diaChi) {
			super();
			MaKH = maKH;
			Hoten = hoten;
			SDT = sDT;
			DiaChi = diaChi;
		}

		public String getMaKH() {
			return MaKH;
		}

		public void setMaKH(String maKH) {
			MaKH = maKH;
		}

		public String getHoten() {
			return Hoten;
		}

		public void setHoten(String hoten) {
			Hoten = hoten;
		}

		public int getSDT() {
			return SDT;
		}

		public void setSDT(int sDT) {
			SDT = sDT;
		}

		public String getDiaChi() {
			return DiaChi;
		}

		public void setDiaChi(String diaChi) {
			DiaChi = diaChi;
		}

   
}
