package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import utils.DateUtils;

public class Ex05 {
	public static void main(String[] args) {
		Calendar start = Calendar.getInstance();
		start.set(2021, Calendar.JUNE, 25, 23, 30);
		System.out.println(DateUtils.format(start));
		
		Calendar now = Calendar.getInstance();
		System.out.println(DateUtils.format(now));
		
		if(start.after(now)) {
			throw new IllegalArgumentException("start time cannot exceed now !");
		}
		
		//calc duration in millis
		long duration = now.getTimeInMillis() - start.getTimeInMillis();
		
		//covert millis to time
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		duration = duration - TimeUnit.DAYS.toMillis(days);
		
		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		duration = duration - TimeUnit.HOURS.toMillis(hours);
		
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		duration = duration - TimeUnit.MINUTES.toMillis(minutes);
		
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
	
		System.out.println(days + "days " + hours + "hours "+minutes + "minutes "+ seconds + "seconds ");
	}
}
