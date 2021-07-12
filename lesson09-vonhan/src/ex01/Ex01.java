package ex01;

import static ex01.Type.*;

public class Ex01 {
	public static void main(String[] args) {
		Student[] sts = { new Student("102", "Nam", C), new Student("104", "Hoàng", D), new Student("109", "Lan", A),
				new Student("103", "Bảo", F), new Student("105", "Nguyên", B), new Student("107", "Vũ", F),
				new Student("103", "Bảo", F), new Student("202", "Đạt", C), new Student("107", "Vũ", C),
				new Student("193", "Bảo", B), new Student("104", "Hoàng", B), };

		printS(getStudentTypeA(sts));
		System.out.println("=========");
		printS(getStudentsLearnAgain(sts));
	}

	public static Student[] getStudentTypeA(Student[] sts) {
		Student[] student = new Student[11];
		for (int i = 0; i < sts.length; i++) {
			if (sts[i].getType() == A) {
				student[i++] = sts[i];
			}
		}
		return student;
	}

	public static Student[] getStudentsLearnAgain(Student[] sts) {
		Student[] student = new Student[11];
		for (int i = 0; i < sts.length; i++) {
			for (int j = i + 1; j < sts.length; j++) {
				if (sts[i].getId().equals(sts[j].getId())) {
					student[i++] = sts[i];
				}
			}

		}
		return student;
	}

	public static void printS(Student[] s) {
		for (Student student : s) {
			if (student == null) {
				continue;
			}
			System.out.println(student);
		}

	}
}
