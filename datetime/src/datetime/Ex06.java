package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import utils.DateUtils;

public class Ex06 {
	public static void main(String[] args) throws IllegalAccessException {
		Calendar start = DateUtils.getDateTime(2020, Calendar.OCTOBER, 30, 20, 18, 12);
		Calendar now = Calendar.getInstance();
		if (start.after(now)) {
			throw new IllegalAccessException("start time cannot exceed current time!");
		}

		// epoch time = unix time = 1.1.1970 midnight;

		long startAsMilliseconds = start.getTimeInMillis();
		long nowAsMilliseconds = now.getTimeInMillis();

		long duration = nowAsMilliseconds - startAsMilliseconds;

//		long days = duration/(24*60*60*1000);
//		duration = duration - days*(24*60*60*1000);

		long days = TimeUnit.MILLISECONDS.toDays(duration);
		duration = duration - TimeUnit.DAYS.toMillis(days);
		
		long hour = TimeUnit.MICROSECONDS.toHours(duration);
		duration = duration - TimeUnit.HOURS.toMillis(hour);
		
		long minutes = TimeUnit.MICROSECONDS.toMinutes(duration);
		duration = duration - TimeUnit.MINUTES.toMillis(minutes);
		
		long seconds = TimeUnit.MICROSECONDS.toSeconds(duration);
		duration = duration - TimeUnit.SECONDS.toMillis(seconds);
		
		System.out.println(days + "D " +hour + "H " + minutes + "M " +seconds + "S ");

	}
}
