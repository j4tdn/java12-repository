package format;

import java.text.NumberFormat;
import java.util.Locale;


public class Ex01 {
	
/*
 *format number theo giá trị tiền tệ 
 */	
public static void main(String[] args) {
	double digit=12312435764562389.2468d ;
	System.out.println("digit: "+digit);
	
	Locale denmark = new Locale("da", "DK");
	Locale france = Locale.FRANCE;
	
	//NumberFormat mac dinh
	NumberFormat nfdefault= NumberFormat.getInstance();
	System.out.println("Number instance(default): "+nfdefault.format(digit));
	NumberFormat nfcdefault= NumberFormat.getCurrencyInstance();
	System.out.println("currency instance(dèault): "+nfcdefault.format(digit));
	
	
	System.out.println("\n==========Đan mạch=======");
	//NumberFormat voi locale
	NumberFormat nf= NumberFormat.getInstance(denmark);
	System.out.println("Number instance: "+nf.format(digit));
	//NumberFormat: currencyInstance
	NumberFormat nfc= NumberFormat.getCurrencyInstance(denmark);
	System.out.println("currency instance: "+nfc.format(digit));
	
	System.out.println("\n==========Pháp=======");
	NumberFormat nf2= NumberFormat.getInstance(france);
	System.out.println("Number instance: "+nf2.format(digit));
	NumberFormat nfc2= NumberFormat.getCurrencyInstance(france);
	System.out.println("currency instance: "+nfc2.format(digit));
	
	
}
}
