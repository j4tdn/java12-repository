package datetime;

import java.util.Calendar;
import java.util.Date;

public class Ex01 {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("date: " + date);

		Calendar c = Calendar.getInstance();
		//System.out.println("c: " + c);

		int day = c.get(Calendar.DAY_OF_WEEK);
		int month = c.get(Calendar.MONTH)+1;
		int year = c.get(Calendar.YEAR);
		int hour=c.get(Calendar.HOUR);
		int minute=c.get(Calendar.MINUTE);
		int ap=c.get(Calendar.AM_PM);
		int second=c.get(Calendar.SECOND);
		System.out.println(day + "/" + month + "/" + year);
		System.out.println(hour+":"+minute+":"+second+":"+(ap==1?"pm":"am"));
		
		int dayOfWeek=c.get(Calendar.DAY_OF_WEEK);
		int weekOfMonth=c.get(Calendar.WEEK_OF_MONTH);
		int weekOfYear=c.get(Calendar.WEEK_OF_YEAR);
		
		System.out.println("dayOfWeek: "+dayOfWeek);
	}

}
