package BT1;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import utils.DateUtils;

public class BT1 {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the start Dating :  ");

		String date = scanner.next();
		Date start = null;
		start = DateUtils.to(date);

		Calendar now = Calendar.getInstance();	
		Calendar startTest = DateUtils.to(start) ;

		WeekDay[] wdEnums = WeekDay.values();

		Calendar dayOfWeek = DateUtils.to(start);
	    int dayOfW = dayOfWeek.get(Calendar.DAY_OF_WEEK);
		System.out.println(DateUtils.format(startTest) + " is a: " + wdEnums[dayOfW-1]);
	 
		if(startTest.after(now)) {
			throw new IllegalArgumentException("start time cannot exceed current time !");
		}
	
		long startAsMillisecond = startTest.getTimeInMillis();
		long nowAsMilliseconds = now.getTimeInMillis();
		
		long duration = nowAsMilliseconds - startAsMillisecond;
		
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		duration = duration - TimeUnit.DAYS.toMillis(days);
		
		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		duration = duration - TimeUnit.HOURS.toMillis(hours);
		
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		duration = duration - TimeUnit.MINUTES.toMillis(minutes);
		
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		duration = duration - TimeUnit.SECONDS.toMillis(seconds);
		
		
		System.out.println("The Love has begun : "+days+ " Day   " + hours +" H   "+ minutes + " M   "+seconds +" s  ");
	}

}
