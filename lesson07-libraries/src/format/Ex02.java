package format;

import java.text.DecimalFormat;

public class Ex02 {
	private static String PATTERN = "#.00";
	
	// # 0 , .
	public static void main(String[] args) {
		double digit = 124568.2756d;
		DecimalFormat df = new DecimalFormat(PATTERN);
		
		System.out.println("df: " + df.format(digit));
	}
}
