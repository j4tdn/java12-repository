package demo;

import bean.Car;

public class Ex03 {

	public static void main(String[] args) {
		// Demo 2 primitive type
		int p1 = 10;
		int p2 = 20;
		int p3 = 10;
		compare("p1==p2", p1==p2);
		compare("p1==p3", p1==p3);
		
		System.out.println("===============");
		
		//*** Demo compare 2 objects's address
		String o1 = new String("hello"); //heap
		String o2 = "hello"; //constant pool
		String o3 = "hello"; //constant pool
		
		hash("o1", o1);
		hash("o2", o2);
		hash("o3", o3);
		
		System.out.println("===============");
		
		compare("o1==o2", o1==o2); // F
		compare("o1==o3", o1==o3); // F
		compare("o2==o3", o2==o3); // T
		
		System.out.println("===============");
		
		//*** Demo compare content of objects
		System.out.println("o12 = " + o1.equals(o2));
		System.out.println("o13 = " + o1.equals(o3));
		System.out.println("o23 = " + o2.equals(o3));
		
		System.out.println("===============");
		
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = null;
		compare("c12 = ", c1.equals(c2));
		compare("c13 = ", c1.equals(c3));
		compare("c23 = ", c2.equals(c3));
		System.out.println("===============");

		Car x1 = new Car(123, "Audi", "Green");
		Car x2 = new Car(123, "Audi", "Green");
		Car x3 = new Car(123, "Audi", "Green");
		compare("x12 = ", x1.equals(x2));
		compare("x13 = ", x1.equals(x3));
		compare("x23 = ", x2.equals(x3));
	}
	
	//Operator: ==
	// Compare 2 stack's value in stack
	private static void compare(String text, boolean result) {
		System.out.println(text + ": " + result);
	}
	
	private static void hash(String text, String input) {
		System.out.println(text + ": " + System.identityHashCode(input));
	}

}
