package data;

public class Ex02 {
	public static void main(String[] args) {
		int age = 20; 
		int year = 2000;
		
		increase(age);
		swap(age, year);
		
		System.out.println("age: " + age);
		System.out.println("year: " + year);
	}
	
	private static void increase(int age) {
		age = age + 1;
	}
	
	private static void swap(int first, int second) { 
		//Tao vung nho khac o Stack
		first = first + second; // 2020 2000
		second = first - second; // 2020 20
		first = first - second; 
	}
}
