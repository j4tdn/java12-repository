package ex02;

import java.util.Calendar;

import utils.DateUtils;

public class Ex02_JV07 {

	public static void main(String[] args) {
		String[] weekDays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thurs", "Friday", "Saturday" };
		
		while(true) {
			try {
				System.out.println("Enter the date - dd/MM/yyy: ");
				
				String[] dateString = DateUtils.sc.nextLine().split("/");
				
				Calendar c = DateUtils.getDateCalendar(dateString);
				System.out.println("\n- " + dateString[0] + " " + getStringMonth(dateString[1]) + " " + dateString[2] + " "
						+ " is " + weekDays[c.get(Calendar.DAY_OF_WEEK) - 1]);

				System.out.println("- Additional facts: ");

				String Month = getStringMonth(dateString[1]);
				System.out.println("+ " + Month + " has " + c.getActualMaximum(Calendar.DAY_OF_MONTH) + " days");

				System.out.println("+ " + dateString[2] + " has " + c.getActualMaximum(Calendar.DAY_OF_YEAR) + " days");

				System.out.println("+ It's day number " + c.get(Calendar.DAY_OF_YEAR) + " of the year, "
						+ (c.getActualMaximum(Calendar.DAY_OF_YEAR) - c.get(Calendar.DAY_OF_YEAR)) + " days left");

				int[] arr = DateUtils.countNumOfWeeksDays(Integer.parseInt(dateString[1]) - 1, Integer.parseInt(dateString[2]),
						c.get(Calendar.DAY_OF_WEEK), c);

				System.out.println("+ It is " + weekDays[c.get(Calendar.DAY_OF_WEEK) - 1] + " number " + arr[0] + " of "
						+ arr[1] + " int " + getStringMonth(dateString[1]) + dateString[2]);

				int[] arr2 = DateUtils.countNumOfWeeksDaysInYear(Integer.parseInt(dateString[1]) - 1,
						Integer.parseInt(dateString[2]), c.get(Calendar.DAY_OF_WEEK), c);
				System.out.println("+ It's" + weekDays[c.get(Calendar.DAY_OF_WEEK) - 1] + " number " + arr2[0] + " out of "
						+ arr2[1] + " in " + dateString[2]);
			}catch (Exception e) {
				e.printStackTrace();
				continue;
			}
			break;
		}
	}

	public static String getStringMonth(String s) {
		switch (s) {
		case "01":
			return "January";
		case "02":
			return "February";
		case "03":
			return "March";
		case "04":
			return "April";
		case "05":
			return "May";
		case "06":
			return "June";
		case "07":
			return "July";
		case "08":
			return "August";
		case "09":
			return "September";
		case "10":
			return "October";
		case "11":
			return "November";
		default:
			return "December";
		}
	}
}
