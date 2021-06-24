package datetime;

import java.util.Calendar;
import java.util.Date;

import utils.DateUtils;

public class Ex03 {
	public static void main(String[] args) {
		// Print all current weekdays
		Calendar c = Calendar.getInstance();
		c.set(Calendar.MONTH, Calendar.FEBRUARY);
		c.set(Calendar.YEAR, 2020);
		
		System.out.println("Year ActualMaxDays: " + c.getActualMaximum(Calendar.DAY_OF_YEAR));
		System.out.println("ActualMaxDays: " + c.getActualMaximum(Calendar.DAY_OF_WEEK));
		System.out.println("MaxDays: " + c.getMaximum(Calendar.DAY_OF_MONTH));
		
		
		// get first day of week
		c.add(Calendar.DAY_OF_MONTH, c.getFirstDayOfWeek() - c.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("==========================");
		printWeekdays(c);
//		printDayInMonth(c);
		
		Date date = DateUtils.to("29/02/2020 19:04:27");
		System.out.println("date: " + date);
	}
	
	private static void printWeekdays(Calendar c) {
		int day = 1;
		while(day <= 7) {
			System.out.println(DateUtils.format(c)); // dd/MM/yyyy HH:mm:ss
			c.add(Calendar.DAY_OF_MONTH, 1);
			day++;
		}
	}
	
	private static void printDayInMonth(Calendar c) {
		int daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		int day = 1;
		while(day <= daysInMonth) {
			System.out.println(c);
			c.add(Calendar.DAY_OF_MONTH, 1);
			day++;
		}
	}
}
