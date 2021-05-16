package demo;


//ctrl shift s: format code
public class Ex01TestVM {
	
	static int age=10;  
	String s;
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("1st main");
		main();	
	}
	public static void main() {
		System.out.println("2nd main");	
	}
	
	public static void publicstaticMethod() {
		System.out.println("publicStaticMethod");
	}
	
	private static void privatestaticMethod() {
		System.out.println("privateStaticMethod");
	}

	public  void publicMethod() {
		System.out.println("publicMethod");
	}
	
	private  void privateMethod() {
		System.out.println("privateMethod");
	}
}

class EX01{
	public static void main(String[] args) {
	System.out.println("another method");
	
	
	Ex01TestVM that=new Ex01TestVM();
	that.age=10;
	
	
	
	
	Ex01TestVM.main();
	
	Ex01TestVM.publicstaticMethod();
}	
	
}