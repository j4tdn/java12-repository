package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Ex03 {

	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.now();
		LocalDateTime anotherDateTime = LocalDateTime.of(2022, 7, 30, 22, 58, 58);
		
		System.out.println("dateTime: " +dateTime);
		System.out.println("anotherDateTime: " +anotherDateTime);
		
		
		if(dateTime.isAfter(anotherDateTime)) {
			System.out.println("start time can not exceed end time !");
			return;
		}
		
		LocalDate dateStart = dateTime.toLocalDate();
		LocalTime timeStart = dateTime.toLocalTime();
		
		LocalDate dateEnd = anotherDateTime.toLocalDate();
		LocalTime timeEnd = anotherDateTime.toLocalTime();

		Period period = Period.between(dateStart, dateEnd);
		Duration duration = Duration.between(timeStart, timeEnd);
		
		if(timeStart.isAfter(timeEnd)) {
			duration = duration.plusDays(1);
			period =  period.plusDays(1);
		}
		System.out.println(period+ " <T> "+ duration);
		
		

	}
}
