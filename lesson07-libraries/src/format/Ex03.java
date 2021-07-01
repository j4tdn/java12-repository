package format;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex03 {
	public static void main(String[] args) {
	  BigDecimal digit = BigDecimal.valueOf(23456859.254574d);
	  System.out.println("digit: "+digit);
	  
	  //Rouding
	  digit = digit.setScale(2, RoundingMode.HALF_UP);
	  
	  System.out.println("rounding: "+digit);
	}
}
