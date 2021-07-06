package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Ex03 {
	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now();
		LocalDateTime adt = LocalDateTime.of(2022, 6, 30, 22, 58, 58);
	
		System.out.println("datetime : "+ dt);
		System.out.println("another date time : " + adt);
		
		if(dt.isAfter(adt)) {
			System.out.println("start time cannot exceed end time !");
			return;
		}
		
		LocalDate ld = dt.toLocalDate();
		LocalTime lt = dt.toLocalTime();
		
		LocalDate ald = adt.toLocalDate();
		LocalTime alt = adt.toLocalTime();
		
		Period period = Period.between(ld, ald);
		Duration duration = Duration.between(lt, alt);
		
		if(lt.isAfter(alt)) {
			duration = duration.plusDays(1);
			period = period.plusDays(1);
		}
		
		System.out.println(period +"-T-"+ duration);
	}
}
