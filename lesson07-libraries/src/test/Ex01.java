package test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class Ex01 {
	public static void main(String[] args) {
		LocalDate ld = LocalDate.now(); // just date
		LocalTime lt = LocalTime.now(); // just time
		LocalDateTime ldt = LocalDateTime.now(); // both date and time
		System.out.println("local date now : " + ld);
		System.out.println("local time now : " + lt);
		System.out.println("local date time now : " + ldt);

		// create object
		System.out.println("\n===========create object===========");
		LocalDate localDate = LocalDate.of(2021, Month.JUNE, 25);
		LocalTime localTime = LocalTime.of(8, 20, 20);
		LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
		System.out.println("local date : " + localDate);
		System.out.println("local time : " + localTime);
		System.out.println("local date time : " + localDateTime);

		// create object from String
		System.out.println("\n=========create object from string=============");
		LocalDate localDateFromString = LocalDate.parse("2021-05-05");
		System.out.println("local date from string : " + localDateFromString);

		// adjust object
		System.out.println("\n========adjust object==========");
		LocalDate ld2 = LocalDate.of(2015, 10, 31);
		System.out.println(ld2.withMonth(2));

		LocalTime lt2 = LocalTime.now();
		System.out.println(lt2.withHour(18));
//		System.out.println(lt2.withHour(25)); //DateTimeException

		// get value
		System.out.println("\n=========get value=========");
		System.out.println(localDateTime.getYear());
		System.out.println(localDateTime.getMonth()); // get name
		System.out.println(localDateTime.getMonthValue()); // get index
		System.out.println(localDateTime.getDayOfYear());
		System.out.println(localDateTime.getDayOfMonth());
		System.out.println(localDateTime.getDayOfWeek());
		System.out.println(localDateTime.getHour());
		System.out.println(localDateTime.getMinute());
		System.out.println(localDateTime.getSecond());

		// compare
		System.out.println("\n==========compare===========");
		LocalDate teacherDay = LocalDate.of(2021, 11, 20);
		if (teacherDay.isBefore(LocalDate.now())) {
			System.out.println("Teacher's day is before today!");
		}
		if (teacherDay.isAfter(LocalDate.now())) {
			System.out.println("Teacher's day is after today!");
		}
		System.out.println(teacherDay.compareTo(LocalDate.now()));

		// add or subtract
		System.out.println("\n============add or subtract ==========");
		LocalDateTime currentDateTime = LocalDateTime.now();
		LocalDateTime newDateTime1 = currentDateTime.plusWeeks(3);
		LocalDateTime newDateTime2 = currentDateTime.plus(3, ChronoUnit.WEEKS);
		//ChronoUnit : enumeration available specify the unit of time
		System.out.println(newDateTime1);
		System.out.println(newDateTime1);
		
		LocalTime currentTime = LocalTime.now();
		LocalTime newTime = currentTime.minusHours(1);
		System.out.println(newTime);

		//format 
		System.out.println("\n==========format output date, time ===========");
		LocalDateTime ldt1 = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		//FormatStyle : enumeration available that define style format
		String dtff = dtf.format(ldt1);
		System.out.println(dtff);
	}
}
