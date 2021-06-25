package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

public class DateUtils {
	public static final String PATTERN = "dd/MM/yyyy HH:mm:ss";
	private static final GregorianCalendar gc = new GregorianCalendar();

	private DateUtils() {

	}

	public static boolean isLeapYear(int year) {
		return gc.isLeapYear(year);
	}

	/**
	 * Convert calendar to formatted string with dd/MM/yyyy pattern
	 * 
	 * @param c given calendar
	 * @return for
	 */
	public static String format(Calendar c) {
		Objects.requireNonNull(c);

		DateFormat df = new SimpleDateFormat(PATTERN);
		return df.format(c.getTime());
	}

public static Date toDate(String s) {
	Objects.requireNonNull(s);
	DateFormat df=new SimpleDateFormat(PATTERN);
	
	Date date =null;
	try {
		date=df.parse(s);
	}catch(ParseException e) {
		e.printStackTrace();
	}
	return date;
}
/**
 * Convert date to calendar
 * 
 * @return
 */
public static Calendar to(Date date) {
	Objects.requireNonNull(date);
	Calendar c=Calendar.getInstance();
	c.setTime(date);
	return c;
}
}
