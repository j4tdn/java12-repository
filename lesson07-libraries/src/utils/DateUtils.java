package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;
import java.util.TimeZone;

public class DateUtils {
		private static final String PATTERN="dd/MM/yyyy HH:mm:ss a EEEE" ;
		private static final String PATTERN2="dd/MM/yyyy" ;
		private static final GregorianCalendar gc=new GregorianCalendar();

		public static Calendar getDateTime(int year,int month,int day, int hour, int minute,int second ) {
			Calendar c=Calendar.getInstance();
			c.set(year, month, day, hour, minute,second);
			return c;
		}
		
		
		public static boolean isLeapYear(int year) {
			//GregorianCalendar gc=new GregorianCalendar();
			
			//Ta chỉ quan tâm năm truyền vào có phải năm nhuận hay ko 
			//nên ko cần phải tạo nhiều đối tượng gc gây tốn vùg nhớ
			//=> đưa gc làm biến toàn cục
			return gc.isLeapYear(year);
		}
		
		
		/**
		 *Convert Calendar to String with pattern dd/MM/yyyy;;
		 * 
		 */
		public static String format(Calendar c) {
			//if(c==null) {
			//		throw new NullPointerException();
			//} => thay vì dùng như này dài dòng thì dùng hàm requireNonNull
			Objects.requireNonNull(c);
			
			//DateFormat df= new SimpleDateFormat("dd/MM/yyyy");
			DateFormat df= new SimpleDateFormat(PATTERN);
			return df.format(c.getTime());
		}
		
		public static String format(Calendar c,TimeZone timezone) {
			Objects.requireNonNull(c);
			//DateFormat df= new SimpleDateFormat("dd/MM/yyyy");
			DateFormat df= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			df.setTimeZone(timezone);
			return df.format(c.getTime());
		}
		
		/*
		 *Convert String to date;
		 * 
		 */
//		public static Date toDate(String s) {
//			Objects.requireNonNull(s);
//			DateFormat df= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//			Date date=null;
//			try {
//				date=df.parse(s);
//			}catch (ParseException e) {
//				e.printStackTrace();
//			}
//			return date;
//		}
		public static Date toDate(String s) {
			Objects.requireNonNull(s);
			DateFormat df= new SimpleDateFormat(PATTERN2);
			Date date=null;
			try {
				date=df.parse(s);
			}catch (ParseException e) {
				e.printStackTrace();
			}
			return date;
		}
		
		
		
		/*
		 * Convert date to Calendar
		 * 
		 */
		public static Calendar toCalendar(Date date) {
			Objects.requireNonNull(date);
			Calendar c=Calendar.getInstance();
			c.setTime(date);
			return c;
		}
}
