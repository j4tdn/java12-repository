package datetime;

import java.util.Calendar;
import java.util.Date;

public class Ex01 {
	 public static void main(String[] args) {
		//Date, Calendar >> Epoch time:1.1.1970
		 
		 Date date = new Date();
		 System.out.println("date: " + date);
		 
		 Calendar c = Calendar.getInstance();
		 c.set(Calendar.HOUR_OF_DAY, 20);
		 System.out.println("c" +c);
		 
		 int day =  c.get(Calendar.DAY_OF_MONTH);
		 int ap=c.get(Calendar.AM_PM);
		 int month = c.get(Calendar.MONTH);
		 int year = c.get(Calendar.YEAR);
		 
		 int hour = c.get(Calendar.HOUR);
		 int minute = c.get(Calendar.MINUTE);
		 int second = c.get(Calendar.SECOND);
		 System.out.println(day + "/" + month + "/" + year);
		 System.out.println(hour + ":" + minute + ":"+second + " " + (ap==1?"pm":"am"));
		 
		 int dayofWeek =c.get(Calendar.DAY_OF_WEEK);
		 
		 String[] weekdays = {"SUN","MON","TUE","WED", "THUR","FRI","SAT"};

		 System.out.println("Dayofweek: " + weekdays[dayofWeek-1]);
	}
}
