package format;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Calendar;

public class Ex03 {
public static void main(String[] args) {
	BigDecimal digit= BigDecimal.valueOf(234455569.583534d);
	System.out.println("digit: "+digit);
	
	//Rounding
	digit=digit.setScale(5,RoundingMode.HALF_UP);
	
	Calendar c=Calendar.getInstance();
	System.out.println("rounding: "+digit);
}
}
