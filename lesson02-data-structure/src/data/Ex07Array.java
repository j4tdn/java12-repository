package data;

public class Ex07Array {
	public static void main(String[] args) {
		// array is object type
		int[] a = new int[5]; // heap có 4 ô nhớ
		String[] b = new String[4];

		a[2] = 10;
		b[3] = "hello";

		System.out.println("a[2] = " + a[2]);
		System.out.println("b[3] = " + b[3]);
		System.out.println("------------------");

		int[] c = { 3, 4, 5, 6 };

//		System.out.println(c[2]);

		// loop
		for (int i = 0; i < c.length; i++) {
			System.out.println("c[" + i + "] = " + c[i]);
		}

		System.out.println("------------------");

		// foreach
		for (int citem : c) {
			System.out.println(citem);
		}

		for (String bitem : b) {
			System.out.println(bitem);
		}
	}
}
