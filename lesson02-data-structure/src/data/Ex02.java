package data;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 20;
		int year = 2000;
		
		increase(age);//20
		swap(age,year);

		System.out.println("age: " + age);
		System.out.println("year: " + year);

	}
	private static void increase(int age) {
		age = age + 1;//21
	}
	
	private static void swap(int first, int second) {
		first = first +second;//2020 2000
		second = first - second;
		first = first - second;
		System.out.println("f :"+ first );
		System.out.println("S : "+ second);
	}

}
