package ex06;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		String s = "";
		int index = 0;
		Scanner sc = new Scanner(System.in);
		index = Integer.parseInt(sc.nextLine());
		int number = 1;

		while (s.length() < index) {
			s += number++;
		}

		System.out.println("Số thứ " + index + " là: " + s.charAt(index - 1));
	}
}
