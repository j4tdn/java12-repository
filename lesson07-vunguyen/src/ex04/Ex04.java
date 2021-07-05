package ex04;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex04 {
    private static final String DATE_PATTERN = "dd/MM/yyy";
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(DATE_PATTERN);
        int year = 0;
        try {
            System.out.println("Enter year: ");
            year = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid year");
        }
        LocalDate date = LocalDate.of(year, 11, 27);
        System.out.println("Start date: " + date.format(dateFormatter));
        LocalDate tetStartDay = LocalDate.of(date.getYear(), 12, 29);
        int count = 0;
        while (count <= 110) {
            date = date.plusDays(1);
            if (date.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
                continue;
            }
            if (date.equals(tetStartDay)) {
                date = date.plusYears(1).withMonth(1).withDayOfMonth(5);
                continue;
            }
            count++;
        }
        System.out.println("End date: " + date.format(dateFormatter));
    }
}
