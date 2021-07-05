package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Calendar;
import java.util.Scanner;

public final class DateTimeUtils {
    public static Scanner scanner = new Scanner(System.in);
    private static final String DATE_PATTERN = "dd/MM/yyyy";

    private DateTimeUtils() {
    }

    public static LocalDate inputLocalDate(String s) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(DATE_PATTERN);
        LocalDate date = null;
        while (true) {
            try {
                System.out.println("Input " + s + "date: ");
                String inputString = DateTimeUtils.scanner.nextLine();
                date = LocalDate.parse(inputString, dateFormatter);
                break;
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format!");
                System.out.println("Valid date format is dd/MM/yyyy Ex: 02/09/2020");
            }
        }
        return date;
    }

    public static Calendar inputCalendar(String s) {
        // Calendar shouldn't null
        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat(DATE_PATTERN);
        while (true) {
            try {
                System.out.println("Input " + s + "date: ");
                String inputString = DateTimeUtils.scanner.nextLine();
                calendar.setTime(dateFormat.parse(inputString));
                break;
            } catch (ParseException e) {
                System.out.println("Invalid date format!");
                System.out.println("Valid date format is dd/MM/yyyy Ex: 02/09/2020");
            }
        }
        return calendar;
    }
}
