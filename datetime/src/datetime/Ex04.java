package datetime;

import java.util.Calendar;
import java.util.Date;

import utils.DateUtils;

public class Ex04 {
	 public static void main(String[] args) {
		//Count number of Sunday(s)  in  month
		 Calendar c = Calendar.getInstance();
		 System.out.println("Sunday(s): " +countNofSundays(Calendar.MARCH,2021));
		 
	}
	 private static int countNofSundays(int month, int year) {
		 //firstday of month;
		 Calendar start = Calendar.getInstance();
		 start.set(year, month,1);
		 
		 Calendar end= Calendar.getInstance();
		 end.set(year, month, start.getActualMaximum(Calendar.DAY_OF_MONTH));
		 
		 int day =1;
		 int daysInMonth= start.getActualMaximum(Calendar.DAY_OF_MONTH);
		 int count=0;
		 
//		 System.out.println(DateUtils.format(start));
//		 System.out.println(DateUtils.format(end));
//		 while(day <= daysInMonth) {
//			 if(start.get(Calendar.DAY_OF_WEEK)== Calendar.SUNDAY) {
//				 count++;
//			 }
//			 start.add(Calendar.DAY_OF_MONTH, 1);
//			 day++;
//		 }
		 
		 for(Calendar date = start; date.before(end);date.add(Calendar.DAY_OF_MONTH, 1)) {
			 if(date.get(Calendar.DAY_OF_WEEK)== Calendar.SUNDAY) {
				 System.out.println(DateUtils.format(date));
				 count++;
			 }
		 }
		 return count;
	 }
	 
}
