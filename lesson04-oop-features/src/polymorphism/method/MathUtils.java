package polymorphism.method;

public class MathUtils {
	private MathUtils() {
		
	}
	
	public static int sum(int a, int b) {
		return a+ b;
	}
	
	public static int sum(int a, int b, int c) {
		return a + b + c;
	}
	
	//khác kiểu trả về cũng phải overload
//	public static float sum(int a, int b) {
//		return a+ b;
//	}
	
	public static float sum(float a, float b) {
		return a + b;
	}
	
	/*
	 * Overloading :
	 *   - cùng tên
	 *   - khác số lượng tham số
	 *   - khác kiểu dữ liệu tham số
	 */
}
