package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

public class DateUtils {
	private static final GregorianCalendar gc = new GregorianCalendar();

	private static String PATTERN = "dd/MM/yyyy hh:mm:ss";
	private static DateFormat df = new SimpleDateFormat(PATTERN);
	
	private DateUtils() {

	}

	public static boolean isLeapYear(int year) {
		return gc.isLeapYear(year);
	}
	
	/**
	 * Format Calendar to String 
	 * @param Calendar c 
	 * @return date formatted 
	 */
	public static String format(Calendar c) { 
		Objects.requireNonNull(c);
		return df.format(c.getTime());
	}
	
	/**
	 * Convert String to Date
	 * @param String s 
	 * @return Date date 
	 */
	public static Date convert(String s) {
		Objects.requireNonNull(s);
		
		Date date = null;
		try {
			date = df.parse(s);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	/**
	 * Convert Date to Calendar
	 * @param Date d 
	 * @return Calendar c 
	 */
	public static Calendar convert(Date d) {
		Objects.requireNonNull(d);
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		return c;
	}
}