package ex01;

import java.util.Scanner;

public class Ex01 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Nhập vào chuỗi ký tự: ");
		String input = sc.nextLine();
		printSequences(input);
		printWords(input);
		System.out.println("ReverseSequences: " + reverseSequences(input));
		System.out.println("ReserverWords: " +  reverseWords(input));
	}

	private static void printSequences(String input) {
		System.out.println("In ra các kí tự:");
		char[] sequences = input.toCharArray();
		for (char sequence : sequences) {
			System.out.print(sequence + " ");
		}
	}

	private static void printWords(String input) {
		System.out.println("\nIn ra các từ trong chuỗi:");
		String[] words = input.split("\\s+");
		for (String word : words) {
			System.out.println(word);
		}
	}

	private static String reverseSequences(String input) {
		char[] sequences = input.toCharArray();
		for (int i = 0; i < sequences.length / 2; i++) {
			char tmp = sequences[i];
			sequences[i] = sequences[sequences.length - i - 1];
			sequences[sequences.length - i - 1] = tmp;
		}
		return String.copyValueOf(sequences);
	}
	
	private static String reverseWords(String input) {
		String[] words = input.split("\\s+");
		for (int i = 0; i < words.length / 2; i++) {
			String tmp = words[i];
			words[i] = words[words.length - i - 1];
			words[words.length - i - 1] = tmp;
		}
		String result ="";
		for(String word : words) {
			result += word + " ";
		}
		return result;
	}
}
