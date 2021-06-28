package datetime;

import java.util.Calendar;

import utils.DateUtils;

public class Ex04 {
	public static void main(String[] args) {
		// Count number of Sunday(s) in this month
		Calendar c = Calendar.getInstance();
		countNofSundays(Calendar.MARCH, 2021);
	}
	
	// month: 3 & year:2018
	private static int countNofSundays(int month, int year) {
		int count = 0;

		// first day of month
		Calendar start = Calendar.getInstance(); // 24.06.2021
		start.set(year, month, 1); // 01.03.2018
		
		Calendar end = Calendar.getInstance(); // 24.06.2021
		end.set(year, month, start.getActualMaximum(Calendar.DAY_OF_MONTH)); // 31.03.2018
		
		for(Calendar date = start; !date.after(end); date.add(Calendar.DAY_OF_MONTH, 1)) {
			if(date.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				System.out.println(DateUtils.format(date));
				count++;
			}
		}
		return count;
	}
}
