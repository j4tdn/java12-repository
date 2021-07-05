package ex03;

import utils.DateTimeUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.WeekFields;
import java.util.Locale;
import java.util.Scanner;

public class Ex03Java08 {
    private static final String DATETIME_PATTERN = "dd/MMM/yyyy HH:mm:ss";
    private static final String DATE_PATTERN = "dd/MM/yyyy";
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int chosen = 0;
        while (true) {
            chosen = menu();
            switch (chosen) {
                case 1:
                    method1();
                    break;
                case 2:
                    method2();
                    break;
                case 3:
                    method3();
                    break;
                case 4:
                    method4();
                    break;
                case 5:
                    method5();
                    break;
                case 6:
                    method6();
                    break;
                case 7:
                    return;
            }
        }
    }

    private static int menu() {
        System.out.println("==== APP ====");
        System.out.println("1. Show current time at any area");
        System.out.println("2. Show the last day of the current month");
        System.out.println("3. Show the fist and the last of the current week");
        System.out.println("4. Show what week the current day is in");
        System.out.println("5. Show the day and weekday after 20 days");
        System.out.println("6. Enter your date of birth. Show how many days you have lived");
        System.out.println("7. Quit");
        int chosen = 0;
        while (true) {
            try {
                System.out.println("Chose: ");
                chosen = Integer.parseInt(scanner.nextLine());
                if (chosen < 1 || chosen > 7) {
                    throw new IllegalArgumentException();
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid option");
            }
        }
        return chosen;
    }

    private static void method1() {
        // LocalDateTime is A date-time without a time-zone
        // =>> DateTimeFormatter dont change time in LocalDateTime
        // withZone() show time-zone when PATTERN has z (dd/MMM/yyy HH:mm:ss z)
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(DATETIME_PATTERN);

        LocalDateTime dateTime = LocalDateTime.now(ZoneId.of("Japan"));
        System.out.println(dateTime.format(dateTimeFormatter) + " at Japan");
    }

    private static void method2() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(DATE_PATTERN);
        LocalDate date = LocalDate.now();
        date = date.withDayOfMonth(date.lengthOfMonth());
        System.out.println("Last day of current month is " + date.format(dateTimeFormatter));
    }

    // fistDayOfWeek change according to Locale
    private static void method3() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(DATE_PATTERN);
        LocalDate date = LocalDate.now().with(TemporalAdjusters.previousOrSame(WeekFields.of(Locale.getDefault()).getFirstDayOfWeek()));
        System.out.println("First day of week: " + date.format(dateTimeFormatter));
        date = date.plusDays(6);
        System.out.println("Last day of week: " + date.format(dateTimeFormatter));
    }

    private static void method4() {
        LocalDate date = LocalDate.now();
        int weekOfYear = date.get(WeekFields.of(Locale.getDefault()).weekOfWeekBasedYear());
        System.out.println("Current day is in week " + weekOfYear + " of the year");
    }

    private static void method5() {
        LocalDate date = LocalDate.now();
        date = date.plusDays(20);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(DATE_PATTERN);
        System.out.println("After 20 days, the day is " + date.format(dateFormatter));
        System.out.println("The weekday is " + date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault()));
    }

    private static void method6() {
        LocalDate date = null;
        while (true) {
            try {
                date = DateTimeUtils.inputLocalDate("your birth");
                if (date.isAfter(LocalDate.now())) {
                    throw new IllegalArgumentException();
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Your birthday can't exceed current date");
            }
        }
        Period period = Period.between(date, LocalDate.now());
        System.out.println("You have lived for "
                + period.getYears() + " year(s), "
                + period.getMonths() + " month(s), "
                + period.getDays() + " day(s)");
    }
}

