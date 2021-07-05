package ex02;

import utils.DateTimeUtils;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class Ex02Java08 {
    private static final Locale locale = new Locale("en", "us");

    public static void main(String[] args) {
        LocalDate date = DateTimeUtils.inputLocalDate("");

        // count day
        String dayOfWeek = date.getDayOfWeek().getDisplayName(TextStyle.FULL, locale);
        int dayOfMonth = date.getDayOfMonth();
        int dayOfYear = date.getDayOfYear();

        // count weekday
        int[] weekdayInMonth = countNumberOfWeekdaysInMonth(date);
        int[] weekdayInYear = countNumberOfWeekdaysInYear(date);

        // count week
        WeekFields weekFields = WeekFields.of(locale);
        int weekOfMonth = date.get(weekFields.weekOfMonth());
        int weekOfYear = date.get(weekFields.weekOfWeekBasedYear());

        // count month
        String monthOfYear = date.getMonth().getDisplayName(TextStyle.FULL, locale);

        int year = date.getYear();

        int lengthOfYear = date.lengthOfYear();
        int lengthOfMonth = date.lengthOfMonth();

        System.out.println(dayOfMonth + " " + monthOfYear + " " + year + " is a " + dayOfWeek);
        System.out.println("Additional facts");
        System.out.println("- It is day number " + dayOfYear + " of the year, " + (lengthOfYear - dayOfYear) + " days left");
        System.out.println("- It is " + dayOfWeek + " number " + weekdayInYear[0] + " out of " + weekdayInYear[1] + " in " + year);
        System.out.println("- It is " + dayOfWeek + " number " + weekdayInMonth[0] + " out of " + weekdayInMonth[1] + " in " + monthOfYear + " " + year);
        System.out.println("- Year " + year + " has " + lengthOfYear + " days");
        System.out.println("- " + monthOfYear + " " + year + " has " + lengthOfMonth + " days");
    }

    // count weekday in month
    // int[0] is weekday of month
    // int[1] is number of weekday in month
    private static int[] countNumberOfWeekdaysInMonth(LocalDate date) {
        int[] weekdaysInMonth = new int[2];
        LocalDate startDate = date.withDayOfMonth(1);
        LocalDate endDate = date.withDayOfMonth(date.lengthOfMonth());
        int count = 0;
        while (!startDate.isAfter(endDate)) {
            if (startDate.getDayOfWeek().equals(date.getDayOfWeek())) {
                count++;
                if (startDate.getDayOfMonth() == date.getDayOfMonth()) {
                    weekdaysInMonth[0] = count;
                }
            }
            startDate = startDate.plusDays(1);
        }
        weekdaysInMonth[1] = count;
        return weekdaysInMonth;
    }

    // count weekdays in year
    // int[0] is weekday of year
    // int[1] is number of weekday in year
    private static int[] countNumberOfWeekdaysInYear(LocalDate date) {
        int[] weekdaysInYear = new int[2];
        LocalDate startDate = date.withDayOfYear(1);
        LocalDate endDate = date.withDayOfYear(date.lengthOfYear());
        int count = 0;
        while (!startDate.isAfter(endDate)) {
            if (startDate.getDayOfWeek().equals(date.getDayOfWeek())) {
                count++;
                if (startDate.getDayOfYear() == date.getDayOfYear()) {
                    weekdaysInYear[0] = count;
                }
            }
            startDate = startDate.plusDays(1);
        }
        weekdaysInYear[1] = count;
        return weekdaysInYear;
    }
}

