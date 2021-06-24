package ex01;

import java.util.Scanner;

public class App {
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Student students[];
		students=data();
		System.out.printf("%-5s %-20s %-20s %-20s %-20s \n","MSSV","Họ tên","Điểm lý thuyết","Điểm thực hành","Diểm trung bình");
		for(Student st: students) {
			System.out.println(st);
		}
	}
	private static Student[] data() {
		
		System.out.println("MSSV: ");
		int ID = Integer.parseInt(sc.nextLine());
		System.out.println("Ten: ");
		String name = sc.nextLine();
		System.out.println("Diem LT: ");
		float diemLT=sc.nextFloat();
		System.out.println("Diem TH: ");
		float diemTH=sc.nextFloat();
		
		Student s1=new Student(1,"Nghia Pham",9.0f,8.0f);
		Student s2=new Student(2,"Van Son",9.0f,8.0f);
		Student s3=new Student(ID,name,diemLT,diemTH);
		
		Student[] students = {s1,s2,s3};
		return students;
	}
}
