package ex02;

public class Ex02 {

	static int n = 10;
	static int[] A = { 3, 7, 9, 2, 1, 6, 5, 4, 10 };

	public static void main(String[] args) {
		System.out.print("Phần tử cần tìm có giá trị là: " + getMissingNumber());
	}

	private static int getMissingNumber() {
		int rs = 0;
		for (int i = 0; i <= n; i++) {
			if (!isExit(A, i, i)) {
				rs = i;
			}
		}
		return rs;
	}

	private static boolean isExit(int[] input, int value, int index) {
		for (int i = 0; i < input.length; i++) {
			if (input[i] == value && i != index) {
				return true;
			}
		}
		return false;
	}
}
