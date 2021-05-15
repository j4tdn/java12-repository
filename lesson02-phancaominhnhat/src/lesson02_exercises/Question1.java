package lesson02_exercises;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("Nhập vào một số nguyên dương: ");
			int number = scanner.nextInt();
			while(number < 0) {
				System.out.print("Nhập số nguyên dương lớn hơn 0 : ");
				number = scanner.nextInt();
			};
			if(isExponentialOfTwo(number)) {
				System.out.println(number + " là lũy thừa của 2.");
			} else {
				System.out.println(number + " không là lũy thừa của 2.");
			};
		}
		
	}
	public static boolean isExponentialOfTwo(int number) {
		if(number == 0) {
			return false;
		}
		if(number == 1) {
			return true;
		}
		if(number % 2 == 0) {
			return isExponentialOfTwo(number/2);
		}
		return false;
	}

}
