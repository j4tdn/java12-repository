package datetime;

import java.util.Calendar;
import java.util.Date;

import utils.DateUtils;

public class Ex03 {
	public static void main(String[] args) {
		// Print all current weekdays
		Calendar c = Calendar.getInstance(); // 24.06.2021
		c.set(Calendar.MONTH, Calendar.FEBRUARY);
		c.set(Calendar.YEAR, 2020);

		System.out.println("Year ActualMaxDays: " + c.getActualMaximum(Calendar.DAY_OF_YEAR));
		System.out.println("ActualDays: " + c.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println("MaxDays: " + c.getMaximum(Calendar.DAY_OF_MONTH));
		// get first day of week
		c.add(Calendar.DAY_OF_MONTH, c.getFirstDayOfWeek() - c.get(Calendar.DAY_OF_WEEK));
		System.out.println("================");
		printWeekdays(c);
//		 printDaysInMonth(c);
		// parse String
		Date date = DateUtils.to("28/Feb/2020 07:07:24 PM Friday");
		System.out.println("date:" + date);
	}

	private static void printWeekdays(Calendar c) {
		// print out week
		int day = 0;
		while (day < 7) {
			System.out.println(DateUtils.format(c));
			c.add(Calendar.DAY_OF_MONTH, 1);
			day++;
		}
	}

	private static void printDaysInMonth(Calendar c) {
		int daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int day = 0;
		while (day < daysInMonth) {
			System.out.println(c);
			c.add(Calendar.DAY_OF_MONTH, 1);
			day++;
		}
	}

	private static void printDaysInYear(Calendar c) {
		int daysInYear = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		int day = 0;
		while (day < daysInYear) {
			System.out.println(c);
			c.add(Calendar.DAY_OF_MONTH, 1);
			day++;
		}
	}
}
