package ex01;

import java.util.Arrays;
import java.util.Iterator;

public class App {
	public static void main(String[] args) {
		Student[] students = { new Student("102-Nam-C"), new Student("104-Hoàng-D"), new Student("109-Lan-A"),
				new Student("103-Bảo-F"), new Student("105-Nguyên-B"), new Student("107-Vũ-F"),
				new Student("103-Bảo-F"), new Student("202-Đạt-C"), new Student("107-Vũ-C"), new Student("193-Bảo-B"),
				new Student("104-Hoàng-B"), };
		System.out.println("-Danh sach SV dat loai A namw 2021:");
		for (Student st : findALevelStudent(students)) {
			System.out.println(st);
		}

		String s = "";
		System.out.println("\n Danh sach sinh vien hoc lai cau truc du lieu:");

		getStudentStudyAgain(students);
	}

	private static void getStudentStudyAgain(Student[] students) {

		String temp = "";
		Student.sort(students);
		int index = 0;
		for (int i = 0; i < students.length - 1; i++) {
			if (Student.compare(students[i], students[i + 1]) == 0 && temp!= students[i].getId()) {
				temp = students[i].getId();
				printStudent(temp,students);
			}
		}

	}
	
	private static void printStudent(String id, Student[] students) {
		for(Student st: students) {
			if(st.getId().equals(id)) {
				System.out.println(st);
			}
		}
	}
	
	private static Student[] findALevelStudent(Student[] students) {
		Student[] std = new Student[students.length];
		int i = 0;
		for (Student st : students) {
			if (st.getHocLuc() == HocLuc.A) {
				std[i++] = st;
			}
		}
		return Arrays.copyOfRange(std, 0, i);
	}

}
