package utils;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class DateUtils {
	private static final String PDATE = "dd/MM/yyyy";
	private static final String PTIME = "HH:mm:ss";

	public static LocalDate toDate(String s) {
		Objects.requireNonNull(s);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(PDATE);
		LocalDate date = LocalDate.parse(s, dtf);
		return date;
	}

	public static LocalTime toTime(String s) {
		Objects.requireNonNull(s);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(PTIME);
		LocalTime time = LocalTime.parse(s, dtf);
		return time;
	}

	public static String getDayOfWeek(LocalDate s) {
		switch (s.getDayOfWeek()) {
		case MONDAY: {
			return "Thu hai";
		}
		case TUESDAY: {
			return "Thu ba";
		}
		case WEDNESDAY: {
			return "Thu tu";
		}
		case THURSDAY: {
			return "Thu nam";
		}
		case FRIDAY: {
			return "Thu sau";
		}
		case SATURDAY: {
			return "Thu bay";
		}
		case SUNDAY: {
			return "Chu nhat";
		}
		}
		return "";
	}
}
