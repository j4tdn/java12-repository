package datetime;

import java.util.Calendar;

import utils.DateUtils;

public class Ex03 {
	public static void main(String[] args) {
		// Print all current weekdays
		Calendar c = Calendar.getInstance();

		// set value default to Calendar
		c.set(Calendar.YEAR, 2020);
		c.set(Calendar.MONTH, Calendar.FEBRUARY);
		c.set(Calendar.DAY_OF_MONTH, 10);

		// get first day of week
		c.add(Calendar.DAY_OF_MONTH, c.getFirstDayOfWeek() - c.get(Calendar.DAY_OF_WEEK));
		System.out.println();

		// get amount dates of month, year
		System.out.println("============get amount dates of month, year ================");
		System.out.println("Year actual max day : " + c.getActualMaximum(Calendar.DAY_OF_YEAR));
		System.out.println("Month actual max day: " + c.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println("Month max day : " + c.getMaximum(Calendar.DAY_OF_MONTH));

		//get dates in week
		System.out.println("==========dates in week============");
		printWeekdays(c);
		
		//get dates in month
		System.out.println("==========dates in month============");
		printDaysInMonth(c);

	}

	private static void printWeekdays(Calendar c) {
		int day = 1;
		while (day <= 7) {
			System.out.println(DateUtils.format(c));
			c.add(Calendar.DAY_OF_MONTH, 1);
			day++;
		}
	}

	private static void printDaysInMonth(Calendar c) {
		int daysOfMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int day = 1;

		while (day <= daysOfMonth) {
			System.out.println(DateUtils.format(c));
			c.add(Calendar.DAY_OF_MONTH, 1);
			day++;
		}
	}
}
