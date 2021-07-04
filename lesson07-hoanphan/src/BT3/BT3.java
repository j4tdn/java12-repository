package BT3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import BT1.WeekDay;
import utils.DateUtils;

public class BT3 {
	private static final String DDMMYYYY = "dd/MM/YYYY";
	private static DateFormat df = new SimpleDateFormat(DDMMYYYY);
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		TimeZone tzBerlin = TimeZone.getTimeZone("Europe/Berlin");
		
		Calendar c = Calendar.getInstance(tzBerlin);
			
			
		System.out.println("dateTime berlin: " + DateUtils.format(c, tzBerlin));
		
		System.out.println("Last date of Month: " + c.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		c.add(Calendar.DAY_OF_MONTH,c.getFirstDayOfWeek() -  c.get(Calendar.DAY_OF_WEEK));
		System.out.println("First date of Week " +df.format(c.getTime()));
		
		c.add(Calendar.DAY_OF_MONTH,c.getFirstDayOfWeek() -  c.get(Calendar.DAY_OF_WEEK)+6);
		System.out.println("Last date of Week " +df.format(c.getTime()));

		int weekOfYear = c.get(Calendar.WEEK_OF_YEAR);
		System.out.println("Week of Year " + weekOfYear);
		
		c = Calendar.getInstance(tzBerlin);
		
		c.add(Calendar.DATE,20);
		System.out.println("After 20 day dateTime berlin: " + DateUtils.format(c));
		
		WeekDay[] wdEnums = WeekDay.values();
		
	    int dayOfW = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("on "+wdEnums[dayOfW-1]);
		
		
		System.out.println("Enter the Day Of Birth :  ");

		String date = scanner.next();
		Date start = null;
		start = DateUtils.to(date);

		Calendar now = Calendar.getInstance();	
		Calendar startTest = DateUtils.to(start) ;
		
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
		
		System.out.println("You has lived : "+days+ " Day   " + hours +" H   "+ minutes + " M   "+seconds +" s  ");
		
	}
}
