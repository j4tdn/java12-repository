package ex02;

public class Ex02Main {
	public static void main(String[] args) {
		int[] arrA = { 3, 2, 1, 6, 5 };
		int[] arrB = { 3, 7, 9, 1, 3, 2, 4, 5, 6, 10 };
		System.out.println(getMissingNumber(arrA));
		System.out.println(getMissingNumber(arrB));
	}

	static int getMissingNumber(int a[]) {
		int total = 1;
		for (int i = 1; i < a.length; i++) {
			total += i;
			total -= a[i - 2];
		}
		return total;
	}
}
