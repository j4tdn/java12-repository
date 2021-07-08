package immutable;

import bean.Student;

public class Ex05 {
	public static void main(String[] args) {
	//File: Student.txt
	//102190252, Gia Bảo, 7.9
	//102190276, Kim Ngân, 8.2
	String[] lines ={"102190252, Gia Bảo, 7.9","102190276, Kim Ngân, 8.2"};
	
	//Java Objects
	for(String line:lines){
	String[] tokens= line.split(", ");
	Student student = new Student(tokens[0], tokens[1], Double.parseDouble(tokens[2]));
	System.out.println(student);
	}
	
	//Find valid numbers in the text below
	System.out.println("======================");
	String text ="av123d87e012f";
	
	//D:Stand for not digit
	//d:stand for digit
	String[] numbers = text.split("\\D+");
	//text.spits("[a-z]+");
	System.out.println(numbers.length);
	for(String number: numbers) {
		System.out.println(number);
	}
	
	}
}
