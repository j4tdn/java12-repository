package datetime;

import java.util.Calendar;

import utils.DateUtils;

public class Ex04 {
	public static void main(String[] args) {
		// count number of sunday in this month

		countNofSundays(Calendar.MARCH, 2021);
	}

	private static int countNofSundays(int month, int year) {
		Calendar start = Calendar.getInstance();
		start.set(year, month, 1);

		Calendar end = Calendar.getInstance();
		end.set(year, month, end.getActualMaximum(Calendar.DAY_OF_MONTH));

		int count = 0;
		for (Calendar date = start; !start.after(end); date.add(Calendar.DAY_OF_MONTH, 1)) {
			if (date.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				System.out.println(DateUtils.format(date));
				count++;
			}
		}
		
		return count;
	}

}
