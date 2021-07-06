package ex03;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.WeekFields;
import java.util.Locale;
import java.util.Scanner;

import utils.DateTimeUtils;
import utils.DateUtils;

public class Ex03Java08 {
	private static final Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		// locale: language - country
		// time-zone: GMT, UTC, Abbreviation(HSK, ITC), Area
		
		
		LocalDate date = LocalDate.now();
		int k;
		do {
			k = ip.nextInt();
			switch (k) {
			case 1: {
				String timezone = ip.nextLine();
				watchTime(timezone);
			}
			case 2: {
				System.out.println(lastDayOfMonth(date));
			}
			case 3: {
				firstLastDayofWeek(date);
			}
			case 4: {
				numberWeeksOfYear(date);
			}
			case 5:	{
				checkDay(date);
			}
			case 6: {
				checkDayOfBirth(date);
			}
			}
		} while (k!=0);
	
	}

	public static void watchTime(String tz) {
		LocalDateTime dt = LocalDateTime.now(ZoneId.of(tz));
		System.out.println(DateTimeUtils.dateToString(dt));
	}
	
	public static LocalDate lastDayOfMonth(LocalDate date) {
		date = date.withDayOfMonth(date.lengthOfMonth());
		return date;
	}
	
	public static void firstLastDayofWeek(LocalDate date) {
		date = date.plusDays(1 - date.getDayOfWeek().getValue());
		System.out.println("Ngay dau tien cua tuan: " + date);
		date = date.plusDays(6);
		System.out.println("Ngay cuoi cung cua tuan: " + date);
	}
	
	public static void numberWeeksOfYear(LocalDate date) {
		int weekOfYear = date.get(WeekFields.of(Locale.getDefault()).weekOfYear());
		System.out.println("Ngay hien tai thuoc tuan thu " + weekOfYear);
	}
	
	public static void checkDay(LocalDate date) {
		date = date.plusDays(20);
		System.out.println("Sau 20 ngay la ngay " + date + " " + DateUtils.getDayOfWeek(date));
	}
	
	public static void checkDayOfBirth(LocalDate date) {
		ip.next();
		String dateOfBirth = ip.nextLine();
		LocalDate dob = DateUtils.toDate(dateOfBirth);
		Period period = Period.between(dob, date);
		System.out.println("Ban song duoc " + period.getYears() + " nam, " + period.getMonths() + " thang, " + period.getDays() + " ngay.");
	}
}
