package ex02;

import java.time.DayOfWeek;
import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;

import utils.DateUtils;

public class Ex02_JV08 {
	private static final String PATTERN = "dd/MM/yyyy";
	static DateTimeFormatter dtf = DateTimeFormatter.ofPattern(PATTERN);

	public static void main(String[] args) {

		System.out.println("Enter the date - dd/MM/yyy: ");
		String dateString = DateUtils.sc.nextLine();
		LocalDate date = LocalDate.parse(dateString, dtf);

		System.out.println(dtf.format(date) + " is " + date.getDayOfWeek());

		System.out.println("- Additional facts: ");

		System.out.println("+ It's day number " + date.getDayOfYear() + " of the year, "
				+ (date.lengthOfYear() - date.getDayOfYear()) + " day left");

		System.out.println("+ " + date.getMonth() + " " + date.getYear() + " Has " + date.lengthOfMonth() + " days.");

		System.out.println("+ " + date.getYear() + " Has " + date.lengthOfYear() + " days");

		countWeekDayOccurenceInMonth(date);

		test(date);
	}

	public static void countWeekDayOccurenceInMonth(LocalDate date) {
		LocalDate start = date.withDayOfMonth(1);
		// LocalDate end = date.withDayOfMonth(date.lengthOfMonth());
		int sumOfWeekdays = 0;
		int curruntWeekday = 0;
		for (int i = 0; i < date.lengthOfMonth(); i++) {
			if (date.getDayOfWeek().equals(start.getDayOfWeek())) {
				sumOfWeekdays++;
				if (!start.isAfter(date)) {
					curruntWeekday++;
				}
			}
			start = start.plusDays(1);
		}
		System.out.println("+ It's " + date.getDayOfWeek() + " number " + curruntWeekday + " out of " + sumOfWeekdays
				+ " in " + date.getMonth() + " " + date.getYear());
	}


	static void test(LocalDate date) {
		int SumOfWeekdayInYear = 0;
		int CurrentWeekdayInYear = 0;
		LocalDate firstdayOfYear = LocalDate.of(date.getYear(), 1, 1);
		LocalDate lastDayOfYear = LocalDate.of(date.getYear(), 12, 31);

		// Get first weekday = date.getdateOfWeek() in year
		LocalDate dayOfWeek = firstdayOfYear.with(TemporalAdjusters.nextOrSame(date.getDayOfWeek()));
		System.out.println("first dayofweek: " + dtf.format(dayOfWeek));
		while (!dayOfWeek.isAfter(lastDayOfYear)) {
			SumOfWeekdayInYear++;
			if (!dayOfWeek.isAfter(date)) {
				CurrentWeekdayInYear++;
			}
			dayOfWeek = dayOfWeek.plusWeeks(1);

		}

		System.out.println("+ It's " + date.getDayOfWeek() + " number of " + CurrentWeekdayInYear + " out of "
				+ SumOfWeekdayInYear + " in " + date.getYear());

	}

}
