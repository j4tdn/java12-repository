package localdatetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class Ex01 {
	private static String PARTTERN = "dd/MM/yyyy";
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalDate anotherdate = LocalDate.of(2018, Month.JULY, 20);
		
		System.out.println("date: " + date);
		System.out.println("Anotherdate: " + anotherdate);
		
		//format -parse
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(PARTTERN);
		System.out.println("format: " + dtf.format(date));
		
		// ::before : CHILD
		TemporalAccessor ta = dtf.parse("12/12/2018");
		// ::after  : PARENT
		
		LocalDate parsed  = LocalDate.parse("2020-02-25");
		System.out.println("parsed: " +parsed);
		
		//duration
		Period period = Period.between(date, anotherdate);
		System.out.println("period: " +period);
		
		System.out.println(period.getYears() + "years" 
							+ period.getMonths() + "months"
							+ period.getDays() + "days");
	}
}
