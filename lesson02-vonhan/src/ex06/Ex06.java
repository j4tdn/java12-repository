//Số nguyên tố thứ 200 trong dãy số tự nhiên
package ex06;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		System.out.println("Số nguyên tố thứ 200 là: " + result(200));
	}
	
	private static int result(int order) {
		int count = 0;
		for (int i = 2; i <= Integer.MAX_VALUE; i++) {
			if (isPrime(i)) {
				count++;
				if (count == order) {
					return i;
				}
			}
		}
		return count;
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
