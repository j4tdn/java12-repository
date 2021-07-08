package ex03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Ex03 {
	public static void main(String[] args) {
		showNewYorkTime();
		showMaxDateInCurrentMonth();
		showLastDateInCurrentMonth();
		showFirstAndLastDateInCurrentWeek();
		showCurrentWeekRankInYear();
		add4HourInCurrentTime();
		checkPeriorBetween2Time();
		checkDateAfter2Week();
		checkLeftMonth();
		showMyAge();
	}

	private static void showMyAge() {
		System.out.println("================");
		
		LocalDate ldate = LocalDate.now();
		LocalDate myBirthDay = LocalDate.of(2000, 8, 25);
		
		Period period =  Period.between(myBirthDay, ldate);
		System.out.println("Tôi: " + period.getYears() + " tuổi, " + period.getMonths() + " tháng, " + period.getDays() + " ngày");
		
	}

	private static void checkLeftMonth() {
		System.out.println("================");
		
		Calendar c = Calendar.getInstance();
		int month = c.get(Calendar.MONTH) + 1;
		
		System.out.println("Năm hiện tại còn: " + (12 - month));
		
	}

	private static void checkDateAfter2Week() {
		System.out.println("================");
		
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DATE, 14);
		String sdate = convertDateToString(c);
		
		System.out.println("Ngày sau khi thêm 2 tuần: " + sdate);
		
	}

	private static void checkPeriorBetween2Time() {
		System.out.println("================");
		
		LocalDate lStartDate = LocalDate.of(2006, 2, 23);
		LocalDate lEndDate = LocalDate.of(2019, 5, 30);
		Period perior = Period.between(lStartDate, lEndDate);

		System.out.println("Giữa 2 mốc thời gian có: " + perior.getYears() + " năm, " + perior.getMonths() + " tháng, "
				+ perior.getDays() + " ngày");
	}

	private static void add4HourInCurrentTime() {
		System.out.println("================");
		
		Calendar c = Calendar.getInstance();
		c.add(Calendar.HOUR, 4);

		String sdate = convertTimeToString(c);
		System.out.println("Giờ đã cộng thêm 4: " + sdate);

	}

	private static void showCurrentWeekRankInYear() {
		System.out.println("================");
		Calendar c = Calendar.getInstance();

		System.out.println("Ngày hiện tại ở tuần thứ " + c.get(Calendar.WEEK_OF_YEAR) + " trong năm");

	}

	private static void showFirstAndLastDateInCurrentWeek() {
		System.out.println("================");

		Calendar c = Calendar.getInstance();
		Calendar firstDateInWeek = Calendar.getInstance();
		Calendar lastDateInWeek = Calendar.getInstance();

		firstDateInWeek.set(Calendar.DAY_OF_WEEK, 1);
		lastDateInWeek.set(Calendar.DAY_OF_WEEK, 7);

		String sFirstDateInWeek = convertDateToString(firstDateInWeek);
		String sLastDateInWeek = convertDateToString(lastDateInWeek);

		System.out.println("Ngày đầu tiên trong tuần hiện tại: " + sFirstDateInWeek
				+ "\nNgày cuối cùng trong tuần hiện tại: " + sLastDateInWeek);
		System.out.println("Máy mặc định chủ nhật là ngày đầu tiên");
	}

	private static void showLastDateInCurrentMonth() {
		System.out.println("================");

		Calendar c = Calendar.getInstance();
		int lastDateInCurrentMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		c.set(Calendar.DATE, lastDateInCurrentMonth);
		String sdate = convertDateToString(c);

		System.out.println("Ngày cuối cùng của tháng hiện tại: " + sdate);
	}

	private static void showMaxDateInCurrentMonth() {
		System.out.println("================");

		Calendar c = Calendar.getInstance();
		System.out.println("Tháng hiện tại có: " + c.getActualMaximum(Calendar.DAY_OF_MONTH) + " ngày");
	}

	private static void showNewYorkTime() {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
		TimeZone NewYorkTime = TimeZone.getTimeZone("US/Eastern");
		df.setTimeZone(NewYorkTime);
		Calendar c = Calendar.getInstance(NewYorkTime);
		Date date = c.getTime();
		String stringDate = df.format(date);

		System.out.println("Ngày/tháng/năm giờ:phút:giây tại NewYork: " + stringDate);

	}

	private static String convertDateToString(Calendar c) {
		Date date = c.getTime();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		return df.format(date);

	}

	private static String convertTimeToString(Calendar c) {
		Date date = c.getTime();
		DateFormat df = new SimpleDateFormat("hh:mm:ss a");
		return df.format(date);
	}
}
