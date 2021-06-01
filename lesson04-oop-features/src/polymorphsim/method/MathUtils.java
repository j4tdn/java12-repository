package polymorphsim.method;

public class MathUtils {
	private MathUtils() {
		
	}
	/**
	 * 
	 * Multiple method in one class
	 * Overloading
	 * same name
	 * different number off parameters
	 * 
	 */
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	public static float sum(float a, float b) {
		return a+b;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Override" ;
	}
	
}
