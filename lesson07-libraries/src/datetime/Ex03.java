package datetime;

import java.util.Calendar;
import java.util.Date;

import utils.DateUtils;

public class Ex03 {

	public static void main(String[] args) {
		// Print all current weekdays
		Calendar c = Calendar.getInstance();
       // c.set(Calendar.MONTH,Calendar.FEBRUARY);
       // c.set(Calendar.YEAR,2020);
		// get first day of week
        System.out.println("Year ActualMaxDays: "+c.getActualMaximum(Calendar.DAY_OF_YEAR));
		c.add(Calendar.DAY_OF_MONTH, c.getFirstDayOfWeek() - c.get(Calendar.DAY_OF_WEEK));

		printWeekdays(c);
		//printDaysInMonth(c);
		
		Date date=DateUtils.toDate("23/07/2020 07:03:26 PM Sun");
		
	}
	private static void printWeekdays(Calendar c) {
		int day=1;
		while(day<=7) {
			System.out.println(DateUtils.format(c));
			c.add(Calendar.DAY_OF_MONTH, 1);
			day++;
		}
	}
	private static void printDaysInMonth(Calendar c) {
		int daysInMonth=c.getActualMaximum(Calendar.DAY_OF_MONTH);
		//int dayMaxMonth=c.getMaximum(Calendar.DAY_OF_MONTH);
		int day=1;
		while(day<=daysInMonth) {
			System.out.println(DateUtils.format(c));
			c.add(day, 1);
			day++;
		}
	}
}
