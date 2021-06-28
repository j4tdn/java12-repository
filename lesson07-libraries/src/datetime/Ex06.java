package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import utils.DateUtils;

public class Ex06 {
	public static void main(String[] args) {
		Calendar start = DateUtils.getDateTime(1999, Calendar.JUNE, 10, 18, 18, 12);
		Calendar now = Calendar.getInstance();
		
		if(start.after(now)) {
			throw new IllegalArgumentException("start time cannot exceed current time !");
		}
		//epoch time = unix time = 1.1.1970 midnight
		long startAsMillisecond = start.getTimeInMillis();
		long nowAsMilliseconds = now.getTimeInMillis();
		
		long duration = nowAsMilliseconds - startAsMillisecond;
		System.out.println("------"+ duration+" ms -----------");
		
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		duration = duration - TimeUnit.DAYS.toMillis(days);
		
		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		duration = duration - TimeUnit.HOURS.toMillis(hours);
		
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		duration = duration - TimeUnit.MINUTES.toMillis(minutes);
		
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		duration = duration - TimeUnit.SECONDS.toMillis(seconds);
		
		System.out.println(days+ "D " + hours +"H "+ minutes + "M "+seconds +"s ");
	}
}
