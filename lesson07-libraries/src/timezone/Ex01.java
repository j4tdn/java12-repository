package timezone;

import java.util.Calendar;
import java.util.TimeZone;

import utils.DateUtils;

public class Ex01 {
	public static void main(String[] args) {
		//locale : language , country
		//timezone : GMT , UTC , abbreviation(HSK, ICT), Area
		
		TimeZone tzDef = TimeZone.getDefault();
		System.out.println("tz default :" + tzDef);
		
		String[] avTzIds = TimeZone.getAvailableIDs();
		for(String TzId : avTzIds) {
			System.out.println(TzId);
		}
		
		TimeZone tzBerlin = TimeZone.getTimeZone("Europe/Berlin");
		Calendar c = Calendar.getInstance(tzBerlin);
		System.out.println(c);
	}
}
