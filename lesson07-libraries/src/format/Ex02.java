package format;

import java.text.DecimalFormat;

public class Ex02 {
	private static String PATTERN ="#, ###";
	
	public static void main(String[] args) {
		double digit = 1231243.2389d;
		DecimalFormat df = new DecimalFormat(PATTERN);
		System.out.println("df : " + df.format(digit));
		
	}
}
