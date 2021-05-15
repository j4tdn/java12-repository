package demo;

public class Ex01TestVM {
	// ctrl + shift + f: format code
	// todo: public static
	static int age = 10;
	
	public static void main(String[] args) {
		System.out.println("1st main");
		main();
	}
	
	public static void publicStaticMethod() {
		System.out.println("publicStaticMethod");
	}
	
	private static void privateStaticMethod() {
		System.out.println("privateStaticMethod");
	}
	
	public void publicMethod() {
		System.out.println("publicMethod");
	}
	
	private void privateMethod() {
		System.out.println("privateMethod");
	}
	
	
	public static void main() {
		System.out.println("2nd main");
	}
	
}

class Ex01AnotherClass{
	public static void main(String[] args) {
		System.out.println("Ex01AnotherClass: main method");
		
		Ex01TestVM that = new Ex01TestVM();
		
	}
}
