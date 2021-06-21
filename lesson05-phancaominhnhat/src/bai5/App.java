package bai5;

public class App {
	public static void main(String[] args) {
		Sach[] sach = taoSach();
		timSachNXBKimDong(sach);
		timSachVoiDonGia(sach);
		KhachHang pcmnhat = new KhachHang("KH01","Minh Nhat","0123456789","Quang Nam");
		Order order1 = new Order(pcmnhat.getHoTen(), sach[2].getDonGia());
		
	}
	
	private static Sach[] taoSach() {
		Sach sachToan = new SachGiaoKhoa("SGK01",10000,"Nhi Dong",false);
		Sach sachLy = new SachGiaoKhoa("SGK02",12000,"Nhi Dong",true);
		Sach sachHoa = new SachGiaoKhoa("SGK03",11000,"Nhi Nhat",true);
		
		Sach sachTKToan = new SachThaoKhao("STK01", 12000, "Thieu Nhi", 0.1);
		Sach sachTKLy = new SachThaoKhao("STK02", 13000, "Thieu Nhi", 0.2);  
		
		Sach[] sach = {sachToan,sachLy, sachHoa,sachTKToan,sachTKLy};
		return sach;
	}
	
	private static void timSachNXBKimDong(Sach[] sach) {
		for(int i = 0; i < sach.length; i++) {
			if(sach[i].getNhaXuatBan() == "Nhi Dong") {
				System.out.println(sach[i]);
			}
		}
	}
	private static void timSachVoiDonGia(Sach[] sach){
		for(int i = 0; i < sach.length; i++) {
			if(sach[i].getDonGia() < 50000) {
				System.out.println(sach[i]);
			}
			if(sach[i].getDonGia() > 100 && sach[i].getDonGia() < 200) {
				System.out.println(sach[i]);
			}
		}
	}
}
