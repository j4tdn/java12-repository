package ex04;

public class LeastCommonMultiple {
	public static void main(String[] args) {
		int [] A = {2, 4, 6, 8, 16};
		System.out.println(getLeastCommonMultiple(A));
	}

	public static int getLeastCommonMultiple(int[] arr) {
		int num = arr[0];
		for(int i = 1; i<arr.length; i++) {
			num = BSCNN(num, arr[i]);
		}
		return num;
	}
	
	public static int USCLN(int a, int b) {
		if (b == 0)
			return a;
		return USCLN(b, a % b);
	}

	public static int BSCNN(int a, int b) {
		return (a * b) / USCLN(a, b);
	}
}
