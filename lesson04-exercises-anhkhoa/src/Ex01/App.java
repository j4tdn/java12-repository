package Ex01;

import java.util.Scanner;

public class App {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Student s1 = new Student(1, "Khoa", 10, 10);
		Student s2 = new Student(2, "Ny", 10, 10);
		Student s3 = CreateStudent();
		System.out.println("MSSV"+"\t"+"họ tên"+"\t"+"điểm LT"+"\t"+"điểm TB"+"\t");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
	
	private static Student CreateStudent()
	{
		Student s3 = new Student();
		System.out.println("Nhap ID sinh vien: ");
		int id = Integer.parseInt(sc.nextLine());
		s3.setId(id);
		System.out.println("Nhap ten sinh vien: ");
		String Name = sc.nextLine(); 
		s3.setName(Name);
		System.out.println("Nhap diem lap trinh: ");
		float lt = Float.parseFloat(sc.nextLine());
		s3.setLT(lt);
		System.out.println("Nhap diem thuc hanh: ");
		float th = Float.parseFloat(sc.nextLine());
		s3.setTH(th);
		return s3;
	}
}
