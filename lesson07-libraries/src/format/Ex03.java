package format;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex03 {
	public static void main(String[] args) {
		BigDecimal digit = BigDecimal.valueOf(2354868.56318d);
		System.out.println("digit : " +digit);
		
		//rounding
		//RoundingMode.HALF_UP 
		digit.setScale(5, RoundingMode.HALF_UP);
	}
}
