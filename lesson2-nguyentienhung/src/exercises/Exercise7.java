package exercises;

import java.util.Arrays;
import java.util.Random;

public class Exercise7 {
	// Hàm gieo số ngẫu nhiên
	public static void LaySoNgauNhien(int[] arr) {
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			int rd = random.nextInt(11) + 20;
			arr[i] = rd;
		}
	}

	// Hàm kiểm tra xem mảng có phần tử nào trùng nhau không
	public static boolean KiemTraTrungLap(int[] arr) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr = new int[5];
		// Sinh ra mảng có 5 số ngẫu nhiên không trùng nhau
		do {
			LaySoNgauNhien(arr);
		} while (KiemTraTrungLap(arr) != true);
		// In ra kết quả bài toán
		System.out.println("Kết quả: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + "\t");
		}

	}

}
