package ex02;

import java.util.Scanner;

public class Ex02 {
	static private Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		String input ="";
		do {
			System.out.print("Nhập vào họ và tên:");
			input = sc.nextLine();
		} 
		while(!isValid(input));
		System.out.println(formatName(input));
	}
	private static String formatName(String input) {
		String result = input.trim().toLowerCase()
					.replaceAll("\\s+", " ");
		
		char[] sequences = result.toCharArray();
		sequences[0] = Character.toUpperCase(sequences[0]);
		for(int i=0;i<sequences.length;i++) {
			if(sequences[i]==' ') {
				sequences[i+1]= Character.toUpperCase(sequences[i+1]);
			}
		}
		result=String.valueOf(sequences);
		return result;
	}
	private static boolean isValid(String input) {
		for(int i=0;i<input.length();i++) {
			char letter = input.charAt(i);
			if( (!Character.isLetter(letter) && (letter!= ' '))){
				return false;
			}
		}
		return true;
	}
}
