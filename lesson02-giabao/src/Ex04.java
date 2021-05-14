import java.util.Scanner;

public class Ex04 {
	static Scanner sc = new Scanner(System.in);
	static int[] arr = new int[100];

	public static void main(String[] args) {
		System.out.print("Nhập số phần tử mảng:");
		int n = Integer.parseInt(sc.nextLine());
		nhap(n);
		System.out.println("Số lẻ lớn nhất trong dãy là: " + maxArr(arr, n));
	}

	public static void nhap(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("A[" + i + "]=");
			arr[i] = Integer.parseInt(sc.nextLine());
		}
	}

	public static boolean isOdd(int a) {
		return a % 2 == 1;
	}

	public static int maxArr(int[] arr, int n) {
		int max = 0;
		for (int i = 0; i < n; i++) {
			if (isOdd(arr[i])) {
				max = arr[i] > max ? arr[i] : max;
			}
		}
		return max;
	}
}
