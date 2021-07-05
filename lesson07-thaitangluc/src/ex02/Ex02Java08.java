package ex02;

import java.time.LocalDate;
import java.util.Scanner;

import utils.DateUtils;

public class Ex02Java08 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Day/Month/Year");
		String date = ip.nextLine();
		LocalDate dateTime = DateUtils.toDate(date);
		System.out.println(dateTime);
		System.out.println(dateTime.getDayOfMonth() + " " + dateTime.getMonth() + " " + dateTime.getYear() + " is a " + dateTime.getDayOfWeek());
		System.out.println("Additional facts");
		int dayLeft = dateTime.lengthOfYear() - dateTime.getDayOfYear();
		System.out.println("It is a day number " + dateTime.getDayOfYear() + " of the year, " + dayLeft + " days left.");
		numberWeekdaysOfYear(dateTime);
		numberWeekdaysOfMonth(dateTime);
		System.out.println("Year " + dateTime.getYear() + " has " + dateTime.lengthOfYear() + " days");
		System.out.println(dateTime.getMonth() + " " + dateTime.getYear() + " has " + dateTime.lengthOfMonth() + " days");
	}
	
	private static void numberWeekdaysOfYear(LocalDate date) {
		int count = 0;
		int weekdays = 0;
		LocalDate date2 = date.withDayOfYear(1);
		while(date2.getDayOfWeek()!=date.getDayOfWeek()) {
			date2 = date2.plusDays(1);
		}
		weekdays = (date.lengthOfYear() - date2.getDayOfYear() ) / 7 + 1;
		while(date2.getDayOfYear()<=date.getDayOfYear()) {
			count++;
			date2 = date2.plusDays(7);
		}
		System.out.println("It is " + date.getDayOfWeek() + " number " + count + " out of " + weekdays + " in " + date.getYear());
	}
	
	private static void numberWeekdaysOfMonth(LocalDate date) {
		int count = 1;
		int weekdays = 0;
		LocalDate date2 = date.withDayOfMonth(1);
		while(date2.getDayOfWeek()!=date.getDayOfWeek()) {
			date2 = date2.plusDays(1);
		}
		weekdays = (date.lengthOfMonth() - date2.getDayOfMonth())/7 + 1;
		while(date2.getDayOfMonth()!=date.getDayOfMonth()) {
			count++;
			date2 = date2.plusDays(7);
		}
		System.out.println("It is " + date.getDayOfWeek() + " number " + count + " out of " + weekdays + " in " + date.getMonth() + " "+ date.getYear());
	}
	
	
}
