package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import utils.DateUtils;

public class Ex02 {

	private static final String DDMMYYYY = "dd/MM/yyyy";
	private static DateFormat df = new SimpleDateFormat(DDMMYYYY);

	public static void main(String[] args) {
		// 21.05.2021
		// Locale: Language, Country

//		Locale.setDefault(new Locale("vi", "VN"));
		System.out.println("default locale: " + Locale.getDefault());

		Calendar c = Calendar.getInstance(new Locale("vi", "VN"));

		c.set(Calendar.DAY_OF_MONTH, 3);
		// 03.06.2021

		int firstDayOfWeek = c.getFirstDayOfWeek();
		System.out.println("firstDayOfWeek: " + firstDayOfWeek);
		
		

		c.add(Calendar.DAY_OF_MONTH, c.getFirstDayOfWeek() - c.get(Calendar.DAY_OF_WEEK));
		System.out.println("date: " + df.format(c.getTime()));
		
		c.set(Calendar.YEAR, 2020);

		System.out.println("isLeapYear: " + DateUtils.isLeapYear(c.get(Calendar.YEAR)));
	}
}
