package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import utils.DateUtils;

public class Ex02 {

	private static String PATTERN = "dd-MM-yyyy hh-mm-ss";
	private static DateFormat df = new SimpleDateFormat(PATTERN);
	
	public static void main(String[] args) {
		// 21.05.2021
		// Locale: Language, Country
		
		Locale.getDefault(); //get locale dafault
		Locale.setDefault(new Locale("vi", "VN"));  //set new locale
		Locale lFrance = Locale.FRANCE;
		
		Calendar c = Calendar.getInstance(lFrance);
		c.set(Calendar.DAY_OF_MONTH, 1);
		System.out.println(df.format(c.getTime()));
		
		int firstDayOfWeek = c.getFirstDayOfWeek();
		System.out.println(firstDayOfWeek);
		
		c.add(Calendar.DAY_OF_MONTH, c.getFirstDayOfWeek() - c.get(Calendar.DAY_OF_WEEK));
		System.out.println(df.format(c.getTime()));
		
		//Class Utils : ko quan tâm đối tượng nào đang gọi
		System.out.println("isLeapYear : " + DateUtils.isLeapYear(Calendar.YEAR));
	}
}