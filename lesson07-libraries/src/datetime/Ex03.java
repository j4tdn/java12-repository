package datetime;

import java.util.Calendar;
import java.util.Date;

import utils.DateUtils;

public class Ex03 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		//c.set(Calendar.MONTH, Calendar.FEBRUARY);
		//c.set(Calendar.YEAR, 2020);
		
		System.out.println("Số ngày trong năm: "+c.getActualMaximum(Calendar.DAY_OF_YEAR));   //getActualMaximum 
		System.out.println("Số ngày trong tháng: "+c.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println("Maxdays "+c.getMaximum(Calendar.DAY_OF_MONTH));
		/*Hàm getMaximum chỉ in ra số ngày lớn nhất của tháng là 31
		ngày dù cho tháng đó là tháng mấy */
		
		System.out.println("============");
		System.out.println("Các ngày trong tháng: ");
		printDaysInMonth(c);
		
		
		
		System.out.println("============");
		/*
		 * In ra các ngày trong tuần
		 */
		
		//1 get first day of week
		c.add(Calendar.DAY_OF_WEEK, c.getFirstDayOfWeek() - c.get(Calendar.DAY_OF_WEEK));
		//2 In ra
		System.out.println("Các ngày trong tuần: ");
		printWeekdays(c);
		
		
		
		System.out.println("=================");
		System.out.println("String -> date");
		Date date= DateUtils.toDate("01/01/2001");
		System.out.println(date);
	}
	
	private static void printDaysInMonth(Calendar c) {
		int daysInMonth=c.getActualMaximum(Calendar.DAY_OF_MONTH); //Lấy số ngày lớn nhất của tháng
		int day=1;
		while(day<=daysInMonth) {
			System.out.println(DateUtils.format(c));
			c.add(Calendar.DAY_OF_MONTH, 1);
			day++;
		}
	}
	

	private static void printWeekdays(Calendar c ) {
		int day=1;
		while(day<=7) {
			System.out.println(DateUtils.format(c));
			c.add(Calendar.DAY_OF_MONTH, 1);
			day++;
		}
	}
}
