package ex01;

import java.util.Scanner;

public class Ex01 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter n: ");
		int n = Integer.parseInt(scanner.nextLine());
		int[][] result = doubleTriangle(n);
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				if (result[i][j] == 0) {
					System.out.print("  ");
				} else {
					System.out.print(result[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

	private static int[][] doubleTriangle(int n) {
		int length = 2 * n - 1;
		int[][] result = new int[length][length];
		int firstIndexOfZeroValue = 1;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				if (j < firstIndexOfZeroValue || j > length - firstIndexOfZeroValue - 1) {
					result[i][j] = j + 1;
				}
			}
			if (i <= length / 2 - 1) {
				firstIndexOfZeroValue++;
			} else if (i >= length / 2) {
				firstIndexOfZeroValue--;
			}
		}
		return result;
	}
}
