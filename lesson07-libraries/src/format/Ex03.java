package format;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex03 {
	public static void main(String[] args) {
		BigDecimal digit=BigDecimal.valueOf(5464642354869.56318d);
		System.out.println("digit: "+digit);
		
		//Rounding: lam tron tren 
		digit=digit.setScale(2,RoundingMode.HALF_UP);
		System.out.println("Rounding: "+digit);
	}
}
