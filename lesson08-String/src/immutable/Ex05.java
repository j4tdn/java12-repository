package immutable;

import bean.Student;

public class Ex05 {
	public static void main(String[] args) {
		
		// tách chuỗi thành các Students
		String[] lines = {"120130, Adam Tom, 7.9","1203123, Adam Mils, 9.0" };
		for(String line :lines) {
			String tokens[] = line.split(", ");
			Student student = new Student(tokens[0], tokens[1], Double.parseDouble(tokens[2]));
			System.out.println(student);
		}
		
		System.out.println("=====================");
		
		// Find valid numbers in the text below
		String text = "ab123d87e012f";
		String []numbers = text.split("\\D+");
		for(String number: numbers) {
			if(!number.isEmpty()) {
				System.out.println(number);
			}
		}
	}
}
