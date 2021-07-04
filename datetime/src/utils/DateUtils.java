package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;
import java.util.TimeZone;

public class DateUtils {
	private static final String ddMMyyyy = "dd/MM/yyyy";
	private static final GregorianCalendar gc = new GregorianCalendar();

	private DateUtils() {

	}

	public static Calendar getDateTime(int year, int month, int day, int hour, int minute, int second) {
		Calendar c = Calendar.getInstance();
		c.set(year, month, day,hour,minute,second);
		return c;
	}

	public static boolean isLeapYear(int year) {
		return gc.isLeapYear(year);
	}

	/**
	 * Convert calendar to formatted String with "ddMMyyyy" pattern
	 * 
	 * @param c given calendar
	 * @return format as string
	 */
	public static String format(Calendar c) {
		Objects.requireNonNull(c);

		DateFormat df = new SimpleDateFormat(ddMMyyyy);
		return df.format(c.getTime());
	}
	
	/**
	 * Convert calendar to formatted String with "ddMMyyyy" pattern
	 * 
	 * @param c given calendar
	 * @return format as string
	 */
	public static String format(Calendar c,TimeZone timezone) {
		Objects.requireNonNull(c);

		DateFormat df = new SimpleDateFormat(ddMMyyyy);
		df.setTimeZone(timezone);
		return df.format(c.getTime());
	}

	/**
	 * Convert string to date String with "ddMMyyyy" pattern
	 * 
	 * @param s given string
	 * @return format as date
	 */
	public static Date to(String s) {
		Objects.requireNonNull(s);
		DateFormat df = new SimpleDateFormat(ddMMyyyy);

		Date date = null;
		try {
			date = df.parse(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}

	/**
	 * Convert date to calendar
	 * 
	 * @param date given date
	 * @return calendar type
	 */
	public static Calendar to(Date date) {
		Objects.requireNonNull(date);
		Calendar c = Calendar.getInstance();

		c.setTime(date);
		return c;
	}
}
