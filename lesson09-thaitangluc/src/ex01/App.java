package ex01;

import java.text.NumberFormat.Style;

public class App {

	public static void main(String[] args) {
		Student[] students = new Student[10];
		students[0] = new Student(102, "Nam", Rate.C);
		students[1] = new Student(104, "Hoàng", Rate.D);
		students[2] = new Student(109, "Lan", Rate.A);
		students[3] = new Student(103, "Bảo", Rate.F);
		students[4] = new Student(105, "Nguyên", Rate.B);
		students[5] = new Student(107, "Vũ", Rate.F);
		students[6] = new Student(103, "Bảo", Rate.F);
		students[7] = new Student(202, "Đạt", Rate.C);
		students[8] = new Student(193, "Bảo", Rate.B);
		students[9] = new Student(104, "Hoàng", Rate.B);
		rateA(students);
		System.out.println("=================");
		relearn(students);
	}

	private static void rateA(Student[] students) {
		Student[] studentsA = new Student[students.length];
		int i = 0;
		for (Student student : students) {
			if (student.getRate() == Rate.A) {
				studentsA[i] = student;
				i++;
			}
		}
		for (int j = 0; j < i; j++) {
			System.out.println(studentsA[j]);
		}
	}

	private static void relearn(Student[] students) {
		for (int i = 0; i < students.length - 1; i++) {
			for (int j = i + 1; j < students.length; j++) {
				if (students[i].equals(students[j])) {
					System.out.println(students[i]);
				}
			}
		}
	}
}
