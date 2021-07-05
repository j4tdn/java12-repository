package ex03;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import utils.DateUtils;

public class Ex03_JV07 {
	private static final String PT_DATE = "dd/MM/yyyy";
	private static String[] weekDays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thurs", "Friday", "Saturday" };

	public static void main(String[] args) {
		int choose;

		while (true) {
			System.out.println("=========Menu=======");
			System.out.println("1.Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ.");
			System.out.println("2.In ngày cuối cùng của tháng hiện tại");
			System.out.println("3.Xem ngày đầu tiên và cuối cùng của tuần hiện tại.");
			System.out.println("4.Xem ngày hiện tại đang ở tuần thứ mấy trong năm");
			System.out.println("5.Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy");
			System.out.println("6.Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu ngày");
			System.out.println("Ban chon?");
			choose = Integer.parseInt(DateUtils.sc.nextLine());

			switch (choose) {
			case 1:
				getTimeZone("Etc/GMT-2");
				break;
			case 2:
				System.out.println("Ngày cuối cùng của tháng hiện tại là: " + DateUtils.format(getLastdateOfmonth()));
				break;
			case 3:
				getstarAndLastDayOfWeek();
				break;
			case 4:
				getWeekNumber();
				break;
			case 5:
				getAfter20Days();
				break;
			case 6:
				getNumberOfDayLife();
				break;
			default:
				System.out.println("Chương trình kết thú");
				System.exit(0);
			}

		}

	}

	private static void getTimeZone(String timezone) {
		// TODO Auto-generated method stub
		// Europe/Berlin
		TimeZone tzBerlin = TimeZone.getTimeZone(timezone);
		Calendar c = Calendar.getInstance(tzBerlin);
		System.out.println("dateTime berlin: " + DateUtils.format(c, tzBerlin));
	}

	private static void getNumberOfDayLife() {
		String[] dateString = null;
		Calendar birthday = null;
		Calendar now = Calendar.getInstance();
		while (true) {
			try {
				System.out.println("Enter your birth date - dd/MM/yyy: ");
				dateString = DateUtils.sc.nextLine().split("/");
				birthday = DateUtils.getDateCalendar(dateString);
				if (birthday.after(now)) {
					throw new IllegalArgumentException("Birthday cannot exceed current time!");
				}
			} catch (Exception e) {
				e.printStackTrace();
				continue;
			}
			break;
		}
		long starAsMilliseconds = birthday.getTimeInMillis();
		long nowAsMilliseconds = now.getTimeInMillis();
		long duration = nowAsMilliseconds - starAsMilliseconds;

		long days = TimeUnit.MILLISECONDS.toDays(duration);
		duration -= TimeUnit.DAYS.toMillis(days);

		long hour = TimeUnit.MILLISECONDS.toHours(duration);
		duration -= TimeUnit.HOURS.toMillis(hour);

		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		duration -= TimeUnit.MINUTES.toMillis(minutes);

		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		duration -= TimeUnit.SECONDS.toMillis(seconds);

		System.out.println(days + " ngày " + hour + " giờ " + minutes + " phút " + seconds + " giây ");

	}

	private static void getAfter20Days() {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, 20);
		System.out.println(
				"20 ngày sau là ngày: " + DateUtils.format(c) + "- " + weekDays[c.get(Calendar.DAY_OF_WEEK) - 1]);
	}

	private static void getWeekNumber() {
		Calendar c = Calendar.getInstance();
		System.out.println("Hôm nay là tuần thứ " + c.get(Calendar.WEEK_OF_YEAR) + " của năm " + c.get(Calendar.YEAR));
	}

	private static Calendar getLastdateOfmonth() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		return c;
	}

	private static void getstarAndLastDayOfWeek() {
		Calendar c = Calendar.getInstance();
		System.out.println(DateUtils.format(c));
		c.add(Calendar.DAY_OF_MONTH, c.getFirstDayOfWeek() - c.get(Calendar.DAY_OF_WEEK));
		System.out.println("first date of this week: " + DateUtils.format(c));

		c = Calendar.getInstance();
		System.out.println("month" + c.get(Calendar.MONTH));
		c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println("last date of this week: " + DateUtils.format(c));

	}

}
