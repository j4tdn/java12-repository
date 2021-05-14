package data;

public class Ex07Array {
	public static void main(String[] args) {
		// declaration, array is object type
		// index: 0, 1, 2, 3, 4
		// value: access by index
		//      : access directly
		int[] a = new int[5]; // 0 0 0 0 0
		String[] b = new String[4]; // null null null null

		a[1] = 10;
		b[3] = "hello";

		System.out.println("a[1]: " + a[1]);
		System.out.println("b[3]: " + b[3]);

		int[] c = { 3, 4, 5, 6 };
		System.out.println("c[1]: " + c[1]);
		
		System.out.println("======================");
		// loop
		// for index
		for (int i = 0; i < c.length; i++) {
			System.out.println("c["+i+"]: " + c[i]);
		}
		
		System.out.println("======================");
		// for each
		for (int citem: c) {
			System.out.println(citem);
		}
		
		for(String bitem: b) {
			System.out.println(bitem);
		}

	}
}
