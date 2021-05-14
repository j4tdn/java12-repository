package data;

public class Ex02 {

	public static void main(String[] args) {
		int age = 10;
		int year = 20000;
		age = year;
		year = age;

		increase(age);
		swap(age, year);
		System.out.println("age :" + age);
		System.out.println("year :" + year);
	}

	private static void increase(int age) {
		age = age + 1;
	}

	private static void swap(int first, int second) {

//		int tmp = first;
//		first = second;
//		second = tmp;
		first = first + second;
		second = first - second;
		first = first - second;
		System.out.println("First :" + first);
		System.out.println("Second :" + second);
	}

}
