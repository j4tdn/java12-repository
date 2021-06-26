package datetime;

import java.util.Calendar;
import java.util.Date;
import utils.DateUtils;

public class Ex04 {
	 public static void main(String[] args) {
		//Count number of Sunday(s) in  month
		 Calendar c = Calendar.getInstance();
		 System.out.println("Sunday(s): " +countNofSundays(Calendar.MAY,2021));
		 
	}
	 private static int countNofSundays(int month, int year) {
		 //firstday of month;
		 Calendar start = Calendar.getInstance(); //26.06.2021
		 start.set(year, month,1);//1.5.2021
		 
		 Calendar end= Calendar.getInstance(); //26.06.2021
		 end.set(year, month, start.getActualMaximum(Calendar.DAY_OF_MONTH));//31.5.2021
		 
		 int count=0;
		 
		 for(Calendar date = start; !date.after(end);date.add(Calendar.DAY_OF_MONTH, 1)) {
			 if(date.get(Calendar.DAY_OF_WEEK)== Calendar.SUNDAY) {
				 System.out.println(DateUtils.format(date));
				 count++;
			 }
		 }
		 return count;
	 }
	 
}
