package demo;

public class Ex01Main {
	static int age = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ctrl+shift+f
		System.out.println("Hello01");
		main();
	}

	public static void publicStaticMethod() {
		System.out.println("publicStaticMethod");
	}

	public void publicMethod() {
		System.out.println("publicMethod");
	}

	public void privateMethod() {
		System.out.println("privateMethod");
	}

	public static void privateStaticMethod() {
		System.out.println("privateStaticMethod");
	}

	public static void main() {
		System.out.println("Hello02");
	}
}

class Ex02Main {
	public static void main(String[] args) {
		System.out.println("Hello03");
		// access modifier:private,public,protected,default
		// Ex01Main.privateStaticMethod(); fail
		// static,non static
		// method,attribute
		// +static : class scope
		// non-static:object scope
		// object:instance of class
		// Employee : class=>Emp A:obj
		Ex01Main.publicStaticMethod();
		// create an object for class Ex01Main
		Ex01Main ex01Object = new Ex01Main();
		ex01Object.publicMethod();
	}
}
