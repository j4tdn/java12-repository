package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import utils.DateUtils;

public class Ex02 {
	private static final String pattern = "dd/MM/yyyy";
	private static DateFormat df = new SimpleDateFormat(pattern);

	public static void main(String[] args) {
		// 21.6.2021
		// Locale: Country, Language
		System.out.println("default locale:" + Locale.getDefault());

		// Locale.setDefault(Locale.FRANCE);

		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, 16);
		//16.06.2021

		int firstDayOfWeek = c.getFirstDayOfWeek();
		System.out.println("firstDayOfWeek: " + firstDayOfWeek);

		c.add(Calendar.DAY_OF_MONTH, c.getFirstDayOfWeek() - c.get(Calendar.DAY_OF_WEEK));
		// fomat: dd/MM/yyyy
		System.out.println("date: " + df.format(c.getTime()));
		
		c.set(Calendar.YEAR,2020);
		System.out.println("isLeapYear: " + DateUtils.isLeapYear(c.get(Calendar.YEAR)));
	}
}
