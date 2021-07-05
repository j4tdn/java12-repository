package utils;

import ex01.Ex01Utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public final class DateTimeUtils {
    private static final String DATE_PATTERN = "dd/MM/yyyy";

    private DateTimeUtils() {
    }

    public static LocalDate inputDate(String s) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(DATE_PATTERN);
        LocalDate date = null;
        while (true) {
            try {
                System.out.println("Input " + s + "date: ");
                String inputString = Ex01Utils.scanner.nextLine();
                date = LocalDate.parse(inputString, dateFormatter);
                break;
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format!");
                System.out.println("Valid date format is dd/MM/yyyy Ex: 02/09/2020");
            }
        }
        return date;
    }
}
