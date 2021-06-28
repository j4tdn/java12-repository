package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import utils.DateUtils;

public class Ex06 {
	public static void main(String[] args) {
		Calendar start = DateUtils.getDateTime(2021, Calendar.JUNE, 22, 20, 18, 12);
		Calendar now = Calendar.getInstance();
		
		if (start.after(now)) {
			throw new IllegalArgumentException("start time cannot exceed current time!");
		}
		
		// epoch time = unix time = 1.1.1970 midnight
		long startAsMilliseconds = start.getTimeInMillis();
		long nowAsMilliseconds = now.getTimeInMillis();
		
		long duration = nowAsMilliseconds - startAsMilliseconds;
		
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		duration = duration - TimeUnit.DAYS.toMillis(days);
		
		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		duration = duration - TimeUnit.HOURS.toMillis(hours);
		
		long minute = TimeUnit.MILLISECONDS.toMinutes(duration);
		duration = duration - TimeUnit.MINUTES.toMillis(minute);
		
		long second = TimeUnit.MILLISECONDS.toSeconds(duration);
		duration = duration - TimeUnit.SECONDS.toMillis(second);
		
		System.out.println(days + "D " + hours + "H " + minute + "M " + second + "S");
	}
		
}
