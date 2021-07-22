package format;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex03 {
	public static void main(String[] args) {
		BigDecimal digit=BigDecimal.valueOf(5464642354869.56318d);
		System.out.println("digit: "+digit);
		
		//Rounding: 
		//setScale(số lượng chữ số làm tròn, chế độ rounding)
		digit=digit.setScale(2,RoundingMode.HALF_UP); 
		System.out.println("Rounding: "+digit);
		
		//=======================================
		//Nhân hai số Bigdecimal
		BigDecimal b1=BigDecimal.valueOf(123659589.23538);
		BigDecimal b2=BigDecimal.valueOf(564.3893);
		
		System.out.println("\nresult: "+b1.multiply(b2));
	}
}
