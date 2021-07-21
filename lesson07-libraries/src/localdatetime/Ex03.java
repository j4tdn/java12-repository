package localdatetime;

import java.time.*;

public class Ex03 {
    public static void main(String[] args) {
        LocalDateTime datetime = LocalDateTime.now();
        LocalDateTime anotherDatetime = LocalDateTime.of(2022, 7, 30, 19, 58, 58);

        System.out.println("datetime: " + datetime);
        System.out.println("anotherDatetime: " + anotherDatetime);

        if (datetime.isAfter(anotherDatetime)) {
            System.out.println("start time cannot exceed end time !");
            return;
        }

        LocalDate dateStart = datetime.toLocalDate();
        LocalTime timeStart = datetime.toLocalTime();

        LocalDate dateEnd = anotherDatetime.toLocalDate();
        LocalTime timeEnd = anotherDatetime.toLocalTime();

        Period period = Period.between(dateStart, dateEnd);
        Duration duration = Duration.between(timeStart, timeEnd);

        if (timeStart.isAfter(timeEnd)) {
            duration = duration.plusDays(1);
            period = period.minusDays(1);
        }

        System.out.println(period + "<T>" + duration);
    }
}
