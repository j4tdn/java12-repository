package ex04;

public class Ex04 {
	static String input = "  Welcome    to JAVA10  class ";
	public static void main(String[] args) {
		input = input.trim().replaceAll("\\s+"," ");
		System.out.println(revert(input));
	}
	private static String revert(String input) {
		char[] sequences = input.toCharArray();
		for(int i=0;i<sequences.length/2;i++) {
			char tmp=sequences[i];
			sequences[i] = sequences[sequences.length-i-1];
			sequences[sequences.length-i-1] = tmp;
		}
		return String.copyValueOf(sequences);
	}
}
