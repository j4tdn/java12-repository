package demo;

public class Ex01TestVM {
	
	int age = 10; 

	public static void main(String[] args) {
		System.out.print("Ex01TestVM main method");
		main();
	}
	public static void publicStaticMethod() {
		System.out.print("publicStaticMethod");
	}
	public void privateStaticMethod() {
		System.out.print("privateStaticMethod");
	}
	private void privateMethod() {
		System.out.print("privateMethod");
	}
	public static void main() {
		System.out.print("2nd main");
	}
	
}

class Ex01AnotherClass{
	public static void main(String[] args) {
		System.out.print("Ex01AnotherClass main method");
		
		Ex01TestVM that = new Ex01TestVM();
		that.age = 10;
		
	}
}
