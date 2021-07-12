package ex01;

public class Test {
	public static void main(String[] args) {
		Student[] students = { new Student("102", "Nam", Equivalent.C), new Student("104", "Hoàng", Equivalent.D),
				new Student("109", "Lan", Equivalent.A), new Student("103", "Bảo", Equivalent.F),
				new Student("105", "Nguyên", Equivalent.B), new Student("107", "Vũ", Equivalent.F),
				new Student("103", "Bảo", Equivalent.F), new Student("202", "Đạt", Equivalent.C),
				new Student("107", "Vũ", Equivalent.C), new Student("193", "Bảo", Equivalent.B),
				new Student("104", "Hoàng", Equivalent.B) };
		System.out.println("Danh Sách các sinh viên đạt loại A:");
		for (Student item : students) {
			if (item.getEquivalent() == Equivalent.A) {
				System.out.println(item);
			}
		}
		System.out.println("Danh Sách các sinh viên học lại môn cấu trúc dữ liệu:");
		for (Student item : students) {
			if (item.getEquivalent() == Equivalent.F) {
				System.out.println(item);
			}
		}
	}
}
