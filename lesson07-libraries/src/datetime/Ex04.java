package datetime;

import java.util.Calendar;

import utils.DateUtils;

public class Ex04 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
	}

	private static int countNofSundays(int month, int year) {
		int count = 0;
		Calendar start = Calendar.getInstance();
		start.set(year, month, 1);
		Calendar end = Calendar.getInstance();
		end.set(year, month, start.getActualMaximum(Calendar.DAY_OF_MONTH));

		for (Calendar date = start; date.before(end); date.add(Calendar.DAY_OF_MONTH, 1)) {
			if (date.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				System.out.println(DateUtils.format(date));
				count++;
			}
		}

		return count;
	}
}
