package ex02;

import utils.DateTimeUtils;

import java.util.Calendar;

public class Ex02Java07 {
    public enum DayOfWeek {
        Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
    }

    public enum Month {
        January, February, March, April, May, June, July, August, September, October, November, December
    }

    public static void main(String[] args) {
        Calendar calendar = DateTimeUtils.inputCalendar("");

        // count day
        // weekday begin with Sun = 1
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        DayOfWeek[] dayOfWeeks = DayOfWeek.values();
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);

        // count weekday
        int[] weekdayInMonth = countNumberOfWeekdaysInMonth(calendar);
        int[] weekdayInYear = countNumberOfWeekdaysInYear(calendar);

        // count week
        int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);
        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);

        // count month
        // month begin with Jan = 0
        int monthOfYear = calendar.get(Calendar.MONTH);
        Month[] months = Month.values();

        int year = calendar.get(Calendar.YEAR);

        int lengthOfYear = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
        int lengthOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        System.out.println(dayOfMonth + " " + months[monthOfYear] + " " + year + " is a " + dayOfWeeks[dayOfWeek - 1]);
        System.out.println("Additional facts");
        System.out.println("- It is day number " + dayOfYear + " of the year, " + (lengthOfYear - dayOfYear) + " days left");
        System.out.println("- It is " + dayOfWeeks[dayOfWeek - 1] + " number " + weekdayInYear[0] + " out of " + weekdayInYear[1] + " in " + year);
        System.out.println("- It is " + dayOfWeeks[dayOfWeek - 1] + " number " + weekdayInMonth[0] + " out of " + weekdayInMonth[1] + " in " + months[monthOfYear] + " " + year);
        System.out.println("- Year " + year + " has " + lengthOfYear + " days");
        System.out.println("- " + months[monthOfYear] + " " + year + " has " + lengthOfMonth + " days");
    }

    // count weekday in month
    // int[0] is weekday of month
    // int[1] is number of weekday in month
    private static int[] countNumberOfWeekdaysInMonth(Calendar calendar) {
        int[] weekdaysInMonth = new int[2];
        Calendar startDate = Calendar.getInstance();
        startDate.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), 1);
        Calendar endDate = Calendar.getInstance();
        endDate.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        int count = 0;
        while (!startDate.after(endDate)) {
            if (startDate.get(Calendar.DAY_OF_WEEK) == calendar.get(Calendar.DAY_OF_WEEK)) {
                count++;
                if (startDate.get(Calendar.DAY_OF_MONTH) == calendar.get(Calendar.DAY_OF_MONTH)) {
                    weekdaysInMonth[0] = count;
                }
            }
            startDate.add(Calendar.DAY_OF_MONTH, 1);
        }
        weekdaysInMonth[1] = count;
        return weekdaysInMonth;
    }

    // count weekdays in year
    // int[0] is weekday of year
    // int[1] is number of weekday in year
    private static int[] countNumberOfWeekdaysInYear(Calendar calendar) {
        int[] weekdaysInYear = new int[2];
        Calendar startDate = Calendar.getInstance();
        startDate.set(calendar.get(Calendar.YEAR), Calendar.JANUARY, 1);
        Calendar endDate = Calendar.getInstance();
        endDate.set(calendar.get(Calendar.YEAR), Calendar.DECEMBER, 31);
        int count = 0;
        while (!startDate.after(endDate)) {
            if (startDate.get(Calendar.DAY_OF_WEEK) == calendar.get(Calendar.DAY_OF_WEEK)) {
                count++;
                if (startDate.get(Calendar.DAY_OF_YEAR) == calendar.get(Calendar.DAY_OF_YEAR)) {
                    weekdaysInYear[0] = count;
                }
            }
            startDate.add(Calendar.DAY_OF_YEAR, 1);
        }
        weekdaysInYear[1] = count;
        return weekdaysInYear;

    }
}
