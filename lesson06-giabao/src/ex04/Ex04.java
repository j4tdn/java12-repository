package ex04;

import java.util.Scanner;

public class Ex04 {
	private static Scanner sc = new Scanner(System.in);
	private static String[] units = {"", "một", "hai", "ba","bốn","năm","sáu","bảy","tám", "chín"};
	private static String[] bigTens = {"không", "mốt", "hai", "ba","bốn","lăm","sáu","bảy","tám", "chín"};
	private static String[] dozens = {"lẻ","mười","hai mươi","ba mươi","bốn mươi","năm mươi","sáu mươi","bảy mươi","tám mươi","chín mươi"};
	private static String[] hundreds = {"", "một trăm", "hai trăm", "ba trăm","bốn trăm","năm trăm","sáu trăm","bảy trăm","tám trăm","chín trăm"};
	private static int number =0;
	public static void main(String[] args) {
		System.out.println("Enter 0 to end main!");
		do {
		System.out.print("Enter a number: ");
		number = Integer.parseInt(sc.nextLine());
		hundreds(number);
		}
		while (number> 0 && number < 999);
	}
	private static void hundreds(int Number) {
		if (number < 100) {
			tens(number, number);
		} else {
			System.out.print(hundreds[number/100]);
			tens(number%100, number);
		}
	}
	private static void tens(int number1, int number2) {
		if(number1<10 && number2<10) {
			units(number1);
		}else if(number1<10) {
			System.out.println(" " +dozens[number1/10]+" " +units[number%10]);
		} else 
			System.out.println(" " +dozens[number1/10]+" " +bigTens[number%10]);
	}
	private static void units(int number2) {
		System.out.print(units[number]);
	}
}
