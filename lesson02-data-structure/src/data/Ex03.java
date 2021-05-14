package data;

public class Ex03 {

	public static void main(String[] args) {
		int a = 20;
		a = 30;

		Integer age = 20;
		//print object's memory address
		System.out.println("hash age 1: "+System.identityHashCode(age));
		age = 30;
		System.out.println("age 1: "+age);
		age = 30;
		increase(age);
		System.out.println("age 2: "+age);

	}
	
	private static void increase(Integer input) {
		input = input + 1;
	}

}
