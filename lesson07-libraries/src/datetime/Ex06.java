package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import utils.DateUtils;

public class Ex06 {
	
	/*
	 * Tinh thời gian yêu nhau
	 */
	public static void main(String[] args) {
		Calendar start = DateUtils.getDateTime(2021, Calendar.JUNE, 22, 20, 18, 12);
		Calendar now=Calendar.getInstance();
		
		if(start.after(now)) {
			throw new IllegalArgumentException("Star cannot exceed current time!");
		}
		
		
		//Đổi từ ngày sang miligiay
		long starAsMilliseconds=start.getTimeInMillis();
		long nowAsMilliseconds =now.getTimeInMillis();
		

		long duration=nowAsMilliseconds-starAsMilliseconds;
		
		
		
		long days=TimeUnit.MILLISECONDS.toDays(duration);//Từ miligiay đổi về ngày
		duration -= TimeUnit.DAYS.toMillis(days);  //Lấy các giá trị dư lại sau khi đổi sang Day
		
		//Các giá trị dư còn lại của miligiay(duration) sẽ đổi về giờ
		long hour=TimeUnit.MILLISECONDS.toHours(duration);
		duration -= TimeUnit.HOURS.toMillis(hour);
		
		long minutes=TimeUnit.MILLISECONDS.toMinutes(duration);
		duration -= TimeUnit.MINUTES.toMillis(minutes);
		
		long seconds=TimeUnit.MILLISECONDS.toSeconds(duration);
		duration -= TimeUnit.SECONDS.toMillis(seconds);
		
		
		System.out.println(days+"d "+hour+"h "+minutes+"p "+seconds+"s ");
	}
}
