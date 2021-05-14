import java.util.Random;

public class Ex07 {
	static Random rd = new Random();
	static int[] arr = new int[5];

	public static void main(String[] args) {
		random(arr);
		xuat(arr);
	}

	public static void xuat(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void random(int[] arr) {
		for (int i = 0; i < 5; i++) {
			arr[i] = rd.nextInt(11) + 20;
			if (isExist(arr, i, arr[i])) {
				arr[i] = rd.nextInt(11) + 20;
			}
		}
	}

	public static boolean isExist(int[] arr, int index, int value) {
		for (int i = 0; i < index; i++) {
			if (value == arr[i]) {
				return true;
			}
		}
		return false;
	}
}
