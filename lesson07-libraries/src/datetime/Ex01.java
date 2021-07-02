package datetime;

import java.util.Calendar;
import java.util.Date;

public class Ex01 {
	public static void main(String[] args) {
		//Date, calendar
		Date date=new Date();     //Lấy ngày hiện tại với Date
		System.out.println("date: "+date);
		
		Calendar c=Calendar.getInstance(); //Lấy ngày hiện tại với Calendar
		//c.set(Calendar.HOUR_OF_DAY, 20); Set giờ hiện tại là 20h
		System.out.println("C: "+c);
		
		System.out.println("==================================");
		
		int day=c.get(Calendar.DAY_OF_MONTH);
		//DayofMonth: 1,2,3,..29 
		//DayOfweek: Monday,tuesday,...
		int month= c.get(Calendar.MONTH)+1; //Tháng 1 của Calenda bắt đầu từ 0
		int year=c.get(Calendar.YEAR);
		
		int hour =c.get(Calendar.HOUR_OF_DAY);
//		int hourAP= c.get(Calendar.HOUR);
//		int ap = c.get(Calendar.AM_PM); //1: pm,0: am
		int minute =c.get(Calendar.MINUTE);
		int second =c.get(Calendar.SECOND);
		
		System.out.println(+day+"/"+month+"/"+year);
		System.out.println(hour+":"+minute+":"+second);
		
		System.out.println("==================================");
		
		String weekdays[]= {"Sun","Mon","Tues","Wed","Thurs","Friday","Sat"};
		Weekday[] weekdaysEnum=Weekday.values(); //Dùng enum
		
		int dayOfweek=c.get(Calendar.DAY_OF_WEEK );
		int dayOfMonth=c.get(Calendar.DAY_OF_MONTH);
		int dayOfYear=c.get(Calendar.DAY_OF_YEAR);
		System.out.println("\n Day of week: ("+dayOfweek+")  "+weekdays[dayOfweek-1]);
		System.out.println("\n Day of week: ("+dayOfweek+")  "+weekdaysEnum[dayOfweek-1]);
		
		System.out.println("\n Day of Month: "+dayOfMonth);
		System.out.println("\n Day of Year: "+dayOfYear);
		
		/*Ở một số quốc gia như us, japan ,... thì ngày đầu tuần là chủ nhật- tương ứng giá trị 1
		 *Còn việt nam là thứ 2 tương ứng giá trị 2 
		 * */
		
	}
}
