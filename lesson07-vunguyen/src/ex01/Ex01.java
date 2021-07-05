package ex01;

import utils.DateTimeUtils;

import java.time.*;
import java.time.format.DateTimeParseException;

public class Ex01 {
    public static void main(String[] args) {
        System.out.println("==== The Ultimate Relationship Calculator ====");
        LocalDateTime startDateTime = inputDateTime("start ");
        int option = Ex01Utils.selectOption("Did you guys break up?");
        LocalDateTime endDateTime = null;
        if (option == 1) {
            endDateTime = inputDateTime("break up ");
        } else {
            endDateTime = LocalDateTime.now();
        }
        System.out.println("The weekday you started dating was " + startDateTime.getDayOfWeek());

        LocalDate startDate = startDateTime.toLocalDate();
        LocalDate endDate = endDateTime.toLocalDate();
        LocalTime startTime = startDateTime.toLocalTime();
        LocalTime endTime = endDateTime.toLocalTime();
        Period period = Period.between(startDate, endDate);
        Duration duration = Duration.between(startTime, endTime);
        if (startTime.isAfter(endTime)) {
            period = period.minusDays(1);
            duration = duration.plusDays(1);
        }
        System.out.println("You guys " + ((option == 1) ? "had" : "have") + " been together for "
                + period.getYears() + " year(s), "
                + period.getMonths() + " month(s), "
                + period.getDays() + " day(s), "
                + duration.toHoursPart() + " hour(s), "
                + duration.toMinutesPart() + " minute(s), "
                + duration.toSecondsPart() + " second(s) ");
    }

    private static LocalDateTime inputDateTime(String s) {
        LocalDate date = DateTimeUtils.inputLocalDate("start ");
        // Input time, if don't, create default time at midnight
        LocalTime time = null;
        int option = Ex01Utils.selectOption("Do you know specific time?");
        if (option == 1) {
            while (true) {
                try {
                    System.out.println("Input " + s + "time: ");
                    String inputString = DateTimeUtils.scanner.nextLine();
                    time = LocalTime.parse(inputString);
                    break;
                } catch (DateTimeParseException e) {
                    System.out.println("Invalid time format!");
                    System.out.println("Valid time format is HH:mm:ss Ex: 02:06:45");
                }
            }
        } else {
            System.out.println("Set " + s + "time at midnight");
            time = LocalTime.MIDNIGHT;
        }
        return LocalDateTime.of(date, time);
    }
}
