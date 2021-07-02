package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import utils.DateUtils;

public class Ex02 {
	private static final String DDMMYYYY="dd/MM/yyyy";
	private static DateFormat df= new SimpleDateFormat(DDMMYYYY);
	
	//Tìm ngày đầu tiên của tuần
	public static void main(String[] args) {
		
		//locale: Language_Country
		System.out.println("Default locale:"+Locale.getDefault());
		
		Locale.setDefault(new Locale("vi","VN")); //Set locale về VN
		System.out.println("After set locale:"+Locale.getDefault());
		
		
		Calendar c=Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, 16);//set time: 16.06.2021
		
		int firstDayOfWeek=c.getFirstDayOfWeek();
		System.out.println("firstDay Of Week: " + firstDayOfWeek); //Ngày đầu tuần của VN là thư 2 => firstDayOfWeek=2
		
		
		//Tính ngày đầu tuần:
		//Lấy dayofMonth + ( getFirstDayOfWeek - dayofweek):     ngày hiện tại + (giá trị của ngày đầu tuần = 2 hoặc 1 - giá trị của ngày hiện tại = 1 ,2,3,...7)
		c.add(Calendar.DAY_OF_MONTH, c.getFirstDayOfWeek()-c.get(Calendar.DAY_OF_WEEK)); //add dùng để cộng ngày tháng với ngày tháng hoặc ngày tháng với số nguyên
		System.out.println("date(first date of week): "+df.format(c.getTime()));  //c.getTime để format từ Calendar -> Date
		
		//getter
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(5)); //Trong class Calendar DAY_OF_MONTH có giá trị là 5
		
		//c.set(Calendar.YEAR, 2020);   2020 là năm nhuận
		System.out.println("IsLeapYear: "+DateUtils.isLeapYear(c.get(Calendar.YEAR)));
	}
}
