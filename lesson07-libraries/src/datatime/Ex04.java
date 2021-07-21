package datatime;

import utils.DateUtils;

import java.util.Calendar;

public class Ex04 {
    public static void main(String[] args) {
        Calendar c1 = Calendar.getInstance();
        c1.set(2021, Calendar.JUNE, 1, 5, 5, 5); // 18:20:02:125
        c1.set(Calendar.MILLISECOND, 50);

        Calendar c2 = Calendar.getInstance();
        c2.set(2021, Calendar.JUNE, 1, 5, 5, 5); // 18:20:02:126
        c2.set(Calendar.MILLISECOND, 51);

        System.out.println(c1);
        System.out.println(c2);

        System.out.println("c1 c2: " + c1.before(c2));

        // Count number of Sunday(s) in this month
        countNofSundays(Calendar.JUNE, 2021);

        // !> <=> <=
    }

    // month:3 & year:2018
    private static int countNofSundays(int month, int year) {
        int count = 0;

        Calendar start = Calendar.getInstance(); // 28.06.2021
        start.set(year, month, 1); // 01.06.2021

        Calendar end = Calendar.getInstance(); // 28.06.2021
        end.set(year, month, start.getActualMaximum(Calendar.DAY_OF_MONTH)); // 30.06.2018

        for (Calendar date = start; !date.after(end); date.add(Calendar.DAY_OF_MONTH, 1)) {
            if (date.get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY) {
                System.out.println(DateUtils.format(date));
                count++;
            }
        }

        return count;
    }
}
