package polymophism.method;

public class MathUtils {

	private MathUtils() {
		
	}
	/***
	 * 
	 *Multiple methods in ONE class
	 *- same name
	 *	+ Difference number of parameters
	 *	+ Difference parameters type
	 */
	public static int sum(int a,int b) {
		return a+b;
	}
	
	public static int sum(int a,int b, int c) {
		return a+b+c;
	}
	
	public static float sum(float a,float b) {
		return a+b;
	}
	@Override
	public String toString() {
		return "MathUtils >>> toString";
	}
	
}
