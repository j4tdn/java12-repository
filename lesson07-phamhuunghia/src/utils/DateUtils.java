package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Objects;
import java.util.Scanner;
import java.util.TimeZone;

public class DateUtils {
	public static Scanner sc = new Scanner(System.in);

	/*
	 * convert String to LocalDate
	 */
	public static LocalDate toLocalDate(String date, String pattern) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		return LocalDate.parse(date, dtf);
	}

	/*
	 * convert String to LocalTime
	 */
	public static LocalTime toLocalTime(String date, String pattern) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		return LocalTime.parse(date, dtf);
	}

	/*
	 * Convert string tocalendar Input: String s
	 */
	public static Calendar getDateCalendar(String s[]) {
		Calendar c = Calendar.getInstance();
		c.set(Integer.parseInt(s[2]), Integer.parseInt(s[1]) - 1, Integer.parseInt(s[0]));
		return c;
	}

	/*
	 * Convert string tocalendar Input: String date, month,year
	 */
	public static Calendar getDateCalendar(int date, int month, int year) {
		Calendar c = Calendar.getInstance();
		c.set(date, month - 1, year);
		return c;
	}

	/*
	 * Đếm số ngày thứ X (thứ hai,ba tư ,năm,.. chủ nhật) của 1 tháng bất kỳ 
	 * INPUT:int month,int year, weekday, calendar
	 * OUTPUT: Number of weekday in a month
	 */
	public static int[] countNumOfWeeksDays(int month, int year, int weekday, Calendar DateInput) {
		int countWeekday = 0;
		int countSumofWeekday = 0;

		Calendar star = Calendar.getInstance();
		star.set(year, month, 1);

		Calendar end = Calendar.getInstance();
		end.set(year, month, star.getActualMaximum(Calendar.DAY_OF_MONTH));

		Calendar dateTemp = Calendar.getInstance();
		dateTemp.set(DateInput.get(Calendar.YEAR), DateInput.get(Calendar.MONTH), DateInput.get(Calendar.YEAR));
		dateTemp.add(Calendar.DAY_OF_MONTH, 1);

		for (Calendar date = star; !date.after(end); date.add(Calendar.DAY_OF_MONTH, 1)) {
			if (date.get(Calendar.DAY_OF_WEEK) == weekday) {
				countSumofWeekday++;
				if (date.before(dateTemp)) {
					countWeekday++;
				}
			}
		}

		int arr[] = { countWeekday, countSumofWeekday };

		return arr;
	}

	/*
	 * Đếm số ngày thứ X (thứ hai,ba tư ,năm,.. chủ nhật) của 1 tháng bất kỳ 
	 * INPUT: int month,int year, weekday, calendar
	 * OUTPUT: Number of weekday in a month
	 */
	public static int[] countNumOfWeeksDaysInYear(int month, int year, int weekday, Calendar DateInput) {
		int countWeekday = 0;
		int countSumOfWeekday = 0;

		Calendar star = Calendar.getInstance();
		star.set(year, Calendar.JANUARY, 1);

		Calendar end = Calendar.getInstance();
		end.set(Calendar.YEAR, year);
		end.set(Calendar.MONTH, Calendar.DECEMBER);
		end.set(Calendar.DAY_OF_MONTH, end.getActualMaximum(Calendar.DAY_OF_MONTH));

		Calendar dateTemp = Calendar.getInstance();
		dateTemp.set(DateInput.get(Calendar.YEAR), DateInput.get(Calendar.MONTH), DateInput.get(Calendar.DAY_OF_MONTH));
		dateTemp.add(Calendar.DAY_OF_MONTH, 1);

		while (star.get(Calendar.DAY_OF_WEEK) != weekday) {
			star.add(Calendar.DAY_OF_MONTH, 1);
		}

		for (Calendar date = star; !date.after(end); date.add(Calendar.DAY_OF_MONTH, 7)) {
			if (date.get(Calendar.DAY_OF_WEEK) == weekday) {
				countSumOfWeekday++;
				if (date.before(dateTemp)) {
					countWeekday++;
				}
			}
		}

		int arr[] = { countWeekday, countSumOfWeekday };
		return arr;
	}

	public static String format(Calendar c) {
		Objects.requireNonNull(c);
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		return df.format(c.getTime());
	}
	
	public static String format(Calendar c,TimeZone timezone) {
		Objects.requireNonNull(c);
		DateFormat df= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		df.setTimeZone(timezone);
		return df.format(c.getTime());
	}
}
