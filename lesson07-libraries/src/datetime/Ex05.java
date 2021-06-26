package datetime;

import java.util.Calendar;

public class Ex05 {
	public static void main(String[] args) {
		int month = Calendar.JULY;
		int year = 2021;

		Calendar c = Calendar.getInstance();
		c.set(year, month, 1);

		int daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int firstWeedDayOfMonth = c.get(Calendar.DAY_OF_WEEK);

		System.out.println("daysInMonth: " + daysInMonth);
		System.out.println("firstWeedDayOfMonth: " + firstWeedDayOfMonth);

		int weekday = Calendar.FRIDAY;

		int fiveDays[] = null;

		// 31: 3 - 2
		// 30: 2 - 1
		// 29: 1 - 0
		// 28: 0

		switch (daysInMonth) {
		case 31:
			fiveDays = new int[3]; // 5 6 7
			fiveDays[0] = c.get(Calendar.DAY_OF_WEEK);
			c.add(Calendar.DAY_OF_MONTH, 1);
			fiveDays[1] = c.get(Calendar.DAY_OF_WEEK);
			c.add(Calendar.DAY_OF_MONTH, 1);
			fiveDays[2] = c.get(Calendar.DAY_OF_WEEK);
			break;
		case 30:
			fiveDays = new int[2]; // 5 6
			fiveDays[0] = c.get(Calendar.DAY_OF_WEEK);
			c.add(Calendar.DAY_OF_MONTH, 1);
			fiveDays[1] = c.get(Calendar.DAY_OF_WEEK);
			break;
		case 29:
			fiveDays = new int[1]; // 5
			fiveDays[0] = c.get(Calendar.DAY_OF_WEEK);
			break;
		}

		System.out.println("test: " + nofWeekdays(weekday, fiveDays));
	}

	private static int nofWeekdays(int weekday, int fiveDays[]) {
		for (int day: fiveDays) {
			// System.out.println("fiveday: " + day);
			if (weekday == day) {
				return 5;
			}
		}
		return 4;
	}

}