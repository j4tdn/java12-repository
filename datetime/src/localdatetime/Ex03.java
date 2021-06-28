package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Ex03 {
	public static void main(String[] args) {
		LocalDateTime datetime = LocalDateTime.now();
		LocalDateTime anotherDateTime = LocalDateTime.of(2021, 6,30,22,58,58);
		
		System.out.println(datetime);
		System.out.println(anotherDateTime);
		
		if(datetime.isAfter(anotherDateTime)){
			System.out.println("start time cannot exceed end time!");
			return;
		}
		
		LocalDate dateStart = datetime.toLocalDate();
		LocalTime timeStart =datetime.toLocalTime();
		
		LocalDate dateEnd = anotherDateTime.toLocalDate();
		LocalTime timeEnd = anotherDateTime.toLocalTime();
		
		Period period =Period.between(dateStart, dateEnd);
		Duration duration = Duration.between(timeStart, timeEnd);
		
		if(timeStart.isAfter(timeEnd)) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		System.out.println(period + " - T - "  + duration);
		
	}
}
