package localdatetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex01 {
	private static String pattern="dd/MM/yyyy";
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		LocalDate anotherDate=LocalDate.of(2020,Month.JULY,1);
		
		
		System.out.println("Now : "+date);
		System.out.println("another date: "+anotherDate); 
		
		System.out.println("===========");
		
		//format-parse
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern(pattern);
		System.out.println("\nAfter format: "); 
		System.out.println("date: "+dtf.format(date));
		System.out.println("another date: "+dtf.format(anotherDate)); 
		
		
        //LocalDate parsed=LocalDate.parse("25/02/1998"); => sai
        //LocalDate parsed=LocalDate.parse("2020-02-25");
    	LocalDate parsed=LocalDate.parse("22/02/1998",dtf); //String to localDate
		System.out.println("parsed: "+parsed);
		
		System.out.println("===========");
		
		
		//period: khoảng cách giữa hai thời điểm
		Period period = Period.between(anotherDate,date) ;
		System.out.println("Period: "+period);
		System.out.println(period.getYears()+" year "+period.getMonths()+" month"+period.getDays()+" day \n");
	
	
	}
}
