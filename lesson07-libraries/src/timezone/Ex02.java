package timezone;

import java.text.DecimalFormat;

public class Ex02 {
	
	private static String PATTERN = "#,###.00";
	
	// # 0 , .
	// .274: rounding, flooring
	public static void main(String[] args) {
		double digit = 134868.2735d;
		DecimalFormat df = new DecimalFormat(PATTERN);
		
		System.out.println("df: " + df.format(digit));
		
		// singleton: ONE instance for each class
		// Calendar.getInstance(); => calendar
		// new Calendar();
		
		// Singleton: ONE instance => non-static methods
		// Utility, Helper class: private constructor, no instance => static methods
	}
}
