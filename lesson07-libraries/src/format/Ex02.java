package format;

import java.text.DecimalFormat;

public class Ex02 {
	
	private static String PATTERN = "#,###.00";
	
	// DecimalFormat has rounding and flooring
	// # 0 , .
	public static void main(String[] args) {
		double digit = 12312312312312312368.2745d;
		DecimalFormat df = new DecimalFormat(PATTERN);
		
		System.out.println("df: " + df.format(digit));
	}
}
