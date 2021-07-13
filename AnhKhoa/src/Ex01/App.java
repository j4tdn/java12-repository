package Ex01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
	public static void main(String[] args) {
		Student[] students = { new Student(102, "Nam", Ratings.C), new Student(104, "Hoàng", Ratings.D),
				new Student(109, "Lan", Ratings.A), new Student(103, "Bảo", Ratings.F),
				new Student(105, "Nguyên", Ratings.B), new Student(107, "Vũ", Ratings.F),
				new Student(103, "Bảo", Ratings.F), new Student(202, "Đạt", Ratings.C),
				new Student(107, "Vũ", Ratings.C), new Student(193, "Bảo", Ratings.B),
				new Student(104, "Hoàng", Ratings.B) };
		List<Student> listA = Arrays.asList(students).stream().filter(s -> s.getRating().equals(Ratings.A))
				.collect(Collectors.toList());
		List<Student> listF = Arrays.asList(students).stream().filter(s -> s.getRating().equals(Ratings.F))
				.collect(Collectors.toList());
	}
}
