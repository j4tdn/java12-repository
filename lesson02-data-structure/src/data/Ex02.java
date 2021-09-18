package data;

public class Ex02 {
	public static void main(String[] args) {
		int age = 20;
		int year = 2000;

		increase(age);
		swap(age, year);

		System.out.println("age: " + age); // 20
		System.out.println("year: " + year); // 2000

		int a = 10;
		int b = 20;
		swap(a, b);

		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}

	private static void increase(int age) {
		age = age + 1; // 21
	}

	private static void swap(int first, int second) {
		int tmp = first;
		first = second;
		second = tmp;
		System.out.println("first: " + first);
		System.out.println("second: " + second);
	}
}
