package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Ex03 {
	public static void main(String[] args) {
		LocalDateTime datetime = LocalDateTime.now();
		LocalDateTime anotherDateime = LocalDateTime.of(2021, 7, 30, 16, 19, 19);

		System.out.println("dateTime: " + datetime);
		System.out.println("anothe dateTime: " + anotherDateime);

		if (datetime.isAfter(anotherDateime)) {
			System.out.println("Start time can't exceed end time!");
			return;
		}

		LocalDate dateStart = datetime.toLocalDate();
		LocalTime timeStart = datetime.toLocalTime();

		LocalDate dateEnd = anotherDateime.toLocalDate();
		LocalTime timeEnd = anotherDateime.toLocalTime();

		Period period = Period.between(dateStart, dateEnd);
		Duration duration = Duration.between(timeStart, timeEnd);

		if (timeStart.isAfter(timeEnd)) {  //timeStar>timeEnd
			duration = duration.plusDays(1); 
			period = period.minusDays(1);
		}

		System.out.println(period + " / " + duration);
		System.out.println(period.getYears() + " year " + period.getMonths() + " month " + period.getDays() + "day  / "
				+ duration.toHoursPart() + " hour " + duration.toMinutesPart()+ " minute " + duration.toSecondsPart()+ " seconds ");

	}
}
