package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

public class DateUtils {
	private static final String PATTERN = "dd/MM/yyyy HH:mm:ss";
	private static final GregorianCalendar gc = new GregorianCalendar();
	private DateUtils() {
		
	}
	
	public static Calendar getDateTime(int year, int month, int day, int hour, int minute, int second) {
		Calendar c = Calendar.getInstance();
		c.set(year, month, day, hour, minute, second);
		return c;
	}
	
	public static Calendar getDate(int year, int month, int day) {
		Calendar c = Calendar.getInstance();
		c.set(year, month, day);
		return c;
	}
	
	public static boolean isLeapYear(int year) {
		return gc.isLeapYear(year);
	}
	
	/**
	 * Convert calendar to formatted string with dd/MM/yyyy HH:mm:ss pattern
	 * 
	 * @param c given calendar
	 * @return formated calendar as string
	 */
	public static String format(Calendar c) {
		Objects.requireNonNull(c);
		DateFormat df = new SimpleDateFormat(PATTERN);
		return df.format(c.getTime());
	}
	
	/**
	 * Convert string to date string with dd/MM/yyyy HH:mm:ss pattern
	 * 
	 * @param c given string
	 * @return Date type
	 */
	
	public static Date to(String s) {
		Objects.requireNonNull(s);
		DateFormat df = new SimpleDateFormat(PATTERN);
		
		Date date = null;
		try {
			date = df.parse(s);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	/**
	 * Convert date to calender
	 * 
	 * @param c given date
	 * @return Calender type
	 */
	public static Calendar to(Date date) {
		Objects.requireNonNull(date);
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c;
	}
}
