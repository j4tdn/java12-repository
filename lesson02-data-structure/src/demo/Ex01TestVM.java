package demo;

class Ex01TestVM {
	// attribute
	 static int age = 10;

	// ctrl shift f: format code
	// todo: public static
	// access modifier: public, private, protected, ____
	public static void main(String[] args) {
	    // int age = 10;
		System.out.println("Ex01TestVM main method");
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

class Ex01AnotherClass {
	public static void main(String[] args) {
		System.out.println("Ex01AnotherClass: main method");
		
		// static
		Ex01TestVM.publicStaticMethod();
		
		// non-static
		Ex01TestVM that = new Ex01TestVM();
		that.age = 10;
		
	}
}
