package datetime;

import java.util.Calendar;

public class Ex05 {
	public static void main(String[] args) {
		int month = Calendar.JULY;
		int year = 2021;

		Calendar c = Calendar.getInstance();
		c.set(year, month, 1);
		int daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int firstWeekDayOfMonth = c.get(Calendar.DAY_OF_WEEK);

		System.out.println("daysInMonth: " + daysInMonth);
		System.out.println("firstWeekDayOfMonth: " + firstWeekDayOfMonth);
		int weekday = Calendar.THURSDAY;
		int result = 0;
		switch (daysInMonth) {
		case 31:
			result = Math.abs(firstWeekDayOfMonth - weekday) < 3 ? 5 : 4;
			break;
		case 30:
			result = Math.abs(firstWeekDayOfMonth - weekday) < 2 ? 5 : 4;
			break;
		case 29:
			result = Math.abs(firstWeekDayOfMonth - weekday) < 1 ? 5 : 4;
			break;
		case 28:
			result=4;
			break;
		default:
			break;
		}
	}
}
