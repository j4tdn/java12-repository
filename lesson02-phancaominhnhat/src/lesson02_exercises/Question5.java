package lesson02_exercises;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		System.out.print("Nhập vào một số cơ số 10: ");
		int number = scanner.nextInt();
		System.out.println("Hệ cơ số 2 của số đó là : " + changeOctToBin(number));
	}
	private static String changeOctToBin(int number) {
		String strBin = "";
		while(number > 0) {
			if(number % 2 == 0) {
				strBin = "0" + strBin;
			}
			if(number % 2 != 0) {
				strBin = "1" + strBin;
			}
			number = number / 2;
		}
		return strBin;
	}

}
