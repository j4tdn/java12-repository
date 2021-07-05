package format;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex03 {
	public static void main(String[] args) {
		BigDecimal digit = BigDecimal.valueOf(31231234869.56318d);
		System.out.println("digit " + digit);
		
		// Rounding
		// HALF_UP is commercial round
		digit = digit.setScale(2, RoundingMode.HALF_UP);
		
		System.out.println("rounding: " + digit);		
	}
}
