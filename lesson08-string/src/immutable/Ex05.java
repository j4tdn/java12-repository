package immutable;

import bean.Student;

public class Ex05 {
	public static void main(String[] args) {
		// String File
		// 120130, Adam Ton, 7.9
		// 125635, Kate Hence, 8.2
		String[] lines = {"120130, Adam Ton, 7.9", "125635, Kate Hence, 8.2"};
		
		// Java Objects
		for (String line: lines) {
			String[] tokens = line.split(", ");
			
			Student student = new Student(tokens[0], tokens[1], Double.parseDouble(tokens[2]));
			System.out.println(student);
		}
		
		System.out.println("===============");
		
		// Find valid numbers in the text below
		String text = "123d87rrrre012f";
		// d stands for digit
		// D = not d
		String[] numbers = text.split("\\D+");
		System.out.println("length: " + numbers.length);
		for (String number: numbers) {
			if (!number.isEmpty()) {
				System.out.println(number);
			}
		}
	}
}
