package exercise01;

public class Test {

	public static void main(String[] args) {
      SinhVien sv1=new SinhVien(1,"Nguyen Van Truyen",8.5f,6.5f);
      SinhVien sv2=new SinhVien(2,"Nguyen Dinh Trong",9.5f,6.7f);
      SinhVien sv3=new SinhVien();
      sv3.setMaSinhVien(3);
      sv3.setHoVaten("Nguyen Hanh Phuc");
      sv3.setDiemLT(7.5f);
      sv3.setDiemTH(8.9f);
      System.out.printf("%s\t\t%s\t\t\t\t%s\t\t%s\t\t%s\n","MSSV","Name","DiemLT","DiemTh","DiemTB");
      System.out.println(sv1);
      System.out.println(sv2);
      System.out.println(sv3);
	}

}
