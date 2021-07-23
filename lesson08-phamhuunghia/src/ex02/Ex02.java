package ex02;

import utils.Utils;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("Enter your name:");
		String name;
		do {
			name = Utils.sc.nextLine();
			try {
				if (isValidName(name)) {
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (true);
		printName(name);
	}

	private static boolean isValidName(String name) throws Exception {
//		if (name.matches(".*\\d.*")) {
	    if (!name.matches("[A-za-z\\s]+")) {
			throw new Exception("Invalid name");
		}
		return true;
	}

	private static String formatName(String s) {
		return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
	}

	private static void printName(String input) {
		input = input.replace("frAnk", "Phan");
		input = input.replace("Anne", "Lê");
		String[] Names = input.split("\\s+");
		String output = "";
		for (String i : Names) {
			output += formatName(i) + " ";
		}
		
		
		System.out.println(output);
	}
	
	/*
	 *Use  StringBuilder or StringBuffer
	 */
	private static void printName2(String input) {
		String[] Names = input.split("\\s+");
		StringBuilder output = new StringBuilder();
		for (String i : Names) {
			output.append(formatName(i) + " ");
		}
		System.out.println(output);
	}
}
