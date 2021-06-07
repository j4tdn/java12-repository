package inheritance.functionalinterface;

public class Demo {
	
	private static int globalA = 10;
	private static int globalB = 20;
	
	public static void main(String[] args) {
		System.out.println("sum: " + calculate(globalA, globalB, (a, b) -> a + b));
	}
	
	private static int calculate(int a, int b, Manipulation mal) {
		return mal.perform(a, b);
	}
	
	// Input: int perform(int, int)
	private static int sum(int a, int b) {
		return a + b;
	}
	private static int sub(int a, int b) {
		return a - b;
	}
	private static int devide(int a, int b) {
		return a / b;
	}
	private static int multiple(int a, int b) {
		return a * b;
	}
}
