package builder.student;

import builder.computer.Computer.BuilderComputer;
import builder.student.Student.BuilderStudent;

public class Demo {
	public static void main(String[] args) {
		Student nhat = BuilderStudent.builder()
									.name("Minh Nhat")
									.age(21)
									.id("1212121")
									.sex(false)
									.build();
		System.out.println(nhat);
	}
}
