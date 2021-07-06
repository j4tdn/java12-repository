package utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class DateTimeUtils {
	private static final String PATTERN = "dd/MM/yyyy HH:mm:ss";

	public static String dateToString(LocalDateTime dt) {
		Objects.requireNonNull(dt);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(PATTERN);
		String dateTime = dtf.format(dt);
		return dateTime;
	}

}
