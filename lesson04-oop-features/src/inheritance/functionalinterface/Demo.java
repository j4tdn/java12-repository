package inheritance.functionalinterface;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Sum: " + calculate(10, 20, (a, b) -> a + b));
//		System.out.println("Sum: " + calculate(10, 20, (int a,int b) ->{
//			return a + b;}
//		));
		System.out.println("mul: " + calculate(10, 20, (a, b) -> a * b));
		System.out.println("sub: " + calculate(10, 20, (a, b) -> a-b));
	}

	private static int calculate(int a, int b, Manipulation mal) {
		return mal.perform(a, b);
	}

//	private static int sum(int a, int b) {
//		return a + b;
//	}
//
//	private static double div(int a, int b) {
//		return (a * 0.1) / b;
//	}
//
//	private static int sub(int a, int b) {
//		return a - b;
//	}
//
//	private static int mul(int a, int b) {
//		return a * b;
//	}

}
