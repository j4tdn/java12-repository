package bai1;

import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		SinhVien studentFirst = new SinhVien(101, "Phan Cao Minh Nhật", 7.5f, 9.5f);
		SinhVien studentSecond = new SinhVien(102, "Người Bạn Thân Nhất", 10f, 9.5f);
		SinhVien studentThird = new SinhVien();
		
		SinhVien[] arrayStudent = {studentFirst, studentSecond, studentThird};
		
		inputStudent(studentThird);
		
		outputStudent(arrayStudent);
	}
	
	public static void inputStudent(SinhVien studentThird) {
		System.out.println("**********Enter student's information**********");
		System.out.print("Enter student's code: ");
		int studentCode = scanner.nextInt();
		scanner.nextLine();
		studentThird.setStudentCode(studentCode);
		
		System.out.print("Enter student's name: ");
		String name = scanner.nextLine();
		studentThird.setName(name);
		
		System.out.print("Enter student's theory point :");
		float pointTheory = scanner.nextFloat();
		studentThird.setPointTheory(pointTheory);
		
		System.out.print("Enter student's practice point :");
		float pointPractice = scanner.nextFloat();
		studentThird.setPointPractice(pointPractice);
	}
	
	public static void outputStudent(SinhVien[] arrayStudent) {
		System.out.println("**********LIST STUDENT**********");
		System.out.printf("%-25s %-25s %-15s %-15s %-15s \n",
				"Student's Code","Student's Name", "Theory Point", "Practice Point", "Medium Point");
		System.out.println("------------------------------------------------------------------------------------------------");
		for(SinhVien student : arrayStudent) {
			System.out.printf("%-25s %-25s %-15s %-15s %-15s \n",
					student.getStudentCode(), student.getName(), student.getPointTheory(), student.getPointPractice(), student.getPointMedium());
		}
	}
}
