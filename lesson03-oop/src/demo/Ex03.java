package demo;

import bean.Car;

public class Ex03 {
	public static void main(String[] args) {
		// Demo cmp 2 primitive type
		int p1 = 10;
		int p2 = 10;
		int p3 = 10;
		cmp("p1==p2", p1 == p2);
		cmp("p1==p3", p1 == p3);
		cmp("p2==p3", p2 == p3);

		// Demo cmp 2 object
		String o1 = new String("Hello");
		String o2 = "hello";
		String o3 = "hello";

		cmp("o1==o2", o1 == o2); // T
		cmp("o1==o3", o1 == o3); //
		cmp("o2==o3", o2 == o3);

		// demo cmp 2 object's address
		hash("o1", o1);
		hash("o2", o2);
		hash("o3", o3);

		System.out.println("o12: " + o1.equals(o2));
		System.out.println("o13: " + o1.equals(o3));
		System.out.println("o23: " + o2.equals(o3));

		System.out.println("=============");
		Car c1 = new Car(123, "abc", "black");
		Car c2 = new Car(234, "bcd", "red");
		Car c3 = new Car(123, "giabao", "white");
		cmp("c1==c2: ", c1 == c2);
		cmp("c1==c3: ", c1 == c3);
		cmp("c2==c3: ", c2 == c3);

		cmp("c12: ", c1.equals(c2));
		cmp("c13: ", c1.equals(c3));
		cmp("c23: ", c2.equals(c3));
	}

	// compare :==
	// compare 2 stacks's value
	private static void cmp(String text, boolean cmp) {
		System.out.println(text + cmp);
	}

	private static void hash(String text, String o) {
		System.out.println(text + System.identityHashCode(o));

	}
}
