package ex02;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n = ip.nextInt();
		String[] str = new String[n];
		for (int i = 0; i < n; i++) {
			str[i] = ip.next();
		}
		for (int i = 0; i < n; i++) {
			System.out.println(str[i]);
		}
		getLargestNumbers(str);
	}

	private static int[] splitNumber(String s) {
		String[] strNums = s.split("\\D+");
		int length = strNums.length;
		System.out.println(length);
		int[] nums = new int[length];
		for (int i = 0; i < length; i++) {
			if (strNums[i]!="") nums[i] = Integer.parseInt(strNums[i]);
			System.out.println(nums[i]);
		}
		return nums;
	}

	private static int Max(int[] nums) {
		int max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (max <= nums[i]) {
				max = nums[i];
			}
		}
		return max;
	}

	public static int[] sortASC(int[] arr) {
		int temp = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		return arr;
	}

	private static void getLargestNumbers(String[] s) {
		int[] nums = new int[s.length];
		for (int i = 0; i < s.length; i++) {
			nums[i] = Max(splitNumber(s[i]));
			System.out.println(nums[i]);
		}
		nums = sortASC(nums);
		System.out.print("Ket qua: ");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
