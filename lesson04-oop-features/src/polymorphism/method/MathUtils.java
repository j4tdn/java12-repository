package polymorphism.method;

public class MathUtils {
	private MathUtils() {
		
	}
	
	/**
	 * Multiple method in ONE class
	 * Overloading:
	 *  - Same name
	 *    + Different number of parameters
	 *    + Different parameters type
	 */
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static int sum(int a, int b, int c) {
		return a + b + c;
	}
	
	public static float sum(float a, float b) {
		return a + b;
	}
	
	@Override
	public String toString() {
		return "MathUtils >>> toString";
	}
}
