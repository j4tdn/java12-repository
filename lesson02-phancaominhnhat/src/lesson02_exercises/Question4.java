package lesson02_exercises;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào dãy các số nguyên : ");
		String str = scanner.nextLine();
		if(findMaxOdd(str) != Integer.MIN_VALUE) {
			System.out.println("Số lẻ lớn nhất là : " + findMaxOdd(str));
		} else {
			System.out.println("Không tìm thấy số lẻ.");
		};
	}
	private static int findMaxOdd(String str){
		int max = Integer.MIN_VALUE;
		String[] arr;
		arr = str.trim().split("\s+");
		for (int i = 0; i < arr.length; i++) {
			if(Integer.parseInt(arr[i]) % 2 != 0 && Integer.parseInt(arr[i]) > max) {
				max = Integer.parseInt(arr[i]);
			}
		}
		return max;
	}

}
