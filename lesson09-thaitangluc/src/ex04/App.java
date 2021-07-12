package ex04;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String s = ip.nextLine();
		s = s.trim().replaceAll("\\s+", " ");
		String[] str = s.split("\\s");
		for(int i = 0; i<str.length; i++) {
			if(i!=str.length-1) {
				System.out.print(revert(str[i]) + " ");
			}
			else System.out.println(revert(str[i]));
		}
	}

	public static String revert(String s) {
		char[] sequences = s.toCharArray();
		for (int i = 0; i < sequences.length / 2; i++) {
			char tmp = sequences[i];
			sequences[i] = sequences[sequences.length - i - 1];
			sequences[sequences.length - i - 1] = tmp;
		}
		return String.copyValueOf(sequences);
	}
}
