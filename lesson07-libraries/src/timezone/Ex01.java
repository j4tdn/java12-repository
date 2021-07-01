package timezone;

import java.util.Calendar;
import java.util.TimeZone;

public class Ex01 {
//locale: language-country
//time-zone GMT,UTC,Abbreviation(HSK,ICT),Area
	
	public static void main(String[] args) {
		TimeZone tzdef=TimeZone.getDefault();
		System.out.println("tzdef: "+tzdef);
		
		System.out.println("=============================");
		String []avTzids=TimeZone.getAvailableIDs();
		for(String tzId :avTzids) {
			System.out.println(tzId);
		}
	}
	TimeZone tzBerlin=TimeZone.getTimeZone("Etc/GMT-2");
	
	Calendar c=Calendar.getInstance(tzBerlin);
	
}
