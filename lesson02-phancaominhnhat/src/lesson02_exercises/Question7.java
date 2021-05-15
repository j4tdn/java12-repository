package lesson02_exercises;

import java.util.Random;
import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		int n1, n2;
		int count = 0;
		int value = 0;
		int tmp = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập giới hạn của random: ");
		n1 = scanner.nextInt();
		n2 = scanner.nextInt();
		Random generator = new Random();
		System.out.print("5 số nguyên ngẫu nhiên là: ");
		while(count <= 5) {
			count++;
			value = generator.nextInt(n2 - n1) + n1;
			if(value != tmp) {
				tmp = value;
				System.out.print(tmp + " ");
			}
		}
	}

}
