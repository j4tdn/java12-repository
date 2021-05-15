package lesson02_exercises;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		int number;
		int prime = 0;
		int i = 1;
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số thứ tự của số nguyên tố trong hệ thống số tự nhiên: ");
		number = scanner.nextInt();
		while(count < number) {
			i++;
			if(isPrime(i) == 1) {
				count++;
			}
		}
		System.out.println("Số nguyên tố thứ " + number + " trong hệ thống số tự nhiên là: " + i);
	}
	private static int isPrime(int number) {
		if(number < 2) {
			return 0;
		}
		if(number == 2 || number == 3) {
			return 1;
		}
		if(number % 2 == 0 || number % 3 == 0) {
			return 0;
		}
		/* ? :Thuật toán ASK ? */
//		for(int i = 5; i < Math.sqrt(number); i+=6) {
//			if(number % i == 0) {
//				return 0;
//			}
//		}
		for(int i = 5; i <= Math.sqrt(number); i++) {
			if(number % i == 0) {
				return 0;
			}
		}
		return 1;
	}

}
