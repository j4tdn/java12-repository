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
		LocalDate anotherDate = LocalDate.of(2021, 9, 30);
		System.out.println(date);
		System.out.println(anotherDate);
		
		//format - parse
		DateTimeFormatter dft = DateTimeFormatter.ofPattern(PARTTERN);
		System.out.println("format: "+dft.format(date));
		
		LocalDate parsed = LocalDate.parse("25/02/2020",dft);
		System.out.println("parsed: "+parsed);
		
		//duration
		Period period = Period.between(date, anotherDate);
		System.out.println("period: "+period);
		
		System.out.println(period.getYears()+" year \n"+
		                   period.getMonths()+ " month \n"+
							period.getDays()+" day");

	}
}
