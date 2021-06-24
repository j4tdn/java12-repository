package datetime;

import java.util.Calendar;
import java.util.Date;

import utils.DateUtils;

public class Ex03 {
	public static void main(String[] args) {
		//Print all current weekdays
		Calendar c = Calendar.getInstance(); //24.6.2021
		
		//ActualDays
		System.out.println("year ActualMaxDays: " + c.getActualMaximum(Calendar.DAY_OF_YEAR));
		System.out.println("ActualDays: " + c.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println("MaximunDays: " +c.getMaximum(Calendar.DAY_OF_MONTH));
		
		//get first day of week
		c.add(Calendar.DAY_OF_MONTH, c.getFirstDayOfWeek()- c.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("===================");
		printWeeksday(c);
		
		System.out.println("===================");
		//printDaysInMonth(c);
		
		Date date = DateUtils.to("28/07/2001");
		System.out.println("Date: " + DateUtils.to(date));

	}
	
	private static void printWeeksday(Calendar c) {
		int day =0;
		while (day<=7) {
			System.out.println(DateUtils.format(c));
			c.add(Calendar.DAY_OF_MONTH, 1);
			day++;
		}
	}
	
	private static void printDaysInMonth(Calendar c) {
		int dayInMonth= c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int day =1;
		while (day<=dayInMonth) {
			System.out.println(DateUtils.format(c));
			c.add(Calendar.DAY_OF_MONTH, 1);
			day++;
		}
	}
}
