package format;

import java.text.NumberFormat;
import java.util.Locale;

public class Ex01 {
	public static void main(String[] args) {
		double digit = 12343453454355.2684d;
		System.out.println("digit: " + digit);
         Locale denmark=new Locale("vi","VN");
         
         //NumberFormat: number
		NumberFormat nf = NumberFormat.getInstance(denmark);
		System.out.println("instance: " + nf.format(digit));
		
		//
		NumberFormat nfc = NumberFormat.getCurrencyInstance(denmark);
		System.out.println("currency instance: " + nfc.format(digit));
	}
}
