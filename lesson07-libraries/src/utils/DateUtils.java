package utils;

import java.util.GregorianCalendar;

public class DateUtils {
	private DateUtils() {
		
	}
	public static boolean isLeapYear(int year) {
		GregorianCalendar gc = new GregorianCalendar();
		return gc.isLeapYear(year);
	}
}
